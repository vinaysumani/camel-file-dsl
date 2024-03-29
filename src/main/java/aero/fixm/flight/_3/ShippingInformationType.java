//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package aero.fixm.flight._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;
import aero.fixm.base._3.AerodromeReferenceType;


/**
 * 
 *             IATA Shipper's Declaration for Dangerous Goods. 
 *          
 * 
 * <p>Java class for ShippingInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aerodromeOfLoading" type="{http://www.fixm.aero/base/3.0}AerodromeReferenceType" minOccurs="0"/>
 *         &lt;element name="aerodromeOfUnloading" type="{http://www.fixm.aero/base/3.0}AerodromeReferenceType" minOccurs="0"/>
 *         &lt;element name="consignee" type="{http://www.fixm.aero/flight/3.0}StructuredPostalAddressType" minOccurs="0"/>
 *         &lt;element name="declarationText" type="{http://www.fixm.aero/flight/3.0}DeclarationTextType" minOccurs="0"/>
 *         &lt;element name="shipper" type="{http://www.fixm.aero/flight/3.0}StructuredPostalAddressType" minOccurs="0"/>
 *         &lt;element name="transferAerodromes" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;list itemType="{http://www.fixm.aero/foundation/3.0}AerodromeIcaoCodeType" />
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="dangerousGoodsScreeningLocation" type="{http://www.fixm.aero/base/3.0}FreeTextType" />
 *       &lt;attribute name="departureCountry" type="{http://www.fixm.aero/foundation/3.0}TextCountryNameType" />
 *       &lt;attribute name="destinationCountry" type="{http://www.fixm.aero/foundation/3.0}TextCountryNameType" />
 *       &lt;attribute name="originCountry" type="{http://www.fixm.aero/foundation/3.0}TextCountryNameType" />
 *       &lt;attribute name="shipmentAuthorizations" type="{http://www.fixm.aero/base/3.0}FreeTextType" />
 *       &lt;attribute name="subsidiaryHazardClassAndDivision" type="{http://www.fixm.aero/base/3.0}FreeTextType" />
 *       &lt;attribute name="supplementaryInformation" type="{http://www.fixm.aero/base/3.0}FreeTextType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippingInformationType", propOrder = {
    "aerodromeOfLoading",
    "aerodromeOfUnloading",
    "consignee",
    "declarationText",
    "shipper",
    "transferAerodromes"
})
public class ShippingInformationType {

    protected AerodromeReferenceType aerodromeOfLoading;
    protected AerodromeReferenceType aerodromeOfUnloading;
    protected StructuredPostalAddressType consignee;
    protected DeclarationTextType declarationText;
    protected StructuredPostalAddressType shipper;
    @XmlList
    protected List<String> transferAerodromes;
    @XmlAttribute(name = "dangerousGoodsScreeningLocation")
    protected String dangerousGoodsScreeningLocation;
    @XmlAttribute(name = "departureCountry")
    protected String departureCountry;
    @XmlAttribute(name = "destinationCountry")
    protected String destinationCountry;
    @XmlAttribute(name = "originCountry")
    protected String originCountry;
    @XmlAttribute(name = "shipmentAuthorizations")
    protected String shipmentAuthorizations;
    @XmlAttribute(name = "subsidiaryHazardClassAndDivision")
    protected String subsidiaryHazardClassAndDivision;
    @XmlAttribute(name = "supplementaryInformation")
    protected String supplementaryInformation;

    /**
     * Gets the value of the aerodromeOfLoading property.
     * 
     * @return
     *     possible object is
     *     {@link AerodromeReferenceType }
     *     
     */
    public AerodromeReferenceType getAerodromeOfLoading() {
        return aerodromeOfLoading;
    }

    /**
     * Sets the value of the aerodromeOfLoading property.
     * 
     * @param value
     *     allowed object is
     *     {@link AerodromeReferenceType }
     *     
     */
    public void setAerodromeOfLoading(AerodromeReferenceType value) {
        this.aerodromeOfLoading = value;
    }

    /**
     * Gets the value of the aerodromeOfUnloading property.
     * 
     * @return
     *     possible object is
     *     {@link AerodromeReferenceType }
     *     
     */
    public AerodromeReferenceType getAerodromeOfUnloading() {
        return aerodromeOfUnloading;
    }

    /**
     * Sets the value of the aerodromeOfUnloading property.
     * 
     * @param value
     *     allowed object is
     *     {@link AerodromeReferenceType }
     *     
     */
    public void setAerodromeOfUnloading(AerodromeReferenceType value) {
        this.aerodromeOfUnloading = value;
    }

    /**
     * Gets the value of the consignee property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredPostalAddressType }
     *     
     */
    public StructuredPostalAddressType getConsignee() {
        return consignee;
    }

    /**
     * Sets the value of the consignee property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredPostalAddressType }
     *     
     */
    public void setConsignee(StructuredPostalAddressType value) {
        this.consignee = value;
    }

    /**
     * Gets the value of the declarationText property.
     * 
     * @return
     *     possible object is
     *     {@link DeclarationTextType }
     *     
     */
    public DeclarationTextType getDeclarationText() {
        return declarationText;
    }

    /**
     * Sets the value of the declarationText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarationTextType }
     *     
     */
    public void setDeclarationText(DeclarationTextType value) {
        this.declarationText = value;
    }

    /**
     * Gets the value of the shipper property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredPostalAddressType }
     *     
     */
    public StructuredPostalAddressType getShipper() {
        return shipper;
    }

    /**
     * Sets the value of the shipper property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredPostalAddressType }
     *     
     */
    public void setShipper(StructuredPostalAddressType value) {
        this.shipper = value;
    }

    /**
     * Gets the value of the transferAerodromes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transferAerodromes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransferAerodromes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTransferAerodromes() {
        if (transferAerodromes == null) {
            transferAerodromes = new ArrayList<String>();
        }
        return this.transferAerodromes;
    }

    /**
     * Gets the value of the dangerousGoodsScreeningLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDangerousGoodsScreeningLocation() {
        return dangerousGoodsScreeningLocation;
    }

    /**
     * Sets the value of the dangerousGoodsScreeningLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDangerousGoodsScreeningLocation(String value) {
        this.dangerousGoodsScreeningLocation = value;
    }

    /**
     * Gets the value of the departureCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureCountry() {
        return departureCountry;
    }

    /**
     * Sets the value of the departureCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureCountry(String value) {
        this.departureCountry = value;
    }

    /**
     * Gets the value of the destinationCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationCountry() {
        return destinationCountry;
    }

    /**
     * Sets the value of the destinationCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationCountry(String value) {
        this.destinationCountry = value;
    }

    /**
     * Gets the value of the originCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginCountry() {
        return originCountry;
    }

    /**
     * Sets the value of the originCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginCountry(String value) {
        this.originCountry = value;
    }

    /**
     * Gets the value of the shipmentAuthorizations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentAuthorizations() {
        return shipmentAuthorizations;
    }

    /**
     * Sets the value of the shipmentAuthorizations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentAuthorizations(String value) {
        this.shipmentAuthorizations = value;
    }

    /**
     * Gets the value of the subsidiaryHazardClassAndDivision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubsidiaryHazardClassAndDivision() {
        return subsidiaryHazardClassAndDivision;
    }

    /**
     * Sets the value of the subsidiaryHazardClassAndDivision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsidiaryHazardClassAndDivision(String value) {
        this.subsidiaryHazardClassAndDivision = value;
    }

    /**
     * Gets the value of the supplementaryInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplementaryInformation() {
        return supplementaryInformation;
    }

    /**
     * Sets the value of the supplementaryInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplementaryInformation(String value) {
        this.supplementaryInformation = value;
    }

}
