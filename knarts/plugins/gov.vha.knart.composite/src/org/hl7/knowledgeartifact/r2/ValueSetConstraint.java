/**
 */
package org.hl7.knowledgeartifact.r2;

import org.hl7.elm.r1.ValueSetRef;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Set Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A constraint specifying that the value is an item
 * 				from the
 * 				value set specified. This constraint applies to list type
 * 				constraints only.
 * 				The response data type for this DocumentationItem
 * 				will be Code.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.ValueSetConstraint#getValueSet <em>Value Set</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getValueSetConstraint()
 * @model extendedMetaData="name='ValueSetConstraint' kind='elementOnly'"
 * @generated
 */
public interface ValueSetConstraint extends RangeConstraint {
	/**
	 * Returns the value of the '<em><b>Value Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Set</em>' containment reference.
	 * @see #setValueSet(ValueSetRef)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getValueSetConstraint_ValueSet()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='valueSet' namespace='##targetNamespace'"
	 * @generated
	 */
	ValueSetRef getValueSet();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.ValueSetConstraint#getValueSet <em>Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set</em>' containment reference.
	 * @see #getValueSet()
	 * @generated
	 */
	void setValueSet(ValueSetRef value);

} // ValueSetConstraint
