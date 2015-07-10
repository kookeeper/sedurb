
package br.gov.se.seplag.ebo.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CarteiraIdentidade complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarteiraIdentidade">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroIdentidade" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="80"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="numeroIdentidadeComplemento" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="80"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dataEmissao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="siglaUnidadeFederativa" type="{http://www.seplag.se.gov.br/EBO/v1}UnidadeFederativa" minOccurs="0"/>
 *         &lt;element name="orgaoEmissor" minOccurs="0">
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
@XmlType(name = "CarteiraIdentidade", propOrder = {
    "numeroIdentidade",
    "numeroIdentidadeComplemento",
    "dataEmissao",
    "siglaUnidadeFederativa",
    "orgaoEmissor"
})
public class CarteiraIdentidade {

    @XmlElementRef(name = "numeroIdentidade", namespace = "http://www.seplag.se.gov.br/EBO/v1", type = JAXBElement.class)
    protected JAXBElement<String> numeroIdentidade;
    @XmlElementRef(name = "numeroIdentidadeComplemento", namespace = "http://www.seplag.se.gov.br/EBO/v1", type = JAXBElement.class)
    protected JAXBElement<String> numeroIdentidadeComplemento;
    @XmlElementRef(name = "dataEmissao", namespace = "http://www.seplag.se.gov.br/EBO/v1", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> dataEmissao;
    @XmlElementRef(name = "siglaUnidadeFederativa", namespace = "http://www.seplag.se.gov.br/EBO/v1", type = JAXBElement.class)
    protected JAXBElement<UnidadeFederativa> siglaUnidadeFederativa;
    @XmlElementRef(name = "orgaoEmissor", namespace = "http://www.seplag.se.gov.br/EBO/v1", type = JAXBElement.class)
    protected JAXBElement<String> orgaoEmissor;

    /**
     * Gets the value of the numeroIdentidade property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroIdentidade() {
        return numeroIdentidade;
    }

    /**
     * Sets the value of the numeroIdentidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroIdentidade(JAXBElement<String> value) {
        this.numeroIdentidade = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the numeroIdentidadeComplemento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroIdentidadeComplemento() {
        return numeroIdentidadeComplemento;
    }

    /**
     * Sets the value of the numeroIdentidadeComplemento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroIdentidadeComplemento(JAXBElement<String> value) {
        this.numeroIdentidadeComplemento = ((JAXBElement<String> ) value);
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

    /**
     * Gets the value of the siglaUnidadeFederativa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UnidadeFederativa }{@code >}
     *     
     */
    public JAXBElement<UnidadeFederativa> getSiglaUnidadeFederativa() {
        return siglaUnidadeFederativa;
    }

    /**
     * Sets the value of the siglaUnidadeFederativa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UnidadeFederativa }{@code >}
     *     
     */
    public void setSiglaUnidadeFederativa(JAXBElement<UnidadeFederativa> value) {
        this.siglaUnidadeFederativa = ((JAXBElement<UnidadeFederativa> ) value);
    }

    /**
     * Gets the value of the orgaoEmissor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrgaoEmissor() {
        return orgaoEmissor;
    }

    /**
     * Sets the value of the orgaoEmissor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrgaoEmissor(JAXBElement<String> value) {
        this.orgaoEmissor = ((JAXBElement<String> ) value);
    }

}
