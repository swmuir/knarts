/**
 */
package fhiRCore.valueSets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Resource Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fhiRCore.valueSets.ValueSetsPackage#getResourceType()
 * @model
 * @generated
 */
public enum ResourceType implements Enumerator {
	/**
	 * The '<em><b>Account</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCOUNT_VALUE
	 * @generated
	 * @ordered
	 */
	ACCOUNT(0, "account", "account"),

	/**
	 * The '<em><b>Activity Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTIVITY_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	ACTIVITY_DEFINITION(1, "activityDefinition", "activityDefinition"),

	/**
	 * The '<em><b>Adverse Event</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADVERSE_EVENT_VALUE
	 * @generated
	 * @ordered
	 */
	ADVERSE_EVENT(2, "adverseEvent", "adverseEvent"),

	/**
	 * The '<em><b>Allergy Intolerance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALLERGY_INTOLERANCE_VALUE
	 * @generated
	 * @ordered
	 */
	ALLERGY_INTOLERANCE(3, "allergyIntolerance", "allergyIntolerance"),

	/**
	 * The '<em><b>Appointment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPOINTMENT_VALUE
	 * @generated
	 * @ordered
	 */
	APPOINTMENT(4, "appointment", "appointment"),

	/**
	 * The '<em><b>Appointment Response</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPOINTMENT_RESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	APPOINTMENT_RESPONSE(5, "appointmentResponse", "appointmentResponse"),

	/**
	 * The '<em><b>Audit Event</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUDIT_EVENT_VALUE
	 * @generated
	 * @ordered
	 */
	AUDIT_EVENT(6, "auditEvent", "auditEvent"),

	/**
	 * The '<em><b>Basic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASIC_VALUE
	 * @generated
	 * @ordered
	 */
	BASIC(7, "basic", "basic"),

	/**
	 * The '<em><b>Binary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BINARY_VALUE
	 * @generated
	 * @ordered
	 */
	BINARY(8, "binary", "binary"),

	/**
	 * The '<em><b>Biologically Derived Product</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIOLOGICALLY_DERIVED_PRODUCT_VALUE
	 * @generated
	 * @ordered
	 */
	BIOLOGICALLY_DERIVED_PRODUCT(9, "biologicallyDerivedProduct", "biologicallyDerivedProduct"),

	/**
	 * The '<em><b>Body Structure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BODY_STRUCTURE_VALUE
	 * @generated
	 * @ordered
	 */
	BODY_STRUCTURE(10, "bodyStructure", "bodyStructure"),

	/**
	 * The '<em><b>Bundle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUNDLE_VALUE
	 * @generated
	 * @ordered
	 */
	BUNDLE(11, "bundle", "bundle"),

	/**
	 * The '<em><b>Capability Statement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAPABILITY_STATEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	CAPABILITY_STATEMENT(12, "capabilityStatement", "capabilityStatement"),

	/**
	 * The '<em><b>Care Plan</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARE_PLAN_VALUE
	 * @generated
	 * @ordered
	 */
	CARE_PLAN(13, "carePlan", "carePlan"),

	/**
	 * The '<em><b>Care Team</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARE_TEAM_VALUE
	 * @generated
	 * @ordered
	 */
	CARE_TEAM(14, "careTeam", "careTeam"),

	/**
	 * The '<em><b>Catalog Entry</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CATALOG_ENTRY_VALUE
	 * @generated
	 * @ordered
	 */
	CATALOG_ENTRY(15, "catalogEntry", "catalogEntry"),

	/**
	 * The '<em><b>Charge Item</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHARGE_ITEM_VALUE
	 * @generated
	 * @ordered
	 */
	CHARGE_ITEM(16, "chargeItem", "chargeItem"),

	/**
	 * The '<em><b>Charge Item Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHARGE_ITEM_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	CHARGE_ITEM_DEFINITION(17, "chargeItemDefinition", "chargeItemDefinition"),

	/**
	 * The '<em><b>Claim</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLAIM_VALUE
	 * @generated
	 * @ordered
	 */
	CLAIM(18, "claim", "claim"),

	/**
	 * The '<em><b>Claim Response</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLAIM_RESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	CLAIM_RESPONSE(19, "claimResponse", "claimResponse"),

	/**
	 * The '<em><b>Clinical Impression</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLINICAL_IMPRESSION_VALUE
	 * @generated
	 * @ordered
	 */
	CLINICAL_IMPRESSION(20, "clinicalImpression", "clinicalImpression"),

	/**
	 * The '<em><b>Code System</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CODE_SYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	CODE_SYSTEM(21, "codeSystem", "codeSystem"),

	/**
	 * The '<em><b>Communication</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMUNICATION_VALUE
	 * @generated
	 * @ordered
	 */
	COMMUNICATION(22, "communication", "communication"),

	/**
	 * The '<em><b>Communication Request</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMUNICATION_REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	COMMUNICATION_REQUEST(23, "communicationRequest", "communicationRequest"),

	/**
	 * The '<em><b>Compartment Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPARTMENT_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	COMPARTMENT_DEFINITION(24, "compartmentDefinition", "compartmentDefinition"),

	/**
	 * The '<em><b>Composition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPOSITION_VALUE
	 * @generated
	 * @ordered
	 */
	COMPOSITION(25, "composition", "composition"),

	/**
	 * The '<em><b>Concept Map</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONCEPT_MAP_VALUE
	 * @generated
	 * @ordered
	 */
	CONCEPT_MAP(26, "conceptMap", "conceptMap"),

	/**
	 * The '<em><b>Condition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONDITION_VALUE
	 * @generated
	 * @ordered
	 */
	CONDITION(27, "condition", "condition"),

	/**
	 * The '<em><b>Consent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSENT_VALUE
	 * @generated
	 * @ordered
	 */
	CONSENT(28, "consent", "consent"),

	/**
	 * The '<em><b>Contract</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTRACT_VALUE
	 * @generated
	 * @ordered
	 */
	CONTRACT(29, "contract", "contract"),

	/**
	 * The '<em><b>Coverage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COVERAGE_VALUE
	 * @generated
	 * @ordered
	 */
	COVERAGE(30, "coverage", "coverage"),

	/**
	 * The '<em><b>Coverage Eligibility Request</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COVERAGE_ELIGIBILITY_REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	COVERAGE_ELIGIBILITY_REQUEST(31, "coverageEligibilityRequest", "coverageEligibilityRequest"),

	/**
	 * The '<em><b>Coverage Eligibility Response</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COVERAGE_ELIGIBILITY_RESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	COVERAGE_ELIGIBILITY_RESPONSE(32, "coverageEligibilityResponse", "coverageEligibilityResponse"),

	/**
	 * The '<em><b>Detected Issue</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DETECTED_ISSUE_VALUE
	 * @generated
	 * @ordered
	 */
	DETECTED_ISSUE(33, "detectedIssue", "detectedIssue"),

	/**
	 * The '<em><b>Device</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVICE_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICE(34, "device", "device"),

	/**
	 * The '<em><b>Device Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVICE_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICE_DEFINITION(35, "deviceDefinition", "deviceDefinition"),

	/**
	 * The '<em><b>Device Metric</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVICE_METRIC_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICE_METRIC(36, "deviceMetric", "deviceMetric"),

	/**
	 * The '<em><b>Device Request</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVICE_REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICE_REQUEST(37, "deviceRequest", "deviceRequest"),

	/**
	 * The '<em><b>Device Use Statement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVICE_USE_STATEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICE_USE_STATEMENT(38, "deviceUseStatement", "deviceUseStatement"),

	/**
	 * The '<em><b>Diagnostic Report</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIAGNOSTIC_REPORT_VALUE
	 * @generated
	 * @ordered
	 */
	DIAGNOSTIC_REPORT(39, "diagnosticReport", "diagnosticReport"),

	/**
	 * The '<em><b>Document Manifest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCUMENT_MANIFEST_VALUE
	 * @generated
	 * @ordered
	 */
	DOCUMENT_MANIFEST(40, "documentManifest", "documentManifest"),

	/**
	 * The '<em><b>Document Reference</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCUMENT_REFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	DOCUMENT_REFERENCE(41, "documentReference", "documentReference"),

	/**
	 * The '<em><b>Domain Resource</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOMAIN_RESOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	DOMAIN_RESOURCE(42, "domainResource", "domainResource"),

	/**
	 * The '<em><b>Effect Evidence Synthesis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EFFECT_EVIDENCE_SYNTHESIS_VALUE
	 * @generated
	 * @ordered
	 */
	EFFECT_EVIDENCE_SYNTHESIS(43, "effectEvidenceSynthesis", "effectEvidenceSynthesis"),

	/**
	 * The '<em><b>Encounter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENCOUNTER_VALUE
	 * @generated
	 * @ordered
	 */
	ENCOUNTER(44, "encounter", "encounter"),

	/**
	 * The '<em><b>Endpoint</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENDPOINT_VALUE
	 * @generated
	 * @ordered
	 */
	ENDPOINT(45, "endpoint", "endpoint"),

	/**
	 * The '<em><b>Enrollment Request</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENROLLMENT_REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	ENROLLMENT_REQUEST(46, "enrollmentRequest", "enrollmentRequest"),

	/**
	 * The '<em><b>Enrollment Response</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENROLLMENT_RESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	ENROLLMENT_RESPONSE(47, "enrollmentResponse", "enrollmentResponse"),

	/**
	 * The '<em><b>Episode Of Care</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EPISODE_OF_CARE_VALUE
	 * @generated
	 * @ordered
	 */
	EPISODE_OF_CARE(48, "episodeOfCare", "episodeOfCare"),

	/**
	 * The '<em><b>Event Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVENT_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	EVENT_DEFINITION(49, "eventDefinition", "eventDefinition"),

	/**
	 * The '<em><b>Evidence</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVIDENCE_VALUE
	 * @generated
	 * @ordered
	 */
	EVIDENCE(50, "evidence", "evidence"),

	/**
	 * The '<em><b>Evidence Variable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVIDENCE_VARIABLE_VALUE
	 * @generated
	 * @ordered
	 */
	EVIDENCE_VARIABLE(51, "evidenceVariable", "evidenceVariable"),

	/**
	 * The '<em><b>Example Scenario</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXAMPLE_SCENARIO_VALUE
	 * @generated
	 * @ordered
	 */
	EXAMPLE_SCENARIO(52, "exampleScenario", "exampleScenario"),

	/**
	 * The '<em><b>Explanation Of Benefit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPLANATION_OF_BENEFIT_VALUE
	 * @generated
	 * @ordered
	 */
	EXPLANATION_OF_BENEFIT(53, "explanationOfBenefit", "explanationOfBenefit"),

