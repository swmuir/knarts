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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.mdht.uml.fhir.core.datatype.UnsignedInt;
import org.eclipse.mdht.uml.fhir.core.datatype.Uri;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.ImagingObjectSelectionStudySeriesInstanceFrames;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Imaging Object Selection Study Series Instance Frames</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ImagingObjectSelectionStudySeriesInstanceFramesImpl#getFrameNumbers <em>Frame Numbers</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ImagingObjectSelectionStudySeriesInstanceFramesImpl#getUrl <em>Url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImagingObjectSelectionStudySeriesInstanceFramesImpl extends BackboneElementImpl implements ImagingObjectSelectionStudySeriesInstanceFrames {
	/**
	 * The cached value of the '{@link #getFrameNumbers() <em>Frame Numbers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameNumbers()
	 * @generated
	 * @ordered
	 */
	protected EList<UnsignedInt> frameNumbers;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImagingObjectSelectionStudySeriesInstanceFramesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getImagingObjectSelectionStudySeriesInstanceFrames();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnsignedInt> getFrameNumbers() {
		if (frameNumbers == null) {
			frameNumbers = new EObjectResolvingEList<UnsignedInt>(UnsignedInt.class, this, FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY_SERIES_INSTANCE_FRAMES__FRAME_NUMBERS);
		}
		return frameNumbers;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY_SERIES_INSTANCE_FRAMES__URL, oldUrl, url));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY_SERIES_INSTANCE_FRAMES__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY_SERIES_INSTANCE_FRAMES__FRAME_NUMBERS:
				return getFrameNumbers();
			case FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY_SERIES_INSTANCE_FRAMES__URL:
				if (resolve) return getUrl();
				return basicGetUrl();
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
			case FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY_SERIES_INSTANCE_FRAMES__FRAME_NUMBERS:
				getFrameNumbers().clear();
				getFrameNumbers().addAll((Collection<? extends UnsignedInt>)newValue);
				return;
			case FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY_SERIES_INSTANCE_FRAMES__URL:
				setUrl((Uri)newValue);
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
			case FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY_SERIES_INSTANCE_FRAMES__FRAME_NUMBERS:
				getFrameNumbers().clear();
				return;
			case FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY_SERIES_INSTANCE_FRAMES__URL:
				setUrl((Uri)null);
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
			case FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY_SERIES_INSTANCE_FRAMES__FRAME_NUMBERS:
				return frameNumbers != null && !frameNumbers.isEmpty();
			case FhirResourcePackage.IMAGING_OBJECT_SELECTION_STUDY_SERIES_INSTANCE_FRAMES__URL:
				return url != null;
		}
		return super.eIsSet(featureID);
	}

} //ImagingObjectSelectionStudySeriesInstanceFramesImpl
