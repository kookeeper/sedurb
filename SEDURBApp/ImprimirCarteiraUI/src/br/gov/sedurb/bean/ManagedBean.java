package br.gov.sedurb.bean;


import br.gov.se.seplag.ebo.v1.Protocolo;
import br.gov.se.seplag.ebo.v1.Telefone;
import br.gov.se.seplag.ebo.v1.TipoTelefone;
import br.gov.se.seplag.protocoloatendimento.ResultadoConsultarProtocoloAtendimento;
import br.gov.sedurb.backing.ImprimirCarteira;
import br.gov.sedurb.util.JSFUtils;
import br.gov.sedurb.ws.client.ProtocoloAtendimentoSOAPClient;

import java.awt.image.BufferedImage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import java.net.URL;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.FacesException;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;

import javax.imageio.ImageIO;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

import oracle.bpel.services.workflow.task.model.Task;

import org.apache.commons.io.IOUtils;
import org.apache.myfaces.trinidad.model.UploadedFile;
import org.apache.myfaces.trinidad.render.ExtendedRenderKitService;
import org.apache.myfaces.trinidad.util.Service;


public class ManagedBean extends GenericBean {

    private List<ImprimirCarteiraBean> listaServicoImpressao;
    private ImprimirCarteira yourBackingBean;
    private Protocolo protocoloPai;
    private ImprimirCarteiraBean servicoSelecionado;

    public ManagedBean() {
        super();

        yourBackingBean =
                (ImprimirCarteira)JSFUtils.resolveExpression("#{backingBeanScope.backing_imprimirCarteira}");

    }

    public void consultarCidadaoActionListener(ActionEvent event) {

        LOGGER.info(event.getComponent().getId());

        protocoloPai = null;

        String cpf = (String)yourBackingBean.getItCpfConsulta().getValue();

        try {
            obterCidadao(cpf);
        } catch (br.gov.se.seplag.cicsergipe.ErroInfoMessage e) {
            if (!e.getFaultInfo().getCodigo().equals("ERR_PARAM_002")) {
                JSFUtils.addFacesErrorMessage(e.getMessage());
                return;
            }
        }

        try {

            if (getCidadao() == null) {
                protocoloPai =
                        ProtocoloAtendimentoSOAPClient.getInstance().obterProtocoloAtendimento(cpf);

                if (protocoloPai == null) {
                    JSFUtils.addFacesErrorMessage("Não foi possível encontrar o C.P.F. / Protocolo digitado.");
                    return;
                } else {
                    obterCidadao(protocoloPai.getDocumentoCPF());
                }
            } else {
                //pesquisa a lista de protocolos do CPF, nao sei qual deles é o pai.
                List<ResultadoConsultarProtocoloAtendimento.Protocolos.Protocolo> listaProtocolo =
                    ProtocoloAtendimentoSOAPClient.getInstance().consultarProtocoloAtendimento(null,
                                                                                               getCidadao().getDocumentoCPF());

                if (listaProtocolo.size() > 0) {
                    //com o pai do primeiro, obtenho o protocolo pai e seus subprotocolos.
                    protocoloPai =
                            ProtocoloAtendimentoSOAPClient.getInstance().obterProtocoloAtendimento(listaProtocolo.get(0).getCdProtocoloPai());
                } else {
                    JSFUtils.addFacesErrorMessage("Não foi possível encontrar o Protocolo para o C.P.F. digitado.");
                    return;
                }

            }

            carregarDadosCidadao();

            carregarAtividade();

            if (getListaServicoImpressao().size() == 0) {
                JSFUtils.addFacesErrorMessage("Não existe serviços pendentes de impressao para o Cidadão: " +
                                              getCidadao().getNomeCompleto());
                return;
            }

        } catch (br.gov.se.seplag.cicsergipe.ErroInfoMessage e) {

            if (e.getFaultInfo().getCodigo().equals("ERR_PARAM_002")) {

            }
            JSFUtils.addFacesErrorMessage(e.getMessage());
        }

    }

    public void realizarNovaConsultaActionListener(ActionEvent event) {

        LOGGER.info(event.getComponent().getId());

        setCidadao(null);
        setListaServicoImpressao(null);
    }

