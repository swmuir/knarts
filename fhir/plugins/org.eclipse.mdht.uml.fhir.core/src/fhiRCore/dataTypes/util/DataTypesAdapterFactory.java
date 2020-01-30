/**
 */
package fhiRCore.dataTypes.util;

import fhiRCore.dataTypes.Address;
import fhiRCore.dataTypes.Age;
import fhiRCore.dataTypes.Annotation;
import fhiRCore.dataTypes.Attachment;
import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Base;
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
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.DataTypesPackage;
import fhiRCore.dataTypes.Date;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Decimal;
import fhiRCore.dataTypes.Distance;
import fhiRCore.dataTypes.Dosage;
import fhiRCore.dataTypes.DosageElement1;
import fhiRCore.dataTypes.Duration;
import fhiRCore.dataTypes.Element;
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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fhiRCore.dataTypes.DataTypesPackage
 * @generated
 */
public class DataTypesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DataTypesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DataTypesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTypesSwitch<Adapter> modelSwitch =
		new DataTypesSwitch<Adapter>() {
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseBase(Base object) {
				return createBaseAdapter();
			}
			@Override
			public Adapter caseElementId(ElementId object) {
				return createElementIdAdapter();
			}
			@Override
			public Adapter caseBackboneElement(BackboneElement object) {
				return createBackboneElementAdapter();
			}
			@Override
			public Adapter caseDataType(DataType object) {
				return createDataTypeAdapter();
			}
			@Override
			public Adapter caseExtension(Extension object) {
				return createExtensionAdapter();
			}
			@Override
			public Adapter caseExtensionUrl(ExtensionUrl object) {
				return createExtensionUrlAdapter();
			}
			@Override
			public Adapter caseBase64Binary(Base64Binary object) {
				return createBase64BinaryAdapter();
			}
			@Override
			public Adapter caseBoolean(fhiRCore.dataTypes.Boolean object) {
				return createBooleanAdapter();
			}
			@Override
			public Adapter caseCanonical(Canonical object) {
				return createCanonicalAdapter();
			}
			@Override
			public Adapter caseUri(Uri object) {
				return createUriAdapter();
			}
			@Override
			public Adapter caseCode(Code object) {
				return createCodeAdapter();
			}
			@Override
			public Adapter caseString(fhiRCore.dataTypes.String object) {
				return createStringAdapter();
			}
			@Override
			public Adapter caseDate(Date object) {
				return createDateAdapter();
			}
			@Override
			public Adapter caseDateTime(DateTime object) {
				return createDateTimeAdapter();
			}
			@Override
			public Adapter caseDecimal(Decimal object) {
				return createDecimalAdapter();
			}
			@Override
			public Adapter caseId(Id object) {
				return createIdAdapter();
			}
			@Override
			public Adapter caseInstant(Instant object) {
				return createInstantAdapter();
			}
			@Override
			public Adapter caseInteger(fhiRCore.dataTypes.Integer object) {
				return createIntegerAdapter();
			}
			@Override
			public Adapter caseMarkdown(Markdown object) {
				return createMarkdownAdapter();
			}
			@Override
			public Adapter caseOid(Oid object) {
				return createOidAdapter();
			}
			@Override
			public Adapter casePositiveInt(PositiveInt object) {
				return createPositiveIntAdapter();
			}
			@Override
			public Adapter caseTime(Time object) {
				return createTimeAdapter();
			}
			@Override
			public Adapter caseUnsignedInt(UnsignedInt object) {
				return createUnsignedIntAdapter();
			}
			@Override
			public Adapter caseUrl(Url object) {
				return createUrlAdapter();
			}
			@Override
			public Adapter caseUuid(Uuid object) {
				return createUuidAdapter();
			}
			@Override
			public Adapter caseAddress(Address object) {
				return createAddressAdapter();
			}
			@Override
			public Adapter casePeriod(Period object) {
				return createPeriodAdapter();
			}
			@Override
			public Adapter caseAge(Age object) {
				return createAgeAdapter();
			}
			@Override
			public Adapter caseQuantity(Quantity object) {
				return createQuantityAdapter();
			}
			@Override
			public Adapter caseAnnotation(Annotation object) {
				return createAnnotationAdapter();
			}
			@Override
			public Adapter caseReference(Reference object) {
				return createReferenceAdapter();
			}
			@Override
			public Adapter caseIdentifier(Identifier object) {
				return createIdentifierAdapter();
			}
			@Override
			public Adapter caseCodeableConcept(CodeableConcept object) {
				return createCodeableConceptAdapter();
			}
			@Override
			public Adapter caseCoding(Coding object) {
				return createCodingAdapter();
			}
			@Override
			public Adapter caseMeta(Meta object) {
				return createMetaAdapter();
			}
			@Override
			public Adapter caseNarrative(Narrative object) {
				return createNarrativeAdapter();
			}
			@Override
			public Adapter caseXhtml(Xhtml object) {
				return createXhtmlAdapter();
			}
			@Override
			public Adapter caseXhtmlValue(XhtmlValue object) {
				return createXhtmlValueAdapter();
			}
			@Override
			public Adapter caseContactPoint(ContactPoint object) {
				return createContactPointAdapter();
			}
			@Override
			public Adapter caseHumanName(HumanName object) {
				return createHumanNameAdapter();
			}
			@Override
			public Adapter caseAttachment(Attachment object) {
				return createAttachmentAdapter();
			}
			@Override
			public Adapter caseContactDetail(ContactDetail object) {
				return createContactDetailAdapter();
			}
			@Override
			public Adapter caseUsageContext(UsageContext object) {
				return createUsageContextAdapter();
			}
			@Override
			public Adapter caseRange(Range object) {
				return createRangeAdapter();
			}
			@Override
			public Adapter caseRelatedArtifact(RelatedArtifact object) {
				return createRelatedArtifactAdapter();
			}
			@Override
			public Adapter caseParameterDefinition(ParameterDefinition object) {
				return createParameterDefinitionAdapter();
			}
			@Override
			public Adapter caseDataRequirement(DataRequirement object) {
				return createDataRequirementAdapter();
			}
			@Override
			public Adapter caseDataRequirementElement1(DataRequirementElement1 object) {
				return createDataRequirementElement1Adapter();
			}
			@Override
			public Adapter caseDataRequirementElement2(DataRequirementElement2 object) {
				return createDataRequirementElement2Adapter();
			}
			@Override
			public Adapter caseDataRequirementElement3(DataRequirementElement3 object) {
				return createDataRequirementElement3Adapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseDuration(Duration object) {
				return createDurationAdapter();
			}
			@Override
			public Adapter caseTriggerDefinition(TriggerDefinition object) {
				return createTriggerDefinitionAdapter();
			}
			@Override
			public Adapter caseDosage(Dosage object) {
				return createDosageAdapter();
			}
			@Override
			public Adapter caseTiming(Timing object) {
				return createTimingAdapter();
			}
			@Override
			public Adapter caseTimingElement1(TimingElement1 object) {
				return createTimingElement1Adapter();
			}
			@Override
			public Adapter caseDosageElement1(DosageElement1 object) {
				return createDosageElement1Adapter();
			}
			@Override
			public Adapter caseRatio(Ratio object) {
				return createRatioAdapter();
			}
			@Override
			public Adapter caseMoney(Money object) {
				return createMoneyAdapter();
			}
			@Override
			public Adapter caseSignature(Signature object) {
				return createSignatureAdapter();
			}
			@Override
			public Adapter caseProductShelfLife(ProductShelfLife object) {
				return createProductShelfLifeAdapter();
			}
			@Override
			public Adapter caseProdCharacteristic(ProdCharacteristic object) {
				return createProdCharacteristicAdapter();
			}
			@Override
			public Adapter caseMarketingStatus(MarketingStatus object) {
				return createMarketingStatusAdapter();
			}
			@Override
			public Adapter casePopulation(Population object) {
				return createPopulationAdapter();
			}
			@Override
			public Adapter caseSubstanceAmount(SubstanceAmount object) {
				return createSubstanceAmountAdapter();
			}
			@Override
			public Adapter caseSubstanceAmountElement1(SubstanceAmountElement1 object) {
				return createSubstanceAmountElement1Adapter();
			}
			@Override
			public Adapter caseElementDefinition(ElementDefinition object) {
				return createElementDefinitionAdapter();
			}
			@Override
			public Adapter caseElementDefinitionElement1(ElementDefinitionElement1 object) {
				return createElementDefinitionElement1Adapter();
			}
			@Override
			public Adapter caseElementDefinitionElement1Element1(ElementDefinitionElement1Element1 object) {
				return createElementDefinitionElement1Element1Adapter();
			}
			@Override
			public Adapter caseElementDefinitionElement2(ElementDefinitionElement2 object) {
				return createElementDefinitionElement2Adapter();
			}
			@Override
			public Adapter caseElementDefinitionElement3(ElementDefinitionElement3 object) {
				return createElementDefinitionElement3Adapter();
			}
			@Override
			public Adapter caseElementDefinitionElement4(ElementDefinitionElement4 object) {
				return createElementDefinitionElement4Adapter();
			}
			@Override
			public Adapter caseElementDefinitionElement5(ElementDefinitionElement5 object) {
				return createElementDefinitionElement5Adapter();
			}
			@Override
			public Adapter caseElementDefinitionElement6(ElementDefinitionElement6 object) {
				return createElementDefinitionElement6Adapter();
			}
			@Override
			public Adapter caseElementDefinitionElement7(ElementDefinitionElement7 object) {
				return createElementDefinitionElement7Adapter();
			}
			@Override
			public Adapter caseCount(Count object) {
				return createCountAdapter();
			}
			@Override
			public Adapter caseDistance(Distance object) {
				return createDistanceAdapter();
			}
			@Override
			public Adapter caseSampledData(SampledData object) {
				return createSampledDataAdapter();
			}
			@Override
			public Adapter caseContributor(Contributor object) {
				return createContributorAdapter();
			}
			@Override
			public Adapter caseSimpleQuantity(SimpleQuantity object) {
				return createSimpleQuantityAdapter();
			}
			@Override
			public Adapter caseMoneyQuantity(MoneyQuantity object) {
				return createMoneyQuantityAdapter();
			}
			@Override
			public Adapter caseReferenceRange(ReferenceRange object) {
				return createReferenceRangeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.Base <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.Base
	 * @generated
	 */
	public Adapter createBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.ElementId <em>Element Id</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.ElementId
	 * @generated
	 */
	public Adapter createElementIdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.BackboneElement <em>Backbone Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.BackboneElement
	 * @generated
	 */
	public Adapter createBackboneElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.DataType
	 * @generated
	 */
	public Adapter createDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.Extension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.Extension
	 * @generated
	 */
	public Adapter createExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.ExtensionUrl <em>Extension Url</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.ExtensionUrl
	 * @generated
	 */
	public Adapter createExtensionUrlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.Base64Binary <em>Base64 Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.Base64Binary
	 * @generated
	 */
	public Adapter createBase64BinaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.Boolean
	 * @generated
	 */
	public Adapter createBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.Canonical <em>Canonical</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.Canonical
	 * @generated
	 */
	public Adapter createCanonicalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.Uri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.Uri
	 * @generated
	 */
	public Adapter createUriAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.Code <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.Code
	 * @generated
	 */
	public Adapter createCodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.String
	 * @generated
	 */
	public Adapter createStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.Date
	 * @generated
	 */
	public Adapter createDateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.DateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.DateTime
	 * @generated
	 */
	public Adapter createDateTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.Decimal <em>Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.Decimal
	 * @generated
	 */
	public Adapter createDecimalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.Id <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.Id
	 * @generated
	 */
	public Adapter createIdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.Instant <em>Instant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.Instant
	 * @generated
	 */
	public Adapter createInstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.Integer
	 * @generated
	 */
	public Adapter createIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.Markdown <em>Markdown</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.Markdown
	 * @generated
	 */
	public Adapter createMarkdownAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.Oid <em>Oid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.Oid
	 * @generated
	 */
	public Adapter createOidAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.PositiveInt <em>Positive Int</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.PositiveInt
	 * @generated
	 */
	public Adapter createPositiveIntAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.Time
	 * @generated
	 */
	public Adapter createTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.UnsignedInt <em>Unsigned Int</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.UnsignedInt
	 * @generated
	 */
	public Adapter createUnsignedIntAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.Url <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.Url
	 * @generated
	 */
	public Adapter createUrlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.Uuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.Uuid
	 * @generated
	 */
	public Adapter createUuidAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.Address
	 * @generated
	 */
	public Adapter createAddressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.Period <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.Period
	 * @generated
	 */
	public Adapter createPeriodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.Age <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.Age
	 * @generated
	 */
	public Adapter createAgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.Quantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.Quantity
	 * @generated
	 */
	public Adapter createQuantityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.Annotation
	 * @generated
	 */
	public Adapter createAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.Reference
	 * @generated
	 */
	public Adapter createReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.Identifier
	 * @generated
	 */
	public Adapter createIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.CodeableConcept <em>Codeable Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.CodeableConcept
	 * @generated
	 */
	public Adapter createCodeableConceptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.Coding <em>Coding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.Coding
	 * @generated
	 */
	public Adapter createCodingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.Meta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.Meta
	 * @generated
	 */
	public Adapter createMetaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.Narrative <em>Narrative</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.Narrative
	 * @generated
	 */
	public Adapter createNarrativeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.Xhtml <em>Xhtml</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.Xhtml
	 * @generated
	 */
	public Adapter createXhtmlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.XhtmlValue <em>Xhtml Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.XhtmlValue
	 * @generated
	 */
	public Adapter createXhtmlValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.ContactPoint <em>Contact Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.ContactPoint
	 * @generated
	 */
	public Adapter createContactPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.HumanName <em>Human Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.HumanName
	 * @generated
	 */
	public Adapter createHumanNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.Attachment <em>Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.Attachment
	 * @generated
	 */
	public Adapter createAttachmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.ContactDetail <em>Contact Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.ContactDetail
	 * @generated
	 */
	public Adapter createContactDetailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.UsageContext <em>Usage Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.UsageContext
	 * @generated
	 */
	public Adapter createUsageContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.Range <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.Range
	 * @generated
	 */
	public Adapter createRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.RelatedArtifact <em>Related Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.RelatedArtifact
	 * @generated
	 */
	public Adapter createRelatedArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.ParameterDefinition <em>Parameter Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.ParameterDefinition
	 * @generated
	 */
	public Adapter createParameterDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.DataRequirement <em>Data Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.DataRequirement
	 * @generated
	 */
	public Adapter createDataRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.DataRequirementElement1 <em>Data Requirement Element1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.DataRequirementElement1
	 * @generated
	 */
	public Adapter createDataRequirementElement1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.DataRequirementElement2 <em>Data Requirement Element2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.DataRequirementElement2
	 * @generated
	 */
	public Adapter createDataRequirementElement2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.DataRequirementElement3 <em>Data Requirement Element3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.DataRequirementElement3
	 * @generated
	 */
	public Adapter createDataRequirementElement3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.Duration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.Duration
	 * @generated
	 */
	public Adapter createDurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.TriggerDefinition <em>Trigger Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.TriggerDefinition
	 * @generated
	 */
	public Adapter createTriggerDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.Dosage <em>Dosage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.Dosage
	 * @generated
	 */
	public Adapter createDosageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.Timing <em>Timing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.Timing
	 * @generated
	 */
	public Adapter createTimingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.TimingElement1 <em>Timing Element1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.TimingElement1
	 * @generated
	 */
	public Adapter createTimingElement1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.DosageElement1 <em>Dosage Element1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.DosageElement1
	 * @generated
	 */
	public Adapter createDosageElement1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.Ratio <em>Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.Ratio
	 * @generated
	 */
	public Adapter createRatioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.Money <em>Money</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.Money
	 * @generated
	 */
	public Adapter createMoneyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.Signature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.Signature
	 * @generated
	 */
	public Adapter createSignatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.ProductShelfLife <em>Product Shelf Life</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.ProductShelfLife
	 * @generated
	 */
	public Adapter createProductShelfLifeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.ProdCharacteristic <em>Prod Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.ProdCharacteristic
	 * @generated
	 */
	public Adapter createProdCharacteristicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.MarketingStatus <em>Marketing Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.MarketingStatus
	 * @generated
	 */
	public Adapter createMarketingStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.Population <em>Population</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.Population
	 * @generated
	 */
	public Adapter createPopulationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.SubstanceAmount <em>Substance Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.SubstanceAmount
	 * @generated
	 */
	public Adapter createSubstanceAmountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.SubstanceAmountElement1 <em>Substance Amount Element1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.SubstanceAmountElement1
	 * @generated
	 */
	public Adapter createSubstanceAmountElement1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.ElementDefinition <em>Element Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.ElementDefinition
	 * @generated
	 */
	public Adapter createElementDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.ElementDefinitionElement1 <em>Element Definition Element1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.ElementDefinitionElement1
	 * @generated
	 */
	public Adapter createElementDefinitionElement1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.ElementDefinitionElement1Element1 <em>Element Definition Element1 Element1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.ElementDefinitionElement1Element1
	 * @generated
	 */
	public Adapter createElementDefinitionElement1Element1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.ElementDefinitionElement2 <em>Element Definition Element2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.ElementDefinitionElement2
	 * @generated
	 */
	public Adapter createElementDefinitionElement2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.ElementDefinitionElement3 <em>Element Definition Element3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.ElementDefinitionElement3
	 * @generated
	 */
	public Adapter createElementDefinitionElement3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.ElementDefinitionElement4 <em>Element Definition Element4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.ElementDefinitionElement4
	 * @generated
	 */
	public Adapter createElementDefinitionElement4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.ElementDefinitionElement5 <em>Element Definition Element5</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.ElementDefinitionElement5
	 * @generated
	 */
	public Adapter createElementDefinitionElement5Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.ElementDefinitionElement6 <em>Element Definition Element6</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.ElementDefinitionElement6
	 * @generated
	 */
	public Adapter createElementDefinitionElement6Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.ElementDefinitionElement7 <em>Element Definition Element7</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.ElementDefinitionElement7
	 * @generated
	 */
	public Adapter createElementDefinitionElement7Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.Count <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.Count
	 * @generated
	 */
	public Adapter createCountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.Distance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.Distance
	 * @generated
	 */
	public Adapter createDistanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.SampledData <em>Sampled Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.SampledData
	 * @generated
	 */
	public Adapter createSampledDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.Contributor <em>Contributor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.Contributor
	 * @generated
	 */
	public Adapter createContributorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.SimpleQuantity <em>Simple Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.SimpleQuantity
	 * @generated
	 */
	public Adapter createSimpleQuantityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.MoneyQuantity <em>Money Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.MoneyQuantity
	 * @generated
	 */
	public Adapter createMoneyQuantityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.dataTypes.ReferenceRange <em>Reference Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.dataTypes.ReferenceRange
	 * @generated
	 */
	public Adapter createReferenceRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DataTypesAdapterFactory
