//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package us.gov.dot.faa.atm.tfm.tfmrequestreplytypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Wrapper type for ALL incoming EDCT Commands and Reports
 * 
 * <p>Java class for edctCommandRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="edctCommandRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="adaptiveCompression" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}edctAcCommandType"/>
 *         &lt;element name="bridging" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}edctBridgingToggleCommandType"/>
 *         &lt;element name="check" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}edctCheckCommandType"/>
 *         &lt;element name="hold" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}edctHoldCommandType"/>
 *         &lt;element name="list" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}edctListCommandType"/>
 *         &lt;element name="log" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}edctLogCommandType"/>
 *         &lt;element name="purge" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}edctPurgeCommandType"/>
 *         &lt;element name="release" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}edctReleaseCommandType"/>
 *         &lt;element name="remove" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}edctRemoveRestoreCommandType"/>
 *         &lt;element name="restore" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}edctRemoveRestoreCommandType"/>
 *         &lt;element name="scsToggle" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}edctScsToggleCommandType"/>
 *         &lt;element name="show" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}edctShowCommandType"/>
 *         &lt;element name="subShow" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}edctSubShowCommandType"/>
 *         &lt;element name="subToggle" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}edctSubToggleCommandType"/>
 *         &lt;element name="slist" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}edctSlistCommandType"/>
 *         &lt;element name="update" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}edctUpdateCommandType"/>
 *         &lt;element name="unassignedSlots" type="{urn:us:gov:dot:faa:atm:tfm:tfmrequestreplytypes}edctUnassignedSlotsCommandType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "edctCommandRequestType", propOrder = {
    "adaptiveCompression",
    "bridging",
    "check",
    "hold",
    "list",
    "log",
    "purge",
    "release",
    "remove",
    "restore",
    "scsToggle",
    "show",
    "subShow",
    "subToggle",
    "slist",
    "update",
    "unassignedSlots"
})
public class EdctCommandRequestType {

    protected EdctAcCommandType adaptiveCompression;
    protected EdctBridgingToggleCommandType bridging;
    protected EdctCheckCommandType check;
    protected EdctHoldCommandType hold;
    protected EdctListCommandType list;
    protected EdctLogCommandType log;
    protected EdctPurgeCommandType purge;
    protected EdctReleaseCommandType release;
    protected EdctRemoveRestoreCommandType remove;
    protected EdctRemoveRestoreCommandType restore;
    protected EdctScsToggleCommandType scsToggle;
    protected EdctShowCommandType show;
    protected EdctSubShowCommandType subShow;
    protected EdctSubToggleCommandType subToggle;
    protected EdctSlistCommandType slist;
    protected EdctUpdateCommandType update;
    protected EdctUnassignedSlotsCommandType unassignedSlots;

    /**
     * Gets the value of the adaptiveCompression property.
     * 
     * @return
     *     possible object is
     *     {@link EdctAcCommandType }
     *     
     */
    public EdctAcCommandType getAdaptiveCompression() {
        return adaptiveCompression;
    }

    /**
     * Sets the value of the adaptiveCompression property.
     * 
     * @param value
     *     allowed object is
     *     {@link EdctAcCommandType }
     *     
     */
    public void setAdaptiveCompression(EdctAcCommandType value) {
        this.adaptiveCompression = value;
    }

    /**
     * Gets the value of the bridging property.
     * 
     * @return
     *     possible object is
     *     {@link EdctBridgingToggleCommandType }
     *     
     */
    public EdctBridgingToggleCommandType getBridging() {
        return bridging;
    }

    /**
     * Sets the value of the bridging property.
     * 
     * @param value
     *     allowed object is
     *     {@link EdctBridgingToggleCommandType }
     *     
     */
    public void setBridging(EdctBridgingToggleCommandType value) {
        this.bridging = value;
    }

    /**
     * Gets the value of the check property.
     * 
     * @return
     *     possible object is
     *     {@link EdctCheckCommandType }
     *     
     */
    public EdctCheckCommandType getCheck() {
        return check;
    }

    /**
     * Sets the value of the check property.
     * 
     * @param value
     *     allowed object is
     *     {@link EdctCheckCommandType }
     *     
     */
    public void setCheck(EdctCheckCommandType value) {
        this.check = value;
    }

    /**
     * Gets the value of the hold property.
     * 
     * @return
     *     possible object is
     *     {@link EdctHoldCommandType }
     *     
     */
    public EdctHoldCommandType getHold() {
        return hold;
    }

    /**
     * Sets the value of the hold property.
     * 
     * @param value
     *     allowed object is
     *     {@link EdctHoldCommandType }
     *     
     */
    public void setHold(EdctHoldCommandType value) {
        this.hold = value;
    }

    /**
     * Gets the value of the list property.
     * 
     * @return
     *     possible object is
     *     {@link EdctListCommandType }
     *     
     */
    public EdctListCommandType getList() {
        return list;
    }

    /**
     * Sets the value of the list property.
     * 
     * @param value
     *     allowed object is
     *     {@link EdctListCommandType }
     *     
     */
    public void setList(EdctListCommandType value) {
        this.list = value;
    }

    /**
     * Gets the value of the log property.
     * 
     * @return
     *     possible object is
     *     {@link EdctLogCommandType }
     *     
     */
    public EdctLogCommandType getLog() {
        return log;
    }

    /**
     * Sets the value of the log property.
     * 
     * @param value
     *     allowed object is
     *     {@link EdctLogCommandType }
     *     
     */
    public void setLog(EdctLogCommandType value) {
        this.log = value;
    }

