
package br.gov.se.seplag.senhaatendimento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.se.seplag.ebo.v1.SenhaAtendimento;


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
 *         &lt;element name="senha" type="{http://www.seplag.se.gov.br/EBO/v1}SenhaAtendimento"/>
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
    "senha"
})
@XmlRootElement(name = "ResultadoEmitirSenhaAtendimento")
public class ResultadoEmitirSenhaAtendimento {

    @XmlElement(required = true)
    protected SenhaAtendimento senha;

    /**
     * Gets the value of the senha property.
     * 
     * @return
     *     possible object is
     *     {@link SenhaAtendimento }
     *     
     */
    public SenhaAtendimento getSenha() {
        return senha;
    }

    /**
     * Sets the value of the senha property.
     * 
     * @param value
     *     allowed object is
     *     {@link SenhaAtendimento }
     *     
     */
    public void setSenha(SenhaAtendimento value) {
        this.senha = value;
    }

}
