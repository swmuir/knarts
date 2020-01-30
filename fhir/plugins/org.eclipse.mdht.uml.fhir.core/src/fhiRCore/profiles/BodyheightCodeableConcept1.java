/**
 */
package fhiRCore.profiles;

import fhiRCore.dataTypes.CodeableConcept;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bodyheight Codeable Concept1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.profiles.BodyheightCodeableConcept1#getBodyHeightCode <em>Body Height Code</em>}</li>
 * </ul>
 *
 * @see fhiRCore.profiles.ProfilesPackage#getBodyheightCodeableConcept1()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='bodyheight_CodeableConcept1'"
 * @generated
 */
public interface BodyheightCodeableConcept1 extends CodeableConcept {
	/**
	 * Returns the value of the '<em><b>Body Height Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body Height Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Height Code</em>' containment reference.
	 * @see #setBodyHeightCode(BodyheightCodeableConcept1Coding1)
	 * @see fhiRCore.profiles.ProfilesPackage#getBodyheightCodeableConcept1_BodyHeightCode()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='BodyHeightCode'"
	 * @generated
	 */
	BodyheightCodeableConcept1Coding1 getBodyHeightCode();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.BodyheightCodeableConcept1#getBodyHeightCode <em>Body Height Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Height Code</em>' containment reference.
	 * @see #getBodyHeightCode()
	 * @generated
	 */
	void setBodyHeightCode(BodyheightCodeableConcept1Coding1 value);

} // BodyheightCodeableConcept1
