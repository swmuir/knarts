/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Dispense Substitution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.MedicationDispenseSubstitution#getWasSubstituted <em>Was Substituted</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationDispenseSubstitution#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationDispenseSubstitution#getReasons <em>Reason</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationDispenseSubstitution#getResponsibleParties <em>Responsible Party</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getMedicationDispenseSubstitution()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MedicationDispense_Substitution'"
 * @generated
 */
public interface MedicationDispenseSubstitution extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Was Substituted</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Was Substituted</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Was Substituted</em>' containment reference.
	 * @see #setWasSubstituted(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationDispenseSubstitution_WasSubstituted()
	 * @model containment="true" required="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getWasSubstituted();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationDispenseSubstitution#getWasSubstituted <em>Was Substituted</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Was Substituted</em>' containment reference.
	 * @see #getWasSubstituted()
	 * @generated
	 */
	void setWasSubstituted(fhiRCore.dataTypes.Boolean value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationDispenseSubstitution_Type()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationDispenseSubstitution#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationDispenseSubstitution_Reason()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getReasons();

	/**
	 * Returns the value of the '<em><b>Responsible Party</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsible Party</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible Party</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationDispenseSubstitution_ResponsibleParty()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getResponsibleParties();

} // MedicationDispenseSubstitution
