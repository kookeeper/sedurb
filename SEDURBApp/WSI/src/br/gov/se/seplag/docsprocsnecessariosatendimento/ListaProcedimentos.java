
package br.gov.se.seplag.docsprocsnecessariosatendimento;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import br.gov.se.seplag.ebo.v1.ProcedimentoNecessarioAtendimento;


/**
 * <p>Java class for ListaProcedimentos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListaProcedimentos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="procedimento" type="{http://www.seplag.se.gov.br/EBO/v1}ProcedimentoNecessarioAtendimento" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListaProcedimentos", propOrder = {
    "procedimento"
})
public class ListaProcedimentos {

    protected List<ProcedimentoNecessarioAtendimento> procedimento;

    /**
     * Gets the value of the procedimento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the procedimento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcedimento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcedimentoNecessarioAtendimento }
     * 
     * 
     */
    public List<ProcedimentoNecessarioAtendimento> getProcedimento() {
        if (procedimento == null) {
            procedimento = new ArrayList<ProcedimentoNecessarioAtendimento>();
        }
        return this.procedimento;
    }

}
