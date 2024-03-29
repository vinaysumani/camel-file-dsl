//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package aero.faa.nas._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             .Flight Intent: A container for the list of intent values provided by the flight 
 *             operator that designate the intentions of a flight prior to departure from an aerodrome 
 *             or after arrival at an aerodrome. 
 *          
 * 
 * <p>Java class for FlightIntentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightIntentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arrival" type="{http://www.faa.aero/nas/3.1}ArrivalMovementAreaHoldInformationType" minOccurs="0"/>
 *         &lt;element name="deicing" type="{http://www.faa.aero/nas/3.1}DeicingInformationType" minOccurs="0"/>
 *         &lt;element name="departure" type="{http://www.faa.aero/nas/3.1}DepartureMovementAreaHoldInformationType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="intendedArrivalSpot" type="{http://www.fixm.aero/base/3.0}FreeTextType" />
 *       &lt;attribute name="intendedDepartureSpot" type="{http://www.fixm.aero/base/3.0}FreeTextType" />
 *       &lt;attribute name="standReturnIntent" type="{http://www.faa.aero/nas/3.1}StandReturnIntentType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightIntentType", propOrder = {
    "arrival",
    "deicing",
    "departure"
})
public class FlightIntentType {

    protected ArrivalMovementAreaHoldInformationType arrival;
    protected DeicingInformationType deicing;
    protected DepartureMovementAreaHoldInformationType departure;
    @XmlAttribute(name = "intendedArrivalSpot")
    protected String intendedArrivalSpot;
    @XmlAttribute(name = "intendedDepartureSpot")
    protected String intendedDepartureSpot;
    @XmlAttribute(name = "standReturnIntent")
    protected StandReturnIntentType standReturnIntent;

    /**
     * Gets the value of the arrival property.
     * 
     * @return
     *     possible object is
     *     {@link ArrivalMovementAreaHoldInformationType }
     *     
     */
    public ArrivalMovementAreaHoldInformationType getArrival() {
        return arrival;
    }

    /**
     * Sets the value of the arrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrivalMovementAreaHoldInformationType }
     *     
     */
    public void setArrival(ArrivalMovementAreaHoldInformationType value) {
        this.arrival = value;
    }

    /**
     * Gets the value of the deicing property.
     * 
     * @return
     *     possible object is
     *     {@link DeicingInformationType }
     *     
     */
    public DeicingInformationType getDeicing() {
        return deicing;
    }

    /**
     * Sets the value of the deicing property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeicingInformationType }
     *     
     */
    public void setDeicing(DeicingInformationType value) {
        this.deicing = value;
    }

    /**
     * Gets the value of the departure property.
     * 
     * @return
     *     possible object is
     *     {@link DepartureMovementAreaHoldInformationType }
     *     
     */
    public DepartureMovementAreaHoldInformationType getDeparture() {
        return departure;
    }

    /**
     * Sets the value of the departure property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartureMovementAreaHoldInformationType }
     *     
     */
    public void setDeparture(DepartureMovementAreaHoldInformationType value) {
        this.departure = value;
    }

    /**
     * Gets the value of the intendedArrivalSpot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntendedArrivalSpot() {
        return intendedArrivalSpot;
    }

    /**
     * Sets the value of the intendedArrivalSpot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntendedArrivalSpot(String value) {
        this.intendedArrivalSpot = value;
    }

    /**
     * Gets the value of the intendedDepartureSpot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntendedDepartureSpot() {
        return intendedDepartureSpot;
    }

    /**
     * Sets the value of the intendedDepartureSpot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntendedDepartureSpot(String value) {
        this.intendedDepartureSpot = value;
    }

    /**
     * Gets the value of the standReturnIntent property.
     * 
     * @return
     *     possible object is
     *     {@link StandReturnIntentType }
     *     
     */
    public StandReturnIntentType getStandReturnIntent() {
        return standReturnIntent;
    }

    /**
     * Sets the value of the standReturnIntent property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandReturnIntentType }
     *     
     */
    public void setStandReturnIntent(StandReturnIntentType value) {
        this.standReturnIntent = value;
    }

}
