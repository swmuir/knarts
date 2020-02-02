/**
 */
package org.hl7.knowledgeartifact.r2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.hl7.cdsdt.r2.CD;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Codes Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.ItemCodesType#getItemCode <em>Item Code</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getItemCodesType()
 * @model extendedMetaData="name='itemCodes_._type' kind='elementOnly'"
 * @generated
 */
public interface ItemCodesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Item Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.cdsdt.r2.CD}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A code for a concept that is the equivalent
	 * 											of this documentation item.
	 * 										
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item Code</em>' containment reference list.
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getItemCodesType_ItemCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='itemCode' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CD> getItemCode();

} // ItemCodesType
