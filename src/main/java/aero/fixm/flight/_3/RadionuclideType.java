//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package aero.fixm.flight._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             .Radionuclide: The XML sub-grouping element for Radioactive Materials. 
 *          
 * 
 * <p>Java class for RadionuclideType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RadionuclideType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="activity" type="{http://www.fixm.aero/flight/3.0}RadioactiveMaterialActivityType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="lowDispersibleMaterialIndicator" type="{http://www.fixm.aero/flight/3.0}MaterialDispersabilityType" />
 *       &lt;attribute name="physicalChemicalForm" type="{http://www.fixm.aero/base/3.0}FreeTextType" />
 *       &lt;attribute name="radionuclideId">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.fixm.aero/base/3.0}FreeTextType">
 *             &lt;pattern value="(UN)|(ID)|(NA)?\d{4}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="radionuclideName" type="{http://www.fixm.aero/base/3.0}FreeTextType" />
 *       &lt;attribute name="specialFormIndicator" type="{http://www.fixm.aero/flight/3.0}SpecialFormType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RadionuclideType", propOrder = {
    "activity"
})
public class RadionuclideType {

    protected RadioactiveMaterialActivityType activity;
    @XmlAttribute(name = "lowDispersibleMaterialIndicator")
    protected MaterialDispersabilityType lowDispersibleMaterialIndicator;
    @XmlAttribute(name = "physicalChemicalForm")
    protected String physicalChemicalForm;
    @XmlAttribute(name = "radionuclideId")
    protected String radionuclideId;
    @XmlAttribute(name = "radionuclideName")
    protected String radionuclideName;
    @XmlAttribute(name = "specialFormIndicator")
    protected SpecialFormType specialFormIndicator;

    /**
     * Gets the value of the activity property.
     * 
     * @return
     *     possible object is
     *     {@link RadioactiveMaterialActivityType }
     *     
     */
    public RadioactiveMaterialActivityType getActivity() {
        return activity;
    }

    /**
     * Sets the value of the activity property.
     * 
     * @param value
     *     allowed object is
     *     {@link RadioactiveMaterialActivityType }
     *     
     */
    public void setActivity(RadioactiveMaterialActivityType value) {
        this.activity = value;
    }

    /**
     * Gets the value of the lowDispersibleMaterialIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link MaterialDispersabilityType }
     *     
     */
    public MaterialDispersabilityType getLowDispersibleMaterialIndicator() {
        return lowDispersibleMaterialIndicator;
    }

    /**
     * Sets the value of the lowDispersibleMaterialIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaterialDispersabilityType }
     *     
     */
    public void setLowDispersibleMaterialIndicator(MaterialDispersabilityType value) {
        this.lowDispersibleMaterialIndicator = value;
    }

    /**
     * Gets the value of the physicalChemicalForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalChemicalForm() {
        return physicalChemicalForm;
    }

    /**
     * Sets the value of the physicalChemicalForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicalChemicalForm(String value) {
        this.physicalChemicalForm = value;
    }

    /**
     * Gets the value of the radionuclideId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadionuclideId() {
        return radionuclideId;
    }

    /**
     * Sets the value of the radionuclideId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadionuclideId(String value) {
        this.radionuclideId = value;
    }

    /**
     * Gets the value of the radionuclideName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadionuclideName() {
        return radionuclideName;
    }

    /**
     * Sets the value of the radionuclideName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadionuclideName(String value) {
        this.radionuclideName = value;
    }

    /**
     * Gets the value of the specialFormIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialFormType }
     *     
     */
    public SpecialFormType getSpecialFormIndicator() {
        return specialFormIndicator;
    }

    /**
     * Sets the value of the specialFormIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialFormType }
     *     
     */
    public void setSpecialFormIndicator(SpecialFormType value) {
        this.specialFormIndicator = value;
    }

}
