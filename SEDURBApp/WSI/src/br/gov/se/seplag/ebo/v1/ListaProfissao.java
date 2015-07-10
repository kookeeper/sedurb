
package br.gov.se.seplag.ebo.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListaProfissao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListaProfissao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="profissao" type="{http://www.seplag.se.gov.br/EBO/v1}Profissao" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListaProfissao", propOrder = {
    "profissao"
})
public class ListaProfissao {

    @XmlElementRef(name = "profissao", namespace = "http://www.seplag.se.gov.br/EBO/v1", type = JAXBElement.class)
    protected List<JAXBElement<String>> profissao;

    /**
     * Gets the value of the profissao property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profissao property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfissao().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<String>> getProfissao() {
        if (profissao == null) {
            profissao = new ArrayList<JAXBElement<String>>();
        }
        return this.profissao;
    }

}
