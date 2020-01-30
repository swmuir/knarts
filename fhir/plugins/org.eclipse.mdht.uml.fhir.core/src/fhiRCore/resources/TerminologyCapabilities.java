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
 * A representation of the model object '<em><b>Terminology Capabilities</b></em>'.
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
 *   <li>{@link fhiRCore.resources.TerminologyCapabilities#getUrl <em>Url</em>}</li>
 *   <li>{@link fhiRCore.resources.TerminologyCapabilities#getVersion <em>Version</em>}</li>
 *   <li>{@link fhiRCore.resources.TerminologyCapabilities#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.resources.TerminologyCapabilities#getTitle <em>Title</em>}</li>
 *   <li>{@link fhiRCore.resources.TerminologyCapabilities#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.TerminologyCapabilities#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link fhiRCore.resources.TerminologyCapabilities#getDate <em>Date</em>}</li>
 *   <li>{@link fhiRCore.resources.TerminologyCapabilities#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link fhiRCore.resources.TerminologyCapabilities#getContacts <em>Contact</em>}</li>
 *   <li>{@link fhiRCore.resources.TerminologyCapabilities#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.TerminologyCapabilities#getUseContexts <em>Use Context</em>}</li>
 *   <li>{@link fhiRCore.resources.TerminologyCapabilities#getJurisdictions <em>Jurisdiction</em>}</li>
 *   <li>{@link fhiRCore.resources.TerminologyCapabilities#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link fhiRCore.resources.TerminologyCapabilities#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link fhiRCore.resources.TerminologyCapabilities#getKind <em>Kind</em>}</li>
 *   <li>{@link fhiRCore.resources.TerminologyCapabilities#getSoftware <em>Software</em>}</li>
 *   <li>{@link fhiRCore.resources.TerminologyCapabilities#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link fhiRCore.resources.TerminologyCapabilities#getLockedDate <em>Locked Date</em>}</li>
 *   <li>{@link fhiRCore.resources.TerminologyCapabilities#getCodeSystems <em>Code System</em>}</li>
 *   <li>{@link fhiRCore.resources.TerminologyCapabilities#getExpansion <em>Expansion</em>}</li>
 *   <li>{@link fhiRCore.resources.TerminologyCapabilities#getCodeSearch <em>Code Search</em>}</li>
 *   <li>{@link fhiRCore.resources.TerminologyCapabilities#getValidateCode <em>Validate Code</em>}</li>
 *   <li>{@link fhiRCore.resources.TerminologyCapabilities#getTranslation <em>Translation</em>}</li>
 *   <li>{@link fhiRCore.resources.TerminologyCapabilities#getClosure <em>Closure</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getTerminologyCapabilities()
 * @model
 * @generated
 */
public interface TerminologyCapabilities extends DomainResource {
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
	 * @see fhiRCore.resources.ResourcesPackage#getTerminologyCapabilities_Url()
	 * @model containment="true"
	 * @generated
	 */
	Uri getUrl();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TerminologyCapabilities#getUrl <em>Url</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getTerminologyCapabilities_Version()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getVersion();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TerminologyCapabilities#getVersion <em>Version</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getTerminologyCapabilities_Name()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getName();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TerminologyCapabilities#getName <em>Name</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getTerminologyCapabilities_Title()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getTitle();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TerminologyCapabilities#getTitle <em>Title</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getTerminologyCapabilities_Status()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TerminologyCapabilities#getStatus <em>Status</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getTerminologyCapabilities_Experimental()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getExperimental();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TerminologyCapabilities#getExperimental <em>Experimental</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getTerminologyCapabilities_Date()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TerminologyCapabilities#getDate <em>Date</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getTerminologyCapabilities_Publisher()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getPublisher();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TerminologyCapabilities#getPublisher <em>Publisher</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getTerminologyCapabilities_Contact()
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
	 * @see fhiRCore.resources.ResourcesPackage#getTerminologyCapabilities_Description()
	 * @model containment="true"
	 * @generated
	 */
	Markdown getDescription();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TerminologyCapabilities#getDescription <em>Description</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getTerminologyCapabilities_UseContext()
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
	 * @see fhiRCore.resources.ResourcesPackage#getTerminologyCapabilities_Jurisdiction()
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
	 * @see fhiRCore.resources.ResourcesPackage#getTerminologyCapabilities_Purpose()
	 * @model containment="true"
	 * @generated
	 */
	Markdown getPurpose();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TerminologyCapabilities#getPurpose <em>Purpose</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getTerminologyCapabilities_Copyright()
	 * @model containment="true"
	 * @generated
	 */
	Markdown getCopyright();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TerminologyCapabilities#getCopyright <em>Copyright</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copyright</em>' containment reference.
	 * @see #getCopyright()
	 * @generated
	 */
	void setCopyright(Markdown value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' containment reference.
	 * @see #setKind(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getTerminologyCapabilities_Kind()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getKind();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TerminologyCapabilities#getKind <em>Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' containment reference.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(Code value);

	/**
	 * Returns the value of the '<em><b>Software</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Software</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software</em>' containment reference.
	 * @see #setSoftware(TerminologyCapabilitiesSoftware)
	 * @see fhiRCore.resources.ResourcesPackage#getTerminologyCapabilities_Software()
	 * @model containment="true"
	 * @generated
	 */
	TerminologyCapabilitiesSoftware getSoftware();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TerminologyCapabilities#getSoftware <em>Software</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software</em>' containment reference.
	 * @see #getSoftware()
	 * @generated
	 */
	void setSoftware(TerminologyCapabilitiesSoftware value);

	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' containment reference.
	 * @see #setImplementation(TerminologyCapabilitiesImplementation)
	 * @see fhiRCore.resources.ResourcesPackage#getTerminologyCapabilities_Implementation()
	 * @model containment="true"
	 * @generated
	 */
	TerminologyCapabilitiesImplementation getImplementation();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TerminologyCapabilities#getImplementation <em>Implementation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation</em>' containment reference.
	 * @see #getImplementation()
	 * @generated
	 */
	void setImplementation(TerminologyCapabilitiesImplementation value);

	/**
	 * Returns the value of the '<em><b>Locked Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locked Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locked Date</em>' containment reference.
	 * @see #setLockedDate(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getTerminologyCapabilities_LockedDate()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getLockedDate();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TerminologyCapabilities#getLockedDate <em>Locked Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locked Date</em>' containment reference.
	 * @see #getLockedDate()
	 * @generated
	 */
	void setLockedDate(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Code System</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.TerminologyCapabilitiesCodeSystem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code System</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code System</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getTerminologyCapabilities_CodeSystem()
	 * @model containment="true"
	 * @generated
	 */
	EList<TerminologyCapabilitiesCodeSystem> getCodeSystems();

	/**
	 * Returns the value of the '<em><b>Expansion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expansion</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expansion</em>' containment reference.
	 * @see #setExpansion(TerminologyCapabilitiesExpansion)
	 * @see fhiRCore.resources.ResourcesPackage#getTerminologyCapabilities_Expansion()
	 * @model containment="true"
	 * @generated
	 */
	TerminologyCapabilitiesExpansion getExpansion();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TerminologyCapabilities#getExpansion <em>Expansion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expansion</em>' containment reference.
	 * @see #getExpansion()
	 * @generated
	 */
	void setExpansion(TerminologyCapabilitiesExpansion value);

	/**
	 * Returns the value of the '<em><b>Code Search</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Search</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Search</em>' containment reference.
	 * @see #setCodeSearch(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getTerminologyCapabilities_CodeSearch()
	 * @model containment="true"
	 * @generated
	 */
	Code getCodeSearch();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TerminologyCapabilities#getCodeSearch <em>Code Search</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Search</em>' containment reference.
	 * @see #getCodeSearch()
	 * @generated
	 */
	void setCodeSearch(Code value);

	/**
	 * Returns the value of the '<em><b>Validate Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validate Code</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validate Code</em>' containment reference.
	 * @see #setValidateCode(TerminologyCapabilitiesValidateCode)
	 * @see fhiRCore.resources.ResourcesPackage#getTerminologyCapabilities_ValidateCode()
	 * @model containment="true"
	 * @generated
	 */
	TerminologyCapabilitiesValidateCode getValidateCode();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TerminologyCapabilities#getValidateCode <em>Validate Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validate Code</em>' containment reference.
	 * @see #getValidateCode()
	 * @generated
	 */
	void setValidateCode(TerminologyCapabilitiesValidateCode value);

	/**
	 * Returns the value of the '<em><b>Translation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Translation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translation</em>' containment reference.
	 * @see #setTranslation(TerminologyCapabilitiesTranslation)
	 * @see fhiRCore.resources.ResourcesPackage#getTerminologyCapabilities_Translation()
	 * @model containment="true"
	 * @generated
	 */
	TerminologyCapabilitiesTranslation getTranslation();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TerminologyCapabilities#getTranslation <em>Translation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translation</em>' containment reference.
	 * @see #getTranslation()
	 * @generated
	 */
	void setTranslation(TerminologyCapabilitiesTranslation value);

	/**
	 * Returns the value of the '<em><b>Closure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Closure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Closure</em>' containment reference.
	 * @see #setClosure(TerminologyCapabilitiesClosure)
	 * @see fhiRCore.resources.ResourcesPackage#getTerminologyCapabilities_Closure()
	 * @model containment="true"
	 * @generated
	 */
	TerminologyCapabilitiesClosure getClosure();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.TerminologyCapabilities#getClosure <em>Closure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Closure</em>' containment reference.
	 * @see #getClosure()
	 * @generated
	 */
	void setClosure(TerminologyCapabilitiesClosure value);

} // TerminologyCapabilities
