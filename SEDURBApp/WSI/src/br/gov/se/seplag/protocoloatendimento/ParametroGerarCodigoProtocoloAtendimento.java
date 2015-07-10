
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
 *         &lt;element name="idOrgao" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="idServico" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="senha" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
    "idOrgao",
    "idServico",
    "senha"
})
@XmlRootElement(name = "ParametroGerarCodigoProtocoloAtendimento")
public class ParametroGerarCodigoProtocoloAtendimento {

    @XmlElement(required = true)
    protected BigInteger idOrgao;
    @XmlElement(required = true)
    protected BigInteger idServico;
    @XmlElement(required = true)
    protected BigInteger senha;

    /**
     * Gets the value of the idOrgao property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdOrgao() {
        return idOrgao;
    }

    /**
     * Sets the value of the idOrgao property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdOrgao(BigInteger value) {
        this.idOrgao = value;
    }

    /**
     * Gets the value of the idServico property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdServico() {
        return idServico;
    }

    /**
     * Sets the value of the idServico property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdServico(BigInteger value) {
        this.idServico = value;
    }

    /**
     * Gets the value of the senha property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSenha() {
        return senha;
    }

    /**
     * Sets the value of the senha property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSenha(BigInteger value) {
        this.senha = value;
    }

}
