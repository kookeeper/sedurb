package br.gov.sedurb.bean;


import br.gov.se.seplag.correioscep.ResultadoConsultarEnderecoPorCEP;
import br.gov.se.seplag.ebo.v1.AgendamentoAtendimento;
import br.gov.se.seplag.ebo.v1.DocumentoNecessarioAtendimento;
import br.gov.se.seplag.ebo.v1.HorariosDisponiveisAtendimento;
import br.gov.se.seplag.ebo.v1.Servico;
import br.gov.se.seplag.ebo.v1.Sexo;
import br.gov.se.seplag.ebo.v1.TipoTelefone;
import br.gov.se.seplag.ebo.v1.UnidadeAtendimento;
import br.gov.se.seplag.ebo.v1.UnidadeFederativa;
import br.gov.se.seplag.protocoloatendimento.ResultadoEmitirProtocoloAtendimento;
import br.gov.sedurb.backing.QualificarAtendimento;
import br.gov.sedurb.util.ADFUtils;
import br.gov.sedurb.util.JSFUtils;
import br.gov.sedurb.util.ValidarCPF;
import br.gov.sedurb.ws.client.AgendamentoAtendimentoSOAPClient;
import br.gov.sedurb.ws.client.AnexoProcessosAtendimentoSOAPClient;
import br.gov.sedurb.ws.client.CICSergipeSOAPClient;
import br.gov.sedurb.ws.client.CorreiosCEPSOAPClient;
import br.gov.sedurb.ws.client.ProtocoloAtendimentoSOAPClient;
import br.gov.sedurb.ws.client.ServicoAtendimentoSOAPClient;
import br.gov.sedurb.ws.client.UnidadeAtendimentoSOAPClient;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.faces.component.UIComponent;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.XMLGregorianCalendar;

import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.input.RichSelectBooleanRadio;
import oracle.adf.view.rich.context.AdfFacesContext;
import oracle.adf.view.rich.event.DialogEvent;
import oracle.adf.view.rich.event.DialogEvent.Outcome;
import oracle.adf.view.rich.util.ResetUtils;

import oracle.binding.OperationBinding;

import oracle.bpel.services.workflow.task.model.Task;

import org.apache.commons.lang.StringUtils;
import org.apache.myfaces.trinidad.model.UploadedFile;

import org.w3c.dom.Element;


public class ManagedBean extends GenericBean {

    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    private SimpleDateFormat sdfH = new SimpleDateFormat("dd/MM/yyyy");

    private Boolean mostrarConsultarCidadao = true;
    private Boolean editandoCidadao = false;
    private Boolean cidadaoNovo = false;

    private QualificarAtendimento yourBackingBean;
    private String tituloCadastrarCidadao;
    private String labelCadastrarCidadao;
    private List<ServicoAgendadoListaDocumento> listaServicoAgendadoListaDocumento;
    private List<ServicoAgendadoDocumento> listaServicoAgendadoDocumento;
    private Servico servicoAtendimentoSelecionado;
    private UnidadeAtendimento unidadeAtendimentoSelecionado;
    private UploadedFile fileUpload;
    private ServicoAgendadoDocumento documentoUpload;
    private HorariosDisponiveisAtendimento horarioAtendimentoSelecionado;
    private Task task;
    private String sexoCidadao;

    public ManagedBean() {
        super();

        yourBackingBean =
                (QualificarAtendimento)JSFUtils.resolveExpression("#{backingBeanScope.backing_qualificarAtendimento}");

        montarListaServicoAtendimento();

    }

