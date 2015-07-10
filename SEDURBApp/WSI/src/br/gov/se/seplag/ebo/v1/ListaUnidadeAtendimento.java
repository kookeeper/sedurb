
package br.gov.se.seplag.ebo.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListaUnidadeAtendimento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListaUnidadeAtendimento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="unidadeAtendimento" type="{http://www.seplag.se.gov.br/EBO/v1}UnidadeAtendimento" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListaUnidadeAtendimento", propOrder = {
    "unidadeAtendimento"
})
public class ListaUnidadeAtendimento {

    protected List<UnidadeAtendimento> unidadeAtendimento;

    /**
     * Gets the value of the unidadeAtendimento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unidadeAtendimento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnidadeAtendimento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnidadeAtendimento }
     * 
     * 
     */
    public List<UnidadeAtendimento> getUnidadeAtendimento() {
        if (unidadeAtendimento == null) {
            unidadeAtendimento = new ArrayList<UnidadeAtendimento>();
        }
        return this.unidadeAtendimento;
    }

}
