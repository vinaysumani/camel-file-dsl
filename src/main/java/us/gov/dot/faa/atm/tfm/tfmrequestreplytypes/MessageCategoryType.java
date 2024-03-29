//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package us.gov.dot.faa.atm.tfm.tfmrequestreplytypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for messageCategoryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="messageCategoryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CDM AFP"/>
 *     &lt;enumeration value="CDM AFP COMPRESSION"/>
 *     &lt;enumeration value="CDM AFP CANCEL"/>
 *     &lt;enumeration value="CDM GDP"/>
 *     &lt;enumeration value="CDM GDP COMPRESSION"/>
 *     &lt;enumeration value="CDM GDP ADJUSTMENT"/>
 *     &lt;enumeration value="CDM GDP CANCEL"/>
 *     &lt;enumeration value="CDM GS"/>
 *     &lt;enumeration value="GS"/>
 *     &lt;enumeration value="GS CANCEL"/>
 *     &lt;enumeration value="REROUTE"/>
 *     &lt;enumeration value="REROUTE CANCEL"/>
 *     &lt;enumeration value="CTOP"/>
 *     &lt;enumeration value="CTOP CANCEL"/>
 *     &lt;enumeration value="OTHER"/>
 *     &lt;enumeration value="ROUTE"/>
 *     &lt;enumeration value="PLAYBOOK"/>
 *     &lt;enumeration value="CDR"/>
 *     &lt;enumeration value="SPECIAL OPERATIONS"/>
 *     &lt;enumeration value="NRP SUSPENSIONS"/>
 *     &lt;enumeration value="VOLCANIC ACTIVITY"/>
 *     &lt;enumeration value="NAT"/>
 *     &lt;enumeration value="SPACE LAUNCH"/>
 *     &lt;enumeration value="FCA"/>
 *     &lt;enumeration value="FEA"/>
 *     &lt;enumeration value="INFORMATIONAL"/>
 *     &lt;enumeration value="MISCELLANEOUS"/>
 *     &lt;enumeration value="OPERATIONS PLANNING"/>
 *     &lt;enumeration value="TCA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "messageCategoryType")
@XmlEnum
public enum MessageCategoryType {

    @XmlEnumValue("CDM AFP")
    CDM_AFP("CDM AFP"),
    @XmlEnumValue("CDM AFP COMPRESSION")
    CDM_AFP_COMPRESSION("CDM AFP COMPRESSION"),
    @XmlEnumValue("CDM AFP CANCEL")
    CDM_AFP_CANCEL("CDM AFP CANCEL"),
    @XmlEnumValue("CDM GDP")
    CDM_GDP("CDM GDP"),
    @XmlEnumValue("CDM GDP COMPRESSION")
    CDM_GDP_COMPRESSION("CDM GDP COMPRESSION"),
    @XmlEnumValue("CDM GDP ADJUSTMENT")
    CDM_GDP_ADJUSTMENT("CDM GDP ADJUSTMENT"),
    @XmlEnumValue("CDM GDP CANCEL")
    CDM_GDP_CANCEL("CDM GDP CANCEL"),
    @XmlEnumValue("CDM GS")
    CDM_GS("CDM GS"),
    GS("GS"),
    @XmlEnumValue("GS CANCEL")
    GS_CANCEL("GS CANCEL"),
    REROUTE("REROUTE"),
    @XmlEnumValue("REROUTE CANCEL")
    REROUTE_CANCEL("REROUTE CANCEL"),
    CTOP("CTOP"),
    @XmlEnumValue("CTOP CANCEL")
    CTOP_CANCEL("CTOP CANCEL"),
    OTHER("OTHER"),
    ROUTE("ROUTE"),
    PLAYBOOK("PLAYBOOK"),
    CDR("CDR"),
    @XmlEnumValue("SPECIAL OPERATIONS")
    SPECIAL_OPERATIONS("SPECIAL OPERATIONS"),
    @XmlEnumValue("NRP SUSPENSIONS")
    NRP_SUSPENSIONS("NRP SUSPENSIONS"),
    @XmlEnumValue("VOLCANIC ACTIVITY")
    VOLCANIC_ACTIVITY("VOLCANIC ACTIVITY"),
    NAT("NAT"),
    @XmlEnumValue("SPACE LAUNCH")
    SPACE_LAUNCH("SPACE LAUNCH"),
    FCA("FCA"),
    FEA("FEA"),
    INFORMATIONAL("INFORMATIONAL"),
    MISCELLANEOUS("MISCELLANEOUS"),
    @XmlEnumValue("OPERATIONS PLANNING")
    OPERATIONS_PLANNING("OPERATIONS PLANNING"),
    TCA("TCA");
    private final String value;

    MessageCategoryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MessageCategoryType fromValue(String v) {
        for (MessageCategoryType c: MessageCategoryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
