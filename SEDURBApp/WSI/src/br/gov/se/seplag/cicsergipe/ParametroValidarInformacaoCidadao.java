
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
 *         &lt;element name="documentoCPF" type="{http://www.seplag.se.gov.br/EBO/v1}DocumentoCPF"/>
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
    "documentoCPF"
})
@XmlRootElement(name = "ParametroValidarInformacaoCidadao")
public class ParametroValidarInformacaoCidadao {

    @XmlElementRef(name = "documentoCPF", namespace = "http://www.seplag.se.gov.br/CICSergipe", type = JAXBElement.class)
    protected JAXBElement<String> documentoCPF;

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

}
