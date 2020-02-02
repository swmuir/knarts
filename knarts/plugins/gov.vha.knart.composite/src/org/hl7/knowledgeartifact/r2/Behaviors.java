/**
 */
package org.hl7.knowledgeartifact.r2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behaviors</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.Behaviors#getBehavior <em>Behavior</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getBehaviors()
 * @model extendedMetaData="name='Behaviors' kind='elementOnly'"
 * @generated
 */
public interface Behaviors extends EObject {
	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.knowledgeartifact.r2.Behavior}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Behavior</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior</em>' containment reference list.
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getBehaviors_Behavior()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='behavior' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Behavior> getBehavior();

} // Behaviors
