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
 *             The Volume type represents any volume measurement, in metric or imperial measurements. 
 *             
 *          
 * 
 * <p>Java class for VolumeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VolumeType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.fixm.aero/foundation/3.0>UnitOfMeasureType">
 *       &lt;attribute name="uom" use="required" type="{http://www.fixm.aero/foundation/3.0}VolumeMeasureType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolumeType", propOrder = {
    "value"
})
public class VolumeType {

    @XmlValue
    protected double value;
    @XmlAttribute(name = "uom", required = true)
    protected VolumeMeasureType uom;

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
     *     {@link VolumeMeasureType }
     *     
     */
    public VolumeMeasureType getUom() {
        return uom;
    }

    /**
     * Sets the value of the uom property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeMeasureType }
     *     
     */
    public void setUom(VolumeMeasureType value) {
        this.uom = value;
    }

}
