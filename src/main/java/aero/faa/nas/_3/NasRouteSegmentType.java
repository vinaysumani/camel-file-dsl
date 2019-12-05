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
import aero.fixm.flight._3.RouteSegmentType;


/**
 * 
 *             Extends the core ICAO flight segment information to add NAS extensions: 
 *                    1. planned delay at fix,
 *                    2. number of planned re-entries into the segment, 
 *                    3. number of special re-entries into the segment.
 *          
 * 
 * <p>Java class for NasRouteSegmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NasRouteSegmentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixm.aero/flight/3.0}RouteSegmentType">
 *       &lt;attribute name="reEntryCount" type="{http://www.fixm.aero/base/3.0}CountType" />
 *       &lt;attribute name="reEntrySpecial" type="{http://www.fixm.aero/base/3.0}CountType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NasRouteSegmentType")
public class NasRouteSegmentType
    extends RouteSegmentType
{

    @XmlAttribute(name = "reEntryCount")
    protected Integer reEntryCount;
    @XmlAttribute(name = "reEntrySpecial")
    protected Integer reEntrySpecial;

    /**
     * Gets the value of the reEntryCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReEntryCount() {
        return reEntryCount;
    }

    /**
     * Sets the value of the reEntryCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReEntryCount(Integer value) {
        this.reEntryCount = value;
    }

    /**
     * Gets the value of the reEntrySpecial property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReEntrySpecial() {
        return reEntrySpecial;
    }

    /**
     * Sets the value of the reEntrySpecial property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReEntrySpecial(Integer value) {
        this.reEntrySpecial = value;
    }

}