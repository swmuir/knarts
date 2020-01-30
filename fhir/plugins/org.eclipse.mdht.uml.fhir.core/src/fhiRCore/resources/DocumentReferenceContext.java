/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Period;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Reference Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.DocumentReferenceContext#getEncounters <em>Encounter</em>}</li>
 *   <li>{@link fhiRCore.resources.DocumentReferenceContext#getEvents <em>Event</em>}</li>
 *   <li>{@link fhiRCore.resources.DocumentReferenceContext#getPeriod <em>Period</em>}</li>
 *   <li>{@link fhiRCore.resources.DocumentReferenceContext#getFacilityType <em>Facility Type</em>}</li>
 *   <li>{@link fhiRCore.resources.DocumentReferenceContext#getPracticeSetting <em>Practice Setting</em>}</li>
 *   <li>{@link fhiRCore.resources.DocumentReferenceContext#getSourcePatientInfo <em>Source Patient Info</em>}</li>
 *   <li>{@link fhiRCore.resources.DocumentReferenceContext#getRelateds <em>Related</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getDocumentReferenceContext()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DocumentReference_Context'"
 * @generated
 */
public interface DocumentReferenceContext extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Encounter</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encounter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getDocumentReferenceContext_Encounter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getEncounters();

	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getDocumentReferenceContext_Event()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getEvents();

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see fhiRCore.resources.ResourcesPackage#getDocumentReferenceContext_Period()
	 * @model containment="true"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DocumentReferenceContext#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Facility Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facility Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Type</em>' containment reference.
	 * @see #setFacilityType(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getDocumentReferenceContext_FacilityType()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getFacilityType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DocumentReferenceContext#getFacilityType <em>Facility Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility Type</em>' containment reference.
	 * @see #getFacilityType()
	 * @generated
	 */
	void setFacilityType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Practice Setting</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Practice Setting</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Practice Setting</em>' containment reference.
	 * @see #setPracticeSetting(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getDocumentReferenceContext_PracticeSetting()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getPracticeSetting();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DocumentReferenceContext#getPracticeSetting <em>Practice Setting</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Practice Setting</em>' containment reference.
	 * @see #getPracticeSetting()
	 * @generated
	 */
	void setPracticeSetting(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Source Patient Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Patient Info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Patient Info</em>' containment reference.
	 * @see #setSourcePatientInfo(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getDocumentReferenceContext_SourcePatientInfo()
	 * @model containment="true"
	 * @generated
	 */
	Reference getSourcePatientInfo();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DocumentReferenceContext#getSourcePatientInfo <em>Source Patient Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Patient Info</em>' containment reference.
	 * @see #getSourcePatientInfo()
	 * @generated
	 */
	void setSourcePatientInfo(Reference value);

	/**
	 * Returns the value of the '<em><b>Related</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getDocumentReferenceContext_Related()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getRelateds();

} // DocumentReferenceContext
