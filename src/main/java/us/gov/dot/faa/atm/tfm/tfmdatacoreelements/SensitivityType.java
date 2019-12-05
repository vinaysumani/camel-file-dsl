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
 * <p>Java class for sensitivityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="sensitivityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="R"/>
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="D"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "sensitivityType")
@XmlEnum
public enum SensitivityType {


    /**
     * Sensitive data for distribution to govenment agency only.
     * 
     */
    R,

    /**
     * Data that can be distributed to all users including delayed users.
     * 
     */
    A,

    /**
     * Duplication of sensitive data but sanitized, i.e. sensitive data removed. It can be distributed to all users except government agency.
     * 
     */
    D;

    public String value() {
        return name();
    }

    public static SensitivityType fromValue(String v) {
        return valueOf(v);
    }

}