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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for advTmiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="advTmiType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="rerouteAdvisory">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}rerouteAdvisoryType">
 *                 &lt;attribute name="rerouteCancel" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="delayProgramAdvisory">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}delayProgramAdvisoryType">
 *                 &lt;attribute name="programStatus" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}programStatusType" />
 *                 &lt;attribute name="programPurge" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
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
@XmlType(name = "advTmiType", propOrder = {
    "rerouteAdvisory",
    "delayProgramAdvisory"
})
public class AdvTmiType {

    protected AdvTmiType.RerouteAdvisory rerouteAdvisory;
    protected AdvTmiType.DelayProgramAdvisory delayProgramAdvisory;

    /**
     * Gets the value of the rerouteAdvisory property.
     * 
     * @return
     *     possible object is
     *     {@link AdvTmiType.RerouteAdvisory }
     *     
     */
    public AdvTmiType.RerouteAdvisory getRerouteAdvisory() {
        return rerouteAdvisory;
    }

    /**
     * Sets the value of the rerouteAdvisory property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvTmiType.RerouteAdvisory }
     *     
     */
    public void setRerouteAdvisory(AdvTmiType.RerouteAdvisory value) {
        this.rerouteAdvisory = value;
    }

    /**
     * Gets the value of the delayProgramAdvisory property.
     * 
     * @return
     *     possible object is
     *     {@link AdvTmiType.DelayProgramAdvisory }
     *     
     */
    public AdvTmiType.DelayProgramAdvisory getDelayProgramAdvisory() {
        return delayProgramAdvisory;
    }

    /**
     * Sets the value of the delayProgramAdvisory property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvTmiType.DelayProgramAdvisory }
     *     
     */
    public void setDelayProgramAdvisory(AdvTmiType.DelayProgramAdvisory value) {
        this.delayProgramAdvisory = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}delayProgramAdvisoryType">
     *       &lt;attribute name="programStatus" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}programStatusType" />
     *       &lt;attribute name="programPurge" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DelayProgramAdvisory
        extends DelayProgramAdvisoryType
    {

        @XmlAttribute(name = "programStatus")
        protected ProgramStatusType programStatus;
        @XmlAttribute(name = "programPurge")
        protected Boolean programPurge;

        /**
         * Gets the value of the programStatus property.
         * 
         * @return
         *     possible object is
         *     {@link ProgramStatusType }
         *     
         */
        public ProgramStatusType getProgramStatus() {
            return programStatus;
        }

        /**
         * Sets the value of the programStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProgramStatusType }
         *     
         */
        public void setProgramStatus(ProgramStatusType value) {
            this.programStatus = value;
        }

        /**
         * Gets the value of the programPurge property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isProgramPurge() {
            return programPurge;
        }

        /**
         * Sets the value of the programPurge property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setProgramPurge(Boolean value) {
            this.programPurge = value;
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
     *     &lt;extension base="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}rerouteAdvisoryType">
     *       &lt;attribute name="rerouteCancel" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RerouteAdvisory
        extends RerouteAdvisoryType
    {

        @XmlAttribute(name = "rerouteCancel")
        protected Boolean rerouteCancel;

        /**
         * Gets the value of the rerouteCancel property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRerouteCancel() {
            return rerouteCancel;
        }

        /**
         * Sets the value of the rerouteCancel property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRerouteCancel(Boolean value) {
            this.rerouteCancel = value;
        }

    }

}
