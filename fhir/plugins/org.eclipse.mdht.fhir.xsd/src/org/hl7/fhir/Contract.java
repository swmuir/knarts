/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A formal agreement between parties regarding the conduct of business, exchange of information or other matters.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Contract#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Contract#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.Contract#getContentDerivative <em>Content Derivative</em>}</li>
 *   <li>{@link org.hl7.fhir.Contract#getIssued <em>Issued</em>}</li>
 *   <li>{@link org.hl7.fhir.Contract#getApplies <em>Applies</em>}</li>
 *   <li>{@link org.hl7.fhir.Contract#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.Contract#getAuthority <em>Authority</em>}</li>
 *   <li>{@link org.hl7.fhir.Contract#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.hl7.fhir.Contract#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.Contract#getSubType <em>Sub Type</em>}</li>
 *   <li>{@link org.hl7.fhir.Contract#getTerm <em>Term</em>}</li>
 *   <li>{@link org.hl7.fhir.Contract#getSigner <em>Signer</em>}</li>
 *   <li>{@link org.hl7.fhir.Contract#getFriendly <em>Friendly</em>}</li>
 *   <li>{@link org.hl7.fhir.Contract#getLegal <em>Legal</em>}</li>
 *   <li>{@link org.hl7.fhir.Contract#getRule <em>Rule</em>}</li>
 *   <li>{@link org.hl7.fhir.Contract#getLegallyBindingAttachment <em>Legally Binding Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.Contract#getLegallyBindingReference <em>Legally Binding Reference</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getContract()
 * @model extendedMetaData="name='Contract' kind='elementOnly'"
 * @generated
 */
public interface Contract extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique identifier for this Contract or a derivative that references a Source Contract.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getContract_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Contract#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of the resource instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(ContractResourceStatusCodes)
	 * @see org.hl7.fhir.FhirPackage#getContract_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	ContractResourceStatusCodes getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Contract#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ContractResourceStatusCodes value);

	/**
	 * Returns the value of the '<em><b>Content Derivative</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The minimal content derived from the basal information source at a specific stage in its lifecycle.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content Derivative</em>' containment reference.
	 * @see #setContentDerivative(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getContract_ContentDerivative()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contentDerivative' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getContentDerivative();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Contract#getContentDerivative <em>Content Derivative</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Derivative</em>' containment reference.
	 * @see #getContentDerivative()
	 * @generated
	 */
	void setContentDerivative(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Issued</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When this  Contract was issued.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issued</em>' containment reference.
	 * @see #setIssued(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getContract_Issued()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='issued' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getIssued();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Contract#getIssued <em>Issued</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issued</em>' containment reference.
	 * @see #getIssued()
	 * @generated
	 */
	void setIssued(DateTime value);

	/**
	 * Returns the value of the '<em><b>Applies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relevant time or time-period when this Contract is applicable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applies</em>' containment reference.
	 * @see #setApplies(Period)
	 * @see org.hl7.fhir.FhirPackage#getContract_Applies()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='applies' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getApplies();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Contract#getApplies <em>Applies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applies</em>' containment reference.
	 * @see #getApplies()
	 * @generated
	 */
	void setApplies(Period value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The target entity impacted by or of interest to parties to the agreement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContract_Subject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getSubject();

	/**
	 * Returns the value of the '<em><b>Authority</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A formally or informally recognized grouping of people, principals, organizations, or jurisdictions formed for the purpose of achieving some form of collective action such as the promulgation, administration and enforcement of contracts and policies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Authority</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContract_Authority()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='authority' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getAuthority();

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Recognized governance framework or system operating with a circumscribed scope in accordance with specified principles, policies, processes or procedures for managing rights, actions, or behaviors of parties or principals relative to resources.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContract_Domain()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='domain' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getDomain();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of Contract such as an insurance policy, real estate contract, a will, power of attorny, Privacy or Security policy , trust framework agreement, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getContract_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Contract#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Sub Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * More specific type or specialization of an overarching or more general contract such as auto insurance, home owner  insurance, prenupial agreement, Advanced-Directive, or privacy consent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Type</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContract_SubType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getSubType();

	/**
	 * Returns the value of the '<em><b>Term</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ContractTerm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * One or more Contract Provisions, which may be related and conveyed as a group, and may contain nested groups.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Term</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContract_Term()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='term' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContractTerm> getTerm();

	/**
	 * Returns the value of the '<em><b>Signer</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ContractSigner}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parties with legal standing in the Contract, including the principal parties, the grantor(s) and grantee(s), which are any person or organization bound by the contract, and any ancillary parties, which facilitate the execution of the contract such as a notary or witness.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signer</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContract_Signer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='signer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContractSigner> getSigner();

	/**
	 * Returns the value of the '<em><b>Friendly</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ContractFriendly}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The "patient friendly language" versionof the Contract in whole or in parts. "Patient friendly language" means the representation of the Contract and Contract Provisions in a manner that is readily accessible and understandable by a layperson in accordance with best practices for communication styles that ensure that those agreeing to or signing the Contract understand the roles, actions, obligations, responsibilities, and implication of the agreement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Friendly</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContract_Friendly()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='friendly' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContractFriendly> getFriendly();

	/**
	 * Returns the value of the '<em><b>Legal</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ContractLegal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of Legal expressions or representations of this Contract.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Legal</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getContract_Legal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='legal' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContractLegal> getLegal();

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of Computable Policy Rule Language Representations of this Contract.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference.
	 * @see #setRule(ContractRule)
	 * @see org.hl7.fhir.FhirPackage#getContract_Rule()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rule' namespace='##targetNamespace'"
	 * @generated
	 */
	ContractRule getRule();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Contract#getRule <em>Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' containment reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(ContractRule value);

	/**
	 * Returns the value of the '<em><b>Legally Binding Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Legally Binding Attachment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legally Binding Attachment</em>' containment reference.
	 * @see #setLegallyBindingAttachment(Attachment)
	 * @see org.hl7.fhir.FhirPackage#getContract_LegallyBindingAttachment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='legallyBindingAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	Attachment getLegallyBindingAttachment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Contract#getLegallyBindingAttachment <em>Legally Binding Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legally Binding Attachment</em>' containment reference.
	 * @see #getLegallyBindingAttachment()
	 * @generated
	 */
	void setLegallyBindingAttachment(Attachment value);

	/**
	 * Returns the value of the '<em><b>Legally Binding Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Legally Binding Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legally Binding Reference</em>' containment reference.
	 * @see #setLegallyBindingReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getContract_LegallyBindingReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='legallyBindingReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getLegallyBindingReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Contract#getLegallyBindingReference <em>Legally Binding Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legally Binding Reference</em>' containment reference.
	 * @see #getLegallyBindingReference()
	 * @generated
	 */
	void setLegallyBindingReference(Reference value);

} // Contract
