//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package us.gov.dot.faa.atm.tfm.ficommonmessages;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fcaRemarksType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="fcaRemarksType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NRP"/>
 *     &lt;enumeration value="MEDEVAC"/>
 *     &lt;enumeration value="CATIII"/>
 *     &lt;enumeration value="ALTRV"/>
 *     &lt;enumeration value="SWAP"/>
 *     &lt;enumeration value="DVRSN"/>
 *     &lt;enumeration value="ADCUS"/>
 *     &lt;enumeration value="FCA"/>
 *     &lt;enumeration value="WXRTE"/>
 *     &lt;enumeration value="HAR"/>
 *     &lt;enumeration value="PTP"/>
 *     &lt;enumeration value="ICR"/>
 *     &lt;enumeration value="RR"/>
 *     &lt;enumeration value="HOSP"/>
 *     &lt;enumeration value="AIREVAC"/>
 *     &lt;enumeration value="DIVERT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "fcaRemarksType")
@XmlEnum
public enum FcaRemarksType {

    NRP,
    MEDEVAC,
    CATIII,
    ALTRV,
    SWAP,
    DVRSN,
    ADCUS,
    FCA,
    WXRTE,
    HAR,
    PTP,
    ICR,
    RR,
    HOSP,
    AIREVAC,
    DIVERT;

    public String value() {
        return name();
    }

    public static FcaRemarksType fromValue(String v) {
        return valueOf(v);
    }

}
