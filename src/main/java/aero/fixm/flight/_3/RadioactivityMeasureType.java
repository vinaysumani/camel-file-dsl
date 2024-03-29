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
 * <p>Java class for RadioactivityMeasureType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RadioactivityMeasureType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GRAMS"/>
 *     &lt;enumeration value="BECQUERELS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RadioactivityMeasureType")
@XmlEnum
public enum RadioactivityMeasureType {


    /**
     * 
     *                   NOT a valid measure of a material's radioactivity, but included here to keep in line 
     *                   with the Data Dictionary. 
     *                
     * 
     */
    GRAMS,

    /**
     * 
     *                   The SI unit of radioactive activity (replaces "curie"). 
     *                
     * 
     */
    BECQUERELS;

    public String value() {
        return name();
    }

    public static RadioactivityMeasureType fromValue(String v) {
        return valueOf(v);
    }

}
