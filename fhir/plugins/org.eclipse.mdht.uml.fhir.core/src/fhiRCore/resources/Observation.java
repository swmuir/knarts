/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Annotation;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Instant;
import fhiRCore.dataTypes.Range;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Observation</b></em>'.
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
 *   <li>{@link fhiRCore.resources.Observation#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.Observation#getBasedOns <em>Based On</em>}</li>
 *   <li>{@link fhiRCore.resources.Observation#getPartOfs <em>Part Of</em>}</li>
 *   <li>{@link fhiRCore.resources.Observation#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.Observation#getCategories <em>Category</em>}</li>
 *   <li>{@link fhiRCore.resources.Observation#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.Observation#getSubject <em>Subject</em>}</li>
 *   <li>{@link fhiRCore.resources.Observation#getFoci <em>Focus</em>}</li>
 *   <li>{@link fhiRCore.resources.Observation#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link fhiRCore.resources.Observation#getEffectivex <em>Effectivex</em>}</li>
 *   <li>{@link fhiRCore.resources.Observation#getIssued <em>Issued</em>}</li>
 *   <li>{@link fhiRCore.resources.Observation#getPerformers <em>Performer</em>}</li>
 *   <li>{@link fhiRCore.resources.Observation#getValuex <em>Valuex</em>}</li>
 *   <li>{@link fhiRCore.resources.Observation#getDataAbsentReason <em>Data Absent Reason</em>}</li>
 *   <li>{@link fhiRCore.resources.Observation#getInterpretations <em>Interpretation</em>}</li>
 *   <li>{@link fhiRCore.resources.Observation#getNotes <em>Note</em>}</li>
 *   <li>{@link fhiRCore.resources.Observation#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link fhiRCore.resources.Observation#getMethod <em>Method</em>}</li>
 *   <li>{@link fhiRCore.resources.Observation#getSpecimen <em>Specimen</em>}</li>
 *   <li>{@link fhiRCore.resources.Observation#getDevice <em>Device</em>}</li>
 *   <li>{@link fhiRCore.resources.Observation#getHasMembers <em>Has Member</em>}</li>
 *   <li>{@link fhiRCore.resources.Observation#getDerivedFroms <em>Derived From</em>}</li>
 *   <li>{@link fhiRCore.resources.Observation#getComponents <em>Component</em>}</li>
 *   <li>{@link fhiRCore.resources.Observation#getReferenceRanges <em>Reference Range</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getObservation()
 * @model
 * @generated
 */
public interface Observation extends DomainResource {
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
	 * @see fhiRCore.resources.ResourcesPackage#getObservation_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

	/**
	 * Returns the value of the '<em><b>Based On</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Based On</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Based On</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getObservation_BasedOn()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getBasedOns();

	/**
	 * Returns the value of the '<em><b>Part Of</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Of</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Of</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getObservation_PartOf()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getPartOfs();

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
	 * @see fhiRCore.resources.ResourcesPackage#getObservation_Status()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Observation#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getObservation_Category()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getCategories();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getObservation_Code()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Observation#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getObservation_Subject()
	 * @model containment="true"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Observation#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Focus</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Focus</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Focus</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getObservation_Focus()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getFoci();

	/**
	 * Returns the value of the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encounter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference.
	 * @see #setEncounter(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getObservation_Encounter()
	 * @model containment="true"
	 * @generated
	 */
	Reference getEncounter();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Observation#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Reference value);

	/**
	 * Returns the value of the '<em><b>Effectivex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effectivex</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effectivex</em>' containment reference.
	 * @see #setEffectivex(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getObservation_Effectivex()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='effective[x]'"
	 * @generated
	 */
	DataType getEffectivex();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Observation#getEffectivex <em>Effectivex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effectivex</em>' containment reference.
	 * @see #getEffectivex()
	 * @generated
	 */
	void setEffectivex(DataType value);

	/**
	 * Returns the value of the '<em><b>Issued</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issued</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issued</em>' containment reference.
	 * @see #setIssued(Instant)
	 * @see fhiRCore.resources.ResourcesPackage#getObservation_Issued()
	 * @model containment="true"
	 * @generated
	 */
	Instant getIssued();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Observation#getIssued <em>Issued</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issued</em>' containment reference.
	 * @see #getIssued()
	 * @generated
	 */
	void setIssued(Instant value);

	/**
	 * Returns the value of the '<em><b>Performer</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performer</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getObservation_Performer()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getPerformers();

	/**
	 * Returns the value of the '<em><b>Valuex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valuex</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valuex</em>' containment reference.
	 * @see #setValuex(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getObservation_Valuex()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='value[x]'"
	 * @generated
	 */
	DataType getValuex();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Observation#getValuex <em>Valuex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valuex</em>' containment reference.
	 * @see #getValuex()
	 * @generated
	 */
	void setValuex(DataType value);

	/**
	 * Returns the value of the '<em><b>Data Absent Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Absent Reason</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Absent Reason</em>' containment reference.
	 * @see #setDataAbsentReason(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getObservation_DataAbsentReason()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getDataAbsentReason();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Observation#getDataAbsentReason <em>Data Absent Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Absent Reason</em>' containment reference.
	 * @see #getDataAbsentReason()
	 * @generated
	 */
	void setDataAbsentReason(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Interpretation</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interpretation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interpretation</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getObservation_Interpretation()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getInterpretations();

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Annotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getObservation_Note()
	 * @model containment="true"
	 * @generated
	 */
	EList<Annotation> getNotes();

	/**
	 * Returns the value of the '<em><b>Body Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body Site</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Site</em>' containment reference.
	 * @see #setBodySite(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getObservation_BodySite()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getBodySite();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Observation#getBodySite <em>Body Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Site</em>' containment reference.
	 * @see #getBodySite()
	 * @generated
	 */
	void setBodySite(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' containment reference.
	 * @see #setMethod(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getObservation_Method()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getMethod();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Observation#getMethod <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' containment reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Specimen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specimen</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specimen</em>' containment reference.
	 * @see #setSpecimen(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getObservation_Specimen()
	 * @model containment="true"
	 * @generated
	 */
	Reference getSpecimen();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Observation#getSpecimen <em>Specimen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specimen</em>' containment reference.
	 * @see #getSpecimen()
	 * @generated
	 */
	void setSpecimen(Reference value);

	/**
	 * Returns the value of the '<em><b>Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device</em>' containment reference.
	 * @see #setDevice(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getObservation_Device()
	 * @model containment="true"
	 * @generated
	 */
	Reference getDevice();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Observation#getDevice <em>Device</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device</em>' containment reference.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(Reference value);

	/**
	 * Returns the value of the '<em><b>Has Member</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Member</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Member</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getObservation_HasMember()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getHasMembers();

	/**
	 * Returns the value of the '<em><b>Derived From</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derived From</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived From</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getObservation_DerivedFrom()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getDerivedFroms();

	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ObservationComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getObservation_Component()
	 * @model containment="true"
	 * @generated
	 */
	EList<ObservationComponent> getComponents();

	/**
	 * Returns the value of the '<em><b>Reference Range</b></em>' reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Range}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Range</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Range</em>' reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getObservation_ReferenceRange()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Range> getReferenceRanges();

} // Observation
