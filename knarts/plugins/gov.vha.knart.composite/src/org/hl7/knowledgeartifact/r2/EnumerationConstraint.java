/**
 */
package org.hl7.knowledgeartifact.r2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A constraint specifying that the value is from
 * 				an
 * 				enumeration explicitly included here. This provides a more
 * 				convenient mechanism
 * 				to specify an enumeration rather than using the
 * 				ExpressionConstraint.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.EnumerationConstraint#getItem <em>Item</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.EnumerationConstraint#isStrictSelection <em>Strict Selection</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getEnumerationConstraint()
 * @model extendedMetaData="name='EnumerationConstraint' kind='elementOnly'"
 * @generated
 */
public interface EnumerationConstraint extends RangeConstraint {
	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.knowledgeartifact.r2.EnumerationItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getEnumerationConstraint_Item()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='item' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EnumerationItem> getItem();

	/**
	 * Returns the value of the '<em><b>Strict Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If strictSelection is set to true, the value
	 * 							entered by the user must be an item from the enumeration. If this
	 * 							is set to false, the value may not be restricted to this
	 * 							enumeration, allowing the user to fill-in items
	 * 						
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strict Selection</em>' attribute.
	 * @see #isSetStrictSelection()
	 * @see #unsetStrictSelection()
	 * @see #setStrictSelection(boolean)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getEnumerationConstraint_StrictSelection()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='strictSelection'"
	 * @generated
	 */
	boolean isStrictSelection();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.EnumerationConstraint#isStrictSelection <em>Strict Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strict Selection</em>' attribute.
	 * @see #isSetStrictSelection()
	 * @see #unsetStrictSelection()
	 * @see #isStrictSelection()
	 * @generated
	 */
	void setStrictSelection(boolean value);

	/**
	 * Unsets the value of the '{@link org.hl7.knowledgeartifact.r2.EnumerationConstraint#isStrictSelection <em>Strict Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStrictSelection()
	 * @see #isStrictSelection()
	 * @see #setStrictSelection(boolean)
	 * @generated
	 */
	void unsetStrictSelection();

	/**
	 * Returns whether the value of the '{@link org.hl7.knowledgeartifact.r2.EnumerationConstraint#isStrictSelection <em>Strict Selection</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Strict Selection</em>' attribute is set.
	 * @see #unsetStrictSelection()
	 * @see #isStrictSelection()
	 * @see #setStrictSelection(boolean)
	 * @generated
	 */
	boolean isSetStrictSelection();

} // EnumerationConstraint
