//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package us.gov.dot.faa.atm.tfm.ficommonmessages2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Documentation currently under evaluation
 * 
 * <p>Java class for vfrAltitudeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vfrAltitudeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vfrDesignator" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="altitude" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages2}altitudeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vfrAltitudeType", propOrder = {
    "vfrDesignator",
    "altitude"
})
public class VfrAltitudeType {

    @XmlElement(required = true)
    protected Object vfrDesignator;
    protected String altitude;

    /**
     * Gets the value of the vfrDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getVfrDesignator() {
        return vfrDesignator;
    }

    /**
     * Sets the value of the vfrDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setVfrDesignator(Object value) {
        this.vfrDesignator = value;
    }

    /**
     * Gets the value of the altitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltitude() {
        return altitude;
    }

    /**
     * Sets the value of the altitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltitude(String value) {
        this.altitude = value;
    }

}
