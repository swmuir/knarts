/**
 */
package org.hl7.fhir;

import java.lang.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>FHIR All Types List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getFHIRAllTypesList()
 * @model extendedMetaData="name='FHIRAllTypes-list'"
 * @generated
 */
public enum FHIRAllTypesList implements Enumerator {
	/**
	 * The '<em><b>Address</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADDRESS_VALUE
	 * @generated
	 * @ordered
	 */
	ADDRESS(0, "Address", "Address"),

	/**
	 * The '<em><b>Age</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGE_VALUE
	 * @generated
	 * @ordered
	 */
	AGE(1, "Age", "Age"),

	/**
	 * The '<em><b>Annotation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANNOTATION_VALUE
	 * @generated
	 * @ordered
	 */
	ANNOTATION(2, "Annotation", "Annotation"),

	/**
	 * The '<em><b>Attachment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATTACHMENT_VALUE
	 * @generated
	 * @ordered
	 */
	ATTACHMENT(3, "Attachment", "Attachment"),

	/**
	 * The '<em><b>Backbone Element</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BACKBONE_ELEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	BACKBONE_ELEMENT(4, "BackboneElement", "BackboneElement"),

	/**
	 * The '<em><b>Codeable Concept</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CODEABLE_CONCEPT_VALUE
	 * @generated
	 * @ordered
	 */
	CODEABLE_CONCEPT(5, "CodeableConcept", "CodeableConcept"),

	/**
	 * The '<em><b>Coding</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CODING_VALUE
	 * @generated
	 * @ordered
	 */
	CODING(6, "Coding", "Coding"),

	/**
	 * The '<em><b>Contact Detail</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTACT_DETAIL_VALUE
	 * @generated
	 * @ordered
	 */
	CONTACT_DETAIL(7, "ContactDetail", "ContactDetail"),

	/**
	 * The '<em><b>Contact Point</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTACT_POINT_VALUE
	 * @generated
	 * @ordered
	 */
	CONTACT_POINT(8, "ContactPoint", "ContactPoint"),

	/**
	 * The '<em><b>Contributor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTRIBUTOR_VALUE
	 * @generated
	 * @ordered
	 */
	CONTRIBUTOR(9, "Contributor", "Contributor"),

	/**
	 * The '<em><b>Count</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COUNT_VALUE
	 * @generated
	 * @ordered
	 */
	COUNT(10, "Count", "Count"),

	/**
	 * The '<em><b>Data Requirement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_REQUIREMENT_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_REQUIREMENT(11, "DataRequirement", "DataRequirement"),

	/**
	 * The '<em><b>Distance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISTANCE_VALUE
	 * @generated
	 * @ordered
	 */
	DISTANCE(12, "Distance", "Distance"),

	/**
	 * The '<em><b>Dosage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOSAGE_VALUE
	 * @generated
	 * @ordered
	 */
	DOSAGE(13, "Dosage", "Dosage"),

	/**
	 * The '<em><b>Duration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DURATION_VALUE
	 * @generated
	 * @ordered
	 */
	DURATION(14, "Duration", "Duration"),

	/**
	 * The '<em><b>Element</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	ELEMENT(15, "Element", "Element"),

	/**
	 * The '<em><b>Element Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELEMENT_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	ELEMENT_DEFINITION(16, "ElementDefinition", "ElementDefinition"),

	/**
	 * The '<em><b>Extension</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTENSION_VALUE
	 * @generated
	 * @ordered
	 */
	EXTENSION(17, "Extension", "Extension"),

	/**
	 * The '<em><b>Human Name</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HUMAN_NAME_VALUE
	 * @generated
	 * @ordered
	 */
	HUMAN_NAME(18, "HumanName", "HumanName"),

	/**
	 * The '<em><b>Identifier</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDENTIFIER_VALUE
	 * @generated
	 * @ordered
	 */
	IDENTIFIER(19, "Identifier", "Identifier"),

	/**
	 * The '<em><b>Marketing Status</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MARKETING_STATUS_VALUE
	 * @generated
	 * @ordered
	 */
	MARKETING_STATUS(20, "MarketingStatus", "MarketingStatus"),

	/**
	 * The '<em><b>Meta</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #META_VALUE
	 * @generated
	 * @ordered
	 */
	META(21, "Meta", "Meta"),

	/**
	 * The '<em><b>Money</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONEY_VALUE
	 * @generated
	 * @ordered
	 */
	MONEY(22, "Money", "Money"),

	/**
	 * The '<em><b>Narrative</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NARRATIVE_VALUE
	 * @generated
	 * @ordered
	 */
	NARRATIVE(23, "Narrative", "Narrative"),

	/**
	 * The '<em><b>Parameter Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARAMETER_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	PARAMETER_DEFINITION(24, "ParameterDefinition", "ParameterDefinition"),

	/**
	 * The '<em><b>Period</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERIOD_VALUE
	 * @generated
	 * @ordered
	 */
	PERIOD(25, "Period", "Period"),

	/**
	 * The '<em><b>Prod Characteristic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROD_CHARACTERISTIC_VALUE
	 * @generated
	 * @ordered
	 */
	PROD_CHARACTERISTIC(26, "ProdCharacteristic", "ProdCharacteristic"),

	/**
	 * The '<em><b>Product Shelf Life</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRODUCT_SHELF_LIFE_VALUE
	 * @generated
	 * @ordered
	 */
	PRODUCT_SHELF_LIFE(27, "ProductShelfLife", "ProductShelfLife"),

	/**
	 * The '<em><b>Quantity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUANTITY_VALUE
	 * @generated
	 * @ordered
	 */
	QUANTITY(28, "Quantity", "Quantity"),

	/**
	 * The '<em><b>Range</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RANGE_VALUE
	 * @generated
	 * @ordered
	 */
	RANGE(29, "Range", "Range"),

	/**
	 * The '<em><b>Ratio</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RATIO_VALUE
	 * @generated
	 * @ordered
	 */
	RATIO(30, "Ratio", "Ratio"),

	/**
	 * The '<em><b>Reference</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	REFERENCE(31, "Reference", "Reference"),

	/**
	 * The '<em><b>Related Artifact</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELATED_ARTIFACT_VALUE
	 * @generated
	 * @ordered
	 */
	RELATED_ARTIFACT(32, "RelatedArtifact", "RelatedArtifact"),

	/**
	 * The '<em><b>Sampled Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAMPLED_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	SAMPLED_DATA(33, "SampledData", "SampledData"),

	/**
	 * The '<em><b>Signature</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGNATURE_VALUE
	 * @generated
	 * @ordered
	 */
	SIGNATURE(34, "Signature", "Signature"),

	/**
	 * The '<em><b>Simple Quantity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIMPLE_QUANTITY_VALUE
	 * @generated
	 * @ordered
	 */
	SIMPLE_QUANTITY(35, "SimpleQuantity", "SimpleQuantity"),

	/**
	 * The '<em><b>Substance Amount</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSTANCE_AMOUNT_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSTANCE_AMOUNT(36, "SubstanceAmount", "SubstanceAmount"),

	/**
	 * The '<em><b>Substance Moiety</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSTANCE_MOIETY_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSTANCE_MOIETY(37, "SubstanceMoiety", "SubstanceMoiety"),

	/**
	 * The '<em><b>Timing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIMING_VALUE
	 * @generated
	 * @ordered
	 */
	TIMING(38, "Timing", "Timing"),

	/**
	 * The '<em><b>Trigger Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRIGGER_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	TRIGGER_DEFINITION(39, "TriggerDefinition", "TriggerDefinition"),

	/**
	 * The '<em><b>Usage Context</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USAGE_CONTEXT_VALUE
	 * @generated
	 * @ordered
	 */
	USAGE_CONTEXT(40, "UsageContext", "UsageContext"),

	/**
	 * The '<em><b>Base64 Binary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASE64_BINARY_VALUE
	 * @generated
	 * @ordered
	 */
	BASE64_BINARY(41, "base64Binary", "base64Binary"),

	/**
	 * The '<em><b>Boolean</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN_VALUE
	 * @generated
	 * @ordered
	 */
	BOOLEAN(42, "boolean", "boolean"),

	/**
	 * The '<em><b>Code</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CODE_VALUE
	 * @generated
	 * @ordered
	 */
	CODE(43, "code", "code"),

	/**
	 * The '<em><b>Date</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_VALUE
	 * @generated
	 * @ordered
	 */
	DATE(44, "date", "date"),

	/**
	 * The '<em><b>Date Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	DATE_TIME(45, "dateTime", "dateTime"),

	/**
	 * The '<em><b>Decimal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DECIMAL_VALUE
	 * @generated
	 * @ordered
	 */
	DECIMAL(46, "decimal", "decimal"),

	/**
	 * The '<em><b>Id</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ID_VALUE
	 * @generated
	 * @ordered
	 */
	ID(47, "id", "id"),

	/**
	 * The '<em><b>Instant</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSTANT_VALUE
	 * @generated
	 * @ordered
	 */
	INSTANT(48, "instant", "instant"),

	/**
	 * The '<em><b>Integer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTEGER_VALUE
	 * @generated
	 * @ordered
	 */
	INTEGER(49, "integer", "integer"),

	/**
	 * The '<em><b>Markdown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MARKDOWN_VALUE
	 * @generated
	 * @ordered
	 */
	MARKDOWN(50, "markdown", "markdown"),

	/**
	 * The '<em><b>Oid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OID_VALUE
	 * @generated
	 * @ordered
	 */
	OID(51, "oid", "oid"),

	/**
	 * The '<em><b>Positive Int</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSITIVE_INT_VALUE
	 * @generated
	 * @ordered
	 */
	POSITIVE_INT(52, "positiveInt", "positiveInt"),

	/**
	 * The '<em><b>String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_VALUE
	 * @generated
	 * @ordered
	 */
	STRING(53, "string", "string"),

	/**
	 * The '<em><b>Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_VALUE
	 * @generated
	 * @ordered
	 */
	TIME(54, "time", "time"),

	/**
	 * The '<em><b>Unsigned Int</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSIGNED_INT_VALUE
	 * @generated
	 * @ordered
	 */
	UNSIGNED_INT(55, "unsignedInt", "unsignedInt"),

	/**
	 * The '<em><b>Uri</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #URI_VALUE
	 * @generated
	 * @ordered
	 */
	URI(56, "uri", "uri"),

	/**
	 * The '<em><b>Uuid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UUID_VALUE
	 * @generated
	 * @ordered
	 */
	UUID(57, "uuid", "uuid"),

	/**
	 * The '<em><b>Xhtml</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XHTML_VALUE
	 * @generated
	 * @ordered
	 */
	XHTML(58, "xhtml", "xhtml"),

	/**
	 * The '<em><b>Account</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCOUNT_VALUE
	 * @generated
	 * @ordered
	 */
	ACCOUNT(59, "Account", "Account"),

	/**
	 * The '<em><b>Activity Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTIVITY_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	ACTIVITY_DEFINITION(60, "ActivityDefinition", "ActivityDefinition"),

	/**
	 * The '<em><b>Adverse Event</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADVERSE_EVENT_VALUE
	 * @generated
	 * @ordered
	 */
	ADVERSE_EVENT(61, "AdverseEvent", "AdverseEvent"),

	/**
	 * The '<em><b>Allergy Intolerance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALLERGY_INTOLERANCE_VALUE
	 * @generated
	 * @ordered
	 */
	ALLERGY_INTOLERANCE(62, "AllergyIntolerance", "AllergyIntolerance"),

	/**
	 * The '<em><b>Appointment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPOINTMENT_VALUE
	 * @generated
	 * @ordered
	 */
	APPOINTMENT(63, "Appointment", "Appointment"),

	/**
	 * The '<em><b>Appointment Response</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPOINTMENT_RESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	APPOINTMENT_RESPONSE(64, "AppointmentResponse", "AppointmentResponse"),

	/**
	 * The '<em><b>Audit Event</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUDIT_EVENT_VALUE
	 * @generated
	 * @ordered
	 */
	AUDIT_EVENT(65, "AuditEvent", "AuditEvent"),

	/**
	 * The '<em><b>Basic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASIC_VALUE
	 * @generated
	 * @ordered
	 */
	BASIC(66, "Basic", "Basic"),

	/**
	 * The '<em><b>Binary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BINARY_VALUE
	 * @generated
	 * @ordered
	 */
	BINARY(67, "Binary", "Binary"),

	/**
	 * The '<em><b>Biologically Derived Product</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIOLOGICALLY_DERIVED_PRODUCT_VALUE
	 * @generated
	 * @ordered
	 */
	BIOLOGICALLY_DERIVED_PRODUCT(68, "BiologicallyDerivedProduct", "BiologicallyDerivedProduct"),

	/**
	 * The '<em><b>Body Structure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BODY_STRUCTURE_VALUE
	 * @generated
	 * @ordered
	 */
	BODY_STRUCTURE(69, "BodyStructure", "BodyStructure"),

	/**
	 * The '<em><b>Bundle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUNDLE_VALUE
	 * @generated
	 * @ordered
	 */
	BUNDLE(70, "Bundle", "Bundle"),

	/**
	 * The '<em><b>Capability Statement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAPABILITY_STATEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	CAPABILITY_STATEMENT(71, "CapabilityStatement", "CapabilityStatement"),

	/**
	 * The '<em><b>Care Plan</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARE_PLAN_VALUE
	 * @generated
	 * @ordered
	 */
	CARE_PLAN(72, "CarePlan", "CarePlan"),

	/**
	 * The '<em><b>Care Team</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CARE_TEAM_VALUE
	 * @generated
	 * @ordered
	 */
	CARE_TEAM(73, "CareTeam", "CareTeam"),

	/**
	 * The '<em><b>Charge Item</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHARGE_ITEM_VALUE
	 * @generated
	 * @ordered
	 */
	CHARGE_ITEM(74, "ChargeItem", "ChargeItem"),

	/**
	 * The '<em><b>Claim</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLAIM_VALUE
	 * @generated
	 * @ordered
	 */
	CLAIM(75, "Claim", "Claim"),

	/**
	 * The '<em><b>Claim Response</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLAIM_RESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	CLAIM_RESPONSE(76, "ClaimResponse", "ClaimResponse"),

	/**
	 * The '<em><b>Clinical Impression</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLINICAL_IMPRESSION_VALUE
	 * @generated
	 * @ordered
	 */
	CLINICAL_IMPRESSION(77, "ClinicalImpression", "ClinicalImpression"),

	/**
	 * The '<em><b>Code System</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CODE_SYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	CODE_SYSTEM(78, "CodeSystem", "CodeSystem"),

	/**
	 * The '<em><b>Communication</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMUNICATION_VALUE
	 * @generated
	 * @ordered
	 */
	COMMUNICATION(79, "Communication", "Communication"),

	/**
	 * The '<em><b>Communication Request</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMUNICATION_REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	COMMUNICATION_REQUEST(80, "CommunicationRequest", "CommunicationRequest"),

	/**
	 * The '<em><b>Compartment Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPARTMENT_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	COMPARTMENT_DEFINITION(81, "CompartmentDefinition", "CompartmentDefinition"),

	/**
	 * The '<em><b>Composition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPOSITION_VALUE
	 * @generated
	 * @ordered
	 */
	COMPOSITION(82, "Composition", "Composition"),

	/**
	 * The '<em><b>Concept Map</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONCEPT_MAP_VALUE
	 * @generated
	 * @ordered
	 */
	CONCEPT_MAP(83, "ConceptMap", "ConceptMap"),

	/**
	 * The '<em><b>Condition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONDITION_VALUE
	 * @generated
	 * @ordered
	 */
	CONDITION(84, "Condition", "Condition"),

	/**
	 * The '<em><b>Consent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSENT_VALUE
	 * @generated
	 * @ordered
	 */
	CONSENT(85, "Consent", "Consent"),