    /**
     * Gets the value of the purge property.
     * 
     * @return
     *     possible object is
     *     {@link EdctPurgeCommandType }
     *     
     */
    public EdctPurgeCommandType getPurge() {
        return purge;
    }

    /**
     * Sets the value of the purge property.
     * 
     * @param value
     *     allowed object is
     *     {@link EdctPurgeCommandType }
     *     
     */
    public void setPurge(EdctPurgeCommandType value) {
        this.purge = value;
    }

    /**
     * Gets the value of the release property.
     * 
     * @return
     *     possible object is
     *     {@link EdctReleaseCommandType }
     *     
     */
    public EdctReleaseCommandType getRelease() {
        return release;
    }

    /**
     * Sets the value of the release property.
     * 
     * @param value
     *     allowed object is
     *     {@link EdctReleaseCommandType }
     *     
     */
    public void setRelease(EdctReleaseCommandType value) {
        this.release = value;
    }

    /**
     * Gets the value of the remove property.
     * 
     * @return
     *     possible object is
     *     {@link EdctRemoveRestoreCommandType }
     *     
     */
    public EdctRemoveRestoreCommandType getRemove() {
        return remove;
    }

    /**
     * Sets the value of the remove property.
     * 
     * @param value
     *     allowed object is
     *     {@link EdctRemoveRestoreCommandType }
     *     
     */
    public void setRemove(EdctRemoveRestoreCommandType value) {
        this.remove = value;
    }

    /**
     * Gets the value of the restore property.
     * 
     * @return
     *     possible object is
     *     {@link EdctRemoveRestoreCommandType }
     *     
     */
    public EdctRemoveRestoreCommandType getRestore() {
        return restore;
    }

    /**
     * Sets the value of the restore property.
     * 
     * @param value
     *     allowed object is
     *     {@link EdctRemoveRestoreCommandType }
     *     
     */
    public void setRestore(EdctRemoveRestoreCommandType value) {
        this.restore = value;
    }

    /**
     * Gets the value of the scsToggle property.
     * 
     * @return
     *     possible object is
     *     {@link EdctScsToggleCommandType }
     *     
     */
    public EdctScsToggleCommandType getScsToggle() {
        return scsToggle;
    }

    /**
     * Sets the value of the scsToggle property.
     * 
     * @param value
     *     allowed object is
     *     {@link EdctScsToggleCommandType }
     *     
     */
    public void setScsToggle(EdctScsToggleCommandType value) {
        this.scsToggle = value;
    }

    /**
     * Gets the value of the show property.
     * 
     * @return
     *     possible object is
     *     {@link EdctShowCommandType }
     *     
     */
    public EdctShowCommandType getShow() {
        return show;
    }

    /**
     * Sets the value of the show property.
     * 
     * @param value
     *     allowed object is
     *     {@link EdctShowCommandType }
     *     
     */
    public void setShow(EdctShowCommandType value) {
        this.show = value;
    }

    /**
     * Gets the value of the subShow property.
     * 
     * @return
     *     possible object is
     *     {@link EdctSubShowCommandType }
     *     
     */
    public EdctSubShowCommandType getSubShow() {
        return subShow;
    }

    /**
     * Sets the value of the subShow property.
     * 
     * @param value
     *     allowed object is
     *     {@link EdctSubShowCommandType }
     *     
     */
    public void setSubShow(EdctSubShowCommandType value) {
        this.subShow = value;
    }

    /**
     * Gets the value of the subToggle property.
     * 
     * @return
     *     possible object is
     *     {@link EdctSubToggleCommandType }
     *     
     */
    public EdctSubToggleCommandType getSubToggle() {
        return subToggle;
    }

    /**
     * Sets the value of the subToggle property.
     * 
     * @param value
     *     allowed object is
     *     {@link EdctSubToggleCommandType }
     *     
     */
    public void setSubToggle(EdctSubToggleCommandType value) {
        this.subToggle = value;
    }

    /**
     * Gets the value of the slist property.
     * 
     * @return
     *     possible object is
     *     {@link EdctSlistCommandType }
     *     
     */
    public EdctSlistCommandType getSlist() {
        return slist;
    }

    /**
     * Sets the value of the slist property.
     * 
     * @param value
     *     allowed object is
     *     {@link EdctSlistCommandType }
     *     
     */
    public void setSlist(EdctSlistCommandType value) {
        this.slist = value;
    }

    /**
     * Gets the value of the update property.
     * 
     * @return
     *     possible object is
     *     {@link EdctUpdateCommandType }
     *     
     */
    public EdctUpdateCommandType getUpdate() {
        return update;
    }

    /**
     * Sets the value of the update property.
     * 
     * @param value
     *     allowed object is
     *     {@link EdctUpdateCommandType }
     *     
     */
    public void setUpdate(EdctUpdateCommandType value) {
        this.update = value;
    }

    /**
     * Gets the value of the unassignedSlots property.
     * 
     * @return
     *     possible object is
     *     {@link EdctUnassignedSlotsCommandType }
     *     
     */
    public EdctUnassignedSlotsCommandType getUnassignedSlots() {
        return unassignedSlots;
    }

    /**
     * Sets the value of the unassignedSlots property.
     * 
     * @param value
     *     allowed object is
     *     {@link EdctUnassignedSlotsCommandType }
     *     
     */
    public void setUnassignedSlots(EdctUnassignedSlotsCommandType value) {
        this.unassignedSlots = value;
    }

}