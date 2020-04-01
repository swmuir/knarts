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

import org.eclipse.mdht.hl7.fhir.dataTypes.Attachment;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.Identifier;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

import org.eclipse.mdht.hl7.fhir.resources.BodyStructure;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Body Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.BodyStructureImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.BodyStructureImpl#getActive <em>Active</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.BodyStructureImpl#getMorphology <em>Morphology</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.BodyStructureImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.BodyStructureImpl#getLocationQualifiers <em>Location Qualifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.BodyStructureImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.BodyStructureImpl#getImages <em>Image</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.BodyStructureImpl#getPatient <em>Patient</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BodyStructureImpl extends DomainResourceImpl implements BodyStructure {
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
	 * The cached value of the '{@link #getActive() <em>Active</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.Boolean active;

	/**
	 * The cached value of the '{@link #getMorphology() <em>Morphology</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMorphology()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept morphology;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept location;

	/**
	 * The cached value of the '{@link #getLocationQualifiers() <em>Location Qualifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationQualifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> locationQualifiers;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String description;

	/**
	 * The cached value of the '{@link #getImages() <em>Image</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImages()
	 * @generated
	 * @ordered
	 */
	protected EList<Attachment> images;

	/**
	 * The cached value of the '{@link #getPatient() <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient()
	 * @generated
	 * @ordered
	 */
	protected Reference patient;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BodyStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getBodyStructure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.BODY_STRUCTURE__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.Boolean getActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActive(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newActive, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.Boolean oldActive = active;
		active = newActive;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.BODY_STRUCTURE__ACTIVE, oldActive, newActive);
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
	public void setActive(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newActive) {
		if (newActive != active) {
			NotificationChain msgs = null;
			if (active != null)
				msgs = ((InternalEObject)active).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BODY_STRUCTURE__ACTIVE, null, msgs);
			if (newActive != null)
				msgs = ((InternalEObject)newActive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BODY_STRUCTURE__ACTIVE, null, msgs);
			msgs = basicSetActive(newActive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.BODY_STRUCTURE__ACTIVE, newActive, newActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getMorphology() {
		return morphology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMorphology(CodeableConcept newMorphology, NotificationChain msgs) {
		CodeableConcept oldMorphology = morphology;
		morphology = newMorphology;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.BODY_STRUCTURE__MORPHOLOGY, oldMorphology, newMorphology);
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
	public void setMorphology(CodeableConcept newMorphology) {
		if (newMorphology != morphology) {
			NotificationChain msgs = null;
			if (morphology != null)
				msgs = ((InternalEObject)morphology).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BODY_STRUCTURE__MORPHOLOGY, null, msgs);
			if (newMorphology != null)
				msgs = ((InternalEObject)newMorphology).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BODY_STRUCTURE__MORPHOLOGY, null, msgs);
			msgs = basicSetMorphology(newMorphology, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.BODY_STRUCTURE__MORPHOLOGY, newMorphology, newMorphology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(CodeableConcept newLocation, NotificationChain msgs) {
		CodeableConcept oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.BODY_STRUCTURE__LOCATION, oldLocation, newLocation);
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
	public void setLocation(CodeableConcept newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BODY_STRUCTURE__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BODY_STRUCTURE__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.BODY_STRUCTURE__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getLocationQualifiers() {
		if (locationQualifiers == null) {
			locationQualifiers = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.BODY_STRUCTURE__LOCATION_QUALIFIER);
		}
		return locationQualifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(org.eclipse.mdht.hl7.fhir.dataTypes.String newDescription, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.BODY_STRUCTURE__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(org.eclipse.mdht.hl7.fhir.dataTypes.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BODY_STRUCTURE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BODY_STRUCTURE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.BODY_STRUCTURE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Attachment> getImages() {
		if (images == null) {
			images = new EObjectContainmentEList<Attachment>(Attachment.class, this, ResourcesPackage.BODY_STRUCTURE__IMAGE);
		}
		return images;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getPatient() {
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatient(Reference newPatient, NotificationChain msgs) {
		Reference oldPatient = patient;
		patient = newPatient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.BODY_STRUCTURE__PATIENT, oldPatient, newPatient);
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
	public void setPatient(Reference newPatient) {
		if (newPatient != patient) {
			NotificationChain msgs = null;
			if (patient != null)
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BODY_STRUCTURE__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BODY_STRUCTURE__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.BODY_STRUCTURE__PATIENT, newPatient, newPatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.BODY_STRUCTURE__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.BODY_STRUCTURE__ACTIVE:
				return basicSetActive(null, msgs);
			case ResourcesPackage.BODY_STRUCTURE__MORPHOLOGY:
				return basicSetMorphology(null, msgs);
			case ResourcesPackage.BODY_STRUCTURE__LOCATION:
				return basicSetLocation(null, msgs);
			case ResourcesPackage.BODY_STRUCTURE__LOCATION_QUALIFIER:
				return ((InternalEList<?>)getLocationQualifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.BODY_STRUCTURE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case ResourcesPackage.BODY_STRUCTURE__IMAGE:
				return ((InternalEList<?>)getImages()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.BODY_STRUCTURE__PATIENT:
				return basicSetPatient(null, msgs);
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
			case ResourcesPackage.BODY_STRUCTURE__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.BODY_STRUCTURE__ACTIVE:
				return getActive();
			case ResourcesPackage.BODY_STRUCTURE__MORPHOLOGY:
				return getMorphology();
			case ResourcesPackage.BODY_STRUCTURE__LOCATION:
				return getLocation();
			case ResourcesPackage.BODY_STRUCTURE__LOCATION_QUALIFIER:
				return getLocationQualifiers();
			case ResourcesPackage.BODY_STRUCTURE__DESCRIPTION:
				return getDescription();
			case ResourcesPackage.BODY_STRUCTURE__IMAGE:
				return getImages();
			case ResourcesPackage.BODY_STRUCTURE__PATIENT:
				return getPatient();
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
			case ResourcesPackage.BODY_STRUCTURE__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.BODY_STRUCTURE__ACTIVE:
				setActive((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.BODY_STRUCTURE__MORPHOLOGY:
				setMorphology((CodeableConcept)newValue);
				return;
			case ResourcesPackage.BODY_STRUCTURE__LOCATION:
				setLocation((CodeableConcept)newValue);
				return;
			case ResourcesPackage.BODY_STRUCTURE__LOCATION_QUALIFIER:
				getLocationQualifiers().clear();
				getLocationQualifiers().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.BODY_STRUCTURE__DESCRIPTION:
				setDescription((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.BODY_STRUCTURE__IMAGE:
				getImages().clear();
				getImages().addAll((Collection<? extends Attachment>)newValue);
				return;
			case ResourcesPackage.BODY_STRUCTURE__PATIENT:
				setPatient((Reference)newValue);
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
			case ResourcesPackage.BODY_STRUCTURE__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.BODY_STRUCTURE__ACTIVE:
				setActive((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.BODY_STRUCTURE__MORPHOLOGY:
				setMorphology((CodeableConcept)null);
				return;
			case ResourcesPackage.BODY_STRUCTURE__LOCATION:
				setLocation((CodeableConcept)null);
				return;
			case ResourcesPackage.BODY_STRUCTURE__LOCATION_QUALIFIER:
				getLocationQualifiers().clear();
				return;
			case ResourcesPackage.BODY_STRUCTURE__DESCRIPTION:
				setDescription((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.BODY_STRUCTURE__IMAGE:
				getImages().clear();
				return;
			case ResourcesPackage.BODY_STRUCTURE__PATIENT:
				setPatient((Reference)null);
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
			case ResourcesPackage.BODY_STRUCTURE__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.BODY_STRUCTURE__ACTIVE:
				return active != null;
			case ResourcesPackage.BODY_STRUCTURE__MORPHOLOGY:
				return morphology != null;
			case ResourcesPackage.BODY_STRUCTURE__LOCATION:
				return location != null;
			case ResourcesPackage.BODY_STRUCTURE__LOCATION_QUALIFIER:
				return locationQualifiers != null && !locationQualifiers.isEmpty();
			case ResourcesPackage.BODY_STRUCTURE__DESCRIPTION:
				return description != null;
			case ResourcesPackage.BODY_STRUCTURE__IMAGE:
				return images != null && !images.isEmpty();
			case ResourcesPackage.BODY_STRUCTURE__PATIENT:
				return patient != null;
		}
		return super.eIsSet(featureID);
	}

} //BodyStructureImpl
