
package br.gov.se.seplag.commons.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ErrosInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ErrosInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="erroInfo" type="{http://www.seplag.se.gov.br/commons/v1}ErroInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrosInfo", propOrder = {
    "erroInfo"
})
public class ErrosInfo {

    @XmlElementRef(name = "erroInfo", namespace = "http://www.seplag.se.gov.br/commons/v1", type = JAXBElement.class)
    protected List<JAXBElement<ErroInfo>> erroInfo;

    /**
     * Gets the value of the erroInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the erroInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErroInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ErroInfo }{@code >}
     * 
     * 
     */
    public List<JAXBElement<ErroInfo>> getErroInfo() {
        if (erroInfo == null) {
            erroInfo = new ArrayList<JAXBElement<ErroInfo>>();
        }
        return this.erroInfo;
    }

}
