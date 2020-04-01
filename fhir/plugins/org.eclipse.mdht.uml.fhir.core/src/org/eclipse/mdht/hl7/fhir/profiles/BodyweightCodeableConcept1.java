/**
 */
package org.eclipse.mdht.hl7.fhir.profiles;

import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bodyweight Codeable Concept1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.profiles.BodyweightCodeableConcept1#getBodyWeightCode <em>Body Weight Code</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.profiles.ProfilesPackage#getBodyweightCodeableConcept1()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='bodyweight_CodeableConcept1'"
 * @generated
 */
public interface BodyweightCodeableConcept1 extends CodeableConcept {
	/**
	 * Returns the value of the '<em><b>Body Weight Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body Weight Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Weight Code</em>' containment reference.
	 * @see #setBodyWeightCode(BodyweightCodeableConcept1Coding1)
	 * @see org.eclipse.mdht.hl7.fhir.profiles.ProfilesPackage#getBodyweightCodeableConcept1_BodyWeightCode()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='BodyWeightCode'"
	 * @generated
	 */
	BodyweightCodeableConcept1Coding1 getBodyWeightCode();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.profiles.BodyweightCodeableConcept1#getBodyWeightCode <em>Body Weight Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Weight Code</em>' containment reference.
	 * @see #getBodyWeightCode()
	 * @generated
	 */
	void setBodyWeightCode(BodyweightCodeableConcept1Coding1 value);

} // BodyweightCodeableConcept1
