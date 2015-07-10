
package br.gov.se.seplag.unidadeatendimento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.se.seplag.commons.v1.PaginacaoRequest;


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
 *         &lt;element name="paginacaoRequest" type="{http://www.seplag.se.gov.br/commons/v1}PaginacaoRequest"/>
 *         &lt;element name="nomeServico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "paginacaoRequest",
    "nomeServico"
})
@XmlRootElement(name = "ParametroPesquisarUnidadeAtendimento")
public class ParametroPesquisarUnidadeAtendimento {

    @XmlElement(required = true)
    protected PaginacaoRequest paginacaoRequest;
    protected String nomeServico;

    /**
     * Gets the value of the paginacaoRequest property.
     * 
     * @return
     *     possible object is
     *     {@link PaginacaoRequest }
     *     
     */
    public PaginacaoRequest getPaginacaoRequest() {
        return paginacaoRequest;
    }

    /**
     * Sets the value of the paginacaoRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginacaoRequest }
     *     
     */
    public void setPaginacaoRequest(PaginacaoRequest value) {
        this.paginacaoRequest = value;
    }

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

}
