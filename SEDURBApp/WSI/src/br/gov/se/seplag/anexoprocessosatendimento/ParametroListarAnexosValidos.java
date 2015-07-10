
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
 *         &lt;element name="codigoCPF">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;totalDigits value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="numeroMaximoResultados" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="numeroPrimeiraLinha" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
    "codigoCPF",
    "numeroMaximoResultados",
    "numeroPrimeiraLinha"
})
@XmlRootElement(name = "ParametroListarAnexosValidos")
public class ParametroListarAnexosValidos {

    @XmlElement(required = true)
    protected BigInteger codigoCPF;
    @XmlElement(required = true)
    protected BigInteger numeroMaximoResultados;
    @XmlElement(required = true)
    protected BigInteger numeroPrimeiraLinha;

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

    /**
     * Gets the value of the numeroMaximoResultados property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumeroMaximoResultados() {
        return numeroMaximoResultados;
    }

    /**
     * Sets the value of the numeroMaximoResultados property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumeroMaximoResultados(BigInteger value) {
        this.numeroMaximoResultados = value;
    }

    /**
     * Gets the value of the numeroPrimeiraLinha property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumeroPrimeiraLinha() {
        return numeroPrimeiraLinha;
    }

    /**
     * Sets the value of the numeroPrimeiraLinha property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumeroPrimeiraLinha(BigInteger value) {
        this.numeroPrimeiraLinha = value;
    }

}
