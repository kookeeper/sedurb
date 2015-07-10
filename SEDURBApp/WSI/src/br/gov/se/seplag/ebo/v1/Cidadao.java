
package br.gov.se.seplag.ebo.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Cidadao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Cidadao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="documentoCPF" type="{http://www.seplag.se.gov.br/EBO/v1}DocumentoCPF" minOccurs="0"/>
 *         &lt;element name="nomeCompleto" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="200"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="carteiraIdentidade" type="{http://www.seplag.se.gov.br/EBO/v1}CarteiraIdentidade" minOccurs="0"/>
 *         &lt;element name="carteiraHabilitacao" type="{http://www.seplag.se.gov.br/EBO/v1}CarteiraHabilitacao" minOccurs="0"/>
 *         &lt;element name="endereco" type="{http://www.seplag.se.gov.br/EBO/v1}Endereco" minOccurs="0"/>
 *         &lt;element name="dataNascimento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cidadeNascimento" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="profissao" type="{http://www.seplag.se.gov.br/EBO/v1}Profissao" minOccurs="0"/>
 *         &lt;element name="tituloEleitoral" type="{http://www.seplag.se.gov.br/EBO/v1}TituloEleitoral" minOccurs="0"/>
 *         &lt;element name="listaTelefone" type="{http://www.seplag.se.gov.br/EBO/v1}ListaTelefone" minOccurs="0"/>
 *         &lt;element name="sexo" type="{http://www.seplag.se.gov.br/EBO/v1}Sexo" minOccurs="0"/>
 *         &lt;element name="escolaridade" type="{http://www.seplag.se.gov.br/EBO/v1}Escolaridade" minOccurs="0"/>
 *         &lt;element name="foto" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.seplag.se.gov.br/EBO/v1}EnderecoEmail" minOccurs="0"/>
 *         &lt;element name="listaRedeSocial" type="{http://www.seplag.se.gov.br/EBO/v1}ListaRedeSocial" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cidadao", propOrder = {
    "documentoCPF",
    "nomeCompleto",
    "carteiraIdentidade",
    "carteiraHabilitacao",
    "endereco",
    "dataNascimento",
    "cidadeNascimento",
    "profissao",
    "tituloEleitoral",
    "listaTelefone",
    "sexo",
    "escolaridade",
    "foto",
    "email",
    "listaRedeSocial"
})
public class Cidadao {

