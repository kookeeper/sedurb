
package br.gov.se.seplag.ebo.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListaCampoEndereco complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListaCampoEndereco">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="campoEndereco" type="{http://www.seplag.se.gov.br/EBO/v1}CampoEndereco" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListaCampoEndereco", propOrder = {
    "campoEndereco"
})
public class ListaCampoEndereco {

    protected List<CampoEndereco> campoEndereco;

    /**
     * Gets the value of the campoEndereco property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the campoEndereco property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCampoEndereco().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CampoEndereco }
     * 
     * 
     */
    public List<CampoEndereco> getCampoEndereco() {
        if (campoEndereco == null) {
            campoEndereco = new ArrayList<CampoEndereco>();
        }
        return this.campoEndereco;
    }

}
