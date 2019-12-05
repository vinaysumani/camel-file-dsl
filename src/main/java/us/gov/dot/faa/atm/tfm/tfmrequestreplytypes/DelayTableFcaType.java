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
import javax.xml.bind.annotation.XmlType;


/**
 * Delay table FCA type.
 * 
 * <p>Java class for delayTableFcaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="delayTableFcaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fcaUniqueId" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages2}uniqueFcaIdType"/>
 *         &lt;element name="fcaName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ctopFcaDelayTableData" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}ctopFcaDelayTableType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "delayTableFcaType", propOrder = {
    "fcaUniqueId",
    "fcaName",
    "ctopFcaDelayTableData"
})
public class DelayTableFcaType {

    @XmlElement(required = true)
    protected String fcaUniqueId;
    @XmlElement(required = true)
    protected String fcaName;
    @XmlElement(required = true)
    protected List<CtopFcaDelayTableType> ctopFcaDelayTableData;

    /**
     * Gets the value of the fcaUniqueId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFcaUniqueId() {
        return fcaUniqueId;
    }

    /**
     * Sets the value of the fcaUniqueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFcaUniqueId(String value) {
        this.fcaUniqueId = value;
    }

    /**
     * Gets the value of the fcaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFcaName() {
        return fcaName;
    }

    /**
     * Sets the value of the fcaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFcaName(String value) {
        this.fcaName = value;
    }

    /**
     * Gets the value of the ctopFcaDelayTableData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ctopFcaDelayTableData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCtopFcaDelayTableData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtopFcaDelayTableType }
     * 
     * 
     */
    public List<CtopFcaDelayTableType> getCtopFcaDelayTableData() {
        if (ctopFcaDelayTableData == null) {
            ctopFcaDelayTableData = new ArrayList<CtopFcaDelayTableType>();
        }
        return this.ctopFcaDelayTableData;
    }

}