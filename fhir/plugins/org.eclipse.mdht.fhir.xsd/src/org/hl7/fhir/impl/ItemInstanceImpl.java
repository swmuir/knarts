/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.ItemInstance;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ItemInstanceImpl#getCount <em>Count</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ItemInstanceImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ItemInstanceImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ItemInstanceImpl#getManufactureDate <em>Manufacture Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ItemInstanceImpl#getExpiryDate <em>Expiry Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ItemInstanceImpl#getCurrentSWVersion <em>Current SW Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ItemInstanceImpl#getLotNumber <em>Lot Number</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ItemInstanceImpl#getSerialNumber <em>Serial Number</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ItemInstanceImpl#getCarrierAIDC <em>Carrier AIDC</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ItemInstanceImpl#getCarrierHRF <em>Carrier HRF</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemInstanceImpl extends DomainResourceImpl implements ItemInstance {
	/**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Integer count;

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
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected Reference subject;

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
	 * The cached value of the '{@link #getExpiryDate() <em>Expiry Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiryDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime expiryDate;

	/**
	 * The cached value of the '{@link #getCurrentSWVersion() <em>Current SW Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentSWVersion()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String currentSWVersion;

	/**
	 * The cached value of the '{@link #getLotNumber() <em>Lot Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLotNumber()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String lotNumber;

	/**
	 * The cached value of the '{@link #getSerialNumber() <em>Serial Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerialNumber()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String serialNumber;

	/**
	 * The cached value of the '{@link #getCarrierAIDC() <em>Carrier AIDC</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierAIDC()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String carrierAIDC;

	/**
	 * The cached value of the '{@link #getCarrierHRF() <em>Carrier HRF</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierHRF()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String carrierHRF;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getItemInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Integer getCount() {
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCount(org.hl7.fhir.Integer newCount, NotificationChain msgs) {
		org.hl7.fhir.Integer oldCount = count;
		count = newCount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ITEM_INSTANCE__COUNT, oldCount, newCount);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCount(org.hl7.fhir.Integer newCount) {
		if (newCount != count) {
			NotificationChain msgs = null;
			if (count != null)
				msgs = ((InternalEObject)count).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ITEM_INSTANCE__COUNT, null, msgs);
			if (newCount != null)
				msgs = ((InternalEObject)newCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ITEM_INSTANCE__COUNT, null, msgs);
			msgs = basicSetCount(newCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ITEM_INSTANCE__COUNT, newCount, newCount));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ITEM_INSTANCE__LOCATION, oldLocation, newLocation);
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
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ITEM_INSTANCE__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ITEM_INSTANCE__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ITEM_INSTANCE__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubject(Reference newSubject, NotificationChain msgs) {
		Reference oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ITEM_INSTANCE__SUBJECT, oldSubject, newSubject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(Reference newSubject) {
		if (newSubject != subject) {
			NotificationChain msgs = null;
			if (subject != null)
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ITEM_INSTANCE__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ITEM_INSTANCE__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ITEM_INSTANCE__SUBJECT, newSubject, newSubject));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ITEM_INSTANCE__MANUFACTURE_DATE, oldManufactureDate, newManufactureDate);
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
				msgs = ((InternalEObject)manufactureDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ITEM_INSTANCE__MANUFACTURE_DATE, null, msgs);
			if (newManufactureDate != null)
				msgs = ((InternalEObject)newManufactureDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ITEM_INSTANCE__MANUFACTURE_DATE, null, msgs);
			msgs = basicSetManufactureDate(newManufactureDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ITEM_INSTANCE__MANUFACTURE_DATE, newManufactureDate, newManufactureDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getExpiryDate() {
		return expiryDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpiryDate(DateTime newExpiryDate, NotificationChain msgs) {
		DateTime oldExpiryDate = expiryDate;
		expiryDate = newExpiryDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ITEM_INSTANCE__EXPIRY_DATE, oldExpiryDate, newExpiryDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpiryDate(DateTime newExpiryDate) {
		if (newExpiryDate != expiryDate) {
			NotificationChain msgs = null;
			if (expiryDate != null)
				msgs = ((InternalEObject)expiryDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ITEM_INSTANCE__EXPIRY_DATE, null, msgs);
			if (newExpiryDate != null)
				msgs = ((InternalEObject)newExpiryDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ITEM_INSTANCE__EXPIRY_DATE, null, msgs);
			msgs = basicSetExpiryDate(newExpiryDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ITEM_INSTANCE__EXPIRY_DATE, newExpiryDate, newExpiryDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getCurrentSWVersion() {
		return currentSWVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrentSWVersion(org.hl7.fhir.String newCurrentSWVersion, NotificationChain msgs) {
		org.hl7.fhir.String oldCurrentSWVersion = currentSWVersion;
		currentSWVersion = newCurrentSWVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ITEM_INSTANCE__CURRENT_SW_VERSION, oldCurrentSWVersion, newCurrentSWVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentSWVersion(org.hl7.fhir.String newCurrentSWVersion) {
		if (newCurrentSWVersion != currentSWVersion) {
			NotificationChain msgs = null;
			if (currentSWVersion != null)
				msgs = ((InternalEObject)currentSWVersion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ITEM_INSTANCE__CURRENT_SW_VERSION, null, msgs);
			if (newCurrentSWVersion != null)
				msgs = ((InternalEObject)newCurrentSWVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ITEM_INSTANCE__CURRENT_SW_VERSION, null, msgs);
			msgs = basicSetCurrentSWVersion(newCurrentSWVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ITEM_INSTANCE__CURRENT_SW_VERSION, newCurrentSWVersion, newCurrentSWVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getLotNumber() {
		return lotNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLotNumber(org.hl7.fhir.String newLotNumber, NotificationChain msgs) {
		org.hl7.fhir.String oldLotNumber = lotNumber;
		lotNumber = newLotNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ITEM_INSTANCE__LOT_NUMBER, oldLotNumber, newLotNumber);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLotNumber(org.hl7.fhir.String newLotNumber) {
		if (newLotNumber != lotNumber) {
			NotificationChain msgs = null;
			if (lotNumber != null)
				msgs = ((InternalEObject)lotNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ITEM_INSTANCE__LOT_NUMBER, null, msgs);
			if (newLotNumber != null)
				msgs = ((InternalEObject)newLotNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ITEM_INSTANCE__LOT_NUMBER, null, msgs);
			msgs = basicSetLotNumber(newLotNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ITEM_INSTANCE__LOT_NUMBER, newLotNumber, newLotNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getSerialNumber() {
		return serialNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSerialNumber(org.hl7.fhir.String newSerialNumber, NotificationChain msgs) {
		org.hl7.fhir.String oldSerialNumber = serialNumber;
		serialNumber = newSerialNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ITEM_INSTANCE__SERIAL_NUMBER, oldSerialNumber, newSerialNumber);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSerialNumber(org.hl7.fhir.String newSerialNumber) {
		if (newSerialNumber != serialNumber) {
			NotificationChain msgs = null;
			if (serialNumber != null)
				msgs = ((InternalEObject)serialNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ITEM_INSTANCE__SERIAL_NUMBER, null, msgs);
			if (newSerialNumber != null)
				msgs = ((InternalEObject)newSerialNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ITEM_INSTANCE__SERIAL_NUMBER, null, msgs);
			msgs = basicSetSerialNumber(newSerialNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ITEM_INSTANCE__SERIAL_NUMBER, newSerialNumber, newSerialNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getCarrierAIDC() {
		return carrierAIDC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCarrierAIDC(org.hl7.fhir.String newCarrierAIDC, NotificationChain msgs) {
		org.hl7.fhir.String oldCarrierAIDC = carrierAIDC;
		carrierAIDC = newCarrierAIDC;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ITEM_INSTANCE__CARRIER_AIDC, oldCarrierAIDC, newCarrierAIDC);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCarrierAIDC(org.hl7.fhir.String newCarrierAIDC) {
		if (newCarrierAIDC != carrierAIDC) {
			NotificationChain msgs = null;
			if (carrierAIDC != null)
				msgs = ((InternalEObject)carrierAIDC).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ITEM_INSTANCE__CARRIER_AIDC, null, msgs);
			if (newCarrierAIDC != null)
				msgs = ((InternalEObject)newCarrierAIDC).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ITEM_INSTANCE__CARRIER_AIDC, null, msgs);
			msgs = basicSetCarrierAIDC(newCarrierAIDC, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ITEM_INSTANCE__CARRIER_AIDC, newCarrierAIDC, newCarrierAIDC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getCarrierHRF() {
		return carrierHRF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCarrierHRF(org.hl7.fhir.String newCarrierHRF, NotificationChain msgs) {
		org.hl7.fhir.String oldCarrierHRF = carrierHRF;
		carrierHRF = newCarrierHRF;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ITEM_INSTANCE__CARRIER_HRF, oldCarrierHRF, newCarrierHRF);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCarrierHRF(org.hl7.fhir.String newCarrierHRF) {
		if (newCarrierHRF != carrierHRF) {
			NotificationChain msgs = null;
			if (carrierHRF != null)
				msgs = ((InternalEObject)carrierHRF).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ITEM_INSTANCE__CARRIER_HRF, null, msgs);
			if (newCarrierHRF != null)
				msgs = ((InternalEObject)newCarrierHRF).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ITEM_INSTANCE__CARRIER_HRF, null, msgs);
			msgs = basicSetCarrierHRF(newCarrierHRF, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ITEM_INSTANCE__CARRIER_HRF, newCarrierHRF, newCarrierHRF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.ITEM_INSTANCE__COUNT:
				return basicSetCount(null, msgs);
			case FhirPackage.ITEM_INSTANCE__LOCATION:
				return basicSetLocation(null, msgs);
			case FhirPackage.ITEM_INSTANCE__SUBJECT:
				return basicSetSubject(null, msgs);
			case FhirPackage.ITEM_INSTANCE__MANUFACTURE_DATE:
				return basicSetManufactureDate(null, msgs);
			case FhirPackage.ITEM_INSTANCE__EXPIRY_DATE:
				return basicSetExpiryDate(null, msgs);
			case FhirPackage.ITEM_INSTANCE__CURRENT_SW_VERSION:
				return basicSetCurrentSWVersion(null, msgs);
			case FhirPackage.ITEM_INSTANCE__LOT_NUMBER:
				return basicSetLotNumber(null, msgs);
			case FhirPackage.ITEM_INSTANCE__SERIAL_NUMBER:
				return basicSetSerialNumber(null, msgs);
			case FhirPackage.ITEM_INSTANCE__CARRIER_AIDC:
				return basicSetCarrierAIDC(null, msgs);
			case FhirPackage.ITEM_INSTANCE__CARRIER_HRF:
				return basicSetCarrierHRF(null, msgs);
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
			case FhirPackage.ITEM_INSTANCE__COUNT:
				return getCount();
			case FhirPackage.ITEM_INSTANCE__LOCATION:
				return getLocation();
			case FhirPackage.ITEM_INSTANCE__SUBJECT:
				return getSubject();
			case FhirPackage.ITEM_INSTANCE__MANUFACTURE_DATE:
				return getManufactureDate();
			case FhirPackage.ITEM_INSTANCE__EXPIRY_DATE:
				return getExpiryDate();
			case FhirPackage.ITEM_INSTANCE__CURRENT_SW_VERSION:
				return getCurrentSWVersion();
			case FhirPackage.ITEM_INSTANCE__LOT_NUMBER:
				return getLotNumber();
			case FhirPackage.ITEM_INSTANCE__SERIAL_NUMBER:
				return getSerialNumber();
			case FhirPackage.ITEM_INSTANCE__CARRIER_AIDC:
				return getCarrierAIDC();
			case FhirPackage.ITEM_INSTANCE__CARRIER_HRF:
				return getCarrierHRF();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.ITEM_INSTANCE__COUNT:
				setCount((org.hl7.fhir.Integer)newValue);
				return;
			case FhirPackage.ITEM_INSTANCE__LOCATION:
				setLocation((Reference)newValue);
				return;
			case FhirPackage.ITEM_INSTANCE__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case FhirPackage.ITEM_INSTANCE__MANUFACTURE_DATE:
				setManufactureDate((DateTime)newValue);
				return;
			case FhirPackage.ITEM_INSTANCE__EXPIRY_DATE:
				setExpiryDate((DateTime)newValue);
				return;
			case FhirPackage.ITEM_INSTANCE__CURRENT_SW_VERSION:
				setCurrentSWVersion((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ITEM_INSTANCE__LOT_NUMBER:
				setLotNumber((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ITEM_INSTANCE__SERIAL_NUMBER:
				setSerialNumber((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ITEM_INSTANCE__CARRIER_AIDC:
				setCarrierAIDC((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.ITEM_INSTANCE__CARRIER_HRF:
				setCarrierHRF((org.hl7.fhir.String)newValue);
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
			case FhirPackage.ITEM_INSTANCE__COUNT:
				setCount((org.hl7.fhir.Integer)null);
				return;
			case FhirPackage.ITEM_INSTANCE__LOCATION:
				setLocation((Reference)null);
				return;
			case FhirPackage.ITEM_INSTANCE__SUBJECT:
				setSubject((Reference)null);
				return;
			case FhirPackage.ITEM_INSTANCE__MANUFACTURE_DATE:
				setManufactureDate((DateTime)null);
				return;
			case FhirPackage.ITEM_INSTANCE__EXPIRY_DATE:
				setExpiryDate((DateTime)null);
				return;
			case FhirPackage.ITEM_INSTANCE__CURRENT_SW_VERSION:
				setCurrentSWVersion((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ITEM_INSTANCE__LOT_NUMBER:
				setLotNumber((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ITEM_INSTANCE__SERIAL_NUMBER:
				setSerialNumber((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ITEM_INSTANCE__CARRIER_AIDC:
				setCarrierAIDC((org.hl7.fhir.String)null);
				return;
			case FhirPackage.ITEM_INSTANCE__CARRIER_HRF:
				setCarrierHRF((org.hl7.fhir.String)null);
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
			case FhirPackage.ITEM_INSTANCE__COUNT:
				return count != null;
			case FhirPackage.ITEM_INSTANCE__LOCATION:
				return location != null;
			case FhirPackage.ITEM_INSTANCE__SUBJECT:
				return subject != null;
			case FhirPackage.ITEM_INSTANCE__MANUFACTURE_DATE:
				return manufactureDate != null;
			case FhirPackage.ITEM_INSTANCE__EXPIRY_DATE:
				return expiryDate != null;
			case FhirPackage.ITEM_INSTANCE__CURRENT_SW_VERSION:
				return currentSWVersion != null;
			case FhirPackage.ITEM_INSTANCE__LOT_NUMBER:
				return lotNumber != null;
			case FhirPackage.ITEM_INSTANCE__SERIAL_NUMBER:
				return serialNumber != null;
			case FhirPackage.ITEM_INSTANCE__CARRIER_AIDC:
				return carrierAIDC != null;
			case FhirPackage.ITEM_INSTANCE__CARRIER_HRF:
				return carrierHRF != null;
		}
		return super.eIsSet(featureID);
	}

} //ItemInstanceImpl
