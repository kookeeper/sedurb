
package br.gov.se.seplag.agendamentoatendimento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import br.gov.se.seplag.ebo.v1.Cidadao;
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
 *         &lt;element name="cidadao" type="{http://www.seplag.se.gov.br/EBO/v1}Cidadao"/>
 *         &lt;element name="unidadeAtendimento" type="{http://www.seplag.se.gov.br/EBO/v1}UnidadeAtendimento"/>
 *         &lt;element name="servico" type="{http://www.seplag.se.gov.br/EBO/v1}Servico"/>
 *         &lt;element name="dataHoraAgendamento" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
    "cidadao",
    "unidadeAtendimento",
    "servico",
    "dataHoraAgendamento"
})
@XmlRootElement(name = "ParametroRealizarAgendamentoAtendimento")
public class ParametroRealizarAgendamentoAtendimento {

    @XmlElement(required = true)
    protected Cidadao cidadao;
    @XmlElement(required = true)
    protected UnidadeAtendimento unidadeAtendimento;
    @XmlElement(required = true)
    protected Servico servico;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataHoraAgendamento;

    /**
     * Gets the value of the cidadao property.
     * 
     * @return
     *     possible object is
     *     {@link Cidadao }
     *     
     */
    public Cidadao getCidadao() {
        return cidadao;
    }

    /**
     * Sets the value of the cidadao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cidadao }
     *     
     */
    public void setCidadao(Cidadao value) {
        this.cidadao = value;
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
     * Gets the value of the dataHoraAgendamento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataHoraAgendamento() {
        return dataHoraAgendamento;
    }

    /**
     * Sets the value of the dataHoraAgendamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataHoraAgendamento(XMLGregorianCalendar value) {
        this.dataHoraAgendamento = value;
    }

}
