/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.DataType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Knowledge Administration Guidelines</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.MedicationKnowledgeAdministrationGuidelines#getDosages <em>Dosage</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationKnowledgeAdministrationGuidelines#getIndicationx <em>Indicationx</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationKnowledgeAdministrationGuidelines#getPatientCharacteristics <em>Patient Characteristics</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getMedicationKnowledgeAdministrationGuidelines()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MedicationKnowledge_AdministrationGuidelines'"
 * @generated
 */
public interface MedicationKnowledgeAdministrationGuidelines extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Dosage</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.MedicationKnowledgeAdministrationGuidelinesDosage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dosage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dosage</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationKnowledgeAdministrationGuidelines_Dosage()
	 * @model containment="true"
	 * @generated
	 */
	EList<MedicationKnowledgeAdministrationGuidelinesDosage> getDosages();

	/**
	 * Returns the value of the '<em><b>Indicationx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indicationx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indicationx</em>' containment reference.
	 * @see #setIndicationx(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationKnowledgeAdministrationGuidelines_Indicationx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='indication[x]'"
	 * @generated
	 */
	DataType getIndicationx();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationKnowledgeAdministrationGuidelines#getIndicationx <em>Indicationx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indicationx</em>' containment reference.
	 * @see #getIndicationx()
	 * @generated
	 */
	void setIndicationx(DataType value);

	/**
	 * Returns the value of the '<em><b>Patient Characteristics</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.MedicationKnowledgeAdministrationGuidelinesPatientCharacteristics}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patient Characteristics</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient Characteristics</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationKnowledgeAdministrationGuidelines_PatientCharacteristics()
	 * @model containment="true"
	 * @generated
	 */
	EList<MedicationKnowledgeAdministrationGuidelinesPatientCharacteristics> getPatientCharacteristics();

} // MedicationKnowledgeAdministrationGuidelines
