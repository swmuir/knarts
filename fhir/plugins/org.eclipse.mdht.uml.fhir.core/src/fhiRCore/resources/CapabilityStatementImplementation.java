/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Reference;
import fhiRCore.dataTypes.Url;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability Statement Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.CapabilityStatementImplementation#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.CapabilityStatementImplementation#getUrl <em>Url</em>}</li>
 *   <li>{@link fhiRCore.resources.CapabilityStatementImplementation#getCustodian <em>Custodian</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getCapabilityStatementImplementation()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CapabilityStatement_Implementation'"
 * @generated
 */
public interface CapabilityStatementImplementation extends BackboneElement {
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
	 * @see fhiRCore.resources.ResourcesPackage#getCapabilityStatementImplementation_Description()
	 * @model containment="true" required="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDescription();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CapabilityStatementImplementation#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' containment reference.
	 * @see #setUrl(Url)
	 * @see fhiRCore.resources.ResourcesPackage#getCapabilityStatementImplementation_Url()
	 * @model containment="true"
	 * @generated
	 */
	Url getUrl();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CapabilityStatementImplementation#getUrl <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' containment reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(Url value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getCapabilityStatementImplementation_Custodian()
	 * @model containment="true"
	 * @generated
	 */
	Reference getCustodian();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.CapabilityStatementImplementation#getCustodian <em>Custodian</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custodian</em>' containment reference.
	 * @see #getCustodian()
	 * @generated
	 */
	void setCustodian(Reference value);

} // CapabilityStatementImplementation
