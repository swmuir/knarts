/**
 */
package org.hl7.knowledgeartifact.r1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Party</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Party represents the abstract base type for
 * 				entities that have addresses and contact information. It is intended
 * 				to be extended and specialized by the Person and Organization
 * 				concept. Note that Party allows for polymorphism using the xsi:type
 * 				construct. For instance, by defining a 'contributor' to be of type
 * 				'Party', one allows the contributor to be either a person or a
 * 				company (its derived types).
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r1.Party#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.Party#getContacts <em>Contacts</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r1.R1Package#getParty()
 * @model abstract="true"
 *        extendedMetaData="name='Party' kind='elementOnly'"
 * @generated
 */
public interface Party extends EObject {
	/**
	 * Returns the value of the '<em><b>Addresses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of addresses associated with this entity.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Addresses</em>' containment reference.
	 * @see #setAddresses(AddressesType)
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getParty_Addresses()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='addresses' namespace='##targetNamespace'"
	 * @generated
	 */
	AddressesType getAddresses();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r1.Party#getAddresses <em>Addresses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Addresses</em>' containment reference.
	 * @see #getAddresses()
	 * @generated
	 */
	void setAddresses(AddressesType value);

	/**
	 * Returns the value of the '<em><b>Contacts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of contact information associated with
	 * 						this entity.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contacts</em>' containment reference.
	 * @see #setContacts(ContactsType)
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getParty_Contacts()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contacts' namespace='##targetNamespace'"
	 * @generated
	 */
	ContactsType getContacts();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r1.Party#getContacts <em>Contacts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contacts</em>' containment reference.
	 * @see #getContacts()
	 * @generated
	 */
	void setContacts(ContactsType value);

} // Party
