//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package aero.faa.nas._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import aero.fixm.flight._3.FlightType;


/**
 * 
 *             FlightMessage is used to transmit FIXM flight objects. 
 *          
 * 
 * <p>Java class for FlightMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightMessageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.faa.aero/nas/3.1}AbstractMessageType">
 *       &lt;sequence>
 *         &lt;element name="flight" type="{http://www.fixm.aero/flight/3.0}FlightType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightMessageType", propOrder = {
    "flight"
})
public class FlightMessageType
    extends AbstractMessageType
{

    @XmlElement(required = true)
    protected FlightType flight;

    /**
     * Gets the value of the flight property.
     * 
     * @return
     *     possible object is
     *     {@link FlightType }
     *     
     */
    public FlightType getFlight() {
        return flight;
    }

    /**
     * Sets the value of the flight property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightType }
     *     
     */
    public void setFlight(FlightType value) {
        this.flight = value;
    }

}
