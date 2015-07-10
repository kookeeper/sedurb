package br.gov.sedurb.bean;


import br.gov.se.seplag.ebo.v1.CategoriaCarteiraPasseLivre;
import br.gov.se.seplag.ebo.v1.TipoCarteiraPasseLivre;
import br.gov.sedurb.util.JSFUtils;
import br.gov.sedurb.util.XPathUtils;
import br.gov.sedurb.ws.client.CICSergipeSOAPClient;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import oracle.adf.controller.ControllerContext;
import oracle.adf.controller.ViewPortContext;
import oracle.adf.share.logging.ADFLogger;

import oracle.bpel.services.bpm.common.IBPMContext;
import oracle.bpel.services.workflow.IWorkflowConstants;
import oracle.bpel.services.workflow.StaleObjectException;
import oracle.bpel.services.workflow.WorkflowException;
import oracle.bpel.services.workflow.client.IWorkflowServiceClientConstants;
import oracle.bpel.services.workflow.client.WorkflowServiceClientFactory;
import oracle.bpel.services.workflow.query.ITaskQueryService;
import oracle.bpel.services.workflow.repos.Predicate;
import oracle.bpel.services.workflow.repos.TableConstants;
import oracle.bpel.services.workflow.task.ITaskService;
import oracle.bpel.services.workflow.task.model.Task;

import oracle.bpm.client.BPMServiceClientFactory;
import oracle.bpm.services.client.IBPMServiceClient;
import oracle.bpm.services.common.exception.BPMException;
import oracle.bpm.services.instancemanagement.IInstanceManagementService;
import oracle.bpm.services.processmetadata.IProcessMetadataService;
import oracle.bpm.services.processmetadata.ProcessMetadataSummary;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;


public class GenericBean {

    protected br.gov.se.seplag.ebo.v1.ObjectFactory factoryEBO =
        new br.gov.se.seplag.ebo.v1.ObjectFactory();

    protected static final ADFLogger LOGGER =
        ADFLogger.createADFLogger(GenericBean.class);
    protected static String URL_WEBLOGIC;
    protected static String USUARIO_WEBLOGIC;
    protected static String SENHA_WEBLOGIC;

    public GenericBean() {
        super();

        FacesContext context = FacesContext.getCurrentInstance();
        if (context != null) {
            URL_WEBLOGIC =
                    context.getExternalContext().getInitParameter("URL_WEBLOGIC");
            USUARIO_WEBLOGIC =
                    context.getExternalContext().getInitParameter("USUARIO_WEBLOGIC");
            SENHA_WEBLOGIC =
                    context.getExternalContext().getInitParameter("SENHA_WEBLOGIC");
        } else {
            URL_WEBLOGIC = "t3://192.168.30.89:7001";
            USUARIO_WEBLOGIC = "weblogic";
            SENHA_WEBLOGIC = "Cds@3124";
        }

        carregaListaUnidadeFederativa();

        carregarCategoriaCarteiraPasseLivre();

        carregarTipoCarteiraPasseLivre();

    }

