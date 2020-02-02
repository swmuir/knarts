/**
 */
package org.hl7.knowledgeartifact.r1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Artifact Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Three types of artifacts are in scope for Health eDecisions Use Case #1:  Event-condition-action rules, order sets and documentation templates.
 * <!-- end-model-doc -->
 * @see org.hl7.knowledgeartifact.r1.R1Package#getArtifactType()
 * @model extendedMetaData="name='ArtifactType'"
 * @generated
 */
public enum ArtifactType implements Enumerator {
	/**
	 * The '<em><b>Rule</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RULE_VALUE
	 * @generated
	 * @ordered
	 */
	RULE(0, "Rule", "Rule"),

	/**
	 * The '<em><b>Order Set</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORDER_SET_VALUE
	 * @generated
	 * @ordered
	 */
	ORDER_SET(1, "OrderSet", "Order Set"),

	/**
	 * The '<em><b>Documentation Template</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCUMENTATION_TEMPLATE_VALUE
	 * @generated
	 * @ordered
	 */
	DOCUMENTATION_TEMPLATE(2, "DocumentationTemplate", "Documentation Template"),

	/**
	 * The '<em><b>Library</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIBRARY_VALUE
	 * @generated
	 * @ordered
	 */
	LIBRARY(3, "Library", "Library"),

	/**
	 * The '<em><b>Composite</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPOSITE_VALUE
	 * @generated
	 * @ordered
	 */
	COMPOSITE(4, "Composite", "Composite");

	/**
	 * The '<em><b>Rule</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Denotes an Event-Condition-Action Rule.  An ECA rule has a specific structure that is a restriction on the general structure of a CDS Knowledge Artifact.  See the Implementation Guide for the constraints applicable to ECA rules.
	 * <!-- end-model-doc -->
	 * @see #RULE
	 * @model name="Rule"
	 * @generated
	 * @ordered
	 */
	public static final int RULE_VALUE = 0;

	/**
	 * The '<em><b>Order Set</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Denotes an Order Set for use by physicians at the point of care.  An Order Set has a specific structure that is a restriction on the general structure of a CDS Knowledge Artifact.  See the Implementation Guide for the constraints applicable to Order Sets.
	 * <!-- end-model-doc -->
	 * @see #ORDER_SET
	 * @model name="OrderSet" literal="Order Set"
	 * @generated
	 * @ordered
	 */
	public static final int ORDER_SET_VALUE = 1;

	/**
	 * The '<em><b>Documentation Template</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Denotes a Documentation Template for use by care providers.  A Documentation Template has a specific structure that is a restriction on the general structure of a CDS Knowledge Artifact.  See the Implementation Guide for the constraints applicable to Documentation Templates.
	 * <!-- end-model-doc -->
	 * @see #DOCUMENTATION_TEMPLATE
	 * @model name="DocumentationTemplate" literal="Documentation Template"
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENTATION_TEMPLATE_VALUE = 2;

	/**
	 * The '<em><b>Library</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Denotes a Library of artifact components that can be reused by reference in other artifacts.
	 * <!-- end-model-doc -->
	 * @see #LIBRARY
	 * @model name="Library"
	 * @generated
	 * @ordered
	 */
	public static final int LIBRARY_VALUE = 3;

	/**
	 * The '<em><b>Composite</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Denotes a Composite artifact.
	 * <!-- end-model-doc -->
	 * @see #COMPOSITE
	 * @model name="Composite"
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Artifact Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ArtifactType[] VALUES_ARRAY =
		new ArtifactType[] {
			RULE,
			ORDER_SET,
			DOCUMENTATION_TEMPLATE,
			LIBRARY,
			COMPOSITE,
		};

	/**
	 * A public read-only list of all the '<em><b>Artifact Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ArtifactType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Artifact Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ArtifactType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ArtifactType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Artifact Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ArtifactType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ArtifactType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Artifact Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ArtifactType get(int value) {
		switch (value) {
			case RULE_VALUE: return RULE;
			case ORDER_SET_VALUE: return ORDER_SET;
			case DOCUMENTATION_TEMPLATE_VALUE: return DOCUMENTATION_TEMPLATE;
			case LIBRARY_VALUE: return LIBRARY;
			case COMPOSITE_VALUE: return COMPOSITE;
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
	private ArtifactType(int value, String name, String literal) {
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
	
} //ArtifactType
