//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package us.gov.dot.faa.atm.tfm.ficommonmessages;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import us.gov.dot.faa.atm.tfm.ficommondatatypes.AircraftCategoryType;
import us.gov.dot.faa.atm.tfm.ficommondatatypes.UserCategoryType;
import us.gov.dot.faa.atm.tfm.ficommondatatypes.WeightClassType;


/**
 * Applicable filter conditions for the designated route segment. At least one is required, but any number may exist.
 * 
 * <p>Java class for filterConditionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="filterConditionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="notFromFilter">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="128"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="notToFilter">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="128"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="throughFilter">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="128"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="airwayFilter">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="128"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="useFixFilter">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="128"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="aircraftTypeFilter">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="64"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="lowFltLevelFilter">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="600"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="highFltLevelFilter">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="600"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="aircraftCategoryFilter">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="category" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}aircraftCategoryType" maxOccurs="3"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="weightClassFilter">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="weightClass" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}weightClassType" maxOccurs="3"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="userCatFilter">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="userCategory" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}userCategoryType" maxOccurs="5"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="rvsmFilter">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="ALL"/>
 *               &lt;enumeration value="COMPLIANT"/>
 *               &lt;enumeration value="NON-COMPLIANT"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="timeFilter">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="timeTypeFilter">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="DEP"/>
 *                         &lt;enumeration value="ARR"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="startTimeFilter" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="endTimeFilter" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
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
@XmlType(name = "filterConditionsType", propOrder = {
    "notFromFilterOrNotToFilterOrThroughFilter"
})
public class FilterConditionsType {

    @XmlElementRefs({
        @XmlElementRef(name = "weightClassFilter", namespace = "urn:us:gov:dot:faa:atm:tfm:ficommonmessages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "aircraftTypeFilter", namespace = "urn:us:gov:dot:faa:atm:tfm:ficommonmessages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "userCatFilter", namespace = "urn:us:gov:dot:faa:atm:tfm:ficommonmessages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "airwayFilter", namespace = "urn:us:gov:dot:faa:atm:tfm:ficommonmessages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "throughFilter", namespace = "urn:us:gov:dot:faa:atm:tfm:ficommonmessages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "useFixFilter", namespace = "urn:us:gov:dot:faa:atm:tfm:ficommonmessages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "highFltLevelFilter", namespace = "urn:us:gov:dot:faa:atm:tfm:ficommonmessages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "notToFilter", namespace = "urn:us:gov:dot:faa:atm:tfm:ficommonmessages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "lowFltLevelFilter", namespace = "urn:us:gov:dot:faa:atm:tfm:ficommonmessages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "rvsmFilter", namespace = "urn:us:gov:dot:faa:atm:tfm:ficommonmessages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "aircraftCategoryFilter", namespace = "urn:us:gov:dot:faa:atm:tfm:ficommonmessages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "notFromFilter", namespace = "urn:us:gov:dot:faa:atm:tfm:ficommonmessages", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "timeFilter", namespace = "urn:us:gov:dot:faa:atm:tfm:ficommonmessages", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> notFromFilterOrNotToFilterOrThroughFilter;

    /**
     * Gets the value of the notFromFilterOrNotToFilterOrThroughFilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notFromFilterOrNotToFilterOrThroughFilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotFromFilterOrNotToFilterOrThroughFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link FilterConditionsType.WeightClassFilter }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link FilterConditionsType.UserCatFilter }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link FilterConditionsType.AircraftCategoryFilter }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link FilterConditionsType.TimeFilter }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getNotFromFilterOrNotToFilterOrThroughFilter() {
        if (notFromFilterOrNotToFilterOrThroughFilter == null) {
            notFromFilterOrNotToFilterOrThroughFilter = new ArrayList<JAXBElement<?>>();
        }
        return this.notFromFilterOrNotToFilterOrThroughFilter;
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
     *         &lt;element name="category" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}aircraftCategoryType" maxOccurs="3"/>
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
        "category"
    })
    public static class AircraftCategoryFilter {

        @XmlElement(required = true)
        @XmlSchemaType(name = "string")
        protected List<AircraftCategoryType> category;

        /**
         * Gets the value of the category property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the category property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCategory().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AircraftCategoryType }
         * 
         * 
         */
        public List<AircraftCategoryType> getCategory() {
            if (category == null) {
                category = new ArrayList<AircraftCategoryType>();
            }
            return this.category;
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
     *         &lt;element name="timeTypeFilter">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="DEP"/>
     *               &lt;enumeration value="ARR"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="startTimeFilter" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="endTimeFilter" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
        "timeTypeFilter",
        "startTimeFilter",
        "endTimeFilter"
    })
    public static class TimeFilter {

        @XmlElement(required = true)
        protected String timeTypeFilter;
        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar startTimeFilter;
        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar endTimeFilter;

        /**
         * Gets the value of the timeTypeFilter property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTimeTypeFilter() {
            return timeTypeFilter;
        }

        /**
         * Sets the value of the timeTypeFilter property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTimeTypeFilter(String value) {
            this.timeTypeFilter = value;
        }

        /**
         * Gets the value of the startTimeFilter property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getStartTimeFilter() {
            return startTimeFilter;
        }

        /**
         * Sets the value of the startTimeFilter property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setStartTimeFilter(XMLGregorianCalendar value) {
            this.startTimeFilter = value;
        }

        /**
         * Gets the value of the endTimeFilter property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEndTimeFilter() {
            return endTimeFilter;
        }

        /**
         * Sets the value of the endTimeFilter property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEndTimeFilter(XMLGregorianCalendar value) {
            this.endTimeFilter = value;
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
     *         &lt;element name="userCategory" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}userCategoryType" maxOccurs="5"/>
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
        "userCategory"
    })
    public static class UserCatFilter {

        @XmlElement(required = true)
        @XmlSchemaType(name = "string")
        protected List<UserCategoryType> userCategory;

        /**
         * Gets the value of the userCategory property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the userCategory property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUserCategory().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UserCategoryType }
         * 
         * 
         */
        public List<UserCategoryType> getUserCategory() {
            if (userCategory == null) {
                userCategory = new ArrayList<UserCategoryType>();
            }
            return this.userCategory;
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
     *         &lt;element name="weightClass" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}weightClassType" maxOccurs="3"/>
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
        "weightClass"
    })
    public static class WeightClassFilter {

        @XmlElement(required = true)
        @XmlSchemaType(name = "string")
        protected List<WeightClassType> weightClass;

        /**
         * Gets the value of the weightClass property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the weightClass property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWeightClass().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link WeightClassType }
         * 
         * 
         */
        public List<WeightClassType> getWeightClass() {
            if (weightClass == null) {
                weightClass = new ArrayList<WeightClassType>();
            }
            return this.weightClass;
        }

    }

}