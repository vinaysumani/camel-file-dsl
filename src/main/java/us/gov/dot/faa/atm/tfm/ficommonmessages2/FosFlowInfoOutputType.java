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
import us.gov.dot.faa.atm.tfm.ficommonmessages.CtopTrajAssignType;
import us.gov.dot.faa.atm.tfm.ficommonmessages.TosType;
import us.gov.dot.faa.atm.tfm.tfmdatacoreelements.QualifiedAircraftIdType;


/**
 *  Messages sent to the FOS from TFMS along with additional information needed by the portal
 * 
 * <p>Java class for fosFlowInfoOutputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fosFlowInfoOutputType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="TRAJ_ASSIGN_BROADCAST" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}ctopTrajAssignType"/>
 *         &lt;element name="CTOP_FP_AMEND">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="UNIQUE_FLT_ID_DATA" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}qualifiedAircraftIdType"/>
 *                   &lt;element name="TOS_SEQ_NO" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}tosSeqNbrType" minOccurs="0"/>
 *                   &lt;element name="ROUTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CTOP_NAME" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}ctopNameType"/>
 *                   &lt;element name="CTOP_SHORT_NAME" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}ctopTmiIdType"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TOS_MESSAGE" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}tosType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fosFlowInfoOutputType", propOrder = {
    "trajassignbroadcast",
    "ctopfpamend",
    "tosmessage"
})
public class FosFlowInfoOutputType {

    @XmlElement(name = "TRAJ_ASSIGN_BROADCAST")
    protected CtopTrajAssignType trajassignbroadcast;
    @XmlElement(name = "CTOP_FP_AMEND")
    protected FosFlowInfoOutputType.CTOPFPAMEND ctopfpamend;
    @XmlElement(name = "TOS_MESSAGE")
    protected TosType tosmessage;

    /**
     * Gets the value of the trajassignbroadcast property.
     * 
     * @return
     *     possible object is
     *     {@link CtopTrajAssignType }
     *     
     */
    public CtopTrajAssignType getTRAJASSIGNBROADCAST() {
        return trajassignbroadcast;
    }

    /**
     * Sets the value of the trajassignbroadcast property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtopTrajAssignType }
     *     
     */
    public void setTRAJASSIGNBROADCAST(CtopTrajAssignType value) {
        this.trajassignbroadcast = value;
    }

    /**
     * Gets the value of the ctopfpamend property.
     * 
     * @return
     *     possible object is
     *     {@link FosFlowInfoOutputType.CTOPFPAMEND }
     *     
     */
    public FosFlowInfoOutputType.CTOPFPAMEND getCTOPFPAMEND() {
        return ctopfpamend;
    }

    /**
     * Sets the value of the ctopfpamend property.
     * 
     * @param value
     *     allowed object is
     *     {@link FosFlowInfoOutputType.CTOPFPAMEND }
     *     
     */
    public void setCTOPFPAMEND(FosFlowInfoOutputType.CTOPFPAMEND value) {
        this.ctopfpamend = value;
    }

    /**
     * Gets the value of the tosmessage property.
     * 
     * @return
     *     possible object is
     *     {@link TosType }
     *     
     */
    public TosType getTOSMESSAGE() {
        return tosmessage;
    }

    /**
     * Sets the value of the tosmessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link TosType }
     *     
     */
    public void setTOSMESSAGE(TosType value) {
        this.tosmessage = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;all>
     *         &lt;element name="UNIQUE_FLT_ID_DATA" type="{urn:us:gov:dot:faa:atm:tfm:tfmdatacoreelements}qualifiedAircraftIdType"/>
     *         &lt;element name="TOS_SEQ_NO" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}tosSeqNbrType" minOccurs="0"/>
     *         &lt;element name="ROUTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CTOP_NAME" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}ctopNameType"/>
     *         &lt;element name="CTOP_SHORT_NAME" type="{urn:us:gov:dot:faa:atm:tfm:ficommonmessages}ctopTmiIdType"/>
     *       &lt;/all>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class CTOPFPAMEND {

        @XmlElement(name = "UNIQUE_FLT_ID_DATA", required = true)
        protected QualifiedAircraftIdType uniquefltiddata;
        @XmlElement(name = "TOS_SEQ_NO")
        @XmlSchemaType(name = "integer")
        protected Integer tosseqno;
        @XmlElement(name = "ROUTE")
        protected String route;
        @XmlElement(name = "CTOP_NAME", required = true)
        protected String ctopname;
        @XmlElement(name = "CTOP_SHORT_NAME", required = true)
        protected String ctopshortname;

        /**
         * Gets the value of the uniquefltiddata property.
         * 
         * @return
         *     possible object is
         *     {@link QualifiedAircraftIdType }
         *     
         */
        public QualifiedAircraftIdType getUNIQUEFLTIDDATA() {
            return uniquefltiddata;
        }

        /**
         * Sets the value of the uniquefltiddata property.
         * 
         * @param value
         *     allowed object is
         *     {@link QualifiedAircraftIdType }
         *     
         */
        public void setUNIQUEFLTIDDATA(QualifiedAircraftIdType value) {
            this.uniquefltiddata = value;
        }

        /**
         * Gets the value of the tosseqno property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getTOSSEQNO() {
            return tosseqno;
        }

        /**
         * Sets the value of the tosseqno property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setTOSSEQNO(Integer value) {
            this.tosseqno = value;
        }

        /**
         * Gets the value of the route property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getROUTE() {
            return route;
        }

        /**
         * Sets the value of the route property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setROUTE(String value) {
            this.route = value;
        }

        /**
         * Gets the value of the ctopname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCTOPNAME() {
            return ctopname;
        }

        /**
         * Sets the value of the ctopname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCTOPNAME(String value) {
            this.ctopname = value;
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

    }

}
