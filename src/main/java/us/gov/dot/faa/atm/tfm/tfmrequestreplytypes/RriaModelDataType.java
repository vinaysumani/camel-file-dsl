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
 * Reroute model type.
 * 
 * <p>Java class for rriaModelDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rriaModelDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rriaFlightData" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}rriaFlightsDataType"/>
 *         &lt;element name="rriaTrafficCounts" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}rriaTrafficCountsDataType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rriaModelDataType", propOrder = {
    "rriaFlightData",
    "rriaTrafficCounts"
})
public class RriaModelDataType {

    @XmlElement(required = true)
    protected RriaFlightsDataType rriaFlightData;
    @XmlElement(required = true)
    protected RriaTrafficCountsDataType rriaTrafficCounts;

    /**
     * Gets the value of the rriaFlightData property.
     * 
     * @return
     *     possible object is
     *     {@link RriaFlightsDataType }
     *     
     */
    public RriaFlightsDataType getRriaFlightData() {
        return rriaFlightData;
    }

    /**
     * Sets the value of the rriaFlightData property.
     * 
     * @param value
     *     allowed object is
     *     {@link RriaFlightsDataType }
     *     
     */
    public void setRriaFlightData(RriaFlightsDataType value) {
        this.rriaFlightData = value;
    }

    /**
     * Gets the value of the rriaTrafficCounts property.
     * 
     * @return
     *     possible object is
     *     {@link RriaTrafficCountsDataType }
     *     
     */
    public RriaTrafficCountsDataType getRriaTrafficCounts() {
        return rriaTrafficCounts;
    }

    /**
     * Sets the value of the rriaTrafficCounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link RriaTrafficCountsDataType }
     *     
     */
    public void setRriaTrafficCounts(RriaTrafficCountsDataType value) {
        this.rriaTrafficCounts = value;
    }

}
