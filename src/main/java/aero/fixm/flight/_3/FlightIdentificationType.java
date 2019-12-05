//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package aero.fixm.flight._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import aero.faa.nas._3.NasFlightIdentificationType;


/**
 * 
 *             Groups flight identifying data such as the aircraft and carrier information. 
 *          
 * 
 * <p>Java class for FlightIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="marketingCarrierFlightIdentifier" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;list itemType="{http://www.fixm.aero/base/3.0}FlightIdentifierType" />
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="aircraftIdentification" type="{http://www.fixm.aero/base/3.0}FlightIdentifierType" />
 *       &lt;attribute name="majorCarrierIdentifier" type="{http://www.fixm.aero/base/3.0}CarrierIdentifierType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightIdentificationType", propOrder = {
    "marketingCarrierFlightIdentifier"
})
@XmlSeeAlso({
    NasFlightIdentificationType.class
})
public class FlightIdentificationType {

    @XmlList
    protected List<String> marketingCarrierFlightIdentifier;
    @XmlAttribute(name = "aircraftIdentification")
    protected String aircraftIdentification;
    @XmlAttribute(name = "majorCarrierIdentifier")
    protected String majorCarrierIdentifier;

    /**
     * Gets the value of the marketingCarrierFlightIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marketingCarrierFlightIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarketingCarrierFlightIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMarketingCarrierFlightIdentifier() {
        if (marketingCarrierFlightIdentifier == null) {
            marketingCarrierFlightIdentifier = new ArrayList<String>();
        }
        return this.marketingCarrierFlightIdentifier;
    }

    /**
     * Gets the value of the aircraftIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAircraftIdentification() {
        return aircraftIdentification;
    }

    /**
     * Sets the value of the aircraftIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAircraftIdentification(String value) {
        this.aircraftIdentification = value;
    }

    /**
     * Gets the value of the majorCarrierIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMajorCarrierIdentifier() {
        return majorCarrierIdentifier;
    }

    /**
     * Sets the value of the majorCarrierIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMajorCarrierIdentifier(String value) {
        this.majorCarrierIdentifier = value;
    }

}
