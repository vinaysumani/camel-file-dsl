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
 * <p>Java class for TfmsFlightStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TfmsFlightStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SCHEDULED"/>
 *     &lt;enumeration value="CONTROLLED"/>
 *     &lt;enumeration value="FILED"/>
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="ASCENDING"/>
 *     &lt;enumeration value="CRUISING"/>
 *     &lt;enumeration value="DESCENDING"/>
 *     &lt;enumeration value="COMPLETED"/>
 *     &lt;enumeration value="CANCELLED"/>
 *     &lt;enumeration value="DECONTROLLED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="ERROR"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TfmsFlightStatusType")
@XmlEnum
public enum TfmsFlightStatusType {

    SCHEDULED,
    CONTROLLED,
    FILED,
    ACTIVE,
    ASCENDING,
    CRUISING,
    DESCENDING,
    COMPLETED,
    CANCELLED,
    DECONTROLLED,
    UNKNOWN,
    NONE,
    ERROR,
    OTHER;

    public String value() {
        return name();
    }

    public static TfmsFlightStatusType fromValue(String v) {
        return valueOf(v);
    }

}