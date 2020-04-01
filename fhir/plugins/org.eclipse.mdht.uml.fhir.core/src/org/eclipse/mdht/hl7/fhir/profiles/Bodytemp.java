/**
 */
package org.eclipse.mdht.hl7.fhir.profiles;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bodytemp</b></em>'.
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
 *   <li>{@link org.eclipse.mdht.hl7.fhir.profiles.Bodytemp#getValueQuantity <em>Value Quantity</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.profiles.ProfilesPackage#getBodytemp()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='bodytemp'"
 * @generated
 */
public interface Bodytemp extends Vitalsigns {
	/**
	 * Returns the value of the '<em><b>Value Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Quantity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Quantity</em>' containment reference.
	 * @see #setValueQuantity(BodytempQuantity1)
	 * @see org.eclipse.mdht.hl7.fhir.profiles.ProfilesPackage#getBodytemp_ValueQuantity()
	 * @model containment="true"
	 * @generated
	 */
	BodytempQuantity1 getValueQuantity();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.profiles.Bodytemp#getValueQuantity <em>Value Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Quantity</em>' containment reference.
	 * @see #getValueQuantity()
	 * @generated
	 */
	void setValueQuantity(BodytempQuantity1 value);

} // Bodytemp