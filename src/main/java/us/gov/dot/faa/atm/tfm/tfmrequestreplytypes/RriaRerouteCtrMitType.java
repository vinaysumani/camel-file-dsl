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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Reroute MIT type.
 * 
 * <p>Java class for rriaRerouteCtrMitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rriaRerouteCtrMitType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MIT_ID">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="includeMIT" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SPACING">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="EXCLUDE|\d{1,3}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CTR_MIT_FILTER_LIST" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CTR_MIT_FILTER" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;choice>
 *                               &lt;element name="MIT_DESTINATION_FILTER_ID" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}rriaIdType"/>
 *                               &lt;element name="MIT_FEA_FILTER_ID" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}rriaIdType"/>
 *                             &lt;/choice>
 *                             &lt;element name="MIT_FILTER_SPACING">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;pattern value="EXCLUDE|\d{1,3}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="APPLY_TO_FLIGHTS">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="ALL"/>
 *               &lt;enumeration value="REROUTED"/>
 *               &lt;enumeration value="NON-REROUTED"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MIT_TIME_TYPE">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="MANUAL"/>
 *               &lt;enumeration value="AUTO"/>
 *               &lt;enumeration value="FEA_TIMES"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MIT_STARTTIME" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="MIT_ENDTIME" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="MIT_CROSSING_SEGMENT">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;pattern value="(\d{3,5},\d{3,5}[ ]*)+"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="MIT_FIX" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}fixNameType"/>
 *           &lt;element name="MIT_FEA" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}rriaIdType"/>
 *         &lt;/choice>
 *         &lt;element name="CTR_MIT_SEGMENT_LIST" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CTR_MIT_SEGMENT" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SEGMENT_ID" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}rriaRerouteSegmentIdType"/>
 *                             &lt;element name="MIT_LATLON" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}rriaLatLongType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CTR_MIT_FEA_AS_ONE_FILTER_LIST" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice maxOccurs="unbounded">
 *                   &lt;element name="MIT_FEA_AS_ONE_FILTER_ID" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}rriaIdType"/>
 *                 &lt;/choice>
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
@XmlType(name = "rriaRerouteCtrMitType", propOrder = {
    "mitid",
    "includeMIT",
    "spacing",
    "ctrmitfilterlist",
    "applytoflights",
    "mittimetype",
    "mitstarttime",
    "mitendtime",
    "mitcrossingsegment",
    "mitfix",
    "mitfea",
    "ctrmitsegmentlist",
    "ctrmitfeaasonefilterlist"
})
public class RriaRerouteCtrMitType {

    @XmlElement(name = "MIT_ID", required = true)
    protected String mitid;
    protected boolean includeMIT;
    @XmlElement(name = "SPACING", required = true)
    protected String spacing;
    @XmlElement(name = "CTR_MIT_FILTER_LIST")
    protected RriaRerouteCtrMitType.CTRMITFILTERLIST ctrmitfilterlist;
    @XmlElement(name = "APPLY_TO_FLIGHTS", required = true)
    protected String applytoflights;
    @XmlElement(name = "MIT_TIME_TYPE", required = true)
    protected String mittimetype;
    @XmlElement(name = "MIT_STARTTIME")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mitstarttime;
    @XmlElement(name = "MIT_ENDTIME")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar mitendtime;
    @XmlElement(name = "MIT_CROSSING_SEGMENT")
    protected String mitcrossingsegment;
    @XmlElement(name = "MIT_FIX")
    protected String mitfix;
    @XmlElement(name = "MIT_FEA")
    protected String mitfea;
    @XmlElement(name = "CTR_MIT_SEGMENT_LIST")
    protected RriaRerouteCtrMitType.CTRMITSEGMENTLIST ctrmitsegmentlist;
    @XmlElement(name = "CTR_MIT_FEA_AS_ONE_FILTER_LIST")
    protected RriaRerouteCtrMitType.CTRMITFEAASONEFILTERLIST ctrmitfeaasonefilterlist;

    /**
     * Gets the value of the mitid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMITID() {
        return mitid;
    }

    /**
     * Sets the value of the mitid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMITID(String value) {
        this.mitid = value;
    }

    /**
     * Gets the value of the includeMIT property.
     * 
     */
    public boolean isIncludeMIT() {
        return includeMIT;
    }

    /**
     * Sets the value of the includeMIT property.
     * 
     */
    public void setIncludeMIT(boolean value) {
        this.includeMIT = value;
    }

    /**
     * Gets the value of the spacing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSPACING() {
        return spacing;
    }

    /**
     * Sets the value of the spacing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSPACING(String value) {
        this.spacing = value;
    }

    /**
     * Gets the value of the ctrmitfilterlist property.
     * 
     * @return
     *     possible object is
     *     {@link RriaRerouteCtrMitType.CTRMITFILTERLIST }
     *     
     */
    public RriaRerouteCtrMitType.CTRMITFILTERLIST getCTRMITFILTERLIST() {
        return ctrmitfilterlist;
    }

