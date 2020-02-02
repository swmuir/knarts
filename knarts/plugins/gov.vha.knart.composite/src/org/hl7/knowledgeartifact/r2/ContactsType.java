/**
 */
package org.hl7.knowledgeartifact.r2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.hl7.cdsdt.r2.TEL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contacts Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.ContactsType#getContact <em>Contact</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getContactsType()
 * @model extendedMetaData="name='contacts_._type' kind='elementOnly'"
 * @generated
 */
public interface ContactsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.cdsdt.r2.TEL}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An individual contact item of type TEL
	 * 									associated with this entity.
	 * 								
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact</em>' containment reference list.
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getContactsType_Contact()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='contact' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TEL> getContact();

} // ContactsType
