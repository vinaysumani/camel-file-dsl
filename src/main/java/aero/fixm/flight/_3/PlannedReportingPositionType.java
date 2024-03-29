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
import javax.xml.datatype.XMLGregorianCalendar;
import aero.fixm.base._3.SignificantPointType;
import aero.fixm.foundation._3.AltitudeType;


/**
 * 
 *             .Aircraft Planned Reporting Position: Estimated future position, altitude and time 
 *             of the aircraft transmitted in a non-radar airspace position report. 
 *          
 * 
 * <p>Java class for PlannedReportingPositionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlannedReportingPositionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="position" type="{http://www.fixm.aero/base/3.0}SignificantPointType" minOccurs="0"/>
 *         &lt;element name="positionAltitude" type="{http://www.fixm.aero/foundation/3.0}AltitudeType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="positionEstimatedTime" type="{http://www.fixm.aero/foundation/3.0}TimeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlannedReportingPositionType", propOrder = {
    "position",
    "positionAltitude"
})
public class PlannedReportingPositionType {

    protected SignificantPointType position;
    protected AltitudeType positionAltitude;
    @XmlAttribute(name = "positionEstimatedTime")
    protected XMLGregorianCalendar positionEstimatedTime;

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link SignificantPointType }
     *     
     */
    public SignificantPointType getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignificantPointType }
     *     
     */
    public void setPosition(SignificantPointType value) {
        this.position = value;
    }

    /**
     * Gets the value of the positionAltitude property.
     * 
     * @return
     *     possible object is
     *     {@link AltitudeType }
     *     
     */
    public AltitudeType getPositionAltitude() {
        return positionAltitude;
    }

    /**
     * Sets the value of the positionAltitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link AltitudeType }
     *     
     */
    public void setPositionAltitude(AltitudeType value) {
        this.positionAltitude = value;
    }

    /**
     * Gets the value of the positionEstimatedTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPositionEstimatedTime() {
        return positionEstimatedTime;
    }

    /**
     * Sets the value of the positionEstimatedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPositionEstimatedTime(XMLGregorianCalendar value) {
        this.positionEstimatedTime = value;
    }

}
