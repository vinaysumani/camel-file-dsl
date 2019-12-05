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
 * <p>Java class for PressureMeasureType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PressureMeasureType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ATMOSPHERES"/>
 *     &lt;enumeration value="BAR"/>
 *     &lt;enumeration value="HECTOPASCAL"/>
 *     &lt;enumeration value="PASCAL"/>
 *     &lt;enumeration value="POUNDS_PER_SQUARE_INCH"/>
 *     &lt;enumeration value="TORR"/>
 *     &lt;enumeration value="MILLIBAR"/>
 *     &lt;enumeration value="INCHES_OF_MERCURY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PressureMeasureType")
@XmlEnum
public enum PressureMeasureType {


    /**
     * 
     *                   Atmosphere. 
     *                
     * 
     */
    ATMOSPHERES,

    /**
     * 
     *                   Bar. 
     *                
     * 
     */
    BAR,

    /**
     * 
     *                   Hectopascal. 
     *                
     * 
     */
    HECTOPASCAL,

    /**
     * 
     *                   Pascal. 
     *                
     * 
     */
    PASCAL,

    /**
     * 
     *                   Pounds per square inch. 
     *                
     * 
     */
    POUNDS_PER_SQUARE_INCH,

    /**
     * 
     *                   Torr. 
     *                
     * 
     */
    TORR,

    /**
     * 
     *                   Millibar. 
     *                
     * 
     */
    MILLIBAR,

    /**
     * 
     *                   Inches of mercury 
     *                
     * 
     */
    INCHES_OF_MERCURY;

    public String value() {
        return name();
    }

    public static PressureMeasureType fromValue(String v) {
        return valueOf(v);
    }

}