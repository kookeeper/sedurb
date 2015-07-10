package br.gov.sedurb.bean;


import br.gov.se.seplag.ebo.v1.Endereco;


public class EnderecoBean {

    private br.gov.se.seplag.ebo.v1.ObjectFactory factory =
        new br.gov.se.seplag.ebo.v1.ObjectFactory();

    protected String tipoLogradouro;
    protected String nomeLogradouro;
    protected String numeroLogradouro;
    protected String complemento;
    protected String bairro;
    protected String cep;
    protected String municipio;
    protected String unidadeFederativa;
    protected String pais;

    public EnderecoBean() {
        super();
    }

    public EnderecoBean(Endereco entity) {
        this();
        tipoLogradouro = entity.getTipoLogradouro().getValue();
        nomeLogradouro = entity.getNomeLogradouro().getValue();
        numeroLogradouro = entity.getNumeroLogradouro().getValue();
        complemento = entity.getComplemento().getValue();
        bairro = entity.getBairro().getValue();
        cep = entity.getCep().getValue();
        municipio = entity.getMunicipio().getValue();
        unidadeFederativa = entity.getUnidadeFederativa().getValue();
        pais = entity.getPais().getValue();
    }

    public Endereco getEntity() {
        Endereco entity = factory.createEndereco();

        entity.setBairro(factory.createEnderecoBairro(getBairro()));
        entity.setCep(factory.createEnderecoCep(getCep()));
        entity.setComplemento(factory.createEnderecoComplemento(getComplemento()));
        entity.setMunicipio(factory.createEnderecoMunicipio(getMunicipio()));
        entity.setNomeLogradouro(factory.createEnderecoNomeLogradouro(getNomeLogradouro()));
        entity.setNumeroLogradouro(factory.createEnderecoNumeroLogradouro(getNumeroLogradouro()));
        entity.setPais(factory.createEnderecoPais(getPais()));
        entity.setTipoLogradouro(factory.createEnderecoTipoLogradouro(getTipoLogradouro()));
        entity.setUnidadeFederativa(factory.createEnderecoUnidadeFederativa(getUnidadeFederativa()));

        return entity;
    }

    public void setTipoLogradouro(String tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    public String getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setNomeLogradouro(String nomeLogradouro) {
        this.nomeLogradouro = nomeLogradouro;
    }

    public String getNomeLogradouro() {
        return nomeLogradouro;
    }

    public void setNumeroLogradouro(String numeroLogradouro) {
        this.numeroLogradouro = numeroLogradouro;
    }

    public String getNumeroLogradouro() {
        return numeroLogradouro;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCep() {
        return cep;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setUnidadeFederativa(String unidadeFederativa) {
        this.unidadeFederativa = unidadeFederativa;
    }

    public String getUnidadeFederativa() {
        return unidadeFederativa;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }
}
