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
import javax.xml.bind.annotation.XmlType;


/**
 * Defines fields necessary for a parameters delete request.
 * 
 * <p>Java class for paramDeleteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paramDeleteType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="elemName" type="{urn:us:gov:dot:faa:atm:tfm:ficommondatatypes}controlElementNameType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paramDeleteType", propOrder = {
    "elemName"
})
public class ParamDeleteType {

    @XmlElement(required = true)
    protected String elemName;

    /**
     * Gets the value of the elemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElemName() {
        return elemName;
    }

    /**
     * Sets the value of the elemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElemName(String value) {
        this.elemName = value;
    }

}
