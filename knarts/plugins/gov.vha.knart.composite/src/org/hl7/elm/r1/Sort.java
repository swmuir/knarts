/**
 */
package org.hl7.elm.r1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sort</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Sort operator returns a list with all the elements in source, sorted as described by the by element.
 * 			
 * If the argument is null, the result is null.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.Sort#getSource <em>Source</em>}</li>
 *   <li>{@link org.hl7.elm.r1.Sort#getBy <em>By</em>}</li>
 * </ul>
 *
 * @see org.hl7.elm.r1.R1Package#getSort()
 * @model extendedMetaData="name='Sort' kind='elementOnly'"
 * @generated
 */
public interface Sort extends Expression {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(Expression)
	 * @see org.hl7.elm.r1.R1Package#getSort_Source()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getSource();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.Sort#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Expression value);

	/**
	 * Returns the value of the '<em><b>By</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.elm.r1.SortByItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>By</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>By</em>' containment reference list.
	 * @see org.hl7.elm.r1.R1Package#getSort_By()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='by' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SortByItem> getBy();

} // Sort
