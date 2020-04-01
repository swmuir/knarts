/**
 */
package org.eclipse.mdht.hl7.fhir.profiles;

import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Heartrate Codeable Concept1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.profiles.HeartrateCodeableConcept1#getHeartRateCode <em>Heart Rate Code</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.profiles.ProfilesPackage#getHeartrateCodeableConcept1()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='heartrate_CodeableConcept1'"
 * @generated
 */
public interface HeartrateCodeableConcept1 extends CodeableConcept {
	/**
	 * Returns the value of the '<em><b>Heart Rate Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heart Rate Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heart Rate Code</em>' containment reference.
	 * @see #setHeartRateCode(HeartrateCodeableConcept1Coding1)
	 * @see org.eclipse.mdht.hl7.fhir.profiles.ProfilesPackage#getHeartrateCodeableConcept1_HeartRateCode()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='HeartRateCode'"
	 * @generated
	 */
	HeartrateCodeableConcept1Coding1 getHeartRateCode();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.profiles.HeartrateCodeableConcept1#getHeartRateCode <em>Heart Rate Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heart Rate Code</em>' containment reference.
	 * @see #getHeartRateCode()
	 * @generated
	 */
	void setHeartRateCode(HeartrateCodeableConcept1Coding1 value);

} // HeartrateCodeableConcept1
