//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package us.gov.dot.faa.atm.tfm.tfmrequestreplytypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for advisoryDistributionRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="advisoryDistributionRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="msgType" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}distributionMsgType"/>
 *         &lt;element name="originator" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}originPositionType"/>
 *         &lt;element name="advisoryData" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}advMessageType"/>
 *         &lt;element name="destination" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}destinationType" maxOccurs="4"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "advisoryDistributionRequestType", propOrder = {
    "msgType",
    "originator",
    "advisoryData",
    "destination"
})
public class AdvisoryDistributionRequestType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DistributionMsgType msgType;
    @XmlElement(required = true)
    protected OriginPositionType originator;
    @XmlElement(required = true)
    protected AdvMessageType advisoryData;
    @XmlElement(required = true)
    protected List<DestinationType> destination;

    /**
     * Gets the value of the msgType property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionMsgType }
     *     
     */
    public DistributionMsgType getMsgType() {
        return msgType;
    }

    /**
     * Sets the value of the msgType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionMsgType }
     *     
     */
    public void setMsgType(DistributionMsgType value) {
        this.msgType = value;
    }

    /**
     * Gets the value of the originator property.
     * 
     * @return
     *     possible object is
     *     {@link OriginPositionType }
     *     
     */
    public OriginPositionType getOriginator() {
        return originator;
    }

    /**
     * Sets the value of the originator property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginPositionType }
     *     
     */
    public void setOriginator(OriginPositionType value) {
        this.originator = value;
    }

    /**
     * Gets the value of the advisoryData property.
     * 
     * @return
     *     possible object is
     *     {@link AdvMessageType }
     *     
     */
    public AdvMessageType getAdvisoryData() {
        return advisoryData;
    }

    /**
     * Sets the value of the advisoryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvMessageType }
     *     
     */
    public void setAdvisoryData(AdvMessageType value) {
        this.advisoryData = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destination property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestination().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DestinationType }
     * 
     * 
     */
    public List<DestinationType> getDestination() {
        if (destination == null) {
            destination = new ArrayList<DestinationType>();
        }
        return this.destination;
    }

}