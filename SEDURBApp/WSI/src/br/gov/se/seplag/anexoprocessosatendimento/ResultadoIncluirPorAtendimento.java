
package br.gov.se.seplag.anexoprocessosatendimento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="listaCodigoProtocolo" type="{http://www.seplag.se.gov.br/AnexoProcessosAtendimento}ListaCodigoProtocolo"/>
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
    "listaCodigoProtocolo"
})
@XmlRootElement(name = "ResultadoIncluirPorAtendimento")
public class ResultadoIncluirPorAtendimento {

    @XmlElement(required = true)
    protected ListaCodigoProtocolo listaCodigoProtocolo;

    /**
     * Gets the value of the listaCodigoProtocolo property.
     * 
     * @return
     *     possible object is
     *     {@link ListaCodigoProtocolo }
     *     
     */
    public ListaCodigoProtocolo getListaCodigoProtocolo() {
        return listaCodigoProtocolo;
    }

    /**
     * Sets the value of the listaCodigoProtocolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaCodigoProtocolo }
     *     
     */
    public void setListaCodigoProtocolo(ListaCodigoProtocolo value) {
        this.listaCodigoProtocolo = value;
    }

}
