/**
 */
package org.hl7.knowledgeartifact.r1;

import org.hl7.elm.r1.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A constraint specified in the form of an
 * 				expression. The constraint type and the constraint expression
 * 				combine together to specify the full constraint. For example,
 * 				the
 * 				constraint type specifies that the lower bound is being specified
 * 				and the expression provides the lower bound value.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r1.ExpressionConstraint#getConstraint <em>Constraint</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r1.R1Package#getExpressionConstraint()
 * @model extendedMetaData="name='ExpressionConstraint' kind='elementOnly'"
 * @generated
 */
public interface ExpressionConstraint extends RangeConstraint {
	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The expression returns a single element, the
	 * 								constraint type may not be a list
	 * 							
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constraint</em>' containment reference.
	 * @see #setConstraint(Expression)
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getExpressionConstraint_Constraint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='constraint' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getConstraint();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r1.ExpressionConstraint#getConstraint <em>Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' containment reference.
	 * @see #getConstraint()
	 * @generated
	 */
	void setConstraint(Expression value);

} // ExpressionConstraint
