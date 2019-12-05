//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package us.gov.dot.faa.atm.tfm.ficommonmessages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines the three possible filter types.
 * 
 * <p>Java class for mitFilterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mitFilterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="mitDestinationFilterId" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}rriaIdType"/>
 *           &lt;element name="mitFeaFilterId" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}rriaIdType"/>
 *         &lt;/choice>
 *         &lt;element name="mitFilterSpacingInMiles">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="EXCLUDE|\d{1,3}"/>
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
@XmlType(name = "mitFilterType", propOrder = {
    "mitDestinationFilterId",
    "mitFeaFilterId",
    "mitFilterSpacingInMiles"
})
public class MitFilterType {

    protected String mitDestinationFilterId;
    protected String mitFeaFilterId;
    @XmlElement(required = true)
    protected String mitFilterSpacingInMiles;

    /**
     * Gets the value of the mitDestinationFilterId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMitDestinationFilterId() {
        return mitDestinationFilterId;
    }

    /**
     * Sets the value of the mitDestinationFilterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMitDestinationFilterId(String value) {
        this.mitDestinationFilterId = value;
    }

    /**
     * Gets the value of the mitFeaFilterId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMitFeaFilterId() {
        return mitFeaFilterId;
    }

    /**
     * Sets the value of the mitFeaFilterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMitFeaFilterId(String value) {
        this.mitFeaFilterId = value;
    }

    /**
     * Gets the value of the mitFilterSpacingInMiles property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMitFilterSpacingInMiles() {
        return mitFilterSpacingInMiles;
    }

    /**
     * Sets the value of the mitFilterSpacingInMiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMitFilterSpacingInMiles(String value) {
        this.mitFilterSpacingInMiles = value;
    }

}