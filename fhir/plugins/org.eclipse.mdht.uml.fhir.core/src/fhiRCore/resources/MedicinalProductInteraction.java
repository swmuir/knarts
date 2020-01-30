/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Interaction</b></em>'.
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
 *   <li>{@link fhiRCore.resources.MedicinalProductInteraction#getSubjects <em>Subject</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductInteraction#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductInteraction#getInteractants <em>Interactant</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductInteraction#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductInteraction#getEffect <em>Effect</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductInteraction#getIncidence <em>Incidence</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicinalProductInteraction#getManagement <em>Management</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductInteraction()
 * @model
 * @generated
 */
public interface MedicinalProductInteraction extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductInteraction_Subject()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getSubjects();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductInteraction_Description()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDescription();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductInteraction#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Interactant</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.MedicinalProductInteractionInteractant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interactant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interactant</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductInteraction_Interactant()
	 * @model containment="true"
	 * @generated
	 */
	EList<MedicinalProductInteractionInteractant> getInteractants();

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
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductInteraction_Type()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductInteraction#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Effect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effect</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect</em>' containment reference.
	 * @see #setEffect(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductInteraction_Effect()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getEffect();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductInteraction#getEffect <em>Effect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect</em>' containment reference.
	 * @see #getEffect()
	 * @generated
	 */
	void setEffect(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Incidence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incidence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incidence</em>' containment reference.
	 * @see #setIncidence(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductInteraction_Incidence()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getIncidence();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductInteraction#getIncidence <em>Incidence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incidence</em>' containment reference.
	 * @see #getIncidence()
	 * @generated
	 */
	void setIncidence(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Management</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Management</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Management</em>' containment reference.
	 * @see #setManagement(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicinalProductInteraction_Management()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getManagement();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicinalProductInteraction#getManagement <em>Management</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Management</em>' containment reference.
	 * @see #getManagement()
	 * @generated
	 */
	void setManagement(CodeableConcept value);

} // MedicinalProductInteraction
