//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package aero.fixm.base._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DelegatedUnitIndicatorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DelegatedUnitIndicatorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AUTHORITY_DELEGATED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DelegatedUnitIndicatorType")
@XmlEnum
public enum DelegatedUnitIndicatorType {


    /**
     * 
     *                   If present, indicates that the controlling unit has been delegated authority for 
     *                   the flight. 
     *                
     * 
     */
    AUTHORITY_DELEGATED;

    public String value() {
        return name();
    }

    public static DelegatedUnitIndicatorType fromValue(String v) {
        return valueOf(v);
    }

}
