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
 * A representation of the literals of the enumeration '<em><b>Activity Definition Category List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getActivityDefinitionCategoryList()
 * @model extendedMetaData="name='ActivityDefinitionCategory-list'"
 * @generated
 */
public enum ActivityDefinitionCategoryList implements Enumerator {
	/**
	 * The '<em><b>Diet</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIET_VALUE
	 * @generated
	 * @ordered
	 */
	DIET(0, "diet", "diet"),

	/**
	 * The '<em><b>Drug</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRUG_VALUE
	 * @generated
	 * @ordered
	 */
	DRUG(1, "drug", "drug"),

	/**
	 * The '<em><b>Encounter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENCOUNTER_VALUE
	 * @generated
	 * @ordered
	 */
	ENCOUNTER(2, "encounter", "encounter"),

	/**
	 * The '<em><b>Observation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBSERVATION_VALUE
	 * @generated
	 * @ordered
	 */
	OBSERVATION(3, "observation", "observation"),

	/**
	 * The '<em><b>Procedure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCEDURE_VALUE
	 * @generated
	 * @ordered
	 */
	PROCEDURE(4, "procedure", "procedure"),

	/**
	 * The '<em><b>Supply</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPPLY_VALUE
	 * @generated
	 * @ordered
	 */
	SUPPLY(5, "supply", "supply"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(6, "other", "other");

	/**
	 * The '<em><b>Diet</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * To consume food of a specified nature
	 * <!-- end-model-doc -->
	 * @see #DIET
	 * @model name="diet"
	 * @generated
	 * @ordered
	 */
	public static final int DIET_VALUE = 0;

	/**
	 * The '<em><b>Drug</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * To consume/receive a drug, vaccine or other product
	 * <!-- end-model-doc -->
	 * @see #DRUG
	 * @model name="drug"
	 * @generated
	 * @ordered
	 */
	public static final int DRUG_VALUE = 1;

	/**
	 * The '<em><b>Encounter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * To meet or communicate with the patient (in-patient, out-patient, phone call, etc.)
	 * <!-- end-model-doc -->
	 * @see #ENCOUNTER
	 * @model name="encounter"
	 * @generated
	 * @ordered
	 */
	public static final int ENCOUNTER_VALUE = 2;

	/**
	 * The '<em><b>Observation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * To capture information about a patient (vitals, labs, diagnostic images, etc.)
	 * <!-- end-model-doc -->
	 * @see #OBSERVATION
	 * @model name="observation"
	 * @generated
	 * @ordered
	 */
	public static final int OBSERVATION_VALUE = 3;

	/**
	 * The '<em><b>Procedure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * To modify the patient in some way (surgery, physiotherapy, education, counseling, etc.)
	 * <!-- end-model-doc -->
	 * @see #PROCEDURE
	 * @model name="procedure"
	 * @generated
	 * @ordered
	 */
	public static final int PROCEDURE_VALUE = 4;

	/**
	 * The '<em><b>Supply</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * To provide something to the patient (medication, medical supply, etc.)
	 * <!-- end-model-doc -->
	 * @see #SUPPLY
	 * @model name="supply"
	 * @generated
	 * @ordered
	 */
	public static final int SUPPLY_VALUE = 5;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Some other form of action
	 * <!-- end-model-doc -->
	 * @see #OTHER
	 * @model name="other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 6;

	/**
	 * An array of all the '<em><b>Activity Definition Category List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ActivityDefinitionCategoryList[] VALUES_ARRAY =
		new ActivityDefinitionCategoryList[] {
			DIET,
			DRUG,
			ENCOUNTER,
			OBSERVATION,
			PROCEDURE,
			SUPPLY,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Activity Definition Category List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ActivityDefinitionCategoryList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Activity Definition Category List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ActivityDefinitionCategoryList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActivityDefinitionCategoryList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Activity Definition Category List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ActivityDefinitionCategoryList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActivityDefinitionCategoryList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Activity Definition Category List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ActivityDefinitionCategoryList get(int value) {
		switch (value) {
			case DIET_VALUE: return DIET;
			case DRUG_VALUE: return DRUG;
			case ENCOUNTER_VALUE: return ENCOUNTER;
			case OBSERVATION_VALUE: return OBSERVATION;
			case PROCEDURE_VALUE: return PROCEDURE;
			case SUPPLY_VALUE: return SUPPLY;
			case OTHER_VALUE: return OTHER;
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
	private ActivityDefinitionCategoryList(int value, String name, String literal) {
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
	
} //ActivityDefinitionCategoryList
