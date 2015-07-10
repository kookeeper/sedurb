
package br.gov.se.seplag.agendamentoatendimento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.se.seplag.ebo.v1.ListaHorariosDisponiveisAtendimento;


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
 *         &lt;element name="horariosDisponiveis" type="{http://www.seplag.se.gov.br/EBO/v1}ListaHorariosDisponiveisAtendimento"/>
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
    "horariosDisponiveis"
})
@XmlRootElement(name = "ResultadoListarHorariosDisponiveisAgendamento")
public class ResultadoListarHorariosDisponiveisAgendamento {

    @XmlElement(required = true)
    protected ListaHorariosDisponiveisAtendimento horariosDisponiveis;

    /**
     * Gets the value of the horariosDisponiveis property.
     * 
     * @return
     *     possible object is
     *     {@link ListaHorariosDisponiveisAtendimento }
     *     
     */
    public ListaHorariosDisponiveisAtendimento getHorariosDisponiveis() {
        return horariosDisponiveis;
    }

    /**
     * Sets the value of the horariosDisponiveis property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaHorariosDisponiveisAtendimento }
     *     
     */
    public void setHorariosDisponiveis(ListaHorariosDisponiveisAtendimento value) {
        this.horariosDisponiveis = value;
    }

}
