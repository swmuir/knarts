/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encounter Hospitalization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.EncounterHospitalization#getPreAdmissionIdentifier <em>Pre Admission Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.EncounterHospitalization#getOrigin <em>Origin</em>}</li>
 *   <li>{@link fhiRCore.resources.EncounterHospitalization#getAdmitSource <em>Admit Source</em>}</li>
 *   <li>{@link fhiRCore.resources.EncounterHospitalization#getReAdmission <em>Re Admission</em>}</li>
 *   <li>{@link fhiRCore.resources.EncounterHospitalization#getDietPreferences <em>Diet Preference</em>}</li>
 *   <li>{@link fhiRCore.resources.EncounterHospitalization#getSpecialCourtesies <em>Special Courtesy</em>}</li>
 *   <li>{@link fhiRCore.resources.EncounterHospitalization#getSpecialArrangements <em>Special Arrangement</em>}</li>
 *   <li>{@link fhiRCore.resources.EncounterHospitalization#getDestination <em>Destination</em>}</li>
 *   <li>{@link fhiRCore.resources.EncounterHospitalization#getDischargeDisposition <em>Discharge Disposition</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getEncounterHospitalization()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Encounter_Hospitalization'"
 * @generated
 */
public interface EncounterHospitalization extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Pre Admission Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Admission Identifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Admission Identifier</em>' containment reference.
	 * @see #setPreAdmissionIdentifier(Identifier)
	 * @see fhiRCore.resources.ResourcesPackage#getEncounterHospitalization_PreAdmissionIdentifier()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getPreAdmissionIdentifier();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.EncounterHospitalization#getPreAdmissionIdentifier <em>Pre Admission Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Admission Identifier</em>' containment reference.
	 * @see #getPreAdmissionIdentifier()
	 * @generated
	 */
	void setPreAdmissionIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' containment reference.
	 * @see #setOrigin(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getEncounterHospitalization_Origin()
	 * @model containment="true"
	 * @generated
	 */
	Reference getOrigin();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.EncounterHospitalization#getOrigin <em>Origin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' containment reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(Reference value);

	/**
	 * Returns the value of the '<em><b>Admit Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Admit Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Admit Source</em>' containment reference.
	 * @see #setAdmitSource(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getEncounterHospitalization_AdmitSource()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getAdmitSource();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.EncounterHospitalization#getAdmitSource <em>Admit Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Admit Source</em>' containment reference.
	 * @see #getAdmitSource()
	 * @generated
	 */
	void setAdmitSource(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Re Admission</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Re Admission</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Re Admission</em>' containment reference.
	 * @see #setReAdmission(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getEncounterHospitalization_ReAdmission()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getReAdmission();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.EncounterHospitalization#getReAdmission <em>Re Admission</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Re Admission</em>' containment reference.
	 * @see #getReAdmission()
	 * @generated
	 */
	void setReAdmission(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Diet Preference</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diet Preference</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diet Preference</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getEncounterHospitalization_DietPreference()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getDietPreferences();

	/**
	 * Returns the value of the '<em><b>Special Courtesy</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Special Courtesy</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Special Courtesy</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getEncounterHospitalization_SpecialCourtesy()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getSpecialCourtesies();

	/**
	 * Returns the value of the '<em><b>Special Arrangement</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Special Arrangement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Special Arrangement</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getEncounterHospitalization_SpecialArrangement()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getSpecialArrangements();

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' containment reference.
	 * @see #setDestination(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getEncounterHospitalization_Destination()
	 * @model containment="true"
	 * @generated
	 */
	Reference getDestination();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.EncounterHospitalization#getDestination <em>Destination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' containment reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(Reference value);

	/**
	 * Returns the value of the '<em><b>Discharge Disposition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discharge Disposition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discharge Disposition</em>' containment reference.
	 * @see #setDischargeDisposition(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getEncounterHospitalization_DischargeDisposition()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getDischargeDisposition();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.EncounterHospitalization#getDischargeDisposition <em>Discharge Disposition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discharge Disposition</em>' containment reference.
	 * @see #getDischargeDisposition()
	 * @generated
	 */
	void setDischargeDisposition(CodeableConcept value);

} // EncounterHospitalization
