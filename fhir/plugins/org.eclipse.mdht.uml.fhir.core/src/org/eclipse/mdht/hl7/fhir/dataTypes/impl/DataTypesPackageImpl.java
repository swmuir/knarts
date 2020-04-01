/**
 */
package org.eclipse.mdht.hl7.fhir.dataTypes.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.mdht.hl7.fhir.dataTypes.Address;
import org.eclipse.mdht.hl7.fhir.dataTypes.Age;
import org.eclipse.mdht.hl7.fhir.dataTypes.Annotation;
import org.eclipse.mdht.hl7.fhir.dataTypes.Attachment;
import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.Base;
import org.eclipse.mdht.hl7.fhir.dataTypes.Base64Binary;
import org.eclipse.mdht.hl7.fhir.dataTypes.Canonical;
import org.eclipse.mdht.hl7.fhir.dataTypes.Code;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.Coding;
import org.eclipse.mdht.hl7.fhir.dataTypes.ContactDetail;
import org.eclipse.mdht.hl7.fhir.dataTypes.ContactPoint;
import org.eclipse.mdht.hl7.fhir.dataTypes.Contributor;
import org.eclipse.mdht.hl7.fhir.dataTypes.Count;
import org.eclipse.mdht.hl7.fhir.dataTypes.DataRequirement;
import org.eclipse.mdht.hl7.fhir.dataTypes.DataRequirementElement1;
import org.eclipse.mdht.hl7.fhir.dataTypes.DataRequirementElement2;
import org.eclipse.mdht.hl7.fhir.dataTypes.DataRequirementElement3;
import org.eclipse.mdht.hl7.fhir.dataTypes.DataType;
import org.eclipse.mdht.hl7.fhir.dataTypes.DataTypesFactory;
import org.eclipse.mdht.hl7.fhir.dataTypes.DataTypesPackage;
import org.eclipse.mdht.hl7.fhir.dataTypes.Date;
import org.eclipse.mdht.hl7.fhir.dataTypes.DateTime;
import org.eclipse.mdht.hl7.fhir.dataTypes.Decimal;
import org.eclipse.mdht.hl7.fhir.dataTypes.Distance;
import org.eclipse.mdht.hl7.fhir.dataTypes.Dosage;
import org.eclipse.mdht.hl7.fhir.dataTypes.DosageElement1;
import org.eclipse.mdht.hl7.fhir.dataTypes.Duration;
import org.eclipse.mdht.hl7.fhir.dataTypes.Element;
import org.eclipse.mdht.hl7.fhir.dataTypes.ElementDefinition;
import org.eclipse.mdht.hl7.fhir.dataTypes.ElementDefinitionElement1;
import org.eclipse.mdht.hl7.fhir.dataTypes.ElementDefinitionElement1Element1;
import org.eclipse.mdht.hl7.fhir.dataTypes.ElementDefinitionElement2;
import org.eclipse.mdht.hl7.fhir.dataTypes.ElementDefinitionElement3;
import org.eclipse.mdht.hl7.fhir.dataTypes.ElementDefinitionElement4;
import org.eclipse.mdht.hl7.fhir.dataTypes.ElementDefinitionElement5;
import org.eclipse.mdht.hl7.fhir.dataTypes.ElementDefinitionElement6;
import org.eclipse.mdht.hl7.fhir.dataTypes.ElementDefinitionElement7;
import org.eclipse.mdht.hl7.fhir.dataTypes.ElementId;
import org.eclipse.mdht.hl7.fhir.dataTypes.Expression;
import org.eclipse.mdht.hl7.fhir.dataTypes.Extension;
import org.eclipse.mdht.hl7.fhir.dataTypes.ExtensionUrl;
import org.eclipse.mdht.hl7.fhir.dataTypes.HumanName;
import org.eclipse.mdht.hl7.fhir.dataTypes.Id;
import org.eclipse.mdht.hl7.fhir.dataTypes.Identifier;
import org.eclipse.mdht.hl7.fhir.dataTypes.Instant;
import org.eclipse.mdht.hl7.fhir.dataTypes.Markdown;
import org.eclipse.mdht.hl7.fhir.dataTypes.MarketingStatus;
import org.eclipse.mdht.hl7.fhir.dataTypes.Meta;
import org.eclipse.mdht.hl7.fhir.dataTypes.Money;
import org.eclipse.mdht.hl7.fhir.dataTypes.MoneyQuantity;
import org.eclipse.mdht.hl7.fhir.dataTypes.Narrative;
import org.eclipse.mdht.hl7.fhir.dataTypes.Oid;
import org.eclipse.mdht.hl7.fhir.dataTypes.ParameterDefinition;
import org.eclipse.mdht.hl7.fhir.dataTypes.Period;
import org.eclipse.mdht.hl7.fhir.dataTypes.Population;
import org.eclipse.mdht.hl7.fhir.dataTypes.PositiveInt;
import org.eclipse.mdht.hl7.fhir.dataTypes.ProdCharacteristic;
import org.eclipse.mdht.hl7.fhir.dataTypes.ProductShelfLife;
import org.eclipse.mdht.hl7.fhir.dataTypes.Quantity;
import org.eclipse.mdht.hl7.fhir.dataTypes.Range;
import org.eclipse.mdht.hl7.fhir.dataTypes.Ratio;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;
import org.eclipse.mdht.hl7.fhir.dataTypes.ReferenceRange;
import org.eclipse.mdht.hl7.fhir.dataTypes.RelatedArtifact;
import org.eclipse.mdht.hl7.fhir.dataTypes.SampledData;
import org.eclipse.mdht.hl7.fhir.dataTypes.Signature;
import org.eclipse.mdht.hl7.fhir.dataTypes.SimpleQuantity;
import org.eclipse.mdht.hl7.fhir.dataTypes.SubstanceAmount;
import org.eclipse.mdht.hl7.fhir.dataTypes.SubstanceAmountElement1;
import org.eclipse.mdht.hl7.fhir.dataTypes.Time;
import org.eclipse.mdht.hl7.fhir.dataTypes.Timing;
import org.eclipse.mdht.hl7.fhir.dataTypes.TimingElement1;
import org.eclipse.mdht.hl7.fhir.dataTypes.TriggerDefinition;
import org.eclipse.mdht.hl7.fhir.dataTypes.UnsignedInt;
import org.eclipse.mdht.hl7.fhir.dataTypes.Uri;
import org.eclipse.mdht.hl7.fhir.dataTypes.Url;
import org.eclipse.mdht.hl7.fhir.dataTypes.UsageContext;
import org.eclipse.mdht.hl7.fhir.dataTypes.Uuid;
import org.eclipse.mdht.hl7.fhir.dataTypes.Xhtml;
import org.eclipse.mdht.hl7.fhir.dataTypes.XhtmlValue;

import org.eclipse.mdht.hl7.fhir.profiles.ProfilesPackage;

import org.eclipse.mdht.hl7.fhir.profiles.impl.ProfilesPackageImpl;

import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

import org.eclipse.mdht.hl7.fhir.resources.impl.ResourcesPackageImpl;

import org.eclipse.mdht.hl7.fhir.valueSets.ValueSetsPackage;

