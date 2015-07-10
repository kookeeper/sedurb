package br.gov.sedurb.bean;


import br.gov.se.seplag.correioscep.ResultadoConsultarEnderecoPorCEP;
import br.gov.se.seplag.ebo.v1.AgendamentoAtendimento;
import br.gov.se.seplag.ebo.v1.CategoriaCarteiraPasseLivre;
import br.gov.se.seplag.ebo.v1.DocumentoNecessarioAtendimento;
import br.gov.se.seplag.ebo.v1.Protocolo;
import br.gov.se.seplag.ebo.v1.Sexo;
import br.gov.se.seplag.ebo.v1.TipoCarteiraPasseLivre;
import br.gov.se.seplag.ebo.v1.TipoTelefone;
import br.gov.se.seplag.ebo.v1.UnidadeFederativa;
import br.gov.se.seplag.protocoloatendimento.ResultadoConsultarProtocoloAtendimento;
import br.gov.sedurb.backing.RealizarAtendimento;
import br.gov.sedurb.util.JSFUtils;
import br.gov.sedurb.ws.client.AgendamentoAtendimentoSOAPClient;
import br.gov.sedurb.ws.client.AnexoProcessosAtendimentoSOAPClient;
import br.gov.sedurb.ws.client.CICSergipeSOAPClient;
import br.gov.sedurb.ws.client.CorreiosCEPSOAPClient;
import br.gov.sedurb.ws.client.PasseLivreSOAPClient;
import br.gov.sedurb.ws.client.ProtocoloAtendimentoSOAPClient;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.FacesException;
import javax.faces.event.ActionEvent;

import javax.xml.datatype.DatatypeConfigurationException;

import oracle.adf.view.rich.context.AdfFacesContext;
import oracle.adf.view.rich.event.DialogEvent;

import oracle.bpel.services.workflow.task.model.Task;

import org.apache.commons.lang.StringUtils;
import org.apache.myfaces.trinidad.event.SelectionEvent;

import org.w3c.dom.Element;


public class ManagedBean extends GenericBean {

    private Boolean editandoCidadao = false;
    private Boolean preenchendoDadosEmissaoCarteiraIdoso = false;
    private Boolean preenchendoDadosEmissaoCarteiraDeficiente = false;
    //    private Boolean mostrarServicosAgendados = false;
    //    private Boolean mostrarListaDocumento = false;

    private RealizarAtendimento yourBackingBean;
    private String tituloCadastrarCidadao;
    private List<DocumentoNecessarioAtendimento> listaDocumentoNecessarioAtendimento;
    private List<ServicoAgendadoProtocolo> listaAgendamentoAtendimentoProtocolo;
    private DocumentoNecessarioAtendimento documentoUpload;
    private ServicoAgendadoProtocolo servicoAgendadoSelecionado;
    private Protocolo protocolo;

    public ManagedBean() {
        super();

        yourBackingBean =
                (RealizarAtendimento)JSFUtils.resolveExpression("#{backingBeanScope.backing_realizarAtendimento}");

    }

    public void pesquisarCidadaoActionListener(ActionEvent event) {

        LOGGER.info(event.getComponent().getId());

        setTituloCadastrarCidadao("Dados do Cidadão");

        String cpf = (String)yourBackingBean.getItCpfConsulta().getValue();

        try {
            obterCidadao(cpf);
        } catch (br.gov.se.seplag.cicsergipe.ErroInfoMessage e) {
            if (!e.getFaultInfo().getCodigo().getValue().equals("ERR_PARAM_002")) {
                JSFUtils.addFacesErrorMessage("Erro ao tentar utilizar o serviço CICSergipe: " +
                                              e.getMessage());
                return;
            }
        }

        try {
            setProtocolo(null);

            //se nao achou o cidadao, pode ser que tenha sido digitado o numero do protocolo.
            if (getCidadao() == null) {
                setProtocolo(ProtocoloAtendimentoSOAPClient.getInstance().obterProtocoloAtendimento(cpf));
                if (getProtocolo() == null) {
                    JSFUtils.addFacesErrorMessage("não foi possível encontrar o C.P.F. / Protocolo digitado.");
                } else {
                    obterCidadao(getProtocolo().getDocumentoCPF());
                }

            }

            if (getCidadao() != null) {
                carregarDadosCidadao();
                consultarListaDocumentoPendente();
                carregarListaServicosAgendados();
            }

        } catch (br.gov.se.seplag.cicsergipe.ErroInfoMessage e) {
            if (e.getFaultInfo().getCodigo().getValue().equals("ERR_PARAM_002")) {
            }
            JSFUtils.addFacesErrorMessage("Erro ao tentar utilizar o serviço CICSergipe: " +
                                          e.getMessage());
        }
    }

