
package br.gov.se.seplag.ebo.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for StatusProtocolo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusProtocolo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoProtocolo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="22"/>
 *               &lt;pattern value="([0-9])*"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="estadoProcoloco" type="{http://www.seplag.se.gov.br/EBO/v1}EstadoProtocolo" minOccurs="0"/>
 *         &lt;element name="dataStatus" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusProtocolo", propOrder = {
    "codigoProtocolo",
    "estadoProcoloco",
    "dataStatus"
})
public class StatusProtocolo {

    @XmlElement(nillable = true)
    protected String codigoProtocolo;
    @XmlElement(nillable = true)
    protected EstadoProtocolo estadoProcoloco;
    @XmlElement(nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataStatus;

    /**
     * Gets the value of the codigoProtocolo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoProtocolo() {
        return codigoProtocolo;
    }

    /**
     * Sets the value of the codigoProtocolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoProtocolo(String value) {
        this.codigoProtocolo = value;
    }

    /**
     * Gets the value of the estadoProcoloco property.
     * 
     * @return
     *     possible object is
     *     {@link EstadoProtocolo }
     *     
     */
    public EstadoProtocolo getEstadoProcoloco() {
        return estadoProcoloco;
    }

    /**
     * Sets the value of the estadoProcoloco property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstadoProtocolo }
     *     
     */
    public void setEstadoProcoloco(EstadoProtocolo value) {
        this.estadoProcoloco = value;
    }

    /**
     * Gets the value of the dataStatus property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataStatus() {
        return dataStatus;
    }

    /**
     * Sets the value of the dataStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataStatus(XMLGregorianCalendar value) {
        this.dataStatus = value;
    }

}
