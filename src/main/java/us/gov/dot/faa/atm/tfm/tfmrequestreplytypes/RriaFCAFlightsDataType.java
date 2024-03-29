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
 * Reroute model FCA flight data list type.
 * 
 * <p>Java class for rriaFCAFlightsDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rriaFCAFlightsDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ctrHead">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="fcaId" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}rriaIdType"/>
 *                   &lt;element name="fcaName">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="30"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="fcaStartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="fcaEndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="rerouteId" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}rriaIdType"/>
 *                   &lt;element name="rerouteName" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}rerouteNameType"/>
 *                   &lt;element name="modelTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ctrFcaFilterList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ctrFilter" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="filterFlagNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="filterId" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}rriaIdType"/>
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
 *         &lt;element name="ctrFlightList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ctrFlight" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="acid" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}aircraftIdType"/>
 *                             &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             &lt;element name="ctrBefore" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}ctrEntryExitTimeCommon" minOccurs="0"/>
 *                             &lt;element name="ctrAfter" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}ctrEntryExitTimeCommon" minOccurs="0"/>
 *                             &lt;element name="ctrAfterMit" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}ctrEntryExitTimeCommon" minOccurs="0"/>
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rriaFCAFlightsDataType", propOrder = {
    "ctrHead",
    "ctrFcaFilterList",
    "ctrFlightList"
})
public class RriaFCAFlightsDataType {

    @XmlElement(required = true)
    protected RriaFCAFlightsDataType.CtrHead ctrHead;
    protected RriaFCAFlightsDataType.CtrFcaFilterList ctrFcaFilterList;
    @XmlElement(required = true)
    protected RriaFCAFlightsDataType.CtrFlightList ctrFlightList;

    /**
     * Gets the value of the ctrHead property.
     * 
     * @return
     *     possible object is
     *     {@link RriaFCAFlightsDataType.CtrHead }
     *     
     */
    public RriaFCAFlightsDataType.CtrHead getCtrHead() {
        return ctrHead;
    }

    /**
     * Sets the value of the ctrHead property.
     * 
     * @param value
     *     allowed object is
     *     {@link RriaFCAFlightsDataType.CtrHead }
     *     
     */
    public void setCtrHead(RriaFCAFlightsDataType.CtrHead value) {
        this.ctrHead = value;
    }

    /**
     * Gets the value of the ctrFcaFilterList property.
     * 
     * @return
     *     possible object is
     *     {@link RriaFCAFlightsDataType.CtrFcaFilterList }
     *     
     */
    public RriaFCAFlightsDataType.CtrFcaFilterList getCtrFcaFilterList() {
        return ctrFcaFilterList;
    }

    /**
     * Sets the value of the ctrFcaFilterList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RriaFCAFlightsDataType.CtrFcaFilterList }
     *     
     */
    public void setCtrFcaFilterList(RriaFCAFlightsDataType.CtrFcaFilterList value) {
        this.ctrFcaFilterList = value;
    }

    /**
     * Gets the value of the ctrFlightList property.
     * 
     * @return
     *     possible object is
     *     {@link RriaFCAFlightsDataType.CtrFlightList }
     *     
     */
    public RriaFCAFlightsDataType.CtrFlightList getCtrFlightList() {
        return ctrFlightList;
    }

