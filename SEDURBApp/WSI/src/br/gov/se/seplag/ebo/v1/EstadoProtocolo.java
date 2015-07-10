
package br.gov.se.seplag.ebo.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EstadoProtocolo.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EstadoProtocolo">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ABERTO"/>
 *     &lt;enumeration value="PARADO"/>
 *     &lt;enumeration value="CANCELADO"/>
 *     &lt;enumeration value="CONCLUIDO_NAOAVALIADO"/>
 *     &lt;enumeration value="CONCLUIDO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EstadoProtocolo")
@XmlEnum
public enum EstadoProtocolo {

    ABERTO,
    PARADO,
    CANCELADO,
    CONCLUIDO_NAOAVALIADO,
    CONCLUIDO;

    public String value() {
        return name();
    }

    public static EstadoProtocolo fromValue(String v) {
        return valueOf(v);
    }

}
