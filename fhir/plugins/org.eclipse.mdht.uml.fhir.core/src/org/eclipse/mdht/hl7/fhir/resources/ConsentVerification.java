/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.DateTime;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consent Verification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ConsentVerification#getVerified <em>Verified</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ConsentVerification#getVerifiedWith <em>Verified With</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ConsentVerification#getVerificationDate <em>Verification Date</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getConsentVerification()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Consent_Verification'"
 * @generated
 */
public interface ConsentVerification extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Verified</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verified</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verified</em>' containment reference.
	 * @see #setVerified(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getConsentVerification_Verified()
	 * @model containment="true" required="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.Boolean getVerified();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ConsentVerification#getVerified <em>Verified</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verified</em>' containment reference.
	 * @see #getVerified()
	 * @generated
	 */
	void setVerified(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Verified With</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verified With</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verified With</em>' containment reference.
	 * @see #setVerifiedWith(Reference)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getConsentVerification_VerifiedWith()
	 * @model containment="true"
	 * @generated
	 */
	Reference getVerifiedWith();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ConsentVerification#getVerifiedWith <em>Verified With</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verified With</em>' containment reference.
	 * @see #getVerifiedWith()
	 * @generated
	 */
	void setVerifiedWith(Reference value);

	/**
	 * Returns the value of the '<em><b>Verification Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verification Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verification Date</em>' containment reference.
	 * @see #setVerificationDate(DateTime)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getConsentVerification_VerificationDate()
	 * @model containment="true"
	 * @generated
	 */
	DateTime getVerificationDate();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ConsentVerification#getVerificationDate <em>Verification Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verification Date</em>' containment reference.
	 * @see #getVerificationDate()
	 * @generated
	 */
	void setVerificationDate(DateTime value);

} // ConsentVerification
