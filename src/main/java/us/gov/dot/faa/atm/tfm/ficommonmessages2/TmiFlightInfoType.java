//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package us.gov.dot.faa.atm.tfm.ficommonmessages2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tmiFlightInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tmiFlightInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tmi">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages2}tmiReferenceType">
 *                 &lt;attribute name="updateType">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="NEW"/>
 *                       &lt;enumeration value="UPDATE"/>
 *                       &lt;enumeration value="DROPOUT"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="ctopFlightData" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages2}ctopFltDataType"/>
 *           &lt;element name="rerouteFlightData" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages2}rrFltDataType"/>
 *           &lt;element name="fxaFlightData" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages2}fxaFlightListType"/>
 *           &lt;element name="flowProgramFlightData" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages2}flowFltDataType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tmiFlightInfoType", propOrder = {
    "tmi",
    "ctopFlightData",
    "rerouteFlightData",
    "fxaFlightData",
    "flowProgramFlightData"
})
public class TmiFlightInfoType {

    @XmlElement(required = true)
    protected TmiFlightInfoType.Tmi tmi;
    protected CtopFltDataType ctopFlightData;
    protected RrFltDataType rerouteFlightData;
    protected FxaFlightListType fxaFlightData;
    protected FlowFltDataType flowProgramFlightData;

    /**
     * Gets the value of the tmi property.
     * 
     * @return
     *     possible object is
     *     {@link TmiFlightInfoType.Tmi }
     *     
     */
    public TmiFlightInfoType.Tmi getTmi() {
        return tmi;
    }

    /**
     * Sets the value of the tmi property.
     * 
     * @param value
     *     allowed object is
     *     {@link TmiFlightInfoType.Tmi }
     *     
     */
    public void setTmi(TmiFlightInfoType.Tmi value) {
        this.tmi = value;
    }

    /**
     * Gets the value of the ctopFlightData property.
     * 
     * @return
     *     possible object is
     *     {@link CtopFltDataType }
     *     
     */
    public CtopFltDataType getCtopFlightData() {
        return ctopFlightData;
    }

    /**
     * Sets the value of the ctopFlightData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtopFltDataType }
     *     
     */
    public void setCtopFlightData(CtopFltDataType value) {
        this.ctopFlightData = value;
    }

    /**
     * Gets the value of the rerouteFlightData property.
     * 
     * @return
     *     possible object is
     *     {@link RrFltDataType }
     *     
     */
    public RrFltDataType getRerouteFlightData() {
        return rerouteFlightData;
    }

    /**
     * Sets the value of the rerouteFlightData property.
     * 
     * @param value
     *     allowed object is
     *     {@link RrFltDataType }
     *     
     */
    public void setRerouteFlightData(RrFltDataType value) {
        this.rerouteFlightData = value;
    }

    /**
     * Gets the value of the fxaFlightData property.
     * 
     * @return
     *     possible object is
     *     {@link FxaFlightListType }
     *     
     */
    public FxaFlightListType getFxaFlightData() {
        return fxaFlightData;
    }

    /**
     * Sets the value of the fxaFlightData property.
     * 
     * @param value
     *     allowed object is
     *     {@link FxaFlightListType }
     *     
     */
    public void setFxaFlightData(FxaFlightListType value) {
        this.fxaFlightData = value;
    }

    /**
     * Gets the value of the flowProgramFlightData property.
     * 
     * @return
     *     possible object is
     *     {@link FlowFltDataType }
     *     
     */
    public FlowFltDataType getFlowProgramFlightData() {
        return flowProgramFlightData;
    }

    /**
     * Sets the value of the flowProgramFlightData property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlowFltDataType }
     *     
     */
    public void setFlowProgramFlightData(FlowFltDataType value) {
        this.flowProgramFlightData = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages2}tmiReferenceType">
     *       &lt;attribute name="updateType">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="NEW"/>
     *             &lt;enumeration value="UPDATE"/>
     *             &lt;enumeration value="DROPOUT"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Tmi
        extends TmiReferenceType
    {

        @XmlAttribute(name = "updateType")
        protected String updateType;

        /**
         * Gets the value of the updateType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUpdateType() {
            return updateType;
        }

        /**
         * Sets the value of the updateType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUpdateType(String value) {
            this.updateType = value;
        }

    }

}
