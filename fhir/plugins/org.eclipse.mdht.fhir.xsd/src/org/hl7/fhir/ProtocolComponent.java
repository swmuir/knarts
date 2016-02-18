/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protocol Component</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ProtocolComponent#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.ProtocolComponent#getActivity <em>Activity</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getProtocolComponent()
 * @model extendedMetaData="name='Protocol.Component' kind='elementOnly'"
 * @generated
 */
public interface ProtocolComponent extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Order of occurrence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequence</em>' containment reference.
	 * @see #setSequence(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getProtocolComponent_Sequence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sequence' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getSequence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProtocolComponent#getSequence <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' containment reference.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Component activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference.
	 * @see #setActivity(Uri)
	 * @see org.hl7.fhir.FhirPackage#getProtocolComponent_Activity()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='activity' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getActivity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProtocolComponent#getActivity <em>Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' containment reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Uri value);

} // ProtocolComponent