	/**
	 * The '<em><b>Contract</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTRACT_VALUE
	 * @generated
	 * @ordered
	 */
	CONTRACT(86, "Contract", "Contract"),

	/**
	 * The '<em><b>Coverage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COVERAGE_VALUE
	 * @generated
	 * @ordered
	 */
	COVERAGE(87, "Coverage", "Coverage"),

	/**
	 * The '<em><b>Detected Issue</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DETECTED_ISSUE_VALUE
	 * @generated
	 * @ordered
	 */
	DETECTED_ISSUE(88, "DetectedIssue", "DetectedIssue"),

	/**
	 * The '<em><b>Device</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVICE_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICE(89, "Device", "Device"),

	/**
	 * The '<em><b>Device Component</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVICE_COMPONENT_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICE_COMPONENT(90, "DeviceComponent", "DeviceComponent"),

	/**
	 * The '<em><b>Device Metric</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVICE_METRIC_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICE_METRIC(91, "DeviceMetric", "DeviceMetric"),

	/**
	 * The '<em><b>Device Request</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVICE_REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICE_REQUEST(92, "DeviceRequest", "DeviceRequest"),

	/**
	 * The '<em><b>Device Use Statement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEVICE_USE_STATEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	DEVICE_USE_STATEMENT(93, "DeviceUseStatement", "DeviceUseStatement"),

	/**
	 * The '<em><b>Diagnostic Report</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIAGNOSTIC_REPORT_VALUE
	 * @generated
	 * @ordered
	 */
	DIAGNOSTIC_REPORT(94, "DiagnosticReport", "DiagnosticReport"),

	/**
	 * The '<em><b>Document Manifest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCUMENT_MANIFEST_VALUE
	 * @generated
	 * @ordered
	 */
	DOCUMENT_MANIFEST(95, "DocumentManifest", "DocumentManifest"),

	/**
	 * The '<em><b>Document Reference</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCUMENT_REFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	DOCUMENT_REFERENCE(96, "DocumentReference", "DocumentReference"),

	/**
	 * The '<em><b>Domain Resource</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOMAIN_RESOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	DOMAIN_RESOURCE(97, "DomainResource", "DomainResource"),

	/**
	 * The '<em><b>Eligibility Request</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELIGIBILITY_REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	ELIGIBILITY_REQUEST(98, "EligibilityRequest", "EligibilityRequest"),

	/**
	 * The '<em><b>Eligibility Response</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELIGIBILITY_RESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	ELIGIBILITY_RESPONSE(99, "EligibilityResponse", "EligibilityResponse"),

	/**
	 * The '<em><b>Encounter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENCOUNTER_VALUE
	 * @generated
	 * @ordered
	 */
	ENCOUNTER(100, "Encounter", "Encounter"),

	/**
	 * The '<em><b>Endpoint</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENDPOINT_VALUE
	 * @generated
	 * @ordered
	 */
	ENDPOINT(101, "Endpoint", "Endpoint"),

	/**
	 * The '<em><b>Enrollment Request</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENROLLMENT_REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	ENROLLMENT_REQUEST(102, "EnrollmentRequest", "EnrollmentRequest"),

	/**
	 * The '<em><b>Enrollment Response</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENROLLMENT_RESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	ENROLLMENT_RESPONSE(103, "EnrollmentResponse", "EnrollmentResponse"),

	/**
	 * The '<em><b>Entry Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENTRY_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	ENTRY_DEFINITION(104, "EntryDefinition", "EntryDefinition"),

	/**
	 * The '<em><b>Episode Of Care</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EPISODE_OF_CARE_VALUE
	 * @generated
	 * @ordered
	 */
	EPISODE_OF_CARE(105, "EpisodeOfCare", "EpisodeOfCare"),

	/**
	 * The '<em><b>Event Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVENT_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	EVENT_DEFINITION(106, "EventDefinition", "EventDefinition"),

	/**
	 * The '<em><b>Example Scenario</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXAMPLE_SCENARIO_VALUE
	 * @generated
	 * @ordered
	 */
	EXAMPLE_SCENARIO(107, "ExampleScenario", "ExampleScenario"),

	/**
	 * The '<em><b>Expansion Profile</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPANSION_PROFILE_VALUE
	 * @generated
	 * @ordered
	 */
	EXPANSION_PROFILE(108, "ExpansionProfile", "ExpansionProfile"),

	/**
	 * The '<em><b>Explanation Of Benefit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPLANATION_OF_BENEFIT_VALUE
	 * @generated
	 * @ordered
	 */
	EXPLANATION_OF_BENEFIT(109, "ExplanationOfBenefit", "ExplanationOfBenefit"),

	/**
	 * The '<em><b>Family Member History</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAMILY_MEMBER_HISTORY_VALUE
	 * @generated
	 * @ordered
	 */
	FAMILY_MEMBER_HISTORY(110, "FamilyMemberHistory", "FamilyMemberHistory"),

	/**
	 * The '<em><b>Flag</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLAG_VALUE
	 * @generated
	 * @ordered
	 */
	FLAG(111, "Flag", "Flag"),

	/**
	 * The '<em><b>Goal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOAL_VALUE
	 * @generated
	 * @ordered
	 */
	GOAL(112, "Goal", "Goal"),

	/**
	 * The '<em><b>Graph Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRAPH_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	GRAPH_DEFINITION(113, "GraphDefinition", "GraphDefinition"),

	/**
	 * The '<em><b>Group</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GROUP_VALUE
	 * @generated
	 * @ordered
	 */
	GROUP(114, "Group", "Group"),

	/**
	 * The '<em><b>Guidance Response</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GUIDANCE_RESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	GUIDANCE_RESPONSE(115, "GuidanceResponse", "GuidanceResponse"),

	/**
	 * The '<em><b>Healthcare Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEALTHCARE_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	HEALTHCARE_SERVICE(116, "HealthcareService", "HealthcareService"),

	/**
	 * The '<em><b>Imaging Study</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGING_STUDY_VALUE
	 * @generated
	 * @ordered
	 */
	IMAGING_STUDY(117, "ImagingStudy", "ImagingStudy"),

	/**
	 * The '<em><b>Immunization</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMMUNIZATION_VALUE
	 * @generated
	 * @ordered
	 */
	IMMUNIZATION(118, "Immunization", "Immunization"),

	/**
	 * The '<em><b>Immunization Evaluation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMMUNIZATION_EVALUATION_VALUE
	 * @generated
	 * @ordered
	 */
	IMMUNIZATION_EVALUATION(119, "ImmunizationEvaluation", "ImmunizationEvaluation"),

	/**
	 * The '<em><b>Immunization Recommendation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMMUNIZATION_RECOMMENDATION_VALUE
	 * @generated
	 * @ordered
	 */
	IMMUNIZATION_RECOMMENDATION(120, "ImmunizationRecommendation", "ImmunizationRecommendation"),

	/**
	 * The '<em><b>Implementation Guide</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPLEMENTATION_GUIDE_VALUE
	 * @generated
	 * @ordered
	 */
	IMPLEMENTATION_GUIDE(121, "ImplementationGuide", "ImplementationGuide"),

	/**
	 * The '<em><b>Implementation Guide Input</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPLEMENTATION_GUIDE_INPUT_VALUE
	 * @generated
	 * @ordered
	 */
	IMPLEMENTATION_GUIDE_INPUT(122, "ImplementationGuideInput", "ImplementationGuideInput"),

	/**
	 * The '<em><b>Implementation Guide Output</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPLEMENTATION_GUIDE_OUTPUT_VALUE
	 * @generated
	 * @ordered
	 */
	IMPLEMENTATION_GUIDE_OUTPUT(123, "ImplementationGuideOutput", "ImplementationGuideOutput"),

	/**
	 * The '<em><b>Invoice</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVOICE_VALUE
	 * @generated
	 * @ordered
	 */
	INVOICE(124, "Invoice", "Invoice"),

	/**
	 * The '<em><b>Item Instance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ITEM_INSTANCE_VALUE
	 * @generated
	 * @ordered
	 */
	ITEM_INSTANCE(125, "ItemInstance", "ItemInstance"),

	/**
	 * The '<em><b>Library</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIBRARY_VALUE
	 * @generated
	 * @ordered
	 */
	LIBRARY(126, "Library", "Library"),

	/**
	 * The '<em><b>Linkage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINKAGE_VALUE
	 * @generated
	 * @ordered
	 */
	LINKAGE(127, "Linkage", "Linkage"),

	/**
	 * The '<em><b>List</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIST_VALUE
	 * @generated
	 * @ordered
	 */
	LIST(128, "List", "List"),

	/**
	 * The '<em><b>Location</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCATION_VALUE
	 * @generated
	 * @ordered
	 */
	LOCATION(129, "Location", "Location"),

	/**
	 * The '<em><b>Measure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEASURE_VALUE
	 * @generated
	 * @ordered
	 */
	MEASURE(130, "Measure", "Measure"),

	/**
	 * The '<em><b>Measure Report</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEASURE_REPORT_VALUE
	 * @generated
	 * @ordered
	 */
	MEASURE_REPORT(131, "MeasureReport", "MeasureReport"),

	/**
	 * The '<em><b>Media</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDIA_VALUE
	 * @generated
	 * @ordered
	 */
	MEDIA(132, "Media", "Media"),

	/**
	 * The '<em><b>Medication</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICATION_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICATION(133, "Medication", "Medication"),

	/**
	 * The '<em><b>Medication Administration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICATION_ADMINISTRATION_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICATION_ADMINISTRATION(134, "MedicationAdministration", "MedicationAdministration"),

	/**
	 * The '<em><b>Medication Dispense</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICATION_DISPENSE_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICATION_DISPENSE(135, "MedicationDispense", "MedicationDispense"),

	/**
	 * The '<em><b>Medication Request</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICATION_REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICATION_REQUEST(136, "MedicationRequest", "MedicationRequest"),

	/**
	 * The '<em><b>Medication Statement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICATION_STATEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICATION_STATEMENT(137, "MedicationStatement", "MedicationStatement"),

	/**
	 * The '<em><b>Medicinal Product</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICINAL_PRODUCT_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICINAL_PRODUCT(138, "MedicinalProduct", "MedicinalProduct"),

	/**
	 * The '<em><b>Medicinal Product Authorization</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICINAL_PRODUCT_AUTHORIZATION_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICINAL_PRODUCT_AUTHORIZATION(139, "MedicinalProductAuthorization", "MedicinalProductAuthorization"),

	/**
	 * The '<em><b>Medicinal Product Clinicals</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICINAL_PRODUCT_CLINICALS_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICINAL_PRODUCT_CLINICALS(140, "MedicinalProductClinicals", "MedicinalProductClinicals"),

	/**
	 * The '<em><b>Medicinal Product Device Spec</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICINAL_PRODUCT_DEVICE_SPEC_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICINAL_PRODUCT_DEVICE_SPEC(141, "MedicinalProductDeviceSpec", "MedicinalProductDeviceSpec"),

	/**
	 * The '<em><b>Medicinal Product Ingredient</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICINAL_PRODUCT_INGREDIENT_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICINAL_PRODUCT_INGREDIENT(142, "MedicinalProductIngredient", "MedicinalProductIngredient"),

	/**
	 * The '<em><b>Medicinal Product Packaged</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICINAL_PRODUCT_PACKAGED_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICINAL_PRODUCT_PACKAGED(143, "MedicinalProductPackaged", "MedicinalProductPackaged"),

	/**
	 * The '<em><b>Medicinal Product Pharmaceutical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICINAL_PRODUCT_PHARMACEUTICAL_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICINAL_PRODUCT_PHARMACEUTICAL(144, "MedicinalProductPharmaceutical", "MedicinalProductPharmaceutical"),

	/**
	 * The '<em><b>Message Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MESSAGE_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	MESSAGE_DEFINITION(145, "MessageDefinition", "MessageDefinition"),

	/**
	 * The '<em><b>Message Header</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MESSAGE_HEADER_VALUE
	 * @generated
	 * @ordered
	 */
	MESSAGE_HEADER(146, "MessageHeader", "MessageHeader"),

	/**
	 * The '<em><b>Naming System</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAMING_SYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	NAMING_SYSTEM(147, "NamingSystem", "NamingSystem"),

	/**
	 * The '<em><b>Nutrition Order</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUTRITION_ORDER_VALUE
	 * @generated
	 * @ordered
	 */
	NUTRITION_ORDER(148, "NutritionOrder", "NutritionOrder"),

	/**
	 * The '<em><b>Observation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBSERVATION_VALUE
	 * @generated
	 * @ordered
	 */
	OBSERVATION(149, "Observation", "Observation"),

	/**
	 * The '<em><b>Observation Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBSERVATION_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	OBSERVATION_DEFINITION(150, "ObservationDefinition", "ObservationDefinition"),

	/**
	 * The '<em><b>Occupational Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCCUPATIONAL_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	OCCUPATIONAL_DATA(151, "OccupationalData", "OccupationalData"),

	/**
	 * The '<em><b>Operation Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATION_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	OPERATION_DEFINITION(152, "OperationDefinition", "OperationDefinition"),

	/**
	 * The '<em><b>Operation Outcome</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPERATION_OUTCOME_VALUE
	 * @generated
	 * @ordered
	 */
	OPERATION_OUTCOME(153, "OperationOutcome", "OperationOutcome"),

	/**
	 * The '<em><b>Organization</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORGANIZATION_VALUE
	 * @generated
	 * @ordered
	 */
	ORGANIZATION(154, "Organization", "Organization"),

	/**
	 * The '<em><b>Organization Role</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORGANIZATION_ROLE_VALUE
	 * @generated
	 * @ordered
	 */
	ORGANIZATION_ROLE(155, "OrganizationRole", "OrganizationRole"),

	/**
	 * The '<em><b>Parameters</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARAMETERS_VALUE
	 * @generated
	 * @ordered
	 */
	PARAMETERS(156, "Parameters", "Parameters"),

	/**
	 * The '<em><b>Patient</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATIENT_VALUE
	 * @generated
	 * @ordered
	 */
	PATIENT(157, "Patient", "Patient"),

	/**
	 * The '<em><b>Payment Notice</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAYMENT_NOTICE_VALUE
	 * @generated
	 * @ordered
	 */
	PAYMENT_NOTICE(158, "PaymentNotice", "PaymentNotice"),

	/**
	 * The '<em><b>Payment Reconciliation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAYMENT_RECONCILIATION_VALUE
	 * @generated
	 * @ordered
	 */
	PAYMENT_RECONCILIATION(159, "PaymentReconciliation", "PaymentReconciliation"),

	/**
	 * The '<em><b>Person</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERSON_VALUE
	 * @generated
	 * @ordered
	 */
	PERSON(160, "Person", "Person"),

	/**
	 * The '<em><b>Plan Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLAN_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	PLAN_DEFINITION(161, "PlanDefinition", "PlanDefinition"),

	/**
	 * The '<em><b>Practitioner</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRACTITIONER_VALUE
	 * @generated
	 * @ordered
	 */
	PRACTITIONER(162, "Practitioner", "Practitioner"),

	/**
	 * The '<em><b>Practitioner Role</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRACTITIONER_ROLE_VALUE
	 * @generated
	 * @ordered
	 */
	PRACTITIONER_ROLE(163, "PractitionerRole", "PractitionerRole"),

	/**
	 * The '<em><b>Procedure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCEDURE_VALUE
	 * @generated
	 * @ordered
	 */
	PROCEDURE(164, "Procedure", "Procedure"),

	/**
	 * The '<em><b>Process Request</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCESS_REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	PROCESS_REQUEST(165, "ProcessRequest", "ProcessRequest"),

	/**
	 * The '<em><b>Process Response</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCESS_RESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	PROCESS_RESPONSE(166, "ProcessResponse", "ProcessResponse"),

	/**
	 * The '<em><b>Product Plan</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRODUCT_PLAN_VALUE
	 * @generated
	 * @ordered
	 */
	PRODUCT_PLAN(167, "ProductPlan", "ProductPlan"),

