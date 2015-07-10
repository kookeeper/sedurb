
package br.gov.se.seplag.cicsergipe;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.se.seplag.commons.v1.MetaInfoRegistro;
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
    "cidadao",
    "metaInfoCidadao"
})
@XmlRootElement(name = "ResultadoObterCidadao")
public class ResultadoObterCidadao {

    @XmlElementRef(name = "cidadao", namespace = "http://www.seplag.se.gov.br/CICSergipe", type = JAXBElement.class)
    protected JAXBElement<Cidadao> cidadao;
    @XmlElementRef(name = "metaInfoCidadao", namespace = "http://www.seplag.se.gov.br/CICSergipe", type = JAXBElement.class)
    protected JAXBElement<MetaInfoRegistro> metaInfoCidadao;

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
