/**
 */
package org.hl7.knowledgeartifact.r2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Hash Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.ContentHashType#getHashvalue <em>Hashvalue</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getContentHashType()
 * @model extendedMetaData="name='contentHash_._type' kind='empty'"
 * @generated
 */
public interface ContentHashType extends EObject {
	/**
	 * Returns the value of the '<em><b>Hashvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hashvalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hashvalue</em>' attribute.
	 * @see #setHashvalue(String)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getContentHashType_Hashvalue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='hashvalue'"
	 * @generated
	 */
	String getHashvalue();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.ContentHashType#getHashvalue <em>Hashvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hashvalue</em>' attribute.
	 * @see #getHashvalue()
	 * @generated
	 */
	void setHashvalue(String value);

} // ContentHashType