    private void carregaListaUnidadeFederativa() {
        setListaUnidadeFederativa(new ArrayList<SelectItem>());
        getListaUnidadeFederativa().add(new SelectItem("AC", "Acre"));
        getListaUnidadeFederativa().add(new SelectItem("AL", "Alagoas"));
        getListaUnidadeFederativa().add(new SelectItem("AP", "Amapá"));
        getListaUnidadeFederativa().add(new SelectItem("AM", "Amazonas"));
        getListaUnidadeFederativa().add(new SelectItem("BA", "Bahia"));
        getListaUnidadeFederativa().add(new SelectItem("CE", "Ceará"));
        getListaUnidadeFederativa().add(new SelectItem("DF",
                                                       "Distrito Federal"));
        getListaUnidadeFederativa().add(new SelectItem("ES",
                                                       "Espírito Santo"));
        getListaUnidadeFederativa().add(new SelectItem("GO", "Goiás"));
        getListaUnidadeFederativa().add(new SelectItem("MA", "Maranhão"));
        getListaUnidadeFederativa().add(new SelectItem("MT", "Mato Grosso"));
        getListaUnidadeFederativa().add(new SelectItem("MS",
                                                       "Mato Grosso do Sul"));
        getListaUnidadeFederativa().add(new SelectItem("MG", "Minas Gerais"));
        getListaUnidadeFederativa().add(new SelectItem("PA", "Pará"));
        getListaUnidadeFederativa().add(new SelectItem("PB", "Paraíba"));
        getListaUnidadeFederativa().add(new SelectItem("PR", "Paraná"));
        getListaUnidadeFederativa().add(new SelectItem("PE", "Pernambuco"));
        getListaUnidadeFederativa().add(new SelectItem("PI", "Piauí"));
        getListaUnidadeFederativa().add(new SelectItem("RJ",
                                                       "Rio de Janeiro"));
        getListaUnidadeFederativa().add(new SelectItem("RN",
                                                       "Rio Grande do Norte"));
        getListaUnidadeFederativa().add(new SelectItem("RS",
                                                       "Rio Grande do Sul"));
        getListaUnidadeFederativa().add(new SelectItem("RO", "Rondônia"));
        getListaUnidadeFederativa().add(new SelectItem("RR", "Roraima"));
        getListaUnidadeFederativa().add(new SelectItem("SC",
                                                       "Santa Catarina"));
        getListaUnidadeFederativa().add(new SelectItem("SP", "São Paulo"));
        getListaUnidadeFederativa().add(new SelectItem("SE", "Sergipe"));
        getListaUnidadeFederativa().add(new SelectItem("TO", "Tocantins"));
    }

    protected Integer buscarIndiceUnidadeFederativa(String uf) {

        int i = 0;
        for (SelectItem item : getListaUnidadeFederativa()) {
            if (item.getValue().equals(uf)) {
                return i;
            }
            i++;
        }

        return null;
    }

    private void carregarCategoriaCarteiraPasseLivre() {
        setListaCategoriaCarteiraPasseLivre(new ArrayList<SelectItem>());
        getListaCategoriaCarteiraPasseLivre().add(new SelectItem(CategoriaCarteiraPasseLivre.CADASTRO));
        getListaCategoriaCarteiraPasseLivre().add(new SelectItem(CategoriaCarteiraPasseLivre.CANCELADO));
        getListaCategoriaCarteiraPasseLivre().add(new SelectItem(CategoriaCarteiraPasseLivre.INDEFERIDO));
        getListaCategoriaCarteiraPasseLivre().add(new SelectItem(CategoriaCarteiraPasseLivre.PERMANENTE));
        getListaCategoriaCarteiraPasseLivre().add(new SelectItem(CategoriaCarteiraPasseLivre.PROVISORIO));
        getListaCategoriaCarteiraPasseLivre().add(new SelectItem(CategoriaCarteiraPasseLivre.VENCIDO));
    }

    private void carregarTipoCarteiraPasseLivre() {
        setListaTipoCarteiraPasseLivre(new ArrayList<SelectItem>());
        getListaTipoCarteiraPasseLivre().add(new SelectItem(TipoCarteiraPasseLivre.DEFICIENTE));
        getListaTipoCarteiraPasseLivre().add(new SelectItem(TipoCarteiraPasseLivre.IDOSO));
    }

    protected void obterCidadao(String cpf) throws br.gov.se.seplag.cicsergipe.ErroInfoMessage {
        String documentoCpf = cpf;
        try {
            CidadaoBean bean =
                CICSergipeSOAPClient.getInstance().obterCidadao(documentoCpf);
            br.gov.se.seplag.ebo.v1.ObjectFactory factory =
                new br.gov.se.seplag.ebo.v1.ObjectFactory();

            setCidadao(bean);
        } catch (br.gov.se.seplag.cicsergipe.ErroInfoMessage e) {
            if (e.getFaultInfo().getCodigo().getValue().equalsIgnoreCase("ERR_CID_004")) {
                setCidadao(null);
            } else {
                throw e;
            }
        }

    }

