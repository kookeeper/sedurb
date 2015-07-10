
package br.gov.se.seplag.protocoloatendimento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoProtocolo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="senhaAtendimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoProtocoloPai" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "codigoProtocolo",
    "senhaAtendimento",
    "codigoProtocoloPai"
})
@XmlRootElement(name = "ResultadoEmitirProtocoloAtendimento")
public class ResultadoEmitirProtocoloAtendimento {

    @XmlElement(required = true)
    protected String codigoProtocolo;
    protected String senhaAtendimento;
    @XmlElement(required = true)
    protected String codigoProtocoloPai;

    /**
     * Gets the value of the codigoProtocolo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoProtocolo() {
        return codigoProtocolo;
    }

    /**
     * Sets the value of the codigoProtocolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoProtocolo(String value) {
        this.codigoProtocolo = value;
    }

    /**
     * Gets the value of the senhaAtendimento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenhaAtendimento() {
        return senhaAtendimento;
    }

    /**
     * Sets the value of the senhaAtendimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenhaAtendimento(String value) {
        this.senhaAtendimento = value;
    }

    /**
     * Gets the value of the codigoProtocoloPai property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoProtocoloPai() {
        return codigoProtocoloPai;
    }

    /**
     * Sets the value of the codigoProtocoloPai property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoProtocoloPai(String value) {
        this.codigoProtocoloPai = value;
    }

}
