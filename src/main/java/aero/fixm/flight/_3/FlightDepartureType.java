//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package aero.fixm.flight._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import aero.faa.nas._3.NasDepartureType;
import aero.fixm.base._3.AerodromeReferenceType;
import aero.fixm.base._3.FeatureType;
import aero.fixm.base._3.MultiTimeType;
import aero.fixm.base._3.RunwayPositionAndTimeType;
import aero.fixm.base._3.SignificantPointType;
import aero.fixm.base._3.StandPositionAndTimeType;
import aero.fixm.base._3.TargetMultiTimeType;
import aero.fixm.foundation._3.WeightType;


/**
 * 
 *             Groups information pertaining to the flight's departure. 
 *          
 * 
 * <p>Java class for FlightDepartureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightDepartureType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixm.aero/base/3.0}FeatureType">
 *       &lt;sequence>
 *         &lt;element name="departureAerodrome" type="{http://www.fixm.aero/base/3.0}AerodromeReferenceType" minOccurs="0"/>
 *         &lt;element name="departureFix" type="{http://www.fixm.aero/base/3.0}SignificantPointType" minOccurs="0"/>
 *         &lt;element name="departureFixTime" type="{http://www.fixm.aero/base/3.0}MultiTimeType" minOccurs="0"/>
 *         &lt;element name="departureTimes" type="{http://www.fixm.aero/flight/3.0}DepartureActivityTimesType" minOccurs="0"/>
 *         &lt;element name="offBlockReadyTime" type="{http://www.fixm.aero/base/3.0}TargetMultiTimeType" minOccurs="0"/>
 *         &lt;element name="runwayPositionAndTime" type="{http://www.fixm.aero/base/3.0}RunwayPositionAndTimeType" minOccurs="0"/>
 *         &lt;element name="standPositionAndTime" type="{http://www.fixm.aero/base/3.0}StandPositionAndTimeType" minOccurs="0"/>
 *         &lt;element name="takeoffAlternateAerodrome" type="{http://www.fixm.aero/base/3.0}AerodromeReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="takeoffWeight" type="{http://www.fixm.aero/foundation/3.0}WeightType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="departureFleetPrioritization" type="{http://www.fixm.aero/base/3.0}FleetPriorityType" />
 *       &lt;attribute name="departureSlot" type="{http://www.fixm.aero/base/3.0}SlotAssignmentType" />
 *       &lt;attribute name="earliestOffBlockTime" type="{http://www.fixm.aero/foundation/3.0}TimeType" />
 *       &lt;attribute name="standardInstrumentDeparture" type="{http://www.fixm.aero/base/3.0}StandardInstrumentRouteDesignatorType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightDepartureType", propOrder = {
    "departureAerodrome",
    "departureFix",
    "departureFixTime",
    "departureTimes",
    "offBlockReadyTime",
    "runwayPositionAndTime",
    "standPositionAndTime",
    "takeoffAlternateAerodrome",
    "takeoffWeight"
})
@XmlSeeAlso({
    NasDepartureType.class
})
public class FlightDepartureType
    extends FeatureType
{

    protected AerodromeReferenceType departureAerodrome;
    protected SignificantPointType departureFix;
    protected MultiTimeType departureFixTime;
    protected DepartureActivityTimesType departureTimes;
    protected TargetMultiTimeType offBlockReadyTime;
    protected RunwayPositionAndTimeType runwayPositionAndTime;
    protected StandPositionAndTimeType standPositionAndTime;
    protected List<AerodromeReferenceType> takeoffAlternateAerodrome;
    protected WeightType takeoffWeight;
    @XmlAttribute(name = "departureFleetPrioritization")
    protected Integer departureFleetPrioritization;
    @XmlAttribute(name = "departureSlot")
    protected String departureSlot;
    @XmlAttribute(name = "earliestOffBlockTime")
    protected XMLGregorianCalendar earliestOffBlockTime;
    @XmlAttribute(name = "standardInstrumentDeparture")
    protected String standardInstrumentDeparture;

    /**
     * Gets the value of the departureAerodrome property.
     * 
     * @return
     *     possible object is
     *     {@link AerodromeReferenceType }
     *     
     */
    public AerodromeReferenceType getDepartureAerodrome() {
        return departureAerodrome;
    }

    /**
     * Sets the value of the departureAerodrome property.
     * 
     * @param value
     *     allowed object is
     *     {@link AerodromeReferenceType }
     *     
     */
    public void setDepartureAerodrome(AerodromeReferenceType value) {
        this.departureAerodrome = value;
    }

    /**
     * Gets the value of the departureFix property.
     * 
     * @return
     *     possible object is
     *     {@link SignificantPointType }
     *     
     */
    public SignificantPointType getDepartureFix() {
        return departureFix;
    }

    /**
     * Sets the value of the departureFix property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignificantPointType }
     *     
     */
    public void setDepartureFix(SignificantPointType value) {
        this.departureFix = value;
    }

    /**
     * Gets the value of the departureFixTime property.
     * 
     * @return
     *     possible object is
     *     {@link MultiTimeType }
     *     
     */
    public MultiTimeType getDepartureFixTime() {
        return departureFixTime;
    }

    /**
     * Sets the value of the departureFixTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiTimeType }
     *     
     */
    public void setDepartureFixTime(MultiTimeType value) {
        this.departureFixTime = value;
    }

    /**
     * Gets the value of the departureTimes property.
     * 
     * @return
     *     possible object is
     *     {@link DepartureActivityTimesType }
     *     
     */
    public DepartureActivityTimesType getDepartureTimes() {
        return departureTimes;
    }

    /**
     * Sets the value of the departureTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartureActivityTimesType }
     *     
     */
    public void setDepartureTimes(DepartureActivityTimesType value) {
        this.departureTimes = value;
    }

    /**
     * Gets the value of the offBlockReadyTime property.
     * 
     * @return
     *     possible object is
     *     {@link TargetMultiTimeType }
     *     
     */
    public TargetMultiTimeType getOffBlockReadyTime() {
        return offBlockReadyTime;
    }

    /**
     * Sets the value of the offBlockReadyTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetMultiTimeType }
     *     
     */
    public void setOffBlockReadyTime(TargetMultiTimeType value) {
        this.offBlockReadyTime = value;
    }

    /**
     * Gets the value of the runwayPositionAndTime property.
     * 
     * @return
     *     possible object is
     *     {@link RunwayPositionAndTimeType }
     *     
     */
    public RunwayPositionAndTimeType getRunwayPositionAndTime() {
        return runwayPositionAndTime;
    }

    /**
     * Sets the value of the runwayPositionAndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link RunwayPositionAndTimeType }
     *     
     */
    public void setRunwayPositionAndTime(RunwayPositionAndTimeType value) {
        this.runwayPositionAndTime = value;
    }

    /**
     * Gets the value of the standPositionAndTime property.
     * 
     * @return
     *     possible object is
     *     {@link StandPositionAndTimeType }
     *     
     */
    public StandPositionAndTimeType getStandPositionAndTime() {
        return standPositionAndTime;
    }

    /**
     * Sets the value of the standPositionAndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandPositionAndTimeType }
     *     
     */
    public void setStandPositionAndTime(StandPositionAndTimeType value) {
        this.standPositionAndTime = value;
    }

    /**
     * Gets the value of the takeoffAlternateAerodrome property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the takeoffAlternateAerodrome property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTakeoffAlternateAerodrome().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AerodromeReferenceType }
     * 
     * 
     */
    public List<AerodromeReferenceType> getTakeoffAlternateAerodrome() {
        if (takeoffAlternateAerodrome == null) {
            takeoffAlternateAerodrome = new ArrayList<AerodromeReferenceType>();
        }
        return this.takeoffAlternateAerodrome;
    }

    /**
     * Gets the value of the takeoffWeight property.
     * 
     * @return
     *     possible object is
     *     {@link WeightType }
     *     
     */
    public WeightType getTakeoffWeight() {
        return takeoffWeight;
    }

    /**
     * Sets the value of the takeoffWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeightType }
     *     
     */
    public void setTakeoffWeight(WeightType value) {
        this.takeoffWeight = value;
    }

    /**
     * Gets the value of the departureFleetPrioritization property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDepartureFleetPrioritization() {
        return departureFleetPrioritization;
    }

    /**
     * Sets the value of the departureFleetPrioritization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDepartureFleetPrioritization(Integer value) {
        this.departureFleetPrioritization = value;
    }

    /**
     * Gets the value of the departureSlot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureSlot() {
        return departureSlot;
    }

    /**
     * Sets the value of the departureSlot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureSlot(String value) {
        this.departureSlot = value;
    }

    /**
     * Gets the value of the earliestOffBlockTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEarliestOffBlockTime() {
        return earliestOffBlockTime;
    }

    /**
     * Sets the value of the earliestOffBlockTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEarliestOffBlockTime(XMLGregorianCalendar value) {
        this.earliestOffBlockTime = value;
    }

    /**
     * Gets the value of the standardInstrumentDeparture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardInstrumentDeparture() {
        return standardInstrumentDeparture;
    }

    /**
     * Sets the value of the standardInstrumentDeparture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardInstrumentDeparture(String value) {
        this.standardInstrumentDeparture = value;
    }

}