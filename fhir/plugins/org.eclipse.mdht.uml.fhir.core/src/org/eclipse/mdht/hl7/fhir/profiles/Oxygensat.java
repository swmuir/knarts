/**
 */
package org.eclipse.mdht.hl7.fhir.profiles;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Oxygensat</b></em>'.
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
 *   <li>{@link org.eclipse.mdht.hl7.fhir.profiles.Oxygensat#getValueQuantity <em>Value Quantity</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.profiles.ProfilesPackage#getOxygensat()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='oxygensat'"
 * @generated
 */
public interface Oxygensat extends Vitalsigns {
	/**
	 * Returns the value of the '<em><b>Value Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Quantity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Quantity</em>' containment reference.
	 * @see #setValueQuantity(OxygensatQuantity1)
	 * @see org.eclipse.mdht.hl7.fhir.profiles.ProfilesPackage#getOxygensat_ValueQuantity()
	 * @model containment="true"
	 * @generated
	 */
	OxygensatQuantity1 getValueQuantity();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.profiles.Oxygensat#getValueQuantity <em>Value Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Quantity</em>' containment reference.
	 * @see #getValueQuantity()
	 * @generated
	 */
	void setValueQuantity(OxygensatQuantity1 value);

} // Oxygensat