import org.eclipse.mdht.hl7.fhir.valueSets.impl.ValueSetsPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataTypesPackageImpl extends EPackageImpl implements DataTypesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementIdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass backboneElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionUrlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass base64BinaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass canonicalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uriEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decimalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markdownEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oidEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positiveIntEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unsignedIntEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass urlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uuidEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass periodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeableConceptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass narrativeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xhtmlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xhtmlValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass humanNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactDetailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usageContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relatedArtifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataRequirementElement1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataRequirementElement2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataRequirementElement3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass durationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dosageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timingElement1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dosageElement1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ratioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moneyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productShelfLifeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prodCharacteristicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass marketingStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass populationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass substanceAmountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass substanceAmountElement1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementDefinitionElement1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementDefinitionElement1Element1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementDefinitionElement2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementDefinitionElement3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementDefinitionElement4EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementDefinitionElement5EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementDefinitionElement6EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementDefinitionElement7EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass distanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sampledDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contributorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleQuantityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moneyQuantityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceRangeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.mdht.hl7.fhir.dataTypes.DataTypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DataTypesPackageImpl() {
		super(eNS_URI, DataTypesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link DataTypesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DataTypesPackage init() {
		if (isInited) return (DataTypesPackage)EPackage.Registry.INSTANCE.getEPackage(DataTypesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDataTypesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DataTypesPackageImpl theDataTypesPackage = registeredDataTypesPackage instanceof DataTypesPackageImpl ? (DataTypesPackageImpl)registeredDataTypesPackage : new DataTypesPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI);
		ValueSetsPackageImpl theValueSetsPackage = (ValueSetsPackageImpl)(registeredPackage instanceof ValueSetsPackageImpl ? registeredPackage : ValueSetsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI);
		ResourcesPackageImpl theResourcesPackage = (ResourcesPackageImpl)(registeredPackage instanceof ResourcesPackageImpl ? registeredPackage : ResourcesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ProfilesPackage.eNS_URI);
		ProfilesPackageImpl theProfilesPackage = (ProfilesPackageImpl)(registeredPackage instanceof ProfilesPackageImpl ? registeredPackage : ProfilesPackage.eINSTANCE);

		// Load packages
		theValueSetsPackage.loadPackage();
		theResourcesPackage.loadPackage();

		// Create package meta-data objects
		theDataTypesPackage.createPackageContents();
		theProfilesPackage.createPackageContents();

		// Initialize created meta-data
		theDataTypesPackage.initializePackageContents();
		theProfilesPackage.initializePackageContents();

		// Fix loaded packages
		theValueSetsPackage.fixPackageContents();
		theResourcesPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theDataTypesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DataTypesPackage.eNS_URI, theDataTypesPackage);
		return theDataTypesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_Id() {
		return (EReference)elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_Extension() {
		return (EReference)elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBase() {
		return baseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElementId() {
		return elementIdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBackboneElement() {
		return backboneElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBackboneElement_ModifierExtension() {
		return (EReference)backboneElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExtension() {
		return extensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtension_Url() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtension_Valuex() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExtensionUrl() {
		return extensionUrlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBase64Binary() {
		return base64BinaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBase64Binary_Value() {
		return (EAttribute)base64BinaryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBoolean() {
		return booleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoolean_Value() {
		return (EAttribute)booleanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCanonical() {
		return canonicalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUri() {
		return uriEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUri_Value() {
		return (EAttribute)uriEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCode() {
		return codeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getString() {
		return stringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getString_Value() {
		return (EAttribute)stringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDate() {
		return dateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDate_Value() {
		return (EAttribute)dateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDateTime() {
		return dateTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDateTime_Value() {
		return (EAttribute)dateTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDecimal() {
		return decimalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDecimal_Value() {
		return (EAttribute)decimalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getId() {
		return idEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInstant() {
		return instantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstant_Value() {
		return (EAttribute)instantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInteger() {
		return integerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInteger_Value() {
		return (EAttribute)integerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMarkdown() {
		return markdownEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOid() {
		return oidEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPositiveInt() {
		return positiveIntEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTime() {
		return timeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTime_Value() {
		return (EAttribute)timeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnsignedInt() {
		return unsignedIntEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUrl() {
		return urlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUuid() {
		return uuidEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAddress() {
		return addressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAddress_Use() {
		return (EReference)addressEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAddress_Type() {
		return (EReference)addressEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAddress_Text() {
		return (EReference)addressEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAddress_Line() {
		return (EReference)addressEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAddress_City() {
		return (EReference)addressEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAddress_District() {
		return (EReference)addressEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAddress_State() {
		return (EReference)addressEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAddress_PostalCode() {
		return (EReference)addressEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAddress_Country() {
		return (EReference)addressEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAddress_Period() {
		return (EReference)addressEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPeriod() {
		return periodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPeriod_Start() {
		return (EReference)periodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPeriod_End() {
		return (EReference)periodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAge() {
		return ageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQuantity() {
		return quantityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQuantity_Value() {
		return (EReference)quantityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQuantity_Comparator() {
		return (EReference)quantityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQuantity_Unit() {
		return (EReference)quantityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQuantity_System() {
		return (EReference)quantityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQuantity_Code() {
		return (EReference)quantityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotation() {
		return annotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotation_Authorx() {
		return (EReference)annotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotation_Time() {
		return (EReference)annotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotation_Text() {
		return (EReference)annotationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReference() {
		return referenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReference_Reference() {
		return (EReference)referenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReference_Type() {
		return (EReference)referenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReference_Identifier() {
		return (EReference)referenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReference_Display() {
		return (EReference)referenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIdentifier() {
		return identifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIdentifier_Use() {
		return (EReference)identifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIdentifier_Type() {
		return (EReference)identifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIdentifier_System() {
		return (EReference)identifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIdentifier_Value() {
		return (EReference)identifierEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIdentifier_Period() {
		return (EReference)identifierEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIdentifier_Assigner() {
		return (EReference)identifierEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeableConcept() {
		return codeableConceptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCodeableConcept_Coding() {
		return (EReference)codeableConceptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCodeableConcept_Text() {
		return (EReference)codeableConceptEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCoding() {
		return codingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCoding_System() {
		return (EReference)codingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCoding_Version() {
		return (EReference)codingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCoding_Code() {
		return (EReference)codingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCoding_Display() {
		return (EReference)codingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCoding_UserSelected() {
		return (EReference)codingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMeta() {
		return metaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMeta_VersionId() {
		return (EReference)metaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMeta_LastUpdated() {
		return (EReference)metaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMeta_Source() {
		return (EReference)metaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMeta_Profile() {
		return (EReference)metaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMeta_Security() {
		return (EReference)metaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMeta_Tag() {
		return (EReference)metaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNarrative() {
		return narrativeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNarrative_Status() {
		return (EReference)narrativeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNarrative_Div() {
		return (EReference)narrativeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXhtml() {
		return xhtmlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getXhtml_Value() {
		return (EReference)xhtmlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXhtmlValue() {
		return xhtmlValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContactPoint() {
		return contactPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContactPoint_System() {
		return (EReference)contactPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContactPoint_Value() {
		return (EReference)contactPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContactPoint_Use() {
		return (EReference)contactPointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContactPoint_Rank() {
		return (EReference)contactPointEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContactPoint_Period() {
		return (EReference)contactPointEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHumanName() {
		return humanNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHumanName_Use() {
		return (EReference)humanNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHumanName_Text() {
		return (EReference)humanNameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHumanName_Family() {
		return (EReference)humanNameEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHumanName_Given() {
		return (EReference)humanNameEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHumanName_Prefix() {
		return (EReference)humanNameEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHumanName_Suffix() {
		return (EReference)humanNameEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHumanName_Period() {
		return (EReference)humanNameEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttachment() {
		return attachmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttachment_ContentType() {
		return (EReference)attachmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttachment_Language() {
		return (EReference)attachmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttachment_Data() {
		return (EReference)attachmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttachment_Url() {
		return (EReference)attachmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttachment_Size() {
		return (EReference)attachmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttachment_Hash() {
		return (EReference)attachmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttachment_Title() {
		return (EReference)attachmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttachment_Creation() {
		return (EReference)attachmentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContactDetail() {
		return contactDetailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContactDetail_Name() {
		return (EReference)contactDetailEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContactDetail_Telecom() {
		return (EReference)contactDetailEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUsageContext() {
		return usageContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsageContext_Code() {
		return (EReference)usageContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsageContext_ValueCodeableConcept() {
		return (EReference)usageContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsageContext_ValueQuantity() {
		return (EReference)usageContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUsageContext_ValueRange() {
		return (EReference)usageContextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRange() {
		return rangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRange_Low() {
		return (EReference)rangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRange_High() {
		return (EReference)rangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelatedArtifact() {
		return relatedArtifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelatedArtifact_Type() {
		return (EReference)relatedArtifactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelatedArtifact_Label() {
		return (EReference)relatedArtifactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelatedArtifact_Display() {
		return (EReference)relatedArtifactEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelatedArtifact_Citation() {
		return (EReference)relatedArtifactEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelatedArtifact_Url() {
		return (EReference)relatedArtifactEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelatedArtifact_Document() {
		return (EReference)relatedArtifactEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelatedArtifact_Resource() {
		return (EReference)relatedArtifactEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterDefinition() {
		return parameterDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterDefinition_Name() {
		return (EReference)parameterDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterDefinition_Use() {
		return (EReference)parameterDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterDefinition_Min() {
		return (EReference)parameterDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterDefinition_Max() {
		return (EReference)parameterDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterDefinition_Documentation() {
		return (EReference)parameterDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterDefinition_Type() {
		return (EReference)parameterDefinitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterDefinition_Profile() {
		return (EReference)parameterDefinitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataRequirement() {
		return dataRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataRequirement_Type() {
		return (EReference)dataRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataRequirement_Profile() {
		return (EReference)dataRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataRequirement_Subjectx() {
		return (EReference)dataRequirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataRequirement_MustSupport() {
		return (EReference)dataRequirementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataRequirement_CodeFilter() {
		return (EReference)dataRequirementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataRequirement_DateFilter() {
		return (EReference)dataRequirementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataRequirement_Limit() {
		return (EReference)dataRequirementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataRequirement_Sort() {
		return (EReference)dataRequirementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataRequirementElement1() {
		return dataRequirementElement1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataRequirementElement1_Path() {
		return (EReference)dataRequirementElement1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataRequirementElement1_SearchParam() {
		return (EReference)dataRequirementElement1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataRequirementElement1_ValueSet() {
		return (EReference)dataRequirementElement1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataRequirementElement1_Code() {
		return (EReference)dataRequirementElement1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataRequirementElement2() {
		return dataRequirementElement2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataRequirementElement2_Path() {
		return (EReference)dataRequirementElement2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataRequirementElement2_SearchParam() {
		return (EReference)dataRequirementElement2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataRequirementElement2_Valuex() {
		return (EReference)dataRequirementElement2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataRequirementElement3() {
		return dataRequirementElement3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataRequirementElement3_Path() {
		return (EReference)dataRequirementElement3EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataRequirementElement3_Direction() {
		return (EReference)dataRequirementElement3EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExpression_Description() {
		return (EReference)expressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExpression_Name() {
		return (EReference)expressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExpression_Language() {
		return (EReference)expressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExpression_Expression() {
		return (EReference)expressionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExpression_Reference() {
		return (EReference)expressionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDuration() {
		return durationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTriggerDefinition() {
		return triggerDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTriggerDefinition_Type() {
		return (EReference)triggerDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTriggerDefinition_Name() {
		return (EReference)triggerDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTriggerDefinition_Timingx() {
		return (EReference)triggerDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTriggerDefinition_Data() {
		return (EReference)triggerDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTriggerDefinition_Condition() {
		return (EReference)triggerDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDosage() {
		return dosageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDosage_Sequence() {
		return (EReference)dosageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDosage_Text() {
		return (EReference)dosageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDosage_AdditionalInstruction() {
		return (EReference)dosageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDosage_PatientInstruction() {
		return (EReference)dosageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDosage_Timing() {
		return (EReference)dosageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDosage_AsNeededx() {
		return (EReference)dosageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDosage_Site() {
		return (EReference)dosageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDosage_Route() {
		return (EReference)dosageEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDosage_Method() {
		return (EReference)dosageEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDosage_DoseAndRate() {
		return (EReference)dosageEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDosage_MaxDosePerPeriod() {
		return (EReference)dosageEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDosage_MaxDosePerAdministration() {
		return (EReference)dosageEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDosage_MaxDosePerLifetime() {
		return (EReference)dosageEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTiming() {
		return timingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTiming_Event() {
		return (EReference)timingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTiming_Repeat() {
		return (EReference)timingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTiming_Code() {
		return (EReference)timingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimingElement1() {
		return timingElement1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimingElement1_Boundsx() {
		return (EReference)timingElement1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimingElement1_Count() {
		return (EReference)timingElement1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimingElement1_CountMax() {
		return (EReference)timingElement1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimingElement1_Duration() {
		return (EReference)timingElement1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimingElement1_DurationMax() {
		return (EReference)timingElement1EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimingElement1_DurationUnit() {
		return (EReference)timingElement1EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimingElement1_Frequency() {
		return (EReference)timingElement1EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimingElement1_FrequencyMax() {
		return (EReference)timingElement1EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimingElement1_Period() {
		return (EReference)timingElement1EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimingElement1_PeriodMax() {
		return (EReference)timingElement1EClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimingElement1_PeriodUnit() {
		return (EReference)timingElement1EClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimingElement1_DayOfWeek() {
		return (EReference)timingElement1EClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimingElement1_TimeOfDay() {
		return (EReference)timingElement1EClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimingElement1_When() {
		return (EReference)timingElement1EClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimingElement1_Offset() {
		return (EReference)timingElement1EClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDosageElement1() {
		return dosageElement1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDosageElement1_Type() {
		return (EReference)dosageElement1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDosageElement1_Dosex() {
		return (EReference)dosageElement1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDosageElement1_Ratex() {
		return (EReference)dosageElement1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRatio() {
		return ratioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRatio_Numerator() {
		return (EReference)ratioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRatio_Denominator() {
		return (EReference)ratioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMoney() {
		return moneyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMoney_Value() {
		return (EReference)moneyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMoney_Currency() {
		return (EReference)moneyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSignature() {
		return signatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignature_Type() {
		return (EReference)signatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignature_When() {
		return (EReference)signatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignature_Who() {
		return (EReference)signatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignature_OnBehalfOf() {
		return (EReference)signatureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignature_TargetFormat() {
		return (EReference)signatureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignature_SigFormat() {
		return (EReference)signatureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignature_Data() {
		return (EReference)signatureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProductShelfLife() {
		return productShelfLifeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductShelfLife_Identifier() {
		return (EReference)productShelfLifeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductShelfLife_Type() {
		return (EReference)productShelfLifeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductShelfLife_Period() {
		return (EReference)productShelfLifeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProductShelfLife_SpecialPrecautionsForStorage() {
		return (EReference)productShelfLifeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProdCharacteristic() {
		return prodCharacteristicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProdCharacteristic_Height() {
		return (EReference)prodCharacteristicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProdCharacteristic_Width() {
		return (EReference)prodCharacteristicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProdCharacteristic_Depth() {
		return (EReference)prodCharacteristicEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProdCharacteristic_Weight() {
		return (EReference)prodCharacteristicEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProdCharacteristic_NominalVolume() {
		return (EReference)prodCharacteristicEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProdCharacteristic_ExternalDiameter() {
		return (EReference)prodCharacteristicEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProdCharacteristic_Shape() {
		return (EReference)prodCharacteristicEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProdCharacteristic_Color() {
		return (EReference)prodCharacteristicEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProdCharacteristic_Imprint() {
		return (EReference)prodCharacteristicEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProdCharacteristic_Image() {
		return (EReference)prodCharacteristicEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProdCharacteristic_Scoring() {
		return (EReference)prodCharacteristicEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMarketingStatus() {
		return marketingStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMarketingStatus_Country() {
		return (EReference)marketingStatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMarketingStatus_Jurisdiction() {
		return (EReference)marketingStatusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMarketingStatus_Status() {
		return (EReference)marketingStatusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMarketingStatus_DateRange() {
		return (EReference)marketingStatusEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMarketingStatus_RestoreDate() {
		return (EReference)marketingStatusEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPopulation() {
		return populationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPopulation_Agex() {
		return (EReference)populationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPopulation_Gender() {
		return (EReference)populationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPopulation_Race() {
		return (EReference)populationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPopulation_PhysiologicalCondition() {
		return (EReference)populationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubstanceAmount() {
		return substanceAmountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubstanceAmount_Amountx() {
		return (EReference)substanceAmountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubstanceAmount_AmountType() {
		return (EReference)substanceAmountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubstanceAmount_AmountText() {
		return (EReference)substanceAmountEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubstanceAmount_ReferenceRange() {
		return (EReference)substanceAmountEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubstanceAmountElement1() {
		return substanceAmountElement1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubstanceAmountElement1_LowLimit() {
		return (EReference)substanceAmountElement1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubstanceAmountElement1_HighLimit() {
		return (EReference)substanceAmountElement1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElementDefinition() {
		return elementDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinition_Path() {
		return (EReference)elementDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinition_Representation() {
		return (EReference)elementDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinition_SliceName() {
		return (EReference)elementDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinition_SliceIsConstraining() {
		return (EReference)elementDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinition_Label() {
		return (EReference)elementDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinition_Code() {
		return (EReference)elementDefinitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinition_Slicing() {
		return (EReference)elementDefinitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinition_Short() {
		return (EReference)elementDefinitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinition_Definition() {
		return (EReference)elementDefinitionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinition_Comment() {
		return (EReference)elementDefinitionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinition_Requirements() {
		return (EReference)elementDefinitionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinition_Alias() {
		return (EReference)elementDefinitionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinition_Min() {
		return (EReference)elementDefinitionEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinition_Max() {
		return (EReference)elementDefinitionEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinition_Base() {
		return (EReference)elementDefinitionEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinition_ContentReference() {
		return (EReference)elementDefinitionEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinition_Type() {
		return (EReference)elementDefinitionEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinition_DefaultValuex() {
		return (EReference)elementDefinitionEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinition_MeaningWhenMissing() {
		return (EReference)elementDefinitionEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinition_OrderMeaning() {
		return (EReference)elementDefinitionEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinition_Fixedx() {
		return (EReference)elementDefinitionEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinition_Patternx() {
		return (EReference)elementDefinitionEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinition_Example() {
		return (EReference)elementDefinitionEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinition_MinValuex() {
		return (EReference)elementDefinitionEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinition_MaxValuex() {
		return (EReference)elementDefinitionEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinition_MaxLength() {
		return (EReference)elementDefinitionEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinition_Condition() {
		return (EReference)elementDefinitionEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinition_Constraint() {
		return (EReference)elementDefinitionEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinition_MustSupport() {
		return (EReference)elementDefinitionEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinition_IsModifier() {
		return (EReference)elementDefinitionEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinition_IsModifierReason() {
		return (EReference)elementDefinitionEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinition_IsSummary() {
		return (EReference)elementDefinitionEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinition_Binding() {
		return (EReference)elementDefinitionEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinition_Mapping() {
		return (EReference)elementDefinitionEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElementDefinitionElement1() {
		return elementDefinitionElement1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinitionElement1_Discriminator() {
		return (EReference)elementDefinitionElement1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinitionElement1_Description() {
		return (EReference)elementDefinitionElement1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinitionElement1_Ordered() {
		return (EReference)elementDefinitionElement1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinitionElement1_Rules() {
		return (EReference)elementDefinitionElement1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElementDefinitionElement1Element1() {
		return elementDefinitionElement1Element1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinitionElement1Element1_Type() {
		return (EReference)elementDefinitionElement1Element1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinitionElement1Element1_Path() {
		return (EReference)elementDefinitionElement1Element1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElementDefinitionElement2() {
		return elementDefinitionElement2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinitionElement2_Path() {
		return (EReference)elementDefinitionElement2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinitionElement2_Min() {
		return (EReference)elementDefinitionElement2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinitionElement2_Max() {
		return (EReference)elementDefinitionElement2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElementDefinitionElement3() {
		return elementDefinitionElement3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinitionElement3_Code() {
		return (EReference)elementDefinitionElement3EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinitionElement3_Profile() {
		return (EReference)elementDefinitionElement3EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinitionElement3_TargetProfile() {
		return (EReference)elementDefinitionElement3EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinitionElement3_Aggregation() {
		return (EReference)elementDefinitionElement3EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinitionElement3_Versioning() {
		return (EReference)elementDefinitionElement3EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElementDefinitionElement4() {
		return elementDefinitionElement4EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinitionElement4_Label() {
		return (EReference)elementDefinitionElement4EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinitionElement4_Valuex() {
		return (EReference)elementDefinitionElement4EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElementDefinitionElement5() {
		return elementDefinitionElement5EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinitionElement5_Key() {
		return (EReference)elementDefinitionElement5EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinitionElement5_Requirements() {
		return (EReference)elementDefinitionElement5EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinitionElement5_Severity() {
		return (EReference)elementDefinitionElement5EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinitionElement5_Human() {
		return (EReference)elementDefinitionElement5EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinitionElement5_Expression() {
		return (EReference)elementDefinitionElement5EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinitionElement5_Xpath() {
		return (EReference)elementDefinitionElement5EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinitionElement5_Source() {
		return (EReference)elementDefinitionElement5EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElementDefinitionElement6() {
		return elementDefinitionElement6EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinitionElement6_Strength() {
		return (EReference)elementDefinitionElement6EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinitionElement6_Description() {
		return (EReference)elementDefinitionElement6EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinitionElement6_ValueSet() {
		return (EReference)elementDefinitionElement6EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElementDefinitionElement7() {
		return elementDefinitionElement7EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinitionElement7_Identity() {
		return (EReference)elementDefinitionElement7EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinitionElement7_Language() {
		return (EReference)elementDefinitionElement7EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinitionElement7_Map() {
		return (EReference)elementDefinitionElement7EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementDefinitionElement7_Comment() {
		return (EReference)elementDefinitionElement7EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCount() {
		return countEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDistance() {
		return distanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSampledData() {
		return sampledDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSampledData_Origin() {
		return (EReference)sampledDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSampledData_Period() {
		return (EReference)sampledDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSampledData_Factor() {
		return (EReference)sampledDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSampledData_LowerLimit() {
		return (EReference)sampledDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSampledData_UpperLimit() {
		return (EReference)sampledDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSampledData_Dimensions() {
		return (EReference)sampledDataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSampledData_Data() {
		return (EReference)sampledDataEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContributor() {
		return contributorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContributor_Type() {
		return (EReference)contributorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContributor_Name() {
		return (EReference)contributorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContributor_Contact() {
		return (EReference)contributorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSimpleQuantity() {
		return simpleQuantityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMoneyQuantity() {
		return moneyQuantityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReferenceRange() {
		return referenceRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReferenceRange_Low() {
		return (EReference)referenceRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReferenceRange_High() {
		return (EReference)referenceRangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReferenceRange_Type() {
		return (EReference)referenceRangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReferenceRange_AppliesTo() {
		return (EReference)referenceRangeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReferenceRange_Age() {
		return (EReference)referenceRangeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReferenceRange_Text() {
		return (EReference)referenceRangeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataTypesFactory getDataTypesFactory() {
		return (DataTypesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		elementEClass = createEClass(ELEMENT);
		createEReference(elementEClass, ELEMENT__ID);
		createEReference(elementEClass, ELEMENT__EXTENSION);

		baseEClass = createEClass(BASE);

		elementIdEClass = createEClass(ELEMENT_ID);

		backboneElementEClass = createEClass(BACKBONE_ELEMENT);
		createEReference(backboneElementEClass, BACKBONE_ELEMENT__MODIFIER_EXTENSION);

		dataTypeEClass = createEClass(DATA_TYPE);

		extensionEClass = createEClass(EXTENSION);
		createEReference(extensionEClass, EXTENSION__URL);
		createEReference(extensionEClass, EXTENSION__VALUEX);

		extensionUrlEClass = createEClass(EXTENSION_URL);

		base64BinaryEClass = createEClass(BASE64_BINARY);
		createEAttribute(base64BinaryEClass, BASE64_BINARY__VALUE);

		booleanEClass = createEClass(BOOLEAN);
		createEAttribute(booleanEClass, BOOLEAN__VALUE);

		canonicalEClass = createEClass(CANONICAL);

		uriEClass = createEClass(URI);
		createEAttribute(uriEClass, URI__VALUE);

		codeEClass = createEClass(CODE);

		stringEClass = createEClass(STRING);
		createEAttribute(stringEClass, STRING__VALUE);

		dateEClass = createEClass(DATE);
		createEAttribute(dateEClass, DATE__VALUE);

		dateTimeEClass = createEClass(DATE_TIME);
		createEAttribute(dateTimeEClass, DATE_TIME__VALUE);

		decimalEClass = createEClass(DECIMAL);
		createEAttribute(decimalEClass, DECIMAL__VALUE);

		idEClass = createEClass(ID);

		instantEClass = createEClass(INSTANT);
		createEAttribute(instantEClass, INSTANT__VALUE);

		integerEClass = createEClass(INTEGER);
		createEAttribute(integerEClass, INTEGER__VALUE);

		markdownEClass = createEClass(MARKDOWN);

		oidEClass = createEClass(OID);

		positiveIntEClass = createEClass(POSITIVE_INT);

		timeEClass = createEClass(TIME);
		createEAttribute(timeEClass, TIME__VALUE);

		unsignedIntEClass = createEClass(UNSIGNED_INT);

		urlEClass = createEClass(URL);

		uuidEClass = createEClass(UUID);

		addressEClass = createEClass(ADDRESS);
		createEReference(addressEClass, ADDRESS__USE);
		createEReference(addressEClass, ADDRESS__TYPE);
		createEReference(addressEClass, ADDRESS__TEXT);
		createEReference(addressEClass, ADDRESS__LINE);
		createEReference(addressEClass, ADDRESS__CITY);
		createEReference(addressEClass, ADDRESS__DISTRICT);
		createEReference(addressEClass, ADDRESS__STATE);
		createEReference(addressEClass, ADDRESS__POSTAL_CODE);
		createEReference(addressEClass, ADDRESS__COUNTRY);
		createEReference(addressEClass, ADDRESS__PERIOD);

		periodEClass = createEClass(PERIOD);
		createEReference(periodEClass, PERIOD__START);
		createEReference(periodEClass, PERIOD__END);

		ageEClass = createEClass(AGE);

		quantityEClass = createEClass(QUANTITY);
		createEReference(quantityEClass, QUANTITY__VALUE);
		createEReference(quantityEClass, QUANTITY__COMPARATOR);
		createEReference(quantityEClass, QUANTITY__UNIT);
		createEReference(quantityEClass, QUANTITY__SYSTEM);
		createEReference(quantityEClass, QUANTITY__CODE);

		annotationEClass = createEClass(ANNOTATION);
		createEReference(annotationEClass, ANNOTATION__AUTHORX);
		createEReference(annotationEClass, ANNOTATION__TIME);
		createEReference(annotationEClass, ANNOTATION__TEXT);

		referenceEClass = createEClass(REFERENCE);
		createEReference(referenceEClass, REFERENCE__REFERENCE);
		createEReference(referenceEClass, REFERENCE__TYPE);
		createEReference(referenceEClass, REFERENCE__IDENTIFIER);
		createEReference(referenceEClass, REFERENCE__DISPLAY);

		identifierEClass = createEClass(IDENTIFIER);
		createEReference(identifierEClass, IDENTIFIER__USE);
		createEReference(identifierEClass, IDENTIFIER__TYPE);
		createEReference(identifierEClass, IDENTIFIER__SYSTEM);
		createEReference(identifierEClass, IDENTIFIER__VALUE);
		createEReference(identifierEClass, IDENTIFIER__PERIOD);
		createEReference(identifierEClass, IDENTIFIER__ASSIGNER);

		codeableConceptEClass = createEClass(CODEABLE_CONCEPT);
		createEReference(codeableConceptEClass, CODEABLE_CONCEPT__CODING);
		createEReference(codeableConceptEClass, CODEABLE_CONCEPT__TEXT);

		codingEClass = createEClass(CODING);
		createEReference(codingEClass, CODING__SYSTEM);
		createEReference(codingEClass, CODING__VERSION);
		createEReference(codingEClass, CODING__CODE);
		createEReference(codingEClass, CODING__DISPLAY);
		createEReference(codingEClass, CODING__USER_SELECTED);

		metaEClass = createEClass(META);
		createEReference(metaEClass, META__VERSION_ID);
		createEReference(metaEClass, META__LAST_UPDATED);
		createEReference(metaEClass, META__SOURCE);
		createEReference(metaEClass, META__PROFILE);
		createEReference(metaEClass, META__SECURITY);
		createEReference(metaEClass, META__TAG);

		narrativeEClass = createEClass(NARRATIVE);
		createEReference(narrativeEClass, NARRATIVE__STATUS);
		createEReference(narrativeEClass, NARRATIVE__DIV);

		xhtmlEClass = createEClass(XHTML);
		createEReference(xhtmlEClass, XHTML__VALUE);

		xhtmlValueEClass = createEClass(XHTML_VALUE);

		contactPointEClass = createEClass(CONTACT_POINT);
		createEReference(contactPointEClass, CONTACT_POINT__SYSTEM);
		createEReference(contactPointEClass, CONTACT_POINT__VALUE);
		createEReference(contactPointEClass, CONTACT_POINT__USE);
		createEReference(contactPointEClass, CONTACT_POINT__RANK);
		createEReference(contactPointEClass, CONTACT_POINT__PERIOD);

		humanNameEClass = createEClass(HUMAN_NAME);
		createEReference(humanNameEClass, HUMAN_NAME__USE);
		createEReference(humanNameEClass, HUMAN_NAME__TEXT);
		createEReference(humanNameEClass, HUMAN_NAME__FAMILY);
		createEReference(humanNameEClass, HUMAN_NAME__GIVEN);
		createEReference(humanNameEClass, HUMAN_NAME__PREFIX);
		createEReference(humanNameEClass, HUMAN_NAME__SUFFIX);
		createEReference(humanNameEClass, HUMAN_NAME__PERIOD);

		attachmentEClass = createEClass(ATTACHMENT);
		createEReference(attachmentEClass, ATTACHMENT__CONTENT_TYPE);
		createEReference(attachmentEClass, ATTACHMENT__LANGUAGE);
		createEReference(attachmentEClass, ATTACHMENT__DATA);
		createEReference(attachmentEClass, ATTACHMENT__URL);
		createEReference(attachmentEClass, ATTACHMENT__SIZE);
		createEReference(attachmentEClass, ATTACHMENT__HASH);
		createEReference(attachmentEClass, ATTACHMENT__TITLE);
		createEReference(attachmentEClass, ATTACHMENT__CREATION);

		contactDetailEClass = createEClass(CONTACT_DETAIL);
		createEReference(contactDetailEClass, CONTACT_DETAIL__NAME);
		createEReference(contactDetailEClass, CONTACT_DETAIL__TELECOM);

		usageContextEClass = createEClass(USAGE_CONTEXT);
		createEReference(usageContextEClass, USAGE_CONTEXT__CODE);
		createEReference(usageContextEClass, USAGE_CONTEXT__VALUE_CODEABLE_CONCEPT);
		createEReference(usageContextEClass, USAGE_CONTEXT__VALUE_QUANTITY);
		createEReference(usageContextEClass, USAGE_CONTEXT__VALUE_RANGE);

		rangeEClass = createEClass(RANGE);
		createEReference(rangeEClass, RANGE__LOW);
		createEReference(rangeEClass, RANGE__HIGH);

		relatedArtifactEClass = createEClass(RELATED_ARTIFACT);
		createEReference(relatedArtifactEClass, RELATED_ARTIFACT__TYPE);
		createEReference(relatedArtifactEClass, RELATED_ARTIFACT__LABEL);
		createEReference(relatedArtifactEClass, RELATED_ARTIFACT__DISPLAY);
		createEReference(relatedArtifactEClass, RELATED_ARTIFACT__CITATION);
		createEReference(relatedArtifactEClass, RELATED_ARTIFACT__URL);
		createEReference(relatedArtifactEClass, RELATED_ARTIFACT__DOCUMENT);
		createEReference(relatedArtifactEClass, RELATED_ARTIFACT__RESOURCE);

		parameterDefinitionEClass = createEClass(PARAMETER_DEFINITION);
		createEReference(parameterDefinitionEClass, PARAMETER_DEFINITION__NAME);
		createEReference(parameterDefinitionEClass, PARAMETER_DEFINITION__USE);
		createEReference(parameterDefinitionEClass, PARAMETER_DEFINITION__MIN);
		createEReference(parameterDefinitionEClass, PARAMETER_DEFINITION__MAX);
		createEReference(parameterDefinitionEClass, PARAMETER_DEFINITION__DOCUMENTATION);
		createEReference(parameterDefinitionEClass, PARAMETER_DEFINITION__TYPE);
		createEReference(parameterDefinitionEClass, PARAMETER_DEFINITION__PROFILE);

		dataRequirementEClass = createEClass(DATA_REQUIREMENT);
		createEReference(dataRequirementEClass, DATA_REQUIREMENT__TYPE);
		createEReference(dataRequirementEClass, DATA_REQUIREMENT__PROFILE);
		createEReference(dataRequirementEClass, DATA_REQUIREMENT__SUBJECTX);
		createEReference(dataRequirementEClass, DATA_REQUIREMENT__MUST_SUPPORT);
		createEReference(dataRequirementEClass, DATA_REQUIREMENT__CODE_FILTER);
		createEReference(dataRequirementEClass, DATA_REQUIREMENT__DATE_FILTER);
		createEReference(dataRequirementEClass, DATA_REQUIREMENT__LIMIT);
		createEReference(dataRequirementEClass, DATA_REQUIREMENT__SORT);

		dataRequirementElement1EClass = createEClass(DATA_REQUIREMENT_ELEMENT1);
		createEReference(dataRequirementElement1EClass, DATA_REQUIREMENT_ELEMENT1__PATH);
		createEReference(dataRequirementElement1EClass, DATA_REQUIREMENT_ELEMENT1__SEARCH_PARAM);
		createEReference(dataRequirementElement1EClass, DATA_REQUIREMENT_ELEMENT1__VALUE_SET);
		createEReference(dataRequirementElement1EClass, DATA_REQUIREMENT_ELEMENT1__CODE);

		dataRequirementElement2EClass = createEClass(DATA_REQUIREMENT_ELEMENT2);
		createEReference(dataRequirementElement2EClass, DATA_REQUIREMENT_ELEMENT2__PATH);
		createEReference(dataRequirementElement2EClass, DATA_REQUIREMENT_ELEMENT2__SEARCH_PARAM);
		createEReference(dataRequirementElement2EClass, DATA_REQUIREMENT_ELEMENT2__VALUEX);

		dataRequirementElement3EClass = createEClass(DATA_REQUIREMENT_ELEMENT3);
		createEReference(dataRequirementElement3EClass, DATA_REQUIREMENT_ELEMENT3__PATH);
		createEReference(dataRequirementElement3EClass, DATA_REQUIREMENT_ELEMENT3__DIRECTION);

		expressionEClass = createEClass(EXPRESSION);
		createEReference(expressionEClass, EXPRESSION__DESCRIPTION);
		createEReference(expressionEClass, EXPRESSION__NAME);
		createEReference(expressionEClass, EXPRESSION__LANGUAGE);
		createEReference(expressionEClass, EXPRESSION__EXPRESSION);
		createEReference(expressionEClass, EXPRESSION__REFERENCE);

		durationEClass = createEClass(DURATION);

		triggerDefinitionEClass = createEClass(TRIGGER_DEFINITION);
		createEReference(triggerDefinitionEClass, TRIGGER_DEFINITION__TYPE);
		createEReference(triggerDefinitionEClass, TRIGGER_DEFINITION__NAME);
		createEReference(triggerDefinitionEClass, TRIGGER_DEFINITION__TIMINGX);
		createEReference(triggerDefinitionEClass, TRIGGER_DEFINITION__DATA);
		createEReference(triggerDefinitionEClass, TRIGGER_DEFINITION__CONDITION);

		dosageEClass = createEClass(DOSAGE);
		createEReference(dosageEClass, DOSAGE__SEQUENCE);
		createEReference(dosageEClass, DOSAGE__TEXT);
		createEReference(dosageEClass, DOSAGE__ADDITIONAL_INSTRUCTION);
		createEReference(dosageEClass, DOSAGE__PATIENT_INSTRUCTION);
		createEReference(dosageEClass, DOSAGE__TIMING);
		createEReference(dosageEClass, DOSAGE__AS_NEEDEDX);
		createEReference(dosageEClass, DOSAGE__SITE);
		createEReference(dosageEClass, DOSAGE__ROUTE);
		createEReference(dosageEClass, DOSAGE__METHOD);
		createEReference(dosageEClass, DOSAGE__DOSE_AND_RATE);
		createEReference(dosageEClass, DOSAGE__MAX_DOSE_PER_PERIOD);
		createEReference(dosageEClass, DOSAGE__MAX_DOSE_PER_ADMINISTRATION);
		createEReference(dosageEClass, DOSAGE__MAX_DOSE_PER_LIFETIME);

		timingEClass = createEClass(TIMING);
		createEReference(timingEClass, TIMING__EVENT);
		createEReference(timingEClass, TIMING__REPEAT);
		createEReference(timingEClass, TIMING__CODE);

		timingElement1EClass = createEClass(TIMING_ELEMENT1);
		createEReference(timingElement1EClass, TIMING_ELEMENT1__BOUNDSX);
		createEReference(timingElement1EClass, TIMING_ELEMENT1__COUNT);
		createEReference(timingElement1EClass, TIMING_ELEMENT1__COUNT_MAX);
		createEReference(timingElement1EClass, TIMING_ELEMENT1__DURATION);
		createEReference(timingElement1EClass, TIMING_ELEMENT1__DURATION_MAX);
		createEReference(timingElement1EClass, TIMING_ELEMENT1__DURATION_UNIT);
		createEReference(timingElement1EClass, TIMING_ELEMENT1__FREQUENCY);
		createEReference(timingElement1EClass, TIMING_ELEMENT1__FREQUENCY_MAX);
		createEReference(timingElement1EClass, TIMING_ELEMENT1__PERIOD);
		createEReference(timingElement1EClass, TIMING_ELEMENT1__PERIOD_MAX);
		createEReference(timingElement1EClass, TIMING_ELEMENT1__PERIOD_UNIT);
		createEReference(timingElement1EClass, TIMING_ELEMENT1__DAY_OF_WEEK);
		createEReference(timingElement1EClass, TIMING_ELEMENT1__TIME_OF_DAY);
		createEReference(timingElement1EClass, TIMING_ELEMENT1__WHEN);
		createEReference(timingElement1EClass, TIMING_ELEMENT1__OFFSET);

		dosageElement1EClass = createEClass(DOSAGE_ELEMENT1);
		createEReference(dosageElement1EClass, DOSAGE_ELEMENT1__TYPE);
		createEReference(dosageElement1EClass, DOSAGE_ELEMENT1__DOSEX);
		createEReference(dosageElement1EClass, DOSAGE_ELEMENT1__RATEX);

		ratioEClass = createEClass(RATIO);
		createEReference(ratioEClass, RATIO__NUMERATOR);
		createEReference(ratioEClass, RATIO__DENOMINATOR);

		moneyEClass = createEClass(MONEY);
		createEReference(moneyEClass, MONEY__VALUE);
		createEReference(moneyEClass, MONEY__CURRENCY);

		signatureEClass = createEClass(SIGNATURE);
		createEReference(signatureEClass, SIGNATURE__TYPE);
		createEReference(signatureEClass, SIGNATURE__WHEN);
		createEReference(signatureEClass, SIGNATURE__WHO);
		createEReference(signatureEClass, SIGNATURE__ON_BEHALF_OF);
		createEReference(signatureEClass, SIGNATURE__TARGET_FORMAT);
		createEReference(signatureEClass, SIGNATURE__SIG_FORMAT);
		createEReference(signatureEClass, SIGNATURE__DATA);

		productShelfLifeEClass = createEClass(PRODUCT_SHELF_LIFE);
		createEReference(productShelfLifeEClass, PRODUCT_SHELF_LIFE__IDENTIFIER);
		createEReference(productShelfLifeEClass, PRODUCT_SHELF_LIFE__TYPE);
		createEReference(productShelfLifeEClass, PRODUCT_SHELF_LIFE__PERIOD);
		createEReference(productShelfLifeEClass, PRODUCT_SHELF_LIFE__SPECIAL_PRECAUTIONS_FOR_STORAGE);

		prodCharacteristicEClass = createEClass(PROD_CHARACTERISTIC);
		createEReference(prodCharacteristicEClass, PROD_CHARACTERISTIC__HEIGHT);
		createEReference(prodCharacteristicEClass, PROD_CHARACTERISTIC__WIDTH);
		createEReference(prodCharacteristicEClass, PROD_CHARACTERISTIC__DEPTH);
		createEReference(prodCharacteristicEClass, PROD_CHARACTERISTIC__WEIGHT);
		createEReference(prodCharacteristicEClass, PROD_CHARACTERISTIC__NOMINAL_VOLUME);
		createEReference(prodCharacteristicEClass, PROD_CHARACTERISTIC__EXTERNAL_DIAMETER);
		createEReference(prodCharacteristicEClass, PROD_CHARACTERISTIC__SHAPE);
		createEReference(prodCharacteristicEClass, PROD_CHARACTERISTIC__COLOR);
		createEReference(prodCharacteristicEClass, PROD_CHARACTERISTIC__IMPRINT);
		createEReference(prodCharacteristicEClass, PROD_CHARACTERISTIC__IMAGE);
		createEReference(prodCharacteristicEClass, PROD_CHARACTERISTIC__SCORING);

		marketingStatusEClass = createEClass(MARKETING_STATUS);
		createEReference(marketingStatusEClass, MARKETING_STATUS__COUNTRY);
		createEReference(marketingStatusEClass, MARKETING_STATUS__JURISDICTION);
		createEReference(marketingStatusEClass, MARKETING_STATUS__STATUS);
		createEReference(marketingStatusEClass, MARKETING_STATUS__DATE_RANGE);
		createEReference(marketingStatusEClass, MARKETING_STATUS__RESTORE_DATE);

		populationEClass = createEClass(POPULATION);
		createEReference(populationEClass, POPULATION__AGEX);
		createEReference(populationEClass, POPULATION__GENDER);
		createEReference(populationEClass, POPULATION__RACE);
		createEReference(populationEClass, POPULATION__PHYSIOLOGICAL_CONDITION);

		substanceAmountEClass = createEClass(SUBSTANCE_AMOUNT);
		createEReference(substanceAmountEClass, SUBSTANCE_AMOUNT__AMOUNTX);
		createEReference(substanceAmountEClass, SUBSTANCE_AMOUNT__AMOUNT_TYPE);
		createEReference(substanceAmountEClass, SUBSTANCE_AMOUNT__AMOUNT_TEXT);
		createEReference(substanceAmountEClass, SUBSTANCE_AMOUNT__REFERENCE_RANGE);

		substanceAmountElement1EClass = createEClass(SUBSTANCE_AMOUNT_ELEMENT1);
		createEReference(substanceAmountElement1EClass, SUBSTANCE_AMOUNT_ELEMENT1__LOW_LIMIT);
		createEReference(substanceAmountElement1EClass, SUBSTANCE_AMOUNT_ELEMENT1__HIGH_LIMIT);

		elementDefinitionEClass = createEClass(ELEMENT_DEFINITION);
		createEReference(elementDefinitionEClass, ELEMENT_DEFINITION__PATH);
		createEReference(elementDefinitionEClass, ELEMENT_DEFINITION__REPRESENTATION);
		createEReference(elementDefinitionEClass, ELEMENT_DEFINITION__SLICE_NAME);
		createEReference(elementDefinitionEClass, ELEMENT_DEFINITION__SLICE_IS_CONSTRAINING);
		createEReference(elementDefinitionEClass, ELEMENT_DEFINITION__LABEL);
		createEReference(elementDefinitionEClass, ELEMENT_DEFINITION__CODE);
		createEReference(elementDefinitionEClass, ELEMENT_DEFINITION__SLICING);
		createEReference(elementDefinitionEClass, ELEMENT_DEFINITION__SHORT);
		createEReference(elementDefinitionEClass, ELEMENT_DEFINITION__DEFINITION);
		createEReference(elementDefinitionEClass, ELEMENT_DEFINITION__COMMENT);
		createEReference(elementDefinitionEClass, ELEMENT_DEFINITION__REQUIREMENTS);
		createEReference(elementDefinitionEClass, ELEMENT_DEFINITION__ALIAS);
		createEReference(elementDefinitionEClass, ELEMENT_DEFINITION__MIN);
		createEReference(elementDefinitionEClass, ELEMENT_DEFINITION__MAX);
		createEReference(elementDefinitionEClass, ELEMENT_DEFINITION__BASE);
		createEReference(elementDefinitionEClass, ELEMENT_DEFINITION__CONTENT_REFERENCE);
		createEReference(elementDefinitionEClass, ELEMENT_DEFINITION__TYPE);
		createEReference(elementDefinitionEClass, ELEMENT_DEFINITION__DEFAULT_VALUEX);
		createEReference(elementDefinitionEClass, ELEMENT_DEFINITION__MEANING_WHEN_MISSING);
		createEReference(elementDefinitionEClass, ELEMENT_DEFINITION__ORDER_MEANING);
		createEReference(elementDefinitionEClass, ELEMENT_DEFINITION__FIXEDX);
		createEReference(elementDefinitionEClass, ELEMENT_DEFINITION__PATTERNX);
		createEReference(elementDefinitionEClass, ELEMENT_DEFINITION__EXAMPLE);
		createEReference(elementDefinitionEClass, ELEMENT_DEFINITION__MIN_VALUEX);
		createEReference(elementDefinitionEClass, ELEMENT_DEFINITION__MAX_VALUEX);
		createEReference(elementDefinitionEClass, ELEMENT_DEFINITION__MAX_LENGTH);
		createEReference(elementDefinitionEClass, ELEMENT_DEFINITION__CONDITION);
		createEReference(elementDefinitionEClass, ELEMENT_DEFINITION__CONSTRAINT);
		createEReference(elementDefinitionEClass, ELEMENT_DEFINITION__MUST_SUPPORT);
		createEReference(elementDefinitionEClass, ELEMENT_DEFINITION__IS_MODIFIER);
		createEReference(elementDefinitionEClass, ELEMENT_DEFINITION__IS_MODIFIER_REASON);
		createEReference(elementDefinitionEClass, ELEMENT_DEFINITION__IS_SUMMARY);
		createEReference(elementDefinitionEClass, ELEMENT_DEFINITION__BINDING);
		createEReference(elementDefinitionEClass, ELEMENT_DEFINITION__MAPPING);

		elementDefinitionElement1EClass = createEClass(ELEMENT_DEFINITION_ELEMENT1);
		createEReference(elementDefinitionElement1EClass, ELEMENT_DEFINITION_ELEMENT1__DISCRIMINATOR);
		createEReference(elementDefinitionElement1EClass, ELEMENT_DEFINITION_ELEMENT1__DESCRIPTION);
		createEReference(elementDefinitionElement1EClass, ELEMENT_DEFINITION_ELEMENT1__ORDERED);
		createEReference(elementDefinitionElement1EClass, ELEMENT_DEFINITION_ELEMENT1__RULES);

		elementDefinitionElement1Element1EClass = createEClass(ELEMENT_DEFINITION_ELEMENT1_ELEMENT1);
		createEReference(elementDefinitionElement1Element1EClass, ELEMENT_DEFINITION_ELEMENT1_ELEMENT1__TYPE);
		createEReference(elementDefinitionElement1Element1EClass, ELEMENT_DEFINITION_ELEMENT1_ELEMENT1__PATH);

		elementDefinitionElement2EClass = createEClass(ELEMENT_DEFINITION_ELEMENT2);
		createEReference(elementDefinitionElement2EClass, ELEMENT_DEFINITION_ELEMENT2__PATH);
		createEReference(elementDefinitionElement2EClass, ELEMENT_DEFINITION_ELEMENT2__MIN);
		createEReference(elementDefinitionElement2EClass, ELEMENT_DEFINITION_ELEMENT2__MAX);

		elementDefinitionElement3EClass = createEClass(ELEMENT_DEFINITION_ELEMENT3);
		createEReference(elementDefinitionElement3EClass, ELEMENT_DEFINITION_ELEMENT3__CODE);
		createEReference(elementDefinitionElement3EClass, ELEMENT_DEFINITION_ELEMENT3__PROFILE);
		createEReference(elementDefinitionElement3EClass, ELEMENT_DEFINITION_ELEMENT3__TARGET_PROFILE);
		createEReference(elementDefinitionElement3EClass, ELEMENT_DEFINITION_ELEMENT3__AGGREGATION);
		createEReference(elementDefinitionElement3EClass, ELEMENT_DEFINITION_ELEMENT3__VERSIONING);

		elementDefinitionElement4EClass = createEClass(ELEMENT_DEFINITION_ELEMENT4);
		createEReference(elementDefinitionElement4EClass, ELEMENT_DEFINITION_ELEMENT4__LABEL);
		createEReference(elementDefinitionElement4EClass, ELEMENT_DEFINITION_ELEMENT4__VALUEX);

		elementDefinitionElement5EClass = createEClass(ELEMENT_DEFINITION_ELEMENT5);
		createEReference(elementDefinitionElement5EClass, ELEMENT_DEFINITION_ELEMENT5__KEY);
		createEReference(elementDefinitionElement5EClass, ELEMENT_DEFINITION_ELEMENT5__REQUIREMENTS);
		createEReference(elementDefinitionElement5EClass, ELEMENT_DEFINITION_ELEMENT5__SEVERITY);
		createEReference(elementDefinitionElement5EClass, ELEMENT_DEFINITION_ELEMENT5__HUMAN);
		createEReference(elementDefinitionElement5EClass, ELEMENT_DEFINITION_ELEMENT5__EXPRESSION);
		createEReference(elementDefinitionElement5EClass, ELEMENT_DEFINITION_ELEMENT5__XPATH);
		createEReference(elementDefinitionElement5EClass, ELEMENT_DEFINITION_ELEMENT5__SOURCE);

		elementDefinitionElement6EClass = createEClass(ELEMENT_DEFINITION_ELEMENT6);
		createEReference(elementDefinitionElement6EClass, ELEMENT_DEFINITION_ELEMENT6__STRENGTH);
		createEReference(elementDefinitionElement6EClass, ELEMENT_DEFINITION_ELEMENT6__DESCRIPTION);
		createEReference(elementDefinitionElement6EClass, ELEMENT_DEFINITION_ELEMENT6__VALUE_SET);

		elementDefinitionElement7EClass = createEClass(ELEMENT_DEFINITION_ELEMENT7);
		createEReference(elementDefinitionElement7EClass, ELEMENT_DEFINITION_ELEMENT7__IDENTITY);
		createEReference(elementDefinitionElement7EClass, ELEMENT_DEFINITION_ELEMENT7__LANGUAGE);
		createEReference(elementDefinitionElement7EClass, ELEMENT_DEFINITION_ELEMENT7__MAP);
		createEReference(elementDefinitionElement7EClass, ELEMENT_DEFINITION_ELEMENT7__COMMENT);

		countEClass = createEClass(COUNT);

		distanceEClass = createEClass(DISTANCE);

		sampledDataEClass = createEClass(SAMPLED_DATA);
		createEReference(sampledDataEClass, SAMPLED_DATA__ORIGIN);
		createEReference(sampledDataEClass, SAMPLED_DATA__PERIOD);
		createEReference(sampledDataEClass, SAMPLED_DATA__FACTOR);
		createEReference(sampledDataEClass, SAMPLED_DATA__LOWER_LIMIT);
		createEReference(sampledDataEClass, SAMPLED_DATA__UPPER_LIMIT);
		createEReference(sampledDataEClass, SAMPLED_DATA__DIMENSIONS);
		createEReference(sampledDataEClass, SAMPLED_DATA__DATA);

		contributorEClass = createEClass(CONTRIBUTOR);
		createEReference(contributorEClass, CONTRIBUTOR__TYPE);
		createEReference(contributorEClass, CONTRIBUTOR__NAME);
		createEReference(contributorEClass, CONTRIBUTOR__CONTACT);

		simpleQuantityEClass = createEClass(SIMPLE_QUANTITY);

		moneyQuantityEClass = createEClass(MONEY_QUANTITY);

		referenceRangeEClass = createEClass(REFERENCE_RANGE);
		createEReference(referenceRangeEClass, REFERENCE_RANGE__LOW);
		createEReference(referenceRangeEClass, REFERENCE_RANGE__HIGH);
		createEReference(referenceRangeEClass, REFERENCE_RANGE__TYPE);
		createEReference(referenceRangeEClass, REFERENCE_RANGE__APPLIES_TO);
		createEReference(referenceRangeEClass, REFERENCE_RANGE__AGE);
		createEReference(referenceRangeEClass, REFERENCE_RANGE__TEXT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		ResourcesPackage theResourcesPackage = (ResourcesPackage)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		elementEClass.getESuperTypes().add(this.getBase());
		elementIdEClass.getESuperTypes().add(this.getBackboneElement());
		backboneElementEClass.getESuperTypes().add(this.getDataType());
		dataTypeEClass.getESuperTypes().add(this.getElement());
		extensionEClass.getESuperTypes().add(this.getDataType());
		extensionUrlEClass.getESuperTypes().add(this.getBackboneElement());
		base64BinaryEClass.getESuperTypes().add(this.getDataType());
		booleanEClass.getESuperTypes().add(this.getDataType());
		canonicalEClass.getESuperTypes().add(this.getUri());
		uriEClass.getESuperTypes().add(this.getDataType());
		codeEClass.getESuperTypes().add(this.getString());
		stringEClass.getESuperTypes().add(this.getDataType());
		dateEClass.getESuperTypes().add(this.getDataType());
		dateTimeEClass.getESuperTypes().add(this.getDataType());
		decimalEClass.getESuperTypes().add(this.getDataType());
		idEClass.getESuperTypes().add(this.getString());
		instantEClass.getESuperTypes().add(this.getDataType());
		integerEClass.getESuperTypes().add(this.getDataType());
		markdownEClass.getESuperTypes().add(this.getString());
		oidEClass.getESuperTypes().add(this.getUri());
		positiveIntEClass.getESuperTypes().add(this.getInteger());
		timeEClass.getESuperTypes().add(this.getDataType());
		unsignedIntEClass.getESuperTypes().add(this.getInteger());
		urlEClass.getESuperTypes().add(this.getUri());
		uuidEClass.getESuperTypes().add(this.getUri());
		addressEClass.getESuperTypes().add(this.getDataType());
		periodEClass.getESuperTypes().add(this.getDataType());
		ageEClass.getESuperTypes().add(this.getQuantity());
		quantityEClass.getESuperTypes().add(this.getDataType());
		annotationEClass.getESuperTypes().add(this.getDataType());
		referenceEClass.getESuperTypes().add(this.getDataType());
		identifierEClass.getESuperTypes().add(this.getDataType());
		codeableConceptEClass.getESuperTypes().add(this.getDataType());
		codingEClass.getESuperTypes().add(this.getDataType());
		metaEClass.getESuperTypes().add(this.getDataType());
		narrativeEClass.getESuperTypes().add(this.getDataType());
		xhtmlEClass.getESuperTypes().add(this.getDataType());
		xhtmlValueEClass.getESuperTypes().add(this.getBackboneElement());
		contactPointEClass.getESuperTypes().add(this.getDataType());
		humanNameEClass.getESuperTypes().add(this.getDataType());
		attachmentEClass.getESuperTypes().add(this.getDataType());
		contactDetailEClass.getESuperTypes().add(this.getDataType());
		usageContextEClass.getESuperTypes().add(this.getDataType());
		rangeEClass.getESuperTypes().add(this.getDataType());
		relatedArtifactEClass.getESuperTypes().add(this.getDataType());
		parameterDefinitionEClass.getESuperTypes().add(this.getDataType());
		dataRequirementEClass.getESuperTypes().add(this.getDataType());
		dataRequirementElement1EClass.getESuperTypes().add(this.getElement());
		dataRequirementElement2EClass.getESuperTypes().add(this.getElement());
		dataRequirementElement3EClass.getESuperTypes().add(this.getElement());
		expressionEClass.getESuperTypes().add(this.getDataType());
		durationEClass.getESuperTypes().add(this.getQuantity());
		triggerDefinitionEClass.getESuperTypes().add(this.getDataType());
		dosageEClass.getESuperTypes().add(this.getBackboneElement());
		timingEClass.getESuperTypes().add(this.getBackboneElement());
		timingElement1EClass.getESuperTypes().add(this.getElement());
		dosageElement1EClass.getESuperTypes().add(this.getElement());
		ratioEClass.getESuperTypes().add(this.getDataType());
		moneyEClass.getESuperTypes().add(this.getDataType());
		signatureEClass.getESuperTypes().add(this.getDataType());
		productShelfLifeEClass.getESuperTypes().add(this.getBackboneElement());
		prodCharacteristicEClass.getESuperTypes().add(this.getBackboneElement());
		marketingStatusEClass.getESuperTypes().add(this.getBackboneElement());
		populationEClass.getESuperTypes().add(this.getBackboneElement());
		substanceAmountEClass.getESuperTypes().add(this.getBackboneElement());
		substanceAmountElement1EClass.getESuperTypes().add(this.getElement());
		elementDefinitionEClass.getESuperTypes().add(this.getBackboneElement());
		elementDefinitionElement1EClass.getESuperTypes().add(this.getElement());
		elementDefinitionElement1Element1EClass.getESuperTypes().add(this.getElement());
		elementDefinitionElement2EClass.getESuperTypes().add(this.getElement());
		elementDefinitionElement3EClass.getESuperTypes().add(this.getElement());
		elementDefinitionElement4EClass.getESuperTypes().add(this.getElement());
		elementDefinitionElement5EClass.getESuperTypes().add(this.getElement());
		elementDefinitionElement6EClass.getESuperTypes().add(this.getElement());
		elementDefinitionElement7EClass.getESuperTypes().add(this.getElement());
		countEClass.getESuperTypes().add(this.getQuantity());
		distanceEClass.getESuperTypes().add(this.getQuantity());
		sampledDataEClass.getESuperTypes().add(this.getDataType());
		contributorEClass.getESuperTypes().add(this.getDataType());
		simpleQuantityEClass.getESuperTypes().add(this.getQuantity());
		moneyQuantityEClass.getESuperTypes().add(this.getQuantity());
		referenceRangeEClass.getESuperTypes().add(this.getDataType());

		// Initialize classes, features, and operations; add parameters
		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElement_Id(), this.getElementId(), null, "id", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_Extension(), this.getExtension(), null, "extension", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(baseEClass, Base.class, "Base", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(elementIdEClass, ElementId.class, "ElementId", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(backboneElementEClass, BackboneElement.class, "BackboneElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBackboneElement_ModifierExtension(), this.getExtension(), null, "modifierExtension", null, 0, -1, BackboneElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTypeEClass, DataType.class, "DataType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(extensionEClass, Extension.class, "Extension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtension_Url(), this.getExtensionUrl(), null, "url", null, 1, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtension_Valuex(), this.getDataType(), null, "valuex", null, 0, 1, Extension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extensionUrlEClass, ExtensionUrl.class, "ExtensionUrl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(base64BinaryEClass, Base64Binary.class, "Base64Binary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBase64Binary_Value(), theXMLTypePackage.getBase64Binary(), "value", null, 0, 1, Base64Binary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanEClass, org.eclipse.mdht.hl7.fhir.dataTypes.Boolean.class, "Boolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoolean_Value(), theXMLTypePackage.getBoolean(), "value", null, 0, 1, org.eclipse.mdht.hl7.fhir.dataTypes.Boolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(canonicalEClass, Canonical.class, "Canonical", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uriEClass, Uri.class, "Uri", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUri_Value(), theXMLTypePackage.getAnyURI(), "value", null, 0, 1, Uri.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(codeEClass, Code.class, "Code", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringEClass, org.eclipse.mdht.hl7.fhir.dataTypes.String.class, "String", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getString_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, org.eclipse.mdht.hl7.fhir.dataTypes.String.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateEClass, Date.class, "Date", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDate_Value(), theXMLTypePackage.getDate(), "value", null, 0, 1, Date.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateTimeEClass, DateTime.class, "DateTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateTime_Value(), theXMLTypePackage.getDateTime(), "value", null, 0, 1, DateTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(decimalEClass, Decimal.class, "Decimal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDecimal_Value(), theXMLTypePackage.getDecimal(), "value", null, 0, 1, Decimal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(idEClass, Id.class, "Id", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(instantEClass, Instant.class, "Instant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstant_Value(), theXMLTypePackage.getDateTime(), "value", null, 0, 1, Instant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerEClass, org.eclipse.mdht.hl7.fhir.dataTypes.Integer.class, "Integer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInteger_Value(), theXMLTypePackage.getInt(), "value", null, 0, 1, org.eclipse.mdht.hl7.fhir.dataTypes.Integer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(markdownEClass, Markdown.class, "Markdown", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(oidEClass, Oid.class, "Oid", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(positiveIntEClass, PositiveInt.class, "PositiveInt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timeEClass, Time.class, "Time", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTime_Value(), theXMLTypePackage.getTime(), "value", null, 0, 1, Time.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unsignedIntEClass, UnsignedInt.class, "UnsignedInt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(urlEClass, Url.class, "Url", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uuidEClass, Uuid.class, "Uuid", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(addressEClass, Address.class, "Address", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAddress_Use(), this.getCode(), null, "use", null, 0, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAddress_Type(), this.getCode(), null, "type", null, 0, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAddress_Text(), this.getString(), null, "text", null, 0, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAddress_Line(), this.getString(), null, "line", null, 0, -1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAddress_City(), this.getString(), null, "city", null, 0, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAddress_District(), this.getString(), null, "district", null, 0, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAddress_State(), this.getString(), null, "state", null, 0, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAddress_PostalCode(), this.getString(), null, "postalCode", null, 0, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAddress_Country(), this.getString(), null, "country", null, 0, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAddress_Period(), this.getPeriod(), null, "period", null, 0, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(periodEClass, Period.class, "Period", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPeriod_Start(), this.getDateTime(), null, "start", null, 0, 1, Period.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPeriod_End(), this.getDateTime(), null, "end", null, 0, 1, Period.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ageEClass, Age.class, "Age", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(quantityEClass, Quantity.class, "Quantity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuantity_Value(), this.getDecimal(), null, "value", null, 0, 1, Quantity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantity_Comparator(), this.getCode(), null, "comparator", null, 0, 1, Quantity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantity_Unit(), this.getString(), null, "unit", null, 0, 1, Quantity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantity_System(), this.getUri(), null, "system", null, 0, 1, Quantity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantity_Code(), this.getCode(), null, "code", null, 0, 1, Quantity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotation_Authorx(), this.getDataType(), null, "authorx", null, 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotation_Time(), this.getDateTime(), null, "time", null, 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotation_Text(), this.getMarkdown(), null, "text", null, 1, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReference_Reference(), this.getString(), null, "reference", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReference_Type(), this.getUri(), null, "type", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReference_Identifier(), this.getIdentifier(), null, "identifier", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReference_Display(), this.getString(), null, "display", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identifierEClass, Identifier.class, "Identifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIdentifier_Use(), this.getCode(), null, "use", null, 0, 1, Identifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIdentifier_Type(), this.getCodeableConcept(), null, "type", null, 0, 1, Identifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIdentifier_System(), this.getUri(), null, "system", null, 0, 1, Identifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIdentifier_Value(), this.getString(), null, "value", null, 0, 1, Identifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIdentifier_Period(), this.getPeriod(), null, "period", null, 0, 1, Identifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIdentifier_Assigner(), this.getReference(), null, "assigner", null, 0, 1, Identifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(codeableConceptEClass, CodeableConcept.class, "CodeableConcept", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCodeableConcept_Coding(), this.getCoding(), null, "coding", null, 0, -1, CodeableConcept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCodeableConcept_Text(), this.getString(), null, "text", null, 0, 1, CodeableConcept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(codingEClass, Coding.class, "Coding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCoding_System(), this.getUri(), null, "system", null, 0, 1, Coding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoding_Version(), this.getString(), null, "version", null, 0, 1, Coding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoding_Code(), this.getCode(), null, "code", null, 0, 1, Coding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoding_Display(), this.getString(), null, "display", null, 0, 1, Coding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoding_UserSelected(), this.getBoolean(), null, "userSelected", null, 0, 1, Coding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metaEClass, Meta.class, "Meta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeta_VersionId(), this.getId(), null, "versionId", null, 0, 1, Meta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeta_LastUpdated(), this.getInstant(), null, "lastUpdated", null, 0, 1, Meta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeta_Source(), this.getUri(), null, "source", null, 0, 1, Meta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeta_Profile(), theResourcesPackage.getStructureDefinition(), null, "profile", null, 0, -1, Meta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeta_Security(), this.getCoding(), null, "security", null, 0, -1, Meta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeta_Tag(), this.getCoding(), null, "tag", null, 0, -1, Meta.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(narrativeEClass, Narrative.class, "Narrative", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNarrative_Status(), this.getCode(), null, "status", null, 1, 1, Narrative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNarrative_Div(), this.getXhtml(), null, "div", null, 1, 1, Narrative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xhtmlEClass, Xhtml.class, "Xhtml", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXhtml_Value(), this.getXhtmlValue(), null, "value", null, 1, 1, Xhtml.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xhtmlValueEClass, XhtmlValue.class, "XhtmlValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contactPointEClass, ContactPoint.class, "ContactPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContactPoint_System(), this.getCode(), null, "system", null, 0, 1, ContactPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContactPoint_Value(), this.getString(), null, "value", null, 0, 1, ContactPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContactPoint_Use(), this.getCode(), null, "use", null, 0, 1, ContactPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContactPoint_Rank(), this.getPositiveInt(), null, "rank", null, 0, 1, ContactPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContactPoint_Period(), this.getPeriod(), null, "period", null, 0, 1, ContactPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(humanNameEClass, HumanName.class, "HumanName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHumanName_Use(), this.getCode(), null, "use", null, 0, 1, HumanName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHumanName_Text(), this.getString(), null, "text", null, 0, 1, HumanName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHumanName_Family(), this.getString(), null, "family", null, 0, 1, HumanName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHumanName_Given(), this.getString(), null, "given", null, 0, -1, HumanName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHumanName_Prefix(), this.getString(), null, "prefix", null, 0, -1, HumanName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHumanName_Suffix(), this.getString(), null, "suffix", null, 0, -1, HumanName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHumanName_Period(), this.getPeriod(), null, "period", null, 0, 1, HumanName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachmentEClass, Attachment.class, "Attachment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttachment_ContentType(), this.getCode(), null, "contentType", null, 0, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachment_Language(), this.getCode(), null, "language", null, 0, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachment_Data(), this.getBase64Binary(), null, "data", null, 0, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachment_Url(), this.getUrl(), null, "url", null, 0, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachment_Size(), this.getUnsignedInt(), null, "size", null, 0, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachment_Hash(), this.getBase64Binary(), null, "hash", null, 0, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachment_Title(), this.getString(), null, "title", null, 0, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttachment_Creation(), this.getDateTime(), null, "creation", null, 0, 1, Attachment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contactDetailEClass, ContactDetail.class, "ContactDetail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContactDetail_Name(), this.getString(), null, "name", null, 0, 1, ContactDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContactDetail_Telecom(), this.getContactPoint(), null, "telecom", null, 0, -1, ContactDetail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(usageContextEClass, UsageContext.class, "UsageContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUsageContext_Code(), this.getCoding(), null, "code", null, 1, 1, UsageContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUsageContext_ValueCodeableConcept(), this.getCodeableConcept(), null, "valueCodeableConcept", null, 1, 1, UsageContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUsageContext_ValueQuantity(), this.getQuantity(), null, "valueQuantity", null, 1, 1, UsageContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUsageContext_ValueRange(), this.getRange(), null, "valueRange", null, 1, 1, UsageContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rangeEClass, Range.class, "Range", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRange_Low(), this.getQuantity(), null, "low", null, 0, 1, Range.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRange_High(), this.getQuantity(), null, "high", null, 0, 1, Range.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relatedArtifactEClass, RelatedArtifact.class, "RelatedArtifact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelatedArtifact_Type(), this.getCode(), null, "type", null, 1, 1, RelatedArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelatedArtifact_Label(), this.getString(), null, "label", null, 0, 1, RelatedArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelatedArtifact_Display(), this.getString(), null, "display", null, 0, 1, RelatedArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelatedArtifact_Citation(), this.getMarkdown(), null, "citation", null, 0, 1, RelatedArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelatedArtifact_Url(), this.getUrl(), null, "url", null, 0, 1, RelatedArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelatedArtifact_Document(), this.getAttachment(), null, "document", null, 0, 1, RelatedArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelatedArtifact_Resource(), theResourcesPackage.getResource(), null, "resource", null, 0, 1, RelatedArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterDefinitionEClass, ParameterDefinition.class, "ParameterDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterDefinition_Name(), this.getCode(), null, "name", null, 0, 1, ParameterDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterDefinition_Use(), this.getCode(), null, "use", null, 1, 1, ParameterDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterDefinition_Min(), this.getInteger(), null, "min", null, 0, 1, ParameterDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterDefinition_Max(), this.getString(), null, "max", null, 0, 1, ParameterDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterDefinition_Documentation(), this.getString(), null, "documentation", null, 0, 1, ParameterDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterDefinition_Type(), this.getCode(), null, "type", null, 1, 1, ParameterDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterDefinition_Profile(), theResourcesPackage.getStructureDefinition(), null, "profile", null, 0, 1, ParameterDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataRequirementEClass, DataRequirement.class, "DataRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataRequirement_Type(), this.getCode(), null, "type", null, 1, 1, DataRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataRequirement_Profile(), theResourcesPackage.getStructureDefinition(), null, "profile", null, 0, -1, DataRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataRequirement_Subjectx(), this.getDataType(), null, "subjectx", null, 0, 1, DataRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataRequirement_MustSupport(), this.getString(), null, "mustSupport", null, 0, -1, DataRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataRequirement_CodeFilter(), this.getDataRequirementElement1(), null, "codeFilter", null, 0, -1, DataRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataRequirement_DateFilter(), this.getDataRequirementElement2(), null, "dateFilter", null, 0, -1, DataRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataRequirement_Limit(), this.getPositiveInt(), null, "limit", null, 0, 1, DataRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataRequirement_Sort(), this.getDataRequirementElement3(), null, "sort", null, 0, -1, DataRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataRequirementElement1EClass, DataRequirementElement1.class, "DataRequirementElement1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataRequirementElement1_Path(), this.getString(), null, "path", null, 0, 1, DataRequirementElement1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataRequirementElement1_SearchParam(), this.getString(), null, "searchParam", null, 0, 1, DataRequirementElement1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataRequirementElement1_ValueSet(), theResourcesPackage.getValueSet(), null, "valueSet", null, 0, 1, DataRequirementElement1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataRequirementElement1_Code(), this.getCoding(), null, "code", null, 0, -1, DataRequirementElement1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataRequirementElement2EClass, DataRequirementElement2.class, "DataRequirementElement2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataRequirementElement2_Path(), this.getString(), null, "path", null, 0, 1, DataRequirementElement2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataRequirementElement2_SearchParam(), this.getString(), null, "searchParam", null, 0, 1, DataRequirementElement2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataRequirementElement2_Valuex(), this.getDataType(), null, "valuex", null, 0, 1, DataRequirementElement2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataRequirementElement3EClass, DataRequirementElement3.class, "DataRequirementElement3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataRequirementElement3_Path(), this.getString(), null, "path", null, 1, 1, DataRequirementElement3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataRequirementElement3_Direction(), this.getCode(), null, "direction", null, 1, 1, DataRequirementElement3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_Description(), this.getString(), null, "description", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpression_Name(), this.getId(), null, "name", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpression_Language(), this.getCode(), null, "language", null, 1, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpression_Expression(), this.getString(), null, "expression", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpression_Reference(), this.getUri(), null, "reference", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(durationEClass, Duration.class, "Duration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(triggerDefinitionEClass, TriggerDefinition.class, "TriggerDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTriggerDefinition_Type(), this.getCode(), null, "type", null, 1, 1, TriggerDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTriggerDefinition_Name(), this.getString(), null, "name", null, 0, 1, TriggerDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTriggerDefinition_Timingx(), this.getDataType(), null, "timingx", null, 0, 1, TriggerDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTriggerDefinition_Data(), this.getDataRequirement(), null, "data", null, 0, -1, TriggerDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTriggerDefinition_Condition(), this.getExpression(), null, "condition", null, 0, 1, TriggerDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dosageEClass, Dosage.class, "Dosage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDosage_Sequence(), this.getInteger(), null, "sequence", null, 0, 1, Dosage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDosage_Text(), this.getString(), null, "text", null, 0, 1, Dosage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDosage_AdditionalInstruction(), this.getCodeableConcept(), null, "additionalInstruction", null, 0, -1, Dosage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDosage_PatientInstruction(), this.getString(), null, "patientInstruction", null, 0, 1, Dosage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDosage_Timing(), this.getTiming(), null, "timing", null, 0, 1, Dosage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDosage_AsNeededx(), this.getDataType(), null, "asNeededx", null, 0, 1, Dosage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDosage_Site(), this.getCodeableConcept(), null, "site", null, 0, 1, Dosage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDosage_Route(), this.getCodeableConcept(), null, "route", null, 0, 1, Dosage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDosage_Method(), this.getCodeableConcept(), null, "method", null, 0, 1, Dosage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDosage_DoseAndRate(), this.getDosageElement1(), null, "doseAndRate", null, 0, -1, Dosage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDosage_MaxDosePerPeriod(), this.getRatio(), null, "maxDosePerPeriod", null, 0, 1, Dosage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDosage_MaxDosePerAdministration(), this.getQuantity(), null, "maxDosePerAdministration", null, 0, 1, Dosage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDosage_MaxDosePerLifetime(), this.getQuantity(), null, "maxDosePerLifetime", null, 0, 1, Dosage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timingEClass, Timing.class, "Timing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTiming_Event(), this.getDateTime(), null, "event", null, 0, -1, Timing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTiming_Repeat(), this.getTimingElement1(), null, "repeat", null, 0, 1, Timing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTiming_Code(), this.getCodeableConcept(), null, "code", null, 0, 1, Timing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timingElement1EClass, TimingElement1.class, "TimingElement1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimingElement1_Boundsx(), this.getDataType(), null, "boundsx", null, 0, 1, TimingElement1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimingElement1_Count(), this.getPositiveInt(), null, "count", null, 0, 1, TimingElement1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimingElement1_CountMax(), this.getPositiveInt(), null, "countMax", null, 0, 1, TimingElement1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimingElement1_Duration(), this.getDecimal(), null, "duration", null, 0, 1, TimingElement1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimingElement1_DurationMax(), this.getDecimal(), null, "durationMax", null, 0, 1, TimingElement1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimingElement1_DurationUnit(), this.getCode(), null, "durationUnit", null, 0, 1, TimingElement1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimingElement1_Frequency(), this.getPositiveInt(), null, "frequency", null, 0, 1, TimingElement1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimingElement1_FrequencyMax(), this.getPositiveInt(), null, "frequencyMax", null, 0, 1, TimingElement1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimingElement1_Period(), this.getDecimal(), null, "period", null, 0, 1, TimingElement1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimingElement1_PeriodMax(), this.getDecimal(), null, "periodMax", null, 0, 1, TimingElement1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimingElement1_PeriodUnit(), this.getCode(), null, "periodUnit", null, 0, 1, TimingElement1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimingElement1_DayOfWeek(), this.getCode(), null, "dayOfWeek", null, 0, -1, TimingElement1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimingElement1_TimeOfDay(), this.getTime(), null, "timeOfDay", null, 0, -1, TimingElement1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimingElement1_When(), this.getCode(), null, "when", null, 0, -1, TimingElement1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimingElement1_Offset(), this.getUnsignedInt(), null, "offset", null, 0, 1, TimingElement1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dosageElement1EClass, DosageElement1.class, "DosageElement1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDosageElement1_Type(), this.getCodeableConcept(), null, "type", null, 0, 1, DosageElement1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDosageElement1_Dosex(), this.getDataType(), null, "dosex", null, 0, 1, DosageElement1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDosageElement1_Ratex(), this.getDataType(), null, "ratex", null, 0, 1, DosageElement1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ratioEClass, Ratio.class, "Ratio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRatio_Numerator(), this.getQuantity(), null, "numerator", null, 0, 1, Ratio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRatio_Denominator(), this.getQuantity(), null, "denominator", null, 0, 1, Ratio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moneyEClass, Money.class, "Money", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMoney_Value(), this.getDecimal(), null, "value", null, 0, 1, Money.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMoney_Currency(), this.getCode(), null, "currency", null, 0, 1, Money.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signatureEClass, Signature.class, "Signature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignature_Type(), this.getCoding(), null, "type", null, 1, -1, Signature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignature_When(), this.getInstant(), null, "when", null, 1, 1, Signature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignature_Who(), this.getReference(), null, "who", null, 1, 1, Signature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignature_OnBehalfOf(), this.getReference(), null, "onBehalfOf", null, 0, 1, Signature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignature_TargetFormat(), this.getCode(), null, "targetFormat", null, 0, 1, Signature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignature_SigFormat(), this.getCode(), null, "sigFormat", null, 0, 1, Signature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignature_Data(), this.getBase64Binary(), null, "data", null, 0, 1, Signature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productShelfLifeEClass, ProductShelfLife.class, "ProductShelfLife", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductShelfLife_Identifier(), this.getIdentifier(), null, "identifier", null, 0, 1, ProductShelfLife.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductShelfLife_Type(), this.getCodeableConcept(), null, "type", null, 1, 1, ProductShelfLife.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductShelfLife_Period(), this.getQuantity(), null, "period", null, 1, 1, ProductShelfLife.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductShelfLife_SpecialPrecautionsForStorage(), this.getCodeableConcept(), null, "specialPrecautionsForStorage", null, 0, -1, ProductShelfLife.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prodCharacteristicEClass, ProdCharacteristic.class, "ProdCharacteristic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProdCharacteristic_Height(), this.getQuantity(), null, "height", null, 0, 1, ProdCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProdCharacteristic_Width(), this.getQuantity(), null, "width", null, 0, 1, ProdCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProdCharacteristic_Depth(), this.getQuantity(), null, "depth", null, 0, 1, ProdCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProdCharacteristic_Weight(), this.getQuantity(), null, "weight", null, 0, 1, ProdCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProdCharacteristic_NominalVolume(), this.getQuantity(), null, "nominalVolume", null, 0, 1, ProdCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProdCharacteristic_ExternalDiameter(), this.getQuantity(), null, "externalDiameter", null, 0, 1, ProdCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProdCharacteristic_Shape(), this.getString(), null, "shape", null, 0, 1, ProdCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProdCharacteristic_Color(), this.getString(), null, "color", null, 0, -1, ProdCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProdCharacteristic_Imprint(), this.getString(), null, "imprint", null, 0, -1, ProdCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProdCharacteristic_Image(), this.getAttachment(), null, "image", null, 0, -1, ProdCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProdCharacteristic_Scoring(), this.getCodeableConcept(), null, "scoring", null, 0, 1, ProdCharacteristic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(marketingStatusEClass, MarketingStatus.class, "MarketingStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMarketingStatus_Country(), this.getCodeableConcept(), null, "country", null, 1, 1, MarketingStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMarketingStatus_Jurisdiction(), this.getCodeableConcept(), null, "jurisdiction", null, 0, 1, MarketingStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMarketingStatus_Status(), this.getCodeableConcept(), null, "status", null, 1, 1, MarketingStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMarketingStatus_DateRange(), this.getPeriod(), null, "dateRange", null, 1, 1, MarketingStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMarketingStatus_RestoreDate(), this.getDateTime(), null, "restoreDate", null, 0, 1, MarketingStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(populationEClass, Population.class, "Population", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPopulation_Agex(), this.getDataType(), null, "agex", null, 0, 1, Population.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPopulation_Gender(), this.getCodeableConcept(), null, "gender", null, 0, 1, Population.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPopulation_Race(), this.getCodeableConcept(), null, "race", null, 0, 1, Population.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPopulation_PhysiologicalCondition(), this.getCodeableConcept(), null, "physiologicalCondition", null, 0, 1, Population.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(substanceAmountEClass, SubstanceAmount.class, "SubstanceAmount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubstanceAmount_Amountx(), this.getDataType(), null, "amountx", null, 0, 1, SubstanceAmount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceAmount_AmountType(), this.getCodeableConcept(), null, "amountType", null, 0, 1, SubstanceAmount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceAmount_AmountText(), this.getString(), null, "amountText", null, 0, 1, SubstanceAmount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceAmount_ReferenceRange(), this.getSubstanceAmountElement1(), null, "referenceRange", null, 0, 1, SubstanceAmount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(substanceAmountElement1EClass, SubstanceAmountElement1.class, "SubstanceAmountElement1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubstanceAmountElement1_LowLimit(), this.getQuantity(), null, "lowLimit", null, 0, 1, SubstanceAmountElement1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceAmountElement1_HighLimit(), this.getQuantity(), null, "highLimit", null, 0, 1, SubstanceAmountElement1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementDefinitionEClass, ElementDefinition.class, "ElementDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementDefinition_Path(), this.getString(), null, "path", null, 1, 1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementDefinition_Representation(), this.getCode(), null, "representation", null, 0, -1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementDefinition_SliceName(), this.getString(), null, "sliceName", null, 0, 1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementDefinition_SliceIsConstraining(), this.getBoolean(), null, "sliceIsConstraining", null, 0, 1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementDefinition_Label(), this.getString(), null, "label", null, 0, 1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementDefinition_Code(), this.getCoding(), null, "code", null, 0, -1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementDefinition_Slicing(), this.getElementDefinitionElement1(), null, "slicing", null, 0, 1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementDefinition_Short(), this.getString(), null, "short", null, 0, 1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementDefinition_Definition(), this.getMarkdown(), null, "definition", null, 0, 1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementDefinition_Comment(), this.getMarkdown(), null, "comment", null, 0, 1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementDefinition_Requirements(), this.getMarkdown(), null, "requirements", null, 0, 1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementDefinition_Alias(), this.getString(), null, "alias", null, 0, -1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementDefinition_Min(), this.getUnsignedInt(), null, "min", null, 0, 1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementDefinition_Max(), this.getString(), null, "max", null, 0, 1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementDefinition_Base(), this.getElementDefinitionElement2(), null, "base", null, 0, 1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementDefinition_ContentReference(), this.getUri(), null, "contentReference", null, 0, 1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementDefinition_Type(), this.getElementDefinitionElement3(), null, "type", null, 0, -1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementDefinition_DefaultValuex(), this.getDataType(), null, "defaultValuex", null, 0, 1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementDefinition_MeaningWhenMissing(), this.getMarkdown(), null, "meaningWhenMissing", null, 0, 1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementDefinition_OrderMeaning(), this.getString(), null, "orderMeaning", null, 0, 1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementDefinition_Fixedx(), this.getDataType(), null, "fixedx", null, 0, 1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementDefinition_Patternx(), this.getDataType(), null, "patternx", null, 0, 1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementDefinition_Example(), this.getElementDefinitionElement4(), null, "example", null, 0, -1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementDefinition_MinValuex(), this.getDataType(), null, "minValuex", null, 0, 1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementDefinition_MaxValuex(), this.getDataType(), null, "maxValuex", null, 0, 1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementDefinition_MaxLength(), this.getInteger(), null, "maxLength", null, 0, 1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementDefinition_Condition(), this.getId(), null, "condition", null, 0, -1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementDefinition_Constraint(), this.getElementDefinitionElement5(), null, "constraint", null, 0, -1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementDefinition_MustSupport(), this.getBoolean(), null, "mustSupport", null, 0, 1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementDefinition_IsModifier(), this.getBoolean(), null, "isModifier", null, 0, 1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementDefinition_IsModifierReason(), this.getString(), null, "isModifierReason", null, 0, 1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementDefinition_IsSummary(), this.getBoolean(), null, "isSummary", null, 0, 1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementDefinition_Binding(), this.getElementDefinitionElement6(), null, "binding", null, 0, 1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementDefinition_Mapping(), this.getElementDefinitionElement7(), null, "mapping", null, 0, -1, ElementDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementDefinitionElement1EClass, ElementDefinitionElement1.class, "ElementDefinitionElement1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementDefinitionElement1_Discriminator(), this.getElementDefinitionElement1Element1(), null, "discriminator", null, 0, -1, ElementDefinitionElement1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementDefinitionElement1_Description(), this.getString(), null, "description", null, 0, 1, ElementDefinitionElement1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementDefinitionElement1_Ordered(), this.getBoolean(), null, "ordered", null, 0, 1, ElementDefinitionElement1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementDefinitionElement1_Rules(), this.getCode(), null, "rules", null, 1, 1, ElementDefinitionElement1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementDefinitionElement1Element1EClass, ElementDefinitionElement1Element1.class, "ElementDefinitionElement1Element1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementDefinitionElement1Element1_Type(), this.getCode(), null, "type", null, 1, 1, ElementDefinitionElement1Element1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementDefinitionElement1Element1_Path(), this.getString(), null, "path", null, 1, 1, ElementDefinitionElement1Element1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementDefinitionElement2EClass, ElementDefinitionElement2.class, "ElementDefinitionElement2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementDefinitionElement2_Path(), this.getString(), null, "path", null, 1, 1, ElementDefinitionElement2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementDefinitionElement2_Min(), this.getUnsignedInt(), null, "min", null, 1, 1, ElementDefinitionElement2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementDefinitionElement2_Max(), this.getString(), null, "max", null, 1, 1, ElementDefinitionElement2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementDefinitionElement3EClass, ElementDefinitionElement3.class, "ElementDefinitionElement3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementDefinitionElement3_Code(), this.getUri(), null, "code", null, 1, 1, ElementDefinitionElement3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementDefinitionElement3_Profile(), theResourcesPackage.getStructureDefinition(), null, "profile", null, 0, -1, ElementDefinitionElement3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementDefinitionElement3_TargetProfile(), theResourcesPackage.getStructureDefinition(), null, "targetProfile", null, 0, -1, ElementDefinitionElement3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementDefinitionElement3_Aggregation(), this.getCode(), null, "aggregation", null, 0, -1, ElementDefinitionElement3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementDefinitionElement3_Versioning(), this.getCode(), null, "versioning", null, 0, 1, ElementDefinitionElement3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementDefinitionElement4EClass, ElementDefinitionElement4.class, "ElementDefinitionElement4", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementDefinitionElement4_Label(), this.getString(), null, "label", null, 1, 1, ElementDefinitionElement4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementDefinitionElement4_Valuex(), this.getDataType(), null, "valuex", null, 1, 1, ElementDefinitionElement4.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementDefinitionElement5EClass, ElementDefinitionElement5.class, "ElementDefinitionElement5", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementDefinitionElement5_Key(), this.getId(), null, "key", null, 1, 1, ElementDefinitionElement5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementDefinitionElement5_Requirements(), this.getString(), null, "requirements", null, 0, 1, ElementDefinitionElement5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementDefinitionElement5_Severity(), this.getCode(), null, "severity", null, 1, 1, ElementDefinitionElement5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementDefinitionElement5_Human(), this.getString(), null, "human", null, 1, 1, ElementDefinitionElement5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementDefinitionElement5_Expression(), this.getString(), null, "expression", null, 0, 1, ElementDefinitionElement5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementDefinitionElement5_Xpath(), this.getString(), null, "xpath", null, 0, 1, ElementDefinitionElement5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementDefinitionElement5_Source(), theResourcesPackage.getStructureDefinition(), null, "source", null, 0, 1, ElementDefinitionElement5.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementDefinitionElement6EClass, ElementDefinitionElement6.class, "ElementDefinitionElement6", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementDefinitionElement6_Strength(), this.getCode(), null, "strength", null, 1, 1, ElementDefinitionElement6.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementDefinitionElement6_Description(), this.getString(), null, "description", null, 0, 1, ElementDefinitionElement6.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementDefinitionElement6_ValueSet(), theResourcesPackage.getValueSet(), null, "valueSet", null, 0, 1, ElementDefinitionElement6.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementDefinitionElement7EClass, ElementDefinitionElement7.class, "ElementDefinitionElement7", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementDefinitionElement7_Identity(), this.getId(), null, "identity", null, 1, 1, ElementDefinitionElement7.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementDefinitionElement7_Language(), this.getCode(), null, "language", null, 0, 1, ElementDefinitionElement7.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementDefinitionElement7_Map(), this.getString(), null, "map", null, 1, 1, ElementDefinitionElement7.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementDefinitionElement7_Comment(), this.getString(), null, "comment", null, 0, 1, ElementDefinitionElement7.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(countEClass, Count.class, "Count", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(distanceEClass, Distance.class, "Distance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sampledDataEClass, SampledData.class, "SampledData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSampledData_Origin(), this.getQuantity(), null, "origin", null, 1, 1, SampledData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSampledData_Period(), this.getDecimal(), null, "period", null, 1, 1, SampledData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSampledData_Factor(), this.getDecimal(), null, "factor", null, 0, 1, SampledData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSampledData_LowerLimit(), this.getDecimal(), null, "lowerLimit", null, 0, 1, SampledData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSampledData_UpperLimit(), this.getDecimal(), null, "upperLimit", null, 0, 1, SampledData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSampledData_Dimensions(), this.getPositiveInt(), null, "dimensions", null, 1, 1, SampledData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSampledData_Data(), this.getString(), null, "data", null, 0, 1, SampledData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contributorEClass, Contributor.class, "Contributor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContributor_Type(), this.getCode(), null, "type", null, 1, 1, Contributor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContributor_Name(), this.getString(), null, "name", null, 1, 1, Contributor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContributor_Contact(), this.getContactDetail(), null, "contact", null, 0, -1, Contributor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleQuantityEClass, SimpleQuantity.class, "SimpleQuantity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(moneyQuantityEClass, MoneyQuantity.class, "MoneyQuantity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(referenceRangeEClass, ReferenceRange.class, "ReferenceRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceRange_Low(), this.getQuantity(), null, "low", null, 0, 1, ReferenceRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferenceRange_High(), this.getQuantity(), null, "high", null, 0, 1, ReferenceRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferenceRange_Type(), this.getCodeableConcept(), null, "type", null, 0, 1, ReferenceRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferenceRange_AppliesTo(), this.getCodeableConcept(), null, "appliesTo", null, 0, -1, ReferenceRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferenceRange_Age(), this.getRange(), null, "age", null, 0, 1, ReferenceRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferenceRange_Text(), this.getString(), null, "text", null, 0, 1, ReferenceRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "originalName", "DataTypes"
		   });
		addAnnotation
		  (elementIdEClass,
		   source,
		   new String[] {
			   "originalName", "Element_Id"
		   });
		addAnnotation
		  (getExtension_Valuex(),
		   source,
		   new String[] {
			   "originalName", "value[x]"
		   });
		addAnnotation
		  (extensionUrlEClass,
		   source,
		   new String[] {
			   "originalName", "Extension_Url"
		   });
		addAnnotation
		  (base64BinaryEClass,
		   source,
		   new String[] {
			   "originalName", "base64Binary"
		   });
		addAnnotation
		  (booleanEClass,
		   source,
		   new String[] {
			   "originalName", "boolean"
		   });
		addAnnotation
		  (canonicalEClass,
		   source,
		   new String[] {
			   "originalName", "canonical"
		   });
		addAnnotation
		  (uriEClass,
		   source,
		   new String[] {
			   "originalName", "uri"
		   });
		addAnnotation
		  (codeEClass,
		   source,
		   new String[] {
			   "originalName", "code"
		   });
		addAnnotation
		  (dateEClass,
		   source,
		   new String[] {
			   "originalName", "date"
		   });
		addAnnotation
		  (dateTimeEClass,
		   source,
		   new String[] {
			   "originalName", "dateTime"
		   });
		addAnnotation
		  (decimalEClass,
		   source,
		   new String[] {
			   "originalName", "decimal"
		   });
		addAnnotation
		  (idEClass,
		   source,
		   new String[] {
			   "originalName", "id"
		   });
		addAnnotation
		  (instantEClass,
		   source,
		   new String[] {
			   "originalName", "instant"
		   });
		addAnnotation
		  (integerEClass,
		   source,
		   new String[] {
			   "originalName", "integer"
		   });
		addAnnotation
		  (markdownEClass,
		   source,
		   new String[] {
			   "originalName", "markdown"
		   });
		addAnnotation
		  (oidEClass,
		   source,
		   new String[] {
			   "originalName", "oid"
		   });
		addAnnotation
		  (positiveIntEClass,
		   source,
		   new String[] {
			   "originalName", "positiveInt"
		   });
		addAnnotation
		  (timeEClass,
		   source,
		   new String[] {
			   "originalName", "time"
		   });
		addAnnotation
		  (unsignedIntEClass,
		   source,
		   new String[] {
			   "originalName", "unsignedInt"
		   });
		addAnnotation
		  (urlEClass,
		   source,
		   new String[] {
			   "originalName", "url"
		   });
		addAnnotation
		  (uuidEClass,
		   source,
		   new String[] {
			   "originalName", "uuid"
		   });
		addAnnotation
		  (getAnnotation_Authorx(),
		   source,
		   new String[] {
			   "originalName", "author[x]"
		   });
		addAnnotation
		  (xhtmlEClass,
		   source,
		   new String[] {
			   "originalName", "xhtml"
		   });
		addAnnotation
		  (xhtmlValueEClass,
		   source,
		   new String[] {
			   "originalName", "xhtml_Value"
		   });
		addAnnotation
		  (getDataRequirement_Subjectx(),
		   source,
		   new String[] {
			   "originalName", "subject[x]"
		   });
		addAnnotation
		  (dataRequirementElement1EClass,
		   source,
		   new String[] {
			   "originalName", "DataRequirement_Element1"
		   });
		addAnnotation
		  (dataRequirementElement2EClass,
		   source,
		   new String[] {
			   "originalName", "DataRequirement_Element2"
		   });
		addAnnotation
		  (getDataRequirementElement2_Valuex(),
		   source,
		   new String[] {
			   "originalName", "value[x]"
		   });
		addAnnotation
		  (dataRequirementElement3EClass,
		   source,
		   new String[] {
			   "originalName", "DataRequirement_Element3"
		   });
		addAnnotation
		  (getTriggerDefinition_Timingx(),
		   source,
		   new String[] {
			   "originalName", "timing[x]"
		   });
		addAnnotation
		  (getDosage_AsNeededx(),
		   source,
		   new String[] {
			   "originalName", "asNeeded[x]"
		   });
		addAnnotation
		  (timingElement1EClass,
		   source,
		   new String[] {
			   "originalName", "Timing_Element1"
		   });
		addAnnotation
		  (getTimingElement1_Boundsx(),
		   source,
		   new String[] {
			   "originalName", "bounds[x]"
		   });
		addAnnotation
		  (dosageElement1EClass,
		   source,
		   new String[] {
			   "originalName", "Dosage_Element1"
		   });
		addAnnotation
		  (getDosageElement1_Dosex(),
		   source,
		   new String[] {
			   "originalName", "dose[x]"
		   });
		addAnnotation
		  (getDosageElement1_Ratex(),
		   source,
		   new String[] {
			   "originalName", "rate[x]"
		   });
		addAnnotation
		  (getPopulation_Agex(),
		   source,
		   new String[] {
			   "originalName", "age[x]"
		   });
		addAnnotation
		  (getSubstanceAmount_Amountx(),
		   source,
		   new String[] {
			   "originalName", "amount[x]"
		   });
		addAnnotation
		  (substanceAmountElement1EClass,
		   source,
		   new String[] {
			   "originalName", "SubstanceAmount_Element1"
		   });
		addAnnotation
		  (getElementDefinition_DefaultValuex(),
		   source,
		   new String[] {
			   "originalName", "defaultValue[x]"
		   });
		addAnnotation
		  (getElementDefinition_Fixedx(),
		   source,
		   new String[] {
			   "originalName", "fixed[x]"
		   });
		addAnnotation
		  (getElementDefinition_Patternx(),
		   source,
		   new String[] {
			   "originalName", "pattern[x]"
		   });
		addAnnotation
		  (getElementDefinition_MinValuex(),
		   source,
		   new String[] {
			   "originalName", "minValue[x]"
		   });
		addAnnotation
		  (getElementDefinition_MaxValuex(),
		   source,
		   new String[] {
			   "originalName", "maxValue[x]"
		   });
		addAnnotation
		  (elementDefinitionElement1EClass,
		   source,
		   new String[] {
			   "originalName", "ElementDefinition_Element1"
		   });
		addAnnotation
		  (elementDefinitionElement1Element1EClass,
		   source,
		   new String[] {
			   "originalName", "Element1_Element1"
		   });
		addAnnotation
		  (elementDefinitionElement2EClass,
		   source,
		   new String[] {
			   "originalName", "ElementDefinition_Element2"
		   });
		addAnnotation
		  (elementDefinitionElement3EClass,
		   source,
		   new String[] {
			   "originalName", "ElementDefinition_Element3"
		   });
		addAnnotation
		  (elementDefinitionElement4EClass,
		   source,
		   new String[] {
			   "originalName", "ElementDefinition_Element4"
		   });
		addAnnotation
		  (getElementDefinitionElement4_Valuex(),
		   source,
		   new String[] {
			   "originalName", "value[x]"
		   });
		addAnnotation
		  (elementDefinitionElement5EClass,
		   source,
		   new String[] {
			   "originalName", "ElementDefinition_Element5"
		   });
		addAnnotation
		  (elementDefinitionElement6EClass,
		   source,
		   new String[] {
			   "originalName", "ElementDefinition_Element6"
		   });
		addAnnotation
		  (elementDefinitionElement7EClass,
		   source,
		   new String[] {
			   "originalName", "ElementDefinition_Element7"
		   });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (getBase64Binary_Value(),
		   source,
		   new String[] {
			   "kind", "attribute"
		   });
		addAnnotation
		  (getBoolean_Value(),
		   source,
		   new String[] {
			   "kind", "attribute"
		   });
		addAnnotation
		  (getUri_Value(),
		   source,
		   new String[] {
			   "kind", "attribute"
		   });
		addAnnotation
		  (getString_Value(),
		   source,
		   new String[] {
			   "kind", "attribute"
		   });
		addAnnotation
		  (getDate_Value(),
		   source,
		   new String[] {
			   "kind", "attribute"
		   });
		addAnnotation
		  (getDateTime_Value(),
		   source,
		   new String[] {
			   "kind", "attribute"
		   });
		addAnnotation
		  (getDecimal_Value(),
		   source,
		   new String[] {
			   "kind", "attribute"
		   });
		addAnnotation
		  (getInstant_Value(),
		   source,
		   new String[] {
			   "kind", "attribute"
		   });
		addAnnotation
		  (getInteger_Value(),
		   source,
		   new String[] {
			   "kind", "attribute"
		   });
		addAnnotation
		  (getTime_Value(),
		   source,
		   new String[] {
			   "kind", "attribute"
		   });
	}

} //DataTypesPackageImpl
