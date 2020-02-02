/**
 */
package org.hl7.knowledgeartifact.r2;

import org.eclipse.emf.ecore.EObject;

import org.hl7.cdsdt.r2.CD;
import org.hl7.cdsdt.r2.ST;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coverage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Specifies various attributes of the patient
 * 				population for whom and/or environment of care in which the CDS
 * 				artifact is applicable.
 * 			
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.Coverage#getFocus <em>Focus</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.Coverage#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.Coverage#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getCoverage()
 * @model extendedMetaData="name='Coverage' kind='elementOnly'"
 * @generated
 */
public interface Coverage extends EObject {
	/**
	 * Returns the value of the '<em><b>Focus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Focus</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Focus</em>' containment reference.
	 * @see #setFocus(FocusType)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getCoverage_Focus()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='focus' namespace='##targetNamespace'"
	 * @generated
	 */
	FocusType getFocus();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.Coverage#getFocus <em>Focus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Focus</em>' containment reference.
	 * @see #getFocus()
	 * @generated
	 */
	void setFocus(FocusType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(ST)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getCoverage_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	ST getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.Coverage#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(ST value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(CD)
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getCoverage_Value()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	CD getValue();

	/**
	 * Sets the value of the '{@link org.hl7.knowledgeartifact.r2.Coverage#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(CD value);

} // Coverage
