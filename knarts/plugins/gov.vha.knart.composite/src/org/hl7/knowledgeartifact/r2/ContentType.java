/**
 */
package org.hl7.knowledgeartifact.r2;

import org.eclipse.emf.ecore.EObject;

import org.w3._1999.xhtml.DivType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.ContentType#getDiv <em>Div</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getContentType()
 * @model extendedMetaData="name='content_._type' kind='elementOnly'"
 * @generated
 */
public interface ContentType extends EObject {
	/**
	 * Returns the value of the '<em><b>Div</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       generic language/style container      
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Div</em>' containment reference.
	 * @see #setDiv(DivType)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getContentType_Div()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='div' namespace='http://www.w3.org/1999/xhtml'"
	 * @generated
	 */
	DivType getDiv();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.ContentType#getDiv <em>Div</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Div</em>' containment reference.
	 * @see #getDiv()
	 * @generated
	 */
	void setDiv(DivType value);

} // ContentType
