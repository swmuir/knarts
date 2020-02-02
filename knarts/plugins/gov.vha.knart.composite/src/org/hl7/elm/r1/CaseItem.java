/**
 */
package org.hl7.elm.r1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.CaseItem#getWhen <em>When</em>}</li>
 *   <li>{@link org.hl7.elm.r1.CaseItem#getThen <em>Then</em>}</li>
 * </ul>
 *
 * @see org.hl7.elm.r1.R1Package#getCaseItem()
 * @model extendedMetaData="name='CaseItem' kind='elementOnly'"
 * @generated
 */
public interface CaseItem extends Element {
	/**
	 * Returns the value of the '<em><b>When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>When</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When</em>' containment reference.
	 * @see #setWhen(Expression)
	 * @see org.hl7.elm.r1.R1Package#getCaseItem_When()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='when' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getWhen();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.CaseItem#getWhen <em>When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When</em>' containment reference.
	 * @see #getWhen()
	 * @generated
	 */
	void setWhen(Expression value);

	/**
	 * Returns the value of the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then</em>' containment reference.
	 * @see #setThen(Expression)
	 * @see org.hl7.elm.r1.R1Package#getCaseItem_Then()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='then' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getThen();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.CaseItem#getThen <em>Then</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then</em>' containment reference.
	 * @see #getThen()
	 * @generated
	 */
	void setThen(Expression value);

} // CaseItem
