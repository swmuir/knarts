/**
 */
package org.hl7.knowledgeartifact.r2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Resource Relationship Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * A specific status is associated with each version of an artifact. 
 * 
 * See the Implementation Guide for a state-transition diagram showing the legal transitions from each state; each state is equivalent to particular status.
 * <!-- end-model-doc -->
 * @see org.hl7.knowledgeartifact.r2.R2Package#getResourceRelationshipType()
 * @model extendedMetaData="name='ResourceRelationshipType'"
 * @generated
 */
public enum ResourceRelationshipType implements Enumerator {
	/**
	 * The '<em><b>Adapted From</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADAPTED_FROM_VALUE
	 * @generated
	 * @ordered
	 */
	ADAPTED_FROM(0, "AdaptedFrom", "AdaptedFrom"),

	/**
	 * The '<em><b>Associated Resource</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSOCIATED_RESOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	ASSOCIATED_RESOURCE(1, "AssociatedResource", "AssociatedResource"),

	/**
	 * The '<em><b>Depends On</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPENDS_ON_VALUE
	 * @generated
	 * @ordered
	 */
	DEPENDS_ON(2, "DependsOn", "DependsOn"),

	/**
	 * The '<em><b>Derived From</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DERIVED_FROM_VALUE
	 * @generated
	 * @ordered
	 */
	DERIVED_FROM(3, "DerivedFrom", "DerivedFrom"),

	/**
	 * The '<em><b>Similar To</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIMILAR_TO_VALUE
	 * @generated
	 * @ordered
	 */
	SIMILAR_TO(4, "SimilarTo", "SimilarTo"),

	/**
	 * The '<em><b>Version Of</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERSION_OF_VALUE
	 * @generated
	 * @ordered
	 */
	VERSION_OF(5, "VersionOf", "VersionOf");

	/**
	 * The '<em><b>Adapted From</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Adapted From</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADAPTED_FROM
	 * @model name="AdaptedFrom"
	 * @generated
	 * @ordered
	 */
	public static final int ADAPTED_FROM_VALUE = 0;

	/**
	 * The '<em><b>Associated Resource</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Associated Resource</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASSOCIATED_RESOURCE
	 * @model name="AssociatedResource"
	 * @generated
	 * @ordered
	 */
	public static final int ASSOCIATED_RESOURCE_VALUE = 1;

	/**
	 * The '<em><b>Depends On</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Depends On</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEPENDS_ON
	 * @model name="DependsOn"
	 * @generated
	 * @ordered
	 */
	public static final int DEPENDS_ON_VALUE = 2;

	/**
	 * The '<em><b>Derived From</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Derived From</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DERIVED_FROM
	 * @model name="DerivedFrom"
	 * @generated
	 * @ordered
	 */
	public static final int DERIVED_FROM_VALUE = 3;

	/**
	 * The '<em><b>Similar To</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Similar To</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIMILAR_TO
	 * @model name="SimilarTo"
	 * @generated
	 * @ordered
	 */
	public static final int SIMILAR_TO_VALUE = 4;

	/**
	 * The '<em><b>Version Of</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Version Of</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VERSION_OF
	 * @model name="VersionOf"
	 * @generated
	 * @ordered
	 */
	public static final int VERSION_OF_VALUE = 5;

	/**
	 * An array of all the '<em><b>Resource Relationship Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ResourceRelationshipType[] VALUES_ARRAY =
		new ResourceRelationshipType[] {
			ADAPTED_FROM,
			ASSOCIATED_RESOURCE,
			DEPENDS_ON,
			DERIVED_FROM,
			SIMILAR_TO,
			VERSION_OF,
		};

	/**
	 * A public read-only list of all the '<em><b>Resource Relationship Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ResourceRelationshipType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Resource Relationship Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResourceRelationshipType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResourceRelationshipType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Resource Relationship Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResourceRelationshipType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResourceRelationshipType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Resource Relationship Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResourceRelationshipType get(int value) {
		switch (value) {
			case ADAPTED_FROM_VALUE: return ADAPTED_FROM;
			case ASSOCIATED_RESOURCE_VALUE: return ASSOCIATED_RESOURCE;
			case DEPENDS_ON_VALUE: return DEPENDS_ON;
			case DERIVED_FROM_VALUE: return DERIVED_FROM;
			case SIMILAR_TO_VALUE: return SIMILAR_TO;
			case VERSION_OF_VALUE: return VERSION_OF;
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
	private ResourceRelationshipType(int value, String name, String literal) {
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
	
} //ResourceRelationshipType
