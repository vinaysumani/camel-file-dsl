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
import aero.fixm.flight._3.BoundaryCrossingType;
import aero.fixm.flight._3.UnitBoundaryType;


/**
 * 
 *             NAS Specific extension of BoundaryCrossing to include "actual" BoundaryCrossing attributes. 
 *             
 *          
 * 
 * <p>Java class for NasUnitBoundaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NasUnitBoundaryType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixm.aero/flight/3.0}UnitBoundaryType">
 *       &lt;sequence>
 *         &lt;element name="boundaryCrossingActual" type="{http://www.fixm.aero/flight/3.0}BoundaryCrossingType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NasUnitBoundaryType", propOrder = {
    "boundaryCrossingActual"
})
public class NasUnitBoundaryType
    extends UnitBoundaryType
{

    protected BoundaryCrossingType boundaryCrossingActual;

    /**
     * Gets the value of the boundaryCrossingActual property.
     * 
     * @return
     *     possible object is
     *     {@link BoundaryCrossingType }
     *     
     */
    public BoundaryCrossingType getBoundaryCrossingActual() {
        return boundaryCrossingActual;
    }

    /**
     * Sets the value of the boundaryCrossingActual property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoundaryCrossingType }
     *     
     */
    public void setBoundaryCrossingActual(BoundaryCrossingType value) {
        this.boundaryCrossingActual = value;
    }

}
