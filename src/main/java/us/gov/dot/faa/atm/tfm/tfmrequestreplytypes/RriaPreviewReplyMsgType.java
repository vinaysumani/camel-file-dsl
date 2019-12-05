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
 * Reroute model: Preview request type.
 * 
 * <p>Java class for rriaPreviewReplyMsgType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rriaPreviewReplyMsgType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rerouteId" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}rerouteIdType"/>
 *         &lt;element name="flightList" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}rriaFlightsDataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rriaPreviewReplyMsgType", propOrder = {
    "rerouteId",
    "flightList"
})
public class RriaPreviewReplyMsgType {

    @XmlElement(required = true)
    protected String rerouteId;
    @XmlElement(required = true)
    protected RriaFlightsDataType flightList;

    /**
     * Gets the value of the rerouteId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRerouteId() {
        return rerouteId;
    }

    /**
     * Sets the value of the rerouteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRerouteId(String value) {
        this.rerouteId = value;
    }

    /**
     * Gets the value of the flightList property.
     * 
     * @return
     *     possible object is
     *     {@link RriaFlightsDataType }
     *     
     */
    public RriaFlightsDataType getFlightList() {
        return flightList;
    }

    /**
     * Sets the value of the flightList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RriaFlightsDataType }
     *     
     */
    public void setFlightList(RriaFlightsDataType value) {
        this.flightList = value;
    }

}