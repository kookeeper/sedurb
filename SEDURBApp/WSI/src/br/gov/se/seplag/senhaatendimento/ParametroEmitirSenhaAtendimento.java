
package br.gov.se.seplag.senhaatendimento;

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
 *         &lt;element name="cdProtocoloServico">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="22"/>
 *               &lt;maxLength value="22"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="atendimentoPreferencial" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mensagemObservacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "cdProtocoloServico",
    "atendimentoPreferencial",
    "mensagemObservacao"
})
@XmlRootElement(name = "ParametroEmitirSenhaAtendimento")
public class ParametroEmitirSenhaAtendimento {

    @XmlElement(required = true)
    protected String cdProtocoloServico;
    @XmlElement(defaultValue = "false")
    protected boolean atendimentoPreferencial;
    protected String mensagemObservacao;

    /**
     * Gets the value of the cdProtocoloServico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdProtocoloServico() {
        return cdProtocoloServico;
    }

    /**
     * Sets the value of the cdProtocoloServico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdProtocoloServico(String value) {
        this.cdProtocoloServico = value;
    }

    /**
     * Gets the value of the atendimentoPreferencial property.
     * 
     */
    public boolean isAtendimentoPreferencial() {
        return atendimentoPreferencial;
    }

    /**
     * Sets the value of the atendimentoPreferencial property.
     * 
     */
    public void setAtendimentoPreferencial(boolean value) {
        this.atendimentoPreferencial = value;
    }

    /**
     * Gets the value of the mensagemObservacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensagemObservacao() {
        return mensagemObservacao;
    }

    /**
     * Sets the value of the mensagemObservacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensagemObservacao(String value) {
        this.mensagemObservacao = value;
    }

}
