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

import org.eclipse.mdht.hl7.fhir.resources.ExplanationOfBenefitCareTeam;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Explanation Of Benefit Care Team</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ExplanationOfBenefitCareTeamImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ExplanationOfBenefitCareTeamImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ExplanationOfBenefitCareTeamImpl#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ExplanationOfBenefitCareTeamImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ExplanationOfBenefitCareTeamImpl#getQualification <em>Qualification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExplanationOfBenefitCareTeamImpl extends BackboneElementImpl implements ExplanationOfBenefitCareTeam {
	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt sequence;

	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected Reference provider;

	/**
	 * The cached value of the '{@link #getResponsible() <em>Responsible</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsible()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.Boolean responsible;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept role;

	/**
	 * The cached value of the '{@link #getQualification() <em>Qualification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualification()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept qualification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExplanationOfBenefitCareTeamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getExplanationOfBenefitCareTeam();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositiveInt getSequence() {
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequence(PositiveInt newSequence, NotificationChain msgs) {
		PositiveInt oldSequence = sequence;
		sequence = newSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_CARE_TEAM__SEQUENCE, oldSequence, newSequence);
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
	public void setSequence(PositiveInt newSequence) {
		if (newSequence != sequence) {
			NotificationChain msgs = null;
			if (sequence != null)
				msgs = ((InternalEObject)sequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_CARE_TEAM__SEQUENCE, null, msgs);
			if (newSequence != null)
				msgs = ((InternalEObject)newSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_CARE_TEAM__SEQUENCE, null, msgs);
			msgs = basicSetSequence(newSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_CARE_TEAM__SEQUENCE, newSequence, newSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvider(Reference newProvider, NotificationChain msgs) {
		Reference oldProvider = provider;
		provider = newProvider;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_CARE_TEAM__PROVIDER, oldProvider, newProvider);
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
	public void setProvider(Reference newProvider) {
		if (newProvider != provider) {
			NotificationChain msgs = null;
			if (provider != null)
				msgs = ((InternalEObject)provider).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_CARE_TEAM__PROVIDER, null, msgs);
			if (newProvider != null)
				msgs = ((InternalEObject)newProvider).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_CARE_TEAM__PROVIDER, null, msgs);
			msgs = basicSetProvider(newProvider, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_CARE_TEAM__PROVIDER, newProvider, newProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.Boolean getResponsible() {
		return responsible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponsible(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newResponsible, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.Boolean oldResponsible = responsible;
		responsible = newResponsible;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_CARE_TEAM__RESPONSIBLE, oldResponsible, newResponsible);
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
	public void setResponsible(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newResponsible) {
		if (newResponsible != responsible) {
			NotificationChain msgs = null;
			if (responsible != null)
				msgs = ((InternalEObject)responsible).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_CARE_TEAM__RESPONSIBLE, null, msgs);
			if (newResponsible != null)
				msgs = ((InternalEObject)newResponsible).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_CARE_TEAM__RESPONSIBLE, null, msgs);
			msgs = basicSetResponsible(newResponsible, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_CARE_TEAM__RESPONSIBLE, newResponsible, newResponsible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole(CodeableConcept newRole, NotificationChain msgs) {
		CodeableConcept oldRole = role;
		role = newRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_CARE_TEAM__ROLE, oldRole, newRole);
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
	public void setRole(CodeableConcept newRole) {
		if (newRole != role) {
			NotificationChain msgs = null;
			if (role != null)
				msgs = ((InternalEObject)role).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_CARE_TEAM__ROLE, null, msgs);
			if (newRole != null)
				msgs = ((InternalEObject)newRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_CARE_TEAM__ROLE, null, msgs);
			msgs = basicSetRole(newRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_CARE_TEAM__ROLE, newRole, newRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getQualification() {
		return qualification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQualification(CodeableConcept newQualification, NotificationChain msgs) {
		CodeableConcept oldQualification = qualification;
		qualification = newQualification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_CARE_TEAM__QUALIFICATION, oldQualification, newQualification);
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
	public void setQualification(CodeableConcept newQualification) {
		if (newQualification != qualification) {
			NotificationChain msgs = null;
			if (qualification != null)
				msgs = ((InternalEObject)qualification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_CARE_TEAM__QUALIFICATION, null, msgs);
			if (newQualification != null)
				msgs = ((InternalEObject)newQualification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_CARE_TEAM__QUALIFICATION, null, msgs);
			msgs = basicSetQualification(newQualification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_CARE_TEAM__QUALIFICATION, newQualification, newQualification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_CARE_TEAM__SEQUENCE:
				return basicSetSequence(null, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_CARE_TEAM__PROVIDER:
				return basicSetProvider(null, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_CARE_TEAM__RESPONSIBLE:
				return basicSetResponsible(null, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_CARE_TEAM__ROLE:
				return basicSetRole(null, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_CARE_TEAM__QUALIFICATION:
				return basicSetQualification(null, msgs);
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
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_CARE_TEAM__SEQUENCE:
				return getSequence();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_CARE_TEAM__PROVIDER:
				return getProvider();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_CARE_TEAM__RESPONSIBLE:
				return getResponsible();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_CARE_TEAM__ROLE:
				return getRole();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_CARE_TEAM__QUALIFICATION:
				return getQualification();
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
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_CARE_TEAM__SEQUENCE:
				setSequence((PositiveInt)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_CARE_TEAM__PROVIDER:
				setProvider((Reference)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_CARE_TEAM__RESPONSIBLE:
				setResponsible((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_CARE_TEAM__ROLE:
				setRole((CodeableConcept)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_CARE_TEAM__QUALIFICATION:
				setQualification((CodeableConcept)newValue);
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
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_CARE_TEAM__SEQUENCE:
				setSequence((PositiveInt)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_CARE_TEAM__PROVIDER:
				setProvider((Reference)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_CARE_TEAM__RESPONSIBLE:
				setResponsible((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_CARE_TEAM__ROLE:
				setRole((CodeableConcept)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_CARE_TEAM__QUALIFICATION:
				setQualification((CodeableConcept)null);
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
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_CARE_TEAM__SEQUENCE:
				return sequence != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_CARE_TEAM__PROVIDER:
				return provider != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_CARE_TEAM__RESPONSIBLE:
				return responsible != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_CARE_TEAM__ROLE:
				return role != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_CARE_TEAM__QUALIFICATION:
				return qualification != null;
		}
		return super.eIsSet(featureID);
	}

} //ExplanationOfBenefitCareTeamImpl