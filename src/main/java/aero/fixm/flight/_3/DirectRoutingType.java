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
import aero.fixm.base._3.SignificantPointType;


/**
 * 
 *             .Cleared Direct To: Contains the optional starting location from which the direct 
 *             clearance is granted and the position the aircraft has been cleared directly to. 
 *             
 *          
 * 
 * <p>Java class for DirectRoutingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DirectRoutingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="from" type="{http://www.fixm.aero/base/3.0}SignificantPointType" minOccurs="0"/>
 *         &lt;element name="to" type="{http://www.fixm.aero/base/3.0}SignificantPointType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectRoutingType", propOrder = {
    "from",
    "to"
})
public class DirectRoutingType {

    protected SignificantPointType from;
    protected SignificantPointType to;

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link SignificantPointType }
     *     
     */
    public SignificantPointType getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignificantPointType }
     *     
     */
    public void setFrom(SignificantPointType value) {
        this.from = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link SignificantPointType }
     *     
     */
    public SignificantPointType getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignificantPointType }
     *     
     */
    public void setTo(SignificantPointType value) {
        this.to = value;
    }

}
