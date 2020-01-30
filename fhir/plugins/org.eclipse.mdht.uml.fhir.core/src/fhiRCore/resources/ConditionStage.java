/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Stage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ConditionStage#getSummary <em>Summary</em>}</li>
 *   <li>{@link fhiRCore.resources.ConditionStage#getAssessments <em>Assessment</em>}</li>
 *   <li>{@link fhiRCore.resources.ConditionStage#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getConditionStage()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Condition_Stage'"
 * @generated
 */
public interface ConditionStage extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Summary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Summary</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Summary</em>' containment reference.
	 * @see #setSummary(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getConditionStage_Summary()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getSummary();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ConditionStage#getSummary <em>Summary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary</em>' containment reference.
	 * @see #getSummary()
	 * @generated
	 */
	void setSummary(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Assessment</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assessment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assessment</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getConditionStage_Assessment()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getAssessments();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getConditionStage_Type()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ConditionStage#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

} // ConditionStage
