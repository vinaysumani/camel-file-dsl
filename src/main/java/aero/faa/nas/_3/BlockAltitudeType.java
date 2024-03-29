//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package aero.faa.nas._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import aero.fixm.foundation._3.AltitudeType;


/**
 * 
 *             Altitude indicates that aircraft is operating  above and below the specified altitudes. 
 *             
 *          
 * 
 * <p>Java class for BlockAltitudeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BlockAltitudeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="above" type="{http://www.fixm.aero/foundation/3.0}AltitudeType" minOccurs="0"/>
 *         &lt;element name="below" type="{http://www.fixm.aero/foundation/3.0}AltitudeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BlockAltitudeType", propOrder = {
    "above",
    "below"
})
public class BlockAltitudeType {

    protected AltitudeType above;
    protected AltitudeType below;

    /**
     * Gets the value of the above property.
     * 
     * @return
     *     possible object is
     *     {@link AltitudeType }
     *     
     */
    public AltitudeType getAbove() {
        return above;
    }

    /**
     * Sets the value of the above property.
     * 
     * @param value
     *     allowed object is
     *     {@link AltitudeType }
     *     
     */
    public void setAbove(AltitudeType value) {
        this.above = value;
    }

    /**
     * Gets the value of the below property.
     * 
     * @return
     *     possible object is
     *     {@link AltitudeType }
     *     
     */
    public AltitudeType getBelow() {
        return below;
    }

    /**
     * Sets the value of the below property.
     * 
     * @param value
     *     allowed object is
     *     {@link AltitudeType }
     *     
     */
    public void setBelow(AltitudeType value) {
        this.below = value;
    }

}
