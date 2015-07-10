
package br.gov.se.seplag.agendamentoatendimento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.se.seplag.ebo.v1.ListaAgendamentoAtendimento;


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
 *         &lt;element name="agendamentos" type="{http://www.seplag.se.gov.br/EBO/v1}ListaAgendamentoAtendimento"/>
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
    "agendamentos"
})
@XmlRootElement(name = "ResultadoListarAgendamentosPorCPF")
public class ResultadoListarAgendamentosPorCPF {

    @XmlElement(required = true)
    protected ListaAgendamentoAtendimento agendamentos;

    /**
     * Gets the value of the agendamentos property.
     * 
     * @return
     *     possible object is
     *     {@link ListaAgendamentoAtendimento }
     *     
     */
    public ListaAgendamentoAtendimento getAgendamentos() {
        return agendamentos;
    }

    /**
     * Sets the value of the agendamentos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaAgendamentoAtendimento }
     *     
     */
    public void setAgendamentos(ListaAgendamentoAtendimento value) {
        this.agendamentos = value;
    }

}