    /**
     * Sets the value of the ctrFlightList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RriaFCAFlightsDataType.CtrFlightList }
     *     
     */
    public void setCtrFlightList(RriaFCAFlightsDataType.CtrFlightList value) {
        this.ctrFlightList = value;
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
     *         &lt;element name="ctrFilter" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="filterFlagNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="filterId" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}rriaIdType"/>
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
        "ctrFilter"
    })
    public static class CtrFcaFilterList {

        @XmlElement(required = true)
        protected List<RriaFCAFlightsDataType.CtrFcaFilterList.CtrFilter> ctrFilter;

        /**
         * Gets the value of the ctrFilter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ctrFilter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCtrFilter().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RriaFCAFlightsDataType.CtrFcaFilterList.CtrFilter }
         * 
         * 
         */
        public List<RriaFCAFlightsDataType.CtrFcaFilterList.CtrFilter> getCtrFilter() {
            if (ctrFilter == null) {
                ctrFilter = new ArrayList<RriaFCAFlightsDataType.CtrFcaFilterList.CtrFilter>();
            }
            return this.ctrFilter;
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
         *         &lt;element name="filterFlagNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="filterId" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}rriaIdType"/>
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
            "filterFlagNumber",
            "filterId"
        })
        public static class CtrFilter {

            protected int filterFlagNumber;
            @XmlElement(required = true)
            protected String filterId;

            /**
             * Gets the value of the filterFlagNumber property.
             * 
             */
            public int getFilterFlagNumber() {
                return filterFlagNumber;
            }

            /**
             * Sets the value of the filterFlagNumber property.
             * 
             */
            public void setFilterFlagNumber(int value) {
                this.filterFlagNumber = value;
            }

            /**
             * Gets the value of the filterId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFilterId() {
                return filterId;
            }

            /**
             * Sets the value of the filterId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFilterId(String value) {
                this.filterId = value;
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
     *         &lt;element name="ctrFlight" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="acid" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}aircraftIdType"/>
     *                   &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                   &lt;element name="ctrBefore" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}ctrEntryExitTimeCommon" minOccurs="0"/>
     *                   &lt;element name="ctrAfter" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}ctrEntryExitTimeCommon" minOccurs="0"/>
     *                   &lt;element name="ctrAfterMit" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}ctrEntryExitTimeCommon" minOccurs="0"/>
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
        "ctrFlight"
    })
    public static class CtrFlightList {

        @XmlElement(required = true)
        protected List<RriaFCAFlightsDataType.CtrFlightList.CtrFlight> ctrFlight;

        /**
         * Gets the value of the ctrFlight property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ctrFlight property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCtrFlight().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RriaFCAFlightsDataType.CtrFlightList.CtrFlight }
         * 
         * 
         */
        public List<RriaFCAFlightsDataType.CtrFlightList.CtrFlight> getCtrFlight() {
            if (ctrFlight == null) {
                ctrFlight = new ArrayList<RriaFCAFlightsDataType.CtrFlightList.CtrFlight>();
            }
            return this.ctrFlight;
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
         *         &lt;element name="acid" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}aircraftIdType"/>
         *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *         &lt;element name="ctrBefore" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}ctrEntryExitTimeCommon" minOccurs="0"/>
         *         &lt;element name="ctrAfter" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}ctrEntryExitTimeCommon" minOccurs="0"/>
         *         &lt;element name="ctrAfterMit" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}ctrEntryExitTimeCommon" minOccurs="0"/>
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
            "acid",
            "active",
            "ctrBefore",
            "ctrAfter",
            "ctrAfterMit"
        })
        public static class CtrFlight {

            @XmlElement(required = true)
            protected String acid;
            protected boolean active;
            protected CtrEntryExitTimeCommon ctrBefore;
            protected CtrEntryExitTimeCommon ctrAfter;
            protected CtrEntryExitTimeCommon ctrAfterMit;

            /**
             * Gets the value of the acid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAcid() {
                return acid;
            }

            /**
             * Sets the value of the acid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAcid(String value) {
                this.acid = value;
            }

            /**
             * Gets the value of the active property.
             * 
             */
            public boolean isActive() {
                return active;
            }

            /**
             * Sets the value of the active property.
             * 
             */
            public void setActive(boolean value) {
                this.active = value;
            }

            /**
             * Gets the value of the ctrBefore property.
             * 
             * @return
             *     possible object is
             *     {@link CtrEntryExitTimeCommon }
             *     
             */
            public CtrEntryExitTimeCommon getCtrBefore() {
                return ctrBefore;
            }

            /**
             * Sets the value of the ctrBefore property.
             * 
             * @param value
             *     allowed object is
             *     {@link CtrEntryExitTimeCommon }
             *     
             */
            public void setCtrBefore(CtrEntryExitTimeCommon value) {
                this.ctrBefore = value;
            }

            /**
             * Gets the value of the ctrAfter property.
             * 
             * @return
             *     possible object is
             *     {@link CtrEntryExitTimeCommon }
             *     
             */
            public CtrEntryExitTimeCommon getCtrAfter() {
                return ctrAfter;
            }

            /**
             * Sets the value of the ctrAfter property.
             * 
             * @param value
             *     allowed object is
             *     {@link CtrEntryExitTimeCommon }
             *     
             */
            public void setCtrAfter(CtrEntryExitTimeCommon value) {
                this.ctrAfter = value;
            }

            /**
             * Gets the value of the ctrAfterMit property.
             * 
             * @return
             *     possible object is
             *     {@link CtrEntryExitTimeCommon }
             *     
             */
            public CtrEntryExitTimeCommon getCtrAfterMit() {
                return ctrAfterMit;
            }

            /**
             * Sets the value of the ctrAfterMit property.
             * 
             * @param value
             *     allowed object is
             *     {@link CtrEntryExitTimeCommon }
             *     
             */
            public void setCtrAfterMit(CtrEntryExitTimeCommon value) {
                this.ctrAfterMit = value;
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
     *         &lt;element name="fcaId" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}rriaIdType"/>
     *         &lt;element name="fcaName">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="30"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="fcaStartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="fcaEndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="rerouteId" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}rriaIdType"/>
     *         &lt;element name="rerouteName" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}rerouteNameType"/>
     *         &lt;element name="modelTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
        "fcaId",
        "fcaName",
        "fcaStartTime",
        "fcaEndTime",
        "rerouteId",
        "rerouteName",
        "modelTime"
    })
    public static class CtrHead {

        @XmlElement(required = true)
        protected String fcaId;
        @XmlElement(required = true)
        protected String fcaName;
        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar fcaStartTime;
        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar fcaEndTime;
        @XmlElement(required = true)
        protected String rerouteId;
        @XmlElement(required = true)
        protected String rerouteName;
        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar modelTime;

        /**
         * Gets the value of the fcaId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFcaId() {
            return fcaId;
        }

        /**
         * Sets the value of the fcaId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFcaId(String value) {
            this.fcaId = value;
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
         * Gets the value of the fcaStartTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFcaStartTime() {
            return fcaStartTime;
        }

        /**
         * Sets the value of the fcaStartTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFcaStartTime(XMLGregorianCalendar value) {
            this.fcaStartTime = value;
        }

        /**
         * Gets the value of the fcaEndTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFcaEndTime() {
            return fcaEndTime;
        }

        /**
         * Sets the value of the fcaEndTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFcaEndTime(XMLGregorianCalendar value) {
            this.fcaEndTime = value;
        }

        /**
         * Gets the value of the rerouteId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRerouteId() {
            return rerouteId;
        }

        /**
         * Sets the value of the rerouteId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRerouteId(String value) {
            this.rerouteId = value;
        }

        /**
         * Gets the value of the rerouteName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRerouteName() {
            return rerouteName;
        }

        /**
         * Sets the value of the rerouteName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRerouteName(String value) {
            this.rerouteName = value;
        }

        /**
         * Gets the value of the modelTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getModelTime() {
            return modelTime;
        }

        /**
         * Sets the value of the modelTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setModelTime(XMLGregorianCalendar value) {
            this.modelTime = value;
        }

    }

}