	/**
	 * The '<em><b>Provenance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROVENANCE_VALUE
	 * @generated
	 * @ordered
	 */
	PROVENANCE(168, "Provenance", "Provenance"),

	/**
	 * The '<em><b>Questionnaire</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUESTIONNAIRE_VALUE
	 * @generated
	 * @ordered
	 */
	QUESTIONNAIRE(169, "Questionnaire", "Questionnaire"),

	/**
	 * The '<em><b>Questionnaire Response</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUESTIONNAIRE_RESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	QUESTIONNAIRE_RESPONSE(170, "QuestionnaireResponse", "QuestionnaireResponse"),

	/**
	 * The '<em><b>Related Person</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELATED_PERSON_VALUE
	 * @generated
	 * @ordered
	 */
	RELATED_PERSON(171, "RelatedPerson", "RelatedPerson"),

	/**
	 * The '<em><b>Request Group</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUEST_GROUP_VALUE
	 * @generated
	 * @ordered
	 */
	REQUEST_GROUP(172, "RequestGroup", "RequestGroup"),

	/**
	 * The '<em><b>Research Study</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESEARCH_STUDY_VALUE
	 * @generated
	 * @ordered
	 */
	RESEARCH_STUDY(173, "ResearchStudy", "ResearchStudy"),

	/**
	 * The '<em><b>Research Subject</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESEARCH_SUBJECT_VALUE
	 * @generated
	 * @ordered
	 */
	RESEARCH_SUBJECT(174, "ResearchSubject", "ResearchSubject"),

	/**
	 * The '<em><b>Resource</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	RESOURCE(175, "Resource", "Resource"),

	/**
	 * The '<em><b>Risk Assessment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RISK_ASSESSMENT_VALUE
	 * @generated
	 * @ordered
	 */
	RISK_ASSESSMENT(176, "RiskAssessment", "RiskAssessment"),

	/**
	 * The '<em><b>Schedule</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCHEDULE_VALUE
	 * @generated
	 * @ordered
	 */
	SCHEDULE(177, "Schedule", "Schedule"),

	/**
	 * The '<em><b>Search Parameter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEARCH_PARAMETER_VALUE
	 * @generated
	 * @ordered
	 */
	SEARCH_PARAMETER(178, "SearchParameter", "SearchParameter"),

	/**
	 * The '<em><b>Sequence</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEQUENCE_VALUE
	 * @generated
	 * @ordered
	 */
	SEQUENCE(179, "Sequence", "Sequence"),

	/**
	 * The '<em><b>Service Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVICE_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	SERVICE_DEFINITION(180, "ServiceDefinition", "ServiceDefinition"),

	/**
	 * The '<em><b>Service Request</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERVICE_REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	SERVICE_REQUEST(181, "ServiceRequest", "ServiceRequest"),

	/**
	 * The '<em><b>Slot</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SLOT_VALUE
	 * @generated
	 * @ordered
	 */
	SLOT(182, "Slot", "Slot"),

	/**
	 * The '<em><b>Specimen</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPECIMEN_VALUE
	 * @generated
	 * @ordered
	 */
	SPECIMEN(183, "Specimen", "Specimen"),

	/**
	 * The '<em><b>Specimen Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPECIMEN_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	SPECIMEN_DEFINITION(184, "SpecimenDefinition", "SpecimenDefinition"),

	/**
	 * The '<em><b>Structure Definition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRUCTURE_DEFINITION_VALUE
	 * @generated
	 * @ordered
	 */
	STRUCTURE_DEFINITION(185, "StructureDefinition", "StructureDefinition"),

	/**
	 * The '<em><b>Structure Map</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRUCTURE_MAP_VALUE
	 * @generated
	 * @ordered
	 */
	STRUCTURE_MAP(186, "StructureMap", "StructureMap"),

	/**
	 * The '<em><b>Subscription</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSCRIPTION_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSCRIPTION(187, "Subscription", "Subscription"),

	/**
	 * The '<em><b>Substance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSTANCE_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSTANCE(188, "Substance", "Substance"),

	/**
	 * The '<em><b>Substance Polymer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSTANCE_POLYMER_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSTANCE_POLYMER(189, "SubstancePolymer", "SubstancePolymer"),

	/**
	 * The '<em><b>Substance Reference Information</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSTANCE_REFERENCE_INFORMATION_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSTANCE_REFERENCE_INFORMATION(190, "SubstanceReferenceInformation", "SubstanceReferenceInformation"),

	/**
	 * The '<em><b>Substance Specification</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSTANCE_SPECIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSTANCE_SPECIFICATION(191, "SubstanceSpecification", "SubstanceSpecification"),

	/**
	 * The '<em><b>Supply Delivery</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPPLY_DELIVERY_VALUE
	 * @generated
	 * @ordered
	 */
	SUPPLY_DELIVERY(192, "SupplyDelivery", "SupplyDelivery"),

	/**
	 * The '<em><b>Supply Request</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPPLY_REQUEST_VALUE
	 * @generated
	 * @ordered
	 */
	SUPPLY_REQUEST(193, "SupplyRequest", "SupplyRequest"),

	/**
	 * The '<em><b>Task</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TASK_VALUE
	 * @generated
	 * @ordered
	 */
	TASK(194, "Task", "Task"),

	/**
	 * The '<em><b>Terminology Capabilities</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TERMINOLOGY_CAPABILITIES_VALUE
	 * @generated
	 * @ordered
	 */
	TERMINOLOGY_CAPABILITIES(195, "TerminologyCapabilities", "TerminologyCapabilities"),

	/**
	 * The '<em><b>Test Report</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEST_REPORT_VALUE
	 * @generated
	 * @ordered
	 */
	TEST_REPORT(196, "TestReport", "TestReport"),

	/**
	 * The '<em><b>Test Script</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEST_SCRIPT_VALUE
	 * @generated
	 * @ordered
	 */
	TEST_SCRIPT(197, "TestScript", "TestScript"),

	/**
	 * The '<em><b>User Session</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER_SESSION_VALUE
	 * @generated
	 * @ordered
	 */
	USER_SESSION(198, "UserSession", "UserSession"),

	/**
	 * The '<em><b>Value Set</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALUE_SET_VALUE
	 * @generated
	 * @ordered
	 */
	VALUE_SET(199, "ValueSet", "ValueSet"),

	/**
	 * The '<em><b>Verification Result</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERIFICATION_RESULT_VALUE
	 * @generated
	 * @ordered
	 */
	VERIFICATION_RESULT(200, "VerificationResult", "VerificationResult"),

	/**
	 * The '<em><b>Vision Prescription</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VISION_PRESCRIPTION_VALUE
	 * @generated
	 * @ordered
	 */
	VISION_PRESCRIPTION(201, "VisionPrescription", "VisionPrescription"),

	/**
	 * The '<em><b>Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	TYPE(202, "Type", "Type"),

	/**
	 * The '<em><b>Any</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANY_VALUE
	 * @generated
	 * @ordered
	 */
	ANY(203, "Any", "Any");

	/**
	 * The '<em><b>Address</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Address
	 * <!-- end-model-doc -->
	 * @see #ADDRESS
	 * @model name="Address"
	 * @generated
	 * @ordered
	 */
	public static final int ADDRESS_VALUE = 0;

	/**
	 * The '<em><b>Age</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Age
	 * <!-- end-model-doc -->
	 * @see #AGE
	 * @model name="Age"
	 * @generated
	 * @ordered
	 */
	public static final int AGE_VALUE = 1;

	/**
	 * The '<em><b>Annotation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Annotation
	 * <!-- end-model-doc -->
	 * @see #ANNOTATION
	 * @model name="Annotation"
	 * @generated
	 * @ordered
	 */
	public static final int ANNOTATION_VALUE = 2;

	/**
	 * The '<em><b>Attachment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attachment
	 * <!-- end-model-doc -->
	 * @see #ATTACHMENT
	 * @model name="Attachment"
	 * @generated
	 * @ordered
	 */
	public static final int ATTACHMENT_VALUE = 3;

	/**
	 * The '<em><b>Backbone Element</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BackboneElement
	 * <!-- end-model-doc -->
	 * @see #BACKBONE_ELEMENT
	 * @model name="BackboneElement"
	 * @generated
	 * @ordered
	 */
	public static final int BACKBONE_ELEMENT_VALUE = 4;

	/**
	 * The '<em><b>Codeable Concept</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CodeableConcept
	 * <!-- end-model-doc -->
	 * @see #CODEABLE_CONCEPT
	 * @model name="CodeableConcept"
	 * @generated
	 * @ordered
	 */
	public static final int CODEABLE_CONCEPT_VALUE = 5;

	/**
	 * The '<em><b>Coding</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Coding
	 * <!-- end-model-doc -->
	 * @see #CODING
	 * @model name="Coding"
	 * @generated
	 * @ordered
	 */
	public static final int CODING_VALUE = 6;

	/**
	 * The '<em><b>Contact Detail</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ContactDetail
	 * <!-- end-model-doc -->
	 * @see #CONTACT_DETAIL
	 * @model name="ContactDetail"
	 * @generated
	 * @ordered
	 */
	public static final int CONTACT_DETAIL_VALUE = 7;

	/**
	 * The '<em><b>Contact Point</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ContactPoint
	 * <!-- end-model-doc -->
	 * @see #CONTACT_POINT
	 * @model name="ContactPoint"
	 * @generated
	 * @ordered
	 */
	public static final int CONTACT_POINT_VALUE = 8;

	/**
	 * The '<em><b>Contributor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contributor
	 * <!-- end-model-doc -->
	 * @see #CONTRIBUTOR
	 * @model name="Contributor"
	 * @generated
	 * @ordered
	 */
	public static final int CONTRIBUTOR_VALUE = 9;

	/**
	 * The '<em><b>Count</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Count
	 * <!-- end-model-doc -->
	 * @see #COUNT
	 * @model name="Count"
	 * @generated
	 * @ordered
	 */
	public static final int COUNT_VALUE = 10;

	/**
	 * The '<em><b>Data Requirement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DataRequirement
	 * <!-- end-model-doc -->
	 * @see #DATA_REQUIREMENT
	 * @model name="DataRequirement"
	 * @generated
	 * @ordered
	 */
	public static final int DATA_REQUIREMENT_VALUE = 11;

	/**
	 * The '<em><b>Distance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Distance
	 * <!-- end-model-doc -->
	 * @see #DISTANCE
	 * @model name="Distance"
	 * @generated
	 * @ordered
	 */
	public static final int DISTANCE_VALUE = 12;

	/**
	 * The '<em><b>Dosage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dosage
	 * <!-- end-model-doc -->
	 * @see #DOSAGE
	 * @model name="Dosage"
	 * @generated
	 * @ordered
	 */
	public static final int DOSAGE_VALUE = 13;

	/**
	 * The '<em><b>Duration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Duration
	 * <!-- end-model-doc -->
	 * @see #DURATION
	 * @model name="Duration"
	 * @generated
	 * @ordered
	 */
	public static final int DURATION_VALUE = 14;

	/**
	 * The '<em><b>Element</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Element
	 * <!-- end-model-doc -->
	 * @see #ELEMENT
	 * @model name="Element"
	 * @generated
	 * @ordered
	 */
	public static final int ELEMENT_VALUE = 15;

	/**
	 * The '<em><b>Element Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ElementDefinition
	 * <!-- end-model-doc -->
	 * @see #ELEMENT_DEFINITION
	 * @model name="ElementDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int ELEMENT_DEFINITION_VALUE = 16;

	/**
	 * The '<em><b>Extension</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Extension
	 * <!-- end-model-doc -->
	 * @see #EXTENSION
	 * @model name="Extension"
	 * @generated
	 * @ordered
	 */
	public static final int EXTENSION_VALUE = 17;

	/**
	 * The '<em><b>Human Name</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HumanName
	 * <!-- end-model-doc -->
	 * @see #HUMAN_NAME
	 * @model name="HumanName"
	 * @generated
	 * @ordered
	 */
	public static final int HUMAN_NAME_VALUE = 18;

	/**
	 * The '<em><b>Identifier</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier
	 * <!-- end-model-doc -->
	 * @see #IDENTIFIER
	 * @model name="Identifier"
	 * @generated
	 * @ordered
	 */
	public static final int IDENTIFIER_VALUE = 19;

	/**
	 * The '<em><b>Marketing Status</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MarketingStatus
	 * <!-- end-model-doc -->
	 * @see #MARKETING_STATUS
	 * @model name="MarketingStatus"
	 * @generated
	 * @ordered
	 */
	public static final int MARKETING_STATUS_VALUE = 20;

	/**
	 * The '<em><b>Meta</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Meta
	 * <!-- end-model-doc -->
	 * @see #META
	 * @model name="Meta"
	 * @generated
	 * @ordered
	 */
	public static final int META_VALUE = 21;

	/**
	 * The '<em><b>Money</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Money
	 * <!-- end-model-doc -->
	 * @see #MONEY
	 * @model name="Money"
	 * @generated
	 * @ordered
	 */
	public static final int MONEY_VALUE = 22;

	/**
	 * The '<em><b>Narrative</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Narrative
	 * <!-- end-model-doc -->
	 * @see #NARRATIVE
	 * @model name="Narrative"
	 * @generated
	 * @ordered
	 */
	public static final int NARRATIVE_VALUE = 23;

	/**
	 * The '<em><b>Parameter Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ParameterDefinition
	 * <!-- end-model-doc -->
	 * @see #PARAMETER_DEFINITION
	 * @model name="ParameterDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int PARAMETER_DEFINITION_VALUE = 24;

	/**
	 * The '<em><b>Period</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Period
	 * <!-- end-model-doc -->
	 * @see #PERIOD
	 * @model name="Period"
	 * @generated
	 * @ordered
	 */
	public static final int PERIOD_VALUE = 25;

	/**
	 * The '<em><b>Prod Characteristic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ProdCharacteristic
	 * <!-- end-model-doc -->
	 * @see #PROD_CHARACTERISTIC
	 * @model name="ProdCharacteristic"
	 * @generated
	 * @ordered
	 */
	public static final int PROD_CHARACTERISTIC_VALUE = 26;

	/**
	 * The '<em><b>Product Shelf Life</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ProductShelfLife
	 * <!-- end-model-doc -->
	 * @see #PRODUCT_SHELF_LIFE
	 * @model name="ProductShelfLife"
	 * @generated
	 * @ordered
	 */
	public static final int PRODUCT_SHELF_LIFE_VALUE = 27;

	/**
	 * The '<em><b>Quantity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Quantity
	 * <!-- end-model-doc -->
	 * @see #QUANTITY
	 * @model name="Quantity"
	 * @generated
	 * @ordered
	 */
	public static final int QUANTITY_VALUE = 28;

	/**
	 * The '<em><b>Range</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Range
	 * <!-- end-model-doc -->
	 * @see #RANGE
	 * @model name="Range"
	 * @generated
	 * @ordered
	 */
	public static final int RANGE_VALUE = 29;

	/**
	 * The '<em><b>Ratio</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ratio
	 * <!-- end-model-doc -->
	 * @see #RATIO
	 * @model name="Ratio"
	 * @generated
	 * @ordered
	 */
	public static final int RATIO_VALUE = 30;

	/**
	 * The '<em><b>Reference</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference
	 * <!-- end-model-doc -->
	 * @see #REFERENCE
	 * @model name="Reference"
	 * @generated
	 * @ordered
	 */
	public static final int REFERENCE_VALUE = 31;

	/**
	 * The '<em><b>Related Artifact</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RelatedArtifact
	 * <!-- end-model-doc -->
	 * @see #RELATED_ARTIFACT
	 * @model name="RelatedArtifact"
	 * @generated
	 * @ordered
	 */
	public static final int RELATED_ARTIFACT_VALUE = 32;

