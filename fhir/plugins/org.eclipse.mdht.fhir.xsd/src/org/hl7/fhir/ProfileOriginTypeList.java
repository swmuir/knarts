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
 * A representation of the literals of the enumeration '<em><b>Profile Origin Type List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.hl7.fhir.FhirPackage#getProfileOriginTypeList()
 * @model extendedMetaData="name='ProfileOriginType-list'"
 * @generated
 */
public enum ProfileOriginTypeList implements Enumerator {
	/**
	 * The '<em><b>FHIRDSTU2 Client</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FHIRDSTU2_CLIENT_VALUE
	 * @generated
	 * @ordered
	 */
	FHIRDSTU2_CLIENT(0, "FHIRDSTU2Client", "FHIR-DSTU2-Client"),

	/**
	 * The '<em><b>FHIRDSTU2SDC Form Filler</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FHIRDSTU2SDC_FORM_FILLER_VALUE
	 * @generated
	 * @ordered
	 */
	FHIRDSTU2SDC_FORM_FILLER(1, "FHIRDSTU2SDCFormFiller", "FHIR-DSTU2-SDC-FormFiller");

	/**
	 * The '<em><b>FHIRDSTU2 Client</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * General DSTU2 client initiating against a DSTU2 Server.
	 * <!-- end-model-doc -->
	 * @see #FHIRDSTU2_CLIENT
	 * @model name="FHIRDSTU2Client" literal="FHIR-DSTU2-Client"
	 * @generated
	 * @ordered
	 */
	public static final int FHIRDSTU2_CLIENT_VALUE = 0;

	/**
	 * The '<em><b>FHIRDSTU2SDC Form Filler</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DSTU2 client that serves as an SDC-FormFiller.
	 * <!-- end-model-doc -->
	 * @see #FHIRDSTU2SDC_FORM_FILLER
	 * @model name="FHIRDSTU2SDCFormFiller" literal="FHIR-DSTU2-SDC-FormFiller"
	 * @generated
	 * @ordered
	 */
	public static final int FHIRDSTU2SDC_FORM_FILLER_VALUE = 1;

	/**
	 * An array of all the '<em><b>Profile Origin Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProfileOriginTypeList[] VALUES_ARRAY =
		new ProfileOriginTypeList[] {
			FHIRDSTU2_CLIENT,
			FHIRDSTU2SDC_FORM_FILLER,
		};

	/**
	 * A public read-only list of all the '<em><b>Profile Origin Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProfileOriginTypeList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Profile Origin Type List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProfileOriginTypeList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProfileOriginTypeList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Profile Origin Type List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProfileOriginTypeList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProfileOriginTypeList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Profile Origin Type List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProfileOriginTypeList get(int value) {
		switch (value) {
			case FHIRDSTU2_CLIENT_VALUE: return FHIRDSTU2_CLIENT;
			case FHIRDSTU2SDC_FORM_FILLER_VALUE: return FHIRDSTU2SDC_FORM_FILLER;
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
	private ProfileOriginTypeList(int value, String name, String literal) {
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
	
} //ProfileOriginTypeList