	/**
	 * The '<em><b>Family Member History</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAMILY_MEMBER_HISTORY_VALUE
	 * @generated
	 * @ordered
	 */
	FAMILY_MEMBER_HISTORY(54, "familyMemberHistory", "familyMemberHistory"),

	/**
	 * The '<em><b>Flag</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLAG_VALUE
	 * @generated
	 * @ordered
	 */
	FLAG(55, "flag", "flag"),

	/**
	 * The '<em><b>Goal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOAL_VALUE
	 * @generated
	 * @ordered
	 */
	GOAL(56, "goal", "goal"),

	/**
	 * The '<em><b>Graph Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRAPH_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	GRAPH_DEFINITION(57, "graphDefinition", "graphDefinition"),

	/**
	 * The '<em><b>Group</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GROUP_VALUE
	 * @generated
	 * @ordered
	 */
	GROUP(58, "group", "group"),

	/**
	 * The '<em><b>Guidance Response</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GUIDANCE_RESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	GUIDANCE_RESPONSE(59, "guidanceResponse", "guidanceResponse"),

	/**
	 * The '<em><b>Healthcare Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEALTHCARE_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	HEALTHCARE_SERVICE(60, "healthcareService", "healthcareService"),

	/**
	 * The '<em><b>Imaging Study</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGING_STUDY_VALUE
	 * @generated
	 * @ordered
	 */
	IMAGING_STUDY(61, "imagingStudy", "imagingStudy"),

	/**
	 * The '<em><b>Immunization</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMMUNIZATION_VALUE
	 * @generated
	 * @ordered
	 */
	IMMUNIZATION(62, "immunization", "immunization"),

	/**
	 * The '<em><b>Immunization Evaluation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMMUNIZATION_EVALUATION_VALUE
	 * @generated
	 * @ordered
	 */
	IMMUNIZATION_EVALUATION(63, "immunizationEvaluation", "immunizationEvaluation"),

	/**
	 * The '<em><b>Immunization Recommendation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMMUNIZATION_RECOMMENDATION_VALUE
	 * @generated
	 * @ordered
	 */
	IMMUNIZATION_RECOMMENDATION(64, "immunizationRecommendation", "immunizationRecommendation"),

	/**
	 * The '<em><b>Implementation Guide</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPLEMENTATION_GUIDE_VALUE
	 * @generated
	 * @ordered
	 */
	IMPLEMENTATION_GUIDE(65, "implementationGuide", "implementationGuide"),

	/**
	 * The '<em><b>Insurance Plan</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSURANCE_PLAN_VALUE
	 * @generated
	 * @ordered
	 */
	INSURANCE_PLAN(66, "insurancePlan", "insurancePlan"),

	/**
	 * The '<em><b>Invoice</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVOICE_VALUE
	 * @generated
	 * @ordered
	 */
	INVOICE(67, "invoice", "invoice"),

	/**
	 * The '<em><b>Library</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIBRARY_VALUE
	 * @generated
	 * @ordered
	 */
	LIBRARY(68, "library", "library"),

	/**
	 * The '<em><b>Linkage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINKAGE_VALUE
	 * @generated
	 * @ordered
	 */
	LINKAGE(69, "linkage", "linkage"),

	/**
	 * The '<em><b>List</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIST_VALUE
	 * @generated
	 * @ordered
	 */
	LIST(70, "list", "list"),

	/**
	 * The '<em><b>Location</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCATION_VALUE
	 * @generated
	 * @ordered
	 */
	LOCATION(71, "location", "location"),

	/**
	 * The '<em><b>Measure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEASURE_VALUE
	 * @generated
	 * @ordered
	 */
	MEASURE(72, "measure", "measure"),

	/**
	 * The '<em><b>Measure Report</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEASURE_REPORT_VALUE
	 * @generated
	 * @ordered
	 */
	MEASURE_REPORT(73, "measureReport", "measureReport"),

	/**
	 * The '<em><b>Media</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDIA_VALUE
	 * @generated
	 * @ordered
	 */
	MEDIA(74, "media", "media"),

	/**
	 * The '<em><b>Medication</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICATION_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICATION(75, "medication", "medication"),

	/**
	 * The '<em><b>Medication Administration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICATION_ADMINISTRATION_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICATION_ADMINISTRATION(76, "medicationAdministration", "medicationAdministration"),

	/**
	 * The '<em><b>Medication Dispense</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICATION_DISPENSE_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICATION_DISPENSE(77, "medicationDispense", "medicationDispense"),

	/**
	 * The '<em><b>Medication Knowledge</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICATION_KNOWLEDGE_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICATION_KNOWLEDGE(78, "medicationKnowledge", "medicationKnowledge"),

	/**
	 * The '<em><b>Medication Request</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICATION_REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICATION_REQUEST(79, "medicationRequest", "medicationRequest"),

	/**
	 * The '<em><b>Medication Statement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICATION_STATEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICATION_STATEMENT(80, "medicationStatement", "medicationStatement"),

	/**
	 * The '<em><b>Medicinal Product</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICINAL_PRODUCT_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICINAL_PRODUCT(81, "medicinalProduct", "medicinalProduct"),

	/**
	 * The '<em><b>Medicinal Product Authorization</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICINAL_PRODUCT_AUTHORIZATION_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICINAL_PRODUCT_AUTHORIZATION(82, "medicinalProductAuthorization", "medicinalProductAuthorization"),

	/**
	 * The '<em><b>Medicinal Product Contraindication</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICINAL_PRODUCT_CONTRAINDICATION_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICINAL_PRODUCT_CONTRAINDICATION(83, "medicinalProductContraindication", "medicinalProductContraindication"),

	/**
	 * The '<em><b>Medicinal Product Indication</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICINAL_PRODUCT_INDICATION_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICINAL_PRODUCT_INDICATION(84, "medicinalProductIndication", "medicinalProductIndication"),

	/**
	 * The '<em><b>Medicinal Product Ingredient</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICINAL_PRODUCT_INGREDIENT_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICINAL_PRODUCT_INGREDIENT(85, "medicinalProductIngredient", "medicinalProductIngredient"),

	/**
	 * The '<em><b>Medicinal Product Interaction</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICINAL_PRODUCT_INTERACTION_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICINAL_PRODUCT_INTERACTION(86, "medicinalProductInteraction", "medicinalProductInteraction"),

	/**
	 * The '<em><b>Medicinal Product Manufactured</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICINAL_PRODUCT_MANUFACTURED_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICINAL_PRODUCT_MANUFACTURED(87, "medicinalProductManufactured", "medicinalProductManufactured"),

	/**
	 * The '<em><b>Medicinal Product Packaged</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICINAL_PRODUCT_PACKAGED_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICINAL_PRODUCT_PACKAGED(88, "medicinalProductPackaged", "medicinalProductPackaged"),

	/**
	 * The '<em><b>Medicinal Product Pharmaceutical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICINAL_PRODUCT_PHARMACEUTICAL_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICINAL_PRODUCT_PHARMACEUTICAL(89, "medicinalProductPharmaceutical", "medicinalProductPharmaceutical"),

	/**
	 * The '<em><b>Medicinal Product Undesirable Effect</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT(90, "medicinalProductUndesirableEffect", "medicinalProductUndesirableEffect"),

	/**
	 * The '<em><b>Message Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MESSAGE_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	MESSAGE_DEFINITION(91, "messageDefinition", "messageDefinition"),

	/**
	 * The '<em><b>Message Header</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MESSAGE_HEADER_VALUE
	 * @generated
	 * @ordered
	 */
	MESSAGE_HEADER(92, "messageHeader", "messageHeader"),

	/**
	 * The '<em><b>Molecular Sequence</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOLECULAR_SEQUENCE_VALUE
	 * @generated
	 * @ordered
	 */
	MOLECULAR_SEQUENCE(93, "molecularSequence", "molecularSequence"),

	/**
	 * The '<em><b>Naming System</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAMING_SYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	NAMING_SYSTEM(94, "namingSystem", "namingSystem"),

	/**
	 * The '<em><b>Nutrition Order</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUTRITION_ORDER_VALUE
	 * @generated
	 * @ordered
	 */
	NUTRITION_ORDER(95, "nutritionOrder", "nutritionOrder"),

	/**
	 * The '<em><b>Observation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBSERVATION_VALUE
	 * @generated
	 * @ordered
	 */
	OBSERVATION(96, "observation", "observation"),

	/**
	 * The '<em><b>Observation Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBSERVATION_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	OBSERVATION_DEFINITION(97, "observationDefinition", "observationDefinition"),

	/**
	 * The '<em><b>Operation Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATION_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	OPERATION_DEFINITION(98, "operationDefinition", "operationDefinition"),

	/**
	 * The '<em><b>Operation Outcome</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATION_OUTCOME_VALUE
	 * @generated
	 * @ordered
	 */
	OPERATION_OUTCOME(99, "operationOutcome", "operationOutcome"),

	/**
	 * The '<em><b>Organization</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORGANIZATION_VALUE
	 * @generated
	 * @ordered
	 */
	ORGANIZATION(100, "organization", "organization"),

	/**
	 * The '<em><b>Organization Affiliation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORGANIZATION_AFFILIATION_VALUE
	 * @generated
	 * @ordered
	 */
	ORGANIZATION_AFFILIATION(101, "organizationAffiliation", "organizationAffiliation"),

	/**
	 * The '<em><b>Parameters</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARAMETERS_VALUE
	 * @generated
	 * @ordered
	 */
	PARAMETERS(102, "parameters", "parameters"),

	/**
	 * The '<em><b>Patient</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATIENT_VALUE
	 * @generated
	 * @ordered
	 */
	PATIENT(103, "patient", "patient"),

	/**
	 * The '<em><b>Payment Notice</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAYMENT_NOTICE_VALUE
	 * @generated
	 * @ordered
	 */
	PAYMENT_NOTICE(104, "paymentNotice", "paymentNotice"),

	/**
	 * The '<em><b>Payment Reconciliation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAYMENT_RECONCILIATION_VALUE
	 * @generated
	 * @ordered
	 */
	PAYMENT_RECONCILIATION(105, "paymentReconciliation", "paymentReconciliation"),

	/**
	 * The '<em><b>Person</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERSON_VALUE
	 * @generated
	 * @ordered
	 */
	PERSON(106, "person", "person"),

	/**
	 * The '<em><b>Plan Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLAN_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	PLAN_DEFINITION(107, "planDefinition", "planDefinition"),

	/**
	 * The '<em><b>Practitioner</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRACTITIONER_VALUE
	 * @generated
	 * @ordered
	 */
	PRACTITIONER(108, "practitioner", "practitioner"),

