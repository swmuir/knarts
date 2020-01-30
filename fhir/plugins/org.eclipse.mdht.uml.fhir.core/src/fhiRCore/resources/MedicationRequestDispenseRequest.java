/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Duration;
import fhiRCore.dataTypes.Period;
import fhiRCore.dataTypes.Quantity;
import fhiRCore.dataTypes.Reference;
import fhiRCore.dataTypes.UnsignedInt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Request Dispense Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.MedicationRequestDispenseRequest#getInitialFill <em>Initial Fill</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationRequestDispenseRequest#getDispenseInterval <em>Dispense Interval</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationRequestDispenseRequest#getValidityPeriod <em>Validity Period</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationRequestDispenseRequest#getNumberOfRepeatsAllowed <em>Number Of Repeats Allowed</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationRequestDispenseRequest#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationRequestDispenseRequest#getExpectedSupplyDuration <em>Expected Supply Duration</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationRequestDispenseRequest#getPerformer <em>Performer</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getMedicationRequestDispenseRequest()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MedicationRequest_DispenseRequest'"
 * @generated
 */
public interface MedicationRequestDispenseRequest extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Initial Fill</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Fill</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Fill</em>' containment reference.
	 * @see #setInitialFill(MedicationRequestDispenseRequestInitialFill)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationRequestDispenseRequest_InitialFill()
	 * @model containment="true"
	 * @generated
	 */
	MedicationRequestDispenseRequestInitialFill getInitialFill();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationRequestDispenseRequest#getInitialFill <em>Initial Fill</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Fill</em>' containment reference.
	 * @see #getInitialFill()
	 * @generated
	 */
	void setInitialFill(MedicationRequestDispenseRequestInitialFill value);

	/**
	 * Returns the value of the '<em><b>Dispense Interval</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dispense Interval</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dispense Interval</em>' containment reference.
	 * @see #setDispenseInterval(Duration)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationRequestDispenseRequest_DispenseInterval()
	 * @model containment="true"
	 * @generated
	 */
	Duration getDispenseInterval();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationRequestDispenseRequest#getDispenseInterval <em>Dispense Interval</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dispense Interval</em>' containment reference.
	 * @see #getDispenseInterval()
	 * @generated
	 */
	void setDispenseInterval(Duration value);

	/**
	 * Returns the value of the '<em><b>Validity Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validity Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validity Period</em>' containment reference.
	 * @see #setValidityPeriod(Period)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationRequestDispenseRequest_ValidityPeriod()
	 * @model containment="true"
	 * @generated
	 */
	Period getValidityPeriod();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationRequestDispenseRequest#getValidityPeriod <em>Validity Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validity Period</em>' containment reference.
	 * @see #getValidityPeriod()
	 * @generated
	 */
	void setValidityPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Number Of Repeats Allowed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Repeats Allowed</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Repeats Allowed</em>' containment reference.
	 * @see #setNumberOfRepeatsAllowed(UnsignedInt)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationRequestDispenseRequest_NumberOfRepeatsAllowed()
	 * @model containment="true"
	 * @generated
	 */
	UnsignedInt getNumberOfRepeatsAllowed();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationRequestDispenseRequest#getNumberOfRepeatsAllowed <em>Number Of Repeats Allowed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Repeats Allowed</em>' containment reference.
	 * @see #getNumberOfRepeatsAllowed()
	 * @generated
	 */
	void setNumberOfRepeatsAllowed(UnsignedInt value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationRequestDispenseRequest_Quantity()
	 * @model containment="true"
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationRequestDispenseRequest#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Expected Supply Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expected Supply Duration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expected Supply Duration</em>' containment reference.
	 * @see #setExpectedSupplyDuration(Duration)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationRequestDispenseRequest_ExpectedSupplyDuration()
	 * @model containment="true"
	 * @generated
	 */
	Duration getExpectedSupplyDuration();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationRequestDispenseRequest#getExpectedSupplyDuration <em>Expected Supply Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Supply Duration</em>' containment reference.
	 * @see #getExpectedSupplyDuration()
	 * @generated
	 */
	void setExpectedSupplyDuration(Duration value);

	/**
	 * Returns the value of the '<em><b>Performer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performer</em>' containment reference.
	 * @see #setPerformer(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationRequestDispenseRequest_Performer()
	 * @model containment="true"
	 * @generated
	 */
	Reference getPerformer();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationRequestDispenseRequest#getPerformer <em>Performer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performer</em>' containment reference.
	 * @see #getPerformer()
	 * @generated
	 */
	void setPerformer(Reference value);

} // MedicationRequestDispenseRequest