    private void carregarAtividade() {

        List<ResultadoConsultarProtocoloAtendimento.Protocolos.Protocolo> listaProtocolo =
            ProtocoloAtendimentoSOAPClient.getInstance().consultarProtocoloAtendimento(protocoloPai.getCodigoProtocoloPai(),
                                                                                       null);

        for (ResultadoConsultarProtocoloAtendimento.Protocolos.Protocolo protocolo :
             listaProtocolo) {

            Task task = buscarAtividadeImpCart(protocolo.getCdProtocolo());

            if (task != null) {
                adicionarServico(protocolo, task);
            }

        }
    }

    private void adicionarServico(ResultadoConsultarProtocoloAtendimento.Protocolos.Protocolo protocolo,
                                  Task task) {

        ImprimirCarteiraBean bean = new ImprimirCarteiraBean();
        bean.setProtocolo(protocolo);
        bean.setTask(task);
        getListaServicoImpressao().add(bean);

    }

    private void carregarDadosCidadao() {
        limparDadosCidadao();

        getYourBackingBean().getIdDataNascimento().setValue(getCidadao().getDataNascimento().toGregorianCalendar());

        for (Telefone telefone :
             getCidadao().getListaTelefone().getTelefone()) {
            if (telefone.getTipoTelefone() == null) {
                getYourBackingBean().getItTelefoneCelular().setValue(telefone.getNumeroTelefone());
            } else if (telefone.getTipoTelefone().equals(TipoTelefone.CELULAR)) {
                getYourBackingBean().getItTelefoneCelular().setValue(telefone.getNumeroTelefone());
            } else if (telefone.getTipoTelefone().equals(TipoTelefone.RESIDENCIAL)) {
                getYourBackingBean().getItTelefoneResidencial().setValue(telefone.getNumeroTelefone());
            }
        }
        getYourBackingBean().getIdIdentidadeDataEmissao().setValue(getCidadao().getCarteiraIdentidade().getDataEmissao().toGregorianCalendar());
        getYourBackingBean().getSocIdentidadeUF().setValue(getCidadao().getCarteiraIdentidade().getSiglaUnidadeFederativa().value());
    }

    private void limparDadosCidadao() {
        getYourBackingBean().getIdDataNascimento().setValue(null);
        getYourBackingBean().getItTelefoneCelular().setValue(null);
        getYourBackingBean().getItTelefoneResidencial().setValue(null);
        getYourBackingBean().getIdIdentidadeDataEmissao().setValue(null);
        getYourBackingBean().getSocIdentidadeUF().setValue(null);
    }

    public void imprimirCarteiraActionListener(ActionEvent event) {

        LOGGER.info(event.getComponent().getId());

        for (ImprimirCarteiraBean bean : getListaServicoImpressao()) {
            if (bean.getProtocolo().getCdProtocolo().equals(getServicoSelecionado().getProtocolo().getCdProtocolo())) {
                bean.setDataImpressao(new Date());
            }
        }

        // queue the event via a JavaScript inserted into the page
        FacesContext context = FacesContext.getCurrentInstance();
        ExtendedRenderKitService erks =
            Service.getService(context.getRenderKit(),
                               ExtendedRenderKitService.class);
        erks.addScript(context, "downloadCarteira();");
    }

    public void imprimirReciboActionListener(ActionEvent event) {

        LOGGER.info(event.getComponent().getId());

        // queue the event via a JavaScript inserted into the page
        FacesContext context = FacesContext.getCurrentInstance();
        ExtendedRenderKitService erks =
            Service.getService(context.getRenderKit(),
                               ExtendedRenderKitService.class);
        erks.addScript(context, "downloadRecibo();");
    }

    public void imprimirCarteira(FacesContext context,
                                 OutputStream out) throws IOException {
        try {

            /*
            Task task = getServicoSelecionado().getTask();

            Element payload = task.getPayloadAsElement();

            Element dataImpressaoCarteira =
                buscarElemento(payload, "http://br.gov.sedurb",
                               "dataImpressaoCarteira");

            dataImpressaoCarteira.setTextContent(new Date().toString());

            task = atualizarPayload(task, payload);

            executarAtividadeBpm(task, "APPROVE");
            */

            out.write(imprimirCarteira());
            out.flush();

            context.responseComplete();

        } catch (JRException e) {
            throw new FacesException(e);
        }
    }

    public void imprimirRecibo(FacesContext context,
                               OutputStream out) throws IOException {
        try {

            out.write(imprimirRecibo());
            out.flush();

            context.responseComplete();

        } catch (JRException e) {
            throw new FacesException(e);
        }
    }

