/**
 */
package fhiRCore.dataTypes.impl;

import fhiRCore.dataTypes.Address;
import fhiRCore.dataTypes.Age;
import fhiRCore.dataTypes.Annotation;
import fhiRCore.dataTypes.Attachment;
import fhiRCore.dataTypes.Base64Binary;
import fhiRCore.dataTypes.Canonical;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Coding;
import fhiRCore.dataTypes.ContactDetail;
import fhiRCore.dataTypes.ContactPoint;
import fhiRCore.dataTypes.Contributor;
import fhiRCore.dataTypes.Count;
import fhiRCore.dataTypes.DataRequirement;
import fhiRCore.dataTypes.DataRequirementElement1;
import fhiRCore.dataTypes.DataRequirementElement2;
import fhiRCore.dataTypes.DataRequirementElement3;
import fhiRCore.dataTypes.DataTypesFactory;
import fhiRCore.dataTypes.DataTypesPackage;
import fhiRCore.dataTypes.Date;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Decimal;
import fhiRCore.dataTypes.Distance;
import fhiRCore.dataTypes.Dosage;
import fhiRCore.dataTypes.DosageElement1;
import fhiRCore.dataTypes.Duration;
import fhiRCore.dataTypes.ElementDefinition;
import fhiRCore.dataTypes.ElementDefinitionElement1;
import fhiRCore.dataTypes.ElementDefinitionElement1Element1;
import fhiRCore.dataTypes.ElementDefinitionElement2;
import fhiRCore.dataTypes.ElementDefinitionElement3;
import fhiRCore.dataTypes.ElementDefinitionElement4;
import fhiRCore.dataTypes.ElementDefinitionElement5;
import fhiRCore.dataTypes.ElementDefinitionElement6;
import fhiRCore.dataTypes.ElementDefinitionElement7;
import fhiRCore.dataTypes.ElementId;
import fhiRCore.dataTypes.Expression;
import fhiRCore.dataTypes.Extension;
import fhiRCore.dataTypes.ExtensionUrl;
import fhiRCore.dataTypes.HumanName;
import fhiRCore.dataTypes.Id;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Instant;
import fhiRCore.dataTypes.Markdown;
import fhiRCore.dataTypes.MarketingStatus;
import fhiRCore.dataTypes.Meta;
import fhiRCore.dataTypes.Money;
import fhiRCore.dataTypes.MoneyQuantity;
import fhiRCore.dataTypes.Narrative;
import fhiRCore.dataTypes.Oid;
import fhiRCore.dataTypes.ParameterDefinition;
import fhiRCore.dataTypes.Period;
import fhiRCore.dataTypes.Population;
import fhiRCore.dataTypes.PositiveInt;
import fhiRCore.dataTypes.ProdCharacteristic;
import fhiRCore.dataTypes.ProductShelfLife;
import fhiRCore.dataTypes.Quantity;
import fhiRCore.dataTypes.Range;
import fhiRCore.dataTypes.Ratio;
import fhiRCore.dataTypes.Reference;
import fhiRCore.dataTypes.ReferenceRange;
import fhiRCore.dataTypes.RelatedArtifact;
import fhiRCore.dataTypes.SampledData;
import fhiRCore.dataTypes.Signature;
import fhiRCore.dataTypes.SimpleQuantity;
import fhiRCore.dataTypes.SubstanceAmount;
import fhiRCore.dataTypes.SubstanceAmountElement1;
import fhiRCore.dataTypes.Time;
import fhiRCore.dataTypes.Timing;
import fhiRCore.dataTypes.TimingElement1;
import fhiRCore.dataTypes.TriggerDefinition;
import fhiRCore.dataTypes.UnsignedInt;
import fhiRCore.dataTypes.Uri;
import fhiRCore.dataTypes.Url;
import fhiRCore.dataTypes.UsageContext;
import fhiRCore.dataTypes.Uuid;
import fhiRCore.dataTypes.Xhtml;
import fhiRCore.dataTypes.XhtmlValue;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataTypesFactoryImpl extends EFactoryImpl implements DataTypesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataTypesFactory init() {
		try {
			DataTypesFactory theDataTypesFactory = (DataTypesFactory)EPackage.Registry.INSTANCE.getEFactory(DataTypesPackage.eNS_URI);
			if (theDataTypesFactory != null) {
				return theDataTypesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DataTypesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DataTypesPackage.ELEMENT_ID: return createElementId();
			case DataTypesPackage.EXTENSION: return createExtension();
			case DataTypesPackage.EXTENSION_URL: return createExtensionUrl();
			case DataTypesPackage.BASE64_BINARY: return createBase64Binary();
			case DataTypesPackage.BOOLEAN: return createBoolean();
			case DataTypesPackage.CANONICAL: return createCanonical();
			case DataTypesPackage.URI: return createUri();
			case DataTypesPackage.CODE: return createCode();
			case DataTypesPackage.STRING: return createString();
			case DataTypesPackage.DATE: return createDate();
			case DataTypesPackage.DATE_TIME: return createDateTime();
			case DataTypesPackage.DECIMAL: return createDecimal();
			case DataTypesPackage.ID: return createId();
			case DataTypesPackage.INSTANT: return createInstant();
			case DataTypesPackage.INTEGER: return createInteger();
			case DataTypesPackage.MARKDOWN: return createMarkdown();
			case DataTypesPackage.OID: return createOid();
			case DataTypesPackage.POSITIVE_INT: return createPositiveInt();
			case DataTypesPackage.TIME: return createTime();
			case DataTypesPackage.UNSIGNED_INT: return createUnsignedInt();
			case DataTypesPackage.URL: return createUrl();
			case DataTypesPackage.UUID: return createUuid();
			case DataTypesPackage.ADDRESS: return createAddress();
			case DataTypesPackage.PERIOD: return createPeriod();
			case DataTypesPackage.AGE: return createAge();
			case DataTypesPackage.QUANTITY: return createQuantity();
			case DataTypesPackage.ANNOTATION: return createAnnotation();
			case DataTypesPackage.REFERENCE: return createReference();
			case DataTypesPackage.IDENTIFIER: return createIdentifier();
			case DataTypesPackage.CODEABLE_CONCEPT: return createCodeableConcept();
			case DataTypesPackage.CODING: return createCoding();
			case DataTypesPackage.META: return createMeta();
			case DataTypesPackage.NARRATIVE: return createNarrative();
			case DataTypesPackage.XHTML: return createXhtml();
			case DataTypesPackage.XHTML_VALUE: return createXhtmlValue();
			case DataTypesPackage.CONTACT_POINT: return createContactPoint();
			case DataTypesPackage.HUMAN_NAME: return createHumanName();
			case DataTypesPackage.ATTACHMENT: return createAttachment();
			case DataTypesPackage.CONTACT_DETAIL: return createContactDetail();
			case DataTypesPackage.USAGE_CONTEXT: return createUsageContext();
			case DataTypesPackage.RANGE: return createRange();
			case DataTypesPackage.RELATED_ARTIFACT: return createRelatedArtifact();
			case DataTypesPackage.PARAMETER_DEFINITION: return createParameterDefinition();
			case DataTypesPackage.DATA_REQUIREMENT: return createDataRequirement();
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT1: return createDataRequirementElement1();
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT2: return createDataRequirementElement2();
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT3: return createDataRequirementElement3();
			case DataTypesPackage.EXPRESSION: return createExpression();
			case DataTypesPackage.DURATION: return createDuration();
			case DataTypesPackage.TRIGGER_DEFINITION: return createTriggerDefinition();
			case DataTypesPackage.DOSAGE: return createDosage();
			case DataTypesPackage.TIMING: return createTiming();
			case DataTypesPackage.TIMING_ELEMENT1: return createTimingElement1();
			case DataTypesPackage.DOSAGE_ELEMENT1: return createDosageElement1();
			case DataTypesPackage.RATIO: return createRatio();
			case DataTypesPackage.MONEY: return createMoney();
			case DataTypesPackage.SIGNATURE: return createSignature();
			case DataTypesPackage.PRODUCT_SHELF_LIFE: return createProductShelfLife();
			case DataTypesPackage.PROD_CHARACTERISTIC: return createProdCharacteristic();
			case DataTypesPackage.MARKETING_STATUS: return createMarketingStatus();
			case DataTypesPackage.POPULATION: return createPopulation();
			case DataTypesPackage.SUBSTANCE_AMOUNT: return createSubstanceAmount();
			case DataTypesPackage.SUBSTANCE_AMOUNT_ELEMENT1: return createSubstanceAmountElement1();
			case DataTypesPackage.ELEMENT_DEFINITION: return createElementDefinition();
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1: return createElementDefinitionElement1();
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1_ELEMENT1: return createElementDefinitionElement1Element1();
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT2: return createElementDefinitionElement2();
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3: return createElementDefinitionElement3();
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT4: return createElementDefinitionElement4();
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT5: return createElementDefinitionElement5();
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT6: return createElementDefinitionElement6();
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT7: return createElementDefinitionElement7();
			case DataTypesPackage.COUNT: return createCount();
			case DataTypesPackage.DISTANCE: return createDistance();
			case DataTypesPackage.SAMPLED_DATA: return createSampledData();
			case DataTypesPackage.CONTRIBUTOR: return createContributor();
			case DataTypesPackage.SIMPLE_QUANTITY: return createSimpleQuantity();
			case DataTypesPackage.MONEY_QUANTITY: return createMoneyQuantity();
			case DataTypesPackage.REFERENCE_RANGE: return createReferenceRange();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementId createElementId() {
		ElementIdImpl elementId = new ElementIdImpl();
		return elementId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extension createExtension() {
		ExtensionImpl extension = new ExtensionImpl();
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionUrl createExtensionUrl() {
		ExtensionUrlImpl extensionUrl = new ExtensionUrlImpl();
		return extensionUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base64Binary createBase64Binary() {
		Base64BinaryImpl base64Binary = new Base64BinaryImpl();
		return base64Binary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Boolean createBoolean() {
		BooleanImpl boolean_ = new BooleanImpl();
		return boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Canonical createCanonical() {
		CanonicalImpl canonical = new CanonicalImpl();
		return canonical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri createUri() {
		UriImpl uri = new UriImpl();
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code createCode() {
		CodeImpl code = new CodeImpl();
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String createString() {
		StringImpl string = new StringImpl();
		return string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createDate() {
		DateImpl date = new DateImpl();
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime createDateTime() {
		DateTimeImpl dateTime = new DateTimeImpl();
		return dateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal createDecimal() {
		DecimalImpl decimal = new DecimalImpl();
		return decimal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id createId() {
		IdImpl id = new IdImpl();
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant createInstant() {
		InstantImpl instant = new InstantImpl();
		return instant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Integer createInteger() {
		IntegerImpl integer = new IntegerImpl();
		return integer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown createMarkdown() {
		MarkdownImpl markdown = new MarkdownImpl();
		return markdown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oid createOid() {
		OidImpl oid = new OidImpl();
		return oid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt createPositiveInt() {
		PositiveIntImpl positiveInt = new PositiveIntImpl();
		return positiveInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time createTime() {
		TimeImpl time = new TimeImpl();
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt createUnsignedInt() {
		UnsignedIntImpl unsignedInt = new UnsignedIntImpl();
		return unsignedInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Url createUrl() {
		UrlImpl url = new UrlImpl();
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uuid createUuid() {
		UuidImpl uuid = new UuidImpl();
		return uuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Address createAddress() {
		AddressImpl address = new AddressImpl();
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period createPeriod() {
		PeriodImpl period = new PeriodImpl();
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Age createAge() {
		AgeImpl age = new AgeImpl();
		return age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity createQuantity() {
		QuantityImpl quantity = new QuantityImpl();
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference createReference() {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier createIdentifier() {
		IdentifierImpl identifier = new IdentifierImpl();
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept createCodeableConcept() {
		CodeableConceptImpl codeableConcept = new CodeableConceptImpl();
		return codeableConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding createCoding() {
		CodingImpl coding = new CodingImpl();
		return coding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Meta createMeta() {
		MetaImpl meta = new MetaImpl();
		return meta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Narrative createNarrative() {
		NarrativeImpl narrative = new NarrativeImpl();
		return narrative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Xhtml createXhtml() {
		XhtmlImpl xhtml = new XhtmlImpl();
		return xhtml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XhtmlValue createXhtmlValue() {
		XhtmlValueImpl xhtmlValue = new XhtmlValueImpl();
		return xhtmlValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactPoint createContactPoint() {
		ContactPointImpl contactPoint = new ContactPointImpl();
		return contactPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HumanName createHumanName() {
		HumanNameImpl humanName = new HumanNameImpl();
		return humanName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attachment createAttachment() {
		AttachmentImpl attachment = new AttachmentImpl();
		return attachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactDetail createContactDetail() {
		ContactDetailImpl contactDetail = new ContactDetailImpl();
		return contactDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsageContext createUsageContext() {
		UsageContextImpl usageContext = new UsageContextImpl();
		return usageContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range createRange() {
		RangeImpl range = new RangeImpl();
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedArtifact createRelatedArtifact() {
		RelatedArtifactImpl relatedArtifact = new RelatedArtifactImpl();
		return relatedArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDefinition createParameterDefinition() {
		ParameterDefinitionImpl parameterDefinition = new ParameterDefinitionImpl();
		return parameterDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRequirement createDataRequirement() {
		DataRequirementImpl dataRequirement = new DataRequirementImpl();
		return dataRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRequirementElement1 createDataRequirementElement1() {
		DataRequirementElement1Impl dataRequirementElement1 = new DataRequirementElement1Impl();
		return dataRequirementElement1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRequirementElement2 createDataRequirementElement2() {
		DataRequirementElement2Impl dataRequirementElement2 = new DataRequirementElement2Impl();
		return dataRequirementElement2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRequirementElement3 createDataRequirementElement3() {
		DataRequirementElement3Impl dataRequirementElement3 = new DataRequirementElement3Impl();
		return dataRequirementElement3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration createDuration() {
		DurationImpl duration = new DurationImpl();
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerDefinition createTriggerDefinition() {
		TriggerDefinitionImpl triggerDefinition = new TriggerDefinitionImpl();
		return triggerDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dosage createDosage() {
		DosageImpl dosage = new DosageImpl();
		return dosage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timing createTiming() {
		TimingImpl timing = new TimingImpl();
		return timing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingElement1 createTimingElement1() {
		TimingElement1Impl timingElement1 = new TimingElement1Impl();
		return timingElement1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DosageElement1 createDosageElement1() {
		DosageElement1Impl dosageElement1 = new DosageElement1Impl();
		return dosageElement1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ratio createRatio() {
		RatioImpl ratio = new RatioImpl();
		return ratio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money createMoney() {
		MoneyImpl money = new MoneyImpl();
		return money;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signature createSignature() {
		SignatureImpl signature = new SignatureImpl();
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductShelfLife createProductShelfLife() {
		ProductShelfLifeImpl productShelfLife = new ProductShelfLifeImpl();
		return productShelfLife;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProdCharacteristic createProdCharacteristic() {
		ProdCharacteristicImpl prodCharacteristic = new ProdCharacteristicImpl();
		return prodCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MarketingStatus createMarketingStatus() {
		MarketingStatusImpl marketingStatus = new MarketingStatusImpl();
		return marketingStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Population createPopulation() {
		PopulationImpl population = new PopulationImpl();
		return population;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceAmount createSubstanceAmount() {
		SubstanceAmountImpl substanceAmount = new SubstanceAmountImpl();
		return substanceAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceAmountElement1 createSubstanceAmountElement1() {
		SubstanceAmountElement1Impl substanceAmountElement1 = new SubstanceAmountElement1Impl();
		return substanceAmountElement1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinition createElementDefinition() {
		ElementDefinitionImpl elementDefinition = new ElementDefinitionImpl();
		return elementDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinitionElement1 createElementDefinitionElement1() {
		ElementDefinitionElement1Impl elementDefinitionElement1 = new ElementDefinitionElement1Impl();
		return elementDefinitionElement1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinitionElement1Element1 createElementDefinitionElement1Element1() {
		ElementDefinitionElement1Element1Impl elementDefinitionElement1Element1 = new ElementDefinitionElement1Element1Impl();
		return elementDefinitionElement1Element1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinitionElement2 createElementDefinitionElement2() {
		ElementDefinitionElement2Impl elementDefinitionElement2 = new ElementDefinitionElement2Impl();
		return elementDefinitionElement2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinitionElement3 createElementDefinitionElement3() {
		ElementDefinitionElement3Impl elementDefinitionElement3 = new ElementDefinitionElement3Impl();
		return elementDefinitionElement3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinitionElement4 createElementDefinitionElement4() {
		ElementDefinitionElement4Impl elementDefinitionElement4 = new ElementDefinitionElement4Impl();
		return elementDefinitionElement4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinitionElement5 createElementDefinitionElement5() {
		ElementDefinitionElement5Impl elementDefinitionElement5 = new ElementDefinitionElement5Impl();
		return elementDefinitionElement5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinitionElement6 createElementDefinitionElement6() {
		ElementDefinitionElement6Impl elementDefinitionElement6 = new ElementDefinitionElement6Impl();
		return elementDefinitionElement6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDefinitionElement7 createElementDefinitionElement7() {
		ElementDefinitionElement7Impl elementDefinitionElement7 = new ElementDefinitionElement7Impl();
		return elementDefinitionElement7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Count createCount() {
		CountImpl count = new CountImpl();
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Distance createDistance() {
		DistanceImpl distance = new DistanceImpl();
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SampledData createSampledData() {
		SampledDataImpl sampledData = new SampledDataImpl();
		return sampledData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contributor createContributor() {
		ContributorImpl contributor = new ContributorImpl();
		return contributor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity createSimpleQuantity() {
		SimpleQuantityImpl simpleQuantity = new SimpleQuantityImpl();
		return simpleQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoneyQuantity createMoneyQuantity() {
		MoneyQuantityImpl moneyQuantity = new MoneyQuantityImpl();
		return moneyQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceRange createReferenceRange() {
		ReferenceRangeImpl referenceRange = new ReferenceRangeImpl();
		return referenceRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypesPackage getDataTypesPackage() {
		return (DataTypesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DataTypesPackage getPackage() {
		return DataTypesPackage.eINSTANCE;
	}

} //DataTypesFactoryImpl
