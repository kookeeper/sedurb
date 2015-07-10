package br.gov.sedurb.bean;


import br.gov.se.seplag.ebo.v1.Servico;
import br.gov.se.seplag.protocoloatendimento.ResultadoConsultarProtocoloAtendimento;

import java.util.Date;

import oracle.bpel.services.workflow.task.model.Task;


public class ImprimirCarteiraBean {

    private ResultadoConsultarProtocoloAtendimento.Protocolos.Protocolo protocolo;
    private Date dataImpressao;
    private Date dataEntrega;
    private byte[] reciboEntrega;
    private Task task;

    public ImprimirCarteiraBean() {
        super();
    }

    public ImprimirCarteiraBean(ResultadoConsultarProtocoloAtendimento.Protocolos.Protocolo protocolo,
                                Date dataImpressao, Date dataEntrega,
                                byte[] reciboEntrega, Task task) {
        super();
        this.protocolo = protocolo;
        this.dataImpressao = dataImpressao;
        this.dataEntrega = dataEntrega;
        this.reciboEntrega = reciboEntrega;
        this.task = task;
    }

    public void setProtocolo(ResultadoConsultarProtocoloAtendimento.Protocolos.Protocolo protocolo) {
        this.protocolo = protocolo;
    }

    public ResultadoConsultarProtocoloAtendimento.Protocolos.Protocolo getProtocolo() {
        return protocolo;
    }

    public void setDataImpressao(Date dataImpressao) {
        this.dataImpressao = dataImpressao;
    }

    public Date getDataImpressao() {
        return dataImpressao;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setReciboEntrega(byte[] reciboEntrega) {
        this.reciboEntrega = reciboEntrega;
    }

    public byte[] getReciboEntrega() {
        return reciboEntrega;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public Task getTask() {
        return task;
    }
}
