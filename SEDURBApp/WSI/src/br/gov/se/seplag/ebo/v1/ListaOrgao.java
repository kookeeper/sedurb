
package br.gov.se.seplag.ebo.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListaOrgao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListaOrgao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Orgao" type="{http://www.seplag.se.gov.br/EBO/v1}Orgao" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListaOrgao", propOrder = {
    "orgao"
})
public class ListaOrgao {

    @XmlElement(name = "Orgao")
    protected List<Orgao> orgao;

    /**
     * Gets the value of the orgao property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orgao property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrgao().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Orgao }
     * 
     * 
     */
    public List<Orgao> getOrgao() {
        if (orgao == null) {
            orgao = new ArrayList<Orgao>();
        }
        return this.orgao;
    }

}
