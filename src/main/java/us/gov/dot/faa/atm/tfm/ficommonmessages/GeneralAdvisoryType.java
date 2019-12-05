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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import us.gov.dot.faa.atm.tfm.ficommondatatypes.OriginNameType;
import us.gov.dot.faa.atm.tfm.ficommondatatypes.TimePeriodType;


/**
 * The general advisory type data content.
 * 
 * <p>Java class for generalAdvisoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="generalAdvisoryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="advisoryNumber" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}advisoryNumType"/>
 *         &lt;element name="advisoryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="origin" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}originNameType"/>
 *         &lt;element name="dateSent" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="facilities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="effectivePeriod" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}timePeriodType" minOccurs="0"/>
 *         &lt;element name="validPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="advisoryTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="advisoryText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "generalAdvisoryType", propOrder = {
    "advisoryNumber",
    "advisoryType",
    "origin",
    "dateSent",
    "facilities",
    "effectivePeriod",
    "validPeriod",
    "advisoryTitle",
    "advisoryText"
})
public class GeneralAdvisoryType {

    @XmlElement(required = true)
    protected String advisoryNumber;
    protected String advisoryType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected OriginNameType origin;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateSent;
    protected String facilities;
    protected TimePeriodType effectivePeriod;
    protected String validPeriod;
    protected String advisoryTitle;
    @XmlElement(required = true)
    protected String advisoryText;

    /**
     * Gets the value of the advisoryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvisoryNumber() {
        return advisoryNumber;
    }

    /**
     * Sets the value of the advisoryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvisoryNumber(String value) {
        this.advisoryNumber = value;
    }

    /**
     * Gets the value of the advisoryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvisoryType() {
        return advisoryType;
    }

    /**
     * Sets the value of the advisoryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvisoryType(String value) {
        this.advisoryType = value;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link OriginNameType }
     *     
     */
    public OriginNameType getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginNameType }
     *     
     */
    public void setOrigin(OriginNameType value) {
        this.origin = value;
    }

    /**
     * Gets the value of the dateSent property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateSent() {
        return dateSent;
    }

    /**
     * Sets the value of the dateSent property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateSent(XMLGregorianCalendar value) {
        this.dateSent = value;
    }

    /**
     * Gets the value of the facilities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacilities() {
        return facilities;
    }

    /**
     * Sets the value of the facilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacilities(String value) {
        this.facilities = value;
    }

    /**
     * Gets the value of the effectivePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getEffectivePeriod() {
        return effectivePeriod;
    }

    /**
     * Sets the value of the effectivePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setEffectivePeriod(TimePeriodType value) {
        this.effectivePeriod = value;
    }

    /**
     * Gets the value of the validPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidPeriod() {
        return validPeriod;
    }

    /**
     * Sets the value of the validPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidPeriod(String value) {
        this.validPeriod = value;
    }

    /**
     * Gets the value of the advisoryTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvisoryTitle() {
        return advisoryTitle;
    }

    /**
     * Sets the value of the advisoryTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvisoryTitle(String value) {
        this.advisoryTitle = value;
    }

    /**
     * Gets the value of the advisoryText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvisoryText() {
        return advisoryText;
    }

    /**
     * Sets the value of the advisoryText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvisoryText(String value) {
        this.advisoryText = value;
    }

}
