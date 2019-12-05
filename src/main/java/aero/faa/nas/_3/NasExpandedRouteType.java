//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package aero.faa.nas._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import aero.fixm.flight._3.ExpandedRouteType;


/**
 * 
 *             Extends Expanded Route with a Route Impact List 
 *              
 *             .Route Impact List: Current traffic flow management prediction of en route Air Traffic 
 *             Control units (centres), sectors and airspace elements along the trajectory of a 
 *             flight. 
 *          
 * 
 * <p>Java class for NasExpandedRouteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NasExpandedRouteType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixm.aero/flight/3.0}ExpandedRouteType">
 *       &lt;sequence>
 *         &lt;element name="routeImpactList" type="{http://www.faa.aero/nas/3.1}RouteImpactListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NasExpandedRouteType", propOrder = {
    "routeImpactList"
})
public class NasExpandedRouteType
    extends ExpandedRouteType
{

    protected RouteImpactListType routeImpactList;

    /**
     * Gets the value of the routeImpactList property.
     * 
     * @return
     *     possible object is
     *     {@link RouteImpactListType }
     *     
     */
    public RouteImpactListType getRouteImpactList() {
        return routeImpactList;
    }

    /**
     * Sets the value of the routeImpactList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteImpactListType }
     *     
     */
    public void setRouteImpactList(RouteImpactListType value) {
        this.routeImpactList = value;
    }

}
