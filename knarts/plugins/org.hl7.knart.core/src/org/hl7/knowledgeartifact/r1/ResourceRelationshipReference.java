/**
 */
package org.hl7.knowledgeartifact.r1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Relationship Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ResourceRelationshipReference defines the
 * 				association between a resource and a resource set. If one consider
 * 				such relationship as a triple (subject-predicate-object or
 * 				node-arc-node) with the source entity as the subject of the triple,
 * 				then ResourceRelationshipType defines the predicate and the object
 * 				of this relationship.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r1.ResourceRelationshipReference#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.ResourceRelationshipReference#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r1.R1Package#getResourceRelationshipReference()
 * @model extendedMetaData="name='ResourceRelationshipReference' kind='elementOnly'"
 * @generated
 */
public interface ResourceRelationshipReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relationship defines the association between two
	 * 						resources - i.e., the predicate/arc of a triple. The object of the
	 * 						relationship is often a pre-existing resource that predates the
	 * 						subject of the relationship. This predicate can be one of six
	 * 						types: (1) AdaptedFrom - the subject was adapted from the object
	 * 						of the relationship. For instance, a diabetes visit order set may
	 * 						be adapted from the HbA1c reminder (2) AssociatedResource - the
	 * 						object is associated with the subject. For instance, an HbA1c
	 * 						reminder may be associated with an HbA1c eMeasure (3) DependsOn -
	 * 						the subject depends on the object. For instance, an HbA1c reminder
	 * 						may depend on a Diabetes Value Set (4) DerivedFrom - the subject
	 * 						was derived from the object. For instance, an HbA1c reminder rule
	 * 						may be derived from a Diabetes Guideline (5) SimilarTo - the
	 * 						subject and object are similar. For instance, an HbA1c reminder
	 * 						may be similar to an LDL reminder and (6) VersionOf - the subject
	 * 						is a version of the object (and vice-versa). For instance, the
	 * 						HbA1c reminder v2 may be a version of the HbA1c reminder v1.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relationship</em>' containment reference.
	 * @see #setRelationship(RelationshipType)
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getResourceRelationshipReference_Relationship()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='relationship' namespace='##targetNamespace'"
	 * @generated
	 */
	RelationshipType getRelationship();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r1.ResourceRelationshipReference#getRelationship <em>Relationship</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship</em>' containment reference.
	 * @see #getRelationship()
	 * @generated
	 */
	void setRelationship(RelationshipType value);

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of resources associated with the subject
	 * 						of this relationship.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference.
	 * @see #setResources(ResourcesType)
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getResourceRelationshipReference_Resources()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='resources' namespace='##targetNamespace'"
	 * @generated
	 */
	ResourcesType getResources();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r1.ResourceRelationshipReference#getResources <em>Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resources</em>' containment reference.
	 * @see #getResources()
	 * @generated
	 */
	void setResources(ResourcesType value);

} // ResourceRelationshipReference
