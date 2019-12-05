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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import aero.faa.nas._3.AboveAltitudeType;
import aero.faa.nas._3.SimpleAltitudeType;
import aero.faa.nas._3.VfrOnTopPlusAltitudeType;
import aero.faa.nas._3.VfrPlusAltitudeType;
import aero.fixm.flight._3.AltitudeInTransitionType;


/**
 * 
 *             Simple altitude type: single measurement above specified reference point. 
 *          
 * 
 * <p>Java class for AltitudeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AltitudeType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.fixm.aero/foundation/3.0>UnitOfMeasureType">
 *       &lt;attribute name="ref" type="{http://www.fixm.aero/foundation/3.0}AltitudeReferenceType" />
 *       &lt;attribute name="uom" use="required" type="{http://www.fixm.aero/foundation/3.0}AltitudeMeasureType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AltitudeType", propOrder = {
    "value"
})
@XmlSeeAlso({
    AltitudeInTransitionType.class,
    AboveAltitudeType.class,
    VfrPlusAltitudeType.class,
    SimpleAltitudeType.class,
    VfrOnTopPlusAltitudeType.class
})
public class AltitudeType {

    @XmlValue
    protected double value;
    @XmlAttribute(name = "ref")
    protected AltitudeReferenceType ref;
    @XmlAttribute(name = "uom", required = true)
    protected AltitudeMeasureType uom;

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
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link AltitudeReferenceType }
     *     
     */
    public AltitudeReferenceType getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link AltitudeReferenceType }
     *     
     */
    public void setRef(AltitudeReferenceType value) {
        this.ref = value;
    }

    /**
     * Gets the value of the uom property.
     * 
     * @return
     *     possible object is
     *     {@link AltitudeMeasureType }
     *     
     */
    public AltitudeMeasureType getUom() {
        return uom;
    }

    /**
     * Sets the value of the uom property.
     * 
     * @param value
     *     allowed object is
     *     {@link AltitudeMeasureType }
     *     
     */
    public void setUom(AltitudeMeasureType value) {
        this.uom = value;
    }

}