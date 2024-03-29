//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.05 at 01:45:39 PM IST 
//


package aero.fixm.base._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the aero.fixm.base._3 package. 
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

    private final static QName _OfftrackDistance_QNAME = new QName("http://www.fixm.aero/base/3.0", "OfftrackDistance");
    private final static QName _UnknownUnitReference_QNAME = new QName("http://www.fixm.aero/base/3.0", "UnknownUnitReference");
    private final static QName _IcaoAerodromeReference_QNAME = new QName("http://www.fixm.aero/base/3.0", "IcaoAerodromeReference");
    private final static QName _VerticalRange_QNAME = new QName("http://www.fixm.aero/base/3.0", "VerticalRange");
    private final static QName _AerodromeReference_QNAME = new QName("http://www.fixm.aero/base/3.0", "AerodromeReference");
    private final static QName _GroundspeedRange_QNAME = new QName("http://www.fixm.aero/base/3.0", "GroundspeedRange");
    private final static QName _UnlistedAerodromeReference_QNAME = new QName("http://www.fixm.aero/base/3.0", "UnlistedAerodromeReference");
    private final static QName _RelativePoint_QNAME = new QName("http://www.fixm.aero/base/3.0", "RelativePoint");
    private final static QName _Extension_QNAME = new QName("http://www.fixm.aero/base/3.0", "Extension");
    private final static QName _FixPoint_QNAME = new QName("http://www.fixm.aero/base/3.0", "FixPoint");
    private final static QName _LateralOfftrack_QNAME = new QName("http://www.fixm.aero/base/3.0", "LateralOfftrack");
    private final static QName _AtcUnitReference_QNAME = new QName("http://www.fixm.aero/base/3.0", "AtcUnitReference");
    private final static QName _NameValuePair_QNAME = new QName("http://www.fixm.aero/base/3.0", "NameValuePair");
    private final static QName _ReportedTime_QNAME = new QName("http://www.fixm.aero/base/3.0", "ReportedTime");
    private final static QName _GroundspeedChoice_QNAME = new QName("http://www.fixm.aero/base/3.0", "GroundspeedChoice");
    private final static QName _IdentifiedUnitReference_QNAME = new QName("http://www.fixm.aero/base/3.0", "IdentifiedUnitReference");
    private final static QName _MultiTime_QNAME = new QName("http://www.fixm.aero/base/3.0", "MultiTime");
    private final static QName _SignificantPoint_QNAME = new QName("http://www.fixm.aero/base/3.0", "SignificantPoint");
    private final static QName _Feature_QNAME = new QName("http://www.fixm.aero/base/3.0", "Feature");
    private final static QName _LocationPoint_QNAME = new QName("http://www.fixm.aero/base/3.0", "LocationPoint");
    private final static QName _AirspeedRange_QNAME = new QName("http://www.fixm.aero/base/3.0", "AirspeedRange");
    private final static QName _NameValueList_QNAME = new QName("http://www.fixm.aero/base/3.0", "NameValueList");
    private final static QName _StandPositionAndTime_QNAME = new QName("http://www.fixm.aero/base/3.0", "StandPositionAndTime");
    private final static QName _TargetMultiTime_QNAME = new QName("http://www.fixm.aero/base/3.0", "TargetMultiTime");
    private final static QName _RunwayPositionAndTime_QNAME = new QName("http://www.fixm.aero/base/3.0", "RunwayPositionAndTime");
    private final static QName _AirspeedChoice_QNAME = new QName("http://www.fixm.aero/base/3.0", "AirspeedChoice");
    private final static QName _ExtendedMultiTime_QNAME = new QName("http://www.fixm.aero/base/3.0", "ExtendedMultiTime");
    private final static QName _AltitudeChoice_QNAME = new QName("http://www.fixm.aero/base/3.0", "AltitudeChoice");
    private final static QName _TimeSequence_QNAME = new QName("http://www.fixm.aero/base/3.0", "TimeSequence");
    private final static QName _ExtendedMultiTimeTypeControlled_QNAME = new QName("", "controlled");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: aero.fixm.base._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MultiTimeType }
     * 
     */
    public MultiTimeType createMultiTimeType() {
        return new MultiTimeType();
    }

    /**
     * Create an instance of {@link LocationPointType }
     * 
     */
    public LocationPointType createLocationPointType() {
        return new LocationPointType();
    }

    /**
     * Create an instance of {@link AirspeedRangeType }
     * 
     */
    public AirspeedRangeType createAirspeedRangeType() {
        return new AirspeedRangeType();
    }

    /**
     * Create an instance of {@link RelativePointType }
     * 
     */
    public RelativePointType createRelativePointType() {
        return new RelativePointType();
    }

    /**
     * Create an instance of {@link GroundspeedRangeType }
     * 
     */
    public GroundspeedRangeType createGroundspeedRangeType() {
        return new GroundspeedRangeType();
    }

    /**
     * Create an instance of {@link OfftrackDistanceType }
     * 
     */
    public OfftrackDistanceType createOfftrackDistanceType() {
        return new OfftrackDistanceType();
    }

    /**
     * Create an instance of {@link UnlistedAerodromeReferenceType }
     * 
     */
    public UnlistedAerodromeReferenceType createUnlistedAerodromeReferenceType() {
        return new UnlistedAerodromeReferenceType();
    }

    /**
     * Create an instance of {@link IdentifiedUnitReferenceType }
     * 
     */
    public IdentifiedUnitReferenceType createIdentifiedUnitReferenceType() {
        return new IdentifiedUnitReferenceType();
    }

    /**
     * Create an instance of {@link AirspeedChoiceType }
     * 
     */
    public AirspeedChoiceType createAirspeedChoiceType() {
        return new AirspeedChoiceType();
    }

    /**
     * Create an instance of {@link VerticalRangeType }
     * 
     */
    public VerticalRangeType createVerticalRangeType() {
        return new VerticalRangeType();
    }

    /**
     * Create an instance of {@link NameValuePairType }
     * 
     */
    public NameValuePairType createNameValuePairType() {
        return new NameValuePairType();
    }

    /**
     * Create an instance of {@link NameValueListType }
     * 
     */
    public NameValueListType createNameValueListType() {
        return new NameValueListType();
    }

    /**
     * Create an instance of {@link StandPositionAndTimeType }
     * 
     */
    public StandPositionAndTimeType createStandPositionAndTimeType() {
        return new StandPositionAndTimeType();
    }

    /**
     * Create an instance of {@link TargetMultiTimeType }
     * 
     */
    public TargetMultiTimeType createTargetMultiTimeType() {
        return new TargetMultiTimeType();
    }

    /**
     * Create an instance of {@link RunwayPositionAndTimeType }
     * 
     */
    public RunwayPositionAndTimeType createRunwayPositionAndTimeType() {
        return new RunwayPositionAndTimeType();
    }

    /**
     * Create an instance of {@link TimeSequenceType }
     * 
     */
    public TimeSequenceType createTimeSequenceType() {
        return new TimeSequenceType();
    }

    /**
     * Create an instance of {@link GroundspeedChoiceType }
     * 
     */
    public GroundspeedChoiceType createGroundspeedChoiceType() {
        return new GroundspeedChoiceType();
    }

    /**
     * Create an instance of {@link ReportedTimeType }
     * 
     */
    public ReportedTimeType createReportedTimeType() {
        return new ReportedTimeType();
    }

    /**
     * Create an instance of {@link ExtensionType }
     * 
     */
    public ExtensionType createExtensionType() {
        return new ExtensionType();
    }

    /**
     * Create an instance of {@link UnknownUnitReferenceType }
     * 
     */
    public UnknownUnitReferenceType createUnknownUnitReferenceType() {
        return new UnknownUnitReferenceType();
    }

    /**
     * Create an instance of {@link IcaoAerodromeReferenceType }
     * 
     */
    public IcaoAerodromeReferenceType createIcaoAerodromeReferenceType() {
        return new IcaoAerodromeReferenceType();
    }

    /**
     * Create an instance of {@link LateralOfftrackType }
     * 
     */
    public LateralOfftrackType createLateralOfftrackType() {
        return new LateralOfftrackType();
    }

    /**
     * Create an instance of {@link FixPointType }
     * 
     */
    public FixPointType createFixPointType() {
        return new FixPointType();
    }

    /**
     * Create an instance of {@link AltitudeChoiceType }
     * 
     */
    public AltitudeChoiceType createAltitudeChoiceType() {
        return new AltitudeChoiceType();
    }

    /**
     * Create an instance of {@link ExtendedMultiTimeType }
     * 
     */
    public ExtendedMultiTimeType createExtendedMultiTimeType() {
        return new ExtendedMultiTimeType();
    }

    /**
     * Create an instance of {@link RadioFrequencyType }
     * 
     */
    public RadioFrequencyType createRadioFrequencyType() {
        return new RadioFrequencyType();
    }

    /**
     * Create an instance of {@link SpeedType }
     * 
     */
    public SpeedType createSpeedType() {
        return new SpeedType();
    }

    /**
     * Create an instance of {@link DirectionType }
     * 
     */
    public DirectionType createDirectionType() {
        return new DirectionType();
    }

    /**
     * Create an instance of {@link BeaconCodeType }
     * 
     */
    public BeaconCodeType createBeaconCodeType() {
        return new BeaconCodeType();
    }

    /**
     * Create an instance of {@link GloballyUniqueFlightIdentifierType }
     * 
     */
    public GloballyUniqueFlightIdentifierType createGloballyUniqueFlightIdentifierType() {
        return new GloballyUniqueFlightIdentifierType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OfftrackDistanceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fixm.aero/base/3.0", name = "OfftrackDistance")
    public JAXBElement<OfftrackDistanceType> createOfftrackDistance(OfftrackDistanceType value) {
        return new JAXBElement<OfftrackDistanceType>(_OfftrackDistance_QNAME, OfftrackDistanceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnknownUnitReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fixm.aero/base/3.0", name = "UnknownUnitReference", substitutionHeadNamespace = "http://www.fixm.aero/base/3.0", substitutionHeadName = "AtcUnitReference")
    public JAXBElement<UnknownUnitReferenceType> createUnknownUnitReference(UnknownUnitReferenceType value) {
        return new JAXBElement<UnknownUnitReferenceType>(_UnknownUnitReference_QNAME, UnknownUnitReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IcaoAerodromeReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fixm.aero/base/3.0", name = "IcaoAerodromeReference", substitutionHeadNamespace = "http://www.fixm.aero/base/3.0", substitutionHeadName = "AerodromeReference")
    public JAXBElement<IcaoAerodromeReferenceType> createIcaoAerodromeReference(IcaoAerodromeReferenceType value) {
        return new JAXBElement<IcaoAerodromeReferenceType>(_IcaoAerodromeReference_QNAME, IcaoAerodromeReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerticalRangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fixm.aero/base/3.0", name = "VerticalRange")
    public JAXBElement<VerticalRangeType> createVerticalRange(VerticalRangeType value) {
        return new JAXBElement<VerticalRangeType>(_VerticalRange_QNAME, VerticalRangeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AerodromeReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fixm.aero/base/3.0", name = "AerodromeReference")
    public JAXBElement<AerodromeReferenceType> createAerodromeReference(AerodromeReferenceType value) {
        return new JAXBElement<AerodromeReferenceType>(_AerodromeReference_QNAME, AerodromeReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroundspeedRangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fixm.aero/base/3.0", name = "GroundspeedRange")
    public JAXBElement<GroundspeedRangeType> createGroundspeedRange(GroundspeedRangeType value) {
        return new JAXBElement<GroundspeedRangeType>(_GroundspeedRange_QNAME, GroundspeedRangeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnlistedAerodromeReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fixm.aero/base/3.0", name = "UnlistedAerodromeReference", substitutionHeadNamespace = "http://www.fixm.aero/base/3.0", substitutionHeadName = "AerodromeReference")
    public JAXBElement<UnlistedAerodromeReferenceType> createUnlistedAerodromeReference(UnlistedAerodromeReferenceType value) {
        return new JAXBElement<UnlistedAerodromeReferenceType>(_UnlistedAerodromeReference_QNAME, UnlistedAerodromeReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelativePointType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fixm.aero/base/3.0", name = "RelativePoint", substitutionHeadNamespace = "http://www.fixm.aero/base/3.0", substitutionHeadName = "SignificantPoint")
    public JAXBElement<RelativePointType> createRelativePoint(RelativePointType value) {
        return new JAXBElement<RelativePointType>(_RelativePoint_QNAME, RelativePointType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtensionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fixm.aero/base/3.0", name = "Extension", substitutionHeadNamespace = "http://www.fixm.aero/base/3.0", substitutionHeadName = "Feature")
    public JAXBElement<ExtensionType> createExtension(ExtensionType value) {
        return new JAXBElement<ExtensionType>(_Extension_QNAME, ExtensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FixPointType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fixm.aero/base/3.0", name = "FixPoint", substitutionHeadNamespace = "http://www.fixm.aero/base/3.0", substitutionHeadName = "SignificantPoint")
    public JAXBElement<FixPointType> createFixPoint(FixPointType value) {
        return new JAXBElement<FixPointType>(_FixPoint_QNAME, FixPointType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LateralOfftrackType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fixm.aero/base/3.0", name = "LateralOfftrack")
    public JAXBElement<LateralOfftrackType> createLateralOfftrack(LateralOfftrackType value) {
        return new JAXBElement<LateralOfftrackType>(_LateralOfftrack_QNAME, LateralOfftrackType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AtcUnitReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fixm.aero/base/3.0", name = "AtcUnitReference")
    public JAXBElement<AtcUnitReferenceType> createAtcUnitReference(AtcUnitReferenceType value) {
        return new JAXBElement<AtcUnitReferenceType>(_AtcUnitReference_QNAME, AtcUnitReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameValuePairType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fixm.aero/base/3.0", name = "NameValuePair")
    public JAXBElement<NameValuePairType> createNameValuePair(NameValuePairType value) {
        return new JAXBElement<NameValuePairType>(_NameValuePair_QNAME, NameValuePairType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportedTimeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fixm.aero/base/3.0", name = "ReportedTime")
    public JAXBElement<ReportedTimeType> createReportedTime(ReportedTimeType value) {
        return new JAXBElement<ReportedTimeType>(_ReportedTime_QNAME, ReportedTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroundspeedChoiceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fixm.aero/base/3.0", name = "GroundspeedChoice")
    public JAXBElement<GroundspeedChoiceType> createGroundspeedChoice(GroundspeedChoiceType value) {
        return new JAXBElement<GroundspeedChoiceType>(_GroundspeedChoice_QNAME, GroundspeedChoiceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentifiedUnitReferenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fixm.aero/base/3.0", name = "IdentifiedUnitReference", substitutionHeadNamespace = "http://www.fixm.aero/base/3.0", substitutionHeadName = "AtcUnitReference")
    public JAXBElement<IdentifiedUnitReferenceType> createIdentifiedUnitReference(IdentifiedUnitReferenceType value) {
        return new JAXBElement<IdentifiedUnitReferenceType>(_IdentifiedUnitReference_QNAME, IdentifiedUnitReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiTimeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fixm.aero/base/3.0", name = "MultiTime")
    public JAXBElement<MultiTimeType> createMultiTime(MultiTimeType value) {
        return new JAXBElement<MultiTimeType>(_MultiTime_QNAME, MultiTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignificantPointType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fixm.aero/base/3.0", name = "SignificantPoint")
    public JAXBElement<SignificantPointType> createSignificantPoint(SignificantPointType value) {
        return new JAXBElement<SignificantPointType>(_SignificantPoint_QNAME, SignificantPointType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeatureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fixm.aero/base/3.0", name = "Feature")
    public JAXBElement<FeatureType> createFeature(FeatureType value) {
        return new JAXBElement<FeatureType>(_Feature_QNAME, FeatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationPointType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fixm.aero/base/3.0", name = "LocationPoint", substitutionHeadNamespace = "http://www.fixm.aero/base/3.0", substitutionHeadName = "SignificantPoint")
    public JAXBElement<LocationPointType> createLocationPoint(LocationPointType value) {
        return new JAXBElement<LocationPointType>(_LocationPoint_QNAME, LocationPointType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirspeedRangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fixm.aero/base/3.0", name = "AirspeedRange")
    public JAXBElement<AirspeedRangeType> createAirspeedRange(AirspeedRangeType value) {
        return new JAXBElement<AirspeedRangeType>(_AirspeedRange_QNAME, AirspeedRangeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameValueListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fixm.aero/base/3.0", name = "NameValueList")
    public JAXBElement<NameValueListType> createNameValueList(NameValueListType value) {
        return new JAXBElement<NameValueListType>(_NameValueList_QNAME, NameValueListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StandPositionAndTimeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fixm.aero/base/3.0", name = "StandPositionAndTime")
    public JAXBElement<StandPositionAndTimeType> createStandPositionAndTime(StandPositionAndTimeType value) {
        return new JAXBElement<StandPositionAndTimeType>(_StandPositionAndTime_QNAME, StandPositionAndTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TargetMultiTimeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fixm.aero/base/3.0", name = "TargetMultiTime", substitutionHeadNamespace = "http://www.fixm.aero/base/3.0", substitutionHeadName = "MultiTime")
    public JAXBElement<TargetMultiTimeType> createTargetMultiTime(TargetMultiTimeType value) {
        return new JAXBElement<TargetMultiTimeType>(_TargetMultiTime_QNAME, TargetMultiTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RunwayPositionAndTimeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fixm.aero/base/3.0", name = "RunwayPositionAndTime")
    public JAXBElement<RunwayPositionAndTimeType> createRunwayPositionAndTime(RunwayPositionAndTimeType value) {
        return new JAXBElement<RunwayPositionAndTimeType>(_RunwayPositionAndTime_QNAME, RunwayPositionAndTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirspeedChoiceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fixm.aero/base/3.0", name = "AirspeedChoice")
    public JAXBElement<AirspeedChoiceType> createAirspeedChoice(AirspeedChoiceType value) {
        return new JAXBElement<AirspeedChoiceType>(_AirspeedChoice_QNAME, AirspeedChoiceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedMultiTimeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fixm.aero/base/3.0", name = "ExtendedMultiTime", substitutionHeadNamespace = "http://www.fixm.aero/base/3.0", substitutionHeadName = "MultiTime")
    public JAXBElement<ExtendedMultiTimeType> createExtendedMultiTime(ExtendedMultiTimeType value) {
        return new JAXBElement<ExtendedMultiTimeType>(_ExtendedMultiTime_QNAME, ExtendedMultiTimeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltitudeChoiceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fixm.aero/base/3.0", name = "AltitudeChoice")
    public JAXBElement<AltitudeChoiceType> createAltitudeChoice(AltitudeChoiceType value) {
        return new JAXBElement<AltitudeChoiceType>(_AltitudeChoice_QNAME, AltitudeChoiceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeSequenceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fixm.aero/base/3.0", name = "TimeSequence")
    public JAXBElement<TimeSequenceType> createTimeSequence(TimeSequenceType value) {
        return new JAXBElement<TimeSequenceType>(_TimeSequence_QNAME, TimeSequenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportedTimeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "controlled", scope = ExtendedMultiTimeType.class)
    public JAXBElement<ReportedTimeType> createExtendedMultiTimeTypeControlled(ReportedTimeType value) {
        return new JAXBElement<ReportedTimeType>(_ExtendedMultiTimeTypeControlled_QNAME, ReportedTimeType.class, ExtendedMultiTimeType.class, value);
    }

}
