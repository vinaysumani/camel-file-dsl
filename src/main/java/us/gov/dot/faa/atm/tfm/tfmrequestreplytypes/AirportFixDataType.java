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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines the requested for airport.
 * 
 * <p>Java class for airportFixDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="airportFixDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="airport" maxOccurs="50">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="arrFix" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}fixNameType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="depFix" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}fixNameType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="name" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}airportIdType" />
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
@XmlType(name = "airportFixDataType", propOrder = {
    "airport"
})
public class AirportFixDataType {

    @XmlElement(required = true)
    protected List<AirportFixDataType.Airport> airport;

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
     * {@link AirportFixDataType.Airport }
     * 
     * 
     */
    public List<AirportFixDataType.Airport> getAirport() {
        if (airport == null) {
            airport = new ArrayList<AirportFixDataType.Airport>();
        }
        return this.airport;
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
     *         &lt;element name="arrFix" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}fixNameType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="depFix" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}fixNameType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="name" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}airportIdType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "arrFix",
        "depFix"
    })
    public static class Airport {

        protected List<String> arrFix;
        protected List<String> depFix;
        @XmlAttribute(name = "name")
        protected String name;

        /**
         * Gets the value of the arrFix property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the arrFix property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getArrFix().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getArrFix() {
            if (arrFix == null) {
                arrFix = new ArrayList<String>();
            }
            return this.arrFix;
        }

        /**
         * Gets the value of the depFix property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the depFix property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDepFix().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getDepFix() {
            if (depFix == null) {
                depFix = new ArrayList<String>();
            }
            return this.depFix;
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

}
