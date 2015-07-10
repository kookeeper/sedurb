
package br.gov.se.seplag.ebo.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Telefone complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Telefone">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroTelefone" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="tipoTelefone" type="{http://www.seplag.se.gov.br/EBO/v1}TipoTelefone" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Telefone", propOrder = {
    "numeroTelefone",
    "tipoTelefone"
})
public class Telefone {

    @XmlElementRef(name = "numeroTelefone", namespace = "http://www.seplag.se.gov.br/EBO/v1", type = JAXBElement.class)
    protected JAXBElement<String> numeroTelefone;
    @XmlElementRef(name = "tipoTelefone", namespace = "http://www.seplag.se.gov.br/EBO/v1", type = JAXBElement.class)
    protected JAXBElement<TipoTelefone> tipoTelefone;

    /**
     * Gets the value of the numeroTelefone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroTelefone() {
        return numeroTelefone;
    }

    /**
     * Sets the value of the numeroTelefone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroTelefone(JAXBElement<String> value) {
        this.numeroTelefone = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the tipoTelefone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TipoTelefone }{@code >}
     *     
     */
    public JAXBElement<TipoTelefone> getTipoTelefone() {
        return tipoTelefone;
    }

    /**
     * Sets the value of the tipoTelefone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TipoTelefone }{@code >}
     *     
     */
    public void setTipoTelefone(JAXBElement<TipoTelefone> value) {
        this.tipoTelefone = ((JAXBElement<TipoTelefone> ) value);
    }

}
