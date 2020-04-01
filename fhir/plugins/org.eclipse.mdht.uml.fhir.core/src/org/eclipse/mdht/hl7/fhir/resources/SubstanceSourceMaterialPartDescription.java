/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Source Material Part Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.SubstanceSourceMaterialPartDescription#getPart <em>Part</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.SubstanceSourceMaterialPartDescription#getPartLocation <em>Part Location</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getSubstanceSourceMaterialPartDescription()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SubstanceSourceMaterial_PartDescription'"
 * @generated
 */
public interface SubstanceSourceMaterialPartDescription extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part</em>' containment reference.
	 * @see #setPart(CodeableConcept)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getSubstanceSourceMaterialPartDescription_Part()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getPart();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.SubstanceSourceMaterialPartDescription#getPart <em>Part</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part</em>' containment reference.
	 * @see #getPart()
	 * @generated
	 */
	void setPart(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Part Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Location</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Location</em>' containment reference.
	 * @see #setPartLocation(CodeableConcept)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getSubstanceSourceMaterialPartDescription_PartLocation()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getPartLocation();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.SubstanceSourceMaterialPartDescription#getPartLocation <em>Part Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Location</em>' containment reference.
	 * @see #getPartLocation()
	 * @generated
	 */
	void setPartLocation(CodeableConcept value);

} // SubstanceSourceMaterialPartDescription
