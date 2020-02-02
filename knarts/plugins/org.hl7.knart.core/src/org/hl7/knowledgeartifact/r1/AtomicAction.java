/**
 */
package org.hl7.knowledgeartifact.r1;

import org.hl7.cdsdt.r2.ST;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An action that is not further broken down into constituent actions.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r1.AtomicAction#getTextEquivalent <em>Text Equivalent</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r1.R1Package#getAtomicAction()
 * @model abstract="true"
 *        extendedMetaData="name='AtomicAction' kind='elementOnly'"
 * @generated
 */
public interface AtomicAction extends ActionBase {
	/**
	 * Returns the value of the '<em><b>Text Equivalent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A brief textual description of the action that
	 * 								summarizes the action 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text Equivalent</em>' containment reference.
	 * @see #setTextEquivalent(ST)
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getAtomicAction_TextEquivalent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='textEquivalent' namespace='##targetNamespace'"
	 * @generated
	 */
	ST getTextEquivalent();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r1.AtomicAction#getTextEquivalent <em>Text Equivalent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Equivalent</em>' containment reference.
	 * @see #getTextEquivalent()
	 * @generated
	 */
	void setTextEquivalent(ST value);

} // AtomicAction
