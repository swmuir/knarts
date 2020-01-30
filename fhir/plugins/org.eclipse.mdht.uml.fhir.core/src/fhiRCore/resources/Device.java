/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Annotation;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.ContactPoint;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Reference;
import fhiRCore.dataTypes.Uri;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.Device#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.Device#getDefinition <em>Definition</em>}</li>
 *   <li>{@link fhiRCore.resources.Device#getUdiCarriers <em>Udi Carrier</em>}</li>
 *   <li>{@link fhiRCore.resources.Device#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.Device#getStatusReasons <em>Status Reason</em>}</li>
 *   <li>{@link fhiRCore.resources.Device#getDistinctIdentifier <em>Distinct Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.Device#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link fhiRCore.resources.Device#getManufactureDate <em>Manufacture Date</em>}</li>
 *   <li>{@link fhiRCore.resources.Device#getExpirationDate <em>Expiration Date</em>}</li>
 *   <li>{@link fhiRCore.resources.Device#getLotNumber <em>Lot Number</em>}</li>
 *   <li>{@link fhiRCore.resources.Device#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link fhiRCore.resources.Device#getDeviceNames <em>Device Name</em>}</li>
 *   <li>{@link fhiRCore.resources.Device#getModelNumber <em>Model Number</em>}</li>
 *   <li>{@link fhiRCore.resources.Device#getPartNumber <em>Part Number</em>}</li>
 *   <li>{@link fhiRCore.resources.Device#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.Device#getSpecializations <em>Specialization</em>}</li>
 *   <li>{@link fhiRCore.resources.Device#getVersions <em>Version</em>}</li>
 *   <li>{@link fhiRCore.resources.Device#getProperties <em>Property</em>}</li>
 *   <li>{@link fhiRCore.resources.Device#getPatient <em>Patient</em>}</li>
 *   <li>{@link fhiRCore.resources.Device#getOwner <em>Owner</em>}</li>
 *   <li>{@link fhiRCore.resources.Device#getContacts <em>Contact</em>}</li>
 *   <li>{@link fhiRCore.resources.Device#getLocation <em>Location</em>}</li>
 *   <li>{@link fhiRCore.resources.Device#getUrl <em>Url</em>}</li>
 *   <li>{@link fhiRCore.resources.Device#getNotes <em>Note</em>}</li>
 *   <li>{@link fhiRCore.resources.Device#getSafeties <em>Safety</em>}</li>
 *   <li>{@link fhiRCore.resources.Device#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getDevice()
 * @model
 * @generated
 */
public interface Device extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Identifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getDevice_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' containment reference.
	 * @see #setDefinition(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getDevice_Definition()
	 * @model containment="true"
	 * @generated
	 */
	Reference getDefinition();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Device#getDefinition <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' containment reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(Reference value);

	/**
	 * Returns the value of the '<em><b>Udi Carrier</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.DeviceUdiCarrier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Udi Carrier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Udi Carrier</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getDevice_UdiCarrier()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeviceUdiCarrier> getUdiCarriers();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(Code)
	 * @see fhiRCore.resources.ResourcesPackage#getDevice_Status()
	 * @model containment="true"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Device#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Status Reason</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Reason</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Reason</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getDevice_StatusReason()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getStatusReasons();

	/**
	 * Returns the value of the '<em><b>Distinct Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distinct Identifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distinct Identifier</em>' containment reference.
	 * @see #setDistinctIdentifier(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getDevice_DistinctIdentifier()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getDistinctIdentifier();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Device#getDistinctIdentifier <em>Distinct Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distinct Identifier</em>' containment reference.
	 * @see #getDistinctIdentifier()
	 * @generated
	 */
	void setDistinctIdentifier(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Manufacturer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manufacturer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manufacturer</em>' containment reference.
	 * @see #setManufacturer(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getDevice_Manufacturer()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getManufacturer();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Device#getManufacturer <em>Manufacturer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturer</em>' containment reference.
	 * @see #getManufacturer()
	 * @generated
	 */
	void setManufacturer(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Manufacture Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manufacture Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manufacture Date</em>' containment reference.
	 * @see #setManufactureDate(DateTime)
	 * @see fhiRCore.resources.ResourcesPackage#getDevice_ManufactureDate()
	 * @model containment="true"
	 * @generated
	 */
	DateTime getManufactureDate();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Device#getManufactureDate <em>Manufacture Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacture Date</em>' containment reference.
	 * @see #getManufactureDate()
	 * @generated
	 */
	void setManufactureDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Expiration Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expiration Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiration Date</em>' containment reference.
	 * @see #setExpirationDate(DateTime)
	 * @see fhiRCore.resources.ResourcesPackage#getDevice_ExpirationDate()
	 * @model containment="true"
	 * @generated
	 */
	DateTime getExpirationDate();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Device#getExpirationDate <em>Expiration Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiration Date</em>' containment reference.
	 * @see #getExpirationDate()
	 * @generated
	 */
	void setExpirationDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Lot Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lot Number</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lot Number</em>' containment reference.
	 * @see #setLotNumber(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getDevice_LotNumber()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getLotNumber();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Device#getLotNumber <em>Lot Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lot Number</em>' containment reference.
	 * @see #getLotNumber()
	 * @generated
	 */
	void setLotNumber(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Serial Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serial Number</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serial Number</em>' containment reference.
	 * @see #setSerialNumber(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getDevice_SerialNumber()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getSerialNumber();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Device#getSerialNumber <em>Serial Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serial Number</em>' containment reference.
	 * @see #getSerialNumber()
	 * @generated
	 */
	void setSerialNumber(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Device Name</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.DeviceDeviceName}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Name</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Name</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getDevice_DeviceName()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeviceDeviceName> getDeviceNames();

	/**
	 * Returns the value of the '<em><b>Model Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Number</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Number</em>' containment reference.
	 * @see #setModelNumber(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getDevice_ModelNumber()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getModelNumber();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Device#getModelNumber <em>Model Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Number</em>' containment reference.
	 * @see #getModelNumber()
	 * @generated
	 */
	void setModelNumber(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Part Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Number</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Number</em>' containment reference.
	 * @see #setPartNumber(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getDevice_PartNumber()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getPartNumber();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Device#getPartNumber <em>Part Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Number</em>' containment reference.
	 * @see #getPartNumber()
	 * @generated
	 */
	void setPartNumber(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see fhiRCore.resources.ResourcesPackage#getDevice_Type()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Device#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Specialization</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.DeviceSpecialization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specialization</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialization</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getDevice_Specialization()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeviceSpecialization> getSpecializations();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.DeviceVersion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getDevice_Version()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeviceVersion> getVersions();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.DeviceProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getDevice_Property()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeviceProperty> getProperties();

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patient</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getDevice_Patient()
	 * @model containment="true"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Device#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Reference value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' containment reference.
	 * @see #setOwner(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getDevice_Owner()
	 * @model containment="true"
	 * @generated
	 */
	Reference getOwner();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Device#getOwner <em>Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' containment reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Reference value);

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.ContactPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getDevice_Contact()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContactPoint> getContacts();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getDevice_Location()
	 * @model containment="true"
	 * @generated
	 */
	Reference getLocation();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Device#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Reference value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' containment reference.
	 * @see #setUrl(Uri)
	 * @see fhiRCore.resources.ResourcesPackage#getDevice_Url()
	 * @model containment="true"
	 * @generated
	 */
	Uri getUrl();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Device#getUrl <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' containment reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(Uri value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.Annotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getDevice_Note()
	 * @model containment="true"
	 * @generated
	 */
	EList<Annotation> getNotes();

	/**
	 * Returns the value of the '<em><b>Safety</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Safety</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Safety</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getDevice_Safety()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getSafeties();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' containment reference.
	 * @see #setParent(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getDevice_Parent()
	 * @model containment="true"
	 * @generated
	 */
	Reference getParent();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.Device#getParent <em>Parent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' containment reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Reference value);

} // Device
