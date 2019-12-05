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
 * <p>Java class for SfdpsFlightStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SfdpsFlightStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PROPOSED"/>
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="COMPLETED"/>
 *     &lt;enumeration value="CANCELLED"/>
 *     &lt;enumeration value="DROPPED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SfdpsFlightStatusType")
@XmlEnum
public enum SfdpsFlightStatusType {


    /**
     * 
     *                   There is at least one non-cancelled flight plan in place and the flight has not yet 
     *                   become airborne. 
     *                
     * 
     */
    PROPOSED,

    /**
     * 
     *                   Flight is airborne and updates are still being generated for the flight. 
     *                
     * 
     */
    ACTIVE,

    /**
     * 
     *                   Flight has landed at its destination. 
     *                
     * 
     */
    COMPLETED,

    /**
     * 
     *                   There are only cancelled flight plans for the flight and it was never airborne. 
     *                
     * 
     */
    CANCELLED,

    /**
     * 
     *                   Data updates terminated before the flight landed. It is unknown whether the flight 
     *                   is still airborne or not. This could be a flight that has left FAA airspace or a 
     *                   flight that has switched to Visual Flight Rules. 
     *                
     * 
     */
    DROPPED;

    public String value() {
        return name();
    }

    public static SfdpsFlightStatusType fromValue(String v) {
        return valueOf(v);
    }

}
