//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package aero.fixm.foundation._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 *             .Vertical Rate: An expression of an aircraft's vertical rate of change (climb if 
 *             positive, descent if negative) expressed as a float [(-3000)-3000] if expressed in 
 *             ft/min, [(-15)-15] if expressed in m/s. 
 *          
 * 
 * <p>Java class for VerticalRateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VerticalRateType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.fixm.aero/foundation/3.0>RestrictedVerticalRateType">
 *       &lt;attribute name="uom" use="required" type="{http://www.fixm.aero/foundation/3.0}VerticalRateMeasureType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerticalRateType", propOrder = {
    "value"
})
public class VerticalRateType {

    @XmlValue
    protected double value;
    @XmlAttribute(name = "uom", required = true)
    protected VerticalRateMeasureType uom;

    /**
     * 
     *             Helper type for restrictions on VerticalRateType 
     *          
     * 
     */
    public double getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Gets the value of the uom property.
     * 
     * @return
     *     possible object is
     *     {@link VerticalRateMeasureType }
     *     
     */
    public VerticalRateMeasureType getUom() {
        return uom;
    }

    /**
     * Sets the value of the uom property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerticalRateMeasureType }
     *     
     */
    public void setUom(VerticalRateMeasureType value) {
        this.uom = value;
    }

}