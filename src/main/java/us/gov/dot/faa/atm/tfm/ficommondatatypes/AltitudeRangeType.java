//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package us.gov.dot.faa.atm.tfm.ficommondatatypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Altitude range consisting of a lower and upper value.
 * 
 * <p>Java class for altitudeRangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="altitudeRangeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lowerAltitude" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}altitudeType"/>
 *         &lt;element name="upperAltitude" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}altitudeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "altitudeRangeType", propOrder = {
    "lowerAltitude",
    "upperAltitude"
})
public class AltitudeRangeType {

    @XmlElement(required = true)
    protected String lowerAltitude;
    @XmlElement(required = true)
    protected String upperAltitude;

    /**
     * Gets the value of the lowerAltitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLowerAltitude() {
        return lowerAltitude;
    }

    /**
     * Sets the value of the lowerAltitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLowerAltitude(String value) {
        this.lowerAltitude = value;
    }

    /**
     * Gets the value of the upperAltitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpperAltitude() {
        return upperAltitude;
    }

    /**
     * Sets the value of the upperAltitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpperAltitude(String value) {
        this.upperAltitude = value;
    }

}