	/**
	 * The '<em><b>Practitioner Role</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRACTITIONER_ROLE_VALUE
	 * @generated
	 * @ordered
	 */
	PRACTITIONER_ROLE(109, "practitionerRole", "practitionerRole"),

	/**
	 * The '<em><b>Procedure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCEDURE_VALUE
	 * @generated
	 * @ordered
	 */
	PROCEDURE(110, "procedure", "procedure"),

	/**
	 * The '<em><b>Provenance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROVENANCE_VALUE
	 * @generated
	 * @ordered
	 */
	PROVENANCE(111, "provenance", "provenance"),

	/**
	 * The '<em><b>Questionnaire</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUESTIONNAIRE_VALUE
	 * @generated
	 * @ordered
	 */
	QUESTIONNAIRE(112, "questionnaire", "questionnaire"),

	/**
	 * The '<em><b>Questionnaire Response</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUESTIONNAIRE_RESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	QUESTIONNAIRE_RESPONSE(113, "questionnaireResponse", "questionnaireResponse"),

	/**
	 * The '<em><b>Related Person</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELATED_PERSON_VALUE
	 * @generated
	 * @ordered
	 */
	RELATED_PERSON(114, "relatedPerson", "relatedPerson"),

	/**
	 * The '<em><b>Request Group</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUEST_GROUP_VALUE
	 * @generated
	 * @ordered
	 */
	REQUEST_GROUP(115, "requestGroup", "requestGroup"),

	/**
	 * The '<em><b>Research Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESEARCH_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	RESEARCH_DEFINITION(116, "researchDefinition", "researchDefinition"),

	/**
	 * The '<em><b>Research Element Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESEARCH_ELEMENT_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	RESEARCH_ELEMENT_DEFINITION(117, "researchElementDefinition", "researchElementDefinition"),

	/**
	 * The '<em><b>Research Study</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESEARCH_STUDY_VALUE
	 * @generated
	 * @ordered
	 */
	RESEARCH_STUDY(118, "researchStudy", "researchStudy"),

	/**
	 * The '<em><b>Research Subject</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESEARCH_SUBJECT_VALUE
	 * @generated
	 * @ordered
	 */
	RESEARCH_SUBJECT(119, "researchSubject", "researchSubject"),

	/**
	 * The '<em><b>Resource</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	RESOURCE(120, "resource", "resource"),

	/**
	 * The '<em><b>Risk Assessment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RISK_ASSESSMENT_VALUE
	 * @generated
	 * @ordered
	 */
	RISK_ASSESSMENT(121, "riskAssessment", "riskAssessment"),

	/**
	 * The '<em><b>Risk Evidence Synthesis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RISK_EVIDENCE_SYNTHESIS_VALUE
	 * @generated
	 * @ordered
	 */
	RISK_EVIDENCE_SYNTHESIS(122, "riskEvidenceSynthesis", "riskEvidenceSynthesis"),

	/**
	 * The '<em><b>Schedule</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHEDULE_VALUE
	 * @generated
	 * @ordered
	 */
	SCHEDULE(123, "schedule", "schedule"),

	/**
	 * The '<em><b>Search Parameter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEARCH_PARAMETER_VALUE
	 * @generated
	 * @ordered
	 */
	SEARCH_PARAMETER(124, "searchParameter", "searchParameter"),

	/**
	 * The '<em><b>Service Request</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVICE_REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	SERVICE_REQUEST(125, "serviceRequest", "serviceRequest"),

	/**
	 * The '<em><b>Slot</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SLOT_VALUE
	 * @generated
	 * @ordered
	 */
	SLOT(126, "slot", "slot"),

	/**
	 * The '<em><b>Specimen</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPECIMEN_VALUE
	 * @generated
	 * @ordered
	 */
	SPECIMEN(127, "specimen", "specimen"),

	/**
	 * The '<em><b>Specimen Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPECIMEN_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	SPECIMEN_DEFINITION(128, "specimenDefinition", "specimenDefinition"),

	/**
	 * The '<em><b>Structure Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRUCTURE_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	STRUCTURE_DEFINITION(129, "structureDefinition", "structureDefinition"),

	/**
	 * The '<em><b>Structure Map</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRUCTURE_MAP_VALUE
	 * @generated
	 * @ordered
	 */
	STRUCTURE_MAP(130, "structureMap", "structureMap"),

	/**
	 * The '<em><b>Subscription</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSCRIPTION_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSCRIPTION(131, "subscription", "subscription"),

	/**
	 * The '<em><b>Substance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSTANCE_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSTANCE(132, "substance", "substance"),

	/**
	 * The '<em><b>Substance Nucleic Acid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSTANCE_NUCLEIC_ACID_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSTANCE_NUCLEIC_ACID(133, "substanceNucleicAcid", "substanceNucleicAcid"),

	/**
	 * The '<em><b>Substance Polymer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSTANCE_POLYMER_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSTANCE_POLYMER(134, "substancePolymer", "substancePolymer"),

	/**
	 * The '<em><b>Substance Protein</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSTANCE_PROTEIN_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSTANCE_PROTEIN(135, "substanceProtein", "substanceProtein"),

	/**
	 * The '<em><b>Substance Reference Information</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSTANCE_REFERENCE_INFORMATION_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSTANCE_REFERENCE_INFORMATION(136, "substanceReferenceInformation", "substanceReferenceInformation"),

	/**
	 * The '<em><b>Substance Source Material</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSTANCE_SOURCE_MATERIAL_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSTANCE_SOURCE_MATERIAL(137, "substanceSourceMaterial", "substanceSourceMaterial"),

	/**
	 * The '<em><b>Substance Specification</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSTANCE_SPECIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSTANCE_SPECIFICATION(138, "substanceSpecification", "substanceSpecification"),

	/**
	 * The '<em><b>Supply Delivery</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPPLY_DELIVERY_VALUE
	 * @generated
	 * @ordered
	 */
	SUPPLY_DELIVERY(139, "supplyDelivery", "supplyDelivery"),

	/**
	 * The '<em><b>Supply Request</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPPLY_REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	SUPPLY_REQUEST(140, "supplyRequest", "supplyRequest"),

	/**
	 * The '<em><b>Task</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TASK_VALUE
	 * @generated
	 * @ordered
	 */
	TASK(141, "task", "task"),

	/**
	 * The '<em><b>Terminology Capabilities</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TERMINOLOGY_CAPABILITIES_VALUE
	 * @generated
	 * @ordered
	 */
	TERMINOLOGY_CAPABILITIES(142, "terminologyCapabilities", "terminologyCapabilities"),

	/**
	 * The '<em><b>Test Report</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEST_REPORT_VALUE
	 * @generated
	 * @ordered
	 */
	TEST_REPORT(143, "testReport", "testReport"),

	/**
	 * The '<em><b>Test Script</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEST_SCRIPT_VALUE
	 * @generated
	 * @ordered
	 */
	TEST_SCRIPT(144, "testScript", "testScript"),

	/**
	 * The '<em><b>Value Set</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALUE_SET_VALUE
	 * @generated
	 * @ordered
	 */
	VALUE_SET(145, "valueSet", "valueSet"),

	/**
	 * The '<em><b>Verification Result</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERIFICATION_RESULT_VALUE
	 * @generated
	 * @ordered
	 */
	VERIFICATION_RESULT(146, "verificationResult", "verificationResult"),

	/**
	 * The '<em><b>Vision Prescription</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VISION_PRESCRIPTION_VALUE
	 * @generated
	 * @ordered
	 */
	VISION_PRESCRIPTION(147, "visionPrescription", "visionPrescription");

	/**
	 * The '<em><b>Account</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Account</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACCOUNT
	 * @model name="account"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Account'"
	 * @generated
	 * @ordered
	 */
	public static final int ACCOUNT_VALUE = 0;

	/**
	 * The '<em><b>Activity Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Activity Definition</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACTIVITY_DEFINITION
	 * @model name="activityDefinition"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ActivityDefinition'"
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVITY_DEFINITION_VALUE = 1;

	/**
	 * The '<em><b>Adverse Event</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Adverse Event</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADVERSE_EVENT
	 * @model name="adverseEvent"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='AdverseEvent'"
	 * @generated
	 * @ordered
	 */
	public static final int ADVERSE_EVENT_VALUE = 2;

	/**
	 * The '<em><b>Allergy Intolerance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Allergy Intolerance</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALLERGY_INTOLERANCE
	 * @model name="allergyIntolerance"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='AllergyIntolerance'"
	 * @generated
	 * @ordered
	 */
	public static final int ALLERGY_INTOLERANCE_VALUE = 3;

	/**
	 * The '<em><b>Appointment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Appointment</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #APPOINTMENT
	 * @model name="appointment"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Appointment'"
	 * @generated
	 * @ordered
	 */
	public static final int APPOINTMENT_VALUE = 4;

	/**
	 * The '<em><b>Appointment Response</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Appointment Response</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #APPOINTMENT_RESPONSE
	 * @model name="appointmentResponse"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='AppointmentResponse'"
	 * @generated
	 * @ordered
	 */
	public static final int APPOINTMENT_RESPONSE_VALUE = 5;

	/**
	 * The '<em><b>Audit Event</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Audit Event</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUDIT_EVENT
	 * @model name="auditEvent"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='AuditEvent'"
	 * @generated
	 * @ordered
	 */
	public static final int AUDIT_EVENT_VALUE = 6;

	/**
	 * The '<em><b>Basic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Basic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BASIC
	 * @model name="basic"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Basic'"
	 * @generated
	 * @ordered
	 */
	public static final int BASIC_VALUE = 7;

	/**
	 * The '<em><b>Binary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Binary</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BINARY
	 * @model name="binary"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Binary'"
	 * @generated
	 * @ordered
	 */
	public static final int BINARY_VALUE = 8;

	/**
	 * The '<em><b>Biologically Derived Product</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Biologically Derived Product</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BIOLOGICALLY_DERIVED_PRODUCT
	 * @model name="biologicallyDerivedProduct"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='BiologicallyDerivedProduct'"
	 * @generated
	 * @ordered
	 */
	public static final int BIOLOGICALLY_DERIVED_PRODUCT_VALUE = 9;

	/**
	 * The '<em><b>Body Structure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Body Structure</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BODY_STRUCTURE
	 * @model name="bodyStructure"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='BodyStructure'"
	 * @generated
	 * @ordered
	 */
	public static final int BODY_STRUCTURE_VALUE = 10;

	/**
	 * The '<em><b>Bundle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bundle</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUNDLE
	 * @model name="bundle"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Bundle'"
	 * @generated
	 * @ordered
	 */
	public static final int BUNDLE_VALUE = 11;

