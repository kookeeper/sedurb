
package br.gov.se.seplag.anexoprocessosatendimento;

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
 *         &lt;element name="nomeServico" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigoCPF">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;totalDigits value="11"/>
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
@XmlType(name = "", propOrder = {
    "nomeServico",
    "codigoCPF"
})
@XmlRootElement(name = "ParametroListarPorAtendimento")
public class ParametroListarPorAtendimento {

    @XmlElement(required = true)
    protected String nomeServico;
    @XmlElement(required = true)
    protected BigInteger codigoCPF;

    /**
     * Gets the value of the nomeServico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeServico() {
        return nomeServico;
    }

    /**
     * Sets the value of the nomeServico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeServico(String value) {
        this.nomeServico = value;
    }

    /**
     * Gets the value of the codigoCPF property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCodigoCPF() {
        return codigoCPF;
    }

    /**
     * Sets the value of the codigoCPF property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCodigoCPF(BigInteger value) {
        this.codigoCPF = value;
    }

}
