/**
 */
package org.hl7.fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A physical, countable instance of an item, for example one box or one unit.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ItemInstance#getCount <em>Count</em>}</li>
 *   <li>{@link org.hl7.fhir.ItemInstance#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.ItemInstance#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.ItemInstance#getManufactureDate <em>Manufacture Date</em>}</li>
 *   <li>{@link org.hl7.fhir.ItemInstance#getExpiryDate <em>Expiry Date</em>}</li>
 *   <li>{@link org.hl7.fhir.ItemInstance#getCurrentSWVersion <em>Current SW Version</em>}</li>
 *   <li>{@link org.hl7.fhir.ItemInstance#getLotNumber <em>Lot Number</em>}</li>
 *   <li>{@link org.hl7.fhir.ItemInstance#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link org.hl7.fhir.ItemInstance#getCarrierAIDC <em>Carrier AIDC</em>}</li>
 *   <li>{@link org.hl7.fhir.ItemInstance#getCarrierHRF <em>Carrier HRF</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getItemInstance()
 * @model extendedMetaData="name='ItemInstance' kind='elementOnly'"
 * @generated
 */
public interface ItemInstance extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The quantity or amount of instances. For example if several units are being counted for inventory, this quantity can be more than one, provided they are not unique. Seriallized items are considered unique and as such would have a quantity max 1. This element is required and its presence asserts that the reource refers to a physical item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Count</em>' containment reference.
	 * @see #setCount(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FhirPackage#getItemInstance_Count()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='count' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getCount();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ItemInstance#getCount <em>Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' containment reference.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The location where the item is phisically located.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Reference)
	 * @see org.hl7.fhir.FhirPackage#getItemInstance_Location()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getLocation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ItemInstance#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Reference value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The patient that the item is associated with (implanted in, given to).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.fhir.FhirPackage#getItemInstance_Subject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ItemInstance#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Manufacture Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The manufacture or preparation date and time. Times are necessary for several examples - for example biologically derived products, prepared or coumpounded medication, rapidly decaying isotopes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Manufacture Date</em>' containment reference.
	 * @see #setManufactureDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getItemInstance_ManufactureDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='manufactureDate' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getManufactureDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ItemInstance#getManufactureDate <em>Manufacture Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacture Date</em>' containment reference.
	 * @see #getManufactureDate()
	 * @generated
	 */
	void setManufactureDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Expiry Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The expiry or preparation date and time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expiry Date</em>' containment reference.
	 * @see #setExpiryDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getItemInstance_ExpiryDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='expiryDate' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getExpiryDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ItemInstance#getExpiryDate <em>Expiry Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiry Date</em>' containment reference.
	 * @see #getExpiryDate()
	 * @generated
	 */
	void setExpiryDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Current SW Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Software version associated with the device, typically only used for devices with embedded software or firmware.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current SW Version</em>' containment reference.
	 * @see #setCurrentSWVersion(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getItemInstance_CurrentSWVersion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='currentSWVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getCurrentSWVersion();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ItemInstance#getCurrentSWVersion <em>Current SW Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current SW Version</em>' containment reference.
	 * @see #getCurrentSWVersion()
	 * @generated
	 */
	void setCurrentSWVersion(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Lot Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The lot or batch number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lot Number</em>' containment reference.
	 * @see #setLotNumber(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getItemInstance_LotNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='lotNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getLotNumber();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ItemInstance#getLotNumber <em>Lot Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lot Number</em>' containment reference.
	 * @see #getLotNumber()
	 * @generated
	 */
	void setLotNumber(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Serial Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The serial number if available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Serial Number</em>' containment reference.
	 * @see #setSerialNumber(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getItemInstance_SerialNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='serialNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getSerialNumber();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ItemInstance#getSerialNumber <em>Serial Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serial Number</em>' containment reference.
	 * @see #getSerialNumber()
	 * @generated
	 */
	void setSerialNumber(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Carrier AIDC</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The machine-readable AIDC string in base64 encoding. Can correspond to the UDI pattern in devices.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Carrier AIDC</em>' containment reference.
	 * @see #setCarrierAIDC(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getItemInstance_CarrierAIDC()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='carrierAIDC' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getCarrierAIDC();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ItemInstance#getCarrierAIDC <em>Carrier AIDC</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier AIDC</em>' containment reference.
	 * @see #getCarrierAIDC()
	 * @generated
	 */
	void setCarrierAIDC(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Carrier HRF</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The human-readable barcode string. Can correspond to the UDI pattern in devices.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Carrier HRF</em>' containment reference.
	 * @see #setCarrierHRF(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getItemInstance_CarrierHRF()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='carrierHRF' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getCarrierHRF();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ItemInstance#getCarrierHRF <em>Carrier HRF</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Carrier HRF</em>' containment reference.
	 * @see #getCarrierHRF()
	 * @generated
	 */
	void setCarrierHRF(org.hl7.fhir.String value);

} // ItemInstance
