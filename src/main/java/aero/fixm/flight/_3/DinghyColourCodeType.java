//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package aero.fixm.flight._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DinghyColourCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DinghyColourCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RED"/>
 *     &lt;enumeration value="ORANGE"/>
 *     &lt;enumeration value="YELLOW"/>
 *     &lt;enumeration value="GREEN"/>
 *     &lt;enumeration value="BLUE"/>
 *     &lt;enumeration value="VIOLET"/>
 *     &lt;enumeration value="BLACK"/>
 *     &lt;enumeration value="WHITE"/>
 *     &lt;enumeration value="GRAY"/>
 *     &lt;enumeration value="SILVER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DinghyColourCodeType")
@XmlEnum
public enum DinghyColourCodeType {

    RED,
    ORANGE,
    YELLOW,
    GREEN,
    BLUE,
    VIOLET,
    BLACK,
    WHITE,
    GRAY,
    SILVER;

    public String value() {
        return name();
    }

    public static DinghyColourCodeType fromValue(String v) {
        return valueOf(v);
    }

}
