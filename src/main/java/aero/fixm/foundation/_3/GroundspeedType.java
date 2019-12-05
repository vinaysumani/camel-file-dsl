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
 *             The Groundspeed type represents any ground speed measurement, in metric. or imperial, 
 *             as 
 *             specified by the "uom" attribute. 
 *          
 * 
 * <p>Java class for GroundspeedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GroundspeedType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.fixm.aero/foundation/3.0>UnitOfMeasureType">
 *       &lt;attribute name="uom" use="required" type="{http://www.fixm.aero/foundation/3.0}GroundspeedMeasureType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroundspeedType", propOrder = {
    "value"
})
public class GroundspeedType {

    @XmlValue
    protected double value;
    @XmlAttribute(name = "uom", required = true)
    protected GroundspeedMeasureType uom;

    /**
     * 
     *             Abstract Supertype for all units of measure. Takes the place of gml:UnitOfMeasureType. 
     *             
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
     *     {@link GroundspeedMeasureType }
     *     
     */
    public GroundspeedMeasureType getUom() {
        return uom;
    }

    /**
     * Sets the value of the uom property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroundspeedMeasureType }
     *     
     */
    public void setUom(GroundspeedMeasureType value) {
        this.uom = value;
    }

}
