
package br.gov.se.seplag.protocoloatendimento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.se.seplag.ebo.v1.Protocolo;


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
 *         &lt;element name="protocolo" type="{http://www.seplag.se.gov.br/EBO/v1}Protocolo" minOccurs="0"/>
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
    "protocolo"
})
@XmlRootElement(name = "ResultadoObterProtocoloAtendimento")
public class ResultadoObterProtocoloAtendimento {

    protected Protocolo protocolo;

    /**
     * Gets the value of the protocolo property.
     * 
     * @return
     *     possible object is
     *     {@link Protocolo }
     *     
     */
    public Protocolo getProtocolo() {
        return protocolo;
    }

    /**
     * Sets the value of the protocolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Protocolo }
     *     
     */
    public void setProtocolo(Protocolo value) {
        this.protocolo = value;
    }

}
