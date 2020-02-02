/**
 */
package org.hl7.elm.r1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The NaryExpression type defines an abstract base class for an expression that takes any number of arguments, including zero.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.NaryExpression#getOperand <em>Operand</em>}</li>
 * </ul>
 *
 * @see org.hl7.elm.r1.R1Package#getNaryExpression()
 * @model abstract="true"
 *        extendedMetaData="name='NaryExpression' kind='elementOnly'"
 * @generated
 */
public interface NaryExpression extends Expression {
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
	 * @see org.hl7.elm.r1.R1Package#getNaryExpression_Operand()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='operand' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Expression> getOperand();

} // NaryExpression
