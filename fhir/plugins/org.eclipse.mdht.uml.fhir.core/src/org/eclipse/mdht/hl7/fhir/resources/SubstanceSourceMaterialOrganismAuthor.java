/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Source Material Organism Author</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.SubstanceSourceMaterialOrganismAuthor#getAuthorType <em>Author Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.SubstanceSourceMaterialOrganismAuthor#getAuthorDescription <em>Author Description</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getSubstanceSourceMaterialOrganismAuthor()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Organism_Author'"
 * @generated
 */
public interface SubstanceSourceMaterialOrganismAuthor extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Author Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author Type</em>' containment reference.
	 * @see #setAuthorType(CodeableConcept)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getSubstanceSourceMaterialOrganismAuthor_AuthorType()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getAuthorType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.SubstanceSourceMaterialOrganismAuthor#getAuthorType <em>Author Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author Type</em>' containment reference.
	 * @see #getAuthorType()
	 * @generated
	 */
	void setAuthorType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Author Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author Description</em>' containment reference.
	 * @see #setAuthorDescription(org.eclipse.mdht.hl7.fhir.dataTypes.String)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getSubstanceSourceMaterialOrganismAuthor_AuthorDescription()
	 * @model containment="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.String getAuthorDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.SubstanceSourceMaterialOrganismAuthor#getAuthorDescription <em>Author Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author Description</em>' containment reference.
	 * @see #getAuthorDescription()
	 * @generated
	 */
	void setAuthorDescription(org.eclipse.mdht.hl7.fhir.dataTypes.String value);

} // SubstanceSourceMaterialOrganismAuthor
