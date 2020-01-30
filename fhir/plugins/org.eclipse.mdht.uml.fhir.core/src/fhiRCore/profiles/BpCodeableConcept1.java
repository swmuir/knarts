/**
 */
package fhiRCore.profiles;

import fhiRCore.dataTypes.CodeableConcept;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bp Codeable Concept1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.profiles.BpCodeableConcept1#getBpCode <em>Bp Code</em>}</li>
 * </ul>
 *
 * @see fhiRCore.profiles.ProfilesPackage#getBpCodeableConcept1()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='bp_CodeableConcept1'"
 * @generated
 */
public interface BpCodeableConcept1 extends CodeableConcept {
	/**
	 * Returns the value of the '<em><b>Bp Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bp Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bp Code</em>' containment reference.
	 * @see #setBpCode(BpCodeableConcept1Coding1)
	 * @see fhiRCore.profiles.ProfilesPackage#getBpCodeableConcept1_BpCode()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='BPCode'"
	 * @generated
	 */
	BpCodeableConcept1Coding1 getBpCode();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.BpCodeableConcept1#getBpCode <em>Bp Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bp Code</em>' containment reference.
	 * @see #getBpCode()
	 * @generated
	 */
	void setBpCode(BpCodeableConcept1Coding1 value);

} // BpCodeableConcept1
