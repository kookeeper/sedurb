
package br.gov.se.seplag.agendamentoatendimento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.se.seplag.ebo.v1.AgendamentoAtendimento;


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
 *         &lt;element name="agendamento" type="{http://www.seplag.se.gov.br/EBO/v1}AgendamentoAtendimento"/>
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
    "agendamento"
})
@XmlRootElement(name = "ResultadoRealizarAgendamentoAtendimento")
public class ResultadoRealizarAgendamentoAtendimento {

    @XmlElement(required = true)
    protected AgendamentoAtendimento agendamento;

    /**
     * Gets the value of the agendamento property.
     * 
     * @return
     *     possible object is
     *     {@link AgendamentoAtendimento }
     *     
     */
    public AgendamentoAtendimento getAgendamento() {
        return agendamento;
    }

    /**
     * Sets the value of the agendamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgendamentoAtendimento }
     *     
     */
    public void setAgendamento(AgendamentoAtendimento value) {
        this.agendamento = value;
    }

}
