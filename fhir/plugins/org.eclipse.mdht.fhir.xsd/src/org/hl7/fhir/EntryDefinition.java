/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Catalog entries are wrappers that contextualize items included in a catalog.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.EntryDefinition#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.EntryDefinition#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.hl7.fhir.EntryDefinition#getReferencedItem <em>Referenced Item</em>}</li>
 *   <li>{@link org.hl7.fhir.EntryDefinition#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.EntryDefinition#getAdditionalIdentifier <em>Additional Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.EntryDefinition#getClassification <em>Classification</em>}</li>
 *   <li>{@link org.hl7.fhir.EntryDefinition#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.EntryDefinition#getValidityPeriod <em>Validity Period</em>}</li>
 *   <li>{@link org.hl7.fhir.EntryDefinition#getLastUpdated <em>Last Updated</em>}</li>
 *   <li>{@link org.hl7.fhir.EntryDefinition#getAdditionalCharacteristic <em>Additional Characteristic</em>}</li>
 *   <li>{@link org.hl7.fhir.EntryDefinition#getAdditionalClassification <em>Additional Classification</em>}</li>
 *   <li>{@link org.hl7.fhir.EntryDefinition#getRelatedEntry <em>Related Entry</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getEntryDefinition()
 * @model extendedMetaData="name='EntryDefinition' kind='elementOnly'"
 * @generated
 */
public interface EntryDefinition extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of item - medication, device, service, protocol or other.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getEntryDefinition_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EntryDefinition#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the entry represents an orderable item, or other.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Purpose</em>' containment reference.
	 * @see #setPurpose(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getEntryDefinition_Purpose()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='purpose' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getPurpose();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EntryDefinition#getPurpose <em>Purpose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' containment reference.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Referenced Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Content of the catalog.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referenced Item</em>' containment reference.
	 * @see #setReferencedItem(Reference)
	 * @see org.hl7.fhir.FhirPackage#getEntryDefinition_ReferencedItem()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='referencedItem' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getReferencedItem();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EntryDefinition#getReferencedItem <em>Referenced Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Item</em>' containment reference.
	 * @see #getReferencedItem()
	 * @generated
	 */
	void setReferencedItem(Reference value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used in supporting different identifiers for the same product, e.g. manufacturer code and retailer code.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getEntryDefinition_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EntryDefinition#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Additional Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used in supporting related concepts, e.g. NDC to RxNorm.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEntryDefinition_AdditionalIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='additionalIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getAdditionalIdentifier();

	/**
	 * Returns the value of the '<em><b>Classification</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Classes of devices, or ATC for medication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classification</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEntryDefinition_Classification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='classification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getClassification();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to support catalog exchange even for unsupported products, e.g. getting list of medications even if not prescribable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getEntryDefinition_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EntryDefinition#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Validity Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time period in which this catalog entry is expected to be active.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validity Period</em>' containment reference.
	 * @see #setValidityPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getEntryDefinition_ValidityPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='validityPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getValidityPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EntryDefinition#getValidityPeriod <em>Validity Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validity Period</em>' containment reference.
	 * @see #getValidityPeriod()
	 * @generated
	 */
	void setValidityPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Last Updated</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Typically date of issue is different from the beginning of the validity. This can be used to see when an item was last updated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Updated</em>' containment reference.
	 * @see #setLastUpdated(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getEntryDefinition_LastUpdated()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lastUpdated' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getLastUpdated();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.EntryDefinition#getLastUpdated <em>Last Updated</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Updated</em>' containment reference.
	 * @see #getLastUpdated()
	 * @generated
	 */
	void setLastUpdated(DateTime value);

	/**
	 * Returns the value of the '<em><b>Additional Characteristic</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used for examplefor Out of Formulary, or any specifics.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Characteristic</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEntryDefinition_AdditionalCharacteristic()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='additionalCharacteristic' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getAdditionalCharacteristic();

	/**
	 * Returns the value of the '<em><b>Additional Classification</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * User for example for ATC classification, or.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Classification</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEntryDefinition_AdditionalClassification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='additionalClassification' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getAdditionalClassification();

	/**
	 * Returns the value of the '<em><b>Related Entry</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.EntryDefinitionRelatedEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used for example, to point to a substance, or to a device used to administer a medication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Entry</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEntryDefinition_RelatedEntry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relatedEntry' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EntryDefinitionRelatedEntry> getRelatedEntry();

} // EntryDefinition
