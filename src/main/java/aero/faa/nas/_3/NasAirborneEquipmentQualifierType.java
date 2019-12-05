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
 * <p>Java class for NasAirborneEquipmentQualifierType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NasAirborneEquipmentQualifierType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="X"/>
 *     &lt;enumeration value="T"/>
 *     &lt;enumeration value="U"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="B"/>
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="Y"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="H"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="G"/>
 *     &lt;enumeration value="V"/>
 *     &lt;enumeration value="Z"/>
 *     &lt;enumeration value="L"/>
 *     &lt;enumeration value="W"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NasAirborneEquipmentQualifierType")
@XmlEnum
public enum NasAirborneEquipmentQualifierType {


    /**
     * 
     *                   No RVSM, No DME, No transponder 
     *                
     * 
     */
    X,

    /**
     * 
     *                   No RVSM, No DME, Transponder with no mode C 
     *                
     * 
     */
    T,

    /**
     * 
     *                   No RVSM, No DME: Transponder with mode C 
     *                
     * 
     */
    U,

    /**
     * 
     *                   DME: No transponder 
     *                
     * 
     */
    D,

    /**
     * 
     *                   DME: Transponder with no mode C 
     *                
     * 
     */
    B,

    /**
     * 
     *                   DME: Transponder with mode C 
     *                
     * 
     */
    A,

    /**
     * 
     *                   TACAN ONLY: No transponder 
     *                
     * 
     */
    M,

    /**
     * 
     *                   TACAN ONLY: Transponder with no mode C 
     *                
     * 
     */
    N,

    /**
     * 
     *                   TACAN ONLY: Transponder with mode C 
     *                
     * 
     */
    P,

    /**
     * 
     *                   LORAN,VORDME,INS,RNAV: No transponder 
     *                
     * 
     */
    Y,

    /**
     * 
     *                   LORAN,VORDME,INS,RNAV: Transponder with no mode C 
     *                
     * 
     */
    C,

    /**
     * 
     *                   LORAN,VORDME,INSRNAV: Transponder with mode C 
     *                
     * 
     */
    I,

    /**
     * 
     *                   RVSM, Failed transponder or Failed Mode C capability 
     *                
     * 
     */
    H,

    /**
     * 
     *                   ADVANCED RNAV, TRANSPONDER, MODE C: FMS with DMEDME position updating 
     *                
     * 
     */
    S,

    /**
     * 
     *                   ADVANCED RNAV, TRANSPONDER, MODE C: Global Navigation Satellite System (GNSS), including 
     *                   GPS or Wide Area Augmentation System (WAAS), with en?route and terminal capability. 
     *                   
     *                
     * 
     */
    G,

    /**
     * 
     *                   ADVANCED RNAV, TRANSPONDER, MODE C: Required Navigational Performance (RNP). The 
     *                   aircraft meets the RNP type prescribed for the route segments, routes and/or area 
     *                   concerned 
     *                
     * 
     */
    V,

    /**
     * 
     *                   REDUCED VERTICAL SEPARATION MINIMUM (RVSM): E with RVSM 
     *                
     * 
     */
    Z,

    /**
     * 
     *                   REDUCED VERTICAL SEPARATION MINIMUM (RVSM): G with RVSM 
     *                
     * 
     */
    L,

    /**
     * 
     *                   REDUCED VERTICAL SEPARATION MINIMUM (RVSM): RVSM 
     *                
     * 
     */
    W;

    public String value() {
        return name();
    }

    public static NasAirborneEquipmentQualifierType fromValue(String v) {
        return valueOf(v);
    }

}
