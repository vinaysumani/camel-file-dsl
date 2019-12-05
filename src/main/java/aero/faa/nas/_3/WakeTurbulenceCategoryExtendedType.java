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
 * <p>Java class for WakeTurbulenceCategoryExtendedType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WakeTurbulenceCategoryExtendedType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="B"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="F"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WakeTurbulenceCategoryExtendedType")
@XmlEnum
public enum WakeTurbulenceCategoryExtendedType {


    /**
     * 
     *                   Aircraft capable of MTOW of 300,000 pounds or more and a wingspan greater than 245 
     *                   feet. 
     *                
     * 
     */
    A,

    /**
     * 
     *                   Aircraft capable of MTOW of 300,000 pounds or more and a wingspan greater than 175 
     *                   feet and less than or equal to 245 feet. 
     *                
     * 
     */
    B,

    /**
     * 
     *                   Aircraft capable of a MTOW of 300,000 pounds or more and a wingspan greater than 
     *                   125 feet and less than or equal to 175 feet. 
     *                
     * 
     */
    C,

    /**
     * 
     *                   Aircraft capable of a MTOW of less than 300,000 pounds and a wingspan greater than 
     *                   125 feet and less than or equal to 175 feet, or aircraft with a wingspan greater 
     *                   than 90 feet and less than or equal to 125 feet. 
     *                
     * 
     */
    D,

    /**
     * 
     *                   Aircraft capable of a MTOW greater than 41,000 pounds with a wingspan greater than 
     *                   65 feet and less than or equal to 90 feet. 
     *                
     * 
     */
    E,

    /**
     * 
     *                   Aircraft capable of a MTOW of less than 41,000 pounds and a wingspan less than or 
     *                   equal to 125 feet, or aircraft capable of a MTOW less than 15,500 pounds regardless 
     *                   of wingspan, or a powered sailplane. 
     *                
     * 
     */
    F;

    public String value() {
        return name();
    }

    public static WakeTurbulenceCategoryExtendedType fromValue(String v) {
        return valueOf(v);
    }

}