//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package us.gov.dot.faa.atm.tfm.ficommonmessages;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import us.gov.dot.faa.atm.tfm.ficommondatatypes.DelayAssignmentModeType;
import us.gov.dot.faa.atm.tfm.ficommondatatypes.DepartureScopeType;
import us.gov.dot.faa.atm.tfm.ficommondatatypes.ElementTypeType;
import us.gov.dot.faa.atm.tfm.ficommondatatypes.FacilityListType;
import us.gov.dot.faa.atm.tfm.ficommondatatypes.FlightInfoListType;
import us.gov.dot.faa.atm.tfm.ficommondatatypes.ProgramRateListType;
import us.gov.dot.faa.atm.tfm.ficommondatatypes.TimePeriodType;


/**
 * Message type for GDP advisory.
 * 
 * <p>Java class for gdpAdvisoryMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gdpAdvisoryMessageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="updateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="tmiStatus" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}tmiStatusType"/>
 *         &lt;element name="airportId" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}airportIdType"/>
 *         &lt;element name="center" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}centerIdType"/>
 *         &lt;element name="pgmExpTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="elementType" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}elementTypeType"/>
 *         &lt;element name="adlTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="delayAssignmentMode" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}delayAssignmentModeType"/>
 *         &lt;element name="arrivalsEstimatedFor" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}timePeriodType"/>
 *         &lt;element name="cumulativeProgramPeriod" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}timePeriodType"/>
 *         &lt;element name="programRateList" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}programRateListType"/>
 *         &lt;element name="popupFactorList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="popupFactor" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="flightInclusionsUSList" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}flightInfoListType" minOccurs="0"/>
 *         &lt;element name="flightInclusionsCanadaList" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}flightInfoListType" minOccurs="0"/>
 *         &lt;element name="departureScope" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}departureScopeType"/>
 *         &lt;element name="departureFacilitiesIncludedList" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}facilityListType" minOccurs="0"/>
 *         &lt;element name="aircraftTypesIncluded" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}includedAircraftType"/>
 *         &lt;element name="exemptDepartureFacilitiesList" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}facilityListType" minOccurs="0"/>
 *         &lt;element name="exemptAfpList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="afp" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}fcaNameType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="exemptCTOPList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ctop" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}ctopNameType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="slotHoldOverrideList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="carrier" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="exemptFlightList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="flightId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="delayAssignmentTableAppliesTo" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}facilityIdentifierType"/>
 *         &lt;element name="delayLimit" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="maxDelay" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="avgDelay" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="impactingCondition" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}reasonType"/>
 *         &lt;element name="advisoryValidPeriod" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}timePeriodType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gdpAdvisoryMessageType", propOrder = {
    "updateTime",
    "tmiStatus",
    "airportId",
    "center",
    "pgmExpTime",
    "elementType",
    "adlTime",
    "delayAssignmentMode",
    "arrivalsEstimatedFor",
    "cumulativeProgramPeriod",
    "programRateList",
    "popupFactorList",
    "flightInclusionsUSList",
    "flightInclusionsCanadaList",
    "departureScope",
    "departureFacilitiesIncludedList",
    "aircraftTypesIncluded",
    "exemptDepartureFacilitiesList",
    "exemptAfpList",
    "exemptCTOPList",
    "slotHoldOverrideList",
    "exemptFlightList",
    "delayAssignmentTableAppliesTo",
    "delayLimit",
    "maxDelay",
    "avgDelay",
    "impactingCondition",
    "advisoryValidPeriod"
})
public class GdpAdvisoryMessageType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TmiStatusType tmiStatus;
    @XmlElement(required = true)
    protected String airportId;
    @XmlElement(required = true)
    protected String center;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pgmExpTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ElementTypeType elementType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar adlTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DelayAssignmentModeType delayAssignmentMode;
    @XmlElement(required = true)
    protected TimePeriodType arrivalsEstimatedFor;
    @XmlElement(required = true)
    protected TimePeriodType cumulativeProgramPeriod;
    @XmlElement(required = true)
    protected ProgramRateListType programRateList;
    protected GdpAdvisoryMessageType.PopupFactorList popupFactorList;
    protected FlightInfoListType flightInclusionsUSList;
    protected FlightInfoListType flightInclusionsCanadaList;
    @XmlElement(required = true)
    protected DepartureScopeType departureScope;
    protected FacilityListType departureFacilitiesIncludedList;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected IncludedAircraftType aircraftTypesIncluded;
    protected FacilityListType exemptDepartureFacilitiesList;
    protected GdpAdvisoryMessageType.ExemptAfpList exemptAfpList;
    protected GdpAdvisoryMessageType.ExemptCTOPList exemptCTOPList;
    protected GdpAdvisoryMessageType.SlotHoldOverrideList slotHoldOverrideList;
    protected GdpAdvisoryMessageType.ExemptFlightList exemptFlightList;
    @XmlElement(required = true)
    protected String delayAssignmentTableAppliesTo;
    protected BigInteger delayLimit;
    protected BigInteger maxDelay;
    protected Float avgDelay;
    @XmlElement(required = true)
    protected String impactingCondition;
    @XmlElement(required = true)
    protected TimePeriodType advisoryValidPeriod;

    /**
     * Gets the value of the updateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateTime() {
        return updateTime;
    }

    /**
     * Sets the value of the updateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateTime(XMLGregorianCalendar value) {
        this.updateTime = value;
    }

    /**
     * Gets the value of the tmiStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TmiStatusType }
     *     
     */
    public TmiStatusType getTmiStatus() {
        return tmiStatus;
    }

    /**
     * Sets the value of the tmiStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TmiStatusType }
     *     
     */
    public void setTmiStatus(TmiStatusType value) {
        this.tmiStatus = value;
    }

    /**
     * Gets the value of the airportId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirportId() {
        return airportId;
    }

    /**
     * Sets the value of the airportId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirportId(String value) {
        this.airportId = value;
    }

    /**
     * Gets the value of the center property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCenter() {
        return center;
    }

    /**
     * Sets the value of the center property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCenter(String value) {
        this.center = value;
    }

    /**
     * Gets the value of the pgmExpTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPgmExpTime() {
        return pgmExpTime;
    }

    /**
     * Sets the value of the pgmExpTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPgmExpTime(XMLGregorianCalendar value) {
        this.pgmExpTime = value;
    }

    /**
     * Gets the value of the elementType property.
     * 
     * @return
     *     possible object is
     *     {@link ElementTypeType }
     *     
     */
    public ElementTypeType getElementType() {
        return elementType;
    }

    /**
     * Sets the value of the elementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElementTypeType }
     *     
     */
    public void setElementType(ElementTypeType value) {
        this.elementType = value;
    }

    /**
     * Gets the value of the adlTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAdlTime() {
        return adlTime;
    }

    /**
     * Sets the value of the adlTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAdlTime(XMLGregorianCalendar value) {
        this.adlTime = value;
    }

    /**
     * Gets the value of the delayAssignmentMode property.
     * 
     * @return
     *     possible object is
     *     {@link DelayAssignmentModeType }
     *     
     */
    public DelayAssignmentModeType getDelayAssignmentMode() {
        return delayAssignmentMode;
    }

    /**
     * Sets the value of the delayAssignmentMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DelayAssignmentModeType }
     *     
     */
    public void setDelayAssignmentMode(DelayAssignmentModeType value) {
        this.delayAssignmentMode = value;
    }

    /**
     * Gets the value of the arrivalsEstimatedFor property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getArrivalsEstimatedFor() {
        return arrivalsEstimatedFor;
    }

    /**
     * Sets the value of the arrivalsEstimatedFor property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setArrivalsEstimatedFor(TimePeriodType value) {
        this.arrivalsEstimatedFor = value;
    }

    /**
     * Gets the value of the cumulativeProgramPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getCumulativeProgramPeriod() {
        return cumulativeProgramPeriod;
    }

    /**
     * Sets the value of the cumulativeProgramPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setCumulativeProgramPeriod(TimePeriodType value) {
        this.cumulativeProgramPeriod = value;
    }

    /**
     * Gets the value of the programRateList property.
     * 
     * @return
     *     possible object is
     *     {@link ProgramRateListType }
     *     
     */
    public ProgramRateListType getProgramRateList() {
        return programRateList;
    }

    /**
     * Sets the value of the programRateList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgramRateListType }
     *     
     */
    public void setProgramRateList(ProgramRateListType value) {
        this.programRateList = value;
    }

    /**
     * Gets the value of the popupFactorList property.
     * 
     * @return
     *     possible object is
     *     {@link GdpAdvisoryMessageType.PopupFactorList }
     *     
     */
    public GdpAdvisoryMessageType.PopupFactorList getPopupFactorList() {
        return popupFactorList;
    }

    /**
     * Sets the value of the popupFactorList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GdpAdvisoryMessageType.PopupFactorList }
     *     
     */
    public void setPopupFactorList(GdpAdvisoryMessageType.PopupFactorList value) {
        this.popupFactorList = value;
    }

    /**
     * Gets the value of the flightInclusionsUSList property.
     * 
     * @return
     *     possible object is
     *     {@link FlightInfoListType }
     *     
     */
    public FlightInfoListType getFlightInclusionsUSList() {
        return flightInclusionsUSList;
    }

    /**
     * Sets the value of the flightInclusionsUSList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightInfoListType }
     *     
     */
    public void setFlightInclusionsUSList(FlightInfoListType value) {
        this.flightInclusionsUSList = value;
    }

    /**
     * Gets the value of the flightInclusionsCanadaList property.
     * 
     * @return
     *     possible object is
     *     {@link FlightInfoListType }
     *     
     */
    public FlightInfoListType getFlightInclusionsCanadaList() {
        return flightInclusionsCanadaList;
    }

    /**
     * Sets the value of the flightInclusionsCanadaList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightInfoListType }
     *     
     */
    public void setFlightInclusionsCanadaList(FlightInfoListType value) {
        this.flightInclusionsCanadaList = value;
    }

    /**
     * Gets the value of the departureScope property.
     * 
     * @return
     *     possible object is
     *     {@link DepartureScopeType }
     *     
     */
    public DepartureScopeType getDepartureScope() {
        return departureScope;
    }

    /**
     * Sets the value of the departureScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartureScopeType }
     *     
     */
    public void setDepartureScope(DepartureScopeType value) {
        this.departureScope = value;
    }

    /**
     * Gets the value of the departureFacilitiesIncludedList property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityListType }
     *     
     */
    public FacilityListType getDepartureFacilitiesIncludedList() {
        return departureFacilitiesIncludedList;
    }

    /**
     * Sets the value of the departureFacilitiesIncludedList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityListType }
     *     
     */
    public void setDepartureFacilitiesIncludedList(FacilityListType value) {
        this.departureFacilitiesIncludedList = value;
    }

    /**
     * Gets the value of the aircraftTypesIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link IncludedAircraftType }
     *     
     */
    public IncludedAircraftType getAircraftTypesIncluded() {
        return aircraftTypesIncluded;
    }

    /**
     * Sets the value of the aircraftTypesIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncludedAircraftType }
     *     
     */
    public void setAircraftTypesIncluded(IncludedAircraftType value) {
        this.aircraftTypesIncluded = value;
    }

    /**
     * Gets the value of the exemptDepartureFacilitiesList property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityListType }
     *     
     */
    public FacilityListType getExemptDepartureFacilitiesList() {
        return exemptDepartureFacilitiesList;
    }

    /**
     * Sets the value of the exemptDepartureFacilitiesList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityListType }
     *     
     */
    public void setExemptDepartureFacilitiesList(FacilityListType value) {
        this.exemptDepartureFacilitiesList = value;
    }

    /**
     * Gets the value of the exemptAfpList property.
     * 
     * @return
     *     possible object is
     *     {@link GdpAdvisoryMessageType.ExemptAfpList }
     *     
     */
    public GdpAdvisoryMessageType.ExemptAfpList getExemptAfpList() {
        return exemptAfpList;
    }

    /**
     * Sets the value of the exemptAfpList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GdpAdvisoryMessageType.ExemptAfpList }
     *     
     */
    public void setExemptAfpList(GdpAdvisoryMessageType.ExemptAfpList value) {
        this.exemptAfpList = value;
    }

    /**
     * Gets the value of the exemptCTOPList property.
     * 
     * @return
     *     possible object is
     *     {@link GdpAdvisoryMessageType.ExemptCTOPList }
     *     
     */
    public GdpAdvisoryMessageType.ExemptCTOPList getExemptCTOPList() {
        return exemptCTOPList;
    }

    /**
     * Sets the value of the exemptCTOPList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GdpAdvisoryMessageType.ExemptCTOPList }
     *     
     */
    public void setExemptCTOPList(GdpAdvisoryMessageType.ExemptCTOPList value) {
        this.exemptCTOPList = value;
    }

    /**
     * Gets the value of the slotHoldOverrideList property.
     * 
     * @return
     *     possible object is
     *     {@link GdpAdvisoryMessageType.SlotHoldOverrideList }
     *     
     */
    public GdpAdvisoryMessageType.SlotHoldOverrideList getSlotHoldOverrideList() {
        return slotHoldOverrideList;
    }

    /**
     * Sets the value of the slotHoldOverrideList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GdpAdvisoryMessageType.SlotHoldOverrideList }
     *     
     */
    public void setSlotHoldOverrideList(GdpAdvisoryMessageType.SlotHoldOverrideList value) {
        this.slotHoldOverrideList = value;
    }

    /**
     * Gets the value of the exemptFlightList property.
     * 
     * @return
     *     possible object is
     *     {@link GdpAdvisoryMessageType.ExemptFlightList }
     *     
     */
    public GdpAdvisoryMessageType.ExemptFlightList getExemptFlightList() {
        return exemptFlightList;
    }

    /**
     * Sets the value of the exemptFlightList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GdpAdvisoryMessageType.ExemptFlightList }
     *     
     */
    public void setExemptFlightList(GdpAdvisoryMessageType.ExemptFlightList value) {
        this.exemptFlightList = value;
    }

    /**
     * Gets the value of the delayAssignmentTableAppliesTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelayAssignmentTableAppliesTo() {
        return delayAssignmentTableAppliesTo;
    }

    /**
     * Sets the value of the delayAssignmentTableAppliesTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelayAssignmentTableAppliesTo(String value) {
        this.delayAssignmentTableAppliesTo = value;
    }

    /**
     * Gets the value of the delayLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDelayLimit() {
        return delayLimit;
    }

    /**
     * Sets the value of the delayLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDelayLimit(BigInteger value) {
        this.delayLimit = value;
    }

    /**
     * Gets the value of the maxDelay property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxDelay() {
        return maxDelay;
    }

    /**
     * Sets the value of the maxDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxDelay(BigInteger value) {
        this.maxDelay = value;
    }

    /**
     * Gets the value of the avgDelay property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAvgDelay() {
        return avgDelay;
    }

    /**
     * Sets the value of the avgDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAvgDelay(Float value) {
        this.avgDelay = value;
    }

    /**
     * Gets the value of the impactingCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpactingCondition() {
        return impactingCondition;
    }

    /**
     * Sets the value of the impactingCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpactingCondition(String value) {
        this.impactingCondition = value;
    }

    /**
     * Gets the value of the advisoryValidPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getAdvisoryValidPeriod() {
        return advisoryValidPeriod;
    }

    /**
     * Sets the value of the advisoryValidPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setAdvisoryValidPeriod(TimePeriodType value) {
        this.advisoryValidPeriod = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="afp" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}fcaNameType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "afp"
    })
    public static class ExemptAfpList {

        @XmlElement(required = true)
        protected List<String> afp;

        /**
         * Gets the value of the afp property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the afp property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAfp().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getAfp() {
            if (afp == null) {
                afp = new ArrayList<String>();
            }
            return this.afp;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ctop" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}ctopNameType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ctop"
    })
    public static class ExemptCTOPList {

        @XmlElement(required = true)
        protected List<String> ctop;

        /**
         * Gets the value of the ctop property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ctop property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCtop().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCtop() {
            if (ctop == null) {
                ctop = new ArrayList<String>();
            }
            return this.ctop;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="flightId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "flightId"
    })
    public static class ExemptFlightList {

        @XmlElement(required = true)
        protected List<String> flightId;

        /**
         * Gets the value of the flightId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flightId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFlightId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getFlightId() {
            if (flightId == null) {
                flightId = new ArrayList<String>();
            }
            return this.flightId;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="popupFactor" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "popupFactor"
    })
    public static class PopupFactorList {

        @XmlElement(required = true)
        protected List<BigInteger> popupFactor;

        /**
         * Gets the value of the popupFactor property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the popupFactor property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPopupFactor().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BigInteger }
         * 
         * 
         */
        public List<BigInteger> getPopupFactor() {
            if (popupFactor == null) {
                popupFactor = new ArrayList<BigInteger>();
            }
            return this.popupFactor;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="carrier" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "carrier"
    })
    public static class SlotHoldOverrideList {

        @XmlElement(required = true)
        protected List<String> carrier;

        /**
         * Gets the value of the carrier property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the carrier property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCarrier().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCarrier() {
            if (carrier == null) {
                carrier = new ArrayList<String>();
            }
            return this.carrier;
        }

    }

}
