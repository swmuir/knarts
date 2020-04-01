/**
 */
package org.eclipse.mdht.hl7.fhir.valueSets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Consent Content Class</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.hl7.fhir.valueSets.ValueSetsPackage#getConsentContentClass()
 * @model
 * @generated
 */
public enum ConsentContentClass implements Enumerator {
	/**
	 * The '<em><b>Httphl7orgfhir Structure Definitionlipidprofile</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTTPHL7ORGFHIR_STRUCTURE_DEFINITIONLIPIDPROFILE_VALUE
	 * @generated
	 * @ordered
	 */
	HTTPHL7ORGFHIR_STRUCTURE_DEFINITIONLIPIDPROFILE(0, "httphl7orgfhirStructureDefinitionlipidprofile", "httphl7orgfhirStructureDefinitionlipidprofile"),

	/**
	 * The '<em><b>Applicationhl7cdaxml</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATIONHL7CDAXML_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATIONHL7CDAXML(1, "applicationhl7cdaxml", "applicationhl7cdaxml");

	/**
	 * The '<em><b>Httphl7orgfhir Structure Definitionlipidprofile</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HTTPHL7ORGFHIR_STRUCTURE_DEFINITIONLIPIDPROFILE
	 * @model name="httphl7orgfhirStructureDefinitionlipidprofile"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='http://hl7.org/fhir/StructureDefinition/lipidprofile'"
	 * @generated
	 * @ordered
	 */
	public static final int HTTPHL7ORGFHIR_STRUCTURE_DEFINITIONLIPIDPROFILE_VALUE = 0;

	/**
	 * The '<em><b>Applicationhl7cdaxml</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATIONHL7CDAXML
	 * @model name="applicationhl7cdaxml"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='application/hl7-cda+xml'"
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATIONHL7CDAXML_VALUE = 1;

	/**
	 * An array of all the '<em><b>Consent Content Class</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConsentContentClass[] VALUES_ARRAY =
		new ConsentContentClass[] {
			HTTPHL7ORGFHIR_STRUCTURE_DEFINITIONLIPIDPROFILE,
			APPLICATIONHL7CDAXML,
		};

	/**
	 * A public read-only list of all the '<em><b>Consent Content Class</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConsentContentClass> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Consent Content Class</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConsentContentClass get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConsentContentClass result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Consent Content Class</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConsentContentClass getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConsentContentClass result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Consent Content Class</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConsentContentClass get(int value) {
		switch (value) {
			case HTTPHL7ORGFHIR_STRUCTURE_DEFINITIONLIPIDPROFILE_VALUE: return HTTPHL7ORGFHIR_STRUCTURE_DEFINITIONLIPIDPROFILE;
			case APPLICATIONHL7CDAXML_VALUE: return APPLICATIONHL7CDAXML;
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
	private ConsentContentClass(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	
} //ConsentContentClass
