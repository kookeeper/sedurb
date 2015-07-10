
package br.gov.se.seplag.ebo.v1;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				Carteira que permite acesso livre de pessoas com
 * 				deficiencia fisica ou
 * 				idosas a onibus intermunicipais.
 * 			
 * 
 * <p>Java class for CarteiraPasseLivre complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarteiraPasseLivre">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoCpf" type="{http://www.seplag.se.gov.br/EBO/v1}DocumentoCPF" minOccurs="0"/>
 *         &lt;element name="categoriaPasseLivre" type="{http://www.seplag.se.gov.br/EBO/v1}CategoriaCarteiraPasseLivre" minOccurs="0"/>
 *         &lt;element name="tipoPasseLivre" type="{http://www.seplag.se.gov.br/EBO/v1}TipoCarteiraPasseLivre" minOccurs="0"/>
 *         &lt;element name="numeroCarteiraPasseLivre" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="documentoRG" type="{http://www.seplag.se.gov.br/EBO/v1}CarteiraIdentidade" minOccurs="0"/>
 *         &lt;element name="dataEmissao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataVencimento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarteiraPasseLivre", propOrder = {
    "codigoCpf",
    "categoriaPasseLivre",
    "tipoPasseLivre",
    "numeroCarteiraPasseLivre",
    "documentoRG",
    "dataEmissao",
    "dataVencimento"
})
public class CarteiraPasseLivre {

    @XmlElement(nillable = true)
    protected String codigoCpf;
    @XmlElement(nillable = true)
    protected CategoriaCarteiraPasseLivre categoriaPasseLivre;
    @XmlElement(nillable = true)
    protected TipoCarteiraPasseLivre tipoPasseLivre;
    @XmlElement(nillable = true)
    protected BigInteger numeroCarteiraPasseLivre;
    @XmlElement(nillable = true)
    protected CarteiraIdentidade documentoRG;
    @XmlElement(nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataEmissao;
    @XmlElement(nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataVencimento;

    /**
     * Gets the value of the codigoCpf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoCpf() {
        return codigoCpf;
    }

    /**
     * Sets the value of the codigoCpf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoCpf(String value) {
        this.codigoCpf = value;
    }

    /**
     * Gets the value of the categoriaPasseLivre property.
     * 
     * @return
     *     possible object is
     *     {@link CategoriaCarteiraPasseLivre }
     *     
     */
    public CategoriaCarteiraPasseLivre getCategoriaPasseLivre() {
        return categoriaPasseLivre;
    }

    /**
     * Sets the value of the categoriaPasseLivre property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoriaCarteiraPasseLivre }
     *     
     */
    public void setCategoriaPasseLivre(CategoriaCarteiraPasseLivre value) {
        this.categoriaPasseLivre = value;
    }

    /**
     * Gets the value of the tipoPasseLivre property.
     * 
     * @return
     *     possible object is
     *     {@link TipoCarteiraPasseLivre }
     *     
     */
    public TipoCarteiraPasseLivre getTipoPasseLivre() {
        return tipoPasseLivre;
    }

    /**
     * Sets the value of the tipoPasseLivre property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCarteiraPasseLivre }
     *     
     */
    public void setTipoPasseLivre(TipoCarteiraPasseLivre value) {
        this.tipoPasseLivre = value;
    }

    /**
     * Gets the value of the numeroCarteiraPasseLivre property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumeroCarteiraPasseLivre() {
        return numeroCarteiraPasseLivre;
    }

    /**
     * Sets the value of the numeroCarteiraPasseLivre property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumeroCarteiraPasseLivre(BigInteger value) {
        this.numeroCarteiraPasseLivre = value;
    }

    /**
     * Gets the value of the documentoRG property.
     * 
     * @return
     *     possible object is
     *     {@link CarteiraIdentidade }
     *     
     */
    public CarteiraIdentidade getDocumentoRG() {
        return documentoRG;
    }

    /**
     * Sets the value of the documentoRG property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarteiraIdentidade }
     *     
     */
    public void setDocumentoRG(CarteiraIdentidade value) {
        this.documentoRG = value;
    }

    /**
     * Gets the value of the dataEmissao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataEmissao() {
        return dataEmissao;
    }

    /**
     * Sets the value of the dataEmissao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataEmissao(XMLGregorianCalendar value) {
        this.dataEmissao = value;
    }

    /**
     * Gets the value of the dataVencimento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataVencimento() {
        return dataVencimento;
    }

    /**
     * Sets the value of the dataVencimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataVencimento(XMLGregorianCalendar value) {
        this.dataVencimento = value;
    }

}
