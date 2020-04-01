/**
 */
package org.eclipse.mdht.hl7.fhir.resources.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.PositiveInt;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.EncounterDiagnosis;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encounter Diagnosis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.EncounterDiagnosisImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.EncounterDiagnosisImpl#getUse <em>Use</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.EncounterDiagnosisImpl#getRank <em>Rank</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EncounterDiagnosisImpl extends BackboneElementImpl implements EncounterDiagnosis {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Reference condition;

	/**
	 * The cached value of the '{@link #getUse() <em>Use</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept use;

	/**
	 * The cached value of the '{@link #getRank() <em>Rank</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRank()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt rank;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncounterDiagnosisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getEncounterDiagnosis();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Reference newCondition, NotificationChain msgs) {
		Reference oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENCOUNTER_DIAGNOSIS__CONDITION, oldCondition, newCondition);
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
	public void setCondition(Reference newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ENCOUNTER_DIAGNOSIS__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ENCOUNTER_DIAGNOSIS__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENCOUNTER_DIAGNOSIS__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getUse() {
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUse(CodeableConcept newUse, NotificationChain msgs) {
		CodeableConcept oldUse = use;
		use = newUse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENCOUNTER_DIAGNOSIS__USE, oldUse, newUse);
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
	public void setUse(CodeableConcept newUse) {
		if (newUse != use) {
			NotificationChain msgs = null;
			if (use != null)
				msgs = ((InternalEObject)use).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ENCOUNTER_DIAGNOSIS__USE, null, msgs);
			if (newUse != null)
				msgs = ((InternalEObject)newUse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ENCOUNTER_DIAGNOSIS__USE, null, msgs);
			msgs = basicSetUse(newUse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENCOUNTER_DIAGNOSIS__USE, newUse, newUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getRank() {
		return rank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRank(PositiveInt newRank, NotificationChain msgs) {
		PositiveInt oldRank = rank;
		rank = newRank;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENCOUNTER_DIAGNOSIS__RANK, oldRank, newRank);
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
	public void setRank(PositiveInt newRank) {
		if (newRank != rank) {
			NotificationChain msgs = null;
			if (rank != null)
				msgs = ((InternalEObject)rank).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ENCOUNTER_DIAGNOSIS__RANK, null, msgs);
			if (newRank != null)
				msgs = ((InternalEObject)newRank).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ENCOUNTER_DIAGNOSIS__RANK, null, msgs);
			msgs = basicSetRank(newRank, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENCOUNTER_DIAGNOSIS__RANK, newRank, newRank));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.ENCOUNTER_DIAGNOSIS__CONDITION:
				return basicSetCondition(null, msgs);
			case ResourcesPackage.ENCOUNTER_DIAGNOSIS__USE:
				return basicSetUse(null, msgs);
			case ResourcesPackage.ENCOUNTER_DIAGNOSIS__RANK:
				return basicSetRank(null, msgs);
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
			case ResourcesPackage.ENCOUNTER_DIAGNOSIS__CONDITION:
				return getCondition();
			case ResourcesPackage.ENCOUNTER_DIAGNOSIS__USE:
				return getUse();
			case ResourcesPackage.ENCOUNTER_DIAGNOSIS__RANK:
				return getRank();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ResourcesPackage.ENCOUNTER_DIAGNOSIS__CONDITION:
				setCondition((Reference)newValue);
				return;
			case ResourcesPackage.ENCOUNTER_DIAGNOSIS__USE:
				setUse((CodeableConcept)newValue);
				return;
			case ResourcesPackage.ENCOUNTER_DIAGNOSIS__RANK:
				setRank((PositiveInt)newValue);
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
			case ResourcesPackage.ENCOUNTER_DIAGNOSIS__CONDITION:
				setCondition((Reference)null);
				return;
			case ResourcesPackage.ENCOUNTER_DIAGNOSIS__USE:
				setUse((CodeableConcept)null);
				return;
			case ResourcesPackage.ENCOUNTER_DIAGNOSIS__RANK:
				setRank((PositiveInt)null);
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
			case ResourcesPackage.ENCOUNTER_DIAGNOSIS__CONDITION:
				return condition != null;
			case ResourcesPackage.ENCOUNTER_DIAGNOSIS__USE:
				return use != null;
			case ResourcesPackage.ENCOUNTER_DIAGNOSIS__RANK:
				return rank != null;
		}
		return super.eIsSet(featureID);
	}

} //EncounterDiagnosisImpl
