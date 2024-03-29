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
 * <p>Java class for AdvisoryTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AdvisoryTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GDP"/>
 *     &lt;enumeration value="AFP"/>
 *     &lt;enumeration value="GDP_CANCEL"/>
 *     &lt;enumeration value="AFP_CANCEL"/>
 *     &lt;enumeration value="GS"/>
 *     &lt;enumeration value="GS_CANCEL"/>
 *     &lt;enumeration value="REROUTE"/>
 *     &lt;enumeration value="CTOP"/>
 *     &lt;enumeration value="CTOP_CANCEL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AdvisoryTypeType")
@XmlEnum
public enum AdvisoryTypeType {


    /**
     * 
     *                   Ground Delay Program Advisory 
     *                
     * 
     */
    GDP,

    /**
     * 
     *                   Airspace Flow Program Advisory 
     *                
     * 
     */
    AFP,

    /**
     * 
     *                   Ground Delay Program cancellation Advisory 
     *                
     * 
     */
    GDP_CANCEL,

    /**
     * 
     *                   Airspace Flow Program Cancellation Advisory 
     *                
     * 
     */
    AFP_CANCEL,

    /**
     * 
     *                   Ground Stop Program Advisory 
     *                
     * 
     */
    GS,

    /**
     * 
     *                   Ground Stop Program cancellation Advisory 
     *                
     * 
     */
    GS_CANCEL,

    /**
     * 
     *                   Reroute Advisory 
     *                
     * 
     */
    REROUTE,

    /**
     * 
     *                   Collaborative Trajectory Options Program Advisory 
     *                
     * 
     */
    CTOP,

    /**
     * 
     *                   Collaborative Trajectory Options Program cancellation Advisory 
     *                
     * 
     */
    CTOP_CANCEL;

    public String value() {
        return name();
    }

    public static AdvisoryTypeType fromValue(String v) {
        return valueOf(v);
    }

}
