
package br.gov.se.seplag.ebo.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Servico complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Servico">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nome" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="orgao" type="{http://www.seplag.se.gov.br/EBO/v1}Orgao" minOccurs="0"/>
 *         &lt;element name="processoAtendimento" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Servico", propOrder = {
    "nome",
    "orgao",
    "processoAtendimento"
})
public class Servico {

    protected String nome;
    protected Orgao orgao;
    protected Boolean processoAtendimento;

    /**
     * Gets the value of the nome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Sets the value of the nome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Gets the value of the orgao property.
     * 
     * @return
     *     possible object is
     *     {@link Orgao }
     *     
     */
    public Orgao getOrgao() {
        return orgao;
    }

    /**
     * Sets the value of the orgao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Orgao }
     *     
     */
    public void setOrgao(Orgao value) {
        this.orgao = value;
    }

    /**
     * Gets the value of the processoAtendimento property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProcessoAtendimento() {
        return processoAtendimento;
    }

    /**
     * Sets the value of the processoAtendimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProcessoAtendimento(Boolean value) {
        this.processoAtendimento = value;
    }

}
