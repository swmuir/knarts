/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Molecular Sequence Structure Variant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.MolecularSequenceStructureVariant#getVariantType <em>Variant Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.MolecularSequenceStructureVariant#getExact <em>Exact</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.MolecularSequenceStructureVariant#getLength <em>Length</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.MolecularSequenceStructureVariant#getOuter <em>Outer</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.MolecularSequenceStructureVariant#getInner <em>Inner</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getMolecularSequenceStructureVariant()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MolecularSequence_StructureVariant'"
 * @generated
 */
public interface MolecularSequenceStructureVariant extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Variant Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variant Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variant Type</em>' containment reference.
	 * @see #setVariantType(CodeableConcept)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getMolecularSequenceStructureVariant_VariantType()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getVariantType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.MolecularSequenceStructureVariant#getVariantType <em>Variant Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variant Type</em>' containment reference.
	 * @see #getVariantType()
	 * @generated
	 */
	void setVariantType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Exact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exact</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exact</em>' containment reference.
	 * @see #setExact(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getMolecularSequenceStructureVariant_Exact()
	 * @model containment="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.Boolean getExact();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.MolecularSequenceStructureVariant#getExact <em>Exact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exact</em>' containment reference.
	 * @see #getExact()
	 * @generated
	 */
	void setExact(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' containment reference.
	 * @see #setLength(org.eclipse.mdht.hl7.fhir.dataTypes.Integer)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getMolecularSequenceStructureVariant_Length()
	 * @model containment="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.Integer getLength();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.MolecularSequenceStructureVariant#getLength <em>Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' containment reference.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(org.eclipse.mdht.hl7.fhir.dataTypes.Integer value);

	/**
	 * Returns the value of the '<em><b>Outer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer</em>' containment reference.
	 * @see #setOuter(MolecularSequenceStructureVariantOuter)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getMolecularSequenceStructureVariant_Outer()
	 * @model containment="true"
	 * @generated
	 */
	MolecularSequenceStructureVariantOuter getOuter();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.MolecularSequenceStructureVariant#getOuter <em>Outer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outer</em>' containment reference.
	 * @see #getOuter()
	 * @generated
	 */
	void setOuter(MolecularSequenceStructureVariantOuter value);

	/**
	 * Returns the value of the '<em><b>Inner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inner</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inner</em>' containment reference.
	 * @see #setInner(MolecularSequenceStructureVariantInner)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getMolecularSequenceStructureVariant_Inner()
	 * @model containment="true"
	 * @generated
	 */
	MolecularSequenceStructureVariantInner getInner();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.MolecularSequenceStructureVariant#getInner <em>Inner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inner</em>' containment reference.
	 * @see #getInner()
	 * @generated
	 */
	void setInner(MolecularSequenceStructureVariantInner value);

} // MolecularSequenceStructureVariant
