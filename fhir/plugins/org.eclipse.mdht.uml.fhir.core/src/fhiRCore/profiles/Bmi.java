/**
 */
package fhiRCore.profiles;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bmi</b></em>'.
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
 *   <li>{@link fhiRCore.profiles.Bmi#getValueQuantity <em>Value Quantity</em>}</li>
 * </ul>
 *
 * @see fhiRCore.profiles.ProfilesPackage#getBmi()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='bmi'"
 * @generated
 */
public interface Bmi extends Vitalsigns {
	/**
	 * Returns the value of the '<em><b>Value Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Quantity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Quantity</em>' containment reference.
	 * @see #setValueQuantity(BmiQuantity1)
	 * @see fhiRCore.profiles.ProfilesPackage#getBmi_ValueQuantity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	BmiQuantity1 getValueQuantity();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.Bmi#getValueQuantity <em>Value Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Quantity</em>' containment reference.
	 * @see #getValueQuantity()
	 * @generated
	 */
	void setValueQuantity(BmiQuantity1 value);

} // Bmi
