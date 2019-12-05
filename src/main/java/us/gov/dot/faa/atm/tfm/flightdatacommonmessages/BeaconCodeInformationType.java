//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package us.gov.dot.faa.atm.tfm.flightdatacommonmessages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import us.gov.dot.faa.atm.tfm.tfmdatacoreelements.QualifiedAircraftIdType;


/**
 * Beacon Code Information provides TFMM with beacon code data on eligible flight plans from the ARTCC facilities.
 * 
 * <p>Java class for beaconCodeInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="beaconCodeInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="qualifiedAircraftId" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}qualifiedAircraftIdType"/>
 *         &lt;element name="beaconCode" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}beaconCodeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "beaconCodeInformationType", propOrder = {
    "qualifiedAircraftId",
    "beaconCode"
})
public class BeaconCodeInformationType {

    @XmlElement(required = true)
    protected QualifiedAircraftIdType qualifiedAircraftId;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected int beaconCode;

    /**
     * Gets the value of the qualifiedAircraftId property.
     * 
     * @return
     *     possible object is
     *     {@link QualifiedAircraftIdType }
     *     
     */
    public QualifiedAircraftIdType getQualifiedAircraftId() {
        return qualifiedAircraftId;
    }

    /**
     * Sets the value of the qualifiedAircraftId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualifiedAircraftIdType }
     *     
     */
    public void setQualifiedAircraftId(QualifiedAircraftIdType value) {
        this.qualifiedAircraftId = value;
    }

    /**
     * Gets the value of the beaconCode property.
     * 
     */
    public int getBeaconCode() {
        return beaconCode;
    }

    /**
     * Sets the value of the beaconCode property.
     * 
     */
    public void setBeaconCode(int value) {
        this.beaconCode = value;
    }

}
