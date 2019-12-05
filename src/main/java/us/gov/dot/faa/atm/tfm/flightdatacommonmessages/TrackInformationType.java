//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package us.gov.dot.faa.atm.tfm.flightdatacommonmessages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import us.gov.dot.faa.atm.tfm.tfmdatacoreelements.FlightAltitudeType;
import us.gov.dot.faa.atm.tfm.tfmdatacoreelements.LatlongType;
import us.gov.dot.faa.atm.tfm.tfmdatacoreelements.QualifiedAircraftIdType;


/**
 * Track Information is used to provide TFMM with selected current track and full data block information.
 * 
 * <p>Java class for trackInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="trackInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="qualifiedAircraftId" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}qualifiedAircraftIdType"/>
 *         &lt;element name="speed" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}groundSpeedType"/>
 *         &lt;element name="reportedAltitude" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}flightAltitudeType"/>
 *         &lt;element name="position" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}latlongType"/>
 *         &lt;element name="timeAtPosition" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;choice>
 *           &lt;element name="ncsmTrackData" type="{urn:us:gov:dot:faa:atm:tfm:flightdatacommonmessages}ncsmTrackDataType"/>
 *           &lt;element name="ncsmRouteData" type="{urn:us:gov:dot:faa:atm:tfm:flightdatacommonmessages}ncsmFlightRouteDataType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trackInformationType", propOrder = {
    "qualifiedAircraftId",
    "speed",
    "reportedAltitude",
    "position",
    "timeAtPosition",
    "ncsmTrackData",
    "ncsmRouteData"
})
public class TrackInformationType {

    @XmlElement(required = true)
    protected QualifiedAircraftIdType qualifiedAircraftId;
    @XmlSchemaType(name = "integer")
    protected int speed;
    @XmlElement(required = true)
    protected FlightAltitudeType reportedAltitude;
    @XmlElement(required = true)
    protected LatlongType position;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeAtPosition;
    protected NcsmTrackDataType ncsmTrackData;
    protected NcsmFlightRouteDataType ncsmRouteData;

    /**
     * Gets the value of the qualifiedAircraftId property.
     * 
     * @return
     *     possible object is
     *     {@link QualifiedAircraftIdType }
     *     
     */
    public QualifiedAircraftIdType getQualifiedAircraftId() {
        return qualifiedAircraftId;
    }

    /**
     * Sets the value of the qualifiedAircraftId property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualifiedAircraftIdType }
     *     
     */
    public void setQualifiedAircraftId(QualifiedAircraftIdType value) {
        this.qualifiedAircraftId = value;
    }

    /**
     * Gets the value of the speed property.
     * 
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     */
    public void setSpeed(int value) {
        this.speed = value;
    }

    /**
     * Gets the value of the reportedAltitude property.
     * 
     * @return
     *     possible object is
     *     {@link FlightAltitudeType }
     *     
     */
    public FlightAltitudeType getReportedAltitude() {
        return reportedAltitude;
    }

    /**
     * Sets the value of the reportedAltitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightAltitudeType }
     *     
     */
    public void setReportedAltitude(FlightAltitudeType value) {
        this.reportedAltitude = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link LatlongType }
     *     
     */
    public LatlongType getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link LatlongType }
     *     
     */
    public void setPosition(LatlongType value) {
        this.position = value;
    }

    /**
     * Gets the value of the timeAtPosition property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeAtPosition() {
        return timeAtPosition;
    }

    /**
     * Sets the value of the timeAtPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeAtPosition(XMLGregorianCalendar value) {
        this.timeAtPosition = value;
    }

    /**
     * Gets the value of the ncsmTrackData property.
     * 
     * @return
     *     possible object is
     *     {@link NcsmTrackDataType }
     *     
     */
    public NcsmTrackDataType getNcsmTrackData() {
        return ncsmTrackData;
    }

    /**
     * Sets the value of the ncsmTrackData property.
     * 
     * @param value
     *     allowed object is
     *     {@link NcsmTrackDataType }
     *     
     */
    public void setNcsmTrackData(NcsmTrackDataType value) {
        this.ncsmTrackData = value;
    }

    /**
     * Gets the value of the ncsmRouteData property.
     * 
     * @return
     *     possible object is
     *     {@link NcsmFlightRouteDataType }
     *     
     */
    public NcsmFlightRouteDataType getNcsmRouteData() {
        return ncsmRouteData;
    }

    /**
     * Sets the value of the ncsmRouteData property.
     * 
     * @param value
     *     allowed object is
     *     {@link NcsmFlightRouteDataType }
     *     
     */
    public void setNcsmRouteData(NcsmFlightRouteDataType value) {
        this.ncsmRouteData = value;
    }

}
