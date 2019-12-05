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
import us.gov.dot.faa.atm.tfm.ficommondatatypes.AltitudeRangeType;
import us.gov.dot.faa.atm.tfm.ficommondatatypes.DelayAssignmentModeType;
import us.gov.dot.faa.atm.tfm.ficommondatatypes.ElementTypeType;
import us.gov.dot.faa.atm.tfm.ficommondatatypes.FacilityListType;
import us.gov.dot.faa.atm.tfm.ficommondatatypes.FlightInfoListType;
import us.gov.dot.faa.atm.tfm.ficommondatatypes.ProgramRateListType;
import us.gov.dot.faa.atm.tfm.ficommondatatypes.TimePeriodType;


/**
 * Message type for proposed AFP advisory.
 * 
 * <p>Java class for afpAdvisoryMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="afpAdvisoryMessageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="updateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="tmiStatus" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}tmiStatusType"/>
 *         &lt;element name="afpName" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}fcaNameType"/>
 *         &lt;element name="pgmExpTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="elementType" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}elementTypeType"/>
 *         &lt;element name="altitudesIncluded" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}altitudeRangeType"/>
 *         &lt;element name="adlTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="delayAssignmentMode" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}delayAssignmentModeType"/>
 *         &lt;element name="overrideAfp" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="YES"/>
 *               &lt;enumeration value="NO"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="entryEstimatedFor" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}timePeriodType"/>
 *         &lt;element name="cumulativeProgramPeriod" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}timePeriodType"/>
 *         &lt;element name="programRateList" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}programRateListType"/>
 *         &lt;element name="flightInclusionsList" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}flightInfoListType" minOccurs="0"/>
 *         &lt;element name="departureScope">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="keyword">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="MANUAL"/>
 *                         &lt;enumeration value="ALL"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="center" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}centerIdType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="departureFacilitiesIncludedList" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}facilityListType" minOccurs="0"/>
 *         &lt;element name="exemptDepartureFacilitiesList" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}facilityListType" minOccurs="0"/>
 *         &lt;element name="exemptArrivalFacilitiesList" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}facilityListType" minOccurs="0"/>
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
@XmlType(name = "afpAdvisoryMessageType", propOrder = {
    "updateTime",
    "tmiStatus",
    "afpName",
    "pgmExpTime",
    "elementType",
    "altitudesIncluded",
    "adlTime",
    "delayAssignmentMode",
    "overrideAfp",
    "entryEstimatedFor",
    "cumulativeProgramPeriod",
    "programRateList",
    "flightInclusionsList",
    "departureScope",
    "departureFacilitiesIncludedList",
    "exemptDepartureFacilitiesList",
    "exemptArrivalFacilitiesList",
    "slotHoldOverrideList",
    "exemptFlightList",
    "delayLimit",
    "maxDelay",
    "avgDelay",
    "impactingCondition",
    "advisoryValidPeriod"
})
public class AfpAdvisoryMessageType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TmiStatusType tmiStatus;
    @XmlElement(required = true)
    protected String afpName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pgmExpTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ElementTypeType elementType;
    @XmlElement(required = true)
    protected AltitudeRangeType altitudesIncluded;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar adlTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DelayAssignmentModeType delayAssignmentMode;
    protected String overrideAfp;
    @XmlElement(required = true)
    protected TimePeriodType entryEstimatedFor;
    @XmlElement(required = true)
    protected TimePeriodType cumulativeProgramPeriod;
    @XmlElement(required = true)
    protected ProgramRateListType programRateList;
    protected FlightInfoListType flightInclusionsList;
    @XmlElement(required = true)
    protected AfpAdvisoryMessageType.DepartureScope departureScope;
    protected FacilityListType departureFacilitiesIncludedList;
    protected FacilityListType exemptDepartureFacilitiesList;
    protected FacilityListType exemptArrivalFacilitiesList;
    protected AfpAdvisoryMessageType.SlotHoldOverrideList slotHoldOverrideList;
    protected AfpAdvisoryMessageType.ExemptFlightList exemptFlightList;
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
     * Gets the value of the afpName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAfpName() {
        return afpName;
    }

    /**
     * Sets the value of the afpName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAfpName(String value) {
        this.afpName = value;
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
     * Gets the value of the altitudesIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link AltitudeRangeType }
     *     
     */
    public AltitudeRangeType getAltitudesIncluded() {
        return altitudesIncluded;
    }

    /**
     * Sets the value of the altitudesIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link AltitudeRangeType }
     *     
     */
    public void setAltitudesIncluded(AltitudeRangeType value) {
        this.altitudesIncluded = value;
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
     * Gets the value of the overrideAfp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverrideAfp() {
        return overrideAfp;
    }

    /**
     * Sets the value of the overrideAfp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverrideAfp(String value) {
        this.overrideAfp = value;
    }

    /**
     * Gets the value of the entryEstimatedFor property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getEntryEstimatedFor() {
        return entryEstimatedFor;
    }

    /**
     * Sets the value of the entryEstimatedFor property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setEntryEstimatedFor(TimePeriodType value) {
        this.entryEstimatedFor = value;
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
     * Gets the value of the flightInclusionsList property.
     * 
     * @return
     *     possible object is
     *     {@link FlightInfoListType }
     *     
     */
    public FlightInfoListType getFlightInclusionsList() {
        return flightInclusionsList;
    }

    /**
     * Sets the value of the flightInclusionsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightInfoListType }
     *     
     */
    public void setFlightInclusionsList(FlightInfoListType value) {
        this.flightInclusionsList = value;
    }

    /**
     * Gets the value of the departureScope property.
     * 
     * @return
     *     possible object is
     *     {@link AfpAdvisoryMessageType.DepartureScope }
     *     
     */
    public AfpAdvisoryMessageType.DepartureScope getDepartureScope() {
        return departureScope;
    }

    /**
     * Sets the value of the departureScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link AfpAdvisoryMessageType.DepartureScope }
     *     
     */
    public void setDepartureScope(AfpAdvisoryMessageType.DepartureScope value) {
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
     * Gets the value of the exemptArrivalFacilitiesList property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityListType }
     *     
     */
    public FacilityListType getExemptArrivalFacilitiesList() {
        return exemptArrivalFacilitiesList;
    }

    /**
     * Sets the value of the exemptArrivalFacilitiesList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityListType }
     *     
     */
    public void setExemptArrivalFacilitiesList(FacilityListType value) {
        this.exemptArrivalFacilitiesList = value;
    }

    /**
     * Gets the value of the slotHoldOverrideList property.
     * 
     * @return
     *     possible object is
     *     {@link AfpAdvisoryMessageType.SlotHoldOverrideList }
     *     
     */
    public AfpAdvisoryMessageType.SlotHoldOverrideList getSlotHoldOverrideList() {
        return slotHoldOverrideList;
    }

    /**
     * Sets the value of the slotHoldOverrideList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AfpAdvisoryMessageType.SlotHoldOverrideList }
     *     
     */
    public void setSlotHoldOverrideList(AfpAdvisoryMessageType.SlotHoldOverrideList value) {
        this.slotHoldOverrideList = value;
    }

    /**
     * Gets the value of the exemptFlightList property.
     * 
     * @return
     *     possible object is
     *     {@link AfpAdvisoryMessageType.ExemptFlightList }
     *     
     */
    public AfpAdvisoryMessageType.ExemptFlightList getExemptFlightList() {
        return exemptFlightList;
    }

    /**
     * Sets the value of the exemptFlightList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AfpAdvisoryMessageType.ExemptFlightList }
     *     
     */
    public void setExemptFlightList(AfpAdvisoryMessageType.ExemptFlightList value) {
        this.exemptFlightList = value;
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
     *         &lt;element name="keyword">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="MANUAL"/>
     *               &lt;enumeration value="ALL"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="center" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}centerIdType" maxOccurs="unbounded"/>
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
        "keyword",
        "center"
    })
    public static class DepartureScope {

        @XmlElement(required = true)
        protected String keyword;
        @XmlElement(required = true)
        protected List<String> center;

        /**
         * Gets the value of the keyword property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKeyword() {
            return keyword;
        }

        /**
         * Sets the value of the keyword property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKeyword(String value) {
            this.keyword = value;
        }

        /**
         * Gets the value of the center property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the center property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCenter().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCenter() {
            if (center == null) {
                center = new ArrayList<String>();
            }
            return this.center;
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