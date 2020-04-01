/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.emf.common.util.EList;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Reference Information Gene</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.SubstanceReferenceInformationGene#getGeneSequenceOrigin <em>Gene Sequence Origin</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.SubstanceReferenceInformationGene#getGene <em>Gene</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.SubstanceReferenceInformationGene#getSources <em>Source</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getSubstanceReferenceInformationGene()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SubstanceReferenceInformation_Gene'"
 * @generated
 */
public interface SubstanceReferenceInformationGene extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Gene Sequence Origin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gene Sequence Origin</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gene Sequence Origin</em>' containment reference.
	 * @see #setGeneSequenceOrigin(CodeableConcept)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getSubstanceReferenceInformationGene_GeneSequenceOrigin()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getGeneSequenceOrigin();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.SubstanceReferenceInformationGene#getGeneSequenceOrigin <em>Gene Sequence Origin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gene Sequence Origin</em>' containment reference.
	 * @see #getGeneSequenceOrigin()
	 * @generated
	 */
	void setGeneSequenceOrigin(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Gene</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gene</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gene</em>' containment reference.
	 * @see #setGene(CodeableConcept)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getSubstanceReferenceInformationGene_Gene()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getGene();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.SubstanceReferenceInformationGene#getGene <em>Gene</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gene</em>' containment reference.
	 * @see #getGene()
	 * @generated
	 */
	void setGene(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.dataTypes.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getSubstanceReferenceInformationGene_Source()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reference> getSources();

} // SubstanceReferenceInformationGene
