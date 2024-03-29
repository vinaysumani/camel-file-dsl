//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package us.gov.dot.faa.atm.tfm.ficommonmessages2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Provides the full definition of a GDP Blanket that may be used to create or update a GDP Blanket program and also publish the full GDP Blanket parameter set.
 * 
 * <p>Java class for paramBlanketType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paramBlanketType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages2}paramCommonParamType">
 *       &lt;sequence>
 *         &lt;element name="aircraftType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="ALL"/>
 *               &lt;enumeration value="Jet_Only"/>
 *               &lt;enumeration value="Prop_Only"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="arrivalFix" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages2}arrivalFixParamsType"/>
 *         &lt;element name="carrierName">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="all">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="ALL"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="name" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}airlineIdType"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="nowPlus" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="exemptType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="By_Tiers"/>
 *               &lt;enumeration value="By_Distance"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="exemptDistance" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="airportIfDistance" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="airport" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}airportIdType" maxOccurs="16"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="exemptCenterOrig" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="center" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}facilityIdentifierType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="exemptAirportOrig" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="airport" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}airportIdType" maxOccurs="24"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="exemptFlight" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="flight" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}aircraftIdType" maxOccurs="24"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="nonexemptCenterOrig" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="center" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}facilityIdentifierType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="nonexemptAirportOrig" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="airport" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}airportIdType" maxOccurs="16"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="adjustMinute" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paramBlanketType", propOrder = {
    "aircraftType",
    "arrivalFix",
    "carrierName",
    "nowPlus",
    "exemptType",
    "exemptDistance",
    "airportIfDistance",
    "exemptCenterOrig",
    "exemptAirportOrig",
    "exemptFlight",
    "nonexemptCenterOrig",
    "nonexemptAirportOrig",
    "adjustMinute"
})
public class ParamBlanketType
    extends ParamCommonParamType
{

    @XmlElement(required = true)
    protected String aircraftType;
    @XmlElement(required = true)
    protected ArrivalFixParamsType arrivalFix;
    @XmlElement(required = true)
    protected ParamBlanketType.CarrierName carrierName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger nowPlus;
    @XmlElement(required = true)
    protected String exemptType;
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger exemptDistance;
    protected ParamBlanketType.AirportIfDistance airportIfDistance;
    protected ParamBlanketType.ExemptCenterOrig exemptCenterOrig;
    protected ParamBlanketType.ExemptAirportOrig exemptAirportOrig;
    protected ParamBlanketType.ExemptFlight exemptFlight;
    protected ParamBlanketType.NonexemptCenterOrig nonexemptCenterOrig;
    protected ParamBlanketType.NonexemptAirportOrig nonexemptAirportOrig;
    @XmlElement(required = true)
    protected BigInteger adjustMinute;

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
     * Gets the value of the arrivalFix property.
     * 
     * @return
     *     possible object is
     *     {@link ArrivalFixParamsType }
     *     
     */
    public ArrivalFixParamsType getArrivalFix() {
        return arrivalFix;
    }

    /**
     * Sets the value of the arrivalFix property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrivalFixParamsType }
     *     
     */
    public void setArrivalFix(ArrivalFixParamsType value) {
        this.arrivalFix = value;
    }

    /**
     * Gets the value of the carrierName property.
     * 
     * @return
     *     possible object is
     *     {@link ParamBlanketType.CarrierName }
     *     
     */
    public ParamBlanketType.CarrierName getCarrierName() {
        return carrierName;
    }

    /**
     * Sets the value of the carrierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamBlanketType.CarrierName }
     *     
     */
    public void setCarrierName(ParamBlanketType.CarrierName value) {
        this.carrierName = value;
    }

    /**
     * Gets the value of the nowPlus property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNowPlus() {
        return nowPlus;
    }

    /**
     * Sets the value of the nowPlus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNowPlus(BigInteger value) {
        this.nowPlus = value;
    }

    /**
     * Gets the value of the exemptType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExemptType() {
        return exemptType;
    }

    /**
     * Sets the value of the exemptType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExemptType(String value) {
        this.exemptType = value;
    }

    /**
     * Gets the value of the exemptDistance property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExemptDistance() {
        return exemptDistance;
    }

    /**
     * Sets the value of the exemptDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExemptDistance(BigInteger value) {
        this.exemptDistance = value;
    }

    /**
     * Gets the value of the airportIfDistance property.
     * 
     * @return
     *     possible object is
     *     {@link ParamBlanketType.AirportIfDistance }
     *     
     */
    public ParamBlanketType.AirportIfDistance getAirportIfDistance() {
        return airportIfDistance;
    }

    /**
     * Sets the value of the airportIfDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamBlanketType.AirportIfDistance }
     *     
     */
    public void setAirportIfDistance(ParamBlanketType.AirportIfDistance value) {
        this.airportIfDistance = value;
    }

    /**
     * Gets the value of the exemptCenterOrig property.
     * 
     * @return
     *     possible object is
     *     {@link ParamBlanketType.ExemptCenterOrig }
     *     
     */
    public ParamBlanketType.ExemptCenterOrig getExemptCenterOrig() {
        return exemptCenterOrig;
    }

    /**
     * Sets the value of the exemptCenterOrig property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamBlanketType.ExemptCenterOrig }
     *     
     */
    public void setExemptCenterOrig(ParamBlanketType.ExemptCenterOrig value) {
        this.exemptCenterOrig = value;
    }

    /**
     * Gets the value of the exemptAirportOrig property.
     * 
     * @return
     *     possible object is
     *     {@link ParamBlanketType.ExemptAirportOrig }
     *     
     */
    public ParamBlanketType.ExemptAirportOrig getExemptAirportOrig() {
        return exemptAirportOrig;
    }

    /**
     * Sets the value of the exemptAirportOrig property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamBlanketType.ExemptAirportOrig }
     *     
     */
    public void setExemptAirportOrig(ParamBlanketType.ExemptAirportOrig value) {
        this.exemptAirportOrig = value;
    }

    /**
     * Gets the value of the exemptFlight property.
     * 
     * @return
     *     possible object is
     *     {@link ParamBlanketType.ExemptFlight }
     *     
     */
    public ParamBlanketType.ExemptFlight getExemptFlight() {
        return exemptFlight;
    }

    /**
     * Sets the value of the exemptFlight property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamBlanketType.ExemptFlight }
     *     
     */
    public void setExemptFlight(ParamBlanketType.ExemptFlight value) {
        this.exemptFlight = value;
    }

    /**
     * Gets the value of the nonexemptCenterOrig property.
     * 
     * @return
     *     possible object is
     *     {@link ParamBlanketType.NonexemptCenterOrig }
     *     
     */
    public ParamBlanketType.NonexemptCenterOrig getNonexemptCenterOrig() {
        return nonexemptCenterOrig;
    }

    /**
     * Sets the value of the nonexemptCenterOrig property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamBlanketType.NonexemptCenterOrig }
     *     
     */
    public void setNonexemptCenterOrig(ParamBlanketType.NonexemptCenterOrig value) {
        this.nonexemptCenterOrig = value;
    }

    /**
     * Gets the value of the nonexemptAirportOrig property.
     * 
     * @return
     *     possible object is
     *     {@link ParamBlanketType.NonexemptAirportOrig }
     *     
     */
    public ParamBlanketType.NonexemptAirportOrig getNonexemptAirportOrig() {
        return nonexemptAirportOrig;
    }

    /**
     * Sets the value of the nonexemptAirportOrig property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamBlanketType.NonexemptAirportOrig }
     *     
     */
    public void setNonexemptAirportOrig(ParamBlanketType.NonexemptAirportOrig value) {
        this.nonexemptAirportOrig = value;
    }

    /**
     * Gets the value of the adjustMinute property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAdjustMinute() {
        return adjustMinute;
    }

    /**
     * Sets the value of the adjustMinute property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAdjustMinute(BigInteger value) {
        this.adjustMinute = value;
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
     *         &lt;element name="airport" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}airportIdType" maxOccurs="16"/>
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
        "airport"
    })
    public static class AirportIfDistance {

        @XmlElement(required = true)
        protected List<String> airport;

        /**
         * Gets the value of the airport property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the airport property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAirport().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getAirport() {
            if (airport == null) {
                airport = new ArrayList<String>();
            }
            return this.airport;
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
     *       &lt;choice>
     *         &lt;element name="all">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="ALL"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="name" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}airlineIdType"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "all",
        "name"
    })
    public static class CarrierName {

        protected String all;
        protected String name;

        /**
         * Gets the value of the all property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAll() {
            return all;
        }

        /**
         * Sets the value of the all property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAll(String value) {
            this.all = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
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
     *         &lt;element name="airport" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}airportIdType" maxOccurs="24"/>
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
        "airport"
    })
    public static class ExemptAirportOrig {

        @XmlElement(required = true)
        protected List<String> airport;

        /**
         * Gets the value of the airport property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the airport property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAirport().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getAirport() {
            if (airport == null) {
                airport = new ArrayList<String>();
            }
            return this.airport;
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
     *         &lt;element name="center" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}facilityIdentifierType" maxOccurs="unbounded"/>
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
        "center"
    })
    public static class ExemptCenterOrig {

        @XmlElement(required = true)
        protected List<String> center;

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
     *         &lt;element name="flight" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}aircraftIdType" maxOccurs="24"/>
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
        "flight"
    })
    public static class ExemptFlight {

        @XmlElement(required = true)
        protected List<String> flight;

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
         * {@link String }
         * 
         * 
         */
        public List<String> getFlight() {
            if (flight == null) {
                flight = new ArrayList<String>();
            }
            return this.flight;
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
     *         &lt;element name="airport" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}airportIdType" maxOccurs="16"/>
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
        "airport"
    })
    public static class NonexemptAirportOrig {

        @XmlElement(required = true)
        protected List<String> airport;

        /**
         * Gets the value of the airport property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the airport property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAirport().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getAirport() {
            if (airport == null) {
                airport = new ArrayList<String>();
            }
            return this.airport;
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
     *         &lt;element name="center" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}facilityIdentifierType" maxOccurs="unbounded"/>
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
        "center"
    })
    public static class NonexemptCenterOrig {

        @XmlElement(required = true)
        protected List<String> center;

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

}
