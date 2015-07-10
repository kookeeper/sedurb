
package br.gov.se.seplag.servicoatendimento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.se.seplag.commons.v1.PaginacaoResponse;
import br.gov.se.seplag.ebo.v1.ListaServico;


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
 *         &lt;element name="listaServicos" type="{http://www.seplag.se.gov.br/EBO/v1}ListaServico"/>
 *         &lt;element name="paginacao" type="{http://www.seplag.se.gov.br/commons/v1}PaginacaoResponse"/>
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
    "listaServicos",
    "paginacao"
})
@XmlRootElement(name = "ResultadoListarServicosAtendimento")
public class ResultadoListarServicosAtendimento {

    @XmlElement(required = true)
    protected ListaServico listaServicos;
    @XmlElement(required = true)
    protected PaginacaoResponse paginacao;

    /**
     * Gets the value of the listaServicos property.
     * 
     * @return
     *     possible object is
     *     {@link ListaServico }
     *     
     */
    public ListaServico getListaServicos() {
        return listaServicos;
    }

    /**
     * Sets the value of the listaServicos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaServico }
     *     
     */
    public void setListaServicos(ListaServico value) {
        this.listaServicos = value;
    }

    /**
     * Gets the value of the paginacao property.
     * 
     * @return
     *     possible object is
     *     {@link PaginacaoResponse }
     *     
     */
    public PaginacaoResponse getPaginacao() {
        return paginacao;
    }

    /**
     * Sets the value of the paginacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginacaoResponse }
     *     
     */
    public void setPaginacao(PaginacaoResponse value) {
        this.paginacao = value;
    }

}
