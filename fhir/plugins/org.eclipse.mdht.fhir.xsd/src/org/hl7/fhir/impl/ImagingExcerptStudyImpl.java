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
import org.hl7.fhir.ImagingExcerptDicom;
import org.hl7.fhir.ImagingExcerptSeries;
import org.hl7.fhir.ImagingExcerptStudy;
import org.hl7.fhir.ImagingExcerptViewable;
import org.hl7.fhir.Oid;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Imaging Excerpt Study</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ImagingExcerptStudyImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingExcerptStudyImpl#getImagingStudy <em>Imaging Study</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingExcerptStudyImpl#getDicom <em>Dicom</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingExcerptStudyImpl#getViewable <em>Viewable</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImagingExcerptStudyImpl#getSeries <em>Series</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImagingExcerptStudyImpl extends BackboneElementImpl implements ImagingExcerptStudy {
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
	 * The cached value of the '{@link #getImagingStudy() <em>Imaging Study</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagingStudy()
	 * @generated
	 * @ordered
	 */
	protected Reference imagingStudy;

	/**
	 * The cached value of the '{@link #getDicom() <em>Dicom</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDicom()
	 * @generated
	 * @ordered
	 */
	protected EList<ImagingExcerptDicom> dicom;

	/**
	 * The cached value of the '{@link #getViewable() <em>Viewable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewable()
	 * @generated
	 * @ordered
	 */
	protected EList<ImagingExcerptViewable> viewable;

	/**
	 * The cached value of the '{@link #getSeries() <em>Series</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeries()
	 * @generated
	 * @ordered
	 */
	protected EList<ImagingExcerptSeries> series;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImagingExcerptStudyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getImagingExcerptStudy();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_EXCERPT_STUDY__UID, oldUid, newUid);
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
				msgs = ((InternalEObject)uid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_EXCERPT_STUDY__UID, null, msgs);
			if (newUid != null)
				msgs = ((InternalEObject)newUid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_EXCERPT_STUDY__UID, null, msgs);
			msgs = basicSetUid(newUid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_EXCERPT_STUDY__UID, newUid, newUid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getImagingStudy() {
		return imagingStudy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImagingStudy(Reference newImagingStudy, NotificationChain msgs) {
		Reference oldImagingStudy = imagingStudy;
		imagingStudy = newImagingStudy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_EXCERPT_STUDY__IMAGING_STUDY, oldImagingStudy, newImagingStudy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImagingStudy(Reference newImagingStudy) {
		if (newImagingStudy != imagingStudy) {
			NotificationChain msgs = null;
			if (imagingStudy != null)
				msgs = ((InternalEObject)imagingStudy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_EXCERPT_STUDY__IMAGING_STUDY, null, msgs);
			if (newImagingStudy != null)
				msgs = ((InternalEObject)newImagingStudy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMAGING_EXCERPT_STUDY__IMAGING_STUDY, null, msgs);
			msgs = basicSetImagingStudy(newImagingStudy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMAGING_EXCERPT_STUDY__IMAGING_STUDY, newImagingStudy, newImagingStudy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImagingExcerptDicom> getDicom() {
		if (dicom == null) {
			dicom = new EObjectContainmentEList<ImagingExcerptDicom>(ImagingExcerptDicom.class, this, FhirPackage.IMAGING_EXCERPT_STUDY__DICOM);
		}
		return dicom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImagingExcerptViewable> getViewable() {
		if (viewable == null) {
			viewable = new EObjectContainmentEList<ImagingExcerptViewable>(ImagingExcerptViewable.class, this, FhirPackage.IMAGING_EXCERPT_STUDY__VIEWABLE);
		}
		return viewable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImagingExcerptSeries> getSeries() {
		if (series == null) {
			series = new EObjectContainmentEList<ImagingExcerptSeries>(ImagingExcerptSeries.class, this, FhirPackage.IMAGING_EXCERPT_STUDY__SERIES);
		}
		return series;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.IMAGING_EXCERPT_STUDY__UID:
				return basicSetUid(null, msgs);
			case FhirPackage.IMAGING_EXCERPT_STUDY__IMAGING_STUDY:
				return basicSetImagingStudy(null, msgs);
			case FhirPackage.IMAGING_EXCERPT_STUDY__DICOM:
				return ((InternalEList<?>)getDicom()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMAGING_EXCERPT_STUDY__VIEWABLE:
				return ((InternalEList<?>)getViewable()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMAGING_EXCERPT_STUDY__SERIES:
				return ((InternalEList<?>)getSeries()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.IMAGING_EXCERPT_STUDY__UID:
				return getUid();
			case FhirPackage.IMAGING_EXCERPT_STUDY__IMAGING_STUDY:
				return getImagingStudy();
			case FhirPackage.IMAGING_EXCERPT_STUDY__DICOM:
				return getDicom();
			case FhirPackage.IMAGING_EXCERPT_STUDY__VIEWABLE:
				return getViewable();
			case FhirPackage.IMAGING_EXCERPT_STUDY__SERIES:
				return getSeries();
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
			case FhirPackage.IMAGING_EXCERPT_STUDY__UID:
				setUid((Oid)newValue);
				return;
			case FhirPackage.IMAGING_EXCERPT_STUDY__IMAGING_STUDY:
				setImagingStudy((Reference)newValue);
				return;
			case FhirPackage.IMAGING_EXCERPT_STUDY__DICOM:
				getDicom().clear();
				getDicom().addAll((Collection<? extends ImagingExcerptDicom>)newValue);
				return;
			case FhirPackage.IMAGING_EXCERPT_STUDY__VIEWABLE:
				getViewable().clear();
				getViewable().addAll((Collection<? extends ImagingExcerptViewable>)newValue);
				return;
			case FhirPackage.IMAGING_EXCERPT_STUDY__SERIES:
				getSeries().clear();
				getSeries().addAll((Collection<? extends ImagingExcerptSeries>)newValue);
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
			case FhirPackage.IMAGING_EXCERPT_STUDY__UID:
				setUid((Oid)null);
				return;
			case FhirPackage.IMAGING_EXCERPT_STUDY__IMAGING_STUDY:
				setImagingStudy((Reference)null);
				return;
			case FhirPackage.IMAGING_EXCERPT_STUDY__DICOM:
				getDicom().clear();
				return;
			case FhirPackage.IMAGING_EXCERPT_STUDY__VIEWABLE:
				getViewable().clear();
				return;
			case FhirPackage.IMAGING_EXCERPT_STUDY__SERIES:
				getSeries().clear();
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
			case FhirPackage.IMAGING_EXCERPT_STUDY__UID:
				return uid != null;
			case FhirPackage.IMAGING_EXCERPT_STUDY__IMAGING_STUDY:
				return imagingStudy != null;
			case FhirPackage.IMAGING_EXCERPT_STUDY__DICOM:
				return dicom != null && !dicom.isEmpty();
			case FhirPackage.IMAGING_EXCERPT_STUDY__VIEWABLE:
				return viewable != null && !viewable.isEmpty();
			case FhirPackage.IMAGING_EXCERPT_STUDY__SERIES:
				return series != null && !series.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImagingExcerptStudyImpl
