package br.gov.sedurb.bean;

import br.gov.se.seplag.ebo.v1.AgendamentoAtendimento;
import br.gov.se.seplag.ebo.v1.DocumentoNecessarioAtendimento;
import br.gov.se.seplag.protocoloatendimento.ResultadoConsultarProtocoloAtendimento;

import java.util.List;

import oracle.bpel.services.workflow.task.model.Task;

public class ServicoAgendadoProtocolo {
    
    private AgendamentoAtendimento agendamento;
    private ResultadoConsultarProtocoloAtendimento.Protocolos.Protocolo protocolo;
    private List<DocumentoNecessarioAtendimento> listaDocumento;
    private Task task;
    
    public ServicoAgendadoProtocolo() {
        super();
    }

    public ServicoAgendadoProtocolo(ResultadoConsultarProtocoloAtendimento.Protocolos.Protocolo p0, AgendamentoAtendimento p1, Task task, List<DocumentoNecessarioAtendimento> listaDocumento) {
        this();
        this.setAgendamento(p1);
        this.setProtocolo(p0);
        this.setTask(task);
        this.setListaDocumento(listaDocumento);
    }


    public void setAgendamento(AgendamentoAtendimento agendamento) {
        this.agendamento = agendamento;
    }

    public AgendamentoAtendimento getAgendamento() {
        return agendamento;
    }

    public void setProtocolo(ResultadoConsultarProtocoloAtendimento.Protocolos.Protocolo protocolo) {
        this.protocolo = protocolo;
    }

    public ResultadoConsultarProtocoloAtendimento.Protocolos.Protocolo getProtocolo() {
        return protocolo;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public Task getTask() {
        return task;
    }

    public void setListaDocumento(List<DocumentoNecessarioAtendimento> listaDocumento) {
        this.listaDocumento = listaDocumento;
    }

    public List<DocumentoNecessarioAtendimento> getListaDocumento() {
        return listaDocumento;
    }
}
