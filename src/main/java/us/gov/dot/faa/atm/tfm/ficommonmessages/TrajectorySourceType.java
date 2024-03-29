//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package us.gov.dot.faa.atm.tfm.ficommonmessages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for trajectorySourceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="trajectorySourceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TOS "/>
 *     &lt;enumeration value="FP"/>
 *     &lt;enumeration value="EIFP"/>
 *     &lt;enumeration value="HIST"/>
 *     &lt;enumeration value="MANUAL"/>
 *     &lt;enumeration value="DIRECT"/>
 *     &lt;enumeration value="REROUTE"/>
 *     &lt;enumeration value="TACTICAL_REROUTE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "trajectorySourceType")
@XmlEnum
public enum TrajectorySourceType {

    @XmlEnumValue("TOS ")
    TOS("TOS "),
    FP("FP"),
    EIFP("EIFP"),
    HIST("HIST"),
    MANUAL("MANUAL"),
    DIRECT("DIRECT"),
    REROUTE("REROUTE"),
    TACTICAL_REROUTE("TACTICAL_REROUTE");
    private final String value;

    TrajectorySourceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrajectorySourceType fromValue(String v) {
        for (TrajectorySourceType c: TrajectorySourceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
