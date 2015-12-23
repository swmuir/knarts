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

import org.eclipse.mdht.uml.fhir.core.datatype.Annotation;
import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.datatype.ContactPoint;
import org.eclipse.mdht.uml.fhir.core.datatype.DateTime;
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;
import org.eclipse.mdht.uml.fhir.core.datatype.Uri;

import org.eclipse.mdht.uml.fhir.core.resource.Device;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.Location;
import org.eclipse.mdht.uml.fhir.core.resource.Organization;
import org.eclipse.mdht.uml.fhir.core.resource.Patient;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DeviceImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DeviceImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DeviceImpl#getNotes <em>Note</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DeviceImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DeviceImpl#getManufacturer <em>Manufacturer</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DeviceImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DeviceImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DeviceImpl#getManufactureDate <em>Manufacture Date</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DeviceImpl#getExpiry <em>Expiry</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DeviceImpl#getUdi <em>Udi</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DeviceImpl#getLotNumber <em>Lot Number</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DeviceImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DeviceImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DeviceImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DeviceImpl#getContacts <em>Contact</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DeviceImpl#getUrl <em>Url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceImpl extends DomainResourceImpl implements Device {
	/**
	 * The cached value of the '{@link #getIdentifiers() <em>Identifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifiers;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getNotes() <em>Note</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> notes;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Code status;

	/**
	 * The cached value of the '{@link #getManufacturer() <em>Manufacturer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturer()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String manufacturer;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String model;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String version;

	/**
	 * The cached value of the '{@link #getManufactureDate() <em>Manufacture Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufactureDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime manufactureDate;

	/**
	 * The cached value of the '{@link #getExpiry() <em>Expiry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiry()
	 * @generated
	 * @ordered
	 */
	protected DateTime expiry;

	/**
	 * The cached value of the '{@link #getUdi() <em>Udi</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUdi()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String udi;

	/**
	 * The cached value of the '{@link #getLotNumber() <em>Lot Number</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLotNumber()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String lotNumber;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected Organization owner;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Location location;

	/**
	 * The cached value of the '{@link #getPatient() <em>Patient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient()
	 * @generated
	 * @ordered
	 */
	protected Patient patient;

	/**
	 * The cached value of the '{@link #getContacts() <em>Contact</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContacts()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactPoint> contacts;

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
		return FhirResourcePackage.eINSTANCE.getDevice();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, FhirResourcePackage.DEVICE__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (CodeableConcept)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DEVICE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CodeableConcept newType) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DEVICE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNotes() {
		if (notes == null) {
			notes = new EObjectResolvingEList<Annotation>(Annotation.class, this, FhirResourcePackage.DEVICE__NOTE);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getStatus() {
		if (status != null && status.eIsProxy()) {
			InternalEObject oldStatus = (InternalEObject)status;
			status = (Code)eResolveProxy(oldStatus);
			if (status != oldStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DEVICE__STATUS, oldStatus, status));
			}
		}
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(Code newStatus) {
		Code oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DEVICE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getManufacturer() {
		if (manufacturer != null && manufacturer.eIsProxy()) {
			InternalEObject oldManufacturer = (InternalEObject)manufacturer;
			manufacturer = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldManufacturer);
			if (manufacturer != oldManufacturer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DEVICE__MANUFACTURER, oldManufacturer, manufacturer));
			}
		}
		return manufacturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetManufacturer() {
		return manufacturer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManufacturer(org.eclipse.mdht.uml.fhir.core.datatype.String newManufacturer) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldManufacturer = manufacturer;
		manufacturer = newManufacturer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DEVICE__MANUFACTURER, oldManufacturer, manufacturer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getModel() {
		if (model != null && model.eIsProxy()) {
			InternalEObject oldModel = (InternalEObject)model;
			model = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldModel);
			if (model != oldModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DEVICE__MODEL, oldModel, model));
			}
		}
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(org.eclipse.mdht.uml.fhir.core.datatype.String newModel) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DEVICE__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getVersion() {
		if (version != null && version.eIsProxy()) {
			InternalEObject oldVersion = (InternalEObject)version;
			version = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldVersion);
			if (version != oldVersion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DEVICE__VERSION, oldVersion, version));
			}
		}
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(org.eclipse.mdht.uml.fhir.core.datatype.String newVersion) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DEVICE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getManufactureDate() {
		if (manufactureDate != null && manufactureDate.eIsProxy()) {
			InternalEObject oldManufactureDate = (InternalEObject)manufactureDate;
			manufactureDate = (DateTime)eResolveProxy(oldManufactureDate);
			if (manufactureDate != oldManufactureDate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DEVICE__MANUFACTURE_DATE, oldManufactureDate, manufactureDate));
			}
		}
		return manufactureDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetManufactureDate() {
		return manufactureDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManufactureDate(DateTime newManufactureDate) {
		DateTime oldManufactureDate = manufactureDate;
		manufactureDate = newManufactureDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DEVICE__MANUFACTURE_DATE, oldManufactureDate, manufactureDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getExpiry() {
		if (expiry != null && expiry.eIsProxy()) {
			InternalEObject oldExpiry = (InternalEObject)expiry;
			expiry = (DateTime)eResolveProxy(oldExpiry);
			if (expiry != oldExpiry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DEVICE__EXPIRY, oldExpiry, expiry));
			}
		}
		return expiry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetExpiry() {
		return expiry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpiry(DateTime newExpiry) {
		DateTime oldExpiry = expiry;
		expiry = newExpiry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DEVICE__EXPIRY, oldExpiry, expiry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getUdi() {
		if (udi != null && udi.eIsProxy()) {
			InternalEObject oldUdi = (InternalEObject)udi;
			udi = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldUdi);
			if (udi != oldUdi) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DEVICE__UDI, oldUdi, udi));
			}
		}
		return udi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetUdi() {
		return udi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUdi(org.eclipse.mdht.uml.fhir.core.datatype.String newUdi) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldUdi = udi;
		udi = newUdi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DEVICE__UDI, oldUdi, udi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getLotNumber() {
		if (lotNumber != null && lotNumber.eIsProxy()) {
			InternalEObject oldLotNumber = (InternalEObject)lotNumber;
			lotNumber = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldLotNumber);
			if (lotNumber != oldLotNumber) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DEVICE__LOT_NUMBER, oldLotNumber, lotNumber));
			}
		}
		return lotNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetLotNumber() {
		return lotNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLotNumber(org.eclipse.mdht.uml.fhir.core.datatype.String newLotNumber) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldLotNumber = lotNumber;
		lotNumber = newLotNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DEVICE__LOT_NUMBER, oldLotNumber, lotNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization getOwner() {
		if (owner != null && owner.eIsProxy()) {
			InternalEObject oldOwner = (InternalEObject)owner;
			owner = (Organization)eResolveProxy(oldOwner);
			if (owner != oldOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DEVICE__OWNER, oldOwner, owner));
			}
		}
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization basicGetOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(Organization newOwner) {
		Organization oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DEVICE__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getLocation() {
		if (location != null && location.eIsProxy()) {
			InternalEObject oldLocation = (InternalEObject)location;
			location = (Location)eResolveProxy(oldLocation);
			if (location != oldLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DEVICE__LOCATION, oldLocation, location));
			}
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Location newLocation) {
		Location oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DEVICE__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient getPatient() {
		if (patient != null && patient.eIsProxy()) {
			InternalEObject oldPatient = (InternalEObject)patient;
			patient = (Patient)eResolveProxy(oldPatient);
			if (patient != oldPatient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DEVICE__PATIENT, oldPatient, patient));
			}
		}
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient basicGetPatient() {
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatient(Patient newPatient) {
		Patient oldPatient = patient;
		patient = newPatient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DEVICE__PATIENT, oldPatient, patient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactPoint> getContacts() {
		if (contacts == null) {
			contacts = new EObjectResolvingEList<ContactPoint>(ContactPoint.class, this, FhirResourcePackage.DEVICE__CONTACT);
		}
		return contacts;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DEVICE__URL, oldUrl, url));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DEVICE__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirResourcePackage.DEVICE__IDENTIFIER:
				return getIdentifiers();
			case FhirResourcePackage.DEVICE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case FhirResourcePackage.DEVICE__NOTE:
				return getNotes();
			case FhirResourcePackage.DEVICE__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case FhirResourcePackage.DEVICE__MANUFACTURER:
				if (resolve) return getManufacturer();
				return basicGetManufacturer();
			case FhirResourcePackage.DEVICE__MODEL:
				if (resolve) return getModel();
				return basicGetModel();
			case FhirResourcePackage.DEVICE__VERSION:
				if (resolve) return getVersion();
				return basicGetVersion();
			case FhirResourcePackage.DEVICE__MANUFACTURE_DATE:
				if (resolve) return getManufactureDate();
				return basicGetManufactureDate();
			case FhirResourcePackage.DEVICE__EXPIRY:
				if (resolve) return getExpiry();
				return basicGetExpiry();
			case FhirResourcePackage.DEVICE__UDI:
				if (resolve) return getUdi();
				return basicGetUdi();
			case FhirResourcePackage.DEVICE__LOT_NUMBER:
				if (resolve) return getLotNumber();
				return basicGetLotNumber();
			case FhirResourcePackage.DEVICE__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case FhirResourcePackage.DEVICE__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
			case FhirResourcePackage.DEVICE__PATIENT:
				if (resolve) return getPatient();
				return basicGetPatient();
			case FhirResourcePackage.DEVICE__CONTACT:
				return getContacts();
			case FhirResourcePackage.DEVICE__URL:
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
			case FhirResourcePackage.DEVICE__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirResourcePackage.DEVICE__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.DEVICE__NOTE:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Annotation>)newValue);
				return;
			case FhirResourcePackage.DEVICE__STATUS:
				setStatus((Code)newValue);
				return;
			case FhirResourcePackage.DEVICE__MANUFACTURER:
				setManufacturer((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.DEVICE__MODEL:
				setModel((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.DEVICE__VERSION:
				setVersion((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.DEVICE__MANUFACTURE_DATE:
				setManufactureDate((DateTime)newValue);
				return;
			case FhirResourcePackage.DEVICE__EXPIRY:
				setExpiry((DateTime)newValue);
				return;
			case FhirResourcePackage.DEVICE__UDI:
				setUdi((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.DEVICE__LOT_NUMBER:
				setLotNumber((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.DEVICE__OWNER:
				setOwner((Organization)newValue);
				return;
			case FhirResourcePackage.DEVICE__LOCATION:
				setLocation((Location)newValue);
				return;
			case FhirResourcePackage.DEVICE__PATIENT:
				setPatient((Patient)newValue);
				return;
			case FhirResourcePackage.DEVICE__CONTACT:
				getContacts().clear();
				getContacts().addAll((Collection<? extends ContactPoint>)newValue);
				return;
			case FhirResourcePackage.DEVICE__URL:
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
			case FhirResourcePackage.DEVICE__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case FhirResourcePackage.DEVICE__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirResourcePackage.DEVICE__NOTE:
				getNotes().clear();
				return;
			case FhirResourcePackage.DEVICE__STATUS:
				setStatus((Code)null);
				return;
			case FhirResourcePackage.DEVICE__MANUFACTURER:
				setManufacturer((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.DEVICE__MODEL:
				setModel((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.DEVICE__VERSION:
				setVersion((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.DEVICE__MANUFACTURE_DATE:
				setManufactureDate((DateTime)null);
				return;
			case FhirResourcePackage.DEVICE__EXPIRY:
				setExpiry((DateTime)null);
				return;
			case FhirResourcePackage.DEVICE__UDI:
				setUdi((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.DEVICE__LOT_NUMBER:
				setLotNumber((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.DEVICE__OWNER:
				setOwner((Organization)null);
				return;
			case FhirResourcePackage.DEVICE__LOCATION:
				setLocation((Location)null);
				return;
			case FhirResourcePackage.DEVICE__PATIENT:
				setPatient((Patient)null);
				return;
			case FhirResourcePackage.DEVICE__CONTACT:
				getContacts().clear();
				return;
			case FhirResourcePackage.DEVICE__URL:
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
			case FhirResourcePackage.DEVICE__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case FhirResourcePackage.DEVICE__TYPE:
				return type != null;
			case FhirResourcePackage.DEVICE__NOTE:
				return notes != null && !notes.isEmpty();
			case FhirResourcePackage.DEVICE__STATUS:
				return status != null;
			case FhirResourcePackage.DEVICE__MANUFACTURER:
				return manufacturer != null;
			case FhirResourcePackage.DEVICE__MODEL:
				return model != null;
			case FhirResourcePackage.DEVICE__VERSION:
				return version != null;
			case FhirResourcePackage.DEVICE__MANUFACTURE_DATE:
				return manufactureDate != null;
			case FhirResourcePackage.DEVICE__EXPIRY:
				return expiry != null;
			case FhirResourcePackage.DEVICE__UDI:
				return udi != null;
			case FhirResourcePackage.DEVICE__LOT_NUMBER:
				return lotNumber != null;
			case FhirResourcePackage.DEVICE__OWNER:
				return owner != null;
			case FhirResourcePackage.DEVICE__LOCATION:
				return location != null;
			case FhirResourcePackage.DEVICE__PATIENT:
				return patient != null;
			case FhirResourcePackage.DEVICE__CONTACT:
				return contacts != null && !contacts.isEmpty();
			case FhirResourcePackage.DEVICE__URL:
				return url != null;
		}
		return super.eIsSet(featureID);
	}

} //DeviceImpl
