package br.gov.sedurb.bean;

import br.gov.se.seplag.ebo.v1.Cidadao;
import br.gov.se.seplag.ebo.v1.ListaTelefone;
import br.gov.se.seplag.ebo.v1.Sexo;

import br.gov.se.seplag.ebo.v1.Telefone;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.XMLGregorianCalendar;

public class CidadaoBean {

    private br.gov.se.seplag.ebo.v1.ObjectFactory factory = new br.gov.se.seplag.ebo.v1.ObjectFactory();
    
    protected String documentoCPF;
    protected String nomeCompleto;
    protected CarteiraIdentidadeBean carteiraIdentidade;
    protected EnderecoBean endereco;
    protected XMLGregorianCalendar dataNascimento;
    protected List<TelefoneBean> listaTelefone;
    protected Sexo sexo;
    protected String foto;

    public CidadaoBean() {
        super();
    }
    
    public CidadaoBean(String cpf) {
        setCarteiraIdentidade(new CarteiraIdentidadeBean());
        setEndereco(new EnderecoBean());
        setDocumentoCPF(cpf);
    }
    
    public CidadaoBean(Cidadao entity) {
        this();
        this.carteiraIdentidade = new CarteiraIdentidadeBean(entity.getCarteiraIdentidade().getValue());
        this.dataNascimento = entity.getDataNascimento().getValue();
        this.documentoCPF = entity.getDocumentoCPF().getValue();
        this.endereco = new EnderecoBean(entity.getEndereco().getValue());
        this.foto = entity.getFoto().getValue();
        this.nomeCompleto = entity.getNomeCompleto().getValue();
        this.sexo = entity.getSexo().getValue();
        
        for (JAXBElement<Telefone> telefone : entity.getListaTelefone().getValue().getTelefone()) {
            this.getListaTelefone().add(new TelefoneBean(telefone.getValue()));
        }
        
    }
    
    public Cidadao getEntity() {
        Cidadao entity = factory.createCidadao();
        entity.setCarteiraIdentidade(factory.createCidadaoCarteiraIdentidade(getCarteiraIdentidade().getEntity()));
        entity.setDataNascimento(factory.createCidadaoDataNascimento(getDataNascimento()));
        entity.setDocumentoCPF(factory.createCidadaoDocumentoCPF(getDocumentoCPF()));
        entity.setEndereco(factory.createCidadaoEndereco(getEndereco().getEntity()));
        entity.setFoto(factory.createCidadaoFoto(getFoto()));
        entity.setNomeCompleto(factory.createCidadaoNomeCompleto(getNomeCompleto()));
        entity.setSexo(factory.createCidadaoSexo(getSexo()));
        entity.setListaTelefone(factory.createCidadaoListaTelefone(telefoneToEntity()));
        
        return entity;
    }
    
    public ListaTelefone telefoneToEntity() {
        
        ListaTelefone result = factory.createListaTelefone();
        
        for (TelefoneBean bean : getListaTelefone()) {
            result.getTelefone().add(factory.createListaTelefoneTelefone(bean.getEntity()));
        }
        
        return result;
    }


    public void setDocumentoCPF(String documentoCPF) {
        this.documentoCPF = documentoCPF;
    }

    public String getDocumentoCPF() {
        return documentoCPF;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setCarteiraIdentidade(CarteiraIdentidadeBean carteiraIdentidade) {
        this.carteiraIdentidade = carteiraIdentidade;
    }

    public CarteiraIdentidadeBean getCarteiraIdentidade() {
        return carteiraIdentidade;
    }

    public void setEndereco(EnderecoBean endereco) {
        this.endereco = endereco;
    }

    public EnderecoBean getEndereco() {
        return endereco;
    }

    public void setDataNascimento(XMLGregorianCalendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public XMLGregorianCalendar getDataNascimento() {
        return dataNascimento;
    }

    public void setListaTelefone(List<TelefoneBean> listaTelefone) {
        this.listaTelefone = listaTelefone;
    }

    public List<TelefoneBean> getListaTelefone() {
        if (listaTelefone == null) {
            setListaTelefone(new ArrayList<TelefoneBean>());
        }
        return listaTelefone;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getFoto() {
        return foto;
    }

}
