
package br.gov.se.seplag.commons.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MetaInfoRegistro complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MetaInfoRegistro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataHoraInclusao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="usuarioInclusao" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="80"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dataHoraAlteracao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="usuarioAlteracao" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="80"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetaInfoRegistro", propOrder = {
    "dataHoraInclusao",
    "usuarioInclusao",
    "dataHoraAlteracao",
    "usuarioAlteracao"
})
public class MetaInfoRegistro {

    @XmlElementRef(name = "dataHoraInclusao", namespace = "http://www.seplag.se.gov.br/commons/v1", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> dataHoraInclusao;
    @XmlElementRef(name = "usuarioInclusao", namespace = "http://www.seplag.se.gov.br/commons/v1", type = JAXBElement.class)
    protected JAXBElement<String> usuarioInclusao;
    @XmlElementRef(name = "dataHoraAlteracao", namespace = "http://www.seplag.se.gov.br/commons/v1", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> dataHoraAlteracao;
    @XmlElementRef(name = "usuarioAlteracao", namespace = "http://www.seplag.se.gov.br/commons/v1", type = JAXBElement.class)
    protected JAXBElement<String> usuarioAlteracao;

    /**
     * Gets the value of the dataHoraInclusao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDataHoraInclusao() {
        return dataHoraInclusao;
    }

    /**
     * Sets the value of the dataHoraInclusao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDataHoraInclusao(JAXBElement<XMLGregorianCalendar> value) {
        this.dataHoraInclusao = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the usuarioInclusao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUsuarioInclusao() {
        return usuarioInclusao;
    }

    /**
     * Sets the value of the usuarioInclusao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUsuarioInclusao(JAXBElement<String> value) {
        this.usuarioInclusao = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dataHoraAlteracao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDataHoraAlteracao() {
        return dataHoraAlteracao;
    }

    /**
     * Sets the value of the dataHoraAlteracao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDataHoraAlteracao(JAXBElement<XMLGregorianCalendar> value) {
        this.dataHoraAlteracao = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the usuarioAlteracao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUsuarioAlteracao() {
        return usuarioAlteracao;
    }

    /**
     * Sets the value of the usuarioAlteracao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUsuarioAlteracao(JAXBElement<String> value) {
        this.usuarioAlteracao = ((JAXBElement<String> ) value);
    }

}
