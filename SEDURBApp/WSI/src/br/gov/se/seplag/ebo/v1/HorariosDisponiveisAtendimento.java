
package br.gov.se.seplag.ebo.v1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for HorariosDisponiveisAtendimento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HorariosDisponiveisAtendimento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataHoraAgendamento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="qtdeVagasDisponiveis" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HorariosDisponiveisAtendimento", propOrder = {
    "dataHoraAgendamento",
    "qtdeVagasDisponiveis"
})
public class HorariosDisponiveisAtendimento {

    @XmlElement(nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataHoraAgendamento;
    @XmlElement(nillable = true)
    protected BigInteger qtdeVagasDisponiveis;

    /**
     * Gets the value of the dataHoraAgendamento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataHoraAgendamento() {
        return dataHoraAgendamento;
    }

    /**
     * Sets the value of the dataHoraAgendamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataHoraAgendamento(XMLGregorianCalendar value) {
        this.dataHoraAgendamento = value;
    }

    /**
     * Gets the value of the qtdeVagasDisponiveis property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQtdeVagasDisponiveis() {
        return qtdeVagasDisponiveis;
    }

    /**
     * Sets the value of the qtdeVagasDisponiveis property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQtdeVagasDisponiveis(BigInteger value) {
        this.qtdeVagasDisponiveis = value;
    }

}
