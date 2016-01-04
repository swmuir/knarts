/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Variation and Sequence data.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.SequenceRepository#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.SequenceRepository#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.SequenceRepository#getStructure <em>Structure</em>}</li>
 *   <li>{@link org.hl7.fhir.SequenceRepository#getVariantId <em>Variant Id</em>}</li>
 *   <li>{@link org.hl7.fhir.SequenceRepository#getReadGroupSetId <em>Read Group Set Id</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSequenceRepository()
 * @model extendedMetaData="name='Sequence.Repository' kind='elementOnly'"
 * @generated
 */
public interface SequenceRepository extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URI of a GA4GH repository which contains further details about the genetics data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' containment reference.
	 * @see #setUrl(Uri)
	 * @see org.hl7.fhir.FhirPackage#getSequenceRepository_Url()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getUrl();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SequenceRepository#getUrl <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' containment reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(Uri value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URI of a GA4GH repository which contains further details about the genetics data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSequenceRepository_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SequenceRepository#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URI of the page containing information about the structure of the repository.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Structure</em>' containment reference.
	 * @see #setStructure(Uri)
	 * @see org.hl7.fhir.FhirPackage#getSequenceRepository_Structure()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='structure' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getStructure();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SequenceRepository#getStructure <em>Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure</em>' containment reference.
	 * @see #getStructure()
	 * @generated
	 */
	void setStructure(Uri value);

	/**
	 * Returns the value of the '<em><b>Variant Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Id of the GA4GH call set that matches identity of patient. A CallSet in GA4GH represents an individual.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variant Id</em>' containment reference.
	 * @see #setVariantId(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSequenceRepository_VariantId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='variantId' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getVariantId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SequenceRepository#getVariantId <em>Variant Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variant Id</em>' containment reference.
	 * @see #getVariantId()
	 * @generated
	 */
	void setVariantId(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Read Group Set Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Id of the GA4GH read group from which details about the sequence can be found. A read group in GA4GH represents a set of DNA reads processed the same way by the sequencer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Read Group Set Id</em>' containment reference.
	 * @see #setReadGroupSetId(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSequenceRepository_ReadGroupSetId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='readGroupSetId' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getReadGroupSetId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SequenceRepository#getReadGroupSetId <em>Read Group Set Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Group Set Id</em>' containment reference.
	 * @see #getReadGroupSetId()
	 * @generated
	 */
	void setReadGroupSetId(org.hl7.fhir.String value);

} // SequenceRepository
