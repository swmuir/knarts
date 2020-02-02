/**
 */
package org.hl7.elm.r1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Type Specifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ListTypeSpecifier defines a list type by specifying the type of elements the list may contain.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.ListTypeSpecifier#getElementType <em>Element Type</em>}</li>
 * </ul>
 *
 * @see org.hl7.elm.r1.R1Package#getListTypeSpecifier()
 * @model extendedMetaData="name='ListTypeSpecifier' kind='elementOnly'"
 * @generated
 */
public interface ListTypeSpecifier extends TypeSpecifier {
	/**
	 * Returns the value of the '<em><b>Element Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Type</em>' containment reference.
	 * @see #setElementType(TypeSpecifier)
	 * @see org.hl7.elm.r1.R1Package#getListTypeSpecifier_ElementType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='elementType' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeSpecifier getElementType();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.ListTypeSpecifier#getElementType <em>Element Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Type</em>' containment reference.
	 * @see #getElementType()
	 * @generated
	 */
	void setElementType(TypeSpecifier value);

} // ListTypeSpecifier
