/**
 */
package org.eclipse.mdht.hl7.fhir.resources;

import org.eclipse.mdht.hl7.fhir.dataTypes.BackboneElement;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Molecular Sequence Variant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.MolecularSequenceVariant#getStart <em>Start</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.MolecularSequenceVariant#getEnd <em>End</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.MolecularSequenceVariant#getObservedAllele <em>Observed Allele</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.MolecularSequenceVariant#getReferenceAllele <em>Reference Allele</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.MolecularSequenceVariant#getCigar <em>Cigar</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.MolecularSequenceVariant#getVariantPointer <em>Variant Pointer</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getMolecularSequenceVariant()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MolecularSequence_Variant'"
 * @generated
 */
public interface MolecularSequenceVariant extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(org.eclipse.mdht.hl7.fhir.dataTypes.Integer)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getMolecularSequenceVariant_Start()
	 * @model containment="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.Integer getStart();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.MolecularSequenceVariant#getStart <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(org.eclipse.mdht.hl7.fhir.dataTypes.Integer value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(org.eclipse.mdht.hl7.fhir.dataTypes.Integer)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getMolecularSequenceVariant_End()
	 * @model containment="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.Integer getEnd();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.MolecularSequenceVariant#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(org.eclipse.mdht.hl7.fhir.dataTypes.Integer value);

	/**
	 * Returns the value of the '<em><b>Observed Allele</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observed Allele</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Observed Allele</em>' containment reference.
	 * @see #setObservedAllele(org.eclipse.mdht.hl7.fhir.dataTypes.String)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getMolecularSequenceVariant_ObservedAllele()
	 * @model containment="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.String getObservedAllele();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.MolecularSequenceVariant#getObservedAllele <em>Observed Allele</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observed Allele</em>' containment reference.
	 * @see #getObservedAllele()
	 * @generated
	 */
	void setObservedAllele(org.eclipse.mdht.hl7.fhir.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Reference Allele</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Allele</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Allele</em>' containment reference.
	 * @see #setReferenceAllele(org.eclipse.mdht.hl7.fhir.dataTypes.String)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getMolecularSequenceVariant_ReferenceAllele()
	 * @model containment="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.String getReferenceAllele();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.MolecularSequenceVariant#getReferenceAllele <em>Reference Allele</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Allele</em>' containment reference.
	 * @see #getReferenceAllele()
	 * @generated
	 */
	void setReferenceAllele(org.eclipse.mdht.hl7.fhir.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Cigar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cigar</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cigar</em>' containment reference.
	 * @see #setCigar(org.eclipse.mdht.hl7.fhir.dataTypes.String)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getMolecularSequenceVariant_Cigar()
	 * @model containment="true"
	 * @generated
	 */
	org.eclipse.mdht.hl7.fhir.dataTypes.String getCigar();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.MolecularSequenceVariant#getCigar <em>Cigar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cigar</em>' containment reference.
	 * @see #getCigar()
	 * @generated
	 */
	void setCigar(org.eclipse.mdht.hl7.fhir.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Variant Pointer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variant Pointer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variant Pointer</em>' containment reference.
	 * @see #setVariantPointer(Reference)
	 * @see org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage#getMolecularSequenceVariant_VariantPointer()
	 * @model containment="true"
	 * @generated
	 */
	Reference getVariantPointer();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.hl7.fhir.resources.MolecularSequenceVariant#getVariantPointer <em>Variant Pointer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variant Pointer</em>' containment reference.
	 * @see #getVariantPointer()
	 * @generated
	 */
	void setVariantPointer(Reference value);

} // MolecularSequenceVariant
