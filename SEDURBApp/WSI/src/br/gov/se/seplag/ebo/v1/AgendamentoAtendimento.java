
package br.gov.se.seplag.ebo.v1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AgendamentoAtendimento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgendamentoAtendimento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idAgendamento" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="idAgendamentoAgendaFacil" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="cidadao" type="{http://www.seplag.se.gov.br/EBO/v1}Cidadao" minOccurs="0"/>
 *         &lt;element name="posto" type="{http://www.seplag.se.gov.br/EBO/v1}PostoAtendimento" minOccurs="0"/>
 *         &lt;element name="servico" type="{http://www.seplag.se.gov.br/EBO/v1}Servico" minOccurs="0"/>
 *         &lt;element name="dataAgendamento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataCadastro" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgendamentoAtendimento", propOrder = {
    "idAgendamento",
    "idAgendamentoAgendaFacil",
    "cidadao",
    "posto",
    "servico",
    "dataAgendamento",
    "dataCadastro"
})
public class AgendamentoAtendimento {

    @XmlElement(nillable = true)
    protected BigInteger idAgendamento;
    @XmlElement(nillable = true)
    protected BigInteger idAgendamentoAgendaFacil;
    @XmlElement(nillable = true)
    protected Cidadao cidadao;
    @XmlElement(nillable = true)
    protected PostoAtendimento posto;
    @XmlElement(nillable = true)
    protected Servico servico;
    @XmlElement(nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataAgendamento;
    @XmlElement(nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataCadastro;

    /**
     * Gets the value of the idAgendamento property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdAgendamento() {
        return idAgendamento;
    }

    /**
     * Sets the value of the idAgendamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdAgendamento(BigInteger value) {
        this.idAgendamento = value;
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
     * Gets the value of the cidadao property.
     * 
     * @return
     *     possible object is
     *     {@link Cidadao }
     *     
     */
    public Cidadao getCidadao() {
        return cidadao;
    }

    /**
     * Sets the value of the cidadao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cidadao }
     *     
     */
    public void setCidadao(Cidadao value) {
        this.cidadao = value;
    }

    /**
     * Gets the value of the posto property.
     * 
     * @return
     *     possible object is
     *     {@link PostoAtendimento }
     *     
     */
    public PostoAtendimento getPosto() {
        return posto;
    }

    /**
     * Sets the value of the posto property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostoAtendimento }
     *     
     */
    public void setPosto(PostoAtendimento value) {
        this.posto = value;
    }

    /**
     * Gets the value of the servico property.
     * 
     * @return
     *     possible object is
     *     {@link Servico }
     *     
     */
    public Servico getServico() {
        return servico;
    }

    /**
     * Sets the value of the servico property.
     * 
     * @param value
     *     allowed object is
     *     {@link Servico }
     *     
     */
    public void setServico(Servico value) {
        this.servico = value;
    }

    /**
     * Gets the value of the dataAgendamento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataAgendamento() {
        return dataAgendamento;
    }

    /**
     * Sets the value of the dataAgendamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataAgendamento(XMLGregorianCalendar value) {
        this.dataAgendamento = value;
    }

    /**
     * Gets the value of the dataCadastro property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataCadastro() {
        return dataCadastro;
    }

    /**
     * Sets the value of the dataCadastro property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataCadastro(XMLGregorianCalendar value) {
        this.dataCadastro = value;
    }

}
