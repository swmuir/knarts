/**
 */
package org.eclipse.mdht.hl7.fhir.resources.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.hl7.fhir.dataTypes.Annotation;
import org.eclipse.mdht.hl7.fhir.dataTypes.Code;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.DataType;
import org.eclipse.mdht.hl7.fhir.dataTypes.DateTime;
import org.eclipse.mdht.hl7.fhir.dataTypes.Identifier;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

import org.eclipse.mdht.hl7.fhir.resources.DeviceUseStatement;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Use Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DeviceUseStatementImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DeviceUseStatementImpl#getBasedOns <em>Based On</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DeviceUseStatementImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DeviceUseStatementImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DeviceUseStatementImpl#getDerivedFroms <em>Derived From</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DeviceUseStatementImpl#getTimingx <em>Timingx</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DeviceUseStatementImpl#getRecordedOn <em>Recorded On</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DeviceUseStatementImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DeviceUseStatementImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DeviceUseStatementImpl#getReasonCodes <em>Reason Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DeviceUseStatementImpl#getReasonReferences <em>Reason Reference</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DeviceUseStatementImpl#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DeviceUseStatementImpl#getNotes <em>Note</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceUseStatementImpl extends DomainResourceImpl implements DeviceUseStatement {
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
	 * The cached value of the '{@link #getBasedOns() <em>Based On</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasedOns()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> basedOns;

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
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected Reference subject;

	/**
	 * The cached value of the '{@link #getDerivedFroms() <em>Derived From</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedFroms()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> derivedFroms;

	/**
	 * The cached value of the '{@link #getTimingx() <em>Timingx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingx()
	 * @generated
	 * @ordered
	 */
	protected DataType timingx;

	/**
	 * The cached value of the '{@link #getRecordedOn() <em>Recorded On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordedOn()
	 * @generated
	 * @ordered
	 */
	protected DateTime recordedOn;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Reference source;

	/**
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected Reference device;

	/**
	 * The cached value of the '{@link #getReasonCodes() <em>Reason Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> reasonCodes;

	/**
	 * The cached value of the '{@link #getReasonReferences() <em>Reason Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> reasonReferences;

	/**
	 * The cached value of the '{@link #getBodySite() <em>Body Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySite()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept bodySite;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceUseStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getDeviceUseStatement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.DEVICE_USE_STATEMENT__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getBasedOns() {
		if (basedOns == null) {
			basedOns = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.DEVICE_USE_STATEMENT__BASED_ON);
		}
		return basedOns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_USE_STATEMENT__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(Code newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_USE_STATEMENT__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_USE_STATEMENT__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_USE_STATEMENT__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_USE_STATEMENT__SUBJECT, oldSubject, newSubject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubject(Reference newSubject) {
		if (newSubject != subject) {
			NotificationChain msgs = null;
			if (subject != null)
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_USE_STATEMENT__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_USE_STATEMENT__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_USE_STATEMENT__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getDerivedFroms() {
		if (derivedFroms == null) {
			derivedFroms = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.DEVICE_USE_STATEMENT__DERIVED_FROM);
		}
		return derivedFroms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getTimingx() {
		return timingx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimingx(DataType newTimingx, NotificationChain msgs) {
		DataType oldTimingx = timingx;
		timingx = newTimingx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_USE_STATEMENT__TIMINGX, oldTimingx, newTimingx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimingx(DataType newTimingx) {
		if (newTimingx != timingx) {
			NotificationChain msgs = null;
			if (timingx != null)
				msgs = ((InternalEObject)timingx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_USE_STATEMENT__TIMINGX, null, msgs);
			if (newTimingx != null)
				msgs = ((InternalEObject)newTimingx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_USE_STATEMENT__TIMINGX, null, msgs);
			msgs = basicSetTimingx(newTimingx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_USE_STATEMENT__TIMINGX, newTimingx, newTimingx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getRecordedOn() {
		return recordedOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecordedOn(DateTime newRecordedOn, NotificationChain msgs) {
		DateTime oldRecordedOn = recordedOn;
		recordedOn = newRecordedOn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_USE_STATEMENT__RECORDED_ON, oldRecordedOn, newRecordedOn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecordedOn(DateTime newRecordedOn) {
		if (newRecordedOn != recordedOn) {
			NotificationChain msgs = null;
			if (recordedOn != null)
				msgs = ((InternalEObject)recordedOn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_USE_STATEMENT__RECORDED_ON, null, msgs);
			if (newRecordedOn != null)
				msgs = ((InternalEObject)newRecordedOn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_USE_STATEMENT__RECORDED_ON, null, msgs);
			msgs = basicSetRecordedOn(newRecordedOn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_USE_STATEMENT__RECORDED_ON, newRecordedOn, newRecordedOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Reference newSource, NotificationChain msgs) {
		Reference oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_USE_STATEMENT__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(Reference newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_USE_STATEMENT__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_USE_STATEMENT__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_USE_STATEMENT__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getDevice() {
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDevice(Reference newDevice, NotificationChain msgs) {
		Reference oldDevice = device;
		device = newDevice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_USE_STATEMENT__DEVICE, oldDevice, newDevice);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDevice(Reference newDevice) {
		if (newDevice != device) {
			NotificationChain msgs = null;
			if (device != null)
				msgs = ((InternalEObject)device).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_USE_STATEMENT__DEVICE, null, msgs);
			if (newDevice != null)
				msgs = ((InternalEObject)newDevice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_USE_STATEMENT__DEVICE, null, msgs);
			msgs = basicSetDevice(newDevice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_USE_STATEMENT__DEVICE, newDevice, newDevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getReasonCodes() {
		if (reasonCodes == null) {
			reasonCodes = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.DEVICE_USE_STATEMENT__REASON_CODE);
		}
		return reasonCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getReasonReferences() {
		if (reasonReferences == null) {
			reasonReferences = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.DEVICE_USE_STATEMENT__REASON_REFERENCE);
		}
		return reasonReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getBodySite() {
		return bodySite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBodySite(CodeableConcept newBodySite, NotificationChain msgs) {
		CodeableConcept oldBodySite = bodySite;
		bodySite = newBodySite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_USE_STATEMENT__BODY_SITE, oldBodySite, newBodySite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBodySite(CodeableConcept newBodySite) {
		if (newBodySite != bodySite) {
			NotificationChain msgs = null;
			if (bodySite != null)
				msgs = ((InternalEObject)bodySite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_USE_STATEMENT__BODY_SITE, null, msgs);
			if (newBodySite != null)
				msgs = ((InternalEObject)newBodySite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DEVICE_USE_STATEMENT__BODY_SITE, null, msgs);
			msgs = basicSetBodySite(newBodySite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DEVICE_USE_STATEMENT__BODY_SITE, newBodySite, newBodySite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getNotes() {
		if (notes == null) {
			notes = new EObjectContainmentEList<Annotation>(Annotation.class, this, ResourcesPackage.DEVICE_USE_STATEMENT__NOTE);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.DEVICE_USE_STATEMENT__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DEVICE_USE_STATEMENT__BASED_ON:
				return ((InternalEList<?>)getBasedOns()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DEVICE_USE_STATEMENT__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.DEVICE_USE_STATEMENT__SUBJECT:
				return basicSetSubject(null, msgs);
			case ResourcesPackage.DEVICE_USE_STATEMENT__DERIVED_FROM:
				return ((InternalEList<?>)getDerivedFroms()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DEVICE_USE_STATEMENT__TIMINGX:
				return basicSetTimingx(null, msgs);
			case ResourcesPackage.DEVICE_USE_STATEMENT__RECORDED_ON:
				return basicSetRecordedOn(null, msgs);
			case ResourcesPackage.DEVICE_USE_STATEMENT__SOURCE:
				return basicSetSource(null, msgs);
			case ResourcesPackage.DEVICE_USE_STATEMENT__DEVICE:
				return basicSetDevice(null, msgs);
			case ResourcesPackage.DEVICE_USE_STATEMENT__REASON_CODE:
				return ((InternalEList<?>)getReasonCodes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DEVICE_USE_STATEMENT__REASON_REFERENCE:
				return ((InternalEList<?>)getReasonReferences()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.DEVICE_USE_STATEMENT__BODY_SITE:
				return basicSetBodySite(null, msgs);
			case ResourcesPackage.DEVICE_USE_STATEMENT__NOTE:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.DEVICE_USE_STATEMENT__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.DEVICE_USE_STATEMENT__BASED_ON:
				return getBasedOns();
			case ResourcesPackage.DEVICE_USE_STATEMENT__STATUS:
				return getStatus();
			case ResourcesPackage.DEVICE_USE_STATEMENT__SUBJECT:
				return getSubject();
			case ResourcesPackage.DEVICE_USE_STATEMENT__DERIVED_FROM:
				return getDerivedFroms();
			case ResourcesPackage.DEVICE_USE_STATEMENT__TIMINGX:
				return getTimingx();
			case ResourcesPackage.DEVICE_USE_STATEMENT__RECORDED_ON:
				return getRecordedOn();
			case ResourcesPackage.DEVICE_USE_STATEMENT__SOURCE:
				return getSource();
			case ResourcesPackage.DEVICE_USE_STATEMENT__DEVICE:
				return getDevice();
			case ResourcesPackage.DEVICE_USE_STATEMENT__REASON_CODE:
				return getReasonCodes();
			case ResourcesPackage.DEVICE_USE_STATEMENT__REASON_REFERENCE:
				return getReasonReferences();
			case ResourcesPackage.DEVICE_USE_STATEMENT__BODY_SITE:
				return getBodySite();
			case ResourcesPackage.DEVICE_USE_STATEMENT__NOTE:
				return getNotes();
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
			case ResourcesPackage.DEVICE_USE_STATEMENT__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.DEVICE_USE_STATEMENT__BASED_ON:
				getBasedOns().clear();
				getBasedOns().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.DEVICE_USE_STATEMENT__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.DEVICE_USE_STATEMENT__SUBJECT:
				setSubject((Reference)newValue);
				return;
			case ResourcesPackage.DEVICE_USE_STATEMENT__DERIVED_FROM:
				getDerivedFroms().clear();
				getDerivedFroms().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.DEVICE_USE_STATEMENT__TIMINGX:
				setTimingx((DataType)newValue);
				return;
			case ResourcesPackage.DEVICE_USE_STATEMENT__RECORDED_ON:
				setRecordedOn((DateTime)newValue);
				return;
			case ResourcesPackage.DEVICE_USE_STATEMENT__SOURCE:
				setSource((Reference)newValue);
				return;
			case ResourcesPackage.DEVICE_USE_STATEMENT__DEVICE:
				setDevice((Reference)newValue);
				return;
			case ResourcesPackage.DEVICE_USE_STATEMENT__REASON_CODE:
				getReasonCodes().clear();
				getReasonCodes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.DEVICE_USE_STATEMENT__REASON_REFERENCE:
				getReasonReferences().clear();
				getReasonReferences().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.DEVICE_USE_STATEMENT__BODY_SITE:
				setBodySite((CodeableConcept)newValue);
				return;
			case ResourcesPackage.DEVICE_USE_STATEMENT__NOTE:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Annotation>)newValue);
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
			case ResourcesPackage.DEVICE_USE_STATEMENT__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.DEVICE_USE_STATEMENT__BASED_ON:
				getBasedOns().clear();
				return;
			case ResourcesPackage.DEVICE_USE_STATEMENT__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.DEVICE_USE_STATEMENT__SUBJECT:
				setSubject((Reference)null);
				return;
			case ResourcesPackage.DEVICE_USE_STATEMENT__DERIVED_FROM:
				getDerivedFroms().clear();
				return;
			case ResourcesPackage.DEVICE_USE_STATEMENT__TIMINGX:
				setTimingx((DataType)null);
				return;
			case ResourcesPackage.DEVICE_USE_STATEMENT__RECORDED_ON:
				setRecordedOn((DateTime)null);
				return;
			case ResourcesPackage.DEVICE_USE_STATEMENT__SOURCE:
				setSource((Reference)null);
				return;
			case ResourcesPackage.DEVICE_USE_STATEMENT__DEVICE:
				setDevice((Reference)null);
				return;
			case ResourcesPackage.DEVICE_USE_STATEMENT__REASON_CODE:
				getReasonCodes().clear();
				return;
			case ResourcesPackage.DEVICE_USE_STATEMENT__REASON_REFERENCE:
				getReasonReferences().clear();
				return;
			case ResourcesPackage.DEVICE_USE_STATEMENT__BODY_SITE:
				setBodySite((CodeableConcept)null);
				return;
			case ResourcesPackage.DEVICE_USE_STATEMENT__NOTE:
				getNotes().clear();
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
			case ResourcesPackage.DEVICE_USE_STATEMENT__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.DEVICE_USE_STATEMENT__BASED_ON:
				return basedOns != null && !basedOns.isEmpty();
			case ResourcesPackage.DEVICE_USE_STATEMENT__STATUS:
				return status != null;
			case ResourcesPackage.DEVICE_USE_STATEMENT__SUBJECT:
				return subject != null;
			case ResourcesPackage.DEVICE_USE_STATEMENT__DERIVED_FROM:
				return derivedFroms != null && !derivedFroms.isEmpty();
			case ResourcesPackage.DEVICE_USE_STATEMENT__TIMINGX:
				return timingx != null;
			case ResourcesPackage.DEVICE_USE_STATEMENT__RECORDED_ON:
				return recordedOn != null;
			case ResourcesPackage.DEVICE_USE_STATEMENT__SOURCE:
				return source != null;
			case ResourcesPackage.DEVICE_USE_STATEMENT__DEVICE:
				return device != null;
			case ResourcesPackage.DEVICE_USE_STATEMENT__REASON_CODE:
				return reasonCodes != null && !reasonCodes.isEmpty();
			case ResourcesPackage.DEVICE_USE_STATEMENT__REASON_REFERENCE:
				return reasonReferences != null && !reasonReferences.isEmpty();
			case ResourcesPackage.DEVICE_USE_STATEMENT__BODY_SITE:
				return bodySite != null;
			case ResourcesPackage.DEVICE_USE_STATEMENT__NOTE:
				return notes != null && !notes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeviceUseStatementImpl
