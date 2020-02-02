/**
 */
package org.hl7.knowledgeartifact.r2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Contributor Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Enumeration of roles that contribute to the development and maintenance of a knowledge artifact.
 * <!-- end-model-doc -->
 * @see org.hl7.knowledgeartifact.r2.R2Package#getContributorType()
 * @model extendedMetaData="name='ContributorType'"
 * @generated
 */
public enum ContributorType implements Enumerator {
	/**
	 * The '<em><b>Author</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTHOR_VALUE
	 * @generated
	 * @ordered
	 */
	AUTHOR(0, "Author", "Author"),

	/**
	 * The '<em><b>Editor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDITOR_VALUE
	 * @generated
	 * @ordered
	 */
	EDITOR(1, "Editor", "Editor"),

	/**
	 * The '<em><b>Endorser</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENDORSER_VALUE
	 * @generated
	 * @ordered
	 */
	ENDORSER(2, "Endorser", "Endorser"),

	/**
	 * The '<em><b>Reviewer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REVIEWER_VALUE
	 * @generated
	 * @ordered
	 */
	REVIEWER(3, "Reviewer", "Reviewer");

	/**
	 * The '<em><b>Author</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Author</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUTHOR
	 * @model name="Author"
	 * @generated
	 * @ordered
	 */
	public static final int AUTHOR_VALUE = 0;

	/**
	 * The '<em><b>Editor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Editor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EDITOR
	 * @model name="Editor"
	 * @generated
	 * @ordered
	 */
	public static final int EDITOR_VALUE = 1;

	/**
	 * The '<em><b>Endorser</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Endorser</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENDORSER
	 * @model name="Endorser"
	 * @generated
	 * @ordered
	 */
	public static final int ENDORSER_VALUE = 2;

	/**
	 * The '<em><b>Reviewer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Reviewer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REVIEWER
	 * @model name="Reviewer"
	 * @generated
	 * @ordered
	 */
	public static final int REVIEWER_VALUE = 3;

	/**
	 * An array of all the '<em><b>Contributor Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ContributorType[] VALUES_ARRAY =
		new ContributorType[] {
			AUTHOR,
			EDITOR,
			ENDORSER,
			REVIEWER,
		};

	/**
	 * A public read-only list of all the '<em><b>Contributor Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ContributorType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Contributor Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContributorType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContributorType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Contributor Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContributorType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContributorType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Contributor Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContributorType get(int value) {
		switch (value) {
			case AUTHOR_VALUE: return AUTHOR;
			case EDITOR_VALUE: return EDITOR;
			case ENDORSER_VALUE: return ENDORSER;
			case REVIEWER_VALUE: return REVIEWER;
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
	private ContributorType(int value, String name, String literal) {
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
	
} //ContributorType
