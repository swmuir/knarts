/**
 */
package org.hl7.elm.r1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The BinaryExpression type defines the abstract base type for expressions that take two arguments.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.BinaryExpression#getOperand <em>Operand</em>}</li>
 * </ul>
 *
 * @see org.hl7.elm.r1.R1Package#getBinaryExpression()
 * @model extendedMetaData="name='BinaryExpression' kind='elementOnly'"
 * @generated
 */
public interface BinaryExpression extends Expression {
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
	 * @see org.hl7.elm.r1.R1Package#getBinaryExpression_Operand()
	 * @model containment="true" lower="2" upper="2"
	 *        extendedMetaData="kind='element' name='operand' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Expression> getOperand();

} // BinaryExpression
