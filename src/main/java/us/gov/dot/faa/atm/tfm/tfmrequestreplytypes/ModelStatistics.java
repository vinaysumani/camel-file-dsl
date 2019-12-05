//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package us.gov.dot.faa.atm.tfm.tfmrequestreplytypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Model statistics type.
 * 
 * <p>Java class for modelStatistics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="modelStatistics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TOTAL_GROUND_DELAY" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TOTAL_ADDITIONAL_FLY_TIME" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="AVG_GROUND_DELAY" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="AVG_ADDITIONAL_FLY_TIME" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="MAX_GROUND_DELAY" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="MAX_ADDITIONAL_FLY_TIME" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="NUMBER_FLIGHTS_REROUTED" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NUMBER_FLIGHTS_DELAYED" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NUMBER_FLIGHTS_EXEMPT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NUMBER_FLIGHTS_AFFECTED" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NUMBER_FLIGHTS_NOT_PREFERRED_ROUTE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modelStatistics", propOrder = {
    "totalgrounddelay",
    "totaladditionalflytime",
    "avggrounddelay",
    "avgadditionalflytime",
    "maxgrounddelay",
    "maxadditionalflytime",
    "numberflightsrerouted",
    "numberflightsdelayed",
    "numberflightsexempt",
    "numberflightsaffected",
    "numberflightsnotpreferredroute"
})
public class ModelStatistics {

    @XmlElement(name = "TOTAL_GROUND_DELAY")
    protected double totalgrounddelay;
    @XmlElement(name = "TOTAL_ADDITIONAL_FLY_TIME")
    protected double totaladditionalflytime;
    @XmlElement(name = "AVG_GROUND_DELAY")
    protected double avggrounddelay;
    @XmlElement(name = "AVG_ADDITIONAL_FLY_TIME")
    protected double avgadditionalflytime;
    @XmlElement(name = "MAX_GROUND_DELAY")
    protected double maxgrounddelay;
    @XmlElement(name = "MAX_ADDITIONAL_FLY_TIME")
    protected double maxadditionalflytime;
    @XmlElement(name = "NUMBER_FLIGHTS_REROUTED")
    protected int numberflightsrerouted;
    @XmlElement(name = "NUMBER_FLIGHTS_DELAYED")
    protected int numberflightsdelayed;
    @XmlElement(name = "NUMBER_FLIGHTS_EXEMPT")
    protected int numberflightsexempt;
    @XmlElement(name = "NUMBER_FLIGHTS_AFFECTED")
    protected int numberflightsaffected;
    @XmlElement(name = "NUMBER_FLIGHTS_NOT_PREFERRED_ROUTE")
    protected int numberflightsnotpreferredroute;

    /**
     * Gets the value of the totalgrounddelay property.
     * 
     */
    public double getTOTALGROUNDDELAY() {
        return totalgrounddelay;
    }

    /**
     * Sets the value of the totalgrounddelay property.
     * 
     */
    public void setTOTALGROUNDDELAY(double value) {
        this.totalgrounddelay = value;
    }

    /**
     * Gets the value of the totaladditionalflytime property.
     * 
     */
    public double getTOTALADDITIONALFLYTIME() {
        return totaladditionalflytime;
    }

    /**
     * Sets the value of the totaladditionalflytime property.
     * 
     */
    public void setTOTALADDITIONALFLYTIME(double value) {
        this.totaladditionalflytime = value;
    }

    /**
     * Gets the value of the avggrounddelay property.
     * 
     */
    public double getAVGGROUNDDELAY() {
        return avggrounddelay;
    }

    /**
     * Sets the value of the avggrounddelay property.
     * 
     */
    public void setAVGGROUNDDELAY(double value) {
        this.avggrounddelay = value;
    }

    /**
     * Gets the value of the avgadditionalflytime property.
     * 
     */
    public double getAVGADDITIONALFLYTIME() {
        return avgadditionalflytime;
    }

    /**
     * Sets the value of the avgadditionalflytime property.
     * 
     */
    public void setAVGADDITIONALFLYTIME(double value) {
        this.avgadditionalflytime = value;
    }

    /**
     * Gets the value of the maxgrounddelay property.
     * 
     */
    public double getMAXGROUNDDELAY() {
        return maxgrounddelay;
    }

    /**
     * Sets the value of the maxgrounddelay property.
     * 
     */
    public void setMAXGROUNDDELAY(double value) {
        this.maxgrounddelay = value;
    }

    /**
     * Gets the value of the maxadditionalflytime property.
     * 
     */
    public double getMAXADDITIONALFLYTIME() {
        return maxadditionalflytime;
    }

    /**
     * Sets the value of the maxadditionalflytime property.
     * 
     */
    public void setMAXADDITIONALFLYTIME(double value) {
        this.maxadditionalflytime = value;
    }

    /**
     * Gets the value of the numberflightsrerouted property.
     * 
     */
    public int getNUMBERFLIGHTSREROUTED() {
        return numberflightsrerouted;
    }

    /**
     * Sets the value of the numberflightsrerouted property.
     * 
     */
    public void setNUMBERFLIGHTSREROUTED(int value) {
        this.numberflightsrerouted = value;
    }

    /**
     * Gets the value of the numberflightsdelayed property.
     * 
     */
    public int getNUMBERFLIGHTSDELAYED() {
        return numberflightsdelayed;
    }

    /**
     * Sets the value of the numberflightsdelayed property.
     * 
     */
    public void setNUMBERFLIGHTSDELAYED(int value) {
        this.numberflightsdelayed = value;
    }

    /**
     * Gets the value of the numberflightsexempt property.
     * 
     */
    public int getNUMBERFLIGHTSEXEMPT() {
        return numberflightsexempt;
    }

    /**
     * Sets the value of the numberflightsexempt property.
     * 
     */
    public void setNUMBERFLIGHTSEXEMPT(int value) {
        this.numberflightsexempt = value;
    }

    /**
     * Gets the value of the numberflightsaffected property.
     * 
     */
    public int getNUMBERFLIGHTSAFFECTED() {
        return numberflightsaffected;
    }

    /**
     * Sets the value of the numberflightsaffected property.
     * 
     */
    public void setNUMBERFLIGHTSAFFECTED(int value) {
        this.numberflightsaffected = value;
    }

    /**
     * Gets the value of the numberflightsnotpreferredroute property.
     * 
     */
    public int getNUMBERFLIGHTSNOTPREFERREDROUTE() {
        return numberflightsnotpreferredroute;
    }

    /**
     * Sets the value of the numberflightsnotpreferredroute property.
     * 
     */
    public void setNUMBERFLIGHTSNOTPREFERREDROUTE(int value) {
        this.numberflightsnotpreferredroute = value;
    }

}
