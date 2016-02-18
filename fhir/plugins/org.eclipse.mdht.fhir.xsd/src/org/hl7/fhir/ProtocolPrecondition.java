/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protocol Precondition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A definition of behaviors to be taken in particular circumstances, often including conditions, options and other decision points.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ProtocolPrecondition#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.ProtocolPrecondition#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.hl7.fhir.ProtocolPrecondition#getIntersection <em>Intersection</em>}</li>
 *   <li>{@link org.hl7.fhir.ProtocolPrecondition#getUnion <em>Union</em>}</li>
 *   <li>{@link org.hl7.fhir.ProtocolPrecondition#getExclude <em>Exclude</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getProtocolPrecondition()
 * @model extendedMetaData="name='Protocol.Precondition' kind='elementOnly'"
 * @generated
 */
public interface ProtocolPrecondition extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Human-readable description of the condition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getProtocolPrecondition_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProtocolPrecondition#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the name/value pair that must hold for the condition to be met.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(ProtocolCondition)
	 * @see org.hl7.fhir.FhirPackage#getProtocolPrecondition_Condition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='condition' namespace='##targetNamespace'"
	 * @generated
	 */
	ProtocolCondition getCondition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProtocolPrecondition#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(ProtocolCondition value);

	/**
	 * Returns the value of the '<em><b>Intersection</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ProtocolPrecondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lists a set of conditions that must all be met.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Intersection</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProtocolPrecondition_Intersection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='intersection' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ProtocolPrecondition> getIntersection();

	/**
	 * Returns the value of the '<em><b>Union</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ProtocolPrecondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lists alternative conditions, at least one of must be met.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Union</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProtocolPrecondition_Union()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='union' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ProtocolPrecondition> getUnion();

	/**
	 * Returns the value of the '<em><b>Exclude</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ProtocolPrecondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lists conditions of which none must be met.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exclude</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProtocolPrecondition_Exclude()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='exclude' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ProtocolPrecondition> getExclude();

} // ProtocolPrecondition
