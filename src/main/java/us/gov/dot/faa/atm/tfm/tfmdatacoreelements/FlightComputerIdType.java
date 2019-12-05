//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package us.gov.dot.faa.atm.tfm.tfmdatacoreelements;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Used to uniquely identify a flight across systems. Example usage: <flightComputerId><facilityIdentifier>ZAU</facilityIdentifier><computerSystemId>HCS</computerSystemId><idNumber>100</idNumber></flightComputerId>
 * 
 * <p>Java class for flightComputerIdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="flightComputerIdType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="facilityIdentifier" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}facilityIdentifierType" minOccurs="0"/>
 *         &lt;element name="computerSystemId" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}computerSystemIdType" minOccurs="0"/>
 *         &lt;element name="idNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[A-Z0-9]{3}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flightComputerIdType", propOrder = {
    "facilityIdentifier",
    "computerSystemId",
    "idNumber"
})
public class FlightComputerIdType {

    protected String facilityIdentifier;
    @XmlSchemaType(name = "string")
    protected ComputerSystemIdType computerSystemId;
    protected String idNumber;

    /**
     * Gets the value of the facilityIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilityIdentifier() {
        return facilityIdentifier;
    }

    /**
     * Sets the value of the facilityIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilityIdentifier(String value) {
        this.facilityIdentifier = value;
    }

    /**
     * Gets the value of the computerSystemId property.
     * 
     * @return
     *     possible object is
     *     {@link ComputerSystemIdType }
     *     
     */
    public ComputerSystemIdType getComputerSystemId() {
        return computerSystemId;
    }

    /**
     * Sets the value of the computerSystemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComputerSystemIdType }
     *     
     */
    public void setComputerSystemId(ComputerSystemIdType value) {
        this.computerSystemId = value;
    }

    /**
     * Gets the value of the idNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * Sets the value of the idNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdNumber(String value) {
        this.idNumber = value;
    }

}
