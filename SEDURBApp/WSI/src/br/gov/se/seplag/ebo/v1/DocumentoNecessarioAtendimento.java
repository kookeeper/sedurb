
package br.gov.se.seplag.ebo.v1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DocumentoNecessarioAtendimento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentoNecessarioAtendimento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoDocumento" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="38"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nomeDocumento" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="400"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="indicadorObrigatorio" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="objetoDocumento" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="urlDocumento" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="dataEmissao" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="dataValidade" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="diasExpiracao" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;totalDigits value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="mesesExpiracao" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;totalDigits value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="anosExpiracao" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;totalDigits value="10"/>
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
@XmlType(name = "DocumentoNecessarioAtendimento", propOrder = {
    "codigoDocumento",
    "nomeDocumento",
    "indicadorObrigatorio",
    "objetoDocumento",
    "urlDocumento",
    "dataEmissao",
    "dataValidade",
    "diasExpiracao",
    "mesesExpiracao",
    "anosExpiracao"
})
public class DocumentoNecessarioAtendimento {

    @XmlElement(nillable = true)
    protected String codigoDocumento;
    @XmlElement(nillable = true)
    protected String nomeDocumento;
    @XmlElement(nillable = true)
    protected Boolean indicadorObrigatorio;
    @XmlElement(nillable = true)
    protected byte[] objetoDocumento;
    @XmlElement(nillable = true)
    @XmlSchemaType(name = "anyURI")
    protected String urlDocumento;
    @XmlElement(nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataEmissao;
    @XmlElement(nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataValidade;
    @XmlElement(nillable = true)
    protected BigInteger diasExpiracao;
    @XmlElement(nillable = true)
    protected BigInteger mesesExpiracao;
    @XmlElement(nillable = true)
    protected BigInteger anosExpiracao;

    /**
     * Gets the value of the codigoDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoDocumento() {
        return codigoDocumento;
    }

    /**
     * Sets the value of the codigoDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoDocumento(String value) {
        this.codigoDocumento = value;
    }

    /**
     * Gets the value of the nomeDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeDocumento() {
        return nomeDocumento;
    }

    /**
     * Sets the value of the nomeDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeDocumento(String value) {
        this.nomeDocumento = value;
    }

    /**
     * Gets the value of the indicadorObrigatorio property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIndicadorObrigatorio() {
        return indicadorObrigatorio;
    }

    /**
     * Sets the value of the indicadorObrigatorio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndicadorObrigatorio(Boolean value) {
        this.indicadorObrigatorio = value;
    }

    /**
     * Gets the value of the objetoDocumento property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getObjetoDocumento() {
        return objetoDocumento;
    }

    /**
     * Sets the value of the objetoDocumento property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setObjetoDocumento(byte[] value) {
        this.objetoDocumento = ((byte[]) value);
    }

    /**
     * Gets the value of the urlDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlDocumento() {
        return urlDocumento;
    }

    /**
     * Sets the value of the urlDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlDocumento(String value) {
        this.urlDocumento = value;
    }

    /**
     * Gets the value of the dataEmissao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataEmissao() {
        return dataEmissao;
    }

    /**
     * Sets the value of the dataEmissao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataEmissao(XMLGregorianCalendar value) {
        this.dataEmissao = value;
    }

    /**
     * Gets the value of the dataValidade property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataValidade() {
        return dataValidade;
    }

    /**
     * Sets the value of the dataValidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataValidade(XMLGregorianCalendar value) {
        this.dataValidade = value;
    }

    /**
     * Gets the value of the diasExpiracao property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDiasExpiracao() {
        return diasExpiracao;
    }

    /**
     * Sets the value of the diasExpiracao property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDiasExpiracao(BigInteger value) {
        this.diasExpiracao = value;
    }

    /**
     * Gets the value of the mesesExpiracao property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMesesExpiracao() {
        return mesesExpiracao;
    }

    /**
     * Sets the value of the mesesExpiracao property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMesesExpiracao(BigInteger value) {
        this.mesesExpiracao = value;
    }

    /**
     * Gets the value of the anosExpiracao property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAnosExpiracao() {
        return anosExpiracao;
    }

    /**
     * Sets the value of the anosExpiracao property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAnosExpiracao(BigInteger value) {
        this.anosExpiracao = value;
    }

}
