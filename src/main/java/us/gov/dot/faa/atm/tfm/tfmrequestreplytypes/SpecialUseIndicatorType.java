//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package us.gov.dot.faa.atm.tfm.tfmrequestreplytypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for specialUseIndicatorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="specialUseIndicatorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VFR"/>
 *     &lt;enumeration value="DVFR"/>
 *     &lt;enumeration value="AFIL"/>
 *     &lt;enumeration value="AFILE"/>
 *     &lt;enumeration value="DCT"/>
 *     &lt;enumeration value="DIRCT"/>
 *     &lt;enumeration value="DRCT"/>
 *     &lt;enumeration value="DR"/>
 *     &lt;enumeration value="RNAV"/>
 *     &lt;enumeration value="RV"/>
 *     &lt;enumeration value="TLTP"/>
 *     &lt;enumeration value="AVFR"/>
 *     &lt;enumeration value="XXX"/>
 *     &lt;enumeration value="ZZZZ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "specialUseIndicatorType")
@XmlEnum
public enum SpecialUseIndicatorType {

    VFR,
    DVFR,
    AFIL,
    AFILE,
    DCT,
    DIRCT,
    DRCT,
    DR,
    RNAV,
    RV,
    TLTP,
    AVFR,
    XXX,
    ZZZZ;

    public String value() {
        return name();
    }

    public static SpecialUseIndicatorType fromValue(String v) {
        return valueOf(v);
    }

}
