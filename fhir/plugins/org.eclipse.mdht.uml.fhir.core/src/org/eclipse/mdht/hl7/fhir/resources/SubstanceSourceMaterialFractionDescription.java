/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Source Material Fraction Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.SubstanceSourceMaterialFractionDescription#getFraction <em>Fraction</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.SubstanceSourceMaterialFractionDescription#getMaterialType <em>Material Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getSubstanceSourceMaterialFractionDescription()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SubstanceSourceMaterial_FractionDescription'"
 * @generated
 */
public interface SubstanceSourceMaterialFractionDescription extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Fraction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fraction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fraction</em>' containment reference.
	 * @see #setFraction(org.eclipse.mdht.hl7.fhir.dataTypes.String)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getSubstanceSourceMaterialFractionDescription_Fraction()
	 * @model containment="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.String getFraction();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.SubstanceSourceMaterialFractionDescription#getFraction <em>Fraction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fraction</em>' containment reference.
	 * @see #getFraction()
	 * @generated
	 */
	void setFraction(org.eclipse.mdht.hl7.fhir.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Material Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material Type</em>' containment reference.
	 * @see #setMaterialType(CodeableConcept)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getSubstanceSourceMaterialFractionDescription_MaterialType()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getMaterialType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.SubstanceSourceMaterialFractionDescription#getMaterialType <em>Material Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Material Type</em>' containment reference.
	 * @see #getMaterialType()
	 * @generated
	 */
	void setMaterialType(CodeableConcept value);

} // SubstanceSourceMaterialFractionDescription
