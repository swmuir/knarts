/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Dosage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Knowledge Administration Guidelines Dosage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.MedicationKnowledgeAdministrationGuidelinesDosage#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationKnowledgeAdministrationGuidelinesDosage#getDosages <em>Dosage</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getMedicationKnowledgeAdministrationGuidelinesDosage()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='AdministrationGuidelines_Dosage'"
 * @generated
 */
public interface MedicationKnowledgeAdministrationGuidelinesDosage extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationKnowledgeAdministrationGuidelinesDosage_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationKnowledgeAdministrationGuidelinesDosage#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Dosage</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Dosage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dosage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dosage</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationKnowledgeAdministrationGuidelinesDosage_Dosage()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Dosage> getDosages();

} // MedicationKnowledgeAdministrationGuidelinesDosage
