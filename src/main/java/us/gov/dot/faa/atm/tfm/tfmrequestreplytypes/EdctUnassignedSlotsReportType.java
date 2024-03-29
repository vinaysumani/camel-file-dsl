//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package us.gov.dot.faa.atm.tfm.tfmrequestreplytypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.dot.faa.atm.tfm.ficommondatatypes.SlotNameType;


/**
 * EDCT Unassigned Slots report
 * 
 * <p>Java class for edctUnassignedSlotsReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="edctUnassignedSlotsReportType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="controlledElementName" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}controlElementNameType"/>
 *         &lt;element name="slot" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}slotNameType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "edctUnassignedSlotsReportType", propOrder = {
    "controlledElementName",
    "slot"
})
public class EdctUnassignedSlotsReportType {

    @XmlElement(required = true)
    protected String controlledElementName;
    protected List<SlotNameType> slot;

    /**
     * Gets the value of the controlledElementName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlledElementName() {
        return controlledElementName;
    }

    /**
     * Sets the value of the controlledElementName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlledElementName(String value) {
        this.controlledElementName = value;
    }

    /**
     * Gets the value of the slot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the slot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSlot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SlotNameType }
     * 
     * 
     */
    public List<SlotNameType> getSlot() {
        if (slot == null) {
            slot = new ArrayList<SlotNameType>();
        }
        return this.slot;
    }

}
