//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package aero.fixm.flight._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             .Surveillance Capabilities: The serviceable Secondary Surveillance Radar (SSR) and/or 
 *             Automatic Dependent Surveillance (ADS) equipment available on the aircraft at the 
 *             time of flight that may be used to identify and/or locate the aircraft. 
 *          
 * 
 * <p>Java class for SurveillanceCapabilitiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SurveillanceCapabilitiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="surveillanceCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;list itemType="{http://www.fixm.aero/flight/3.0}SurveillanceCodeType" />
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="otherSurveillanceCapabilities" type="{http://www.fixm.aero/base/3.0}FreeTextType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SurveillanceCapabilitiesType", propOrder = {
    "surveillanceCode"
})
public class SurveillanceCapabilitiesType {

    @XmlList
    protected List<SurveillanceCodeType> surveillanceCode;
    @XmlAttribute(name = "otherSurveillanceCapabilities")
    protected String otherSurveillanceCapabilities;

    /**
     * Gets the value of the surveillanceCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the surveillanceCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSurveillanceCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SurveillanceCodeType }
     * 
     * 
     */
    public List<SurveillanceCodeType> getSurveillanceCode() {
        if (surveillanceCode == null) {
            surveillanceCode = new ArrayList<SurveillanceCodeType>();
        }
        return this.surveillanceCode;
    }

    /**
     * Gets the value of the otherSurveillanceCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherSurveillanceCapabilities() {
        return otherSurveillanceCapabilities;
    }

    /**
     * Sets the value of the otherSurveillanceCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherSurveillanceCapabilities(String value) {
        this.otherSurveillanceCapabilities = value;
    }

}
