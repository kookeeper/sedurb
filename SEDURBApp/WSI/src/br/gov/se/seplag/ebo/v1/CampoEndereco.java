
package br.gov.se.seplag.ebo.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CampoEndereco.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CampoEndereco">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CEP"/>
 *     &lt;enumeration value="TIPO_LOGRADOURO"/>
 *     &lt;enumeration value="LOGRADOURO"/>
 *     &lt;enumeration value="NUMERO"/>
 *     &lt;enumeration value="COMPLEMENTO"/>
 *     &lt;enumeration value="LOCALIDADE"/>
 *     &lt;enumeration value="BAIRRO"/>
 *     &lt;enumeration value="UF"/>
 *     &lt;enumeration value="PAIS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CampoEndereco")
@XmlEnum
public enum CampoEndereco {

    CEP,
    TIPO_LOGRADOURO,
    LOGRADOURO,
    NUMERO,
    COMPLEMENTO,
    LOCALIDADE,
    BAIRRO,
    UF,
    PAIS;

    public String value() {
        return name();
    }

    public static CampoEndereco fromValue(String v) {
        return valueOf(v);
    }

}
