/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The detailed description of a substance, typically at a level beyond what is used for prescribing.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.SubstanceSpecification#getComment <em>Comment</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecification#getStoichiometric <em>Stoichiometric</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecification#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecification#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecification#getReferenceSource <em>Reference Source</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecification#getMoiety <em>Moiety</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecification#getProperty <em>Property</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecification#getReferenceInformation <em>Reference Information</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecification#getStructure <em>Structure</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecification#getSubstanceCode <em>Substance Code</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecification#getSubstanceName <em>Substance Name</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecification#getMolecularWeight <em>Molecular Weight</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecification#getPolymer <em>Polymer</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecification()
 * @model extendedMetaData="name='SubstanceSpecification' kind='elementOnly'"
 * @generated
 */
public interface SubstanceSpecification extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Textual comment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comment</em>' containment reference.
	 * @see #setComment(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecification_Comment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='comment' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getComment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecification#getComment <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' containment reference.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Stoichiometric</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Chemicals may be stoichiometric or non-stoichiometric.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stoichiometric</em>' containment reference.
	 * @see #setStoichiometric(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecification_Stoichiometric()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='stoichiometric' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getStoichiometric();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecification#getStoichiometric <em>Stoichiometric</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stoichiometric</em>' containment reference.
	 * @see #getStoichiometric()
	 * @generated
	 */
	void setStoichiometric(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier by which this substance is known.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecification_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecification#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * High level categorisation, e.g. polymer or nucleic acid.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecification_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecification#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Reference Source</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Supporting literature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference Source</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecification_ReferenceSource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='referenceSource' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getReferenceSource();

	/**
	 * Returns the value of the '<em><b>Moiety</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SubstanceSpecificationMoiety}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Moiety, for structural modifications.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Moiety</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecification_Moiety()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='moiety' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubstanceSpecificationMoiety> getMoiety();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SubstanceSpecificationProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * General specifications for this substance, including how it is related to other substances.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecification_Property()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubstanceSpecificationProperty> getProperty();

	/**
	 * Returns the value of the '<em><b>Reference Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * General information detailing this substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference Information</em>' containment reference.
	 * @see #setReferenceInformation(Reference)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecification_ReferenceInformation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='referenceInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getReferenceInformation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecification#getReferenceInformation <em>Reference Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Information</em>' containment reference.
	 * @see #getReferenceInformation()
	 * @generated
	 */
	void setReferenceInformation(Reference value);

	/**
	 * Returns the value of the '<em><b>Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Structural information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Structure</em>' containment reference.
	 * @see #setStructure(SubstanceSpecificationStructure)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecification_Structure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='structure' namespace='##targetNamespace'"
	 * @generated
	 */
	SubstanceSpecificationStructure getStructure();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecification#getStructure <em>Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure</em>' containment reference.
	 * @see #getStructure()
	 * @generated
	 */
	void setStructure(SubstanceSpecificationStructure value);

	/**
	 * Returns the value of the '<em><b>Substance Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SubstanceSpecificationSubstanceCode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Codes associated with the substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substance Code</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecification_SubstanceCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='substanceCode' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubstanceSpecificationSubstanceCode> getSubstanceCode();

	/**
	 * Returns the value of the '<em><b>Substance Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SubstanceSpecificationSubstanceName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Names applicable to this substence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substance Name</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecification_SubstanceName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='substanceName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubstanceSpecificationSubstanceName> getSubstanceName();

	/**
	 * Returns the value of the '<em><b>Molecular Weight</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SubstanceSpecificationMolecularWeight}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The molecular weight or weight range (for proteins, polymers or nucleic acids).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Molecular Weight</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecification_MolecularWeight()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='molecularWeight' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubstanceSpecificationMolecularWeight> getMolecularWeight();

	/**
	 * Returns the value of the '<em><b>Polymer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data items specific to polymers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Polymer</em>' containment reference.
	 * @see #setPolymer(Reference)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecification_Polymer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='polymer' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPolymer();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecification#getPolymer <em>Polymer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polymer</em>' containment reference.
	 * @see #getPolymer()
	 * @generated
	 */
	void setPolymer(Reference value);

} // SubstanceSpecification
