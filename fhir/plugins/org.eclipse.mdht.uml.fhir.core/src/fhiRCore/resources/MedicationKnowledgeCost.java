/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Money;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Knowledge Cost</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.MedicationKnowledgeCost#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationKnowledgeCost#getSource <em>Source</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationKnowledgeCost#getCost <em>Cost</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getMedicationKnowledgeCost()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MedicationKnowledge_Cost'"
 * @generated
 */
public interface MedicationKnowledgeCost extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationKnowledgeCost_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationKnowledgeCost#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationKnowledgeCost_Source()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getSource();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationKnowledgeCost#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' containment reference.
	 * @see #setCost(Money)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationKnowledgeCost_Cost()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Money getCost();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationKnowledgeCost#getCost <em>Cost</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' containment reference.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(Money value);

} // MedicationKnowledgeCost
