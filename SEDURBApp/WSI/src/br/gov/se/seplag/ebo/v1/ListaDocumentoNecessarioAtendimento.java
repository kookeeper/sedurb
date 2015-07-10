
package br.gov.se.seplag.ebo.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListaDocumentoNecessarioAtendimento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListaDocumentoNecessarioAtendimento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.seplag.se.gov.br/EBO/v1}documentoNecessarioAtendimento" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListaDocumentoNecessarioAtendimento", propOrder = {
    "documentoNecessarioAtendimento"
})
public class ListaDocumentoNecessarioAtendimento {

    @XmlElement(nillable = true)
    protected List<DocumentoNecessarioAtendimento> documentoNecessarioAtendimento;

    /**
     * Gets the value of the documentoNecessarioAtendimento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentoNecessarioAtendimento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentoNecessarioAtendimento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentoNecessarioAtendimento }
     * 
     * 
     */
    public List<DocumentoNecessarioAtendimento> getDocumentoNecessarioAtendimento() {
        if (documentoNecessarioAtendimento == null) {
            documentoNecessarioAtendimento = new ArrayList<DocumentoNecessarioAtendimento>();
        }
        return this.documentoNecessarioAtendimento;
    }

}
