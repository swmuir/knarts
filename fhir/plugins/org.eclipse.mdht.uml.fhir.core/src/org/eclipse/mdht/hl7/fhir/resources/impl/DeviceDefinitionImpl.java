/**
 */
package org.eclipse.mdht.hl7.fhir.resources.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.hl7.fhir.dataTypes.Annotation;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.ContactPoint;
import org.eclipse.mdht.hl7.fhir.dataTypes.DataType;
import org.eclipse.mdht.hl7.fhir.dataTypes.Identifier;
import org.eclipse.mdht.hl7.fhir.dataTypes.ProdCharacteristic;
import org.eclipse.mdht.hl7.fhir.dataTypes.ProductShelfLife;
import org.eclipse.mdht.hl7.fhir.dataTypes.Quantity;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;
import org.eclipse.mdht.hl7.fhir.dataTypes.Uri;

import org.eclipse.mdht.hl7.fhir.resources.DeviceDefinition;
import org.eclipse.mdht.hl7.fhir.resources.DeviceDefinitionCapability;
import org.eclipse.mdht.hl7.fhir.resources.DeviceDefinitionDeviceName;
import org.eclipse.mdht.hl7.fhir.resources.DeviceDefinitionMaterial;
import org.eclipse.mdht.hl7.fhir.resources.DeviceDefinitionProperty;
import org.eclipse.mdht.hl7.fhir.resources.DeviceDefinitionSpecialization;
import org.eclipse.mdht.hl7.fhir.resources.DeviceDefinitionUdiDeviceIdentifier;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DeviceDefinitionImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DeviceDefinitionImpl#getUdiDeviceIdentifiers <em>Udi Device Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DeviceDefinitionImpl#getManufacturerx <em>Manufacturerx</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DeviceDefinitionImpl#getDeviceNames <em>Device Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DeviceDefinitionImpl#getModelNumber <em>Model Number</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DeviceDefinitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DeviceDefinitionImpl#getSpecializations <em>Specialization</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DeviceDefinitionImpl#getVersions <em>Version</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DeviceDefinitionImpl#getSafeties <em>Safety</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DeviceDefinitionImpl#getShelfLifeStorages <em>Shelf Life Storage</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DeviceDefinitionImpl#getPhysicalCharacteristics <em>Physical Characteristics</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DeviceDefinitionImpl#getLanguageCodes <em>Language Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DeviceDefinitionImpl#getCapabilities <em>Capability</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DeviceDefinitionImpl#getProperties <em>Property</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DeviceDefinitionImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DeviceDefinitionImpl#getContacts <em>Contact</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DeviceDefinitionImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DeviceDefinitionImpl#getOnlineInformation <em>Online Information</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DeviceDefinitionImpl#getNotes <em>Note</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DeviceDefinitionImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DeviceDefinitionImpl#getParentDevice <em>Parent Device</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DeviceDefinitionImpl#getMaterials <em>Material</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceDefinitionImpl extends DomainResourceImpl implements DeviceDefinition {
	/**
	 * The cached value of the '{@link #getIdentifiers() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifiers;

	/**
	 * The cached value of the '{@link #getUdiDeviceIdentifiers() <em>Udi Device Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUdiDeviceIdentifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceDefinitionUdiDeviceIdentifier> udiDeviceIdentifiers;

	/**
	 * The cached value of the '{@link #getManufacturerx() <em>Manufacturerx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturerx()
	 * @generated
	 * @ordered
	 */
	protected DataType manufacturerx;

	/**
	 * The cached value of the '{@link #getDeviceNames() <em>Device Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceNames()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceDefinitionDeviceName> deviceNames;

	/**
	 * The cached value of the '{@link #getModelNumber() <em>Model Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelNumber()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String modelNumber;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getSpecializations() <em>Specialization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecializations()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceDefinitionSpecialization> specializations;

	/**
	 * The cached value of the '{@link #getVersions() <em>Version</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersions()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.mdht.hl7.fhir.dataTypes.String> versions;

	/**
	 * The cached value of the '{@link #getSafeties() <em>Safety</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSafeties()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> safeties;

	/**
	 * The cached value of the '{@link #getShelfLifeStorages() <em>Shelf Life Storage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShelfLifeStorages()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductShelfLife> shelfLifeStorages;

	/**
	 * The cached value of the '{@link #getPhysicalCharacteristics() <em>Physical Characteristics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected ProdCharacteristic physicalCharacteristics;

	/**
	 * The cached value of the '{@link #getLanguageCodes() <em>Language Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> languageCodes;

	/**
	 * The cached value of the '{@link #getCapabilities() <em>Capability</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceDefinitionCapability> capabilities;

	/**
	 * The cached value of the '{@link #getProperties() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceDefinitionProperty> properties;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected Reference owner;

	/**
	 * The cached value of the '{@link #getContacts() <em>Contact</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContacts()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactPoint> contacts;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected Uri url;

	/**
	 * The cached value of the '{@link #getOnlineInformation() <em>Online Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnlineInformation()
	 * @generated
	 * @ordered
	 */
	protected Uri onlineInformation;

	/**
	 * The cached value of the '{@link #getNotes() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> notes;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity quantity;

	/**
	 * The cached value of the '{@link #getParentDevice() <em>Parent Device</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentDevice()
	 * @generated
	 * @ordered
	 */
	protected Reference parentDevice;

	/**
	 * The cached value of the '{@link #getMaterials() <em>Material</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaterials()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceDefinitionMaterial> materials;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getDeviceDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.DEVICE_DEFINITION__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeviceDefinitionUdiDeviceIdentifier> getUdiDeviceIdentifiers() {
		if (udiDeviceIdentifiers == null) {
			udiDeviceIdentifiers = new EObjectContainmentEList<DeviceDefinitionUdiDeviceIdentifier>(DeviceDefinitionUdiDeviceIdentifier.class, this, ResourcesPackage.DEVICE_DEFINITION__UDI_DEVICE_IDENTIFIER);
		}
		return udiDeviceIdentifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getManufacturerx() {
		return manufacturerx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManufacturerx(DataType newManufacturerx, NotificationChain msgs) {
		DataType oldManufacturerx = manufacturerx;
		manufacturerx = newManufacturerx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_DEFINITION__MANUFACTURERX, oldManufacturerx, newManufacturerx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManufacturerx(DataType newManufacturerx) {
		if (newManufacturerx != manufacturerx) {
			NotificationChain msgs = null;
			if (manufacturerx != null)
				msgs = ((InternalEObject)manufacturerx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_DEFINITION__MANUFACTURERX, null, msgs);
			if (newManufacturerx != null)
				msgs = ((InternalEObject)newManufacturerx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_DEFINITION__MANUFACTURERX, null, msgs);
			msgs = basicSetManufacturerx(newManufacturerx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_DEFINITION__MANUFACTURERX, newManufacturerx, newManufacturerx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeviceDefinitionDeviceName> getDeviceNames() {
		if (deviceNames == null) {
			deviceNames = new EObjectContainmentEList<DeviceDefinitionDeviceName>(DeviceDefinitionDeviceName.class, this, ResourcesPackage.DEVICE_DEFINITION__DEVICE_NAME);
		}
		return deviceNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getModelNumber() {
		return modelNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelNumber(org.eclipse.mdht.hl7.fhir.dataTypes.String newModelNumber, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldModelNumber = modelNumber;
		modelNumber = newModelNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_DEFINITION__MODEL_NUMBER, oldModelNumber, newModelNumber);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModelNumber(org.eclipse.mdht.hl7.fhir.dataTypes.String newModelNumber) {
		if (newModelNumber != modelNumber) {
			NotificationChain msgs = null;
			if (modelNumber != null)
				msgs = ((InternalEObject)modelNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_DEFINITION__MODEL_NUMBER, null, msgs);
			if (newModelNumber != null)
				msgs = ((InternalEObject)newModelNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_DEFINITION__MODEL_NUMBER, null, msgs);
			msgs = basicSetModelNumber(newModelNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_DEFINITION__MODEL_NUMBER, newModelNumber, newModelNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(CodeableConcept newType, NotificationChain msgs) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_DEFINITION__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_DEFINITION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_DEFINITION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_DEFINITION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeviceDefinitionSpecialization> getSpecializations() {
		if (specializations == null) {
			specializations = new EObjectContainmentEList<DeviceDefinitionSpecialization>(DeviceDefinitionSpecialization.class, this, ResourcesPackage.DEVICE_DEFINITION__SPECIALIZATION);
		}
		return specializations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.eclipse.mdht.hl7.fhir.dataTypes.String> getVersions() {
		if (versions == null) {
			versions = new EObjectContainmentEList<org.eclipse.mdht.hl7.fhir.dataTypes.String>(org.eclipse.mdht.hl7.fhir.dataTypes.String.class, this, ResourcesPackage.DEVICE_DEFINITION__VERSION);
		}
		return versions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getSafeties() {
		if (safeties == null) {
			safeties = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.DEVICE_DEFINITION__SAFETY);
		}
		return safeties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProductShelfLife> getShelfLifeStorages() {
		if (shelfLifeStorages == null) {
			shelfLifeStorages = new EObjectContainmentEList<ProductShelfLife>(ProductShelfLife.class, this, ResourcesPackage.DEVICE_DEFINITION__SHELF_LIFE_STORAGE);
		}
		return shelfLifeStorages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProdCharacteristic getPhysicalCharacteristics() {
		return physicalCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPhysicalCharacteristics(ProdCharacteristic newPhysicalCharacteristics, NotificationChain msgs) {
		ProdCharacteristic oldPhysicalCharacteristics = physicalCharacteristics;
		physicalCharacteristics = newPhysicalCharacteristics;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_DEFINITION__PHYSICAL_CHARACTERISTICS, oldPhysicalCharacteristics, newPhysicalCharacteristics);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhysicalCharacteristics(ProdCharacteristic newPhysicalCharacteristics) {
		if (newPhysicalCharacteristics != physicalCharacteristics) {
			NotificationChain msgs = null;
			if (physicalCharacteristics != null)
				msgs = ((InternalEObject)physicalCharacteristics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_DEFINITION__PHYSICAL_CHARACTERISTICS, null, msgs);
			if (newPhysicalCharacteristics != null)
				msgs = ((InternalEObject)newPhysicalCharacteristics).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_DEFINITION__PHYSICAL_CHARACTERISTICS, null, msgs);
			msgs = basicSetPhysicalCharacteristics(newPhysicalCharacteristics, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_DEFINITION__PHYSICAL_CHARACTERISTICS, newPhysicalCharacteristics, newPhysicalCharacteristics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getLanguageCodes() {
		if (languageCodes == null) {
			languageCodes = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.DEVICE_DEFINITION__LANGUAGE_CODE);
		}
		return languageCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeviceDefinitionCapability> getCapabilities() {
		if (capabilities == null) {
			capabilities = new EObjectContainmentEList<DeviceDefinitionCapability>(DeviceDefinitionCapability.class, this, ResourcesPackage.DEVICE_DEFINITION__CAPABILITY);
		}
		return capabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeviceDefinitionProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<DeviceDefinitionProperty>(DeviceDefinitionProperty.class, this, ResourcesPackage.DEVICE_DEFINITION__PROPERTY);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(Reference newOwner, NotificationChain msgs) {
		Reference oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_DEFINITION__OWNER, oldOwner, newOwner);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwner(Reference newOwner) {
		if (newOwner != owner) {
			NotificationChain msgs = null;
			if (owner != null)
				msgs = ((InternalEObject)owner).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_DEFINITION__OWNER, null, msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_DEFINITION__OWNER, null, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_DEFINITION__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContactPoint> getContacts() {
		if (contacts == null) {
			contacts = new EObjectContainmentEList<ContactPoint>(ContactPoint.class, this, ResourcesPackage.DEVICE_DEFINITION__CONTACT);
		}
		return contacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uri getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUrl(Uri newUrl, NotificationChain msgs) {
		Uri oldUrl = url;
		url = newUrl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_DEFINITION__URL, oldUrl, newUrl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrl(Uri newUrl) {
		if (newUrl != url) {
			NotificationChain msgs = null;
			if (url != null)
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_DEFINITION__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_DEFINITION__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_DEFINITION__URL, newUrl, newUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uri getOnlineInformation() {
		return onlineInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnlineInformation(Uri newOnlineInformation, NotificationChain msgs) {
		Uri oldOnlineInformation = onlineInformation;
		onlineInformation = newOnlineInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_DEFINITION__ONLINE_INFORMATION, oldOnlineInformation, newOnlineInformation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnlineInformation(Uri newOnlineInformation) {
		if (newOnlineInformation != onlineInformation) {
			NotificationChain msgs = null;
			if (onlineInformation != null)
				msgs = ((InternalEObject)onlineInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_DEFINITION__ONLINE_INFORMATION, null, msgs);
			if (newOnlineInformation != null)
				msgs = ((InternalEObject)newOnlineInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_DEFINITION__ONLINE_INFORMATION, null, msgs);
			msgs = basicSetOnlineInformation(newOnlineInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_DEFINITION__ONLINE_INFORMATION, newOnlineInformation, newOnlineInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getNotes() {
		if (notes == null) {
			notes = new EObjectContainmentEList<Annotation>(Annotation.class, this, ResourcesPackage.DEVICE_DEFINITION__NOTE);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantity(Quantity newQuantity, NotificationChain msgs) {
		Quantity oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_DEFINITION__QUANTITY, oldQuantity, newQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuantity(Quantity newQuantity) {
		if (newQuantity != quantity) {
			NotificationChain msgs = null;
			if (quantity != null)
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_DEFINITION__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_DEFINITION__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_DEFINITION__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getParentDevice() {
		return parentDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentDevice(Reference newParentDevice, NotificationChain msgs) {
		Reference oldParentDevice = parentDevice;
		parentDevice = newParentDevice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_DEFINITION__PARENT_DEVICE, oldParentDevice, newParentDevice);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentDevice(Reference newParentDevice) {
		if (newParentDevice != parentDevice) {
			NotificationChain msgs = null;
			if (parentDevice != null)
				msgs = ((InternalEObject)parentDevice).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_DEFINITION__PARENT_DEVICE, null, msgs);
			if (newParentDevice != null)
				msgs = ((InternalEObject)newParentDevice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_DEFINITION__PARENT_DEVICE, null, msgs);
			msgs = basicSetParentDevice(newParentDevice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_DEFINITION__PARENT_DEVICE, newParentDevice, newParentDevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeviceDefinitionMaterial> getMaterials() {
		if (materials == null) {
			materials = new EObjectContainmentEList<DeviceDefinitionMaterial>(DeviceDefinitionMaterial.class, this, ResourcesPackage.DEVICE_DEFINITION__MATERIAL);
		}
		return materials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.DEVICE_DEFINITION__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DEVICE_DEFINITION__UDI_DEVICE_IDENTIFIER:
				return ((InternalEList<?>)getUdiDeviceIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DEVICE_DEFINITION__MANUFACTURERX:
				return basicSetManufacturerx(null, msgs);
			case ResourcesPackage.DEVICE_DEFINITION__DEVICE_NAME:
				return ((InternalEList<?>)getDeviceNames()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DEVICE_DEFINITION__MODEL_NUMBER:
				return basicSetModelNumber(null, msgs);
			case ResourcesPackage.DEVICE_DEFINITION__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.DEVICE_DEFINITION__SPECIALIZATION:
				return ((InternalEList<?>)getSpecializations()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DEVICE_DEFINITION__VERSION:
				return ((InternalEList<?>)getVersions()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DEVICE_DEFINITION__SAFETY:
				return ((InternalEList<?>)getSafeties()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DEVICE_DEFINITION__SHELF_LIFE_STORAGE:
				return ((InternalEList<?>)getShelfLifeStorages()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DEVICE_DEFINITION__PHYSICAL_CHARACTERISTICS:
				return basicSetPhysicalCharacteristics(null, msgs);
			case ResourcesPackage.DEVICE_DEFINITION__LANGUAGE_CODE:
				return ((InternalEList<?>)getLanguageCodes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DEVICE_DEFINITION__CAPABILITY:
				return ((InternalEList<?>)getCapabilities()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DEVICE_DEFINITION__PROPERTY:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DEVICE_DEFINITION__OWNER:
				return basicSetOwner(null, msgs);
			case ResourcesPackage.DEVICE_DEFINITION__CONTACT:
				return ((InternalEList<?>)getContacts()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DEVICE_DEFINITION__URL:
				return basicSetUrl(null, msgs);
			case ResourcesPackage.DEVICE_DEFINITION__ONLINE_INFORMATION:
				return basicSetOnlineInformation(null, msgs);
			case ResourcesPackage.DEVICE_DEFINITION__NOTE:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DEVICE_DEFINITION__QUANTITY:
				return basicSetQuantity(null, msgs);
			case ResourcesPackage.DEVICE_DEFINITION__PARENT_DEVICE:
				return basicSetParentDevice(null, msgs);
			case ResourcesPackage.DEVICE_DEFINITION__MATERIAL:
				return ((InternalEList<?>)getMaterials()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.DEVICE_DEFINITION__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.DEVICE_DEFINITION__UDI_DEVICE_IDENTIFIER:
				return getUdiDeviceIdentifiers();
			case ResourcesPackage.DEVICE_DEFINITION__MANUFACTURERX:
				return getManufacturerx();
			case ResourcesPackage.DEVICE_DEFINITION__DEVICE_NAME:
				return getDeviceNames();
			case ResourcesPackage.DEVICE_DEFINITION__MODEL_NUMBER:
				return getModelNumber();
			case ResourcesPackage.DEVICE_DEFINITION__TYPE:
				return getType();
			case ResourcesPackage.DEVICE_DEFINITION__SPECIALIZATION:
				return getSpecializations();
			case ResourcesPackage.DEVICE_DEFINITION__VERSION:
				return getVersions();
			case ResourcesPackage.DEVICE_DEFINITION__SAFETY:
				return getSafeties();
			case ResourcesPackage.DEVICE_DEFINITION__SHELF_LIFE_STORAGE:
				return getShelfLifeStorages();
			case ResourcesPackage.DEVICE_DEFINITION__PHYSICAL_CHARACTERISTICS:
				return getPhysicalCharacteristics();
			case ResourcesPackage.DEVICE_DEFINITION__LANGUAGE_CODE:
				return getLanguageCodes();
			case ResourcesPackage.DEVICE_DEFINITION__CAPABILITY:
				return getCapabilities();
			case ResourcesPackage.DEVICE_DEFINITION__PROPERTY:
				return getProperties();
			case ResourcesPackage.DEVICE_DEFINITION__OWNER:
				return getOwner();
			case ResourcesPackage.DEVICE_DEFINITION__CONTACT:
				return getContacts();
			case ResourcesPackage.DEVICE_DEFINITION__URL:
				return getUrl();
			case ResourcesPackage.DEVICE_DEFINITION__ONLINE_INFORMATION:
				return getOnlineInformation();
			case ResourcesPackage.DEVICE_DEFINITION__NOTE:
				return getNotes();
			case ResourcesPackage.DEVICE_DEFINITION__QUANTITY:
				return getQuantity();
			case ResourcesPackage.DEVICE_DEFINITION__PARENT_DEVICE:
				return getParentDevice();
			case ResourcesPackage.DEVICE_DEFINITION__MATERIAL:
				return getMaterials();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ResourcesPackage.DEVICE_DEFINITION__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.DEVICE_DEFINITION__UDI_DEVICE_IDENTIFIER:
				getUdiDeviceIdentifiers().clear();
				getUdiDeviceIdentifiers().addAll((Collection<? extends DeviceDefinitionUdiDeviceIdentifier>)newValue);
				return;
			case ResourcesPackage.DEVICE_DEFINITION__MANUFACTURERX:
				setManufacturerx((DataType)newValue);
				return;
			case ResourcesPackage.DEVICE_DEFINITION__DEVICE_NAME:
				getDeviceNames().clear();
				getDeviceNames().addAll((Collection<? extends DeviceDefinitionDeviceName>)newValue);
				return;
			case ResourcesPackage.DEVICE_DEFINITION__MODEL_NUMBER:
				setModelNumber((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.DEVICE_DEFINITION__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.DEVICE_DEFINITION__SPECIALIZATION:
				getSpecializations().clear();
				getSpecializations().addAll((Collection<? extends DeviceDefinitionSpecialization>)newValue);
				return;
			case ResourcesPackage.DEVICE_DEFINITION__VERSION:
				getVersions().clear();
				getVersions().addAll((Collection<? extends org.eclipse.mdht.hl7.fhir.dataTypes.String>)newValue);
				return;
			case ResourcesPackage.DEVICE_DEFINITION__SAFETY:
				getSafeties().clear();
				getSafeties().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.DEVICE_DEFINITION__SHELF_LIFE_STORAGE:
				getShelfLifeStorages().clear();
				getShelfLifeStorages().addAll((Collection<? extends ProductShelfLife>)newValue);
				return;
			case ResourcesPackage.DEVICE_DEFINITION__PHYSICAL_CHARACTERISTICS:
				setPhysicalCharacteristics((ProdCharacteristic)newValue);
				return;
			case ResourcesPackage.DEVICE_DEFINITION__LANGUAGE_CODE:
				getLanguageCodes().clear();
				getLanguageCodes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.DEVICE_DEFINITION__CAPABILITY:
				getCapabilities().clear();
				getCapabilities().addAll((Collection<? extends DeviceDefinitionCapability>)newValue);
				return;
			case ResourcesPackage.DEVICE_DEFINITION__PROPERTY:
				getProperties().clear();
				getProperties().addAll((Collection<? extends DeviceDefinitionProperty>)newValue);
				return;
			case ResourcesPackage.DEVICE_DEFINITION__OWNER:
				setOwner((Reference)newValue);
				return;
			case ResourcesPackage.DEVICE_DEFINITION__CONTACT:
				getContacts().clear();
				getContacts().addAll((Collection<? extends ContactPoint>)newValue);
				return;
			case ResourcesPackage.DEVICE_DEFINITION__URL:
				setUrl((Uri)newValue);
				return;
			case ResourcesPackage.DEVICE_DEFINITION__ONLINE_INFORMATION:
				setOnlineInformation((Uri)newValue);
				return;
			case ResourcesPackage.DEVICE_DEFINITION__NOTE:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Annotation>)newValue);
				return;
			case ResourcesPackage.DEVICE_DEFINITION__QUANTITY:
				setQuantity((Quantity)newValue);
				return;
			case ResourcesPackage.DEVICE_DEFINITION__PARENT_DEVICE:
				setParentDevice((Reference)newValue);
				return;
			case ResourcesPackage.DEVICE_DEFINITION__MATERIAL:
				getMaterials().clear();
				getMaterials().addAll((Collection<? extends DeviceDefinitionMaterial>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ResourcesPackage.DEVICE_DEFINITION__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.DEVICE_DEFINITION__UDI_DEVICE_IDENTIFIER:
				getUdiDeviceIdentifiers().clear();
				return;
			case ResourcesPackage.DEVICE_DEFINITION__MANUFACTURERX:
				setManufacturerx((DataType)null);
				return;
			case ResourcesPackage.DEVICE_DEFINITION__DEVICE_NAME:
				getDeviceNames().clear();
				return;
			case ResourcesPackage.DEVICE_DEFINITION__MODEL_NUMBER:
				setModelNumber((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.DEVICE_DEFINITION__TYPE:
				setType((CodeableConcept)null);
				return;
			case ResourcesPackage.DEVICE_DEFINITION__SPECIALIZATION:
				getSpecializations().clear();
				return;
			case ResourcesPackage.DEVICE_DEFINITION__VERSION:
				getVersions().clear();
				return;
			case ResourcesPackage.DEVICE_DEFINITION__SAFETY:
				getSafeties().clear();
				return;
			case ResourcesPackage.DEVICE_DEFINITION__SHELF_LIFE_STORAGE:
				getShelfLifeStorages().clear();
				return;
			case ResourcesPackage.DEVICE_DEFINITION__PHYSICAL_CHARACTERISTICS:
				setPhysicalCharacteristics((ProdCharacteristic)null);
				return;
			case ResourcesPackage.DEVICE_DEFINITION__LANGUAGE_CODE:
				getLanguageCodes().clear();
				return;
			case ResourcesPackage.DEVICE_DEFINITION__CAPABILITY:
				getCapabilities().clear();
				return;
			case ResourcesPackage.DEVICE_DEFINITION__PROPERTY:
				getProperties().clear();
				return;
			case ResourcesPackage.DEVICE_DEFINITION__OWNER:
				setOwner((Reference)null);
				return;
			case ResourcesPackage.DEVICE_DEFINITION__CONTACT:
				getContacts().clear();
				return;
			case ResourcesPackage.DEVICE_DEFINITION__URL:
				setUrl((Uri)null);
				return;
			case ResourcesPackage.DEVICE_DEFINITION__ONLINE_INFORMATION:
				setOnlineInformation((Uri)null);
				return;
			case ResourcesPackage.DEVICE_DEFINITION__NOTE:
				getNotes().clear();
				return;
			case ResourcesPackage.DEVICE_DEFINITION__QUANTITY:
				setQuantity((Quantity)null);
				return;
			case ResourcesPackage.DEVICE_DEFINITION__PARENT_DEVICE:
				setParentDevice((Reference)null);
				return;
			case ResourcesPackage.DEVICE_DEFINITION__MATERIAL:
				getMaterials().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ResourcesPackage.DEVICE_DEFINITION__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.DEVICE_DEFINITION__UDI_DEVICE_IDENTIFIER:
				return udiDeviceIdentifiers != null && !udiDeviceIdentifiers.isEmpty();
			case ResourcesPackage.DEVICE_DEFINITION__MANUFACTURERX:
				return manufacturerx != null;
			case ResourcesPackage.DEVICE_DEFINITION__DEVICE_NAME:
				return deviceNames != null && !deviceNames.isEmpty();
			case ResourcesPackage.DEVICE_DEFINITION__MODEL_NUMBER:
				return modelNumber != null;
			case ResourcesPackage.DEVICE_DEFINITION__TYPE:
				return type != null;
			case ResourcesPackage.DEVICE_DEFINITION__SPECIALIZATION:
				return specializations != null && !specializations.isEmpty();
			case ResourcesPackage.DEVICE_DEFINITION__VERSION:
				return versions != null && !versions.isEmpty();
			case ResourcesPackage.DEVICE_DEFINITION__SAFETY:
				return safeties != null && !safeties.isEmpty();
			case ResourcesPackage.DEVICE_DEFINITION__SHELF_LIFE_STORAGE:
				return shelfLifeStorages != null && !shelfLifeStorages.isEmpty();
			case ResourcesPackage.DEVICE_DEFINITION__PHYSICAL_CHARACTERISTICS:
				return physicalCharacteristics != null;
			case ResourcesPackage.DEVICE_DEFINITION__LANGUAGE_CODE:
				return languageCodes != null && !languageCodes.isEmpty();
			case ResourcesPackage.DEVICE_DEFINITION__CAPABILITY:
				return capabilities != null && !capabilities.isEmpty();
			case ResourcesPackage.DEVICE_DEFINITION__PROPERTY:
				return properties != null && !properties.isEmpty();
			case ResourcesPackage.DEVICE_DEFINITION__OWNER:
				return owner != null;
			case ResourcesPackage.DEVICE_DEFINITION__CONTACT:
				return contacts != null && !contacts.isEmpty();
			case ResourcesPackage.DEVICE_DEFINITION__URL:
				return url != null;
			case ResourcesPackage.DEVICE_DEFINITION__ONLINE_INFORMATION:
				return onlineInformation != null;
			case ResourcesPackage.DEVICE_DEFINITION__NOTE:
				return notes != null && !notes.isEmpty();
			case ResourcesPackage.DEVICE_DEFINITION__QUANTITY:
				return quantity != null;
			case ResourcesPackage.DEVICE_DEFINITION__PARENT_DEVICE:
				return parentDevice != null;
			case ResourcesPackage.DEVICE_DEFINITION__MATERIAL:
				return materials != null && !materials.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeviceDefinitionImpl
