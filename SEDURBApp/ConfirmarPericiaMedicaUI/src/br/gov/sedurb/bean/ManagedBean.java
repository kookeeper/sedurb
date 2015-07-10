package br.gov.sedurb.bean;


import br.gov.se.seplag.ebo.v1.AgendamentoAtendimento;
import br.gov.se.seplag.ebo.v1.DocumentoNecessarioAtendimento;
import br.gov.se.seplag.ebo.v1.Protocolo;
import br.gov.se.seplag.ebo.v1.Telefone;
import br.gov.se.seplag.ebo.v1.TipoTelefone;
import br.gov.se.seplag.protocoloatendimento.ResultadoConsultarProtocoloAtendimento;
import br.gov.sedurb.backing.ConfirmarPericiaMedica;
import br.gov.sedurb.util.JSFUtils;
import br.gov.sedurb.ws.client.AgendamentoAtendimentoSOAPClient;
import br.gov.sedurb.ws.client.AnexoProcessosAtendimentoSOAPClient;
import br.gov.sedurb.ws.client.ProtocoloAtendimentoSOAPClient;

import java.util.ArrayList;
import java.util.List;

import javax.faces.event.ActionEvent;

import oracle.bpel.services.workflow.task.model.Task;


public class ManagedBean extends GenericBean {

    private ConfirmarPericiaMedica yourBackingBean;
    private List<ServicoAgendadoListaDocumento> listaServicoAgendadoListaDocumento;
    private List<ServicoAgendadoDocumento> listaServicoAgendadoDocumento;
    private List<ServicoAgendadoProtocolo> listaAgendamentoAtendimentoProtocolo;
    private Protocolo protocolo;

    public ManagedBean() {
        super();
    }

    public void consultarCidadaoActionListener(ActionEvent event) {

        LOGGER.info(event.getComponent().getId());

        String cpf = (String)getYourBackingBean().getItCpfConsulta().getValue();

        try {
            obterCidadao(cpf);
        } catch (br.gov.se.seplag.cicsergipe.ErroInfoMessage e) {
            if (!e.getFaultInfo().getCodigo().equals("ERR_PARAM_002")) {
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
                    JSFUtils.addFacesErrorMessage("Não foi possível encontrar o C.P.F. / Protocolo digitado.");
                } else {
                    obterCidadao(getProtocolo().getDocumentoCPF());
                }

            }

            if (getCidadao() != null) {
                carregarDadosCidadao();
                carregarListaServicosAgendados();
            }

        } catch (br.gov.se.seplag.cicsergipe.ErroInfoMessage e) {
            if (e.getFaultInfo().getCodigo().equals("ERR_PARAM_002")) {
            }
            JSFUtils.addFacesErrorMessage("Erro ao tentar utilizar o serviço CICSergipe: " +
                                          e.getMessage());
        }

    }

    public void novaConsultaActionListener(ActionEvent event) {

        LOGGER.info(event.getPhaseId().toString());

        setCidadao(null);
        setListaServicoAgendadoDocumento(null);
        setListaServicoAgendadoListaDocumento(null);

    }

    protected void carregarListaAgendamentoAtendimento() {

        setListaServicoAgendadoListaDocumento(new ArrayList<ServicoAgendadoListaDocumento>());
        setListaServicoAgendadoDocumento(new ArrayList<ServicoAgendadoDocumento>());

        if (getCidadao() == null) {
            return;
        }

        List<AgendamentoAtendimento> lista =
            AgendamentoAtendimentoSOAPClient.getInstance().listarAgendamentosPorCPF(true,
                                                                                    getCidadao().getDocumentoCPF(),
                                                                                    null);

        for (AgendamentoAtendimento atendimento : lista) {

            List<DocumentoNecessarioAtendimento> listaDoc =
                AnexoProcessosAtendimentoSOAPClient.getInstance().listarPorAtendimento(Long.parseLong(getCidadao().getDocumentoCPF()),
                                                                                       atendimento.getServico().getNome());

            for (DocumentoNecessarioAtendimento doc : listaDoc) {
                getListaServicoAgendadoDocumento().add(new ServicoAgendadoDocumento(doc,
                                                                                    atendimento));
            }

            getListaServicoAgendadoListaDocumento().add(new ServicoAgendadoListaDocumento(listaDoc,
                                                                                          atendimento));

        }

    }

    private void carregarDadosCidadao() {
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
        if (getCidadao().getCarteiraIdentidade().getDataEmissao() != null) {
            getYourBackingBean().getIdIdentidadeDataEmissao().setValue(getCidadao().getCarteiraIdentidade().getDataEmissao().toGregorianCalendar());
        }

        if (getCidadao().getCarteiraIdentidade().getSiglaUnidadeFederativa() !=
            null) {
            getYourBackingBean().getSocIdentidadeUF().setValue(getCidadao().getCarteiraIdentidade().getSiglaUnidadeFederativa().value());
        }

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
                            buscarListaDocumentoPorServico(Long.parseLong(agendamento.getCidadao().getDocumentoCPF()),
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

    private List<DocumentoNecessarioAtendimento> buscarListaDocumentoPorServico(Long cpfLong,
                                                                                String nomeServico) {

        List<DocumentoNecessarioAtendimento> listaDoc =
            AnexoProcessosAtendimentoSOAPClient.getInstance().listarPorAtendimento(cpfLong,
                                                                                   nomeServico);

        return listaDoc;

    }

    public void setYourBackingBean(ConfirmarPericiaMedica yourBackingBean) {
        this.yourBackingBean = yourBackingBean;
    }

    public ConfirmarPericiaMedica getYourBackingBean() {
        if (yourBackingBean == null) {
            setYourBackingBean((ConfirmarPericiaMedica)JSFUtils.resolveExpression("#{backingBeanScope.backing_confirmarPericiaMedica}"));
        }
        return yourBackingBean;
    }

    public void setListaServicoAgendadoListaDocumento(List<ServicoAgendadoListaDocumento> listaServicoAgendadoListaDocumento) {
        this.listaServicoAgendadoListaDocumento = listaServicoAgendadoListaDocumento;
    }

    public List<ServicoAgendadoListaDocumento> getListaServicoAgendadoListaDocumento() {
        return listaServicoAgendadoListaDocumento;
    }

    public void setListaServicoAgendadoDocumento(List<ServicoAgendadoDocumento> listaServicoAgendadoDocumento) {
        this.listaServicoAgendadoDocumento = listaServicoAgendadoDocumento;
    }

    public List<ServicoAgendadoDocumento> getListaServicoAgendadoDocumento() {
        return listaServicoAgendadoDocumento;
    }

    public void setProtocolo(Protocolo protocolo) {
        this.protocolo = protocolo;
    }

    public Protocolo getProtocolo() {
        return protocolo;
    }

    public void setListaAgendamentoAtendimentoProtocolo(List<ServicoAgendadoProtocolo> listaAgendamentoAtendimentoProtocolo) {
        this.listaAgendamentoAtendimentoProtocolo = listaAgendamentoAtendimentoProtocolo;
    }

    public List<ServicoAgendadoProtocolo> getListaAgendamentoAtendimentoProtocolo() {
        return listaAgendamentoAtendimentoProtocolo;
    }
}
