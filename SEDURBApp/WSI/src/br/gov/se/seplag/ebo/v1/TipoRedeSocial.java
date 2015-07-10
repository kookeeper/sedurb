
package br.gov.se.seplag.ebo.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoRedeSocial.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoRedeSocial">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Facebook"/>
 *     &lt;enumeration value="Instagram"/>
 *     &lt;enumeration value="Twitter"/>
 *     &lt;enumeration value="GooglePlus"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoRedeSocial")
@XmlEnum
public enum TipoRedeSocial {

    @XmlEnumValue("Facebook")
    FACEBOOK("Facebook"),
    @XmlEnumValue("Instagram")
    INSTAGRAM("Instagram"),
    @XmlEnumValue("Twitter")
    TWITTER("Twitter"),
    @XmlEnumValue("GooglePlus")
    GOOGLE_PLUS("GooglePlus");
    private final String value;

    TipoRedeSocial(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipoRedeSocial fromValue(String v) {
        for (TipoRedeSocial c: TipoRedeSocial.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
