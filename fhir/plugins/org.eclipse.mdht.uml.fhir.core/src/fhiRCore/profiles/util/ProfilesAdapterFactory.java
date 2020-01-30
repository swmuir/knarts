/**
 */
package fhiRCore.profiles.util;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Base;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Coding;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Element;
import fhiRCore.dataTypes.ElementDefinition;
import fhiRCore.dataTypes.ElementDefinitionElement3;
import fhiRCore.dataTypes.Quantity;

import fhiRCore.profiles.*;

import fhiRCore.resources.ActivityDefinition;
import fhiRCore.resources.CodeSystem;
import fhiRCore.resources.CodeSystemConceptDefinition;
import fhiRCore.resources.Composition;
import fhiRCore.resources.CompositionSection;
import fhiRCore.resources.DiagnosticReport;
import fhiRCore.resources.DomainResource;
import fhiRCore.resources.Evidence;
import fhiRCore.resources.EvidenceVariable;
import fhiRCore.resources.EvidenceVariableCharacteristic;
import fhiRCore.resources.FamilyMemberHistory;
import fhiRCore.resources.FamilyMemberHistoryCondition;
import fhiRCore.resources.Group;
import fhiRCore.resources.GuidanceResponse;
import fhiRCore.resources.Library;
import fhiRCore.resources.Measure;
import fhiRCore.resources.Observation;
import fhiRCore.resources.ObservationComponent;
import fhiRCore.resources.ObservationReferenceRange;
import fhiRCore.resources.PlanDefinition;
import fhiRCore.resources.PlanDefinitionAction;
import fhiRCore.resources.Provenance;
import fhiRCore.resources.ProvenanceAgent;
import fhiRCore.resources.Questionnaire;
import fhiRCore.resources.RequestGroup;
import fhiRCore.resources.RequestGroupAction;
import fhiRCore.resources.Resource;
import fhiRCore.resources.ServiceRequest;
import fhiRCore.resources.ValueSet;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fhiRCore.profiles.ProfilesPackage
 * @generated
 */