	/**
	 * The '<em><b>Sampled Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SampledData
	 * <!-- end-model-doc -->
	 * @see #SAMPLED_DATA
	 * @model name="SampledData"
	 * @generated
	 * @ordered
	 */
	public static final int SAMPLED_DATA_VALUE = 33;

	/**
	 * The '<em><b>Signature</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Signature
	 * <!-- end-model-doc -->
	 * @see #SIGNATURE
	 * @model name="Signature"
	 * @generated
	 * @ordered
	 */
	public static final int SIGNATURE_VALUE = 34;

	/**
	 * The '<em><b>Simple Quantity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SimpleQuantity
	 * <!-- end-model-doc -->
	 * @see #SIMPLE_QUANTITY
	 * @model name="SimpleQuantity"
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE_QUANTITY_VALUE = 35;

	/**
	 * The '<em><b>Substance Amount</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SubstanceAmount
	 * <!-- end-model-doc -->
	 * @see #SUBSTANCE_AMOUNT
	 * @model name="SubstanceAmount"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTANCE_AMOUNT_VALUE = 36;

	/**
	 * The '<em><b>Substance Moiety</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SubstanceMoiety
	 * <!-- end-model-doc -->
	 * @see #SUBSTANCE_MOIETY
	 * @model name="SubstanceMoiety"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTANCE_MOIETY_VALUE = 37;

	/**
	 * The '<em><b>Timing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Timing
	 * <!-- end-model-doc -->
	 * @see #TIMING
	 * @model name="Timing"
	 * @generated
	 * @ordered
	 */
	public static final int TIMING_VALUE = 38;

	/**
	 * The '<em><b>Trigger Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TriggerDefinition
	 * <!-- end-model-doc -->
	 * @see #TRIGGER_DEFINITION
	 * @model name="TriggerDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int TRIGGER_DEFINITION_VALUE = 39;

	/**
	 * The '<em><b>Usage Context</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UsageContext
	 * <!-- end-model-doc -->
	 * @see #USAGE_CONTEXT
	 * @model name="UsageContext"
	 * @generated
	 * @ordered
	 */
	public static final int USAGE_CONTEXT_VALUE = 40;

	/**
	 * The '<em><b>Base64 Binary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * base64Binary
	 * <!-- end-model-doc -->
	 * @see #BASE64_BINARY
	 * @model name="base64Binary"
	 * @generated
	 * @ordered
	 */
	public static final int BASE64_BINARY_VALUE = 41;

	/**
	 * The '<em><b>Boolean</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * boolean
	 * <!-- end-model-doc -->
	 * @see #BOOLEAN
	 * @model name="boolean"
	 * @generated
	 * @ordered
	 */
	public static final int BOOLEAN_VALUE = 42;

	/**
	 * The '<em><b>Code</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * code
	 * <!-- end-model-doc -->
	 * @see #CODE
	 * @model name="code"
	 * @generated
	 * @ordered
	 */
	public static final int CODE_VALUE = 43;

	/**
	 * The '<em><b>Date</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * date
	 * <!-- end-model-doc -->
	 * @see #DATE
	 * @model name="date"
	 * @generated
	 * @ordered
	 */
	public static final int DATE_VALUE = 44;

	/**
	 * The '<em><b>Date Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * dateTime
	 * <!-- end-model-doc -->
	 * @see #DATE_TIME
	 * @model name="dateTime"
	 * @generated
	 * @ordered
	 */
	public static final int DATE_TIME_VALUE = 45;

	/**
	 * The '<em><b>Decimal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * decimal
	 * <!-- end-model-doc -->
	 * @see #DECIMAL
	 * @model name="decimal"
	 * @generated
	 * @ordered
	 */
	public static final int DECIMAL_VALUE = 46;

	/**
	 * The '<em><b>Id</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * id
	 * <!-- end-model-doc -->
	 * @see #ID
	 * @model name="id"
	 * @generated
	 * @ordered
	 */
	public static final int ID_VALUE = 47;

	/**
	 * The '<em><b>Instant</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * instant
	 * <!-- end-model-doc -->
	 * @see #INSTANT
	 * @model name="instant"
	 * @generated
	 * @ordered
	 */
	public static final int INSTANT_VALUE = 48;

	/**
	 * The '<em><b>Integer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * integer
	 * <!-- end-model-doc -->
	 * @see #INTEGER
	 * @model name="integer"
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER_VALUE = 49;

	/**
	 * The '<em><b>Markdown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * markdown
	 * <!-- end-model-doc -->
	 * @see #MARKDOWN
	 * @model name="markdown"
	 * @generated
	 * @ordered
	 */
	public static final int MARKDOWN_VALUE = 50;

	/**
	 * The '<em><b>Oid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * oid
	 * <!-- end-model-doc -->
	 * @see #OID
	 * @model name="oid"
	 * @generated
	 * @ordered
	 */
	public static final int OID_VALUE = 51;

	/**
	 * The '<em><b>Positive Int</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * positiveInt
	 * <!-- end-model-doc -->
	 * @see #POSITIVE_INT
	 * @model name="positiveInt"
	 * @generated
	 * @ordered
	 */
	public static final int POSITIVE_INT_VALUE = 52;

	/**
	 * The '<em><b>String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * string
	 * <!-- end-model-doc -->
	 * @see #STRING
	 * @model name="string"
	 * @generated
	 * @ordered
	 */
	public static final int STRING_VALUE = 53;

	/**
	 * The '<em><b>Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * time
	 * <!-- end-model-doc -->
	 * @see #TIME
	 * @model name="time"
	 * @generated
	 * @ordered
	 */
	public static final int TIME_VALUE = 54;

	/**
	 * The '<em><b>Unsigned Int</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * unsignedInt
	 * <!-- end-model-doc -->
	 * @see #UNSIGNED_INT
	 * @model name="unsignedInt"
	 * @generated
	 * @ordered
	 */
	public static final int UNSIGNED_INT_VALUE = 55;

	/**
	 * The '<em><b>Uri</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * uri
	 * <!-- end-model-doc -->
	 * @see #URI
	 * @model name="uri"
	 * @generated
	 * @ordered
	 */
	public static final int URI_VALUE = 56;

	/**
	 * The '<em><b>Uuid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * uuid
	 * <!-- end-model-doc -->
	 * @see #UUID
	 * @model name="uuid"
	 * @generated
	 * @ordered
	 */
	public static final int UUID_VALUE = 57;

	/**
	 * The '<em><b>Xhtml</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * XHTML
	 * <!-- end-model-doc -->
	 * @see #XHTML
	 * @model name="xhtml"
	 * @generated
	 * @ordered
	 */
	public static final int XHTML_VALUE = 58;

	/**
	 * The '<em><b>Account</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Account
	 * Account
	 * Cuenta
	 * 账户
	 * <!-- end-model-doc -->
	 * @see #ACCOUNT
	 * @model name="Account"
	 * @generated
	 * @ordered
	 */
	public static final int ACCOUNT_VALUE = 59;

	/**
	 * The '<em><b>Activity Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ActivityDefinition
	 * ActivityDefinition
	 * DefinizioneAttivita
	 * DefinicionDeActividad
	 * 活动定义
	 * <!-- end-model-doc -->
	 * @see #ACTIVITY_DEFINITION
	 * @model name="ActivityDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVITY_DEFINITION_VALUE = 60;

	/**
	 * The '<em><b>Adverse Event</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AdverseEvent
	 * AdverseEvent
	 * EventoAvverso
	 * EventoAdverso
	 * 不良事件
	 * <!-- end-model-doc -->
	 * @see #ADVERSE_EVENT
	 * @model name="AdverseEvent"
	 * @generated
	 * @ordered
	 */
	public static final int ADVERSE_EVENT_VALUE = 61;

	/**
	 * The '<em><b>Allergy Intolerance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AllergyIntolerance
	 * AllergyIntolerance
	 * AllergiaIntolleranza
	 * IntoléranceAllergique
	 * AllergiaIntolerancia
	 * 变态反应与不耐性
	 * <!-- end-model-doc -->
	 * @see #ALLERGY_INTOLERANCE
	 * @model name="AllergyIntolerance"
	 * @generated
	 * @ordered
	 */
	public static final int ALLERGY_INTOLERANCE_VALUE = 62;

	/**
	 * The '<em><b>Appointment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Appointment
	 * Appointment
	 * Appuntamento
	 * RendezVous
	 * Cita
	 * 预约
	 * <!-- end-model-doc -->
	 * @see #APPOINTMENT
	 * @model name="Appointment"
	 * @generated
	 * @ordered
	 */
	public static final int APPOINTMENT_VALUE = 63;

	/**
	 * The '<em><b>Appointment Response</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AppointmentResponse
	 * AppointmentResponse
	 * RispostaAppuntamento
	 * RéponseRendezVous
	 * CitaRespuesta
	 * 预约响应
	 * <!-- end-model-doc -->
	 * @see #APPOINTMENT_RESPONSE
	 * @model name="AppointmentResponse"
	 * @generated
	 * @ordered
	 */
	public static final int APPOINTMENT_RESPONSE_VALUE = 64;

	/**
	 * The '<em><b>Audit Event</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AuditEvent
	 * AuditEvent
	 * ÉvènementSécurité
	 * EventoSeguridad
	 * 审计事件
	 * <!-- end-model-doc -->
	 * @see #AUDIT_EVENT
	 * @model name="AuditEvent"
	 * @generated
	 * @ordered
	 */
	public static final int AUDIT_EVENT_VALUE = 65;

	/**
	 * The '<em><b>Basic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Basic
	 * Basic
	 * Basique
	 * Basico
	 * 初级资源
	 * <!-- end-model-doc -->
	 * @see #BASIC
	 * @model name="Basic"
	 * @generated
	 * @ordered
	 */
	public static final int BASIC_VALUE = 66;

	/**
	 * The '<em><b>Binary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Binary
	 * Binary
	 * Binario
	 * Binaire
	 * Binario
	 * 二进制资源
	 * <!-- end-model-doc -->
	 * @see #BINARY
	 * @model name="Binary"
	 * @generated
	 * @ordered
	 */
	public static final int BINARY_VALUE = 67;

	/**
	 * The '<em><b>Biologically Derived Product</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BiologicallyDerivedProduct
	 * BiologicallyDerivedProduct
	 * <!-- end-model-doc -->
	 * @see #BIOLOGICALLY_DERIVED_PRODUCT
	 * @model name="BiologicallyDerivedProduct"
	 * @generated
	 * @ordered
	 */
	public static final int BIOLOGICALLY_DERIVED_PRODUCT_VALUE = 68;

	/**
	 * The '<em><b>Body Structure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BodyStructure
	 * BodyStructure
	 * StrutturaDelCorpo
	 * MorphologieDeCorps
	 * EstructuraDelCuerpo
	 * 身体结构
	 * <!-- end-model-doc -->
	 * @see #BODY_STRUCTURE
	 * @model name="BodyStructure"
	 * @generated
	 * @ordered
	 */
	public static final int BODY_STRUCTURE_VALUE = 69;

	/**
	 * The '<em><b>Bundle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bundle
	 * Bundle
	 * Paquet
	 * Paquete
	 * 捆束
	 * <!-- end-model-doc -->
	 * @see #BUNDLE
	 * @model name="Bundle"
	 * @generated
	 * @ordered
	 */
	public static final int BUNDLE_VALUE = 70;

	/**
	 * The '<em><b>Capability Statement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CapabilityStatement
	 * CapabilityStatement
	 * DeclaracionDeCapacidad
	 * 能力声明
	 * <!-- end-model-doc -->
	 * @see #CAPABILITY_STATEMENT
	 * @model name="CapabilityStatement"
	 * @generated
	 * @ordered
	 */
	public static final int CAPABILITY_STATEMENT_VALUE = 71;

	/**
	 * The '<em><b>Care Plan</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CarePlan
	 * CarePlan
	 * PianoDiCura
	 * PlanDeSoins
	 * PlanDeCuidado
	 * 照护计划
	 * <!-- end-model-doc -->
	 * @see #CARE_PLAN
	 * @model name="CarePlan"
	 * @generated
	 * @ordered
	 */
	public static final int CARE_PLAN_VALUE = 72;

	/**
	 * The '<em><b>Care Team</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CareTeam
	 * CareTeam
	 * EquipoDeCuidado
	 * 照护团队
	 * <!-- end-model-doc -->
	 * @see #CARE_TEAM
	 * @model name="CareTeam"
	 * @generated
	 * @ordered
	 */
	public static final int CARE_TEAM_VALUE = 73;

	/**
	 * The '<em><b>Charge Item</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ChargeItem
	 * ChargeItem
	 * CargoDeItem
	 * 收费项目
	 * <!-- end-model-doc -->
	 * @see #CHARGE_ITEM
	 * @model name="ChargeItem"
	 * @generated
	 * @ordered
	 */
	public static final int CHARGE_ITEM_VALUE = 74;

	/**
	 * The '<em><b>Claim</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Claim
	 * Claim
	 * Réclamation
	 * Reclamación / Factura
	 * 赔单
	 * <!-- end-model-doc -->
	 * @see #CLAIM
	 * @model name="Claim"
	 * @generated
	 * @ordered
	 */
	public static final int CLAIM_VALUE = 75;

	/**
	 * The '<em><b>Claim Response</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ClaimResponse
	 * ClaimResponse
	 * RéponseARéclamation
	 * 赔单请求
	 * <!-- end-model-doc -->
	 * @see #CLAIM_RESPONSE
	 * @model name="ClaimResponse"
	 * @generated
	 * @ordered
	 */
	public static final int CLAIM_RESPONSE_VALUE = 76;

	/**
	 * The '<em><b>Clinical Impression</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ClinicalImpression
	 * ClinicalImpression
	 * ImpressioneClinica
	 * ImpressionClinique
	 * HallazgoClinico
	 * 临床印象
	 * <!-- end-model-doc -->
	 * @see #CLINICAL_IMPRESSION
	 * @model name="ClinicalImpression"
	 * @generated
	 * @ordered
	 */
	public static final int CLINICAL_IMPRESSION_VALUE = 77;

	/**
	 * The '<em><b>Code System</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CodeSystem
	 * CodeSystem
	 * SistemaDiCodifica
	 * SistemaDeCodigos
	 * 代码系统
	 * <!-- end-model-doc -->
	 * @see #CODE_SYSTEM
	 * @model name="CodeSystem"
	 * @generated
	 * @ordered
	 */
	public static final int CODE_SYSTEM_VALUE = 78;

	/**
	 * The '<em><b>Communication</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Communication
	 * Communication
	 * Comunicazione
	 * Communication
	 * Comunicación
	 * 通讯
	 * <!-- end-model-doc -->
	 * @see #COMMUNICATION
	 * @model name="Communication"
	 * @generated
	 * @ordered
	 */
	public static final int COMMUNICATION_VALUE = 79;

	/**
	 * The '<em><b>Communication Request</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CommunicationRequest
	 * CommunicationRequest
	 * RichiestaDiComunicazione
	 * DemandeDeCommunication
	 * ComunicaciónRequerimiento
	 * 通讯请求
	 * <!-- end-model-doc -->
	 * @see #COMMUNICATION_REQUEST
	 * @model name="CommunicationRequest"
	 * @generated
	 * @ordered
	 */
	public static final int COMMUNICATION_REQUEST_VALUE = 80;

	/**
	 * The '<em><b>Compartment Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CompartmentDefinition
	 * CompartmentDefinition
	 * DefinicionDeCompartimento
	 * 逻辑区块定义
	 * <!-- end-model-doc -->
	 * @see #COMPARTMENT_DEFINITION
	 * @model name="CompartmentDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int COMPARTMENT_DEFINITION_VALUE = 81;

	/**
	 * The '<em><b>Composition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Composition
	 * Composition
	 * Composizione
	 * Composition
	 * Composición
	 * 组合式文书
	 * <!-- end-model-doc -->
	 * @see #COMPOSITION
	 * @model name="Composition"
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITION_VALUE = 82;

	/**
	 * The '<em><b>Concept Map</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ConceptMap
	 * ConceptMap
	 * MappaDiConcetti
	 * CarteDeConcepts
	 * MapaDeConceptos
	 * 概念映射
	 * <!-- end-model-doc -->
	 * @see #CONCEPT_MAP
	 * @model name="ConceptMap"
	 * @generated
	 * @ordered
	 */
	public static final int CONCEPT_MAP_VALUE = 83;

