//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package us.gov.dot.faa.atm.tfm.ficommonmessages2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * CTOP rank demotion type.
 * 
 * <p>Java class for rankDemotionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rankDemotionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="CTOP_IDFR" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}idfrType"/>
 *         &lt;element name="CTOP_SHORT_NAME" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages2}ctopTmiShortNameType"/>
 *         &lt;element name="CURRENT_RANK" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}ctopRankType"/>
 *         &lt;element name="NEW_RANK" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}ctopRankType"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rankDemotionType", propOrder = {

})
public class RankDemotionType {

    @XmlElement(name = "CTOP_IDFR", required = true)
    protected String ctopidfr;
    @XmlElement(name = "CTOP_SHORT_NAME", required = true)
    protected String ctopshortname;
    @XmlElement(name = "CURRENT_RANK")
    @XmlSchemaType(name = "integer")
    protected int currentrank;
    @XmlElement(name = "NEW_RANK")
    @XmlSchemaType(name = "integer")
    protected int newrank;

    /**
     * Gets the value of the ctopidfr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTOPIDFR() {
        return ctopidfr;
    }

    /**
     * Sets the value of the ctopidfr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTOPIDFR(String value) {
        this.ctopidfr = value;
    }

    /**
     * Gets the value of the ctopshortname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTOPSHORTNAME() {
        return ctopshortname;
    }

    /**
     * Sets the value of the ctopshortname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTOPSHORTNAME(String value) {
        this.ctopshortname = value;
    }

    /**
     * Gets the value of the currentrank property.
     * 
     */
    public int getCURRENTRANK() {
        return currentrank;
    }

    /**
     * Sets the value of the currentrank property.
     * 
     */
    public void setCURRENTRANK(int value) {
        this.currentrank = value;
    }

    /**
     * Gets the value of the newrank property.
     * 
     */
    public int getNEWRANK() {
        return newrank;
    }

    /**
     * Sets the value of the newrank property.
     * 
     */
    public void setNEWRANK(int value) {
        this.newrank = value;
    }

}
