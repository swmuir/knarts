/**
 */
package org.hl7.knowledgeartifact.r2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.hl7.cdsdt.r2.CD;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Represented Concepts Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.RepresentedConceptsType#getConcept <em>Concept</em>}</li>
 * </ul>
 *
 * @see org.hl7.knowledgeartifact.r2.R2Package#getRepresentedConceptsType()
 * @model extendedMetaData="name='representedConcepts_._type' kind='elementOnly'"
 * @generated
 */
public interface RepresentedConceptsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Concept</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.cdsdt.r2.CD}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concept</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concept</em>' containment reference list.
	 * @see org.hl7.knowledgeartifact.r2.R2Package#getRepresentedConceptsType_Concept()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='concept' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CD> getConcept();

} // RepresentedConceptsType
