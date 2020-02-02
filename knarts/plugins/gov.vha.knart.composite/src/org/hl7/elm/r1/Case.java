/**
 */
package org.hl7.elm.r1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Case operator allows for multiple conditional expressions to be chained together in a single expression, rather than having to nest multiple If operators. In addition, the comparand operand provides a variant on the case that allows a single value to be compared in each conditional.
 * 			
 * If a comparand is not provided, the type of each when element of the caseItems within the Case is expected to be boolean. If a comparand is provided, the type of each when element of the caseItems within the Case is expected to be of the same type as the comparand. An else element must always be provided.
 * 
 * The static type of the then argument within the first caseItem determines the type of the result, and the then argument of each subsequent caseItem and the else argument must be of that same type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.Case#getComparand <em>Comparand</em>}</li>
 *   <li>{@link org.hl7.elm.r1.Case#getCaseItem <em>Case Item</em>}</li>
 *   <li>{@link org.hl7.elm.r1.Case#getElse <em>Else</em>}</li>
 * </ul>
 *
 * @see org.hl7.elm.r1.R1Package#getCase()
 * @model extendedMetaData="name='Case' kind='elementOnly'"
 * @generated
 */
public interface Case extends Expression {
	/**
	 * Returns the value of the '<em><b>Comparand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comparand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparand</em>' containment reference.
	 * @see #setComparand(Expression)
	 * @see org.hl7.elm.r1.R1Package#getCase_Comparand()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='comparand' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getComparand();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.Case#getComparand <em>Comparand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparand</em>' containment reference.
	 * @see #getComparand()
	 * @generated
	 */
	void setComparand(Expression value);

	/**
	 * Returns the value of the '<em><b>Case Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.elm.r1.CaseItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Case Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case Item</em>' containment reference list.
	 * @see org.hl7.elm.r1.R1Package#getCase_CaseItem()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='caseItem' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CaseItem> getCaseItem();

	/**
	 * Returns the value of the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else</em>' containment reference.
	 * @see #setElse(Expression)
	 * @see org.hl7.elm.r1.R1Package#getCase_Else()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='else' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getElse();

	/**
	 * Sets the value of the '{@link org.hl7.elm.r1.Case#getElse <em>Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else</em>' containment reference.
	 * @see #getElse()
	 * @generated
	 */
	void setElse(Expression value);

} // Case
