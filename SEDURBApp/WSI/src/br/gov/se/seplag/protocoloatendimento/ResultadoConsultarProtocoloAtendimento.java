
package br.gov.se.seplag.protocoloatendimento;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import br.gov.se.seplag.ebo.v1.EstadoProtocolo;


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
 *         &lt;element name="protocolos" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="protocolo" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="cdProtocolo">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="22"/>
 *                                   &lt;maxLength value="22"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="cdProtocoloPai" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="22"/>
 *                                   &lt;maxLength value="22"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="cpf" type="{http://www.seplag.se.gov.br/EBO/v1}DocumentoCPF"/>
 *                             &lt;element name="codigoServico" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="nomeServico" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="status" type="{http://www.seplag.se.gov.br/EBO/v1}EstadoProtocolo"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "protocolos"
})
@XmlRootElement(name = "ResultadoConsultarProtocoloAtendimento")
public class ResultadoConsultarProtocoloAtendimento {

    protected ResultadoConsultarProtocoloAtendimento.Protocolos protocolos;

    /**
     * Gets the value of the protocolos property.
     * 
     * @return
     *     possible object is
     *     {@link ResultadoConsultarProtocoloAtendimento.Protocolos }
     *     
     */
    public ResultadoConsultarProtocoloAtendimento.Protocolos getProtocolos() {
        return protocolos;
    }

    /**
     * Sets the value of the protocolos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultadoConsultarProtocoloAtendimento.Protocolos }
     *     
     */
    public void setProtocolos(ResultadoConsultarProtocoloAtendimento.Protocolos value) {
        this.protocolos = value;
    }


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
     *         &lt;element name="protocolo" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="cdProtocolo">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="22"/>
     *                         &lt;maxLength value="22"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="cdProtocoloPai" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="22"/>
     *                         &lt;maxLength value="22"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="cpf" type="{http://www.seplag.se.gov.br/EBO/v1}DocumentoCPF"/>
     *                   &lt;element name="codigoServico" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="nomeServico" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="status" type="{http://www.seplag.se.gov.br/EBO/v1}EstadoProtocolo"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "protocolo"
    })
    public static class Protocolos {

        protected List<ResultadoConsultarProtocoloAtendimento.Protocolos.Protocolo> protocolo;

        /**
         * Gets the value of the protocolo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the protocolo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProtocolo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ResultadoConsultarProtocoloAtendimento.Protocolos.Protocolo }
         * 
         * 
         */
        public List<ResultadoConsultarProtocoloAtendimento.Protocolos.Protocolo> getProtocolo() {
            if (protocolo == null) {
                protocolo = new ArrayList<ResultadoConsultarProtocoloAtendimento.Protocolos.Protocolo>();
            }
            return this.protocolo;
        }


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
         *         &lt;element name="cdProtocolo">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="22"/>
         *               &lt;maxLength value="22"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="cdProtocoloPai" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;minLength value="22"/>
         *               &lt;maxLength value="22"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="cpf" type="{http://www.seplag.se.gov.br/EBO/v1}DocumentoCPF"/>
         *         &lt;element name="codigoServico" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="nomeServico" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="status" type="{http://www.seplag.se.gov.br/EBO/v1}EstadoProtocolo"/>
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
            "cdProtocolo",
            "cdProtocoloPai",
            "cpf",
            "codigoServico",
            "nomeServico",
            "status"
        })
        public static class Protocolo {

            @XmlElement(required = true)
            protected String cdProtocolo;
            protected String cdProtocoloPai;
            @XmlElement(required = true)
            protected String cpf;
            @XmlElement(required = true)
            protected BigInteger codigoServico;
            @XmlElement(required = true)
            protected String nomeServico;
            @XmlElement(required = true)
            protected EstadoProtocolo status;

            /**
             * Gets the value of the cdProtocolo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCdProtocolo() {
                return cdProtocolo;
            }

            /**
             * Sets the value of the cdProtocolo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCdProtocolo(String value) {
                this.cdProtocolo = value;
            }

            /**
             * Gets the value of the cdProtocoloPai property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCdProtocoloPai() {
                return cdProtocoloPai;
            }

            /**
             * Sets the value of the cdProtocoloPai property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCdProtocoloPai(String value) {
                this.cdProtocoloPai = value;
            }

            /**
             * Gets the value of the cpf property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCpf() {
                return cpf;
            }

            /**
             * Sets the value of the cpf property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCpf(String value) {
                this.cpf = value;
            }

            /**
             * Gets the value of the codigoServico property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getCodigoServico() {
                return codigoServico;
            }

            /**
             * Sets the value of the codigoServico property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setCodigoServico(BigInteger value) {
                this.codigoServico = value;
            }

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
             * Gets the value of the status property.
             * 
             * @return
             *     possible object is
             *     {@link EstadoProtocolo }
             *     
             */
            public EstadoProtocolo getStatus() {
                return status;
            }

            /**
             * Sets the value of the status property.
             * 
             * @param value
             *     allowed object is
             *     {@link EstadoProtocolo }
             *     
             */
            public void setStatus(EstadoProtocolo value) {
                this.status = value;
            }

        }

    }

}
