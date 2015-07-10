
package br.gov.se.seplag.unidadeatendimento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.se.seplag.commons.v1.PaginacaoResponse;
import br.gov.se.seplag.ebo.v1.ListaUnidadeAtendimento;


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
 *         &lt;element name="paginacaoResponse" type="{http://www.seplag.se.gov.br/commons/v1}PaginacaoResponse"/>
 *         &lt;element name="listaUnidadeAtendimento" type="{http://www.seplag.se.gov.br/EBO/v1}ListaUnidadeAtendimento"/>
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
    "paginacaoResponse",
    "listaUnidadeAtendimento"
})
@XmlRootElement(name = "ResultadoPesquisarUnidadeAtendimento")
public class ResultadoPesquisarUnidadeAtendimento {

    @XmlElement(required = true)
    protected PaginacaoResponse paginacaoResponse;
    @XmlElement(required = true)
    protected ListaUnidadeAtendimento listaUnidadeAtendimento;

    /**
     * Gets the value of the paginacaoResponse property.
     * 
     * @return
     *     possible object is
     *     {@link PaginacaoResponse }
     *     
     */
    public PaginacaoResponse getPaginacaoResponse() {
        return paginacaoResponse;
    }

    /**
     * Sets the value of the paginacaoResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginacaoResponse }
     *     
     */
    public void setPaginacaoResponse(PaginacaoResponse value) {
        this.paginacaoResponse = value;
    }

    /**
     * Gets the value of the listaUnidadeAtendimento property.
     * 
     * @return
     *     possible object is
     *     {@link ListaUnidadeAtendimento }
     *     
     */
    public ListaUnidadeAtendimento getListaUnidadeAtendimento() {
        return listaUnidadeAtendimento;
    }

    /**
     * Sets the value of the listaUnidadeAtendimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaUnidadeAtendimento }
     *     
     */
    public void setListaUnidadeAtendimento(ListaUnidadeAtendimento value) {
        this.listaUnidadeAtendimento = value;
    }

}
