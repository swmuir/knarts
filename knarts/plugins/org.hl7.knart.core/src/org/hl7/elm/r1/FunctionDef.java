/**
 */
package org.hl7.elm.r1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The FunctionDef type defines a named function that can be invoked by any expression in the artifact. Function names must be unique within the artifact. Functions may take any number of operands.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.elm.r1.FunctionDef#getOperand <em>Operand</em>}</li>
 * </ul>
 *
 * @see org.hl7.elm.r1.R1Package#getFunctionDef()
 * @model extendedMetaData="name='FunctionDef' kind='elementOnly'"
 * @generated
 */
public interface FunctionDef extends ExpressionDef {
	/**
	 * Returns the value of the '<em><b>Operand</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.elm.r1.OperandDef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operand</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' containment reference list.
	 * @see org.hl7.elm.r1.R1Package#getFunctionDef_Operand()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='operand' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OperandDef> getOperand();

} // FunctionDef
