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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.Coding;
import org.eclipse.mdht.uml.fhir.core.datatype.DateTime;
import org.eclipse.mdht.uml.fhir.core.datatype.Oid;
import org.eclipse.mdht.uml.fhir.core.datatype.UnsignedInt;
import org.eclipse.mdht.uml.fhir.core.datatype.Uri;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.ImagingStudySeries;
import org.eclipse.mdht.uml.fhir.core.resource.ImagingStudySeriesInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Imaging Study Series</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ImagingStudySeriesImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ImagingStudySeriesImpl#getModality <em>Modality</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ImagingStudySeriesImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ImagingStudySeriesImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ImagingStudySeriesImpl#getNumberOfInstances <em>Number Of Instances</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ImagingStudySeriesImpl#getAvailability <em>Availability</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ImagingStudySeriesImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ImagingStudySeriesImpl#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ImagingStudySeriesImpl#getLaterality <em>Laterality</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ImagingStudySeriesImpl#getStarted <em>Started</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ImagingStudySeriesImpl#getInstances <em>Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImagingStudySeriesImpl extends BackboneElementImpl implements ImagingStudySeries {
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
	 * The cached value of the '{@link #getModality() <em>Modality</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModality()
	 * @generated
	 * @ordered
	 */
	protected Coding modality;

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
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String description;

	/**
	 * The cached value of the '{@link #getNumberOfInstances() <em>Number Of Instances</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfInstances()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt numberOfInstances;

	/**
	 * The cached value of the '{@link #getAvailability() <em>Availability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailability()
	 * @generated
	 * @ordered
	 */
	protected Code availability;

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
	 * The cached value of the '{@link #getBodySite() <em>Body Site</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySite()
	 * @generated
	 * @ordered
	 */
	protected Coding bodySite;

	/**
	 * The cached value of the '{@link #getLaterality() <em>Laterality</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaterality()
	 * @generated
	 * @ordered
	 */
	protected Coding laterality;

	/**
	 * The cached value of the '{@link #getStarted() <em>Started</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStarted()
	 * @generated
	 * @ordered
	 */
	protected DateTime started;

	/**
	 * The cached value of the '{@link #getInstances() <em>Instance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ImagingStudySeriesInstance> instances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImagingStudySeriesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getImagingStudySeries();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.IMAGING_STUDY_SERIES__NUMBER, oldNumber, number));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.IMAGING_STUDY_SERIES__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getModality() {
		if (modality != null && modality.eIsProxy()) {
			InternalEObject oldModality = (InternalEObject)modality;
			modality = (Coding)eResolveProxy(oldModality);
			if (modality != oldModality) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.IMAGING_STUDY_SERIES__MODALITY, oldModality, modality));
			}
		}
		return modality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetModality() {
		return modality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModality(Coding newModality) {
		Coding oldModality = modality;
		modality = newModality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.IMAGING_STUDY_SERIES__MODALITY, oldModality, modality));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.IMAGING_STUDY_SERIES__UID, oldUid, uid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.IMAGING_STUDY_SERIES__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getDescription() {
		if (description != null && description.eIsProxy()) {
			InternalEObject oldDescription = (InternalEObject)description;
			description = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldDescription);
			if (description != oldDescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.IMAGING_STUDY_SERIES__DESCRIPTION, oldDescription, description));
			}
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(org.eclipse.mdht.uml.fhir.core.datatype.String newDescription) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.IMAGING_STUDY_SERIES__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt getNumberOfInstances() {
		if (numberOfInstances != null && numberOfInstances.eIsProxy()) {
			InternalEObject oldNumberOfInstances = (InternalEObject)numberOfInstances;
			numberOfInstances = (UnsignedInt)eResolveProxy(oldNumberOfInstances);
			if (numberOfInstances != oldNumberOfInstances) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.IMAGING_STUDY_SERIES__NUMBER_OF_INSTANCES, oldNumberOfInstances, numberOfInstances));
			}
		}
		return numberOfInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt basicGetNumberOfInstances() {
		return numberOfInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfInstances(UnsignedInt newNumberOfInstances) {
		UnsignedInt oldNumberOfInstances = numberOfInstances;
		numberOfInstances = newNumberOfInstances;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.IMAGING_STUDY_SERIES__NUMBER_OF_INSTANCES, oldNumberOfInstances, numberOfInstances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getAvailability() {
		if (availability != null && availability.eIsProxy()) {
			InternalEObject oldAvailability = (InternalEObject)availability;
			availability = (Code)eResolveProxy(oldAvailability);
			if (availability != oldAvailability) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.IMAGING_STUDY_SERIES__AVAILABILITY, oldAvailability, availability));
			}
		}
		return availability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetAvailability() {
		return availability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailability(Code newAvailability) {
		Code oldAvailability = availability;
		availability = newAvailability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.IMAGING_STUDY_SERIES__AVAILABILITY, oldAvailability, availability));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.IMAGING_STUDY_SERIES__URL, oldUrl, url));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.IMAGING_STUDY_SERIES__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getBodySite() {
		if (bodySite != null && bodySite.eIsProxy()) {
			InternalEObject oldBodySite = (InternalEObject)bodySite;
			bodySite = (Coding)eResolveProxy(oldBodySite);
			if (bodySite != oldBodySite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.IMAGING_STUDY_SERIES__BODY_SITE, oldBodySite, bodySite));
			}
		}
		return bodySite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetBodySite() {
		return bodySite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBodySite(Coding newBodySite) {
		Coding oldBodySite = bodySite;
		bodySite = newBodySite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.IMAGING_STUDY_SERIES__BODY_SITE, oldBodySite, bodySite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getLaterality() {
		if (laterality != null && laterality.eIsProxy()) {
			InternalEObject oldLaterality = (InternalEObject)laterality;
			laterality = (Coding)eResolveProxy(oldLaterality);
			if (laterality != oldLaterality) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.IMAGING_STUDY_SERIES__LATERALITY, oldLaterality, laterality));
			}
		}
		return laterality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetLaterality() {
		return laterality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLaterality(Coding newLaterality) {
		Coding oldLaterality = laterality;
		laterality = newLaterality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.IMAGING_STUDY_SERIES__LATERALITY, oldLaterality, laterality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getStarted() {
		if (started != null && started.eIsProxy()) {
			InternalEObject oldStarted = (InternalEObject)started;
			started = (DateTime)eResolveProxy(oldStarted);
			if (started != oldStarted) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.IMAGING_STUDY_SERIES__STARTED, oldStarted, started));
			}
		}
		return started;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetStarted() {
		return started;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStarted(DateTime newStarted) {
		DateTime oldStarted = started;
		started = newStarted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.IMAGING_STUDY_SERIES__STARTED, oldStarted, started));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImagingStudySeriesInstance> getInstances() {
		if (instances == null) {
			instances = new EObjectContainmentEList<ImagingStudySeriesInstance>(ImagingStudySeriesInstance.class, this, FhirResourcePackage.IMAGING_STUDY_SERIES__INSTANCE);
		}
		return instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.IMAGING_STUDY_SERIES__INSTANCE:
				return ((InternalEList<?>)getInstances()).basicRemove(otherEnd, msgs);
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
			case FhirResourcePackage.IMAGING_STUDY_SERIES__NUMBER:
				if (resolve) return getNumber();
				return basicGetNumber();
			case FhirResourcePackage.IMAGING_STUDY_SERIES__MODALITY:
				if (resolve) return getModality();
				return basicGetModality();
			case FhirResourcePackage.IMAGING_STUDY_SERIES__UID:
				if (resolve) return getUid();
				return basicGetUid();
			case FhirResourcePackage.IMAGING_STUDY_SERIES__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
			case FhirResourcePackage.IMAGING_STUDY_SERIES__NUMBER_OF_INSTANCES:
				if (resolve) return getNumberOfInstances();
				return basicGetNumberOfInstances();
			case FhirResourcePackage.IMAGING_STUDY_SERIES__AVAILABILITY:
				if (resolve) return getAvailability();
				return basicGetAvailability();
			case FhirResourcePackage.IMAGING_STUDY_SERIES__URL:
				if (resolve) return getUrl();
				return basicGetUrl();
			case FhirResourcePackage.IMAGING_STUDY_SERIES__BODY_SITE:
				if (resolve) return getBodySite();
				return basicGetBodySite();
			case FhirResourcePackage.IMAGING_STUDY_SERIES__LATERALITY:
				if (resolve) return getLaterality();
				return basicGetLaterality();
			case FhirResourcePackage.IMAGING_STUDY_SERIES__STARTED:
				if (resolve) return getStarted();
				return basicGetStarted();
			case FhirResourcePackage.IMAGING_STUDY_SERIES__INSTANCE:
				return getInstances();
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
			case FhirResourcePackage.IMAGING_STUDY_SERIES__NUMBER:
				setNumber((UnsignedInt)newValue);
				return;
			case FhirResourcePackage.IMAGING_STUDY_SERIES__MODALITY:
				setModality((Coding)newValue);
				return;
			case FhirResourcePackage.IMAGING_STUDY_SERIES__UID:
				setUid((Oid)newValue);
				return;
			case FhirResourcePackage.IMAGING_STUDY_SERIES__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.IMAGING_STUDY_SERIES__NUMBER_OF_INSTANCES:
				setNumberOfInstances((UnsignedInt)newValue);
				return;
			case FhirResourcePackage.IMAGING_STUDY_SERIES__AVAILABILITY:
				setAvailability((Code)newValue);
				return;
			case FhirResourcePackage.IMAGING_STUDY_SERIES__URL:
				setUrl((Uri)newValue);
				return;
			case FhirResourcePackage.IMAGING_STUDY_SERIES__BODY_SITE:
				setBodySite((Coding)newValue);
				return;
			case FhirResourcePackage.IMAGING_STUDY_SERIES__LATERALITY:
				setLaterality((Coding)newValue);
				return;
			case FhirResourcePackage.IMAGING_STUDY_SERIES__STARTED:
				setStarted((DateTime)newValue);
				return;
			case FhirResourcePackage.IMAGING_STUDY_SERIES__INSTANCE:
				getInstances().clear();
				getInstances().addAll((Collection<? extends ImagingStudySeriesInstance>)newValue);
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
			case FhirResourcePackage.IMAGING_STUDY_SERIES__NUMBER:
				setNumber((UnsignedInt)null);
				return;
			case FhirResourcePackage.IMAGING_STUDY_SERIES__MODALITY:
				setModality((Coding)null);
				return;
			case FhirResourcePackage.IMAGING_STUDY_SERIES__UID:
				setUid((Oid)null);
				return;
			case FhirResourcePackage.IMAGING_STUDY_SERIES__DESCRIPTION:
				setDescription((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.IMAGING_STUDY_SERIES__NUMBER_OF_INSTANCES:
				setNumberOfInstances((UnsignedInt)null);
				return;
			case FhirResourcePackage.IMAGING_STUDY_SERIES__AVAILABILITY:
				setAvailability((Code)null);
				return;
			case FhirResourcePackage.IMAGING_STUDY_SERIES__URL:
				setUrl((Uri)null);
				return;
			case FhirResourcePackage.IMAGING_STUDY_SERIES__BODY_SITE:
				setBodySite((Coding)null);
				return;
			case FhirResourcePackage.IMAGING_STUDY_SERIES__LATERALITY:
				setLaterality((Coding)null);
				return;
			case FhirResourcePackage.IMAGING_STUDY_SERIES__STARTED:
				setStarted((DateTime)null);
				return;
			case FhirResourcePackage.IMAGING_STUDY_SERIES__INSTANCE:
				getInstances().clear();
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
			case FhirResourcePackage.IMAGING_STUDY_SERIES__NUMBER:
				return number != null;
			case FhirResourcePackage.IMAGING_STUDY_SERIES__MODALITY:
				return modality != null;
			case FhirResourcePackage.IMAGING_STUDY_SERIES__UID:
				return uid != null;
			case FhirResourcePackage.IMAGING_STUDY_SERIES__DESCRIPTION:
				return description != null;
			case FhirResourcePackage.IMAGING_STUDY_SERIES__NUMBER_OF_INSTANCES:
				return numberOfInstances != null;
			case FhirResourcePackage.IMAGING_STUDY_SERIES__AVAILABILITY:
				return availability != null;
			case FhirResourcePackage.IMAGING_STUDY_SERIES__URL:
				return url != null;
			case FhirResourcePackage.IMAGING_STUDY_SERIES__BODY_SITE:
				return bodySite != null;
			case FhirResourcePackage.IMAGING_STUDY_SERIES__LATERALITY:
				return laterality != null;
			case FhirResourcePackage.IMAGING_STUDY_SERIES__STARTED:
				return started != null;
			case FhirResourcePackage.IMAGING_STUDY_SERIES__INSTANCE:
				return instances != null && !instances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImagingStudySeriesImpl
