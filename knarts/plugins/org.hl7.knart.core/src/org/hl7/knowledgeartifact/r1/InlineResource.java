/**
 */
package org.hl7.knowledgeartifact.r1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inline Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An Inline Resource consists of both the resource
 * 				reference information and the actual resource content/payload to be
 * 				inserted inline. The content of the document must be represented in
 * 				valid xhtml format within the content/div node.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r1.InlineResource#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r1.R1Package#getInlineResource()
 * @model extendedMetaData="name='InlineResource' kind='elementOnly'"
 * @generated
 */
public interface InlineResource extends KnowledgeResource {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The document content in xhtml format.
	 * 							
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content</em>' containment reference.
	 * @see #setContent(ContentType)
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getInlineResource_Content()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='content' namespace='##targetNamespace'"
	 * @generated
	 */
	ContentType getContent();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r1.InlineResource#getContent <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(ContentType value);

} // InlineResource
