
package br.gov.se.seplag.ebo.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RedeSocial complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RedeSocial">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nomePerfil" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="tipoRedeSocial" type="{http://www.seplag.se.gov.br/EBO/v1}TipoRedeSocial" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RedeSocial", propOrder = {
    "nomePerfil",
    "tipoRedeSocial"
})
public class RedeSocial {

    @XmlElementRef(name = "nomePerfil", namespace = "http://www.seplag.se.gov.br/EBO/v1", type = JAXBElement.class)
    protected JAXBElement<String> nomePerfil;
    @XmlElementRef(name = "tipoRedeSocial", namespace = "http://www.seplag.se.gov.br/EBO/v1", type = JAXBElement.class)
    protected JAXBElement<TipoRedeSocial> tipoRedeSocial;

    /**
     * Gets the value of the nomePerfil property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomePerfil() {
        return nomePerfil;
    }

    /**
     * Sets the value of the nomePerfil property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomePerfil(JAXBElement<String> value) {
        this.nomePerfil = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the tipoRedeSocial property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TipoRedeSocial }{@code >}
     *     
     */
    public JAXBElement<TipoRedeSocial> getTipoRedeSocial() {
        return tipoRedeSocial;
    }

    /**
     * Sets the value of the tipoRedeSocial property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TipoRedeSocial }{@code >}
     *     
     */
    public void setTipoRedeSocial(JAXBElement<TipoRedeSocial> value) {
        this.tipoRedeSocial = ((JAXBElement<TipoRedeSocial> ) value);
    }

}
