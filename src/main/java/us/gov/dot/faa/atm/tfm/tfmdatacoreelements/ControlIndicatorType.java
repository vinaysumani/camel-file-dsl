//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package us.gov.dot.faa.atm.tfm.tfmdatacoreelements;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for controlIndicatorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="controlIndicatorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONTROL_ACTIVE"/>
 *     &lt;enumeration value="CONTROL_CANCELED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "controlIndicatorType")
@XmlEnum
public enum ControlIndicatorType {


    /**
     * Flight control active.
     * 
     */
    CONTROL_ACTIVE,

    /**
     * Flight control cancelled
     * 
     */
    CONTROL_CANCELED;

    public String value() {
        return name();
    }

    public static ControlIndicatorType fromValue(String v) {
        return valueOf(v);
    }

}
