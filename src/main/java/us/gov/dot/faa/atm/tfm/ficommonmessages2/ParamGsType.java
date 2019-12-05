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
 * Provides the full definition of a GDP that may be used to create or update a GDP program and also publish the full GDP parameter set
 * 
 * <p>Java class for paramGsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paramGsType">
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
 *         &lt;element name="nowPlus" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="exemptType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="By_Tiers"/>
 *               &lt;enumeration value="By_Distance"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
 *         &lt;element name="nonexemptCenterOrig">
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
 *         &lt;element name="depExemptionType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="By_Status"/>
 *               &lt;enumeration value="By_Time"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paramGsType", propOrder = {
    "aircraftType",
    "arrivalFix",
    "carrierName",
    "nowPlus",
    "exemptType",
    "exemptAirportOrig",
    "exemptFlight",
    "nonexemptCenterOrig",
    "nonexemptAirportOrig",
    "depExemptionType"
})
public class ParamGsType
    extends ParamCommonParamType
{

    @XmlElement(required = true)
    protected String aircraftType;
    @XmlElement(required = true)
    protected ArrivalFixParamsType arrivalFix;
    @XmlElement(required = true)
    protected ParamGsType.CarrierName carrierName;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger nowPlus;
    @XmlElement(required = true)
    protected String exemptType;
    protected ParamGsType.ExemptAirportOrig exemptAirportOrig;
    protected ParamGsType.ExemptFlight exemptFlight;
    @XmlElement(required = true)
    protected ParamGsType.NonexemptCenterOrig nonexemptCenterOrig;
    protected ParamGsType.NonexemptAirportOrig nonexemptAirportOrig;
    @XmlElement(required = true)
    protected String depExemptionType;

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
     *     {@link ParamGsType.CarrierName }
     *     
     */
    public ParamGsType.CarrierName getCarrierName() {
        return carrierName;
    }

    /**
     * Sets the value of the carrierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamGsType.CarrierName }
     *     
     */
    public void setCarrierName(ParamGsType.CarrierName value) {
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
     * Gets the value of the exemptAirportOrig property.
     * 
     * @return
     *     possible object is
     *     {@link ParamGsType.ExemptAirportOrig }
     *     
     */
    public ParamGsType.ExemptAirportOrig getExemptAirportOrig() {
        return exemptAirportOrig;
    }

    /**
     * Sets the value of the exemptAirportOrig property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamGsType.ExemptAirportOrig }
     *     
     */
    public void setExemptAirportOrig(ParamGsType.ExemptAirportOrig value) {
        this.exemptAirportOrig = value;
    }

    /**
     * Gets the value of the exemptFlight property.
     * 
     * @return
     *     possible object is
     *     {@link ParamGsType.ExemptFlight }
     *     
     */
    public ParamGsType.ExemptFlight getExemptFlight() {
        return exemptFlight;
    }

    /**
     * Sets the value of the exemptFlight property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamGsType.ExemptFlight }
     *     
     */
    public void setExemptFlight(ParamGsType.ExemptFlight value) {
        this.exemptFlight = value;
    }

    /**
     * Gets the value of the nonexemptCenterOrig property.
     * 
     * @return
     *     possible object is
     *     {@link ParamGsType.NonexemptCenterOrig }
     *     
     */
    public ParamGsType.NonexemptCenterOrig getNonexemptCenterOrig() {
        return nonexemptCenterOrig;
    }

    /**
     * Sets the value of the nonexemptCenterOrig property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamGsType.NonexemptCenterOrig }
     *     
     */
    public void setNonexemptCenterOrig(ParamGsType.NonexemptCenterOrig value) {
        this.nonexemptCenterOrig = value;
    }

    /**
     * Gets the value of the nonexemptAirportOrig property.
     * 
     * @return
     *     possible object is
     *     {@link ParamGsType.NonexemptAirportOrig }
     *     
     */
    public ParamGsType.NonexemptAirportOrig getNonexemptAirportOrig() {
        return nonexemptAirportOrig;
    }

    /**
     * Sets the value of the nonexemptAirportOrig property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamGsType.NonexemptAirportOrig }
     *     
     */
    public void setNonexemptAirportOrig(ParamGsType.NonexemptAirportOrig value) {
        this.nonexemptAirportOrig = value;
    }

    /**
     * Gets the value of the depExemptionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepExemptionType() {
        return depExemptionType;
    }

    /**
     * Sets the value of the depExemptionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepExemptionType(String value) {
        this.depExemptionType = value;
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
