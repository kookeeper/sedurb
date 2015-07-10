
package br.gov.se.seplag.ebo.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoCarteiraPasseLivre.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoCarteiraPasseLivre">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DEFICIENTE"/>
 *     &lt;enumeration value="IDOSO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoCarteiraPasseLivre")
@XmlEnum
public enum TipoCarteiraPasseLivre {

    DEFICIENTE,
    IDOSO;

    public String value() {
        return name();
    }

    public static TipoCarteiraPasseLivre fromValue(String v) {
        return valueOf(v);
    }

}