    public void pesquisarCEPActionListener(ActionEvent event) {

        LOGGER.info(event.getComponent().getId());

        String cep = getCidadao().getEndereco().getCep();

        getYourBackingBean().getItEnderecoBairro().setSubmittedValue("");
        getYourBackingBean().getItEnderecoMunicipio().setSubmittedValue("");
        getYourBackingBean().getItEnderecoNomeLogradouro().setSubmittedValue("");
        getYourBackingBean().getItEnderecoPais().setSubmittedValue("");
        getYourBackingBean().getItEnderecoTipoLogradouro().setSubmittedValue("");
        getYourBackingBean().getSocEnderecoUF().setSubmittedValue(0);

        ResultadoConsultarEnderecoPorCEP resultado =
            CorreiosCEPSOAPClient.getInstance().consultarEnderecoPorCEP(cep);

        if (resultado != null) {

            getYourBackingBean().getItEnderecoBairro().setSubmittedValue(resultado.getEndereco().getBairro().getValue());
            getYourBackingBean().getItEnderecoMunicipio().setSubmittedValue(resultado.getEndereco().getMunicipio().getValue());
            getYourBackingBean().getItEnderecoNomeLogradouro().setSubmittedValue(resultado.getEndereco().getNomeLogradouro().getValue());
            getYourBackingBean().getItEnderecoPais().setSubmittedValue(resultado.getEndereco().getPais().getValue());
            getYourBackingBean().getItEnderecoTipoLogradouro().setSubmittedValue(resultado.getEndereco().getTipoLogradouro().getValue());
            getYourBackingBean().getSocEnderecoUF().setSubmittedValue(buscarIndiceUnidadeFederativa(resultado.getEndereco().getUnidadeFederativa().getValue()));

        }

        AdfFacesContext.getCurrentInstance().addPartialTarget(getYourBackingBean().getG1());
    }

    public void preencherDadosParaEmissaoCarteiraActionListener(ActionEvent event) {

        LOGGER.info(event.getPhaseId().toString());

        setPreenchendoDadosEmissaoCarteiraIdoso(false);
        setPreenchendoDadosEmissaoCarteiraDeficiente(false);

        if (servicoAgendadoSelecionado.getAgendamento().getServico().getNome().equalsIgnoreCase("Solicitar Passe Livre Idoso")) {
            setPreenchendoDadosEmissaoCarteiraIdoso(true);
        } else if (servicoAgendadoSelecionado.getAgendamento().getServico().getNome().equalsIgnoreCase("Solicitar Passe livre deficiente")) {
            setPreenchendoDadosEmissaoCarteiraDeficiente(true);
        }

        AdfFacesContext.getCurrentInstance().addPartialTarget(getYourBackingBean().getPgl4());

    }

    private void limparDadosCidadao() {
        getYourBackingBean().getIdDataNascimento().setValue(null);
        getYourBackingBean().getItTelefoneCelular().setValue(null);
        getYourBackingBean().getItTelefoneResidencial().setValue(null);
        getYourBackingBean().getIdIdentidadeDataEmissao().setValue(null);
        getYourBackingBean().getSocIdentidadeUF().setValue(null);
    }

