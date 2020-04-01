/**
 */
package org.eclipse.mdht.hl7.fhir.profiles;

import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Oxygensat Codeable Concept1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.profiles.OxygensatCodeableConcept1#getOxygenSatCode <em>Oxygen Sat Code</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.profiles.ProfilesPackage#getOxygensatCodeableConcept1()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='oxygensat_CodeableConcept1'"
 * @generated
 */
public interface OxygensatCodeableConcept1 extends CodeableConcept {
	/**
	 * Returns the value of the '<em><b>Oxygen Sat Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oxygen Sat Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oxygen Sat Code</em>' containment reference.
	 * @see #setOxygenSatCode(OxygensatCodeableConcept1Coding1)
	 * @see org.eclipse.mdht.hl7.fhir.profiles.ProfilesPackage#getOxygensatCodeableConcept1_OxygenSatCode()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='OxygenSatCode'"
	 * @generated
	 */
	OxygensatCodeableConcept1Coding1 getOxygenSatCode();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.profiles.OxygensatCodeableConcept1#getOxygenSatCode <em>Oxygen Sat Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oxygen Sat Code</em>' containment reference.
	 * @see #getOxygenSatCode()
	 * @generated
	 */
	void setOxygenSatCode(OxygensatCodeableConcept1Coding1 value);

} // OxygensatCodeableConcept1
