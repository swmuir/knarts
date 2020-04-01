/**
 */
package org.eclipse.mdht.hl7.fhir.profiles;

import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bmi Codeable Concept1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.profiles.BmiCodeableConcept1#getBmiCode <em>Bmi Code</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.profiles.ProfilesPackage#getBmiCodeableConcept1()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='bmi_CodeableConcept1'"
 * @generated
 */
public interface BmiCodeableConcept1 extends CodeableConcept {
	/**
	 * Returns the value of the '<em><b>Bmi Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bmi Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bmi Code</em>' containment reference.
	 * @see #setBmiCode(BmiCodeableConcept1Coding1)
	 * @see org.eclipse.mdht.hl7.fhir.profiles.ProfilesPackage#getBmiCodeableConcept1_BmiCode()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='BMICode'"
	 * @generated
	 */
	BmiCodeableConcept1Coding1 getBmiCode();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.profiles.BmiCodeableConcept1#getBmiCode <em>Bmi Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bmi Code</em>' containment reference.
	 * @see #getBmiCode()
	 * @generated
	 */
	void setBmiCode(BmiCodeableConcept1Coding1 value);

} // BmiCodeableConcept1
