/**
 */
package org.hl7.knowledgeartifact.r1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.hl7.elm.r1.ExpressionDef;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expressions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r1.ExpressionsType#getDef <em>Def</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r1.R1Package#getExpressionsType()
 * @model extendedMetaData="name='expressions_._type' kind='elementOnly'"
 * @generated
 */
public interface ExpressionsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Def</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.elm.r1.ExpressionDef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Def</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Def</em>' containment reference list.
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getExpressionsType_Def()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='def' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExpressionDef> getDef();

} // ExpressionsType
