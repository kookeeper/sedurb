
package br.gov.se.seplag.ebo.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Escolaridade.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Escolaridade">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ANALFABETO"/>
 *     &lt;enumeration value="BASICA"/>
 *     &lt;enumeration value="FUNDAMENTAL"/>
 *     &lt;enumeration value="MEDIA"/>
 *     &lt;enumeration value="SUPERIOR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Escolaridade")
@XmlEnum
public enum Escolaridade {

    ANALFABETO,
    BASICA,
    FUNDAMENTAL,
    MEDIA,
    SUPERIOR;

    public String value() {
        return name();
    }

    public static Escolaridade fromValue(String v) {
        return valueOf(v);
    }

}
