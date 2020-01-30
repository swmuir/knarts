/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Annotation;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specimen</b></em>'.
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
 *   <li>{@link fhiRCore.resources.Specimen#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.Specimen#getAccessionIdentifier <em>Accession Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.Specimen#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.Specimen#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.Specimen#getSubject <em>Subject</em>}</li>
 *   <li>{@link fhiRCore.resources.Specimen#getReceivedTime <em>Received Time</em>}</li>
 *   <li>{@link fhiRCore.resources.Specimen#getParents <em>Parent</em>}</li>
 *   <li>{@link fhiRCore.resources.Specimen#getRequests <em>Request</em>}</li>
 *   <li>{@link fhiRCore.resources.Specimen#getCollection <em>Collection</em>}</li>
 *   <li>{@link fhiRCore.resources.Specimen#getProcessings <em>Processing</em>}</li>
 *   <li>{@link fhiRCore.resources.Specimen#getContainers <em>Container</em>}</li>
 *   <li>{@link fhiRCore.resources.Specimen#getConditions <em>Condition</em>}</li>
 *   <li>{@link fhiRCore.resources.Specimen#getNotes <em>Note</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getSpecimen()
 * @model
 * @generated
 */
public interface Specimen extends DomainResource {
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
	 * @see fhiRCore.resources.ResourcesPackage#getSpecimen_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

	/**
	 * Returns the value of the '<em><b>Accession Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accession Identifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accession Identifier</em>' containment reference.
	 * @see #setAccessionIdentifier(Identifier)
	 * @see fhiRCore.resources.ResourcesPackage#getSpecimen_AccessionIdentifier()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getAccessionIdentifier();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Specimen#getAccessionIdentifier <em>Accession Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accession Identifier</em>' containment reference.
	 * @see #getAccessionIdentifier()
	 * @generated
	 */
	void setAccessionIdentifier(Identifier value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getSpecimen_Status()
	 * @model containment="true"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Specimen#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getSpecimen_Type()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Specimen#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getSpecimen_Subject()
	 * @model containment="true"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Specimen#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Received Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Received Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Received Time</em>' containment reference.
	 * @see #setReceivedTime(DateTime)
	 * @see fhiRCore.resources.ResourcesPackage#getSpecimen_ReceivedTime()
	 * @model containment="true"
	 * @generated
	 */
	DateTime getReceivedTime();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Specimen#getReceivedTime <em>Received Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Received Time</em>' containment reference.
	 * @see #getReceivedTime()
	 * @generated
	 */
	void setReceivedTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSpecimen_Parent()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getParents();

	/**
	 * Returns the value of the '<em><b>Request</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSpecimen_Request()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getRequests();

	/**
	 * Returns the value of the '<em><b>Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection</em>' containment reference.
	 * @see #setCollection(SpecimenCollection)
	 * @see fhiRCore.resources.ResourcesPackage#getSpecimen_Collection()
	 * @model containment="true"
	 * @generated
	 */
	SpecimenCollection getCollection();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Specimen#getCollection <em>Collection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection</em>' containment reference.
	 * @see #getCollection()
	 * @generated
	 */
	void setCollection(SpecimenCollection value);

	/**
	 * Returns the value of the '<em><b>Processing</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.SpecimenProcessing}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processing</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSpecimen_Processing()
	 * @model containment="true"
	 * @generated
	 */
	EList<SpecimenProcessing> getProcessings();

	/**
	 * Returns the value of the '<em><b>Container</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.SpecimenContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSpecimen_Container()
	 * @model containment="true"
	 * @generated
	 */
	EList<SpecimenContainer> getContainers();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSpecimen_Condition()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getConditions();

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
	 * @see fhiRCore.resources.ResourcesPackage#getSpecimen_Note()
	 * @model containment="true"
	 * @generated
	 */
	EList<Annotation> getNotes();

} // Specimen
