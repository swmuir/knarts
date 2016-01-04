/*******************************************************************************
 * Copyright (c) 2016 David Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David Carlson (Clinical Cloud Solutions, LLC) - initial API and implementation
 *******************************************************************************/
/**
 */
package org.eclipse.mdht.uml.fhir.core.resource.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.uml.fhir.core.datatype.Oid;
import org.eclipse.mdht.uml.fhir.core.datatype.Uri;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.ImagingObjectSelectionStudySeriesInstance;
import org.eclipse.mdht.uml.fhir.core.resource.ImagingObjectSelectionStudySeriesInstanceFrames;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Imaging Object Selection Study Series Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ImagingObjectSelectionStudySeriesInstanceImpl#getSopClass <em>Sop Class</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ImagingObjectSelectionStudySeriesInstanceImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ImagingObjectSelectionStudySeriesInstanceImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ImagingObjectSelectionStudySeriesInstanceImpl#getFrames <em>Frames</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImagingObjectSelectionStudySeriesInstanceImpl extends BackboneElementImpl implements ImagingObjectSelectionStudySeriesInstance {
	/**
	 * The cached value of the '{@link #getSopClass() <em>Sop Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSopClass()
	 * @generated
	 * @ordered
	 */
	protected Oid sopClass;

	/**
	 * The cached value of the '{@link #getUid() <em>Uid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected Oid uid;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected Uri url;

	/**
	 * The cached value of the '{@link #getFrames() <em>Frames</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrames()
	 * @generated
	 * @ordered
	 */
	protected EList<ImagingObjectSelectionStudySeriesInstanceFrames> frames;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImagingObjectSelectionStudySeriesInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getImagingObjectSelectionStudySeriesInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oid getSopClass() {
		if (sopClass != null && sopClass.eIsProxy()) {
			InternalEObject oldSopClass = (InternalEObject)sopClass;
			sopClass = (Oid)eResolveProxy(oldSopClass);
			if (sopClass != oldSopClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY_SERIES_INSTANCE__SOP_CLASS, oldSopClass, sopClass));
			}
		}
		return sopClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oid basicGetSopClass() {
		return sopClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSopClass(Oid newSopClass) {
		Oid oldSopClass = sopClass;
		sopClass = newSopClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY_SERIES_INSTANCE__SOP_CLASS, oldSopClass, sopClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oid getUid() {
		if (uid != null && uid.eIsProxy()) {
			InternalEObject oldUid = (InternalEObject)uid;
			uid = (Oid)eResolveProxy(oldUid);
			if (uid != oldUid) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY_SERIES_INSTANCE__UID, oldUid, uid));
			}
		}
		return uid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Oid basicGetUid() {
		return uid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUid(Oid newUid) {
		Oid oldUid = uid;
		uid = newUid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY_SERIES_INSTANCE__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getUrl() {
		if (url != null && url.eIsProxy()) {
			InternalEObject oldUrl = (InternalEObject)url;
			url = (Uri)eResolveProxy(oldUrl);
			if (url != oldUrl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY_SERIES_INSTANCE__URL, oldUrl, url));
			}
		}
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri basicGetUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(Uri newUrl) {
		Uri oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY_SERIES_INSTANCE__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImagingObjectSelectionStudySeriesInstanceFrames> getFrames() {
		if (frames == null) {
			frames = new EObjectContainmentEList<ImagingObjectSelectionStudySeriesInstanceFrames>(ImagingObjectSelectionStudySeriesInstanceFrames.class, this, FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY_SERIES_INSTANCE__FRAMES);
		}
		return frames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY_SERIES_INSTANCE__FRAMES:
				return ((InternalEList<?>)getFrames()).basicRemove(otherEnd, msgs);
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
			case FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY_SERIES_INSTANCE__SOP_CLASS:
				if (resolve) return getSopClass();
				return basicGetSopClass();
			case FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY_SERIES_INSTANCE__UID:
				if (resolve) return getUid();
				return basicGetUid();
			case FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY_SERIES_INSTANCE__URL:
				if (resolve) return getUrl();
				return basicGetUrl();
			case FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY_SERIES_INSTANCE__FRAMES:
				return getFrames();
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
			case FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY_SERIES_INSTANCE__SOP_CLASS:
				setSopClass((Oid)newValue);
				return;
			case FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY_SERIES_INSTANCE__UID:
				setUid((Oid)newValue);
				return;
			case FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY_SERIES_INSTANCE__URL:
				setUrl((Uri)newValue);
				return;
			case FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY_SERIES_INSTANCE__FRAMES:
				getFrames().clear();
				getFrames().addAll((Collection<? extends ImagingObjectSelectionStudySeriesInstanceFrames>)newValue);
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
			case FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY_SERIES_INSTANCE__SOP_CLASS:
				setSopClass((Oid)null);
				return;
			case FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY_SERIES_INSTANCE__UID:
				setUid((Oid)null);
				return;
			case FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY_SERIES_INSTANCE__URL:
				setUrl((Uri)null);
				return;
			case FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY_SERIES_INSTANCE__FRAMES:
				getFrames().clear();
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
			case FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY_SERIES_INSTANCE__SOP_CLASS:
				return sopClass != null;
			case FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY_SERIES_INSTANCE__UID:
				return uid != null;
			case FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY_SERIES_INSTANCE__URL:
				return url != null;
			case FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY_SERIES_INSTANCE__FRAMES:
				return frames != null && !frames.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImagingObjectSelectionStudySeriesInstanceImpl
