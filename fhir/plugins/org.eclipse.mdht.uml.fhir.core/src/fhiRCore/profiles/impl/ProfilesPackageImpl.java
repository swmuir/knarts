/**
 */
package fhiRCore.profiles.impl;

import fhiRCore.dataTypes.DataTypesPackage;

import fhiRCore.dataTypes.impl.DataTypesPackageImpl;

import fhiRCore.profiles.Actualgroup;
import fhiRCore.profiles.Bmi;
import fhiRCore.profiles.BmiCodeableConcept1;
import fhiRCore.profiles.BmiCodeableConcept1Coding1;
import fhiRCore.profiles.BmiQuantity1;
import fhiRCore.profiles.Bodyheight;
import fhiRCore.profiles.BodyheightCodeableConcept1;
import fhiRCore.profiles.BodyheightCodeableConcept1Coding1;
import fhiRCore.profiles.BodyheightQuantity1;
import fhiRCore.profiles.Bodytemp;
import fhiRCore.profiles.BodytempCodeableConcept1;
import fhiRCore.profiles.BodytempCodeableConcept1Coding1;
import fhiRCore.profiles.BodytempQuantity1;
import fhiRCore.profiles.Bodyweight;
import fhiRCore.profiles.BodyweightCodeableConcept1;
import fhiRCore.profiles.BodyweightCodeableConcept1Coding1;
import fhiRCore.profiles.BodyweightQuantity1;
import fhiRCore.profiles.Bp;
import fhiRCore.profiles.BpCodeableConcept1;
import fhiRCore.profiles.BpCodeableConcept1Coding1;
import fhiRCore.profiles.BpComponent11;
import fhiRCore.profiles.BpComponent11CodeableConcept1;
import fhiRCore.profiles.BpComponent11CodeableConcept1Coding1;
import fhiRCore.profiles.BpComponent11Quantity1;
import fhiRCore.profiles.BpComponent12;
import fhiRCore.profiles.BpComponent12CodeableConcept1;
import fhiRCore.profiles.BpComponent12CodeableConcept1Coding1;
import fhiRCore.profiles.BpComponent12Quantity1;
import fhiRCore.profiles.Catalog;
import fhiRCore.profiles.CatalogSection1;
import fhiRCore.profiles.Cdshooksguidanceresponse;
import fhiRCore.profiles.Cdshooksrequestgroup;
import fhiRCore.profiles.CdshooksrequestgroupAction1;
import fhiRCore.profiles.Cdshooksserviceplandefinition;
import fhiRCore.profiles.CdshooksserviceplandefinitionAction1;
import fhiRCore.profiles.Cholesterol;
import fhiRCore.profiles.CholesterolQuantity1;
import fhiRCore.profiles.CholesterolReferenceRange1;
import fhiRCore.profiles.Clinicaldocument;
import fhiRCore.profiles.Computableplandefinition;
import fhiRCore.profiles.Cqfquestionnaire;
import fhiRCore.profiles.Cqllibrary;
import fhiRCore.profiles.Devicemetricobservation;
import fhiRCore.profiles.Diagnosticreportgenetics;
import fhiRCore.profiles.Elementdefinitionde;
import fhiRCore.profiles.ElementdefinitiondeElement31;
import fhiRCore.profiles.Familymemberhistorygenetic;
import fhiRCore.profiles.FamilymemberhistorygeneticCondition1;
import fhiRCore.profiles.Groupdefinition;
import fhiRCore.profiles.Hdlcholesterol;
import fhiRCore.profiles.HdlcholesterolReferenceRange1;
import fhiRCore.profiles.Headcircum;
import fhiRCore.profiles.HeadcircumCodeableConcept1;
import fhiRCore.profiles.HeadcircumCodeableConcept1Coding1;
import fhiRCore.profiles.HeadcircumQuantity1;
import fhiRCore.profiles.Heartrate;
import fhiRCore.profiles.HeartrateCodeableConcept1;
import fhiRCore.profiles.HeartrateCodeableConcept1Coding1;
import fhiRCore.profiles.HeartrateQuantity1;
import fhiRCore.profiles.Hlaresult;
import fhiRCore.profiles.Ldlcholesterol;
import fhiRCore.profiles.LdlcholesterolReferenceRange1;
import fhiRCore.profiles.Lipidprofile;
import fhiRCore.profiles.MetadataResource;
import fhiRCore.profiles.Observationgenetics;
import fhiRCore.profiles.Oxygensat;
import fhiRCore.profiles.OxygensatCodeableConcept1;
import fhiRCore.profiles.OxygensatCodeableConcept1Coding1;
import fhiRCore.profiles.OxygensatQuantity1;
import fhiRCore.profiles.Picoelement;
import fhiRCore.profiles.PicoelementCharacteristic1;
import fhiRCore.profiles.ProfilesFactory;
import fhiRCore.profiles.ProfilesPackage;
import fhiRCore.profiles.Provenancerelevanthistory;
import fhiRCore.profiles.ProvenancerelevanthistoryAgent1;
import fhiRCore.profiles.Resprate;
import fhiRCore.profiles.ResprateCodeableConcept1;
import fhiRCore.profiles.ResprateCodeableConcept1Coding1;
import fhiRCore.profiles.ResprateQuantity1;
import fhiRCore.profiles.Servicerequestgenetics;
import fhiRCore.profiles.Shareableactivitydefinition;
import fhiRCore.profiles.Shareablecodesystem;
import fhiRCore.profiles.ShareablecodesystemConceptDefinition1;
import fhiRCore.profiles.Shareablelibrary;
import fhiRCore.profiles.Shareablemeasure;
import fhiRCore.profiles.Shareableplandefinition;
import fhiRCore.profiles.Shareablevalueset;
import fhiRCore.profiles.SubstanceDefinition;
import fhiRCore.profiles.SubstanceDefinitionCode;
import fhiRCore.profiles.SubstanceDefinitionMoiety;
import fhiRCore.profiles.SubstanceDefinitionName;
import fhiRCore.profiles.SubstanceDefinitionNameOfficial;
import fhiRCore.profiles.SubstanceDefinitionProperty;
import fhiRCore.profiles.SubstanceDefinitionRelationship;
import fhiRCore.profiles.SubstanceDefinitionStructure;
import fhiRCore.profiles.SubstanceDefinitionStructureIsotope;
import fhiRCore.profiles.SubstanceDefinitionStructureIsotopeMolecularWeight;
import fhiRCore.profiles.SubstanceDefinitionStructureRepresentation;
import fhiRCore.profiles.Synchronizationplandefinition;
import fhiRCore.profiles.Synthesis;
import fhiRCore.profiles.Triglyceride;
import fhiRCore.profiles.TriglycerideReferenceRange1;
import fhiRCore.profiles.Vitalsigns;
import fhiRCore.profiles.VitalsignsCodeableConcept1;
import fhiRCore.profiles.VitalsignsCodeableConcept1Coding1;
import fhiRCore.profiles.VitalsignsComponent1;
import fhiRCore.profiles.Vitalspanel;
import fhiRCore.profiles.VitalspanelCodeableConcept1;
import fhiRCore.profiles.VitalspanelCodeableConcept1Coding1;

import fhiRCore.resources.ResourcesPackage;

import fhiRCore.resources.impl.ResourcesPackageImpl;

import fhiRCore.valueSets.ValueSetsPackage;

