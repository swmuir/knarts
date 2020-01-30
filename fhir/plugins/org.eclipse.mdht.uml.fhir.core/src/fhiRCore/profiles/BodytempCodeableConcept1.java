/**
 */
package fhiRCore.profiles;

import fhiRCore.dataTypes.CodeableConcept;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bodytemp Codeable Concept1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.profiles.BodytempCodeableConcept1#getBodyTempCode <em>Body Temp Code</em>}</li>
 * </ul>
 *
 * @see fhiRCore.profiles.ProfilesPackage#getBodytempCodeableConcept1()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='bodytemp_CodeableConcept1'"
 * @generated
 */
public interface BodytempCodeableConcept1 extends CodeableConcept {
	/**
	 * Returns the value of the '<em><b>Body Temp Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body Temp Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Temp Code</em>' containment reference.
	 * @see #setBodyTempCode(BodytempCodeableConcept1Coding1)
	 * @see fhiRCore.profiles.ProfilesPackage#getBodytempCodeableConcept1_BodyTempCode()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='BodyTempCode'"
	 * @generated
	 */
	BodytempCodeableConcept1Coding1 getBodyTempCode();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.BodytempCodeableConcept1#getBodyTempCode <em>Body Temp Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Temp Code</em>' containment reference.
	 * @see #getBodyTempCode()
	 * @generated
	 */
	void setBodyTempCode(BodytempCodeableConcept1Coding1 value);

} // BodytempCodeableConcept1
