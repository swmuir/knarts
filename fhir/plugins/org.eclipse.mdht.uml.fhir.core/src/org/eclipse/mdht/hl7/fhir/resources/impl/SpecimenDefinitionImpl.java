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

import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.Identifier;

import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;
import org.eclipse.mdht.hl7.fhir.resources.SpecimenDefinition;
import org.eclipse.mdht.hl7.fhir.resources.SpecimenDefinitionTypeTested;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specimen Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SpecimenDefinitionImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SpecimenDefinitionImpl#getTypeCollected <em>Type Collected</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SpecimenDefinitionImpl#getPatientPreparations <em>Patient Preparation</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SpecimenDefinitionImpl#getTimeAspect <em>Time Aspect</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SpecimenDefinitionImpl#getCollections <em>Collection</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SpecimenDefinitionImpl#getTypeTesteds <em>Type Tested</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecimenDefinitionImpl extends DomainResourceImpl implements SpecimenDefinition {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

	/**
	 * The cached value of the '{@link #getTypeCollected() <em>Type Collected</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCollected()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept typeCollected;

	/**
	 * The cached value of the '{@link #getPatientPreparations() <em>Patient Preparation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientPreparations()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> patientPreparations;

	/**
	 * The cached value of the '{@link #getTimeAspect() <em>Time Aspect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeAspect()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String timeAspect;

	/**
	 * The cached value of the '{@link #getCollections() <em>Collection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollections()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> collections;

	/**
	 * The cached value of the '{@link #getTypeTesteds() <em>Type Tested</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeTesteds()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecimenDefinitionTypeTested> typeTesteds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecimenDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getSpecimenDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Identifier getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(Identifier newIdentifier, NotificationChain msgs) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_DEFINITION__IDENTIFIER, oldIdentifier, newIdentifier);
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
	public void setIdentifier(Identifier newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_DEFINITION__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_DEFINITION__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_DEFINITION__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getTypeCollected() {
		return typeCollected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeCollected(CodeableConcept newTypeCollected, NotificationChain msgs) {
		CodeableConcept oldTypeCollected = typeCollected;
		typeCollected = newTypeCollected;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_DEFINITION__TYPE_COLLECTED, oldTypeCollected, newTypeCollected);
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
	public void setTypeCollected(CodeableConcept newTypeCollected) {
		if (newTypeCollected != typeCollected) {
			NotificationChain msgs = null;
			if (typeCollected != null)
				msgs = ((InternalEObject)typeCollected).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_DEFINITION__TYPE_COLLECTED, null, msgs);
			if (newTypeCollected != null)
				msgs = ((InternalEObject)newTypeCollected).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_DEFINITION__TYPE_COLLECTED, null, msgs);
			msgs = basicSetTypeCollected(newTypeCollected, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_DEFINITION__TYPE_COLLECTED, newTypeCollected, newTypeCollected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getPatientPreparations() {
		if (patientPreparations == null) {
			patientPreparations = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.SPECIMEN_DEFINITION__PATIENT_PREPARATION);
		}
		return patientPreparations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getTimeAspect() {
		return timeAspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeAspect(org.eclipse.mdht.hl7.fhir.dataTypes.String newTimeAspect, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldTimeAspect = timeAspect;
		timeAspect = newTimeAspect;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_DEFINITION__TIME_ASPECT, oldTimeAspect, newTimeAspect);
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
	public void setTimeAspect(org.eclipse.mdht.hl7.fhir.dataTypes.String newTimeAspect) {
		if (newTimeAspect != timeAspect) {
			NotificationChain msgs = null;
			if (timeAspect != null)
				msgs = ((InternalEObject)timeAspect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_DEFINITION__TIME_ASPECT, null, msgs);
			if (newTimeAspect != null)
				msgs = ((InternalEObject)newTimeAspect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_DEFINITION__TIME_ASPECT, null, msgs);
			msgs = basicSetTimeAspect(newTimeAspect, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_DEFINITION__TIME_ASPECT, newTimeAspect, newTimeAspect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getCollections() {
		if (collections == null) {
			collections = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.SPECIMEN_DEFINITION__COLLECTION);
		}
		return collections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SpecimenDefinitionTypeTested> getTypeTesteds() {
		if (typeTesteds == null) {
			typeTesteds = new EObjectContainmentEList<SpecimenDefinitionTypeTested>(SpecimenDefinitionTypeTested.class, this, ResourcesPackage.SPECIMEN_DEFINITION__TYPE_TESTED);
		}
		return typeTesteds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.SPECIMEN_DEFINITION__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case ResourcesPackage.SPECIMEN_DEFINITION__TYPE_COLLECTED:
				return basicSetTypeCollected(null, msgs);
			case ResourcesPackage.SPECIMEN_DEFINITION__PATIENT_PREPARATION:
				return ((InternalEList<?>)getPatientPreparations()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SPECIMEN_DEFINITION__TIME_ASPECT:
				return basicSetTimeAspect(null, msgs);
			case ResourcesPackage.SPECIMEN_DEFINITION__COLLECTION:
				return ((InternalEList<?>)getCollections()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SPECIMEN_DEFINITION__TYPE_TESTED:
				return ((InternalEList<?>)getTypeTesteds()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.SPECIMEN_DEFINITION__IDENTIFIER:
				return getIdentifier();
			case ResourcesPackage.SPECIMEN_DEFINITION__TYPE_COLLECTED:
				return getTypeCollected();
			case ResourcesPackage.SPECIMEN_DEFINITION__PATIENT_PREPARATION:
				return getPatientPreparations();
			case ResourcesPackage.SPECIMEN_DEFINITION__TIME_ASPECT:
				return getTimeAspect();
			case ResourcesPackage.SPECIMEN_DEFINITION__COLLECTION:
				return getCollections();
			case ResourcesPackage.SPECIMEN_DEFINITION__TYPE_TESTED:
				return getTypeTesteds();
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
			case ResourcesPackage.SPECIMEN_DEFINITION__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case ResourcesPackage.SPECIMEN_DEFINITION__TYPE_COLLECTED:
				setTypeCollected((CodeableConcept)newValue);
				return;
			case ResourcesPackage.SPECIMEN_DEFINITION__PATIENT_PREPARATION:
				getPatientPreparations().clear();
				getPatientPreparations().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.SPECIMEN_DEFINITION__TIME_ASPECT:
				setTimeAspect((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.SPECIMEN_DEFINITION__COLLECTION:
				getCollections().clear();
				getCollections().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.SPECIMEN_DEFINITION__TYPE_TESTED:
				getTypeTesteds().clear();
				getTypeTesteds().addAll((Collection<? extends SpecimenDefinitionTypeTested>)newValue);
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
			case ResourcesPackage.SPECIMEN_DEFINITION__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case ResourcesPackage.SPECIMEN_DEFINITION__TYPE_COLLECTED:
				setTypeCollected((CodeableConcept)null);
				return;
			case ResourcesPackage.SPECIMEN_DEFINITION__PATIENT_PREPARATION:
				getPatientPreparations().clear();
				return;
			case ResourcesPackage.SPECIMEN_DEFINITION__TIME_ASPECT:
				setTimeAspect((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.SPECIMEN_DEFINITION__COLLECTION:
				getCollections().clear();
				return;
			case ResourcesPackage.SPECIMEN_DEFINITION__TYPE_TESTED:
				getTypeTesteds().clear();
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
			case ResourcesPackage.SPECIMEN_DEFINITION__IDENTIFIER:
				return identifier != null;
			case ResourcesPackage.SPECIMEN_DEFINITION__TYPE_COLLECTED:
				return typeCollected != null;
			case ResourcesPackage.SPECIMEN_DEFINITION__PATIENT_PREPARATION:
				return patientPreparations != null && !patientPreparations.isEmpty();
			case ResourcesPackage.SPECIMEN_DEFINITION__TIME_ASPECT:
				return timeAspect != null;
			case ResourcesPackage.SPECIMEN_DEFINITION__COLLECTION:
				return collections != null && !collections.isEmpty();
			case ResourcesPackage.SPECIMEN_DEFINITION__TYPE_TESTED:
				return typeTesteds != null && !typeTesteds.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SpecimenDefinitionImpl
