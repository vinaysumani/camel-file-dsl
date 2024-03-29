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
 * The EDCT Update command updates a controlled flight with the new departure and arrival times.
 * 
 * <p>Java class for edctUpdateCommandType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="edctUpdateCommandType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aircraft" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}aircraftIdType"/>
 *         &lt;element name="departureAirport" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}airportIdType"/>
 *         &lt;element name="arrivalAirport" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}airportIdType"/>
 *         &lt;element name="igtd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ctd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cta" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cx" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Y"/>
 *               &lt;enumeration value="N"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="sh" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Y"/>
 *               &lt;enumeration value="N"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="erta" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "edctUpdateCommandType", propOrder = {
    "aircraft",
    "departureAirport",
    "arrivalAirport",
    "igtd",
    "ctd",
    "cta",
    "cx",
    "sh",
    "erta"
})
public class EdctUpdateCommandType {

    @XmlElement(required = true)
    protected String aircraft;
    @XmlElement(required = true)
    protected String departureAirport;
    @XmlElement(required = true)
    protected String arrivalAirport;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar igtd;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ctd;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cta;
    protected String cx;
    protected String sh;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar erta;

    /**
     * Gets the value of the aircraft property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAircraft() {
        return aircraft;
    }

    /**
     * Sets the value of the aircraft property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAircraft(String value) {
        this.aircraft = value;
    }

    /**
     * Gets the value of the departureAirport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureAirport() {
        return departureAirport;
    }

    /**
     * Sets the value of the departureAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureAirport(String value) {
        this.departureAirport = value;
    }

    /**
     * Gets the value of the arrivalAirport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalAirport() {
        return arrivalAirport;
    }

    /**
     * Sets the value of the arrivalAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalAirport(String value) {
        this.arrivalAirport = value;
    }

    /**
     * Gets the value of the igtd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIgtd() {
        return igtd;
    }

    /**
     * Sets the value of the igtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIgtd(XMLGregorianCalendar value) {
        this.igtd = value;
    }

    /**
     * Gets the value of the ctd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCtd() {
        return ctd;
    }

    /**
     * Sets the value of the ctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCtd(XMLGregorianCalendar value) {
        this.ctd = value;
    }

    /**
     * Gets the value of the cta property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCta() {
        return cta;
    }

    /**
     * Sets the value of the cta property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCta(XMLGregorianCalendar value) {
        this.cta = value;
    }

    /**
     * Gets the value of the cx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCx() {
        return cx;
    }

    /**
     * Sets the value of the cx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCx(String value) {
        this.cx = value;
    }

    /**
     * Gets the value of the sh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSh() {
        return sh;
    }

    /**
     * Sets the value of the sh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSh(String value) {
        this.sh = value;
    }

    /**
     * Gets the value of the erta property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getErta() {
        return erta;
    }

    /**
     * Sets the value of the erta property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setErta(XMLGregorianCalendar value) {
        this.erta = value;
    }

}
