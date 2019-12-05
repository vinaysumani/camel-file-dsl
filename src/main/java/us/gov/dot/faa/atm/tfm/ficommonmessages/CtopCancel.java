//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package us.gov.dot.faa.atm.tfm.ficommonmessages;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dot.faa.atm.tfm.tfmdatacoreelements.QualifiedAircraftIdType;


/**
 * CTOP Cancel notification.
 * 
 * <p>Java class for ctopCancel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctopCancel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ctopName" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}ctopNameType"/>
 *         &lt;element name="flightList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="flight" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}qualifiedAircraftIdType" maxOccurs="unbounded"/>
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
@XmlType(name = "ctopCancel", propOrder = {
    "ctopName",
    "flightList"
})
public class CtopCancel {

    @XmlElement(required = true)
    protected String ctopName;
    protected CtopCancel.FlightList flightList;

    /**
     * Gets the value of the ctopName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtopName() {
        return ctopName;
    }

    /**
     * Sets the value of the ctopName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtopName(String value) {
        this.ctopName = value;
    }

    /**
     * Gets the value of the flightList property.
     * 
     * @return
     *     possible object is
     *     {@link CtopCancel.FlightList }
     *     
     */
    public CtopCancel.FlightList getFlightList() {
        return flightList;
    }

    /**
     * Sets the value of the flightList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtopCancel.FlightList }
     *     
     */
    public void setFlightList(CtopCancel.FlightList value) {
        this.flightList = value;
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
     *         &lt;element name="flight" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}qualifiedAircraftIdType" maxOccurs="unbounded"/>
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
    public static class FlightList {

        @XmlElement(required = true)
        protected List<QualifiedAircraftIdType> flight;

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
         * {@link QualifiedAircraftIdType }
         * 
         * 
         */
        public List<QualifiedAircraftIdType> getFlight() {
            if (flight == null) {
                flight = new ArrayList<QualifiedAircraftIdType>();
            }
            return this.flight;
        }

    }

}