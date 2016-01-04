/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.SequenceChip;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Chip</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SequenceChipImpl#getChipId <em>Chip Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceChipImpl#getManufacturerId <em>Manufacturer Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceChipImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SequenceChipImpl extends BackboneElementImpl implements SequenceChip {
	/**
	 * The cached value of the '{@link #getChipId() <em>Chip Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChipId()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String chipId;

	/**
	 * The cached value of the '{@link #getManufacturerId() <em>Manufacturer Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturerId()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String manufacturerId;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String version;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceChipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSequenceChip();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getChipId() {
		return chipId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChipId(org.hl7.fhir.String newChipId, NotificationChain msgs) {
		org.hl7.fhir.String oldChipId = chipId;
		chipId = newChipId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_CHIP__CHIP_ID, oldChipId, newChipId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChipId(org.hl7.fhir.String newChipId) {
		if (newChipId != chipId) {
			NotificationChain msgs = null;
			if (chipId != null)
				msgs = ((InternalEObject)chipId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_CHIP__CHIP_ID, null, msgs);
			if (newChipId != null)
				msgs = ((InternalEObject)newChipId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_CHIP__CHIP_ID, null, msgs);
			msgs = basicSetChipId(newChipId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_CHIP__CHIP_ID, newChipId, newChipId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getManufacturerId() {
		return manufacturerId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManufacturerId(org.hl7.fhir.String newManufacturerId, NotificationChain msgs) {
		org.hl7.fhir.String oldManufacturerId = manufacturerId;
		manufacturerId = newManufacturerId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_CHIP__MANUFACTURER_ID, oldManufacturerId, newManufacturerId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManufacturerId(org.hl7.fhir.String newManufacturerId) {
		if (newManufacturerId != manufacturerId) {
			NotificationChain msgs = null;
			if (manufacturerId != null)
				msgs = ((InternalEObject)manufacturerId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_CHIP__MANUFACTURER_ID, null, msgs);
			if (newManufacturerId != null)
				msgs = ((InternalEObject)newManufacturerId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_CHIP__MANUFACTURER_ID, null, msgs);
			msgs = basicSetManufacturerId(newManufacturerId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_CHIP__MANUFACTURER_ID, newManufacturerId, newManufacturerId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersion(org.hl7.fhir.String newVersion, NotificationChain msgs) {
		org.hl7.fhir.String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_CHIP__VERSION, oldVersion, newVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(org.hl7.fhir.String newVersion) {
		if (newVersion != version) {
			NotificationChain msgs = null;
			if (version != null)
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_CHIP__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_CHIP__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_CHIP__VERSION, newVersion, newVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SEQUENCE_CHIP__CHIP_ID:
				return basicSetChipId(null, msgs);
			case FhirPackage.SEQUENCE_CHIP__MANUFACTURER_ID:
				return basicSetManufacturerId(null, msgs);
			case FhirPackage.SEQUENCE_CHIP__VERSION:
				return basicSetVersion(null, msgs);
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
			case FhirPackage.SEQUENCE_CHIP__CHIP_ID:
				return getChipId();
			case FhirPackage.SEQUENCE_CHIP__MANUFACTURER_ID:
				return getManufacturerId();
			case FhirPackage.SEQUENCE_CHIP__VERSION:
				return getVersion();
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
			case FhirPackage.SEQUENCE_CHIP__CHIP_ID:
				setChipId((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SEQUENCE_CHIP__MANUFACTURER_ID:
				setManufacturerId((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SEQUENCE_CHIP__VERSION:
				setVersion((org.hl7.fhir.String)newValue);
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
			case FhirPackage.SEQUENCE_CHIP__CHIP_ID:
				setChipId((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SEQUENCE_CHIP__MANUFACTURER_ID:
				setManufacturerId((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SEQUENCE_CHIP__VERSION:
				setVersion((org.hl7.fhir.String)null);
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
			case FhirPackage.SEQUENCE_CHIP__CHIP_ID:
				return chipId != null;
			case FhirPackage.SEQUENCE_CHIP__MANUFACTURER_ID:
				return manufacturerId != null;
			case FhirPackage.SEQUENCE_CHIP__VERSION:
				return version != null;
		}
		return super.eIsSet(featureID);
	}

} //SequenceChipImpl
