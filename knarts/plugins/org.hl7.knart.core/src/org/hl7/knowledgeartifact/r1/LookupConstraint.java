/**
 */
package org.hl7.knowledgeartifact.r1;

import org.hl7.elm.r1.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lookup Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This constraint constructs a "lookup" list for the
 * 				value range.
 * 				The constraint type must be List
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r1.LookupConstraint#getItems <em>Items</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.LookupConstraint#getDisplayField <em>Display Field</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.LookupConstraint#isStrictSelection <em>Strict Selection</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r1.R1Package#getLookupConstraint()
 * @model extendedMetaData="name='LookupConstraint' kind='elementOnly'"
 * @generated
 */
public interface LookupConstraint extends RangeConstraint {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The expression returns a list of items that
	 * 								form
	 * 								the range of values.
	 * 							
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Items</em>' containment reference.
	 * @see #setItems(Expression)
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getLookupConstraint_Items()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='items' namespace='##targetNamespace'"
	 * @generated
	 */
	Expression getItems();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r1.LookupConstraint#getItems <em>Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Items</em>' containment reference.
	 * @see #getItems()
	 * @generated
	 */
	void setItems(Expression value);

	/**
	 * Returns the value of the '<em><b>Display Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The field from the returned expression objects
	 * 							that is set as the field to display.
	 * 							It is required when the list
	 * 							elements are non-primitive types
	 * 						
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Display Field</em>' attribute.
	 * @see #setDisplayField(String)
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getLookupConstraint_DisplayField()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='displayField'"
	 * @generated
	 */
	String getDisplayField();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r1.LookupConstraint#getDisplayField <em>Display Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Field</em>' attribute.
	 * @see #getDisplayField()
	 * @generated
	 */
	void setDisplayField(String value);

	/**
	 * Returns the value of the '<em><b>Strict Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If strictSelection is set to true, the value
	 * 							entered by the user must be
	 * 							an item from the returned list. If
	 * 							this is set
	 * 							to false, the value may not be restricted to the
	 * 							returned list.
	 * 						
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strict Selection</em>' attribute.
	 * @see #isSetStrictSelection()
	 * @see #unsetStrictSelection()
	 * @see #setStrictSelection(boolean)
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getLookupConstraint_StrictSelection()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='strictSelection'"
	 * @generated
	 */
	boolean isStrictSelection();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r1.LookupConstraint#isStrictSelection <em>Strict Selection</em>}' attribute.
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
	 * Unsets the value of the '{@link org.hl7.knowledgeartifact.r1.LookupConstraint#isStrictSelection <em>Strict Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStrictSelection()
	 * @see #isStrictSelection()
	 * @see #setStrictSelection(boolean)
	 * @generated
	 */
	void unsetStrictSelection();

	/**
	 * Returns whether the value of the '{@link org.hl7.knowledgeartifact.r1.LookupConstraint#isStrictSelection <em>Strict Selection</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Strict Selection</em>' attribute is set.
	 * @see #unsetStrictSelection()
	 * @see #isStrictSelection()
	 * @see #setStrictSelection(boolean)
	 * @generated
	 */
	boolean isSetStrictSelection();

} // LookupConstraint
