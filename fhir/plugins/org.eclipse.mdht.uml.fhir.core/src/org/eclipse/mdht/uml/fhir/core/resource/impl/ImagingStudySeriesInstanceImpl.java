/*******************************************************************************
 * Copyright (c) 2015 David Carlson and others.
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

import org.eclipse.mdht.uml.fhir.core.datatype.Attachment;
import org.eclipse.mdht.uml.fhir.core.datatype.Oid;
import org.eclipse.mdht.uml.fhir.core.datatype.UnsignedInt;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.ImagingStudySeriesInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Imaging Study Series Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ImagingStudySeriesInstanceImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ImagingStudySeriesInstanceImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ImagingStudySeriesInstanceImpl#getSopClass <em>Sop Class</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ImagingStudySeriesInstanceImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ImagingStudySeriesInstanceImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ImagingStudySeriesInstanceImpl#getContents <em>Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImagingStudySeriesInstanceImpl extends BackboneElementImpl implements ImagingStudySeriesInstance {
	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt number;

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
	 * The cached value of the '{@link #getSopClass() <em>Sop Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSopClass()
	 * @generated
	 * @ordered
	 */
	protected Oid sopClass;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String type;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String title;

	/**
	 * The cached value of the '{@link #getContents() <em>Content</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected EList<Attachment> contents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImagingStudySeriesInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getImagingStudySeriesInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt getNumber() {
		if (number != null && number.eIsProxy()) {
			InternalEObject oldNumber = (InternalEObject)number;
			number = (UnsignedInt)eResolveProxy(oldNumber);
			if (number != oldNumber) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.IMAGING_STUDY_SERIES_INSTANCE__NUMBER, oldNumber, number));
			}
		}
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt basicGetNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(UnsignedInt newNumber) {
		UnsignedInt oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.IMAGING_STUDY_SERIES_INSTANCE__NUMBER, oldNumber, number));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.IMAGING_STUDY_SERIES_INSTANCE__UID, oldUid, uid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.IMAGING_STUDY_SERIES_INSTANCE__UID, oldUid, uid));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.IMAGING_STUDY_SERIES_INSTANCE__SOP_CLASS, oldSopClass, sopClass));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.IMAGING_STUDY_SERIES_INSTANCE__SOP_CLASS, oldSopClass, sopClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.IMAGING_STUDY_SERIES_INSTANCE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(org.eclipse.mdht.uml.fhir.core.datatype.String newType) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.IMAGING_STUDY_SERIES_INSTANCE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getTitle() {
		if (title != null && title.eIsProxy()) {
			InternalEObject oldTitle = (InternalEObject)title;
			title = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldTitle);
			if (title != oldTitle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.IMAGING_STUDY_SERIES_INSTANCE__TITLE, oldTitle, title));
			}
		}
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(org.eclipse.mdht.uml.fhir.core.datatype.String newTitle) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.IMAGING_STUDY_SERIES_INSTANCE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attachment> getContents() {
		if (contents == null) {
			contents = new EObjectResolvingEList<Attachment>(Attachment.class, this, FhirResourcePackage.IMAGING_STUDY_SERIES_INSTANCE__CONTENT);
		}
		return contents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirResourcePackage.IMAGING_STUDY_SERIES_INSTANCE__NUMBER:
				if (resolve) return getNumber();
				return basicGetNumber();
			case FhirResourcePackage.IMAGING_STUDY_SERIES_INSTANCE__UID:
				if (resolve) return getUid();
				return basicGetUid();
			case FhirResourcePackage.IMAGING_STUDY_SERIES_INSTANCE__SOP_CLASS:
				if (resolve) return getSopClass();
				return basicGetSopClass();
			case FhirResourcePackage.IMAGING_STUDY_SERIES_INSTANCE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case FhirResourcePackage.IMAGING_STUDY_SERIES_INSTANCE__TITLE:
				if (resolve) return getTitle();
				return basicGetTitle();
			case FhirResourcePackage.IMAGING_STUDY_SERIES_INSTANCE__CONTENT:
				return getContents();
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
			case FhirResourcePackage.IMAGING_STUDY_SERIES_INSTANCE__NUMBER:
				setNumber((UnsignedInt)newValue);
				return;
			case FhirResourcePackage.IMAGING_STUDY_SERIES_INSTANCE__UID:
				setUid((Oid)newValue);
				return;
			case FhirResourcePackage.IMAGING_STUDY_SERIES_INSTANCE__SOP_CLASS:
				setSopClass((Oid)newValue);
				return;
			case FhirResourcePackage.IMAGING_STUDY_SERIES_INSTANCE__TYPE:
				setType((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.IMAGING_STUDY_SERIES_INSTANCE__TITLE:
				setTitle((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.IMAGING_STUDY_SERIES_INSTANCE__CONTENT:
				getContents().clear();
				getContents().addAll((Collection<? extends Attachment>)newValue);
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
			case FhirResourcePackage.IMAGING_STUDY_SERIES_INSTANCE__NUMBER:
				setNumber((UnsignedInt)null);
				return;
			case FhirResourcePackage.IMAGING_STUDY_SERIES_INSTANCE__UID:
				setUid((Oid)null);
				return;
			case FhirResourcePackage.IMAGING_STUDY_SERIES_INSTANCE__SOP_CLASS:
				setSopClass((Oid)null);
				return;
			case FhirResourcePackage.IMAGING_STUDY_SERIES_INSTANCE__TYPE:
				setType((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.IMAGING_STUDY_SERIES_INSTANCE__TITLE:
				setTitle((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.IMAGING_STUDY_SERIES_INSTANCE__CONTENT:
				getContents().clear();
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
			case FhirResourcePackage.IMAGING_STUDY_SERIES_INSTANCE__NUMBER:
				return number != null;
			case FhirResourcePackage.IMAGING_STUDY_SERIES_INSTANCE__UID:
				return uid != null;
			case FhirResourcePackage.IMAGING_STUDY_SERIES_INSTANCE__SOP_CLASS:
				return sopClass != null;
			case FhirResourcePackage.IMAGING_STUDY_SERIES_INSTANCE__TYPE:
				return type != null;
			case FhirResourcePackage.IMAGING_STUDY_SERIES_INSTANCE__TITLE:
				return title != null;
			case FhirResourcePackage.IMAGING_STUDY_SERIES_INSTANCE__CONTENT:
				return contents != null && !contents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImagingStudySeriesInstanceImpl
