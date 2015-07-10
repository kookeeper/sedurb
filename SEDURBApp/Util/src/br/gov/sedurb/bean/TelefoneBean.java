package br.gov.sedurb.bean;


import br.gov.se.seplag.ebo.v1.Telefone;
import br.gov.se.seplag.ebo.v1.TipoTelefone;


public class TelefoneBean {

    private br.gov.se.seplag.ebo.v1.ObjectFactory factory =
        new br.gov.se.seplag.ebo.v1.ObjectFactory();

    protected String numeroTelefone;
    protected TipoTelefone tipoTelefone;

    public TelefoneBean() {
        super();
    }
    
    public TelefoneBean(String numero, TipoTelefone tipo) {
        numeroTelefone = numero;
        tipoTelefone = tipo;
    }

    public TelefoneBean(Telefone entity) {
        this();

        numeroTelefone = entity.getNumeroTelefone().getValue();
        if (entity.getTipoTelefone() != null) {
            tipoTelefone = entity.getTipoTelefone().getValue();
        } else {
            tipoTelefone = TipoTelefone.RESIDENCIAL;
        }
    }

    public Telefone getEntity() {
        Telefone entity = factory.createTelefone();

        entity.setNumeroTelefone(factory.createTelefoneNumeroTelefone(getNumeroTelefone()));
        entity.setTipoTelefone(factory.createTelefoneTipoTelefone(getTipoTelefone()));

        return entity;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setTipoTelefone(TipoTelefone tipoTelefone) {
        this.tipoTelefone = tipoTelefone;
    }

    public TipoTelefone getTipoTelefone() {
        return tipoTelefone;
    }
}