	/**
	 * The '<em><b>Capability Statement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Capability Statement</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CAPABILITY_STATEMENT
	 * @model name="capabilityStatement"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CapabilityStatement'"
	 * @generated
	 * @ordered
	 */
	public static final int CAPABILITY_STATEMENT_VALUE = 12;

	/**
	 * The '<em><b>Care Plan</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Care Plan</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CARE_PLAN
	 * @model name="carePlan"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CarePlan'"
	 * @generated
	 * @ordered
	 */
	public static final int CARE_PLAN_VALUE = 13;

	/**
	 * The '<em><b>Care Team</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Care Team</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CARE_TEAM
	 * @model name="careTeam"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CareTeam'"
	 * @generated
	 * @ordered
	 */
	public static final int CARE_TEAM_VALUE = 14;

	/**
	 * The '<em><b>Catalog Entry</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Catalog Entry</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CATALOG_ENTRY
	 * @model name="catalogEntry"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CatalogEntry'"
	 * @generated
	 * @ordered
	 */
	public static final int CATALOG_ENTRY_VALUE = 15;

	/**
	 * The '<em><b>Charge Item</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Charge Item</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHARGE_ITEM
	 * @model name="chargeItem"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ChargeItem'"
	 * @generated
	 * @ordered
	 */
	public static final int CHARGE_ITEM_VALUE = 16;

	/**
	 * The '<em><b>Charge Item Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Charge Item Definition</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHARGE_ITEM_DEFINITION
	 * @model name="chargeItemDefinition"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ChargeItemDefinition'"
	 * @generated
	 * @ordered
	 */
	public static final int CHARGE_ITEM_DEFINITION_VALUE = 17;

	/**
	 * The '<em><b>Claim</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Claim</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLAIM
	 * @model name="claim"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Claim'"
	 * @generated
	 * @ordered
	 */
	public static final int CLAIM_VALUE = 18;

	/**
	 * The '<em><b>Claim Response</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Claim Response</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLAIM_RESPONSE
	 * @model name="claimResponse"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ClaimResponse'"
	 * @generated
	 * @ordered
	 */
	public static final int CLAIM_RESPONSE_VALUE = 19;

	/**
	 * The '<em><b>Clinical Impression</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Clinical Impression</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLINICAL_IMPRESSION
	 * @model name="clinicalImpression"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ClinicalImpression'"
	 * @generated
	 * @ordered
	 */
	public static final int CLINICAL_IMPRESSION_VALUE = 20;

	/**
	 * The '<em><b>Code System</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Code System</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CODE_SYSTEM
	 * @model name="codeSystem"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CodeSystem'"
	 * @generated
	 * @ordered
	 */
	public static final int CODE_SYSTEM_VALUE = 21;

	/**
	 * The '<em><b>Communication</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Communication</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMMUNICATION
	 * @model name="communication"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Communication'"
	 * @generated
	 * @ordered
	 */
	public static final int COMMUNICATION_VALUE = 22;

	/**
	 * The '<em><b>Communication Request</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Communication Request</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMMUNICATION_REQUEST
	 * @model name="communicationRequest"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CommunicationRequest'"
	 * @generated
	 * @ordered
	 */
	public static final int COMMUNICATION_REQUEST_VALUE = 23;

	/**
	 * The '<em><b>Compartment Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Compartment Definition</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPARTMENT_DEFINITION
	 * @model name="compartmentDefinition"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CompartmentDefinition'"
	 * @generated
	 * @ordered
	 */
	public static final int COMPARTMENT_DEFINITION_VALUE = 24;

	/**
	 * The '<em><b>Composition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Composition</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPOSITION
	 * @model name="composition"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Composition'"
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITION_VALUE = 25;

	/**
	 * The '<em><b>Concept Map</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Concept Map</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONCEPT_MAP
	 * @model name="conceptMap"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ConceptMap'"
	 * @generated
	 * @ordered
	 */
	public static final int CONCEPT_MAP_VALUE = 26;

	/**
	 * The '<em><b>Condition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Condition</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONDITION
	 * @model name="condition"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Condition'"
	 * @generated
	 * @ordered
	 */
	public static final int CONDITION_VALUE = 27;

	/**
	 * The '<em><b>Consent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Consent</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONSENT
	 * @model name="consent"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Consent'"
	 * @generated
	 * @ordered
	 */
	public static final int CONSENT_VALUE = 28;

	/**
	 * The '<em><b>Contract</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Contract</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTRACT
	 * @model name="contract"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Contract'"
	 * @generated
	 * @ordered
	 */
	public static final int CONTRACT_VALUE = 29;

	/**
	 * The '<em><b>Coverage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Coverage</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COVERAGE
	 * @model name="coverage"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Coverage'"
	 * @generated
	 * @ordered
	 */
	public static final int COVERAGE_VALUE = 30;

	/**
	 * The '<em><b>Coverage Eligibility Request</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Coverage Eligibility Request</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COVERAGE_ELIGIBILITY_REQUEST
	 * @model name="coverageEligibilityRequest"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CoverageEligibilityRequest'"
	 * @generated
	 * @ordered
	 */
	public static final int COVERAGE_ELIGIBILITY_REQUEST_VALUE = 31;

	/**
	 * The '<em><b>Coverage Eligibility Response</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Coverage Eligibility Response</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COVERAGE_ELIGIBILITY_RESPONSE
	 * @model name="coverageEligibilityResponse"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CoverageEligibilityResponse'"
	 * @generated
	 * @ordered
	 */
	public static final int COVERAGE_ELIGIBILITY_RESPONSE_VALUE = 32;

	/**
	 * The '<em><b>Detected Issue</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Detected Issue</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DETECTED_ISSUE
	 * @model name="detectedIssue"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DetectedIssue'"
	 * @generated
	 * @ordered
	 */
	public static final int DETECTED_ISSUE_VALUE = 33;

	/**
	 * The '<em><b>Device</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Device</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEVICE
	 * @model name="device"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Device'"
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_VALUE = 34;

	/**
	 * The '<em><b>Device Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Device Definition</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEVICE_DEFINITION
	 * @model name="deviceDefinition"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DeviceDefinition'"
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_DEFINITION_VALUE = 35;

	/**
	 * The '<em><b>Device Metric</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Device Metric</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEVICE_METRIC
	 * @model name="deviceMetric"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DeviceMetric'"
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_METRIC_VALUE = 36;

	/**
	 * The '<em><b>Device Request</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Device Request</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEVICE_REQUEST
	 * @model name="deviceRequest"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DeviceRequest'"
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_REQUEST_VALUE = 37;

	/**
	 * The '<em><b>Device Use Statement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Device Use Statement</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEVICE_USE_STATEMENT
	 * @model name="deviceUseStatement"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DeviceUseStatement'"
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_USE_STATEMENT_VALUE = 38;

	/**
	 * The '<em><b>Diagnostic Report</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Diagnostic Report</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIAGNOSTIC_REPORT
	 * @model name="diagnosticReport"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DiagnosticReport'"
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSTIC_REPORT_VALUE = 39;

	/**
	 * The '<em><b>Document Manifest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Document Manifest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOCUMENT_MANIFEST
	 * @model name="documentManifest"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DocumentManifest'"
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT_MANIFEST_VALUE = 40;

	/**
	 * The '<em><b>Document Reference</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Document Reference</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOCUMENT_REFERENCE
	 * @model name="documentReference"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DocumentReference'"
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT_REFERENCE_VALUE = 41;

	/**
	 * The '<em><b>Domain Resource</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Domain Resource</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOMAIN_RESOURCE
	 * @model name="domainResource"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DomainResource'"
	 * @generated
	 * @ordered
	 */
	public static final int DOMAIN_RESOURCE_VALUE = 42;

	/**
	 * The '<em><b>Effect Evidence Synthesis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Effect Evidence Synthesis</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EFFECT_EVIDENCE_SYNTHESIS
	 * @model name="effectEvidenceSynthesis"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='EffectEvidenceSynthesis'"
	 * @generated
	 * @ordered
	 */
	public static final int EFFECT_EVIDENCE_SYNTHESIS_VALUE = 43;

	/**
	 * The '<em><b>Encounter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Encounter</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENCOUNTER
	 * @model name="encounter"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Encounter'"
	 * @generated
	 * @ordered
	 */
	public static final int ENCOUNTER_VALUE = 44;

	/**
	 * The '<em><b>Endpoint</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Endpoint</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENDPOINT
	 * @model name="endpoint"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Endpoint'"
	 * @generated
	 * @ordered
	 */
	public static final int ENDPOINT_VALUE = 45;

	/**
	 * The '<em><b>Enrollment Request</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Enrollment Request</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENROLLMENT_REQUEST
	 * @model name="enrollmentRequest"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='EnrollmentRequest'"
	 * @generated
	 * @ordered
	 */
	public static final int ENROLLMENT_REQUEST_VALUE = 46;

	/**
	 * The '<em><b>Enrollment Response</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Enrollment Response</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENROLLMENT_RESPONSE
	 * @model name="enrollmentResponse"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='EnrollmentResponse'"
	 * @generated
	 * @ordered
	 */
	public static final int ENROLLMENT_RESPONSE_VALUE = 47;

	/**
	 * The '<em><b>Episode Of Care</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Episode Of Care</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EPISODE_OF_CARE
	 * @model name="episodeOfCare"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='EpisodeOfCare'"
	 * @generated
	 * @ordered
	 */
	public static final int EPISODE_OF_CARE_VALUE = 48;

	/**
	 * The '<em><b>Event Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Event Definition</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EVENT_DEFINITION
	 * @model name="eventDefinition"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='EventDefinition'"
	 * @generated
	 * @ordered
	 */
	public static final int EVENT_DEFINITION_VALUE = 49;

	/**
	 * The '<em><b>Evidence</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Evidence</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EVIDENCE
	 * @model name="evidence"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Evidence'"
	 * @generated
	 * @ordered
	 */
	public static final int EVIDENCE_VALUE = 50;

	/**
	 * The '<em><b>Evidence Variable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Evidence Variable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EVIDENCE_VARIABLE
	 * @model name="evidenceVariable"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='EvidenceVariable'"
	 * @generated
	 * @ordered
	 */
	public static final int EVIDENCE_VARIABLE_VALUE = 51;

	/**
	 * The '<em><b>Example Scenario</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Example Scenario</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXAMPLE_SCENARIO
	 * @model name="exampleScenario"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ExampleScenario'"
	 * @generated
	 * @ordered
	 */
	public static final int EXAMPLE_SCENARIO_VALUE = 52;

	/**
	 * The '<em><b>Explanation Of Benefit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Explanation Of Benefit</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXPLANATION_OF_BENEFIT
	 * @model name="explanationOfBenefit"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ExplanationOfBenefit'"
	 * @generated
	 * @ordered
	 */
	public static final int EXPLANATION_OF_BENEFIT_VALUE = 53;

