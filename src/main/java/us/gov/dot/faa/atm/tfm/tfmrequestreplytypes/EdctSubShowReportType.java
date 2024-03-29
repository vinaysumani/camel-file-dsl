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
import us.gov.dot.faa.atm.tfm.ficommondatatypes.ControlElementTypeType;


/**
 * EDCT Sub Show report
 * 
 * <p>Java class for edctSubShowReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="edctSubShowReportType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="controlledElement" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="controlledElementName" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}controlElementNameType"/>
 *                   &lt;element name="controlledElementType" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}controlElementTypeType"/>
 *                   &lt;element name="subsFlag" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}flagType"/>
 *                   &lt;element name="scsFlag" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}flagType"/>
 *                   &lt;element name="acFlag" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}flagType"/>
 *                   &lt;element name="bridgingOffAirline" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}airlineIdType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gaBridgingFlag" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}flagType"/>
 *         &lt;element name="militaryBridgingFlag" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}flagType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "edctSubShowReportType", propOrder = {
    "controlledElement",
    "gaBridgingFlag",
    "militaryBridgingFlag"
})
public class EdctSubShowReportType {

    protected List<EdctSubShowReportType.ControlledElement> controlledElement;
    @XmlElement(required = true)
    protected String gaBridgingFlag;
    @XmlElement(required = true)
    protected String militaryBridgingFlag;

    /**
     * Gets the value of the controlledElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the controlledElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getControlledElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EdctSubShowReportType.ControlledElement }
     * 
     * 
     */
    public List<EdctSubShowReportType.ControlledElement> getControlledElement() {
        if (controlledElement == null) {
            controlledElement = new ArrayList<EdctSubShowReportType.ControlledElement>();
        }
        return this.controlledElement;
    }

    /**
     * Gets the value of the gaBridgingFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGaBridgingFlag() {
        return gaBridgingFlag;
    }

    /**
     * Sets the value of the gaBridgingFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGaBridgingFlag(String value) {
        this.gaBridgingFlag = value;
    }

    /**
     * Gets the value of the militaryBridgingFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMilitaryBridgingFlag() {
        return militaryBridgingFlag;
    }

    /**
     * Sets the value of the militaryBridgingFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMilitaryBridgingFlag(String value) {
        this.militaryBridgingFlag = value;
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
     *         &lt;element name="controlledElementName" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}controlElementNameType"/>
     *         &lt;element name="controlledElementType" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}controlElementTypeType"/>
     *         &lt;element name="subsFlag" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}flagType"/>
     *         &lt;element name="scsFlag" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}flagType"/>
     *         &lt;element name="acFlag" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}flagType"/>
     *         &lt;element name="bridgingOffAirline" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}airlineIdType" maxOccurs="unbounded" minOccurs="0"/>
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
        "controlledElementName",
        "controlledElementType",
        "subsFlag",
        "scsFlag",
        "acFlag",
        "bridgingOffAirline"
    })
    public static class ControlledElement {

        @XmlElement(required = true)
        protected String controlledElementName;
        @XmlElement(required = true)
        @XmlSchemaType(name = "string")
        protected ControlElementTypeType controlledElementType;
        @XmlElement(required = true)
        protected String subsFlag;
        @XmlElement(required = true)
        protected String scsFlag;
        @XmlElement(required = true)
        protected String acFlag;
        protected List<String> bridgingOffAirline;

        /**
         * Gets the value of the controlledElementName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getControlledElementName() {
            return controlledElementName;
        }

        /**
         * Sets the value of the controlledElementName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setControlledElementName(String value) {
            this.controlledElementName = value;
        }

        /**
         * Gets the value of the controlledElementType property.
         * 
         * @return
         *     possible object is
         *     {@link ControlElementTypeType }
         *     
         */
        public ControlElementTypeType getControlledElementType() {
            return controlledElementType;
        }

        /**
         * Sets the value of the controlledElementType property.
         * 
         * @param value
         *     allowed object is
         *     {@link ControlElementTypeType }
         *     
         */
        public void setControlledElementType(ControlElementTypeType value) {
            this.controlledElementType = value;
        }

        /**
         * Gets the value of the subsFlag property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubsFlag() {
            return subsFlag;
        }

        /**
         * Sets the value of the subsFlag property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubsFlag(String value) {
            this.subsFlag = value;
        }

        /**
         * Gets the value of the scsFlag property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getScsFlag() {
            return scsFlag;
        }

        /**
         * Sets the value of the scsFlag property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setScsFlag(String value) {
            this.scsFlag = value;
        }

        /**
         * Gets the value of the acFlag property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAcFlag() {
            return acFlag;
        }

        /**
         * Sets the value of the acFlag property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAcFlag(String value) {
            this.acFlag = value;
        }

        /**
         * Gets the value of the bridgingOffAirline property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bridgingOffAirline property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBridgingOffAirline().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getBridgingOffAirline() {
            if (bridgingOffAirline == null) {
                bridgingOffAirline = new ArrayList<String>();
            }
            return this.bridgingOffAirline;
        }

    }

}
