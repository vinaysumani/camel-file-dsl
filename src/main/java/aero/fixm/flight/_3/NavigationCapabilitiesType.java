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
 *             .Navigation Capabilities: The serviceable navigation equipment available on board 
 *             the aircraft at the time of flight and for which the flight crew is qualified. 
 *          
 * 
 * <p>Java class for NavigationCapabilitiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NavigationCapabilitiesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="navigationCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;list itemType="{http://www.fixm.aero/flight/3.0}NavigationCodeType" />
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="performanceBasedCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;list itemType="{http://www.fixm.aero/flight/3.0}PerformanceBasedCodeType" />
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="otherNavigationCapabilities" type="{http://www.fixm.aero/base/3.0}FreeTextType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NavigationCapabilitiesType", propOrder = {
    "navigationCode",
    "performanceBasedCode"
})
public class NavigationCapabilitiesType {

    @XmlList
    protected List<NavigationCodeType> navigationCode;
    @XmlList
    protected List<PerformanceBasedCodeType> performanceBasedCode;
    @XmlAttribute(name = "otherNavigationCapabilities")
    protected String otherNavigationCapabilities;

    /**
     * Gets the value of the navigationCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the navigationCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNavigationCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NavigationCodeType }
     * 
     * 
     */
    public List<NavigationCodeType> getNavigationCode() {
        if (navigationCode == null) {
            navigationCode = new ArrayList<NavigationCodeType>();
        }
        return this.navigationCode;
    }

    /**
     * Gets the value of the performanceBasedCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the performanceBasedCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPerformanceBasedCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PerformanceBasedCodeType }
     * 
     * 
     */
    public List<PerformanceBasedCodeType> getPerformanceBasedCode() {
        if (performanceBasedCode == null) {
            performanceBasedCode = new ArrayList<PerformanceBasedCodeType>();
        }
        return this.performanceBasedCode;
    }

    /**
     * Gets the value of the otherNavigationCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherNavigationCapabilities() {
        return otherNavigationCapabilities;
    }

    /**
     * Sets the value of the otherNavigationCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherNavigationCapabilities(String value) {
        this.otherNavigationCapabilities = value;
    }

}
