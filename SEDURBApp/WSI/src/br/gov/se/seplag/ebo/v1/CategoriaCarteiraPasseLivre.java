
package br.gov.se.seplag.ebo.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CategoriaCarteiraPasseLivre.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CategoriaCarteiraPasseLivre">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PERMANENTE"/>
 *     &lt;enumeration value="PROVISORIO"/>
 *     &lt;enumeration value="CADASTRO"/>
 *     &lt;enumeration value="INDEFERIDO"/>
 *     &lt;enumeration value="VENCIDO"/>
 *     &lt;enumeration value="CANCELADO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CategoriaCarteiraPasseLivre")
@XmlEnum
public enum CategoriaCarteiraPasseLivre {

    PERMANENTE,
    PROVISORIO,
    CADASTRO,
    INDEFERIDO,
    VENCIDO,
    CANCELADO;

    public String value() {
        return name();
    }

    public static CategoriaCarteiraPasseLivre fromValue(String v) {
        return valueOf(v);
    }

}
