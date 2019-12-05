//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package aero.faa.nas._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             The Mode C target altitude, corrected for barometric pressure. 
 *             Suspected invalid altitudes marked with the 'invalid' attribute
 *             .Target Altitude: The Mode C target altitude, corrected for barometric pressure. 
 *              Can be marked as invalid. 
 *          
 * 
 * <p>Java class for NasPositionAltitudeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NasPositionAltitudeType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.faa.aero/nas/3.1>SimpleAltitudeType">
 *       &lt;attribute name="invalid" type="{http://www.faa.aero/nas/3.1}InvalidIndicatorType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NasPositionAltitudeType")
public class NasPositionAltitudeType
    extends SimpleAltitudeType
{

    @XmlAttribute(name = "invalid")
    protected InvalidIndicatorType invalid;

    /**
     * Gets the value of the invalid property.
     * 
     * @return
     *     possible object is
     *     {@link InvalidIndicatorType }
     *     
     */
    public InvalidIndicatorType getInvalid() {
        return invalid;
    }

    /**
     * Sets the value of the invalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvalidIndicatorType }
     *     
     */
    public void setInvalid(InvalidIndicatorType value) {
        this.invalid = value;
    }

}