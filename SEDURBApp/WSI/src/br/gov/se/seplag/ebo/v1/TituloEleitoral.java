
package br.gov.se.seplag.ebo.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TituloEleitoral complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TituloEleitoral">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroTitulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zonaEleitoral" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="secaoEleitoral" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TituloEleitoral", propOrder = {
    "numeroTitulo",
    "zonaEleitoral",
    "secaoEleitoral"
})
public class TituloEleitoral {

    @XmlElementRef(name = "numeroTitulo", namespace = "http://www.seplag.se.gov.br/EBO/v1", type = JAXBElement.class)
    protected JAXBElement<String> numeroTitulo;
    @XmlElementRef(name = "zonaEleitoral", namespace = "http://www.seplag.se.gov.br/EBO/v1", type = JAXBElement.class)
    protected JAXBElement<String> zonaEleitoral;
    @XmlElementRef(name = "secaoEleitoral", namespace = "http://www.seplag.se.gov.br/EBO/v1", type = JAXBElement.class)
    protected JAXBElement<String> secaoEleitoral;

    /**
     * Gets the value of the numeroTitulo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroTitulo() {
        return numeroTitulo;
    }

    /**
     * Sets the value of the numeroTitulo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroTitulo(JAXBElement<String> value) {
        this.numeroTitulo = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the zonaEleitoral property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getZonaEleitoral() {
        return zonaEleitoral;
    }

    /**
     * Sets the value of the zonaEleitoral property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setZonaEleitoral(JAXBElement<String> value) {
        this.zonaEleitoral = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the secaoEleitoral property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSecaoEleitoral() {
        return secaoEleitoral;
    }

    /**
     * Sets the value of the secaoEleitoral property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSecaoEleitoral(JAXBElement<String> value) {
        this.secaoEleitoral = ((JAXBElement<String> ) value);
    }

}
