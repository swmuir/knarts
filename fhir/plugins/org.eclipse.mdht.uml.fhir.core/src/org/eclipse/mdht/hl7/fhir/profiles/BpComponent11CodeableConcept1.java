/**
 */
package org.eclipse.mdht.hl7.fhir.profiles;

import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bp Component11 Codeable Concept1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.profiles.BpComponent11CodeableConcept1#getSbpCode <em>Sbp Code</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.profiles.ProfilesPackage#getBpComponent11CodeableConcept1()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Component11_CodeableConcept1'"
 * @generated
 */
public interface BpComponent11CodeableConcept1 extends CodeableConcept {
	/**
	 * Returns the value of the '<em><b>Sbp Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sbp Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sbp Code</em>' containment reference.
	 * @see #setSbpCode(BpComponent11CodeableConcept1Coding1)
	 * @see org.eclipse.mdht.hl7.fhir.profiles.ProfilesPackage#getBpComponent11CodeableConcept1_SbpCode()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SBPCode'"
	 * @generated
	 */
	BpComponent11CodeableConcept1Coding1 getSbpCode();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.profiles.BpComponent11CodeableConcept1#getSbpCode <em>Sbp Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sbp Code</em>' containment reference.
	 * @see #getSbpCode()
	 * @generated
	 */
	void setSbpCode(BpComponent11CodeableConcept1Coding1 value);

} // BpComponent11CodeableConcept1
