
package br.gov.se.seplag.servicoatendimento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.se.seplag.commons.v1.PaginacaoRequest;
import br.gov.se.seplag.ebo.v1.UnidadeAtendimento;


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
 *         &lt;element name="unidade" type="{http://www.seplag.se.gov.br/EBO/v1}UnidadeAtendimento" minOccurs="0"/>
 *         &lt;element name="paginacao" type="{http://www.seplag.se.gov.br/commons/v1}PaginacaoRequest"/>
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
    "unidade",
    "paginacao"
})
@XmlRootElement(name = "ParametroListarServicosAtendimento")
public class ParametroListarServicosAtendimento {

    protected UnidadeAtendimento unidade;
    @XmlElement(required = true)
    protected PaginacaoRequest paginacao;

    /**
     * Gets the value of the unidade property.
     * 
     * @return
     *     possible object is
     *     {@link UnidadeAtendimento }
     *     
     */
    public UnidadeAtendimento getUnidade() {
        return unidade;
    }

    /**
     * Sets the value of the unidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnidadeAtendimento }
     *     
     */
    public void setUnidade(UnidadeAtendimento value) {
        this.unidade = value;
    }

    /**
     * Gets the value of the paginacao property.
     * 
     * @return
     *     possible object is
     *     {@link PaginacaoRequest }
     *     
     */
    public PaginacaoRequest getPaginacao() {
        return paginacao;
    }

    /**
     * Sets the value of the paginacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginacaoRequest }
     *     
     */
    public void setPaginacao(PaginacaoRequest value) {
        this.paginacao = value;
    }

}
