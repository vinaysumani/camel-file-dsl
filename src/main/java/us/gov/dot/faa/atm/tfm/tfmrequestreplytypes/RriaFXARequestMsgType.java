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
 * Reroute model: FXA request type.
 * 
 * <p>Java class for rriaFXARequestMsgType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rriaFXARequestMsgType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rerouteId" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}rriaIdType"/>
 *         &lt;element name="modelUpdateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="fxaId" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}rriaIdType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rriaFXARequestMsgType", propOrder = {
    "rerouteId",
    "modelUpdateTime",
    "fxaId"
})
public class RriaFXARequestMsgType {

    @XmlElement(required = true)
    protected String rerouteId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modelUpdateTime;
    @XmlElement(required = true)
    protected String fxaId;

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
     * Gets the value of the modelUpdateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModelUpdateTime() {
        return modelUpdateTime;
    }

    /**
     * Sets the value of the modelUpdateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModelUpdateTime(XMLGregorianCalendar value) {
        this.modelUpdateTime = value;
    }

    /**
     * Gets the value of the fxaId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFxaId() {
        return fxaId;
    }

    /**
     * Sets the value of the fxaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFxaId(String value) {
        this.fxaId = value;
    }

}