	/**
	 * The '<em><b>Family Member History</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Family Member History</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FAMILY_MEMBER_HISTORY
	 * @model name="familyMemberHistory"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='FamilyMemberHistory'"
	 * @generated
	 * @ordered
	 */
	public static final int FAMILY_MEMBER_HISTORY_VALUE = 54;

	/**
	 * The '<em><b>Flag</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Flag</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLAG
	 * @model name="flag"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Flag'"
	 * @generated
	 * @ordered
	 */
	public static final int FLAG_VALUE = 55;

	/**
	 * The '<em><b>Goal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Goal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GOAL
	 * @model name="goal"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Goal'"
	 * @generated
	 * @ordered
	 */
	public static final int GOAL_VALUE = 56;

	/**
	 * The '<em><b>Graph Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Graph Definition</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GRAPH_DEFINITION
	 * @model name="graphDefinition"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='GraphDefinition'"
	 * @generated
	 * @ordered
	 */
	public static final int GRAPH_DEFINITION_VALUE = 57;

	/**
	 * The '<em><b>Group</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Group</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GROUP
	 * @model name="group"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Group'"
	 * @generated
	 * @ordered
	 */
	public static final int GROUP_VALUE = 58;

	/**
	 * The '<em><b>Guidance Response</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Guidance Response</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GUIDANCE_RESPONSE
	 * @model name="guidanceResponse"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='GuidanceResponse'"
	 * @generated
	 * @ordered
	 */
	public static final int GUIDANCE_RESPONSE_VALUE = 59;

	/**
	 * The '<em><b>Healthcare Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Healthcare Service</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HEALTHCARE_SERVICE
	 * @model name="healthcareService"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='HealthcareService'"
	 * @generated
	 * @ordered
	 */
	public static final int HEALTHCARE_SERVICE_VALUE = 60;

	/**
	 * The '<em><b>Imaging Study</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Imaging Study</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMAGING_STUDY
	 * @model name="imagingStudy"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ImagingStudy'"
	 * @generated
	 * @ordered
	 */
	public static final int IMAGING_STUDY_VALUE = 61;

	/**
	 * The '<em><b>Immunization</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Immunization</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMMUNIZATION
	 * @model name="immunization"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Immunization'"
	 * @generated
	 * @ordered
	 */
	public static final int IMMUNIZATION_VALUE = 62;

	/**
	 * The '<em><b>Immunization Evaluation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Immunization Evaluation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMMUNIZATION_EVALUATION
	 * @model name="immunizationEvaluation"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ImmunizationEvaluation'"
	 * @generated
	 * @ordered
	 */
	public static final int IMMUNIZATION_EVALUATION_VALUE = 63;

	/**
	 * The '<em><b>Immunization Recommendation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Immunization Recommendation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMMUNIZATION_RECOMMENDATION
	 * @model name="immunizationRecommendation"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ImmunizationRecommendation'"
	 * @generated
	 * @ordered
	 */
	public static final int IMMUNIZATION_RECOMMENDATION_VALUE = 64;

	/**
	 * The '<em><b>Implementation Guide</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Implementation Guide</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMPLEMENTATION_GUIDE
	 * @model name="implementationGuide"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ImplementationGuide'"
	 * @generated
	 * @ordered
	 */
	public static final int IMPLEMENTATION_GUIDE_VALUE = 65;

	/**
	 * The '<em><b>Insurance Plan</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Insurance Plan</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INSURANCE_PLAN
	 * @model name="insurancePlan"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='InsurancePlan'"
	 * @generated
	 * @ordered
	 */
	public static final int INSURANCE_PLAN_VALUE = 66;

	/**
	 * The '<em><b>Invoice</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Invoice</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INVOICE
	 * @model name="invoice"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Invoice'"
	 * @generated
	 * @ordered
	 */
	public static final int INVOICE_VALUE = 67;

	/**
	 * The '<em><b>Library</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Library</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIBRARY
	 * @model name="library"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Library'"
	 * @generated
	 * @ordered
	 */
	public static final int LIBRARY_VALUE = 68;

	/**
	 * The '<em><b>Linkage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Linkage</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LINKAGE
	 * @model name="linkage"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Linkage'"
	 * @generated
	 * @ordered
	 */
	public static final int LINKAGE_VALUE = 69;

	/**
	 * The '<em><b>List</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>List</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIST
	 * @model name="list"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='List'"
	 * @generated
	 * @ordered
	 */
	public static final int LIST_VALUE = 70;

	/**
	 * The '<em><b>Location</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Location</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOCATION
	 * @model name="location"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Location'"
	 * @generated
	 * @ordered
	 */
	public static final int LOCATION_VALUE = 71;

	/**
	 * The '<em><b>Measure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Measure</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEASURE
	 * @model name="measure"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Measure'"
	 * @generated
	 * @ordered
	 */
	public static final int MEASURE_VALUE = 72;

	/**
	 * The '<em><b>Measure Report</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Measure Report</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEASURE_REPORT
	 * @model name="measureReport"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MeasureReport'"
	 * @generated
	 * @ordered
	 */
	public static final int MEASURE_REPORT_VALUE = 73;

	/**
	 * The '<em><b>Media</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Media</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEDIA
	 * @model name="media"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Media'"
	 * @generated
	 * @ordered
	 */
	public static final int MEDIA_VALUE = 74;

	/**
	 * The '<em><b>Medication</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Medication</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEDICATION
	 * @model name="medication"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Medication'"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICATION_VALUE = 75;

	/**
	 * The '<em><b>Medication Administration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Medication Administration</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEDICATION_ADMINISTRATION
	 * @model name="medicationAdministration"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MedicationAdministration'"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICATION_ADMINISTRATION_VALUE = 76;

	/**
	 * The '<em><b>Medication Dispense</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Medication Dispense</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEDICATION_DISPENSE
	 * @model name="medicationDispense"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MedicationDispense'"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICATION_DISPENSE_VALUE = 77;

	/**
	 * The '<em><b>Medication Knowledge</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Medication Knowledge</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEDICATION_KNOWLEDGE
	 * @model name="medicationKnowledge"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MedicationKnowledge'"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICATION_KNOWLEDGE_VALUE = 78;

	/**
	 * The '<em><b>Medication Request</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Medication Request</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEDICATION_REQUEST
	 * @model name="medicationRequest"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MedicationRequest'"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICATION_REQUEST_VALUE = 79;

	/**
	 * The '<em><b>Medication Statement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Medication Statement</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEDICATION_STATEMENT
	 * @model name="medicationStatement"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MedicationStatement'"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICATION_STATEMENT_VALUE = 80;

	/**
	 * The '<em><b>Medicinal Product</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Medicinal Product</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEDICINAL_PRODUCT
	 * @model name="medicinalProduct"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MedicinalProduct'"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICINAL_PRODUCT_VALUE = 81;

	/**
	 * The '<em><b>Medicinal Product Authorization</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Medicinal Product Authorization</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEDICINAL_PRODUCT_AUTHORIZATION
	 * @model name="medicinalProductAuthorization"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MedicinalProductAuthorization'"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICINAL_PRODUCT_AUTHORIZATION_VALUE = 82;

	/**
	 * The '<em><b>Medicinal Product Contraindication</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Medicinal Product Contraindication</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEDICINAL_PRODUCT_CONTRAINDICATION
	 * @model name="medicinalProductContraindication"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MedicinalProductContraindication'"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICINAL_PRODUCT_CONTRAINDICATION_VALUE = 83;

	/**
	 * The '<em><b>Medicinal Product Indication</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Medicinal Product Indication</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEDICINAL_PRODUCT_INDICATION
	 * @model name="medicinalProductIndication"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MedicinalProductIndication'"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICINAL_PRODUCT_INDICATION_VALUE = 84;

	/**
	 * The '<em><b>Medicinal Product Ingredient</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Medicinal Product Ingredient</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEDICINAL_PRODUCT_INGREDIENT
	 * @model name="medicinalProductIngredient"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MedicinalProductIngredient'"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICINAL_PRODUCT_INGREDIENT_VALUE = 85;

	/**
	 * The '<em><b>Medicinal Product Interaction</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Medicinal Product Interaction</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEDICINAL_PRODUCT_INTERACTION
	 * @model name="medicinalProductInteraction"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MedicinalProductInteraction'"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICINAL_PRODUCT_INTERACTION_VALUE = 86;

	/**
	 * The '<em><b>Medicinal Product Manufactured</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Medicinal Product Manufactured</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEDICINAL_PRODUCT_MANUFACTURED
	 * @model name="medicinalProductManufactured"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MedicinalProductManufactured'"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICINAL_PRODUCT_MANUFACTURED_VALUE = 87;

	/**
	 * The '<em><b>Medicinal Product Packaged</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Medicinal Product Packaged</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEDICINAL_PRODUCT_PACKAGED
	 * @model name="medicinalProductPackaged"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MedicinalProductPackaged'"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICINAL_PRODUCT_PACKAGED_VALUE = 88;

	/**
	 * The '<em><b>Medicinal Product Pharmaceutical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Medicinal Product Pharmaceutical</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEDICINAL_PRODUCT_PHARMACEUTICAL
	 * @model name="medicinalProductPharmaceutical"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MedicinalProductPharmaceutical'"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICINAL_PRODUCT_PHARMACEUTICAL_VALUE = 89;

	/**
	 * The '<em><b>Medicinal Product Undesirable Effect</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Medicinal Product Undesirable Effect</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT
	 * @model name="medicinalProductUndesirableEffect"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MedicinalProductUndesirableEffect'"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT_VALUE = 90;

	/**
	 * The '<em><b>Message Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Message Definition</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MESSAGE_DEFINITION
	 * @model name="messageDefinition"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MessageDefinition'"
	 * @generated
	 * @ordered
	 */
	public static final int MESSAGE_DEFINITION_VALUE = 91;

	/**
	 * The '<em><b>Message Header</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Message Header</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MESSAGE_HEADER
	 * @model name="messageHeader"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MessageHeader'"
	 * @generated
	 * @ordered
	 */
	public static final int MESSAGE_HEADER_VALUE = 92;

	/**
	 * The '<em><b>Molecular Sequence</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Molecular Sequence</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOLECULAR_SEQUENCE
	 * @model name="molecularSequence"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MolecularSequence'"
	 * @generated
	 * @ordered
	 */
	public static final int MOLECULAR_SEQUENCE_VALUE = 93;

	/**
	 * The '<em><b>Naming System</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Naming System</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NAMING_SYSTEM
	 * @model name="namingSystem"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='NamingSystem'"
	 * @generated
	 * @ordered
	 */
	public static final int NAMING_SYSTEM_VALUE = 94;

