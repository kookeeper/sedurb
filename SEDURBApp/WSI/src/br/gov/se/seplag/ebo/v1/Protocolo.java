
package br.gov.se.seplag.ebo.v1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Protocolo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Protocolo">
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
 *         &lt;element name="codigoProtocoloPai" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="22"/>
 *               &lt;pattern value="([0-9])*"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="documentoCPF" type="{http://www.seplag.se.gov.br/EBO/v1}DocumentoCPF" minOccurs="0"/>
 *         &lt;element name="numeroSequencia" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="idAgendamentoAgendaFacil" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="listaStatusProtocolo" type="{http://www.seplag.se.gov.br/EBO/v1}ListaStatusProtocolo" minOccurs="0"/>
 *         &lt;element name="listaSubProtocolos" type="{http://www.seplag.se.gov.br/EBO/v1}ListaProtocolo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Protocolo", propOrder = {
    "codigoProtocolo",
    "codigoProtocoloPai",
    "documentoCPF",
    "numeroSequencia",
    "idAgendamentoAgendaFacil",
    "listaStatusProtocolo",
    "listaSubProtocolos"
})
public class Protocolo {

    @XmlElement(nillable = true)
    protected String codigoProtocolo;
    @XmlElement(nillable = true)
    protected String codigoProtocoloPai;
    @XmlElement(nillable = true)
    protected String documentoCPF;
    @XmlElement(nillable = true)
    protected BigInteger numeroSequencia;
    @XmlElement(nillable = true)
    protected BigInteger idAgendamentoAgendaFacil;
    @XmlElement(nillable = true)
    protected ListaStatusProtocolo listaStatusProtocolo;
    @XmlElement(nillable = true)
    protected ListaProtocolo listaSubProtocolos;

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
     * Gets the value of the codigoProtocoloPai property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoProtocoloPai() {
        return codigoProtocoloPai;
    }

    /**
     * Sets the value of the codigoProtocoloPai property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoProtocoloPai(String value) {
        this.codigoProtocoloPai = value;
    }

    /**
     * Gets the value of the documentoCPF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentoCPF() {
        return documentoCPF;
    }

    /**
     * Sets the value of the documentoCPF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentoCPF(String value) {
        this.documentoCPF = value;
    }

    /**
     * Gets the value of the numeroSequencia property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumeroSequencia() {
        return numeroSequencia;
    }

    /**
     * Sets the value of the numeroSequencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumeroSequencia(BigInteger value) {
        this.numeroSequencia = value;
    }

    /**
     * Gets the value of the idAgendamentoAgendaFacil property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdAgendamentoAgendaFacil() {
        return idAgendamentoAgendaFacil;
    }

    /**
     * Sets the value of the idAgendamentoAgendaFacil property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdAgendamentoAgendaFacil(BigInteger value) {
        this.idAgendamentoAgendaFacil = value;
    }

    /**
     * Gets the value of the listaStatusProtocolo property.
     * 
     * @return
     *     possible object is
     *     {@link ListaStatusProtocolo }
     *     
     */
    public ListaStatusProtocolo getListaStatusProtocolo() {
        return listaStatusProtocolo;
    }

    /**
     * Sets the value of the listaStatusProtocolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaStatusProtocolo }
     *     
     */
    public void setListaStatusProtocolo(ListaStatusProtocolo value) {
        this.listaStatusProtocolo = value;
    }

    /**
     * Gets the value of the listaSubProtocolos property.
     * 
     * @return
     *     possible object is
     *     {@link ListaProtocolo }
     *     
     */
    public ListaProtocolo getListaSubProtocolos() {
        return listaSubProtocolos;
    }

    /**
     * Sets the value of the listaSubProtocolos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaProtocolo }
     *     
     */
    public void setListaSubProtocolos(ListaProtocolo value) {
        this.listaSubProtocolos = value;
    }

}
