/**
 */
package org.hl7.elm.r1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The FunctionRef type defines an expression that invokes a previously defined function. The result of evaluating each operand is passed to the function.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.FunctionRef#getOperand <em>Operand</em>}</li>
 * </ul>
 *
 * @see org.hl7.elm.r1.R1Package#getFunctionRef()
 * @model extendedMetaData="name='FunctionRef' kind='elementOnly'"
 * @generated
 */
public interface FunctionRef extends ExpressionRef {
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
	 * @see org.hl7.elm.r1.R1Package#getFunctionRef_Operand()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='operand' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Expression> getOperand();

} // FunctionRef
