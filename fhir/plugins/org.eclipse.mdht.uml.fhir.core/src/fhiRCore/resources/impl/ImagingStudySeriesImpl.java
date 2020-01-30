/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Coding;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Id;
import fhiRCore.dataTypes.Reference;
import fhiRCore.dataTypes.UnsignedInt;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.ImagingStudySeries;
import fhiRCore.resources.ImagingStudySeriesInstance;
import fhiRCore.resources.ImagingStudySeriesPerformer;
import fhiRCore.resources.ResourcesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Imaging Study Series</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.ImagingStudySeriesImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImagingStudySeriesImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImagingStudySeriesImpl#getModality <em>Modality</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImagingStudySeriesImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImagingStudySeriesImpl#getNumberOfInstances <em>Number Of Instances</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImagingStudySeriesImpl#getEndpoints <em>Endpoint</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImagingStudySeriesImpl#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImagingStudySeriesImpl#getLaterality <em>Laterality</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImagingStudySeriesImpl#getSpecimens <em>Specimen</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImagingStudySeriesImpl#getStarted <em>Started</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImagingStudySeriesImpl#getPerformers <em>Performer</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImagingStudySeriesImpl#getInstances <em>Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImagingStudySeriesImpl extends BackboneElementImpl implements ImagingStudySeries {
	/**
	 * The cached value of the '{@link #getUid() <em>Uid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected Id uid;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt number;

	/**
	 * The cached value of the '{@link #getModality() <em>Modality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModality()
	 * @generated
	 * @ordered
	 */
	protected Coding modality;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String description;

	/**
	 * The cached value of the '{@link #getNumberOfInstances() <em>Number Of Instances</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfInstances()
	 * @generated
	 * @ordered
	 */
	protected UnsignedInt numberOfInstances;

	/**
	 * The cached value of the '{@link #getEndpoints() <em>Endpoint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoints()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> endpoints;

	/**
	 * The cached value of the '{@link #getBodySite() <em>Body Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySite()
	 * @generated
	 * @ordered
	 */
	protected Coding bodySite;

	/**
	 * The cached value of the '{@link #getLaterality() <em>Laterality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaterality()
	 * @generated
	 * @ordered
	 */
	protected Coding laterality;

	/**
	 * The cached value of the '{@link #getSpecimens() <em>Specimen</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecimens()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> specimens;

	/**
	 * The cached value of the '{@link #getStarted() <em>Started</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStarted()
	 * @generated
	 * @ordered
	 */
	protected DateTime started;

	/**
	 * The cached value of the '{@link #getPerformers() <em>Performer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformers()
	 * @generated
	 * @ordered
	 */
	protected EList<ImagingStudySeriesPerformer> performers;

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
		return ResourcesPackage.eINSTANCE.getImagingStudySeries();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getUid() {
		return uid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUid(Id newUid, NotificationChain msgs) {
		Id oldUid = uid;
		uid = newUid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMAGING_STUDY_SERIES__UID, oldUid, newUid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUid(Id newUid) {
		if (newUid != uid) {
			NotificationChain msgs = null;
			if (uid != null)
				msgs = ((InternalEObject)uid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMAGING_STUDY_SERIES__UID, null, msgs);
			if (newUid != null)
				msgs = ((InternalEObject)newUid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMAGING_STUDY_SERIES__UID, null, msgs);
			msgs = basicSetUid(newUid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMAGING_STUDY_SERIES__UID, newUid, newUid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumber(UnsignedInt newNumber, NotificationChain msgs) {
		UnsignedInt oldNumber = number;
		number = newNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMAGING_STUDY_SERIES__NUMBER, oldNumber, newNumber);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(UnsignedInt newNumber) {
		if (newNumber != number) {
			NotificationChain msgs = null;
			if (number != null)
				msgs = ((InternalEObject)number).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMAGING_STUDY_SERIES__NUMBER, null, msgs);
			if (newNumber != null)
				msgs = ((InternalEObject)newNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMAGING_STUDY_SERIES__NUMBER, null, msgs);
			msgs = basicSetNumber(newNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMAGING_STUDY_SERIES__NUMBER, newNumber, newNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getModality() {
		return modality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModality(Coding newModality, NotificationChain msgs) {
		Coding oldModality = modality;
		modality = newModality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMAGING_STUDY_SERIES__MODALITY, oldModality, newModality);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModality(Coding newModality) {
		if (newModality != modality) {
			NotificationChain msgs = null;
			if (modality != null)
				msgs = ((InternalEObject)modality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMAGING_STUDY_SERIES__MODALITY, null, msgs);
			if (newModality != null)
				msgs = ((InternalEObject)newModality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMAGING_STUDY_SERIES__MODALITY, null, msgs);
			msgs = basicSetModality(newModality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMAGING_STUDY_SERIES__MODALITY, newModality, newModality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(fhiRCore.dataTypes.String newDescription, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMAGING_STUDY_SERIES__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(fhiRCore.dataTypes.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMAGING_STUDY_SERIES__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMAGING_STUDY_SERIES__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMAGING_STUDY_SERIES__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedInt getNumberOfInstances() {
		return numberOfInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumberOfInstances(UnsignedInt newNumberOfInstances, NotificationChain msgs) {
		UnsignedInt oldNumberOfInstances = numberOfInstances;
		numberOfInstances = newNumberOfInstances;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMAGING_STUDY_SERIES__NUMBER_OF_INSTANCES, oldNumberOfInstances, newNumberOfInstances);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfInstances(UnsignedInt newNumberOfInstances) {
		if (newNumberOfInstances != numberOfInstances) {
			NotificationChain msgs = null;
			if (numberOfInstances != null)
				msgs = ((InternalEObject)numberOfInstances).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMAGING_STUDY_SERIES__NUMBER_OF_INSTANCES, null, msgs);
			if (newNumberOfInstances != null)
				msgs = ((InternalEObject)newNumberOfInstances).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMAGING_STUDY_SERIES__NUMBER_OF_INSTANCES, null, msgs);
			msgs = basicSetNumberOfInstances(newNumberOfInstances, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMAGING_STUDY_SERIES__NUMBER_OF_INSTANCES, newNumberOfInstances, newNumberOfInstances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getEndpoints() {
		if (endpoints == null) {
			endpoints = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.IMAGING_STUDY_SERIES__ENDPOINT);
		}
		return endpoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getBodySite() {
		return bodySite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBodySite(Coding newBodySite, NotificationChain msgs) {
		Coding oldBodySite = bodySite;
		bodySite = newBodySite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMAGING_STUDY_SERIES__BODY_SITE, oldBodySite, newBodySite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBodySite(Coding newBodySite) {
		if (newBodySite != bodySite) {
			NotificationChain msgs = null;
			if (bodySite != null)
				msgs = ((InternalEObject)bodySite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMAGING_STUDY_SERIES__BODY_SITE, null, msgs);
			if (newBodySite != null)
				msgs = ((InternalEObject)newBodySite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMAGING_STUDY_SERIES__BODY_SITE, null, msgs);
			msgs = basicSetBodySite(newBodySite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMAGING_STUDY_SERIES__BODY_SITE, newBodySite, newBodySite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getLaterality() {
		return laterality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLaterality(Coding newLaterality, NotificationChain msgs) {
		Coding oldLaterality = laterality;
		laterality = newLaterality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMAGING_STUDY_SERIES__LATERALITY, oldLaterality, newLaterality);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLaterality(Coding newLaterality) {
		if (newLaterality != laterality) {
			NotificationChain msgs = null;
			if (laterality != null)
				msgs = ((InternalEObject)laterality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMAGING_STUDY_SERIES__LATERALITY, null, msgs);
			if (newLaterality != null)
				msgs = ((InternalEObject)newLaterality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMAGING_STUDY_SERIES__LATERALITY, null, msgs);
			msgs = basicSetLaterality(newLaterality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMAGING_STUDY_SERIES__LATERALITY, newLaterality, newLaterality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getSpecimens() {
		if (specimens == null) {
			specimens = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.IMAGING_STUDY_SERIES__SPECIMEN);
		}
		return specimens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getStarted() {
		return started;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStarted(DateTime newStarted, NotificationChain msgs) {
		DateTime oldStarted = started;
		started = newStarted;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMAGING_STUDY_SERIES__STARTED, oldStarted, newStarted);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStarted(DateTime newStarted) {
		if (newStarted != started) {
			NotificationChain msgs = null;
			if (started != null)
				msgs = ((InternalEObject)started).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMAGING_STUDY_SERIES__STARTED, null, msgs);
			if (newStarted != null)
				msgs = ((InternalEObject)newStarted).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMAGING_STUDY_SERIES__STARTED, null, msgs);
			msgs = basicSetStarted(newStarted, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMAGING_STUDY_SERIES__STARTED, newStarted, newStarted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImagingStudySeriesPerformer> getPerformers() {
		if (performers == null) {
			performers = new EObjectContainmentEList<ImagingStudySeriesPerformer>(ImagingStudySeriesPerformer.class, this, ResourcesPackage.IMAGING_STUDY_SERIES__PERFORMER);
		}
		return performers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImagingStudySeriesInstance> getInstances() {
		if (instances == null) {
			instances = new EObjectContainmentEList<ImagingStudySeriesInstance>(ImagingStudySeriesInstance.class, this, ResourcesPackage.IMAGING_STUDY_SERIES__INSTANCE);
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
			case ResourcesPackage.IMAGING_STUDY_SERIES__UID:
				return basicSetUid(null, msgs);
			case ResourcesPackage.IMAGING_STUDY_SERIES__NUMBER:
				return basicSetNumber(null, msgs);
			case ResourcesPackage.IMAGING_STUDY_SERIES__MODALITY:
				return basicSetModality(null, msgs);
			case ResourcesPackage.IMAGING_STUDY_SERIES__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case ResourcesPackage.IMAGING_STUDY_SERIES__NUMBER_OF_INSTANCES:
				return basicSetNumberOfInstances(null, msgs);
			case ResourcesPackage.IMAGING_STUDY_SERIES__ENDPOINT:
				return ((InternalEList<?>)getEndpoints()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.IMAGING_STUDY_SERIES__BODY_SITE:
				return basicSetBodySite(null, msgs);
			case ResourcesPackage.IMAGING_STUDY_SERIES__LATERALITY:
				return basicSetLaterality(null, msgs);
			case ResourcesPackage.IMAGING_STUDY_SERIES__SPECIMEN:
				return ((InternalEList<?>)getSpecimens()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.IMAGING_STUDY_SERIES__STARTED:
				return basicSetStarted(null, msgs);
			case ResourcesPackage.IMAGING_STUDY_SERIES__PERFORMER:
				return ((InternalEList<?>)getPerformers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.IMAGING_STUDY_SERIES__INSTANCE:
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
			case ResourcesPackage.IMAGING_STUDY_SERIES__UID:
				return getUid();
			case ResourcesPackage.IMAGING_STUDY_SERIES__NUMBER:
				return getNumber();
			case ResourcesPackage.IMAGING_STUDY_SERIES__MODALITY:
				return getModality();
			case ResourcesPackage.IMAGING_STUDY_SERIES__DESCRIPTION:
				return getDescription();
			case ResourcesPackage.IMAGING_STUDY_SERIES__NUMBER_OF_INSTANCES:
				return getNumberOfInstances();
			case ResourcesPackage.IMAGING_STUDY_SERIES__ENDPOINT:
				return getEndpoints();
			case ResourcesPackage.IMAGING_STUDY_SERIES__BODY_SITE:
				return getBodySite();
			case ResourcesPackage.IMAGING_STUDY_SERIES__LATERALITY:
				return getLaterality();
			case ResourcesPackage.IMAGING_STUDY_SERIES__SPECIMEN:
				return getSpecimens();
			case ResourcesPackage.IMAGING_STUDY_SERIES__STARTED:
				return getStarted();
			case ResourcesPackage.IMAGING_STUDY_SERIES__PERFORMER:
				return getPerformers();
			case ResourcesPackage.IMAGING_STUDY_SERIES__INSTANCE:
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
			case ResourcesPackage.IMAGING_STUDY_SERIES__UID:
				setUid((Id)newValue);
				return;
			case ResourcesPackage.IMAGING_STUDY_SERIES__NUMBER:
				setNumber((UnsignedInt)newValue);
				return;
			case ResourcesPackage.IMAGING_STUDY_SERIES__MODALITY:
				setModality((Coding)newValue);
				return;
			case ResourcesPackage.IMAGING_STUDY_SERIES__DESCRIPTION:
				setDescription((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.IMAGING_STUDY_SERIES__NUMBER_OF_INSTANCES:
				setNumberOfInstances((UnsignedInt)newValue);
				return;
			case ResourcesPackage.IMAGING_STUDY_SERIES__ENDPOINT:
				getEndpoints().clear();
				getEndpoints().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.IMAGING_STUDY_SERIES__BODY_SITE:
				setBodySite((Coding)newValue);
				return;
			case ResourcesPackage.IMAGING_STUDY_SERIES__LATERALITY:
				setLaterality((Coding)newValue);
				return;
			case ResourcesPackage.IMAGING_STUDY_SERIES__SPECIMEN:
				getSpecimens().clear();
				getSpecimens().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.IMAGING_STUDY_SERIES__STARTED:
				setStarted((DateTime)newValue);
				return;
			case ResourcesPackage.IMAGING_STUDY_SERIES__PERFORMER:
				getPerformers().clear();
				getPerformers().addAll((Collection<? extends ImagingStudySeriesPerformer>)newValue);
				return;
			case ResourcesPackage.IMAGING_STUDY_SERIES__INSTANCE:
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
			case ResourcesPackage.IMAGING_STUDY_SERIES__UID:
				setUid((Id)null);
				return;
			case ResourcesPackage.IMAGING_STUDY_SERIES__NUMBER:
				setNumber((UnsignedInt)null);
				return;
			case ResourcesPackage.IMAGING_STUDY_SERIES__MODALITY:
				setModality((Coding)null);
				return;
			case ResourcesPackage.IMAGING_STUDY_SERIES__DESCRIPTION:
				setDescription((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.IMAGING_STUDY_SERIES__NUMBER_OF_INSTANCES:
				setNumberOfInstances((UnsignedInt)null);
				return;
			case ResourcesPackage.IMAGING_STUDY_SERIES__ENDPOINT:
				getEndpoints().clear();
				return;
			case ResourcesPackage.IMAGING_STUDY_SERIES__BODY_SITE:
				setBodySite((Coding)null);
				return;
			case ResourcesPackage.IMAGING_STUDY_SERIES__LATERALITY:
				setLaterality((Coding)null);
				return;
			case ResourcesPackage.IMAGING_STUDY_SERIES__SPECIMEN:
				getSpecimens().clear();
				return;
			case ResourcesPackage.IMAGING_STUDY_SERIES__STARTED:
				setStarted((DateTime)null);
				return;
			case ResourcesPackage.IMAGING_STUDY_SERIES__PERFORMER:
				getPerformers().clear();
				return;
			case ResourcesPackage.IMAGING_STUDY_SERIES__INSTANCE:
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
			case ResourcesPackage.IMAGING_STUDY_SERIES__UID:
				return uid != null;
			case ResourcesPackage.IMAGING_STUDY_SERIES__NUMBER:
				return number != null;
			case ResourcesPackage.IMAGING_STUDY_SERIES__MODALITY:
				return modality != null;
			case ResourcesPackage.IMAGING_STUDY_SERIES__DESCRIPTION:
				return description != null;
			case ResourcesPackage.IMAGING_STUDY_SERIES__NUMBER_OF_INSTANCES:
				return numberOfInstances != null;
			case ResourcesPackage.IMAGING_STUDY_SERIES__ENDPOINT:
				return endpoints != null && !endpoints.isEmpty();
			case ResourcesPackage.IMAGING_STUDY_SERIES__BODY_SITE:
				return bodySite != null;
			case ResourcesPackage.IMAGING_STUDY_SERIES__LATERALITY:
				return laterality != null;
			case ResourcesPackage.IMAGING_STUDY_SERIES__SPECIMEN:
				return specimens != null && !specimens.isEmpty();
			case ResourcesPackage.IMAGING_STUDY_SERIES__STARTED:
				return started != null;
			case ResourcesPackage.IMAGING_STUDY_SERIES__PERFORMER:
				return performers != null && !performers.isEmpty();
			case ResourcesPackage.IMAGING_STUDY_SERIES__INSTANCE:
				return instances != null && !instances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImagingStudySeriesImpl
