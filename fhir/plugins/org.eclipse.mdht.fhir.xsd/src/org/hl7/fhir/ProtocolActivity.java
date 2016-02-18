/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protocol Activity</b></em>'.
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
 *   <li>{@link org.hl7.fhir.ProtocolActivity#getAlternative <em>Alternative</em>}</li>
 *   <li>{@link org.hl7.fhir.ProtocolActivity#getComponent <em>Component</em>}</li>
 *   <li>{@link org.hl7.fhir.ProtocolActivity#getFollowing <em>Following</em>}</li>
 *   <li>{@link org.hl7.fhir.ProtocolActivity#getWait <em>Wait</em>}</li>
 *   <li>{@link org.hl7.fhir.ProtocolActivity#getDetail <em>Detail</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getProtocolActivity()
 * @model extendedMetaData="name='Protocol.Activity' kind='elementOnly'"
 * @generated
 */
public interface ProtocolActivity extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Alternative</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Uri}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * What can be done instead?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alternative</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProtocolActivity_Alternative()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='alternative' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Uri> getAlternative();

	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ProtocolComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Activities that are part of this activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProtocolActivity_Component()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='component' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ProtocolComponent> getComponent();

	/**
	 * Returns the value of the '<em><b>Following</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Uri}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * What happens next.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Following</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getProtocolActivity_Following()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='following' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Uri> getFollowing();

	/**
	 * Returns the value of the '<em><b>Wait</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the length of time to wait between the conditions being satisfied for the activity to start and the actual start of the activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wait</em>' containment reference.
	 * @see #setWait(Duration)
	 * @see org.hl7.fhir.FhirPackage#getProtocolActivity_Wait()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='wait' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getWait();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProtocolActivity#getWait <em>Wait</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wait</em>' containment reference.
	 * @see #getWait()
	 * @generated
	 */
	void setWait(Duration value);

	/**
	 * Returns the value of the '<em><b>Detail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information about the nature of the activity, including type, timing and other qualifiers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Detail</em>' containment reference.
	 * @see #setDetail(ProtocolDetail)
	 * @see org.hl7.fhir.FhirPackage#getProtocolActivity_Detail()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='detail' namespace='##targetNamespace'"
	 * @generated
	 */
	ProtocolDetail getDetail();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ProtocolActivity#getDetail <em>Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail</em>' containment reference.
	 * @see #getDetail()
	 * @generated
	 */
	void setDetail(ProtocolDetail value);

} // ProtocolActivity
