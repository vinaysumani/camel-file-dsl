//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package aero.fixm.flight._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Describes the aircraft dingy. 
 *          
 * 
 * <p>Java class for DinghyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DinghyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="colour" type="{http://www.fixm.aero/flight/3.0}DinghyColourType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="covered" type="{http://www.fixm.aero/flight/3.0}DinghyCoverType" />
 *       &lt;attribute name="quantity" type="{http://www.fixm.aero/base/3.0}CountType" />
 *       &lt;attribute name="totalCapacity" type="{http://www.fixm.aero/base/3.0}CountType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DinghyType", propOrder = {
    "colour"
})
public class DinghyType {

    protected DinghyColourType colour;
    @XmlAttribute(name = "covered")
    protected DinghyCoverType covered;
    @XmlAttribute(name = "quantity")
    protected Integer quantity;
    @XmlAttribute(name = "totalCapacity")
    protected Integer totalCapacity;

    /**
     * Gets the value of the colour property.
     * 
     * @return
     *     possible object is
     *     {@link DinghyColourType }
     *     
     */
    public DinghyColourType getColour() {
        return colour;
    }

    /**
     * Sets the value of the colour property.
     * 
     * @param value
     *     allowed object is
     *     {@link DinghyColourType }
     *     
     */
    public void setColour(DinghyColourType value) {
        this.colour = value;
    }

    /**
     * Gets the value of the covered property.
     * 
     * @return
     *     possible object is
     *     {@link DinghyCoverType }
     *     
     */
    public DinghyCoverType getCovered() {
        return covered;
    }

    /**
     * Sets the value of the covered property.
     * 
     * @param value
     *     allowed object is
     *     {@link DinghyCoverType }
     *     
     */
    public void setCovered(DinghyCoverType value) {
        this.covered = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantity(Integer value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the totalCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalCapacity() {
        return totalCapacity;
    }

    /**
     * Sets the value of the totalCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalCapacity(Integer value) {
        this.totalCapacity = value;
    }

}