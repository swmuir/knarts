/**
 */
package fhiRCore.profiles;

import fhiRCore.dataTypes.CodeableConcept;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resprate Codeable Concept1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.profiles.ResprateCodeableConcept1#getRespRateCode <em>Resp Rate Code</em>}</li>
 * </ul>
 *
 * @see fhiRCore.profiles.ProfilesPackage#getResprateCodeableConcept1()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='resprate_CodeableConcept1'"
 * @generated
 */
public interface ResprateCodeableConcept1 extends CodeableConcept {
	/**
	 * Returns the value of the '<em><b>Resp Rate Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resp Rate Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resp Rate Code</em>' containment reference.
	 * @see #setRespRateCode(ResprateCodeableConcept1Coding1)
	 * @see fhiRCore.profiles.ProfilesPackage#getResprateCodeableConcept1_RespRateCode()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='RespRateCode'"
	 * @generated
	 */
	ResprateCodeableConcept1Coding1 getRespRateCode();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.ResprateCodeableConcept1#getRespRateCode <em>Resp Rate Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resp Rate Code</em>' containment reference.
	 * @see #getRespRateCode()
	 * @generated
	 */
	void setRespRateCode(ResprateCodeableConcept1Coding1 value);

} // ResprateCodeableConcept1
