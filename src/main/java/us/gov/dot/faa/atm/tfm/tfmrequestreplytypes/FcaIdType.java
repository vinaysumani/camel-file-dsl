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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Defines the FEA/FCA Identifier.
 * 
 * <p>Java class for fcaIdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fcaIdType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FCA_ID" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages2}uniqueFcaIdType"/>
 *         &lt;element name="FCA_START_TIME" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FCA_END_TIME" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FCA_LOOK_AHEAD_RANGE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MODEL_STATISTICS" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}modelStatistics" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fcaIdType", propOrder = {
    "fcaid",
    "fcastarttime",
    "fcaendtime",
    "fcalookaheadrange",
    "modelstatistics"
})
public class FcaIdType {

    @XmlElement(name = "FCA_ID", required = true)
    protected String fcaid;
    @XmlElement(name = "FCA_START_TIME", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fcastarttime;
    @XmlElement(name = "FCA_END_TIME", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fcaendtime;
    @XmlElement(name = "FCA_LOOK_AHEAD_RANGE")
    protected int fcalookaheadrange;
    @XmlElement(name = "MODEL_STATISTICS")
    protected ModelStatistics modelstatistics;

    /**
     * Gets the value of the fcaid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFCAID() {
        return fcaid;
    }

    /**
     * Sets the value of the fcaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFCAID(String value) {
        this.fcaid = value;
    }

    /**
     * Gets the value of the fcastarttime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFCASTARTTIME() {
        return fcastarttime;
    }

    /**
     * Sets the value of the fcastarttime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFCASTARTTIME(XMLGregorianCalendar value) {
        this.fcastarttime = value;
    }

    /**
     * Gets the value of the fcaendtime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFCAENDTIME() {
        return fcaendtime;
    }

    /**
     * Sets the value of the fcaendtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFCAENDTIME(XMLGregorianCalendar value) {
        this.fcaendtime = value;
    }

    /**
     * Gets the value of the fcalookaheadrange property.
     * 
     */
    public int getFCALOOKAHEADRANGE() {
        return fcalookaheadrange;
    }

    /**
     * Sets the value of the fcalookaheadrange property.
     * 
     */
    public void setFCALOOKAHEADRANGE(int value) {
        this.fcalookaheadrange = value;
    }

    /**
     * Gets the value of the modelstatistics property.
     * 
     * @return
     *     possible object is
     *     {@link ModelStatistics }
     *     
     */
    public ModelStatistics getMODELSTATISTICS() {
        return modelstatistics;
    }

    /**
     * Sets the value of the modelstatistics property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelStatistics }
     *     
     */
    public void setMODELSTATISTICS(ModelStatistics value) {
        this.modelstatistics = value;
    }

}