
package br.gov.se.seplag.cicsergipe;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
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
    "codigoProtocolo"
})
@XmlRootElement(name = "ResultadoRegistrarCidadao")
public class ResultadoRegistrarCidadao {

    @XmlElementRef(name = "codigoProtocolo", namespace = "http://www.seplag.se.gov.br/CICSergipe", type = JAXBElement.class)
    protected JAXBElement<String> codigoProtocolo;

    /**
     * Gets the value of the codigoProtocolo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoProtocolo() {
        return codigoProtocolo;
    }

    /**
     * Sets the value of the codigoProtocolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoProtocolo(JAXBElement<String> value) {
        this.codigoProtocolo = ((JAXBElement<String> ) value);
    }

}
