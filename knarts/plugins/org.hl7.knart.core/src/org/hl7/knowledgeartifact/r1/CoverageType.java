/**
 */
package org.hl7.knowledgeartifact.r1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Coverage Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Specifies clinical metadata that can be used to retrieve, index and/or categorize the knowledge artifact. This metadata can either be specific to the applicable population (e.g., age category, DRG) or the specific context of care (e.g., venue, care setting, provider of care). 
 * <!-- end-model-doc -->
 * @see org.hl7.knowledgeartifact.r1.R1Package#getCoverageType()
 * @model extendedMetaData="name='CoverageType'"
 * @generated
 */
public enum CoverageType implements Enumerator {
	/**
	 * The '<em><b>Patient Gender</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATIENT_GENDER_VALUE
	 * @generated
	 * @ordered
	 */
	PATIENT_GENDER(0, "PatientGender", "PatientGender"),

	/**
	 * The '<em><b>Patient Age Group</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATIENT_AGE_GROUP_VALUE
	 * @generated
	 * @ordered
	 */
	PATIENT_AGE_GROUP(1, "PatientAgeGroup", "PatientAgeGroup"),

	/**
	 * The '<em><b>Clinical Focus</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLINICAL_FOCUS_VALUE
	 * @generated
	 * @ordered
	 */
	CLINICAL_FOCUS(2, "ClinicalFocus", "ClinicalFocus"),

	/**
	 * The '<em><b>Target User</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TARGET_USER_VALUE
	 * @generated
	 * @ordered
	 */
	TARGET_USER(3, "TargetUser", "TargetUser"),

	/**
	 * The '<em><b>Workflow Setting</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORKFLOW_SETTING_VALUE
	 * @generated
	 * @ordered
	 */
	WORKFLOW_SETTING(4, "WorkflowSetting", "WorkflowSetting"),

	/**
	 * The '<em><b>Workflow Task</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORKFLOW_TASK_VALUE
	 * @generated
	 * @ordered
	 */
	WORKFLOW_TASK(5, "WorkflowTask", "WorkflowTask"),

	/**
	 * The '<em><b>Clinical Venue</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLINICAL_VENUE_VALUE
	 * @generated
	 * @ordered
	 */
	CLINICAL_VENUE(6, "ClinicalVenue", "ClinicalVenue");

	/**
	 * The '<em><b>Patient Gender</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gender of the patient. For this item type, use HL7 administrative gender codes (OID: 2.16.840.1.113883.1.11.1)
	 * <!-- end-model-doc -->
	 * @see #PATIENT_GENDER
	 * @model name="PatientGender"
	 * @generated
	 * @ordered
	 */
	public static final int PATIENT_GENDER_VALUE = 0;

	/**
	 * The '<em><b>Patient Age Group</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A patient demographic category for which this artifact is applicable. Allows specification of age groups using coded values originating from the MeSH Code system (OID: 2.16.840.1.113883.6.177). More specifically, only codes from the AgeGroupObservationValue value set are valid for this field  [2.16.840.1.113883.11.75]
	 * <!-- end-model-doc -->
	 * @see #PATIENT_AGE_GROUP
	 * @model name="PatientAgeGroup"
	 * @generated
	 * @ordered
	 */
	public static final int PATIENT_AGE_GROUP_VALUE = 1;

	/**
	 * The '<em><b>Clinical Focus</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The clinical concept(s) addressed by the artifact.  For example, disease, diagnostic test interpretation, medication ordering. Please refer to the implementation guide on which code system and codes to use.
	 * <!-- end-model-doc -->
	 * @see #CLINICAL_FOCUS
	 * @model name="ClinicalFocus"
	 * @generated
	 * @ordered
	 */
	public static final int CLINICAL_FOCUS_VALUE = 2;

	/**
	 * The '<em><b>Target User</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The user types to which an artifact is targeted.  For example, PCP, Patient, Cardiologist, Behavioral Professional, Oral Health Professional, Prescriber, etc... taken from the NUCC Health Care provider taxonomyCode system (OID: 2.16.840.1.113883.6.101)
	 * <!-- end-model-doc -->
	 * @see #TARGET_USER
	 * @model name="TargetUser"
	 * @generated
	 * @ordered
	 */
	public static final int TARGET_USER_VALUE = 3;

	/**
	 * The '<em><b>Workflow Setting</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The settings in which the artifact is intended for use.  For example, admission, pre-op, etc.
	 * <!-- end-model-doc -->
	 * @see #WORKFLOW_SETTING
	 * @model name="WorkflowSetting"
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_SETTING_VALUE = 4;

	/**
	 * The '<em><b>Workflow Task</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The context for the clinical task(s) represented by this artifact. Can be any task context represented by the HL7 ActTaskCode value set (OID: 2.16.840.1.113883.1.11.19846). General categories include: order entry, patient documentation and patient information review
	 * <!-- end-model-doc -->
	 * @see #WORKFLOW_TASK
	 * @model name="WorkflowTask"
	 * @generated
	 * @ordered
	 */
	public static final int WORKFLOW_TASK_VALUE = 5;

	/**
	 * The '<em><b>Clinical Venue</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The venue in which an artifact could be used.  For example, Outpatient, Inpatient, Home, Nursing home. The code value may originate from either the HL7 ActEncounter (OID: 2.16.840.1.113883.1.11.13955) or NUCC non-individual provider codes OID: 2.16.840.1.113883.1.11.19465
	 * <!-- end-model-doc -->
	 * @see #CLINICAL_VENUE
	 * @model name="ClinicalVenue"
	 * @generated
	 * @ordered
	 */
	public static final int CLINICAL_VENUE_VALUE = 6;

	/**
	 * An array of all the '<em><b>Coverage Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CoverageType[] VALUES_ARRAY =
		new CoverageType[] {
			PATIENT_GENDER,
			PATIENT_AGE_GROUP,
			CLINICAL_FOCUS,
			TARGET_USER,
			WORKFLOW_SETTING,
			WORKFLOW_TASK,
			CLINICAL_VENUE,
		};

	/**
	 * A public read-only list of all the '<em><b>Coverage Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CoverageType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Coverage Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CoverageType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CoverageType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Coverage Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CoverageType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CoverageType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Coverage Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CoverageType get(int value) {
		switch (value) {
			case PATIENT_GENDER_VALUE: return PATIENT_GENDER;
			case PATIENT_AGE_GROUP_VALUE: return PATIENT_AGE_GROUP;
			case CLINICAL_FOCUS_VALUE: return CLINICAL_FOCUS;
			case TARGET_USER_VALUE: return TARGET_USER;
			case WORKFLOW_SETTING_VALUE: return WORKFLOW_SETTING;
			case WORKFLOW_TASK_VALUE: return WORKFLOW_TASK;
			case CLINICAL_VENUE_VALUE: return CLINICAL_VENUE;
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
	private CoverageType(int value, String name, String literal) {
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
	
} //CoverageType