    protected XMLGregorianCalendar toXMLGregorianCalendar(Date data) throws DatatypeConfigurationException {

        XMLGregorianCalendar xml;
        GregorianCalendar calendar = (GregorianCalendar)Calendar.getInstance();
        calendar.setTime(data);
        xml = DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
        return xml;

    }

    void start(String arg1) {

        try {
            String result =
                getBPMServiceClient().getInstanceManagementService().createProcessInstance(getBpmContext(),
                                                                                           arg1);
            System.out.println(result);
            //        getBPMServiceClientFactory().getWorkflowServiceClient().getTaskService();
        } catch (Exception e) {
            JSFUtils.addFacesErrorMessage(e.getMessage());
        }

    }

    void iniciarFluxoBPM() {
        try {
            IProcessMetadataService service =
                getBPMServiceClient().getProcessMetadataService();
            List<ProcessMetadataSummary> lista =
                service.getInitiatableProcesses(getBpmContext());

            for (ProcessMetadataSummary process : lista) {
                IInstanceManagementService ims =
                    getBPMServiceClient().getInstanceManagementService();

                String instance =
                    ims.createProcessInstance(getBpmContext(), process.getCompositeDN() +
                                              "/" + process.getProcessName());

                System.out.println(instance);
            }
        } catch (Exception e) {
            JSFUtils.addFacesErrorMessage(e.getMessage());
        }
    }

    public void executarAtividadeBpm(Task task, String outcome) {

        try {
            ITaskService taskSvc =
                getBPMServiceClientFactory().getWorkflowServiceClient().getTaskService();

            taskSvc.updateTaskOutcome(getBpmContext(), task, outcome);

        } catch (WorkflowException e) {
            JSFUtils.addFacesErrorMessage(e.getMessage());
        } catch (StaleObjectException e) {
            JSFUtils.addFacesErrorMessage(e.getMessage());
        } catch (BPMException e) {
            JSFUtils.addFacesErrorMessage(e.getMessage());
        }
    }

    public void setPayloadValue(Element payload, String xpath,
                                Map namespacemap, String value) {
        try {
            XPathUtils.setNodeValue(payload, namespacemap, xpath, value);
        } catch (Exception e) {
            JSFUtils.addFacesErrorMessage(e.getMessage());
        }
    }

    public Task atualizarPayload(Task task, Element payload) {

        try {

            ITaskService taskSvc =
                getBPMServiceClientFactory().getWorkflowServiceClient().getTaskService();

            task.setPayloadAsElement(payload);

            return taskSvc.updateTask(getBpmContext(), task);

        } catch (WorkflowException e) {
            JSFUtils.addFacesErrorMessage(e.getMessage());
        } catch (StaleObjectException e) {
            JSFUtils.addFacesErrorMessage(e.getMessage());
        } catch (BPMException e) {
            JSFUtils.addFacesErrorMessage(e.getMessage());
        }

        return null;
    }

    public Element buscarElemento(Element payload, String namespace,
                                  String nome) {

        NodeList nodes = payload.getElementsByTagNameNS(namespace, nome);

        Element node;

        if (nodes.getLength() == 0) {
            node = payload.getOwnerDocument().createElementNS(namespace, nome);
            payload.appendChild(node);
        } else {
            node = (Element)nodes.item(0);
        }

        return node;

    }

    Task buscarAtividadePorId(String taskId) {

        ITaskQueryService querySvc =
            getBPMServiceClientFactory().getWorkflowServiceClient().getTaskQueryService();

        try {
            Task task = querySvc.getTaskDetailsById(getBpmContext(), taskId);

            return task;
        } catch (WorkflowException e) {
            JSFUtils.addFacesErrorMessage(e.getMessage());
        } catch (BPMException e) {
            JSFUtils.addFacesErrorMessage(e.getMessage());
        }

        return null;
    }

    public Task buscarAtividadeImpCart(String protocolo) {

        return buscarAtividadeAberta(null, "ImprimirCarteira", protocolo);

    }

