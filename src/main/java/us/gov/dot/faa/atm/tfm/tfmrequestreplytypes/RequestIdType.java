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
 * <p>Java class for requestIdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requestIdType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestor" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages2}requestorIdType"/>
 *         &lt;element name="uniqueMsgId" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}uuidType"/>
 *         &lt;element name="replyOption" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="SUCC_OR_ERR_OR_WARN"/>
 *               &lt;enumeration value="ERR_OR_WARN"/>
 *               &lt;enumeration value="ERROR"/>
 *               &lt;enumeration value="NEVER"/>
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
@XmlType(name = "requestIdType", propOrder = {
    "requestor",
    "uniqueMsgId",
    "replyOption"
})
public class RequestIdType {

    @XmlElement(required = true)
    protected RequestorIdType requestor;
    @XmlElement(required = true)
    protected String uniqueMsgId;
    protected String replyOption;

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

    /**
     * Gets the value of the replyOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyOption() {
        return replyOption;
    }

    /**
     * Sets the value of the replyOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyOption(String value) {
        this.replyOption = value;
    }

}
