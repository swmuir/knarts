/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.Markdown;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability Statement Rest</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.CapabilityStatementRest#getMode <em>Mode</em>}</li>
 *   <li>{@link fhiRCore.resources.CapabilityStatementRest#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link fhiRCore.resources.CapabilityStatementRest#getSecurity <em>Security</em>}</li>
 *   <li>{@link fhiRCore.resources.CapabilityStatementRest#getResources <em>Resource</em>}</li>
 *   <li>{@link fhiRCore.resources.CapabilityStatementRest#getInteractions <em>Interaction</em>}</li>
 *   <li>{@link fhiRCore.resources.CapabilityStatementRest#getSearchParams <em>Search Param</em>}</li>
 *   <li>{@link fhiRCore.resources.CapabilityStatementRest#getOperations <em>Operation</em>}</li>
 *   <li>{@link fhiRCore.resources.CapabilityStatementRest#getCompartments <em>Compartment</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getCapabilityStatementRest()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CapabilityStatement_Rest'"
 * @generated
 */
public interface CapabilityStatementRest extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' containment reference.
	 * @see #setMode(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getCapabilityStatementRest_Mode()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Code getMode();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CapabilityStatementRest#getMode <em>Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' containment reference.
	 * @see #getMode()
	 * @generated
	 */
	void setMode(Code value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getCapabilityStatementRest_Documentation()
	 * @model containment="true"
	 * @generated
	 */
	Markdown getDocumentation();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CapabilityStatementRest#getDocumentation <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' containment reference.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(Markdown value);

	/**
	 * Returns the value of the '<em><b>Security</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security</em>' containment reference.
	 * @see #setSecurity(CapabilityStatementRestSecurity)
	 * @see fhiRCore.resources.ResourcesPackage#getCapabilityStatementRest_Security()
	 * @model containment="true"
	 * @generated
	 */
	CapabilityStatementRestSecurity getSecurity();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CapabilityStatementRest#getSecurity <em>Security</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security</em>' containment reference.
	 * @see #getSecurity()
	 * @generated
	 */
	void setSecurity(CapabilityStatementRestSecurity value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.CapabilityStatementRestResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getCapabilityStatementRest_Resource()
	 * @model containment="true"
	 * @generated
	 */
	EList<CapabilityStatementRestResource> getResources();

	/**
	 * Returns the value of the '<em><b>Interaction</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.CapabilityStatementRestSystemInteraction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getCapabilityStatementRest_Interaction()
	 * @model containment="true"
	 * @generated
	 */
	EList<CapabilityStatementRestSystemInteraction> getInteractions();

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
	 * @see fhiRCore.resources.ResourcesPackage#getCapabilityStatementRest_SearchParam()
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
	 * @see fhiRCore.resources.ResourcesPackage#getCapabilityStatementRest_Operation()
	 * @model containment="true"
	 * @generated
	 */
	EList<CapabilityStatementRestResourceOperation> getOperations();

	/**
	 * Returns the value of the '<em><b>Compartment</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.CompartmentDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compartment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compartment</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getCapabilityStatementRest_Compartment()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompartmentDefinition> getCompartments();

} // CapabilityStatementRest