    private byte[] imprimirCarteira() throws FileNotFoundException,
                                             IOException, JRException {

        JasperReport report = null;
        Map<String, Object> parameters = new HashMap<String, Object>();

        InputStream reportStream =
            ManagedBean.class.getResourceAsStream("/br/gov/sedurb/reports/carteira.jrxml");

        BufferedImage image =
            ImageIO.read(ManagedBean.class.getResource("/br/gov/sedurb/reports/carteira.png"));

        URL urlFoto = new URL(getCidadao().getFoto());

        BufferedImage imageFoto = ImageIO.read(urlFoto);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        parameters.put("fundo", image);
        parameters.put("foto", imageFoto);
        parameters.put("numeroCarteira", "111222333");
        parameters.put("numeroRG",
                       getCidadao().getCarteiraIdentidade().getNumeroIdentidade());
        parameters.put("nomeCidadao", getCidadao().getNomeCompleto());
        parameters.put("dataNascimento",
                       sdf.format(getCidadao().getDataNascimento().toGregorianCalendar().getTime()));
        parameters.put("dataEmissao",
                       sdf.format(getServicoSelecionado().getDataImpressao()));
        parameters.put("dataValidade",
                       sdf.format(getServicoSelecionado().getDataImpressao()));

        report = JasperCompileManager.compileReport(reportStream);

        JasperPrint print =
            JasperFillManager.fillReport(report, parameters, new JREmptyDataSource(1));

        byte[] reportByte = JasperExportManager.exportReportToPdf(print);
        /*
        FileOutputStream out =
            new FileOutputStream(new File("/Users/Sergio/report.pdf"));
        out.write(reportByte);
        out.flush();
        out.close();
    */
        return reportByte;

    }

    private byte[] imprimirRecibo() throws FileNotFoundException, IOException,
                                           JRException {

        JasperReport report = null;
        Map<String, Object> parameters = new HashMap<String, Object>();

        InputStream reportStream =
            ManagedBean.class.getResourceAsStream("/br/gov/sedurb/reports/reciboEntrega.jrxml");

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");

        parameters.put("numeroCPF", getCidadao().getDocumentoCPF());
        parameters.put("numeroRG",
                       getCidadao().getCarteiraIdentidade().getNumeroIdentidade());
        parameters.put("nomeCidadao", getCidadao().getNomeCompleto());
        parameters.put("dataEntrega", sdf.format(new Date()));
        parameters.put("nomeFuncionario", "Nome do funcionário");

        report = JasperCompileManager.compileReport(reportStream);

        JasperPrint print =
            JasperFillManager.fillReport(report, parameters, new JREmptyDataSource(1));

        byte[] reportByte = JasperExportManager.exportReportToPdf(print);

        return reportByte;

    }

    public void uploadRecibo(ValueChangeEvent event) {
        UploadedFile file = (UploadedFile)event.getNewValue();
        if (file != null) {

            byte[] conteudo;

            try {
                conteudo = IOUtils.toByteArray(file.getInputStream());
            } catch (IOException e) {
                conteudo = new byte[0];
            }

            getServicoSelecionado().setReciboEntrega(conteudo);
            getServicoSelecionado().setDataEntrega(new Date());

        }
    }

    public void setYourBackingBean(ImprimirCarteira yourBackingBean) {
        this.yourBackingBean = yourBackingBean;
    }

    public ImprimirCarteira getYourBackingBean() {
        return yourBackingBean;
    }

    public void setProtocoloPai(Protocolo protocoloPai) {
        this.protocoloPai = protocoloPai;
    }

    public Protocolo getProtocoloPai() {
        return protocoloPai;
    }

    public void setListaServicoImpressao(List<ImprimirCarteiraBean> listaServicoImpressao) {
        this.listaServicoImpressao = listaServicoImpressao;
    }

    public List<ImprimirCarteiraBean> getListaServicoImpressao() {
        if (listaServicoImpressao == null) {
            setListaServicoImpressao(new ArrayList<ImprimirCarteiraBean>());
        }
        return listaServicoImpressao;
    }

    public void setServicoSelecionado(ImprimirCarteiraBean servicoSelecionado) {
        this.servicoSelecionado = servicoSelecionado;
    }

    public ImprimirCarteiraBean getServicoSelecionado() {
        return servicoSelecionado;
    }

}
