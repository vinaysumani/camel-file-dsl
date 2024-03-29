//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package us.gov.dot.faa.atm.tfm.tfmrequestreplytypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Defines the Historical Pop-up Data returned for a user request.
 * 
 * <p>Java class for histPopupDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="histPopupDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="airport" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}airportIdType"/>
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="highPercentile" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}histPopupParType"/>
 *         &lt;element name="mediumPercentile" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}histPopupParType"/>
 *         &lt;element name="lowPercentile" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}histPopupParType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "histPopupDataType", propOrder = {
    "airport",
    "startTime",
    "endTime",
    "highPercentile",
    "mediumPercentile",
    "lowPercentile"
})
public class HistPopupDataType {

    @XmlElement(required = true)
    protected String airport;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;
    @XmlElement(required = true)
    protected HistPopupParType highPercentile;
    @XmlElement(required = true)
    protected HistPopupParType mediumPercentile;
    @XmlElement(required = true)
    protected HistPopupParType lowPercentile;

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
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the highPercentile property.
     * 
     * @return
     *     possible object is
     *     {@link HistPopupParType }
     *     
     */
    public HistPopupParType getHighPercentile() {
        return highPercentile;
    }

    /**
     * Sets the value of the highPercentile property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistPopupParType }
     *     
     */
    public void setHighPercentile(HistPopupParType value) {
        this.highPercentile = value;
    }

    /**
     * Gets the value of the mediumPercentile property.
     * 
     * @return
     *     possible object is
     *     {@link HistPopupParType }
     *     
     */
    public HistPopupParType getMediumPercentile() {
        return mediumPercentile;
    }

    /**
     * Sets the value of the mediumPercentile property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistPopupParType }
     *     
     */
    public void setMediumPercentile(HistPopupParType value) {
        this.mediumPercentile = value;
    }

    /**
     * Gets the value of the lowPercentile property.
     * 
     * @return
     *     possible object is
     *     {@link HistPopupParType }
     *     
     */
    public HistPopupParType getLowPercentile() {
        return lowPercentile;
    }

    /**
     * Sets the value of the lowPercentile property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistPopupParType }
     *     
     */
    public void setLowPercentile(HistPopupParType value) {
        this.lowPercentile = value;
    }

}