    Task buscarAtividadeSolImpCartAberta(String protocolo) {

        return buscarAtividadeAberta(null, "SolicitarImpressaoCarteira",
                                     protocolo);

    }

    Task buscarAtividadeTriagemAberta(String cpf) {

        return buscarAtividadeAberta("ProcessoTriagem", "Gerar Protocolo",
                                     cpf);

    }

    Task buscarAtividadeAberta(String nomeProcesso, String nomeAtividade,
                               String textAttr1) {

        List<Task> instancias =
            listarAtividade(nomeProcesso, nomeAtividade, textAttr1);

        if (instancias.size() > 0) {
            String taskId =
                instancias.get(instancias.size() - 1).getSystemAttributes().getTaskId();

            return buscarAtividadePorId(taskId);
        }

        return null;
    }

    /*
    String buscarInstanciaTriagemBPMPorCPF(String cpf) {
        try {
            List<IProcessInstance> instancias =
                buscarInstancias("ProcessoTriagem");

            for (IProcessInstance instancia : instancias) {
                Iterable<ICorrelationKeyItem> keys =
                    buscarCorrelationKeys(instancia.getSystemAttributes().getProcessInstanceId());

                for (ICorrelationKeyItem key : keys) {
                    if (key.getName().equals("ck_cp_cpfCidadao")) {
                        for (ICorrelationKeyProperty prop :
                             key.getProperties()) {
                            if (prop.getName().getLocalPart().equals("cp_cpfCidadao")) {
                                if (prop.getValue().equals(cpf)) {
                                    return instancia.getSystemAttributes().getProcessInstanceId();
                                }
                            }
                        }
                    }
                }
            }
        } catch (WorkflowException e) {
            JSFUtils.addFacesErrorMessage(e.getMessage());
        } catch (BPMException e) {
            JSFUtils.addFacesErrorMessage(e.getMessage());
        }
        return null;

    }
*/

    /*
    String buscarInstanciaPasseLivreIdosoPorProtocoloAtendimento(String protocoloAtendimento) {
        try {
            List<IProcessInstance> instancias =
                buscarInstancias("PasseLivreIdoso");

            for (IProcessInstance instancia : instancias) {
                Iterable<ICorrelationKeyItem> keys =
                    buscarCorrelationKeys(instancia.getSystemAttributes().getProcessInstanceId());

                for (ICorrelationKeyItem key : keys) {
                    if (key.getName().equals("ck_cp_protocoloAtendimento")) {
                        for (ICorrelationKeyProperty prop :
                             key.getProperties()) {
                            if (prop.getName().getLocalPart().equals("cp_protocoloAtendimento")) {
                                if (prop.getValue().equals(protocoloAtendimento)) {
                                    return instancia.getSystemAttributes().getProcessInstanceId();
                                }
                            }
                        }
                    }
                }
            }
        } catch (WorkflowException e) {
            JSFUtils.addFacesErrorMessage(e.getMessage());
        } catch (BPMException e) {
            JSFUtils.addFacesErrorMessage(e.getMessage());
        }
        return null;

    }
*/

    private BPMServiceClientFactory getBPMServiceClientFactory() {
        if (serviceClientFactory == null) {
            Map<IWorkflowServiceClientConstants.CONNECTION_PROPERTY, String> properties =
                new HashMap<IWorkflowServiceClientConstants.CONNECTION_PROPERTY, String>();

            properties.put(IWorkflowServiceClientConstants.CONNECTION_PROPERTY.CLIENT_TYPE,
                           WorkflowServiceClientFactory.REMOTE_CLIENT);
            properties.put(IWorkflowServiceClientConstants.CONNECTION_PROPERTY.EJB_PROVIDER_URL,
                           URL_WEBLOGIC);
            properties.put(IWorkflowServiceClientConstants.CONNECTION_PROPERTY.EJB_INITIAL_CONTEXT_FACTORY,
                           "weblogic.jndi.WLInitialContextFactory");

            this.serviceClientFactory =
                    BPMServiceClientFactory.getInstance(properties, null,
                                                        null);

        }

        return serviceClientFactory;

    }

