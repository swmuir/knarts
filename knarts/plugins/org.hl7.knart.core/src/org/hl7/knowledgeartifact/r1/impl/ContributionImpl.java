/**
 */
package org.hl7.knowledgeartifact.r1.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.hl7.knowledgeartifact.r1.Contribution;
import org.hl7.knowledgeartifact.r1.Party;
import org.hl7.knowledgeartifact.r1.R1Package;
import org.hl7.knowledgeartifact.r1.RoleType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contribution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.ContributionImpl#getContributor <em>Contributor</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.ContributionImpl#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContributionImpl extends MinimalEObjectImpl.Container implements Contribution {
	/**
	 * The cached value of the '{@link #getContributor() <em>Contributor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributor()
	 * @generated
	 * @ordered
	 */
	protected Party contributor;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected RoleType role;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContributionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R1Package.Literals.CONTRIBUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party getContributor() {
		return contributor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContributor(Party newContributor, NotificationChain msgs) {
		Party oldContributor = contributor;
		contributor = newContributor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.CONTRIBUTION__CONTRIBUTOR, oldContributor, newContributor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContributor(Party newContributor) {
		if (newContributor != contributor) {
			NotificationChain msgs = null;
			if (contributor != null)
				msgs = ((InternalEObject)contributor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.CONTRIBUTION__CONTRIBUTOR, null, msgs);
			if (newContributor != null)
				msgs = ((InternalEObject)newContributor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.CONTRIBUTION__CONTRIBUTOR, null, msgs);
			msgs = basicSetContributor(newContributor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.CONTRIBUTION__CONTRIBUTOR, newContributor, newContributor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole(RoleType newRole, NotificationChain msgs) {
		RoleType oldRole = role;
		role = newRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.CONTRIBUTION__ROLE, oldRole, newRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(RoleType newRole) {
		if (newRole != role) {
			NotificationChain msgs = null;
			if (role != null)
				msgs = ((InternalEObject)role).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.CONTRIBUTION__ROLE, null, msgs);
			if (newRole != null)
				msgs = ((InternalEObject)newRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.CONTRIBUTION__ROLE, null, msgs);
			msgs = basicSetRole(newRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.CONTRIBUTION__ROLE, newRole, newRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R1Package.CONTRIBUTION__CONTRIBUTOR:
				return basicSetContributor(null, msgs);
			case R1Package.CONTRIBUTION__ROLE:
				return basicSetRole(null, msgs);
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
			case R1Package.CONTRIBUTION__CONTRIBUTOR:
				return getContributor();
			case R1Package.CONTRIBUTION__ROLE:
				return getRole();
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
			case R1Package.CONTRIBUTION__CONTRIBUTOR:
				setContributor((Party)newValue);
				return;
			case R1Package.CONTRIBUTION__ROLE:
				setRole((RoleType)newValue);
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
			case R1Package.CONTRIBUTION__CONTRIBUTOR:
				setContributor((Party)null);
				return;
			case R1Package.CONTRIBUTION__ROLE:
				setRole((RoleType)null);
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
			case R1Package.CONTRIBUTION__CONTRIBUTOR:
				return contributor != null;
			case R1Package.CONTRIBUTION__ROLE:
				return role != null;
		}
		return super.eIsSet(featureID);
	}

} //ContributionImpl
