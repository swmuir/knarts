/**
 */
package org.hl7.knowledgeartifact.r1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Usage Terms Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r1.UsageTermsType#getRightsDeclaration <em>Rights Declaration</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r1.R1Package#getUsageTermsType()
 * @model extendedMetaData="name='usageTerms_._type' kind='elementOnly'"
 * @generated
 */
public interface UsageTermsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Rights Declaration</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.knowledgeartifact.r1.RightsDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rights Declaration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rights Declaration</em>' containment reference list.
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getUsageTermsType_RightsDeclaration()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='rightsDeclaration' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RightsDeclaration> getRightsDeclaration();

} // UsageTermsType
