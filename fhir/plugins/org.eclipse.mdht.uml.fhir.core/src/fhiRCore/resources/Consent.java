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
 * A representation of the model object '<em><b>Consent</b></em>'.
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
 *   <li>{@link fhiRCore.resources.Consent#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.Consent#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.Consent#getScope <em>Scope</em>}</li>
 *   <li>{@link fhiRCore.resources.Consent#getCategories <em>Category</em>}</li>
 *   <li>{@link fhiRCore.resources.Consent#getPatient <em>Patient</em>}</li>
 *   <li>{@link fhiRCore.resources.Consent#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link fhiRCore.resources.Consent#getPerformers <em>Performer</em>}</li>
 *   <li>{@link fhiRCore.resources.Consent#getOrganizations <em>Organization</em>}</li>
 *   <li>{@link fhiRCore.resources.Consent#getSourcex <em>Sourcex</em>}</li>
 *   <li>{@link fhiRCore.resources.Consent#getPolicies <em>Policy</em>}</li>
 *   <li>{@link fhiRCore.resources.Consent#getPolicyRule <em>Policy Rule</em>}</li>
 *   <li>{@link fhiRCore.resources.Consent#getVerifications <em>Verification</em>}</li>
 *   <li>{@link fhiRCore.resources.Consent#getProvision <em>Provision</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getConsent()
 * @model
 * @generated
 */
public interface Consent extends DomainResource {
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
	 * @see fhiRCore.resources.ResourcesPackage#getConsent_Identifier()
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
	 * @see fhiRCore.resources.ResourcesPackage#getConsent_Status()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Consent#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' containment reference.
	 * @see #setScope(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getConsent_Scope()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getScope();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Consent#getScope <em>Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' containment reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(CodeableConcept value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getConsent_Category()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CodeableConcept> getCategories();

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
	 * @see fhiRCore.resources.ResourcesPackage#getConsent_Patient()
	 * @model containment="true"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Consent#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Reference value);

	/**
	 * Returns the value of the '<em><b>Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time</em>' containment reference.
	 * @see #setDateTime(DateTime)
	 * @see fhiRCore.resources.ResourcesPackage#getConsent_DateTime()
	 * @model containment="true"
	 * @generated
	 */
	DateTime getDateTime();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Consent#getDateTime <em>Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time</em>' containment reference.
	 * @see #getDateTime()
	 * @generated
	 */
	void setDateTime(DateTime value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getConsent_Performer()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getPerformers();

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organization</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getConsent_Organization()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getOrganizations();

	/**
	 * Returns the value of the '<em><b>Sourcex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sourcex</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sourcex</em>' containment reference.
	 * @see #setSourcex(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getConsent_Sourcex()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='source[x]'"
	 * @generated
	 */
	DataType getSourcex();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Consent#getSourcex <em>Sourcex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sourcex</em>' containment reference.
	 * @see #getSourcex()
	 * @generated
	 */
	void setSourcex(DataType value);

	/**
	 * Returns the value of the '<em><b>Policy</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ConsentPolicy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getConsent_Policy()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConsentPolicy> getPolicies();

	/**
	 * Returns the value of the '<em><b>Policy Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy Rule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy Rule</em>' containment reference.
	 * @see #setPolicyRule(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getConsent_PolicyRule()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getPolicyRule();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Consent#getPolicyRule <em>Policy Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy Rule</em>' containment reference.
	 * @see #getPolicyRule()
	 * @generated
	 */
	void setPolicyRule(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Verification</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ConsentVerification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verification</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verification</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getConsent_Verification()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConsentVerification> getVerifications();

	/**
	 * Returns the value of the '<em><b>Provision</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provision</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provision</em>' containment reference.
	 * @see #setProvision(Consentprovision)
	 * @see fhiRCore.resources.ResourcesPackage#getConsent_Provision()
	 * @model containment="true"
	 * @generated
	 */
	Consentprovision getProvision();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Consent#getProvision <em>Provision</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provision</em>' containment reference.
	 * @see #getProvision()
	 * @generated
	 */
	void setProvision(Consentprovision value);

} // Consent
