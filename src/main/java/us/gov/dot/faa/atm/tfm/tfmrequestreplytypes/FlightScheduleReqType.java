//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package us.gov.dot.faa.atm.tfm.tfmrequestreplytypes;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Defines the possible requests associated with manipulation of the FLIGHT Schedule database.
 * 
 * <p>Java class for flightScheduleReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="flightScheduleReqType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="cancelFS">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="flightId" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}aircraftIdType"/>
 *                   &lt;element name="departureAirport" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}airportIdType"/>
 *                   &lt;element name="departureTime" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages2}hhmmTimeType"/>
 *                   &lt;element name="destinationAirport" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}airportIdType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="activateFS" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}activateCommandType"/>
 *         &lt;element name="inhibitFS" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}inhibitCommandType"/>
 *         &lt;element name="removeFS" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}removeRestoreCommandType"/>
 *         &lt;element name="restoreFS" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}removeRestoreCommandType"/>
 *         &lt;element name="updateFS">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="flightId" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}aircraftIdType"/>
 *                   &lt;element name="departureAirport" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}airportIdType"/>
 *                   &lt;element name="departureTime" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages2}hhmmTimeType"/>
 *                   &lt;element name="destinationAirport" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}airportIdType"/>
 *                   &lt;element name="estimatedTimeInRoute" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}eteType"/>
 *                   &lt;element name="aircraftType" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}typeOfAircraftType"/>
 *                   &lt;sequence minOccurs="0">
 *                     &lt;element name="daysOfOperation" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages2}daysOfOperationType" minOccurs="0"/>
 *                     &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                     &lt;element name="stopDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flightScheduleReqType", propOrder = {
    "cancelFS",
    "activateFS",
    "inhibitFS",
    "removeFS",
    "restoreFS",
    "updateFS"
})
public class FlightScheduleReqType {

    protected FlightScheduleReqType.CancelFS cancelFS;
    protected ActivateCommandType activateFS;
    protected InhibitCommandType inhibitFS;
    protected RemoveRestoreCommandType removeFS;
    protected RemoveRestoreCommandType restoreFS;
    protected FlightScheduleReqType.UpdateFS updateFS;

    /**
     * Gets the value of the cancelFS property.
     * 
     * @return
     *     possible object is
     *     {@link FlightScheduleReqType.CancelFS }
     *     
     */
    public FlightScheduleReqType.CancelFS getCancelFS() {
        return cancelFS;
    }

    /**
     * Sets the value of the cancelFS property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightScheduleReqType.CancelFS }
     *     
     */
    public void setCancelFS(FlightScheduleReqType.CancelFS value) {
        this.cancelFS = value;
    }

    /**
     * Gets the value of the activateFS property.
     * 
     * @return
     *     possible object is
     *     {@link ActivateCommandType }
     *     
     */
    public ActivateCommandType getActivateFS() {
        return activateFS;
    }

    /**
     * Sets the value of the activateFS property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivateCommandType }
     *     
     */
    public void setActivateFS(ActivateCommandType value) {
        this.activateFS = value;
    }

    /**
     * Gets the value of the inhibitFS property.
     * 
     * @return
     *     possible object is
     *     {@link InhibitCommandType }
     *     
     */
    public InhibitCommandType getInhibitFS() {
        return inhibitFS;
    }

    /**
     * Sets the value of the inhibitFS property.
     * 
     * @param value
     *     allowed object is
     *     {@link InhibitCommandType }
     *     
     */
    public void setInhibitFS(InhibitCommandType value) {
        this.inhibitFS = value;
    }

    /**
     * Gets the value of the removeFS property.
     * 
     * @return
     *     possible object is
     *     {@link RemoveRestoreCommandType }
     *     
     */
    public RemoveRestoreCommandType getRemoveFS() {
        return removeFS;
    }

    /**
     * Sets the value of the removeFS property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemoveRestoreCommandType }
     *     
     */
    public void setRemoveFS(RemoveRestoreCommandType value) {
        this.removeFS = value;
    }

    /**
     * Gets the value of the restoreFS property.
     * 
     * @return
     *     possible object is
     *     {@link RemoveRestoreCommandType }
     *     
     */
    public RemoveRestoreCommandType getRestoreFS() {
        return restoreFS;
    }

    /**
     * Sets the value of the restoreFS property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemoveRestoreCommandType }
     *     
     */
    public void setRestoreFS(RemoveRestoreCommandType value) {
        this.restoreFS = value;
    }

    /**
     * Gets the value of the updateFS property.
     * 
     * @return
     *     possible object is
     *     {@link FlightScheduleReqType.UpdateFS }
     *     
     */
    public FlightScheduleReqType.UpdateFS getUpdateFS() {
        return updateFS;
    }

