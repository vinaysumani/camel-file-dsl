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
 * <p>Java class for SurvivalEquipmentCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SurvivalEquipmentCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="POLAR"/>
 *     &lt;enumeration value="DESERT"/>
 *     &lt;enumeration value="MARITIME"/>
 *     &lt;enumeration value="JUNGLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SurvivalEquipmentCodeType")
@XmlEnum
public enum SurvivalEquipmentCodeType {

    POLAR,
    DESERT,
    MARITIME,
    JUNGLE;

    public String value() {
        return name();
    }

    public static SurvivalEquipmentCodeType fromValue(String v) {
        return valueOf(v);
    }

}