import fhiRCore.valueSets.impl.ValueSetsPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProfilesPackageImpl extends EPackageImpl implements ProfilesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass picoelementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass picoelementCharacteristic1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bmiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vitalsignsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vitalsignsCodeableConcept1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vitalsignsCodeableConcept1Coding1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vitalsignsComponent1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bmiCodeableConcept1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bmiCodeableConcept1Coding1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bmiQuantity1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass devicemetricobservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdshooksserviceplandefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdshooksserviceplandefinitionAction1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cqfquestionnaireEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass computableplandefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shareablelibraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdshooksguidanceresponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shareableactivitydefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shareablemeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resprateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resprateCodeableConcept1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resprateCodeableConcept1Coding1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resprateQuantity1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass familymemberhistorygeneticEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass familymemberhistorygeneticCondition1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hdlcholesterolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hdlcholesterolReferenceRange1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shareableplandefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lipidprofileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cholesterolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cholesterolQuantity1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cholesterolReferenceRange1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triglycerideEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triglycerideReferenceRange1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ldlcholesterolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ldlcholesterolReferenceRange1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bodytempEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bodytempCodeableConcept1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bodytempCodeableConcept1Coding1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bodytempQuantity1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metadataResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass heartrateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass heartrateCodeableConcept1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass heartrateCodeableConcept1Coding1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass heartrateQuantity1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bodyheightEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bodyheightCodeableConcept1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bodyheightCodeableConcept1Coding1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bodyheightQuantity1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementdefinitiondeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementdefinitiondeElement31EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagnosticreportgeneticsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shareablecodesystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shareablecodesystemConceptDefinition1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oxygensatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oxygensatCodeableConcept1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oxygensatCodeableConcept1Coding1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oxygensatQuantity1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clinicaldocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cqllibraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headcircumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headcircumCodeableConcept1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headcircumCodeableConcept1Coding1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headcircumQuantity1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synchronizationplandefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vitalspanelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vitalspanelCodeableConcept1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vitalspanelCodeableConcept1Coding1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synthesisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass substanceDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass substanceDefinitionMoietyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass substanceDefinitionPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass substanceDefinitionStructureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass substanceDefinitionStructureIsotopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass substanceDefinitionStructureIsotopeMolecularWeightEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass substanceDefinitionStructureRepresentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass substanceDefinitionCodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass substanceDefinitionNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass substanceDefinitionNameOfficialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass substanceDefinitionRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass provenancerelevanthistoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass provenancerelevanthistoryAgent1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catalogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catalogSection1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bodyweightEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bodyweightCodeableConcept1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bodyweightCodeableConcept1Coding1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bodyweightQuantity1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpCodeableConcept1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpCodeableConcept1Coding1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpComponent11EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpComponent11CodeableConcept1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpComponent11CodeableConcept1Coding1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpComponent11Quantity1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpComponent12EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpComponent12CodeableConcept1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpComponent12CodeableConcept1Coding1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpComponent12Quantity1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servicerequestgeneticsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shareablevaluesetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupdefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actualgroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hlaresultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdshooksrequestgroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdshooksrequestgroupAction1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observationgeneticsEClass = null;

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
	 * @see fhiRCore.profiles.ProfilesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProfilesPackageImpl() {
		super(eNS_URI, ProfilesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ProfilesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProfilesPackage init() {
		if (isInited) return (ProfilesPackage)EPackage.Registry.INSTANCE.getEPackage(ProfilesPackage.eNS_URI);

		// Obtain or create and register package
		ProfilesPackageImpl theProfilesPackage = (ProfilesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ProfilesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ProfilesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ValueSetsPackageImpl theValueSetsPackage = (ValueSetsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI) instanceof ValueSetsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ValueSetsPackage.eNS_URI) : ValueSetsPackage.eINSTANCE);
		DataTypesPackageImpl theDataTypesPackage = (DataTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataTypesPackage.eNS_URI) instanceof DataTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataTypesPackage.eNS_URI) : DataTypesPackage.eINSTANCE);
		ResourcesPackageImpl theResourcesPackage = (ResourcesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI) instanceof ResourcesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI) : ResourcesPackage.eINSTANCE);

		// Load packages
		theValueSetsPackage.loadPackage();
		theResourcesPackage.loadPackage();

		// Create package meta-data objects
		theProfilesPackage.createPackageContents();
		theDataTypesPackage.createPackageContents();

		// Initialize created meta-data
		theProfilesPackage.initializePackageContents();
		theDataTypesPackage.initializePackageContents();

		// Fix loaded packages
		theValueSetsPackage.fixPackageContents();
		theResourcesPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theProfilesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProfilesPackage.eNS_URI, theProfilesPackage);
		return theProfilesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPicoelement() {
		return picoelementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPicoelementCharacteristic1() {
		return picoelementCharacteristic1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBmi() {
		return bmiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBmi_ValueQuantity() {
		return (EReference)bmiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVitalsigns() {
		return vitalsignsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVitalsigns_VsCat() {
		return (EReference)vitalsignsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVitalsignsCodeableConcept1() {
		return vitalsignsCodeableConcept1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVitalsignsCodeableConcept1Coding1() {
		return vitalsignsCodeableConcept1Coding1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVitalsignsComponent1() {
		return vitalsignsComponent1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBmiCodeableConcept1() {
		return bmiCodeableConcept1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBmiCodeableConcept1_BmiCode() {
		return (EReference)bmiCodeableConcept1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBmiCodeableConcept1Coding1() {
		return bmiCodeableConcept1Coding1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBmiQuantity1() {
		return bmiQuantity1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevicemetricobservation() {
		return devicemetricobservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevicemetricobservation_EffectiveDateTime() {
		return (EReference)devicemetricobservationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCdshooksserviceplandefinition() {
		return cdshooksserviceplandefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCdshooksserviceplandefinitionAction1() {
		return cdshooksserviceplandefinitionAction1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCdshooksserviceplandefinitionAction1_Definitionx() {
		return (EReference)cdshooksserviceplandefinitionAction1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCqfquestionnaire() {
		return cqfquestionnaireEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComputableplandefinition() {
		return computableplandefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShareablelibrary() {
		return shareablelibraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCdshooksguidanceresponse() {
		return cdshooksguidanceresponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCdshooksguidanceresponse_ModuleUri() {
		return (EReference)cdshooksguidanceresponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShareableactivitydefinition() {
		return shareableactivitydefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShareablemeasure() {
		return shareablemeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResprate() {
		return resprateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResprate_ValueQuantity() {
		return (EReference)resprateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResprateCodeableConcept1() {
		return resprateCodeableConcept1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResprateCodeableConcept1_RespRateCode() {
		return (EReference)resprateCodeableConcept1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResprateCodeableConcept1Coding1() {
		return resprateCodeableConcept1Coding1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResprateQuantity1() {
		return resprateQuantity1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamilymemberhistorygenetic() {
		return familymemberhistorygeneticEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFamilymemberhistorygeneticCondition1() {
		return familymemberhistorygeneticCondition1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHdlcholesterol() {
		return hdlcholesterolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHdlcholesterol_ValueQuantity() {
		return (EReference)hdlcholesterolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHdlcholesterolReferenceRange1() {
		return hdlcholesterolReferenceRange1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShareableplandefinition() {
		return shareableplandefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLipidprofile() {
		return lipidprofileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLipidprofile_Cholesterol() {
		return (EReference)lipidprofileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLipidprofile_Triglyceride() {
		return (EReference)lipidprofileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLipidprofile_HdlCholesterol() {
		return (EReference)lipidprofileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLipidprofile_LdlCholesterol() {
		return (EReference)lipidprofileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCholesterol() {
		return cholesterolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCholesterol_ValueQuantity() {
		return (EReference)cholesterolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCholesterolQuantity1() {
		return cholesterolQuantity1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCholesterolReferenceRange1() {
		return cholesterolReferenceRange1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTriglyceride() {
		return triglycerideEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTriglyceride_ValueQuantity() {
		return (EReference)triglycerideEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTriglycerideReferenceRange1() {
		return triglycerideReferenceRange1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLdlcholesterol() {
		return ldlcholesterolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLdlcholesterol_ValueQuantity() {
		return (EReference)ldlcholesterolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLdlcholesterolReferenceRange1() {
		return ldlcholesterolReferenceRange1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBodytemp() {
		return bodytempEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBodytemp_ValueQuantity() {
		return (EReference)bodytempEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBodytempCodeableConcept1() {
		return bodytempCodeableConcept1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBodytempCodeableConcept1_BodyTempCode() {
		return (EReference)bodytempCodeableConcept1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBodytempCodeableConcept1Coding1() {
		return bodytempCodeableConcept1Coding1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBodytempQuantity1() {
		return bodytempQuantity1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetadataResource() {
		return metadataResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadataResource_Url() {
		return (EReference)metadataResourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadataResource_Version() {
		return (EReference)metadataResourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadataResource_Name() {
		return (EReference)metadataResourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadataResource_Title() {
		return (EReference)metadataResourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadataResource_Status() {
		return (EReference)metadataResourceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadataResource_Experimental() {
		return (EReference)metadataResourceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadataResource_Date() {
		return (EReference)metadataResourceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadataResource_Publisher() {
		return (EReference)metadataResourceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadataResource_Contact() {
		return (EReference)metadataResourceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadataResource_Description() {
		return (EReference)metadataResourceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadataResource_UseContext() {
		return (EReference)metadataResourceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadataResource_Jurisdiction() {
		return (EReference)metadataResourceEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeartrate() {
		return heartrateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeartrate_ValueQuantity() {
		return (EReference)heartrateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeartrateCodeableConcept1() {
		return heartrateCodeableConcept1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeartrateCodeableConcept1_HeartRateCode() {
		return (EReference)heartrateCodeableConcept1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeartrateCodeableConcept1Coding1() {
		return heartrateCodeableConcept1Coding1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeartrateQuantity1() {
		return heartrateQuantity1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBodyheight() {
		return bodyheightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBodyheight_ValueQuantity() {
		return (EReference)bodyheightEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBodyheightCodeableConcept1() {
		return bodyheightCodeableConcept1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBodyheightCodeableConcept1_BodyHeightCode() {
		return (EReference)bodyheightCodeableConcept1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBodyheightCodeableConcept1Coding1() {
		return bodyheightCodeableConcept1Coding1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBodyheightQuantity1() {
		return bodyheightQuantity1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementdefinitionde() {
		return elementdefinitiondeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementdefinitiondeElement31() {
		return elementdefinitiondeElement31EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagnosticreportgenetics() {
		return diagnosticreportgeneticsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShareablecodesystem() {
		return shareablecodesystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShareablecodesystemConceptDefinition1() {
		return shareablecodesystemConceptDefinition1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOxygensat() {
		return oxygensatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOxygensat_ValueQuantity() {
		return (EReference)oxygensatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOxygensatCodeableConcept1() {
		return oxygensatCodeableConcept1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOxygensatCodeableConcept1_OxygenSatCode() {
		return (EReference)oxygensatCodeableConcept1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOxygensatCodeableConcept1Coding1() {
		return oxygensatCodeableConcept1Coding1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOxygensatQuantity1() {
		return oxygensatQuantity1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClinicaldocument() {
		return clinicaldocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCqllibrary() {
		return cqllibraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeadcircum() {
		return headcircumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeadcircum_ValueQuantity() {
		return (EReference)headcircumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeadcircumCodeableConcept1() {
		return headcircumCodeableConcept1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHeadcircumCodeableConcept1_HeadCircumCode() {
		return (EReference)headcircumCodeableConcept1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeadcircumCodeableConcept1Coding1() {
		return headcircumCodeableConcept1Coding1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeadcircumQuantity1() {
		return headcircumQuantity1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSynchronizationplandefinition() {
		return synchronizationplandefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVitalspanel() {
		return vitalspanelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVitalspanelCodeableConcept1() {
		return vitalspanelCodeableConcept1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVitalspanelCodeableConcept1_VitalsPanelCode() {
		return (EReference)vitalspanelCodeableConcept1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVitalspanelCodeableConcept1Coding1() {
		return vitalspanelCodeableConcept1Coding1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSynthesis() {
		return synthesisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubstanceDefinition() {
		return substanceDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinition_Identifier() {
		return (EReference)substanceDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinition_Type() {
		return (EReference)substanceDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinition_Status() {
		return (EReference)substanceDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinition_Domain() {
		return (EReference)substanceDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinition_Description() {
		return (EReference)substanceDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinition_Source() {
		return (EReference)substanceDefinitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinition_Comment() {
		return (EReference)substanceDefinitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinition_Moiety() {
		return (EReference)substanceDefinitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinition_Property() {
		return (EReference)substanceDefinitionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinition_ReferenceInformation() {
		return (EReference)substanceDefinitionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinition_Structure() {
		return (EReference)substanceDefinitionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinition_Code() {
		return (EReference)substanceDefinitionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinition_Name() {
		return (EReference)substanceDefinitionEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinition_MolecularWeight() {
		return (EReference)substanceDefinitionEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinition_Relationship() {
		return (EReference)substanceDefinitionEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinition_NucleicAcid() {
		return (EReference)substanceDefinitionEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinition_Polymer() {
		return (EReference)substanceDefinitionEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinition_Protein() {
		return (EReference)substanceDefinitionEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinition_SourceMaterial() {
		return (EReference)substanceDefinitionEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubstanceDefinitionMoiety() {
		return substanceDefinitionMoietyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinitionMoiety_Role() {
		return (EReference)substanceDefinitionMoietyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinitionMoiety_Identifier() {
		return (EReference)substanceDefinitionMoietyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinitionMoiety_Name() {
		return (EReference)substanceDefinitionMoietyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinitionMoiety_Stereochemistry() {
		return (EReference)substanceDefinitionMoietyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinitionMoiety_OpticalActivity() {
		return (EReference)substanceDefinitionMoietyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinitionMoiety_MolecularFormula() {
		return (EReference)substanceDefinitionMoietyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinitionMoiety_Amountx() {
		return (EReference)substanceDefinitionMoietyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubstanceDefinitionProperty() {
		return substanceDefinitionPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinitionProperty_Category() {
		return (EReference)substanceDefinitionPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinitionProperty_Code() {
		return (EReference)substanceDefinitionPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinitionProperty_Parameters() {
		return (EReference)substanceDefinitionPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinitionProperty_DefiningSubstancex() {
		return (EReference)substanceDefinitionPropertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinitionProperty_Amountx() {
		return (EReference)substanceDefinitionPropertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubstanceDefinitionStructure() {
		return substanceDefinitionStructureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinitionStructure_Stereochemistry() {
		return (EReference)substanceDefinitionStructureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinitionStructure_OpticalActivity() {
		return (EReference)substanceDefinitionStructureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinitionStructure_MolecularFormula() {
		return (EReference)substanceDefinitionStructureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinitionStructure_MolecularFormulaByMoiety() {
		return (EReference)substanceDefinitionStructureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinitionStructure_Isotope() {
		return (EReference)substanceDefinitionStructureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinitionStructure_MolecularWeight() {
		return (EReference)substanceDefinitionStructureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinitionStructure_Source() {
		return (EReference)substanceDefinitionStructureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinitionStructure_Representation() {
		return (EReference)substanceDefinitionStructureEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubstanceDefinitionStructureIsotope() {
		return substanceDefinitionStructureIsotopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinitionStructureIsotope_Identifier() {
		return (EReference)substanceDefinitionStructureIsotopeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinitionStructureIsotope_Name() {
		return (EReference)substanceDefinitionStructureIsotopeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinitionStructureIsotope_Substitution() {
		return (EReference)substanceDefinitionStructureIsotopeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinitionStructureIsotope_HalfLife() {
		return (EReference)substanceDefinitionStructureIsotopeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinitionStructureIsotope_MolecularWeight() {
		return (EReference)substanceDefinitionStructureIsotopeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubstanceDefinitionStructureIsotopeMolecularWeight() {
		return substanceDefinitionStructureIsotopeMolecularWeightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinitionStructureIsotopeMolecularWeight_Method() {
		return (EReference)substanceDefinitionStructureIsotopeMolecularWeightEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinitionStructureIsotopeMolecularWeight_Type() {
		return (EReference)substanceDefinitionStructureIsotopeMolecularWeightEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinitionStructureIsotopeMolecularWeight_Amount() {
		return (EReference)substanceDefinitionStructureIsotopeMolecularWeightEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubstanceDefinitionStructureRepresentation() {
		return substanceDefinitionStructureRepresentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinitionStructureRepresentation_Type() {
		return (EReference)substanceDefinitionStructureRepresentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinitionStructureRepresentation_Representation() {
		return (EReference)substanceDefinitionStructureRepresentationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinitionStructureRepresentation_Attachment() {
		return (EReference)substanceDefinitionStructureRepresentationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubstanceDefinitionCode() {
		return substanceDefinitionCodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinitionCode_Code() {
		return (EReference)substanceDefinitionCodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinitionCode_Status() {
		return (EReference)substanceDefinitionCodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinitionCode_StatusDate() {
		return (EReference)substanceDefinitionCodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinitionCode_Comment() {
		return (EReference)substanceDefinitionCodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinitionCode_Source() {
		return (EReference)substanceDefinitionCodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubstanceDefinitionName() {
		return substanceDefinitionNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinitionName_Name() {
		return (EReference)substanceDefinitionNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinitionName_Type() {
		return (EReference)substanceDefinitionNameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinitionName_Status() {
		return (EReference)substanceDefinitionNameEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinitionName_Preferred() {
		return (EReference)substanceDefinitionNameEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinitionName_Language() {
		return (EReference)substanceDefinitionNameEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinitionName_Domain() {
		return (EReference)substanceDefinitionNameEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinitionName_Jurisdiction() {
		return (EReference)substanceDefinitionNameEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinitionName_Synonym() {
		return (EReference)substanceDefinitionNameEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinitionName_Translation() {
		return (EReference)substanceDefinitionNameEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinitionName_Official() {
		return (EReference)substanceDefinitionNameEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinitionName_Source() {
		return (EReference)substanceDefinitionNameEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubstanceDefinitionNameOfficial() {
		return substanceDefinitionNameOfficialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinitionNameOfficial_Authority() {
		return (EReference)substanceDefinitionNameOfficialEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinitionNameOfficial_Status() {
		return (EReference)substanceDefinitionNameOfficialEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinitionNameOfficial_Date() {
		return (EReference)substanceDefinitionNameOfficialEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubstanceDefinitionRelationship() {
		return substanceDefinitionRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinitionRelationship_Substancex() {
		return (EReference)substanceDefinitionRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinitionRelationship_Relationship() {
		return (EReference)substanceDefinitionRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinitionRelationship_IsDefining() {
		return (EReference)substanceDefinitionRelationshipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinitionRelationship_Amountx() {
		return (EReference)substanceDefinitionRelationshipEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinitionRelationship_AmountRatioLowLimit() {
		return (EReference)substanceDefinitionRelationshipEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinitionRelationship_AmountType() {
		return (EReference)substanceDefinitionRelationshipEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstanceDefinitionRelationship_Source() {
		return (EReference)substanceDefinitionRelationshipEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvenancerelevanthistory() {
		return provenancerelevanthistoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProvenancerelevanthistory_Author() {
		return (EReference)provenancerelevanthistoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvenancerelevanthistoryAgent1() {
		return provenancerelevanthistoryAgent1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCatalog() {
		return catalogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCatalogSection1() {
		return catalogSection1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBodyweight() {
		return bodyweightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBodyweight_ValueQuantity() {
		return (EReference)bodyweightEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBodyweightCodeableConcept1() {
		return bodyweightCodeableConcept1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBodyweightCodeableConcept1_BodyWeightCode() {
		return (EReference)bodyweightCodeableConcept1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBodyweightCodeableConcept1Coding1() {
		return bodyweightCodeableConcept1Coding1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBodyweightQuantity1() {
		return bodyweightQuantity1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBp() {
		return bpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBp_SystolicBp() {
		return (EReference)bpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBp_DiastolicBp() {
		return (EReference)bpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBpCodeableConcept1() {
		return bpCodeableConcept1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBpCodeableConcept1_BpCode() {
		return (EReference)bpCodeableConcept1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBpCodeableConcept1Coding1() {
		return bpCodeableConcept1Coding1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBpComponent11() {
		return bpComponent11EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBpComponent11_ValueQuantity() {
		return (EReference)bpComponent11EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBpComponent11CodeableConcept1() {
		return bpComponent11CodeableConcept1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBpComponent11CodeableConcept1_SbpCode() {
		return (EReference)bpComponent11CodeableConcept1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBpComponent11CodeableConcept1Coding1() {
		return bpComponent11CodeableConcept1Coding1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBpComponent11Quantity1() {
		return bpComponent11Quantity1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBpComponent12() {
		return bpComponent12EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBpComponent12_ValueQuantity() {
		return (EReference)bpComponent12EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBpComponent12CodeableConcept1() {
		return bpComponent12CodeableConcept1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBpComponent12CodeableConcept1_DbpCode() {
		return (EReference)bpComponent12CodeableConcept1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBpComponent12CodeableConcept1Coding1() {
		return bpComponent12CodeableConcept1Coding1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBpComponent12Quantity1() {
		return bpComponent12Quantity1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServicerequestgenetics() {
		return servicerequestgeneticsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShareablevalueset() {
		return shareablevaluesetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupdefinition() {
		return groupdefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActualgroup() {
		return actualgroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHlaresult() {
		return hlaresultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCdshooksrequestgroup() {
		return cdshooksrequestgroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCdshooksrequestgroupAction1() {
		return cdshooksrequestgroupAction1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObservationgenetics() {
		return observationgeneticsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfilesFactory getProfilesFactory() {
		return (ProfilesFactory)getEFactoryInstance();
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
		picoelementEClass = createEClass(PICOELEMENT);

		picoelementCharacteristic1EClass = createEClass(PICOELEMENT_CHARACTERISTIC1);

		bmiEClass = createEClass(BMI);
		createEReference(bmiEClass, BMI__VALUE_QUANTITY);

		vitalsignsEClass = createEClass(VITALSIGNS);
		createEReference(vitalsignsEClass, VITALSIGNS__VS_CAT);

		vitalsignsCodeableConcept1EClass = createEClass(VITALSIGNS_CODEABLE_CONCEPT1);

		vitalsignsCodeableConcept1Coding1EClass = createEClass(VITALSIGNS_CODEABLE_CONCEPT1_CODING1);

		vitalsignsComponent1EClass = createEClass(VITALSIGNS_COMPONENT1);

		bmiCodeableConcept1EClass = createEClass(BMI_CODEABLE_CONCEPT1);
		createEReference(bmiCodeableConcept1EClass, BMI_CODEABLE_CONCEPT1__BMI_CODE);

		bmiCodeableConcept1Coding1EClass = createEClass(BMI_CODEABLE_CONCEPT1_CODING1);

		bmiQuantity1EClass = createEClass(BMI_QUANTITY1);

		devicemetricobservationEClass = createEClass(DEVICEMETRICOBSERVATION);
		createEReference(devicemetricobservationEClass, DEVICEMETRICOBSERVATION__EFFECTIVE_DATE_TIME);

		cdshooksserviceplandefinitionEClass = createEClass(CDSHOOKSSERVICEPLANDEFINITION);

		cdshooksserviceplandefinitionAction1EClass = createEClass(CDSHOOKSSERVICEPLANDEFINITION_ACTION1);
		createEReference(cdshooksserviceplandefinitionAction1EClass, CDSHOOKSSERVICEPLANDEFINITION_ACTION1__DEFINITIONX);

		cqfquestionnaireEClass = createEClass(CQFQUESTIONNAIRE);

		computableplandefinitionEClass = createEClass(COMPUTABLEPLANDEFINITION);

		shareablelibraryEClass = createEClass(SHAREABLELIBRARY);

		cdshooksguidanceresponseEClass = createEClass(CDSHOOKSGUIDANCERESPONSE);
		createEReference(cdshooksguidanceresponseEClass, CDSHOOKSGUIDANCERESPONSE__MODULE_URI);

		shareableactivitydefinitionEClass = createEClass(SHAREABLEACTIVITYDEFINITION);

		shareablemeasureEClass = createEClass(SHAREABLEMEASURE);

		resprateEClass = createEClass(RESPRATE);
		createEReference(resprateEClass, RESPRATE__VALUE_QUANTITY);

		resprateCodeableConcept1EClass = createEClass(RESPRATE_CODEABLE_CONCEPT1);
		createEReference(resprateCodeableConcept1EClass, RESPRATE_CODEABLE_CONCEPT1__RESP_RATE_CODE);

		resprateCodeableConcept1Coding1EClass = createEClass(RESPRATE_CODEABLE_CONCEPT1_CODING1);

		resprateQuantity1EClass = createEClass(RESPRATE_QUANTITY1);

		familymemberhistorygeneticEClass = createEClass(FAMILYMEMBERHISTORYGENETIC);

		familymemberhistorygeneticCondition1EClass = createEClass(FAMILYMEMBERHISTORYGENETIC_CONDITION1);

		hdlcholesterolEClass = createEClass(HDLCHOLESTEROL);
		createEReference(hdlcholesterolEClass, HDLCHOLESTEROL__VALUE_QUANTITY);

		hdlcholesterolReferenceRange1EClass = createEClass(HDLCHOLESTEROL_REFERENCE_RANGE1);

		shareableplandefinitionEClass = createEClass(SHAREABLEPLANDEFINITION);

		lipidprofileEClass = createEClass(LIPIDPROFILE);
		createEReference(lipidprofileEClass, LIPIDPROFILE__CHOLESTEROL);
		createEReference(lipidprofileEClass, LIPIDPROFILE__TRIGLYCERIDE);
		createEReference(lipidprofileEClass, LIPIDPROFILE__HDL_CHOLESTEROL);
		createEReference(lipidprofileEClass, LIPIDPROFILE__LDL_CHOLESTEROL);

		cholesterolEClass = createEClass(CHOLESTEROL);
		createEReference(cholesterolEClass, CHOLESTEROL__VALUE_QUANTITY);

		cholesterolQuantity1EClass = createEClass(CHOLESTEROL_QUANTITY1);

		cholesterolReferenceRange1EClass = createEClass(CHOLESTEROL_REFERENCE_RANGE1);

		triglycerideEClass = createEClass(TRIGLYCERIDE);
		createEReference(triglycerideEClass, TRIGLYCERIDE__VALUE_QUANTITY);

		triglycerideReferenceRange1EClass = createEClass(TRIGLYCERIDE_REFERENCE_RANGE1);

		ldlcholesterolEClass = createEClass(LDLCHOLESTEROL);
		createEReference(ldlcholesterolEClass, LDLCHOLESTEROL__VALUE_QUANTITY);

		ldlcholesterolReferenceRange1EClass = createEClass(LDLCHOLESTEROL_REFERENCE_RANGE1);

		bodytempEClass = createEClass(BODYTEMP);
		createEReference(bodytempEClass, BODYTEMP__VALUE_QUANTITY);

		bodytempCodeableConcept1EClass = createEClass(BODYTEMP_CODEABLE_CONCEPT1);
		createEReference(bodytempCodeableConcept1EClass, BODYTEMP_CODEABLE_CONCEPT1__BODY_TEMP_CODE);

		bodytempCodeableConcept1Coding1EClass = createEClass(BODYTEMP_CODEABLE_CONCEPT1_CODING1);

		bodytempQuantity1EClass = createEClass(BODYTEMP_QUANTITY1);

		metadataResourceEClass = createEClass(METADATA_RESOURCE);
		createEReference(metadataResourceEClass, METADATA_RESOURCE__URL);
		createEReference(metadataResourceEClass, METADATA_RESOURCE__VERSION);
		createEReference(metadataResourceEClass, METADATA_RESOURCE__NAME);
		createEReference(metadataResourceEClass, METADATA_RESOURCE__TITLE);
		createEReference(metadataResourceEClass, METADATA_RESOURCE__STATUS);
		createEReference(metadataResourceEClass, METADATA_RESOURCE__EXPERIMENTAL);
		createEReference(metadataResourceEClass, METADATA_RESOURCE__DATE);
		createEReference(metadataResourceEClass, METADATA_RESOURCE__PUBLISHER);
		createEReference(metadataResourceEClass, METADATA_RESOURCE__CONTACT);
		createEReference(metadataResourceEClass, METADATA_RESOURCE__DESCRIPTION);
		createEReference(metadataResourceEClass, METADATA_RESOURCE__USE_CONTEXT);
		createEReference(metadataResourceEClass, METADATA_RESOURCE__JURISDICTION);

		heartrateEClass = createEClass(HEARTRATE);
		createEReference(heartrateEClass, HEARTRATE__VALUE_QUANTITY);

		heartrateCodeableConcept1EClass = createEClass(HEARTRATE_CODEABLE_CONCEPT1);
		createEReference(heartrateCodeableConcept1EClass, HEARTRATE_CODEABLE_CONCEPT1__HEART_RATE_CODE);

		heartrateCodeableConcept1Coding1EClass = createEClass(HEARTRATE_CODEABLE_CONCEPT1_CODING1);

		heartrateQuantity1EClass = createEClass(HEARTRATE_QUANTITY1);

		bodyheightEClass = createEClass(BODYHEIGHT);
		createEReference(bodyheightEClass, BODYHEIGHT__VALUE_QUANTITY);

		bodyheightCodeableConcept1EClass = createEClass(BODYHEIGHT_CODEABLE_CONCEPT1);
		createEReference(bodyheightCodeableConcept1EClass, BODYHEIGHT_CODEABLE_CONCEPT1__BODY_HEIGHT_CODE);

		bodyheightCodeableConcept1Coding1EClass = createEClass(BODYHEIGHT_CODEABLE_CONCEPT1_CODING1);

		bodyheightQuantity1EClass = createEClass(BODYHEIGHT_QUANTITY1);

		elementdefinitiondeEClass = createEClass(ELEMENTDEFINITIONDE);

		elementdefinitiondeElement31EClass = createEClass(ELEMENTDEFINITIONDE_ELEMENT31);

		diagnosticreportgeneticsEClass = createEClass(DIAGNOSTICREPORTGENETICS);

		shareablecodesystemEClass = createEClass(SHAREABLECODESYSTEM);

		shareablecodesystemConceptDefinition1EClass = createEClass(SHAREABLECODESYSTEM_CONCEPT_DEFINITION1);

		oxygensatEClass = createEClass(OXYGENSAT);
		createEReference(oxygensatEClass, OXYGENSAT__VALUE_QUANTITY);

		oxygensatCodeableConcept1EClass = createEClass(OXYGENSAT_CODEABLE_CONCEPT1);
		createEReference(oxygensatCodeableConcept1EClass, OXYGENSAT_CODEABLE_CONCEPT1__OXYGEN_SAT_CODE);

		oxygensatCodeableConcept1Coding1EClass = createEClass(OXYGENSAT_CODEABLE_CONCEPT1_CODING1);

		oxygensatQuantity1EClass = createEClass(OXYGENSAT_QUANTITY1);

		clinicaldocumentEClass = createEClass(CLINICALDOCUMENT);

		cqllibraryEClass = createEClass(CQLLIBRARY);

		headcircumEClass = createEClass(HEADCIRCUM);
		createEReference(headcircumEClass, HEADCIRCUM__VALUE_QUANTITY);

		headcircumCodeableConcept1EClass = createEClass(HEADCIRCUM_CODEABLE_CONCEPT1);
		createEReference(headcircumCodeableConcept1EClass, HEADCIRCUM_CODEABLE_CONCEPT1__HEAD_CIRCUM_CODE);

		headcircumCodeableConcept1Coding1EClass = createEClass(HEADCIRCUM_CODEABLE_CONCEPT1_CODING1);

		headcircumQuantity1EClass = createEClass(HEADCIRCUM_QUANTITY1);

		synchronizationplandefinitionEClass = createEClass(SYNCHRONIZATIONPLANDEFINITION);

		vitalspanelEClass = createEClass(VITALSPANEL);

		vitalspanelCodeableConcept1EClass = createEClass(VITALSPANEL_CODEABLE_CONCEPT1);
		createEReference(vitalspanelCodeableConcept1EClass, VITALSPANEL_CODEABLE_CONCEPT1__VITALS_PANEL_CODE);

		vitalspanelCodeableConcept1Coding1EClass = createEClass(VITALSPANEL_CODEABLE_CONCEPT1_CODING1);

		synthesisEClass = createEClass(SYNTHESIS);

		substanceDefinitionEClass = createEClass(SUBSTANCE_DEFINITION);
		createEReference(substanceDefinitionEClass, SUBSTANCE_DEFINITION__IDENTIFIER);
		createEReference(substanceDefinitionEClass, SUBSTANCE_DEFINITION__TYPE);
		createEReference(substanceDefinitionEClass, SUBSTANCE_DEFINITION__STATUS);
		createEReference(substanceDefinitionEClass, SUBSTANCE_DEFINITION__DOMAIN);
		createEReference(substanceDefinitionEClass, SUBSTANCE_DEFINITION__DESCRIPTION);
		createEReference(substanceDefinitionEClass, SUBSTANCE_DEFINITION__SOURCE);
		createEReference(substanceDefinitionEClass, SUBSTANCE_DEFINITION__COMMENT);
		createEReference(substanceDefinitionEClass, SUBSTANCE_DEFINITION__MOIETY);
		createEReference(substanceDefinitionEClass, SUBSTANCE_DEFINITION__PROPERTY);
		createEReference(substanceDefinitionEClass, SUBSTANCE_DEFINITION__REFERENCE_INFORMATION);
		createEReference(substanceDefinitionEClass, SUBSTANCE_DEFINITION__STRUCTURE);
		createEReference(substanceDefinitionEClass, SUBSTANCE_DEFINITION__CODE);
		createEReference(substanceDefinitionEClass, SUBSTANCE_DEFINITION__NAME);
		createEReference(substanceDefinitionEClass, SUBSTANCE_DEFINITION__MOLECULAR_WEIGHT);
		createEReference(substanceDefinitionEClass, SUBSTANCE_DEFINITION__RELATIONSHIP);
		createEReference(substanceDefinitionEClass, SUBSTANCE_DEFINITION__NUCLEIC_ACID);
		createEReference(substanceDefinitionEClass, SUBSTANCE_DEFINITION__POLYMER);
		createEReference(substanceDefinitionEClass, SUBSTANCE_DEFINITION__PROTEIN);
		createEReference(substanceDefinitionEClass, SUBSTANCE_DEFINITION__SOURCE_MATERIAL);

		substanceDefinitionMoietyEClass = createEClass(SUBSTANCE_DEFINITION_MOIETY);
		createEReference(substanceDefinitionMoietyEClass, SUBSTANCE_DEFINITION_MOIETY__ROLE);
		createEReference(substanceDefinitionMoietyEClass, SUBSTANCE_DEFINITION_MOIETY__IDENTIFIER);
		createEReference(substanceDefinitionMoietyEClass, SUBSTANCE_DEFINITION_MOIETY__NAME);
		createEReference(substanceDefinitionMoietyEClass, SUBSTANCE_DEFINITION_MOIETY__STEREOCHEMISTRY);
		createEReference(substanceDefinitionMoietyEClass, SUBSTANCE_DEFINITION_MOIETY__OPTICAL_ACTIVITY);
		createEReference(substanceDefinitionMoietyEClass, SUBSTANCE_DEFINITION_MOIETY__MOLECULAR_FORMULA);
		createEReference(substanceDefinitionMoietyEClass, SUBSTANCE_DEFINITION_MOIETY__AMOUNTX);

		substanceDefinitionPropertyEClass = createEClass(SUBSTANCE_DEFINITION_PROPERTY);
		createEReference(substanceDefinitionPropertyEClass, SUBSTANCE_DEFINITION_PROPERTY__CATEGORY);
		createEReference(substanceDefinitionPropertyEClass, SUBSTANCE_DEFINITION_PROPERTY__CODE);
		createEReference(substanceDefinitionPropertyEClass, SUBSTANCE_DEFINITION_PROPERTY__PARAMETERS);
		createEReference(substanceDefinitionPropertyEClass, SUBSTANCE_DEFINITION_PROPERTY__DEFINING_SUBSTANCEX);
		createEReference(substanceDefinitionPropertyEClass, SUBSTANCE_DEFINITION_PROPERTY__AMOUNTX);

		substanceDefinitionStructureEClass = createEClass(SUBSTANCE_DEFINITION_STRUCTURE);
		createEReference(substanceDefinitionStructureEClass, SUBSTANCE_DEFINITION_STRUCTURE__STEREOCHEMISTRY);
		createEReference(substanceDefinitionStructureEClass, SUBSTANCE_DEFINITION_STRUCTURE__OPTICAL_ACTIVITY);
		createEReference(substanceDefinitionStructureEClass, SUBSTANCE_DEFINITION_STRUCTURE__MOLECULAR_FORMULA);
		createEReference(substanceDefinitionStructureEClass, SUBSTANCE_DEFINITION_STRUCTURE__MOLECULAR_FORMULA_BY_MOIETY);
		createEReference(substanceDefinitionStructureEClass, SUBSTANCE_DEFINITION_STRUCTURE__ISOTOPE);
		createEReference(substanceDefinitionStructureEClass, SUBSTANCE_DEFINITION_STRUCTURE__MOLECULAR_WEIGHT);
		createEReference(substanceDefinitionStructureEClass, SUBSTANCE_DEFINITION_STRUCTURE__SOURCE);
		createEReference(substanceDefinitionStructureEClass, SUBSTANCE_DEFINITION_STRUCTURE__REPRESENTATION);

		substanceDefinitionStructureIsotopeEClass = createEClass(SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE);
		createEReference(substanceDefinitionStructureIsotopeEClass, SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__IDENTIFIER);
		createEReference(substanceDefinitionStructureIsotopeEClass, SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__NAME);
		createEReference(substanceDefinitionStructureIsotopeEClass, SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__SUBSTITUTION);
		createEReference(substanceDefinitionStructureIsotopeEClass, SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__HALF_LIFE);
		createEReference(substanceDefinitionStructureIsotopeEClass, SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE__MOLECULAR_WEIGHT);

		substanceDefinitionStructureIsotopeMolecularWeightEClass = createEClass(SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE_MOLECULAR_WEIGHT);
		createEReference(substanceDefinitionStructureIsotopeMolecularWeightEClass, SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE_MOLECULAR_WEIGHT__METHOD);
		createEReference(substanceDefinitionStructureIsotopeMolecularWeightEClass, SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE_MOLECULAR_WEIGHT__TYPE);
		createEReference(substanceDefinitionStructureIsotopeMolecularWeightEClass, SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE_MOLECULAR_WEIGHT__AMOUNT);

		substanceDefinitionStructureRepresentationEClass = createEClass(SUBSTANCE_DEFINITION_STRUCTURE_REPRESENTATION);
		createEReference(substanceDefinitionStructureRepresentationEClass, SUBSTANCE_DEFINITION_STRUCTURE_REPRESENTATION__TYPE);
		createEReference(substanceDefinitionStructureRepresentationEClass, SUBSTANCE_DEFINITION_STRUCTURE_REPRESENTATION__REPRESENTATION);
		createEReference(substanceDefinitionStructureRepresentationEClass, SUBSTANCE_DEFINITION_STRUCTURE_REPRESENTATION__ATTACHMENT);

		substanceDefinitionCodeEClass = createEClass(SUBSTANCE_DEFINITION_CODE);
		createEReference(substanceDefinitionCodeEClass, SUBSTANCE_DEFINITION_CODE__CODE);
		createEReference(substanceDefinitionCodeEClass, SUBSTANCE_DEFINITION_CODE__STATUS);
		createEReference(substanceDefinitionCodeEClass, SUBSTANCE_DEFINITION_CODE__STATUS_DATE);
		createEReference(substanceDefinitionCodeEClass, SUBSTANCE_DEFINITION_CODE__COMMENT);
		createEReference(substanceDefinitionCodeEClass, SUBSTANCE_DEFINITION_CODE__SOURCE);

		substanceDefinitionNameEClass = createEClass(SUBSTANCE_DEFINITION_NAME);
		createEReference(substanceDefinitionNameEClass, SUBSTANCE_DEFINITION_NAME__NAME);
		createEReference(substanceDefinitionNameEClass, SUBSTANCE_DEFINITION_NAME__TYPE);
		createEReference(substanceDefinitionNameEClass, SUBSTANCE_DEFINITION_NAME__STATUS);
		createEReference(substanceDefinitionNameEClass, SUBSTANCE_DEFINITION_NAME__PREFERRED);
		createEReference(substanceDefinitionNameEClass, SUBSTANCE_DEFINITION_NAME__LANGUAGE);
		createEReference(substanceDefinitionNameEClass, SUBSTANCE_DEFINITION_NAME__DOMAIN);
		createEReference(substanceDefinitionNameEClass, SUBSTANCE_DEFINITION_NAME__JURISDICTION);
		createEReference(substanceDefinitionNameEClass, SUBSTANCE_DEFINITION_NAME__SYNONYM);
		createEReference(substanceDefinitionNameEClass, SUBSTANCE_DEFINITION_NAME__TRANSLATION);
		createEReference(substanceDefinitionNameEClass, SUBSTANCE_DEFINITION_NAME__OFFICIAL);
		createEReference(substanceDefinitionNameEClass, SUBSTANCE_DEFINITION_NAME__SOURCE);

		substanceDefinitionNameOfficialEClass = createEClass(SUBSTANCE_DEFINITION_NAME_OFFICIAL);
		createEReference(substanceDefinitionNameOfficialEClass, SUBSTANCE_DEFINITION_NAME_OFFICIAL__AUTHORITY);
		createEReference(substanceDefinitionNameOfficialEClass, SUBSTANCE_DEFINITION_NAME_OFFICIAL__STATUS);
		createEReference(substanceDefinitionNameOfficialEClass, SUBSTANCE_DEFINITION_NAME_OFFICIAL__DATE);

		substanceDefinitionRelationshipEClass = createEClass(SUBSTANCE_DEFINITION_RELATIONSHIP);
		createEReference(substanceDefinitionRelationshipEClass, SUBSTANCE_DEFINITION_RELATIONSHIP__SUBSTANCEX);
		createEReference(substanceDefinitionRelationshipEClass, SUBSTANCE_DEFINITION_RELATIONSHIP__RELATIONSHIP);
		createEReference(substanceDefinitionRelationshipEClass, SUBSTANCE_DEFINITION_RELATIONSHIP__IS_DEFINING);
		createEReference(substanceDefinitionRelationshipEClass, SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNTX);
		createEReference(substanceDefinitionRelationshipEClass, SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNT_RATIO_LOW_LIMIT);
		createEReference(substanceDefinitionRelationshipEClass, SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNT_TYPE);
		createEReference(substanceDefinitionRelationshipEClass, SUBSTANCE_DEFINITION_RELATIONSHIP__SOURCE);

		provenancerelevanthistoryEClass = createEClass(PROVENANCERELEVANTHISTORY);
		createEReference(provenancerelevanthistoryEClass, PROVENANCERELEVANTHISTORY__AUTHOR);

		provenancerelevanthistoryAgent1EClass = createEClass(PROVENANCERELEVANTHISTORY_AGENT1);

		catalogEClass = createEClass(CATALOG);

		catalogSection1EClass = createEClass(CATALOG_SECTION1);

		bodyweightEClass = createEClass(BODYWEIGHT);
		createEReference(bodyweightEClass, BODYWEIGHT__VALUE_QUANTITY);

		bodyweightCodeableConcept1EClass = createEClass(BODYWEIGHT_CODEABLE_CONCEPT1);
		createEReference(bodyweightCodeableConcept1EClass, BODYWEIGHT_CODEABLE_CONCEPT1__BODY_WEIGHT_CODE);

		bodyweightCodeableConcept1Coding1EClass = createEClass(BODYWEIGHT_CODEABLE_CONCEPT1_CODING1);

		bodyweightQuantity1EClass = createEClass(BODYWEIGHT_QUANTITY1);

		bpEClass = createEClass(BP);
		createEReference(bpEClass, BP__SYSTOLIC_BP);
		createEReference(bpEClass, BP__DIASTOLIC_BP);

		bpCodeableConcept1EClass = createEClass(BP_CODEABLE_CONCEPT1);
		createEReference(bpCodeableConcept1EClass, BP_CODEABLE_CONCEPT1__BP_CODE);

		bpCodeableConcept1Coding1EClass = createEClass(BP_CODEABLE_CONCEPT1_CODING1);

		bpComponent11EClass = createEClass(BP_COMPONENT11);
		createEReference(bpComponent11EClass, BP_COMPONENT11__VALUE_QUANTITY);

		bpComponent11CodeableConcept1EClass = createEClass(BP_COMPONENT11_CODEABLE_CONCEPT1);
		createEReference(bpComponent11CodeableConcept1EClass, BP_COMPONENT11_CODEABLE_CONCEPT1__SBP_CODE);

		bpComponent11CodeableConcept1Coding1EClass = createEClass(BP_COMPONENT11_CODEABLE_CONCEPT1_CODING1);

		bpComponent11Quantity1EClass = createEClass(BP_COMPONENT11_QUANTITY1);

		bpComponent12EClass = createEClass(BP_COMPONENT12);
		createEReference(bpComponent12EClass, BP_COMPONENT12__VALUE_QUANTITY);

		bpComponent12CodeableConcept1EClass = createEClass(BP_COMPONENT12_CODEABLE_CONCEPT1);
		createEReference(bpComponent12CodeableConcept1EClass, BP_COMPONENT12_CODEABLE_CONCEPT1__DBP_CODE);

		bpComponent12CodeableConcept1Coding1EClass = createEClass(BP_COMPONENT12_CODEABLE_CONCEPT1_CODING1);

		bpComponent12Quantity1EClass = createEClass(BP_COMPONENT12_QUANTITY1);

		servicerequestgeneticsEClass = createEClass(SERVICEREQUESTGENETICS);

		shareablevaluesetEClass = createEClass(SHAREABLEVALUESET);

		groupdefinitionEClass = createEClass(GROUPDEFINITION);

		actualgroupEClass = createEClass(ACTUALGROUP);

		hlaresultEClass = createEClass(HLARESULT);

		cdshooksrequestgroupEClass = createEClass(CDSHOOKSREQUESTGROUP);

		cdshooksrequestgroupAction1EClass = createEClass(CDSHOOKSREQUESTGROUP_ACTION1);

		observationgeneticsEClass = createEClass(OBSERVATIONGENETICS);
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
		ResourcesPackage theResourcesPackage = (ResourcesPackage)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI);
		DataTypesPackage theDataTypesPackage = (DataTypesPackage)EPackage.Registry.INSTANCE.getEPackage(DataTypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		picoelementEClass.getESuperTypes().add(theResourcesPackage.getEvidenceVariable());
		picoelementCharacteristic1EClass.getESuperTypes().add(theResourcesPackage.getEvidenceVariableCharacteristic());
		bmiEClass.getESuperTypes().add(this.getVitalsigns());
		vitalsignsEClass.getESuperTypes().add(theResourcesPackage.getObservation());
		vitalsignsCodeableConcept1EClass.getESuperTypes().add(theDataTypesPackage.getCodeableConcept());
		vitalsignsCodeableConcept1Coding1EClass.getESuperTypes().add(theDataTypesPackage.getCoding());
		vitalsignsComponent1EClass.getESuperTypes().add(theResourcesPackage.getObservationComponent());
		bmiCodeableConcept1EClass.getESuperTypes().add(theDataTypesPackage.getCodeableConcept());
		bmiCodeableConcept1Coding1EClass.getESuperTypes().add(theDataTypesPackage.getCoding());
		bmiQuantity1EClass.getESuperTypes().add(theDataTypesPackage.getQuantity());
		devicemetricobservationEClass.getESuperTypes().add(theResourcesPackage.getObservation());
		cdshooksserviceplandefinitionEClass.getESuperTypes().add(theResourcesPackage.getPlanDefinition());
		cdshooksserviceplandefinitionAction1EClass.getESuperTypes().add(theResourcesPackage.getPlanDefinitionAction());
		cqfquestionnaireEClass.getESuperTypes().add(theResourcesPackage.getQuestionnaire());
		computableplandefinitionEClass.getESuperTypes().add(theResourcesPackage.getPlanDefinition());
		shareablelibraryEClass.getESuperTypes().add(theResourcesPackage.getLibrary());
		cdshooksguidanceresponseEClass.getESuperTypes().add(theResourcesPackage.getGuidanceResponse());
		shareableactivitydefinitionEClass.getESuperTypes().add(theResourcesPackage.getActivityDefinition());
		shareablemeasureEClass.getESuperTypes().add(theResourcesPackage.getMeasure());
		resprateEClass.getESuperTypes().add(this.getVitalsigns());
		resprateCodeableConcept1EClass.getESuperTypes().add(theDataTypesPackage.getCodeableConcept());
		resprateCodeableConcept1Coding1EClass.getESuperTypes().add(theDataTypesPackage.getCoding());
		resprateQuantity1EClass.getESuperTypes().add(theDataTypesPackage.getQuantity());
		familymemberhistorygeneticEClass.getESuperTypes().add(theResourcesPackage.getFamilyMemberHistory());
		familymemberhistorygeneticCondition1EClass.getESuperTypes().add(theResourcesPackage.getFamilyMemberHistoryCondition());
		hdlcholesterolEClass.getESuperTypes().add(theResourcesPackage.getObservation());
		hdlcholesterolReferenceRange1EClass.getESuperTypes().add(theResourcesPackage.getObservationReferenceRange());
		shareableplandefinitionEClass.getESuperTypes().add(theResourcesPackage.getPlanDefinition());
		lipidprofileEClass.getESuperTypes().add(theResourcesPackage.getDiagnosticReport());
		cholesterolEClass.getESuperTypes().add(theResourcesPackage.getObservation());
		cholesterolQuantity1EClass.getESuperTypes().add(theDataTypesPackage.getQuantity());
		cholesterolReferenceRange1EClass.getESuperTypes().add(theResourcesPackage.getObservationReferenceRange());
		triglycerideEClass.getESuperTypes().add(theResourcesPackage.getObservation());
		triglycerideReferenceRange1EClass.getESuperTypes().add(theResourcesPackage.getObservationReferenceRange());
		ldlcholesterolEClass.getESuperTypes().add(theResourcesPackage.getObservation());
		ldlcholesterolReferenceRange1EClass.getESuperTypes().add(theResourcesPackage.getObservationReferenceRange());
		bodytempEClass.getESuperTypes().add(this.getVitalsigns());
		bodytempCodeableConcept1EClass.getESuperTypes().add(theDataTypesPackage.getCodeableConcept());
		bodytempCodeableConcept1Coding1EClass.getESuperTypes().add(theDataTypesPackage.getCoding());
		bodytempQuantity1EClass.getESuperTypes().add(theDataTypesPackage.getQuantity());
		metadataResourceEClass.getESuperTypes().add(theResourcesPackage.getDomainResource());
		heartrateEClass.getESuperTypes().add(this.getVitalsigns());
		heartrateCodeableConcept1EClass.getESuperTypes().add(theDataTypesPackage.getCodeableConcept());
		heartrateCodeableConcept1Coding1EClass.getESuperTypes().add(theDataTypesPackage.getCoding());
		heartrateQuantity1EClass.getESuperTypes().add(theDataTypesPackage.getQuantity());
		bodyheightEClass.getESuperTypes().add(this.getVitalsigns());
		bodyheightCodeableConcept1EClass.getESuperTypes().add(theDataTypesPackage.getCodeableConcept());
		bodyheightCodeableConcept1Coding1EClass.getESuperTypes().add(theDataTypesPackage.getCoding());
		bodyheightQuantity1EClass.getESuperTypes().add(theDataTypesPackage.getQuantity());
		elementdefinitiondeEClass.getESuperTypes().add(theDataTypesPackage.getElementDefinition());
		elementdefinitiondeElement31EClass.getESuperTypes().add(theDataTypesPackage.getElementDefinitionElement3());
		diagnosticreportgeneticsEClass.getESuperTypes().add(theResourcesPackage.getDiagnosticReport());
		shareablecodesystemEClass.getESuperTypes().add(theResourcesPackage.getCodeSystem());
		shareablecodesystemConceptDefinition1EClass.getESuperTypes().add(theResourcesPackage.getCodeSystemConceptDefinition());
		oxygensatEClass.getESuperTypes().add(this.getVitalsigns());
		oxygensatCodeableConcept1EClass.getESuperTypes().add(theDataTypesPackage.getCodeableConcept());
		oxygensatCodeableConcept1Coding1EClass.getESuperTypes().add(theDataTypesPackage.getCoding());
		oxygensatQuantity1EClass.getESuperTypes().add(theDataTypesPackage.getQuantity());
		clinicaldocumentEClass.getESuperTypes().add(theResourcesPackage.getComposition());
		cqllibraryEClass.getESuperTypes().add(theResourcesPackage.getLibrary());
		headcircumEClass.getESuperTypes().add(this.getVitalsigns());
		headcircumCodeableConcept1EClass.getESuperTypes().add(theDataTypesPackage.getCodeableConcept());
		headcircumCodeableConcept1Coding1EClass.getESuperTypes().add(theDataTypesPackage.getCoding());
		headcircumQuantity1EClass.getESuperTypes().add(theDataTypesPackage.getQuantity());
		synchronizationplandefinitionEClass.getESuperTypes().add(theResourcesPackage.getPlanDefinition());
		vitalspanelEClass.getESuperTypes().add(this.getVitalsigns());
		vitalspanelCodeableConcept1EClass.getESuperTypes().add(theDataTypesPackage.getCodeableConcept());
		vitalspanelCodeableConcept1Coding1EClass.getESuperTypes().add(theDataTypesPackage.getCoding());
		synthesisEClass.getESuperTypes().add(theResourcesPackage.getEvidence());
		substanceDefinitionEClass.getESuperTypes().add(theResourcesPackage.getDomainResource());
		substanceDefinitionMoietyEClass.getESuperTypes().add(theDataTypesPackage.getBackboneElement());
		substanceDefinitionPropertyEClass.getESuperTypes().add(theDataTypesPackage.getBackboneElement());
		substanceDefinitionStructureEClass.getESuperTypes().add(theDataTypesPackage.getBackboneElement());
		substanceDefinitionStructureIsotopeEClass.getESuperTypes().add(theDataTypesPackage.getBackboneElement());
		substanceDefinitionStructureIsotopeMolecularWeightEClass.getESuperTypes().add(theDataTypesPackage.getBackboneElement());
		substanceDefinitionStructureRepresentationEClass.getESuperTypes().add(theDataTypesPackage.getBackboneElement());
		substanceDefinitionCodeEClass.getESuperTypes().add(theDataTypesPackage.getBackboneElement());
		substanceDefinitionNameEClass.getESuperTypes().add(theDataTypesPackage.getBackboneElement());
		substanceDefinitionNameOfficialEClass.getESuperTypes().add(theDataTypesPackage.getBackboneElement());
		substanceDefinitionRelationshipEClass.getESuperTypes().add(theDataTypesPackage.getBackboneElement());
		provenancerelevanthistoryEClass.getESuperTypes().add(theResourcesPackage.getProvenance());
		provenancerelevanthistoryAgent1EClass.getESuperTypes().add(theResourcesPackage.getProvenanceAgent());
		catalogEClass.getESuperTypes().add(theResourcesPackage.getComposition());
		catalogSection1EClass.getESuperTypes().add(theResourcesPackage.getCompositionSection());
		bodyweightEClass.getESuperTypes().add(this.getVitalsigns());
		bodyweightCodeableConcept1EClass.getESuperTypes().add(theDataTypesPackage.getCodeableConcept());
		bodyweightCodeableConcept1Coding1EClass.getESuperTypes().add(theDataTypesPackage.getCoding());
		bodyweightQuantity1EClass.getESuperTypes().add(theDataTypesPackage.getQuantity());
		bpEClass.getESuperTypes().add(this.getVitalsigns());
		bpCodeableConcept1EClass.getESuperTypes().add(theDataTypesPackage.getCodeableConcept());
		bpCodeableConcept1Coding1EClass.getESuperTypes().add(theDataTypesPackage.getCoding());
		bpComponent11EClass.getESuperTypes().add(this.getVitalsignsComponent1());
		bpComponent11CodeableConcept1EClass.getESuperTypes().add(theDataTypesPackage.getCodeableConcept());
		bpComponent11CodeableConcept1Coding1EClass.getESuperTypes().add(theDataTypesPackage.getCoding());
		bpComponent11Quantity1EClass.getESuperTypes().add(theDataTypesPackage.getQuantity());
		bpComponent12EClass.getESuperTypes().add(this.getVitalsignsComponent1());
		bpComponent12CodeableConcept1EClass.getESuperTypes().add(theDataTypesPackage.getCodeableConcept());
		bpComponent12CodeableConcept1Coding1EClass.getESuperTypes().add(theDataTypesPackage.getCoding());
		bpComponent12Quantity1EClass.getESuperTypes().add(theDataTypesPackage.getQuantity());
		servicerequestgeneticsEClass.getESuperTypes().add(theResourcesPackage.getServiceRequest());
		shareablevaluesetEClass.getESuperTypes().add(theResourcesPackage.getValueSet());
		groupdefinitionEClass.getESuperTypes().add(theResourcesPackage.getGroup());
		actualgroupEClass.getESuperTypes().add(theResourcesPackage.getGroup());
		hlaresultEClass.getESuperTypes().add(theResourcesPackage.getDiagnosticReport());
		cdshooksrequestgroupEClass.getESuperTypes().add(theResourcesPackage.getRequestGroup());
		cdshooksrequestgroupAction1EClass.getESuperTypes().add(theResourcesPackage.getRequestGroupAction());
		observationgeneticsEClass.getESuperTypes().add(theResourcesPackage.getObservation());

		// Initialize classes, features, and operations; add parameters
		initEClass(picoelementEClass, Picoelement.class, "Picoelement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(picoelementCharacteristic1EClass, PicoelementCharacteristic1.class, "PicoelementCharacteristic1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bmiEClass, Bmi.class, "Bmi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBmi_ValueQuantity(), this.getBmiQuantity1(), null, "valueQuantity", null, 1, 1, Bmi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vitalsignsEClass, Vitalsigns.class, "Vitalsigns", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVitalsigns_VsCat(), this.getVitalsignsCodeableConcept1(), null, "vsCat", null, 1, 1, Vitalsigns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vitalsignsCodeableConcept1EClass, VitalsignsCodeableConcept1.class, "VitalsignsCodeableConcept1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vitalsignsCodeableConcept1Coding1EClass, VitalsignsCodeableConcept1Coding1.class, "VitalsignsCodeableConcept1Coding1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vitalsignsComponent1EClass, VitalsignsComponent1.class, "VitalsignsComponent1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bmiCodeableConcept1EClass, BmiCodeableConcept1.class, "BmiCodeableConcept1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBmiCodeableConcept1_BmiCode(), this.getBmiCodeableConcept1Coding1(), null, "bmiCode", null, 1, 1, BmiCodeableConcept1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bmiCodeableConcept1Coding1EClass, BmiCodeableConcept1Coding1.class, "BmiCodeableConcept1Coding1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bmiQuantity1EClass, BmiQuantity1.class, "BmiQuantity1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(devicemetricobservationEClass, Devicemetricobservation.class, "Devicemetricobservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDevicemetricobservation_EffectiveDateTime(), theDataTypesPackage.getDateTime(), null, "effectiveDateTime", null, 1, 1, Devicemetricobservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cdshooksserviceplandefinitionEClass, Cdshooksserviceplandefinition.class, "Cdshooksserviceplandefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cdshooksserviceplandefinitionAction1EClass, CdshooksserviceplandefinitionAction1.class, "CdshooksserviceplandefinitionAction1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCdshooksserviceplandefinitionAction1_Definitionx(), theDataTypesPackage.getDataType(), null, "definitionx", null, 0, 1, CdshooksserviceplandefinitionAction1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cqfquestionnaireEClass, Cqfquestionnaire.class, "Cqfquestionnaire", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(computableplandefinitionEClass, Computableplandefinition.class, "Computableplandefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(shareablelibraryEClass, Shareablelibrary.class, "Shareablelibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cdshooksguidanceresponseEClass, Cdshooksguidanceresponse.class, "Cdshooksguidanceresponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCdshooksguidanceresponse_ModuleUri(), theDataTypesPackage.getUri(), null, "moduleUri", null, 1, 1, Cdshooksguidanceresponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shareableactivitydefinitionEClass, Shareableactivitydefinition.class, "Shareableactivitydefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(shareablemeasureEClass, Shareablemeasure.class, "Shareablemeasure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resprateEClass, Resprate.class, "Resprate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResprate_ValueQuantity(), this.getResprateQuantity1(), null, "valueQuantity", null, 0, 1, Resprate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resprateCodeableConcept1EClass, ResprateCodeableConcept1.class, "ResprateCodeableConcept1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResprateCodeableConcept1_RespRateCode(), this.getResprateCodeableConcept1Coding1(), null, "respRateCode", null, 1, 1, ResprateCodeableConcept1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resprateCodeableConcept1Coding1EClass, ResprateCodeableConcept1Coding1.class, "ResprateCodeableConcept1Coding1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resprateQuantity1EClass, ResprateQuantity1.class, "ResprateQuantity1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(familymemberhistorygeneticEClass, Familymemberhistorygenetic.class, "Familymemberhistorygenetic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(familymemberhistorygeneticCondition1EClass, FamilymemberhistorygeneticCondition1.class, "FamilymemberhistorygeneticCondition1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hdlcholesterolEClass, Hdlcholesterol.class, "Hdlcholesterol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHdlcholesterol_ValueQuantity(), theDataTypesPackage.getQuantity(), null, "valueQuantity", null, 0, 1, Hdlcholesterol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hdlcholesterolReferenceRange1EClass, HdlcholesterolReferenceRange1.class, "HdlcholesterolReferenceRange1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(shareableplandefinitionEClass, Shareableplandefinition.class, "Shareableplandefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lipidprofileEClass, Lipidprofile.class, "Lipidprofile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLipidprofile_Cholesterol(), theDataTypesPackage.getReference(), null, "cholesterol", null, 1, 1, Lipidprofile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLipidprofile_Triglyceride(), theDataTypesPackage.getReference(), null, "triglyceride", null, 1, 1, Lipidprofile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLipidprofile_HdlCholesterol(), theDataTypesPackage.getReference(), null, "hdlCholesterol", null, 1, 1, Lipidprofile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLipidprofile_LdlCholesterol(), theDataTypesPackage.getReference(), null, "ldlCholesterol", null, 0, 1, Lipidprofile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cholesterolEClass, Cholesterol.class, "Cholesterol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCholesterol_ValueQuantity(), this.getCholesterolQuantity1(), null, "valueQuantity", null, 0, 1, Cholesterol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cholesterolQuantity1EClass, CholesterolQuantity1.class, "CholesterolQuantity1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cholesterolReferenceRange1EClass, CholesterolReferenceRange1.class, "CholesterolReferenceRange1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(triglycerideEClass, Triglyceride.class, "Triglyceride", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTriglyceride_ValueQuantity(), theDataTypesPackage.getQuantity(), null, "valueQuantity", null, 0, 1, Triglyceride.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triglycerideReferenceRange1EClass, TriglycerideReferenceRange1.class, "TriglycerideReferenceRange1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ldlcholesterolEClass, Ldlcholesterol.class, "Ldlcholesterol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLdlcholesterol_ValueQuantity(), theDataTypesPackage.getQuantity(), null, "valueQuantity", null, 0, 1, Ldlcholesterol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ldlcholesterolReferenceRange1EClass, LdlcholesterolReferenceRange1.class, "LdlcholesterolReferenceRange1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bodytempEClass, Bodytemp.class, "Bodytemp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBodytemp_ValueQuantity(), this.getBodytempQuantity1(), null, "valueQuantity", null, 0, 1, Bodytemp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bodytempCodeableConcept1EClass, BodytempCodeableConcept1.class, "BodytempCodeableConcept1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBodytempCodeableConcept1_BodyTempCode(), this.getBodytempCodeableConcept1Coding1(), null, "bodyTempCode", null, 1, 1, BodytempCodeableConcept1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bodytempCodeableConcept1Coding1EClass, BodytempCodeableConcept1Coding1.class, "BodytempCodeableConcept1Coding1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bodytempQuantity1EClass, BodytempQuantity1.class, "BodytempQuantity1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(metadataResourceEClass, MetadataResource.class, "MetadataResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetadataResource_Url(), theDataTypesPackage.getUri(), null, "url", null, 0, 1, MetadataResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadataResource_Version(), theDataTypesPackage.getString(), null, "version", null, 0, 1, MetadataResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadataResource_Name(), theDataTypesPackage.getString(), null, "name", null, 0, 1, MetadataResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadataResource_Title(), theDataTypesPackage.getString(), null, "title", null, 0, 1, MetadataResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadataResource_Status(), theDataTypesPackage.getCode(), null, "status", null, 1, 1, MetadataResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadataResource_Experimental(), theDataTypesPackage.getBoolean(), null, "experimental", null, 0, 1, MetadataResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadataResource_Date(), theDataTypesPackage.getDateTime(), null, "date", null, 0, 1, MetadataResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadataResource_Publisher(), theDataTypesPackage.getString(), null, "publisher", null, 0, 1, MetadataResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadataResource_Contact(), theDataTypesPackage.getContactDetail(), null, "contact", null, 0, -1, MetadataResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadataResource_Description(), theDataTypesPackage.getMarkdown(), null, "description", null, 0, 1, MetadataResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadataResource_UseContext(), theDataTypesPackage.getUsageContext(), null, "useContext", null, 0, -1, MetadataResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadataResource_Jurisdiction(), theDataTypesPackage.getCodeableConcept(), null, "jurisdiction", null, 0, -1, MetadataResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(heartrateEClass, Heartrate.class, "Heartrate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHeartrate_ValueQuantity(), this.getHeartrateQuantity1(), null, "valueQuantity", null, 0, 1, Heartrate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(heartrateCodeableConcept1EClass, HeartrateCodeableConcept1.class, "HeartrateCodeableConcept1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHeartrateCodeableConcept1_HeartRateCode(), this.getHeartrateCodeableConcept1Coding1(), null, "heartRateCode", null, 1, 1, HeartrateCodeableConcept1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(heartrateCodeableConcept1Coding1EClass, HeartrateCodeableConcept1Coding1.class, "HeartrateCodeableConcept1Coding1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(heartrateQuantity1EClass, HeartrateQuantity1.class, "HeartrateQuantity1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bodyheightEClass, Bodyheight.class, "Bodyheight", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBodyheight_ValueQuantity(), this.getBodyheightQuantity1(), null, "valueQuantity", null, 0, 1, Bodyheight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bodyheightCodeableConcept1EClass, BodyheightCodeableConcept1.class, "BodyheightCodeableConcept1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBodyheightCodeableConcept1_BodyHeightCode(), this.getBodyheightCodeableConcept1Coding1(), null, "bodyHeightCode", null, 1, 1, BodyheightCodeableConcept1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bodyheightCodeableConcept1Coding1EClass, BodyheightCodeableConcept1Coding1.class, "BodyheightCodeableConcept1Coding1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bodyheightQuantity1EClass, BodyheightQuantity1.class, "BodyheightQuantity1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(elementdefinitiondeEClass, Elementdefinitionde.class, "Elementdefinitionde", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(elementdefinitiondeElement31EClass, ElementdefinitiondeElement31.class, "ElementdefinitiondeElement31", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(diagnosticreportgeneticsEClass, Diagnosticreportgenetics.class, "Diagnosticreportgenetics", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(shareablecodesystemEClass, Shareablecodesystem.class, "Shareablecodesystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(shareablecodesystemConceptDefinition1EClass, ShareablecodesystemConceptDefinition1.class, "ShareablecodesystemConceptDefinition1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(oxygensatEClass, Oxygensat.class, "Oxygensat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOxygensat_ValueQuantity(), this.getOxygensatQuantity1(), null, "valueQuantity", null, 0, 1, Oxygensat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oxygensatCodeableConcept1EClass, OxygensatCodeableConcept1.class, "OxygensatCodeableConcept1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOxygensatCodeableConcept1_OxygenSatCode(), this.getOxygensatCodeableConcept1Coding1(), null, "oxygenSatCode", null, 1, 1, OxygensatCodeableConcept1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oxygensatCodeableConcept1Coding1EClass, OxygensatCodeableConcept1Coding1.class, "OxygensatCodeableConcept1Coding1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(oxygensatQuantity1EClass, OxygensatQuantity1.class, "OxygensatQuantity1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(clinicaldocumentEClass, Clinicaldocument.class, "Clinicaldocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cqllibraryEClass, Cqllibrary.class, "Cqllibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(headcircumEClass, Headcircum.class, "Headcircum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHeadcircum_ValueQuantity(), this.getHeadcircumQuantity1(), null, "valueQuantity", null, 0, 1, Headcircum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(headcircumCodeableConcept1EClass, HeadcircumCodeableConcept1.class, "HeadcircumCodeableConcept1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHeadcircumCodeableConcept1_HeadCircumCode(), this.getHeadcircumCodeableConcept1Coding1(), null, "headCircumCode", null, 1, 1, HeadcircumCodeableConcept1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(headcircumCodeableConcept1Coding1EClass, HeadcircumCodeableConcept1Coding1.class, "HeadcircumCodeableConcept1Coding1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(headcircumQuantity1EClass, HeadcircumQuantity1.class, "HeadcircumQuantity1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(synchronizationplandefinitionEClass, Synchronizationplandefinition.class, "Synchronizationplandefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vitalspanelEClass, Vitalspanel.class, "Vitalspanel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vitalspanelCodeableConcept1EClass, VitalspanelCodeableConcept1.class, "VitalspanelCodeableConcept1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVitalspanelCodeableConcept1_VitalsPanelCode(), this.getVitalspanelCodeableConcept1Coding1(), null, "vitalsPanelCode", null, 0, -1, VitalspanelCodeableConcept1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vitalspanelCodeableConcept1Coding1EClass, VitalspanelCodeableConcept1Coding1.class, "VitalspanelCodeableConcept1Coding1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(synthesisEClass, Synthesis.class, "Synthesis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(substanceDefinitionEClass, SubstanceDefinition.class, "SubstanceDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubstanceDefinition_Identifier(), theDataTypesPackage.getIdentifier(), null, "identifier", null, 0, 1, SubstanceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinition_Type(), theDataTypesPackage.getCodeableConcept(), null, "type", null, 0, 1, SubstanceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinition_Status(), theDataTypesPackage.getCodeableConcept(), null, "status", null, 0, 1, SubstanceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinition_Domain(), theDataTypesPackage.getCodeableConcept(), null, "domain", null, 0, 1, SubstanceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinition_Description(), theDataTypesPackage.getString(), null, "description", null, 0, 1, SubstanceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinition_Source(), theDataTypesPackage.getReference(), null, "source", null, 0, -1, SubstanceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinition_Comment(), theDataTypesPackage.getString(), null, "comment", null, 0, 1, SubstanceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinition_Moiety(), this.getSubstanceDefinitionMoiety(), null, "moiety", null, 0, -1, SubstanceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinition_Property(), this.getSubstanceDefinitionProperty(), null, "property", null, 0, -1, SubstanceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinition_ReferenceInformation(), theDataTypesPackage.getReference(), null, "referenceInformation", null, 0, 1, SubstanceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinition_Structure(), this.getSubstanceDefinitionStructure(), null, "structure", null, 0, 1, SubstanceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinition_Code(), this.getSubstanceDefinitionCode(), null, "code", null, 0, -1, SubstanceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinition_Name(), this.getSubstanceDefinitionName(), null, "name", null, 0, -1, SubstanceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinition_MolecularWeight(), this.getSubstanceDefinitionStructureIsotopeMolecularWeight(), null, "molecularWeight", null, 0, -1, SubstanceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinition_Relationship(), this.getSubstanceDefinitionRelationship(), null, "relationship", null, 0, -1, SubstanceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinition_NucleicAcid(), theDataTypesPackage.getReference(), null, "nucleicAcid", null, 0, 1, SubstanceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinition_Polymer(), theDataTypesPackage.getReference(), null, "polymer", null, 0, 1, SubstanceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinition_Protein(), theDataTypesPackage.getReference(), null, "protein", null, 0, 1, SubstanceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinition_SourceMaterial(), theDataTypesPackage.getReference(), null, "sourceMaterial", null, 0, 1, SubstanceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(substanceDefinitionMoietyEClass, SubstanceDefinitionMoiety.class, "SubstanceDefinitionMoiety", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubstanceDefinitionMoiety_Role(), theDataTypesPackage.getCodeableConcept(), null, "role", null, 0, 1, SubstanceDefinitionMoiety.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinitionMoiety_Identifier(), theDataTypesPackage.getIdentifier(), null, "identifier", null, 0, 1, SubstanceDefinitionMoiety.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinitionMoiety_Name(), theDataTypesPackage.getString(), null, "name", null, 0, 1, SubstanceDefinitionMoiety.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinitionMoiety_Stereochemistry(), theDataTypesPackage.getCodeableConcept(), null, "stereochemistry", null, 0, 1, SubstanceDefinitionMoiety.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinitionMoiety_OpticalActivity(), theDataTypesPackage.getCodeableConcept(), null, "opticalActivity", null, 0, 1, SubstanceDefinitionMoiety.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinitionMoiety_MolecularFormula(), theDataTypesPackage.getString(), null, "molecularFormula", null, 0, 1, SubstanceDefinitionMoiety.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinitionMoiety_Amountx(), theDataTypesPackage.getDataType(), null, "amountx", null, 0, 1, SubstanceDefinitionMoiety.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(substanceDefinitionPropertyEClass, SubstanceDefinitionProperty.class, "SubstanceDefinitionProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubstanceDefinitionProperty_Category(), theDataTypesPackage.getCodeableConcept(), null, "category", null, 0, 1, SubstanceDefinitionProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinitionProperty_Code(), theDataTypesPackage.getCodeableConcept(), null, "code", null, 0, 1, SubstanceDefinitionProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinitionProperty_Parameters(), theDataTypesPackage.getString(), null, "parameters", null, 0, 1, SubstanceDefinitionProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinitionProperty_DefiningSubstancex(), theDataTypesPackage.getDataType(), null, "definingSubstancex", null, 0, 1, SubstanceDefinitionProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinitionProperty_Amountx(), theDataTypesPackage.getDataType(), null, "amountx", null, 0, 1, SubstanceDefinitionProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(substanceDefinitionStructureEClass, SubstanceDefinitionStructure.class, "SubstanceDefinitionStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubstanceDefinitionStructure_Stereochemistry(), theDataTypesPackage.getCodeableConcept(), null, "stereochemistry", null, 0, 1, SubstanceDefinitionStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinitionStructure_OpticalActivity(), theDataTypesPackage.getCodeableConcept(), null, "opticalActivity", null, 0, 1, SubstanceDefinitionStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinitionStructure_MolecularFormula(), theDataTypesPackage.getString(), null, "molecularFormula", null, 0, 1, SubstanceDefinitionStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinitionStructure_MolecularFormulaByMoiety(), theDataTypesPackage.getString(), null, "molecularFormulaByMoiety", null, 0, 1, SubstanceDefinitionStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinitionStructure_Isotope(), this.getSubstanceDefinitionStructureIsotope(), null, "isotope", null, 0, -1, SubstanceDefinitionStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinitionStructure_MolecularWeight(), this.getSubstanceDefinitionStructureIsotopeMolecularWeight(), null, "molecularWeight", null, 0, 1, SubstanceDefinitionStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinitionStructure_Source(), theDataTypesPackage.getReference(), null, "source", null, 0, -1, SubstanceDefinitionStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinitionStructure_Representation(), this.getSubstanceDefinitionStructureRepresentation(), null, "representation", null, 0, -1, SubstanceDefinitionStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(substanceDefinitionStructureIsotopeEClass, SubstanceDefinitionStructureIsotope.class, "SubstanceDefinitionStructureIsotope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubstanceDefinitionStructureIsotope_Identifier(), theDataTypesPackage.getIdentifier(), null, "identifier", null, 0, 1, SubstanceDefinitionStructureIsotope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinitionStructureIsotope_Name(), theDataTypesPackage.getCodeableConcept(), null, "name", null, 0, 1, SubstanceDefinitionStructureIsotope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinitionStructureIsotope_Substitution(), theDataTypesPackage.getCodeableConcept(), null, "substitution", null, 0, 1, SubstanceDefinitionStructureIsotope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinitionStructureIsotope_HalfLife(), theDataTypesPackage.getQuantity(), null, "halfLife", null, 0, 1, SubstanceDefinitionStructureIsotope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinitionStructureIsotope_MolecularWeight(), this.getSubstanceDefinitionStructureIsotopeMolecularWeight(), null, "molecularWeight", null, 0, 1, SubstanceDefinitionStructureIsotope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(substanceDefinitionStructureIsotopeMolecularWeightEClass, SubstanceDefinitionStructureIsotopeMolecularWeight.class, "SubstanceDefinitionStructureIsotopeMolecularWeight", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubstanceDefinitionStructureIsotopeMolecularWeight_Method(), theDataTypesPackage.getCodeableConcept(), null, "method", null, 0, 1, SubstanceDefinitionStructureIsotopeMolecularWeight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinitionStructureIsotopeMolecularWeight_Type(), theDataTypesPackage.getCodeableConcept(), null, "type", null, 0, 1, SubstanceDefinitionStructureIsotopeMolecularWeight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinitionStructureIsotopeMolecularWeight_Amount(), theDataTypesPackage.getQuantity(), null, "amount", null, 0, 1, SubstanceDefinitionStructureIsotopeMolecularWeight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(substanceDefinitionStructureRepresentationEClass, SubstanceDefinitionStructureRepresentation.class, "SubstanceDefinitionStructureRepresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubstanceDefinitionStructureRepresentation_Type(), theDataTypesPackage.getCodeableConcept(), null, "type", null, 0, 1, SubstanceDefinitionStructureRepresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinitionStructureRepresentation_Representation(), theDataTypesPackage.getString(), null, "representation", null, 0, 1, SubstanceDefinitionStructureRepresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinitionStructureRepresentation_Attachment(), theDataTypesPackage.getAttachment(), null, "attachment", null, 0, 1, SubstanceDefinitionStructureRepresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(substanceDefinitionCodeEClass, SubstanceDefinitionCode.class, "SubstanceDefinitionCode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubstanceDefinitionCode_Code(), theDataTypesPackage.getCodeableConcept(), null, "code", null, 0, 1, SubstanceDefinitionCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinitionCode_Status(), theDataTypesPackage.getCodeableConcept(), null, "status", null, 0, 1, SubstanceDefinitionCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinitionCode_StatusDate(), theDataTypesPackage.getDateTime(), null, "statusDate", null, 0, 1, SubstanceDefinitionCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinitionCode_Comment(), theDataTypesPackage.getString(), null, "comment", null, 0, 1, SubstanceDefinitionCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinitionCode_Source(), theDataTypesPackage.getReference(), null, "source", null, 0, -1, SubstanceDefinitionCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(substanceDefinitionNameEClass, SubstanceDefinitionName.class, "SubstanceDefinitionName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubstanceDefinitionName_Name(), theDataTypesPackage.getString(), null, "name", null, 1, 1, SubstanceDefinitionName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinitionName_Type(), theDataTypesPackage.getCodeableConcept(), null, "type", null, 0, 1, SubstanceDefinitionName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinitionName_Status(), theDataTypesPackage.getCodeableConcept(), null, "status", null, 0, 1, SubstanceDefinitionName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinitionName_Preferred(), theDataTypesPackage.getBoolean(), null, "preferred", null, 0, 1, SubstanceDefinitionName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinitionName_Language(), theDataTypesPackage.getCodeableConcept(), null, "language", null, 0, -1, SubstanceDefinitionName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinitionName_Domain(), theDataTypesPackage.getCodeableConcept(), null, "domain", null, 0, -1, SubstanceDefinitionName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinitionName_Jurisdiction(), theDataTypesPackage.getCodeableConcept(), null, "jurisdiction", null, 0, -1, SubstanceDefinitionName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinitionName_Synonym(), this.getSubstanceDefinitionName(), null, "synonym", null, 0, -1, SubstanceDefinitionName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinitionName_Translation(), this.getSubstanceDefinitionName(), null, "translation", null, 0, -1, SubstanceDefinitionName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinitionName_Official(), this.getSubstanceDefinitionNameOfficial(), null, "official", null, 0, -1, SubstanceDefinitionName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinitionName_Source(), theDataTypesPackage.getReference(), null, "source", null, 0, -1, SubstanceDefinitionName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(substanceDefinitionNameOfficialEClass, SubstanceDefinitionNameOfficial.class, "SubstanceDefinitionNameOfficial", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubstanceDefinitionNameOfficial_Authority(), theDataTypesPackage.getCodeableConcept(), null, "authority", null, 0, 1, SubstanceDefinitionNameOfficial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinitionNameOfficial_Status(), theDataTypesPackage.getCodeableConcept(), null, "status", null, 0, 1, SubstanceDefinitionNameOfficial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinitionNameOfficial_Date(), theDataTypesPackage.getDateTime(), null, "date", null, 0, 1, SubstanceDefinitionNameOfficial.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(substanceDefinitionRelationshipEClass, SubstanceDefinitionRelationship.class, "SubstanceDefinitionRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubstanceDefinitionRelationship_Substancex(), theDataTypesPackage.getDataType(), null, "substancex", null, 0, 1, SubstanceDefinitionRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinitionRelationship_Relationship(), theDataTypesPackage.getCodeableConcept(), null, "relationship", null, 0, 1, SubstanceDefinitionRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinitionRelationship_IsDefining(), theDataTypesPackage.getBoolean(), null, "isDefining", null, 0, 1, SubstanceDefinitionRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinitionRelationship_Amountx(), theDataTypesPackage.getDataType(), null, "amountx", null, 0, 1, SubstanceDefinitionRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinitionRelationship_AmountRatioLowLimit(), theDataTypesPackage.getRatio(), null, "amountRatioLowLimit", null, 0, 1, SubstanceDefinitionRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinitionRelationship_AmountType(), theDataTypesPackage.getCodeableConcept(), null, "amountType", null, 0, 1, SubstanceDefinitionRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubstanceDefinitionRelationship_Source(), theDataTypesPackage.getReference(), null, "source", null, 0, -1, SubstanceDefinitionRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(provenancerelevanthistoryEClass, Provenancerelevanthistory.class, "Provenancerelevanthistory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProvenancerelevanthistory_Author(), this.getProvenancerelevanthistoryAgent1(), null, "author", null, 0, 1, Provenancerelevanthistory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(provenancerelevanthistoryAgent1EClass, ProvenancerelevanthistoryAgent1.class, "ProvenancerelevanthistoryAgent1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(catalogEClass, Catalog.class, "Catalog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(catalogSection1EClass, CatalogSection1.class, "CatalogSection1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bodyweightEClass, Bodyweight.class, "Bodyweight", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBodyweight_ValueQuantity(), this.getBodyweightQuantity1(), null, "valueQuantity", null, 0, 1, Bodyweight.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bodyweightCodeableConcept1EClass, BodyweightCodeableConcept1.class, "BodyweightCodeableConcept1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBodyweightCodeableConcept1_BodyWeightCode(), this.getBodyweightCodeableConcept1Coding1(), null, "bodyWeightCode", null, 1, 1, BodyweightCodeableConcept1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bodyweightCodeableConcept1Coding1EClass, BodyweightCodeableConcept1Coding1.class, "BodyweightCodeableConcept1Coding1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bodyweightQuantity1EClass, BodyweightQuantity1.class, "BodyweightQuantity1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpEClass, Bp.class, "Bp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBp_SystolicBp(), this.getBpComponent11(), null, "systolicBp", null, 1, 1, Bp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBp_DiastolicBp(), this.getBpComponent12(), null, "diastolicBp", null, 1, 1, Bp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bpCodeableConcept1EClass, BpCodeableConcept1.class, "BpCodeableConcept1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBpCodeableConcept1_BpCode(), this.getBpCodeableConcept1Coding1(), null, "bpCode", null, 1, 1, BpCodeableConcept1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bpCodeableConcept1Coding1EClass, BpCodeableConcept1Coding1.class, "BpCodeableConcept1Coding1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpComponent11EClass, BpComponent11.class, "BpComponent11", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBpComponent11_ValueQuantity(), this.getBpComponent11Quantity1(), null, "valueQuantity", null, 0, 1, BpComponent11.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bpComponent11CodeableConcept1EClass, BpComponent11CodeableConcept1.class, "BpComponent11CodeableConcept1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBpComponent11CodeableConcept1_SbpCode(), this.getBpComponent11CodeableConcept1Coding1(), null, "sbpCode", null, 1, 1, BpComponent11CodeableConcept1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bpComponent11CodeableConcept1Coding1EClass, BpComponent11CodeableConcept1Coding1.class, "BpComponent11CodeableConcept1Coding1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpComponent11Quantity1EClass, BpComponent11Quantity1.class, "BpComponent11Quantity1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpComponent12EClass, BpComponent12.class, "BpComponent12", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBpComponent12_ValueQuantity(), this.getBpComponent12Quantity1(), null, "valueQuantity", null, 0, 1, BpComponent12.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bpComponent12CodeableConcept1EClass, BpComponent12CodeableConcept1.class, "BpComponent12CodeableConcept1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBpComponent12CodeableConcept1_DbpCode(), this.getBpComponent12CodeableConcept1Coding1(), null, "dbpCode", null, 1, 1, BpComponent12CodeableConcept1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bpComponent12CodeableConcept1Coding1EClass, BpComponent12CodeableConcept1Coding1.class, "BpComponent12CodeableConcept1Coding1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bpComponent12Quantity1EClass, BpComponent12Quantity1.class, "BpComponent12Quantity1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(servicerequestgeneticsEClass, Servicerequestgenetics.class, "Servicerequestgenetics", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(shareablevaluesetEClass, Shareablevalueset.class, "Shareablevalueset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(groupdefinitionEClass, Groupdefinition.class, "Groupdefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actualgroupEClass, Actualgroup.class, "Actualgroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hlaresultEClass, Hlaresult.class, "Hlaresult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cdshooksrequestgroupEClass, Cdshooksrequestgroup.class, "Cdshooksrequestgroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cdshooksrequestgroupAction1EClass, CdshooksrequestgroupAction1.class, "CdshooksrequestgroupAction1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(observationgeneticsEClass, Observationgenetics.class, "Observationgenetics", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
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
			 "originalName", "Profiles"
		   });	
		addAnnotation
		  (picoelementEClass, 
		   source, 
		   new String[] {
			 "originalName", "picoelement"
		   });	
		addAnnotation
		  (picoelementCharacteristic1EClass, 
		   source, 
		   new String[] {
			 "originalName", "picoelement_Characteristic1"
		   });	
		addAnnotation
		  (bmiEClass, 
		   source, 
		   new String[] {
			 "originalName", "bmi"
		   });	
		addAnnotation
		  (vitalsignsEClass, 
		   source, 
		   new String[] {
			 "originalName", "vitalsigns"
		   });	
		addAnnotation
		  (getVitalsigns_VsCat(), 
		   source, 
		   new String[] {
			 "originalName", "VSCat"
		   });	
		addAnnotation
		  (vitalsignsCodeableConcept1EClass, 
		   source, 
		   new String[] {
			 "originalName", "vitalsigns_CodeableConcept1"
		   });	
		addAnnotation
		  (vitalsignsCodeableConcept1Coding1EClass, 
		   source, 
		   new String[] {
			 "originalName", "CodeableConcept1_Coding1"
		   });	
		addAnnotation
		  (vitalsignsComponent1EClass, 
		   source, 
		   new String[] {
			 "originalName", "vitalsigns_Component1"
		   });	
		addAnnotation
		  (bmiCodeableConcept1EClass, 
		   source, 
		   new String[] {
			 "originalName", "bmi_CodeableConcept1"
		   });	
		addAnnotation
		  (getBmiCodeableConcept1_BmiCode(), 
		   source, 
		   new String[] {
			 "originalName", "BMICode"
		   });	
		addAnnotation
		  (bmiCodeableConcept1Coding1EClass, 
		   source, 
		   new String[] {
			 "originalName", "CodeableConcept1_Coding1"
		   });	
		addAnnotation
		  (bmiQuantity1EClass, 
		   source, 
		   new String[] {
			 "originalName", "bmi_Quantity1"
		   });	
		addAnnotation
		  (devicemetricobservationEClass, 
		   source, 
		   new String[] {
			 "originalName", "devicemetricobservation"
		   });	
		addAnnotation
		  (cdshooksserviceplandefinitionEClass, 
		   source, 
		   new String[] {
			 "originalName", "cdshooksserviceplandefinition"
		   });	
		addAnnotation
		  (cdshooksserviceplandefinitionAction1EClass, 
		   source, 
		   new String[] {
			 "originalName", "cdshooksserviceplandefinition_Action1"
		   });	
		addAnnotation
		  (getCdshooksserviceplandefinitionAction1_Definitionx(), 
		   source, 
		   new String[] {
			 "originalName", "definition[x]"
		   });	
		addAnnotation
		  (cqfquestionnaireEClass, 
		   source, 
		   new String[] {
			 "originalName", "cqf-questionnaire"
		   });	
		addAnnotation
		  (computableplandefinitionEClass, 
		   source, 
		   new String[] {
			 "originalName", "computableplandefinition"
		   });	
		addAnnotation
		  (shareablelibraryEClass, 
		   source, 
		   new String[] {
			 "originalName", "shareablelibrary"
		   });	
		addAnnotation
		  (cdshooksguidanceresponseEClass, 
		   source, 
		   new String[] {
			 "originalName", "cdshooksguidanceresponse"
		   });	
		addAnnotation
		  (shareableactivitydefinitionEClass, 
		   source, 
		   new String[] {
			 "originalName", "shareableactivitydefinition"
		   });	
		addAnnotation
		  (shareablemeasureEClass, 
		   source, 
		   new String[] {
			 "originalName", "shareablemeasure"
		   });	
		addAnnotation
		  (resprateEClass, 
		   source, 
		   new String[] {
			 "originalName", "resprate"
		   });	
		addAnnotation
		  (resprateCodeableConcept1EClass, 
		   source, 
		   new String[] {
			 "originalName", "resprate_CodeableConcept1"
		   });	
		addAnnotation
		  (getResprateCodeableConcept1_RespRateCode(), 
		   source, 
		   new String[] {
			 "originalName", "RespRateCode"
		   });	
		addAnnotation
		  (resprateCodeableConcept1Coding1EClass, 
		   source, 
		   new String[] {
			 "originalName", "CodeableConcept1_Coding1"
		   });	
		addAnnotation
		  (resprateQuantity1EClass, 
		   source, 
		   new String[] {
			 "originalName", "resprate_Quantity1"
		   });	
		addAnnotation
		  (familymemberhistorygeneticEClass, 
		   source, 
		   new String[] {
			 "originalName", "familymemberhistory-genetic"
		   });	
		addAnnotation
		  (familymemberhistorygeneticCondition1EClass, 
		   source, 
		   new String[] {
			 "originalName", "familymemberhistorygenetic_Condition1"
		   });	
		addAnnotation
		  (hdlcholesterolEClass, 
		   source, 
		   new String[] {
			 "originalName", "hdlcholesterol"
		   });	
		addAnnotation
		  (hdlcholesterolReferenceRange1EClass, 
		   source, 
		   new String[] {
			 "originalName", "hdlcholesterol_ReferenceRange1"
		   });	
		addAnnotation
		  (shareableplandefinitionEClass, 
		   source, 
		   new String[] {
			 "originalName", "shareableplandefinition"
		   });	
		addAnnotation
		  (lipidprofileEClass, 
		   source, 
		   new String[] {
			 "originalName", "lipidprofile"
		   });	
		addAnnotation
		  (getLipidprofile_Cholesterol(), 
		   source, 
		   new String[] {
			 "originalName", "Cholesterol"
		   });	
		addAnnotation
		  (getLipidprofile_Triglyceride(), 
		   source, 
		   new String[] {
			 "originalName", "Triglyceride"
		   });	
		addAnnotation
		  (getLipidprofile_HdlCholesterol(), 
		   source, 
		   new String[] {
			 "originalName", "HDLCholesterol"
		   });	
		addAnnotation
		  (getLipidprofile_LdlCholesterol(), 
		   source, 
		   new String[] {
			 "originalName", "LDLCholesterol"
		   });	
		addAnnotation
		  (cholesterolEClass, 
		   source, 
		   new String[] {
			 "originalName", "cholesterol"
		   });	
		addAnnotation
		  (cholesterolQuantity1EClass, 
		   source, 
		   new String[] {
			 "originalName", "cholesterol_Quantity1"
		   });	
		addAnnotation
		  (cholesterolReferenceRange1EClass, 
		   source, 
		   new String[] {
			 "originalName", "cholesterol_ReferenceRange1"
		   });	
		addAnnotation
		  (triglycerideEClass, 
		   source, 
		   new String[] {
			 "originalName", "triglyceride"
		   });	
		addAnnotation
		  (triglycerideReferenceRange1EClass, 
		   source, 
		   new String[] {
			 "originalName", "triglyceride_ReferenceRange1"
		   });	
		addAnnotation
		  (ldlcholesterolEClass, 
		   source, 
		   new String[] {
			 "originalName", "ldlcholesterol"
		   });	
		addAnnotation
		  (ldlcholesterolReferenceRange1EClass, 
		   source, 
		   new String[] {
			 "originalName", "ldlcholesterol_ReferenceRange1"
		   });	
		addAnnotation
		  (bodytempEClass, 
		   source, 
		   new String[] {
			 "originalName", "bodytemp"
		   });	
		addAnnotation
		  (bodytempCodeableConcept1EClass, 
		   source, 
		   new String[] {
			 "originalName", "bodytemp_CodeableConcept1"
		   });	
		addAnnotation
		  (getBodytempCodeableConcept1_BodyTempCode(), 
		   source, 
		   new String[] {
			 "originalName", "BodyTempCode"
		   });	
		addAnnotation
		  (bodytempCodeableConcept1Coding1EClass, 
		   source, 
		   new String[] {
			 "originalName", "CodeableConcept1_Coding1"
		   });	
		addAnnotation
		  (bodytempQuantity1EClass, 
		   source, 
		   new String[] {
			 "originalName", "bodytemp_Quantity1"
		   });	
		addAnnotation
		  (heartrateEClass, 
		   source, 
		   new String[] {
			 "originalName", "heartrate"
		   });	
		addAnnotation
		  (heartrateCodeableConcept1EClass, 
		   source, 
		   new String[] {
			 "originalName", "heartrate_CodeableConcept1"
		   });	
		addAnnotation
		  (getHeartrateCodeableConcept1_HeartRateCode(), 
		   source, 
		   new String[] {
			 "originalName", "HeartRateCode"
		   });	
		addAnnotation
		  (heartrateCodeableConcept1Coding1EClass, 
		   source, 
		   new String[] {
			 "originalName", "CodeableConcept1_Coding1"
		   });	
		addAnnotation
		  (heartrateQuantity1EClass, 
		   source, 
		   new String[] {
			 "originalName", "heartrate_Quantity1"
		   });	
		addAnnotation
		  (bodyheightEClass, 
		   source, 
		   new String[] {
			 "originalName", "bodyheight"
		   });	
		addAnnotation
		  (bodyheightCodeableConcept1EClass, 
		   source, 
		   new String[] {
			 "originalName", "bodyheight_CodeableConcept1"
		   });	
		addAnnotation
		  (getBodyheightCodeableConcept1_BodyHeightCode(), 
		   source, 
		   new String[] {
			 "originalName", "BodyHeightCode"
		   });	
		addAnnotation
		  (bodyheightCodeableConcept1Coding1EClass, 
		   source, 
		   new String[] {
			 "originalName", "CodeableConcept1_Coding1"
		   });	
		addAnnotation
		  (bodyheightQuantity1EClass, 
		   source, 
		   new String[] {
			 "originalName", "bodyheight_Quantity1"
		   });	
		addAnnotation
		  (elementdefinitiondeEClass, 
		   source, 
		   new String[] {
			 "originalName", "elementdefinition-de"
		   });	
		addAnnotation
		  (elementdefinitiondeElement31EClass, 
		   source, 
		   new String[] {
			 "originalName", "elementdefinitionde_Element31"
		   });	
		addAnnotation
		  (diagnosticreportgeneticsEClass, 
		   source, 
		   new String[] {
			 "originalName", "diagnosticreport-genetics"
		   });	
		addAnnotation
		  (shareablecodesystemEClass, 
		   source, 
		   new String[] {
			 "originalName", "shareablecodesystem"
		   });	
		addAnnotation
		  (shareablecodesystemConceptDefinition1EClass, 
		   source, 
		   new String[] {
			 "originalName", "shareablecodesystem_ConceptDefinition1"
		   });	
		addAnnotation
		  (oxygensatEClass, 
		   source, 
		   new String[] {
			 "originalName", "oxygensat"
		   });	
		addAnnotation
		  (oxygensatCodeableConcept1EClass, 
		   source, 
		   new String[] {
			 "originalName", "oxygensat_CodeableConcept1"
		   });	
		addAnnotation
		  (getOxygensatCodeableConcept1_OxygenSatCode(), 
		   source, 
		   new String[] {
			 "originalName", "OxygenSatCode"
		   });	
		addAnnotation
		  (oxygensatCodeableConcept1Coding1EClass, 
		   source, 
		   new String[] {
			 "originalName", "CodeableConcept1_Coding1"
		   });	
		addAnnotation
		  (oxygensatQuantity1EClass, 
		   source, 
		   new String[] {
			 "originalName", "oxygensat_Quantity1"
		   });	
		addAnnotation
		  (clinicaldocumentEClass, 
		   source, 
		   new String[] {
			 "originalName", "clinicaldocument"
		   });	
		addAnnotation
		  (cqllibraryEClass, 
		   source, 
		   new String[] {
			 "originalName", "cqllibrary"
		   });	
		addAnnotation
		  (headcircumEClass, 
		   source, 
		   new String[] {
			 "originalName", "headcircum"
		   });	
		addAnnotation
		  (headcircumCodeableConcept1EClass, 
		   source, 
		   new String[] {
			 "originalName", "headcircum_CodeableConcept1"
		   });	
		addAnnotation
		  (getHeadcircumCodeableConcept1_HeadCircumCode(), 
		   source, 
		   new String[] {
			 "originalName", "HeadCircumCode"
		   });	
		addAnnotation
		  (headcircumCodeableConcept1Coding1EClass, 
		   source, 
		   new String[] {
			 "originalName", "CodeableConcept1_Coding1"
		   });	
		addAnnotation
		  (headcircumQuantity1EClass, 
		   source, 
		   new String[] {
			 "originalName", "headcircum_Quantity1"
		   });	
		addAnnotation
		  (synchronizationplandefinitionEClass, 
		   source, 
		   new String[] {
			 "originalName", "synchronizationplandefinition"
		   });	
		addAnnotation
		  (vitalspanelEClass, 
		   source, 
		   new String[] {
			 "originalName", "vitalspanel"
		   });	
		addAnnotation
		  (vitalspanelCodeableConcept1EClass, 
		   source, 
		   new String[] {
			 "originalName", "vitalspanel_CodeableConcept1"
		   });	
		addAnnotation
		  (getVitalspanelCodeableConcept1_VitalsPanelCode(), 
		   source, 
		   new String[] {
			 "originalName", "VitalsPanelCode"
		   });	
		addAnnotation
		  (vitalspanelCodeableConcept1Coding1EClass, 
		   source, 
		   new String[] {
			 "originalName", "CodeableConcept1_Coding1"
		   });	
		addAnnotation
		  (synthesisEClass, 
		   source, 
		   new String[] {
			 "originalName", "synthesis"
		   });	
		addAnnotation
		  (substanceDefinitionMoietyEClass, 
		   source, 
		   new String[] {
			 "originalName", "SubstanceDefinition_Moiety"
		   });	
		addAnnotation
		  (getSubstanceDefinitionMoiety_Amountx(), 
		   source, 
		   new String[] {
			 "originalName", "amount[x]"
		   });	
		addAnnotation
		  (substanceDefinitionPropertyEClass, 
		   source, 
		   new String[] {
			 "originalName", "SubstanceDefinition_Property"
		   });	
		addAnnotation
		  (getSubstanceDefinitionProperty_DefiningSubstancex(), 
		   source, 
		   new String[] {
			 "originalName", "definingSubstance[x]"
		   });	
		addAnnotation
		  (getSubstanceDefinitionProperty_Amountx(), 
		   source, 
		   new String[] {
			 "originalName", "amount[x]"
		   });	
		addAnnotation
		  (substanceDefinitionStructureEClass, 
		   source, 
		   new String[] {
			 "originalName", "SubstanceDefinition_Structure"
		   });	
		addAnnotation
		  (substanceDefinitionStructureIsotopeEClass, 
		   source, 
		   new String[] {
			 "originalName", "Structure_Isotope"
		   });	
		addAnnotation
		  (substanceDefinitionStructureIsotopeMolecularWeightEClass, 
		   source, 
		   new String[] {
			 "originalName", "Isotope_MolecularWeight"
		   });	
		addAnnotation
		  (substanceDefinitionStructureRepresentationEClass, 
		   source, 
		   new String[] {
			 "originalName", "Structure_Representation"
		   });	
		addAnnotation
		  (substanceDefinitionCodeEClass, 
		   source, 
		   new String[] {
			 "originalName", "SubstanceDefinition_Code"
		   });	
		addAnnotation
		  (substanceDefinitionNameEClass, 
		   source, 
		   new String[] {
			 "originalName", "SubstanceDefinition_Name"
		   });	
		addAnnotation
		  (substanceDefinitionNameOfficialEClass, 
		   source, 
		   new String[] {
			 "originalName", "Name_Official"
		   });	
		addAnnotation
		  (substanceDefinitionRelationshipEClass, 
		   source, 
		   new String[] {
			 "originalName", "SubstanceDefinition_Relationship"
		   });	
		addAnnotation
		  (getSubstanceDefinitionRelationship_Substancex(), 
		   source, 
		   new String[] {
			 "originalName", "substance[x]"
		   });	
		addAnnotation
		  (getSubstanceDefinitionRelationship_Amountx(), 
		   source, 
		   new String[] {
			 "originalName", "amount[x]"
		   });	
		addAnnotation
		  (provenancerelevanthistoryEClass, 
		   source, 
		   new String[] {
			 "originalName", "provenance-relevant-history"
		   });	
		addAnnotation
		  (getProvenancerelevanthistory_Author(), 
		   source, 
		   new String[] {
			 "originalName", "Author"
		   });	
		addAnnotation
		  (provenancerelevanthistoryAgent1EClass, 
		   source, 
		   new String[] {
			 "originalName", "provenancerelevanthistory_Agent1"
		   });	
		addAnnotation
		  (catalogEClass, 
		   source, 
		   new String[] {
			 "originalName", "catalog"
		   });	
		addAnnotation
		  (catalogSection1EClass, 
		   source, 
		   new String[] {
			 "originalName", "catalog_Section1"
		   });	
		addAnnotation
		  (bodyweightEClass, 
		   source, 
		   new String[] {
			 "originalName", "bodyweight"
		   });	
		addAnnotation
		  (bodyweightCodeableConcept1EClass, 
		   source, 
		   new String[] {
			 "originalName", "bodyweight_CodeableConcept1"
		   });	
		addAnnotation
		  (getBodyweightCodeableConcept1_BodyWeightCode(), 
		   source, 
		   new String[] {
			 "originalName", "BodyWeightCode"
		   });	
		addAnnotation
		  (bodyweightCodeableConcept1Coding1EClass, 
		   source, 
		   new String[] {
			 "originalName", "CodeableConcept1_Coding1"
		   });	
		addAnnotation
		  (bodyweightQuantity1EClass, 
		   source, 
		   new String[] {
			 "originalName", "bodyweight_Quantity1"
		   });	
		addAnnotation
		  (bpEClass, 
		   source, 
		   new String[] {
			 "originalName", "bp"
		   });	
		addAnnotation
		  (getBp_SystolicBp(), 
		   source, 
		   new String[] {
			 "originalName", "SystolicBP"
		   });	
		addAnnotation
		  (getBp_DiastolicBp(), 
		   source, 
		   new String[] {
			 "originalName", "DiastolicBP"
		   });	
		addAnnotation
		  (bpCodeableConcept1EClass, 
		   source, 
		   new String[] {
			 "originalName", "bp_CodeableConcept1"
		   });	
		addAnnotation
		  (getBpCodeableConcept1_BpCode(), 
		   source, 
		   new String[] {
			 "originalName", "BPCode"
		   });	
		addAnnotation
		  (bpCodeableConcept1Coding1EClass, 
		   source, 
		   new String[] {
			 "originalName", "CodeableConcept1_Coding1"
		   });	
		addAnnotation
		  (bpComponent11EClass, 
		   source, 
		   new String[] {
			 "originalName", "bp_Component11"
		   });	
		addAnnotation
		  (bpComponent11CodeableConcept1EClass, 
		   source, 
		   new String[] {
			 "originalName", "Component11_CodeableConcept1"
		   });	
		addAnnotation
		  (getBpComponent11CodeableConcept1_SbpCode(), 
		   source, 
		   new String[] {
			 "originalName", "SBPCode"
		   });	
		addAnnotation
		  (bpComponent11CodeableConcept1Coding1EClass, 
		   source, 
		   new String[] {
			 "originalName", "CodeableConcept1_Coding1"
		   });	
		addAnnotation
		  (bpComponent11Quantity1EClass, 
		   source, 
		   new String[] {
			 "originalName", "Component11_Quantity1"
		   });	
		addAnnotation
		  (bpComponent12EClass, 
		   source, 
		   new String[] {
			 "originalName", "bp_Component12"
		   });	
		addAnnotation
		  (bpComponent12CodeableConcept1EClass, 
		   source, 
		   new String[] {
			 "originalName", "Component12_CodeableConcept1"
		   });	
		addAnnotation
		  (getBpComponent12CodeableConcept1_DbpCode(), 
		   source, 
		   new String[] {
			 "originalName", "DBPCode"
		   });	
		addAnnotation
		  (bpComponent12CodeableConcept1Coding1EClass, 
		   source, 
		   new String[] {
			 "originalName", "CodeableConcept1_Coding1"
		   });	
		addAnnotation
		  (bpComponent12Quantity1EClass, 
		   source, 
		   new String[] {
			 "originalName", "Component12_Quantity1"
		   });	
		addAnnotation
		  (servicerequestgeneticsEClass, 
		   source, 
		   new String[] {
			 "originalName", "servicerequest-genetics"
		   });	
		addAnnotation
		  (shareablevaluesetEClass, 
		   source, 
		   new String[] {
			 "originalName", "shareablevalueset"
		   });	
		addAnnotation
		  (groupdefinitionEClass, 
		   source, 
		   new String[] {
			 "originalName", "groupdefinition"
		   });	
		addAnnotation
		  (actualgroupEClass, 
		   source, 
		   new String[] {
			 "originalName", "actualgroup"
		   });	
		addAnnotation
		  (hlaresultEClass, 
		   source, 
		   new String[] {
			 "originalName", "hlaresult"
		   });	
		addAnnotation
		  (cdshooksrequestgroupEClass, 
		   source, 
		   new String[] {
			 "originalName", "cdshooksrequestgroup"
		   });	
		addAnnotation
		  (cdshooksrequestgroupAction1EClass, 
		   source, 
		   new String[] {
			 "originalName", "cdshooksrequestgroup_Action1"
		   });	
		addAnnotation
		  (observationgeneticsEClass, 
		   source, 
		   new String[] {
			 "originalName", "observation-genetics"
		   });
	}

} //ProfilesPackageImpl
