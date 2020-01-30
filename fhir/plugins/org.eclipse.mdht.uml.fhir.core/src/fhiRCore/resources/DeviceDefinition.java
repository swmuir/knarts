/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.Annotation;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.ContactPoint;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.ProdCharacteristic;
import fhiRCore.dataTypes.ProductShelfLife;
import fhiRCore.dataTypes.Quantity;
import fhiRCore.dataTypes.Reference;
import fhiRCore.dataTypes.Uri;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Definition</b></em>'.
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
 *   <li>{@link fhiRCore.resources.DeviceDefinition#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.DeviceDefinition#getUdiDeviceIdentifiers <em>Udi Device Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.DeviceDefinition#getManufacturerx <em>Manufacturerx</em>}</li>
 *   <li>{@link fhiRCore.resources.DeviceDefinition#getDeviceNames <em>Device Name</em>}</li>
 *   <li>{@link fhiRCore.resources.DeviceDefinition#getModelNumber <em>Model Number</em>}</li>
 *   <li>{@link fhiRCore.resources.DeviceDefinition#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.DeviceDefinition#getSpecializations <em>Specialization</em>}</li>
 *   <li>{@link fhiRCore.resources.DeviceDefinition#getVersions <em>Version</em>}</li>
 *   <li>{@link fhiRCore.resources.DeviceDefinition#getSafeties <em>Safety</em>}</li>
 *   <li>{@link fhiRCore.resources.DeviceDefinition#getShelfLifeStorages <em>Shelf Life Storage</em>}</li>
 *   <li>{@link fhiRCore.resources.DeviceDefinition#getPhysicalCharacteristics <em>Physical Characteristics</em>}</li>
 *   <li>{@link fhiRCore.resources.DeviceDefinition#getLanguageCodes <em>Language Code</em>}</li>
 *   <li>{@link fhiRCore.resources.DeviceDefinition#getCapabilities <em>Capability</em>}</li>
 *   <li>{@link fhiRCore.resources.DeviceDefinition#getProperties <em>Property</em>}</li>
 *   <li>{@link fhiRCore.resources.DeviceDefinition#getOwner <em>Owner</em>}</li>
 *   <li>{@link fhiRCore.resources.DeviceDefinition#getContacts <em>Contact</em>}</li>
 *   <li>{@link fhiRCore.resources.DeviceDefinition#getUrl <em>Url</em>}</li>
 *   <li>{@link fhiRCore.resources.DeviceDefinition#getOnlineInformation <em>Online Information</em>}</li>
 *   <li>{@link fhiRCore.resources.DeviceDefinition#getNotes <em>Note</em>}</li>
 *   <li>{@link fhiRCore.resources.DeviceDefinition#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link fhiRCore.resources.DeviceDefinition#getParentDevice <em>Parent Device</em>}</li>
 *   <li>{@link fhiRCore.resources.DeviceDefinition#getMaterials <em>Material</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getDeviceDefinition()
 * @model
 * @generated
 */
public interface DeviceDefinition extends DomainResource {
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
	 * @see fhiRCore.resources.ResourcesPackage#getDeviceDefinition_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

	/**
	 * Returns the value of the '<em><b>Udi Device Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.DeviceDefinitionUdiDeviceIdentifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Udi Device Identifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Udi Device Identifier</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getDeviceDefinition_UdiDeviceIdentifier()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeviceDefinitionUdiDeviceIdentifier> getUdiDeviceIdentifiers();

	/**
	 * Returns the value of the '<em><b>Manufacturerx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manufacturerx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manufacturerx</em>' containment reference.
	 * @see #setManufacturerx(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getDeviceDefinition_Manufacturerx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='manufacturer[x]'"
	 * @generated
	 */
	DataType getManufacturerx();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DeviceDefinition#getManufacturerx <em>Manufacturerx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manufacturerx</em>' containment reference.
	 * @see #getManufacturerx()
	 * @generated
	 */
	void setManufacturerx(DataType value);

	/**
	 * Returns the value of the '<em><b>Device Name</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.DeviceDefinitionDeviceName}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Name</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Name</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getDeviceDefinition_DeviceName()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeviceDefinitionDeviceName> getDeviceNames();

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
	 * @see fhiRCore.resources.ResourcesPackage#getDeviceDefinition_ModelNumber()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getModelNumber();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DeviceDefinition#getModelNumber <em>Model Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Number</em>' containment reference.
	 * @see #getModelNumber()
	 * @generated
	 */
	void setModelNumber(fhiRCore.dataTypes.String value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getDeviceDefinition_Type()
	 * @model containment="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DeviceDefinition#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Specialization</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.DeviceDefinitionSpecialization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specialization</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialization</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getDeviceDefinition_Specialization()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeviceDefinitionSpecialization> getSpecializations();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getDeviceDefinition_Version()
	 * @model containment="true"
	 * @generated
	 */
	EList<fhiRCore.dataTypes.String> getVersions();

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
	 * @see fhiRCore.resources.ResourcesPackage#getDeviceDefinition_Safety()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getSafeties();

	/**
	 * Returns the value of the '<em><b>Shelf Life Storage</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.ProductShelfLife}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shelf Life Storage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shelf Life Storage</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getDeviceDefinition_ShelfLifeStorage()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProductShelfLife> getShelfLifeStorages();

	/**
	 * Returns the value of the '<em><b>Physical Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physical Characteristics</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical Characteristics</em>' containment reference.
	 * @see #setPhysicalCharacteristics(ProdCharacteristic)
	 * @see fhiRCore.resources.ResourcesPackage#getDeviceDefinition_PhysicalCharacteristics()
	 * @model containment="true"
	 * @generated
	 */
	ProdCharacteristic getPhysicalCharacteristics();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DeviceDefinition#getPhysicalCharacteristics <em>Physical Characteristics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical Characteristics</em>' containment reference.
	 * @see #getPhysicalCharacteristics()
	 * @generated
	 */
	void setPhysicalCharacteristics(ProdCharacteristic value);

	/**
	 * Returns the value of the '<em><b>Language Code</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language Code</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getDeviceDefinition_LanguageCode()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeableConcept> getLanguageCodes();

	/**
	 * Returns the value of the '<em><b>Capability</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.DeviceDefinitionCapability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capability</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getDeviceDefinition_Capability()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeviceDefinitionCapability> getCapabilities();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.DeviceDefinitionProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getDeviceDefinition_Property()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeviceDefinitionProperty> getProperties();

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
	 * @see fhiRCore.resources.ResourcesPackage#getDeviceDefinition_Owner()
	 * @model containment="true"
	 * @generated
	 */
	Reference getOwner();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DeviceDefinition#getOwner <em>Owner</em>}' containment reference.
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
	 * @see fhiRCore.resources.ResourcesPackage#getDeviceDefinition_Contact()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContactPoint> getContacts();

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
	 * @see fhiRCore.resources.ResourcesPackage#getDeviceDefinition_Url()
	 * @model containment="true"
	 * @generated
	 */
	Uri getUrl();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DeviceDefinition#getUrl <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' containment reference.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(Uri value);

	/**
	 * Returns the value of the '<em><b>Online Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Online Information</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Online Information</em>' containment reference.
	 * @see #setOnlineInformation(Uri)
	 * @see fhiRCore.resources.ResourcesPackage#getDeviceDefinition_OnlineInformation()
	 * @model containment="true"
	 * @generated
	 */
	Uri getOnlineInformation();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DeviceDefinition#getOnlineInformation <em>Online Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Online Information</em>' containment reference.
	 * @see #getOnlineInformation()
	 * @generated
	 */
	void setOnlineInformation(Uri value);

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
	 * @see fhiRCore.resources.ResourcesPackage#getDeviceDefinition_Note()
	 * @model containment="true"
	 * @generated
	 */
	EList<Annotation> getNotes();

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(Quantity)
	 * @see fhiRCore.resources.ResourcesPackage#getDeviceDefinition_Quantity()
	 * @model containment="true"
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DeviceDefinition#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Parent Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Device</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Device</em>' containment reference.
	 * @see #setParentDevice(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getDeviceDefinition_ParentDevice()
	 * @model containment="true"
	 * @generated
	 */
	Reference getParentDevice();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.DeviceDefinition#getParentDevice <em>Parent Device</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Device</em>' containment reference.
	 * @see #getParentDevice()
	 * @generated
	 */
	void setParentDevice(Reference value);

	/**
	 * Returns the value of the '<em><b>Material</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.resources.DeviceDefinitionMaterial}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Material</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Material</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getDeviceDefinition_Material()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeviceDefinitionMaterial> getMaterials();

} // DeviceDefinition
