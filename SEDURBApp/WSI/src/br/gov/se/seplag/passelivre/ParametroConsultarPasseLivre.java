
package br.gov.se.seplag.passelivre;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.se.seplag.ebo.v1.CarteiraIdentidade;


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
 *         &lt;element name="codigoCpf" type="{http://www.seplag.se.gov.br/EBO/v1}DocumentoCPF"/>
 *         &lt;element name="codigoRG" type="{http://www.seplag.se.gov.br/EBO/v1}CarteiraIdentidade"/>
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
    "codigoCpf",
    "codigoRG"
})
@XmlRootElement(name = "ParametroConsultarPasseLivre")
public class ParametroConsultarPasseLivre {

    @XmlElement(required = true)
    protected String codigoCpf;
    @XmlElement(required = true)
    protected CarteiraIdentidade codigoRG;

    /**
     * Gets the value of the codigoCpf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoCpf() {
        return codigoCpf;
    }

    /**
     * Sets the value of the codigoCpf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoCpf(String value) {
        this.codigoCpf = value;
    }

    /**
     * Gets the value of the codigoRG property.
     * 
     * @return
     *     possible object is
     *     {@link CarteiraIdentidade }
     *     
     */
    public CarteiraIdentidade getCodigoRG() {
        return codigoRG;
    }

    /**
     * Sets the value of the codigoRG property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarteiraIdentidade }
     *     
     */
    public void setCodigoRG(CarteiraIdentidade value) {
        this.codigoRG = value;
    }

}
