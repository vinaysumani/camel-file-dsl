//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package us.gov.dot.faa.atm.tfm.tfmdatacoreelements;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Complex type for defining a geographical point by using an adapted fix, a radial (angle) of heading from true north (radial of 0 equals true north) and a distance along that heading to the point being described. This type extends the fixName type meaning the data between the opening and closing element tags will contain the fix name, while the radial and distance are defined by required attributes. Example: <frd radial="36" distance="27">ACY</frd> indicates a point defined by starting at the geographical location of fix ACY facing true north, rotating 36 degrees from true north moving a distance 27 nautical miles. Note: frd is a dummy element name which is of type fixRadialDistanceType.
 * 
 * <p>Java class for fixRadialDistanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fixRadialDistanceType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements>fixNameType">
 *       &lt;attribute name="radial" use="required" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}radialDegreesType" />
 *       &lt;attribute name="distance" use="required" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}radialDistanceType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fixRadialDistanceType", propOrder = {
    "value"
})
public class FixRadialDistanceType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "radial", required = true)
    protected int radial;
    @XmlAttribute(name = "distance", required = true)
    protected BigInteger distance;

    /**
     * The sequence of alphanumeric characters, if adapted, identifies a geographic point. A four character fix name must include at least one letter. Example: PHX; TH; F4DOV Note: the restriction of a four character fix name must include at least one letter may be able to be lifted after modernization as the restriction may have been imposed to prevent confusing the data with other data of the same format such as time or a beacon code. This would not be a problem with well-formed tags with descriptive names. e.g. <fix>1100</fix> cannot be confused with any time as modernization uses the xsd:dateTime and xsd:time formats nor could it be confused with <beaconCode>1100</beaconCode>
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the radial property.
     * 
     */
    public int getRadial() {
        return radial;
    }

    /**
     * Sets the value of the radial property.
     * 
     */
    public void setRadial(int value) {
        this.radial = value;
    }

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDistance(BigInteger value) {
        this.distance = value;
    }

}
