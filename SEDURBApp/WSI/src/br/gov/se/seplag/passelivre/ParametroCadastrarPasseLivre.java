
package br.gov.se.seplag.passelivre;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.se.seplag.ebo.v1.CategoriaCarteiraPasseLivre;
import br.gov.se.seplag.ebo.v1.TipoCarteiraPasseLivre;


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
 *         &lt;element name="categoriaPasseLivre" type="{http://www.seplag.se.gov.br/EBO/v1}CategoriaCarteiraPasseLivre"/>
 *         &lt;element name="tipoPasseLivre" type="{http://www.seplag.se.gov.br/EBO/v1}TipoCarteiraPasseLivre"/>
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
    "categoriaPasseLivre",
    "tipoPasseLivre"
})
@XmlRootElement(name = "ParametroCadastrarPasseLivre")
public class ParametroCadastrarPasseLivre {

    @XmlElement(required = true)
    protected String codigoCpf;
    @XmlElement(required = true)
    protected CategoriaCarteiraPasseLivre categoriaPasseLivre;
    @XmlElement(required = true)
    protected TipoCarteiraPasseLivre tipoPasseLivre;

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
     * Gets the value of the categoriaPasseLivre property.
     * 
     * @return
     *     possible object is
     *     {@link CategoriaCarteiraPasseLivre }
     *     
     */
    public CategoriaCarteiraPasseLivre getCategoriaPasseLivre() {
        return categoriaPasseLivre;
    }

    /**
     * Sets the value of the categoriaPasseLivre property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoriaCarteiraPasseLivre }
     *     
     */
    public void setCategoriaPasseLivre(CategoriaCarteiraPasseLivre value) {
        this.categoriaPasseLivre = value;
    }

    /**
     * Gets the value of the tipoPasseLivre property.
     * 
     * @return
     *     possible object is
     *     {@link TipoCarteiraPasseLivre }
     *     
     */
    public TipoCarteiraPasseLivre getTipoPasseLivre() {
        return tipoPasseLivre;
    }

    /**
     * Sets the value of the tipoPasseLivre property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCarteiraPasseLivre }
     *     
     */
    public void setTipoPasseLivre(TipoCarteiraPasseLivre value) {
        this.tipoPasseLivre = value;
    }

}