    private IBPMServiceClient getBPMServiceClient() {
        return getBPMServiceClientFactory().getBPMServiceClient();
    }

    private IBPMContext getBpmContext() throws BPMException {
        return getBPMServiceClientFactory().getBPMUserAuthenticationService().authenticate(USUARIO_WEBLOGIC,
                                                                                           SENHA_WEBLOGIC.toCharArray(),
                                                                                           null);
    }

    private List<Task> listarAtividade(String nomeProcesso,
                                       String nomeAtividade,
                                       String textAttr1) {

        ITaskQueryService querySvc =
            getBPMServiceClientFactory().getWorkflowServiceClient().getTaskQueryService();

        List<Task> tasksList = new ArrayList<Task>();
        try {

            List queryColumns = new ArrayList();
            queryColumns.add("TASKNUMBER");
            queryColumns.add("TITLE");
            queryColumns.add("PRIORITY");
            queryColumns.add("STATE");
            queryColumns.add("ENDDATE");
            queryColumns.add("NUMBERATTRIBUTE1");
            queryColumns.add("TEXTATTRIBUTE1");

            Predicate predicate =
                new Predicate(TableConstants.WFTASK_STATE_COLUMN,
                              Predicate.OP_EQ,
                              IWorkflowConstants.TASK_STATE_ASSIGNED);

            if (nomeProcesso != null) {
                predicate.addClause(Predicate.AND,
                                    TableConstants.WFTASK_PROCESSNAME_COLUMN,
                                    Predicate.OP_EQ, nomeProcesso);
            }

            predicate.addClause(Predicate.AND,
                                TableConstants.WFTASK_TEXTATTRIBUTE1_COLUMN,
                                Predicate.OP_EQ, textAttr1);

            predicate.addClause(Predicate.AND,
                                TableConstants.WFTASK_ACTIVITYNAME_COLUMN,
                                Predicate.OP_EQ, nomeAtividade);

            tasksList =
                    querySvc.queryTasks(getBpmContext(), queryColumns, null,
                                        ITaskQueryService.ASSIGNMENT_FILTER_MY_AND_GROUP,
                                        null, predicate, null, 0, 0);
        } catch (WorkflowException e) {
            JSFUtils.addFacesErrorMessage(e.getMessage());
        } catch (BPMException e) {
            JSFUtils.addFacesErrorMessage(e.getMessage());
        }

        return tasksList;
    }

    /*
    private List<IProcessInstance> buscarInstancias(String nomeProcesso) throws BPMException,
                                                                                WorkflowException {

        List<Column> columns = new ArrayList<Column>();
        columns.add(IColumnConstants.PROCESS_INSTANCEID_COLUMN);
        columns.add(IColumnConstants.PROCESS_ID_COLUMN);
        columns.add(IColumnConstants.PROCESS_STATE_COLUMN);
        columns.add(IColumnConstants.PROCESS_TITLE_COLUMN);
        columns.add(IColumnConstants.PROCESS_PROCESSNAME_COLUMN);

        IInstanceQueryInput input = new InstanceQueryInput();
        input.setAssignmentFilter(IInstanceQueryInput.AssignmentFilter.ALL);
        input.addState(IInstanceQueryInput.PROCESS_STATE_OPEN);

        IBPMServiceClient service = getBPMServiceClient();

        Predicate predicate =
            new Predicate(TableConstants.BPMPROCESS_NAME_COLUMN,
                          Predicate.OP_EQ, nomeProcesso);

        List<IProcessInstance> instances =
            service.getInstanceQueryService().queryInstances(getBpmContext(),
                                                             columns,
                                                             predicate, null,
                                                             input);

        return instances;

    }
*/

