/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.ContactDetail;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Markdown;
import fhiRCore.dataTypes.Uri;
import fhiRCore.dataTypes.UsageContext;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Search Parameter</b></em>'.
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
 *   <li>{@link fhiRCore.resources.SearchParameter#getUrl <em>Url</em>}</li>
 *   <li>{@link fhiRCore.resources.SearchParameter#getVersion <em>Version</em>}</li>
 *   <li>{@link fhiRCore.resources.SearchParameter#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.resources.SearchParameter#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link fhiRCore.resources.SearchParameter#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.SearchParameter#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link fhiRCore.resources.SearchParameter#getDate <em>Date</em>}</li>
 *   <li>{@link fhiRCore.resources.SearchParameter#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link fhiRCore.resources.SearchParameter#getContacts <em>Contact</em>}</li>
 *   <li>{@link fhiRCore.resources.SearchParameter#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.SearchParameter#getUseContexts <em>Use Context</em>}</li>
 *   <li>{@link fhiRCore.resources.SearchParameter#getJurisdictions <em>Jurisdiction</em>}</li>
 *   <li>{@link fhiRCore.resources.SearchParameter#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link fhiRCore.resources.SearchParameter#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.SearchParameter#getBases <em>Base</em>}</li>
 *   <li>{@link fhiRCore.resources.SearchParameter#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.SearchParameter#getExpression <em>Expression</em>}</li>
 *   <li>{@link fhiRCore.resources.SearchParameter#getXpath <em>Xpath</em>}</li>
 *   <li>{@link fhiRCore.resources.SearchParameter#getXpathUsage <em>Xpath Usage</em>}</li>
 *   <li>{@link fhiRCore.resources.SearchParameter#getTargets <em>Target</em>}</li>
 *   <li>{@link fhiRCore.resources.SearchParameter#getMultipleOr <em>Multiple Or</em>}</li>
 *   <li>{@link fhiRCore.resources.SearchParameter#getMultipleAnd <em>Multiple And</em>}</li>
 *   <li>{@link fhiRCore.resources.SearchParameter#getComparators <em>Comparator</em>}</li>
 *   <li>{@link fhiRCore.resources.SearchParameter#getModifiers <em>Modifier</em>}</li>
 *   <li>{@link fhiRCore.resources.SearchParameter#getChains <em>Chain</em>}</li>
 *   <li>{@link fhiRCore.resources.SearchParameter#getComponents <em>Component</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getSearchParameter()
 * @model
 * @generated
 */
public interface SearchParameter extends DomainResource {
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
	 * @see fhiRCore.resources.ResourcesPackage#getSearchParameter_Url()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Uri getUrl();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SearchParameter#getUrl <em>Url</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getSearchParameter_Version()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getVersion();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SearchParameter#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(fhiRCore.dataTypes.String value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getSearchParameter_Name()
	 * @model containment="true" required="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getName();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SearchParameter#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Derived From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derived From</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived From</em>' containment reference.
	 * @see #setDerivedFrom(SearchParameter)
	 * @see fhiRCore.resources.ResourcesPackage#getSearchParameter_DerivedFrom()
	 * @model containment="true"
	 * @generated
	 */
	SearchParameter getDerivedFrom();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SearchParameter#getDerivedFrom <em>Derived From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived From</em>' containment reference.
	 * @see #getDerivedFrom()
	 * @generated
	 */
	void setDerivedFrom(SearchParameter value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getSearchParameter_Status()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SearchParameter#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Experimental</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Experimental</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Experimental</em>' containment reference.
	 * @see #setExperimental(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getSearchParameter_Experimental()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getExperimental();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SearchParameter#getExperimental <em>Experimental</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Experimental</em>' containment reference.
	 * @see #getExperimental()
	 * @generated
	 */
	void setExperimental(fhiRCore.dataTypes.Boolean value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getSearchParameter_Date()
	 * @model containment="true"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SearchParameter#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publisher</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publisher</em>' containment reference.
	 * @see #setPublisher(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getSearchParameter_Publisher()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getPublisher();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SearchParameter#getPublisher <em>Publisher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher</em>' containment reference.
	 * @see #getPublisher()
	 * @generated
	 */
	void setPublisher(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.ContactDetail}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSearchParameter_Contact()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContactDetail> getContacts();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Markdown)
	 * @see fhiRCore.resources.ResourcesPackage#getSearchParameter_Description()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Markdown getDescription();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SearchParameter#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Markdown value);

	/**
	 * Returns the value of the '<em><b>Use Context</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.UsageContext}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Context</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Context</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSearchParameter_UseContext()
	 * @model containment="true"
	 * @generated
	 */
	EList<UsageContext> getUseContexts();

	/**
	 * Returns the value of the '<em><b>Jurisdiction</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jurisdiction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jurisdiction</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSearchParameter_Jurisdiction()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getJurisdictions();

	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purpose</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purpose</em>' containment reference.
	 * @see #setPurpose(Markdown)
	 * @see fhiRCore.resources.ResourcesPackage#getSearchParameter_Purpose()
	 * @model containment="true"
	 * @generated
	 */
	Markdown getPurpose();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SearchParameter#getPurpose <em>Purpose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' containment reference.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(Markdown value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getSearchParameter_Code()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getCode();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SearchParameter#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Code value);

	/**
	 * Returns the value of the '<em><b>Base</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Code}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSearchParameter_Base()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Code> getBases();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getSearchParameter_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SearchParameter#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Code value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getSearchParameter_Expression()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getExpression();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SearchParameter#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Xpath</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xpath</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xpath</em>' containment reference.
	 * @see #setXpath(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getSearchParameter_Xpath()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getXpath();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SearchParameter#getXpath <em>Xpath</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xpath</em>' containment reference.
	 * @see #getXpath()
	 * @generated
	 */
	void setXpath(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Xpath Usage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xpath Usage</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xpath Usage</em>' containment reference.
	 * @see #setXpathUsage(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getSearchParameter_XpathUsage()
	 * @model containment="true"
	 * @generated
	 */
	Code getXpathUsage();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SearchParameter#getXpathUsage <em>Xpath Usage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xpath Usage</em>' containment reference.
	 * @see #getXpathUsage()
	 * @generated
	 */
	void setXpathUsage(Code value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Code}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSearchParameter_Target()
	 * @model containment="true"
	 * @generated
	 */
	EList<Code> getTargets();

	/**
	 * Returns the value of the '<em><b>Multiple Or</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiple Or</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiple Or</em>' containment reference.
	 * @see #setMultipleOr(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getSearchParameter_MultipleOr()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getMultipleOr();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SearchParameter#getMultipleOr <em>Multiple Or</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple Or</em>' containment reference.
	 * @see #getMultipleOr()
	 * @generated
	 */
	void setMultipleOr(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Multiple And</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiple And</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiple And</em>' containment reference.
	 * @see #setMultipleAnd(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getSearchParameter_MultipleAnd()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getMultipleAnd();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.SearchParameter#getMultipleAnd <em>Multiple And</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple And</em>' containment reference.
	 * @see #getMultipleAnd()
	 * @generated
	 */
	void setMultipleAnd(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Comparator</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Code}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comparator</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparator</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSearchParameter_Comparator()
	 * @model containment="true"
	 * @generated
	 */
	EList<Code> getComparators();

	/**
	 * Returns the value of the '<em><b>Modifier</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Code}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifier</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSearchParameter_Modifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Code> getModifiers();

	/**
	 * Returns the value of the '<em><b>Chain</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chain</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chain</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSearchParameter_Chain()
	 * @model containment="true"
	 * @generated
	 */
	EList<fhiRCore.dataTypes.String> getChains();

	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.SearchParameterComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getSearchParameter_Component()
	 * @model containment="true"
	 * @generated
	 */
	EList<SearchParameterComponent> getComponents();

} // SearchParameter
