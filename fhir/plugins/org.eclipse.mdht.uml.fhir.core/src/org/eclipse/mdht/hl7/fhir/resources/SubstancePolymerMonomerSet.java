/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.emf.common.util.EList;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Polymer Monomer Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.SubstancePolymerMonomerSet#getRatioType <em>Ratio Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.SubstancePolymerMonomerSet#getStartingMaterials <em>Starting Material</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getSubstancePolymerMonomerSet()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SubstancePolymer_MonomerSet'"
 * @generated
 */
public interface SubstancePolymerMonomerSet extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Ratio Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ratio Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ratio Type</em>' containment reference.
	 * @see #setRatioType(CodeableConcept)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getSubstancePolymerMonomerSet_RatioType()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getRatioType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.SubstancePolymerMonomerSet#getRatioType <em>Ratio Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ratio Type</em>' containment reference.
	 * @see #getRatioType()
	 * @generated
	 */
	void setRatioType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Starting Material</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.hl7.fhir.resources.SubstancePolymerMonomerSetStartingMaterial}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Starting Material</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Starting Material</em>' containment reference list.
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getSubstancePolymerMonomerSet_StartingMaterial()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubstancePolymerMonomerSetStartingMaterial> getStartingMaterials();

} // SubstancePolymerMonomerSet
