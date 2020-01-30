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
 * A representation of the model object '<em><b>Operation Definition</b></em>'.
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
 *   <li>{@link fhiRCore.resources.OperationDefinition#getUrl <em>Url</em>}</li>
 *   <li>{@link fhiRCore.resources.OperationDefinition#getVersion <em>Version</em>}</li>
 *   <li>{@link fhiRCore.resources.OperationDefinition#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.resources.OperationDefinition#getTitle <em>Title</em>}</li>
 *   <li>{@link fhiRCore.resources.OperationDefinition#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.OperationDefinition#getKind <em>Kind</em>}</li>
 *   <li>{@link fhiRCore.resources.OperationDefinition#getExperimental <em>Experimental</em>}</li>
 *   <li>{@link fhiRCore.resources.OperationDefinition#getDate <em>Date</em>}</li>
 *   <li>{@link fhiRCore.resources.OperationDefinition#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link fhiRCore.resources.OperationDefinition#getContacts <em>Contact</em>}</li>
 *   <li>{@link fhiRCore.resources.OperationDefinition#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.OperationDefinition#getUseContexts <em>Use Context</em>}</li>
 *   <li>{@link fhiRCore.resources.OperationDefinition#getJurisdictions <em>Jurisdiction</em>}</li>
 *   <li>{@link fhiRCore.resources.OperationDefinition#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link fhiRCore.resources.OperationDefinition#getAffectsState <em>Affects State</em>}</li>
 *   <li>{@link fhiRCore.resources.OperationDefinition#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.OperationDefinition#getComment <em>Comment</em>}</li>
 *   <li>{@link fhiRCore.resources.OperationDefinition#getBase <em>Base</em>}</li>
 *   <li>{@link fhiRCore.resources.OperationDefinition#getResources <em>Resource</em>}</li>
 *   <li>{@link fhiRCore.resources.OperationDefinition#getSystem <em>System</em>}</li>
 *   <li>{@link fhiRCore.resources.OperationDefinition#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.OperationDefinition#getInstance <em>Instance</em>}</li>
 *   <li>{@link fhiRCore.resources.OperationDefinition#getInputProfile <em>Input Profile</em>}</li>
 *   <li>{@link fhiRCore.resources.OperationDefinition#getOutputProfile <em>Output Profile</em>}</li>
 *   <li>{@link fhiRCore.resources.OperationDefinition#getParameters <em>Parameter</em>}</li>
 *   <li>{@link fhiRCore.resources.OperationDefinition#getOverloads <em>Overload</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getOperationDefinition()
 * @model
 * @generated
 */
public interface OperationDefinition extends DomainResource {
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
	 * @see fhiRCore.resources.ResourcesPackage#getOperationDefinition_Url()
	 * @model containment="true"
	 * @generated
	 */
	Uri getUrl();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.OperationDefinition#getUrl <em>Url</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getOperationDefinition_Version()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getVersion();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.OperationDefinition#getVersion <em>Version</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getOperationDefinition_Name()
	 * @model containment="true" required="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getName();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.OperationDefinition#getName <em>Name</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getOperationDefinition_Title()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getTitle();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.OperationDefinition#getTitle <em>Title</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getOperationDefinition_Status()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.OperationDefinition#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getOperationDefinition_Kind()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getKind();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.OperationDefinition#getKind <em>Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' containment reference.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(Code value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getOperationDefinition_Experimental()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getExperimental();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.OperationDefinition#getExperimental <em>Experimental</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getOperationDefinition_Date()
	 * @model containment="true"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.OperationDefinition#getDate <em>Date</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getOperationDefinition_Publisher()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getPublisher();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.OperationDefinition#getPublisher <em>Publisher</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getOperationDefinition_Contact()
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
	 * @see fhiRCore.resources.ResourcesPackage#getOperationDefinition_Description()
	 * @model containment="true"
	 * @generated
	 */
	Markdown getDescription();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.OperationDefinition#getDescription <em>Description</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getOperationDefinition_UseContext()
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
	 * @see fhiRCore.resources.ResourcesPackage#getOperationDefinition_Jurisdiction()
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
	 * @see fhiRCore.resources.ResourcesPackage#getOperationDefinition_Purpose()
	 * @model containment="true"
	 * @generated
	 */
	Markdown getPurpose();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.OperationDefinition#getPurpose <em>Purpose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' containment reference.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(Markdown value);

	/**
	 * Returns the value of the '<em><b>Affects State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Affects State</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affects State</em>' containment reference.
	 * @see #setAffectsState(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getOperationDefinition_AffectsState()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getAffectsState();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.OperationDefinition#getAffectsState <em>Affects State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affects State</em>' containment reference.
	 * @see #getAffectsState()
	 * @generated
	 */
	void setAffectsState(fhiRCore.dataTypes.Boolean value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getOperationDefinition_Code()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getCode();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.OperationDefinition#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Code value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' containment reference.
	 * @see #setComment(Markdown)
	 * @see fhiRCore.resources.ResourcesPackage#getOperationDefinition_Comment()
	 * @model containment="true"
	 * @generated
	 */
	Markdown getComment();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.OperationDefinition#getComment <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' containment reference.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(Markdown value);

	/**
	 * Returns the value of the '<em><b>Base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' containment reference.
	 * @see #setBase(OperationDefinition)
	 * @see fhiRCore.resources.ResourcesPackage#getOperationDefinition_Base()
	 * @model containment="true"
	 * @generated
	 */
	OperationDefinition getBase();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.OperationDefinition#getBase <em>Base</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' containment reference.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(OperationDefinition value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Code}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getOperationDefinition_Resource()
	 * @model containment="true"
	 * @generated
	 */
	EList<Code> getResources();

	/**
	 * Returns the value of the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' containment reference.
	 * @see #setSystem(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getOperationDefinition_System()
	 * @model containment="true" required="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getSystem();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.OperationDefinition#getSystem <em>System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' containment reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getOperationDefinition_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.OperationDefinition#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' containment reference.
	 * @see #setInstance(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getOperationDefinition_Instance()
	 * @model containment="true" required="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getInstance();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.OperationDefinition#getInstance <em>Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance</em>' containment reference.
	 * @see #getInstance()
	 * @generated
	 */
	void setInstance(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Input Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Profile</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Profile</em>' containment reference.
	 * @see #setInputProfile(StructureDefinition)
	 * @see fhiRCore.resources.ResourcesPackage#getOperationDefinition_InputProfile()
	 * @model containment="true"
	 * @generated
	 */
	StructureDefinition getInputProfile();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.OperationDefinition#getInputProfile <em>Input Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Profile</em>' containment reference.
	 * @see #getInputProfile()
	 * @generated
	 */
	void setInputProfile(StructureDefinition value);

	/**
	 * Returns the value of the '<em><b>Output Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Profile</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Profile</em>' containment reference.
	 * @see #setOutputProfile(StructureDefinition)
	 * @see fhiRCore.resources.ResourcesPackage#getOperationDefinition_OutputProfile()
	 * @model containment="true"
	 * @generated
	 */
	StructureDefinition getOutputProfile();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.OperationDefinition#getOutputProfile <em>Output Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Profile</em>' containment reference.
	 * @see #getOutputProfile()
	 * @generated
	 */
	void setOutputProfile(StructureDefinition value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.OperationDefinitionParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getOperationDefinition_Parameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationDefinitionParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Overload</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.OperationDefinitionOverload}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overload</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overload</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getOperationDefinition_Overload()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationDefinitionOverload> getOverloads();

} // OperationDefinition
