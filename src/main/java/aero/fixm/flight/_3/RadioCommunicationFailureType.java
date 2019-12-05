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
import aero.fixm.base._3.FeatureType;


/**
 * 
 *             Groups information regarding loss of radio communication capabilities. 
 *          
 * 
 * <p>Java class for RadioCommunicationFailureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RadioCommunicationFailureType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixm.aero/base/3.0}FeatureType">
 *       &lt;sequence>
 *         &lt;element name="contact" type="{http://www.fixm.aero/flight/3.0}LastContactType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="radioFailureRemarks" type="{http://www.fixm.aero/base/3.0}FreeTextType" />
 *       &lt;attribute name="remainingComCapability" type="{http://www.fixm.aero/base/3.0}FreeTextType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RadioCommunicationFailureType", propOrder = {
    "contact"
})
public class RadioCommunicationFailureType
    extends FeatureType
{

    protected LastContactType contact;
    @XmlAttribute(name = "radioFailureRemarks")
    protected String radioFailureRemarks;
    @XmlAttribute(name = "remainingComCapability")
    protected String remainingComCapability;

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link LastContactType }
     *     
     */
    public LastContactType getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastContactType }
     *     
     */
    public void setContact(LastContactType value) {
        this.contact = value;
    }

    /**
     * Gets the value of the radioFailureRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadioFailureRemarks() {
        return radioFailureRemarks;
    }

    /**
     * Sets the value of the radioFailureRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadioFailureRemarks(String value) {
        this.radioFailureRemarks = value;
    }

    /**
     * Gets the value of the remainingComCapability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemainingComCapability() {
        return remainingComCapability;
    }

    /**
     * Sets the value of the remainingComCapability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemainingComCapability(String value) {
        this.remainingComCapability = value;
    }

}