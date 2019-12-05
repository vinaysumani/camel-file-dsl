//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package aero.fixm.flight._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import aero.faa.nas._3.NasEnRouteType;
import aero.fixm.base._3.AerodromeReferenceType;
import aero.fixm.base._3.FeatureType;


/**
 * 
 *             Groups the en route information about the flight such as the current position, coordination 
 *             between air traffic units, and boundary crossing throughout the duration of the flight. 
 *             
 *          
 * 
 * <p>Java class for EnRouteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnRouteType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixm.aero/base/3.0}FeatureType">
 *       &lt;sequence>
 *         &lt;element name="alternateAerodrome" type="{http://www.fixm.aero/base/3.0}AerodromeReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="beaconCodeAssignment" type="{http://www.fixm.aero/flight/3.0}BeaconCodeAssignmentType" minOccurs="0"/>
 *         &lt;element name="boundaryCrossings" type="{http://www.fixm.aero/flight/3.0}UnitBoundaryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cleared" type="{http://www.fixm.aero/flight/3.0}ClearedFlightInformationType" minOccurs="0"/>
 *         &lt;element name="controlElement" type="{http://www.fixm.aero/flight/3.0}ControlElementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cpdlcConnection" type="{http://www.fixm.aero/flight/3.0}CpdlcConnectionType" minOccurs="0"/>
 *         &lt;element name="pointout" type="{http://www.fixm.aero/flight/3.0}PointoutType" minOccurs="0"/>
 *         &lt;element name="position" type="{http://www.fixm.aero/flight/3.0}AircraftPositionType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="fleetPrioritization" type="{http://www.fixm.aero/base/3.0}FleetPriorityType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnRouteType", propOrder = {
    "alternateAerodrome",
    "beaconCodeAssignment",
    "boundaryCrossings",
    "cleared",
    "controlElement",
    "cpdlcConnection",
    "pointout",
    "position"
})
@XmlSeeAlso({
    NasEnRouteType.class
})
public class EnRouteType
    extends FeatureType
{

    protected List<AerodromeReferenceType> alternateAerodrome;
    protected BeaconCodeAssignmentType beaconCodeAssignment;
    protected List<UnitBoundaryType> boundaryCrossings;
    protected ClearedFlightInformationType cleared;
    @XmlElement(nillable = true)
    protected List<ControlElementType> controlElement;
    protected CpdlcConnectionType cpdlcConnection;
    @XmlElementRef(name = "pointout", type = JAXBElement.class, required = false)
    protected JAXBElement<PointoutType> pointout;
    protected AircraftPositionType position;
    @XmlAttribute(name = "fleetPrioritization")
    protected Integer fleetPrioritization;

    /**
     * Gets the value of the alternateAerodrome property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternateAerodrome property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternateAerodrome().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AerodromeReferenceType }
     * 
     * 
     */
    public List<AerodromeReferenceType> getAlternateAerodrome() {
        if (alternateAerodrome == null) {
            alternateAerodrome = new ArrayList<AerodromeReferenceType>();
        }
        return this.alternateAerodrome;
    }

    /**
     * Gets the value of the beaconCodeAssignment property.
     * 
     * @return
     *     possible object is
     *     {@link BeaconCodeAssignmentType }
     *     
     */
    public BeaconCodeAssignmentType getBeaconCodeAssignment() {
        return beaconCodeAssignment;
    }

    /**
     * Sets the value of the beaconCodeAssignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeaconCodeAssignmentType }
     *     
     */
    public void setBeaconCodeAssignment(BeaconCodeAssignmentType value) {
        this.beaconCodeAssignment = value;
    }

    /**
     * Gets the value of the boundaryCrossings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boundaryCrossings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoundaryCrossings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnitBoundaryType }
     * 
     * 
     */
    public List<UnitBoundaryType> getBoundaryCrossings() {
        if (boundaryCrossings == null) {
            boundaryCrossings = new ArrayList<UnitBoundaryType>();
        }
        return this.boundaryCrossings;
    }

    /**
     * Gets the value of the cleared property.
     * 
     * @return
     *     possible object is
     *     {@link ClearedFlightInformationType }
     *     
     */
    public ClearedFlightInformationType getCleared() {
        return cleared;
    }

    /**
     * Sets the value of the cleared property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearedFlightInformationType }
     *     
     */
    public void setCleared(ClearedFlightInformationType value) {
        this.cleared = value;
    }

    /**
     * Gets the value of the controlElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the controlElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getControlElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ControlElementType }
     * 
     * 
     */
    public List<ControlElementType> getControlElement() {
        if (controlElement == null) {
            controlElement = new ArrayList<ControlElementType>();
        }
        return this.controlElement;
    }

    /**
     * Gets the value of the cpdlcConnection property.
     * 
     * @return
     *     possible object is
     *     {@link CpdlcConnectionType }
     *     
     */
    public CpdlcConnectionType getCpdlcConnection() {
        return cpdlcConnection;
    }

    /**
     * Sets the value of the cpdlcConnection property.
     * 
     * @param value
     *     allowed object is
     *     {@link CpdlcConnectionType }
     *     
     */
    public void setCpdlcConnection(CpdlcConnectionType value) {
        this.cpdlcConnection = value;
    }

    /**
     * Gets the value of the pointout property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PointoutType }{@code >}
     *     
     */
    public JAXBElement<PointoutType> getPointout() {
        return pointout;
    }

    /**
     * Sets the value of the pointout property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PointoutType }{@code >}
     *     
     */
    public void setPointout(JAXBElement<PointoutType> value) {
        this.pointout = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link AircraftPositionType }
     *     
     */
    public AircraftPositionType getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link AircraftPositionType }
     *     
     */
    public void setPosition(AircraftPositionType value) {
        this.position = value;
    }

    /**
     * Gets the value of the fleetPrioritization property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFleetPrioritization() {
        return fleetPrioritization;
    }

    /**
     * Sets the value of the fleetPrioritization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFleetPrioritization(Integer value) {
        this.fleetPrioritization = value;
    }

}