    /**
     * Sets the value of the ctrmitfilterlist property.
     * 
     * @param value
     *     allowed object is
     *     {@link RriaRerouteCtrMitType.CTRMITFILTERLIST }
     *     
     */
    public void setCTRMITFILTERLIST(RriaRerouteCtrMitType.CTRMITFILTERLIST value) {
        this.ctrmitfilterlist = value;
    }

    /**
     * Gets the value of the applytoflights property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPPLYTOFLIGHTS() {
        return applytoflights;
    }

    /**
     * Sets the value of the applytoflights property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPPLYTOFLIGHTS(String value) {
        this.applytoflights = value;
    }

    /**
     * Gets the value of the mittimetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMITTIMETYPE() {
        return mittimetype;
    }

    /**
     * Sets the value of the mittimetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMITTIMETYPE(String value) {
        this.mittimetype = value;
    }

    /**
     * Gets the value of the mitstarttime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMITSTARTTIME() {
        return mitstarttime;
    }

    /**
     * Sets the value of the mitstarttime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMITSTARTTIME(XMLGregorianCalendar value) {
        this.mitstarttime = value;
    }

    /**
     * Gets the value of the mitendtime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMITENDTIME() {
        return mitendtime;
    }

    /**
     * Sets the value of the mitendtime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMITENDTIME(XMLGregorianCalendar value) {
        this.mitendtime = value;
    }

    /**
     * Gets the value of the mitcrossingsegment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMITCROSSINGSEGMENT() {
        return mitcrossingsegment;
    }

    /**
     * Sets the value of the mitcrossingsegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMITCROSSINGSEGMENT(String value) {
        this.mitcrossingsegment = value;
    }

    /**
     * Gets the value of the mitfix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMITFIX() {
        return mitfix;
    }

    /**
     * Sets the value of the mitfix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMITFIX(String value) {
        this.mitfix = value;
    }

    /**
     * Gets the value of the mitfea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMITFEA() {
        return mitfea;
    }

    /**
     * Sets the value of the mitfea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMITFEA(String value) {
        this.mitfea = value;
    }

    /**
     * Gets the value of the ctrmitsegmentlist property.
     * 
     * @return
     *     possible object is
     *     {@link RriaRerouteCtrMitType.CTRMITSEGMENTLIST }
     *     
     */
    public RriaRerouteCtrMitType.CTRMITSEGMENTLIST getCTRMITSEGMENTLIST() {
        return ctrmitsegmentlist;
    }

    /**
     * Sets the value of the ctrmitsegmentlist property.
     * 
     * @param value
     *     allowed object is
     *     {@link RriaRerouteCtrMitType.CTRMITSEGMENTLIST }
     *     
     */
    public void setCTRMITSEGMENTLIST(RriaRerouteCtrMitType.CTRMITSEGMENTLIST value) {
        this.ctrmitsegmentlist = value;
    }

    /**
     * Gets the value of the ctrmitfeaasonefilterlist property.
     * 
     * @return
     *     possible object is
     *     {@link RriaRerouteCtrMitType.CTRMITFEAASONEFILTERLIST }
     *     
     */
    public RriaRerouteCtrMitType.CTRMITFEAASONEFILTERLIST getCTRMITFEAASONEFILTERLIST() {
        return ctrmitfeaasonefilterlist;
    }

