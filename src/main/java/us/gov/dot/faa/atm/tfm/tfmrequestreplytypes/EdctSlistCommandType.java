//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package us.gov.dot.faa.atm.tfm.tfmrequestreplytypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The EDCT Slist command provides a slot list for a specified airport or an FCA.
 * 
 * <p>Java class for edctSlistCommandType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="edctSlistCommandType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="controlElement" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}controlElementNameType"/>
 *         &lt;element name="airline" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}airlineIdType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "edctSlistCommandType", propOrder = {
    "controlElement",
    "airline"
})
public class EdctSlistCommandType {

    @XmlElement(required = true)
    protected String controlElement;
    protected String airline;

    /**
     * Gets the value of the controlElement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlElement() {
        return controlElement;
    }

    /**
     * Sets the value of the controlElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlElement(String value) {
        this.controlElement = value;
    }

    /**
     * Gets the value of the airline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirline() {
        return airline;
    }

    /**
     * Sets the value of the airline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirline(String value) {
        this.airline = value;
    }

}