    @XmlElementRef(name = "documentoCPF", namespace = "http://www.seplag.se.gov.br/EBO/v1", type = JAXBElement.class)
    protected JAXBElement<String> documentoCPF;
    @XmlElementRef(name = "nomeCompleto", namespace = "http://www.seplag.se.gov.br/EBO/v1", type = JAXBElement.class)
    protected JAXBElement<String> nomeCompleto;
    @XmlElementRef(name = "carteiraIdentidade", namespace = "http://www.seplag.se.gov.br/EBO/v1", type = JAXBElement.class)
    protected JAXBElement<CarteiraIdentidade> carteiraIdentidade;
    @XmlElementRef(name = "carteiraHabilitacao", namespace = "http://www.seplag.se.gov.br/EBO/v1", type = JAXBElement.class)
    protected JAXBElement<CarteiraHabilitacao> carteiraHabilitacao;
    @XmlElementRef(name = "endereco", namespace = "http://www.seplag.se.gov.br/EBO/v1", type = JAXBElement.class)
    protected JAXBElement<Endereco> endereco;
    @XmlElementRef(name = "dataNascimento", namespace = "http://www.seplag.se.gov.br/EBO/v1", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> dataNascimento;
    @XmlElementRef(name = "cidadeNascimento", namespace = "http://www.seplag.se.gov.br/EBO/v1", type = JAXBElement.class)
    protected JAXBElement<String> cidadeNascimento;
    @XmlElementRef(name = "profissao", namespace = "http://www.seplag.se.gov.br/EBO/v1", type = JAXBElement.class)
    protected JAXBElement<String> profissao;
    @XmlElementRef(name = "tituloEleitoral", namespace = "http://www.seplag.se.gov.br/EBO/v1", type = JAXBElement.class)
    protected JAXBElement<TituloEleitoral> tituloEleitoral;
    @XmlElementRef(name = "listaTelefone", namespace = "http://www.seplag.se.gov.br/EBO/v1", type = JAXBElement.class)
    protected JAXBElement<ListaTelefone> listaTelefone;
    @XmlElementRef(name = "sexo", namespace = "http://www.seplag.se.gov.br/EBO/v1", type = JAXBElement.class)
    protected JAXBElement<Sexo> sexo;
    @XmlElementRef(name = "escolaridade", namespace = "http://www.seplag.se.gov.br/EBO/v1", type = JAXBElement.class)
    protected JAXBElement<Escolaridade> escolaridade;
    @XmlElementRef(name = "foto", namespace = "http://www.seplag.se.gov.br/EBO/v1", type = JAXBElement.class)
    protected JAXBElement<String> foto;
    @XmlElementRef(name = "email", namespace = "http://www.seplag.se.gov.br/EBO/v1", type = JAXBElement.class)
    protected JAXBElement<String> email;
    @XmlElementRef(name = "listaRedeSocial", namespace = "http://www.seplag.se.gov.br/EBO/v1", type = JAXBElement.class)
    protected JAXBElement<ListaRedeSocial> listaRedeSocial;

    /**
     * Gets the value of the documentoCPF property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocumentoCPF() {
        return documentoCPF;
    }

    /**
     * Sets the value of the documentoCPF property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocumentoCPF(JAXBElement<String> value) {
        this.documentoCPF = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomeCompleto property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeCompleto() {
        return nomeCompleto;
    }

    /**
     * Sets the value of the nomeCompleto property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeCompleto(JAXBElement<String> value) {
        this.nomeCompleto = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the carteiraIdentidade property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CarteiraIdentidade }{@code >}
     *     
     */
    public JAXBElement<CarteiraIdentidade> getCarteiraIdentidade() {
        return carteiraIdentidade;
    }

    /**
     * Sets the value of the carteiraIdentidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CarteiraIdentidade }{@code >}
     *     
     */
    public void setCarteiraIdentidade(JAXBElement<CarteiraIdentidade> value) {
        this.carteiraIdentidade = ((JAXBElement<CarteiraIdentidade> ) value);
    }

    /**
     * Gets the value of the carteiraHabilitacao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CarteiraHabilitacao }{@code >}
     *     
     */
    public JAXBElement<CarteiraHabilitacao> getCarteiraHabilitacao() {
        return carteiraHabilitacao;
    }

    /**
     * Sets the value of the carteiraHabilitacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CarteiraHabilitacao }{@code >}
     *     
     */
    public void setCarteiraHabilitacao(JAXBElement<CarteiraHabilitacao> value) {
        this.carteiraHabilitacao = ((JAXBElement<CarteiraHabilitacao> ) value);
    }

    /**
     * Gets the value of the endereco property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Endereco }{@code >}
     *     
     */
    public JAXBElement<Endereco> getEndereco() {
        return endereco;
    }

    /**
     * Sets the value of the endereco property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Endereco }{@code >}
     *     
     */
    public void setEndereco(JAXBElement<Endereco> value) {
        this.endereco = ((JAXBElement<Endereco> ) value);
    }

    /**
     * Gets the value of the dataNascimento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDataNascimento() {
        return dataNascimento;
    }

    /**
     * Sets the value of the dataNascimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDataNascimento(JAXBElement<XMLGregorianCalendar> value) {
        this.dataNascimento = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the cidadeNascimento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCidadeNascimento() {
        return cidadeNascimento;
    }

    /**
     * Sets the value of the cidadeNascimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCidadeNascimento(JAXBElement<String> value) {
        this.cidadeNascimento = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the profissao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProfissao() {
        return profissao;
    }

    /**
     * Sets the value of the profissao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProfissao(JAXBElement<String> value) {
        this.profissao = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the tituloEleitoral property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TituloEleitoral }{@code >}
     *     
     */
    public JAXBElement<TituloEleitoral> getTituloEleitoral() {
        return tituloEleitoral;
    }

    /**
     * Sets the value of the tituloEleitoral property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TituloEleitoral }{@code >}
     *     
     */
    public void setTituloEleitoral(JAXBElement<TituloEleitoral> value) {
        this.tituloEleitoral = ((JAXBElement<TituloEleitoral> ) value);
    }

    /**
     * Gets the value of the listaTelefone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListaTelefone }{@code >}
     *     
     */
    public JAXBElement<ListaTelefone> getListaTelefone() {
        return listaTelefone;
    }

    /**
     * Sets the value of the listaTelefone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListaTelefone }{@code >}
     *     
     */
    public void setListaTelefone(JAXBElement<ListaTelefone> value) {
        this.listaTelefone = ((JAXBElement<ListaTelefone> ) value);
    }

    /**
     * Gets the value of the sexo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Sexo }{@code >}
     *     
     */
    public JAXBElement<Sexo> getSexo() {
        return sexo;
    }

    /**
     * Sets the value of the sexo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Sexo }{@code >}
     *     
     */
    public void setSexo(JAXBElement<Sexo> value) {
        this.sexo = ((JAXBElement<Sexo> ) value);
    }

    /**
     * Gets the value of the escolaridade property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Escolaridade }{@code >}
     *     
     */
    public JAXBElement<Escolaridade> getEscolaridade() {
        return escolaridade;
    }

    /**
     * Sets the value of the escolaridade property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Escolaridade }{@code >}
     *     
     */
    public void setEscolaridade(JAXBElement<Escolaridade> value) {
        this.escolaridade = ((JAXBElement<Escolaridade> ) value);
    }

    /**
     * Gets the value of the foto property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFoto() {
        return foto;
    }

    /**
     * Sets the value of the foto property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFoto(JAXBElement<String> value) {
        this.foto = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmail(JAXBElement<String> value) {
        this.email = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the listaRedeSocial property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ListaRedeSocial }{@code >}
     *     
     */
    public JAXBElement<ListaRedeSocial> getListaRedeSocial() {
        return listaRedeSocial;
    }

    /**
     * Sets the value of the listaRedeSocial property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ListaRedeSocial }{@code >}
     *     
     */
    public void setListaRedeSocial(JAXBElement<ListaRedeSocial> value) {
        this.listaRedeSocial = ((JAXBElement<ListaRedeSocial> ) value);
    }

}
