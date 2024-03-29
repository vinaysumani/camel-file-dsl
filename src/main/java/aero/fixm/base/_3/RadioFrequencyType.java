//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package aero.fixm.base._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 *             RadioFrequency is the designation of a communication frequency in the HF, UHF, VHF, 
 *             EHF bands 
 *          
 * 
 * <p>Java class for RadioFrequencyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RadioFrequencyType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.fixm.aero/base/3.0>RestrictedRadioFrequencyType">
 *       &lt;attribute name="uom" use="required" type="{http://www.fixm.aero/base/3.0}FrequencyMeasureType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RadioFrequencyType", propOrder = {
    "value"
})
public class RadioFrequencyType {

    @XmlValue
    protected double value;
    @XmlAttribute(name = "uom", required = true)
    protected FrequencyMeasureType uom;

    /**
     * 
     *             Helper type for restrictions on RadioFrequencyType 
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
     *     {@link FrequencyMeasureType }
     *     
     */
    public FrequencyMeasureType getUom() {
        return uom;
    }

    /**
     * Sets the value of the uom property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyMeasureType }
     *     
     */
    public void setUom(FrequencyMeasureType value) {
        this.uom = value;
    }

}
