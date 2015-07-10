
package br.gov.se.seplag.cicsergipe;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.se.seplag.ebo.v1.Cidadao;


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
 *         &lt;element name="cidadao" type="{http://www.seplag.se.gov.br/EBO/v1}Cidadao"/>
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
    "cidadao"
})
@XmlRootElement(name = "ParametroRegistrarCidadao")
public class ParametroRegistrarCidadao {

    @XmlElementRef(name = "cidadao", namespace = "http://www.seplag.se.gov.br/CICSergipe", type = JAXBElement.class)
    protected JAXBElement<Cidadao> cidadao;

    /**
     * Gets the value of the cidadao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Cidadao }{@code >}
     *     
     */
    public JAXBElement<Cidadao> getCidadao() {
        return cidadao;
    }

    /**
     * Sets the value of the cidadao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Cidadao }{@code >}
     *     
     */
    public void setCidadao(JAXBElement<Cidadao> value) {
        this.cidadao = ((JAXBElement<Cidadao> ) value);
    }

}
