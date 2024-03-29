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
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;


/**
 * Data associated with CTOP exemption criteria
 * 
 * <p>Java class for ctopExemptCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ctopExemptCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="active">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="international">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}boolean">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="acidAny" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;list itemType="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}aircraftIdType" />
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="arrivesAny" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="arrivesAnyArpt" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="([A-Z0-9]{3,5} )*([A-Z0-9]{3,5})"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="arrivesAnyArtcc" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="([A-Z0-9]{3,4} )*([A-Z0-9]{3,4})"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="departsAny" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="departsAnyArpt" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="([A-Z0-9]{3,5} )*([A-Z0-9]{3,5})"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="departsAnyArtcc" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="([A-Z0-9]{3,4} )*([A-Z0-9]{3,4})"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="exemptByTime" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
@XmlType(name = "ctopExemptCriteriaType", propOrder = {

})
public class CtopExemptCriteriaType {

    protected boolean active;
    protected boolean international;
    @XmlList
    protected List<String> acidAny;
    protected CtopExemptCriteriaType.ArrivesAny arrivesAny;
    protected CtopExemptCriteriaType.DepartsAny departsAny;
    protected Integer exemptByTime;

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
     * Gets the value of the international property.
     * 
     */
    public boolean isInternational() {
        return international;
    }

    /**
     * Sets the value of the international property.
     * 
     */
    public void setInternational(boolean value) {
        this.international = value;
    }

    /**
     * Gets the value of the acidAny property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acidAny property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcidAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAcidAny() {
        if (acidAny == null) {
            acidAny = new ArrayList<String>();
        }
        return this.acidAny;
    }

    /**
     * Gets the value of the arrivesAny property.
     * 
     * @return
     *     possible object is
     *     {@link CtopExemptCriteriaType.ArrivesAny }
     *     
     */
    public CtopExemptCriteriaType.ArrivesAny getArrivesAny() {
        return arrivesAny;
    }

    /**
     * Sets the value of the arrivesAny property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtopExemptCriteriaType.ArrivesAny }
     *     
     */
    public void setArrivesAny(CtopExemptCriteriaType.ArrivesAny value) {
        this.arrivesAny = value;
    }

    /**
     * Gets the value of the departsAny property.
     * 
     * @return
     *     possible object is
     *     {@link CtopExemptCriteriaType.DepartsAny }
     *     
     */
    public CtopExemptCriteriaType.DepartsAny getDepartsAny() {
        return departsAny;
    }

    /**
     * Sets the value of the departsAny property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtopExemptCriteriaType.DepartsAny }
     *     
     */
    public void setDepartsAny(CtopExemptCriteriaType.DepartsAny value) {
        this.departsAny = value;
    }

    /**
     * Gets the value of the exemptByTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExemptByTime() {
        return exemptByTime;
    }

    /**
     * Sets the value of the exemptByTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExemptByTime(Integer value) {
        this.exemptByTime = value;
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
     *         &lt;element name="arrivesAnyArpt" maxOccurs="unbounded" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;pattern value="([A-Z0-9]{3,5} )*([A-Z0-9]{3,5})"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="arrivesAnyArtcc" maxOccurs="unbounded" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;pattern value="([A-Z0-9]{3,4} )*([A-Z0-9]{3,4})"/>
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
        "arrivesAnyArpt",
        "arrivesAnyArtcc"
    })
    public static class ArrivesAny {

        protected List<String> arrivesAnyArpt;
        protected List<String> arrivesAnyArtcc;

        /**
         * Gets the value of the arrivesAnyArpt property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the arrivesAnyArpt property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getArrivesAnyArpt().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getArrivesAnyArpt() {
            if (arrivesAnyArpt == null) {
                arrivesAnyArpt = new ArrayList<String>();
            }
            return this.arrivesAnyArpt;
        }

        /**
         * Gets the value of the arrivesAnyArtcc property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the arrivesAnyArtcc property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getArrivesAnyArtcc().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getArrivesAnyArtcc() {
            if (arrivesAnyArtcc == null) {
                arrivesAnyArtcc = new ArrayList<String>();
            }
            return this.arrivesAnyArtcc;
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
     *         &lt;element name="departsAnyArpt" maxOccurs="unbounded" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;pattern value="([A-Z0-9]{3,5} )*([A-Z0-9]{3,5})"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="departsAnyArtcc" maxOccurs="unbounded" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;pattern value="([A-Z0-9]{3,4} )*([A-Z0-9]{3,4})"/>
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
        "departsAnyArpt",
        "departsAnyArtcc"
    })
    public static class DepartsAny {

        protected List<String> departsAnyArpt;
        protected List<String> departsAnyArtcc;

        /**
         * Gets the value of the departsAnyArpt property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the departsAnyArpt property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDepartsAnyArpt().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getDepartsAnyArpt() {
            if (departsAnyArpt == null) {
                departsAnyArpt = new ArrayList<String>();
            }
            return this.departsAnyArpt;
        }

        /**
         * Gets the value of the departsAnyArtcc property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the departsAnyArtcc property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDepartsAnyArtcc().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getDepartsAnyArtcc() {
            if (departsAnyArtcc == null) {
                departsAnyArtcc = new ArrayList<String>();
            }
            return this.departsAnyArtcc;
        }

    }

}
