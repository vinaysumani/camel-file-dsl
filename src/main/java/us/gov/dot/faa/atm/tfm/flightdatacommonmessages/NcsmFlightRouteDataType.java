//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package us.gov.dot.faa.atm.tfm.flightdatacommonmessages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import us.gov.dot.faa.atm.tfm.tfmdatacoreelements.AdaptedRouteNameType;
import us.gov.dot.faa.atm.tfm.tfmdatacoreelements.DiversionIndicatorType;
import us.gov.dot.faa.atm.tfm.tfmdatacoreelements.EtaFlightTimeType;
import us.gov.dot.faa.atm.tfm.tfmdatacoreelements.EtdFlightTimeType;
import us.gov.dot.faa.atm.tfm.tfmdatacoreelements.FixEventType;
import us.gov.dot.faa.atm.tfm.tfmdatacoreelements.FlightTimeDataType;
import us.gov.dot.faa.atm.tfm.tfmdatacoreelements.FlightTraversalDataType2;
import us.gov.dot.faa.atm.tfm.tfmdatacoreelements.PositionType;
import us.gov.dot.faa.atm.tfm.tfmdatacoreelements.RvsmComplianceType;


/**
 * The purpose of the NCSM Flight Data is to define Route data that can be included into a new message or incorporated as added data in another/existing message.
 * 
 * <p>Java class for ncsmFlightRouteDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ncsmFlightRouteDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="etd" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}etdFlightTimeType"/>
 *         &lt;element name="eta" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}etaFlightTimeType"/>
 *         &lt;element name="diversionIndicator" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}diversionIndicatorType"/>
 *         &lt;element name="rvsmData" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}rvsmComplianceType"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="dp" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}adaptedRouteNameType"/>
 *           &lt;element name="dpTransitionFix" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}fixNameType"/>
 *         &lt;/sequence>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="star" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}adaptedRouteNameType"/>
 *           &lt;element name="starTransitionFix" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}fixNameType"/>
 *         &lt;/sequence>
 *         &lt;element name="arrivalFixAndTime" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}fixEventType" minOccurs="0"/>
 *         &lt;element name="departureFixAndTime" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}fixEventType" minOccurs="0"/>
 *         &lt;element name="nextPosition" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}positionType" minOccurs="0"/>
 *         &lt;element name="flightTraversalData2" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}flightTraversalDataType2"/>
 *         &lt;element name="routeOfFlight" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}field10FormatType"/>
 *         &lt;element name="remarksKeywords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flightTimeData" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}flightTimeDataType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ncsmFlightRouteDataType", propOrder = {
    "etd",
    "eta",
    "diversionIndicator",
    "rvsmData",
    "dp",
    "dpTransitionFix",
    "star",
    "starTransitionFix",
    "arrivalFixAndTime",
    "departureFixAndTime",
    "nextPosition",
    "flightTraversalData2",
    "routeOfFlight",
    "remarksKeywords",
    "flightTimeData"
})
public class NcsmFlightRouteDataType {

    @XmlElement(required = true)
    protected EtdFlightTimeType etd;
    @XmlElement(required = true)
    protected EtaFlightTimeType eta;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DiversionIndicatorType diversionIndicator;
    @XmlElement(required = true)
    protected RvsmComplianceType rvsmData;
    protected AdaptedRouteNameType dp;
    protected String dpTransitionFix;
    protected AdaptedRouteNameType star;
    protected String starTransitionFix;
    protected FixEventType arrivalFixAndTime;
    protected FixEventType departureFixAndTime;
    protected PositionType nextPosition;
    @XmlElement(required = true)
    protected FlightTraversalDataType2 flightTraversalData2;
    @XmlElement(required = true)
    protected String routeOfFlight;
    protected String remarksKeywords;
    protected FlightTimeDataType flightTimeData;

    /**
     * Gets the value of the etd property.
     * 
     * @return
     *     possible object is
     *     {@link EtdFlightTimeType }
     *     
     */
    public EtdFlightTimeType getEtd() {
        return etd;
    }

    /**
     * Sets the value of the etd property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtdFlightTimeType }
     *     
     */
    public void setEtd(EtdFlightTimeType value) {
        this.etd = value;
    }

    /**
     * Gets the value of the eta property.
     * 
     * @return
     *     possible object is
     *     {@link EtaFlightTimeType }
     *     
     */
    public EtaFlightTimeType getEta() {
        return eta;
    }

    /**
     * Sets the value of the eta property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtaFlightTimeType }
     *     
     */
    public void setEta(EtaFlightTimeType value) {
        this.eta = value;
    }

    /**
     * Gets the value of the diversionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link DiversionIndicatorType }
     *     
     */
    public DiversionIndicatorType getDiversionIndicator() {
        return diversionIndicator;
    }

    /**
     * Sets the value of the diversionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiversionIndicatorType }
     *     
     */
    public void setDiversionIndicator(DiversionIndicatorType value) {
        this.diversionIndicator = value;
    }

    /**
     * Gets the value of the rvsmData property.
     * 
     * @return
     *     possible object is
     *     {@link RvsmComplianceType }
     *     
     */
    public RvsmComplianceType getRvsmData() {
        return rvsmData;
    }

    /**
     * Sets the value of the rvsmData property.
     * 
     * @param value
     *     allowed object is
     *     {@link RvsmComplianceType }
     *     
     */
    public void setRvsmData(RvsmComplianceType value) {
        this.rvsmData = value;
    }

    /**
     * Gets the value of the dp property.
     * 
     * @return
     *     possible object is
     *     {@link AdaptedRouteNameType }
     *     
     */
    public AdaptedRouteNameType getDp() {
        return dp;
    }

    /**
     * Sets the value of the dp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdaptedRouteNameType }
     *     
     */
    public void setDp(AdaptedRouteNameType value) {
        this.dp = value;
    }

    /**
     * Gets the value of the dpTransitionFix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDpTransitionFix() {
        return dpTransitionFix;
    }

    /**
     * Sets the value of the dpTransitionFix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDpTransitionFix(String value) {
        this.dpTransitionFix = value;
    }

    /**
     * Gets the value of the star property.
     * 
     * @return
     *     possible object is
     *     {@link AdaptedRouteNameType }
     *     
     */
    public AdaptedRouteNameType getStar() {
        return star;
    }

    /**
     * Sets the value of the star property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdaptedRouteNameType }
     *     
     */
    public void setStar(AdaptedRouteNameType value) {
        this.star = value;
    }

    /**
     * Gets the value of the starTransitionFix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStarTransitionFix() {
        return starTransitionFix;
    }

    /**
     * Sets the value of the starTransitionFix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStarTransitionFix(String value) {
        this.starTransitionFix = value;
    }

    /**
     * Gets the value of the arrivalFixAndTime property.
     * 
     * @return
     *     possible object is
     *     {@link FixEventType }
     *     
     */
    public FixEventType getArrivalFixAndTime() {
        return arrivalFixAndTime;
    }

    /**
     * Sets the value of the arrivalFixAndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link FixEventType }
     *     
     */
    public void setArrivalFixAndTime(FixEventType value) {
        this.arrivalFixAndTime = value;
    }

    /**
     * Gets the value of the departureFixAndTime property.
     * 
     * @return
     *     possible object is
     *     {@link FixEventType }
     *     
     */
    public FixEventType getDepartureFixAndTime() {
        return departureFixAndTime;
    }

    /**
     * Sets the value of the departureFixAndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link FixEventType }
     *     
     */
    public void setDepartureFixAndTime(FixEventType value) {
        this.departureFixAndTime = value;
    }

    /**
     * Gets the value of the nextPosition property.
     * 
     * @return
     *     possible object is
     *     {@link PositionType }
     *     
     */
    public PositionType getNextPosition() {
        return nextPosition;
    }

    /**
     * Sets the value of the nextPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionType }
     *     
     */
    public void setNextPosition(PositionType value) {
        this.nextPosition = value;
    }

    /**
     * Gets the value of the flightTraversalData2 property.
     * 
     * @return
     *     possible object is
     *     {@link FlightTraversalDataType2 }
     *     
     */
    public FlightTraversalDataType2 getFlightTraversalData2() {
        return flightTraversalData2;
    }

    /**
     * Sets the value of the flightTraversalData2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightTraversalDataType2 }
     *     
     */
    public void setFlightTraversalData2(FlightTraversalDataType2 value) {
        this.flightTraversalData2 = value;
    }

    /**
     * Gets the value of the routeOfFlight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteOfFlight() {
        return routeOfFlight;
    }

    /**
     * Sets the value of the routeOfFlight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteOfFlight(String value) {
        this.routeOfFlight = value;
    }

    /**
     * Gets the value of the remarksKeywords property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarksKeywords() {
        return remarksKeywords;
    }

    /**
     * Sets the value of the remarksKeywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarksKeywords(String value) {
        this.remarksKeywords = value;
    }

    /**
     * Gets the value of the flightTimeData property.
     * 
     * @return
     *     possible object is
     *     {@link FlightTimeDataType }
     *     
     */
    public FlightTimeDataType getFlightTimeData() {
        return flightTimeData;
    }

    /**
     * Sets the value of the flightTimeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightTimeDataType }
     *     
     */
    public void setFlightTimeData(FlightTimeDataType value) {
        this.flightTimeData = value;
    }

}