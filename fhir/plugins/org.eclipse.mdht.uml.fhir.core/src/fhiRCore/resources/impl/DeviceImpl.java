/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Annotation;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.ContactPoint;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Reference;
import fhiRCore.dataTypes.Uri;

import fhiRCore.resources.Device;
import fhiRCore.resources.DeviceDeviceName;
import fhiRCore.resources.DeviceProperty;
import fhiRCore.resources.DeviceSpecialization;
import fhiRCore.resources.DeviceUdiCarrier;
import fhiRCore.resources.DeviceVersion;
import fhiRCore.resources.ResourcesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.DeviceImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.DeviceImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.DeviceImpl#getUdiCarriers <em>Udi Carrier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.DeviceImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.DeviceImpl#getStatusReasons <em>Status Reason</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.DeviceImpl#getDistinctIdentifier <em>Distinct Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.DeviceImpl#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.DeviceImpl#getManufactureDate <em>Manufacture Date</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.DeviceImpl#getExpirationDate <em>Expiration Date</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.DeviceImpl#getLotNumber <em>Lot Number</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.DeviceImpl#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.DeviceImpl#getDeviceNames <em>Device Name</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.DeviceImpl#getModelNumber <em>Model Number</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.DeviceImpl#getPartNumber <em>Part Number</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.DeviceImpl#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.DeviceImpl#getSpecializations <em>Specialization</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.DeviceImpl#getVersions <em>Version</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.DeviceImpl#getProperties <em>Property</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.DeviceImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.DeviceImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.DeviceImpl#getContacts <em>Contact</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.DeviceImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.DeviceImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.DeviceImpl#getNotes <em>Note</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.DeviceImpl#getSafeties <em>Safety</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.DeviceImpl#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceImpl extends DomainResourceImpl implements Device {
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
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected Reference definition;

	/**
	 * The cached value of the '{@link #getUdiCarriers() <em>Udi Carrier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUdiCarriers()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceUdiCarrier> udiCarriers;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Code status;

	/**
	 * The cached value of the '{@link #getStatusReasons() <em>Status Reason</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusReasons()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> statusReasons;

	/**
	 * The cached value of the '{@link #getDistinctIdentifier() <em>Distinct Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistinctIdentifier()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String distinctIdentifier;

	/**
	 * The cached value of the '{@link #getManufacturer() <em>Manufacturer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String manufacturer;

	/**
	 * The cached value of the '{@link #getManufactureDate() <em>Manufacture Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufactureDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime manufactureDate;

	/**
	 * The cached value of the '{@link #getExpirationDate() <em>Expiration Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime expirationDate;

	/**
	 * The cached value of the '{@link #getLotNumber() <em>Lot Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLotNumber()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String lotNumber;

	/**
	 * The cached value of the '{@link #getSerialNumber() <em>Serial Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String serialNumber;

	/**
	 * The cached value of the '{@link #getDeviceNames() <em>Device Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceNames()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceDeviceName> deviceNames;

	/**
	 * The cached value of the '{@link #getModelNumber() <em>Model Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelNumber()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String modelNumber;

	/**
	 * The cached value of the '{@link #getPartNumber() <em>Part Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartNumber()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String partNumber;

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
	protected EList<DeviceSpecialization> specializations;

	/**
	 * The cached value of the '{@link #getVersions() <em>Version</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersions()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceVersion> versions;

	/**
	 * The cached value of the '{@link #getProperties() <em>Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<DeviceProperty> properties;

	/**
	 * The cached value of the '{@link #getPatient() <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient()
	 * @generated
	 * @ordered
	 */
	protected Reference patient;

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
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Reference location;

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
	 * The cached value of the '{@link #getNotes() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> notes;

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
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected Reference parent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getDevice();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.DEVICE__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinition(Reference newDefinition, NotificationChain msgs) {
		Reference oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE__DEFINITION, oldDefinition, newDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(Reference newDefinition) {
		if (newDefinition != definition) {
			NotificationChain msgs = null;
			if (definition != null)
				msgs = ((InternalEObject)definition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE__DEFINITION, null, msgs);
			if (newDefinition != null)
				msgs = ((InternalEObject)newDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE__DEFINITION, null, msgs);
			msgs = basicSetDefinition(newDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE__DEFINITION, newDefinition, newDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeviceUdiCarrier> getUdiCarriers() {
		if (udiCarriers == null) {
			udiCarriers = new EObjectContainmentEList<DeviceUdiCarrier>(DeviceUdiCarrier.class, this, ResourcesPackage.DEVICE__UDI_CARRIER);
		}
		return udiCarriers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(Code newStatus, NotificationChain msgs) {
		Code oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(Code newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getStatusReasons() {
		if (statusReasons == null) {
			statusReasons = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.DEVICE__STATUS_REASON);
		}
		return statusReasons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getDistinctIdentifier() {
		return distinctIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDistinctIdentifier(fhiRCore.dataTypes.String newDistinctIdentifier, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldDistinctIdentifier = distinctIdentifier;
		distinctIdentifier = newDistinctIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE__DISTINCT_IDENTIFIER, oldDistinctIdentifier, newDistinctIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistinctIdentifier(fhiRCore.dataTypes.String newDistinctIdentifier) {
		if (newDistinctIdentifier != distinctIdentifier) {
			NotificationChain msgs = null;
			if (distinctIdentifier != null)
				msgs = ((InternalEObject)distinctIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE__DISTINCT_IDENTIFIER, null, msgs);
			if (newDistinctIdentifier != null)
				msgs = ((InternalEObject)newDistinctIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE__DISTINCT_IDENTIFIER, null, msgs);
			msgs = basicSetDistinctIdentifier(newDistinctIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE__DISTINCT_IDENTIFIER, newDistinctIdentifier, newDistinctIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getManufacturer() {
		return manufacturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManufacturer(fhiRCore.dataTypes.String newManufacturer, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldManufacturer = manufacturer;
		manufacturer = newManufacturer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE__MANUFACTURER, oldManufacturer, newManufacturer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManufacturer(fhiRCore.dataTypes.String newManufacturer) {
		if (newManufacturer != manufacturer) {
			NotificationChain msgs = null;
			if (manufacturer != null)
				msgs = ((InternalEObject)manufacturer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE__MANUFACTURER, null, msgs);
			if (newManufacturer != null)
				msgs = ((InternalEObject)newManufacturer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE__MANUFACTURER, null, msgs);
			msgs = basicSetManufacturer(newManufacturer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE__MANUFACTURER, newManufacturer, newManufacturer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getManufactureDate() {
		return manufactureDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManufactureDate(DateTime newManufactureDate, NotificationChain msgs) {
		DateTime oldManufactureDate = manufactureDate;
		manufactureDate = newManufactureDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE__MANUFACTURE_DATE, oldManufactureDate, newManufactureDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManufactureDate(DateTime newManufactureDate) {
		if (newManufactureDate != manufactureDate) {
			NotificationChain msgs = null;
			if (manufactureDate != null)
				msgs = ((InternalEObject)manufactureDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE__MANUFACTURE_DATE, null, msgs);
			if (newManufactureDate != null)
				msgs = ((InternalEObject)newManufactureDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE__MANUFACTURE_DATE, null, msgs);
			msgs = basicSetManufactureDate(newManufactureDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE__MANUFACTURE_DATE, newManufactureDate, newManufactureDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getExpirationDate() {
		return expirationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpirationDate(DateTime newExpirationDate, NotificationChain msgs) {
		DateTime oldExpirationDate = expirationDate;
		expirationDate = newExpirationDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE__EXPIRATION_DATE, oldExpirationDate, newExpirationDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpirationDate(DateTime newExpirationDate) {
		if (newExpirationDate != expirationDate) {
			NotificationChain msgs = null;
			if (expirationDate != null)
				msgs = ((InternalEObject)expirationDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE__EXPIRATION_DATE, null, msgs);
			if (newExpirationDate != null)
				msgs = ((InternalEObject)newExpirationDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE__EXPIRATION_DATE, null, msgs);
			msgs = basicSetExpirationDate(newExpirationDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE__EXPIRATION_DATE, newExpirationDate, newExpirationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getLotNumber() {
		return lotNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLotNumber(fhiRCore.dataTypes.String newLotNumber, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldLotNumber = lotNumber;
		lotNumber = newLotNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE__LOT_NUMBER, oldLotNumber, newLotNumber);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLotNumber(fhiRCore.dataTypes.String newLotNumber) {
		if (newLotNumber != lotNumber) {
			NotificationChain msgs = null;
			if (lotNumber != null)
				msgs = ((InternalEObject)lotNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE__LOT_NUMBER, null, msgs);
			if (newLotNumber != null)
				msgs = ((InternalEObject)newLotNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE__LOT_NUMBER, null, msgs);
			msgs = basicSetLotNumber(newLotNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE__LOT_NUMBER, newLotNumber, newLotNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSerialNumber(fhiRCore.dataTypes.String newSerialNumber, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldSerialNumber = serialNumber;
		serialNumber = newSerialNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE__SERIAL_NUMBER, oldSerialNumber, newSerialNumber);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSerialNumber(fhiRCore.dataTypes.String newSerialNumber) {
		if (newSerialNumber != serialNumber) {
			NotificationChain msgs = null;
			if (serialNumber != null)
				msgs = ((InternalEObject)serialNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE__SERIAL_NUMBER, null, msgs);
			if (newSerialNumber != null)
				msgs = ((InternalEObject)newSerialNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE__SERIAL_NUMBER, null, msgs);
			msgs = basicSetSerialNumber(newSerialNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE__SERIAL_NUMBER, newSerialNumber, newSerialNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeviceDeviceName> getDeviceNames() {
		if (deviceNames == null) {
			deviceNames = new EObjectContainmentEList<DeviceDeviceName>(DeviceDeviceName.class, this, ResourcesPackage.DEVICE__DEVICE_NAME);
		}
		return deviceNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getModelNumber() {
		return modelNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelNumber(fhiRCore.dataTypes.String newModelNumber, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldModelNumber = modelNumber;
		modelNumber = newModelNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE__MODEL_NUMBER, oldModelNumber, newModelNumber);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelNumber(fhiRCore.dataTypes.String newModelNumber) {
		if (newModelNumber != modelNumber) {
			NotificationChain msgs = null;
			if (modelNumber != null)
				msgs = ((InternalEObject)modelNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE__MODEL_NUMBER, null, msgs);
			if (newModelNumber != null)
				msgs = ((InternalEObject)newModelNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE__MODEL_NUMBER, null, msgs);
			msgs = basicSetModelNumber(newModelNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE__MODEL_NUMBER, newModelNumber, newModelNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getPartNumber() {
		return partNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPartNumber(fhiRCore.dataTypes.String newPartNumber, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldPartNumber = partNumber;
		partNumber = newPartNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE__PART_NUMBER, oldPartNumber, newPartNumber);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartNumber(fhiRCore.dataTypes.String newPartNumber) {
		if (newPartNumber != partNumber) {
			NotificationChain msgs = null;
			if (partNumber != null)
				msgs = ((InternalEObject)partNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE__PART_NUMBER, null, msgs);
			if (newPartNumber != null)
				msgs = ((InternalEObject)newPartNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE__PART_NUMBER, null, msgs);
			msgs = basicSetPartNumber(newPartNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE__PART_NUMBER, newPartNumber, newPartNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeviceSpecialization> getSpecializations() {
		if (specializations == null) {
			specializations = new EObjectContainmentEList<DeviceSpecialization>(DeviceSpecialization.class, this, ResourcesPackage.DEVICE__SPECIALIZATION);
		}
		return specializations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeviceVersion> getVersions() {
		if (versions == null) {
			versions = new EObjectContainmentEList<DeviceVersion>(DeviceVersion.class, this, ResourcesPackage.DEVICE__VERSION);
		}
		return versions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeviceProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<DeviceProperty>(DeviceProperty.class, this, ResourcesPackage.DEVICE__PROPERTY);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getPatient() {
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatient(Reference newPatient, NotificationChain msgs) {
		Reference oldPatient = patient;
		patient = newPatient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE__PATIENT, oldPatient, newPatient);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatient(Reference newPatient) {
		if (newPatient != patient) {
			NotificationChain msgs = null;
			if (patient != null)
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE__PATIENT, newPatient, newPatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE__OWNER, oldOwner, newOwner);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(Reference newOwner) {
		if (newOwner != owner) {
			NotificationChain msgs = null;
			if (owner != null)
				msgs = ((InternalEObject)owner).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE__OWNER, null, msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE__OWNER, null, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactPoint> getContacts() {
		if (contacts == null) {
			contacts = new EObjectContainmentEList<ContactPoint>(ContactPoint.class, this, ResourcesPackage.DEVICE__CONTACT);
		}
		return contacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Reference newLocation, NotificationChain msgs) {
		Reference oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE__LOCATION, oldLocation, newLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Reference newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE__URL, oldUrl, newUrl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(Uri newUrl) {
		if (newUrl != url) {
			NotificationChain msgs = null;
			if (url != null)
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE__URL, newUrl, newUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNotes() {
		if (notes == null) {
			notes = new EObjectContainmentEList<Annotation>(Annotation.class, this, ResourcesPackage.DEVICE__NOTE);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getSafeties() {
		if (safeties == null) {
			safeties = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.DEVICE__SAFETY);
		}
		return safeties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Reference newParent, NotificationChain msgs) {
		Reference oldParent = parent;
		parent = newParent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE__PARENT, oldParent, newParent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Reference newParent) {
		if (newParent != parent) {
			NotificationChain msgs = null;
			if (parent != null)
				msgs = ((InternalEObject)parent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE__PARENT, null, msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE__PARENT, null, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.DEVICE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DEVICE__DEFINITION:
				return basicSetDefinition(null, msgs);
			case ResourcesPackage.DEVICE__UDI_CARRIER:
				return ((InternalEList<?>)getUdiCarriers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DEVICE__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.DEVICE__STATUS_REASON:
				return ((InternalEList<?>)getStatusReasons()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DEVICE__DISTINCT_IDENTIFIER:
				return basicSetDistinctIdentifier(null, msgs);
			case ResourcesPackage.DEVICE__MANUFACTURER:
				return basicSetManufacturer(null, msgs);
			case ResourcesPackage.DEVICE__MANUFACTURE_DATE:
				return basicSetManufactureDate(null, msgs);
			case ResourcesPackage.DEVICE__EXPIRATION_DATE:
				return basicSetExpirationDate(null, msgs);
			case ResourcesPackage.DEVICE__LOT_NUMBER:
				return basicSetLotNumber(null, msgs);
			case ResourcesPackage.DEVICE__SERIAL_NUMBER:
				return basicSetSerialNumber(null, msgs);
			case ResourcesPackage.DEVICE__DEVICE_NAME:
				return ((InternalEList<?>)getDeviceNames()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DEVICE__MODEL_NUMBER:
				return basicSetModelNumber(null, msgs);
			case ResourcesPackage.DEVICE__PART_NUMBER:
				return basicSetPartNumber(null, msgs);
			case ResourcesPackage.DEVICE__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.DEVICE__SPECIALIZATION:
				return ((InternalEList<?>)getSpecializations()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DEVICE__VERSION:
				return ((InternalEList<?>)getVersions()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DEVICE__PROPERTY:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DEVICE__PATIENT:
				return basicSetPatient(null, msgs);
			case ResourcesPackage.DEVICE__OWNER:
				return basicSetOwner(null, msgs);
			case ResourcesPackage.DEVICE__CONTACT:
				return ((InternalEList<?>)getContacts()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DEVICE__LOCATION:
				return basicSetLocation(null, msgs);
			case ResourcesPackage.DEVICE__URL:
				return basicSetUrl(null, msgs);
			case ResourcesPackage.DEVICE__NOTE:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DEVICE__SAFETY:
				return ((InternalEList<?>)getSafeties()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DEVICE__PARENT:
				return basicSetParent(null, msgs);
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
			case ResourcesPackage.DEVICE__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.DEVICE__DEFINITION:
				return getDefinition();
			case ResourcesPackage.DEVICE__UDI_CARRIER:
				return getUdiCarriers();
			case ResourcesPackage.DEVICE__STATUS:
				return getStatus();
			case ResourcesPackage.DEVICE__STATUS_REASON:
				return getStatusReasons();
			case ResourcesPackage.DEVICE__DISTINCT_IDENTIFIER:
				return getDistinctIdentifier();
			case ResourcesPackage.DEVICE__MANUFACTURER:
				return getManufacturer();
			case ResourcesPackage.DEVICE__MANUFACTURE_DATE:
				return getManufactureDate();
			case ResourcesPackage.DEVICE__EXPIRATION_DATE:
				return getExpirationDate();
			case ResourcesPackage.DEVICE__LOT_NUMBER:
				return getLotNumber();
			case ResourcesPackage.DEVICE__SERIAL_NUMBER:
				return getSerialNumber();
			case ResourcesPackage.DEVICE__DEVICE_NAME:
				return getDeviceNames();
			case ResourcesPackage.DEVICE__MODEL_NUMBER:
				return getModelNumber();
			case ResourcesPackage.DEVICE__PART_NUMBER:
				return getPartNumber();
			case ResourcesPackage.DEVICE__TYPE:
				return getType();
			case ResourcesPackage.DEVICE__SPECIALIZATION:
				return getSpecializations();
			case ResourcesPackage.DEVICE__VERSION:
				return getVersions();
			case ResourcesPackage.DEVICE__PROPERTY:
				return getProperties();
			case ResourcesPackage.DEVICE__PATIENT:
				return getPatient();
			case ResourcesPackage.DEVICE__OWNER:
				return getOwner();
			case ResourcesPackage.DEVICE__CONTACT:
				return getContacts();
			case ResourcesPackage.DEVICE__LOCATION:
				return getLocation();
			case ResourcesPackage.DEVICE__URL:
				return getUrl();
			case ResourcesPackage.DEVICE__NOTE:
				return getNotes();
			case ResourcesPackage.DEVICE__SAFETY:
				return getSafeties();
			case ResourcesPackage.DEVICE__PARENT:
				return getParent();
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
			case ResourcesPackage.DEVICE__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.DEVICE__DEFINITION:
				setDefinition((Reference)newValue);
				return;
			case ResourcesPackage.DEVICE__UDI_CARRIER:
				getUdiCarriers().clear();
				getUdiCarriers().addAll((Collection<? extends DeviceUdiCarrier>)newValue);
				return;
			case ResourcesPackage.DEVICE__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.DEVICE__STATUS_REASON:
				getStatusReasons().clear();
				getStatusReasons().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.DEVICE__DISTINCT_IDENTIFIER:
				setDistinctIdentifier((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.DEVICE__MANUFACTURER:
				setManufacturer((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.DEVICE__MANUFACTURE_DATE:
				setManufactureDate((DateTime)newValue);
				return;
			case ResourcesPackage.DEVICE__EXPIRATION_DATE:
				setExpirationDate((DateTime)newValue);
				return;
			case ResourcesPackage.DEVICE__LOT_NUMBER:
				setLotNumber((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.DEVICE__SERIAL_NUMBER:
				setSerialNumber((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.DEVICE__DEVICE_NAME:
				getDeviceNames().clear();
				getDeviceNames().addAll((Collection<? extends DeviceDeviceName>)newValue);
				return;
			case ResourcesPackage.DEVICE__MODEL_NUMBER:
				setModelNumber((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.DEVICE__PART_NUMBER:
				setPartNumber((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.DEVICE__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.DEVICE__SPECIALIZATION:
				getSpecializations().clear();
				getSpecializations().addAll((Collection<? extends DeviceSpecialization>)newValue);
				return;
			case ResourcesPackage.DEVICE__VERSION:
				getVersions().clear();
				getVersions().addAll((Collection<? extends DeviceVersion>)newValue);
				return;
			case ResourcesPackage.DEVICE__PROPERTY:
				getProperties().clear();
				getProperties().addAll((Collection<? extends DeviceProperty>)newValue);
				return;
			case ResourcesPackage.DEVICE__PATIENT:
				setPatient((Reference)newValue);
				return;
			case ResourcesPackage.DEVICE__OWNER:
				setOwner((Reference)newValue);
				return;
			case ResourcesPackage.DEVICE__CONTACT:
				getContacts().clear();
				getContacts().addAll((Collection<? extends ContactPoint>)newValue);
				return;
			case ResourcesPackage.DEVICE__LOCATION:
				setLocation((Reference)newValue);
				return;
			case ResourcesPackage.DEVICE__URL:
				setUrl((Uri)newValue);
				return;
			case ResourcesPackage.DEVICE__NOTE:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Annotation>)newValue);
				return;
			case ResourcesPackage.DEVICE__SAFETY:
				getSafeties().clear();
				getSafeties().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.DEVICE__PARENT:
				setParent((Reference)newValue);
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
			case ResourcesPackage.DEVICE__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.DEVICE__DEFINITION:
				setDefinition((Reference)null);
				return;
			case ResourcesPackage.DEVICE__UDI_CARRIER:
				getUdiCarriers().clear();
				return;
			case ResourcesPackage.DEVICE__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.DEVICE__STATUS_REASON:
				getStatusReasons().clear();
				return;
			case ResourcesPackage.DEVICE__DISTINCT_IDENTIFIER:
				setDistinctIdentifier((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.DEVICE__MANUFACTURER:
				setManufacturer((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.DEVICE__MANUFACTURE_DATE:
				setManufactureDate((DateTime)null);
				return;
			case ResourcesPackage.DEVICE__EXPIRATION_DATE:
				setExpirationDate((DateTime)null);
				return;
			case ResourcesPackage.DEVICE__LOT_NUMBER:
				setLotNumber((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.DEVICE__SERIAL_NUMBER:
				setSerialNumber((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.DEVICE__DEVICE_NAME:
				getDeviceNames().clear();
				return;
			case ResourcesPackage.DEVICE__MODEL_NUMBER:
				setModelNumber((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.DEVICE__PART_NUMBER:
				setPartNumber((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.DEVICE__TYPE:
				setType((CodeableConcept)null);
				return;
			case ResourcesPackage.DEVICE__SPECIALIZATION:
				getSpecializations().clear();
				return;
			case ResourcesPackage.DEVICE__VERSION:
				getVersions().clear();
				return;
			case ResourcesPackage.DEVICE__PROPERTY:
				getProperties().clear();
				return;
			case ResourcesPackage.DEVICE__PATIENT:
				setPatient((Reference)null);
				return;
			case ResourcesPackage.DEVICE__OWNER:
				setOwner((Reference)null);
				return;
			case ResourcesPackage.DEVICE__CONTACT:
				getContacts().clear();
				return;
			case ResourcesPackage.DEVICE__LOCATION:
				setLocation((Reference)null);
				return;
			case ResourcesPackage.DEVICE__URL:
				setUrl((Uri)null);
				return;
			case ResourcesPackage.DEVICE__NOTE:
				getNotes().clear();
				return;
			case ResourcesPackage.DEVICE__SAFETY:
				getSafeties().clear();
				return;
			case ResourcesPackage.DEVICE__PARENT:
				setParent((Reference)null);
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
			case ResourcesPackage.DEVICE__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.DEVICE__DEFINITION:
				return definition != null;
			case ResourcesPackage.DEVICE__UDI_CARRIER:
				return udiCarriers != null && !udiCarriers.isEmpty();
			case ResourcesPackage.DEVICE__STATUS:
				return status != null;
			case ResourcesPackage.DEVICE__STATUS_REASON:
				return statusReasons != null && !statusReasons.isEmpty();
			case ResourcesPackage.DEVICE__DISTINCT_IDENTIFIER:
				return distinctIdentifier != null;
			case ResourcesPackage.DEVICE__MANUFACTURER:
				return manufacturer != null;
			case ResourcesPackage.DEVICE__MANUFACTURE_DATE:
				return manufactureDate != null;
			case ResourcesPackage.DEVICE__EXPIRATION_DATE:
				return expirationDate != null;
			case ResourcesPackage.DEVICE__LOT_NUMBER:
				return lotNumber != null;
			case ResourcesPackage.DEVICE__SERIAL_NUMBER:
				return serialNumber != null;
			case ResourcesPackage.DEVICE__DEVICE_NAME:
				return deviceNames != null && !deviceNames.isEmpty();
			case ResourcesPackage.DEVICE__MODEL_NUMBER:
				return modelNumber != null;
			case ResourcesPackage.DEVICE__PART_NUMBER:
				return partNumber != null;
			case ResourcesPackage.DEVICE__TYPE:
				return type != null;
			case ResourcesPackage.DEVICE__SPECIALIZATION:
				return specializations != null && !specializations.isEmpty();
			case ResourcesPackage.DEVICE__VERSION:
				return versions != null && !versions.isEmpty();
			case ResourcesPackage.DEVICE__PROPERTY:
				return properties != null && !properties.isEmpty();
			case ResourcesPackage.DEVICE__PATIENT:
				return patient != null;
			case ResourcesPackage.DEVICE__OWNER:
				return owner != null;
			case ResourcesPackage.DEVICE__CONTACT:
				return contacts != null && !contacts.isEmpty();
			case ResourcesPackage.DEVICE__LOCATION:
				return location != null;
			case ResourcesPackage.DEVICE__URL:
				return url != null;
			case ResourcesPackage.DEVICE__NOTE:
				return notes != null && !notes.isEmpty();
			case ResourcesPackage.DEVICE__SAFETY:
				return safeties != null && !safeties.isEmpty();
			case ResourcesPackage.DEVICE__PARENT:
				return parent != null;
		}
		return super.eIsSet(featureID);
	}

} //DeviceImpl
