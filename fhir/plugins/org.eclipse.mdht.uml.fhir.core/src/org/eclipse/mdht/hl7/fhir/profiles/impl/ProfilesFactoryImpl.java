/**
 */
package org.eclipse.mdht.hl7.fhir.profiles.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.mdht.hl7.fhir.profiles.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProfilesFactoryImpl extends EFactoryImpl implements ProfilesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProfilesFactory init() {
		try {
			ProfilesFactory theProfilesFactory = (ProfilesFactory)EPackage.Registry.INSTANCE.getEFactory(ProfilesPackage.eNS_URI);
			if (theProfilesFactory != null) {
				return theProfilesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProfilesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfilesFactoryImpl() {
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
			case ProfilesPackage.PICOELEMENT: return createPicoelement();
			case ProfilesPackage.PICOELEMENT_CHARACTERISTIC1: return createPicoelementCharacteristic1();
			case ProfilesPackage.BMI: return createBmi();
			case ProfilesPackage.VITALSIGNS: return createVitalsigns();
			case ProfilesPackage.VITALSIGNS_CODEABLE_CONCEPT1: return createVitalsignsCodeableConcept1();
			case ProfilesPackage.VITALSIGNS_CODEABLE_CONCEPT1_CODING1: return createVitalsignsCodeableConcept1Coding1();
			case ProfilesPackage.VITALSIGNS_COMPONENT1: return createVitalsignsComponent1();
			case ProfilesPackage.BMI_CODEABLE_CONCEPT1: return createBmiCodeableConcept1();
			case ProfilesPackage.BMI_CODEABLE_CONCEPT1_CODING1: return createBmiCodeableConcept1Coding1();
			case ProfilesPackage.BMI_QUANTITY1: return createBmiQuantity1();
			case ProfilesPackage.DEVICEMETRICOBSERVATION: return createDevicemetricobservation();
			case ProfilesPackage.CDSHOOKSSERVICEPLANDEFINITION: return createCdshooksserviceplandefinition();
			case ProfilesPackage.CDSHOOKSSERVICEPLANDEFINITION_ACTION1: return createCdshooksserviceplandefinitionAction1();
			case ProfilesPackage.CQFQUESTIONNAIRE: return createCqfquestionnaire();
			case ProfilesPackage.COMPUTABLEPLANDEFINITION: return createComputableplandefinition();
			case ProfilesPackage.SHAREABLELIBRARY: return createShareablelibrary();
			case ProfilesPackage.CDSHOOKSGUIDANCERESPONSE: return createCdshooksguidanceresponse();
			case ProfilesPackage.SHAREABLEACTIVITYDEFINITION: return createShareableactivitydefinition();
			case ProfilesPackage.SHAREABLEMEASURE: return createShareablemeasure();
			case ProfilesPackage.RESPRATE: return createResprate();
			case ProfilesPackage.RESPRATE_CODEABLE_CONCEPT1: return createResprateCodeableConcept1();
			case ProfilesPackage.RESPRATE_CODEABLE_CONCEPT1_CODING1: return createResprateCodeableConcept1Coding1();
			case ProfilesPackage.RESPRATE_QUANTITY1: return createResprateQuantity1();
			case ProfilesPackage.FAMILYMEMBERHISTORYGENETIC: return createFamilymemberhistorygenetic();
			case ProfilesPackage.FAMILYMEMBERHISTORYGENETIC_CONDITION1: return createFamilymemberhistorygeneticCondition1();
			case ProfilesPackage.HDLCHOLESTEROL: return createHdlcholesterol();
			case ProfilesPackage.HDLCHOLESTEROL_REFERENCE_RANGE1: return createHdlcholesterolReferenceRange1();
			case ProfilesPackage.SHAREABLEPLANDEFINITION: return createShareableplandefinition();
			case ProfilesPackage.LIPIDPROFILE: return createLipidprofile();
			case ProfilesPackage.CHOLESTEROL: return createCholesterol();
			case ProfilesPackage.CHOLESTEROL_QUANTITY1: return createCholesterolQuantity1();
			case ProfilesPackage.CHOLESTEROL_REFERENCE_RANGE1: return createCholesterolReferenceRange1();
			case ProfilesPackage.TRIGLYCERIDE: return createTriglyceride();
			case ProfilesPackage.TRIGLYCERIDE_REFERENCE_RANGE1: return createTriglycerideReferenceRange1();
			case ProfilesPackage.LDLCHOLESTEROL: return createLdlcholesterol();
			case ProfilesPackage.LDLCHOLESTEROL_REFERENCE_RANGE1: return createLdlcholesterolReferenceRange1();
			case ProfilesPackage.BODYTEMP: return createBodytemp();
			case ProfilesPackage.BODYTEMP_CODEABLE_CONCEPT1: return createBodytempCodeableConcept1();
			case ProfilesPackage.BODYTEMP_CODEABLE_CONCEPT1_CODING1: return createBodytempCodeableConcept1Coding1();
			case ProfilesPackage.BODYTEMP_QUANTITY1: return createBodytempQuantity1();
			case ProfilesPackage.METADATA_RESOURCE: return createMetadataResource();
			case ProfilesPackage.HEARTRATE: return createHeartrate();
			case ProfilesPackage.HEARTRATE_CODEABLE_CONCEPT1: return createHeartrateCodeableConcept1();
			case ProfilesPackage.HEARTRATE_CODEABLE_CONCEPT1_CODING1: return createHeartrateCodeableConcept1Coding1();
			case ProfilesPackage.HEARTRATE_QUANTITY1: return createHeartrateQuantity1();
			case ProfilesPackage.BODYHEIGHT: return createBodyheight();
			case ProfilesPackage.BODYHEIGHT_CODEABLE_CONCEPT1: return createBodyheightCodeableConcept1();
			case ProfilesPackage.BODYHEIGHT_CODEABLE_CONCEPT1_CODING1: return createBodyheightCodeableConcept1Coding1();
			case ProfilesPackage.BODYHEIGHT_QUANTITY1: return createBodyheightQuantity1();
			case ProfilesPackage.ELEMENTDEFINITIONDE: return createElementdefinitionde();
			case ProfilesPackage.ELEMENTDEFINITIONDE_ELEMENT31: return createElementdefinitiondeElement31();
			case ProfilesPackage.DIAGNOSTICREPORTGENETICS: return createDiagnosticreportgenetics();
			case ProfilesPackage.SHAREABLECODESYSTEM: return createShareablecodesystem();
			case ProfilesPackage.SHAREABLECODESYSTEM_CONCEPT_DEFINITION1: return createShareablecodesystemConceptDefinition1();
			case ProfilesPackage.OXYGENSAT: return createOxygensat();
			case ProfilesPackage.OXYGENSAT_CODEABLE_CONCEPT1: return createOxygensatCodeableConcept1();
			case ProfilesPackage.OXYGENSAT_CODEABLE_CONCEPT1_CODING1: return createOxygensatCodeableConcept1Coding1();
			case ProfilesPackage.OXYGENSAT_QUANTITY1: return createOxygensatQuantity1();
			case ProfilesPackage.CLINICALDOCUMENT: return createClinicaldocument();
			case ProfilesPackage.CQLLIBRARY: return createCqllibrary();
			case ProfilesPackage.HEADCIRCUM: return createHeadcircum();
			case ProfilesPackage.HEADCIRCUM_CODEABLE_CONCEPT1: return createHeadcircumCodeableConcept1();
			case ProfilesPackage.HEADCIRCUM_CODEABLE_CONCEPT1_CODING1: return createHeadcircumCodeableConcept1Coding1();
			case ProfilesPackage.HEADCIRCUM_QUANTITY1: return createHeadcircumQuantity1();
			case ProfilesPackage.SYNCHRONIZATIONPLANDEFINITION: return createSynchronizationplandefinition();
			case ProfilesPackage.VITALSPANEL: return createVitalspanel();
			case ProfilesPackage.VITALSPANEL_CODEABLE_CONCEPT1: return createVitalspanelCodeableConcept1();
			case ProfilesPackage.VITALSPANEL_CODEABLE_CONCEPT1_CODING1: return createVitalspanelCodeableConcept1Coding1();
			case ProfilesPackage.SYNTHESIS: return createSynthesis();
			case ProfilesPackage.SUBSTANCE_DEFINITION: return createSubstanceDefinition();
			case ProfilesPackage.SUBSTANCE_DEFINITION_MOIETY: return createSubstanceDefinitionMoiety();
			case ProfilesPackage.SUBSTANCE_DEFINITION_PROPERTY: return createSubstanceDefinitionProperty();
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE: return createSubstanceDefinitionStructure();
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE: return createSubstanceDefinitionStructureIsotope();
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_ISOTOPE_MOLECULAR_WEIGHT: return createSubstanceDefinitionStructureIsotopeMolecularWeight();
			case ProfilesPackage.SUBSTANCE_DEFINITION_STRUCTURE_REPRESENTATION: return createSubstanceDefinitionStructureRepresentation();
			case ProfilesPackage.SUBSTANCE_DEFINITION_CODE: return createSubstanceDefinitionCode();
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME: return createSubstanceDefinitionName();
			case ProfilesPackage.SUBSTANCE_DEFINITION_NAME_OFFICIAL: return createSubstanceDefinitionNameOfficial();
			case ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP: return createSubstanceDefinitionRelationship();
			case ProfilesPackage.PROVENANCERELEVANTHISTORY: return createProvenancerelevanthistory();
			case ProfilesPackage.PROVENANCERELEVANTHISTORY_AGENT1: return createProvenancerelevanthistoryAgent1();
			case ProfilesPackage.CATALOG: return createCatalog();
			case ProfilesPackage.CATALOG_SECTION1: return createCatalogSection1();
			case ProfilesPackage.BODYWEIGHT: return createBodyweight();
			case ProfilesPackage.BODYWEIGHT_CODEABLE_CONCEPT1: return createBodyweightCodeableConcept1();
			case ProfilesPackage.BODYWEIGHT_CODEABLE_CONCEPT1_CODING1: return createBodyweightCodeableConcept1Coding1();
			case ProfilesPackage.BODYWEIGHT_QUANTITY1: return createBodyweightQuantity1();
			case ProfilesPackage.BP: return createBp();
			case ProfilesPackage.BP_CODEABLE_CONCEPT1: return createBpCodeableConcept1();
			case ProfilesPackage.BP_CODEABLE_CONCEPT1_CODING1: return createBpCodeableConcept1Coding1();
			case ProfilesPackage.BP_COMPONENT11: return createBpComponent11();
			case ProfilesPackage.BP_COMPONENT11_CODEABLE_CONCEPT1: return createBpComponent11CodeableConcept1();
			case ProfilesPackage.BP_COMPONENT11_CODEABLE_CONCEPT1_CODING1: return createBpComponent11CodeableConcept1Coding1();
			case ProfilesPackage.BP_COMPONENT11_QUANTITY1: return createBpComponent11Quantity1();
			case ProfilesPackage.BP_COMPONENT12: return createBpComponent12();
			case ProfilesPackage.BP_COMPONENT12_CODEABLE_CONCEPT1: return createBpComponent12CodeableConcept1();
			case ProfilesPackage.BP_COMPONENT12_CODEABLE_CONCEPT1_CODING1: return createBpComponent12CodeableConcept1Coding1();
			case ProfilesPackage.BP_COMPONENT12_QUANTITY1: return createBpComponent12Quantity1();
			case ProfilesPackage.SERVICEREQUESTGENETICS: return createServicerequestgenetics();
			case ProfilesPackage.SHAREABLEVALUESET: return createShareablevalueset();
			case ProfilesPackage.GROUPDEFINITION: return createGroupdefinition();
			case ProfilesPackage.ACTUALGROUP: return createActualgroup();
			case ProfilesPackage.HLARESULT: return createHlaresult();
			case ProfilesPackage.CDSHOOKSREQUESTGROUP: return createCdshooksrequestgroup();
			case ProfilesPackage.CDSHOOKSREQUESTGROUP_ACTION1: return createCdshooksrequestgroupAction1();
			case ProfilesPackage.OBSERVATIONGENETICS: return createObservationgenetics();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Picoelement createPicoelement() {
		PicoelementImpl picoelement = new PicoelementImpl();
		return picoelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PicoelementCharacteristic1 createPicoelementCharacteristic1() {
		PicoelementCharacteristic1Impl picoelementCharacteristic1 = new PicoelementCharacteristic1Impl();
		return picoelementCharacteristic1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bmi createBmi() {
		BmiImpl bmi = new BmiImpl();
		return bmi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vitalsigns createVitalsigns() {
		VitalsignsImpl vitalsigns = new VitalsignsImpl();
		return vitalsigns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VitalsignsCodeableConcept1 createVitalsignsCodeableConcept1() {
		VitalsignsCodeableConcept1Impl vitalsignsCodeableConcept1 = new VitalsignsCodeableConcept1Impl();
		return vitalsignsCodeableConcept1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VitalsignsCodeableConcept1Coding1 createVitalsignsCodeableConcept1Coding1() {
		VitalsignsCodeableConcept1Coding1Impl vitalsignsCodeableConcept1Coding1 = new VitalsignsCodeableConcept1Coding1Impl();
		return vitalsignsCodeableConcept1Coding1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VitalsignsComponent1 createVitalsignsComponent1() {
		VitalsignsComponent1Impl vitalsignsComponent1 = new VitalsignsComponent1Impl();
		return vitalsignsComponent1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BmiCodeableConcept1 createBmiCodeableConcept1() {
		BmiCodeableConcept1Impl bmiCodeableConcept1 = new BmiCodeableConcept1Impl();
		return bmiCodeableConcept1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BmiCodeableConcept1Coding1 createBmiCodeableConcept1Coding1() {
		BmiCodeableConcept1Coding1Impl bmiCodeableConcept1Coding1 = new BmiCodeableConcept1Coding1Impl();
		return bmiCodeableConcept1Coding1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BmiQuantity1 createBmiQuantity1() {
		BmiQuantity1Impl bmiQuantity1 = new BmiQuantity1Impl();
		return bmiQuantity1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Devicemetricobservation createDevicemetricobservation() {
		DevicemetricobservationImpl devicemetricobservation = new DevicemetricobservationImpl();
		return devicemetricobservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cdshooksserviceplandefinition createCdshooksserviceplandefinition() {
		CdshooksserviceplandefinitionImpl cdshooksserviceplandefinition = new CdshooksserviceplandefinitionImpl();
		return cdshooksserviceplandefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CdshooksserviceplandefinitionAction1 createCdshooksserviceplandefinitionAction1() {
		CdshooksserviceplandefinitionAction1Impl cdshooksserviceplandefinitionAction1 = new CdshooksserviceplandefinitionAction1Impl();
		return cdshooksserviceplandefinitionAction1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cqfquestionnaire createCqfquestionnaire() {
		CqfquestionnaireImpl cqfquestionnaire = new CqfquestionnaireImpl();
		return cqfquestionnaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Computableplandefinition createComputableplandefinition() {
		ComputableplandefinitionImpl computableplandefinition = new ComputableplandefinitionImpl();
		return computableplandefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Shareablelibrary createShareablelibrary() {
		ShareablelibraryImpl shareablelibrary = new ShareablelibraryImpl();
		return shareablelibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cdshooksguidanceresponse createCdshooksguidanceresponse() {
		CdshooksguidanceresponseImpl cdshooksguidanceresponse = new CdshooksguidanceresponseImpl();
		return cdshooksguidanceresponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Shareableactivitydefinition createShareableactivitydefinition() {
		ShareableactivitydefinitionImpl shareableactivitydefinition = new ShareableactivitydefinitionImpl();
		return shareableactivitydefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Shareablemeasure createShareablemeasure() {
		ShareablemeasureImpl shareablemeasure = new ShareablemeasureImpl();
		return shareablemeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resprate createResprate() {
		ResprateImpl resprate = new ResprateImpl();
		return resprate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResprateCodeableConcept1 createResprateCodeableConcept1() {
		ResprateCodeableConcept1Impl resprateCodeableConcept1 = new ResprateCodeableConcept1Impl();
		return resprateCodeableConcept1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResprateCodeableConcept1Coding1 createResprateCodeableConcept1Coding1() {
		ResprateCodeableConcept1Coding1Impl resprateCodeableConcept1Coding1 = new ResprateCodeableConcept1Coding1Impl();
		return resprateCodeableConcept1Coding1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResprateQuantity1 createResprateQuantity1() {
		ResprateQuantity1Impl resprateQuantity1 = new ResprateQuantity1Impl();
		return resprateQuantity1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Familymemberhistorygenetic createFamilymemberhistorygenetic() {
		FamilymemberhistorygeneticImpl familymemberhistorygenetic = new FamilymemberhistorygeneticImpl();
		return familymemberhistorygenetic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FamilymemberhistorygeneticCondition1 createFamilymemberhistorygeneticCondition1() {
		FamilymemberhistorygeneticCondition1Impl familymemberhistorygeneticCondition1 = new FamilymemberhistorygeneticCondition1Impl();
		return familymemberhistorygeneticCondition1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hdlcholesterol createHdlcholesterol() {
		HdlcholesterolImpl hdlcholesterol = new HdlcholesterolImpl();
		return hdlcholesterol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HdlcholesterolReferenceRange1 createHdlcholesterolReferenceRange1() {
		HdlcholesterolReferenceRange1Impl hdlcholesterolReferenceRange1 = new HdlcholesterolReferenceRange1Impl();
		return hdlcholesterolReferenceRange1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Shareableplandefinition createShareableplandefinition() {
		ShareableplandefinitionImpl shareableplandefinition = new ShareableplandefinitionImpl();
		return shareableplandefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lipidprofile createLipidprofile() {
		LipidprofileImpl lipidprofile = new LipidprofileImpl();
		return lipidprofile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cholesterol createCholesterol() {
		CholesterolImpl cholesterol = new CholesterolImpl();
		return cholesterol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CholesterolQuantity1 createCholesterolQuantity1() {
		CholesterolQuantity1Impl cholesterolQuantity1 = new CholesterolQuantity1Impl();
		return cholesterolQuantity1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CholesterolReferenceRange1 createCholesterolReferenceRange1() {
		CholesterolReferenceRange1Impl cholesterolReferenceRange1 = new CholesterolReferenceRange1Impl();
		return cholesterolReferenceRange1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Triglyceride createTriglyceride() {
		TriglycerideImpl triglyceride = new TriglycerideImpl();
		return triglyceride;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TriglycerideReferenceRange1 createTriglycerideReferenceRange1() {
		TriglycerideReferenceRange1Impl triglycerideReferenceRange1 = new TriglycerideReferenceRange1Impl();
		return triglycerideReferenceRange1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ldlcholesterol createLdlcholesterol() {
		LdlcholesterolImpl ldlcholesterol = new LdlcholesterolImpl();
		return ldlcholesterol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LdlcholesterolReferenceRange1 createLdlcholesterolReferenceRange1() {
		LdlcholesterolReferenceRange1Impl ldlcholesterolReferenceRange1 = new LdlcholesterolReferenceRange1Impl();
		return ldlcholesterolReferenceRange1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bodytemp createBodytemp() {
		BodytempImpl bodytemp = new BodytempImpl();
		return bodytemp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BodytempCodeableConcept1 createBodytempCodeableConcept1() {
		BodytempCodeableConcept1Impl bodytempCodeableConcept1 = new BodytempCodeableConcept1Impl();
		return bodytempCodeableConcept1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BodytempCodeableConcept1Coding1 createBodytempCodeableConcept1Coding1() {
		BodytempCodeableConcept1Coding1Impl bodytempCodeableConcept1Coding1 = new BodytempCodeableConcept1Coding1Impl();
		return bodytempCodeableConcept1Coding1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BodytempQuantity1 createBodytempQuantity1() {
		BodytempQuantity1Impl bodytempQuantity1 = new BodytempQuantity1Impl();
		return bodytempQuantity1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetadataResource createMetadataResource() {
		MetadataResourceImpl metadataResource = new MetadataResourceImpl();
		return metadataResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Heartrate createHeartrate() {
		HeartrateImpl heartrate = new HeartrateImpl();
		return heartrate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HeartrateCodeableConcept1 createHeartrateCodeableConcept1() {
		HeartrateCodeableConcept1Impl heartrateCodeableConcept1 = new HeartrateCodeableConcept1Impl();
		return heartrateCodeableConcept1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HeartrateCodeableConcept1Coding1 createHeartrateCodeableConcept1Coding1() {
		HeartrateCodeableConcept1Coding1Impl heartrateCodeableConcept1Coding1 = new HeartrateCodeableConcept1Coding1Impl();
		return heartrateCodeableConcept1Coding1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HeartrateQuantity1 createHeartrateQuantity1() {
		HeartrateQuantity1Impl heartrateQuantity1 = new HeartrateQuantity1Impl();
		return heartrateQuantity1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bodyheight createBodyheight() {
		BodyheightImpl bodyheight = new BodyheightImpl();
		return bodyheight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BodyheightCodeableConcept1 createBodyheightCodeableConcept1() {
		BodyheightCodeableConcept1Impl bodyheightCodeableConcept1 = new BodyheightCodeableConcept1Impl();
		return bodyheightCodeableConcept1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BodyheightCodeableConcept1Coding1 createBodyheightCodeableConcept1Coding1() {
		BodyheightCodeableConcept1Coding1Impl bodyheightCodeableConcept1Coding1 = new BodyheightCodeableConcept1Coding1Impl();
		return bodyheightCodeableConcept1Coding1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BodyheightQuantity1 createBodyheightQuantity1() {
		BodyheightQuantity1Impl bodyheightQuantity1 = new BodyheightQuantity1Impl();
		return bodyheightQuantity1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Elementdefinitionde createElementdefinitionde() {
		ElementdefinitiondeImpl elementdefinitionde = new ElementdefinitiondeImpl();
		return elementdefinitionde;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElementdefinitiondeElement31 createElementdefinitiondeElement31() {
		ElementdefinitiondeElement31Impl elementdefinitiondeElement31 = new ElementdefinitiondeElement31Impl();
		return elementdefinitiondeElement31;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Diagnosticreportgenetics createDiagnosticreportgenetics() {
		DiagnosticreportgeneticsImpl diagnosticreportgenetics = new DiagnosticreportgeneticsImpl();
		return diagnosticreportgenetics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Shareablecodesystem createShareablecodesystem() {
		ShareablecodesystemImpl shareablecodesystem = new ShareablecodesystemImpl();
		return shareablecodesystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShareablecodesystemConceptDefinition1 createShareablecodesystemConceptDefinition1() {
		ShareablecodesystemConceptDefinition1Impl shareablecodesystemConceptDefinition1 = new ShareablecodesystemConceptDefinition1Impl();
		return shareablecodesystemConceptDefinition1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Oxygensat createOxygensat() {
		OxygensatImpl oxygensat = new OxygensatImpl();
		return oxygensat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OxygensatCodeableConcept1 createOxygensatCodeableConcept1() {
		OxygensatCodeableConcept1Impl oxygensatCodeableConcept1 = new OxygensatCodeableConcept1Impl();
		return oxygensatCodeableConcept1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OxygensatCodeableConcept1Coding1 createOxygensatCodeableConcept1Coding1() {
		OxygensatCodeableConcept1Coding1Impl oxygensatCodeableConcept1Coding1 = new OxygensatCodeableConcept1Coding1Impl();
		return oxygensatCodeableConcept1Coding1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OxygensatQuantity1 createOxygensatQuantity1() {
		OxygensatQuantity1Impl oxygensatQuantity1 = new OxygensatQuantity1Impl();
		return oxygensatQuantity1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Clinicaldocument createClinicaldocument() {
		ClinicaldocumentImpl clinicaldocument = new ClinicaldocumentImpl();
		return clinicaldocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cqllibrary createCqllibrary() {
		CqllibraryImpl cqllibrary = new CqllibraryImpl();
		return cqllibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Headcircum createHeadcircum() {
		HeadcircumImpl headcircum = new HeadcircumImpl();
		return headcircum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HeadcircumCodeableConcept1 createHeadcircumCodeableConcept1() {
		HeadcircumCodeableConcept1Impl headcircumCodeableConcept1 = new HeadcircumCodeableConcept1Impl();
		return headcircumCodeableConcept1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HeadcircumCodeableConcept1Coding1 createHeadcircumCodeableConcept1Coding1() {
		HeadcircumCodeableConcept1Coding1Impl headcircumCodeableConcept1Coding1 = new HeadcircumCodeableConcept1Coding1Impl();
		return headcircumCodeableConcept1Coding1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HeadcircumQuantity1 createHeadcircumQuantity1() {
		HeadcircumQuantity1Impl headcircumQuantity1 = new HeadcircumQuantity1Impl();
		return headcircumQuantity1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Synchronizationplandefinition createSynchronizationplandefinition() {
		SynchronizationplandefinitionImpl synchronizationplandefinition = new SynchronizationplandefinitionImpl();
		return synchronizationplandefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vitalspanel createVitalspanel() {
		VitalspanelImpl vitalspanel = new VitalspanelImpl();
		return vitalspanel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VitalspanelCodeableConcept1 createVitalspanelCodeableConcept1() {
		VitalspanelCodeableConcept1Impl vitalspanelCodeableConcept1 = new VitalspanelCodeableConcept1Impl();
		return vitalspanelCodeableConcept1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VitalspanelCodeableConcept1Coding1 createVitalspanelCodeableConcept1Coding1() {
		VitalspanelCodeableConcept1Coding1Impl vitalspanelCodeableConcept1Coding1 = new VitalspanelCodeableConcept1Coding1Impl();
		return vitalspanelCodeableConcept1Coding1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Synthesis createSynthesis() {
		SynthesisImpl synthesis = new SynthesisImpl();
		return synthesis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceDefinition createSubstanceDefinition() {
		SubstanceDefinitionImpl substanceDefinition = new SubstanceDefinitionImpl();
		return substanceDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceDefinitionMoiety createSubstanceDefinitionMoiety() {
		SubstanceDefinitionMoietyImpl substanceDefinitionMoiety = new SubstanceDefinitionMoietyImpl();
		return substanceDefinitionMoiety;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceDefinitionProperty createSubstanceDefinitionProperty() {
		SubstanceDefinitionPropertyImpl substanceDefinitionProperty = new SubstanceDefinitionPropertyImpl();
		return substanceDefinitionProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceDefinitionStructure createSubstanceDefinitionStructure() {
		SubstanceDefinitionStructureImpl substanceDefinitionStructure = new SubstanceDefinitionStructureImpl();
		return substanceDefinitionStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceDefinitionStructureIsotope createSubstanceDefinitionStructureIsotope() {
		SubstanceDefinitionStructureIsotopeImpl substanceDefinitionStructureIsotope = new SubstanceDefinitionStructureIsotopeImpl();
		return substanceDefinitionStructureIsotope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceDefinitionStructureIsotopeMolecularWeight createSubstanceDefinitionStructureIsotopeMolecularWeight() {
		SubstanceDefinitionStructureIsotopeMolecularWeightImpl substanceDefinitionStructureIsotopeMolecularWeight = new SubstanceDefinitionStructureIsotopeMolecularWeightImpl();
		return substanceDefinitionStructureIsotopeMolecularWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceDefinitionStructureRepresentation createSubstanceDefinitionStructureRepresentation() {
		SubstanceDefinitionStructureRepresentationImpl substanceDefinitionStructureRepresentation = new SubstanceDefinitionStructureRepresentationImpl();
		return substanceDefinitionStructureRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceDefinitionCode createSubstanceDefinitionCode() {
		SubstanceDefinitionCodeImpl substanceDefinitionCode = new SubstanceDefinitionCodeImpl();
		return substanceDefinitionCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceDefinitionName createSubstanceDefinitionName() {
		SubstanceDefinitionNameImpl substanceDefinitionName = new SubstanceDefinitionNameImpl();
		return substanceDefinitionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceDefinitionNameOfficial createSubstanceDefinitionNameOfficial() {
		SubstanceDefinitionNameOfficialImpl substanceDefinitionNameOfficial = new SubstanceDefinitionNameOfficialImpl();
		return substanceDefinitionNameOfficial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceDefinitionRelationship createSubstanceDefinitionRelationship() {
		SubstanceDefinitionRelationshipImpl substanceDefinitionRelationship = new SubstanceDefinitionRelationshipImpl();
		return substanceDefinitionRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Provenancerelevanthistory createProvenancerelevanthistory() {
		ProvenancerelevanthistoryImpl provenancerelevanthistory = new ProvenancerelevanthistoryImpl();
		return provenancerelevanthistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProvenancerelevanthistoryAgent1 createProvenancerelevanthistoryAgent1() {
		ProvenancerelevanthistoryAgent1Impl provenancerelevanthistoryAgent1 = new ProvenancerelevanthistoryAgent1Impl();
		return provenancerelevanthistoryAgent1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Catalog createCatalog() {
		CatalogImpl catalog = new CatalogImpl();
		return catalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CatalogSection1 createCatalogSection1() {
		CatalogSection1Impl catalogSection1 = new CatalogSection1Impl();
		return catalogSection1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bodyweight createBodyweight() {
		BodyweightImpl bodyweight = new BodyweightImpl();
		return bodyweight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BodyweightCodeableConcept1 createBodyweightCodeableConcept1() {
		BodyweightCodeableConcept1Impl bodyweightCodeableConcept1 = new BodyweightCodeableConcept1Impl();
		return bodyweightCodeableConcept1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BodyweightCodeableConcept1Coding1 createBodyweightCodeableConcept1Coding1() {
		BodyweightCodeableConcept1Coding1Impl bodyweightCodeableConcept1Coding1 = new BodyweightCodeableConcept1Coding1Impl();
		return bodyweightCodeableConcept1Coding1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BodyweightQuantity1 createBodyweightQuantity1() {
		BodyweightQuantity1Impl bodyweightQuantity1 = new BodyweightQuantity1Impl();
		return bodyweightQuantity1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bp createBp() {
		BpImpl bp = new BpImpl();
		return bp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BpCodeableConcept1 createBpCodeableConcept1() {
		BpCodeableConcept1Impl bpCodeableConcept1 = new BpCodeableConcept1Impl();
		return bpCodeableConcept1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BpCodeableConcept1Coding1 createBpCodeableConcept1Coding1() {
		BpCodeableConcept1Coding1Impl bpCodeableConcept1Coding1 = new BpCodeableConcept1Coding1Impl();
		return bpCodeableConcept1Coding1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BpComponent11 createBpComponent11() {
		BpComponent11Impl bpComponent11 = new BpComponent11Impl();
		return bpComponent11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BpComponent11CodeableConcept1 createBpComponent11CodeableConcept1() {
		BpComponent11CodeableConcept1Impl bpComponent11CodeableConcept1 = new BpComponent11CodeableConcept1Impl();
		return bpComponent11CodeableConcept1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BpComponent11CodeableConcept1Coding1 createBpComponent11CodeableConcept1Coding1() {
		BpComponent11CodeableConcept1Coding1Impl bpComponent11CodeableConcept1Coding1 = new BpComponent11CodeableConcept1Coding1Impl();
		return bpComponent11CodeableConcept1Coding1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BpComponent11Quantity1 createBpComponent11Quantity1() {
		BpComponent11Quantity1Impl bpComponent11Quantity1 = new BpComponent11Quantity1Impl();
		return bpComponent11Quantity1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BpComponent12 createBpComponent12() {
		BpComponent12Impl bpComponent12 = new BpComponent12Impl();
		return bpComponent12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BpComponent12CodeableConcept1 createBpComponent12CodeableConcept1() {
		BpComponent12CodeableConcept1Impl bpComponent12CodeableConcept1 = new BpComponent12CodeableConcept1Impl();
		return bpComponent12CodeableConcept1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BpComponent12CodeableConcept1Coding1 createBpComponent12CodeableConcept1Coding1() {
		BpComponent12CodeableConcept1Coding1Impl bpComponent12CodeableConcept1Coding1 = new BpComponent12CodeableConcept1Coding1Impl();
		return bpComponent12CodeableConcept1Coding1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BpComponent12Quantity1 createBpComponent12Quantity1() {
		BpComponent12Quantity1Impl bpComponent12Quantity1 = new BpComponent12Quantity1Impl();
		return bpComponent12Quantity1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Servicerequestgenetics createServicerequestgenetics() {
		ServicerequestgeneticsImpl servicerequestgenetics = new ServicerequestgeneticsImpl();
		return servicerequestgenetics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Shareablevalueset createShareablevalueset() {
		ShareablevaluesetImpl shareablevalueset = new ShareablevaluesetImpl();
		return shareablevalueset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Groupdefinition createGroupdefinition() {
		GroupdefinitionImpl groupdefinition = new GroupdefinitionImpl();
		return groupdefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Actualgroup createActualgroup() {
		ActualgroupImpl actualgroup = new ActualgroupImpl();
		return actualgroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hlaresult createHlaresult() {
		HlaresultImpl hlaresult = new HlaresultImpl();
		return hlaresult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cdshooksrequestgroup createCdshooksrequestgroup() {
		CdshooksrequestgroupImpl cdshooksrequestgroup = new CdshooksrequestgroupImpl();
		return cdshooksrequestgroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CdshooksrequestgroupAction1 createCdshooksrequestgroupAction1() {
		CdshooksrequestgroupAction1Impl cdshooksrequestgroupAction1 = new CdshooksrequestgroupAction1Impl();
		return cdshooksrequestgroupAction1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Observationgenetics createObservationgenetics() {
		ObservationgeneticsImpl observationgenetics = new ObservationgeneticsImpl();
		return observationgenetics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProfilesPackage getProfilesPackage() {
		return (ProfilesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProfilesPackage getPackage() {
		return ProfilesPackage.eINSTANCE;
	}

} //ProfilesFactoryImpl
