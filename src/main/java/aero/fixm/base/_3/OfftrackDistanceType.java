//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package aero.fixm.base._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import aero.fixm.foundation._3.DistanceType;


/**
 * 
 *             Represents an offtrack distance that is lateral relative to a location expressed 
 *             by a distance measurement and offset direction. 
 *          
 * 
 * <p>Java class for OfftrackDistanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfftrackDistanceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="distance" type="{http://www.fixm.aero/foundation/3.0}DistanceType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="direction" type="{http://www.fixm.aero/base/3.0}OfftrackDirectionType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfftrackDistanceType", propOrder = {
    "distance"
})
public class OfftrackDistanceType {

    protected DistanceType distance;
    @XmlAttribute(name = "direction")
    protected OfftrackDirectionType direction;

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link DistanceType }
     *     
     */
    public DistanceType getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceType }
     *     
     */
    public void setDistance(DistanceType value) {
        this.distance = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link OfftrackDirectionType }
     *     
     */
    public OfftrackDirectionType getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfftrackDirectionType }
     *     
     */
    public void setDirection(OfftrackDirectionType value) {
        this.direction = value;
    }

}
