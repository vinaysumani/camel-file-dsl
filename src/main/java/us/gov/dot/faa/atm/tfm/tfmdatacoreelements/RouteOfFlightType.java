//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package us.gov.dot.faa.atm.tfm.tfmdatacoreelements;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Complex type defining the structure for describing a flight's route of flight.
 * 
 * <p>Java class for routeOfFlightType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="routeOfFlightType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="48" minOccurs="0">
 *         &lt;choice minOccurs="0">
 *           &lt;element name="departurePoint">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}fixType">
 *                   &lt;attribute name="facilityId" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}facilityIdentifierType" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="adaptedDeparture">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="airport" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}fixNameType"/>
 *                     &lt;element name="transitionFix" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}fixType"/>
 *                   &lt;/sequence>
 *                   &lt;attribute name="routeName" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}standardInstrumentDepartureRouteNameType" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="enRouteElements" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}enRouteElementType" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="arrivalPoint">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}fixType">
 *                   &lt;attribute name="estimatedTimeOfArrival" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                   &lt;attribute name="facilityId" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}facilityIdentifierType" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="adaptedArrival">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="transitionFix" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}fixType"/>
 *                     &lt;element name="airport" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}fixNameType"/>
 *                   &lt;/sequence>
 *                   &lt;attribute name="routeName" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}standardArrivalRouteNameType" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="isTailored" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="isIncomplete" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="prohibitPrefDRoutes" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="prohibitPrefARoutes" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="legacyFormat" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}field10FormatType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "routeOfFlightType", propOrder = {
    "departurePointOrAdaptedDepartureAndEnRouteElements"
})
public class RouteOfFlightType {

    @XmlElements({
        @XmlElement(name = "departurePoint", type = RouteOfFlightType.DeparturePoint.class),
        @XmlElement(name = "adaptedDeparture", type = RouteOfFlightType.AdaptedDeparture.class),
        @XmlElement(name = "enRouteElements", type = EnRouteElementType.class),
        @XmlElement(name = "arrivalPoint", type = RouteOfFlightType.ArrivalPoint.class),
        @XmlElement(name = "adaptedArrival", type = RouteOfFlightType.AdaptedArrival.class)
    })
    protected List<Object> departurePointOrAdaptedDepartureAndEnRouteElements;
    @XmlAttribute(name = "isTailored")
    protected Boolean isTailored;
    @XmlAttribute(name = "isIncomplete")
    protected Boolean isIncomplete;
    @XmlAttribute(name = "prohibitPrefDRoutes")
    protected Boolean prohibitPrefDRoutes;
    @XmlAttribute(name = "prohibitPrefARoutes")
    protected Boolean prohibitPrefARoutes;
    @XmlAttribute(name = "legacyFormat")
    protected String legacyFormat;

    /**
     * Gets the value of the departurePointOrAdaptedDepartureAndEnRouteElements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the departurePointOrAdaptedDepartureAndEnRouteElements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeparturePointOrAdaptedDepartureAndEnRouteElements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RouteOfFlightType.DeparturePoint }
     * {@link RouteOfFlightType.AdaptedDeparture }
     * {@link EnRouteElementType }
     * {@link RouteOfFlightType.ArrivalPoint }
     * {@link RouteOfFlightType.AdaptedArrival }
     * 
     * 
     */
    public List<Object> getDeparturePointOrAdaptedDepartureAndEnRouteElements() {
        if (departurePointOrAdaptedDepartureAndEnRouteElements == null) {
            departurePointOrAdaptedDepartureAndEnRouteElements = new ArrayList<Object>();
        }
        return this.departurePointOrAdaptedDepartureAndEnRouteElements;
    }

