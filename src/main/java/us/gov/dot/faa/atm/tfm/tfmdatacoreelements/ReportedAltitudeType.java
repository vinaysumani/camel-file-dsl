//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package us.gov.dot.faa.atm.tfm.tfmdatacoreelements;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Complex type defining the structure for describing the elements necessary to provide a flight's reported altitude.
 * 
 * <p>Java class for reportedAltitudeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reportedAltitudeType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements>simpleAltitudeType">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reportedAltitudeType", propOrder = {
    "value"
})
public class ReportedAltitudeType {

    @XmlValue
    protected String value;

    /**
     * Simple type used to place constraints on a flight's altitude. The altitude can represent a number of values as reported by NAS. Please refer to NAS MD-314 section 3.1 for details. The message from HADDS to TFMS is constrained to include an assigned altitude, nnn, or a beacon reported altitude, nnn + 'C', or an interim altitude, nnn + 'T'. Allowed format: [0-9]{0,3}[CT]{0,1}. Where C = Beacon reported altitude is within Altitude Conformance Limits (ALCT) feet and T = Interim altitude is currently being displayed in the assigned altitude field.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}
