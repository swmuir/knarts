/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.ContactDetail;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Markdown;
import fhiRCore.dataTypes.UnsignedInt;
import fhiRCore.dataTypes.Uri;
import fhiRCore.dataTypes.UsageContext;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code System</b></em>'.
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
 *   <li>{@link fhiRCore.resources.CodeSystem#getUrl <em>Url</em>}</li>
 *   <li>{@link fhiRCore.resources.CodeSystem#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.CodeSystem#getVersion <em>Version</em>}</li>
 *   <li>{@link fhiRCore.resources.CodeSystem#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.resources.CodeSystem#getTitle <em>Title</em>}</li>
 *   <li>{@link fhiRCore.resources.CodeSystem#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.CodeSystem#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link fhiRCore.resources.CodeSystem#getDate <em>Date</em>}</li>
 *   <li>{@link fhiRCore.resources.CodeSystem#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link fhiRCore.resources.CodeSystem#getContacts <em>Contact</em>}</li>
 *   <li>{@link fhiRCore.resources.CodeSystem#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.CodeSystem#getUseContexts <em>Use Context</em>}</li>
 *   <li>{@link fhiRCore.resources.CodeSystem#getJurisdictions <em>Jurisdiction</em>}</li>
 *   <li>{@link fhiRCore.resources.CodeSystem#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link fhiRCore.resources.CodeSystem#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link fhiRCore.resources.CodeSystem#getCaseSensitive <em>Case Sensitive</em>}</li>
 *   <li>{@link fhiRCore.resources.CodeSystem#getValueSet <em>Value Set</em>}</li>
 *   <li>{@link fhiRCore.resources.CodeSystem#getHierarchyMeaning <em>Hierarchy Meaning</em>}</li>
 *   <li>{@link fhiRCore.resources.CodeSystem#getCompositional <em>Compositional</em>}</li>
 *   <li>{@link fhiRCore.resources.CodeSystem#getVersionNeeded <em>Version Needed</em>}</li>
 *   <li>{@link fhiRCore.resources.CodeSystem#getContent <em>Content</em>}</li>
 *   <li>{@link fhiRCore.resources.CodeSystem#getSupplements <em>Supplements</em>}</li>
 *   <li>{@link fhiRCore.resources.CodeSystem#getCount <em>Count</em>}</li>
 *   <li>{@link fhiRCore.resources.CodeSystem#getFilters <em>Filter</em>}</li>
 *   <li>{@link fhiRCore.resources.CodeSystem#getProperties <em>Property</em>}</li>
 *   <li>{@link fhiRCore.resources.CodeSystem#getConcepts <em>Concept</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getCodeSystem()
 * @model
 * @generated
 */
public interface CodeSystem extends DomainResource {
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
	 * @see fhiRCore.resources.ResourcesPackage#getCodeSystem_Url()
	 * @model containment="true"
	 * @generated
	 */
	Uri getUrl();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CodeSystem#getUrl <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' containment reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(Uri value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getCodeSystem_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

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
	 * @see fhiRCore.resources.ResourcesPackage#getCodeSystem_Version()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getVersion();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CodeSystem#getVersion <em>Version</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getCodeSystem_Name()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getName();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CodeSystem#getName <em>Name</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getCodeSystem_Title()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getTitle();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CodeSystem#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(fhiRCore.dataTypes.String value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getCodeSystem_Status()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CodeSystem#getStatus <em>Status</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getCodeSystem_Experimental()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getExperimental();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CodeSystem#getExperimental <em>Experimental</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getCodeSystem_Date()
	 * @model containment="true"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CodeSystem#getDate <em>Date</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getCodeSystem_Publisher()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getPublisher();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CodeSystem#getPublisher <em>Publisher</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getCodeSystem_Contact()
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
	 * @see fhiRCore.resources.ResourcesPackage#getCodeSystem_Description()
	 * @model containment="true"
	 * @generated
	 */
	Markdown getDescription();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CodeSystem#getDescription <em>Description</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getCodeSystem_UseContext()
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
	 * @see fhiRCore.resources.ResourcesPackage#getCodeSystem_Jurisdiction()
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
	 * @see fhiRCore.resources.ResourcesPackage#getCodeSystem_Purpose()
	 * @model containment="true"
	 * @generated
	 */
	Markdown getPurpose();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CodeSystem#getPurpose <em>Purpose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' containment reference.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(Markdown value);

	/**
	 * Returns the value of the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copyright</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copyright</em>' containment reference.
	 * @see #setCopyright(Markdown)
	 * @see fhiRCore.resources.ResourcesPackage#getCodeSystem_Copyright()
	 * @model containment="true"
	 * @generated
	 */
	Markdown getCopyright();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CodeSystem#getCopyright <em>Copyright</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copyright</em>' containment reference.
	 * @see #getCopyright()
	 * @generated
	 */
	void setCopyright(Markdown value);

	/**
	 * Returns the value of the '<em><b>Case Sensitive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Case Sensitive</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case Sensitive</em>' containment reference.
	 * @see #setCaseSensitive(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getCodeSystem_CaseSensitive()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getCaseSensitive();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CodeSystem#getCaseSensitive <em>Case Sensitive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case Sensitive</em>' containment reference.
	 * @see #getCaseSensitive()
	 * @generated
	 */
	void setCaseSensitive(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Value Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Set</em>' containment reference.
	 * @see #setValueSet(ValueSet)
	 * @see fhiRCore.resources.ResourcesPackage#getCodeSystem_ValueSet()
	 * @model containment="true"
	 * @generated
	 */
	ValueSet getValueSet();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CodeSystem#getValueSet <em>Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set</em>' containment reference.
	 * @see #getValueSet()
	 * @generated
	 */
	void setValueSet(ValueSet value);

	/**
	 * Returns the value of the '<em><b>Hierarchy Meaning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hierarchy Meaning</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hierarchy Meaning</em>' containment reference.
	 * @see #setHierarchyMeaning(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getCodeSystem_HierarchyMeaning()
	 * @model containment="true"
	 * @generated
	 */
	Code getHierarchyMeaning();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CodeSystem#getHierarchyMeaning <em>Hierarchy Meaning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hierarchy Meaning</em>' containment reference.
	 * @see #getHierarchyMeaning()
	 * @generated
	 */
	void setHierarchyMeaning(Code value);

	/**
	 * Returns the value of the '<em><b>Compositional</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compositional</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compositional</em>' containment reference.
	 * @see #setCompositional(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getCodeSystem_Compositional()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getCompositional();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CodeSystem#getCompositional <em>Compositional</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compositional</em>' containment reference.
	 * @see #getCompositional()
	 * @generated
	 */
	void setCompositional(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Version Needed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version Needed</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version Needed</em>' containment reference.
	 * @see #setVersionNeeded(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getCodeSystem_VersionNeeded()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getVersionNeeded();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CodeSystem#getVersionNeeded <em>Version Needed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Needed</em>' containment reference.
	 * @see #getVersionNeeded()
	 * @generated
	 */
	void setVersionNeeded(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference.
	 * @see #setContent(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getCodeSystem_Content()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getContent();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CodeSystem#getContent <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(Code value);

	/**
	 * Returns the value of the '<em><b>Supplements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplements</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplements</em>' containment reference.
	 * @see #setSupplements(CodeSystem)
	 * @see fhiRCore.resources.ResourcesPackage#getCodeSystem_Supplements()
	 * @model containment="true"
	 * @generated
	 */
	CodeSystem getSupplements();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CodeSystem#getSupplements <em>Supplements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplements</em>' containment reference.
	 * @see #getSupplements()
	 * @generated
	 */
	void setSupplements(CodeSystem value);

	/**
	 * Returns the value of the '<em><b>Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Count</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' containment reference.
	 * @see #setCount(UnsignedInt)
	 * @see fhiRCore.resources.ResourcesPackage#getCodeSystem_Count()
	 * @model containment="true"
	 * @generated
	 */
	UnsignedInt getCount();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CodeSystem#getCount <em>Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' containment reference.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.CodeSystemFilter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getCodeSystem_Filter()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeSystemFilter> getFilters();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.CodeSystemProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getCodeSystem_Property()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeSystemProperty> getProperties();

	/**
	 * Returns the value of the '<em><b>Concept</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.CodeSystemConceptDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concept</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concept</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getCodeSystem_Concept()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeSystemConceptDefinition> getConcepts();

} // CodeSystem
