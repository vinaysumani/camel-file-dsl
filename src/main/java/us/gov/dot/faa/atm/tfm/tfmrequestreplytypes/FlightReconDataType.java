//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package us.gov.dot.faa.atm.tfm.tfmrequestreplytypes;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Defines the data returned by a flight resync request.
 * 
 * <p>Java class for flightReconDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="flightReconDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transmitTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="seqNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="maxSeqNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="last" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="flightData" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}flightReconstitutionInformationType" maxOccurs="128"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flightReconDataType", propOrder = {
    "transmitTime",
    "seqNumber",
    "maxSeqNumber",
    "last",
    "flightData"
})
public class FlightReconDataType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transmitTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger seqNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maxSeqNumber;
    protected boolean last;
    @XmlElement(required = true)
    protected List<FlightReconstitutionInformationType> flightData;

    /**
     * Gets the value of the transmitTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransmitTime() {
        return transmitTime;
    }

    /**
     * Sets the value of the transmitTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransmitTime(XMLGregorianCalendar value) {
        this.transmitTime = value;
    }

    /**
     * Gets the value of the seqNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSeqNumber() {
        return seqNumber;
    }

    /**
     * Sets the value of the seqNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSeqNumber(BigInteger value) {
        this.seqNumber = value;
    }

    /**
     * Gets the value of the maxSeqNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxSeqNumber() {
        return maxSeqNumber;
    }

    /**
     * Sets the value of the maxSeqNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxSeqNumber(BigInteger value) {
        this.maxSeqNumber = value;
    }

    /**
     * Gets the value of the last property.
     * 
     */
    public boolean isLast() {
        return last;
    }

    /**
     * Sets the value of the last property.
     * 
     */
    public void setLast(boolean value) {
        this.last = value;
    }

    /**
     * Gets the value of the flightData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightReconstitutionInformationType }
     * 
     * 
     */
    public List<FlightReconstitutionInformationType> getFlightData() {
        if (flightData == null) {
            flightData = new ArrayList<FlightReconstitutionInformationType>();
        }
        return this.flightData;
    }

}