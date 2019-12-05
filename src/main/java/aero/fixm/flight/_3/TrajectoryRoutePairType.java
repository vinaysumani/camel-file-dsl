//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package aero.fixm.flight._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Groups and associates a Route and 4D Trajectory. 
 *          
 * 
 * <p>Java class for TrajectoryRoutePairType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrajectoryRoutePairType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="route" type="{http://www.fixm.aero/flight/3.0}RouteType" minOccurs="0"/>
 *         &lt;element name="trajectory" type="{http://www.fixm.aero/flight/3.0}TrajectoryType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrajectoryRoutePairType", propOrder = {
    "route",
    "trajectory"
})
public class TrajectoryRoutePairType {

    protected RouteType route;
    protected TrajectoryType trajectory;

    /**
     * Gets the value of the route property.
     * 
     * @return
     *     possible object is
     *     {@link RouteType }
     *     
     */
    public RouteType getRoute() {
        return route;
    }

    /**
     * Sets the value of the route property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteType }
     *     
     */
    public void setRoute(RouteType value) {
        this.route = value;
    }

    /**
     * Gets the value of the trajectory property.
     * 
     * @return
     *     possible object is
     *     {@link TrajectoryType }
     *     
     */
    public TrajectoryType getTrajectory() {
        return trajectory;
    }

    /**
     * Sets the value of the trajectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrajectoryType }
     *     
     */
    public void setTrajectory(TrajectoryType value) {
        this.trajectory = value;
    }

}