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
import us.gov.dot.faa.atm.tfm.ficommonmessages2.RequestorIdType;


/**
 * Identifies parameters to be supplied with every and supplied with each response.
 * 
 * <p>Java class for replyIdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="replyIdType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestor" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages2}requestorIdType"/>
 *         &lt;element name="uniqueMsgId" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}uuidType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "replyIdType", propOrder = {
    "requestor",
    "uniqueMsgId"
})
public class ReplyIdType {

    @XmlElement(required = true)
    protected RequestorIdType requestor;
    @XmlElement(required = true)
    protected String uniqueMsgId;

    /**
     * Gets the value of the requestor property.
     * 
     * @return
     *     possible object is
     *     {@link RequestorIdType }
     *     
     */
    public RequestorIdType getRequestor() {
        return requestor;
    }

    /**
     * Sets the value of the requestor property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestorIdType }
     *     
     */
    public void setRequestor(RequestorIdType value) {
        this.requestor = value;
    }

    /**
     * Gets the value of the uniqueMsgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueMsgId() {
        return uniqueMsgId;
    }

    /**
     * Sets the value of the uniqueMsgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueMsgId(String value) {
        this.uniqueMsgId = value;
    }

}
