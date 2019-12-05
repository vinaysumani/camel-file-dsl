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
 * <p>Java class for AircraftDangerousGoodsLimitationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AircraftDangerousGoodsLimitationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PASSENGER_AND_CARGO_AIRCRAFT"/>
 *     &lt;enumeration value="CARGO_AIRCRAFT_ONLY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AircraftDangerousGoodsLimitationType")
@XmlEnum
public enum AircraftDangerousGoodsLimitationType {


    /**
     * 
     *                   Specified that the shipment is packed to comply with the limitations prescribed for 
     *                   passenger and cargo aircraft. 
     *                
     * 
     */
    PASSENGER_AND_CARGO_AIRCRAFT,

    /**
     * 
     *                   Specified that the shipment is packed to comply with the limitations prescribed for 
     *                   the limitations for cargo aircraft only. 
     *                
     * 
     */
    CARGO_AIRCRAFT_ONLY;

    public String value() {
        return name();
    }

    public static AircraftDangerousGoodsLimitationType fromValue(String v) {
        return valueOf(v);
    }

}
