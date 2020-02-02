/**
 */
package org.hl7.knowledgeartifact.r1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Applicability Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r1.ApplicabilityType#getCoverage <em>Coverage</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r1.R1Package#getApplicabilityType()
 * @model extendedMetaData="name='applicability_._type' kind='elementOnly'"
 * @generated
 */
public interface ApplicabilityType extends EObject {
	/**
	 * Returns the value of the '<em><b>Coverage</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.knowledgeartifact.r1.Coverage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coverage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coverage</em>' containment reference list.
	 * @see org.hl7.knowledgeartifact.r1.R1Package#getApplicabilityType_Coverage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='coverage' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Coverage> getCoverage();

} // ApplicabilityType
