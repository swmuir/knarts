/**
 */
package org.hl7.knowledgeartifact.r2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A reference to an action defined in a library.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.ActionRef#getLibraryName <em>Library Name</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.ActionRef#getReferencedActionId <em>Referenced Action Id</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getActionRef()
 * @model extendedMetaData="name='ActionRef' kind='elementOnly'"
 * @generated
 */
public interface ActionRef extends ActionBase {
	/**
	 * Returns the value of the '<em><b>Library Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library Name</em>' attribute.
	 * @see #setLibraryName(String)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getActionRef_LibraryName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='libraryName'"
	 * @generated
	 */
	String getLibraryName();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.ActionRef#getLibraryName <em>Library Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library Name</em>' attribute.
	 * @see #getLibraryName()
	 * @generated
	 */
	void setLibraryName(String value);

	/**
	 * Returns the value of the '<em><b>Referenced Action Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Id of the action being referenced.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referenced Action Id</em>' attribute.
	 * @see #setReferencedActionId(String)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getActionRef_ReferencedActionId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='referencedActionId'"
	 * @generated
	 */
	String getReferencedActionId();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.ActionRef#getReferencedActionId <em>Referenced Action Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Action Id</em>' attribute.
	 * @see #getReferencedActionId()
	 * @generated
	 */
	void setReferencedActionId(String value);

} // ActionRef
