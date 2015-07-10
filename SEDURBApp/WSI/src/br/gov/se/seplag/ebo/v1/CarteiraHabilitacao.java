
package br.gov.se.seplag.ebo.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CarteiraHabilitacao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarteiraHabilitacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="categoriaHabilitacao" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="numeroRegistro" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dataValidade" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataEmissao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarteiraHabilitacao", propOrder = {
    "categoriaHabilitacao",
    "numeroRegistro",
    "dataValidade",
    "dataEmissao"
})
public class CarteiraHabilitacao {

    @XmlElementRef(name = "categoriaHabilitacao", namespace = "http://www.seplag.se.gov.br/EBO/v1", type = JAXBElement.class)
    protected JAXBElement<String> categoriaHabilitacao;
    @XmlElementRef(name = "numeroRegistro", namespace = "http://www.seplag.se.gov.br/EBO/v1", type = JAXBElement.class)
    protected JAXBElement<String> numeroRegistro;
    @XmlElementRef(name = "dataValidade", namespace = "http://www.seplag.se.gov.br/EBO/v1", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> dataValidade;
    @XmlElementRef(name = "dataEmissao", namespace = "http://www.seplag.se.gov.br/EBO/v1", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> dataEmissao;

    /**
     * Gets the value of the categoriaHabilitacao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCategoriaHabilitacao() {
        return categoriaHabilitacao;
    }

    /**
     * Sets the value of the categoriaHabilitacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCategoriaHabilitacao(JAXBElement<String> value) {
        this.categoriaHabilitacao = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the numeroRegistro property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroRegistro() {
        return numeroRegistro;
    }

    /**
     * Sets the value of the numeroRegistro property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroRegistro(JAXBElement<String> value) {
        this.numeroRegistro = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dataValidade property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDataValidade() {
        return dataValidade;
    }

    /**
     * Sets the value of the dataValidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDataValidade(JAXBElement<XMLGregorianCalendar> value) {
        this.dataValidade = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the dataEmissao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDataEmissao() {
        return dataEmissao;
    }

    /**
     * Sets the value of the dataEmissao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDataEmissao(JAXBElement<XMLGregorianCalendar> value) {
        this.dataEmissao = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

}
