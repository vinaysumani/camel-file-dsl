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
import javax.xml.datatype.XMLGregorianCalendar;
import aero.fixm.base._3.AtcUnitReferenceType;
import aero.fixm.base._3.SignificantPointType;
import aero.fixm.flight._3.FlightDepartureType;


/**
 * 
 *             Extends core Flight Departue with NAS specific Extensions. 
 *          
 * 
 * <p>Java class for NasDepartureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NasDepartureType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixm.aero/flight/3.0}FlightDepartureType">
 *       &lt;sequence>
 *         &lt;element name="departureCenter" type="{http://www.fixm.aero/base/3.0}AtcUnitReferenceType" minOccurs="0"/>
 *         &lt;element name="departureProcedureTransitionFix" type="{http://www.fixm.aero/base/3.0}SignificantPointType" minOccurs="0"/>
 *         &lt;element name="runwayDepartureTime" type="{http://www.faa.aero/nas/3.1}RunwayDepartureTimeType" minOccurs="0"/>
 *         &lt;element name="tfmsDepartureProcedure" type="{http://www.faa.aero/nas/3.1}TfmsInstrumentRouteDesignatorType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="departurePoint">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.fixm.aero/base/3.0}FreeTextType">
 *             &lt;maxLength value="12"/>
 *             &lt;minLength value="2"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="scheduledOffBlockTime" type="{http://www.fixm.aero/foundation/3.0}TimeType" />
 *       &lt;attribute name="targetMAEntryTime" type="{http://www.fixm.aero/foundation/3.0}TimeType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NasDepartureType", propOrder = {
    "departureCenter",
    "departureProcedureTransitionFix",
    "runwayDepartureTime",
    "tfmsDepartureProcedure"
})
public class NasDepartureType
    extends FlightDepartureType
{

    protected AtcUnitReferenceType departureCenter;
    protected SignificantPointType departureProcedureTransitionFix;
    protected RunwayDepartureTimeType runwayDepartureTime;
    protected TfmsInstrumentRouteDesignatorType tfmsDepartureProcedure;
    @XmlAttribute(name = "departurePoint")
    protected String departurePoint;
    @XmlAttribute(name = "scheduledOffBlockTime")
    protected XMLGregorianCalendar scheduledOffBlockTime;
    @XmlAttribute(name = "targetMAEntryTime")
    protected XMLGregorianCalendar targetMAEntryTime;

    /**
     * Gets the value of the departureCenter property.
     * 
     * @return
     *     possible object is
     *     {@link AtcUnitReferenceType }
     *     
     */
    public AtcUnitReferenceType getDepartureCenter() {
        return departureCenter;
    }

    /**
     * Sets the value of the departureCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link AtcUnitReferenceType }
     *     
     */
    public void setDepartureCenter(AtcUnitReferenceType value) {
        this.departureCenter = value;
    }

    /**
     * Gets the value of the departureProcedureTransitionFix property.
     * 
     * @return
     *     possible object is
     *     {@link SignificantPointType }
     *     
     */
    public SignificantPointType getDepartureProcedureTransitionFix() {
        return departureProcedureTransitionFix;
    }

    /**
     * Sets the value of the departureProcedureTransitionFix property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignificantPointType }
     *     
     */
    public void setDepartureProcedureTransitionFix(SignificantPointType value) {
        this.departureProcedureTransitionFix = value;
    }

    /**
     * Gets the value of the runwayDepartureTime property.
     * 
     * @return
     *     possible object is
     *     {@link RunwayDepartureTimeType }
     *     
     */
    public RunwayDepartureTimeType getRunwayDepartureTime() {
        return runwayDepartureTime;
    }

    /**
     * Sets the value of the runwayDepartureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link RunwayDepartureTimeType }
     *     
     */
    public void setRunwayDepartureTime(RunwayDepartureTimeType value) {
        this.runwayDepartureTime = value;
    }

    /**
     * Gets the value of the tfmsDepartureProcedure property.
     * 
     * @return
     *     possible object is
     *     {@link TfmsInstrumentRouteDesignatorType }
     *     
     */
    public TfmsInstrumentRouteDesignatorType getTfmsDepartureProcedure() {
        return tfmsDepartureProcedure;
    }

    /**
     * Sets the value of the tfmsDepartureProcedure property.
     * 
     * @param value
     *     allowed object is
     *     {@link TfmsInstrumentRouteDesignatorType }
     *     
     */
    public void setTfmsDepartureProcedure(TfmsInstrumentRouteDesignatorType value) {
        this.tfmsDepartureProcedure = value;
    }

    /**
     * Gets the value of the departurePoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeparturePoint() {
        return departurePoint;
    }

    /**
     * Sets the value of the departurePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeparturePoint(String value) {
        this.departurePoint = value;
    }

    /**
     * Gets the value of the scheduledOffBlockTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledOffBlockTime() {
        return scheduledOffBlockTime;
    }

    /**
     * Sets the value of the scheduledOffBlockTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledOffBlockTime(XMLGregorianCalendar value) {
        this.scheduledOffBlockTime = value;
    }

    /**
     * Gets the value of the targetMAEntryTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTargetMAEntryTime() {
        return targetMAEntryTime;
    }

    /**
     * Sets the value of the targetMAEntryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTargetMAEntryTime(XMLGregorianCalendar value) {
        this.targetMAEntryTime = value;
    }

}
