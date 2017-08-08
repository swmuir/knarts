/**
 */
package org.eclipse.mdht.uml.term.core.profile;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Guidance</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.term.core.profile.TermPackage#getGuidance()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Guidance '"
 * @generated
 */
public enum Guidance implements Enumerator {
	/**
	 * The '<em><b>FIXED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIXED_VALUE
	 * @generated
	 * @ordered
	 */
	FIXED(0, "FIXED", "FIXED"),

	/**
	 * The '<em><b>CLOSED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSED_VALUE
	 * @generated
	 * @ordered
	 */
	CLOSED(1, "CLOSED", "CLOSED"),

	/**
	 * The '<em><b>EXTEND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTEND_VALUE
	 * @generated
	 * @ordered
	 */
	EXTEND(2, "EXTEND", "EXTEND"),

	/**
	 * The '<em><b>RESTRICT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESTRICT_VALUE
	 * @generated
	 * @ordered
	 */
	RESTRICT(3, "RESTRICT", "RESTRICT"),

	/**
	 * The '<em><b>OPEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPEN_VALUE
	 * @generated
	 * @ordered
	 */
	OPEN(4, "OPEN", "OPEN");

	/**
	 * The '<em><b>FIXED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FIXED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIXED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FIXED_VALUE = 0;

	/**
	 * The '<em><b>CLOSED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CLOSED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLOSED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CLOSED_VALUE = 1;

	/**
	 * The '<em><b>EXTEND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EXTEND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXTEND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXTEND_VALUE = 2;

	/**
	 * The '<em><b>RESTRICT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RESTRICT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESTRICT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RESTRICT_VALUE = 3;

	/**
	 * The '<em><b>OPEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OPEN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPEN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_VALUE = 4;

	/**
	 * An array of all the '<em><b>Guidance</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Guidance[] VALUES_ARRAY = new Guidance[] {
			FIXED,
			CLOSED,
			EXTEND,
			RESTRICT,
			OPEN,
		};

	/**
	 * A public read-only list of all the '<em><b>Guidance</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Guidance> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Guidance</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Guidance get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Guidance result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Guidance</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Guidance getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Guidance result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Guidance</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Guidance get(int value) {
		switch (value) {
			case FIXED_VALUE: return FIXED;
			case CLOSED_VALUE: return CLOSED;
			case EXTEND_VALUE: return EXTEND;
			case RESTRICT_VALUE: return RESTRICT;
			case OPEN_VALUE: return OPEN;
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
	private Guidance(int value, String name, String literal) {
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

} // Guidance