    /**
     * Gets the value of the isTailored property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsTailored() {
        if (isTailored == null) {
            return false;
        } else {
            return isTailored;
        }
    }

    /**
     * Sets the value of the isTailored property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTailored(Boolean value) {
        this.isTailored = value;
    }

    /**
     * Gets the value of the isIncomplete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsIncomplete() {
        if (isIncomplete == null) {
            return false;
        } else {
            return isIncomplete;
        }
    }

    /**
     * Sets the value of the isIncomplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsIncomplete(Boolean value) {
        this.isIncomplete = value;
    }

    /**
     * Gets the value of the prohibitPrefDRoutes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isProhibitPrefDRoutes() {
        if (prohibitPrefDRoutes == null) {
            return false;
        } else {
            return prohibitPrefDRoutes;
        }
    }

    /**
     * Sets the value of the prohibitPrefDRoutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProhibitPrefDRoutes(Boolean value) {
        this.prohibitPrefDRoutes = value;
    }

    /**
     * Gets the value of the prohibitPrefARoutes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isProhibitPrefARoutes() {
        if (prohibitPrefARoutes == null) {
            return false;
        } else {
            return prohibitPrefARoutes;
        }
    }

    /**
     * Sets the value of the prohibitPrefARoutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProhibitPrefARoutes(Boolean value) {
        this.prohibitPrefARoutes = value;
    }

    /**
     * Gets the value of the legacyFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegacyFormat() {
        return legacyFormat;
    }

    /**
     * Sets the value of the legacyFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegacyFormat(String value) {
        this.legacyFormat = value;
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
     *         &lt;element name="transitionFix" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}fixType"/>
     *         &lt;element name="airport" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}fixNameType"/>
     *       &lt;/sequence>
     *       &lt;attribute name="routeName" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}standardArrivalRouteNameType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "transitionFix",
        "airport"
    })
    public static class AdaptedArrival {

        @XmlElement(required = true)
        protected FixType transitionFix;
        @XmlElement(required = true)
        protected String airport;
        @XmlAttribute(name = "routeName")
        protected String routeName;

        /**
         * Gets the value of the transitionFix property.
         * 
         * @return
         *     possible object is
         *     {@link FixType }
         *     
         */
        public FixType getTransitionFix() {
            return transitionFix;
        }

        /**
         * Sets the value of the transitionFix property.
         * 
         * @param value
         *     allowed object is
         *     {@link FixType }
         *     
         */
        public void setTransitionFix(FixType value) {
            this.transitionFix = value;
        }

        /**
         * Gets the value of the airport property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAirport() {
            return airport;
        }

        /**
         * Sets the value of the airport property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAirport(String value) {
            this.airport = value;
        }

        /**
         * Gets the value of the routeName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRouteName() {
            return routeName;
        }

        /**
         * Sets the value of the routeName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRouteName(String value) {
            this.routeName = value;
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
     *         &lt;element name="airport" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}fixNameType"/>
     *         &lt;element name="transitionFix" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}fixType"/>
     *       &lt;/sequence>
     *       &lt;attribute name="routeName" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}standardInstrumentDepartureRouteNameType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "airport",
        "transitionFix"
    })
    public static class AdaptedDeparture {

        @XmlElement(required = true)
        protected String airport;
        @XmlElement(required = true)
        protected FixType transitionFix;
        @XmlAttribute(name = "routeName")
        protected String routeName;

        /**
         * Gets the value of the airport property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAirport() {
            return airport;
        }

        /**
         * Sets the value of the airport property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAirport(String value) {
            this.airport = value;
        }

        /**
         * Gets the value of the transitionFix property.
         * 
         * @return
         *     possible object is
         *     {@link FixType }
         *     
         */
        public FixType getTransitionFix() {
            return transitionFix;
        }

        /**
         * Sets the value of the transitionFix property.
         * 
         * @param value
         *     allowed object is
         *     {@link FixType }
         *     
         */
        public void setTransitionFix(FixType value) {
            this.transitionFix = value;
        }

        /**
         * Gets the value of the routeName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRouteName() {
            return routeName;
        }

        /**
         * Sets the value of the routeName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRouteName(String value) {
            this.routeName = value;
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
     *     &lt;extension base="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}fixType">
     *       &lt;attribute name="estimatedTimeOfArrival" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="facilityId" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}facilityIdentifierType" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ArrivalPoint
        extends FixType
    {

        @XmlAttribute(name = "estimatedTimeOfArrival")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar estimatedTimeOfArrival;
        @XmlAttribute(name = "facilityId")
        protected String facilityId;

        /**
         * Gets the value of the estimatedTimeOfArrival property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEstimatedTimeOfArrival() {
            return estimatedTimeOfArrival;
        }

        /**
         * Sets the value of the estimatedTimeOfArrival property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEstimatedTimeOfArrival(XMLGregorianCalendar value) {
            this.estimatedTimeOfArrival = value;
        }

        /**
         * Gets the value of the facilityId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFacilityId() {
            return facilityId;
        }

        /**
         * Sets the value of the facilityId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFacilityId(String value) {
            this.facilityId = value;
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
     *     &lt;extension base="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}fixType">
     *       &lt;attribute name="facilityId" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}facilityIdentifierType" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DeparturePoint
        extends FixType
    {

        @XmlAttribute(name = "facilityId")
        protected String facilityId;

        /**
         * Gets the value of the facilityId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFacilityId() {
            return facilityId;
        }

        /**
         * Sets the value of the facilityId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFacilityId(String value) {
            this.facilityId = value;
        }

    }

}
