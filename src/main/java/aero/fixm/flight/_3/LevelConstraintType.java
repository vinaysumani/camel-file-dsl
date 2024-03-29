//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package aero.fixm.flight._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import aero.fixm.foundation._3.AltitudeType;


/**
 * 
 *             .Route-Change Speed and Altitude: The planned speed and altitude the aircraft will 
 *             change to either prior to, or after reaching, the associated Significant Point along 
 *             its Route. 
 *             .Change Speed and Altitude: The planned speed and altitude that the aircraft will 
 *             change to upon reaching the associated Significant Point along its Route. 
 *          
 * 
 * <p>Java class for LevelConstraintType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LevelConstraintType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixm.aero/flight/3.0}RouteConstraintOrPreferenceType">
 *       &lt;sequence>
 *         &lt;element name="level" type="{http://www.fixm.aero/foundation/3.0}AltitudeType" minOccurs="0"/>
 *         &lt;element name="timeConstraint" type="{http://www.fixm.aero/flight/3.0}TimeConstraintType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="positionQualification" type="{http://www.fixm.aero/flight/3.0}PositionQualifierType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LevelConstraintType", propOrder = {
    "level",
    "timeConstraint"
})
public class LevelConstraintType
    extends RouteConstraintOrPreferenceType
{

    protected AltitudeType level;
    protected TimeConstraintType timeConstraint;
    @XmlAttribute(name = "positionQualification")
    protected PositionQualifierType positionQualification;

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link AltitudeType }
     *     
     */
    public AltitudeType getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link AltitudeType }
     *     
     */
    public void setLevel(AltitudeType value) {
        this.level = value;
    }

    /**
     * Gets the value of the timeConstraint property.
     * 
     * @return
     *     possible object is
     *     {@link TimeConstraintType }
     *     
     */
    public TimeConstraintType getTimeConstraint() {
        return timeConstraint;
    }

    /**
     * Sets the value of the timeConstraint property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeConstraintType }
     *     
     */
    public void setTimeConstraint(TimeConstraintType value) {
        this.timeConstraint = value;
    }

    /**
     * Gets the value of the positionQualification property.
     * 
     * @return
     *     possible object is
     *     {@link PositionQualifierType }
     *     
     */
    public PositionQualifierType getPositionQualification() {
        return positionQualification;
    }

    /**
     * Sets the value of the positionQualification property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionQualifierType }
     *     
     */
    public void setPositionQualification(PositionQualifierType value) {
        this.positionQualification = value;
    }

}