	/**
	 * The '<em><b>Condition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Condition
	 * Condition
	 * Condizione
	 * Condition
	 * Condición
	 * 情况
	 * <!-- end-model-doc -->
	 * @see #CONDITION
	 * @model name="Condition"
	 * @generated
	 * @ordered
	 */
	public static final int CONDITION_VALUE = 84;

	/**
	 * The '<em><b>Consent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Consent
	 * Consent
	 * Consenso
	 * Consentimiento
	 * 同意书
	 * <!-- end-model-doc -->
	 * @see #CONSENT
	 * @model name="Consent"
	 * @generated
	 * @ordered
	 */
	public static final int CONSENT_VALUE = 85;

	/**
	 * The '<em><b>Contract</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contract
	 * Contract
	 * Contratto
	 * Contrat
	 * Contato
	 * 合同
	 * <!-- end-model-doc -->
	 * @see #CONTRACT
	 * @model name="Contract"
	 * @generated
	 * @ordered
	 */
	public static final int CONTRACT_VALUE = 86;

	/**
	 * The '<em><b>Coverage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Coverage
	 * Coverage
	 * Copertura
	 * Couverture
	 * Cobertura
	 * 保险责任
	 * <!-- end-model-doc -->
	 * @see #COVERAGE
	 * @model name="Coverage"
	 * @generated
	 * @ordered
	 */
	public static final int COVERAGE_VALUE = 87;

	/**
	 * The '<em><b>Detected Issue</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DetectedIssue
	 * DetectedIssue
	 * ProblemaRilevato
	 * Problème Détecté
	 * Problema-Detectado /ProblemaDetectado
	 * 已发现问题
	 * <!-- end-model-doc -->
	 * @see #DETECTED_ISSUE
	 * @model name="DetectedIssue"
	 * @generated
	 * @ordered
	 */
	public static final int DETECTED_ISSUE_VALUE = 88;

	/**
	 * The '<em><b>Device</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Device
	 * Device
	 * Dispositivo
	 * Dispositif
	 * Dispositivo
	 * 装置
	 * <!-- end-model-doc -->
	 * @see #DEVICE
	 * @model name="Device"
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_VALUE = 89;

	/**
	 * The '<em><b>Device Component</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DeviceComponent
	 * DeviceComponent
	 * ComponenteDispositivo
	 * ComposantDeDispositif
	 * ComponenteDeDispositivo
	 * 装置组件
	 * <!-- end-model-doc -->
	 * @see #DEVICE_COMPONENT
	 * @model name="DeviceComponent"
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_COMPONENT_VALUE = 90;

	/**
	 * The '<em><b>Device Metric</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DeviceMetric
	 * DeviceMetric
	 * MétriqueDispositif
	 * MetricaDeDispositivo
	 * 装置指标
	 * <!-- end-model-doc -->
	 * @see #DEVICE_METRIC
	 * @model name="DeviceMetric"
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_METRIC_VALUE = 91;

	/**
	 * The '<em><b>Device Request</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DeviceRequest
	 * DeviceRequest
	 * RichiestaDispositivo
	 * DemandeUtilisationDispositif
	 * SolicitudDeDispositivo
	 * 装置请求
	 * <!-- end-model-doc -->
	 * @see #DEVICE_REQUEST
	 * @model name="DeviceRequest"
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_REQUEST_VALUE = 92;

	/**
	 * The '<em><b>Device Use Statement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DeviceUseStatement
	 * DeviceUseStatement
	 * 装置使用声明
	 * <!-- end-model-doc -->
	 * @see #DEVICE_USE_STATEMENT
	 * @model name="DeviceUseStatement"
	 * @generated
	 * @ordered
	 */
	public static final int DEVICE_USE_STATEMENT_VALUE = 93;

	/**
	 * The '<em><b>Diagnostic Report</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DiagnosticReport
	 * DiagnosticReport
	 * RefertoDiagnostico
	 * RapportDiagnostique
	 * 诊断报告
	 * InformeDiagnostico
	 * <!-- end-model-doc -->
	 * @see #DIAGNOSTIC_REPORT
	 * @model name="DiagnosticReport"
	 * @generated
	 * @ordered
	 */
	public static final int DIAGNOSTIC_REPORT_VALUE = 94;

	/**
	 * The '<em><b>Document Manifest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DocumentManifest
	 * DocumentManifest
	 * Manifeste
	 * 文档清单
	 * ManifestoDocumento
	 * <!-- end-model-doc -->
	 * @see #DOCUMENT_MANIFEST
	 * @model name="DocumentManifest"
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT_MANIFEST_VALUE = 95;

	/**
	 * The '<em><b>Document Reference</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DocumentReference
	 * DocumentReference
	 * RiferimentoDocumento
	 * RéférenceDocument
	 * ReferenciaDocumento
	 * 文档引用
	 * <!-- end-model-doc -->
	 * @see #DOCUMENT_REFERENCE
	 * @model name="DocumentReference"
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENT_REFERENCE_VALUE = 96;

	/**
	 * The '<em><b>Domain Resource</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DomainResource
	 * DomainResource
	 * RecursoDeDominio
	 * 领域资源
	 * <!-- end-model-doc -->
	 * @see #DOMAIN_RESOURCE
	 * @model name="DomainResource"
	 * @generated
	 * @ordered
	 */
	public static final int DOMAIN_RESOURCE_VALUE = 97;

	/**
	 * The '<em><b>Eligibility Request</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EligibilityRequest
	 * EligibilityRequest
	 * RichiestaEleggibilita
	 * DemandeEligibilité
	 * 资格请求
	 * <!-- end-model-doc -->
	 * @see #ELIGIBILITY_REQUEST
	 * @model name="EligibilityRequest"
	 * @generated
	 * @ordered
	 */
	public static final int ELIGIBILITY_REQUEST_VALUE = 98;

	/**
	 * The '<em><b>Eligibility Response</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EligibilityResponse
	 * EligibilityResponse
	 * RispostaEleggibilita
	 * RéponseEligibilité
	 * 资格响应
	 * <!-- end-model-doc -->
	 * @see #ELIGIBILITY_RESPONSE
	 * @model name="EligibilityResponse"
	 * @generated
	 * @ordered
	 */
	public static final int ELIGIBILITY_RESPONSE_VALUE = 99;

	/**
	 * The '<em><b>Encounter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Encounter
	 * Encounter
	 * Venue
	 * 就医过程
	 * Encuentro
	 * <!-- end-model-doc -->
	 * @see #ENCOUNTER
	 * @model name="Encounter"
	 * @generated
	 * @ordered
	 */
	public static final int ENCOUNTER_VALUE = 100;

	/**
	 * The '<em><b>Endpoint</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Endpoint
	 * Endpoint
	 * Endpoint
	 * 端点
	 * <!-- end-model-doc -->
	 * @see #ENDPOINT
	 * @model name="Endpoint"
	 * @generated
	 * @ordered
	 */
	public static final int ENDPOINT_VALUE = 101;

	/**
	 * The '<em><b>Enrollment Request</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EnrollmentRequest
	 * EnrollmentRequest
	 * RichiestaIscrizione
	 * DemandeInscription
	 * SolicitudDeEnrolamiento
	 * 保险注册请求
	 * <!-- end-model-doc -->
	 * @see #ENROLLMENT_REQUEST
	 * @model name="EnrollmentRequest"
	 * @generated
	 * @ordered
	 */
	public static final int ENROLLMENT_REQUEST_VALUE = 102;

	/**
	 * The '<em><b>Enrollment Response</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EnrollmentResponse
	 * EnrollmentResponse
	 * RispostaIscrizione
	 * RéponseInscription
	 * RespuestaDeEnrolamiento
	 * 保险注册响应
	 * <!-- end-model-doc -->
	 * @see #ENROLLMENT_RESPONSE
	 * @model name="EnrollmentResponse"
	 * @generated
	 * @ordered
	 */
	public static final int ENROLLMENT_RESPONSE_VALUE = 103;

	/**
	 * The '<em><b>Entry Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EntryDefinition
	 * EntryDefinition
	 * DefinicionDeEntrada
	 * 条目定义
	 * <!-- end-model-doc -->
	 * @see #ENTRY_DEFINITION
	 * @model name="EntryDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int ENTRY_DEFINITION_VALUE = 104;

	/**
	 * The '<em><b>Episode Of Care</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EpisodeOfCare
	 * EpisodeOfCare
	 * EpisodioDiCura
	 * ÉpisodeDeSoins
	 * EpisodioDeCuidado
	 * 照护服务节段
	 * <!-- end-model-doc -->
	 * @see #EPISODE_OF_CARE
	 * @model name="EpisodeOfCare"
	 * @generated
	 * @ordered
	 */
	public static final int EPISODE_OF_CARE_VALUE = 105;

	/**
	 * The '<em><b>Event Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EventDefinition
	 * EventDefinition
	 * DefinizioneEvento
	 * DefinitionDeEvento
	 * 事件定义
	 * <!-- end-model-doc -->
	 * @see #EVENT_DEFINITION
	 * @model name="EventDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int EVENT_DEFINITION_VALUE = 106;

	/**
	 * The '<em><b>Example Scenario</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ExampleScenario
	 * ExampleScenario
	 * ScenarioDiEsempio
	 * EjemploDeEscenario
	 * 示例场景
	 * <!-- end-model-doc -->
	 * @see #EXAMPLE_SCENARIO
	 * @model name="ExampleScenario"
	 * @generated
	 * @ordered
	 */
	public static final int EXAMPLE_SCENARIO_VALUE = 107;

	/**
	 * The '<em><b>Expansion Profile</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ExpansionProfile
	 * ExpansionProfile
	 * ProfiloDiEspansione
	 * PerfilDeExpansion
	 * 展开形式补充规范
	 * <!-- end-model-doc -->
	 * @see #EXPANSION_PROFILE
	 * @model name="ExpansionProfile"
	 * @generated
	 * @ordered
	 */
	public static final int EXPANSION_PROFILE_VALUE = 108;

	/**
	 * The '<em><b>Explanation Of Benefit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ExplanationOfBenefit
	 * ExplanationOfBenefit
	 * ExplicationDuBénéfice
	 * 赔付说明
	 * <!-- end-model-doc -->
	 * @see #EXPLANATION_OF_BENEFIT
	 * @model name="ExplanationOfBenefit"
	 * @generated
	 * @ordered
	 */
	public static final int EXPLANATION_OF_BENEFIT_VALUE = 109;

	/**
	 * The '<em><b>Family Member History</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * FamilyMemberHistory
	 * FamilyMemberHistory
	 * HistoireMembreFamille
	 * HistorialMiembroFamiliar
	 * 家族史
	 * <!-- end-model-doc -->
	 * @see #FAMILY_MEMBER_HISTORY
	 * @model name="FamilyMemberHistory"
	 * @generated
	 * @ordered
	 */
	public static final int FAMILY_MEMBER_HISTORY_VALUE = 110;

	/**
	 * The '<em><b>Flag</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Flag
	 * Flag
	 * Drapeau
	 * Bandera
	 * 标记
	 * <!-- end-model-doc -->
	 * @see #FLAG
	 * @model name="Flag"
	 * @generated
	 * @ordered
	 */
	public static final int FLAG_VALUE = 111;

	/**
	 * The '<em><b>Goal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Goal
	 * Goal
	 * But
	 * Objetivo
	 * 目标
	 * <!-- end-model-doc -->
	 * @see #GOAL
	 * @model name="Goal"
	 * @generated
	 * @ordered
	 */
	public static final int GOAL_VALUE = 112;

	/**
	 * The '<em><b>Graph Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GraphDefinition
	 * GraphDefinition
	 * DefinitionGrafico
	 * 图形定义
	 * <!-- end-model-doc -->
	 * @see #GRAPH_DEFINITION
	 * @model name="GraphDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int GRAPH_DEFINITION_VALUE = 113;

	/**
	 * The '<em><b>Group</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Group
	 * Group
	 * Gruppo
	 * Groupe
	 * Grupo
	 * 群组
	 * <!-- end-model-doc -->
	 * @see #GROUP
	 * @model name="Group"
	 * @generated
	 * @ordered
	 */
	public static final int GROUP_VALUE = 114;

	/**
	 * The '<em><b>Guidance Response</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GuidanceResponse
	 * GuidanceResponse
	 * RespuestaDeOrientacion
	 * 指导意见响应
	 * <!-- end-model-doc -->
	 * @see #GUIDANCE_RESPONSE
	 * @model name="GuidanceResponse"
	 * @generated
	 * @ordered
	 */
	public static final int GUIDANCE_RESPONSE_VALUE = 115;

	/**
	 * The '<em><b>Healthcare Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * HealthcareService
	 * HealthcareService
	 * ServizioSanitario
	 * ServiceDeSanté
	 * ServicioDeCuidado
	 * 医疗保健服务项目
	 * <!-- end-model-doc -->
	 * @see #HEALTHCARE_SERVICE
	 * @model name="HealthcareService"
	 * @generated
	 * @ordered
	 */
	public static final int HEALTHCARE_SERVICE_VALUE = 116;

	/**
	 * The '<em><b>Imaging Study</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ImagingStudy
	 * ImagingStudy
	 * EtudeImagerie
	 * EstudioImagen  / EstudioImagen
	 * 成像检查
	 * <!-- end-model-doc -->
	 * @see #IMAGING_STUDY
	 * @model name="ImagingStudy"
	 * @generated
	 * @ordered
	 */
	public static final int IMAGING_STUDY_VALUE = 117;

	/**
	 * The '<em><b>Immunization</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Immunization
	 * Immunization
	 * Immunizzazione
	 * Immunisation
	 * 免疫接种
	 * Inmunización
	 * <!-- end-model-doc -->
	 * @see #IMMUNIZATION
	 * @model name="Immunization"
	 * @generated
	 * @ordered
	 */
	public static final int IMMUNIZATION_VALUE = 118;

	/**
	 * The '<em><b>Immunization Evaluation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ImmunizationEvaluation
	 * ImmunizationEvaluation
	 * <!-- end-model-doc -->
	 * @see #IMMUNIZATION_EVALUATION
	 * @model name="ImmunizationEvaluation"
	 * @generated
	 * @ordered
	 */
	public static final int IMMUNIZATION_EVALUATION_VALUE = 119;

	/**
	 * The '<em><b>Immunization Recommendation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ImmunizationRecommendation
	 * ImmunizationRecommendation
	 * RecommendationImmunisation
	 * 免疫接种建议
	 * RecomendaciónInmunización /
	 * <!-- end-model-doc -->
	 * @see #IMMUNIZATION_RECOMMENDATION
	 * @model name="ImmunizationRecommendation"
	 * @generated
	 * @ordered
	 */
	public static final int IMMUNIZATION_RECOMMENDATION_VALUE = 120;

	/**
	 * The '<em><b>Implementation Guide</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ImplementationGuide
	 * ImplementationGuide
	 * GuiaDeImplementacion
	 * 实施指南
	 * <!-- end-model-doc -->
	 * @see #IMPLEMENTATION_GUIDE
	 * @model name="ImplementationGuide"
	 * @generated
	 * @ordered
	 */
	public static final int IMPLEMENTATION_GUIDE_VALUE = 121;

