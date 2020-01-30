/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.Coding;
import fhiRCore.dataTypes.Reference;
import fhiRCore.dataTypes.Signature;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract Signatory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ContractSignatory#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractSignatory#getParty <em>Party</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractSignatory#getSignatures <em>Signature</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getContractSignatory()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Contract_Signatory'"
 * @generated
 */
public interface ContractSignatory extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Coding)
	 * @see fhiRCore.resources.ResourcesPackage#getContractSignatory_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Coding getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ContractSignatory#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Coding value);

	/**
	 * Returns the value of the '<em><b>Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Party</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Party</em>' containment reference.
	 * @see #setParty(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getContractSignatory_Party()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Reference getParty();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ContractSignatory#getParty <em>Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Party</em>' containment reference.
	 * @see #getParty()
	 * @generated
	 */
	void setParty(Reference value);

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Signature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getContractSignatory_Signature()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Signature> getSignatures();

} // ContractSignatory
