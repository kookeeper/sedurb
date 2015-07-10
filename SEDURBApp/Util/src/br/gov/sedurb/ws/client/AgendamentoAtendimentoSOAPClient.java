package br.gov.sedurb.ws.client;


import br.gov.se.seplag.RequestFixo;
import br.gov.se.seplag.agendamentoatendimento.AgendamentoAtendimento;
import br.gov.se.seplag.agendamentoatendimento.AgendamentoAtendimento_PortType;
import br.gov.se.seplag.agendamentoatendimento.ErroInfoMessage;
import br.gov.se.seplag.agendamentoatendimento.ParametroListarAgendamentosPorCPF;
import br.gov.se.seplag.agendamentoatendimento.ParametroListarHorariosDisponiveisAgendamento;
import br.gov.se.seplag.agendamentoatendimento.ParametroRealizarAgendamentoAtendimento;
import br.gov.se.seplag.agendamentoatendimento.ResultadoListarAgendamentosPorCPF;
import br.gov.se.seplag.agendamentoatendimento.ResultadoListarHorariosDisponiveisAgendamento;
import br.gov.se.seplag.agendamentoatendimento.ResultadoRealizarAgendamentoAtendimento;
import br.gov.se.seplag.ebo.v1.Cidadao;
import br.gov.se.seplag.ebo.v1.HorariosDisponiveisAtendimento;
import br.gov.se.seplag.ebo.v1.Servico;
import br.gov.se.seplag.ebo.v1.UnidadeAtendimento;

import br.gov.sedurb.util.JSFUtils;

import java.util.ArrayList;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.WebServiceRef;


public class AgendamentoAtendimentoSOAPClient extends WSClient<AgendamentoAtendimento_PortType> {
    @WebServiceRef
    private AgendamentoAtendimento agendamentoAtendimento;
    private static AgendamentoAtendimentoSOAPClient obj;

    public static AgendamentoAtendimentoSOAPClient getInstance() {
        obj = new AgendamentoAtendimentoSOAPClient();
        return obj;
    }

    private AgendamentoAtendimentoSOAPClient() {
        super();
    }

    public List<br.gov.se.seplag.ebo.v1.AgendamentoAtendimento> listarAgendamentosPorCPF(boolean emAberto,
                                                                                         String cpf,
                                                                                         UnidadeAtendimento unidadeAtendimento) {

        AgendamentoAtendimento_PortType port = getPort();

        ParametroListarAgendamentosPorCPF parameters =
            new ParametroListarAgendamentosPorCPF();
        parameters.setBuscarSomenteAgendamentosEmAberto(emAberto);
        parameters.setDocumentoCPF(cpf);
        parameters.setUnidadeAtendimento(unidadeAtendimento);

        List<br.gov.se.seplag.ebo.v1.AgendamentoAtendimento> agendamentos =
            new ArrayList<br.gov.se.seplag.ebo.v1.AgendamentoAtendimento>();

        try {
            ResultadoListarAgendamentosPorCPF lista =
                port.listarAgendamentosPorCPF(parameters,
                                              RequestFixo.cabecalho());

            agendamentos = lista.getAgendamentos().getAgendamentoAtendimento();

        } catch (ErroInfoMessage e) {
            JSFUtils.addFacesErrorMessage("Erro ao tentar utilizar o serviço " + this.getClass().getSimpleName() + ":" + e.getMessage());
        } catch (Exception e) {
            JSFUtils.addFacesErrorMessage(erroGenerico(e));
        }

        return agendamentos;
    }

    public List<HorariosDisponiveisAtendimento> listarHorariosDisponiveisAgendamento(Servico servico,
                                                                                     UnidadeAtendimento unidadeAtendimento,
                                                                                     Boolean semVaga) {

        AgendamentoAtendimento_PortType port = getPort();


        ParametroListarHorariosDisponiveisAgendamento parameters =
            new ParametroListarHorariosDisponiveisAgendamento();
        parameters.setExibirHorariosSemVagas(semVaga);
        parameters.setServico(servico);
        parameters.setUnidadeAtendimento(unidadeAtendimento);

        List<HorariosDisponiveisAtendimento> horarios =
            new ArrayList<HorariosDisponiveisAtendimento>();

        try {
            ResultadoListarHorariosDisponiveisAgendamento lista =
                port.listarHorariosDisponiveisAgendamento(parameters,
                                                          RequestFixo.cabecalho());

            horarios =
                    lista.getHorariosDisponiveis().getHorariosDisponiveisAtendimento();

        } catch (ErroInfoMessage e) {
            JSFUtils.addFacesErrorMessage("Erro ao tentar utilizar o serviço " + this.getClass().getSimpleName() + ":" + e.getMessage());
        } catch (Exception e) {
            JSFUtils.addFacesErrorMessage(erroGenerico(e));
        }

        return horarios;
    }

    public br.gov.se.seplag.ebo.v1.AgendamentoAtendimento realizarAgendamentoAtendimento(Cidadao cidadao,
                                                                                         XMLGregorianCalendar dataAgendamento,
                                                                                         Servico servico,
                                                                                         UnidadeAtendimento unidadeAtendimento) {

        AgendamentoAtendimento_PortType port = getPort();

        ParametroRealizarAgendamentoAtendimento parameters =
            new ParametroRealizarAgendamentoAtendimento();
        parameters.setCidadao(cidadao);
        parameters.setDataHoraAgendamento(dataAgendamento);
        parameters.setServico(servico);
        parameters.setUnidadeAtendimento(unidadeAtendimento);

        br.gov.se.seplag.ebo.v1.AgendamentoAtendimento retorno =
            new br.gov.se.seplag.ebo.v1.AgendamentoAtendimento();

        try {
            ResultadoRealizarAgendamentoAtendimento agendamento =
                port.realizarAgendamentoAtendimento(parameters,
                                                    RequestFixo.cabecalho());

            retorno = agendamento.getAgendamento();
        } catch (ErroInfoMessage e) {
            JSFUtils.addFacesErrorMessage("Erro ao tentar utilizar o serviço " + this.getClass().getSimpleName() + ":" + e.getMessage());
        } catch (Exception e) {
            JSFUtils.addFacesErrorMessage(erroGenerico(e));
        }

        return retorno;
    }

    public AgendamentoAtendimento_PortType criarPortType() {
        agendamentoAtendimento = new AgendamentoAtendimento();

        AgendamentoAtendimento_PortType port =
            agendamentoAtendimento.getAgendamentoAtendimentoSOAP_Port();

        return port;
    }

}
