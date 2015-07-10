
package br.gov.se.seplag.commons.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CabecalhoSeplag complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CabecalhoSeplag">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loginUsuario">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="canalAtendimento">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="codigoSessao" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="256"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nomeAplicacao" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *               &lt;enumeration value="Seides"/>
 *               &lt;enumeration value="Detran"/>
 *               &lt;enumeration value="Nat"/>
 *               &lt;enumeration value="Sedurb"/>
 *               &lt;enumeration value="Ssp"/>
 *               &lt;enumeration value="Integracao"/>
 *               &lt;enumeration value="Seguranca"/>
 *               &lt;enumeration value="Infra"/>
 *               &lt;enumeration value="Ses"/>
 *               &lt;enumeration value="Seplag"/>
 *               &lt;enumeration value="Banese"/>
 *               &lt;enumeration value="ReceitaFederal"/>
 *               &lt;enumeration value="Ceac"/>
 *               &lt;enumeration value="IpeSaude"/>
 *               &lt;enumeration value="Ctransp"/>
 *               &lt;enumeration value="Case"/>
 *               &lt;enumeration value="Portal"/>
 *               &lt;enumeration value="Mobile"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="token" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="enderecoIP" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="([01]?\d\d?|2[0-4]\d|25[0-5])\.([01]?\d\d?|2[0-4]\d|25[0-5])\.([01]?\d\d?|2[0-4]\d|25[0-5])\.([01]?\d\d?|2[0-4]\d|25[0-5])"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="codigoFuncionalidade" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dataTransacao" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nomeServico" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="versao" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\d?\d.\d\d?"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabecalhoSeplag", propOrder = {
    "loginUsuario",
    "canalAtendimento",
    "codigoSessao",
    "nomeAplicacao",
    "token",
    "enderecoIP",
    "codigoFuncionalidade",
    "dataTransacao",
    "nomeServico",
    "versao"
})
public class CabecalhoSeplag {

    @XmlElementRef(name = "loginUsuario", namespace = "http://www.seplag.se.gov.br/commons/v1", type = JAXBElement.class)
    protected JAXBElement<String> loginUsuario;
    @XmlElementRef(name = "canalAtendimento", namespace = "http://www.seplag.se.gov.br/commons/v1", type = JAXBElement.class)
    protected JAXBElement<String> canalAtendimento;
    @XmlElementRef(name = "codigoSessao", namespace = "http://www.seplag.se.gov.br/commons/v1", type = JAXBElement.class)
    protected JAXBElement<String> codigoSessao;
    @XmlElementRef(name = "nomeAplicacao", namespace = "http://www.seplag.se.gov.br/commons/v1", type = JAXBElement.class)
    protected JAXBElement<String> nomeAplicacao;
    @XmlElementRef(name = "token", namespace = "http://www.seplag.se.gov.br/commons/v1", type = JAXBElement.class)
    protected JAXBElement<String> token;
    @XmlElementRef(name = "enderecoIP", namespace = "http://www.seplag.se.gov.br/commons/v1", type = JAXBElement.class)
    protected JAXBElement<String> enderecoIP;
    @XmlElementRef(name = "codigoFuncionalidade", namespace = "http://www.seplag.se.gov.br/commons/v1", type = JAXBElement.class)
    protected JAXBElement<String> codigoFuncionalidade;
    @XmlElementRef(name = "dataTransacao", namespace = "http://www.seplag.se.gov.br/commons/v1", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> dataTransacao;
    @XmlElementRef(name = "nomeServico", namespace = "http://www.seplag.se.gov.br/commons/v1", type = JAXBElement.class)
    protected JAXBElement<String> nomeServico;
    @XmlElementRef(name = "versao", namespace = "http://www.seplag.se.gov.br/commons/v1", type = JAXBElement.class)
    protected JAXBElement<String> versao;

    /**
     * Gets the value of the loginUsuario property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLoginUsuario() {
        return loginUsuario;
    }

    /**
     * Sets the value of the loginUsuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLoginUsuario(JAXBElement<String> value) {
        this.loginUsuario = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the canalAtendimento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCanalAtendimento() {
        return canalAtendimento;
    }

    /**
     * Sets the value of the canalAtendimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCanalAtendimento(JAXBElement<String> value) {
        this.canalAtendimento = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the codigoSessao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoSessao() {
        return codigoSessao;
    }

    /**
     * Sets the value of the codigoSessao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoSessao(JAXBElement<String> value) {
        this.codigoSessao = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the nomeAplicacao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeAplicacao() {
        return nomeAplicacao;
    }

    /**
     * Sets the value of the nomeAplicacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeAplicacao(JAXBElement<String> value) {
        this.nomeAplicacao = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setToken(JAXBElement<String> value) {
        this.token = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the enderecoIP property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEnderecoIP() {
        return enderecoIP;
    }

    /**
     * Sets the value of the enderecoIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEnderecoIP(JAXBElement<String> value) {
        this.enderecoIP = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the codigoFuncionalidade property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoFuncionalidade() {
        return codigoFuncionalidade;
    }

    /**
     * Sets the value of the codigoFuncionalidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoFuncionalidade(JAXBElement<String> value) {
        this.codigoFuncionalidade = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dataTransacao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDataTransacao() {
        return dataTransacao;
    }

    /**
     * Sets the value of the dataTransacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDataTransacao(JAXBElement<XMLGregorianCalendar> value) {
        this.dataTransacao = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the nomeServico property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomeServico() {
        return nomeServico;
    }

    /**
     * Sets the value of the nomeServico property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomeServico(JAXBElement<String> value) {
        this.nomeServico = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the versao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVersao() {
        return versao;
    }

    /**
     * Sets the value of the versao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVersao(JAXBElement<String> value) {
        this.versao = ((JAXBElement<String> ) value);
    }

}