    /**
     * Sets the value of the ctrmitfeaasonefilterlist property.
     * 
     * @param value
     *     allowed object is
     *     {@link RriaRerouteCtrMitType.CTRMITFEAASONEFILTERLIST }
     *     
     */
    public void setCTRMITFEAASONEFILTERLIST(RriaRerouteCtrMitType.CTRMITFEAASONEFILTERLIST value) {
        this.ctrmitfeaasonefilterlist = value;
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
     *       &lt;choice maxOccurs="unbounded">
     *         &lt;element name="MIT_FEA_AS_ONE_FILTER_ID" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}rriaIdType"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "mitfeaasonefilterid"
    })
    public static class CTRMITFEAASONEFILTERLIST {

        @XmlElement(name = "MIT_FEA_AS_ONE_FILTER_ID")
        protected List<String> mitfeaasonefilterid;

        /**
         * Gets the value of the mitfeaasonefilterid property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mitfeaasonefilterid property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMITFEAASONEFILTERID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getMITFEAASONEFILTERID() {
            if (mitfeaasonefilterid == null) {
                mitfeaasonefilterid = new ArrayList<String>();
            }
            return this.mitfeaasonefilterid;
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
     *         &lt;element name="CTR_MIT_FILTER" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;choice>
     *                     &lt;element name="MIT_DESTINATION_FILTER_ID" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}rriaIdType"/>
     *                     &lt;element name="MIT_FEA_FILTER_ID" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}rriaIdType"/>
     *                   &lt;/choice>
     *                   &lt;element name="MIT_FILTER_SPACING">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="EXCLUDE|\d{1,3}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
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
    @XmlType(name = "", propOrder = {
        "ctrmitfilter"
    })
    public static class CTRMITFILTERLIST {

        @XmlElement(name = "CTR_MIT_FILTER", required = true)
        protected List<RriaRerouteCtrMitType.CTRMITFILTERLIST.CTRMITFILTER> ctrmitfilter;

        /**
         * Gets the value of the ctrmitfilter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ctrmitfilter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCTRMITFILTER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RriaRerouteCtrMitType.CTRMITFILTERLIST.CTRMITFILTER }
         * 
         * 
         */
        public List<RriaRerouteCtrMitType.CTRMITFILTERLIST.CTRMITFILTER> getCTRMITFILTER() {
            if (ctrmitfilter == null) {
                ctrmitfilter = new ArrayList<RriaRerouteCtrMitType.CTRMITFILTERLIST.CTRMITFILTER>();
            }
            return this.ctrmitfilter;
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
         *         &lt;choice>
         *           &lt;element name="MIT_DESTINATION_FILTER_ID" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}rriaIdType"/>
         *           &lt;element name="MIT_FEA_FILTER_ID" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}rriaIdType"/>
         *         &lt;/choice>
         *         &lt;element name="MIT_FILTER_SPACING">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="EXCLUDE|\d{1,3}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
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
        @XmlType(name = "", propOrder = {
            "mitdestinationfilterid",
            "mitfeafilterid",
            "mitfilterspacing"
        })
        public static class CTRMITFILTER {

            @XmlElement(name = "MIT_DESTINATION_FILTER_ID")
            protected String mitdestinationfilterid;
            @XmlElement(name = "MIT_FEA_FILTER_ID")
            protected String mitfeafilterid;
            @XmlElement(name = "MIT_FILTER_SPACING", required = true)
            protected String mitfilterspacing;

            /**
             * Gets the value of the mitdestinationfilterid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMITDESTINATIONFILTERID() {
                return mitdestinationfilterid;
            }

            /**
             * Sets the value of the mitdestinationfilterid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMITDESTINATIONFILTERID(String value) {
                this.mitdestinationfilterid = value;
            }

            /**
             * Gets the value of the mitfeafilterid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMITFEAFILTERID() {
                return mitfeafilterid;
            }

            /**
             * Sets the value of the mitfeafilterid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMITFEAFILTERID(String value) {
                this.mitfeafilterid = value;
            }

            /**
             * Gets the value of the mitfilterspacing property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMITFILTERSPACING() {
                return mitfilterspacing;
            }

            /**
             * Sets the value of the mitfilterspacing property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMITFILTERSPACING(String value) {
                this.mitfilterspacing = value;
            }

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
     *         &lt;element name="CTR_MIT_SEGMENT" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SEGMENT_ID" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}rriaRerouteSegmentIdType"/>
     *                   &lt;element name="MIT_LATLON" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}rriaLatLongType" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {
        "ctrmitsegment"
    })
    public static class CTRMITSEGMENTLIST {

        @XmlElement(name = "CTR_MIT_SEGMENT", required = true)
        protected List<RriaRerouteCtrMitType.CTRMITSEGMENTLIST.CTRMITSEGMENT> ctrmitsegment;

        /**
         * Gets the value of the ctrmitsegment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ctrmitsegment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCTRMITSEGMENT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RriaRerouteCtrMitType.CTRMITSEGMENTLIST.CTRMITSEGMENT }
         * 
         * 
         */
        public List<RriaRerouteCtrMitType.CTRMITSEGMENTLIST.CTRMITSEGMENT> getCTRMITSEGMENT() {
            if (ctrmitsegment == null) {
                ctrmitsegment = new ArrayList<RriaRerouteCtrMitType.CTRMITSEGMENTLIST.CTRMITSEGMENT>();
            }
            return this.ctrmitsegment;
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
         *         &lt;element name="SEGMENT_ID" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}rriaRerouteSegmentIdType"/>
         *         &lt;element name="MIT_LATLON" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}rriaLatLongType" minOccurs="0"/>
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
            "segmentid",
            "mitlatlon"
        })
        public static class CTRMITSEGMENT {

            @XmlElement(name = "SEGMENT_ID", required = true)
            protected String segmentid;
            @XmlElement(name = "MIT_LATLON")
            protected String mitlatlon;

            /**
             * Gets the value of the segmentid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSEGMENTID() {
                return segmentid;
            }

            /**
             * Sets the value of the segmentid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSEGMENTID(String value) {
                this.segmentid = value;
            }

            /**
             * Gets the value of the mitlatlon property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMITLATLON() {
                return mitlatlon;
            }

            /**
             * Sets the value of the mitlatlon property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMITLATLON(String value) {
                this.mitlatlon = value;
            }

        }

    }

}
