
package br.gov.se.seplag.ebo.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListaHorariosDisponiveisAtendimento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListaHorariosDisponiveisAtendimento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="horariosDisponiveisAtendimento" type="{http://www.seplag.se.gov.br/EBO/v1}HorariosDisponiveisAtendimento" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListaHorariosDisponiveisAtendimento", propOrder = {
    "horariosDisponiveisAtendimento"
})
public class ListaHorariosDisponiveisAtendimento {

    protected List<HorariosDisponiveisAtendimento> horariosDisponiveisAtendimento;

    /**
     * Gets the value of the horariosDisponiveisAtendimento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the horariosDisponiveisAtendimento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHorariosDisponiveisAtendimento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HorariosDisponiveisAtendimento }
     * 
     * 
     */
    public List<HorariosDisponiveisAtendimento> getHorariosDisponiveisAtendimento() {
        if (horariosDisponiveisAtendimento == null) {
            horariosDisponiveisAtendimento = new ArrayList<HorariosDisponiveisAtendimento>();
        }
        return this.horariosDisponiveisAtendimento;
    }

}
