package br.gov.sedurb.bean;


import br.gov.se.seplag.ebo.v1.CarteiraIdentidade;
import br.gov.se.seplag.ebo.v1.UnidadeFederativa;

import javax.xml.datatype.XMLGregorianCalendar;


public class CarteiraIdentidadeBean {

    private br.gov.se.seplag.ebo.v1.ObjectFactory factory =
        new br.gov.se.seplag.ebo.v1.ObjectFactory();

    protected String numeroIdentidade;
    protected String numeroIdentidadeComplemento;
    protected XMLGregorianCalendar dataEmissao;
    protected UnidadeFederativa siglaUnidadeFederativa;
    protected String orgaoEmissor;

    public CarteiraIdentidadeBean() {
        super();
    }

    public CarteiraIdentidadeBean(CarteiraIdentidade entity) {
        this();

        numeroIdentidade = entity.getNumeroIdentidade().getValue();
        numeroIdentidadeComplemento =
                entity.getNumeroIdentidadeComplemento().getValue();
        dataEmissao = entity.getDataEmissao().getValue();
        siglaUnidadeFederativa = entity.getSiglaUnidadeFederativa().getValue();
        orgaoEmissor = entity.getOrgaoEmissor().getValue();

    }

    public CarteiraIdentidade getEntity() {
        CarteiraIdentidade entity = factory.createCarteiraIdentidade();

        entity.setDataEmissao(factory.createCarteiraIdentidadeDataEmissao(getDataEmissao()));
        entity.setNumeroIdentidade(factory.createCarteiraIdentidadeNumeroIdentidade(getNumeroIdentidade()));
        entity.setNumeroIdentidadeComplemento(factory.createCarteiraIdentidadeNumeroIdentidadeComplemento(getNumeroIdentidadeComplemento()));
        entity.setOrgaoEmissor(factory.createCarteiraIdentidadeOrgaoEmissor(getOrgaoEmissor()));
        entity.setSiglaUnidadeFederativa(factory.createCarteiraIdentidadeSiglaUnidadeFederativa(getSiglaUnidadeFederativa()));

        return entity;
    }

    public void setNumeroIdentidade(String numeroIdentidade) {
        this.numeroIdentidade = numeroIdentidade;
    }

    public String getNumeroIdentidade() {
        return numeroIdentidade;
    }

    public void setNumeroIdentidadeComplemento(String numeroIdentidadeComplemento) {
        this.numeroIdentidadeComplemento = numeroIdentidadeComplemento;
    }

    public String getNumeroIdentidadeComplemento() {
        return numeroIdentidadeComplemento;
    }

    public void setDataEmissao(XMLGregorianCalendar dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public XMLGregorianCalendar getDataEmissao() {
        return dataEmissao;
    }

    public void setSiglaUnidadeFederativa(UnidadeFederativa siglaUnidadeFederativa) {
        this.siglaUnidadeFederativa = siglaUnidadeFederativa;
    }

    public UnidadeFederativa getSiglaUnidadeFederativa() {
        return siglaUnidadeFederativa;
    }

    public void setOrgaoEmissor(String orgaoEmissor) {
        this.orgaoEmissor = orgaoEmissor;
    }

    public String getOrgaoEmissor() {
        return orgaoEmissor;
    }
}
