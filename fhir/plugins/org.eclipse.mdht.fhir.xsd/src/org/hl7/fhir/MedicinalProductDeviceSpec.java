/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medicinal Product Device Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A detailed description of a device, typically as part of a regulated medicinal product. It is not intended to relace the Device resource, which covers use of device instances.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MedicinalProductDeviceSpec#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductDeviceSpec#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductDeviceSpec#getTradeName <em>Trade Name</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductDeviceSpec#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductDeviceSpec#getListingNumber <em>Listing Number</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductDeviceSpec#getModelNumber <em>Model Number</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductDeviceSpec#getSterilityIndicator <em>Sterility Indicator</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductDeviceSpec#getSterilisationRequirement <em>Sterilisation Requirement</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductDeviceSpec#getUsage <em>Usage</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductDeviceSpec#getNomenclature <em>Nomenclature</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductDeviceSpec#getShelfLife <em>Shelf Life</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductDeviceSpec#getPhysicalCharacteristics <em>Physical Characteristics</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductDeviceSpec#getOtherCharacteristics <em>Other Characteristics</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductDeviceSpec#getBatchIdentifier <em>Batch Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductDeviceSpec#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.hl7.fhir.MedicinalProductDeviceSpec#getMaterial <em>Material</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getMedicinalProductDeviceSpec()
 * @model extendedMetaData="name='MedicinalProductDeviceSpec' kind='elementOnly'"
 * @generated
 */
public interface MedicinalProductDeviceSpec extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Business identifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductDeviceSpec_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductDeviceSpec#getIdentifier <em>Identifier</em>}' containment reference.
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
	 * The type of device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductDeviceSpec_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductDeviceSpec#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Trade Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Trade name of the device, where applicable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trade Name</em>' containment reference.
	 * @see #setTradeName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductDeviceSpec_TradeName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tradeName' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getTradeName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductDeviceSpec#getTradeName <em>Trade Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trade Name</em>' containment reference.
	 * @see #getTradeName()
	 * @generated
	 */
	void setTradeName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The quantity of the device present in the packaging of a medicinal product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(Quantity)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductDeviceSpec_Quantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductDeviceSpec#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Listing Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Device listing number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Listing Number</em>' containment reference.
	 * @see #setListingNumber(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductDeviceSpec_ListingNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='listingNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getListingNumber();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductDeviceSpec#getListingNumber <em>Listing Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Listing Number</em>' containment reference.
	 * @see #getListingNumber()
	 * @generated
	 */
	void setListingNumber(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Model Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Device model or reference number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model Number</em>' containment reference.
	 * @see #setModelNumber(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductDeviceSpec_ModelNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='modelNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getModelNumber();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductDeviceSpec#getModelNumber <em>Model Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Number</em>' containment reference.
	 * @see #getModelNumber()
	 * @generated
	 */
	void setModelNumber(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Sterility Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the device is supplied as sterile.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sterility Indicator</em>' containment reference.
	 * @see #setSterilityIndicator(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductDeviceSpec_SterilityIndicator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sterilityIndicator' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSterilityIndicator();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductDeviceSpec#getSterilityIndicator <em>Sterility Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sterility Indicator</em>' containment reference.
	 * @see #getSterilityIndicator()
	 * @generated
	 */
	void setSterilityIndicator(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Sterilisation Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the device must be sterilised before use.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sterilisation Requirement</em>' containment reference.
	 * @see #setSterilisationRequirement(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductDeviceSpec_SterilisationRequirement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sterilisationRequirement' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSterilisationRequirement();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductDeviceSpec#getSterilisationRequirement <em>Sterilisation Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sterilisation Requirement</em>' containment reference.
	 * @see #getSterilisationRequirement()
	 * @generated
	 */
	void setSterilisationRequirement(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Usage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Usage pattern including the number of times that the device may be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Usage</em>' containment reference.
	 * @see #setUsage(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductDeviceSpec_Usage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='usage' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getUsage();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductDeviceSpec#getUsage <em>Usage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage</em>' containment reference.
	 * @see #getUsage()
	 * @generated
	 */
	void setUsage(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Nomenclature</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A nomenclature term for the device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nomenclature</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductDeviceSpec_Nomenclature()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nomenclature' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getNomenclature();

	/**
	 * Returns the value of the '<em><b>Shelf Life</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ProductShelfLife}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Shelf Life and storage information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Shelf Life</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductDeviceSpec_ShelfLife()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='shelfLife' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ProductShelfLife> getShelfLife();

	/**
	 * Returns the value of the '<em><b>Physical Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dimensions, color etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Physical Characteristics</em>' containment reference.
	 * @see #setPhysicalCharacteristics(ProdCharacteristic)
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductDeviceSpec_PhysicalCharacteristics()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='physicalCharacteristics' namespace='##targetNamespace'"
	 * @generated
	 */
	ProdCharacteristic getPhysicalCharacteristics();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MedicinalProductDeviceSpec#getPhysicalCharacteristics <em>Physical Characteristics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Characteristics</em>' containment reference.
	 * @see #getPhysicalCharacteristics()
	 * @generated
	 */
	void setPhysicalCharacteristics(ProdCharacteristic value);

	/**
	 * Returns the value of the '<em><b>Other Characteristics</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Other codeable characteristics.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Characteristics</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductDeviceSpec_OtherCharacteristics()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='otherCharacteristics' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getOtherCharacteristics();

	/**
	 * Returns the value of the '<em><b>Batch Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Batch number or expiry date of a device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Batch Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductDeviceSpec_BatchIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='batchIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getBatchIdentifier();

	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Manufacturer of this Device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufacturer</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductDeviceSpec_Manufacturer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='manufacturer' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getManufacturer();

	/**
	 * Returns the value of the '<em><b>Material</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MedicinalProductDeviceSpecMaterial}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A substance used to create the material(s) of which the device is made.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Material</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getMedicinalProductDeviceSpec_Material()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='material' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MedicinalProductDeviceSpecMaterial> getMaterial();

} // MedicinalProductDeviceSpec
