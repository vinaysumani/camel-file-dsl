//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package aero.fixm.flight._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import aero.fixm.base._3.FeatureType;
import aero.fixm.base._3.RadioFrequencyType;


/**
 * 
 *             .Last Contact Unit: The last ATS unit which had two-way contact with the aircraft. 
 *             
 *          
 * 
 * <p>Java class for LastContactType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LastContactType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixm.aero/base/3.0}FeatureType">
 *       &lt;sequence>
 *         &lt;element name="contactFrequency" type="{http://www.fixm.aero/base/3.0}RadioFrequencyType" minOccurs="0"/>
 *         &lt;element name="position" type="{http://www.fixm.aero/flight/3.0}LastPositionReportType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="lastContactTime" type="{http://www.fixm.aero/foundation/3.0}TimeType" />
 *       &lt;attribute name="lastContactUnit" type="{http://www.fixm.aero/foundation/3.0}AtcUnitNameType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LastContactType", propOrder = {
    "contactFrequency",
    "position"
})
public class LastContactType
    extends FeatureType
{

    protected RadioFrequencyType contactFrequency;
    protected LastPositionReportType position;
    @XmlAttribute(name = "lastContactTime")
    protected XMLGregorianCalendar lastContactTime;
    @XmlAttribute(name = "lastContactUnit")
    protected String lastContactUnit;

    /**
     * Gets the value of the contactFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link RadioFrequencyType }
     *     
     */
    public RadioFrequencyType getContactFrequency() {
        return contactFrequency;
    }

    /**
     * Sets the value of the contactFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link RadioFrequencyType }
     *     
     */
    public void setContactFrequency(RadioFrequencyType value) {
        this.contactFrequency = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link LastPositionReportType }
     *     
     */
    public LastPositionReportType getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link LastPositionReportType }
     *     
     */
    public void setPosition(LastPositionReportType value) {
        this.position = value;
    }

    /**
     * Gets the value of the lastContactTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastContactTime() {
        return lastContactTime;
    }

    /**
     * Sets the value of the lastContactTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastContactTime(XMLGregorianCalendar value) {
        this.lastContactTime = value;
    }

    /**
     * Gets the value of the lastContactUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastContactUnit() {
        return lastContactUnit;
    }

    /**
     * Sets the value of the lastContactUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastContactUnit(String value) {
        this.lastContactUnit = value;
    }

}