    public void consultarCidadaoActionListener(ActionEvent event) {

        LOGGER.info(event.getComponent().getId());

        try {
            String cpf = (String)yourBackingBean.getItCpfConsulta().getValue();

            if (!ValidarCPF.isCPF(cpf)) {
                JSFUtils.addFacesErrorMessage("CPF Informado do Cidadão Inválido");
                return;
            }

            this.task = buscarAtividadeTriagemAberta(cpf);

            if (this.task == null) {
                iniciarFluxoBPMTriagem(cpf);
            }

            consultarCidadao(cpf);

            if (!getCidadaoNovo()) {

                if (this.task == null) {
                    this.task = buscarAtividadeTriagemAberta(cpf);
                }

                if (this.task == null) {
                    JSFUtils.addFacesErrorMessage("Erro ao iniciar o atendimento do Cidadão.");
                    novaConsultaActionListener(event);
                    return;
                }


                JSFUtils.addFacesInformationMessage("Processo de Atendimento Iniciado.");
            }
        } catch (br.gov.se.seplag.cicsergipe.ErroInfoMessage e) {
            JSFUtils.addFacesErrorMessage("Erro ao tentar utilizar o serviço CICSergipe: " +
                                          e.getMessage());
        }

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

            getCidadao().setSexo(Sexo.fromValue((String)getYourBackingBean().getSorSexo().getValue()));

            CICSergipeSOAPClient.getInstance().registrarCidadao(getCidadao());

            consultarCidadao((String)yourBackingBean.getItCpf().getValue());
        } catch (DatatypeConfigurationException e) {
            JSFUtils.addFacesErrorMessage(e.getMessage());
        } catch (br.gov.se.seplag.cicsergipe.ErroInfoMessage e) {
            JSFUtils.addFacesErrorMessage("Erro ao tentar utilizar o serviço CICSergipe: " +
                                          e.getMessage());
        }
    }

    public void cancelarCadastroCidadaoActionListener(ActionEvent event) {

        LOGGER.info(event.getComponent().getId());

        setEditandoCidadao(false);

        if (!getCidadaoNovo()) {
            setTituloCadastrarCidadao("Dados do Cidadão");
        } else {
            setCidadao(null);
            setMostrarConsultarCidadao(true);
        }

    }

    private void consultarCidadao(String cpf) throws br.gov.se.seplag.cicsergipe.ErroInfoMessage {
        obterCidadao(cpf);

        setEditandoCidadao(getCidadao() == null);

        carregarListaAgendamentoAtendimento();

        setMostrarConsultarCidadao(false);

        setCidadaoNovo(getCidadao() == null);

        if (getCidadao() != null) {
            carregarDadosCidadao();
            setTituloCadastrarCidadao("Dados do Cidadão");
            setLabelCadastrarCidadao("Atualizar Cadastro");
        } else {
            JSFUtils.addFacesInformationMessage("Cidadão não Cadastrado!");
            setCidadao(new CidadaoBean(cpf));
            limparDadosCidadao();
            setTituloCadastrarCidadao("Cadastrar Cidadão");
            setLabelCadastrarCidadao("Efetuar Cadastrar");
        }
        AdfFacesContext.getCurrentInstance().addPartialTarget(getYourBackingBean().getG1());
    }

    private void limparDadosCidadao() {
        getYourBackingBean().getIdDataNascimento().setValue(null);
        getYourBackingBean().getItTelefoneCelular().setValue(null);
        getYourBackingBean().getItTelefoneResidencial().setValue(null);
        getYourBackingBean().getIdIdentidadeDataEmissao().setValue(null);
        getYourBackingBean().getSocIdentidadeUF().setValue(null);
    }

    private void carregarDadosCidadao() {
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
        if (getCidadao().getCarteiraIdentidade().getDataEmissao() != null) {
            getYourBackingBean().getIdIdentidadeDataEmissao().setValue(getCidadao().getCarteiraIdentidade().getDataEmissao().toGregorianCalendar());
        }

        if (getCidadao().getCarteiraIdentidade().getSiglaUnidadeFederativa() !=
            null) {
            getYourBackingBean().getSocIdentidadeUF().setValue(getCidadao().getCarteiraIdentidade().getSiglaUnidadeFederativa().value());
        }

        getYourBackingBean().getSorSexo().setValue(getCidadao().getSexo().value());

    }

    public void servicoAtendimentoChangeListener(ValueChangeEvent valueChangeEvent) {
        this.servicoAtendimentoSelecionado =
                (Servico)valueChangeEvent.getNewValue();

        montarListaUnidadeAtendimento(servicoAtendimentoSelecionado);
    }

    public void pesquisarHorariosDisponiveis(ActionEvent event) {

        LOGGER.info(event.getComponent().getId());

        montarListaHorariosDisponiveis();
    }

    public void unidadeAtendimentoChangeListener(ValueChangeEvent valueChangeEvent) {
        this.unidadeAtendimentoSelecionado =
                (UnidadeAtendimento)valueChangeEvent.getNewValue();
    }

    public void horarioAtendimentoChangeListener(ValueChangeEvent valueChangeEvent) {

        if (((Boolean)valueChangeEvent.getNewValue()).booleanValue() == true) {
            String horarioString =
                ((RichSelectBooleanRadio)valueChangeEvent.getSource()).getText();

            try {
                Date data = sdf.parse(horarioString.split(" - ")[0]);
                setHorarioAtendimentoSelecionado(new HorariosDisponiveisAtendimento());
                getHorarioAtendimentoSelecionado().setDataHoraAgendamento(toXMLGregorianCalendar(data));
            } catch (ParseException e) {
                setHorarioAtendimentoSelecionado(null);
            } catch (DatatypeConfigurationException e) {
                setHorarioAtendimentoSelecionado(null);
            }
        }

    }

    public void iniciarCadastroAgendamentoActionListener(ActionEvent event) {

        LOGGER.info(event.getComponent().getId());

        AdfFacesContext.getCurrentInstance().addPartialTarget(yourBackingBean.getG1());
    }

    public void iniciarAlteracaoCadastroActionListener(ActionEvent event) {

        LOGGER.info(event.getComponent().getId());

        setEditandoCidadao(true);
        setTituloCadastrarCidadao("Alterando Dados do Cidadão");
        AdfFacesContext.getCurrentInstance().addPartialTarget(yourBackingBean.getG1());
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

    }

    public void novaConsultaActionListener(ActionEvent event) {

        LOGGER.info(event.getPhaseId().toString());

        setMostrarConsultarCidadao(true);
        setCidadao(null);
        setServicoAtendimentoSelecionado(null);
        setUnidadeAtendimentoSelecionado(null);
        setListaHorarioDisponivel(null);
        setListaServicoAgendadoDocumento(null);
        setListaServicoAgendadoListaDocumento(null);

    }

    public void cadastrarAgendamentoActionListener(ActionEvent event) {

        LOGGER.info(event.getComponent().getId());

        XMLGregorianCalendar dataAgendamento =
            getHorarioAtendimentoSelecionado().getDataHoraAgendamento();
        //            AgendamentoAtendimento resultado =
        AgendamentoAtendimentoSOAPClient.getInstance().realizarAgendamentoAtendimento(getCidadao().getEntity(),
                                                                                      dataAgendamento,
                                                                                      servicoAtendimentoSelecionado,
                                                                                      unidadeAtendimentoSelecionado);
        carregarListaAgendamentoAtendimento();

        AdfFacesContext.getCurrentInstance().addPartialTarget(yourBackingBean.getG1());
    }

    public void mostrarPopupUploadActionListener(ActionEvent event) {

        UIComponent source = (UIComponent)event.getSource();
        RichPopup popup = getYourBackingBean().getPopupUpload();
        RichPopup.PopupHints hints = new RichPopup.PopupHints();
        hints.add(RichPopup.PopupHints.HintTypes.HINT_ALIGN_ID,
                  source).add(RichPopup.PopupHints.HintTypes.HINT_LAUNCH_ID,
                              source).add(RichPopup.PopupHints.HintTypes.HINT_ALIGN,
                                          RichPopup.PopupHints.AlignTypes.ALIGN_AFTER_END);
        popup.show(hints);

    }

    public void uploadDialogListener(DialogEvent event) {
        if (event.getOutcome() == Outcome.ok) {
            UploadedFile file =
                (UploadedFile)yourBackingBean.getInputFile().getValue();

            ServicoAgendadoDocumento row = getDocumentoUpload();

            if (row == null) {
                JSFUtils.addFacesErrorMessage("não foi possível realizar o upload do arquivo.");
                return;
            }

            try {
                ByteArrayOutputStream buffer = new ByteArrayOutputStream();

                int nRead;
                byte[] data = new byte[1024];

                InputStream in = file.getInputStream();
                while ((nRead = in.read(data)) != -1) {
                    buffer.write(data, 0, nRead);
                }

                buffer.flush();

                byte[] conteudo = buffer.toByteArray();

                String nomeServico =
                    row.getAgendamento().getServico().getNome();

                List<DocumentoNecessarioAtendimento> arquivos =
                    new ArrayList<DocumentoNecessarioAtendimento>();

                DocumentoNecessarioAtendimento arquivo =
                    new DocumentoNecessarioAtendimento();
                arquivo.setAnosExpiracao(row.getDocumento().getAnosExpiracao());
                arquivo.setCodigoDocumento(row.getDocumento().getCodigoDocumento());
                arquivo.setDataEmissao(toXMLGregorianCalendar(new Date()));
                arquivo.setDataValidade(toXMLGregorianCalendar(new Date()));
                arquivo.setDiasExpiracao(row.getDocumento().getDiasExpiracao());
                arquivo.setIndicadorObrigatorio(row.getDocumento().getIndicadorObrigatorio());
                arquivo.setMesesExpiracao(row.getDocumento().getMesesExpiracao());
                arquivo.setNomeDocumento(row.getDocumento().getNomeDocumento());
                arquivo.setObjetoDocumento(conteudo);

                arquivos.add(arquivo);
                AnexoProcessosAtendimentoSOAPClient.getInstance().incluirPorAtendimento(Long.parseLong(getCidadao().getDocumentoCPF()),
                                                                                        arquivos,
                                                                                        nomeServico);

                carregarListaAgendamentoAtendimento();
                AdfFacesContext.getCurrentInstance().addPartialTarget(getYourBackingBean().getTbDoc());
            } catch (IOException e) {
                JSFUtils.addFacesErrorMessage(e.getMessage());
            } catch (DatatypeConfigurationException e) {
                JSFUtils.addFacesErrorMessage(e.getMessage());
            }
        }

        setFileUpload(null);
        ResetUtils.reset(getYourBackingBean().getPopupUpload());

    }

    public void emitirProtocolosParaHojeActionListener(ActionEvent event) {

        LOGGER.info(event.getComponent().getId());

        String senhaAtendimento = null;
        String codigoProtocoloPai = null;

        Calendar hoje = Calendar.getInstance();
        for (ServicoAgendadoListaDocumento servicoAgendadoListaDocumento :
             listaServicoAgendadoListaDocumento) {

            AgendamentoAtendimento agendamento =
                servicoAgendadoListaDocumento.getAgendamento();

            if (agendamento.getDataAgendamento().getYear() !=
                hoje.get(Calendar.YEAR)) {
                continue;
            }
            if (agendamento.getDataAgendamento().getMonth() !=
                (hoje.get(Calendar.MONTH) + 1)) {
                continue;
            }
            if (agendamento.getDataAgendamento().getDay() !=
                hoje.get(Calendar.DAY_OF_MONTH)) {
                //                continue;
            }

            ResultadoEmitirProtocoloAtendimento protocolo =
                ProtocoloAtendimentoSOAPClient.getInstance().emitirProtocoloAtendimento(codigoProtocoloPai,
                                                                                        agendamento.getCidadao().getDocumentoCPF().getValue(),
                                                                                        agendamento.getIdAgendamentoAgendaFacil(),
                                                                                        agendamento.getServico().getNome(),
                                                                                        agendamento.getPosto().getUnidade().getNome());

            if (protocolo != null) {

                if (codigoProtocoloPai == null) {
                    codigoProtocoloPai = protocolo.getCodigoProtocoloPai();

                    JSFUtils.addFacesInformationMessage("Protocolo de Atendimento : " +
                                                        codigoProtocoloPai);
                }

                if (senhaAtendimento == null) {

                    senhaAtendimento = protocolo.getSenhaAtendimento();

                    JSFUtils.addFacesInformationMessage("Senha de Atendimento : " +
                                                        senhaAtendimento);

                }

                JSFUtils.addFacesInformationMessage("Protocolo do Servico '" +
                                                    agendamento.getServico().getNome() +
                                                    "' : " +
                                                    protocolo.getCodigoProtocolo());

                incluirProtocoloPayload(agendamento, protocolo);

            }
        }

        JSFUtils.addFacesInformationMessage("Processo de geração de senhas finalizado com sucesso.");

        executarAtividadeBpm(this.task, "APPROVE");

        novaConsultaActionListener(event);
    }

    private void incluirProtocoloPayload(AgendamentoAtendimento agendamento,
                                         ResultadoEmitirProtocoloAtendimento protocoloAtendimento) {

        Element payload = this.task.getPayloadAsElement();

        Element listaProtocolo =
            buscarElemento(payload, "http://br.gov.sedurb", "listaProtocolo");

        Element protocolo =
            listaProtocolo.getOwnerDocument().createElementNS("http://br.gov.sedurb",
                                                              "protocolo");

        Element codigoProtocolo =
            protocolo.getOwnerDocument().createElementNS("http://br.gov.sedurb",
                                                         "codigoProtocolo");
        codigoProtocolo.setTextContent(protocoloAtendimento.getCodigoProtocolo());
        protocolo.appendChild(codigoProtocolo);

        Element nomeServico =
            protocolo.getOwnerDocument().createElementNS("http://br.gov.sedurb",
                                                         "nomeServico");
        nomeServico.setTextContent(agendamento.getServico().getNome());
        protocolo.appendChild(nomeServico);

        Element unidadeAtendimento =
            protocolo.getOwnerDocument().createElementNS("http://br.gov.sedurb",
                                                         "unidadeAtendimento");
        unidadeAtendimento.setTextContent(agendamento.getPosto().getUnidade().getNome());
        protocolo.appendChild(unidadeAtendimento);

        Element dataAgendamento =
            protocolo.getOwnerDocument().createElementNS("http://br.gov.sedurb",
                                                         "dataAgendamento");
        dataAgendamento.setTextContent(agendamento.getDataAgendamento().toGregorianCalendar().getTime().toString());
        protocolo.appendChild(dataAgendamento);

        listaProtocolo.appendChild(protocolo);

        this.task = atualizarPayload(task, payload);

    }

    private void iniciarFluxoBPMTriagem(String cpf) {
        ADFUtils.setBoundAttributeValue("iniciarAtendimento_cpfCidadao", cpf);
        OperationBinding operation =
            ADFUtils.findOperation("iniciarAtendimento");
        operation.execute();
    }

    protected void montarListaUnidadeAtendimento(Servico servico) {
        String nomeServico = servico.getNome();
        setListaUnidadeAtendimento(new ArrayList<SelectItem>());
        setUnidadeAtendimentoSelecionado(null);

        List<UnidadeAtendimento> lista =
            UnidadeAtendimentoSOAPClient.getInstance().pesquisarUnidadeAtendimento(nomeServico);

        if (lista.size() == 0) {
            JSFUtils.addFacesInformationMessage("não existem unidades de atendimento para este serviço.");
        } else {
            for (UnidadeAtendimento unidade : lista) {
                SelectItem item = new SelectItem(unidade, unidade.getNome());
                getListaUnidadeAtendimento().add(item);
            }
        }
        AdfFacesContext.getCurrentInstance().addPartialTarget(getYourBackingBean().getSocUnidadeServicoAtendimento().getParent());
    }

    protected void montarListaServicoAtendimento() {
        setListaServicoAtendimento(new ArrayList<SelectItem>());
        for (Servico servico :
             ServicoAtendimentoSOAPClient.getInstance().listarServicoAtendimento(null)) {
            SelectItem item = new SelectItem(servico, servico.getNome());
            getListaServicoAtendimento().add(item);
        }
        setServicoAtendimentoSelecionado(null);
        AdfFacesContext.getCurrentInstance().addPartialTarget(getYourBackingBean().getSocServicoAtendimento().getParent());
    }

    protected void montarListaHorariosDisponiveis() {
        Boolean semVaga = false;
        setListaHorarioDisponivel(new ArrayList<SelectItem>());
        setHorarioAtendimentoSelecionado(null);
        AdfFacesContext.getCurrentInstance().addPartialTarget(getYourBackingBean().getG1());

        if ((getServicoAtendimentoSelecionado() != null) &&
            (getUnidadeAtendimentoSelecionado() != null)) {

            List<HorariosDisponiveisAtendimento> lista =
                AgendamentoAtendimentoSOAPClient.getInstance().listarHorariosDisponiveisAgendamento(getServicoAtendimentoSelecionado(),
                                                                                                    getUnidadeAtendimentoSelecionado(),
                                                                                                    semVaga);

            if (lista.size() == 0) {
                JSFUtils.addFacesInformationMessage("não existem horários disponíveis para agendamento.");
            }

            Date dtInicio =
                (Date)yourBackingBean.getDtInicioFiltroHorario().getValue();
            Date dtTermino =
                (Date)yourBackingBean.getDtTerminoFiltroHorario().getValue();

            for (HorariosDisponiveisAtendimento horario : lista) {

                Date dtAgenda;

                try {
                    dtAgenda =
                            sdfH.parse(sdfH.format(horario.getDataHoraAgendamento().toGregorianCalendar().getTime()));
                } catch (ParseException e) {
                    dtAgenda = null;
                }

                if ((dtInicio != null) && (dtAgenda.before(dtInicio))) {
                    continue;
                }

                if ((dtTermino != null) && (dtAgenda.after(dtTermino))) {
                    continue;
                }

                SelectItem item =
                    new SelectItem(horario, sdf.format(horario.getDataHoraAgendamento().toGregorianCalendar().getTime()) +
                                   " - " + horario.getQtdeVagasDisponiveis());
                getListaHorarioDisponivel().add(item);
            }
        }
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
                adicionaDocumento(doc, atendimento);
            }

            getListaServicoAgendadoListaDocumento().add(new ServicoAgendadoListaDocumento(listaDoc,
                                                                                          atendimento));

        }

    }

    private void adicionaDocumento(DocumentoNecessarioAtendimento doc,
                                   AgendamentoAtendimento atendimento) {

        for (ServicoAgendadoDocumento bean :
             getListaServicoAgendadoDocumento()) {
            if (bean.getDocumento().getCodigoDocumento().equals(doc.getCodigoDocumento())) {
                //documento já existe, não adiciona duplicidade.
                return;
            }
        }

        getListaServicoAgendadoDocumento().add(new ServicoAgendadoDocumento(doc,
                                                                            atendimento));
    }

    public void setMostrarConsultarCidadao(Boolean mostrarConsultarCidadao) {
        this.mostrarConsultarCidadao = mostrarConsultarCidadao;
    }

    public Boolean getMostrarConsultarCidadao() {
        return mostrarConsultarCidadao;
    }

    public void setEditandoCidadao(Boolean editandoCidadao) {
        this.editandoCidadao = editandoCidadao;
    }

    public Boolean getEditandoCidadao() {
        return editandoCidadao;
    }

    public void setYourBackingBean(QualificarAtendimento yourBackingBean) {
        this.yourBackingBean = yourBackingBean;
    }

    public QualificarAtendimento getYourBackingBean() {
        return yourBackingBean;
    }

    public void setTituloCadastrarCidadao(String tituloCadastrarCidadao) {
        this.tituloCadastrarCidadao = tituloCadastrarCidadao;
    }

    public String getTituloCadastrarCidadao() {
        return tituloCadastrarCidadao;
    }

    public void setServicoAtendimentoSelecionado(Servico servicoAtendimentoSelecionado) {
        this.servicoAtendimentoSelecionado = servicoAtendimentoSelecionado;
    }

    public Servico getServicoAtendimentoSelecionado() {
        return servicoAtendimentoSelecionado;
    }

    public void setUnidadeAtendimentoSelecionado(UnidadeAtendimento unidadeAtendimentoSelecionado) {
        this.unidadeAtendimentoSelecionado = unidadeAtendimentoSelecionado;
    }

    public UnidadeAtendimento getUnidadeAtendimentoSelecionado() {
        return unidadeAtendimentoSelecionado;
    }

    public void setFileUpload(UploadedFile fileUpload) {
        this.fileUpload = fileUpload;
    }

    public UploadedFile getFileUpload() {
        return fileUpload;
    }

    public void setHorarioAtendimentoSelecionado(HorariosDisponiveisAtendimento horarioAtendimentoSelecionado) {
        this.horarioAtendimentoSelecionado = horarioAtendimentoSelecionado;
    }

    public HorariosDisponiveisAtendimento getHorarioAtendimentoSelecionado() {
        return horarioAtendimentoSelecionado;
    }

    public void setDocumentoUpload(ServicoAgendadoDocumento documentoUpload) {
        this.documentoUpload = documentoUpload;
    }

    public ServicoAgendadoDocumento getDocumentoUpload() {
        return documentoUpload;
    }

    public void setLabelCadastrarCidadao(String labelCadastrarCidadao) {
        this.labelCadastrarCidadao = labelCadastrarCidadao;
    }

    public String getLabelCadastrarCidadao() {
        return labelCadastrarCidadao;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public Task getTask() {
        return task;
    }

    public void setCidadaoNovo(Boolean cidadaoNovo) {
        this.cidadaoNovo = cidadaoNovo;
    }

    public Boolean getCidadaoNovo() {
        return cidadaoNovo;
    }

    public void setListaServicoAgendadoListaDocumento(List<ServicoAgendadoListaDocumento> listaServicoAgendadoListaDocumento) {
        this.listaServicoAgendadoListaDocumento =
                listaServicoAgendadoListaDocumento;
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

    public void setSexoCidadao(String sexoCidadao) {
        this.sexoCidadao = sexoCidadao;
    }

    public String getSexoCidadao() {
        return sexoCidadao;
    }
}