    /*
    private Iterable<ICorrelationKeyItem> buscarCorrelationKeys(String processInstanceId) throws BPMException {

        IProcessInstance processInstance =
            getBPMServiceClient().getInstanceQueryService().getProcessInstance(getBpmContext(),
                                                                               processInstanceId);

        InstanceContextConfiguration.Builder builder =
            new InstanceContextConfiguration.Builder();
        builder.includeProcessDataObjects();
        builder.includeCorrelationKeys();

        IInstanceContextConfiguration configuration = builder.build();

        IGrabInstanceContextRequest request =
            GrabInstanceContextRequest.create(processInstance, false,
                                              LocationInfo.ROOT_LOCATION,
                                              configuration);

        IGrabInstanceContextResponse context =
            getBPMServiceClient().getInstanceQueryService().createGrabInstanceContext(getBpmContext(),
                                                                                      request);

        Iterable<ICorrelationKeyItem> result =
            context.getGrabInstanceContext().getAvailableCorrelationKeys();

        return result;

    }
*/

    public void errorHandler() {
        ControllerContext context = ControllerContext.getInstance();
        ViewPortContext port = context.getCurrentViewPort();

        if (port.isExceptionPresent()) {
            JSFUtils.addFacesErrorMessage(port.getExceptionData().getMessage());
            FacesContext.getCurrentInstance().renderResponse();
        }
    }
    
    private List<SelectItem> listaUnidadeFederativa;
    private List<SelectItem> listaServicoAtendimento;
    private List<SelectItem> listaUnidadeAtendimento;
    private List<SelectItem> listaHorarioDisponivel;
    private List<SelectItem> listaCategoriaCarteiraPasseLivre;
    private List<SelectItem> listaTipoCarteiraPasseLivre;

    private CidadaoBean cidadao;
    private BPMServiceClientFactory serviceClientFactory;

    public void setListaUnidadeFederativa(List<SelectItem> listaUnidadeFederativa) {
        this.listaUnidadeFederativa = listaUnidadeFederativa;
    }

    public List<SelectItem> getListaUnidadeFederativa() {
        return listaUnidadeFederativa;
    }

    public void setListaServicoAtendimento(List<SelectItem> listaServicoAtendimento) {
        this.listaServicoAtendimento = listaServicoAtendimento;
    }

    public List<SelectItem> getListaServicoAtendimento() {
        return listaServicoAtendimento;
    }

    public void setListaUnidadeAtendimento(List<SelectItem> listaUnidadeAtendimento) {
        this.listaUnidadeAtendimento = listaUnidadeAtendimento;
    }

    public List<SelectItem> getListaUnidadeAtendimento() {
        return listaUnidadeAtendimento;
    }

    public void setListaHorarioDisponivel(List<SelectItem> listaHorarioDisponivel) {
        this.listaHorarioDisponivel = listaHorarioDisponivel;
    }

    public List<SelectItem> getListaHorarioDisponivel() {
        return listaHorarioDisponivel;
    }

    public void setCidadao(CidadaoBean cidadao) {
        this.cidadao = cidadao;
    }

    public CidadaoBean getCidadao() {
        return cidadao;
    }

    public static ADFLogger getLOGGER() {
        return LOGGER;
    }

    public static String getURL_WEBLOGIC() {
        return URL_WEBLOGIC;
    }

    public static String getUSUARIO_WEBLOGIC() {
        return USUARIO_WEBLOGIC;
    }

    public static String getSENHA_WEBLOGIC() {
        return SENHA_WEBLOGIC;
    }

    public void setListaCategoriaCarteiraPasseLivre(List<SelectItem> listaCategoriaCarteiraPasseLivre) {
        this.listaCategoriaCarteiraPasseLivre =
                listaCategoriaCarteiraPasseLivre;
    }

    public List<SelectItem> getListaCategoriaCarteiraPasseLivre() {
        return listaCategoriaCarteiraPasseLivre;
    }

    public void setListaTipoCarteiraPasseLivre(List<SelectItem> listaTipoCarteiraPasseLivre) {
        this.listaTipoCarteiraPasseLivre = listaTipoCarteiraPasseLivre;
    }

    public List<SelectItem> getListaTipoCarteiraPasseLivre() {
        return listaTipoCarteiraPasseLivre;
    }

    public void setServiceClientFactory(BPMServiceClientFactory serviceClientFactory) {
        this.serviceClientFactory = serviceClientFactory;
    }
}
