//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package aero.fixm.flight._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             .Flight Plan Originator: The originator's eight-letter AFTN address, or other appropriate 
 *             contact details, in cases where the originator of the flight plan may not be readily 
 *             identified. 
 *          
 * 
 * <p>Java class for OriginatorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OriginatorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="aftnAddress" type="{http://www.fixm.aero/base/3.0}AftnAddressType" minOccurs="0"/>
 *         &lt;element name="flightOriginator" type="{http://www.fixm.aero/base/3.0}FreeTextType" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginatorType", propOrder = {
    "aftnAddress",
    "flightOriginator"
})
public class OriginatorType {

    protected String aftnAddress;
    protected String flightOriginator;

    /**
     * Gets the value of the aftnAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAftnAddress() {
        return aftnAddress;
    }

    /**
     * Sets the value of the aftnAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAftnAddress(String value) {
        this.aftnAddress = value;
    }

    /**
     * Gets the value of the flightOriginator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightOriginator() {
        return flightOriginator;
    }

    /**
     * Sets the value of the flightOriginator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightOriginator(String value) {
        this.flightOriginator = value;
    }

}
