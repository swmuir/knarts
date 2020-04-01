/**
 */
package org.eclipse.mdht.hl7.fhir.valueSets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Provenance Activity Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.hl7.fhir.valueSets.ValueSetsPackage#getProvenanceActivityType()
 * @model
 * @generated
 */
public enum ProvenanceActivityType implements Enumerator {
	/**
	 * The '<em><b>La</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LA_VALUE
	 * @generated
	 * @ordered
	 */
	LA(0, "la", "la"),

	/**
	 * The '<em><b>Anony</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANONY_VALUE
	 * @generated
	 * @ordered
	 */
	ANONY(1, "anony", "anony"),

	/**
	 * The '<em><b>Deid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEID_VALUE
	 * @generated
	 * @ordered
	 */
	DEID(2, "deid", "deid"),

	/**
	 * The '<em><b>Mask</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASK_VALUE
	 * @generated
	 * @ordered
	 */
	MASK(3, "mask", "mask"),

	/**
	 * The '<em><b>Label</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LABEL_VALUE
	 * @generated
	 * @ordered
	 */
	LABEL(4, "label", "label"),

	/**
	 * The '<em><b>Pseud</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PSEUD_VALUE
	 * @generated
	 * @ordered
	 */
	PSEUD(5, "pseud", "pseud"),

	/**
	 * The '<em><b>Create</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREATE_VALUE
	 * @generated
	 * @ordered
	 */
	CREATE(6, "create", "create"),

	/**
	 * The '<em><b>Delete</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETE_VALUE
	 * @generated
	 * @ordered
	 */
	DELETE(7, "delete", "delete"),

	/**
	 * The '<em><b>Update</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPDATE_VALUE
	 * @generated
	 * @ordered
	 */
	UPDATE(8, "update", "update"),

	/**
	 * The '<em><b>Append</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPEND_VALUE
	 * @generated
	 * @ordered
	 */
	APPEND(9, "append", "append"),

	/**
	 * The '<em><b>Nullify</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NULLIFY_VALUE
	 * @generated
	 * @ordered
	 */
	NULLIFY(10, "nullify", "nullify");

	/**
	 * The '<em><b>La</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LA
	 * @model name="la"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='LA'"
	 * @generated
	 * @ordered
	 */
	public static final int LA_VALUE = 0;

	/**
	 * The '<em><b>Anony</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANONY
	 * @model name="anony"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ANONY'"
	 * @generated
	 * @ordered
	 */
	public static final int ANONY_VALUE = 1;

	/**
	 * The '<em><b>Deid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEID
	 * @model name="deid"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DEID'"
	 * @generated
	 * @ordered
	 */
	public static final int DEID_VALUE = 2;

	/**
	 * The '<em><b>Mask</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MASK
	 * @model name="mask"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MASK'"
	 * @generated
	 * @ordered
	 */
	public static final int MASK_VALUE = 3;

	/**
	 * The '<em><b>Label</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LABEL
	 * @model name="label"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='LABEL'"
	 * @generated
	 * @ordered
	 */
	public static final int LABEL_VALUE = 4;

	/**
	 * The '<em><b>Pseud</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PSEUD
	 * @model name="pseud"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='PSEUD'"
	 * @generated
	 * @ordered
	 */
	public static final int PSEUD_VALUE = 5;

	/**
	 * The '<em><b>Create</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREATE
	 * @model name="create"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CREATE'"
	 * @generated
	 * @ordered
	 */
	public static final int CREATE_VALUE = 6;

	/**
	 * The '<em><b>Delete</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETE
	 * @model name="delete"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DELETE'"
	 * @generated
	 * @ordered
	 */
	public static final int DELETE_VALUE = 7;

	/**
	 * The '<em><b>Update</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPDATE
	 * @model name="update"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='UPDATE'"
	 * @generated
	 * @ordered
	 */
	public static final int UPDATE_VALUE = 8;

	/**
	 * The '<em><b>Append</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPEND
	 * @model name="append"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='APPEND'"
	 * @generated
	 * @ordered
	 */
	public static final int APPEND_VALUE = 9;

	/**
	 * The '<em><b>Nullify</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NULLIFY
	 * @model name="nullify"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='NULLIFY'"
	 * @generated
	 * @ordered
	 */
	public static final int NULLIFY_VALUE = 10;

	/**
	 * An array of all the '<em><b>Provenance Activity Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProvenanceActivityType[] VALUES_ARRAY =
		new ProvenanceActivityType[] {
			LA,
			ANONY,
			DEID,
			MASK,
			LABEL,
			PSEUD,
			CREATE,
			DELETE,
			UPDATE,
			APPEND,
			NULLIFY,
		};

	/**
	 * A public read-only list of all the '<em><b>Provenance Activity Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProvenanceActivityType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Provenance Activity Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProvenanceActivityType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProvenanceActivityType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Provenance Activity Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProvenanceActivityType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProvenanceActivityType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Provenance Activity Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProvenanceActivityType get(int value) {
		switch (value) {
			case LA_VALUE: return LA;
			case ANONY_VALUE: return ANONY;
			case DEID_VALUE: return DEID;
			case MASK_VALUE: return MASK;
			case LABEL_VALUE: return LABEL;
			case PSEUD_VALUE: return PSEUD;
			case CREATE_VALUE: return CREATE;
			case DELETE_VALUE: return DELETE;
			case UPDATE_VALUE: return UPDATE;
			case APPEND_VALUE: return APPEND;
			case NULLIFY_VALUE: return NULLIFY;
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
	private ProvenanceActivityType(int value, String name, String literal) {
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
	
} //ProvenanceActivityType
