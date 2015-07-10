
package br.gov.se.seplag.commons.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				Elemento padrao de definicao das mensagens de erro.
 * 			
 * 
 * <p>Java class for ErroInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ErroInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="descricao" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dataTransacao" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dadosAdicionais" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErroInfo", propOrder = {
    "codigo",
    "descricao",
    "dataTransacao",
    "dadosAdicionais"
})
public class ErroInfo {

    @XmlElementRef(name = "codigo", namespace = "http://www.seplag.se.gov.br/commons/v1", type = JAXBElement.class)
    protected JAXBElement<String> codigo;
    @XmlElementRef(name = "descricao", namespace = "http://www.seplag.se.gov.br/commons/v1", type = JAXBElement.class)
    protected JAXBElement<String> descricao;
    @XmlElementRef(name = "dataTransacao", namespace = "http://www.seplag.se.gov.br/commons/v1", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> dataTransacao;
    @XmlElementRef(name = "dadosAdicionais", namespace = "http://www.seplag.se.gov.br/commons/v1", type = JAXBElement.class)
    protected JAXBElement<Object> dadosAdicionais;

    /**
     * Gets the value of the codigo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigo() {
        return codigo;
    }

    /**
     * Sets the value of the codigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigo(JAXBElement<String> value) {
        this.codigo = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the descricao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescricao() {
        return descricao;
    }

    /**
     * Sets the value of the descricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescricao(JAXBElement<String> value) {
        this.descricao = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the dataTransacao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDataTransacao() {
        return dataTransacao;
    }

    /**
     * Sets the value of the dataTransacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDataTransacao(JAXBElement<XMLGregorianCalendar> value) {
        this.dataTransacao = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the dadosAdicionais property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getDadosAdicionais() {
        return dadosAdicionais;
    }

    /**
     * Sets the value of the dadosAdicionais property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setDadosAdicionais(JAXBElement<Object> value) {
        this.dadosAdicionais = ((JAXBElement<Object> ) value);
    }

}
