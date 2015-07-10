
package br.gov.se.seplag.ebo.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListaCarteiraPasseLivre complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListaCarteiraPasseLivre">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="carteiraPasseLivre" type="{http://www.seplag.se.gov.br/EBO/v1}CarteiraPasseLivre"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListaCarteiraPasseLivre", propOrder = {
    "carteiraPasseLivre"
})
public class ListaCarteiraPasseLivre {

    @XmlElement(required = true)
    protected CarteiraPasseLivre carteiraPasseLivre;

    /**
     * Gets the value of the carteiraPasseLivre property.
     * 
     * @return
     *     possible object is
     *     {@link CarteiraPasseLivre }
     *     
     */
    public CarteiraPasseLivre getCarteiraPasseLivre() {
        return carteiraPasseLivre;
    }

    /**
     * Sets the value of the carteiraPasseLivre property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarteiraPasseLivre }
     *     
     */
    public void setCarteiraPasseLivre(CarteiraPasseLivre value) {
        this.carteiraPasseLivre = value;
    }

}
