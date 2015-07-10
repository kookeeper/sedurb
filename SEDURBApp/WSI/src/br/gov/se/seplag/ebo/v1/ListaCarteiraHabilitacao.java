
package br.gov.se.seplag.ebo.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListaCarteiraHabilitacao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListaCarteiraHabilitacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="carteiraHabilitacao" type="{http://www.seplag.se.gov.br/EBO/v1}CarteiraHabilitacao" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListaCarteiraHabilitacao", propOrder = {
    "carteiraHabilitacao"
})
public class ListaCarteiraHabilitacao {

    @XmlElementRef(name = "carteiraHabilitacao", namespace = "http://www.seplag.se.gov.br/EBO/v1", type = JAXBElement.class)
    protected List<JAXBElement<CarteiraHabilitacao>> carteiraHabilitacao;

    /**
     * Gets the value of the carteiraHabilitacao property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carteiraHabilitacao property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarteiraHabilitacao().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link CarteiraHabilitacao }{@code >}
     * 
     * 
     */
    public List<JAXBElement<CarteiraHabilitacao>> getCarteiraHabilitacao() {
        if (carteiraHabilitacao == null) {
            carteiraHabilitacao = new ArrayList<JAXBElement<CarteiraHabilitacao>>();
        }
        return this.carteiraHabilitacao;
    }

}
