//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package us.gov.dot.faa.atm.tfm.tfmdatacoreelements;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Complex type defining the structure for describing a geographic point defined by latitude and longitude. Any of the three formats for latitude and longitude may be used: 1) degrees minutes seconds 2) minutes with fractional minutes 3) radians
 * 
 * <p>Java class for latlongType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="latlongType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="latitude" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}latitudeType"/>
 *         &lt;element name="longitude" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}longitudeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "latlongType", propOrder = {
    "latitude",
    "longitude"
})
public class LatlongType {

    @XmlElement(required = true)
    protected LatitudeType latitude;
    @XmlElement(required = true)
    protected LongitudeType longitude;

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link LatitudeType }
     *     
     */
    public LatitudeType getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link LatitudeType }
     *     
     */
    public void setLatitude(LatitudeType value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link LongitudeType }
     *     
     */
    public LongitudeType getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link LongitudeType }
     *     
     */
    public void setLongitude(LongitudeType value) {
        this.longitude = value;
    }

}
