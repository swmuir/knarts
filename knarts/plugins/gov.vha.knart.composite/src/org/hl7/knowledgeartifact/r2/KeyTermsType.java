/**
 */
package org.hl7.knowledgeartifact.r2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.hl7.cdsdt.r2.CD;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Terms Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.KeyTermsType#getTerm <em>Term</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getKeyTermsType()
 * @model extendedMetaData="name='keyTerms_._type' kind='elementOnly'"
 * @generated
 */
public interface KeyTermsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Term</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.cdsdt.r2.CD}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Term</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term</em>' containment reference list.
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getKeyTermsType_Term()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='term' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CD> getTerm();

} // KeyTermsType
