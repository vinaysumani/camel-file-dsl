//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package us.gov.dot.faa.atm.tfm.tfmdatacoreelements;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * This form of the flightTraversalDataType groups the data more like the original legacy message. Waypoints, sectors, fixes, airways, and centers are ordered lists within their parent elements.
 * 
 * <p>Java class for flightTraversalDataType2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="flightTraversalDataType2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fix" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements>fixNameType">
 *                 &lt;attribute name="sequenceNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="elapsedTime" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="waypoint" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}positionType">
 *                 &lt;attribute name="sequenceNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="elapsedTime" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="airway" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements>routeNameType">
 *                 &lt;attribute name="sequenceNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="center" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements>facilityIdentifierType">
 *                 &lt;attribute name="sequenceNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="elapsedEntryTime" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="sector" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements>sectorIdentifierType">
 *                 &lt;attribute name="sequenceNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="elapsedEntryTime" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
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
@XmlType(name = "flightTraversalDataType2", propOrder = {
    "fix",
    "waypoint",
    "airway",
    "center",
    "sector"
})
public class FlightTraversalDataType2 {

    protected List<FlightTraversalDataType2 .Fix> fix;
    protected List<FlightTraversalDataType2 .Waypoint> waypoint;
    protected List<FlightTraversalDataType2 .Airway> airway;
    protected List<FlightTraversalDataType2 .Center> center;
    protected List<FlightTraversalDataType2 .Sector> sector;

    /**
     * Gets the value of the fix property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fix property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFix().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightTraversalDataType2 .Fix }
     * 
     * 
     */
    public List<FlightTraversalDataType2 .Fix> getFix() {
        if (fix == null) {
            fix = new ArrayList<FlightTraversalDataType2 .Fix>();
        }
        return this.fix;
    }

    /**
     * Gets the value of the waypoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the waypoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWaypoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightTraversalDataType2 .Waypoint }
     * 
     * 
     */
    public List<FlightTraversalDataType2 .Waypoint> getWaypoint() {
        if (waypoint == null) {
            waypoint = new ArrayList<FlightTraversalDataType2 .Waypoint>();
        }
        return this.waypoint;
    }

    /**
     * Gets the value of the airway property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airway property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirway().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightTraversalDataType2 .Airway }
     * 
     * 
     */
    public List<FlightTraversalDataType2 .Airway> getAirway() {
        if (airway == null) {
            airway = new ArrayList<FlightTraversalDataType2 .Airway>();
        }
        return this.airway;
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
     * {@link FlightTraversalDataType2 .Center }
     * 
     * 
     */
    public List<FlightTraversalDataType2 .Center> getCenter() {
        if (center == null) {
            center = new ArrayList<FlightTraversalDataType2 .Center>();
        }
        return this.center;
    }

    /**
     * Gets the value of the sector property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sector property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSector().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightTraversalDataType2 .Sector }
     * 
     * 
     */
    public List<FlightTraversalDataType2 .Sector> getSector() {
        if (sector == null) {
            sector = new ArrayList<FlightTraversalDataType2 .Sector>();
        }
        return this.sector;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements>routeNameType">
     *       &lt;attribute name="sequenceNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Airway {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "sequenceNumber")
        protected BigInteger sequenceNumber;

        /**
         * Simple type defining the structure for describing the elements necessary to define the identity of a flight's route.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the sequenceNumber property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSequenceNumber() {
            return sequenceNumber;
        }

        /**
         * Sets the value of the sequenceNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSequenceNumber(BigInteger value) {
            this.sequenceNumber = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements>facilityIdentifierType">
     *       &lt;attribute name="sequenceNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="elapsedEntryTime" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Center {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "sequenceNumber")
        protected BigInteger sequenceNumber;
        @XmlAttribute(name = "elapsedEntryTime")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger elapsedEntryTime;

        /**
         * Valid Format: LLL(L) "Name" of a NAS Facility.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the sequenceNumber property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSequenceNumber() {
            return sequenceNumber;
        }

        /**
         * Sets the value of the sequenceNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSequenceNumber(BigInteger value) {
            this.sequenceNumber = value;
        }

        /**
         * Gets the value of the elapsedEntryTime property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getElapsedEntryTime() {
            return elapsedEntryTime;
        }

        /**
         * Sets the value of the elapsedEntryTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setElapsedEntryTime(BigInteger value) {
            this.elapsedEntryTime = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements>fixNameType">
     *       &lt;attribute name="sequenceNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="elapsedTime" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Fix {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "sequenceNumber")
        protected BigInteger sequenceNumber;
        @XmlAttribute(name = "elapsedTime")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger elapsedTime;

        /**
         * The sequence of alphanumeric characters, if adapted, identifies a geographic point. A four character fix name must include at least one letter. Example: PHX; TH; F4DOV Note: the restriction of a four character fix name must include at least one letter may be able to be lifted after modernization as the restriction may have been imposed to prevent confusing the data with other data of the same format such as time or a beacon code. This would not be a problem with well-formed tags with descriptive names. e.g. <fix>1100</fix> cannot be confused with any time as modernization uses the xsd:dateTime and xsd:time formats nor could it be confused with <beaconCode>1100</beaconCode>
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the sequenceNumber property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSequenceNumber() {
            return sequenceNumber;
        }

        /**
         * Sets the value of the sequenceNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSequenceNumber(BigInteger value) {
            this.sequenceNumber = value;
        }

        /**
         * Gets the value of the elapsedTime property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getElapsedTime() {
            return elapsedTime;
        }

        /**
         * Sets the value of the elapsedTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setElapsedTime(BigInteger value) {
            this.elapsedTime = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements>sectorIdentifierType">
     *       &lt;attribute name="sequenceNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="elapsedEntryTime" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Sector {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "sequenceNumber")
        protected BigInteger sequenceNumber;
        @XmlAttribute(name = "elapsedEntryTime")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger elapsedEntryTime;

        /**
         * This was made to accommodate ASDI sector names
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the sequenceNumber property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSequenceNumber() {
            return sequenceNumber;
        }

        /**
         * Sets the value of the sequenceNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSequenceNumber(BigInteger value) {
            this.sequenceNumber = value;
        }

        /**
         * Gets the value of the elapsedEntryTime property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getElapsedEntryTime() {
            return elapsedEntryTime;
        }

        /**
         * Sets the value of the elapsedEntryTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setElapsedEntryTime(BigInteger value) {
            this.elapsedEntryTime = value;
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
     *     &lt;extension base="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}positionType">
     *       &lt;attribute name="sequenceNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="elapsedTime" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Waypoint
        extends PositionType
    {

        @XmlAttribute(name = "sequenceNumber")
        protected BigInteger sequenceNumber;
        @XmlAttribute(name = "elapsedTime")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger elapsedTime;

        /**
         * Gets the value of the sequenceNumber property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSequenceNumber() {
            return sequenceNumber;
        }

        /**
         * Sets the value of the sequenceNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSequenceNumber(BigInteger value) {
            this.sequenceNumber = value;
        }

        /**
         * Gets the value of the elapsedTime property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getElapsedTime() {
            return elapsedTime;
        }

        /**
         * Sets the value of the elapsedTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setElapsedTime(BigInteger value) {
            this.elapsedTime = value;
        }

    }

}
