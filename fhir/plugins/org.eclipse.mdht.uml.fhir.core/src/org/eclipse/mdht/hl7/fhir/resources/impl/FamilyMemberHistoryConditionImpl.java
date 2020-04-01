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
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.DataType;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.FamilyMemberHistoryCondition;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Family Member History Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.FamilyMemberHistoryConditionImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.FamilyMemberHistoryConditionImpl#getOutcome <em>Outcome</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.FamilyMemberHistoryConditionImpl#getContributedToDeath <em>Contributed To Death</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.FamilyMemberHistoryConditionImpl#getOnsetx <em>Onsetx</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.FamilyMemberHistoryConditionImpl#getNotes <em>Note</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FamilyMemberHistoryConditionImpl extends BackboneElementImpl implements FamilyMemberHistoryCondition {
	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept code;

	/**
	 * The cached value of the '{@link #getOutcome() <em>Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutcome()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept outcome;

	/**
	 * The cached value of the '{@link #getContributedToDeath() <em>Contributed To Death</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributedToDeath()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.Boolean contributedToDeath;

	/**
	 * The cached value of the '{@link #getOnsetx() <em>Onsetx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnsetx()
	 * @generated
	 * @ordered
	 */
	protected DataType onsetx;

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
	protected FamilyMemberHistoryConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getFamilyMemberHistoryCondition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(CodeableConcept newCode, NotificationChain msgs) {
		CodeableConcept oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.FAMILY_MEMBER_HISTORY_CONDITION__CODE, oldCode, newCode);
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
	public void setCode(CodeableConcept newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.FAMILY_MEMBER_HISTORY_CONDITION__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.FAMILY_MEMBER_HISTORY_CONDITION__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.FAMILY_MEMBER_HISTORY_CONDITION__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getOutcome() {
		return outcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutcome(CodeableConcept newOutcome, NotificationChain msgs) {
		CodeableConcept oldOutcome = outcome;
		outcome = newOutcome;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.FAMILY_MEMBER_HISTORY_CONDITION__OUTCOME, oldOutcome, newOutcome);
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
	public void setOutcome(CodeableConcept newOutcome) {
		if (newOutcome != outcome) {
			NotificationChain msgs = null;
			if (outcome != null)
				msgs = ((InternalEObject)outcome).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.FAMILY_MEMBER_HISTORY_CONDITION__OUTCOME, null, msgs);
			if (newOutcome != null)
				msgs = ((InternalEObject)newOutcome).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.FAMILY_MEMBER_HISTORY_CONDITION__OUTCOME, null, msgs);
			msgs = basicSetOutcome(newOutcome, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.FAMILY_MEMBER_HISTORY_CONDITION__OUTCOME, newOutcome, newOutcome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.Boolean getContributedToDeath() {
		return contributedToDeath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContributedToDeath(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newContributedToDeath, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.Boolean oldContributedToDeath = contributedToDeath;
		contributedToDeath = newContributedToDeath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.FAMILY_MEMBER_HISTORY_CONDITION__CONTRIBUTED_TO_DEATH, oldContributedToDeath, newContributedToDeath);
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
	public void setContributedToDeath(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newContributedToDeath) {
		if (newContributedToDeath != contributedToDeath) {
			NotificationChain msgs = null;
			if (contributedToDeath != null)
				msgs = ((InternalEObject)contributedToDeath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.FAMILY_MEMBER_HISTORY_CONDITION__CONTRIBUTED_TO_DEATH, null, msgs);
			if (newContributedToDeath != null)
				msgs = ((InternalEObject)newContributedToDeath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.FAMILY_MEMBER_HISTORY_CONDITION__CONTRIBUTED_TO_DEATH, null, msgs);
			msgs = basicSetContributedToDeath(newContributedToDeath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.FAMILY_MEMBER_HISTORY_CONDITION__CONTRIBUTED_TO_DEATH, newContributedToDeath, newContributedToDeath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getOnsetx() {
		return onsetx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnsetx(DataType newOnsetx, NotificationChain msgs) {
		DataType oldOnsetx = onsetx;
		onsetx = newOnsetx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSETX, oldOnsetx, newOnsetx);
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
	public void setOnsetx(DataType newOnsetx) {
		if (newOnsetx != onsetx) {
			NotificationChain msgs = null;
			if (onsetx != null)
				msgs = ((InternalEObject)onsetx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSETX, null, msgs);
			if (newOnsetx != null)
				msgs = ((InternalEObject)newOnsetx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSETX, null, msgs);
			msgs = basicSetOnsetx(newOnsetx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSETX, newOnsetx, newOnsetx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getNotes() {
		if (notes == null) {
			notes = new EObjectContainmentEList<Annotation>(Annotation.class, this, ResourcesPackage.FAMILY_MEMBER_HISTORY_CONDITION__NOTE);
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
			case ResourcesPackage.FAMILY_MEMBER_HISTORY_CONDITION__CODE:
				return basicSetCode(null, msgs);
			case ResourcesPackage.FAMILY_MEMBER_HISTORY_CONDITION__OUTCOME:
				return basicSetOutcome(null, msgs);
			case ResourcesPackage.FAMILY_MEMBER_HISTORY_CONDITION__CONTRIBUTED_TO_DEATH:
				return basicSetContributedToDeath(null, msgs);
			case ResourcesPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSETX:
				return basicSetOnsetx(null, msgs);
			case ResourcesPackage.FAMILY_MEMBER_HISTORY_CONDITION__NOTE:
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
			case ResourcesPackage.FAMILY_MEMBER_HISTORY_CONDITION__CODE:
				return getCode();
			case ResourcesPackage.FAMILY_MEMBER_HISTORY_CONDITION__OUTCOME:
				return getOutcome();
			case ResourcesPackage.FAMILY_MEMBER_HISTORY_CONDITION__CONTRIBUTED_TO_DEATH:
				return getContributedToDeath();
			case ResourcesPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSETX:
				return getOnsetx();
			case ResourcesPackage.FAMILY_MEMBER_HISTORY_CONDITION__NOTE:
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
			case ResourcesPackage.FAMILY_MEMBER_HISTORY_CONDITION__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY_CONDITION__OUTCOME:
				setOutcome((CodeableConcept)newValue);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY_CONDITION__CONTRIBUTED_TO_DEATH:
				setContributedToDeath((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSETX:
				setOnsetx((DataType)newValue);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY_CONDITION__NOTE:
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
			case ResourcesPackage.FAMILY_MEMBER_HISTORY_CONDITION__CODE:
				setCode((CodeableConcept)null);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY_CONDITION__OUTCOME:
				setOutcome((CodeableConcept)null);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY_CONDITION__CONTRIBUTED_TO_DEATH:
				setContributedToDeath((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSETX:
				setOnsetx((DataType)null);
				return;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY_CONDITION__NOTE:
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
			case ResourcesPackage.FAMILY_MEMBER_HISTORY_CONDITION__CODE:
				return code != null;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY_CONDITION__OUTCOME:
				return outcome != null;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY_CONDITION__CONTRIBUTED_TO_DEATH:
				return contributedToDeath != null;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY_CONDITION__ONSETX:
				return onsetx != null;
			case ResourcesPackage.FAMILY_MEMBER_HISTORY_CONDITION__NOTE:
				return notes != null && !notes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FamilyMemberHistoryConditionImpl
