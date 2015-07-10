
package br.gov.se.seplag.anexoprocessosatendimento;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.se.seplag.ebo.v1.ListaDocumentoNecessarioAtendimento;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nomeServico" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigoCPF">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;totalDigits value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="listaDocumentos" type="{http://www.seplag.se.gov.br/EBO/v1}ListaDocumentoNecessarioAtendimento"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nomeServico",
    "codigoCPF",
    "listaDocumentos"
})
@XmlRootElement(name = "ParametroIncluirPorAtendimento")
public class ParametroIncluirPorAtendimento {

    @XmlElement(required = true)
    protected String nomeServico;
    @XmlElement(required = true)
    protected BigInteger codigoCPF;
    @XmlElement(required = true)
    protected ListaDocumentoNecessarioAtendimento listaDocumentos;

    /**
     * Gets the value of the nomeServico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeServico() {
        return nomeServico;
    }

    /**
     * Sets the value of the nomeServico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeServico(String value) {
        this.nomeServico = value;
    }

    /**
     * Gets the value of the codigoCPF property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCodigoCPF() {
        return codigoCPF;
    }

    /**
     * Sets the value of the codigoCPF property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCodigoCPF(BigInteger value) {
        this.codigoCPF = value;
    }

    /**
     * Gets the value of the listaDocumentos property.
     * 
     * @return
     *     possible object is
     *     {@link ListaDocumentoNecessarioAtendimento }
     *     
     */
    public ListaDocumentoNecessarioAtendimento getListaDocumentos() {
        return listaDocumentos;
    }

    /**
     * Sets the value of the listaDocumentos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaDocumentoNecessarioAtendimento }
     *     
     */
    public void setListaDocumentos(ListaDocumentoNecessarioAtendimento value) {
        this.listaDocumentos = value;
    }

}
