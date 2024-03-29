//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package aero.faa.nas._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import aero.fixm.base._3.ReportedTimeType;


/**
 * 
 *             Container for NAS Specific Runway Departure Times. 
 *          
 * 
 * <p>Java class for RunwayDepartureTimeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RunwayDepartureTimeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="airlineActual" type="{http://www.fixm.aero/base/3.0}ReportedTimeType" minOccurs="0"/>
 *         &lt;element name="airlineEstimated" type="{http://www.fixm.aero/base/3.0}ReportedTimeType" minOccurs="0"/>
 *         &lt;element name="earliest" type="{http://www.fixm.aero/base/3.0}ReportedTimeType" minOccurs="0"/>
 *         &lt;element name="original" type="{http://www.fixm.aero/base/3.0}ReportedTimeType" minOccurs="0"/>
 *         &lt;element name="preferred" type="{http://www.fixm.aero/base/3.0}ReportedTimeType" minOccurs="0"/>
 *         &lt;element name="tfmsEstimated" type="{http://www.faa.aero/nas/3.1}TfmsEstimatedDepartureTimeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RunwayDepartureTimeType", propOrder = {
    "airlineActual",
    "airlineEstimated",
    "earliest",
    "original",
    "preferred",
    "tfmsEstimated"
})
public class RunwayDepartureTimeType {

    protected ReportedTimeType airlineActual;
    protected ReportedTimeType airlineEstimated;
    protected ReportedTimeType earliest;
    protected ReportedTimeType original;
    protected ReportedTimeType preferred;
    protected TfmsEstimatedDepartureTimeType tfmsEstimated;

    /**
     * Gets the value of the airlineActual property.
     * 
     * @return
     *     possible object is
     *     {@link ReportedTimeType }
     *     
     */
    public ReportedTimeType getAirlineActual() {
        return airlineActual;
    }

    /**
     * Sets the value of the airlineActual property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportedTimeType }
     *     
     */
    public void setAirlineActual(ReportedTimeType value) {
        this.airlineActual = value;
    }

    /**
     * Gets the value of the airlineEstimated property.
     * 
     * @return
     *     possible object is
     *     {@link ReportedTimeType }
     *     
     */
    public ReportedTimeType getAirlineEstimated() {
        return airlineEstimated;
    }

    /**
     * Sets the value of the airlineEstimated property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportedTimeType }
     *     
     */
    public void setAirlineEstimated(ReportedTimeType value) {
        this.airlineEstimated = value;
    }

    /**
     * Gets the value of the earliest property.
     * 
     * @return
     *     possible object is
     *     {@link ReportedTimeType }
     *     
     */
    public ReportedTimeType getEarliest() {
        return earliest;
    }

    /**
     * Sets the value of the earliest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportedTimeType }
     *     
     */
    public void setEarliest(ReportedTimeType value) {
        this.earliest = value;
    }

    /**
     * Gets the value of the original property.
     * 
     * @return
     *     possible object is
     *     {@link ReportedTimeType }
     *     
     */
    public ReportedTimeType getOriginal() {
        return original;
    }

    /**
     * Sets the value of the original property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportedTimeType }
     *     
     */
    public void setOriginal(ReportedTimeType value) {
        this.original = value;
    }

    /**
     * Gets the value of the preferred property.
     * 
     * @return
     *     possible object is
     *     {@link ReportedTimeType }
     *     
     */
    public ReportedTimeType getPreferred() {
        return preferred;
    }

    /**
     * Sets the value of the preferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportedTimeType }
     *     
     */
    public void setPreferred(ReportedTimeType value) {
        this.preferred = value;
    }

    /**
     * Gets the value of the tfmsEstimated property.
     * 
     * @return
     *     possible object is
     *     {@link TfmsEstimatedDepartureTimeType }
     *     
     */
    public TfmsEstimatedDepartureTimeType getTfmsEstimated() {
        return tfmsEstimated;
    }

    /**
     * Sets the value of the tfmsEstimated property.
     * 
     * @param value
     *     allowed object is
     *     {@link TfmsEstimatedDepartureTimeType }
     *     
     */
    public void setTfmsEstimated(TfmsEstimatedDepartureTimeType value) {
        this.tfmsEstimated = value;
    }

}
