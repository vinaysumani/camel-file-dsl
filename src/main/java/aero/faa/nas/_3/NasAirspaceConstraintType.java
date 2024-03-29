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
import aero.fixm.flight._3.AirspaceConstraintType;


/**
 * 
 *             Container for Airspace Slot Handling. 
 *          
 * 
 * <p>Java class for NasAirspaceConstraintType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NasAirspaceConstraintType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixm.aero/flight/3.0}AirspaceConstraintType">
 *       &lt;sequence>
 *         &lt;element name="entryTime" type="{http://www.faa.aero/nas/3.1}AirspaceEntryTimeType" minOccurs="0"/>
 *         &lt;element name="exitTime" type="{http://www.faa.aero/nas/3.1}AirspaceExitTimeType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="arrivalSlot" type="{http://www.fixm.aero/base/3.0}SlotAssignmentType" />
 *       &lt;attribute name="holdStatus" type="{http://www.faa.aero/nas/3.1}SlotHoldStatusType" />
 *       &lt;attribute name="yieldedSlot" type="{http://www.faa.aero/nas/3.1}SlotYieldedIndicatorType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NasAirspaceConstraintType", propOrder = {
    "entryTime",
    "exitTime"
})
public class NasAirspaceConstraintType
    extends AirspaceConstraintType
{

    protected AirspaceEntryTimeType entryTime;
    protected AirspaceExitTimeType exitTime;
    @XmlAttribute(name = "arrivalSlot")
    protected String arrivalSlot;
    @XmlAttribute(name = "holdStatus")
    protected SlotHoldStatusType holdStatus;
    @XmlAttribute(name = "yieldedSlot")
    protected SlotYieldedIndicatorType yieldedSlot;

    /**
     * Gets the value of the entryTime property.
     * 
     * @return
     *     possible object is
     *     {@link AirspaceEntryTimeType }
     *     
     */
    public AirspaceEntryTimeType getEntryTime() {
        return entryTime;
    }

    /**
     * Sets the value of the entryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirspaceEntryTimeType }
     *     
     */
    public void setEntryTime(AirspaceEntryTimeType value) {
        this.entryTime = value;
    }

    /**
     * Gets the value of the exitTime property.
     * 
     * @return
     *     possible object is
     *     {@link AirspaceExitTimeType }
     *     
     */
    public AirspaceExitTimeType getExitTime() {
        return exitTime;
    }

    /**
     * Sets the value of the exitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirspaceExitTimeType }
     *     
     */
    public void setExitTime(AirspaceExitTimeType value) {
        this.exitTime = value;
    }

    /**
     * Gets the value of the arrivalSlot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalSlot() {
        return arrivalSlot;
    }

    /**
     * Sets the value of the arrivalSlot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalSlot(String value) {
        this.arrivalSlot = value;
    }

    /**
     * Gets the value of the holdStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SlotHoldStatusType }
     *     
     */
    public SlotHoldStatusType getHoldStatus() {
        return holdStatus;
    }

    /**
     * Sets the value of the holdStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SlotHoldStatusType }
     *     
     */
    public void setHoldStatus(SlotHoldStatusType value) {
        this.holdStatus = value;
    }

    /**
     * Gets the value of the yieldedSlot property.
     * 
     * @return
     *     possible object is
     *     {@link SlotYieldedIndicatorType }
     *     
     */
    public SlotYieldedIndicatorType getYieldedSlot() {
        return yieldedSlot;
    }

    /**
     * Sets the value of the yieldedSlot property.
     * 
     * @param value
     *     allowed object is
     *     {@link SlotYieldedIndicatorType }
     *     
     */
    public void setYieldedSlot(SlotYieldedIndicatorType value) {
        this.yieldedSlot = value;
    }

}
