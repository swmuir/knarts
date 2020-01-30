/**
 */
package fhiRCore.profiles;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bp Component12</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.profiles.BpComponent12#getValueQuantity <em>Value Quantity</em>}</li>
 * </ul>
 *
 * @see fhiRCore.profiles.ProfilesPackage#getBpComponent12()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='bp_Component12'"
 * @generated
 */
public interface BpComponent12 extends VitalsignsComponent1 {
	/**
	 * Returns the value of the '<em><b>Value Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Quantity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Quantity</em>' containment reference.
	 * @see #setValueQuantity(BpComponent12Quantity1)
	 * @see fhiRCore.profiles.ProfilesPackage#getBpComponent12_ValueQuantity()
	 * @model containment="true"
	 * @generated
	 */
	BpComponent12Quantity1 getValueQuantity();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.BpComponent12#getValueQuantity <em>Value Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Quantity</em>' containment reference.
	 * @see #getValueQuantity()
	 * @generated
	 */
	void setValueQuantity(BpComponent12Quantity1 value);

} // BpComponent12
