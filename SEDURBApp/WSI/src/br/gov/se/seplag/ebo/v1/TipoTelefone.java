
package br.gov.se.seplag.ebo.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoTelefone.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoTelefone">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RESIDENCIAL"/>
 *     &lt;enumeration value="COMERCIAL"/>
 *     &lt;enumeration value="CELULAR"/>
 *     &lt;enumeration value="FIXO"/>
 *     &lt;enumeration value="FAX"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoTelefone")
@XmlEnum
public enum TipoTelefone {

    RESIDENCIAL,
    COMERCIAL,
    CELULAR,
    FIXO,
    FAX;

    public String value() {
        return name();
    }

    public static TipoTelefone fromValue(String v) {
        return valueOf(v);
    }

}
