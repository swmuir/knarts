/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Instant;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Reference</b></em>'.
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
 *   <li>{@link fhiRCore.resources.DocumentReference#getMasterIdentifier <em>Master Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.DocumentReference#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.DocumentReference#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.DocumentReference#getDocStatus <em>Doc Status</em>}</li>
 *   <li>{@link fhiRCore.resources.DocumentReference#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.DocumentReference#getCategories <em>Category</em>}</li>
 *   <li>{@link fhiRCore.resources.DocumentReference#getSubject <em>Subject</em>}</li>
 *   <li>{@link fhiRCore.resources.DocumentReference#getDate <em>Date</em>}</li>
 *   <li>{@link fhiRCore.resources.DocumentReference#getAuthors <em>Author</em>}</li>
 *   <li>{@link fhiRCore.resources.DocumentReference#getAuthenticator <em>Authenticator</em>}</li>
 *   <li>{@link fhiRCore.resources.DocumentReference#getCustodian <em>Custodian</em>}</li>
 *   <li>{@link fhiRCore.resources.DocumentReference#getRelatesTos <em>Relates To</em>}</li>
 *   <li>{@link fhiRCore.resources.DocumentReference#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.DocumentReference#getSecurityLabels <em>Security Label</em>}</li>
 *   <li>{@link fhiRCore.resources.DocumentReference#getContents <em>Content</em>}</li>
 *   <li>{@link fhiRCore.resources.DocumentReference#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getDocumentReference()
 * @model
 * @generated
 */
public interface DocumentReference extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Master Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Master Identifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master Identifier</em>' containment reference.
	 * @see #setMasterIdentifier(Identifier)
	 * @see fhiRCore.resources.ResourcesPackage#getDocumentReference_MasterIdentifier()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getMasterIdentifier();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DocumentReference#getMasterIdentifier <em>Master Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master Identifier</em>' containment reference.
	 * @see #getMasterIdentifier()
	 * @generated
	 */
	void setMasterIdentifier(Identifier value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getDocumentReference_Identifier()
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
	 * @see fhiRCore.resources.ResourcesPackage#getDocumentReference_Status()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DocumentReference#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Doc Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doc Status</em>' containment reference.
	 * @see #setDocStatus(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getDocumentReference_DocStatus()
	 * @model containment="true"
	 * @generated
	 */
	Code getDocStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DocumentReference#getDocStatus <em>Doc Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doc Status</em>' containment reference.
	 * @see #getDocStatus()
	 * @generated
	 */
	void setDocStatus(Code value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getDocumentReference_Type()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DocumentReference#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getDocumentReference_Category()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getCategories();

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
	 * @see fhiRCore.resources.ResourcesPackage#getDocumentReference_Subject()
	 * @model containment="true"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DocumentReference#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(Instant)
	 * @see fhiRCore.resources.ResourcesPackage#getDocumentReference_Date()
	 * @model containment="true"
	 * @generated
	 */
	Instant getDate();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DocumentReference#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Instant value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getDocumentReference_Author()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getAuthors();

	/**
	 * Returns the value of the '<em><b>Authenticator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authenticator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authenticator</em>' containment reference.
	 * @see #setAuthenticator(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getDocumentReference_Authenticator()
	 * @model containment="true"
	 * @generated
	 */
	Reference getAuthenticator();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DocumentReference#getAuthenticator <em>Authenticator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authenticator</em>' containment reference.
	 * @see #getAuthenticator()
	 * @generated
	 */
	void setAuthenticator(Reference value);

	/**
	 * Returns the value of the '<em><b>Custodian</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custodian</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custodian</em>' containment reference.
	 * @see #setCustodian(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getDocumentReference_Custodian()
	 * @model containment="true"
	 * @generated
	 */
	Reference getCustodian();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DocumentReference#getCustodian <em>Custodian</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custodian</em>' containment reference.
	 * @see #getCustodian()
	 * @generated
	 */
	void setCustodian(Reference value);

	/**
	 * Returns the value of the '<em><b>Relates To</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.DocumentReferenceRelatesTo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relates To</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relates To</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getDocumentReference_RelatesTo()
	 * @model containment="true"
	 * @generated
	 */
	EList<DocumentReferenceRelatesTo> getRelatesTos();

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
	 * @see fhiRCore.resources.ResourcesPackage#getDocumentReference_Description()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDescription();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DocumentReference#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Security Label</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Label</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Label</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getDocumentReference_SecurityLabel()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getSecurityLabels();

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.DocumentReferenceContent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getDocumentReference_Content()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DocumentReferenceContent> getContents();

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(DocumentReferenceContext)
	 * @see fhiRCore.resources.ResourcesPackage#getDocumentReference_Context()
	 * @model containment="true"
	 * @generated
	 */
	DocumentReferenceContext getContext();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DocumentReference#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(DocumentReferenceContext value);

} // DocumentReference
