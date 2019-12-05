//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package us.gov.dot.faa.atm.tfm.tfmdatacoreelements;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Defines estimated arrival time of a flight giving the date, time, and the ETA type.
 * 
 * <p>Java class for etaFlightTimeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="etaFlightTimeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="timeValue" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="etaType" use="required" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}etaTimeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "etaFlightTimeType")
public class EtaFlightTimeType {

    @XmlAttribute(name = "timeValue", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeValue;
    @XmlAttribute(name = "etaType", required = true)
    protected EtaTimeType etaType;

    /**
     * Gets the value of the timeValue property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeValue() {
        return timeValue;
    }

    /**
     * Sets the value of the timeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeValue(XMLGregorianCalendar value) {
        this.timeValue = value;
    }

    /**
     * Gets the value of the etaType property.
     * 
     * @return
     *     possible object is
     *     {@link EtaTimeType }
     *     
     */
    public EtaTimeType getEtaType() {
        return etaType;
    }

    /**
     * Sets the value of the etaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EtaTimeType }
     *     
     */
    public void setEtaType(EtaTimeType value) {
        this.etaType = value;
    }

}
