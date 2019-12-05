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
 * This message from a client to the server sends simplified subs or slot credit sub messages from the airline to the server. The data buffer contains the packet header followed by a variable number of messages terminated by line feeds. The short data field contains a sequence number, which is simply an integer incremented by one for each packet sent; the range of the sequence numbers is 1 to 9999.
 * 
 * <p>Java class for slotCreditSubstitutionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="slotCreditSubstitutionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="commonCompositeFlightId" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}commonCompositeFlightIdType"/>
 *         &lt;element name="earliestDepartureTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="latestArrivalTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="arrivalSlot" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}arrivalSlotType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "slotCreditSubstitutionType", propOrder = {
    "commonCompositeFlightId",
    "earliestDepartureTime",
    "latestArrivalTime",
    "arrivalSlot"
})
public class SlotCreditSubstitutionType {

    @XmlElement(required = true)
    protected CommonCompositeFlightIdType commonCompositeFlightId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar earliestDepartureTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar latestArrivalTime;
    @XmlElement(required = true)
    protected ArrivalSlotType arrivalSlot;

    /**
     * Gets the value of the commonCompositeFlightId property.
     * 
     * @return
     *     possible object is
     *     {@link CommonCompositeFlightIdType }
     *     
     */
    public CommonCompositeFlightIdType getCommonCompositeFlightId() {
        return commonCompositeFlightId;
    }

    /**
     * Sets the value of the commonCompositeFlightId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonCompositeFlightIdType }
     *     
     */
    public void setCommonCompositeFlightId(CommonCompositeFlightIdType value) {
        this.commonCompositeFlightId = value;
    }

    /**
     * Gets the value of the earliestDepartureTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEarliestDepartureTime() {
        return earliestDepartureTime;
    }

    /**
     * Sets the value of the earliestDepartureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEarliestDepartureTime(XMLGregorianCalendar value) {
        this.earliestDepartureTime = value;
    }

    /**
     * Gets the value of the latestArrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLatestArrivalTime() {
        return latestArrivalTime;
    }

    /**
     * Sets the value of the latestArrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLatestArrivalTime(XMLGregorianCalendar value) {
        this.latestArrivalTime = value;
    }

    /**
     * Gets the value of the arrivalSlot property.
     * 
     * @return
     *     possible object is
     *     {@link ArrivalSlotType }
     *     
     */
    public ArrivalSlotType getArrivalSlot() {
        return arrivalSlot;
    }

    /**
     * Sets the value of the arrivalSlot property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrivalSlotType }
     *     
     */
    public void setArrivalSlot(ArrivalSlotType value) {
        this.arrivalSlot = value;
    }

}