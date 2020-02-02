/**
 */
package org.hl7.elm.r1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The List selector returns a value of type List, whose elements are the result of evaluating the arguments to the List selector, in order. 
 * 			
 * If a typeSpecifier element is provided, the list is of that type. Otherwise, the static type of the first argument determines the type of the resulting list, and each subsequent argument must be of that same type.
 * 			
 * If any argument is null, the resulting list will have null for that element.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.List#getTypeSpecifier <em>Type Specifier</em>}</li>
 *   <li>{@link org.hl7.elm.r1.List#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see org.hl7.elm.r1.R1Package#getList()
 * @model extendedMetaData="name='List' kind='elementOnly'"
 * @generated
 */
public interface List extends Expression {
	/**
	 * Returns the value of the '<em><b>Type Specifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Specifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Specifier</em>' containment reference.
	 * @see #setTypeSpecifier(TypeSpecifier)
	 * @see org.hl7.elm.r1.R1Package#getList_TypeSpecifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='typeSpecifier' namespace='##targetNamespace'"
	 * @generated
	 */
	TypeSpecifier getTypeSpecifier();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.List#getTypeSpecifier <em>Type Specifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Specifier</em>' containment reference.
	 * @see #getTypeSpecifier()
	 * @generated
	 */
	void setTypeSpecifier(TypeSpecifier value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.elm.r1.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference list.
	 * @see org.hl7.elm.r1.R1Package#getList_Element()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Expression> getElement();

} // List
