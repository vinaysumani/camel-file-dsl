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
import javax.xml.bind.annotation.XmlValue;


/**
 * 
 *             .Hazard Class and Division: A number assigned to a dangerous good that represents 
 *             a classification (Class) according to the most dominant hazard it represents, potentially 
 *             followed by a number representing a subdivision (Division) within the Class. 
 *             .Subsidiary Hazard Class and Division: An identifier of any subsidiary hazard class(es)/division(s) 
 *             in addition to the primary hazard class and division. 
 *          
 * 
 * <p>Java class for HazardClassType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HazardClassType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.fixm.aero/flight/3.0>RestrictedHazardClassType">
 *       &lt;attribute name="hazardDivision">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.fixm.aero/base/3.0}CountType">
 *             &lt;minInclusive value="0"/>
 *             &lt;maxInclusive value="99"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HazardClassType", propOrder = {
    "value"
})
public class HazardClassType {

    @XmlValue
    protected int value;
    @XmlAttribute(name = "hazardDivision")
    protected Integer hazardDivision;

    /**
     * 
     *             Helper type for restrictions on HazardClassType 
     *          
     * 
     */
    public int getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Gets the value of the hazardDivision property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHazardDivision() {
        return hazardDivision;
    }

    /**
     * Sets the value of the hazardDivision property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHazardDivision(Integer value) {
        this.hazardDivision = value;
    }

}