/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Knowledge Regulatory Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.MedicationKnowledgeRegulatorySchedule#getSchedule <em>Schedule</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getMedicationKnowledgeRegulatorySchedule()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Regulatory_Schedule'"
 * @generated
 */
public interface MedicationKnowledgeRegulatorySchedule extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Schedule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule</em>' containment reference.
	 * @see #setSchedule(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationKnowledgeRegulatorySchedule_Schedule()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getSchedule();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationKnowledgeRegulatorySchedule#getSchedule <em>Schedule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule</em>' containment reference.
	 * @see #getSchedule()
	 * @generated
	 */
	void setSchedule(CodeableConcept value);

} // MedicationKnowledgeRegulatorySchedule
