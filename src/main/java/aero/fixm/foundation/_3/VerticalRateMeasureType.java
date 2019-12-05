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
 * <p>Java class for VerticalRateMeasureType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VerticalRateMeasureType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FEET_PER_MINUTE"/>
 *     &lt;enumeration value="METRES_PER_SECOND"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VerticalRateMeasureType")
@XmlEnum
public enum VerticalRateMeasureType {


    /**
     * 
     *                   Indicates VerticalRate is in ft/min ([(-3000)-3000]). 
     *                
     * 
     */
    FEET_PER_MINUTE,

    /**
     * 
     *                   Indicates VerticalRate is in m/s (if [(-15)-15] ). 
     *                
     * 
     */
    METRES_PER_SECOND;

    public String value() {
        return name();
    }

    public static VerticalRateMeasureType fromValue(String v) {
        return valueOf(v);
    }

}
