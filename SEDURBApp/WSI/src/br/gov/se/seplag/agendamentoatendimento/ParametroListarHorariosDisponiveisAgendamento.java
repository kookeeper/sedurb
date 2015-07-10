
package br.gov.se.seplag.agendamentoatendimento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.se.seplag.ebo.v1.Servico;
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
 *         &lt;element name="servico" type="{http://www.seplag.se.gov.br/EBO/v1}Servico"/>
 *         &lt;element name="unidadeAtendimento" type="{http://www.seplag.se.gov.br/EBO/v1}UnidadeAtendimento"/>
 *         &lt;element name="exibirHorariosSemVagas" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "servico",
    "unidadeAtendimento",
    "exibirHorariosSemVagas"
})
@XmlRootElement(name = "ParametroListarHorariosDisponiveisAgendamento")
public class ParametroListarHorariosDisponiveisAgendamento {

    @XmlElement(required = true)
    protected Servico servico;
    @XmlElement(required = true)
    protected UnidadeAtendimento unidadeAtendimento;
    protected Boolean exibirHorariosSemVagas;

    /**
     * Gets the value of the servico property.
     * 
     * @return
     *     possible object is
     *     {@link Servico }
     *     
     */
    public Servico getServico() {
        return servico;
    }

    /**
     * Sets the value of the servico property.
     * 
     * @param value
     *     allowed object is
     *     {@link Servico }
     *     
     */
    public void setServico(Servico value) {
        this.servico = value;
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
     * Gets the value of the exibirHorariosSemVagas property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExibirHorariosSemVagas() {
        return exibirHorariosSemVagas;
    }

    /**
     * Sets the value of the exibirHorariosSemVagas property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExibirHorariosSemVagas(Boolean value) {
        this.exibirHorariosSemVagas = value;
    }

}
