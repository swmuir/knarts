/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Specification Isotope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The detailed description of a substance, typically at a level beyond what is used for prescribing.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.SubstanceSpecificationIsotope#getNuclideId <em>Nuclide Id</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecificationIsotope#getNuclideName <em>Nuclide Name</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecificationIsotope#getSubstitutionType <em>Substitution Type</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecificationIsotope#getNuclideHalfLife <em>Nuclide Half Life</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecificationIsotope#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecificationIsotope#getMolecularWeight <em>Molecular Weight</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationIsotope()
 * @model extendedMetaData="name='SubstanceSpecification.Isotope' kind='elementOnly'"
 * @generated
 */
public interface SubstanceSpecificationIsotope extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Nuclide Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Substance identifier for each non-natural or radioisotope.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nuclide Id</em>' containment reference.
	 * @see #setNuclideId(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationIsotope_NuclideId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nuclideId' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getNuclideId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecificationIsotope#getNuclideId <em>Nuclide Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nuclide Id</em>' containment reference.
	 * @see #getNuclideId()
	 * @generated
	 */
	void setNuclideId(Identifier value);

	/**
	 * Returns the value of the '<em><b>Nuclide Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Substance name for each non-natural or radioisotope.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nuclide Name</em>' containment reference.
	 * @see #setNuclideName(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationIsotope_NuclideName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nuclideName' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getNuclideName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecificationIsotope#getNuclideName <em>Nuclide Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nuclide Name</em>' containment reference.
	 * @see #getNuclideName()
	 * @generated
	 */
	void setNuclideName(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Substitution Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of isotopic substitution present in a single substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substitution Type</em>' containment reference.
	 * @see #setSubstitutionType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationIsotope_SubstitutionType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='substitutionType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSubstitutionType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecificationIsotope#getSubstitutionType <em>Substitution Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substitution Type</em>' containment reference.
	 * @see #getSubstitutionType()
	 * @generated
	 */
	void setSubstitutionType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Nuclide Half Life</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Half life - for a non-natural nuclide.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nuclide Half Life</em>' containment reference.
	 * @see #setNuclideHalfLife(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationIsotope_NuclideHalfLife()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nuclideHalfLife' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getNuclideHalfLife();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecificationIsotope#getNuclideHalfLife <em>Nuclide Half Life</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nuclide Half Life</em>' containment reference.
	 * @see #getNuclideHalfLife()
	 * @generated
	 */
	void setNuclideHalfLife(Quantity value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Quantitative values for this isotope.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount</em>' containment reference.
	 * @see #setAmount(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationIsotope_Amount()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='amount' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getAmount();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecificationIsotope#getAmount <em>Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' containment reference.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Molecular Weight</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The molecular weight or weight range (for proteins, polymers or nucleic acids).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Molecular Weight</em>' containment reference.
	 * @see #setMolecularWeight(SubstanceSpecificationMolecularWeight)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationIsotope_MolecularWeight()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='molecularWeight' namespace='##targetNamespace'"
	 * @generated
	 */
	SubstanceSpecificationMolecularWeight getMolecularWeight();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecificationIsotope#getMolecularWeight <em>Molecular Weight</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Molecular Weight</em>' containment reference.
	 * @see #getMolecularWeight()
	 * @generated
	 */
	void setMolecularWeight(SubstanceSpecificationMolecularWeight value);

} // SubstanceSpecificationIsotope
