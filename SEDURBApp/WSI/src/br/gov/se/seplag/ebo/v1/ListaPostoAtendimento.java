
package br.gov.se.seplag.ebo.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListaPostoAtendimento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListaPostoAtendimento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PostoAtendimento" type="{http://www.seplag.se.gov.br/EBO/v1}PostoAtendimento" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListaPostoAtendimento", propOrder = {
    "postoAtendimento"
})
public class ListaPostoAtendimento {

    @XmlElement(name = "PostoAtendimento")
    protected List<PostoAtendimento> postoAtendimento;

    /**
     * Gets the value of the postoAtendimento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the postoAtendimento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPostoAtendimento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PostoAtendimento }
     * 
     * 
     */
    public List<PostoAtendimento> getPostoAtendimento() {
        if (postoAtendimento == null) {
            postoAtendimento = new ArrayList<PostoAtendimento>();
        }
        return this.postoAtendimento;
    }

}
