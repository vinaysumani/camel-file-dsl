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


/**
 * Contains the trajectory option set for a single flight
 * 
 * <p>Java class for tosType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tosType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="uniqueFltIdData" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}fltIdType"/>
 *         &lt;element name="tosSeqNo" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}tosSeqNbrType"/>
 *         &lt;element name="type" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}typeOfAircraftType"/>
 *         &lt;element name="ERTD" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="relFltPriority" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}relFltPriorityType" minOccurs="0"/>
 *         &lt;element name="trajOptList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="trajOption" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}trajOptionsListType" maxOccurs="100"/>
 *                 &lt;/sequence>
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
@XmlType(name = "tosType", propOrder = {

})
public class TosType {

    @XmlElement(required = true)
    protected FltIdType uniqueFltIdData;
    @XmlSchemaType(name = "integer")
    protected int tosSeqNo;
    @XmlElement(required = true)
    protected String type;
    @XmlElement(name = "ERTD")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ertd;
    @XmlSchemaType(name = "integer")
    protected Integer relFltPriority;
    @XmlElement(required = true)
    protected TosType.TrajOptList trajOptList;

    /**
     * Gets the value of the uniqueFltIdData property.
     * 
     * @return
     *     possible object is
     *     {@link FltIdType }
     *     
     */
    public FltIdType getUniqueFltIdData() {
        return uniqueFltIdData;
    }

    /**
     * Sets the value of the uniqueFltIdData property.
     * 
     * @param value
     *     allowed object is
     *     {@link FltIdType }
     *     
     */
    public void setUniqueFltIdData(FltIdType value) {
        this.uniqueFltIdData = value;
    }

    /**
     * Gets the value of the tosSeqNo property.
     * 
     */
    public int getTosSeqNo() {
        return tosSeqNo;
    }

    /**
     * Sets the value of the tosSeqNo property.
     * 
     */
    public void setTosSeqNo(int value) {
        this.tosSeqNo = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
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
     * Gets the value of the trajOptList property.
     * 
     * @return
     *     possible object is
     *     {@link TosType.TrajOptList }
     *     
     */
    public TosType.TrajOptList getTrajOptList() {
        return trajOptList;
    }

    /**
     * Sets the value of the trajOptList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TosType.TrajOptList }
     *     
     */
    public void setTrajOptList(TosType.TrajOptList value) {
        this.trajOptList = value;
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
     *         &lt;element name="trajOption" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}trajOptionsListType" maxOccurs="100"/>
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
    public static class TrajOptList {

        @XmlElement(required = true)
        protected List<TrajOptionsListType> trajOption;

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
         * {@link TrajOptionsListType }
         * 
         * 
         */
        public List<TrajOptionsListType> getTrajOption() {
            if (trajOption == null) {
                trajOption = new ArrayList<TrajOptionsListType>();
            }
            return this.trajOption;
        }

    }

}
