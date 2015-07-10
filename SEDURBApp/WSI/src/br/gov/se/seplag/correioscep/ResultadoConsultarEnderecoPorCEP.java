
package br.gov.se.seplag.correioscep;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.se.seplag.ebo.v1.Endereco;
import br.gov.se.seplag.ebo.v1.ListaCampoEndereco;
import br.gov.se.seplag.ebo.v1.TipoCEP;


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
 *         &lt;element name="endereco" type="{http://www.seplag.se.gov.br/EBO/v1}Endereco"/>
 *         &lt;element name="tipoEndereco" type="{http://www.seplag.se.gov.br/EBO/v1}TipoCEP"/>
 *         &lt;element name="camposSomenteLeitura" type="{http://www.seplag.se.gov.br/EBO/v1}ListaCampoEndereco"/>
 *         &lt;element name="camposObrigatorios" type="{http://www.seplag.se.gov.br/EBO/v1}ListaCampoEndereco"/>
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
    "endereco",
    "tipoEndereco",
    "camposSomenteLeitura",
    "camposObrigatorios"
})
@XmlRootElement(name = "ResultadoConsultarEnderecoPorCEP")
public class ResultadoConsultarEnderecoPorCEP {

    @XmlElement(required = true)
    protected Endereco endereco;
    @XmlElement(required = true)
    protected TipoCEP tipoEndereco;
    @XmlElement(required = true)
    protected ListaCampoEndereco camposSomenteLeitura;
    @XmlElement(required = true)
    protected ListaCampoEndereco camposObrigatorios;

    /**
     * Gets the value of the endereco property.
     * 
     * @return
     *     possible object is
     *     {@link Endereco }
     *     
     */
    public Endereco getEndereco() {
        return endereco;
    }

    /**
     * Sets the value of the endereco property.
     * 
     * @param value
     *     allowed object is
     *     {@link Endereco }
     *     
     */
    public void setEndereco(Endereco value) {
        this.endereco = value;
    }

    /**
     * Gets the value of the tipoEndereco property.
     * 
     * @return
     *     possible object is
     *     {@link TipoCEP }
     *     
     */
    public TipoCEP getTipoEndereco() {
        return tipoEndereco;
    }

    /**
     * Sets the value of the tipoEndereco property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCEP }
     *     
     */
    public void setTipoEndereco(TipoCEP value) {
        this.tipoEndereco = value;
    }

    /**
     * Gets the value of the camposSomenteLeitura property.
     * 
     * @return
     *     possible object is
     *     {@link ListaCampoEndereco }
     *     
     */
    public ListaCampoEndereco getCamposSomenteLeitura() {
        return camposSomenteLeitura;
    }

    /**
     * Sets the value of the camposSomenteLeitura property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaCampoEndereco }
     *     
     */
    public void setCamposSomenteLeitura(ListaCampoEndereco value) {
        this.camposSomenteLeitura = value;
    }

    /**
     * Gets the value of the camposObrigatorios property.
     * 
     * @return
     *     possible object is
     *     {@link ListaCampoEndereco }
     *     
     */
    public ListaCampoEndereco getCamposObrigatorios() {
        return camposObrigatorios;
    }

    /**
     * Sets the value of the camposObrigatorios property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaCampoEndereco }
     *     
     */
    public void setCamposObrigatorios(ListaCampoEndereco value) {
        this.camposObrigatorios = value;
    }

}
