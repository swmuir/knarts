/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.DataType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Knowledge Administration Guidelines Patient Characteristics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.MedicationKnowledgeAdministrationGuidelinesPatientCharacteristics#getCharacteristicx <em>Characteristicx</em>}</li>
 *   <li>{@link fhiRCore.resources.MedicationKnowledgeAdministrationGuidelinesPatientCharacteristics#getValues <em>Value</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getMedicationKnowledgeAdministrationGuidelinesPatientCharacteristics()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='AdministrationGuidelines_PatientCharacteristics'"
 * @generated
 */
public interface MedicationKnowledgeAdministrationGuidelinesPatientCharacteristics extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Characteristicx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Characteristicx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Characteristicx</em>' containment reference.
	 * @see #setCharacteristicx(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationKnowledgeAdministrationGuidelinesPatientCharacteristics_Characteristicx()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='characteristic[x]'"
	 * @generated
	 */
	DataType getCharacteristicx();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.MedicationKnowledgeAdministrationGuidelinesPatientCharacteristics#getCharacteristicx <em>Characteristicx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Characteristicx</em>' containment reference.
	 * @see #getCharacteristicx()
	 * @generated
	 */
	void setCharacteristicx(DataType value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getMedicationKnowledgeAdministrationGuidelinesPatientCharacteristics_Value()
	 * @model containment="true"
	 * @generated
	 */
	EList<fhiRCore.dataTypes.String> getValues();

} // MedicationKnowledgeAdministrationGuidelinesPatientCharacteristics
