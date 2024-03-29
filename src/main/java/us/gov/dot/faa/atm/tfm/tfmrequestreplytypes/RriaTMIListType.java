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
 * Reroute model TMI list type.
 * 
 * <p>Java class for rriaTMIListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rriaTMIListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gdpList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="gdp" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}tmiDataType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="gsList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="gs" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}tmiDataType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="afpList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="afp" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}tmiDataType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
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
@XmlType(name = "rriaTMIListType", propOrder = {
    "gdpList",
    "gsList",
    "afpList"
})
public class RriaTMIListType {

    protected RriaTMIListType.GdpList gdpList;
    protected RriaTMIListType.GsList gsList;
    protected RriaTMIListType.AfpList afpList;

    /**
     * Gets the value of the gdpList property.
     * 
     * @return
     *     possible object is
     *     {@link RriaTMIListType.GdpList }
     *     
     */
    public RriaTMIListType.GdpList getGdpList() {
        return gdpList;
    }

    /**
     * Sets the value of the gdpList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RriaTMIListType.GdpList }
     *     
     */
    public void setGdpList(RriaTMIListType.GdpList value) {
        this.gdpList = value;
    }

    /**
     * Gets the value of the gsList property.
     * 
     * @return
     *     possible object is
     *     {@link RriaTMIListType.GsList }
     *     
     */
    public RriaTMIListType.GsList getGsList() {
        return gsList;
    }

    /**
     * Sets the value of the gsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RriaTMIListType.GsList }
     *     
     */
    public void setGsList(RriaTMIListType.GsList value) {
        this.gsList = value;
    }

    /**
     * Gets the value of the afpList property.
     * 
     * @return
     *     possible object is
     *     {@link RriaTMIListType.AfpList }
     *     
     */
    public RriaTMIListType.AfpList getAfpList() {
        return afpList;
    }

    /**
     * Sets the value of the afpList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RriaTMIListType.AfpList }
     *     
     */
    public void setAfpList(RriaTMIListType.AfpList value) {
        this.afpList = value;
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
     *         &lt;element name="afp" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}tmiDataType" maxOccurs="unbounded"/>
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
        "afp"
    })
    public static class AfpList {

        @XmlElement(required = true)
        protected List<TmiDataType> afp;

        /**
         * Gets the value of the afp property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the afp property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAfp().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TmiDataType }
         * 
         * 
         */
        public List<TmiDataType> getAfp() {
            if (afp == null) {
                afp = new ArrayList<TmiDataType>();
            }
            return this.afp;
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
     *         &lt;element name="gdp" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}tmiDataType" maxOccurs="unbounded"/>
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
        "gdp"
    })
    public static class GdpList {

        @XmlElement(required = true)
        protected List<TmiDataType> gdp;

        /**
         * Gets the value of the gdp property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the gdp property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGdp().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TmiDataType }
         * 
         * 
         */
        public List<TmiDataType> getGdp() {
            if (gdp == null) {
                gdp = new ArrayList<TmiDataType>();
            }
            return this.gdp;
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
     *         &lt;element name="gs" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}tmiDataType" maxOccurs="unbounded"/>
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
        "gs"
    })
    public static class GsList {

        @XmlElement(required = true)
        protected List<TmiDataType> gs;

        /**
         * Gets the value of the gs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the gs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGs().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TmiDataType }
         * 
         * 
         */
        public List<TmiDataType> getGs() {
            if (gs == null) {
                gs = new ArrayList<TmiDataType>();
            }
            return this.gs;
        }

    }

}
