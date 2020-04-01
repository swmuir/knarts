/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.GoalTarget#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.GoalTarget#getDetailx <em>Detailx</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.GoalTarget#getDuex <em>Duex</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getGoalTarget()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Goal_Target'"
 * @generated
 */
public interface GoalTarget extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure</em>' containment reference.
	 * @see #setMeasure(CodeableConcept)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getGoalTarget_Measure()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getMeasure();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.GoalTarget#getMeasure <em>Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure</em>' containment reference.
	 * @see #getMeasure()
	 * @generated
	 */
	void setMeasure(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Detailx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detailx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detailx</em>' containment reference.
	 * @see #setDetailx(DataType)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getGoalTarget_Detailx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='detail[x]'"
	 * @generated
	 */
	DataType getDetailx();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.GoalTarget#getDetailx <em>Detailx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detailx</em>' containment reference.
	 * @see #getDetailx()
	 * @generated
	 */
	void setDetailx(DataType value);

	/**
	 * Returns the value of the '<em><b>Duex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duex</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duex</em>' containment reference.
	 * @see #setDuex(DataType)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getGoalTarget_Duex()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='due[x]'"
	 * @generated
	 */
	DataType getDuex();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.GoalTarget#getDuex <em>Duex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duex</em>' containment reference.
	 * @see #getDuex()
	 * @generated
	 */
	void setDuex(DataType value);

} // GoalTarget
