//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package aero.faa.nas._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import aero.fixm.base._3.AtcUnitReferenceType;
import aero.fixm.flight._3.HandoffType;


/**
 * 
 *             Contains information about flight handoff between sectors. 
 *          
 * 
 * <p>Java class for NasHandoffType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NasHandoffType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixm.aero/flight/3.0}HandoffType">
 *       &lt;sequence>
 *         &lt;element name="acceptingUnit" type="{http://www.fixm.aero/base/3.0}AtcUnitReferenceType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="event" type="{http://www.faa.aero/nas/3.1}NasHandoffEventType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NasHandoffType", propOrder = {
    "acceptingUnit"
})
public class NasHandoffType
    extends HandoffType
{

    protected AtcUnitReferenceType acceptingUnit;
    @XmlAttribute(name = "event")
    protected NasHandoffEventType event;

    /**
     * Gets the value of the acceptingUnit property.
     * 
     * @return
     *     possible object is
     *     {@link AtcUnitReferenceType }
     *     
     */
    public AtcUnitReferenceType getAcceptingUnit() {
        return acceptingUnit;
    }

    /**
     * Sets the value of the acceptingUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link AtcUnitReferenceType }
     *     
     */
    public void setAcceptingUnit(AtcUnitReferenceType value) {
        this.acceptingUnit = value;
    }

    /**
     * Gets the value of the event property.
     * 
     * @return
     *     possible object is
     *     {@link NasHandoffEventType }
     *     
     */
    public NasHandoffEventType getEvent() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link NasHandoffEventType }
     *     
     */
    public void setEvent(NasHandoffEventType value) {
        this.event = value;
    }

}