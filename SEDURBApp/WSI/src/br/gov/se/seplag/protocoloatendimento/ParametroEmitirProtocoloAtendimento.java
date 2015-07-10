
package br.gov.se.seplag.protocoloatendimento;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nmUnidade" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nmServico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cdProtocoloPai" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="22"/>
 *               &lt;maxLength value="22"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cpf" type="{http://www.seplag.se.gov.br/EBO/v1}DocumentoCPF"/>
 *         &lt;element name="idAgendamentoAgendaFacil" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nmUnidade",
    "nmServico",
    "cdProtocoloPai",
    "cpf",
    "idAgendamentoAgendaFacil"
})
@XmlRootElement(name = "ParametroEmitirProtocoloAtendimento")
public class ParametroEmitirProtocoloAtendimento {

    @XmlElement(required = true)
    protected String nmUnidade;
    protected String nmServico;
    protected String cdProtocoloPai;
    @XmlElement(required = true)
    protected String cpf;
    protected BigInteger idAgendamentoAgendaFacil;

    /**
     * Gets the value of the nmUnidade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmUnidade() {
        return nmUnidade;
    }

    /**
     * Sets the value of the nmUnidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmUnidade(String value) {
        this.nmUnidade = value;
    }

    /**
     * Gets the value of the nmServico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmServico() {
        return nmServico;
    }

    /**
     * Sets the value of the nmServico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmServico(String value) {
        this.nmServico = value;
    }

    /**
     * Gets the value of the cdProtocoloPai property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdProtocoloPai() {
        return cdProtocoloPai;
    }

    /**
     * Sets the value of the cdProtocoloPai property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdProtocoloPai(String value) {
        this.cdProtocoloPai = value;
    }

    /**
     * Gets the value of the cpf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Sets the value of the cpf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpf(String value) {
        this.cpf = value;
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

}
