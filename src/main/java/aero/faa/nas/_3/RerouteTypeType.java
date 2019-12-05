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
 * <p>Java class for RerouteTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RerouteTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BLANK"/>
 *     &lt;enumeration value="CDR_RTE"/>
 *     &lt;enumeration value="REROUTE"/>
 *     &lt;enumeration value="UPT_RTE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RerouteTypeType")
@XmlEnum
public enum RerouteTypeType {


    /**
     * 
     *                   blank entry (for EXPLICIT selection) 
     *                
     * 
     */
    BLANK,

    /**
     * 
     *                   Coded Departure Route (retrieved from the CDR db) 
     *                
     * 
     */
    CDR_RTE,

    /**
     * 
     *                   Reroute (manually updated reroute) 
     *                
     * 
     */
    REROUTE,

    /**
     * 
     *                   User Preferred Trajectory Route (user submitted early intent route) 
     *                
     * 
     */
    UPT_RTE,

    /**
     * 
     *                   Unknown Route 
     *                
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static RerouteTypeType fromValue(String v) {
        return valueOf(v);
    }

}
