/**
 */
package org.hl7.knowledgeartifact.r1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Artifact Life Cycle Event Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * A version of an artifact may have different actions performed on it during the course of its life cycle.  Each action is considered an artifact life cycle event, and may be recorded in the history of that version of the artifact.
 * 
 * See the Implementation Guide for a state-transition diagram showing the legal transitions from each state; each transition is equivalent to an event.
 * <!-- end-model-doc -->
 * @see org.hl7.knowledgeartifact.r1.R1Package#getArtifactLifeCycleEventType()
 * @model extendedMetaData="name='ArtifactLifeCycleEventType'"
 * @generated
 */
public enum ArtifactLifeCycleEventType implements Enumerator {
	/**
	 * The '<em><b>Created</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CREATED_VALUE
	 * @generated
	 * @ordered
	 */
	CREATED(0, "Created", "Created"),

	/**
	 * The '<em><b>Pre Published</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRE_PUBLISHED_VALUE
	 * @generated
	 * @ordered
	 */
	PRE_PUBLISHED(1, "PrePublished", "Pre-published"),

	/**
	 * The '<em><b>Published</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLISHED_VALUE
	 * @generated
	 * @ordered
	 */
	PUBLISHED(2, "Published", "Published"),

	/**
	 * The '<em><b>Reviewed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REVIEWED_VALUE
	 * @generated
	 * @ordered
	 */
	REVIEWED(3, "Reviewed", "Reviewed"),

	/**
	 * The '<em><b>Withdrawn</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WITHDRAWN_VALUE
	 * @generated
	 * @ordered
	 */
	WITHDRAWN(4, "Withdrawn", "Withdrawn"),

	/**
	 * The '<em><b>Superseded</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPERSEDED_VALUE
	 * @generated
	 * @ordered
	 */
	SUPERSEDED(5, "Superseded", "Superseded");

	/**
	 * The '<em><b>Created</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date/time when a particular version of an artifact is created may be recorded in the history of the artifact-version.
	 * <!-- end-model-doc -->
	 * @see #CREATED
	 * @model name="Created"
	 * @generated
	 * @ordered
	 */
	public static final int CREATED_VALUE = 0;

	/**
	 * The '<em><b>Pre Published</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An artifact may be made available to consumers in a pre-publication state for public commentary, etc., or may simply be made available for review internal to the publisher.  This event can be recorded in the artifact-version's history.
	 * <!-- end-model-doc -->
	 * @see #PRE_PUBLISHED
	 * @model name="PrePublished" literal="Pre-published"
	 * @generated
	 * @ordered
	 */
	public static final int PRE_PUBLISHED_VALUE = 1;

	/**
	 * The '<em><b>Published</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Published</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PUBLISHED
	 * @model name="Published"
	 * @generated
	 * @ordered
	 */
	public static final int PUBLISHED_VALUE = 2;

	/**
	 * The '<em><b>Reviewed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A specific version of artifact may be reviewed by parties internal or external to the publisher, and this can be recorded in the lifecycle of the artifact-version.
	 * <!-- end-model-doc -->
	 * @see #REVIEWED
	 * @model name="Reviewed"
	 * @generated
	 * @ordered
	 */
	public static final int REVIEWED_VALUE = 3;

	/**
	 * The '<em><b>Withdrawn</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A specific version of an artifact may be withdrawn by a publisher for various reasons.
	 * <!-- end-model-doc -->
	 * @see #WITHDRAWN
	 * @model name="Withdrawn"
	 * @generated
	 * @ordered
	 */
	public static final int WITHDRAWN_VALUE = 4;

	/**
	 * The '<em><b>Superseded</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A specific version of an artifact may be superseded by another version of that same artifact, or by another artifact altogether.
	 * <!-- end-model-doc -->
	 * @see #SUPERSEDED
	 * @model name="Superseded"
	 * @generated
	 * @ordered
	 */
	public static final int SUPERSEDED_VALUE = 5;

	/**
	 * An array of all the '<em><b>Artifact Life Cycle Event Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ArtifactLifeCycleEventType[] VALUES_ARRAY =
		new ArtifactLifeCycleEventType[] {
			CREATED,
			PRE_PUBLISHED,
			PUBLISHED,
			REVIEWED,
			WITHDRAWN,
			SUPERSEDED,
		};

	/**
	 * A public read-only list of all the '<em><b>Artifact Life Cycle Event Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ArtifactLifeCycleEventType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Artifact Life Cycle Event Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ArtifactLifeCycleEventType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ArtifactLifeCycleEventType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Artifact Life Cycle Event Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ArtifactLifeCycleEventType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ArtifactLifeCycleEventType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Artifact Life Cycle Event Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ArtifactLifeCycleEventType get(int value) {
		switch (value) {
			case CREATED_VALUE: return CREATED;
			case PRE_PUBLISHED_VALUE: return PRE_PUBLISHED;
			case PUBLISHED_VALUE: return PUBLISHED;
			case REVIEWED_VALUE: return REVIEWED;
			case WITHDRAWN_VALUE: return WITHDRAWN;
			case SUPERSEDED_VALUE: return SUPERSEDED;
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
	private ArtifactLifeCycleEventType(int value, String name, String literal) {
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
	
} //ArtifactLifeCycleEventType
