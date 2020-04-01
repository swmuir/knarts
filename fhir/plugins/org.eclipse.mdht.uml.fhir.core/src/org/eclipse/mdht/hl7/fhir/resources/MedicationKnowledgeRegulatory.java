/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.emf.common.util.EList;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Knowledge Regulatory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.MedicationKnowledgeRegulatory#getRegulatoryAuthority <em>Regulatory Authority</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.MedicationKnowledgeRegulatory#getSubstitutions <em>Substitution</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.MedicationKnowledgeRegulatory#getSchedules <em>Schedule</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.MedicationKnowledgeRegulatory#getMaxDispense <em>Max Dispense</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getMedicationKnowledgeRegulatory()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MedicationKnowledge_Regulatory'"
 * @generated
 */
public interface MedicationKnowledgeRegulatory extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Regulatory Authority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regulatory Authority</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regulatory Authority</em>' containment reference.
	 * @see #setRegulatoryAuthority(Reference)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getMedicationKnowledgeRegulatory_RegulatoryAuthority()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getRegulatoryAuthority();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.MedicationKnowledgeRegulatory#getRegulatoryAuthority <em>Regulatory Authority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regulatory Authority</em>' containment reference.
	 * @see #getRegulatoryAuthority()
	 * @generated
	 */
	void setRegulatoryAuthority(Reference value);

	/**
	 * Returns the value of the '<em><b>Substitution</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.resources.MedicationKnowledgeRegulatorySubstitution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substitution</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substitution</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getMedicationKnowledgeRegulatory_Substitution()
	 * @model containment="true"
	 * @generated
	 */
	EList<MedicationKnowledgeRegulatorySubstitution> getSubstitutions();

	/**
	 * Returns the value of the '<em><b>Schedule</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.resources.MedicationKnowledgeRegulatorySchedule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getMedicationKnowledgeRegulatory_Schedule()
	 * @model containment="true"
	 * @generated
	 */
	EList<MedicationKnowledgeRegulatorySchedule> getSchedules();

	/**
	 * Returns the value of the '<em><b>Max Dispense</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Dispense</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Dispense</em>' containment reference.
	 * @see #setMaxDispense(MedicationKnowledgeRegulatoryMaxDispense)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getMedicationKnowledgeRegulatory_MaxDispense()
	 * @model containment="true"
	 * @generated
	 */
	MedicationKnowledgeRegulatoryMaxDispense getMaxDispense();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.MedicationKnowledgeRegulatory#getMaxDispense <em>Max Dispense</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Dispense</em>' containment reference.
	 * @see #getMaxDispense()
	 * @generated
	 */
	void setMaxDispense(MedicationKnowledgeRegulatoryMaxDispense value);

} // MedicationKnowledgeRegulatory