	/**
	 * The '<em><b>Implementation Guide Input</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ImplementationGuideInput
	 * ImplementationGuideInput
	 * GuiaDeImplementacionEntrada
	 * 实施指南输入
	 * <!-- end-model-doc -->
	 * @see #IMPLEMENTATION_GUIDE_INPUT
	 * @model name="ImplementationGuideInput"
	 * @generated
	 * @ordered
	 */
	public static final int IMPLEMENTATION_GUIDE_INPUT_VALUE = 122;

	/**
	 * The '<em><b>Implementation Guide Output</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ImplementationGuideOutput
	 * ImplementationGuideOutput
	 * GuiaDeImplementacionSalida
	 * 实施指南输出
	 * <!-- end-model-doc -->
	 * @see #IMPLEMENTATION_GUIDE_OUTPUT
	 * @model name="ImplementationGuideOutput"
	 * @generated
	 * @ordered
	 */
	public static final int IMPLEMENTATION_GUIDE_OUTPUT_VALUE = 123;

	/**
	 * The '<em><b>Invoice</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Invoice
	 * Invoice
	 * <!-- end-model-doc -->
	 * @see #INVOICE
	 * @model name="Invoice"
	 * @generated
	 * @ordered
	 */
	public static final int INVOICE_VALUE = 124;

	/**
	 * The '<em><b>Item Instance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ItemInstance
	 * ItemInstance
	 * <!-- end-model-doc -->
	 * @see #ITEM_INSTANCE
	 * @model name="ItemInstance"
	 * @generated
	 * @ordered
	 */
	public static final int ITEM_INSTANCE_VALUE = 125;

	/**
	 * The '<em><b>Library</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Library
	 * Library
	 * Librería
	 * 库
	 * <!-- end-model-doc -->
	 * @see #LIBRARY
	 * @model name="Library"
	 * @generated
	 * @ordered
	 */
	public static final int LIBRARY_VALUE = 126;

	/**
	 * The '<em><b>Linkage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Linkage
	 * Linkage
	 * Enlace / Conexión / Vinculo / Acoplamiento 
	 * 链接关系
	 * <!-- end-model-doc -->
	 * @see #LINKAGE
	 * @model name="Linkage"
	 * @generated
	 * @ordered
	 */
	public static final int LINKAGE_VALUE = 127;

	/**
	 * The '<em><b>List</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List
	 * List
	 * Lista
	 * Liste
	 * 列表
	 * Lista
	 * <!-- end-model-doc -->
	 * @see #LIST
	 * @model name="List"
	 * @generated
	 * @ordered
	 */
	public static final int LIST_VALUE = 128;

	/**
	 * The '<em><b>Location</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Location
	 * Location
	 * Localisation
	 * 位置
	 * Locacion
	 * <!-- end-model-doc -->
	 * @see #LOCATION
	 * @model name="Location"
	 * @generated
	 * @ordered
	 */
	public static final int LOCATION_VALUE = 129;

	/**
	 * The '<em><b>Measure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Measure
	 * Measure
	 * Misura
	 * Medida
	 * 指标
	 * <!-- end-model-doc -->
	 * @see #MEASURE
	 * @model name="Measure"
	 * @generated
	 * @ordered
	 */
	public static final int MEASURE_VALUE = 130;

	/**
	 * The '<em><b>Measure Report</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MeasureReport
	 * MeasureReport
	 * ReporteMedida
	 * 指标报告
	 * <!-- end-model-doc -->
	 * @see #MEASURE_REPORT
	 * @model name="MeasureReport"
	 * @generated
	 * @ordered
	 */
	public static final int MEASURE_REPORT_VALUE = 131;

	/**
	 * The '<em><b>Media</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Media
	 * Media
	 * Media
	 * Média
	 * Medio
	 * 媒体
	 * <!-- end-model-doc -->
	 * @see #MEDIA
	 * @model name="Media"
	 * @generated
	 * @ordered
	 */
	public static final int MEDIA_VALUE = 132;

	/**
	 * The '<em><b>Medication</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Medication
	 * Medication
	 * Médication
	 * 药物
	 * Medicación /Medicamento
	 * <!-- end-model-doc -->
	 * @see #MEDICATION
	 * @model name="Medication"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICATION_VALUE = 133;

	/**
	 * The '<em><b>Medication Administration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicationAdministration
	 * MedicationAdministration
	 * AdministrationMédicaments
	 * 药物施用
	 * AdministraciónMedicación / AdministracionMedicamento
	 * <!-- end-model-doc -->
	 * @see #MEDICATION_ADMINISTRATION
	 * @model name="MedicationAdministration"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICATION_ADMINISTRATION_VALUE = 134;

	/**
	 * The '<em><b>Medication Dispense</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicationDispense
	 * MedicationDispense
	 * DispensationMédicaments
	 * 药物配发
	 * DispensaciónMedicación /DispensacionMedicamento
	 * <!-- end-model-doc -->
	 * @see #MEDICATION_DISPENSE
	 * @model name="MedicationDispense"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICATION_DISPENSE_VALUE = 135;

	/**
	 * The '<em><b>Medication Request</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicationRequest
	 * MedicationRequest
	 * PrescriptionMédicamenteuseTODO
	 * 药物请求
	 * PrescripciónMedicaciónTODO  /PrescripcionMedicamento
	 * <!-- end-model-doc -->
	 * @see #MEDICATION_REQUEST
	 * @model name="MedicationRequest"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICATION_REQUEST_VALUE = 136;

	/**
	 * The '<em><b>Medication Statement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicationStatement
	 * MedicationStatement
	 * ÉtatMédication
	 * 药物声明
	 * ResumenMedicación /ResumenMedicamento
	 * <!-- end-model-doc -->
	 * @see #MEDICATION_STATEMENT
	 * @model name="MedicationStatement"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICATION_STATEMENT_VALUE = 137;

	/**
	 * The '<em><b>Medicinal Product</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicinalProduct
	 * MedicinalProduct
	 * ProdottoMedicinale
	 * <!-- end-model-doc -->
	 * @see #MEDICINAL_PRODUCT
	 * @model name="MedicinalProduct"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICINAL_PRODUCT_VALUE = 138;

	/**
	 * The '<em><b>Medicinal Product Authorization</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicinalProductAuthorization
	 * MedicinalProductAuthorization
	 * AutorizzazioneProdottoMedicinale
	 * <!-- end-model-doc -->
	 * @see #MEDICINAL_PRODUCT_AUTHORIZATION
	 * @model name="MedicinalProductAuthorization"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICINAL_PRODUCT_AUTHORIZATION_VALUE = 139;

	/**
	 * The '<em><b>Medicinal Product Clinicals</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicinalProductClinicals
	 * MedicinalProductClinicals
	 * <!-- end-model-doc -->
	 * @see #MEDICINAL_PRODUCT_CLINICALS
	 * @model name="MedicinalProductClinicals"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICINAL_PRODUCT_CLINICALS_VALUE = 140;

	/**
	 * The '<em><b>Medicinal Product Device Spec</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicinalProductDeviceSpec
	 * MedicinalProductDeviceSpec
	 * <!-- end-model-doc -->
	 * @see #MEDICINAL_PRODUCT_DEVICE_SPEC
	 * @model name="MedicinalProductDeviceSpec"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICINAL_PRODUCT_DEVICE_SPEC_VALUE = 141;

	/**
	 * The '<em><b>Medicinal Product Ingredient</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicinalProductIngredient
	 * MedicinalProductIngredient
	 * IngredienteProdottoMedicinale
	 * <!-- end-model-doc -->
	 * @see #MEDICINAL_PRODUCT_INGREDIENT
	 * @model name="MedicinalProductIngredient"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICINAL_PRODUCT_INGREDIENT_VALUE = 142;

	/**
	 * The '<em><b>Medicinal Product Packaged</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicinalProductPackaged
	 * MedicinalProductPackaged
	 * <!-- end-model-doc -->
	 * @see #MEDICINAL_PRODUCT_PACKAGED
	 * @model name="MedicinalProductPackaged"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICINAL_PRODUCT_PACKAGED_VALUE = 143;

	/**
	 * The '<em><b>Medicinal Product Pharmaceutical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MedicinalProductPharmaceutical
	 * MedicinalProductPharmaceutical
	 * <!-- end-model-doc -->
	 * @see #MEDICINAL_PRODUCT_PHARMACEUTICAL
	 * @model name="MedicinalProductPharmaceutical"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICINAL_PRODUCT_PHARMACEUTICAL_VALUE = 144;

	/**
	 * The '<em><b>Message Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MessageDefinition
	 * MessageDefinition
	 * DefinizioneMessaggio
	 * DefinicionMensaje
	 * 消息定义
	 * <!-- end-model-doc -->
	 * @see #MESSAGE_DEFINITION
	 * @model name="MessageDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int MESSAGE_DEFINITION_VALUE = 145;

	/**
	 * The '<em><b>Message Header</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MessageHeader
	 * MessageHeader
	 * EntêteMessage
	 * 消息标头
	 * CabeceraMensaje
	 * <!-- end-model-doc -->
	 * @see #MESSAGE_HEADER
	 * @model name="MessageHeader"
	 * @generated
	 * @ordered
	 */
	public static final int MESSAGE_HEADER_VALUE = 146;

	/**
	 * The '<em><b>Naming System</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NamingSystem
	 * NamingSystem
	 * SystèmeDeNommage
	 * SistemaDeNombres
	 * 命名系统
	 * <!-- end-model-doc -->
	 * @see #NAMING_SYSTEM
	 * @model name="NamingSystem"
	 * @generated
	 * @ordered
	 */
	public static final int NAMING_SYSTEM_VALUE = 147;

	/**
	 * The '<em><b>Nutrition Order</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NutritionOrder
	 * NutritionOrder
	 * OrdreNutrition
	 * OrdenNutrición
	 * 营养医嘱
	 * <!-- end-model-doc -->
	 * @see #NUTRITION_ORDER
	 * @model name="NutritionOrder"
	 * @generated
	 * @ordered
	 */
	public static final int NUTRITION_ORDER_VALUE = 148;

	/**
	 * The '<em><b>Observation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Observation
	 * Observation
	 * Osservazione
	 * Observation
	 * 观察
	 * Observación
	 * <!-- end-model-doc -->
	 * @see #OBSERVATION
	 * @model name="Observation"
	 * @generated
	 * @ordered
	 */
	public static final int OBSERVATION_VALUE = 149;

	/**
	 * The '<em><b>Observation Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ObservationDefinition
	 * ObservationDefinition
	 * DefinizioneOsservazione
	 * DefinicionDeEspecimen
	 * 观察定义
	 * <!-- end-model-doc -->
	 * @see #OBSERVATION_DEFINITION
	 * @model name="ObservationDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int OBSERVATION_DEFINITION_VALUE = 150;

	/**
	 * The '<em><b>Occupational Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OccupationalData
	 * OccupationalData
	 * <!-- end-model-doc -->
	 * @see #OCCUPATIONAL_DATA
	 * @model name="OccupationalData"
	 * @generated
	 * @ordered
	 */
	public static final int OCCUPATIONAL_DATA_VALUE = 151;

	/**
	 * The '<em><b>Operation Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OperationDefinition
	 * OperationDefinition
	 * DefinizioneOperazione
	 * DéfinitionOpération
	 * DefinicionDeOperacion
	 * 操作定义
	 * <!-- end-model-doc -->
	 * @see #OPERATION_DEFINITION
	 * @model name="OperationDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int OPERATION_DEFINITION_VALUE = 152;

	/**
	 * The '<em><b>Operation Outcome</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OperationOutcome
	 * OperationOutcome
	 * RisultatoOperazione
	 * RésultatOpération
	 * 操作结局
	 * ResultadoOperación
	 * <!-- end-model-doc -->
	 * @see #OPERATION_OUTCOME
	 * @model name="OperationOutcome"
	 * @generated
	 * @ordered
	 */
	public static final int OPERATION_OUTCOME_VALUE = 153;

	/**
	 * The '<em><b>Organization</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Organization
	 * Organization
	 * Organizzazione
	 * Organisation
	 * 组织机构
	 * Organización
	 * <!-- end-model-doc -->
	 * @see #ORGANIZATION
	 * @model name="Organization"
	 * @generated
	 * @ordered
	 */
	public static final int ORGANIZATION_VALUE = 154;

	/**
	 * The '<em><b>Organization Role</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OrganizationRole
	 * OrganizationRole
	 * <!-- end-model-doc -->
	 * @see #ORGANIZATION_ROLE
	 * @model name="OrganizationRole"
	 * @generated
	 * @ordered
	 */
	public static final int ORGANIZATION_ROLE_VALUE = 155;

	/**
	 * The '<em><b>Parameters</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parameters
	 * Parameters
	 * Parametros
	 * 参数
	 * <!-- end-model-doc -->
	 * @see #PARAMETERS
	 * @model name="Parameters"
	 * @generated
	 * @ordered
	 */
	public static final int PARAMETERS_VALUE = 156;

	/**
	 * The '<em><b>Patient</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Patient
	 * Patient
	 * Paziente
	 * Patient
	 * 患者
	 * Paciente
	 * <!-- end-model-doc -->
	 * @see #PATIENT
	 * @model name="Patient"
	 * @generated
	 * @ordered
	 */
	public static final int PATIENT_VALUE = 157;

	/**
	 * The '<em><b>Payment Notice</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PaymentNotice
	 * PaymentNotice
	 * AvvisoDiPagamento
	 * AvisPaiement
	 * AvisoDePago
	 * 付款通知
	 * <!-- end-model-doc -->
	 * @see #PAYMENT_NOTICE
	 * @model name="PaymentNotice"
	 * @generated
	 * @ordered
	 */
	public static final int PAYMENT_NOTICE_VALUE = 158;

	/**
	 * The '<em><b>Payment Reconciliation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PaymentReconciliation
	 * PaymentReconciliation
	 * RiconciliazionePagamento
	 * RéconciliationPaiement
	 * ConciliacionDePago
	 * 付款对账
	 * <!-- end-model-doc -->
	 * @see #PAYMENT_RECONCILIATION
	 * @model name="PaymentReconciliation"
	 * @generated
	 * @ordered
	 */
	public static final int PAYMENT_RECONCILIATION_VALUE = 159;

	/**
	 * The '<em><b>Person</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Person
	 * Person
	 * Persona
	 * Personne
	 * Persona
	 * 人员
	 * <!-- end-model-doc -->
	 * @see #PERSON
	 * @model name="Person"
	 * @generated
	 * @ordered
	 */
	public static final int PERSON_VALUE = 160;

	/**
	 * The '<em><b>Plan Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PlanDefinition
	 * PlanDefinition
	 * DefinicionDePlan
	 * 计划定义
	 * <!-- end-model-doc -->
	 * @see #PLAN_DEFINITION
	 * @model name="PlanDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int PLAN_DEFINITION_VALUE = 161;

	/**
	 * The '<em><b>Practitioner</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Practitioner
	 * Practitioner
	 * Praticien
	 * 执业人员
	 * Practicante / Profesional
	 * <!-- end-model-doc -->
	 * @see #PRACTITIONER
	 * @model name="Practitioner"
	 * @generated
	 * @ordered
	 */
	public static final int PRACTITIONER_VALUE = 162;

	/**
	 * The '<em><b>Practitioner Role</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PractitionerRole
	 * PractitionerRole
	 * RolProfesional
	 * 执业人员角色
	 * <!-- end-model-doc -->
	 * @see #PRACTITIONER_ROLE
	 * @model name="PractitionerRole"
	 * @generated
	 * @ordered
	 */
	public static final int PRACTITIONER_ROLE_VALUE = 163;

	/**
	 * The '<em><b>Procedure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Procedure
	 * Procedure
	 * Procedura
	 * Procédure
	 * 操作项目
	 * Procedimiento
	 * <!-- end-model-doc -->
	 * @see #PROCEDURE
	 * @model name="Procedure"
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE_VALUE = 164;

	/**
	 * The '<em><b>Process Request</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ProcessRequest
	 * ProcessRequest
	 * RichiestaProcesso
	 * DemandeProcessus
	 * SolicitudDeProceso
	 * 处理请求
	 * <!-- end-model-doc -->
	 * @see #PROCESS_REQUEST
	 * @model name="ProcessRequest"
	 * @generated
	 * @ordered
	 */
	public static final int PROCESS_REQUEST_VALUE = 165;

