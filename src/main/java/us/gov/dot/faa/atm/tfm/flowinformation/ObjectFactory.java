//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package us.gov.dot.faa.atm.tfm.flowinformation;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the us.gov.dot.faa.atm.tfm.flowinformation package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: us.gov.dot.faa.atm.tfm.flowinformation
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FiOutputType }
     * 
     */
    public FiOutputType createFiOutputType() {
        return new FiOutputType();
    }

    /**
     * Create an instance of {@link FiOutputType.FiMessage }
     * 
     */
    public FiOutputType.FiMessage createFiOutputTypeFiMessage() {
        return new FiOutputType.FiMessage();
    }

    /**
     * Create an instance of {@link FiOutputType.FiMessage.CdmUpdateData }
     * 
     */
    public FiOutputType.FiMessage.CdmUpdateData createFiOutputTypeFiMessageCdmUpdateData() {
        return new FiOutputType.FiMessage.CdmUpdateData();
    }

    /**
     * Create an instance of {@link FiMessageAttributes }
     * 
     */
    public FiMessageAttributes createFiMessageAttributes() {
        return new FiMessageAttributes();
    }

    /**
     * Create an instance of {@link FiOutputType.FiMessage.TmiFlightDataList }
     * 
     */
    public FiOutputType.FiMessage.TmiFlightDataList createFiOutputTypeFiMessageTmiFlightDataList() {
        return new FiOutputType.FiMessage.TmiFlightDataList();
    }

    /**
     * Create an instance of {@link FiOutputType.FiMessage.CdmUpdateData.FlightIdChange }
     * 
     */
    public FiOutputType.FiMessage.CdmUpdateData.FlightIdChange createFiOutputTypeFiMessageCdmUpdateDataFlightIdChange() {
        return new FiOutputType.FiMessage.CdmUpdateData.FlightIdChange();
    }

    /**
     * Create an instance of {@link FiOutputType.FiMessage.CdmUpdateData.BridgingStatus }
     * 
     */
    public FiOutputType.FiMessage.CdmUpdateData.BridgingStatus createFiOutputTypeFiMessageCdmUpdateDataBridgingStatus() {
        return new FiOutputType.FiMessage.CdmUpdateData.BridgingStatus();
    }

}
