//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package aero.fixm.flight._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SurveillanceCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SurveillanceCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="B1"/>
 *     &lt;enumeration value="B2"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="D1"/>
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="G1"/>
 *     &lt;enumeration value="H"/>
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="L"/>
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="U1"/>
 *     &lt;enumeration value="U2"/>
 *     &lt;enumeration value="V1"/>
 *     &lt;enumeration value="V2"/>
 *     &lt;enumeration value="X"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SurveillanceCodeType")
@XmlEnum
public enum SurveillanceCodeType {

    A("A"),
    @XmlEnumValue("B1")
    B_1("B1"),
    @XmlEnumValue("B2")
    B_2("B2"),
    C("C"),
    @XmlEnumValue("D1")
    D_1("D1"),
    E("E"),
    @XmlEnumValue("G1")
    G_1("G1"),
    H("H"),
    I("I"),
    L("L"),
    P("P"),
    S("S"),
    @XmlEnumValue("U1")
    U_1("U1"),
    @XmlEnumValue("U2")
    U_2("U2"),
    @XmlEnumValue("V1")
    V_1("V1"),
    @XmlEnumValue("V2")
    V_2("V2"),
    X("X");
    private final String value;

    SurveillanceCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SurveillanceCodeType fromValue(String v) {
        for (SurveillanceCodeType c: SurveillanceCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
