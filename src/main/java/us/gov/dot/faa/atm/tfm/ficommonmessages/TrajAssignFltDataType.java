//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package us.gov.dot.faa.atm.tfm.ficommonmessages;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import us.gov.dot.faa.atm.tfm.tfmdatacoreelements.QualifiedAircraftIdType;


/**
 * Grouping of xml trajectory assignment flight data with a common type
 * 
 * <p>Java class for trajAssignFltDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="trajAssignFltDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="uniqueFltIdData" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}qualifiedAircraftIdType"/>
 *         &lt;element name="ERTD" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="trajSource" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}trajSourceType"/>
 *         &lt;element name="newTrajSource" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}trajectorySourceType" minOccurs="0"/>
 *         &lt;element name="ctlExempt">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="TRUE"/>
 *               &lt;enumeration value="FALSE"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="exemptReason" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="NON_EXEMPT"/>
 *               &lt;enumeration value="MANUAL"/>
 *               &lt;enumeration value="ACID"/>
 *               &lt;enumeration value="INTERNATIONAL"/>
 *               &lt;enumeration value="ANOTHER_CTOP"/>
 *               &lt;enumeration value="TIME"/>
 *               &lt;enumeration value="ARR_ARPT"/>
 *               &lt;enumeration value="DEP_ARPT"/>
 *               &lt;enumeration value="ARR_ARTCC"/>
 *               &lt;enumeration value="DEP_ARTCC"/>
 *               &lt;enumeration value="ACTIVE"/>
 *               &lt;enumeration value="AFP"/>
 *               &lt;enumeration value="GDP"/>
 *               &lt;enumeration value="GS"/>
 *               &lt;enumeration value="PARAM"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ctlElement">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="3"/>
 *               &lt;maxLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="tosSeqNo" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}tosSeqNbrType" minOccurs="0"/>
 *         &lt;element name="relFltPriority" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}relFltPriorityType" minOccurs="0"/>
 *         &lt;element name="slot" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}fltSlotType" minOccurs="0"/>
 *         &lt;element name="CTD" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="trajOptionList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="trajOption" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}trajOptionType" maxOccurs="100"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="preImplicitSub" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="slot" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}fltSlotType" minOccurs="0"/>
 *                   &lt;element name="trajIndex" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}trajIndexType"/>
 *                   &lt;element name="CTD" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="adjustedCost" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}trajAdjCostType"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trajAssignFltDataType", propOrder = {

})
public class TrajAssignFltDataType {

    @XmlElement(required = true)
    protected QualifiedAircraftIdType uniqueFltIdData;
    @XmlElement(name = "ERTD")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ertd;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TrajSourceType trajSource;
    @XmlSchemaType(name = "string")
    protected TrajectorySourceType newTrajSource;
    @XmlElement(required = true)
    protected String ctlExempt;
    protected String exemptReason;
    @XmlElement(required = true)
    protected String ctlElement;
    @XmlSchemaType(name = "integer")
    protected Integer tosSeqNo;
    @XmlSchemaType(name = "integer")
    protected Integer relFltPriority;
    protected String slot;
    @XmlElement(name = "CTD")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ctd;
    protected TrajAssignFltDataType.TrajOptionList trajOptionList;
    protected TrajAssignFltDataType.PreImplicitSub preImplicitSub;

    /**
     * Gets the value of the uniqueFltIdData property.
     * 
     * @return
     *     possible object is
     *     {@link QualifiedAircraftIdType }
     *     
     */
    public QualifiedAircraftIdType getUniqueFltIdData() {
        return uniqueFltIdData;
    }

    /**
     * Sets the value of the uniqueFltIdData property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualifiedAircraftIdType }
     *     
     */
    public void setUniqueFltIdData(QualifiedAircraftIdType value) {
        this.uniqueFltIdData = value;
    }

    /**
     * Gets the value of the ertd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getERTD() {
        return ertd;
    }

    /**
     * Sets the value of the ertd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setERTD(XMLGregorianCalendar value) {
        this.ertd = value;
    }

    /**
     * Gets the value of the trajSource property.
     * 
     * @return
     *     possible object is
     *     {@link TrajSourceType }
     *     
     */
    public TrajSourceType getTrajSource() {
        return trajSource;
    }

    /**
     * Sets the value of the trajSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrajSourceType }
     *     
     */
    public void setTrajSource(TrajSourceType value) {
        this.trajSource = value;
    }

    /**
     * Gets the value of the newTrajSource property.
     * 
     * @return
     *     possible object is
     *     {@link TrajectorySourceType }
     *     
     */
    public TrajectorySourceType getNewTrajSource() {
        return newTrajSource;
    }

    /**
     * Sets the value of the newTrajSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrajectorySourceType }
     *     
     */
    public void setNewTrajSource(TrajectorySourceType value) {
        this.newTrajSource = value;
    }

    /**
     * Gets the value of the ctlExempt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtlExempt() {
        return ctlExempt;
    }

    /**
     * Sets the value of the ctlExempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtlExempt(String value) {
        this.ctlExempt = value;
    }

    /**
     * Gets the value of the exemptReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExemptReason() {
        return exemptReason;
    }

    /**
     * Sets the value of the exemptReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExemptReason(String value) {
        this.exemptReason = value;
    }

    /**
     * Gets the value of the ctlElement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtlElement() {
        return ctlElement;
    }

    /**
     * Sets the value of the ctlElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtlElement(String value) {
        this.ctlElement = value;
    }

    /**
     * Gets the value of the tosSeqNo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTosSeqNo() {
        return tosSeqNo;
    }

    /**
     * Sets the value of the tosSeqNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTosSeqNo(Integer value) {
        this.tosSeqNo = value;
    }

    /**
     * Gets the value of the relFltPriority property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRelFltPriority() {
        return relFltPriority;
    }

    /**
     * Sets the value of the relFltPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRelFltPriority(Integer value) {
        this.relFltPriority = value;
    }

    /**
     * Gets the value of the slot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlot() {
        return slot;
    }

    /**
     * Sets the value of the slot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlot(String value) {
        this.slot = value;
    }

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
     * Gets the value of the trajOptionList property.
     * 
     * @return
     *     possible object is
     *     {@link TrajAssignFltDataType.TrajOptionList }
     *     
     */
    public TrajAssignFltDataType.TrajOptionList getTrajOptionList() {
        return trajOptionList;
    }

    /**
     * Sets the value of the trajOptionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrajAssignFltDataType.TrajOptionList }
     *     
     */
    public void setTrajOptionList(TrajAssignFltDataType.TrajOptionList value) {
        this.trajOptionList = value;
    }

    /**
     * Gets the value of the preImplicitSub property.
     * 
     * @return
     *     possible object is
     *     {@link TrajAssignFltDataType.PreImplicitSub }
     *     
     */
    public TrajAssignFltDataType.PreImplicitSub getPreImplicitSub() {
        return preImplicitSub;
    }

    /**
     * Sets the value of the preImplicitSub property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrajAssignFltDataType.PreImplicitSub }
     *     
     */
    public void setPreImplicitSub(TrajAssignFltDataType.PreImplicitSub value) {
        this.preImplicitSub = value;
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
     *       &lt;all>
     *         &lt;element name="slot" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}fltSlotType" minOccurs="0"/>
     *         &lt;element name="trajIndex" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}trajIndexType"/>
     *         &lt;element name="CTD" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="adjustedCost" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}trajAdjCostType"/>
     *       &lt;/all>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class PreImplicitSub {

        protected String slot;
        @XmlSchemaType(name = "integer")
        protected int trajIndex;
        @XmlElement(name = "CTD")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar ctd;
        @XmlSchemaType(name = "integer")
        protected int adjustedCost;

        /**
         * Gets the value of the slot property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSlot() {
            return slot;
        }

        /**
         * Sets the value of the slot property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSlot(String value) {
            this.slot = value;
        }

        /**
         * Gets the value of the trajIndex property.
         * 
         */
        public int getTrajIndex() {
            return trajIndex;
        }

        /**
         * Sets the value of the trajIndex property.
         * 
         */
        public void setTrajIndex(int value) {
            this.trajIndex = value;
        }

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
         * Gets the value of the adjustedCost property.
         * 
         */
        public int getAdjustedCost() {
            return adjustedCost;
        }

        /**
         * Sets the value of the adjustedCost property.
         * 
         */
        public void setAdjustedCost(int value) {
            this.adjustedCost = value;
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
     *         &lt;element name="trajOption" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}trajOptionType" maxOccurs="100"/>
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
        "trajOption"
    })
    public static class TrajOptionList {

        @XmlElement(required = true)
        protected List<TrajOptionType> trajOption;

        /**
         * Gets the value of the trajOption property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the trajOption property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTrajOption().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TrajOptionType }
         * 
         * 
         */
        public List<TrajOptionType> getTrajOption() {
            if (trajOption == null) {
                trajOption = new ArrayList<TrajOptionType>();
            }
            return this.trajOption;
        }

    }

}
