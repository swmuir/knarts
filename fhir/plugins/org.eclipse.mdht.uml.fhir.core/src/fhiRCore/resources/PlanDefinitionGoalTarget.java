/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Duration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plan Definition Goal Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.PlanDefinitionGoalTarget#getMeasure <em>Measure</em>}</li>
 *   <li>{@link fhiRCore.resources.PlanDefinitionGoalTarget#getDetailx <em>Detailx</em>}</li>
 *   <li>{@link fhiRCore.resources.PlanDefinitionGoalTarget#getDue <em>Due</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getPlanDefinitionGoalTarget()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Goal_Target'"
 * @generated
 */
public interface PlanDefinitionGoalTarget extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getPlanDefinitionGoalTarget_Measure()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getMeasure();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PlanDefinitionGoalTarget#getMeasure <em>Measure</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getPlanDefinitionGoalTarget_Detailx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='detail[x]'"
	 * @generated
	 */
	DataType getDetailx();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PlanDefinitionGoalTarget#getDetailx <em>Detailx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detailx</em>' containment reference.
	 * @see #getDetailx()
	 * @generated
	 */
	void setDetailx(DataType value);

	/**
	 * Returns the value of the '<em><b>Due</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Due</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Due</em>' containment reference.
	 * @see #setDue(Duration)
	 * @see fhiRCore.resources.ResourcesPackage#getPlanDefinitionGoalTarget_Due()
	 * @model containment="true"
	 * @generated
	 */
	Duration getDue();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.PlanDefinitionGoalTarget#getDue <em>Due</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Due</em>' containment reference.
	 * @see #getDue()
	 * @generated
	 */
	void setDue(Duration value);

} // PlanDefinitionGoalTarget
