//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package us.gov.dot.faa.atm.tfm.ficommonmessages2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tmiTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tmiTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AFP"/>
 *     &lt;enumeration value="GDP"/>
 *     &lt;enumeration value="GS"/>
 *     &lt;enumeration value="BLKT"/>
 *     &lt;enumeration value="COMP"/>
 *     &lt;enumeration value="CTOP"/>
 *     &lt;enumeration value="FXA"/>
 *     &lt;enumeration value="REROUTE"/>
 *     &lt;enumeration value="TACTICAL_REROUTE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tmiTypeType")
@XmlEnum
public enum TmiTypeType {

    AFP,
    GDP,
    GS,
    BLKT,
    COMP,
    CTOP,
    FXA,
    REROUTE,
    TACTICAL_REROUTE;

    public String value() {
        return name();
    }

    public static TmiTypeType fromValue(String v) {
        return valueOf(v);
    }

}