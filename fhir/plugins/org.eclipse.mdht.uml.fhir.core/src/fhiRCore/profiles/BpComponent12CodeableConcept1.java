/**
 */
package fhiRCore.profiles;

import fhiRCore.dataTypes.CodeableConcept;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bp Component12 Codeable Concept1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.profiles.BpComponent12CodeableConcept1#getDbpCode <em>Dbp Code</em>}</li>
 * </ul>
 *
 * @see fhiRCore.profiles.ProfilesPackage#getBpComponent12CodeableConcept1()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Component12_CodeableConcept1'"
 * @generated
 */
public interface BpComponent12CodeableConcept1 extends CodeableConcept {
	/**
	 * Returns the value of the '<em><b>Dbp Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dbp Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dbp Code</em>' containment reference.
	 * @see #setDbpCode(BpComponent12CodeableConcept1Coding1)
	 * @see fhiRCore.profiles.ProfilesPackage#getBpComponent12CodeableConcept1_DbpCode()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DBPCode'"
	 * @generated
	 */
	BpComponent12CodeableConcept1Coding1 getDbpCode();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.BpComponent12CodeableConcept1#getDbpCode <em>Dbp Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dbp Code</em>' containment reference.
	 * @see #getDbpCode()
	 * @generated
	 */
	void setDbpCode(BpComponent12CodeableConcept1Coding1 value);

} // BpComponent12CodeableConcept1
