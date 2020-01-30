/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Duration;
import fhiRCore.dataTypes.Quantity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Request Dispense Request Initial Fill</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.MedicationRequestDispenseRequestInitialFill#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationRequestDispenseRequestInitialFill#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getMedicationRequestDispenseRequestInitialFill()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DispenseRequest_InitialFill'"
 * @generated
 */
public interface MedicationRequestDispenseRequestInitialFill extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(Quantity)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationRequestDispenseRequestInitialFill_Quantity()
	 * @model containment="true"
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationRequestDispenseRequestInitialFill#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' containment reference.
	 * @see #setDuration(Duration)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationRequestDispenseRequestInitialFill_Duration()
	 * @model containment="true"
	 * @generated
	 */
	Duration getDuration();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationRequestDispenseRequestInitialFill#getDuration <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' containment reference.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(Duration value);

} // MedicationRequestDispenseRequestInitialFill