    private void carregarDadosCidadao() {
        limparDadosCidadao();

        getYourBackingBean().getIdDataNascimento().setValue(getCidadao().getDataNascimento().toGregorianCalendar());

        for (TelefoneBean telefone : getCidadao().getListaTelefone()) {
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

    public void cancelarCadastroCidadaoActionListener(ActionEvent event) {

        LOGGER.info(event.getComponent().getId());

        setEditandoCidadao(false);

        pesquisarCidadaoActionListener(event);

    }

    public void cadastrarCidadaoActionListener(ActionEvent event) {

        LOGGER.info(event.getComponent().getId());

        try {
            getCidadao().setDataNascimento(toXMLGregorianCalendar((Date)yourBackingBean.getIdDataNascimento().getValue()));

            getCidadao().setListaTelefone(null);

            if (!StringUtils.isEmpty((String)yourBackingBean.getItTelefoneResidencial().getValue())) {
                String numero =
                    (String)yourBackingBean.getItTelefoneResidencial().getValue();
                getCidadao().getListaTelefone().add(new TelefoneBean(numero,
                                                                     TipoTelefone.RESIDENCIAL));
            }

            if (!StringUtils.isEmpty((String)yourBackingBean.getItTelefoneCelular().getValue())) {
                String numero =
                    (String)yourBackingBean.getItTelefoneCelular().getValue();
                getCidadao().getListaTelefone().add(new TelefoneBean(numero,
                                                                     TipoTelefone.CELULAR));
            }

            if (yourBackingBean.getIdIdentidadeDataEmissao().getValue() !=
                null) {
                getCidadao().getCarteiraIdentidade().setDataEmissao(toXMLGregorianCalendar((Date)yourBackingBean.getIdIdentidadeDataEmissao().getValue()));
            }

            if (yourBackingBean.getSocIdentidadeUF().getValue() != null) {
                getCidadao().getCarteiraIdentidade().setSiglaUnidadeFederativa(UnidadeFederativa.valueOf((String)yourBackingBean.getSocIdentidadeUF().getValue()));
            }

            getCidadao().setSexo((Sexo)getYourBackingBean().getSorSexo().getValue());

            CICSergipeSOAPClient.getInstance().registrarCidadao(getCidadao());

            setCidadao(CICSergipeSOAPClient.getInstance().obterCidadao(getCidadao().getDocumentoCPF()));

        } catch (br.gov.se.seplag.cicsergipe.ErroInfoMessage e) {
            JSFUtils.addFacesErrorMessage("Erro ao tentar utilizar o serviço CICSergipe: " +
                                          e.getMessage());
        } catch (DatatypeConfigurationException e) {
            JSFUtils.addFacesErrorMessage(e.getMessage());
        }
        setEditandoCidadao(false);
    }

    public void habilitarCadastroCidadaoActionListener(ActionEvent event) {

        LOGGER.info(event.getComponent().getId());

        setTituloCadastrarCidadao("Alterando Dados do Cidadão");

        setEditandoCidadao(true);
    }

    public void consultarListaDocumentoPendente() {

        setListaDocumentoNecessarioAtendimento(new ArrayList<DocumentoNecessarioAtendimento>());

        List<String> servicos = new ArrayList<String>();

        String cpf = getCidadao().getDocumentoCPF();

        List<ResultadoConsultarProtocoloAtendimento.Protocolos.Protocolo> listaProtocolo =
            ProtocoloAtendimentoSOAPClient.getInstance().consultarProtocoloAtendimento(null,
                                                                                       cpf);

        for (ResultadoConsultarProtocoloAtendimento.Protocolos.Protocolo protocolo :
             listaProtocolo) {

            if (getProtocolo() == null) {
                setProtocolo(ProtocoloAtendimentoSOAPClient.getInstance().obterProtocoloAtendimento(protocolo.getCdProtocoloPai()));
            }

            String nomeServico = protocolo.getNomeServico();

            if (servicos.contains(nomeServico)) {
                continue;
            } else {
                servicos.add(nomeServico);
            }

            List<DocumentoNecessarioAtendimento> listaDoc =
                AnexoProcessosAtendimentoSOAPClient.getInstance().listarPorAtendimento(Long.parseLong(cpf),
                                                                                       nomeServico);

            for (DocumentoNecessarioAtendimento doc : listaDoc) {

                //                if (StringUtils.isEmpty(doc.getUrlDocumento())) {
                adicionaDocumento(doc);
                //                }
            }

        }

        //        setMostrarListaDocumento(listaProtocolo.size() > 0);
    }

    private void adicionaDocumento(DocumentoNecessarioAtendimento doc) {

        for (DocumentoNecessarioAtendimento bean :
             getListaDocumentoNecessarioAtendimento()) {
            if (bean.getCodigoDocumento().equals(doc.getCodigoDocumento())) {
                //documento já existe, não adiciona duplicidade.
                return;
            }
        }

        getListaDocumentoNecessarioAtendimento().add(doc);
    }

    private void carregarListaServicosAgendados() {

        setListaAgendamentoAtendimentoProtocolo(new ArrayList<ServicoAgendadoProtocolo>());

        String cpf = getCidadao().getDocumentoCPF();

        List<ResultadoConsultarProtocoloAtendimento.Protocolos.Protocolo> listaProtocolo =
            null;

        listaProtocolo =
                ProtocoloAtendimentoSOAPClient.getInstance().consultarProtocoloAtendimento(null,
                                                                                           cpf);

        List<AgendamentoAtendimento> listaAgendamento =
            AgendamentoAtendimentoSOAPClient.getInstance().listarAgendamentosPorCPF(true,
                                                                                    cpf,
                                                                                    null);

        for (ResultadoConsultarProtocoloAtendimento.Protocolos.Protocolo protocolo :
             listaProtocolo) {

            for (AgendamentoAtendimento agendamento : listaAgendamento) {
                if (agendamento.getServico().getNome().equals(protocolo.getNomeServico())) {

                    Task task =
                        buscarAtividadeSolImpCartAberta(protocolo.getCdProtocolo());

                    if (task != null) {

                        List<DocumentoNecessarioAtendimento> listaDoc =
                            buscarListaDocumentoPorServico(Long.parseLong(agendamento.getCidadao().getDocumentoCPF().getValue()),
                                                           protocolo.getNomeServico());

                        getListaAgendamentoAtendimentoProtocolo().add(new ServicoAgendadoProtocolo(protocolo,
                                                                                                   agendamento,
                                                                                                   task,
                                                                                                   listaDoc));
                    }

                    break;
                }
            }
        }
    }

    public void servicoAgendadoSelectionListener(SelectionEvent event) {

        LOGGER.info(event.getComponent().getId());
        /*

        this.servicoAgendadoSelecionado =
                (ServicoAgendadoProtocolo)yourBackingBean.getTbAgendAtend().getSelectedRowData();
        setListaDocumentoNecessarioAtendimento(buscarListaDocumentoPorServico(Long.parseLong(servicoAgendadoSelecionado.getProtocolo().getCpf()),
                                                                              servicoAgendadoSelecionado.getProtocolo().getNomeServico()));
*/
    }

    private List<DocumentoNecessarioAtendimento> buscarListaDocumentoPorServico(Long cpfLong,
                                                                                String nomeServico) {

        List<DocumentoNecessarioAtendimento> listaDoc =
            AnexoProcessosAtendimentoSOAPClient.getInstance().listarPorAtendimento(cpfLong,
                                                                                   nomeServico);

        return listaDoc;

    }

    public void mostrarPopupUploadActionListener(ActionEvent event) {

        LOGGER.info(event.getComponent().getId());

    }

    public void realizarNovaConsultaActionListener(ActionEvent event) {

        if (event != null) {
            LOGGER.info(event.getComponent().getId());
        }

        setListaAgendamentoAtendimentoProtocolo(new ArrayList<ServicoAgendadoProtocolo>());
        setListaDocumentoNecessarioAtendimento(null);
        setServicoAgendadoSelecionado(null);
        setCidadao(null);

        //        setMostrarServicosAgendados(false);
        //        setMostrarListaDocumento(false);
        setEditandoCidadao(false);
        setPreenchendoDadosEmissaoCarteiraDeficiente(false);
        setPreenchendoDadosEmissaoCarteiraIdoso(false);

    }

    private void informarBPMSolicitacaoCarteira(Task task) {

        Element payload = task.getPayloadAsElement();

        Element dataAgendamentoAtendimento =
            buscarElemento(payload, "http://br.gov.sedurb",
                           "dataAgendamentoAtendimento");

        dataAgendamentoAtendimento.setTextContent(new Date().toString());

        task = atualizarPayload(task, payload);

        executarAtividadeBpm(task, "APPROVE");
    }

    public void popupConfirmacaoIdosoDialogListener(DialogEvent event) {

        if (event.getOutcome().equals(DialogEvent.Outcome.yes)) {
            solicitarEmissaoCarteiraIdoso();
        }
    }

    public void popupConfirmacaoDeficienteDialogListener(DialogEvent event) {

        if (event.getOutcome().equals(DialogEvent.Outcome.yes)) {
            solicitarEmissaoCarteiraDeficiente();
        }
    }

    public void solicitarEmissaoCarteiraIdosoActionListener(ActionEvent event) {

        LOGGER.info(event.getComponent().getId());

        solicitarEmissaoCarteiraIdoso();

    }

    private void solicitarEmissaoCarteiraIdoso() {

        CategoriaCarteiraPasseLivre categoria =
            (CategoriaCarteiraPasseLivre)yourBackingBean.getSocCategoriaIdoso().getValue();
        
        if (categoria == null) {
            throw new FacesException("Selecione uma categoria.");
        }
        
        String cpf = getCidadao().getDocumentoCPF();
        TipoCarteiraPasseLivre tipo =
            TipoCarteiraPasseLivre.valueOf((String)yourBackingBean.getIt2().getValue());

        String resultado =
            PasseLivreSOAPClient.getInstance().cadastrarPasseLivre(categoria,
                                                                   cpf, tipo);

        if (resultado != null) {

            JSFUtils.addFacesInformationMessage("Carteira Passe Livre Cadastrada: " +
                                                resultado);

            informarBPMSolicitacaoCarteira(this.servicoAgendadoSelecionado.getTask());

            realizarNovaConsultaActionListener(null);
        }

    }

    public void solicitarEmissaoCarteiraDeficienteActionListener(ActionEvent event) {

        LOGGER.info(event.getComponent().getId());

        solicitarEmissaoCarteiraDeficiente();

    }

    private void solicitarEmissaoCarteiraDeficiente() {

        CategoriaCarteiraPasseLivre categoria =
            (CategoriaCarteiraPasseLivre)yourBackingBean.getSocCategoriaDeficiente().getValue();

        if (categoria == null) {
            throw new FacesException("Selecione uma categoria.");
        }
        
        String cpf = getCidadao().getDocumentoCPF();
        TipoCarteiraPasseLivre tipo =
            TipoCarteiraPasseLivre.valueOf((String)yourBackingBean.getInputText2().getValue());

        String resultado =
            PasseLivreSOAPClient.getInstance().cadastrarPasseLivre(categoria,
                                                                   cpf, tipo);

        if (resultado != null) {

            JSFUtils.addFacesInformationMessage("Carteira Passe Livre Cadastrada: " +
                                                resultado);

            informarBPMSolicitacaoCarteira(this.servicoAgendadoSelecionado.getTask());

            realizarNovaConsultaActionListener(null);

        }
    }

    public Boolean getTipoServicoEscolhidoValido() {

        if (servicoAgendadoSelecionado == null) {
            return false;
        }

        if (servicoAgendadoSelecionado.getAgendamento() == null) {
            return false;
        }

        if (servicoAgendadoSelecionado.getAgendamento().getServico().getNome().equalsIgnoreCase("Solicitar Passe Livre Idoso")) {
            return true;
        }

        if (servicoAgendadoSelecionado.getAgendamento().getServico().getNome().equalsIgnoreCase("Solicitar Passe livre deficiente")) {
            return true;
        }

        return false;

    }

    public void setEditandoCidadao(Boolean editandoCidadao) {
        this.editandoCidadao = editandoCidadao;
    }

    public Boolean getEditandoCidadao() {
        return editandoCidadao;
    }

    public void setYourBackingBean(RealizarAtendimento yourBackingBean) {
        this.yourBackingBean = yourBackingBean;
    }

    public RealizarAtendimento getYourBackingBean() {
        return yourBackingBean;
    }

    public void setTituloCadastrarCidadao(String tituloCadastrarCidadao) {
        this.tituloCadastrarCidadao = tituloCadastrarCidadao;
    }

    public String getTituloCadastrarCidadao() {
        return tituloCadastrarCidadao;
    }

    public void setListaDocumentoNecessarioAtendimento(List<DocumentoNecessarioAtendimento> listaDocumentoNecessarioAtendimento) {
        this.listaDocumentoNecessarioAtendimento =
                listaDocumentoNecessarioAtendimento;
    }

    public List<DocumentoNecessarioAtendimento> getListaDocumentoNecessarioAtendimento() {
        return listaDocumentoNecessarioAtendimento;
    }

    public void setDocumentoUpload(DocumentoNecessarioAtendimento documentoUpload) {
        this.documentoUpload = documentoUpload;
    }

    public DocumentoNecessarioAtendimento getDocumentoUpload() {
        return documentoUpload;
    }

    public void setListaAgendamentoAtendimentoProtocolo(List<ServicoAgendadoProtocolo> listaAgendamentoAtendimentoProtocolo) {
        this.listaAgendamentoAtendimentoProtocolo =
                listaAgendamentoAtendimentoProtocolo;
    }

    public List<ServicoAgendadoProtocolo> getListaAgendamentoAtendimentoProtocolo() {
        return listaAgendamentoAtendimentoProtocolo;
    }

    public void setServicoAgendadoSelecionado(ServicoAgendadoProtocolo servicoAgendadoSelecionado) {
        this.servicoAgendadoSelecionado = servicoAgendadoSelecionado;
    }

    public ServicoAgendadoProtocolo getServicoAgendadoSelecionado() {
        return servicoAgendadoSelecionado;
    }

    public void setPreenchendoDadosEmissaoCarteiraIdoso(Boolean preenchendoDadosEmissaoCarteiraIdoso) {
        this.preenchendoDadosEmissaoCarteiraIdoso =
                preenchendoDadosEmissaoCarteiraIdoso;
    }

    public Boolean getPreenchendoDadosEmissaoCarteiraIdoso() {
        return preenchendoDadosEmissaoCarteiraIdoso;
    }

    public void setPreenchendoDadosEmissaoCarteiraDeficiente(Boolean preenchendoDadosEmissaoCarteiraDeficiente) {
        this.preenchendoDadosEmissaoCarteiraDeficiente =
                preenchendoDadosEmissaoCarteiraDeficiente;
    }

    public Boolean getPreenchendoDadosEmissaoCarteiraDeficiente() {
        return preenchendoDadosEmissaoCarteiraDeficiente;
    }

    public void setProtocolo(Protocolo protocolo) {
        this.protocolo = protocolo;
    }

    public Protocolo getProtocolo() {
        return protocolo;
    }
}