	/**
	 * The '<em><b>Nutrition Order</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Nutrition Order</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NUTRITION_ORDER
	 * @model name="nutritionOrder"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='NutritionOrder'"
	 * @generated
	 * @ordered
	 */
	public static final int NUTRITION_ORDER_VALUE = 95;

	/**
	 * The '<em><b>Observation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Observation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OBSERVATION
	 * @model name="observation"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Observation'"
	 * @generated
	 * @ordered
	 */
	public static final int OBSERVATION_VALUE = 96;

	/**
	 * The '<em><b>Observation Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Observation Definition</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OBSERVATION_DEFINITION
	 * @model name="observationDefinition"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ObservationDefinition'"
	 * @generated
	 * @ordered
	 */
	public static final int OBSERVATION_DEFINITION_VALUE = 97;

	/**
	 * The '<em><b>Operation Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Operation Definition</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPERATION_DEFINITION
	 * @model name="operationDefinition"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='OperationDefinition'"
	 * @generated
	 * @ordered
	 */
	public static final int OPERATION_DEFINITION_VALUE = 98;

	/**
	 * The '<em><b>Operation Outcome</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Operation Outcome</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPERATION_OUTCOME
	 * @model name="operationOutcome"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='OperationOutcome'"
	 * @generated
	 * @ordered
	 */
	public static final int OPERATION_OUTCOME_VALUE = 99;

	/**
	 * The '<em><b>Organization</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Organization</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ORGANIZATION
	 * @model name="organization"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Organization'"
	 * @generated
	 * @ordered
	 */
	public static final int ORGANIZATION_VALUE = 100;

	/**
	 * The '<em><b>Organization Affiliation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Organization Affiliation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ORGANIZATION_AFFILIATION
	 * @model name="organizationAffiliation"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='OrganizationAffiliation'"
	 * @generated
	 * @ordered
	 */
	public static final int ORGANIZATION_AFFILIATION_VALUE = 101;

	/**
	 * The '<em><b>Parameters</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Parameters</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARAMETERS
	 * @model name="parameters"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Parameters'"
	 * @generated
	 * @ordered
	 */
	public static final int PARAMETERS_VALUE = 102;

	/**
	 * The '<em><b>Patient</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Patient</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PATIENT
	 * @model name="patient"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Patient'"
	 * @generated
	 * @ordered
	 */
	public static final int PATIENT_VALUE = 103;

	/**
	 * The '<em><b>Payment Notice</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Payment Notice</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAYMENT_NOTICE
	 * @model name="paymentNotice"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PaymentNotice'"
	 * @generated
	 * @ordered
	 */
	public static final int PAYMENT_NOTICE_VALUE = 104;

	/**
	 * The '<em><b>Payment Reconciliation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Payment Reconciliation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAYMENT_RECONCILIATION
	 * @model name="paymentReconciliation"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PaymentReconciliation'"
	 * @generated
	 * @ordered
	 */
	public static final int PAYMENT_RECONCILIATION_VALUE = 105;

	/**
	 * The '<em><b>Person</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Person</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERSON
	 * @model name="person"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Person'"
	 * @generated
	 * @ordered
	 */
	public static final int PERSON_VALUE = 106;

	/**
	 * The '<em><b>Plan Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Plan Definition</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLAN_DEFINITION
	 * @model name="planDefinition"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PlanDefinition'"
	 * @generated
	 * @ordered
	 */
	public static final int PLAN_DEFINITION_VALUE = 107;

	/**
	 * The '<em><b>Practitioner</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Practitioner</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRACTITIONER
	 * @model name="practitioner"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Practitioner'"
	 * @generated
	 * @ordered
	 */
	public static final int PRACTITIONER_VALUE = 108;

	/**
	 * The '<em><b>Practitioner Role</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Practitioner Role</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRACTITIONER_ROLE
	 * @model name="practitionerRole"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PractitionerRole'"
	 * @generated
	 * @ordered
	 */
	public static final int PRACTITIONER_ROLE_VALUE = 109;

	/**
	 * The '<em><b>Procedure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Procedure</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROCEDURE
	 * @model name="procedure"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Procedure'"
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE_VALUE = 110;

	/**
	 * The '<em><b>Provenance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Provenance</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROVENANCE
	 * @model name="provenance"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Provenance'"
	 * @generated
	 * @ordered
	 */
	public static final int PROVENANCE_VALUE = 111;

	/**
	 * The '<em><b>Questionnaire</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Questionnaire</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #QUESTIONNAIRE
	 * @model name="questionnaire"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Questionnaire'"
	 * @generated
	 * @ordered
	 */
	public static final int QUESTIONNAIRE_VALUE = 112;

	/**
	 * The '<em><b>Questionnaire Response</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Questionnaire Response</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #QUESTIONNAIRE_RESPONSE
	 * @model name="questionnaireResponse"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='QuestionnaireResponse'"
	 * @generated
	 * @ordered
	 */
	public static final int QUESTIONNAIRE_RESPONSE_VALUE = 113;

	/**
	 * The '<em><b>Related Person</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Related Person</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RELATED_PERSON
	 * @model name="relatedPerson"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='RelatedPerson'"
	 * @generated
	 * @ordered
	 */
	public static final int RELATED_PERSON_VALUE = 114;

	/**
	 * The '<em><b>Request Group</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Request Group</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REQUEST_GROUP
	 * @model name="requestGroup"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='RequestGroup'"
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST_GROUP_VALUE = 115;

	/**
	 * The '<em><b>Research Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Research Definition</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESEARCH_DEFINITION
	 * @model name="researchDefinition"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ResearchDefinition'"
	 * @generated
	 * @ordered
	 */
	public static final int RESEARCH_DEFINITION_VALUE = 116;

	/**
	 * The '<em><b>Research Element Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Research Element Definition</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESEARCH_ELEMENT_DEFINITION
	 * @model name="researchElementDefinition"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ResearchElementDefinition'"
	 * @generated
	 * @ordered
	 */
	public static final int RESEARCH_ELEMENT_DEFINITION_VALUE = 117;

	/**
	 * The '<em><b>Research Study</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Research Study</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESEARCH_STUDY
	 * @model name="researchStudy"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ResearchStudy'"
	 * @generated
	 * @ordered
	 */
	public static final int RESEARCH_STUDY_VALUE = 118;

	/**
	 * The '<em><b>Research Subject</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Research Subject</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESEARCH_SUBJECT
	 * @model name="researchSubject"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ResearchSubject'"
	 * @generated
	 * @ordered
	 */
	public static final int RESEARCH_SUBJECT_VALUE = 119;

	/**
	 * The '<em><b>Resource</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Resource</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESOURCE
	 * @model name="resource"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Resource'"
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE_VALUE = 120;

	/**
	 * The '<em><b>Risk Assessment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Risk Assessment</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RISK_ASSESSMENT
	 * @model name="riskAssessment"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='RiskAssessment'"
	 * @generated
	 * @ordered
	 */
	public static final int RISK_ASSESSMENT_VALUE = 121;

	/**
	 * The '<em><b>Risk Evidence Synthesis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Risk Evidence Synthesis</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RISK_EVIDENCE_SYNTHESIS
	 * @model name="riskEvidenceSynthesis"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='RiskEvidenceSynthesis'"
	 * @generated
	 * @ordered
	 */
	public static final int RISK_EVIDENCE_SYNTHESIS_VALUE = 122;

	/**
	 * The '<em><b>Schedule</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Schedule</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCHEDULE
	 * @model name="schedule"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Schedule'"
	 * @generated
	 * @ordered
	 */
	public static final int SCHEDULE_VALUE = 123;

	/**
	 * The '<em><b>Search Parameter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Search Parameter</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEARCH_PARAMETER
	 * @model name="searchParameter"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SearchParameter'"
	 * @generated
	 * @ordered
	 */
	public static final int SEARCH_PARAMETER_VALUE = 124;

	/**
	 * The '<em><b>Service Request</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Service Request</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SERVICE_REQUEST
	 * @model name="serviceRequest"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ServiceRequest'"
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_REQUEST_VALUE = 125;

	/**
	 * The '<em><b>Slot</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Slot</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SLOT
	 * @model name="slot"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Slot'"
	 * @generated
	 * @ordered
	 */
	public static final int SLOT_VALUE = 126;

	/**
	 * The '<em><b>Specimen</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Specimen</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPECIMEN
	 * @model name="specimen"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Specimen'"
	 * @generated
	 * @ordered
	 */
	public static final int SPECIMEN_VALUE = 127;

	/**
	 * The '<em><b>Specimen Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Specimen Definition</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPECIMEN_DEFINITION
	 * @model name="specimenDefinition"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SpecimenDefinition'"
	 * @generated
	 * @ordered
	 */
	public static final int SPECIMEN_DEFINITION_VALUE = 128;

	/**
	 * The '<em><b>Structure Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Structure Definition</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRUCTURE_DEFINITION
	 * @model name="structureDefinition"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='StructureDefinition'"
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_DEFINITION_VALUE = 129;

	/**
	 * The '<em><b>Structure Map</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Structure Map</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRUCTURE_MAP
	 * @model name="structureMap"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='StructureMap'"
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_MAP_VALUE = 130;

	/**
	 * The '<em><b>Subscription</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Subscription</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBSCRIPTION
	 * @model name="subscription"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Subscription'"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSCRIPTION_VALUE = 131;

	/**
	 * The '<em><b>Substance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Substance</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBSTANCE
	 * @model name="substance"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Substance'"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTANCE_VALUE = 132;

	/**
	 * The '<em><b>Substance Nucleic Acid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Substance Nucleic Acid</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBSTANCE_NUCLEIC_ACID
	 * @model name="substanceNucleicAcid"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SubstanceNucleicAcid'"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTANCE_NUCLEIC_ACID_VALUE = 133;

	/**
	 * The '<em><b>Substance Polymer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Substance Polymer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBSTANCE_POLYMER
	 * @model name="substancePolymer"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SubstancePolymer'"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTANCE_POLYMER_VALUE = 134;

	/**
	 * The '<em><b>Substance Protein</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Substance Protein</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBSTANCE_PROTEIN
	 * @model name="substanceProtein"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SubstanceProtein'"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTANCE_PROTEIN_VALUE = 135;

	/**
	 * The '<em><b>Substance Reference Information</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Substance Reference Information</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBSTANCE_REFERENCE_INFORMATION
	 * @model name="substanceReferenceInformation"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SubstanceReferenceInformation'"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTANCE_REFERENCE_INFORMATION_VALUE = 136;

	/**
	 * The '<em><b>Substance Source Material</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Substance Source Material</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBSTANCE_SOURCE_MATERIAL
	 * @model name="substanceSourceMaterial"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SubstanceSourceMaterial'"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTANCE_SOURCE_MATERIAL_VALUE = 137;

	/**
	 * The '<em><b>Substance Specification</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Substance Specification</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBSTANCE_SPECIFICATION
	 * @model name="substanceSpecification"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SubstanceSpecification'"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTANCE_SPECIFICATION_VALUE = 138;

	/**
	 * The '<em><b>Supply Delivery</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Supply Delivery</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUPPLY_DELIVERY
	 * @model name="supplyDelivery"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SupplyDelivery'"
	 * @generated
	 * @ordered
	 */
	public static final int SUPPLY_DELIVERY_VALUE = 139;

