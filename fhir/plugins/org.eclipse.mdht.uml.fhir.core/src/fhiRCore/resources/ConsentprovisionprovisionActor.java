/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Reference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consentprovisionprovision Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ConsentprovisionprovisionActor#getRole <em>Role</em>}</li>
 *   <li>{@link fhiRCore.resources.ConsentprovisionprovisionActor#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getConsentprovisionprovisionActor()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='provision_ProvisionActor'"
 * @generated
 */
public interface ConsentprovisionprovisionActor extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' containment reference.
	 * @see #setRole(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getConsentprovisionprovisionActor_Role()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getRole();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ConsentprovisionprovisionActor#getRole <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' containment reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference.
	 * @see #setReference(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getConsentprovisionprovisionActor_Reference()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getReference();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ConsentprovisionprovisionActor#getReference <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' containment reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Reference value);

} // ConsentprovisionprovisionActor
