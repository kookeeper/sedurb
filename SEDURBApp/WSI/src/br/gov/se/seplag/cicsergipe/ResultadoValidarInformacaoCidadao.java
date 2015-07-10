
package br.gov.se.seplag.cicsergipe;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.se.seplag.commons.v1.MetaInfoRegistro;


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
 *         &lt;element name="metaInfoCidadao" type="{http://www.seplag.se.gov.br/commons/v1}MetaInfoRegistro"/>
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
    "metaInfoCidadao"
})
@XmlRootElement(name = "ResultadoValidarInformacaoCidadao")
public class ResultadoValidarInformacaoCidadao {

    @XmlElementRef(name = "metaInfoCidadao", namespace = "http://www.seplag.se.gov.br/CICSergipe", type = JAXBElement.class)
    protected JAXBElement<MetaInfoRegistro> metaInfoCidadao;

    /**
     * Gets the value of the metaInfoCidadao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MetaInfoRegistro }{@code >}
     *     
     */
    public JAXBElement<MetaInfoRegistro> getMetaInfoCidadao() {
        return metaInfoCidadao;
    }

    /**
     * Sets the value of the metaInfoCidadao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MetaInfoRegistro }{@code >}
     *     
     */
    public void setMetaInfoCidadao(JAXBElement<MetaInfoRegistro> value) {
        this.metaInfoCidadao = ((JAXBElement<MetaInfoRegistro> ) value);
    }

}
