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
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;
import us.gov.dot.faa.atm.tfm.ficommondatatypes.DateTimeRangeType;


/**
 * <p>Java class for primaryAllFcaFilterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="primaryAllFcaFilterType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}primaryAnyFcaFilterType">
 *       &lt;sequence>
 *         &lt;element name="flightLevel" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[0-9]?[0-9]?[0-9]\s[0-9]?[0-9]?[0-9]"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="aircraftCategoryAny" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction>
 *               &lt;simpleType>
 *                 &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/simpleType>
 *               &lt;pattern value="[JPT ]{1,6}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="weightClassAny" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction>
 *               &lt;simpleType>
 *                 &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/simpleType>
 *               &lt;pattern value="[HLS ]{1,6}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="userCategoryAny" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction>
 *               &lt;simpleType>
 *                 &lt;list itemType="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/simpleType>
 *               &lt;pattern value="[TFCGM ]{1,10}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="status" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="ACTIVE"/>
 *               &lt;enumeration value="PROPOSED"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RVSM" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="COMPLIANT"/>
 *               &lt;enumeration value="NON-COMPLIANT"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="departureTimeRange" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}dateTimeRangeType"/>
 *           &lt;element name="arrivalTimeRange" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}dateTimeRangeType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "primaryAllFcaFilterType", propOrder = {
    "flightLevel",
    "aircraftCategoryAny",
    "weightClassAny",
    "userCategoryAny",
    "status",
    "rvsm",
    "departureTimeRange",
    "arrivalTimeRange"
})
public class PrimaryAllFcaFilterType
    extends PrimaryAnyFcaFilterType
{

    protected String flightLevel;
    @XmlList
    protected List<String> aircraftCategoryAny;
    @XmlList
    protected List<String> weightClassAny;
    @XmlList
    protected List<String> userCategoryAny;
    protected String status;
    @XmlElement(name = "RVSM")
    protected String rvsm;
    protected DateTimeRangeType departureTimeRange;
    protected DateTimeRangeType arrivalTimeRange;

    /**
     * Gets the value of the flightLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightLevel() {
        return flightLevel;
    }

    /**
     * Sets the value of the flightLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightLevel(String value) {
        this.flightLevel = value;
    }

    /**
     * Gets the value of the aircraftCategoryAny property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aircraftCategoryAny property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAircraftCategoryAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAircraftCategoryAny() {
        if (aircraftCategoryAny == null) {
            aircraftCategoryAny = new ArrayList<String>();
        }
        return this.aircraftCategoryAny;
    }

    /**
     * Gets the value of the weightClassAny property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weightClassAny property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeightClassAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getWeightClassAny() {
        if (weightClassAny == null) {
            weightClassAny = new ArrayList<String>();
        }
        return this.weightClassAny;
    }

    /**
     * Gets the value of the userCategoryAny property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userCategoryAny property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserCategoryAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUserCategoryAny() {
        if (userCategoryAny == null) {
            userCategoryAny = new ArrayList<String>();
        }
        return this.userCategoryAny;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the rvsm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRVSM() {
        return rvsm;
    }

    /**
     * Sets the value of the rvsm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRVSM(String value) {
        this.rvsm = value;
    }

    /**
     * Gets the value of the departureTimeRange property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeRangeType }
     *     
     */
    public DateTimeRangeType getDepartureTimeRange() {
        return departureTimeRange;
    }

    /**
     * Sets the value of the departureTimeRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeRangeType }
     *     
     */
    public void setDepartureTimeRange(DateTimeRangeType value) {
        this.departureTimeRange = value;
    }

    /**
     * Gets the value of the arrivalTimeRange property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeRangeType }
     *     
     */
    public DateTimeRangeType getArrivalTimeRange() {
        return arrivalTimeRange;
    }

    /**
     * Sets the value of the arrivalTimeRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeRangeType }
     *     
     */
    public void setArrivalTimeRange(DateTimeRangeType value) {
        this.arrivalTimeRange = value;
    }

}