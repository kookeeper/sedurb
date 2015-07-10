package br.gov.sedurb.bean;


import br.gov.se.seplag.ebo.v1.AgendamentoAtendimento;
import br.gov.se.seplag.ebo.v1.DocumentoNecessarioAtendimento;

public class ServicoAgendadoDocumento {

    private AgendamentoAtendimento agendamento;
    private DocumentoNecessarioAtendimento documento;

    public ServicoAgendadoDocumento() {
        super();
    }

    public ServicoAgendadoDocumento(DocumentoNecessarioAtendimento p0,
                                    AgendamentoAtendimento p1) {
        this();
        this.setAgendamento(p1);
        this.setDocumento(p0);
    }


    public void setAgendamento(AgendamentoAtendimento agendamento) {
        this.agendamento = agendamento;
    }

    public AgendamentoAtendimento getAgendamento() {
        return agendamento;
    }

    public void setDocumento(DocumentoNecessarioAtendimento documento) {
        this.documento = documento;
    }

    public DocumentoNecessarioAtendimento getDocumento() {
        return documento;
    }
}
