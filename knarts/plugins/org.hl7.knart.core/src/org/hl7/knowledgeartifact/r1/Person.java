/**
 */
package org.hl7.knowledgeartifact.r1;

import org.hl7.cdsdt.r2.EN;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Identifies a person who is associated with the
 * 				knowledge artifact. A person may be a contributor, a rights holder,
 * 				a publisher, and so on. Person extends party by adding a person name
 * 				attribute and an affiliation. Note, Person.name should be
 * 				constrained to be of type EN.PN
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r1.Person#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.Person#getAffiliation <em>Affiliation</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r1.R1Package#getPerson()
 * @model extendedMetaData="name='Person' kind='elementOnly'"
 * @generated
 */
public interface Person extends Party {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(EN)
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getPerson_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	EN getName();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r1.Person#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(EN value);

	/**
	 * Returns the value of the '<em><b>Affiliation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organizational affiliation for this person.
	 * 							
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Affiliation</em>' containment reference.
	 * @see #setAffiliation(Organization)
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getPerson_Affiliation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='affiliation' namespace='##targetNamespace'"
	 * @generated
	 */
	Organization getAffiliation();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r1.Person#getAffiliation <em>Affiliation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affiliation</em>' containment reference.
	 * @see #getAffiliation()
	 * @generated
	 */
	void setAffiliation(Organization value);

} // Person