    /**
     * Sets the value of the updateFS property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightScheduleReqType.UpdateFS }
     *     
     */
    public void setUpdateFS(FlightScheduleReqType.UpdateFS value) {
        this.updateFS = value;
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
     *         &lt;element name="flightId" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}aircraftIdType"/>
     *         &lt;element name="departureAirport" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}airportIdType"/>
     *         &lt;element name="departureTime" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages2}hhmmTimeType"/>
     *         &lt;element name="destinationAirport" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}airportIdType"/>
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
        "flightId",
        "departureAirport",
        "departureTime",
        "destinationAirport"
    })
    public static class CancelFS {

        @XmlElement(required = true)
        protected String flightId;
        @XmlElement(required = true)
        protected String departureAirport;
        @XmlElement(required = true)
        protected String departureTime;
        @XmlElement(required = true)
        protected String destinationAirport;

        /**
         * Gets the value of the flightId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFlightId() {
            return flightId;
        }

        /**
         * Sets the value of the flightId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFlightId(String value) {
            this.flightId = value;
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
         * Gets the value of the departureTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDepartureTime() {
            return departureTime;
        }

        /**
         * Sets the value of the departureTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDepartureTime(String value) {
            this.departureTime = value;
        }

        /**
         * Gets the value of the destinationAirport property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDestinationAirport() {
            return destinationAirport;
        }

        /**
         * Sets the value of the destinationAirport property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDestinationAirport(String value) {
            this.destinationAirport = value;
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
     *         &lt;element name="flightId" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}aircraftIdType"/>
     *         &lt;element name="departureAirport" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}airportIdType"/>
     *         &lt;element name="departureTime" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages2}hhmmTimeType"/>
     *         &lt;element name="destinationAirport" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}airportIdType"/>
     *         &lt;element name="estimatedTimeInRoute" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}eteType"/>
     *         &lt;element name="aircraftType" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}typeOfAircraftType"/>
     *         &lt;sequence minOccurs="0">
     *           &lt;element name="daysOfOperation" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages2}daysOfOperationType" minOccurs="0"/>
     *           &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *           &lt;element name="stopDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;/sequence>
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
        "flightId",
        "departureAirport",
        "departureTime",
        "destinationAirport",
        "estimatedTimeInRoute",
        "aircraftType",
        "daysOfOperation",
        "startDate",
        "stopDate"
    })
    public static class UpdateFS {

        @XmlElement(required = true)
        protected String flightId;
        @XmlElement(required = true)
        protected String departureAirport;
        @XmlElement(required = true)
        protected String departureTime;
        @XmlElement(required = true)
        protected String destinationAirport;
        @XmlElement(required = true)
        protected BigInteger estimatedTimeInRoute;
        @XmlElement(required = true)
        protected String aircraftType;
        protected String daysOfOperation;
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar startDate;
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar stopDate;

        /**
         * Gets the value of the flightId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFlightId() {
            return flightId;
        }

        /**
         * Sets the value of the flightId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFlightId(String value) {
            this.flightId = value;
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
         * Gets the value of the departureTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDepartureTime() {
            return departureTime;
        }

        /**
         * Sets the value of the departureTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDepartureTime(String value) {
            this.departureTime = value;
        }

        /**
         * Gets the value of the destinationAirport property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDestinationAirport() {
            return destinationAirport;
        }

        /**
         * Sets the value of the destinationAirport property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDestinationAirport(String value) {
            this.destinationAirport = value;
        }

        /**
         * Gets the value of the estimatedTimeInRoute property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getEstimatedTimeInRoute() {
            return estimatedTimeInRoute;
        }

        /**
         * Sets the value of the estimatedTimeInRoute property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setEstimatedTimeInRoute(BigInteger value) {
            this.estimatedTimeInRoute = value;
        }

        /**
         * Gets the value of the aircraftType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAircraftType() {
            return aircraftType;
        }

        /**
         * Sets the value of the aircraftType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAircraftType(String value) {
            this.aircraftType = value;
        }

        /**
         * Gets the value of the daysOfOperation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDaysOfOperation() {
            return daysOfOperation;
        }

        /**
         * Sets the value of the daysOfOperation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDaysOfOperation(String value) {
            this.daysOfOperation = value;
        }

        /**
         * Gets the value of the startDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getStartDate() {
            return startDate;
        }

        /**
         * Sets the value of the startDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setStartDate(XMLGregorianCalendar value) {
            this.startDate = value;
        }

        /**
         * Gets the value of the stopDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getStopDate() {
            return stopDate;
        }

        /**
         * Sets the value of the stopDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setStopDate(XMLGregorianCalendar value) {
            this.stopDate = value;
        }

    }

}
