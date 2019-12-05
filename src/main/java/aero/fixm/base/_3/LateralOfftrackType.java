//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package aero.fixm.base._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a lateral offtrack which can either be an offset or weather deviation. 
 *             
 *          
 * 
 * <p>Java class for LateralOfftrackType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LateralOfftrackType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="offtrackDistance" type="{http://www.fixm.aero/base/3.0}OfftrackDistanceType" maxOccurs="2" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="offtrackReason" type="{http://www.fixm.aero/base/3.0}OfftrackReasonType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LateralOfftrackType", propOrder = {
    "offtrackDistance"
})
public class LateralOfftrackType {

    protected List<OfftrackDistanceType> offtrackDistance;
    @XmlAttribute(name = "offtrackReason")
    protected OfftrackReasonType offtrackReason;

    /**
     * Gets the value of the offtrackDistance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offtrackDistance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfftrackDistance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfftrackDistanceType }
     * 
     * 
     */
    public List<OfftrackDistanceType> getOfftrackDistance() {
        if (offtrackDistance == null) {
            offtrackDistance = new ArrayList<OfftrackDistanceType>();
        }
        return this.offtrackDistance;
    }

    /**
     * Gets the value of the offtrackReason property.
     * 
     * @return
     *     possible object is
     *     {@link OfftrackReasonType }
     *     
     */
    public OfftrackReasonType getOfftrackReason() {
        return offtrackReason;
    }

    /**
     * Sets the value of the offtrackReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfftrackReasonType }
     *     
     */
    public void setOfftrackReason(OfftrackReasonType value) {
        this.offtrackReason = value;
    }

}