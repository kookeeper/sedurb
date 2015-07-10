
package br.gov.se.seplag.protocoloatendimento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;choice>
 *           &lt;element name="cdProtocoloPai" minOccurs="0">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;minLength value="22"/>
 *                 &lt;maxLength value="22"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="cpf" type="{http://www.seplag.se.gov.br/EBO/v1}DocumentoCPF" minOccurs="0"/>
 *         &lt;/choice>
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
    "cdProtocoloPai",
    "cpf"
})
@XmlRootElement(name = "ParametroConsultarProtocoloAtendimento")
public class ParametroConsultarProtocoloAtendimento {

    protected String cdProtocoloPai;
    protected String cpf;

    /**
     * Gets the value of the cdProtocoloPai property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdProtocoloPai() {
        return cdProtocoloPai;
    }

    /**
     * Sets the value of the cdProtocoloPai property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdProtocoloPai(String value) {
        this.cdProtocoloPai = value;
    }

    /**
     * Gets the value of the cpf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Sets the value of the cpf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpf(String value) {
        this.cpf = value;
    }

}
