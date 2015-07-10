
package br.gov.se.seplag.protocoloatendimento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.se.seplag.ebo.v1.EstadoProtocolo;


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
 *         &lt;element name="cdProtocolo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="22"/>
 *               &lt;maxLength value="22"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="status" type="{http://www.seplag.se.gov.br/EBO/v1}EstadoProtocolo"/>
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
    "cdProtocolo",
    "status"
})
@XmlRootElement(name = "ParametroAtualizarProtocoloAtendimento")
public class ParametroAtualizarProtocoloAtendimento {

    @XmlElement(required = true)
    protected String cdProtocolo;
    @XmlElement(required = true)
    protected EstadoProtocolo status;

    /**
     * Gets the value of the cdProtocolo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdProtocolo() {
        return cdProtocolo;
    }

    /**
     * Sets the value of the cdProtocolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdProtocolo(String value) {
        this.cdProtocolo = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link EstadoProtocolo }
     *     
     */
    public EstadoProtocolo getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstadoProtocolo }
     *     
     */
    public void setStatus(EstadoProtocolo value) {
        this.status = value;
    }

}
