//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package us.gov.dot.faa.atm.tfm.tfmrequestreplytypes;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import us.gov.dot.faa.atm.tfm.ficommonmessages2.FlowFltListType;
import us.gov.dot.faa.atm.tfm.ficommonmessages2.TmiInfoType;


/**
 * Defines the Flow Information data portion of reply data.
 * 
 * <p>Java class for replyTmiDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="replyTmiDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="tmiIndex">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tmi" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages2}tmiInfoType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="tmi">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tmiDefinition" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}tmiReplyDefinitionsType" minOccurs="0"/>
 *                   &lt;element name="tmiFlightList" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages2}flowFltListType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="seqNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                 &lt;attribute name="maxSeqNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "replyTmiDataType", propOrder = {
    "tmiIndex",
    "tmi"
})
public class ReplyTmiDataType {

    protected ReplyTmiDataType.TmiIndex tmiIndex;
    protected ReplyTmiDataType.Tmi tmi;

    /**
     * Gets the value of the tmiIndex property.
     * 
     * @return
     *     possible object is
     *     {@link ReplyTmiDataType.TmiIndex }
     *     
     */
    public ReplyTmiDataType.TmiIndex getTmiIndex() {
        return tmiIndex;
    }

    /**
     * Sets the value of the tmiIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplyTmiDataType.TmiIndex }
     *     
     */
    public void setTmiIndex(ReplyTmiDataType.TmiIndex value) {
        this.tmiIndex = value;
    }

    /**
     * Gets the value of the tmi property.
     * 
     * @return
     *     possible object is
     *     {@link ReplyTmiDataType.Tmi }
     *     
     */
    public ReplyTmiDataType.Tmi getTmi() {
        return tmi;
    }

    /**
     * Sets the value of the tmi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplyTmiDataType.Tmi }
     *     
     */
    public void setTmi(ReplyTmiDataType.Tmi value) {
        this.tmi = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="tmiDefinition" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}tmiReplyDefinitionsType" minOccurs="0"/>
     *         &lt;element name="tmiFlightList" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages2}flowFltListType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="seqNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *       &lt;attribute name="maxSeqNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tmiDefinition",
        "tmiFlightList"
    })
    public static class Tmi {

        protected TmiReplyDefinitionsType tmiDefinition;
        protected FlowFltListType tmiFlightList;
        @XmlAttribute(name = "seqNumber")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger seqNumber;
        @XmlAttribute(name = "maxSeqNumber")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger maxSeqNumber;

        /**
         * Gets the value of the tmiDefinition property.
         * 
         * @return
         *     possible object is
         *     {@link TmiReplyDefinitionsType }
         *     
         */
        public TmiReplyDefinitionsType getTmiDefinition() {
            return tmiDefinition;
        }

        /**
         * Sets the value of the tmiDefinition property.
         * 
         * @param value
         *     allowed object is
         *     {@link TmiReplyDefinitionsType }
         *     
         */
        public void setTmiDefinition(TmiReplyDefinitionsType value) {
            this.tmiDefinition = value;
        }

        /**
         * Gets the value of the tmiFlightList property.
         * 
         * @return
         *     possible object is
         *     {@link FlowFltListType }
         *     
         */
        public FlowFltListType getTmiFlightList() {
            return tmiFlightList;
        }

        /**
         * Sets the value of the tmiFlightList property.
         * 
         * @param value
         *     allowed object is
         *     {@link FlowFltListType }
         *     
         */
        public void setTmiFlightList(FlowFltListType value) {
            this.tmiFlightList = value;
        }

        /**
         * Gets the value of the seqNumber property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSeqNumber() {
            return seqNumber;
        }

        /**
         * Sets the value of the seqNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSeqNumber(BigInteger value) {
            this.seqNumber = value;
        }

        /**
         * Gets the value of the maxSeqNumber property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaxSeqNumber() {
            return maxSeqNumber;
        }

        /**
         * Sets the value of the maxSeqNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaxSeqNumber(BigInteger value) {
            this.maxSeqNumber = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="tmi" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages2}tmiInfoType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tmi"
    })
    public static class TmiIndex {

        @XmlElement(required = true)
        protected List<TmiInfoType> tmi;

        /**
         * Gets the value of the tmi property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tmi property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTmi().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TmiInfoType }
         * 
         * 
         */
        public List<TmiInfoType> getTmi() {
            if (tmi == null) {
                tmi = new ArrayList<TmiInfoType>();
            }
            return this.tmi;
        }

    }

}
