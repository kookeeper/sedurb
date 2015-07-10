
package br.gov.se.seplag.ebo.v1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SenhaAtendimento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SenhaAtendimento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroSequencial" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="senha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="letras" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="faixa" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="posto" type="{http://www.seplag.se.gov.br/EBO/v1}PostoAtendimento" minOccurs="0"/>
 *         &lt;element name="dataHoraEmissao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SenhaAtendimento", propOrder = {
    "numeroSequencial",
    "senha",
    "letras",
    "faixa",
    "posto",
    "dataHoraEmissao"
})
public class SenhaAtendimento {

    @XmlElement(nillable = true)
    protected BigInteger numeroSequencial;
    @XmlElement(nillable = true)
    protected String senha;
    @XmlElement(nillable = true)
    protected String letras;
    @XmlElement(nillable = true)
    protected BigInteger faixa;
    @XmlElement(nillable = true)
    protected PostoAtendimento posto;
    @XmlElement(nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataHoraEmissao;

    /**
     * Gets the value of the numeroSequencial property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumeroSequencial() {
        return numeroSequencial;
    }

    /**
     * Sets the value of the numeroSequencial property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumeroSequencial(BigInteger value) {
        this.numeroSequencial = value;
    }

    /**
     * Gets the value of the senha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Sets the value of the senha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenha(String value) {
        this.senha = value;
    }

    /**
     * Gets the value of the letras property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLetras() {
        return letras;
    }

    /**
     * Sets the value of the letras property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLetras(String value) {
        this.letras = value;
    }

    /**
     * Gets the value of the faixa property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFaixa() {
        return faixa;
    }

    /**
     * Sets the value of the faixa property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFaixa(BigInteger value) {
        this.faixa = value;
    }

    /**
     * Gets the value of the posto property.
     * 
     * @return
     *     possible object is
     *     {@link PostoAtendimento }
     *     
     */
    public PostoAtendimento getPosto() {
        return posto;
    }

    /**
     * Sets the value of the posto property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostoAtendimento }
     *     
     */
    public void setPosto(PostoAtendimento value) {
        this.posto = value;
    }

    /**
     * Gets the value of the dataHoraEmissao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataHoraEmissao() {
        return dataHoraEmissao;
    }

    /**
     * Sets the value of the dataHoraEmissao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataHoraEmissao(XMLGregorianCalendar value) {
        this.dataHoraEmissao = value;
    }

}
