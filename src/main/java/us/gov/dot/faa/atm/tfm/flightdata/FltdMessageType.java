//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package us.gov.dot.faa.atm.tfm.flightdata;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import us.gov.dot.faa.atm.tfm.tfmdatacoreelements.SensitivityType;


/**
 * The fltdMessageType defines the attributes to be used for filtering. A realization of this complex type should exist for each flight data message that is sent to NEMS.
 * 
 * <p>Java class for fltdMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fltdMessageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="sensitivity" use="required" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}sensitivityType" />
 *       &lt;attribute name="cdmPart" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="airline" use="required" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}airlineIdType" />
 *       &lt;attribute name="major" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="sourceFacility" use="required" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}facilityIdentifierType" />
 *       &lt;attribute name="sourceTimeStamp" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="flightRef" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="acid" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}aircraftIdType" />
 *       &lt;attribute name="msgType" use="required" type="{urn:us:gov:dot:faa:atm:tfm:flightdata}messageType" />
 *       &lt;attribute name="fdTrigger" type="{urn:us:gov:dot:faa:atm:tfm:flightdata}fdTriggerType" />
 *       &lt;attribute name="depArpt" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}airportIdType" />
 *       &lt;attribute name="arrArpt" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}airportIdType" />
 *       &lt;attribute name="sensReason">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="FM"/>
 *             &lt;enumeration value="FS"/>
 *             &lt;enumeration value="DR"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fltdMessageType")
@XmlSeeAlso({
    us.gov.dot.faa.atm.tfm.flightdata.FltdOutputType.FltdMessage.class
})
public class FltdMessageType {

    @XmlAttribute(name = "sensitivity", required = true)
    protected SensitivityType sensitivity;
    @XmlAttribute(name = "cdmPart")
    protected Boolean cdmPart;
    @XmlAttribute(name = "airline", required = true)
    protected String airline;
    @XmlAttribute(name = "major", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String major;
    @XmlAttribute(name = "sourceFacility", required = true)
    protected String sourceFacility;
    @XmlAttribute(name = "sourceTimeStamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sourceTimeStamp;
    @XmlAttribute(name = "flightRef", required = true)
    protected BigInteger flightRef;
    @XmlAttribute(name = "acid")
    protected String acid;
    @XmlAttribute(name = "msgType", required = true)
    protected MessageType msgType;
    @XmlAttribute(name = "fdTrigger")
    protected FdTriggerType fdTrigger;
    @XmlAttribute(name = "depArpt")
    protected String depArpt;
    @XmlAttribute(name = "arrArpt")
    protected String arrArpt;
    @XmlAttribute(name = "sensReason")
    protected String sensReason;

    /**
     * Gets the value of the sensitivity property.
     * 
     * @return
     *     possible object is
     *     {@link SensitivityType }
     *     
     */
    public SensitivityType getSensitivity() {
        return sensitivity;
    }

    /**
     * Sets the value of the sensitivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SensitivityType }
     *     
     */
    public void setSensitivity(SensitivityType value) {
        this.sensitivity = value;
    }

    /**
     * Gets the value of the cdmPart property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCdmPart() {
        return cdmPart;
    }

    /**
     * Sets the value of the cdmPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCdmPart(Boolean value) {
        this.cdmPart = value;
    }

    /**
     * Gets the value of the airline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirline() {
        return airline;
    }

    /**
     * Sets the value of the airline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirline(String value) {
        this.airline = value;
    }

    /**
     * Gets the value of the major property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMajor() {
        return major;
    }

    /**
     * Sets the value of the major property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMajor(String value) {
        this.major = value;
    }

    /**
     * Gets the value of the sourceFacility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceFacility() {
        return sourceFacility;
    }

    /**
     * Sets the value of the sourceFacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceFacility(String value) {
        this.sourceFacility = value;
    }

    /**
     * Gets the value of the sourceTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSourceTimeStamp() {
        return sourceTimeStamp;
    }

    /**
     * Sets the value of the sourceTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSourceTimeStamp(XMLGregorianCalendar value) {
        this.sourceTimeStamp = value;
    }

    /**
     * Gets the value of the flightRef property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFlightRef() {
        return flightRef;
    }

    /**
     * Sets the value of the flightRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFlightRef(BigInteger value) {
        this.flightRef = value;
    }

    /**
     * Gets the value of the acid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcid() {
        return acid;
    }

    /**
     * Sets the value of the acid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcid(String value) {
        this.acid = value;
    }

    /**
     * Gets the value of the msgType property.
     * 
     * @return
     *     possible object is
     *     {@link MessageType }
     *     
     */
    public MessageType getMsgType() {
        return msgType;
    }

    /**
     * Sets the value of the msgType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageType }
     *     
     */
    public void setMsgType(MessageType value) {
        this.msgType = value;
    }

    /**
     * Gets the value of the fdTrigger property.
     * 
     * @return
     *     possible object is
     *     {@link FdTriggerType }
     *     
     */
    public FdTriggerType getFdTrigger() {
        return fdTrigger;
    }

    /**
     * Sets the value of the fdTrigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link FdTriggerType }
     *     
     */
    public void setFdTrigger(FdTriggerType value) {
        this.fdTrigger = value;
    }

    /**
     * Gets the value of the depArpt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepArpt() {
        return depArpt;
    }

    /**
     * Sets the value of the depArpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepArpt(String value) {
        this.depArpt = value;
    }

    /**
     * Gets the value of the arrArpt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrArpt() {
        return arrArpt;
    }

    /**
     * Sets the value of the arrArpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrArpt(String value) {
        this.arrArpt = value;
    }

    /**
     * Gets the value of the sensReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSensReason() {
        return sensReason;
    }

    /**
     * Sets the value of the sensReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSensReason(String value) {
        this.sensReason = value;
    }

}
