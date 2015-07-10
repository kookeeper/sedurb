
package br.gov.se.seplag.ebo.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListaTelefone complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListaTelefone">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="telefone" type="{http://www.seplag.se.gov.br/EBO/v1}Telefone" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListaTelefone", propOrder = {
    "telefone"
})
public class ListaTelefone {

    @XmlElementRef(name = "telefone", namespace = "http://www.seplag.se.gov.br/EBO/v1", type = JAXBElement.class)
    protected List<JAXBElement<Telefone>> telefone;

    /**
     * Gets the value of the telefone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telefone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelefone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Telefone }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Telefone>> getTelefone() {
        if (telefone == null) {
            telefone = new ArrayList<JAXBElement<Telefone>>();
        }
        return this.telefone;
    }

}
