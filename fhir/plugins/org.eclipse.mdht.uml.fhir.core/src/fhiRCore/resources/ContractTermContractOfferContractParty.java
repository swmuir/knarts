/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Reference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract Term Contract Offer Contract Party</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ContractTermContractOfferContractParty#getReferences <em>Reference</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermContractOfferContractParty#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getContractTermContractOfferContractParty()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ContractOffer_ContractParty'"
 * @generated
 */
public interface ContractTermContractOfferContractParty extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermContractOfferContractParty_Reference()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Reference> getReferences();

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
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermContractOfferContractParty_Role()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeableConcept getRole();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ContractTermContractOfferContractParty#getRole <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' containment reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(CodeableConcept value);

} // ContractTermContractOfferContractParty
