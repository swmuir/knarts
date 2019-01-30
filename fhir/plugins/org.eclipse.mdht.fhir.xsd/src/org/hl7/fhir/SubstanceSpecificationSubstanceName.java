/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substance Specification Substance Name</b></em>'.
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
 *   <li>{@link org.hl7.fhir.SubstanceSpecificationSubstanceName#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecificationSubstanceName#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecificationSubstanceName#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecificationSubstanceName#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecificationSubstanceName#getJurisdiction <em>Jurisdiction</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecificationSubstanceName#getOfficialName <em>Official Name</em>}</li>
 *   <li>{@link org.hl7.fhir.SubstanceSpecificationSubstanceName#getReferenceSource <em>Reference Source</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationSubstanceName()
 * @model extendedMetaData="name='SubstanceSpecification.SubstanceName' kind='elementOnly'"
 * @generated
 */
public interface SubstanceSpecificationSubstanceName extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationSubstanceName_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecificationSubstanceName#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationSubstanceName_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubstanceSpecificationSubstanceName#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Language of the name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationSubstanceName_Language()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='language' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getLanguage();

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The use context of this name for example if there is a different name a drug active ingredient as opposed to a food colour additive.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationSubstanceName_Domain()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='domain' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getDomain();

	/**
	 * Returns the value of the '<em><b>Jurisdiction</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The jurisdiction where this name applies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jurisdiction</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationSubstanceName_Jurisdiction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='jurisdiction' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getJurisdiction();

	/**
	 * Returns the value of the '<em><b>Official Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SubstanceSpecificationOfficialName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Details of the official nature of this name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Official Name</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationSubstanceName_OfficialName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='officialName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubstanceSpecificationOfficialName> getOfficialName();

	/**
	 * Returns the value of the '<em><b>Reference Source</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Supporting literature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference Source</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getSubstanceSpecificationSubstanceName_ReferenceSource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='referenceSource' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getReferenceSource();

} // SubstanceSpecificationSubstanceName
