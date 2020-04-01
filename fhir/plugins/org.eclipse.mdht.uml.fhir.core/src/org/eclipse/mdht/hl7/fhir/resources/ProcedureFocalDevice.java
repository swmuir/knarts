/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure Focal Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ProcedureFocalDevice#getAction <em>Action</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.ProcedureFocalDevice#getManipulated <em>Manipulated</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getProcedureFocalDevice()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Procedure_FocalDevice'"
 * @generated
 */
public interface ProcedureFocalDevice extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference.
	 * @see #setAction(CodeableConcept)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getProcedureFocalDevice_Action()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getAction();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ProcedureFocalDevice#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Manipulated</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manipulated</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manipulated</em>' containment reference.
	 * @see #setManipulated(Reference)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getProcedureFocalDevice_Manipulated()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getManipulated();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.ProcedureFocalDevice#getManipulated <em>Manipulated</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manipulated</em>' containment reference.
	 * @see #getManipulated()
	 * @generated
	 */
	void setManipulated(Reference value);

} // ProcedureFocalDevice
