/**
 */
package org.hl7.knowledgeartifact.r2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.hl7.cdsdt.r2.AD;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Addresses Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.AddressesType#getAddress <em>Address</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getAddressesType()
 * @model extendedMetaData="name='addresses_._type' kind='elementOnly'"
 * @generated
 */
public interface AddressesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.cdsdt.r2.AD}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An individual address of type AD associated
	 * 									with this entity.
	 * 								
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address</em>' containment reference list.
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getAddressesType_Address()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='address' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AD> getAddress();

} // AddressesType
