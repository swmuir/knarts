/**
 */
package org.hl7.knowledgeartifact.r1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An item definition is the equivalent of an item in
 * 				a data dictionary or a catalog in an electronic health record
 * 				system.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r1.ItemDefinition#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.ItemDefinition#getScopedIdentifier <em>Scoped Identifier</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r1.R1Package#getItemDefinition()
 * @model abstract="true"
 *        extendedMetaData="name='ItemDefinition' kind='elementOnly'"
 * @generated
 */
public interface ItemDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identifier for the item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(VersionedIdentifier)
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getItemDefinition_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	VersionedIdentifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r1.ItemDefinition#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(VersionedIdentifier value);

	/**
	 * Returns the value of the '<em><b>Scoped Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The unique identifier of a specific item (such as
	 * 						a data element) in a registry that maps to this item.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scoped Identifier</em>' containment reference.
	 * @see #setScopedIdentifier(VersionedIdentifier)
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getItemDefinition_ScopedIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='scopedIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	VersionedIdentifier getScopedIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r1.ItemDefinition#getScopedIdentifier <em>Scoped Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scoped Identifier</em>' containment reference.
	 * @see #getScopedIdentifier()
	 * @generated
	 */
	void setScopedIdentifier(VersionedIdentifier value);

} // ItemDefinition
