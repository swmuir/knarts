/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Period;
import fhiRCore.dataTypes.Reference;
import fhiRCore.dataTypes.Uri;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract</b></em>'.
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
 *   <li>{@link fhiRCore.resources.Contract#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.Contract#getUrl <em>Url</em>}</li>
 *   <li>{@link fhiRCore.resources.Contract#getVersion <em>Version</em>}</li>
 *   <li>{@link fhiRCore.resources.Contract#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.Contract#getLegalState <em>Legal State</em>}</li>
 *   <li>{@link fhiRCore.resources.Contract#getInstantiatesCanonical <em>Instantiates Canonical</em>}</li>
 *   <li>{@link fhiRCore.resources.Contract#getInstantiatesUri <em>Instantiates Uri</em>}</li>
 *   <li>{@link fhiRCore.resources.Contract#getContentDerivative <em>Content Derivative</em>}</li>
 *   <li>{@link fhiRCore.resources.Contract#getIssued <em>Issued</em>}</li>
 *   <li>{@link fhiRCore.resources.Contract#getApplies <em>Applies</em>}</li>
 *   <li>{@link fhiRCore.resources.Contract#getExpirationType <em>Expiration Type</em>}</li>
 *   <li>{@link fhiRCore.resources.Contract#getSubjects <em>Subject</em>}</li>
 *   <li>{@link fhiRCore.resources.Contract#getAuthorities <em>Authority</em>}</li>
 *   <li>{@link fhiRCore.resources.Contract#getDomains <em>Domain</em>}</li>
 *   <li>{@link fhiRCore.resources.Contract#getSites <em>Site</em>}</li>
 *   <li>{@link fhiRCore.resources.Contract#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.resources.Contract#getTitle <em>Title</em>}</li>
 *   <li>{@link fhiRCore.resources.Contract#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link fhiRCore.resources.Contract#getAlias <em>Alias</em>}</li>
 *   <li>{@link fhiRCore.resources.Contract#getAuthor <em>Author</em>}</li>
 *   <li>{@link fhiRCore.resources.Contract#getScope <em>Scope</em>}</li>
 *   <li>{@link fhiRCore.resources.Contract#getTopicx <em>Topicx</em>}</li>
 *   <li>{@link fhiRCore.resources.Contract#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.Contract#getSubTypes <em>Sub Type</em>}</li>
 *   <li>{@link fhiRCore.resources.Contract#getContentDefinition <em>Content Definition</em>}</li>
 *   <li>{@link fhiRCore.resources.Contract#getTerms <em>Term</em>}</li>
 *   <li>{@link fhiRCore.resources.Contract#getSupportingInfos <em>Supporting Info</em>}</li>
 *   <li>{@link fhiRCore.resources.Contract#getRelevantHistories <em>Relevant History</em>}</li>
 *   <li>{@link fhiRCore.resources.Contract#getSigners <em>Signer</em>}</li>
 *   <li>{@link fhiRCore.resources.Contract#getFriendlies <em>Friendly</em>}</li>
 *   <li>{@link fhiRCore.resources.Contract#getLegals <em>Legal</em>}</li>
 *   <li>{@link fhiRCore.resources.Contract#getRules <em>Rule</em>}</li>
 *   <li>{@link fhiRCore.resources.Contract#getLegallyBindingx <em>Legally Bindingx</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getContract()
 * @model
 * @generated
 */
public interface Contract extends DomainResource {
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
	 * @see fhiRCore.resources.ResourcesPackage#getContract_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

	/**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' containment reference.
	 * @see #setUrl(Uri)
	 * @see fhiRCore.resources.ResourcesPackage#getContract_Url()
	 * @model containment="true"
	 * @generated
	 */
	Uri getUrl();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Contract#getUrl <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' containment reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(Uri value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getContract_Version()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getVersion();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Contract#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(fhiRCore.dataTypes.String value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getContract_Status()
	 * @model containment="true"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Contract#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Legal State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Legal State</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legal State</em>' containment reference.
	 * @see #setLegalState(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getContract_LegalState()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getLegalState();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Contract#getLegalState <em>Legal State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legal State</em>' containment reference.
	 * @see #getLegalState()
	 * @generated
	 */
	void setLegalState(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Instantiates Canonical</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instantiates Canonical</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantiates Canonical</em>' containment reference.
	 * @see #setInstantiatesCanonical(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getContract_InstantiatesCanonical()
	 * @model containment="true"
	 * @generated
	 */
	Reference getInstantiatesCanonical();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Contract#getInstantiatesCanonical <em>Instantiates Canonical</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instantiates Canonical</em>' containment reference.
	 * @see #getInstantiatesCanonical()
	 * @generated
	 */
	void setInstantiatesCanonical(Reference value);

	/**
	 * Returns the value of the '<em><b>Instantiates Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instantiates Uri</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantiates Uri</em>' containment reference.
	 * @see #setInstantiatesUri(Uri)
	 * @see fhiRCore.resources.ResourcesPackage#getContract_InstantiatesUri()
	 * @model containment="true"
	 * @generated
	 */
	Uri getInstantiatesUri();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Contract#getInstantiatesUri <em>Instantiates Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instantiates Uri</em>' containment reference.
	 * @see #getInstantiatesUri()
	 * @generated
	 */
	void setInstantiatesUri(Uri value);

	/**
	 * Returns the value of the '<em><b>Content Derivative</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Derivative</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Derivative</em>' containment reference.
	 * @see #setContentDerivative(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getContract_ContentDerivative()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getContentDerivative();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Contract#getContentDerivative <em>Content Derivative</em>}' containment reference.
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
	 * <p>
	 * If the meaning of the '<em>Issued</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issued</em>' containment reference.
	 * @see #setIssued(DateTime)
	 * @see fhiRCore.resources.ResourcesPackage#getContract_Issued()
	 * @model containment="true"
	 * @generated
	 */
	DateTime getIssued();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Contract#getIssued <em>Issued</em>}' containment reference.
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
	 * <p>
	 * If the meaning of the '<em>Applies</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applies</em>' containment reference.
	 * @see #setApplies(Period)
	 * @see fhiRCore.resources.ResourcesPackage#getContract_Applies()
	 * @model containment="true"
	 * @generated
	 */
	Period getApplies();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Contract#getApplies <em>Applies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applies</em>' containment reference.
	 * @see #getApplies()
	 * @generated
	 */
	void setApplies(Period value);

	/**
	 * Returns the value of the '<em><b>Expiration Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expiration Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiration Type</em>' containment reference.
	 * @see #setExpirationType(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getContract_ExpirationType()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getExpirationType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Contract#getExpirationType <em>Expiration Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiration Type</em>' containment reference.
	 * @see #getExpirationType()
	 * @generated
	 */
	void setExpirationType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getContract_Subject()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getSubjects();

	/**
	 * Returns the value of the '<em><b>Authority</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authority</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authority</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getContract_Authority()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getAuthorities();

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getContract_Domain()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getDomains();

	/**
	 * Returns the value of the '<em><b>Site</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Site</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Site</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getContract_Site()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getSites();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getContract_Name()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getName();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Contract#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getContract_Title()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getTitle();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Contract#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Subtitle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtitle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtitle</em>' containment reference.
	 * @see #setSubtitle(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getContract_Subtitle()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getSubtitle();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Contract#getSubtitle <em>Subtitle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtitle</em>' containment reference.
	 * @see #getSubtitle()
	 * @generated
	 */
	void setSubtitle(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Alias</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getContract_Alias()
	 * @model containment="true"
	 * @generated
	 */
	EList<fhiRCore.dataTypes.String> getAlias();

	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' containment reference.
	 * @see #setAuthor(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getContract_Author()
	 * @model containment="true"
	 * @generated
	 */
	Reference getAuthor();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Contract#getAuthor <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' containment reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(Reference value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getContract_Scope()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getScope();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Contract#getScope <em>Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' containment reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Topicx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topicx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topicx</em>' containment reference.
	 * @see #setTopicx(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getContract_Topicx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='topic[x]'"
	 * @generated
	 */
	DataType getTopicx();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Contract#getTopicx <em>Topicx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topicx</em>' containment reference.
	 * @see #getTopicx()
	 * @generated
	 */
	void setTopicx(DataType value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getContract_Type()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Contract#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Sub Type</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Type</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getContract_SubType()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getSubTypes();

	/**
	 * Returns the value of the '<em><b>Content Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Definition</em>' containment reference.
	 * @see #setContentDefinition(ContractContentDefinition)
	 * @see fhiRCore.resources.ResourcesPackage#getContract_ContentDefinition()
	 * @model containment="true"
	 * @generated
	 */
	ContractContentDefinition getContentDefinition();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Contract#getContentDefinition <em>Content Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Definition</em>' containment reference.
	 * @see #getContentDefinition()
	 * @generated
	 */
	void setContentDefinition(ContractContentDefinition value);

	/**
	 * Returns the value of the '<em><b>Term</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ContractTerm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Term</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getContract_Term()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContractTerm> getTerms();

	/**
	 * Returns the value of the '<em><b>Supporting Info</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supporting Info</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supporting Info</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getContract_SupportingInfo()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getSupportingInfos();

	/**
	 * Returns the value of the '<em><b>Relevant History</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relevant History</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relevant History</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getContract_RelevantHistory()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getRelevantHistories();

	/**
	 * Returns the value of the '<em><b>Signer</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ContractSignatory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signer</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getContract_Signer()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContractSignatory> getSigners();

	/**
	 * Returns the value of the '<em><b>Friendly</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ContractFriendlyLanguage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Friendly</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Friendly</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getContract_Friendly()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContractFriendlyLanguage> getFriendlies();

	/**
	 * Returns the value of the '<em><b>Legal</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ContractLegalLanguage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Legal</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legal</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getContract_Legal()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContractLegalLanguage> getLegals();

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.ContractComputableLanguage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getContract_Rule()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContractComputableLanguage> getRules();

	/**
	 * Returns the value of the '<em><b>Legally Bindingx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Legally Bindingx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legally Bindingx</em>' containment reference.
	 * @see #setLegallyBindingx(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getContract_LegallyBindingx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='legallyBinding[x]'"
	 * @generated
	 */
	DataType getLegallyBindingx();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Contract#getLegallyBindingx <em>Legally Bindingx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legally Bindingx</em>' containment reference.
	 * @see #getLegallyBindingx()
	 * @generated
	 */
	void setLegallyBindingx(DataType value);

} // Contract
