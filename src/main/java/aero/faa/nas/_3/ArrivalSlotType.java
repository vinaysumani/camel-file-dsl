//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package aero.faa.nas._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Arrival Slot as defined for CTOP can either be a slot assignment or a special slot 
 *             indicator. 
 *          
 * 
 * <p>Java class for ArrivalSlotType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrivalSlotType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="slot" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.fixm.aero/base/3.0}SlotAssignmentType">
 *               &lt;pattern value="[a-zA-Z0-9]{6}[.]{1}[0-9]{12}[a-zA-Z]{1}|NOSLOT"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="specialSlot" type="{http://www.faa.aero/nas/3.1}SpecialSlotType" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrivalSlotType", propOrder = {
    "slot",
    "specialSlot"
})
public class ArrivalSlotType {

    protected String slot;
    @XmlSchemaType(name = "string")
    protected SpecialSlotType specialSlot;

    /**
     * Gets the value of the slot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlot() {
        return slot;
    }

    /**
     * Sets the value of the slot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlot(String value) {
        this.slot = value;
    }

    /**
     * Gets the value of the specialSlot property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialSlotType }
     *     
     */
    public SpecialSlotType getSpecialSlot() {
        return specialSlot;
    }

    /**
     * Sets the value of the specialSlot property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialSlotType }
     *     
     */
    public void setSpecialSlot(SpecialSlotType value) {
        this.specialSlot = value;
    }

}
