/**
 */
package org.hl7.elm.r1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ternary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The TernaryExpression type defines the abstract base type for expressions that take three arguments.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.TernaryExpression#getOperand <em>Operand</em>}</li>
 * </ul>
 *
 * @see org.hl7.elm.r1.R1Package#getTernaryExpression()
 * @model extendedMetaData="name='TernaryExpression' kind='elementOnly'"
 * @generated
 */
public interface TernaryExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Operand</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.elm.r1.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' containment reference list.
	 * @see org.hl7.elm.r1.R1Package#getTernaryExpression_Operand()
	 * @model containment="true" lower="3" upper="3"
	 *        extendedMetaData="kind='element' name='operand' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Expression> getOperand();

} // TernaryExpression
