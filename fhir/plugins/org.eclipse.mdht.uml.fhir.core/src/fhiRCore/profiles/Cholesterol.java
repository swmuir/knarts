/**
 */
package fhiRCore.profiles;

import fhiRCore.resources.Observation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cholesterol</b></em>'.
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
 *   <li>{@link fhiRCore.profiles.Cholesterol#getValueQuantity <em>Value Quantity</em>}</li>
 * </ul>
 *
 * @see fhiRCore.profiles.ProfilesPackage#getCholesterol()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='cholesterol'"
 * @generated
 */
public interface Cholesterol extends Observation {
	/**
	 * Returns the value of the '<em><b>Value Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Quantity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Quantity</em>' containment reference.
	 * @see #setValueQuantity(CholesterolQuantity1)
	 * @see fhiRCore.profiles.ProfilesPackage#getCholesterol_ValueQuantity()
	 * @model containment="true"
	 * @generated
	 */
	CholesterolQuantity1 getValueQuantity();

	/**
	 * Sets the value of the '{@link fhiRCore.profiles.Cholesterol#getValueQuantity <em>Value Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Quantity</em>' containment reference.
	 * @see #getValueQuantity()
	 * @generated
	 */
	void setValueQuantity(CholesterolQuantity1 value);

} // Cholesterol
