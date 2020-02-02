/**
 */
package org.hl7.elm.r1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifier Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The IdentifierRef type defines an expression that references an unresolved identifier. An unresolved identifier reference generally indicates an error condition. The implementation is free to attempt to resolve the identifier, but is also justified in throwing an error at compile-time (or run-time for an interpretive system) when an identifier ref is encountered.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.IdentifierRef#getLibraryName <em>Library Name</em>}</li>
 *   <li>{@link org.hl7.elm.r1.IdentifierRef#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.hl7.elm.r1.R1Package#getIdentifierRef()
 * @model extendedMetaData="name='IdentifierRef' kind='elementOnly'"
 * @generated
 */
public interface IdentifierRef extends Expression {
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
	 * @see org.hl7.elm.r1.R1Package#getIdentifierRef_LibraryName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='libraryName'"
	 * @generated
	 */
	String getLibraryName();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.IdentifierRef#getLibraryName <em>Library Name</em>}' attribute.
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
	 * @see org.hl7.elm.r1.R1Package#getIdentifierRef_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.IdentifierRef#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // IdentifierRef
