/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Reference;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.MedicationKnowledgeRegulatory;
import fhiRCore.resources.MedicationKnowledgeRegulatoryMaxDispense;
import fhiRCore.resources.MedicationKnowledgeRegulatorySchedule;
import fhiRCore.resources.MedicationKnowledgeRegulatorySubstitution;
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
 * An implementation of the model object '<em><b>Medication Knowledge Regulatory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.MedicationKnowledgeRegulatoryImpl#getRegulatoryAuthority <em>Regulatory Authority</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationKnowledgeRegulatoryImpl#getSubstitutions <em>Substitution</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationKnowledgeRegulatoryImpl#getSchedules <em>Schedule</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicationKnowledgeRegulatoryImpl#getMaxDispense <em>Max Dispense</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicationKnowledgeRegulatoryImpl extends BackboneElementImpl implements MedicationKnowledgeRegulatory {
	/**
	 * The cached value of the '{@link #getRegulatoryAuthority() <em>Regulatory Authority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegulatoryAuthority()
	 * @generated
	 * @ordered
	 */
	protected Reference regulatoryAuthority;

	/**
	 * The cached value of the '{@link #getSubstitutions() <em>Substitution</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstitutions()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationKnowledgeRegulatorySubstitution> substitutions;

	/**
	 * The cached value of the '{@link #getSchedules() <em>Schedule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedules()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicationKnowledgeRegulatorySchedule> schedules;

	/**
	 * The cached value of the '{@link #getMaxDispense() <em>Max Dispense</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDispense()
	 * @generated
	 * @ordered
	 */
	protected MedicationKnowledgeRegulatoryMaxDispense maxDispense;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationKnowledgeRegulatoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getMedicationKnowledgeRegulatory();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getRegulatoryAuthority() {
		return regulatoryAuthority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegulatoryAuthority(Reference newRegulatoryAuthority, NotificationChain msgs) {
		Reference oldRegulatoryAuthority = regulatoryAuthority;
		regulatoryAuthority = newRegulatoryAuthority;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_KNOWLEDGE_REGULATORY__REGULATORY_AUTHORITY, oldRegulatoryAuthority, newRegulatoryAuthority);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegulatoryAuthority(Reference newRegulatoryAuthority) {
		if (newRegulatoryAuthority != regulatoryAuthority) {
			NotificationChain msgs = null;
			if (regulatoryAuthority != null)
				msgs = ((InternalEObject)regulatoryAuthority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_KNOWLEDGE_REGULATORY__REGULATORY_AUTHORITY, null, msgs);
			if (newRegulatoryAuthority != null)
				msgs = ((InternalEObject)newRegulatoryAuthority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_KNOWLEDGE_REGULATORY__REGULATORY_AUTHORITY, null, msgs);
			msgs = basicSetRegulatoryAuthority(newRegulatoryAuthority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_KNOWLEDGE_REGULATORY__REGULATORY_AUTHORITY, newRegulatoryAuthority, newRegulatoryAuthority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicationKnowledgeRegulatorySubstitution> getSubstitutions() {
		if (substitutions == null) {
			substitutions = new EObjectContainmentEList<MedicationKnowledgeRegulatorySubstitution>(MedicationKnowledgeRegulatorySubstitution.class, this, ResourcesPackage.MEDICATION_KNOWLEDGE_REGULATORY__SUBSTITUTION);
		}
		return substitutions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicationKnowledgeRegulatorySchedule> getSchedules() {
		if (schedules == null) {
			schedules = new EObjectContainmentEList<MedicationKnowledgeRegulatorySchedule>(MedicationKnowledgeRegulatorySchedule.class, this, ResourcesPackage.MEDICATION_KNOWLEDGE_REGULATORY__SCHEDULE);
		}
		return schedules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationKnowledgeRegulatoryMaxDispense getMaxDispense() {
		return maxDispense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxDispense(MedicationKnowledgeRegulatoryMaxDispense newMaxDispense, NotificationChain msgs) {
		MedicationKnowledgeRegulatoryMaxDispense oldMaxDispense = maxDispense;
		maxDispense = newMaxDispense;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_KNOWLEDGE_REGULATORY__MAX_DISPENSE, oldMaxDispense, newMaxDispense);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxDispense(MedicationKnowledgeRegulatoryMaxDispense newMaxDispense) {
		if (newMaxDispense != maxDispense) {
			NotificationChain msgs = null;
			if (maxDispense != null)
				msgs = ((InternalEObject)maxDispense).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_KNOWLEDGE_REGULATORY__MAX_DISPENSE, null, msgs);
			if (newMaxDispense != null)
				msgs = ((InternalEObject)newMaxDispense).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICATION_KNOWLEDGE_REGULATORY__MAX_DISPENSE, null, msgs);
			msgs = basicSetMaxDispense(newMaxDispense, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICATION_KNOWLEDGE_REGULATORY__MAX_DISPENSE, newMaxDispense, newMaxDispense));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.MEDICATION_KNOWLEDGE_REGULATORY__REGULATORY_AUTHORITY:
				return basicSetRegulatoryAuthority(null, msgs);
			case ResourcesPackage.MEDICATION_KNOWLEDGE_REGULATORY__SUBSTITUTION:
				return ((InternalEList<?>)getSubstitutions()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_KNOWLEDGE_REGULATORY__SCHEDULE:
				return ((InternalEList<?>)getSchedules()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICATION_KNOWLEDGE_REGULATORY__MAX_DISPENSE:
				return basicSetMaxDispense(null, msgs);
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
			case ResourcesPackage.MEDICATION_KNOWLEDGE_REGULATORY__REGULATORY_AUTHORITY:
				return getRegulatoryAuthority();
			case ResourcesPackage.MEDICATION_KNOWLEDGE_REGULATORY__SUBSTITUTION:
				return getSubstitutions();
			case ResourcesPackage.MEDICATION_KNOWLEDGE_REGULATORY__SCHEDULE:
				return getSchedules();
			case ResourcesPackage.MEDICATION_KNOWLEDGE_REGULATORY__MAX_DISPENSE:
				return getMaxDispense();
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
			case ResourcesPackage.MEDICATION_KNOWLEDGE_REGULATORY__REGULATORY_AUTHORITY:
				setRegulatoryAuthority((Reference)newValue);
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE_REGULATORY__SUBSTITUTION:
				getSubstitutions().clear();
				getSubstitutions().addAll((Collection<? extends MedicationKnowledgeRegulatorySubstitution>)newValue);
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE_REGULATORY__SCHEDULE:
				getSchedules().clear();
				getSchedules().addAll((Collection<? extends MedicationKnowledgeRegulatorySchedule>)newValue);
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE_REGULATORY__MAX_DISPENSE:
				setMaxDispense((MedicationKnowledgeRegulatoryMaxDispense)newValue);
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
			case ResourcesPackage.MEDICATION_KNOWLEDGE_REGULATORY__REGULATORY_AUTHORITY:
				setRegulatoryAuthority((Reference)null);
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE_REGULATORY__SUBSTITUTION:
				getSubstitutions().clear();
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE_REGULATORY__SCHEDULE:
				getSchedules().clear();
				return;
			case ResourcesPackage.MEDICATION_KNOWLEDGE_REGULATORY__MAX_DISPENSE:
				setMaxDispense((MedicationKnowledgeRegulatoryMaxDispense)null);
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
			case ResourcesPackage.MEDICATION_KNOWLEDGE_REGULATORY__REGULATORY_AUTHORITY:
				return regulatoryAuthority != null;
			case ResourcesPackage.MEDICATION_KNOWLEDGE_REGULATORY__SUBSTITUTION:
				return substitutions != null && !substitutions.isEmpty();
			case ResourcesPackage.MEDICATION_KNOWLEDGE_REGULATORY__SCHEDULE:
				return schedules != null && !schedules.isEmpty();
			case ResourcesPackage.MEDICATION_KNOWLEDGE_REGULATORY__MAX_DISPENSE:
				return maxDispense != null;
		}
		return super.eIsSet(featureID);
	}

} //MedicationKnowledgeRegulatoryImpl
