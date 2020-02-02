/**
 */
package org.hl7.knowledgeartifact.r2;

import org.hl7.cdsdt.r2.ST;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mask Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A regular-expression that constrains free text
 * 				entry such as for zip codes, email addresses, and telephone numbers.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.MaskConstraint#getMaskExpression <em>Mask Expression</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.MaskConstraint#getMaskHelp <em>Mask Help</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getMaskConstraint()
 * @model extendedMetaData="name='MaskConstraint' kind='elementOnly'"
 * @generated
 */
public interface MaskConstraint extends RangeConstraint {
	/**
	 * Returns the value of the '<em><b>Mask Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The regular expression for the mask
	 * 							
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mask Expression</em>' containment reference.
	 * @see #setMaskExpression(ST)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getMaskConstraint_MaskExpression()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='maskExpression' namespace='##targetNamespace'"
	 * @generated
	 */
	ST getMaskExpression();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.MaskConstraint#getMaskExpression <em>Mask Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mask Expression</em>' containment reference.
	 * @see #getMaskExpression()
	 * @generated
	 */
	void setMaskExpression(ST value);

	/**
	 * Returns the value of the '<em><b>Mask Help</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Text explaining the mask
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mask Help</em>' containment reference.
	 * @see #setMaskHelp(ST)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getMaskConstraint_MaskHelp()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='maskHelp' namespace='##targetNamespace'"
	 * @generated
	 */
	ST getMaskHelp();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.MaskConstraint#getMaskHelp <em>Mask Help</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mask Help</em>' containment reference.
	 * @see #getMaskHelp()
	 * @generated
	 */
	void setMaskHelp(ST value);

} // MaskConstraint