	/**
	 * The '<em><b>Supply Request</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Supply Request</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUPPLY_REQUEST
	 * @model name="supplyRequest"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SupplyRequest'"
	 * @generated
	 * @ordered
	 */
	public static final int SUPPLY_REQUEST_VALUE = 140;

	/**
	 * The '<em><b>Task</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Task</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TASK
	 * @model name="task"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Task'"
	 * @generated
	 * @ordered
	 */
	public static final int TASK_VALUE = 141;

	/**
	 * The '<em><b>Terminology Capabilities</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Terminology Capabilities</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TERMINOLOGY_CAPABILITIES
	 * @model name="terminologyCapabilities"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TerminologyCapabilities'"
	 * @generated
	 * @ordered
	 */
	public static final int TERMINOLOGY_CAPABILITIES_VALUE = 142;

	/**
	 * The '<em><b>Test Report</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Test Report</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEST_REPORT
	 * @model name="testReport"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TestReport'"
	 * @generated
	 * @ordered
	 */
	public static final int TEST_REPORT_VALUE = 143;

	/**
	 * The '<em><b>Test Script</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Test Script</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TEST_SCRIPT
	 * @model name="testScript"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TestScript'"
	 * @generated
	 * @ordered
	 */
	public static final int TEST_SCRIPT_VALUE = 144;

	/**
	 * The '<em><b>Value Set</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Value Set</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VALUE_SET
	 * @model name="valueSet"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ValueSet'"
	 * @generated
	 * @ordered
	 */
	public static final int VALUE_SET_VALUE = 145;

	/**
	 * The '<em><b>Verification Result</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Verification Result</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VERIFICATION_RESULT
	 * @model name="verificationResult"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='VerificationResult'"
	 * @generated
	 * @ordered
	 */
	public static final int VERIFICATION_RESULT_VALUE = 146;

	/**
	 * The '<em><b>Vision Prescription</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Vision Prescription</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VISION_PRESCRIPTION
	 * @model name="visionPrescription"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='VisionPrescription'"
	 * @generated
	 * @ordered
	 */
	public static final int VISION_PRESCRIPTION_VALUE = 147;