public class ProfilesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProfilesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfilesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ProfilesPackage.eINSTANCE;
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
	protected ProfilesSwitch<Adapter> modelSwitch =
		new ProfilesSwitch<Adapter>() {
			@Override
			public Adapter casePicoelement(Picoelement object) {
				return createPicoelementAdapter();
			}
			@Override
			public Adapter casePicoelementCharacteristic1(PicoelementCharacteristic1 object) {
				return createPicoelementCharacteristic1Adapter();
			}
			@Override
			public Adapter caseBmi(Bmi object) {
				return createBmiAdapter();
			}
			@Override
			public Adapter caseVitalsigns(Vitalsigns object) {
				return createVitalsignsAdapter();
			}
			@Override
			public Adapter caseVitalsignsCodeableConcept1(VitalsignsCodeableConcept1 object) {
				return createVitalsignsCodeableConcept1Adapter();
			}
			@Override
			public Adapter caseVitalsignsCodeableConcept1Coding1(VitalsignsCodeableConcept1Coding1 object) {
				return createVitalsignsCodeableConcept1Coding1Adapter();
			}
			@Override
			public Adapter caseVitalsignsComponent1(VitalsignsComponent1 object) {
				return createVitalsignsComponent1Adapter();
			}
			@Override
			public Adapter caseBmiCodeableConcept1(BmiCodeableConcept1 object) {
				return createBmiCodeableConcept1Adapter();
			}
			@Override
			public Adapter caseBmiCodeableConcept1Coding1(BmiCodeableConcept1Coding1 object) {
				return createBmiCodeableConcept1Coding1Adapter();
			}
			@Override
			public Adapter caseBmiQuantity1(BmiQuantity1 object) {
				return createBmiQuantity1Adapter();
			}
			@Override
			public Adapter caseDevicemetricobservation(Devicemetricobservation object) {
				return createDevicemetricobservationAdapter();
			}
			@Override
			public Adapter caseCdshooksserviceplandefinition(Cdshooksserviceplandefinition object) {
				return createCdshooksserviceplandefinitionAdapter();
			}
			@Override
			public Adapter caseCdshooksserviceplandefinitionAction1(CdshooksserviceplandefinitionAction1 object) {
				return createCdshooksserviceplandefinitionAction1Adapter();
			}
			@Override
			public Adapter caseCqfquestionnaire(Cqfquestionnaire object) {
				return createCqfquestionnaireAdapter();
			}
			@Override
			public Adapter caseComputableplandefinition(Computableplandefinition object) {
				return createComputableplandefinitionAdapter();
			}
			@Override
			public Adapter caseShareablelibrary(Shareablelibrary object) {
				return createShareablelibraryAdapter();
			}
			@Override
			public Adapter caseCdshooksguidanceresponse(Cdshooksguidanceresponse object) {
				return createCdshooksguidanceresponseAdapter();
			}
			@Override
			public Adapter caseShareableactivitydefinition(Shareableactivitydefinition object) {
				return createShareableactivitydefinitionAdapter();
			}
			@Override
			public Adapter caseShareablemeasure(Shareablemeasure object) {
				return createShareablemeasureAdapter();
			}
			@Override
			public Adapter caseResprate(Resprate object) {
				return createResprateAdapter();
			}
			@Override
			public Adapter caseResprateCodeableConcept1(ResprateCodeableConcept1 object) {
				return createResprateCodeableConcept1Adapter();
			}
			@Override
			public Adapter caseResprateCodeableConcept1Coding1(ResprateCodeableConcept1Coding1 object) {
				return createResprateCodeableConcept1Coding1Adapter();
			}
			@Override
			public Adapter caseResprateQuantity1(ResprateQuantity1 object) {
				return createResprateQuantity1Adapter();
			}
			@Override
			public Adapter caseFamilymemberhistorygenetic(Familymemberhistorygenetic object) {
				return createFamilymemberhistorygeneticAdapter();
			}
			@Override
			public Adapter caseFamilymemberhistorygeneticCondition1(FamilymemberhistorygeneticCondition1 object) {
				return createFamilymemberhistorygeneticCondition1Adapter();
			}
			@Override
			public Adapter caseHdlcholesterol(Hdlcholesterol object) {
				return createHdlcholesterolAdapter();
			}
			@Override
			public Adapter caseHdlcholesterolReferenceRange1(HdlcholesterolReferenceRange1 object) {
				return createHdlcholesterolReferenceRange1Adapter();
			}
			@Override
			public Adapter caseShareableplandefinition(Shareableplandefinition object) {
				return createShareableplandefinitionAdapter();
			}
			@Override
			public Adapter caseLipidprofile(Lipidprofile object) {
				return createLipidprofileAdapter();
			}
			@Override
			public Adapter caseCholesterol(Cholesterol object) {
				return createCholesterolAdapter();
			}
			@Override
			public Adapter caseCholesterolQuantity1(CholesterolQuantity1 object) {
				return createCholesterolQuantity1Adapter();
			}
			@Override
			public Adapter caseCholesterolReferenceRange1(CholesterolReferenceRange1 object) {
				return createCholesterolReferenceRange1Adapter();
			}
			@Override
			public Adapter caseTriglyceride(Triglyceride object) {
				return createTriglycerideAdapter();
			}
			@Override
			public Adapter caseTriglycerideReferenceRange1(TriglycerideReferenceRange1 object) {
				return createTriglycerideReferenceRange1Adapter();
			}
			@Override
			public Adapter caseLdlcholesterol(Ldlcholesterol object) {
				return createLdlcholesterolAdapter();
			}
			@Override
			public Adapter caseLdlcholesterolReferenceRange1(LdlcholesterolReferenceRange1 object) {
				return createLdlcholesterolReferenceRange1Adapter();
			}
			@Override
			public Adapter caseBodytemp(Bodytemp object) {
				return createBodytempAdapter();
			}
			@Override
			public Adapter caseBodytempCodeableConcept1(BodytempCodeableConcept1 object) {
				return createBodytempCodeableConcept1Adapter();
			}
			@Override
			public Adapter caseBodytempCodeableConcept1Coding1(BodytempCodeableConcept1Coding1 object) {
				return createBodytempCodeableConcept1Coding1Adapter();
			}
			@Override
			public Adapter caseBodytempQuantity1(BodytempQuantity1 object) {
				return createBodytempQuantity1Adapter();
			}
			@Override
			public Adapter caseMetadataResource(MetadataResource object) {
				return createMetadataResourceAdapter();
			}
			@Override
			public Adapter caseHeartrate(Heartrate object) {
				return createHeartrateAdapter();
			}
			@Override
			public Adapter caseHeartrateCodeableConcept1(HeartrateCodeableConcept1 object) {
				return createHeartrateCodeableConcept1Adapter();
			}
			@Override
			public Adapter caseHeartrateCodeableConcept1Coding1(HeartrateCodeableConcept1Coding1 object) {
				return createHeartrateCodeableConcept1Coding1Adapter();
			}
			@Override
			public Adapter caseHeartrateQuantity1(HeartrateQuantity1 object) {
				return createHeartrateQuantity1Adapter();
			}
			@Override
			public Adapter caseBodyheight(Bodyheight object) {
				return createBodyheightAdapter();
			}
			@Override
			public Adapter caseBodyheightCodeableConcept1(BodyheightCodeableConcept1 object) {
				return createBodyheightCodeableConcept1Adapter();
			}
			@Override
			public Adapter caseBodyheightCodeableConcept1Coding1(BodyheightCodeableConcept1Coding1 object) {
				return createBodyheightCodeableConcept1Coding1Adapter();
			}
			@Override
			public Adapter caseBodyheightQuantity1(BodyheightQuantity1 object) {
				return createBodyheightQuantity1Adapter();
			}
			@Override
			public Adapter caseElementdefinitionde(Elementdefinitionde object) {
				return createElementdefinitiondeAdapter();
			}
			@Override
			public Adapter caseElementdefinitiondeElement31(ElementdefinitiondeElement31 object) {
				return createElementdefinitiondeElement31Adapter();
			}
			@Override
			public Adapter caseDiagnosticreportgenetics(Diagnosticreportgenetics object) {
				return createDiagnosticreportgeneticsAdapter();
			}
			@Override
			public Adapter caseShareablecodesystem(Shareablecodesystem object) {
				return createShareablecodesystemAdapter();
			}
			@Override
			public Adapter caseShareablecodesystemConceptDefinition1(ShareablecodesystemConceptDefinition1 object) {
				return createShareablecodesystemConceptDefinition1Adapter();
			}
			@Override
			public Adapter caseOxygensat(Oxygensat object) {
				return createOxygensatAdapter();
			}
			@Override
			public Adapter caseOxygensatCodeableConcept1(OxygensatCodeableConcept1 object) {
				return createOxygensatCodeableConcept1Adapter();
			}
			@Override
			public Adapter caseOxygensatCodeableConcept1Coding1(OxygensatCodeableConcept1Coding1 object) {
				return createOxygensatCodeableConcept1Coding1Adapter();
			}
			@Override
			public Adapter caseOxygensatQuantity1(OxygensatQuantity1 object) {
				return createOxygensatQuantity1Adapter();
			}
			@Override
			public Adapter caseClinicaldocument(Clinicaldocument object) {
				return createClinicaldocumentAdapter();
			}
			@Override
			public Adapter caseCqllibrary(Cqllibrary object) {
				return createCqllibraryAdapter();
			}
			@Override
			public Adapter caseHeadcircum(Headcircum object) {
				return createHeadcircumAdapter();
			}
			@Override
			public Adapter caseHeadcircumCodeableConcept1(HeadcircumCodeableConcept1 object) {
				return createHeadcircumCodeableConcept1Adapter();
			}
			@Override
			public Adapter caseHeadcircumCodeableConcept1Coding1(HeadcircumCodeableConcept1Coding1 object) {
				return createHeadcircumCodeableConcept1Coding1Adapter();
			}
			@Override
			public Adapter caseHeadcircumQuantity1(HeadcircumQuantity1 object) {
				return createHeadcircumQuantity1Adapter();
			}
			@Override
			public Adapter caseSynchronizationplandefinition(Synchronizationplandefinition object) {
				return createSynchronizationplandefinitionAdapter();
			}
			@Override
			public Adapter caseVitalspanel(Vitalspanel object) {
				return createVitalspanelAdapter();
			}
			@Override
			public Adapter caseVitalspanelCodeableConcept1(VitalspanelCodeableConcept1 object) {
				return createVitalspanelCodeableConcept1Adapter();
			}
			@Override
			public Adapter caseVitalspanelCodeableConcept1Coding1(VitalspanelCodeableConcept1Coding1 object) {
				return createVitalspanelCodeableConcept1Coding1Adapter();
			}
			@Override
			public Adapter caseSynthesis(Synthesis object) {
				return createSynthesisAdapter();
			}
			@Override
			public Adapter caseSubstanceDefinition(SubstanceDefinition object) {
				return createSubstanceDefinitionAdapter();
			}
			@Override
			public Adapter caseSubstanceDefinitionMoiety(SubstanceDefinitionMoiety object) {
				return createSubstanceDefinitionMoietyAdapter();
			}
			@Override
			public Adapter caseSubstanceDefinitionProperty(SubstanceDefinitionProperty object) {
				return createSubstanceDefinitionPropertyAdapter();
			}
			@Override
			public Adapter caseSubstanceDefinitionStructure(SubstanceDefinitionStructure object) {
				return createSubstanceDefinitionStructureAdapter();
			}
			@Override
			public Adapter caseSubstanceDefinitionStructureIsotope(SubstanceDefinitionStructureIsotope object) {
				return createSubstanceDefinitionStructureIsotopeAdapter();
			}
			@Override
			public Adapter caseSubstanceDefinitionStructureIsotopeMolecularWeight(SubstanceDefinitionStructureIsotopeMolecularWeight object) {
				return createSubstanceDefinitionStructureIsotopeMolecularWeightAdapter();
			}
			@Override
			public Adapter caseSubstanceDefinitionStructureRepresentation(SubstanceDefinitionStructureRepresentation object) {
				return createSubstanceDefinitionStructureRepresentationAdapter();
			}
			@Override
			public Adapter caseSubstanceDefinitionCode(SubstanceDefinitionCode object) {
				return createSubstanceDefinitionCodeAdapter();
			}
			@Override
			public Adapter caseSubstanceDefinitionName(SubstanceDefinitionName object) {
				return createSubstanceDefinitionNameAdapter();
			}
			@Override
			public Adapter caseSubstanceDefinitionNameOfficial(SubstanceDefinitionNameOfficial object) {
				return createSubstanceDefinitionNameOfficialAdapter();
			}
			@Override
			public Adapter caseSubstanceDefinitionRelationship(SubstanceDefinitionRelationship object) {
				return createSubstanceDefinitionRelationshipAdapter();
			}
			@Override
			public Adapter caseProvenancerelevanthistory(Provenancerelevanthistory object) {
				return createProvenancerelevanthistoryAdapter();
			}
			@Override
			public Adapter caseProvenancerelevanthistoryAgent1(ProvenancerelevanthistoryAgent1 object) {
				return createProvenancerelevanthistoryAgent1Adapter();
			}
			@Override
			public Adapter caseCatalog(Catalog object) {
				return createCatalogAdapter();
			}
			@Override
			public Adapter caseCatalogSection1(CatalogSection1 object) {
				return createCatalogSection1Adapter();
			}
			@Override
			public Adapter caseBodyweight(Bodyweight object) {
				return createBodyweightAdapter();
			}
			@Override
			public Adapter caseBodyweightCodeableConcept1(BodyweightCodeableConcept1 object) {
				return createBodyweightCodeableConcept1Adapter();
			}
			@Override
			public Adapter caseBodyweightCodeableConcept1Coding1(BodyweightCodeableConcept1Coding1 object) {
				return createBodyweightCodeableConcept1Coding1Adapter();
			}
			@Override
			public Adapter caseBodyweightQuantity1(BodyweightQuantity1 object) {
				return createBodyweightQuantity1Adapter();
			}
			@Override
			public Adapter caseBp(Bp object) {
				return createBpAdapter();
			}
			@Override
			public Adapter caseBpCodeableConcept1(BpCodeableConcept1 object) {
				return createBpCodeableConcept1Adapter();
			}
			@Override
			public Adapter caseBpCodeableConcept1Coding1(BpCodeableConcept1Coding1 object) {
				return createBpCodeableConcept1Coding1Adapter();
			}
			@Override
			public Adapter caseBpComponent11(BpComponent11 object) {
				return createBpComponent11Adapter();
			}
			@Override
			public Adapter caseBpComponent11CodeableConcept1(BpComponent11CodeableConcept1 object) {
				return createBpComponent11CodeableConcept1Adapter();
			}
			@Override
			public Adapter caseBpComponent11CodeableConcept1Coding1(BpComponent11CodeableConcept1Coding1 object) {
				return createBpComponent11CodeableConcept1Coding1Adapter();
			}
			@Override
			public Adapter caseBpComponent11Quantity1(BpComponent11Quantity1 object) {
				return createBpComponent11Quantity1Adapter();
			}
			@Override
			public Adapter caseBpComponent12(BpComponent12 object) {
				return createBpComponent12Adapter();
			}
			@Override
			public Adapter caseBpComponent12CodeableConcept1(BpComponent12CodeableConcept1 object) {
				return createBpComponent12CodeableConcept1Adapter();
			}
			@Override
			public Adapter caseBpComponent12CodeableConcept1Coding1(BpComponent12CodeableConcept1Coding1 object) {
				return createBpComponent12CodeableConcept1Coding1Adapter();
			}
			@Override
			public Adapter caseBpComponent12Quantity1(BpComponent12Quantity1 object) {
				return createBpComponent12Quantity1Adapter();
			}
			@Override
			public Adapter caseServicerequestgenetics(Servicerequestgenetics object) {
				return createServicerequestgeneticsAdapter();
			}
			@Override
			public Adapter caseShareablevalueset(Shareablevalueset object) {
				return createShareablevaluesetAdapter();
			}
			@Override
			public Adapter caseGroupdefinition(Groupdefinition object) {
				return createGroupdefinitionAdapter();
			}
			@Override
			public Adapter caseActualgroup(Actualgroup object) {
				return createActualgroupAdapter();
			}
			@Override
			public Adapter caseHlaresult(Hlaresult object) {
				return createHlaresultAdapter();
			}
			@Override
			public Adapter caseCdshooksrequestgroup(Cdshooksrequestgroup object) {
				return createCdshooksrequestgroupAdapter();
			}
			@Override
			public Adapter caseCdshooksrequestgroupAction1(CdshooksrequestgroupAction1 object) {
				return createCdshooksrequestgroupAction1Adapter();
			}
			@Override
			public Adapter caseObservationgenetics(Observationgenetics object) {
				return createObservationgeneticsAdapter();
			}
			@Override
			public Adapter caseBase(Base object) {
				return createBaseAdapter();
			}
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public Adapter caseDomainResource(DomainResource object) {
				return createDomainResourceAdapter();
			}
			@Override
			public Adapter caseEvidenceVariable(EvidenceVariable object) {
				return createEvidenceVariableAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseDataType(DataType object) {
				return createDataTypeAdapter();
			}
			@Override
			public Adapter caseBackboneElement(BackboneElement object) {
				return createBackboneElementAdapter();
			}
			@Override
			public Adapter caseEvidenceVariableCharacteristic(EvidenceVariableCharacteristic object) {
				return createEvidenceVariableCharacteristicAdapter();
			}
			@Override
			public Adapter caseObservation(Observation object) {
				return createObservationAdapter();
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
			public Adapter caseObservationComponent(ObservationComponent object) {
				return createObservationComponentAdapter();
			}
			@Override
			public Adapter caseQuantity(Quantity object) {
				return createQuantityAdapter();
			}
			@Override
			public Adapter casePlanDefinition(PlanDefinition object) {
				return createPlanDefinitionAdapter();
			}
			@Override
			public Adapter casePlanDefinitionAction(PlanDefinitionAction object) {
				return createPlanDefinitionActionAdapter();
			}
			@Override
			public Adapter caseQuestionnaire(Questionnaire object) {
				return createQuestionnaireAdapter();
			}
			@Override
			public Adapter caseLibrary(Library object) {
				return createLibraryAdapter();
			}
			@Override
			public Adapter caseGuidanceResponse(GuidanceResponse object) {
				return createGuidanceResponseAdapter();
			}
			@Override
			public Adapter caseActivityDefinition(ActivityDefinition object) {
				return createActivityDefinitionAdapter();
			}
			@Override
			public Adapter caseMeasure(Measure object) {
				return createMeasureAdapter();
			}
			@Override
			public Adapter caseFamilyMemberHistory(FamilyMemberHistory object) {
				return createFamilyMemberHistoryAdapter();
			}
			@Override
			public Adapter caseFamilyMemberHistoryCondition(FamilyMemberHistoryCondition object) {
				return createFamilyMemberHistoryConditionAdapter();
			}
			@Override
			public Adapter caseObservationReferenceRange(ObservationReferenceRange object) {
				return createObservationReferenceRangeAdapter();
			}
			@Override
			public Adapter caseDiagnosticReport(DiagnosticReport object) {
				return createDiagnosticReportAdapter();
			}
			@Override
			public Adapter caseElementDefinition(ElementDefinition object) {
				return createElementDefinitionAdapter();
			}
			@Override
			public Adapter caseElementDefinitionElement3(ElementDefinitionElement3 object) {
				return createElementDefinitionElement3Adapter();
			}
			@Override
			public Adapter caseCodeSystem(CodeSystem object) {
				return createCodeSystemAdapter();
			}
			@Override
			public Adapter caseCodeSystemConceptDefinition(CodeSystemConceptDefinition object) {
				return createCodeSystemConceptDefinitionAdapter();
			}
			@Override
			public Adapter caseComposition(Composition object) {
				return createCompositionAdapter();
			}
			@Override
			public Adapter caseEvidence(Evidence object) {
				return createEvidenceAdapter();
			}
			@Override
			public Adapter caseProvenance(Provenance object) {
				return createProvenanceAdapter();
			}
			@Override
			public Adapter caseProvenanceAgent(ProvenanceAgent object) {
				return createProvenanceAgentAdapter();
			}
			@Override
			public Adapter caseCompositionSection(CompositionSection object) {
				return createCompositionSectionAdapter();
			}
			@Override
			public Adapter caseServiceRequest(ServiceRequest object) {
				return createServiceRequestAdapter();
			}
			@Override
			public Adapter caseValueSet(ValueSet object) {
				return createValueSetAdapter();
			}
			@Override
			public Adapter caseGroup(Group object) {
				return createGroupAdapter();
			}
			@Override
			public Adapter caseRequestGroup(RequestGroup object) {
				return createRequestGroupAdapter();
			}
			@Override
			public Adapter caseRequestGroupAction(RequestGroupAction object) {
				return createRequestGroupActionAdapter();
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
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.Picoelement <em>Picoelement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.Picoelement
	 * @generated
	 */
	public Adapter createPicoelementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.PicoelementCharacteristic1 <em>Picoelement Characteristic1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.PicoelementCharacteristic1
	 * @generated
	 */
	public Adapter createPicoelementCharacteristic1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.Bmi <em>Bmi</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.Bmi
	 * @generated
	 */
	public Adapter createBmiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.Vitalsigns <em>Vitalsigns</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.Vitalsigns
	 * @generated
	 */
	public Adapter createVitalsignsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.VitalsignsCodeableConcept1 <em>Vitalsigns Codeable Concept1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.VitalsignsCodeableConcept1
	 * @generated
	 */
	public Adapter createVitalsignsCodeableConcept1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.VitalsignsCodeableConcept1Coding1 <em>Vitalsigns Codeable Concept1 Coding1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.VitalsignsCodeableConcept1Coding1
	 * @generated
	 */
	public Adapter createVitalsignsCodeableConcept1Coding1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.VitalsignsComponent1 <em>Vitalsigns Component1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.VitalsignsComponent1
	 * @generated
	 */
	public Adapter createVitalsignsComponent1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.BmiCodeableConcept1 <em>Bmi Codeable Concept1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.BmiCodeableConcept1
	 * @generated
	 */
	public Adapter createBmiCodeableConcept1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.BmiCodeableConcept1Coding1 <em>Bmi Codeable Concept1 Coding1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.BmiCodeableConcept1Coding1
	 * @generated
	 */
	public Adapter createBmiCodeableConcept1Coding1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.BmiQuantity1 <em>Bmi Quantity1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.BmiQuantity1
	 * @generated
	 */
	public Adapter createBmiQuantity1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.Devicemetricobservation <em>Devicemetricobservation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.Devicemetricobservation
	 * @generated
	 */
	public Adapter createDevicemetricobservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.Cdshooksserviceplandefinition <em>Cdshooksserviceplandefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.Cdshooksserviceplandefinition
	 * @generated
	 */
	public Adapter createCdshooksserviceplandefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.CdshooksserviceplandefinitionAction1 <em>Cdshooksserviceplandefinition Action1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.CdshooksserviceplandefinitionAction1
	 * @generated
	 */
	public Adapter createCdshooksserviceplandefinitionAction1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.Cqfquestionnaire <em>Cqfquestionnaire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.Cqfquestionnaire
	 * @generated
	 */
	public Adapter createCqfquestionnaireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.Computableplandefinition <em>Computableplandefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.Computableplandefinition
	 * @generated
	 */
	public Adapter createComputableplandefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.Shareablelibrary <em>Shareablelibrary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.Shareablelibrary
	 * @generated
	 */
	public Adapter createShareablelibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.Cdshooksguidanceresponse <em>Cdshooksguidanceresponse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.Cdshooksguidanceresponse
	 * @generated
	 */
	public Adapter createCdshooksguidanceresponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.Shareableactivitydefinition <em>Shareableactivitydefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.Shareableactivitydefinition
	 * @generated
	 */
	public Adapter createShareableactivitydefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.Shareablemeasure <em>Shareablemeasure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.Shareablemeasure
	 * @generated
	 */
	public Adapter createShareablemeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.Resprate <em>Resprate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.Resprate
	 * @generated
	 */
	public Adapter createResprateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.ResprateCodeableConcept1 <em>Resprate Codeable Concept1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.ResprateCodeableConcept1
	 * @generated
	 */
	public Adapter createResprateCodeableConcept1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.ResprateCodeableConcept1Coding1 <em>Resprate Codeable Concept1 Coding1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.ResprateCodeableConcept1Coding1
	 * @generated
	 */
	public Adapter createResprateCodeableConcept1Coding1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.ResprateQuantity1 <em>Resprate Quantity1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.ResprateQuantity1
	 * @generated
	 */
	public Adapter createResprateQuantity1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.Familymemberhistorygenetic <em>Familymemberhistorygenetic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.Familymemberhistorygenetic
	 * @generated
	 */
	public Adapter createFamilymemberhistorygeneticAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.FamilymemberhistorygeneticCondition1 <em>Familymemberhistorygenetic Condition1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.FamilymemberhistorygeneticCondition1
	 * @generated
	 */
	public Adapter createFamilymemberhistorygeneticCondition1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.Hdlcholesterol <em>Hdlcholesterol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.Hdlcholesterol
	 * @generated
	 */
	public Adapter createHdlcholesterolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.HdlcholesterolReferenceRange1 <em>Hdlcholesterol Reference Range1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.HdlcholesterolReferenceRange1
	 * @generated
	 */
	public Adapter createHdlcholesterolReferenceRange1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.Shareableplandefinition <em>Shareableplandefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.Shareableplandefinition
	 * @generated
	 */
	public Adapter createShareableplandefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.Lipidprofile <em>Lipidprofile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.Lipidprofile
	 * @generated
	 */
	public Adapter createLipidprofileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.Cholesterol <em>Cholesterol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.Cholesterol
	 * @generated
	 */
	public Adapter createCholesterolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.CholesterolQuantity1 <em>Cholesterol Quantity1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.CholesterolQuantity1
	 * @generated
	 */
	public Adapter createCholesterolQuantity1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.CholesterolReferenceRange1 <em>Cholesterol Reference Range1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.CholesterolReferenceRange1
	 * @generated
	 */
	public Adapter createCholesterolReferenceRange1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.Triglyceride <em>Triglyceride</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.Triglyceride
	 * @generated
	 */
	public Adapter createTriglycerideAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.TriglycerideReferenceRange1 <em>Triglyceride Reference Range1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.TriglycerideReferenceRange1
	 * @generated
	 */
	public Adapter createTriglycerideReferenceRange1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.Ldlcholesterol <em>Ldlcholesterol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.Ldlcholesterol
	 * @generated
	 */
	public Adapter createLdlcholesterolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.LdlcholesterolReferenceRange1 <em>Ldlcholesterol Reference Range1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.LdlcholesterolReferenceRange1
	 * @generated
	 */
	public Adapter createLdlcholesterolReferenceRange1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.Bodytemp <em>Bodytemp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.Bodytemp
	 * @generated
	 */
	public Adapter createBodytempAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.BodytempCodeableConcept1 <em>Bodytemp Codeable Concept1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.BodytempCodeableConcept1
	 * @generated
	 */
	public Adapter createBodytempCodeableConcept1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.BodytempCodeableConcept1Coding1 <em>Bodytemp Codeable Concept1 Coding1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.BodytempCodeableConcept1Coding1
	 * @generated
	 */
	public Adapter createBodytempCodeableConcept1Coding1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.BodytempQuantity1 <em>Bodytemp Quantity1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.BodytempQuantity1
	 * @generated
	 */
	public Adapter createBodytempQuantity1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.MetadataResource <em>Metadata Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.MetadataResource
	 * @generated
	 */
	public Adapter createMetadataResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.Heartrate <em>Heartrate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.Heartrate
	 * @generated
	 */
	public Adapter createHeartrateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.HeartrateCodeableConcept1 <em>Heartrate Codeable Concept1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.HeartrateCodeableConcept1
	 * @generated
	 */
	public Adapter createHeartrateCodeableConcept1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.HeartrateCodeableConcept1Coding1 <em>Heartrate Codeable Concept1 Coding1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.HeartrateCodeableConcept1Coding1
	 * @generated
	 */
	public Adapter createHeartrateCodeableConcept1Coding1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.HeartrateQuantity1 <em>Heartrate Quantity1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.HeartrateQuantity1
	 * @generated
	 */
	public Adapter createHeartrateQuantity1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.Bodyheight <em>Bodyheight</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.Bodyheight
	 * @generated
	 */
	public Adapter createBodyheightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.BodyheightCodeableConcept1 <em>Bodyheight Codeable Concept1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.BodyheightCodeableConcept1
	 * @generated
	 */
	public Adapter createBodyheightCodeableConcept1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.BodyheightCodeableConcept1Coding1 <em>Bodyheight Codeable Concept1 Coding1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.BodyheightCodeableConcept1Coding1
	 * @generated
	 */
	public Adapter createBodyheightCodeableConcept1Coding1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.BodyheightQuantity1 <em>Bodyheight Quantity1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.BodyheightQuantity1
	 * @generated
	 */
	public Adapter createBodyheightQuantity1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.Elementdefinitionde <em>Elementdefinitionde</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.Elementdefinitionde
	 * @generated
	 */
	public Adapter createElementdefinitiondeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.ElementdefinitiondeElement31 <em>Elementdefinitionde Element31</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.ElementdefinitiondeElement31
	 * @generated
	 */
	public Adapter createElementdefinitiondeElement31Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.Diagnosticreportgenetics <em>Diagnosticreportgenetics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.Diagnosticreportgenetics
	 * @generated
	 */
	public Adapter createDiagnosticreportgeneticsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.Shareablecodesystem <em>Shareablecodesystem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.Shareablecodesystem
	 * @generated
	 */
	public Adapter createShareablecodesystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.ShareablecodesystemConceptDefinition1 <em>Shareablecodesystem Concept Definition1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.ShareablecodesystemConceptDefinition1
	 * @generated
	 */
	public Adapter createShareablecodesystemConceptDefinition1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.Oxygensat <em>Oxygensat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.Oxygensat
	 * @generated
	 */
	public Adapter createOxygensatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.OxygensatCodeableConcept1 <em>Oxygensat Codeable Concept1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.OxygensatCodeableConcept1
	 * @generated
	 */
	public Adapter createOxygensatCodeableConcept1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.OxygensatCodeableConcept1Coding1 <em>Oxygensat Codeable Concept1 Coding1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.OxygensatCodeableConcept1Coding1
	 * @generated
	 */
	public Adapter createOxygensatCodeableConcept1Coding1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.OxygensatQuantity1 <em>Oxygensat Quantity1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.OxygensatQuantity1
	 * @generated
	 */
	public Adapter createOxygensatQuantity1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.Clinicaldocument <em>Clinicaldocument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.Clinicaldocument
	 * @generated
	 */
	public Adapter createClinicaldocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.Cqllibrary <em>Cqllibrary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.Cqllibrary
	 * @generated
	 */
	public Adapter createCqllibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.Headcircum <em>Headcircum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.Headcircum
	 * @generated
	 */
	public Adapter createHeadcircumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.HeadcircumCodeableConcept1 <em>Headcircum Codeable Concept1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.HeadcircumCodeableConcept1
	 * @generated
	 */
	public Adapter createHeadcircumCodeableConcept1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.HeadcircumCodeableConcept1Coding1 <em>Headcircum Codeable Concept1 Coding1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.HeadcircumCodeableConcept1Coding1
	 * @generated
	 */
	public Adapter createHeadcircumCodeableConcept1Coding1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.HeadcircumQuantity1 <em>Headcircum Quantity1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.HeadcircumQuantity1
	 * @generated
	 */
	public Adapter createHeadcircumQuantity1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.Synchronizationplandefinition <em>Synchronizationplandefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.Synchronizationplandefinition
	 * @generated
	 */
	public Adapter createSynchronizationplandefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.Vitalspanel <em>Vitalspanel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.Vitalspanel
	 * @generated
	 */
	public Adapter createVitalspanelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.VitalspanelCodeableConcept1 <em>Vitalspanel Codeable Concept1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.VitalspanelCodeableConcept1
	 * @generated
	 */
	public Adapter createVitalspanelCodeableConcept1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.VitalspanelCodeableConcept1Coding1 <em>Vitalspanel Codeable Concept1 Coding1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.VitalspanelCodeableConcept1Coding1
	 * @generated
	 */
	public Adapter createVitalspanelCodeableConcept1Coding1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.Synthesis <em>Synthesis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.Synthesis
	 * @generated
	 */
	public Adapter createSynthesisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.SubstanceDefinition <em>Substance Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.SubstanceDefinition
	 * @generated
	 */
	public Adapter createSubstanceDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.SubstanceDefinitionMoiety <em>Substance Definition Moiety</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.SubstanceDefinitionMoiety
	 * @generated
	 */
	public Adapter createSubstanceDefinitionMoietyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.SubstanceDefinitionProperty <em>Substance Definition Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.SubstanceDefinitionProperty
	 * @generated
	 */
	public Adapter createSubstanceDefinitionPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.SubstanceDefinitionStructure <em>Substance Definition Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.SubstanceDefinitionStructure
	 * @generated
	 */
	public Adapter createSubstanceDefinitionStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.SubstanceDefinitionStructureIsotope <em>Substance Definition Structure Isotope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.SubstanceDefinitionStructureIsotope
	 * @generated
	 */
	public Adapter createSubstanceDefinitionStructureIsotopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.SubstanceDefinitionStructureIsotopeMolecularWeight <em>Substance Definition Structure Isotope Molecular Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.SubstanceDefinitionStructureIsotopeMolecularWeight
	 * @generated
	 */
	public Adapter createSubstanceDefinitionStructureIsotopeMolecularWeightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.SubstanceDefinitionStructureRepresentation <em>Substance Definition Structure Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.SubstanceDefinitionStructureRepresentation
	 * @generated
	 */
	public Adapter createSubstanceDefinitionStructureRepresentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.SubstanceDefinitionCode <em>Substance Definition Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.SubstanceDefinitionCode
	 * @generated
	 */
	public Adapter createSubstanceDefinitionCodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.SubstanceDefinitionName <em>Substance Definition Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.SubstanceDefinitionName
	 * @generated
	 */
	public Adapter createSubstanceDefinitionNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.SubstanceDefinitionNameOfficial <em>Substance Definition Name Official</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.SubstanceDefinitionNameOfficial
	 * @generated
	 */
	public Adapter createSubstanceDefinitionNameOfficialAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.SubstanceDefinitionRelationship <em>Substance Definition Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.SubstanceDefinitionRelationship
	 * @generated
	 */
	public Adapter createSubstanceDefinitionRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.Provenancerelevanthistory <em>Provenancerelevanthistory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.Provenancerelevanthistory
	 * @generated
	 */
	public Adapter createProvenancerelevanthistoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.ProvenancerelevanthistoryAgent1 <em>Provenancerelevanthistory Agent1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.ProvenancerelevanthistoryAgent1
	 * @generated
	 */
	public Adapter createProvenancerelevanthistoryAgent1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.Catalog <em>Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.Catalog
	 * @generated
	 */
	public Adapter createCatalogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.CatalogSection1 <em>Catalog Section1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.CatalogSection1
	 * @generated
	 */
	public Adapter createCatalogSection1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.Bodyweight <em>Bodyweight</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.Bodyweight
	 * @generated
	 */
	public Adapter createBodyweightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.BodyweightCodeableConcept1 <em>Bodyweight Codeable Concept1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.BodyweightCodeableConcept1
	 * @generated
	 */
	public Adapter createBodyweightCodeableConcept1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.BodyweightCodeableConcept1Coding1 <em>Bodyweight Codeable Concept1 Coding1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.BodyweightCodeableConcept1Coding1
	 * @generated
	 */
	public Adapter createBodyweightCodeableConcept1Coding1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.BodyweightQuantity1 <em>Bodyweight Quantity1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.BodyweightQuantity1
	 * @generated
	 */
	public Adapter createBodyweightQuantity1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.Bp <em>Bp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.Bp
	 * @generated
	 */
	public Adapter createBpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.BpCodeableConcept1 <em>Bp Codeable Concept1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.BpCodeableConcept1
	 * @generated
	 */
	public Adapter createBpCodeableConcept1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.BpCodeableConcept1Coding1 <em>Bp Codeable Concept1 Coding1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.BpCodeableConcept1Coding1
	 * @generated
	 */
	public Adapter createBpCodeableConcept1Coding1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.BpComponent11 <em>Bp Component11</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.BpComponent11
	 * @generated
	 */
	public Adapter createBpComponent11Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.BpComponent11CodeableConcept1 <em>Bp Component11 Codeable Concept1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.BpComponent11CodeableConcept1
	 * @generated
	 */
	public Adapter createBpComponent11CodeableConcept1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.BpComponent11CodeableConcept1Coding1 <em>Bp Component11 Codeable Concept1 Coding1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.BpComponent11CodeableConcept1Coding1
	 * @generated
	 */
	public Adapter createBpComponent11CodeableConcept1Coding1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.BpComponent11Quantity1 <em>Bp Component11 Quantity1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.BpComponent11Quantity1
	 * @generated
	 */
	public Adapter createBpComponent11Quantity1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.BpComponent12 <em>Bp Component12</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.BpComponent12
	 * @generated
	 */
	public Adapter createBpComponent12Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.BpComponent12CodeableConcept1 <em>Bp Component12 Codeable Concept1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.BpComponent12CodeableConcept1
	 * @generated
	 */
	public Adapter createBpComponent12CodeableConcept1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.BpComponent12CodeableConcept1Coding1 <em>Bp Component12 Codeable Concept1 Coding1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.BpComponent12CodeableConcept1Coding1
	 * @generated
	 */
	public Adapter createBpComponent12CodeableConcept1Coding1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.BpComponent12Quantity1 <em>Bp Component12 Quantity1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.BpComponent12Quantity1
	 * @generated
	 */
	public Adapter createBpComponent12Quantity1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.Servicerequestgenetics <em>Servicerequestgenetics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.Servicerequestgenetics
	 * @generated
	 */
	public Adapter createServicerequestgeneticsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.Shareablevalueset <em>Shareablevalueset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.Shareablevalueset
	 * @generated
	 */
	public Adapter createShareablevaluesetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.Groupdefinition <em>Groupdefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.Groupdefinition
	 * @generated
	 */
	public Adapter createGroupdefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.Actualgroup <em>Actualgroup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.Actualgroup
	 * @generated
	 */
	public Adapter createActualgroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.Hlaresult <em>Hlaresult</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.Hlaresult
	 * @generated
	 */
	public Adapter createHlaresultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.Cdshooksrequestgroup <em>Cdshooksrequestgroup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.Cdshooksrequestgroup
	 * @generated
	 */
	public Adapter createCdshooksrequestgroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.CdshooksrequestgroupAction1 <em>Cdshooksrequestgroup Action1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.CdshooksrequestgroupAction1
	 * @generated
	 */
	public Adapter createCdshooksrequestgroupAction1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.profiles.Observationgenetics <em>Observationgenetics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.profiles.Observationgenetics
	 * @generated
	 */
	public Adapter createObservationgeneticsAdapter() {
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
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.DomainResource <em>Domain Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.DomainResource
	 * @generated
	 */
	public Adapter createDomainResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.EvidenceVariable <em>Evidence Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.EvidenceVariable
	 * @generated
	 */
	public Adapter createEvidenceVariableAdapter() {
		return null;
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
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.EvidenceVariableCharacteristic <em>Evidence Variable Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.EvidenceVariableCharacteristic
	 * @generated
	 */
	public Adapter createEvidenceVariableCharacteristicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.Observation <em>Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.Observation
	 * @generated
	 */
	public Adapter createObservationAdapter() {
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
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ObservationComponent <em>Observation Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ObservationComponent
	 * @generated
	 */
	public Adapter createObservationComponentAdapter() {
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
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.PlanDefinition <em>Plan Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.PlanDefinition
	 * @generated
	 */
	public Adapter createPlanDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.PlanDefinitionAction <em>Plan Definition Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.PlanDefinitionAction
	 * @generated
	 */
	public Adapter createPlanDefinitionActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.Questionnaire <em>Questionnaire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.Questionnaire
	 * @generated
	 */
	public Adapter createQuestionnaireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.Library
	 * @generated
	 */
	public Adapter createLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.GuidanceResponse <em>Guidance Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.GuidanceResponse
	 * @generated
	 */
	public Adapter createGuidanceResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ActivityDefinition <em>Activity Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ActivityDefinition
	 * @generated
	 */
	public Adapter createActivityDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.Measure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.Measure
	 * @generated
	 */
	public Adapter createMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.FamilyMemberHistory <em>Family Member History</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.FamilyMemberHistory
	 * @generated
	 */
	public Adapter createFamilyMemberHistoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.FamilyMemberHistoryCondition <em>Family Member History Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.FamilyMemberHistoryCondition
	 * @generated
	 */
	public Adapter createFamilyMemberHistoryConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ObservationReferenceRange <em>Observation Reference Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ObservationReferenceRange
	 * @generated
	 */
	public Adapter createObservationReferenceRangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.DiagnosticReport <em>Diagnostic Report</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.DiagnosticReport
	 * @generated
	 */
	public Adapter createDiagnosticReportAdapter() {
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
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.CodeSystem <em>Code System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.CodeSystem
	 * @generated
	 */
	public Adapter createCodeSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.CodeSystemConceptDefinition <em>Code System Concept Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.CodeSystemConceptDefinition
	 * @generated
	 */
	public Adapter createCodeSystemConceptDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.Composition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.Composition
	 * @generated
	 */
	public Adapter createCompositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.Evidence <em>Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.Evidence
	 * @generated
	 */
	public Adapter createEvidenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.Provenance <em>Provenance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.Provenance
	 * @generated
	 */
	public Adapter createProvenanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ProvenanceAgent <em>Provenance Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ProvenanceAgent
	 * @generated
	 */
	public Adapter createProvenanceAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.CompositionSection <em>Composition Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.CompositionSection
	 * @generated
	 */
	public Adapter createCompositionSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ServiceRequest <em>Service Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ServiceRequest
	 * @generated
	 */
	public Adapter createServiceRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.ValueSet <em>Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.ValueSet
	 * @generated
	 */
	public Adapter createValueSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.Group
	 * @generated
	 */
	public Adapter createGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.RequestGroup <em>Request Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.RequestGroup
	 * @generated
	 */
	public Adapter createRequestGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fhiRCore.resources.RequestGroupAction <em>Request Group Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fhiRCore.resources.RequestGroupAction
	 * @generated
	 */
	public Adapter createRequestGroupActionAdapter() {
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

} //ProfilesAdapterFactory
