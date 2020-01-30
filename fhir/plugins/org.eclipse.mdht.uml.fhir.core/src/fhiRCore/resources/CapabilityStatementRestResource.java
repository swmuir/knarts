/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.Markdown;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability Statement Rest Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.CapabilityStatementRestResource#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.CapabilityStatementRestResource#getProfile <em>Profile</em>}</li>
 *   <li>{@link fhiRCore.resources.CapabilityStatementRestResource#getSupportedProfiles <em>Supported Profile</em>}</li>
 *   <li>{@link fhiRCore.resources.CapabilityStatementRestResource#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link fhiRCore.resources.CapabilityStatementRestResource#getInteractions <em>Interaction</em>}</li>
 *   <li>{@link fhiRCore.resources.CapabilityStatementRestResource#getVersioning <em>Versioning</em>}</li>
 *   <li>{@link fhiRCore.resources.CapabilityStatementRestResource#getReadHistory <em>Read History</em>}</li>
 *   <li>{@link fhiRCore.resources.CapabilityStatementRestResource#getUpdateCreate <em>Update Create</em>}</li>
 *   <li>{@link fhiRCore.resources.CapabilityStatementRestResource#getConditionalCreate <em>Conditional Create</em>}</li>
 *   <li>{@link fhiRCore.resources.CapabilityStatementRestResource#getConditionalRead <em>Conditional Read</em>}</li>
 *   <li>{@link fhiRCore.resources.CapabilityStatementRestResource#getConditionalUpdate <em>Conditional Update</em>}</li>
 *   <li>{@link fhiRCore.resources.CapabilityStatementRestResource#getConditionalDelete <em>Conditional Delete</em>}</li>
 *   <li>{@link fhiRCore.resources.CapabilityStatementRestResource#getReferencePolicies <em>Reference Policy</em>}</li>
 *   <li>{@link fhiRCore.resources.CapabilityStatementRestResource#getSearchIncludes <em>Search Include</em>}</li>
 *   <li>{@link fhiRCore.resources.CapabilityStatementRestResource#getSearchRevIncludes <em>Search Rev Include</em>}</li>
 *   <li>{@link fhiRCore.resources.CapabilityStatementRestResource#getSearchParams <em>Search Param</em>}</li>
 *   <li>{@link fhiRCore.resources.CapabilityStatementRestResource#getOperations <em>Operation</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getCapabilityStatementRestResource()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Rest_Resource'"
 * @generated
 */
public interface CapabilityStatementRestResource extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getCapabilityStatementRestResource_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CapabilityStatementRestResource#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Code value);

	/**
	 * Returns the value of the '<em><b>Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile</em>' containment reference.
	 * @see #setProfile(StructureDefinition)
	 * @see fhiRCore.resources.ResourcesPackage#getCapabilityStatementRestResource_Profile()
	 * @model containment="true"
	 * @generated
	 */
	StructureDefinition getProfile();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CapabilityStatementRestResource#getProfile <em>Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile</em>' containment reference.
	 * @see #getProfile()
	 * @generated
	 */
	void setProfile(StructureDefinition value);

	/**
	 * Returns the value of the '<em><b>Supported Profile</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.StructureDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported Profile</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Profile</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getCapabilityStatementRestResource_SupportedProfile()
	 * @model containment="true"
	 * @generated
	 */
	EList<StructureDefinition> getSupportedProfiles();

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' containment reference.
	 * @see #setDocumentation(Markdown)
	 * @see fhiRCore.resources.ResourcesPackage#getCapabilityStatementRestResource_Documentation()
	 * @model containment="true"
	 * @generated
	 */
	Markdown getDocumentation();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CapabilityStatementRestResource#getDocumentation <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' containment reference.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(Markdown value);

	/**
	 * Returns the value of the '<em><b>Interaction</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.CapabilityStatementRestResourceResourceInteraction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getCapabilityStatementRestResource_Interaction()
	 * @model containment="true"
	 * @generated
	 */
	EList<CapabilityStatementRestResourceResourceInteraction> getInteractions();

	/**
	 * Returns the value of the '<em><b>Versioning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Versioning</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Versioning</em>' containment reference.
	 * @see #setVersioning(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getCapabilityStatementRestResource_Versioning()
	 * @model containment="true"
	 * @generated
	 */
	Code getVersioning();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CapabilityStatementRestResource#getVersioning <em>Versioning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Versioning</em>' containment reference.
	 * @see #getVersioning()
	 * @generated
	 */
	void setVersioning(Code value);

	/**
	 * Returns the value of the '<em><b>Read History</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read History</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read History</em>' containment reference.
	 * @see #setReadHistory(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getCapabilityStatementRestResource_ReadHistory()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getReadHistory();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CapabilityStatementRestResource#getReadHistory <em>Read History</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read History</em>' containment reference.
	 * @see #getReadHistory()
	 * @generated
	 */
	void setReadHistory(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Update Create</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update Create</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Create</em>' containment reference.
	 * @see #setUpdateCreate(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getCapabilityStatementRestResource_UpdateCreate()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getUpdateCreate();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CapabilityStatementRestResource#getUpdateCreate <em>Update Create</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Create</em>' containment reference.
	 * @see #getUpdateCreate()
	 * @generated
	 */
	void setUpdateCreate(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Conditional Create</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditional Create</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditional Create</em>' containment reference.
	 * @see #setConditionalCreate(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getCapabilityStatementRestResource_ConditionalCreate()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getConditionalCreate();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CapabilityStatementRestResource#getConditionalCreate <em>Conditional Create</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditional Create</em>' containment reference.
	 * @see #getConditionalCreate()
	 * @generated
	 */
	void setConditionalCreate(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Conditional Read</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditional Read</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditional Read</em>' containment reference.
	 * @see #setConditionalRead(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getCapabilityStatementRestResource_ConditionalRead()
	 * @model containment="true"
	 * @generated
	 */
	Code getConditionalRead();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CapabilityStatementRestResource#getConditionalRead <em>Conditional Read</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditional Read</em>' containment reference.
	 * @see #getConditionalRead()
	 * @generated
	 */
	void setConditionalRead(Code value);

	/**
	 * Returns the value of the '<em><b>Conditional Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditional Update</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditional Update</em>' containment reference.
	 * @see #setConditionalUpdate(fhiRCore.dataTypes.Boolean)
	 * @see fhiRCore.resources.ResourcesPackage#getCapabilityStatementRestResource_ConditionalUpdate()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.Boolean getConditionalUpdate();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CapabilityStatementRestResource#getConditionalUpdate <em>Conditional Update</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditional Update</em>' containment reference.
	 * @see #getConditionalUpdate()
	 * @generated
	 */
	void setConditionalUpdate(fhiRCore.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Conditional Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditional Delete</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditional Delete</em>' containment reference.
	 * @see #setConditionalDelete(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getCapabilityStatementRestResource_ConditionalDelete()
	 * @model containment="true"
	 * @generated
	 */
	Code getConditionalDelete();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CapabilityStatementRestResource#getConditionalDelete <em>Conditional Delete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditional Delete</em>' containment reference.
	 * @see #getConditionalDelete()
	 * @generated
	 */
	void setConditionalDelete(Code value);

	/**
	 * Returns the value of the '<em><b>Reference Policy</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Code}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Policy</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Policy</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getCapabilityStatementRestResource_ReferencePolicy()
	 * @model containment="true"
	 * @generated
	 */
	EList<Code> getReferencePolicies();

	/**
	 * Returns the value of the '<em><b>Search Include</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Search Include</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Search Include</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getCapabilityStatementRestResource_SearchInclude()
	 * @model containment="true"
	 * @generated
	 */
	EList<fhiRCore.dataTypes.String> getSearchIncludes();

	/**
	 * Returns the value of the '<em><b>Search Rev Include</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Search Rev Include</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Search Rev Include</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getCapabilityStatementRestResource_SearchRevInclude()
	 * @model containment="true"
	 * @generated
	 */
	EList<fhiRCore.dataTypes.String> getSearchRevIncludes();

	/**
	 * Returns the value of the '<em><b>Search Param</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.CapabilityStatementRestResourceSearchParam}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Search Param</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Search Param</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getCapabilityStatementRestResource_SearchParam()
	 * @model containment="true"
	 * @generated
	 */
	EList<CapabilityStatementRestResourceSearchParam> getSearchParams();

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.CapabilityStatementRestResourceOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getCapabilityStatementRestResource_Operation()
	 * @model containment="true"
	 * @generated
	 */
	EList<CapabilityStatementRestResourceOperation> getOperations();

} // CapabilityStatementRestResource
