//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package us.gov.dot.faa.atm.tfm.tfmrequestreplytypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import us.gov.dot.faa.atm.tfm.ficommondatatypes.ControlElementTypeType;
import us.gov.dot.faa.atm.tfm.ficommondatatypes.SlotNameType;
import us.gov.dot.faa.atm.tfm.ficommonmessages2.ControlTypeType;


/**
 * EDCT Slist report
 * 
 * <p>Java class for edctSlistReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="edctSlistReportType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="controlledElement" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}controlElementNameType"/>
 *         &lt;element name="controlledElementType" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}controlElementTypeType"/>
 *         &lt;element name="flight" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="aircraftId" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}aircraftIdType"/>
 *                   &lt;element name="arrivalSlot" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}slotNameType"/>
 *                   &lt;element name="departureAirport" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}airportIdType"/>
 *                   &lt;element name="arrivalAirport" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}airportIdType"/>
 *                   &lt;element name="controlledDepartureTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="controlledArrivalTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="controlType" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages2}controlTypeType"/>
 *                   &lt;element name="exemptFlag" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}flagType"/>
 *                   &lt;element name="cancelledFlag" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}flagType"/>
 *                   &lt;element name="slotHeldFlag" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}flagType"/>
 *                   &lt;element name="earliestRunwayArrivalTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="eentryTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="initialGateDepartureTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "edctSlistReportType", propOrder = {
    "controlledElement",
    "controlledElementType",
    "flight"
})
public class EdctSlistReportType {

    @XmlElement(required = true)
    protected String controlledElement;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ControlElementTypeType controlledElementType;
    protected List<EdctSlistReportType.Flight> flight;

    /**
     * Gets the value of the controlledElement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlledElement() {
        return controlledElement;
    }

    /**
     * Sets the value of the controlledElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlledElement(String value) {
        this.controlledElement = value;
    }

    /**
     * Gets the value of the controlledElementType property.
     * 
     * @return
     *     possible object is
     *     {@link ControlElementTypeType }
     *     
     */
    public ControlElementTypeType getControlledElementType() {
        return controlledElementType;
    }

    /**
     * Sets the value of the controlledElementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ControlElementTypeType }
     *     
     */
    public void setControlledElementType(ControlElementTypeType value) {
        this.controlledElementType = value;
    }

    /**
     * Gets the value of the flight property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flight property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EdctSlistReportType.Flight }
     * 
     * 
     */
    public List<EdctSlistReportType.Flight> getFlight() {
        if (flight == null) {
            flight = new ArrayList<EdctSlistReportType.Flight>();
        }
        return this.flight;
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
     *         &lt;element name="aircraftId" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}aircraftIdType"/>
     *         &lt;element name="arrivalSlot" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}slotNameType"/>
     *         &lt;element name="departureAirport" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}airportIdType"/>
     *         &lt;element name="arrivalAirport" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}airportIdType"/>
     *         &lt;element name="controlledDepartureTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="controlledArrivalTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="controlType" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages2}controlTypeType"/>
     *         &lt;element name="exemptFlag" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}flagType"/>
     *         &lt;element name="cancelledFlag" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}flagType"/>
     *         &lt;element name="slotHeldFlag" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}flagType"/>
     *         &lt;element name="earliestRunwayArrivalTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="eentryTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="initialGateDepartureTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
        "aircraftId",
        "arrivalSlot",
        "departureAirport",
        "arrivalAirport",
        "controlledDepartureTime",
        "controlledArrivalTime",
        "controlType",
        "exemptFlag",
        "cancelledFlag",
        "slotHeldFlag",
        "earliestRunwayArrivalTime",
        "eentryTime",
        "initialGateDepartureTime"
    })
    public static class Flight {

        @XmlElement(required = true)
        protected String aircraftId;
        @XmlElement(required = true)
        protected SlotNameType arrivalSlot;
        @XmlElement(required = true)
        protected String departureAirport;
        @XmlElement(required = true)
        protected String arrivalAirport;
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar controlledDepartureTime;
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar controlledArrivalTime;
        @XmlElement(required = true)
        @XmlSchemaType(name = "string")
        protected ControlTypeType controlType;
        @XmlElement(required = true)
        protected String exemptFlag;
        @XmlElement(required = true)
        protected String cancelledFlag;
        @XmlElement(required = true)
        protected String slotHeldFlag;
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar earliestRunwayArrivalTime;
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar eentryTime;
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar initialGateDepartureTime;

        /**
         * Gets the value of the aircraftId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAircraftId() {
            return aircraftId;
        }

        /**
         * Sets the value of the aircraftId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAircraftId(String value) {
            this.aircraftId = value;
        }

        /**
         * Gets the value of the arrivalSlot property.
         * 
         * @return
         *     possible object is
         *     {@link SlotNameType }
         *     
         */
        public SlotNameType getArrivalSlot() {
            return arrivalSlot;
        }

        /**
         * Sets the value of the arrivalSlot property.
         * 
         * @param value
         *     allowed object is
         *     {@link SlotNameType }
         *     
         */
        public void setArrivalSlot(SlotNameType value) {
            this.arrivalSlot = value;
        }

        /**
         * Gets the value of the departureAirport property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDepartureAirport() {
            return departureAirport;
        }

        /**
         * Sets the value of the departureAirport property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDepartureAirport(String value) {
            this.departureAirport = value;
        }

        /**
         * Gets the value of the arrivalAirport property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getArrivalAirport() {
            return arrivalAirport;
        }

        /**
         * Sets the value of the arrivalAirport property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setArrivalAirport(String value) {
            this.arrivalAirport = value;
        }

        /**
         * Gets the value of the controlledDepartureTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getControlledDepartureTime() {
            return controlledDepartureTime;
        }

        /**
         * Sets the value of the controlledDepartureTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setControlledDepartureTime(XMLGregorianCalendar value) {
            this.controlledDepartureTime = value;
        }

        /**
         * Gets the value of the controlledArrivalTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getControlledArrivalTime() {
            return controlledArrivalTime;
        }

        /**
         * Sets the value of the controlledArrivalTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setControlledArrivalTime(XMLGregorianCalendar value) {
            this.controlledArrivalTime = value;
        }

        /**
         * Gets the value of the controlType property.
         * 
         * @return
         *     possible object is
         *     {@link ControlTypeType }
         *     
         */
        public ControlTypeType getControlType() {
            return controlType;
        }

        /**
         * Sets the value of the controlType property.
         * 
         * @param value
         *     allowed object is
         *     {@link ControlTypeType }
         *     
         */
        public void setControlType(ControlTypeType value) {
            this.controlType = value;
        }

        /**
         * Gets the value of the exemptFlag property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExemptFlag() {
            return exemptFlag;
        }

        /**
         * Sets the value of the exemptFlag property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExemptFlag(String value) {
            this.exemptFlag = value;
        }

        /**
         * Gets the value of the cancelledFlag property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCancelledFlag() {
            return cancelledFlag;
        }

        /**
         * Sets the value of the cancelledFlag property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCancelledFlag(String value) {
            this.cancelledFlag = value;
        }

        /**
         * Gets the value of the slotHeldFlag property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSlotHeldFlag() {
            return slotHeldFlag;
        }

        /**
         * Sets the value of the slotHeldFlag property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSlotHeldFlag(String value) {
            this.slotHeldFlag = value;
        }

        /**
         * Gets the value of the earliestRunwayArrivalTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEarliestRunwayArrivalTime() {
            return earliestRunwayArrivalTime;
        }

        /**
         * Sets the value of the earliestRunwayArrivalTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEarliestRunwayArrivalTime(XMLGregorianCalendar value) {
            this.earliestRunwayArrivalTime = value;
        }

        /**
         * Gets the value of the eentryTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEentryTime() {
            return eentryTime;
        }

        /**
         * Sets the value of the eentryTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEentryTime(XMLGregorianCalendar value) {
            this.eentryTime = value;
        }

        /**
         * Gets the value of the initialGateDepartureTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getInitialGateDepartureTime() {
            return initialGateDepartureTime;
        }

        /**
         * Sets the value of the initialGateDepartureTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setInitialGateDepartureTime(XMLGregorianCalendar value) {
            this.initialGateDepartureTime = value;
        }

    }

}
