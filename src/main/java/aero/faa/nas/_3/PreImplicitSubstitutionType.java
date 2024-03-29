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
import aero.fixm.base._3.ReportedTimeType;


/**
 * 
 *             .Pre-Implicit Substitution Flight Information: A container which provides for a flight 
 *             the flight information which was valid prior to an implicit substitution 
 *          
 * 
 * <p>Java class for PreImplicitSubstitutionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreImplicitSubstitutionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="controlledRunwayDepTime" type="{http://www.fixm.aero/base/3.0}ReportedTimeType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="slot" type="{http://www.fixm.aero/base/3.0}FreeTextType" />
 *       &lt;attribute name="trajectoryIdentifier" type="{http://www.fixm.aero/base/3.0}CountType" />
 *       &lt;attribute name="trajectoryTotalCost" type="{http://www.fixm.aero/base/3.0}CountType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreImplicitSubstitutionType", propOrder = {
    "controlledRunwayDepTime"
})
public class PreImplicitSubstitutionType {

    protected ReportedTimeType controlledRunwayDepTime;
    @XmlAttribute(name = "slot")
    protected String slot;
    @XmlAttribute(name = "trajectoryIdentifier")
    protected Integer trajectoryIdentifier;
    @XmlAttribute(name = "trajectoryTotalCost")
    protected Integer trajectoryTotalCost;

    /**
     * Gets the value of the controlledRunwayDepTime property.
     * 
     * @return
     *     possible object is
     *     {@link ReportedTimeType }
     *     
     */
    public ReportedTimeType getControlledRunwayDepTime() {
        return controlledRunwayDepTime;
    }

    /**
     * Sets the value of the controlledRunwayDepTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportedTimeType }
     *     
     */
    public void setControlledRunwayDepTime(ReportedTimeType value) {
        this.controlledRunwayDepTime = value;
    }

    /**
     * Gets the value of the slot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlot() {
        return slot;
    }

    /**
     * Sets the value of the slot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlot(String value) {
        this.slot = value;
    }

    /**
     * Gets the value of the trajectoryIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTrajectoryIdentifier() {
        return trajectoryIdentifier;
    }

    /**
     * Sets the value of the trajectoryIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTrajectoryIdentifier(Integer value) {
        this.trajectoryIdentifier = value;
    }

    /**
     * Gets the value of the trajectoryTotalCost property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTrajectoryTotalCost() {
        return trajectoryTotalCost;
    }

    /**
     * Sets the value of the trajectoryTotalCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTrajectoryTotalCost(Integer value) {
        this.trajectoryTotalCost = value;
    }

}
