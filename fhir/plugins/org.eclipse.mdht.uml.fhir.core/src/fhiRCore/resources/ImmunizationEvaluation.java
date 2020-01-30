/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Immunization Evaluation</b></em>'.
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
 *   <li>{@link fhiRCore.resources.ImmunizationEvaluation#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.ImmunizationEvaluation#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.ImmunizationEvaluation#getPatient <em>Patient</em>}</li>
 *   <li>{@link fhiRCore.resources.ImmunizationEvaluation#getDate <em>Date</em>}</li>
 *   <li>{@link fhiRCore.resources.ImmunizationEvaluation#getAuthority <em>Authority</em>}</li>
 *   <li>{@link fhiRCore.resources.ImmunizationEvaluation#getTargetDisease <em>Target Disease</em>}</li>
 *   <li>{@link fhiRCore.resources.ImmunizationEvaluation#getImmunizationEvent <em>Immunization Event</em>}</li>
 *   <li>{@link fhiRCore.resources.ImmunizationEvaluation#getDoseStatus <em>Dose Status</em>}</li>
 *   <li>{@link fhiRCore.resources.ImmunizationEvaluation#getDoseStatusReasons <em>Dose Status Reason</em>}</li>
 *   <li>{@link fhiRCore.resources.ImmunizationEvaluation#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.ImmunizationEvaluation#getSeries <em>Series</em>}</li>
 *   <li>{@link fhiRCore.resources.ImmunizationEvaluation#getDoseNumberx <em>Dose Numberx</em>}</li>
 *   <li>{@link fhiRCore.resources.ImmunizationEvaluation#getSeriesDosesx <em>Series Dosesx</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getImmunizationEvaluation()
 * @model
 * @generated
 */
public interface ImmunizationEvaluation extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Identifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getImmunizationEvaluation_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getImmunizationEvaluation_Status()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImmunizationEvaluation#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patient</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getImmunizationEvaluation_Patient()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImmunizationEvaluation#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Reference value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DateTime)
	 * @see fhiRCore.resources.ResourcesPackage#getImmunizationEvaluation_Date()
	 * @model containment="true"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImmunizationEvaluation#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Authority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authority</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authority</em>' containment reference.
	 * @see #setAuthority(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getImmunizationEvaluation_Authority()
	 * @model containment="true"
	 * @generated
	 */
	Reference getAuthority();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImmunizationEvaluation#getAuthority <em>Authority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authority</em>' containment reference.
	 * @see #getAuthority()
	 * @generated
	 */
	void setAuthority(Reference value);

	/**
	 * Returns the value of the '<em><b>Target Disease</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Disease</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Disease</em>' containment reference.
	 * @see #setTargetDisease(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getImmunizationEvaluation_TargetDisease()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getTargetDisease();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImmunizationEvaluation#getTargetDisease <em>Target Disease</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Disease</em>' containment reference.
	 * @see #getTargetDisease()
	 * @generated
	 */
	void setTargetDisease(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Immunization Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Immunization Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Immunization Event</em>' containment reference.
	 * @see #setImmunizationEvent(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getImmunizationEvaluation_ImmunizationEvent()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getImmunizationEvent();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImmunizationEvaluation#getImmunizationEvent <em>Immunization Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Immunization Event</em>' containment reference.
	 * @see #getImmunizationEvent()
	 * @generated
	 */
	void setImmunizationEvent(Reference value);

	/**
	 * Returns the value of the '<em><b>Dose Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dose Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dose Status</em>' containment reference.
	 * @see #setDoseStatus(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getImmunizationEvaluation_DoseStatus()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getDoseStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImmunizationEvaluation#getDoseStatus <em>Dose Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dose Status</em>' containment reference.
	 * @see #getDoseStatus()
	 * @generated
	 */
	void setDoseStatus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Dose Status Reason</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dose Status Reason</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dose Status Reason</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getImmunizationEvaluation_DoseStatusReason()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getDoseStatusReasons();

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
	 * @see fhiRCore.resources.ResourcesPackage#getImmunizationEvaluation_Description()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDescription();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImmunizationEvaluation#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Series</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Series</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Series</em>' containment reference.
	 * @see #setSeries(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getImmunizationEvaluation_Series()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getSeries();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImmunizationEvaluation#getSeries <em>Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Series</em>' containment reference.
	 * @see #getSeries()
	 * @generated
	 */
	void setSeries(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Dose Numberx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dose Numberx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dose Numberx</em>' containment reference.
	 * @see #setDoseNumberx(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getImmunizationEvaluation_DoseNumberx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='doseNumber[x]'"
	 * @generated
	 */
	DataType getDoseNumberx();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImmunizationEvaluation#getDoseNumberx <em>Dose Numberx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dose Numberx</em>' containment reference.
	 * @see #getDoseNumberx()
	 * @generated
	 */
	void setDoseNumberx(DataType value);

	/**
	 * Returns the value of the '<em><b>Series Dosesx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Series Dosesx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Series Dosesx</em>' containment reference.
	 * @see #setSeriesDosesx(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getImmunizationEvaluation_SeriesDosesx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='seriesDoses[x]'"
	 * @generated
	 */
	DataType getSeriesDosesx();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ImmunizationEvaluation#getSeriesDosesx <em>Series Dosesx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Series Dosesx</em>' containment reference.
	 * @see #getSeriesDosesx()
	 * @generated
	 */
	void setSeriesDosesx(DataType value);

} // ImmunizationEvaluation
