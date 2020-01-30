/**
 */
package fhiRCore.valueSets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Provenance History Record Activity Codes</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fhiRCore.valueSets.ValueSetsPackage#getProvenanceHistoryRecordActivityCodes()
 * @model
 * @generated
 */
public enum ProvenanceHistoryRecordActivityCodes implements Enumerator {
	/**
	 * The '<em><b>Create</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREATE_VALUE
	 * @generated
	 * @ordered
	 */
	CREATE(0, "create", "create"),

	/**
	 * The '<em><b>Update</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPDATE_VALUE
	 * @generated
	 * @ordered
	 */
	UPDATE(1, "update", "update"),

	/**
	 * The '<em><b>Delete</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETE_VALUE
	 * @generated
	 * @ordered
	 */
	DELETE(2, "delete", "delete"),

	/**
	 * The '<em><b>Abort</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABORT_VALUE
	 * @generated
	 * @ordered
	 */
	ABORT(3, "abort", "abort"),

	/**
	 * The '<em><b>Hold</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOLD_VALUE
	 * @generated
	 * @ordered
	 */
	HOLD(4, "hold", "hold"),

	/**
	 * The '<em><b>Release</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELEASE_VALUE
	 * @generated
	 * @ordered
	 */
	RELEASE(5, "release", "release"),

	/**
	 * The '<em><b>Cancel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CANCEL_VALUE
	 * @generated
	 * @ordered
	 */
	CANCEL(6, "cancel", "cancel"),

	/**
	 * The '<em><b>Activate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTIVATE_VALUE
	 * @generated
	 * @ordered
	 */
	ACTIVATE(7, "activate", "activate"),

	/**
	 * The '<em><b>Suspend</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUSPEND_VALUE
	 * @generated
	 * @ordered
	 */
	SUSPEND(8, "suspend", "suspend"),

	/**
	 * The '<em><b>Resume</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESUME_VALUE
	 * @generated
	 * @ordered
	 */
	RESUME(9, "resume", "resume"),

	/**
	 * The '<em><b>Complete</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETE_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLETE(10, "complete", "complete"),

	/**
	 * The '<em><b>Nullify</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NULLIFY_VALUE
	 * @generated
	 * @ordered
	 */
	NULLIFY(11, "nullify", "nullify"),

	/**
	 * The '<em><b>Obsolete</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OBSOLETE_VALUE
	 * @generated
	 * @ordered
	 */
	OBSOLETE(12, "obsolete", "obsolete"),

	/**
	 * The '<em><b>Reactivate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REACTIVATE_VALUE
	 * @generated
	 * @ordered
	 */
	REACTIVATE(13, "reactivate", "reactivate");

	/**
	 * The '<em><b>Create</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Create</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CREATE
	 * @model name="create"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CREATE'"
	 * @generated
	 * @ordered
	 */
	public static final int CREATE_VALUE = 0;

	/**
	 * The '<em><b>Update</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Update</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPDATE
	 * @model name="update"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='UPDATE'"
	 * @generated
	 * @ordered
	 */
	public static final int UPDATE_VALUE = 1;

	/**
	 * The '<em><b>Delete</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Delete</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DELETE
	 * @model name="delete"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DELETE'"
	 * @generated
	 * @ordered
	 */
	public static final int DELETE_VALUE = 2;

	/**
	 * The '<em><b>Abort</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Abort</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ABORT
	 * @model name="abort"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ABORT'"
	 * @generated
	 * @ordered
	 */
	public static final int ABORT_VALUE = 3;

	/**
	 * The '<em><b>Hold</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hold</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HOLD
	 * @model name="hold"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='HOLD'"
	 * @generated
	 * @ordered
	 */
	public static final int HOLD_VALUE = 4;

	/**
	 * The '<em><b>Release</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Release</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RELEASE
	 * @model name="release"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='RELEASE'"
	 * @generated
	 * @ordered
	 */
	public static final int RELEASE_VALUE = 5;

	/**
	 * The '<em><b>Cancel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cancel</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CANCEL
	 * @model name="cancel"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CANCEL'"
	 * @generated
	 * @ordered
	 */
	public static final int CANCEL_VALUE = 6;

	/**
	 * The '<em><b>Activate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Activate</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACTIVATE
	 * @model name="activate"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ACTIVATE'"
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVATE_VALUE = 7;

	/**
	 * The '<em><b>Suspend</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Suspend</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUSPEND
	 * @model name="suspend"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SUSPEND'"
	 * @generated
	 * @ordered
	 */
	public static final int SUSPEND_VALUE = 8;

	/**
	 * The '<em><b>Resume</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Resume</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESUME
	 * @model name="resume"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='RESUME'"
	 * @generated
	 * @ordered
	 */
	public static final int RESUME_VALUE = 9;

	/**
	 * The '<em><b>Complete</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Complete</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPLETE
	 * @model name="complete"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='COMPLETE'"
	 * @generated
	 * @ordered
	 */
	public static final int COMPLETE_VALUE = 10;

	/**
	 * The '<em><b>Nullify</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Nullify</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NULLIFY
	 * @model name="nullify"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='NULLIFY'"
	 * @generated
	 * @ordered
	 */
	public static final int NULLIFY_VALUE = 11;

	/**
	 * The '<em><b>Obsolete</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Obsolete</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OBSOLETE
	 * @model name="obsolete"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='OBSOLETE'"
	 * @generated
	 * @ordered
	 */
	public static final int OBSOLETE_VALUE = 12;

	/**
	 * The '<em><b>Reactivate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Reactivate</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REACTIVATE
	 * @model name="reactivate"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='REACTIVATE'"
	 * @generated
	 * @ordered
	 */
	public static final int REACTIVATE_VALUE = 13;

	/**
	 * An array of all the '<em><b>Provenance History Record Activity Codes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProvenanceHistoryRecordActivityCodes[] VALUES_ARRAY =
		new ProvenanceHistoryRecordActivityCodes[] {
			CREATE,
			UPDATE,
			DELETE,
			ABORT,
			HOLD,
			RELEASE,
			CANCEL,
			ACTIVATE,
			SUSPEND,
			RESUME,
			COMPLETE,
			NULLIFY,
			OBSOLETE,
			REACTIVATE,
		};

	/**
	 * A public read-only list of all the '<em><b>Provenance History Record Activity Codes</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProvenanceHistoryRecordActivityCodes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Provenance History Record Activity Codes</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProvenanceHistoryRecordActivityCodes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProvenanceHistoryRecordActivityCodes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Provenance History Record Activity Codes</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProvenanceHistoryRecordActivityCodes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProvenanceHistoryRecordActivityCodes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Provenance History Record Activity Codes</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProvenanceHistoryRecordActivityCodes get(int value) {
		switch (value) {
			case CREATE_VALUE: return CREATE;
			case UPDATE_VALUE: return UPDATE;
			case DELETE_VALUE: return DELETE;
			case ABORT_VALUE: return ABORT;
			case HOLD_VALUE: return HOLD;
			case RELEASE_VALUE: return RELEASE;
			case CANCEL_VALUE: return CANCEL;
			case ACTIVATE_VALUE: return ACTIVATE;
			case SUSPEND_VALUE: return SUSPEND;
			case RESUME_VALUE: return RESUME;
			case COMPLETE_VALUE: return COMPLETE;
			case NULLIFY_VALUE: return NULLIFY;
			case OBSOLETE_VALUE: return OBSOLETE;
			case REACTIVATE_VALUE: return REACTIVATE;
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
	private ProvenanceHistoryRecordActivityCodes(int value, String name, String literal) {
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
	
} //ProvenanceHistoryRecordActivityCodes