	/**
	 * The '<em><b>Process Response</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ProcessResponse
	 * ProcessResponse
	 * RispostaProcesso
	 * RéponseProcessus
	 * RespuestaDeProceso
	 * 处理响应
	 * <!-- end-model-doc -->
	 * @see #PROCESS_RESPONSE
	 * @model name="ProcessResponse"
	 * @generated
	 * @ordered
	 */
	public static final int PROCESS_RESPONSE_VALUE = 166;

	/**
	 * The '<em><b>Product Plan</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ProductPlan
	 * ProductPlan
	 * <!-- end-model-doc -->
	 * @see #PRODUCT_PLAN
	 * @model name="ProductPlan"
	 * @generated
	 * @ordered
	 */
	public static final int PRODUCT_PLAN_VALUE = 167;

	/**
	 * The '<em><b>Provenance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provenance
	 * Provenance
	 * Provenienza
	 * Provenance
	 * 出处
	 * Procedencia
	 * <!-- end-model-doc -->
	 * @see #PROVENANCE
	 * @model name="Provenance"
	 * @generated
	 * @ordered
	 */
	public static final int PROVENANCE_VALUE = 168;

	/**
	 * The '<em><b>Questionnaire</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Questionnaire
	 * Questionnaire
	 * Questionario
	 * Questionnaire
	 * 调查问卷
	 * Cuestionario
	 * <!-- end-model-doc -->
	 * @see #QUESTIONNAIRE
	 * @model name="Questionnaire"
	 * @generated
	 * @ordered
	 */
	public static final int QUESTIONNAIRE_VALUE = 169;

	/**
	 * The '<em><b>Questionnaire Response</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * QuestionnaireResponse
	 * QuestionnaireResponse
	 * RispostaQuestionario
	 * RéponseQuestionnaire
	 * RespuestaAlCuestionario
	 * 调查问卷答复
	 * <!-- end-model-doc -->
	 * @see #QUESTIONNAIRE_RESPONSE
	 * @model name="QuestionnaireResponse"
	 * @generated
	 * @ordered
	 */
	public static final int QUESTIONNAIRE_RESPONSE_VALUE = 170;

	/**
	 * The '<em><b>Related Person</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RelatedPerson
	 * RelatedPerson
	 * PersonaCorrelata
	 * PersonneEnRelation
	 * PersonaRelacionada
	 * 相关人员
	 * <!-- end-model-doc -->
	 * @see #RELATED_PERSON
	 * @model name="RelatedPerson"
	 * @generated
	 * @ordered
	 */
	public static final int RELATED_PERSON_VALUE = 171;

	/**
	 * The '<em><b>Request Group</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RequestGroup
	 * RequestGroup
	 * GruppoDiRichieste
	 * GrupoDeSolicitudes
	 * 请求分组
	 * <!-- end-model-doc -->
	 * @see #REQUEST_GROUP
	 * @model name="RequestGroup"
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST_GROUP_VALUE = 172;

	/**
	 * The '<em><b>Research Study</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ResearchStudy
	 * ResearchStudy
	 * EstudioDeInvestigacion
	 * 调查研究
	 * <!-- end-model-doc -->
	 * @see #RESEARCH_STUDY
	 * @model name="ResearchStudy"
	 * @generated
	 * @ordered
	 */
	public static final int RESEARCH_STUDY_VALUE = 173;

	/**
	 * The '<em><b>Research Subject</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ResearchSubject
	 * ResearchSubject
	 * SujetoDeInvestigacion
	 * 研究主题
	 * <!-- end-model-doc -->
	 * @see #RESEARCH_SUBJECT
	 * @model name="ResearchSubject"
	 * @generated
	 * @ordered
	 */
	public static final int RESEARCH_SUBJECT_VALUE = 174;

	/**
	 * The '<em><b>Resource</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resource
	 * Resource
	 * Recurso
	 * 资源
	 * <!-- end-model-doc -->
	 * @see #RESOURCE
	 * @model name="Resource"
	 * @generated
	 * @ordered
	 */
	public static final int RESOURCE_VALUE = 175;

	/**
	 * The '<em><b>Risk Assessment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RiskAssessment
	 * RiskAssessment
	 * ÉvaluationRisques
	 * EvaluacionDeRiesgo
	 * 风险评估
	 * <!-- end-model-doc -->
	 * @see #RISK_ASSESSMENT
	 * @model name="RiskAssessment"
	 * @generated
	 * @ordered
	 */
	public static final int RISK_ASSESSMENT_VALUE = 176;

	/**
	 * The '<em><b>Schedule</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Schedule
	 * Schedule
	 * Agenda
	 * 日程安排
	 * <!-- end-model-doc -->
	 * @see #SCHEDULE
	 * @model name="Schedule"
	 * @generated
	 * @ordered
	 */
	public static final int SCHEDULE_VALUE = 177;

	/**
	 * The '<em><b>Search Parameter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SearchParameter
	 * SearchParameter
	 * ParametroDiRicerca
	 * ParamètreRecherche
	 * ParametroDeBusqueda
	 * 搜索参数
	 * <!-- end-model-doc -->
	 * @see #SEARCH_PARAMETER
	 * @model name="SearchParameter"
	 * @generated
	 * @ordered
	 */
	public static final int SEARCH_PARAMETER_VALUE = 178;

	/**
	 * The '<em><b>Sequence</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sequence
	 * Sequence
	 * Secuencia
	 * 序列
	 * <!-- end-model-doc -->
	 * @see #SEQUENCE
	 * @model name="Sequence"
	 * @generated
	 * @ordered
	 */
	public static final int SEQUENCE_VALUE = 179;

	/**
	 * The '<em><b>Service Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ServiceDefinition
	 * ServiceDefinition
	 * DefinicionDeServicio
	 * 服务项目定义
	 * <!-- end-model-doc -->
	 * @see #SERVICE_DEFINITION
	 * @model name="ServiceDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_DEFINITION_VALUE = 180;

	/**
	 * The '<em><b>Service Request</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ServiceRequest
	 * ServiceRequest
	 * RichiestaDiServizio
	 * DemandeService
	 * PeticiónServicio
	 * 服务项目请求
	 * <!-- end-model-doc -->
	 * @see #SERVICE_REQUEST
	 * @model name="ServiceRequest"
	 * @generated
	 * @ordered
	 */
	public static final int SERVICE_REQUEST_VALUE = 181;

	/**
	 * The '<em><b>Slot</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Slot
	 * Slot
	 * Slot
	 * 槽位
	 * Hueco / Zocalo / Espacio
	 * <!-- end-model-doc -->
	 * @see #SLOT
	 * @model name="Slot"
	 * @generated
	 * @ordered
	 */
	public static final int SLOT_VALUE = 182;

	/**
	 * The '<em><b>Specimen</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specimen
	 * Specimen
	 * Campione
	 * Spécimen
	 * 标本
	 * Especimen
	 * <!-- end-model-doc -->
	 * @see #SPECIMEN
	 * @model name="Specimen"
	 * @generated
	 * @ordered
	 */
	public static final int SPECIMEN_VALUE = 183;

	/**
	 * The '<em><b>Specimen Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SpecimenDefinition
	 * SpecimenDefinition
	 * DefinizioneCampione
	 * DefinicionDeEspecimen
	 * 标本定义
	 * <!-- end-model-doc -->
	 * @see #SPECIMEN_DEFINITION
	 * @model name="SpecimenDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int SPECIMEN_DEFINITION_VALUE = 184;

	/**
	 * The '<em><b>Structure Definition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * StructureDefinition
	 * StructureDefinition
	 * DefinizioneStruttura
	 * DéfinitionStructure
	 * DefinicionDeEstructura
	 * 结构定义
	 * <!-- end-model-doc -->
	 * @see #STRUCTURE_DEFINITION
	 * @model name="StructureDefinition"
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_DEFINITION_VALUE = 185;

	/**
	 * The '<em><b>Structure Map</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * StructureMap
	 * StructureMap
	 * MapaDeEstructura
	 * 结构映射
	 * <!-- end-model-doc -->
	 * @see #STRUCTURE_MAP
	 * @model name="StructureMap"
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_MAP_VALUE = 186;

	/**
	 * The '<em><b>Subscription</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Subscription
	 * Subscription
	 * Sottoscrizione
	 * Souscription
	 * 订阅
	 * Suscripción
	 * <!-- end-model-doc -->
	 * @see #SUBSCRIPTION
	 * @model name="Subscription"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSCRIPTION_VALUE = 187;

	/**
	 * The '<em><b>Substance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Substance
	 * Substance
	 * Sostanza
	 * Substance
	 * 物质
	 * Sustancia
	 * <!-- end-model-doc -->
	 * @see #SUBSTANCE
	 * @model name="Substance"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTANCE_VALUE = 188;

	/**
	 * The '<em><b>Substance Polymer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SubstancePolymer
	 * SubstancePolymer
	 * <!-- end-model-doc -->
	 * @see #SUBSTANCE_POLYMER
	 * @model name="SubstancePolymer"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTANCE_POLYMER_VALUE = 189;

	/**
	 * The '<em><b>Substance Reference Information</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SubstanceReferenceInformation
	 * SubstanceReferenceInformation
	 * <!-- end-model-doc -->
	 * @see #SUBSTANCE_REFERENCE_INFORMATION
	 * @model name="SubstanceReferenceInformation"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTANCE_REFERENCE_INFORMATION_VALUE = 190;

	/**
	 * The '<em><b>Substance Specification</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SubstanceSpecification
	 * SubstanceSpecification
	 * <!-- end-model-doc -->
	 * @see #SUBSTANCE_SPECIFICATION
	 * @model name="SubstanceSpecification"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTANCE_SPECIFICATION_VALUE = 191;

	/**
	 * The '<em><b>Supply Delivery</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SupplyDelivery
	 * SupplyDelivery
	 * Supply Livraison
	 * 供应交付
	 * Entrega de Suministro
	 * <!-- end-model-doc -->
	 * @see #SUPPLY_DELIVERY
	 * @model name="SupplyDelivery"
	 * @generated
	 * @ordered
	 */
	public static final int SUPPLY_DELIVERY_VALUE = 192;

	/**
	 * The '<em><b>Supply Request</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SupplyRequest
	 * SupplyRequest
	 * Demande d'approvisionnement
	 * 供应请求
	 * Solicitud de Suministro
	 * <!-- end-model-doc -->
	 * @see #SUPPLY_REQUEST
	 * @model name="SupplyRequest"
	 * @generated
	 * @ordered
	 */
	public static final int SUPPLY_REQUEST_VALUE = 193;

	/**
	 * The '<em><b>Task</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Task
	 * Task
	 * Tarea
	 * 任务
	 * <!-- end-model-doc -->
	 * @see #TASK
	 * @model name="Task"
	 * @generated
	 * @ordered
	 */
	public static final int TASK_VALUE = 194;

	/**
	 * The '<em><b>Terminology Capabilities</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TerminologyCapabilities
	 * TerminologyCapabilities
	 * CapacidadTerminologica
	 * 术语服务能力
	 * <!-- end-model-doc -->
	 * @see #TERMINOLOGY_CAPABILITIES
	 * @model name="TerminologyCapabilities"
	 * @generated
	 * @ordered
	 */
	public static final int TERMINOLOGY_CAPABILITIES_VALUE = 195;

	/**
	 * The '<em><b>Test Report</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TestReport
	 * TestReport
	 * RapportTest
	 * ReporteDePrueba
	 * 测试报告
	 * <!-- end-model-doc -->
	 * @see #TEST_REPORT
	 * @model name="TestReport"
	 * @generated
	 * @ordered
	 */
	public static final int TEST_REPORT_VALUE = 196;

	/**
	 * The '<em><b>Test Script</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TestScript
	 * TestScript
	 * ScriptTest
	 * ScriptDePrueba
	 * 测试脚本
	 * <!-- end-model-doc -->
	 * @see #TEST_SCRIPT
	 * @model name="TestScript"
	 * @generated
	 * @ordered
	 */
	public static final int TEST_SCRIPT_VALUE = 197;

	/**
	 * The '<em><b>User Session</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * UserSession
	 * UserSession
	 * SessioneUtente
	 * SesionDeUsuario
	 * 用户会话
	 * <!-- end-model-doc -->
	 * @see #USER_SESSION
	 * @model name="UserSession"
	 * @generated
	 * @ordered
	 */
	public static final int USER_SESSION_VALUE = 198;

	/**
	 * The '<em><b>Value Set</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ValueSet
	 * ValueSet
	 * EnsembleValeurs
	 * 取值集合
	 * ConjuntoValores / ConjuntoDeValores
	 * <!-- end-model-doc -->
	 * @see #VALUE_SET
	 * @model name="ValueSet"
	 * @generated
	 * @ordered
	 */
	public static final int VALUE_SET_VALUE = 199;

	/**
	 * The '<em><b>Verification Result</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * VerificationResult
	 * VerificationResult
	 * <!-- end-model-doc -->
	 * @see #VERIFICATION_RESULT
	 * @model name="VerificationResult"
	 * @generated
	 * @ordered
	 */
	public static final int VERIFICATION_RESULT_VALUE = 200;

	/**
	 * The '<em><b>Vision Prescription</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * VisionPrescription
	 * VisionPrescription
	 * PrescriptionVision
	 * PrescripcionDeVision
	 * 视力处方
	 * <!-- end-model-doc -->
	 * @see #VISION_PRESCRIPTION
	 * @model name="VisionPrescription"
	 * @generated
	 * @ordered
	 */
	public static final int VISION_PRESCRIPTION_VALUE = 201;

	/**
	 * The '<em><b>Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type
	 * <!-- end-model-doc -->
	 * @see #TYPE
	 * @model name="Type"
	 * @generated
	 * @ordered
	 */
	public static final int TYPE_VALUE = 202;

	/**
	 * The '<em><b>Any</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any
	 * <!-- end-model-doc -->
	 * @see #ANY
	 * @model name="Any"
	 * @generated
	 * @ordered
	 */
	public static final int ANY_VALUE = 203;

