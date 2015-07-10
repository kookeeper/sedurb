package br.gov.sedurb.bean;


import br.gov.se.seplag.ebo.v1.AgendamentoAtendimento;
import br.gov.se.seplag.ebo.v1.DocumentoNecessarioAtendimento;

import java.util.List;

public class ServicoAgendadoListaDocumento {

    private AgendamentoAtendimento agendamento;
    private List<DocumentoNecessarioAtendimento> listaDocumento;

    public ServicoAgendadoListaDocumento() {
        super();
    }

    public ServicoAgendadoListaDocumento(List<DocumentoNecessarioAtendimento> p0,
                                    AgendamentoAtendimento p1) {
        this();
        this.setAgendamento(p1);
        this.setListaDocumento(p0);
    }


    public void setAgendamento(AgendamentoAtendimento agendamento) {
        this.agendamento = agendamento;
    }

    public AgendamentoAtendimento getAgendamento() {
        return agendamento;
    }

    public void setListaDocumento(List<DocumentoNecessarioAtendimento> listaDocumento) {
        this.listaDocumento = listaDocumento;
    }

    public List<DocumentoNecessarioAtendimento> getListaDocumento() {
        return listaDocumento;
    }
}
