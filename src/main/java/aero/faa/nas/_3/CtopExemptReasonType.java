//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package aero.faa.nas._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CtopExemptReasonType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CtopExemptReasonType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NON_EXEMPT"/>
 *     &lt;enumeration value="MANUAL"/>
 *     &lt;enumeration value="ACID"/>
 *     &lt;enumeration value="INTERNATIONAL"/>
 *     &lt;enumeration value="ANOTHER_CTOP"/>
 *     &lt;enumeration value="TIME"/>
 *     &lt;enumeration value="ARR_ARPT"/>
 *     &lt;enumeration value="DEP_ARPT"/>
 *     &lt;enumeration value="ARR_ARTCC"/>
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="AFP"/>
 *     &lt;enumeration value="GDP"/>
 *     &lt;enumeration value="GS"/>
 *     &lt;enumeration value="PARAM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CtopExemptReasonType")
@XmlEnum
public enum CtopExemptReasonType {

    NON_EXEMPT,
    MANUAL,
    ACID,
    INTERNATIONAL,
    ANOTHER_CTOP,
    TIME,
    ARR_ARPT,
    DEP_ARPT,
    ARR_ARTCC,
    ACTIVE,
    AFP,
    GDP,
    GS,
    PARAM;

    public String value() {
        return name();
    }

    public static CtopExemptReasonType fromValue(String v) {
        return valueOf(v);
    }

}