	/**
	 * An array of all the '<em><b>FHIR All Types List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FHIRAllTypesList[] VALUES_ARRAY =
		new FHIRAllTypesList[] {
			ADDRESS,
			AGE,
			ANNOTATION,
			ATTACHMENT,
			BACKBONE_ELEMENT,
			CODEABLE_CONCEPT,
			CODING,
			CONTACT_DETAIL,
			CONTACT_POINT,
			CONTRIBUTOR,
			COUNT,
			DATA_REQUIREMENT,
			DISTANCE,
			DOSAGE,
			DURATION,
			ELEMENT,
			ELEMENT_DEFINITION,
			EXTENSION,
			HUMAN_NAME,
			IDENTIFIER,
			MARKETING_STATUS,
			META,
			MONEY,
			NARRATIVE,
			PARAMETER_DEFINITION,
			PERIOD,
			PROD_CHARACTERISTIC,
			PRODUCT_SHELF_LIFE,
			QUANTITY,
			RANGE,
			RATIO,
			REFERENCE,
			RELATED_ARTIFACT,
			SAMPLED_DATA,
			SIGNATURE,
			SIMPLE_QUANTITY,
			SUBSTANCE_AMOUNT,
			SUBSTANCE_MOIETY,
			TIMING,
			TRIGGER_DEFINITION,
			USAGE_CONTEXT,
			BASE64_BINARY,
			BOOLEAN,
			CODE,
			DATE,
			DATE_TIME,
			DECIMAL,
			ID,
			INSTANT,
			INTEGER,
			MARKDOWN,
			OID,
			POSITIVE_INT,
			STRING,
			TIME,
			UNSIGNED_INT,
			URI,
			UUID,
			XHTML,
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
			CHARGE_ITEM,
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
			DETECTED_ISSUE,
			DEVICE,
			DEVICE_COMPONENT,
			DEVICE_METRIC,
			DEVICE_REQUEST,
			DEVICE_USE_STATEMENT,
			DIAGNOSTIC_REPORT,
			DOCUMENT_MANIFEST,
			DOCUMENT_REFERENCE,
			DOMAIN_RESOURCE,
			ELIGIBILITY_REQUEST,
			ELIGIBILITY_RESPONSE,
			ENCOUNTER,
			ENDPOINT,
			ENROLLMENT_REQUEST,
			ENROLLMENT_RESPONSE,
			ENTRY_DEFINITION,
			EPISODE_OF_CARE,
			EVENT_DEFINITION,
			EXAMPLE_SCENARIO,
			EXPANSION_PROFILE,
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
			IMPLEMENTATION_GUIDE_INPUT,
			IMPLEMENTATION_GUIDE_OUTPUT,
			INVOICE,
			ITEM_INSTANCE,
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
			MEDICATION_REQUEST,
			MEDICATION_STATEMENT,
			MEDICINAL_PRODUCT,
			MEDICINAL_PRODUCT_AUTHORIZATION,
			MEDICINAL_PRODUCT_CLINICALS,
			MEDICINAL_PRODUCT_DEVICE_SPEC,
			MEDICINAL_PRODUCT_INGREDIENT,
			MEDICINAL_PRODUCT_PACKAGED,
			MEDICINAL_PRODUCT_PHARMACEUTICAL,
			MESSAGE_DEFINITION,
			MESSAGE_HEADER,
			NAMING_SYSTEM,
			NUTRITION_ORDER,
			OBSERVATION,
			OBSERVATION_DEFINITION,
			OCCUPATIONAL_DATA,
			OPERATION_DEFINITION,
			OPERATION_OUTCOME,
			ORGANIZATION,
			ORGANIZATION_ROLE,
			PARAMETERS,
			PATIENT,
			PAYMENT_NOTICE,
			PAYMENT_RECONCILIATION,
			PERSON,
			PLAN_DEFINITION,
			PRACTITIONER,
			PRACTITIONER_ROLE,
			PROCEDURE,
			PROCESS_REQUEST,
			PROCESS_RESPONSE,
			PRODUCT_PLAN,
			PROVENANCE,
			QUESTIONNAIRE,
			QUESTIONNAIRE_RESPONSE,
			RELATED_PERSON,
			REQUEST_GROUP,
			RESEARCH_STUDY,
			RESEARCH_SUBJECT,
			RESOURCE,
			RISK_ASSESSMENT,
			SCHEDULE,
			SEARCH_PARAMETER,
			SEQUENCE,
			SERVICE_DEFINITION,
			SERVICE_REQUEST,
			SLOT,
			SPECIMEN,
			SPECIMEN_DEFINITION,
			STRUCTURE_DEFINITION,
			STRUCTURE_MAP,
			SUBSCRIPTION,
			SUBSTANCE,
			SUBSTANCE_POLYMER,
			SUBSTANCE_REFERENCE_INFORMATION,
			SUBSTANCE_SPECIFICATION,
			SUPPLY_DELIVERY,
			SUPPLY_REQUEST,
			TASK,
			TERMINOLOGY_CAPABILITIES,
			TEST_REPORT,
			TEST_SCRIPT,
			USER_SESSION,
			VALUE_SET,
			VERIFICATION_RESULT,
			VISION_PRESCRIPTION,
			TYPE,
			ANY,
		};

	/**
	 * A public read-only list of all the '<em><b>FHIR All Types List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FHIRAllTypesList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>FHIR All Types List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FHIRAllTypesList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FHIRAllTypesList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>FHIR All Types List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FHIRAllTypesList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FHIRAllTypesList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>FHIR All Types List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FHIRAllTypesList get(int value) {
		switch (value) {
			case ADDRESS_VALUE: return ADDRESS;
			case AGE_VALUE: return AGE;
			case ANNOTATION_VALUE: return ANNOTATION;
			case ATTACHMENT_VALUE: return ATTACHMENT;
			case BACKBONE_ELEMENT_VALUE: return BACKBONE_ELEMENT;
			case CODEABLE_CONCEPT_VALUE: return CODEABLE_CONCEPT;
			case CODING_VALUE: return CODING;
			case CONTACT_DETAIL_VALUE: return CONTACT_DETAIL;
			case CONTACT_POINT_VALUE: return CONTACT_POINT;
			case CONTRIBUTOR_VALUE: return CONTRIBUTOR;
			case COUNT_VALUE: return COUNT;
			case DATA_REQUIREMENT_VALUE: return DATA_REQUIREMENT;
			case DISTANCE_VALUE: return DISTANCE;
			case DOSAGE_VALUE: return DOSAGE;
			case DURATION_VALUE: return DURATION;
			case ELEMENT_VALUE: return ELEMENT;
			case ELEMENT_DEFINITION_VALUE: return ELEMENT_DEFINITION;
			case EXTENSION_VALUE: return EXTENSION;
			case HUMAN_NAME_VALUE: return HUMAN_NAME;
			case IDENTIFIER_VALUE: return IDENTIFIER;
			case MARKETING_STATUS_VALUE: return MARKETING_STATUS;
			case META_VALUE: return META;
			case MONEY_VALUE: return MONEY;
			case NARRATIVE_VALUE: return NARRATIVE;
			case PARAMETER_DEFINITION_VALUE: return PARAMETER_DEFINITION;
			case PERIOD_VALUE: return PERIOD;
			case PROD_CHARACTERISTIC_VALUE: return PROD_CHARACTERISTIC;
			case PRODUCT_SHELF_LIFE_VALUE: return PRODUCT_SHELF_LIFE;
			case QUANTITY_VALUE: return QUANTITY;
			case RANGE_VALUE: return RANGE;
			case RATIO_VALUE: return RATIO;
			case REFERENCE_VALUE: return REFERENCE;
			case RELATED_ARTIFACT_VALUE: return RELATED_ARTIFACT;
			case SAMPLED_DATA_VALUE: return SAMPLED_DATA;
			case SIGNATURE_VALUE: return SIGNATURE;
			case SIMPLE_QUANTITY_VALUE: return SIMPLE_QUANTITY;
			case SUBSTANCE_AMOUNT_VALUE: return SUBSTANCE_AMOUNT;
			case SUBSTANCE_MOIETY_VALUE: return SUBSTANCE_MOIETY;
			case TIMING_VALUE: return TIMING;
			case TRIGGER_DEFINITION_VALUE: return TRIGGER_DEFINITION;
			case USAGE_CONTEXT_VALUE: return USAGE_CONTEXT;
			case BASE64_BINARY_VALUE: return BASE64_BINARY;
			case BOOLEAN_VALUE: return BOOLEAN;
			case CODE_VALUE: return CODE;
			case DATE_VALUE: return DATE;
			case DATE_TIME_VALUE: return DATE_TIME;
			case DECIMAL_VALUE: return DECIMAL;
			case ID_VALUE: return ID;
			case INSTANT_VALUE: return INSTANT;
			case INTEGER_VALUE: return INTEGER;
			case MARKDOWN_VALUE: return MARKDOWN;
			case OID_VALUE: return OID;
			case POSITIVE_INT_VALUE: return POSITIVE_INT;
			case STRING_VALUE: return STRING;
			case TIME_VALUE: return TIME;
			case UNSIGNED_INT_VALUE: return UNSIGNED_INT;
			case URI_VALUE: return URI;
			case UUID_VALUE: return UUID;
			case XHTML_VALUE: return XHTML;
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
			case CHARGE_ITEM_VALUE: return CHARGE_ITEM;
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
			case DETECTED_ISSUE_VALUE: return DETECTED_ISSUE;
			case DEVICE_VALUE: return DEVICE;
			case DEVICE_COMPONENT_VALUE: return DEVICE_COMPONENT;
			case DEVICE_METRIC_VALUE: return DEVICE_METRIC;
			case DEVICE_REQUEST_VALUE: return DEVICE_REQUEST;
			case DEVICE_USE_STATEMENT_VALUE: return DEVICE_USE_STATEMENT;
			case DIAGNOSTIC_REPORT_VALUE: return DIAGNOSTIC_REPORT;
			case DOCUMENT_MANIFEST_VALUE: return DOCUMENT_MANIFEST;
			case DOCUMENT_REFERENCE_VALUE: return DOCUMENT_REFERENCE;
			case DOMAIN_RESOURCE_VALUE: return DOMAIN_RESOURCE;
			case ELIGIBILITY_REQUEST_VALUE: return ELIGIBILITY_REQUEST;
			case ELIGIBILITY_RESPONSE_VALUE: return ELIGIBILITY_RESPONSE;
			case ENCOUNTER_VALUE: return ENCOUNTER;
			case ENDPOINT_VALUE: return ENDPOINT;
			case ENROLLMENT_REQUEST_VALUE: return ENROLLMENT_REQUEST;
			case ENROLLMENT_RESPONSE_VALUE: return ENROLLMENT_RESPONSE;
			case ENTRY_DEFINITION_VALUE: return ENTRY_DEFINITION;
			case EPISODE_OF_CARE_VALUE: return EPISODE_OF_CARE;
			case EVENT_DEFINITION_VALUE: return EVENT_DEFINITION;
			case EXAMPLE_SCENARIO_VALUE: return EXAMPLE_SCENARIO;
			case EXPANSION_PROFILE_VALUE: return EXPANSION_PROFILE;
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
			case IMPLEMENTATION_GUIDE_INPUT_VALUE: return IMPLEMENTATION_GUIDE_INPUT;
			case IMPLEMENTATION_GUIDE_OUTPUT_VALUE: return IMPLEMENTATION_GUIDE_OUTPUT;
			case INVOICE_VALUE: return INVOICE;
			case ITEM_INSTANCE_VALUE: return ITEM_INSTANCE;
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
			case MEDICATION_REQUEST_VALUE: return MEDICATION_REQUEST;
			case MEDICATION_STATEMENT_VALUE: return MEDICATION_STATEMENT;
			case MEDICINAL_PRODUCT_VALUE: return MEDICINAL_PRODUCT;
			case MEDICINAL_PRODUCT_AUTHORIZATION_VALUE: return MEDICINAL_PRODUCT_AUTHORIZATION;
			case MEDICINAL_PRODUCT_CLINICALS_VALUE: return MEDICINAL_PRODUCT_CLINICALS;
			case MEDICINAL_PRODUCT_DEVICE_SPEC_VALUE: return MEDICINAL_PRODUCT_DEVICE_SPEC;
			case MEDICINAL_PRODUCT_INGREDIENT_VALUE: return MEDICINAL_PRODUCT_INGREDIENT;
			case MEDICINAL_PRODUCT_PACKAGED_VALUE: return MEDICINAL_PRODUCT_PACKAGED;
			case MEDICINAL_PRODUCT_PHARMACEUTICAL_VALUE: return MEDICINAL_PRODUCT_PHARMACEUTICAL;
			case MESSAGE_DEFINITION_VALUE: return MESSAGE_DEFINITION;
			case MESSAGE_HEADER_VALUE: return MESSAGE_HEADER;
			case NAMING_SYSTEM_VALUE: return NAMING_SYSTEM;
			case NUTRITION_ORDER_VALUE: return NUTRITION_ORDER;
			case OBSERVATION_VALUE: return OBSERVATION;
			case OBSERVATION_DEFINITION_VALUE: return OBSERVATION_DEFINITION;
			case OCCUPATIONAL_DATA_VALUE: return OCCUPATIONAL_DATA;
			case OPERATION_DEFINITION_VALUE: return OPERATION_DEFINITION;
			case OPERATION_OUTCOME_VALUE: return OPERATION_OUTCOME;
			case ORGANIZATION_VALUE: return ORGANIZATION;
			case ORGANIZATION_ROLE_VALUE: return ORGANIZATION_ROLE;
			case PARAMETERS_VALUE: return PARAMETERS;
			case PATIENT_VALUE: return PATIENT;
			case PAYMENT_NOTICE_VALUE: return PAYMENT_NOTICE;
			case PAYMENT_RECONCILIATION_VALUE: return PAYMENT_RECONCILIATION;
			case PERSON_VALUE: return PERSON;
			case PLAN_DEFINITION_VALUE: return PLAN_DEFINITION;
			case PRACTITIONER_VALUE: return PRACTITIONER;
			case PRACTITIONER_ROLE_VALUE: return PRACTITIONER_ROLE;
			case PROCEDURE_VALUE: return PROCEDURE;
			case PROCESS_REQUEST_VALUE: return PROCESS_REQUEST;
			case PROCESS_RESPONSE_VALUE: return PROCESS_RESPONSE;
			case PRODUCT_PLAN_VALUE: return PRODUCT_PLAN;
			case PROVENANCE_VALUE: return PROVENANCE;
			case QUESTIONNAIRE_VALUE: return QUESTIONNAIRE;
			case QUESTIONNAIRE_RESPONSE_VALUE: return QUESTIONNAIRE_RESPONSE;
			case RELATED_PERSON_VALUE: return RELATED_PERSON;
			case REQUEST_GROUP_VALUE: return REQUEST_GROUP;
			case RESEARCH_STUDY_VALUE: return RESEARCH_STUDY;
			case RESEARCH_SUBJECT_VALUE: return RESEARCH_SUBJECT;
			case RESOURCE_VALUE: return RESOURCE;
			case RISK_ASSESSMENT_VALUE: return RISK_ASSESSMENT;
			case SCHEDULE_VALUE: return SCHEDULE;
			case SEARCH_PARAMETER_VALUE: return SEARCH_PARAMETER;
			case SEQUENCE_VALUE: return SEQUENCE;
			case SERVICE_DEFINITION_VALUE: return SERVICE_DEFINITION;
			case SERVICE_REQUEST_VALUE: return SERVICE_REQUEST;
			case SLOT_VALUE: return SLOT;
			case SPECIMEN_VALUE: return SPECIMEN;
			case SPECIMEN_DEFINITION_VALUE: return SPECIMEN_DEFINITION;
			case STRUCTURE_DEFINITION_VALUE: return STRUCTURE_DEFINITION;
			case STRUCTURE_MAP_VALUE: return STRUCTURE_MAP;
			case SUBSCRIPTION_VALUE: return SUBSCRIPTION;
			case SUBSTANCE_VALUE: return SUBSTANCE;
			case SUBSTANCE_POLYMER_VALUE: return SUBSTANCE_POLYMER;
			case SUBSTANCE_REFERENCE_INFORMATION_VALUE: return SUBSTANCE_REFERENCE_INFORMATION;
			case SUBSTANCE_SPECIFICATION_VALUE: return SUBSTANCE_SPECIFICATION;
			case SUPPLY_DELIVERY_VALUE: return SUPPLY_DELIVERY;
			case SUPPLY_REQUEST_VALUE: return SUPPLY_REQUEST;
			case TASK_VALUE: return TASK;
			case TERMINOLOGY_CAPABILITIES_VALUE: return TERMINOLOGY_CAPABILITIES;
			case TEST_REPORT_VALUE: return TEST_REPORT;
			case TEST_SCRIPT_VALUE: return TEST_SCRIPT;
			case USER_SESSION_VALUE: return USER_SESSION;
			case VALUE_SET_VALUE: return VALUE_SET;
			case VERIFICATION_RESULT_VALUE: return VERIFICATION_RESULT;
			case VISION_PRESCRIPTION_VALUE: return VISION_PRESCRIPTION;
			case TYPE_VALUE: return TYPE;
			case ANY_VALUE: return ANY;
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
	private FHIRAllTypesList(int value, String name, String literal) {
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
	
} //FHIRAllTypesList
