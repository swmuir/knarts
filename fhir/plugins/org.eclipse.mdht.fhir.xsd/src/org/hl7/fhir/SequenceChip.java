/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Chip</b></em>'.
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
 *   <li>{@link org.hl7.fhir.SequenceChip#getChipId <em>Chip Id</em>}</li>
 *   <li>{@link org.hl7.fhir.SequenceChip#getManufacturerId <em>Manufacturer Id</em>}</li>
 *   <li>{@link org.hl7.fhir.SequenceChip#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getSequenceChip()
 * @model extendedMetaData="name='Sequence.Chip' kind='elementOnly'"
 * @generated
 */
public interface SequenceChip extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Chip Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Chip id.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Chip Id</em>' containment reference.
	 * @see #setChipId(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSequenceChip_ChipId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='chipId' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getChipId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SequenceChip#getChipId <em>Chip Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chip Id</em>' containment reference.
	 * @see #getChipId()
	 * @generated
	 */
	void setChipId(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Manufacturer Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Chip manufacturer id.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufacturer Id</em>' containment reference.
	 * @see #setManufacturerId(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSequenceChip_ManufacturerId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='manufacturerId' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getManufacturerId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SequenceChip#getManufacturerId <em>Manufacturer Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer Id</em>' containment reference.
	 * @see #getManufacturerId()
	 * @generated
	 */
	void setManufacturerId(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Chip version.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getSequenceChip_Version()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getVersion();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SequenceChip#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(org.hl7.fhir.String value);

} // SequenceChip
