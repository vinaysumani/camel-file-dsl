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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Complex type defining the structure for describing the elements necessary to provide a flight's position over an ocean.
 * 
 * <p>Java class for oceanicPositionDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="oceanicPositionDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="position" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}latlongType"/>
 *         &lt;element name="altitude" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}simpleAltitudeType"/>
 *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oceanicPositionDataType", propOrder = {
    "position",
    "altitude",
    "time"
})
@XmlSeeAlso({
    us.gov.dot.faa.atm.tfm.flightdatacommonmessages.OceanicReportType.PlannedPositionData.class,
    us.gov.dot.faa.atm.tfm.tfmrequestreplytypes.FlightReconstitutionInformationType.PlannedPositionData.class
})
public class OceanicPositionDataType {

    @XmlElement(required = true)
    protected LatlongType position;
    @XmlElement(required = true)
    protected String altitude;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar time;

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link LatlongType }
     *     
     */
    public LatlongType getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link LatlongType }
     *     
     */
    public void setPosition(LatlongType value) {
        this.position = value;
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

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTime(XMLGregorianCalendar value) {
        this.time = value;
    }

}
