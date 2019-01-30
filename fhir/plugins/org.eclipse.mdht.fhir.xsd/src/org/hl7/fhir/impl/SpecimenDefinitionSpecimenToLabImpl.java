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

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.Duration;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Quantity;
import org.hl7.fhir.SpecimenContainedPreference;
import org.hl7.fhir.SpecimenDefinitionContainerAdditive;
import org.hl7.fhir.SpecimenDefinitionHandling;
import org.hl7.fhir.SpecimenDefinitionSpecimenToLab;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specimen Definition Specimen To Lab</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionSpecimenToLabImpl#getIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionSpecimenToLabImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionSpecimenToLabImpl#getPreference <em>Preference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionSpecimenToLabImpl#getContainerMaterial <em>Container Material</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionSpecimenToLabImpl#getContainerType <em>Container Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionSpecimenToLabImpl#getContainerCap <em>Container Cap</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionSpecimenToLabImpl#getContainerDescription <em>Container Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionSpecimenToLabImpl#getContainerCapacity <em>Container Capacity</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionSpecimenToLabImpl#getContainerMinimumVolume <em>Container Minimum Volume</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionSpecimenToLabImpl#getContainerAdditive <em>Container Additive</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionSpecimenToLabImpl#getContainerPreparation <em>Container Preparation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionSpecimenToLabImpl#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionSpecimenToLabImpl#getRetentionTime <em>Retention Time</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionSpecimenToLabImpl#getRejectionCriterion <em>Rejection Criterion</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SpecimenDefinitionSpecimenToLabImpl#getHandling <em>Handling</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecimenDefinitionSpecimenToLabImpl extends BackboneElementImpl implements SpecimenDefinitionSpecimenToLab {
	/**
	 * The cached value of the '{@link #getIsDerived() <em>Is Derived</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDerived()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean isDerived;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getPreference() <em>Preference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreference()
	 * @generated
	 * @ordered
	 */
	protected SpecimenContainedPreference preference;

	/**
	 * The cached value of the '{@link #getContainerMaterial() <em>Container Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerMaterial()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept containerMaterial;

	/**
	 * The cached value of the '{@link #getContainerType() <em>Container Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept containerType;

	/**
	 * The cached value of the '{@link #getContainerCap() <em>Container Cap</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerCap()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept containerCap;

	/**
	 * The cached value of the '{@link #getContainerDescription() <em>Container Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerDescription()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String containerDescription;

	/**
	 * The cached value of the '{@link #getContainerCapacity() <em>Container Capacity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerCapacity()
	 * @generated
	 * @ordered
	 */
	protected Quantity containerCapacity;

	/**
	 * The cached value of the '{@link #getContainerMinimumVolume() <em>Container Minimum Volume</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerMinimumVolume()
	 * @generated
	 * @ordered
	 */
	protected Quantity containerMinimumVolume;

	/**
	 * The cached value of the '{@link #getContainerAdditive() <em>Container Additive</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerAdditive()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecimenDefinitionContainerAdditive> containerAdditive;

	/**
	 * The cached value of the '{@link #getContainerPreparation() <em>Container Preparation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerPreparation()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String containerPreparation;

	/**
	 * The cached value of the '{@link #getRequirement() <em>Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirement()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String requirement;

	/**
	 * The cached value of the '{@link #getRetentionTime() <em>Retention Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetentionTime()
	 * @generated
	 * @ordered
	 */
	protected Duration retentionTime;

	/**
	 * The cached value of the '{@link #getRejectionCriterion() <em>Rejection Criterion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRejectionCriterion()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> rejectionCriterion;

	/**
	 * The cached value of the '{@link #getHandling() <em>Handling</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandling()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecimenDefinitionHandling> handling;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecimenDefinitionSpecimenToLabImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSpecimenDefinitionSpecimenToLab();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getIsDerived() {
		return isDerived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsDerived(org.hl7.fhir.Boolean newIsDerived, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldIsDerived = isDerived;
		isDerived = newIsDerived;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__IS_DERIVED, oldIsDerived, newIsDerived);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDerived(org.hl7.fhir.Boolean newIsDerived) {
		if (newIsDerived != isDerived) {
			NotificationChain msgs = null;
			if (isDerived != null)
				msgs = ((InternalEObject)isDerived).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__IS_DERIVED, null, msgs);
			if (newIsDerived != null)
				msgs = ((InternalEObject)newIsDerived).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__IS_DERIVED, null, msgs);
			msgs = basicSetIsDerived(newIsDerived, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__IS_DERIVED, newIsDerived, newIsDerived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(CodeableConcept newType, NotificationChain msgs) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecimenContainedPreference getPreference() {
		return preference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreference(SpecimenContainedPreference newPreference, NotificationChain msgs) {
		SpecimenContainedPreference oldPreference = preference;
		preference = newPreference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__PREFERENCE, oldPreference, newPreference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreference(SpecimenContainedPreference newPreference) {
		if (newPreference != preference) {
			NotificationChain msgs = null;
			if (preference != null)
				msgs = ((InternalEObject)preference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__PREFERENCE, null, msgs);
			if (newPreference != null)
				msgs = ((InternalEObject)newPreference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__PREFERENCE, null, msgs);
			msgs = basicSetPreference(newPreference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__PREFERENCE, newPreference, newPreference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getContainerMaterial() {
		return containerMaterial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerMaterial(CodeableConcept newContainerMaterial, NotificationChain msgs) {
		CodeableConcept oldContainerMaterial = containerMaterial;
		containerMaterial = newContainerMaterial;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_MATERIAL, oldContainerMaterial, newContainerMaterial);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerMaterial(CodeableConcept newContainerMaterial) {
		if (newContainerMaterial != containerMaterial) {
			NotificationChain msgs = null;
			if (containerMaterial != null)
				msgs = ((InternalEObject)containerMaterial).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_MATERIAL, null, msgs);
			if (newContainerMaterial != null)
				msgs = ((InternalEObject)newContainerMaterial).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_MATERIAL, null, msgs);
			msgs = basicSetContainerMaterial(newContainerMaterial, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_MATERIAL, newContainerMaterial, newContainerMaterial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getContainerType() {
		return containerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerType(CodeableConcept newContainerType, NotificationChain msgs) {
		CodeableConcept oldContainerType = containerType;
		containerType = newContainerType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_TYPE, oldContainerType, newContainerType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerType(CodeableConcept newContainerType) {
		if (newContainerType != containerType) {
			NotificationChain msgs = null;
			if (containerType != null)
				msgs = ((InternalEObject)containerType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_TYPE, null, msgs);
			if (newContainerType != null)
				msgs = ((InternalEObject)newContainerType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_TYPE, null, msgs);
			msgs = basicSetContainerType(newContainerType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_TYPE, newContainerType, newContainerType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getContainerCap() {
		return containerCap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerCap(CodeableConcept newContainerCap, NotificationChain msgs) {
		CodeableConcept oldContainerCap = containerCap;
		containerCap = newContainerCap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_CAP, oldContainerCap, newContainerCap);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerCap(CodeableConcept newContainerCap) {
		if (newContainerCap != containerCap) {
			NotificationChain msgs = null;
			if (containerCap != null)
				msgs = ((InternalEObject)containerCap).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_CAP, null, msgs);
			if (newContainerCap != null)
				msgs = ((InternalEObject)newContainerCap).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_CAP, null, msgs);
			msgs = basicSetContainerCap(newContainerCap, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_CAP, newContainerCap, newContainerCap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getContainerDescription() {
		return containerDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerDescription(org.hl7.fhir.String newContainerDescription, NotificationChain msgs) {
		org.hl7.fhir.String oldContainerDescription = containerDescription;
		containerDescription = newContainerDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_DESCRIPTION, oldContainerDescription, newContainerDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerDescription(org.hl7.fhir.String newContainerDescription) {
		if (newContainerDescription != containerDescription) {
			NotificationChain msgs = null;
			if (containerDescription != null)
				msgs = ((InternalEObject)containerDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_DESCRIPTION, null, msgs);
			if (newContainerDescription != null)
				msgs = ((InternalEObject)newContainerDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_DESCRIPTION, null, msgs);
			msgs = basicSetContainerDescription(newContainerDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_DESCRIPTION, newContainerDescription, newContainerDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getContainerCapacity() {
		return containerCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerCapacity(Quantity newContainerCapacity, NotificationChain msgs) {
		Quantity oldContainerCapacity = containerCapacity;
		containerCapacity = newContainerCapacity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_CAPACITY, oldContainerCapacity, newContainerCapacity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerCapacity(Quantity newContainerCapacity) {
		if (newContainerCapacity != containerCapacity) {
			NotificationChain msgs = null;
			if (containerCapacity != null)
				msgs = ((InternalEObject)containerCapacity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_CAPACITY, null, msgs);
			if (newContainerCapacity != null)
				msgs = ((InternalEObject)newContainerCapacity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_CAPACITY, null, msgs);
			msgs = basicSetContainerCapacity(newContainerCapacity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_CAPACITY, newContainerCapacity, newContainerCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getContainerMinimumVolume() {
		return containerMinimumVolume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerMinimumVolume(Quantity newContainerMinimumVolume, NotificationChain msgs) {
		Quantity oldContainerMinimumVolume = containerMinimumVolume;
		containerMinimumVolume = newContainerMinimumVolume;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_MINIMUM_VOLUME, oldContainerMinimumVolume, newContainerMinimumVolume);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerMinimumVolume(Quantity newContainerMinimumVolume) {
		if (newContainerMinimumVolume != containerMinimumVolume) {
			NotificationChain msgs = null;
			if (containerMinimumVolume != null)
				msgs = ((InternalEObject)containerMinimumVolume).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_MINIMUM_VOLUME, null, msgs);
			if (newContainerMinimumVolume != null)
				msgs = ((InternalEObject)newContainerMinimumVolume).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_MINIMUM_VOLUME, null, msgs);
			msgs = basicSetContainerMinimumVolume(newContainerMinimumVolume, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_MINIMUM_VOLUME, newContainerMinimumVolume, newContainerMinimumVolume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecimenDefinitionContainerAdditive> getContainerAdditive() {
		if (containerAdditive == null) {
			containerAdditive = new EObjectContainmentEList<SpecimenDefinitionContainerAdditive>(SpecimenDefinitionContainerAdditive.class, this, FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_ADDITIVE);
		}
		return containerAdditive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getContainerPreparation() {
		return containerPreparation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainerPreparation(org.hl7.fhir.String newContainerPreparation, NotificationChain msgs) {
		org.hl7.fhir.String oldContainerPreparation = containerPreparation;
		containerPreparation = newContainerPreparation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_PREPARATION, oldContainerPreparation, newContainerPreparation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainerPreparation(org.hl7.fhir.String newContainerPreparation) {
		if (newContainerPreparation != containerPreparation) {
			NotificationChain msgs = null;
			if (containerPreparation != null)
				msgs = ((InternalEObject)containerPreparation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_PREPARATION, null, msgs);
			if (newContainerPreparation != null)
				msgs = ((InternalEObject)newContainerPreparation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_PREPARATION, null, msgs);
			msgs = basicSetContainerPreparation(newContainerPreparation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_PREPARATION, newContainerPreparation, newContainerPreparation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getRequirement() {
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequirement(org.hl7.fhir.String newRequirement, NotificationChain msgs) {
		org.hl7.fhir.String oldRequirement = requirement;
		requirement = newRequirement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__REQUIREMENT, oldRequirement, newRequirement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequirement(org.hl7.fhir.String newRequirement) {
		if (newRequirement != requirement) {
			NotificationChain msgs = null;
			if (requirement != null)
				msgs = ((InternalEObject)requirement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__REQUIREMENT, null, msgs);
			if (newRequirement != null)
				msgs = ((InternalEObject)newRequirement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__REQUIREMENT, null, msgs);
			msgs = basicSetRequirement(newRequirement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__REQUIREMENT, newRequirement, newRequirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getRetentionTime() {
		return retentionTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRetentionTime(Duration newRetentionTime, NotificationChain msgs) {
		Duration oldRetentionTime = retentionTime;
		retentionTime = newRetentionTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__RETENTION_TIME, oldRetentionTime, newRetentionTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetentionTime(Duration newRetentionTime) {
		if (newRetentionTime != retentionTime) {
			NotificationChain msgs = null;
			if (retentionTime != null)
				msgs = ((InternalEObject)retentionTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__RETENTION_TIME, null, msgs);
			if (newRetentionTime != null)
				msgs = ((InternalEObject)newRetentionTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__RETENTION_TIME, null, msgs);
			msgs = basicSetRetentionTime(newRetentionTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__RETENTION_TIME, newRetentionTime, newRetentionTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getRejectionCriterion() {
		if (rejectionCriterion == null) {
			rejectionCriterion = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__REJECTION_CRITERION);
		}
		return rejectionCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecimenDefinitionHandling> getHandling() {
		if (handling == null) {
			handling = new EObjectContainmentEList<SpecimenDefinitionHandling>(SpecimenDefinitionHandling.class, this, FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__HANDLING);
		}
		return handling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__IS_DERIVED:
				return basicSetIsDerived(null, msgs);
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__PREFERENCE:
				return basicSetPreference(null, msgs);
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_MATERIAL:
				return basicSetContainerMaterial(null, msgs);
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_TYPE:
				return basicSetContainerType(null, msgs);
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_CAP:
				return basicSetContainerCap(null, msgs);
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_DESCRIPTION:
				return basicSetContainerDescription(null, msgs);
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_CAPACITY:
				return basicSetContainerCapacity(null, msgs);
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_MINIMUM_VOLUME:
				return basicSetContainerMinimumVolume(null, msgs);
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_ADDITIVE:
				return ((InternalEList<?>)getContainerAdditive()).basicRemove(otherEnd, msgs);
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_PREPARATION:
				return basicSetContainerPreparation(null, msgs);
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__REQUIREMENT:
				return basicSetRequirement(null, msgs);
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__RETENTION_TIME:
				return basicSetRetentionTime(null, msgs);
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__REJECTION_CRITERION:
				return ((InternalEList<?>)getRejectionCriterion()).basicRemove(otherEnd, msgs);
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__HANDLING:
				return ((InternalEList<?>)getHandling()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__IS_DERIVED:
				return getIsDerived();
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__TYPE:
				return getType();
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__PREFERENCE:
				return getPreference();
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_MATERIAL:
				return getContainerMaterial();
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_TYPE:
				return getContainerType();
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_CAP:
				return getContainerCap();
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_DESCRIPTION:
				return getContainerDescription();
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_CAPACITY:
				return getContainerCapacity();
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_MINIMUM_VOLUME:
				return getContainerMinimumVolume();
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_ADDITIVE:
				return getContainerAdditive();
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_PREPARATION:
				return getContainerPreparation();
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__REQUIREMENT:
				return getRequirement();
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__RETENTION_TIME:
				return getRetentionTime();
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__REJECTION_CRITERION:
				return getRejectionCriterion();
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__HANDLING:
				return getHandling();
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
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__IS_DERIVED:
				setIsDerived((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__PREFERENCE:
				setPreference((SpecimenContainedPreference)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_MATERIAL:
				setContainerMaterial((CodeableConcept)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_TYPE:
				setContainerType((CodeableConcept)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_CAP:
				setContainerCap((CodeableConcept)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_DESCRIPTION:
				setContainerDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_CAPACITY:
				setContainerCapacity((Quantity)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_MINIMUM_VOLUME:
				setContainerMinimumVolume((Quantity)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_ADDITIVE:
				getContainerAdditive().clear();
				getContainerAdditive().addAll((Collection<? extends SpecimenDefinitionContainerAdditive>)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_PREPARATION:
				setContainerPreparation((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__REQUIREMENT:
				setRequirement((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__RETENTION_TIME:
				setRetentionTime((Duration)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__REJECTION_CRITERION:
				getRejectionCriterion().clear();
				getRejectionCriterion().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__HANDLING:
				getHandling().clear();
				getHandling().addAll((Collection<? extends SpecimenDefinitionHandling>)newValue);
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
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__IS_DERIVED:
				setIsDerived((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__PREFERENCE:
				setPreference((SpecimenContainedPreference)null);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_MATERIAL:
				setContainerMaterial((CodeableConcept)null);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_TYPE:
				setContainerType((CodeableConcept)null);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_CAP:
				setContainerCap((CodeableConcept)null);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_DESCRIPTION:
				setContainerDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_CAPACITY:
				setContainerCapacity((Quantity)null);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_MINIMUM_VOLUME:
				setContainerMinimumVolume((Quantity)null);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_ADDITIVE:
				getContainerAdditive().clear();
				return;
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_PREPARATION:
				setContainerPreparation((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__REQUIREMENT:
				setRequirement((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__RETENTION_TIME:
				setRetentionTime((Duration)null);
				return;
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__REJECTION_CRITERION:
				getRejectionCriterion().clear();
				return;
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__HANDLING:
				getHandling().clear();
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
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__IS_DERIVED:
				return isDerived != null;
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__TYPE:
				return type != null;
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__PREFERENCE:
				return preference != null;
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_MATERIAL:
				return containerMaterial != null;
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_TYPE:
				return containerType != null;
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_CAP:
				return containerCap != null;
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_DESCRIPTION:
				return containerDescription != null;
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_CAPACITY:
				return containerCapacity != null;
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_MINIMUM_VOLUME:
				return containerMinimumVolume != null;
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_ADDITIVE:
				return containerAdditive != null && !containerAdditive.isEmpty();
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__CONTAINER_PREPARATION:
				return containerPreparation != null;
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__REQUIREMENT:
				return requirement != null;
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__RETENTION_TIME:
				return retentionTime != null;
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__REJECTION_CRITERION:
				return rejectionCriterion != null && !rejectionCriterion.isEmpty();
			case FhirPackage.SPECIMEN_DEFINITION_SPECIMEN_TO_LAB__HANDLING:
				return handling != null && !handling.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SpecimenDefinitionSpecimenToLabImpl
