/**
 */
package org.hl7.knowledgeartifact.r1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r1.RangeConstraint#getConstraintType <em>Constraint Type</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r1.R1Package#getRangeConstraint()
 * @model abstract="true"
 *        extendedMetaData="name='RangeConstraint' kind='elementOnly'"
 * @generated
 */
public interface RangeConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Constraint Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The constraint type defines how the value range
	 * 						is being constrained. For example, the constraint type may
	 * 						indicate the lower bound of the range.
	 * 					
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constraint Type</em>' containment reference.
	 * @see #setConstraintType(ConstraintTypeType)
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getRangeConstraint_ConstraintType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='constraintType' namespace='##targetNamespace'"
	 * @generated
	 */
	ConstraintTypeType getConstraintType();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r1.RangeConstraint#getConstraintType <em>Constraint Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Type</em>' containment reference.
	 * @see #getConstraintType()
	 * @generated
	 */
	void setConstraintType(ConstraintTypeType value);

} // RangeConstraint
