//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package us.gov.dot.faa.atm.tfm.flightdata;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for messageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="messageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="flightPlanAmendmentInformation"/>
 *     &lt;enumeration value="arrivalInformation"/>
 *     &lt;enumeration value="departureInformation"/>
 *     &lt;enumeration value="flightPlanInformation"/>
 *     &lt;enumeration value="flightPlanCancellation"/>
 *     &lt;enumeration value="boundaryCrossingUpdate"/>
 *     &lt;enumeration value="trackInformation"/>
 *     &lt;enumeration value="oceanicReport"/>
 *     &lt;enumeration value="beaconCodeInformation"/>
 *     &lt;enumeration value="FlightCreate"/>
 *     &lt;enumeration value="FlightModify"/>
 *     &lt;enumeration value="FlightControl"/>
 *     &lt;enumeration value="FlightScheduleActivate"/>
 *     &lt;enumeration value="FlightRoute"/>
 *     &lt;enumeration value="FlightSectors"/>
 *     &lt;enumeration value="FlightTimes"/>
 *     &lt;enumeration value="routeApproval"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "messageType")
@XmlEnum
public enum MessageType {


    /**
     * Amendment
     * 
     */
    @XmlEnumValue("flightPlanAmendmentInformation")
    FLIGHT_PLAN_AMENDMENT_INFORMATION("flightPlanAmendmentInformation"),

    /**
     * Arrival
     * 
     */
    @XmlEnumValue("arrivalInformation")
    ARRIVAL_INFORMATION("arrivalInformation"),

    /**
     * Departure
     * 
     */
    @XmlEnumValue("departureInformation")
    DEPARTURE_INFORMATION("departureInformation"),

    /**
     * Flight Plan
     * 
     */
    @XmlEnumValue("flightPlanInformation")
    FLIGHT_PLAN_INFORMATION("flightPlanInformation"),

    /**
     * Cancellation
     * 
     */
    @XmlEnumValue("flightPlanCancellation")
    FLIGHT_PLAN_CANCELLATION("flightPlanCancellation"),

    /**
     * Update
     * 
     */
    @XmlEnumValue("boundaryCrossingUpdate")
    BOUNDARY_CROSSING_UPDATE("boundaryCrossingUpdate"),

    /**
     *  5 minute location update
     * 
     */
    @XmlEnumValue("trackInformation")
    TRACK_INFORMATION("trackInformation"),

    /**
     * Oceanic Update
     * 
     */
    @XmlEnumValue("oceanicReport")
    OCEANIC_REPORT("oceanicReport"),

    /**
     * Beacon Code messages
     * 
     */
    @XmlEnumValue("beaconCodeInformation")
    BEACON_CODE_INFORMATION("beaconCodeInformation"),

    /**
     * Flight Create messages
     * 
     */
    @XmlEnumValue("FlightCreate")
    FLIGHT_CREATE("FlightCreate"),

    /**
     * Flight Modify messages
     * 
     */
    @XmlEnumValue("FlightModify")
    FLIGHT_MODIFY("FlightModify"),

    /**
     * Flight Contro Data messages
     * 
     */
    @XmlEnumValue("FlightControl")
    FLIGHT_CONTROL("FlightControl"),

    /**
     * Flight schedule activation  messages
     * 
     */
    @XmlEnumValue("FlightScheduleActivate")
    FLIGHT_SCHEDULE_ACTIVATE("FlightScheduleActivate"),

    /**
     * Flight Route Data messages
     * 
     */
    @XmlEnumValue("FlightRoute")
    FLIGHT_ROUTE("FlightRoute"),

    /**
     * Flight Sector Data messages
     * 
     */
    @XmlEnumValue("FlightSectors")
    FLIGHT_SECTORS("FlightSectors"),

    /**
     * Flight Times data messages
     * 
     */
    @XmlEnumValue("FlightTimes")
    FLIGHT_TIMES("FlightTimes"),
    @XmlEnumValue("routeApproval")
    ROUTE_APPROVAL("routeApproval");
    private final String value;

    MessageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MessageType fromValue(String v) {
        for (MessageType c: MessageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
