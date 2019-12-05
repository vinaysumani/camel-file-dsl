//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package us.gov.dot.faa.atm.tfm.ficommondatatypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * List of flight data.
 * 
 * <p>Java class for flightInfoListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="flightInfoListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="flightInfo" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="flightId" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}aircraftIdType"/>
 *                   &lt;element name="carrier" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}airlineIdType" minOccurs="0"/>
 *                   &lt;element name="propulsion" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}propulsionType" minOccurs="0"/>
 *                   &lt;element name="arrivalFix" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}fixNameType" minOccurs="0"/>
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
@XmlType(name = "flightInfoListType", propOrder = {
    "flightInfo"
})
public class FlightInfoListType {

    @XmlElement(required = true)
    protected List<FlightInfoListType.FlightInfo> flightInfo;

    /**
     * Gets the value of the flightInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightInfoListType.FlightInfo }
     * 
     * 
     */
    public List<FlightInfoListType.FlightInfo> getFlightInfo() {
        if (flightInfo == null) {
            flightInfo = new ArrayList<FlightInfoListType.FlightInfo>();
        }
        return this.flightInfo;
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
     *         &lt;element name="carrier" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}airlineIdType" minOccurs="0"/>
     *         &lt;element name="propulsion" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}propulsionType" minOccurs="0"/>
     *         &lt;element name="arrivalFix" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}fixNameType" minOccurs="0"/>
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
        "carrier",
        "propulsion",
        "arrivalFix"
    })
    public static class FlightInfo {

        @XmlElement(required = true)
        protected String flightId;
        protected String carrier;
        @XmlSchemaType(name = "string")
        protected PropulsionType propulsion;
        protected String arrivalFix;

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
         * Gets the value of the carrier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCarrier() {
            return carrier;
        }

        /**
         * Sets the value of the carrier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCarrier(String value) {
            this.carrier = value;
        }

        /**
         * Gets the value of the propulsion property.
         * 
         * @return
         *     possible object is
         *     {@link PropulsionType }
         *     
         */
        public PropulsionType getPropulsion() {
            return propulsion;
        }

        /**
         * Sets the value of the propulsion property.
         * 
         * @param value
         *     allowed object is
         *     {@link PropulsionType }
         *     
         */
        public void setPropulsion(PropulsionType value) {
            this.propulsion = value;
        }

        /**
         * Gets the value of the arrivalFix property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getArrivalFix() {
            return arrivalFix;
        }

        /**
         * Sets the value of the arrivalFix property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setArrivalFix(String value) {
            this.arrivalFix = value;
        }

    }

}
