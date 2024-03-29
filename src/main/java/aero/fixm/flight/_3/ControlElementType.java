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
 *             .Control Element: The constrained aerodrome or airspace element (subject to a Traffic 
 *             Management Initiative/Regulation) indicating the reason for a flight being controlled. 
 *             
 *          
 * 
 * <p>Java class for ControlElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ControlElementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="airspace" type="{http://www.fixm.aero/flight/3.0}AirspaceConstraintType" minOccurs="0"/>
 *         &lt;element name="arrivalAerodrome" type="{http://www.fixm.aero/foundation/3.0}AerodromeIcaoCodeType" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ControlElementType", propOrder = {
    "airspace",
    "arrivalAerodrome"
})
public class ControlElementType {

    protected AirspaceConstraintType airspace;
    protected String arrivalAerodrome;

    /**
     * Gets the value of the airspace property.
     * 
     * @return
     *     possible object is
     *     {@link AirspaceConstraintType }
     *     
     */
    public AirspaceConstraintType getAirspace() {
        return airspace;
    }

    /**
     * Sets the value of the airspace property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirspaceConstraintType }
     *     
     */
    public void setAirspace(AirspaceConstraintType value) {
        this.airspace = value;
    }

    /**
     * Gets the value of the arrivalAerodrome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalAerodrome() {
        return arrivalAerodrome;
    }

    /**
     * Sets the value of the arrivalAerodrome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalAerodrome(String value) {
        this.arrivalAerodrome = value;
    }

}
