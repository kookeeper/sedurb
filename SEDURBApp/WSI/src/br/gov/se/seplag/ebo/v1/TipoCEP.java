
package br.gov.se.seplag.ebo.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoCEP.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoCEP">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LOGRADOURO"/>
 *     &lt;enumeration value="UNIDADE_OPERACIONAL"/>
 *     &lt;enumeration value="GRANDE_USUARIO"/>
 *     &lt;enumeration value="CPC"/>
 *     &lt;enumeration value="LOCALIDADE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoCEP")
@XmlEnum
public enum TipoCEP {

    LOGRADOURO,
    UNIDADE_OPERACIONAL,
    GRANDE_USUARIO,
    CPC,
    LOCALIDADE;

    public String value() {
        return name();
    }

    public static TipoCEP fromValue(String v) {
        return valueOf(v);
    }

}
