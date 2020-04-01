/**
 */
package org.eclipse.mdht.hl7.fhir.profiles;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.profiles.Bp#getSystolicBp <em>Systolic Bp</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.profiles.Bp#getDiastolicBp <em>Diastolic Bp</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.profiles.ProfilesPackage#getBp()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='bp'"
 * @generated
 */
public interface Bp extends Vitalsigns {
	/**
	 * Returns the value of the '<em><b>Systolic Bp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Systolic Bp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Systolic Bp</em>' containment reference.
	 * @see #setSystolicBp(BpComponent11)
	 * @see org.eclipse.mdht.hl7.fhir.profiles.ProfilesPackage#getBp_SystolicBp()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SystolicBP'"
	 * @generated
	 */
	BpComponent11 getSystolicBp();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.profiles.Bp#getSystolicBp <em>Systolic Bp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Systolic Bp</em>' containment reference.
	 * @see #getSystolicBp()
	 * @generated
	 */
	void setSystolicBp(BpComponent11 value);

	/**
	 * Returns the value of the '<em><b>Diastolic Bp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diastolic Bp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diastolic Bp</em>' containment reference.
	 * @see #setDiastolicBp(BpComponent12)
	 * @see org.eclipse.mdht.hl7.fhir.profiles.ProfilesPackage#getBp_DiastolicBp()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DiastolicBP'"
	 * @generated
	 */
	BpComponent12 getDiastolicBp();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.profiles.Bp#getDiastolicBp <em>Diastolic Bp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diastolic Bp</em>' containment reference.
	 * @see #getDiastolicBp()
	 * @generated
	 */
	void setDiastolicBp(BpComponent12 value);

} // Bp
