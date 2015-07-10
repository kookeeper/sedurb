
package br.gov.se.seplag.docsprocsnecessariosatendimento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultadoListarPorTipoAtendimento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResultadoListarPorTipoAtendimento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nomeServico">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="listaDocumentos" type="{http://www.seplag.se.gov.br/DocsProcsNecessariosAtendimento}ListaDocumentos"/>
 *         &lt;element name="listaProcedimentos" type="{http://www.seplag.se.gov.br/DocsProcsNecessariosAtendimento}ListaProcedimentos"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultadoListarPorTipoAtendimento", propOrder = {
    "nomeServico",
    "listaDocumentos",
    "listaProcedimentos"
})
public class ResultadoListarPorTipoAtendimento {

    @XmlElement(required = true)
    protected String nomeServico;
    @XmlElement(required = true)
    protected ListaDocumentos listaDocumentos;
    @XmlElement(required = true)
    protected ListaProcedimentos listaProcedimentos;

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
     * Gets the value of the listaDocumentos property.
     * 
     * @return
     *     possible object is
     *     {@link ListaDocumentos }
     *     
     */
    public ListaDocumentos getListaDocumentos() {
        return listaDocumentos;
    }

    /**
     * Sets the value of the listaDocumentos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaDocumentos }
     *     
     */
    public void setListaDocumentos(ListaDocumentos value) {
        this.listaDocumentos = value;
    }

    /**
     * Gets the value of the listaProcedimentos property.
     * 
     * @return
     *     possible object is
     *     {@link ListaProcedimentos }
     *     
     */
    public ListaProcedimentos getListaProcedimentos() {
        return listaProcedimentos;
    }

    /**
     * Sets the value of the listaProcedimentos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaProcedimentos }
     *     
     */
    public void setListaProcedimentos(ListaProcedimentos value) {
        this.listaProcedimentos = value;
    }

}
