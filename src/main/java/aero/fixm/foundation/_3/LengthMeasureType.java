//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package aero.fixm.foundation._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LengthMeasureType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LengthMeasureType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FEET"/>
 *     &lt;enumeration value="INCHES"/>
 *     &lt;enumeration value="METRES"/>
 *     &lt;enumeration value="CENTIMETRES"/>
 *     &lt;enumeration value="MILLIMETRES"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LengthMeasureType")
@XmlEnum
public enum LengthMeasureType {


    /**
     * 
     *                   Indicates length is measured in feet. 
     *                
     * 
     */
    FEET,

    /**
     * 
     *                   Indicates length is measured in inches. 
     *                
     * 
     */
    INCHES,

    /**
     * 
     *                   Indicates length is measured in meters. 
     *                
     * 
     */
    METRES,

    /**
     * 
     *                   Indicates length is measured in centimeters. 
     *                
     * 
     */
    CENTIMETRES,

    /**
     * 
     *                   Indicates length is measured in millimeters. 
     *                
     * 
     */
    MILLIMETRES;

    public String value() {
        return name();
    }

    public static LengthMeasureType fromValue(String v) {
        return valueOf(v);
    }

}
