/**
 */
package org.eclipse.mdht.hl7.fhir.profiles;

import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Headcircum Codeable Concept1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.profiles.HeadcircumCodeableConcept1#getHeadCircumCode <em>Head Circum Code</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.profiles.ProfilesPackage#getHeadcircumCodeableConcept1()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='headcircum_CodeableConcept1'"
 * @generated
 */
public interface HeadcircumCodeableConcept1 extends CodeableConcept {
	/**
	 * Returns the value of the '<em><b>Head Circum Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Head Circum Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Head Circum Code</em>' containment reference.
	 * @see #setHeadCircumCode(HeadcircumCodeableConcept1Coding1)
	 * @see org.eclipse.mdht.hl7.fhir.profiles.ProfilesPackage#getHeadcircumCodeableConcept1_HeadCircumCode()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='HeadCircumCode'"
	 * @generated
	 */
	HeadcircumCodeableConcept1Coding1 getHeadCircumCode();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.profiles.HeadcircumCodeableConcept1#getHeadCircumCode <em>Head Circum Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Head Circum Code</em>' containment reference.
	 * @see #getHeadCircumCode()
	 * @generated
	 */
	void setHeadCircumCode(HeadcircumCodeableConcept1Coding1 value);

} // HeadcircumCodeableConcept1
