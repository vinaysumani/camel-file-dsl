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
import aero.fixm.foundation._3.AngleType;


/**
 * 
 *             Represents a compass bearing as an angle in the range [0,360]. 
 *          
 * 
 * <p>Java class for DirectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DirectionType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.fixm.aero/foundation/3.0>AngleType">
 *       &lt;attribute name="ref" type="{http://www.fixm.aero/base/3.0}DirectionReferenceType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectionType")
public class DirectionType
    extends AngleType
{

    @XmlAttribute(name = "ref")
    protected DirectionReferenceType ref;

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link DirectionReferenceType }
     *     
     */
    public DirectionReferenceType getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionReferenceType }
     *     
     */
    public void setRef(DirectionReferenceType value) {
        this.ref = value;
    }

}
