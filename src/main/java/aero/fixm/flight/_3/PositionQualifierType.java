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
 * <p>Java class for PositionQualifierType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PositionQualifierType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AT_OR_BEFORE_POINT"/>
 *     &lt;enumeration value="AT_POINT"/>
 *     &lt;enumeration value="AT_OR_AFTER_POINT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PositionQualifierType")
@XmlEnum
public enum PositionQualifierType {

    AT_OR_BEFORE_POINT,
    AT_POINT,
    AT_OR_AFTER_POINT;

    public String value() {
        return name();
    }

    public static PositionQualifierType fromValue(String v) {
        return valueOf(v);
    }

}