	/**
	 * An array of all the '<em><b>Resource Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ResourceType[] VALUES_ARRAY =
		new ResourceType[] {
			ACCOUNT,
			ACTIVITY_DEFINITION,
			ADVERSE_EVENT,
			ALLERGY_INTOLERANCE,
			APPOINTMENT,
			APPOINTMENT_RESPONSE,
			AUDIT_EVENT,
			BASIC,
			BINARY,
			BIOLOGICALLY_DERIVED_PRODUCT,
			BODY_STRUCTURE,
			BUNDLE,
			CAPABILITY_STATEMENT,
			CARE_PLAN,
			CARE_TEAM,
			CATALOG_ENTRY,
			CHARGE_ITEM,
			CHARGE_ITEM_DEFINITION,
			CLAIM,
			CLAIM_RESPONSE,
			CLINICAL_IMPRESSION,
			CODE_SYSTEM,
			COMMUNICATION,
			COMMUNICATION_REQUEST,
			COMPARTMENT_DEFINITION,
			COMPOSITION,
			CONCEPT_MAP,
			CONDITION,
			CONSENT,
			CONTRACT,
			COVERAGE,
			COVERAGE_ELIGIBILITY_REQUEST,
			COVERAGE_ELIGIBILITY_RESPONSE,
			DETECTED_ISSUE,
			DEVICE,
			DEVICE_DEFINITION,
			DEVICE_METRIC,
			DEVICE_REQUEST,
			DEVICE_USE_STATEMENT,
			DIAGNOSTIC_REPORT,
			DOCUMENT_MANIFEST,
			DOCUMENT_REFERENCE,
			DOMAIN_RESOURCE,
			EFFECT_EVIDENCE_SYNTHESIS,
			ENCOUNTER,
			ENDPOINT,
			ENROLLMENT_REQUEST,
			ENROLLMENT_RESPONSE,
			EPISODE_OF_CARE,
			EVENT_DEFINITION,
			EVIDENCE,
			EVIDENCE_VARIABLE,
			EXAMPLE_SCENARIO,
			EXPLANATION_OF_BENEFIT,
			FAMILY_MEMBER_HISTORY,
			FLAG,
			GOAL,
			GRAPH_DEFINITION,
			GROUP,
			GUIDANCE_RESPONSE,
			HEALTHCARE_SERVICE,
			IMAGING_STUDY,
			IMMUNIZATION,
			IMMUNIZATION_EVALUATION,
			IMMUNIZATION_RECOMMENDATION,
			IMPLEMENTATION_GUIDE,
			INSURANCE_PLAN,
			INVOICE,
			LIBRARY,
			LINKAGE,
			LIST,
			LOCATION,
			MEASURE,
			MEASURE_REPORT,
			MEDIA,
			MEDICATION,
			MEDICATION_ADMINISTRATION,
			MEDICATION_DISPENSE,
			MEDICATION_KNOWLEDGE,
			MEDICATION_REQUEST,
			MEDICATION_STATEMENT,
			MEDICINAL_PRODUCT,
			MEDICINAL_PRODUCT_AUTHORIZATION,
			MEDICINAL_PRODUCT_CONTRAINDICATION,
			MEDICINAL_PRODUCT_INDICATION,
			MEDICINAL_PRODUCT_INGREDIENT,
			MEDICINAL_PRODUCT_INTERACTION,
			MEDICINAL_PRODUCT_MANUFACTURED,
			MEDICINAL_PRODUCT_PACKAGED,
			MEDICINAL_PRODUCT_PHARMACEUTICAL,
			MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT,
			MESSAGE_DEFINITION,
			MESSAGE_HEADER,
			MOLECULAR_SEQUENCE,
			NAMING_SYSTEM,
			NUTRITION_ORDER,
			OBSERVATION,
			OBSERVATION_DEFINITION,
			OPERATION_DEFINITION,
			OPERATION_OUTCOME,
			ORGANIZATION,
			ORGANIZATION_AFFILIATION,
			PARAMETERS,
			PATIENT,
			PAYMENT_NOTICE,
			PAYMENT_RECONCILIATION,
			PERSON,
			PLAN_DEFINITION,
			PRACTITIONER,
			PRACTITIONER_ROLE,
			PROCEDURE,
			PROVENANCE,
			QUESTIONNAIRE,
			QUESTIONNAIRE_RESPONSE,
			RELATED_PERSON,
			REQUEST_GROUP,
			RESEARCH_DEFINITION,
			RESEARCH_ELEMENT_DEFINITION,
			RESEARCH_STUDY,
			RESEARCH_SUBJECT,
			RESOURCE,
			RISK_ASSESSMENT,
			RISK_EVIDENCE_SYNTHESIS,
			SCHEDULE,
			SEARCH_PARAMETER,
			SERVICE_REQUEST,
			SLOT,
			SPECIMEN,
			SPECIMEN_DEFINITION,
			STRUCTURE_DEFINITION,
			STRUCTURE_MAP,
			SUBSCRIPTION,
			SUBSTANCE,
			SUBSTANCE_NUCLEIC_ACID,
			SUBSTANCE_POLYMER,
			SUBSTANCE_PROTEIN,
			SUBSTANCE_REFERENCE_INFORMATION,
			SUBSTANCE_SOURCE_MATERIAL,
			SUBSTANCE_SPECIFICATION,
			SUPPLY_DELIVERY,
			SUPPLY_REQUEST,
			TASK,
			TERMINOLOGY_CAPABILITIES,
			TEST_REPORT,
			TEST_SCRIPT,
			VALUE_SET,
			VERIFICATION_RESULT,
			VISION_PRESCRIPTION,
		};

	/**
	 * A public read-only list of all the '<em><b>Resource Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ResourceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Resource Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResourceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResourceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Resource Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResourceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResourceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Resource Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResourceType get(int value) {
		switch (value) {
			case ACCOUNT_VALUE: return ACCOUNT;
			case ACTIVITY_DEFINITION_VALUE: return ACTIVITY_DEFINITION;
			case ADVERSE_EVENT_VALUE: return ADVERSE_EVENT;
			case ALLERGY_INTOLERANCE_VALUE: return ALLERGY_INTOLERANCE;
			case APPOINTMENT_VALUE: return APPOINTMENT;
			case APPOINTMENT_RESPONSE_VALUE: return APPOINTMENT_RESPONSE;
			case AUDIT_EVENT_VALUE: return AUDIT_EVENT;
			case BASIC_VALUE: return BASIC;
			case BINARY_VALUE: return BINARY;
			case BIOLOGICALLY_DERIVED_PRODUCT_VALUE: return BIOLOGICALLY_DERIVED_PRODUCT;
			case BODY_STRUCTURE_VALUE: return BODY_STRUCTURE;
			case BUNDLE_VALUE: return BUNDLE;
			case CAPABILITY_STATEMENT_VALUE: return CAPABILITY_STATEMENT;
			case CARE_PLAN_VALUE: return CARE_PLAN;
			case CARE_TEAM_VALUE: return CARE_TEAM;
			case CATALOG_ENTRY_VALUE: return CATALOG_ENTRY;
			case CHARGE_ITEM_VALUE: return CHARGE_ITEM;
			case CHARGE_ITEM_DEFINITION_VALUE: return CHARGE_ITEM_DEFINITION;
			case CLAIM_VALUE: return CLAIM;
			case CLAIM_RESPONSE_VALUE: return CLAIM_RESPONSE;
			case CLINICAL_IMPRESSION_VALUE: return CLINICAL_IMPRESSION;
			case CODE_SYSTEM_VALUE: return CODE_SYSTEM;
			case COMMUNICATION_VALUE: return COMMUNICATION;
			case COMMUNICATION_REQUEST_VALUE: return COMMUNICATION_REQUEST;
			case COMPARTMENT_DEFINITION_VALUE: return COMPARTMENT_DEFINITION;
			case COMPOSITION_VALUE: return COMPOSITION;
			case CONCEPT_MAP_VALUE: return CONCEPT_MAP;
			case CONDITION_VALUE: return CONDITION;
			case CONSENT_VALUE: return CONSENT;
			case CONTRACT_VALUE: return CONTRACT;
			case COVERAGE_VALUE: return COVERAGE;
			case COVERAGE_ELIGIBILITY_REQUEST_VALUE: return COVERAGE_ELIGIBILITY_REQUEST;
			case COVERAGE_ELIGIBILITY_RESPONSE_VALUE: return COVERAGE_ELIGIBILITY_RESPONSE;
			case DETECTED_ISSUE_VALUE: return DETECTED_ISSUE;
			case DEVICE_VALUE: return DEVICE;
			case DEVICE_DEFINITION_VALUE: return DEVICE_DEFINITION;
			case DEVICE_METRIC_VALUE: return DEVICE_METRIC;
			case DEVICE_REQUEST_VALUE: return DEVICE_REQUEST;
			case DEVICE_USE_STATEMENT_VALUE: return DEVICE_USE_STATEMENT;
			case DIAGNOSTIC_REPORT_VALUE: return DIAGNOSTIC_REPORT;
			case DOCUMENT_MANIFEST_VALUE: return DOCUMENT_MANIFEST;
			case DOCUMENT_REFERENCE_VALUE: return DOCUMENT_REFERENCE;
			case DOMAIN_RESOURCE_VALUE: return DOMAIN_RESOURCE;
			case EFFECT_EVIDENCE_SYNTHESIS_VALUE: return EFFECT_EVIDENCE_SYNTHESIS;
			case ENCOUNTER_VALUE: return ENCOUNTER;
			case ENDPOINT_VALUE: return ENDPOINT;
			case ENROLLMENT_REQUEST_VALUE: return ENROLLMENT_REQUEST;
			case ENROLLMENT_RESPONSE_VALUE: return ENROLLMENT_RESPONSE;
			case EPISODE_OF_CARE_VALUE: return EPISODE_OF_CARE;
			case EVENT_DEFINITION_VALUE: return EVENT_DEFINITION;
			case EVIDENCE_VALUE: return EVIDENCE;
			case EVIDENCE_VARIABLE_VALUE: return EVIDENCE_VARIABLE;
			case EXAMPLE_SCENARIO_VALUE: return EXAMPLE_SCENARIO;
			case EXPLANATION_OF_BENEFIT_VALUE: return EXPLANATION_OF_BENEFIT;
			case FAMILY_MEMBER_HISTORY_VALUE: return FAMILY_MEMBER_HISTORY;
			case FLAG_VALUE: return FLAG;
			case GOAL_VALUE: return GOAL;
			case GRAPH_DEFINITION_VALUE: return GRAPH_DEFINITION;
			case GROUP_VALUE: return GROUP;
			case GUIDANCE_RESPONSE_VALUE: return GUIDANCE_RESPONSE;
			case HEALTHCARE_SERVICE_VALUE: return HEALTHCARE_SERVICE;
			case IMAGING_STUDY_VALUE: return IMAGING_STUDY;
			case IMMUNIZATION_VALUE: return IMMUNIZATION;
			case IMMUNIZATION_EVALUATION_VALUE: return IMMUNIZATION_EVALUATION;
			case IMMUNIZATION_RECOMMENDATION_VALUE: return IMMUNIZATION_RECOMMENDATION;
			case IMPLEMENTATION_GUIDE_VALUE: return IMPLEMENTATION_GUIDE;
			case INSURANCE_PLAN_VALUE: return INSURANCE_PLAN;
			case INVOICE_VALUE: return INVOICE;
			case LIBRARY_VALUE: return LIBRARY;
			case LINKAGE_VALUE: return LINKAGE;
			case LIST_VALUE: return LIST;
			case LOCATION_VALUE: return LOCATION;
			case MEASURE_VALUE: return MEASURE;
			case MEASURE_REPORT_VALUE: return MEASURE_REPORT;
			case MEDIA_VALUE: return MEDIA;
			case MEDICATION_VALUE: return MEDICATION;
			case MEDICATION_ADMINISTRATION_VALUE: return MEDICATION_ADMINISTRATION;
			case MEDICATION_DISPENSE_VALUE: return MEDICATION_DISPENSE;
			case MEDICATION_KNOWLEDGE_VALUE: return MEDICATION_KNOWLEDGE;
			case MEDICATION_REQUEST_VALUE: return MEDICATION_REQUEST;
			case MEDICATION_STATEMENT_VALUE: return MEDICATION_STATEMENT;
			case MEDICINAL_PRODUCT_VALUE: return MEDICINAL_PRODUCT;
			case MEDICINAL_PRODUCT_AUTHORIZATION_VALUE: return MEDICINAL_PRODUCT_AUTHORIZATION;
			case MEDICINAL_PRODUCT_CONTRAINDICATION_VALUE: return MEDICINAL_PRODUCT_CONTRAINDICATION;
			case MEDICINAL_PRODUCT_INDICATION_VALUE: return MEDICINAL_PRODUCT_INDICATION;
			case MEDICINAL_PRODUCT_INGREDIENT_VALUE: return MEDICINAL_PRODUCT_INGREDIENT;
			case MEDICINAL_PRODUCT_INTERACTION_VALUE: return MEDICINAL_PRODUCT_INTERACTION;
			case MEDICINAL_PRODUCT_MANUFACTURED_VALUE: return MEDICINAL_PRODUCT_MANUFACTURED;
			case MEDICINAL_PRODUCT_PACKAGED_VALUE: return MEDICINAL_PRODUCT_PACKAGED;
			case MEDICINAL_PRODUCT_PHARMACEUTICAL_VALUE: return MEDICINAL_PRODUCT_PHARMACEUTICAL;
			case MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT_VALUE: return MEDICINAL_PRODUCT_UNDESIRABLE_EFFECT;
			case MESSAGE_DEFINITION_VALUE: return MESSAGE_DEFINITION;
			case MESSAGE_HEADER_VALUE: return MESSAGE_HEADER;
			case MOLECULAR_SEQUENCE_VALUE: return MOLECULAR_SEQUENCE;
			case NAMING_SYSTEM_VALUE: return NAMING_SYSTEM;
			case NUTRITION_ORDER_VALUE: return NUTRITION_ORDER;
			case OBSERVATION_VALUE: return OBSERVATION;
			case OBSERVATION_DEFINITION_VALUE: return OBSERVATION_DEFINITION;
			case OPERATION_DEFINITION_VALUE: return OPERATION_DEFINITION;
			case OPERATION_OUTCOME_VALUE: return OPERATION_OUTCOME;
			case ORGANIZATION_VALUE: return ORGANIZATION;
			case ORGANIZATION_AFFILIATION_VALUE: return ORGANIZATION_AFFILIATION;
			case PARAMETERS_VALUE: return PARAMETERS;
			case PATIENT_VALUE: return PATIENT;
			case PAYMENT_NOTICE_VALUE: return PAYMENT_NOTICE;
			case PAYMENT_RECONCILIATION_VALUE: return PAYMENT_RECONCILIATION;
			case PERSON_VALUE: return PERSON;
			case PLAN_DEFINITION_VALUE: return PLAN_DEFINITION;
			case PRACTITIONER_VALUE: return PRACTITIONER;
			case PRACTITIONER_ROLE_VALUE: return PRACTITIONER_ROLE;
			case PROCEDURE_VALUE: return PROCEDURE;
			case PROVENANCE_VALUE: return PROVENANCE;
			case QUESTIONNAIRE_VALUE: return QUESTIONNAIRE;
			case QUESTIONNAIRE_RESPONSE_VALUE: return QUESTIONNAIRE_RESPONSE;
			case RELATED_PERSON_VALUE: return RELATED_PERSON;
			case REQUEST_GROUP_VALUE: return REQUEST_GROUP;
			case RESEARCH_DEFINITION_VALUE: return RESEARCH_DEFINITION;
			case RESEARCH_ELEMENT_DEFINITION_VALUE: return RESEARCH_ELEMENT_DEFINITION;
			case RESEARCH_STUDY_VALUE: return RESEARCH_STUDY;
			case RESEARCH_SUBJECT_VALUE: return RESEARCH_SUBJECT;
			case RESOURCE_VALUE: return RESOURCE;
			case RISK_ASSESSMENT_VALUE: return RISK_ASSESSMENT;
			case RISK_EVIDENCE_SYNTHESIS_VALUE: return RISK_EVIDENCE_SYNTHESIS;
			case SCHEDULE_VALUE: return SCHEDULE;
			case SEARCH_PARAMETER_VALUE: return SEARCH_PARAMETER;
			case SERVICE_REQUEST_VALUE: return SERVICE_REQUEST;
			case SLOT_VALUE: return SLOT;
			case SPECIMEN_VALUE: return SPECIMEN;
			case SPECIMEN_DEFINITION_VALUE: return SPECIMEN_DEFINITION;
			case STRUCTURE_DEFINITION_VALUE: return STRUCTURE_DEFINITION;
			case STRUCTURE_MAP_VALUE: return STRUCTURE_MAP;
			case SUBSCRIPTION_VALUE: return SUBSCRIPTION;
			case SUBSTANCE_VALUE: return SUBSTANCE;
			case SUBSTANCE_NUCLEIC_ACID_VALUE: return SUBSTANCE_NUCLEIC_ACID;
			case SUBSTANCE_POLYMER_VALUE: return SUBSTANCE_POLYMER;
			case SUBSTANCE_PROTEIN_VALUE: return SUBSTANCE_PROTEIN;
			case SUBSTANCE_REFERENCE_INFORMATION_VALUE: return SUBSTANCE_REFERENCE_INFORMATION;
			case SUBSTANCE_SOURCE_MATERIAL_VALUE: return SUBSTANCE_SOURCE_MATERIAL;
			case SUBSTANCE_SPECIFICATION_VALUE: return SUBSTANCE_SPECIFICATION;
			case SUPPLY_DELIVERY_VALUE: return SUPPLY_DELIVERY;
			case SUPPLY_REQUEST_VALUE: return SUPPLY_REQUEST;
			case TASK_VALUE: return TASK;
			case TERMINOLOGY_CAPABILITIES_VALUE: return TERMINOLOGY_CAPABILITIES;
			case TEST_REPORT_VALUE: return TEST_REPORT;
			case TEST_SCRIPT_VALUE: return TEST_SCRIPT;
			case VALUE_SET_VALUE: return VALUE_SET;
			case VERIFICATION_RESULT_VALUE: return VERIFICATION_RESULT;
			case VISION_PRESCRIPTION_VALUE: return VISION_PRESCRIPTION;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ResourceType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ResourceType
