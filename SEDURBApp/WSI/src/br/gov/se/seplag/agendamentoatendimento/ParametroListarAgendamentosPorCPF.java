
package br.gov.se.seplag.agendamentoatendimento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="documentoCPF" type="{http://www.seplag.se.gov.br/EBO/v1}DocumentoCPF"/>
 *         &lt;element name="unidadeAtendimento" type="{http://www.seplag.se.gov.br/EBO/v1}UnidadeAtendimento" minOccurs="0"/>
 *         &lt;element name="buscarSomenteAgendamentosEmAberto" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "documentoCPF",
    "unidadeAtendimento",
    "buscarSomenteAgendamentosEmAberto"
})
@XmlRootElement(name = "ParametroListarAgendamentosPorCPF")
public class ParametroListarAgendamentosPorCPF {

    @XmlElement(required = true)
    protected String documentoCPF;
    protected UnidadeAtendimento unidadeAtendimento;
    @XmlElement(defaultValue = "true")
    protected boolean buscarSomenteAgendamentosEmAberto;

    /**
     * Gets the value of the documentoCPF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentoCPF() {
        return documentoCPF;
    }

    /**
     * Sets the value of the documentoCPF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentoCPF(String value) {
        this.documentoCPF = value;
    }

    /**
     * Gets the value of the unidadeAtendimento property.
     * 
     * @return
     *     possible object is
     *     {@link UnidadeAtendimento }
     *     
     */
    public UnidadeAtendimento getUnidadeAtendimento() {
        return unidadeAtendimento;
    }

    /**
     * Sets the value of the unidadeAtendimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnidadeAtendimento }
     *     
     */
    public void setUnidadeAtendimento(UnidadeAtendimento value) {
        this.unidadeAtendimento = value;
    }

    /**
     * Gets the value of the buscarSomenteAgendamentosEmAberto property.
     * 
     */
    public boolean isBuscarSomenteAgendamentosEmAberto() {
        return buscarSomenteAgendamentosEmAberto;
    }

    /**
     * Sets the value of the buscarSomenteAgendamentosEmAberto property.
     * 
     */
    public void setBuscarSomenteAgendamentosEmAberto(boolean value) {
        this.buscarSomenteAgendamentosEmAberto = value;
    }

}
