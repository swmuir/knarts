/**
 */
package org.hl7.knowledgeartifact.r2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wrapped Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base64 Encoded artifact that can be from an open set of types
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.WrappedContent#getContentSignifier <em>Content Signifier</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.WrappedContent#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getWrappedContent()
 * @model extendedMetaData="name='WrappedContent' kind='elementOnly'"
 * @generated
 */
public interface WrappedContent extends EObject {
	/**
	 * Returns the value of the '<em><b>Content Signifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Signifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Signifier</em>' containment reference.
	 * @see #setContentSignifier(ContentSignifier)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getWrappedContent_ContentSignifier()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='contentSignifier' namespace='##targetNamespace'"
	 * @generated
	 */
	ContentSignifier getContentSignifier();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.WrappedContent#getContentSignifier <em>Content Signifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Signifier</em>' containment reference.
	 * @see #getContentSignifier()
	 * @generated
	 */
	void setContentSignifier(ContentSignifier value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference.
	 * @see #setContent(EObject)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getWrappedContent_Content()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='content' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getContent();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.WrappedContent#getContent <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(EObject value);

} // WrappedContent
