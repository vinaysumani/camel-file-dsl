//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package aero.fixm.base._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import aero.fixm.foundation._3.AirspeedInIasOrMachType;


/**
 * 
 *             The airspeed that can be expressed as a range between a lower and upper bound. 
 *          
 * 
 * <p>Java class for AirspeedRangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirspeedRangeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lowerSpeed" type="{http://www.fixm.aero/foundation/3.0}AirspeedInIasOrMachType" minOccurs="0"/>
 *         &lt;element name="upperSpeed" type="{http://www.fixm.aero/foundation/3.0}AirspeedInIasOrMachType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirspeedRangeType", propOrder = {
    "lowerSpeed",
    "upperSpeed"
})
public class AirspeedRangeType {

    protected AirspeedInIasOrMachType lowerSpeed;
    protected AirspeedInIasOrMachType upperSpeed;

    /**
     * Gets the value of the lowerSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link AirspeedInIasOrMachType }
     *     
     */
    public AirspeedInIasOrMachType getLowerSpeed() {
        return lowerSpeed;
    }

    /**
     * Sets the value of the lowerSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirspeedInIasOrMachType }
     *     
     */
    public void setLowerSpeed(AirspeedInIasOrMachType value) {
        this.lowerSpeed = value;
    }

    /**
     * Gets the value of the upperSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link AirspeedInIasOrMachType }
     *     
     */
    public AirspeedInIasOrMachType getUpperSpeed() {
        return upperSpeed;
    }

    /**
     * Sets the value of the upperSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirspeedInIasOrMachType }
     *     
     */
    public void setUpperSpeed(AirspeedInIasOrMachType value) {
        this.upperSpeed = value;
    }

}