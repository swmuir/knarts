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
 * A representation of the literals of the enumeration '<em><b>Consent Scope Codes List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getConsentScopeCodesList()
 * @model extendedMetaData="name='ConsentScopeCodes-list'"
 * @generated
 */
public enum ConsentScopeCodesList implements Enumerator {
	/**
	 * The '<em><b>ADR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADR_VALUE
	 * @generated
	 * @ordered
	 */
	ADR(0, "ADR", "ADR"),

	/**
	 * The '<em><b>Research</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESEARCH_VALUE
	 * @generated
	 * @ordered
	 */
	RESEARCH(1, "research", "research"),

	/**
	 * The '<em><b>Privacy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIVACY_VALUE
	 * @generated
	 * @ordered
	 */
	PRIVACY(2, "privacy", "privacy"),

	/**
	 * The '<em><b>Treatment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TREATMENT_VALUE
	 * @generated
	 * @ordered
	 */
	TREATMENT(3, "treatment", "treatment");

	/**
	 * The '<em><b>ADR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Advanced Care Directive
	 * <!-- end-model-doc -->
	 * @see #ADR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ADR_VALUE = 0;

	/**
	 * The '<em><b>Research</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Research
	 * <!-- end-model-doc -->
	 * @see #RESEARCH
	 * @model name="research"
	 * @generated
	 * @ordered
	 */
	public static final int RESEARCH_VALUE = 1;

	/**
	 * The '<em><b>Privacy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Privacy Consent
	 * <!-- end-model-doc -->
	 * @see #PRIVACY
	 * @model name="privacy"
	 * @generated
	 * @ordered
	 */
	public static final int PRIVACY_VALUE = 2;

	/**
	 * The '<em><b>Treatment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Treatment
	 * <!-- end-model-doc -->
	 * @see #TREATMENT
	 * @model name="treatment"
	 * @generated
	 * @ordered
	 */
	public static final int TREATMENT_VALUE = 3;

	/**
	 * An array of all the '<em><b>Consent Scope Codes List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConsentScopeCodesList[] VALUES_ARRAY =
		new ConsentScopeCodesList[] {
			ADR,
			RESEARCH,
			PRIVACY,
			TREATMENT,
		};

	/**
	 * A public read-only list of all the '<em><b>Consent Scope Codes List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConsentScopeCodesList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Consent Scope Codes List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConsentScopeCodesList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConsentScopeCodesList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Consent Scope Codes List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConsentScopeCodesList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConsentScopeCodesList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Consent Scope Codes List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConsentScopeCodesList get(int value) {
		switch (value) {
			case ADR_VALUE: return ADR;
			case RESEARCH_VALUE: return RESEARCH;
			case PRIVACY_VALUE: return PRIVACY;
			case TREATMENT_VALUE: return TREATMENT;
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
	private ConsentScopeCodesList(int value, String name, String literal) {
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
	
} //ConsentScopeCodesList
