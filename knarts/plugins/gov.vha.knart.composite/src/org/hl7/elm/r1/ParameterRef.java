/**
 */
package org.hl7.elm.r1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The ParameterRef expression allows the value of a parameter to be referenced as part of an expression.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.ParameterRef#getLibraryName <em>Library Name</em>}</li>
 *   <li>{@link org.hl7.elm.r1.ParameterRef#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.hl7.elm.r1.R1Package#getParameterRef()
 * @model extendedMetaData="name='ParameterRef' kind='elementOnly'"
 * @generated
 */
public interface ParameterRef extends Expression {
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
	 * @see org.hl7.elm.r1.R1Package#getParameterRef_LibraryName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='libraryName'"
	 * @generated
	 */
	String getLibraryName();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.ParameterRef#getLibraryName <em>Library Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library Name</em>' attribute.
	 * @see #getLibraryName()
	 * @generated
	 */
	void setLibraryName(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.hl7.elm.r1.R1Package#getParameterRef_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.ParameterRef#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ParameterRef
