/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eligibility Response Authorization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource provides eligibility and plan details from the processing of an Eligibility resource.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.EligibilityResponseAuthorization#getAuthorizationSequence <em>Authorization Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityResponseAuthorization#getRequired <em>Required</em>}</li>
 *   <li>{@link org.hl7.fhir.EligibilityResponseAuthorization#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getEligibilityResponseAuthorization()
 * @model extendedMetaData="name='EligibilityResponse.Authorization' kind='elementOnly'"
 * @generated
 */
public interface EligibilityResponseAuthorization extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Authorization Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sequence of procedures which serves to order and provide a link.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Authorization Sequence</em>' containment reference.
	 * @see #setAuthorizationSequence(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityResponseAuthorization_AuthorizationSequence()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='authorizationSequence' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getAuthorizationSequence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityResponseAuthorization#getAuthorizationSequence <em>Authorization Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorization Sequence</em>' containment reference.
	 * @see #getAuthorizationSequence()
	 * @generated
	 */
	void setAuthorizationSequence(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A boolean flag indicating whether a prior authorization or pre-authorization is required prior to actual service delivery.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required</em>' containment reference.
	 * @see #setRequired(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getEligibilityResponseAuthorization_Required()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='required' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getRequired();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EligibilityResponseAuthorization#getRequired <em>Required</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' containment reference.
	 * @see #getRequired()
	 * @generated
	 */
	void setRequired(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any comments regarding information or actions assciated with the pre-authorization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEligibilityResponseAuthorization_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getNote();

} // EligibilityResponseAuthorization
