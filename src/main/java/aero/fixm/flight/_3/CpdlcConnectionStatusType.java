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
 * <p>Java class for CpdlcConnectionStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CpdlcConnectionStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_CONNECTION"/>
 *     &lt;enumeration value="CONNECTION_FAILED"/>
 *     &lt;enumeration value="CONNECTION_ESTABLISHED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CpdlcConnectionStatusType")
@XmlEnum
public enum CpdlcConnectionStatusType {

    NO_CONNECTION,
    CONNECTION_FAILED,
    CONNECTION_ESTABLISHED;

    public String value() {
        return name();
    }

    public static CpdlcConnectionStatusType fromValue(String v) {
        return valueOf(v);
    }

}
