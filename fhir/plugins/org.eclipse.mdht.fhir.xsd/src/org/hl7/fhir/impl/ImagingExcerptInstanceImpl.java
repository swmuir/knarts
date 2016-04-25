/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.ImagingExcerptDicom2;
import org.hl7.fhir.ImagingExcerptInstance;
import org.hl7.fhir.Oid;
import org.hl7.fhir.UnsignedInt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Imaging Excerpt Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ImagingExcerptInstanceImpl#getSopClass <em>Sop Class</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingExcerptInstanceImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingExcerptInstanceImpl#getDicom <em>Dicom</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingExcerptInstanceImpl#getFrameNumbers <em>Frame Numbers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImagingExcerptInstanceImpl extends BackboneElementImpl implements ImagingExcerptInstance {
	/**
	 * The cached value of the '{@link #getSopClass() <em>Sop Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSopClass()
	 * @generated
	 * @ordered
	 */
	protected Oid sopClass;

	/**
	 * The cached value of the '{@link #getUid() <em>Uid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected Oid uid;

	/**
	 * The cached value of the '{@link #getDicom() <em>Dicom</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDicom()
	 * @generated
	 * @ordered
	 */
	protected EList<ImagingExcerptDicom2> dicom;

	/**
	 * The cached value of the '{@link #getFrameNumbers() <em>Frame Numbers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameNumbers()
	 * @generated
	 * @ordered
	 */
	protected EList<UnsignedInt> frameNumbers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImagingExcerptInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getImagingExcerptInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oid getSopClass() {
		return sopClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSopClass(Oid newSopClass, NotificationChain msgs) {
		Oid oldSopClass = sopClass;
		sopClass = newSopClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_EXCERPT_INSTANCE__SOP_CLASS, oldSopClass, newSopClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSopClass(Oid newSopClass) {
		if (newSopClass != sopClass) {
			NotificationChain msgs = null;
			if (sopClass != null)
				msgs = ((InternalEObject)sopClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_EXCERPT_INSTANCE__SOP_CLASS, null, msgs);
			if (newSopClass != null)
				msgs = ((InternalEObject)newSopClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_EXCERPT_INSTANCE__SOP_CLASS, null, msgs);
			msgs = basicSetSopClass(newSopClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_EXCERPT_INSTANCE__SOP_CLASS, newSopClass, newSopClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oid getUid() {
		return uid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUid(Oid newUid, NotificationChain msgs) {
		Oid oldUid = uid;
		uid = newUid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_EXCERPT_INSTANCE__UID, oldUid, newUid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUid(Oid newUid) {
		if (newUid != uid) {
			NotificationChain msgs = null;
			if (uid != null)
				msgs = ((InternalEObject)uid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_EXCERPT_INSTANCE__UID, null, msgs);
			if (newUid != null)
				msgs = ((InternalEObject)newUid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_EXCERPT_INSTANCE__UID, null, msgs);
			msgs = basicSetUid(newUid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_EXCERPT_INSTANCE__UID, newUid, newUid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImagingExcerptDicom2> getDicom() {
		if (dicom == null) {
			dicom = new EObjectContainmentEList<ImagingExcerptDicom2>(ImagingExcerptDicom2.class, this, FhirPackage.IMAGING_EXCERPT_INSTANCE__DICOM);
		}
		return dicom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnsignedInt> getFrameNumbers() {
		if (frameNumbers == null) {
			frameNumbers = new EObjectContainmentEList<UnsignedInt>(UnsignedInt.class, this, FhirPackage.IMAGING_EXCERPT_INSTANCE__FRAME_NUMBERS);
		}
		return frameNumbers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.IMAGING_EXCERPT_INSTANCE__SOP_CLASS:
				return basicSetSopClass(null, msgs);
			case FhirPackage.IMAGING_EXCERPT_INSTANCE__UID:
				return basicSetUid(null, msgs);
			case FhirPackage.IMAGING_EXCERPT_INSTANCE__DICOM:
				return ((InternalEList<?>)getDicom()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMAGING_EXCERPT_INSTANCE__FRAME_NUMBERS:
				return ((InternalEList<?>)getFrameNumbers()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.IMAGING_EXCERPT_INSTANCE__SOP_CLASS:
				return getSopClass();
			case FhirPackage.IMAGING_EXCERPT_INSTANCE__UID:
				return getUid();
			case FhirPackage.IMAGING_EXCERPT_INSTANCE__DICOM:
				return getDicom();
			case FhirPackage.IMAGING_EXCERPT_INSTANCE__FRAME_NUMBERS:
				return getFrameNumbers();
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
			case FhirPackage.IMAGING_EXCERPT_INSTANCE__SOP_CLASS:
				setSopClass((Oid)newValue);
				return;
			case FhirPackage.IMAGING_EXCERPT_INSTANCE__UID:
				setUid((Oid)newValue);
				return;
			case FhirPackage.IMAGING_EXCERPT_INSTANCE__DICOM:
				getDicom().clear();
				getDicom().addAll((Collection<? extends ImagingExcerptDicom2>)newValue);
				return;
			case FhirPackage.IMAGING_EXCERPT_INSTANCE__FRAME_NUMBERS:
				getFrameNumbers().clear();
				getFrameNumbers().addAll((Collection<? extends UnsignedInt>)newValue);
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
			case FhirPackage.IMAGING_EXCERPT_INSTANCE__SOP_CLASS:
				setSopClass((Oid)null);
				return;
			case FhirPackage.IMAGING_EXCERPT_INSTANCE__UID:
				setUid((Oid)null);
				return;
			case FhirPackage.IMAGING_EXCERPT_INSTANCE__DICOM:
				getDicom().clear();
				return;
			case FhirPackage.IMAGING_EXCERPT_INSTANCE__FRAME_NUMBERS:
				getFrameNumbers().clear();
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
			case FhirPackage.IMAGING_EXCERPT_INSTANCE__SOP_CLASS:
				return sopClass != null;
			case FhirPackage.IMAGING_EXCERPT_INSTANCE__UID:
				return uid != null;
			case FhirPackage.IMAGING_EXCERPT_INSTANCE__DICOM:
				return dicom != null && !dicom.isEmpty();
			case FhirPackage.IMAGING_EXCERPT_INSTANCE__FRAME_NUMBERS:
				return frameNumbers != null && !frameNumbers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImagingExcerptInstanceImpl
