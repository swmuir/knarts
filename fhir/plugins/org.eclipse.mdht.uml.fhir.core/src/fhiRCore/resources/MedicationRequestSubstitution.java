/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Request Substitution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.MedicationRequestSubstitution#getAllowedx <em>Allowedx</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationRequestSubstitution#getReason <em>Reason</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getMedicationRequestSubstitution()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MedicationRequest_Substitution'"
 * @generated
 */
public interface MedicationRequestSubstitution extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Allowedx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allowedx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowedx</em>' containment reference.
	 * @see #setAllowedx(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationRequestSubstitution_Allowedx()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='allowed[x]'"
	 * @generated
	 */
	DataType getAllowedx();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationRequestSubstitution#getAllowedx <em>Allowedx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowedx</em>' containment reference.
	 * @see #getAllowedx()
	 * @generated
	 */
	void setAllowedx(DataType value);

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason</em>' containment reference.
	 * @see #setReason(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationRequestSubstitution_Reason()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getReason();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationRequestSubstitution#getReason <em>Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason</em>' containment reference.
	 * @see #getReason()
	 * @generated
	 */
	void setReason(CodeableConcept value);

} // MedicationRequestSubstitution
