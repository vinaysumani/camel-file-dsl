//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package us.gov.dot.faa.atm.tfm.tfmrequestreplytypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Defines the EDCT model response time.
 * 
 * <p>Java class for edctModelResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="edctModelResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="limitedControlTimes">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}controlTimePairType"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="unlimitedControlTimes">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}controlTimePairType"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
@XmlType(name = "edctModelResponseType", propOrder = {
    "limitedControlTimes",
    "unlimitedControlTimes"
})
public class EdctModelResponseType {

    @XmlElement(required = true)
    protected EdctModelResponseType.LimitedControlTimes limitedControlTimes;
    @XmlElement(required = true)
    protected EdctModelResponseType.UnlimitedControlTimes unlimitedControlTimes;

    /**
     * Gets the value of the limitedControlTimes property.
     * 
     * @return
     *     possible object is
     *     {@link EdctModelResponseType.LimitedControlTimes }
     *     
     */
    public EdctModelResponseType.LimitedControlTimes getLimitedControlTimes() {
        return limitedControlTimes;
    }

    /**
     * Sets the value of the limitedControlTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link EdctModelResponseType.LimitedControlTimes }
     *     
     */
    public void setLimitedControlTimes(EdctModelResponseType.LimitedControlTimes value) {
        this.limitedControlTimes = value;
    }

    /**
     * Gets the value of the unlimitedControlTimes property.
     * 
     * @return
     *     possible object is
     *     {@link EdctModelResponseType.UnlimitedControlTimes }
     *     
     */
    public EdctModelResponseType.UnlimitedControlTimes getUnlimitedControlTimes() {
        return unlimitedControlTimes;
    }

    /**
     * Sets the value of the unlimitedControlTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link EdctModelResponseType.UnlimitedControlTimes }
     *     
     */
    public void setUnlimitedControlTimes(EdctModelResponseType.UnlimitedControlTimes value) {
        this.unlimitedControlTimes = value;
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
     *       &lt;attGroup ref="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}controlTimePairType"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class LimitedControlTimes {

        @XmlAttribute(name = "CTD", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar ctd;
        @XmlAttribute(name = "CTA", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar cta;

        /**
         * Gets the value of the ctd property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCTD() {
            return ctd;
        }

        /**
         * Sets the value of the ctd property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCTD(XMLGregorianCalendar value) {
            this.ctd = value;
        }

        /**
         * Gets the value of the cta property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCTA() {
            return cta;
        }

        /**
         * Sets the value of the cta property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCTA(XMLGregorianCalendar value) {
            this.cta = value;
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
     *       &lt;attGroup ref="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}controlTimePairType"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class UnlimitedControlTimes {

        @XmlAttribute(name = "CTD", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar ctd;
        @XmlAttribute(name = "CTA", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar cta;

        /**
         * Gets the value of the ctd property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCTD() {
            return ctd;
        }

        /**
         * Sets the value of the ctd property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCTD(XMLGregorianCalendar value) {
            this.ctd = value;
        }

        /**
         * Gets the value of the cta property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCTA() {
            return cta;
        }

        /**
         * Sets the value of the cta property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCTA(XMLGregorianCalendar value) {
            this.cta = value;
        }

    }

}
