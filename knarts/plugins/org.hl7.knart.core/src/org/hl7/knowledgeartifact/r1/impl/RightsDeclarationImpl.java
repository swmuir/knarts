/**
 */
package org.hl7.knowledgeartifact.r1.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.hl7.cdsdt.r2.ST;

import org.hl7.knowledgeartifact.r1.Party;
import org.hl7.knowledgeartifact.r1.PermissionsType;
import org.hl7.knowledgeartifact.r1.R1Package;
import org.hl7.knowledgeartifact.r1.RightsDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rights Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.RightsDeclarationImpl#getAssertedRights <em>Asserted Rights</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.RightsDeclarationImpl#getRightsHolder <em>Rights Holder</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.RightsDeclarationImpl#getPermissions <em>Permissions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RightsDeclarationImpl extends MinimalEObjectImpl.Container implements RightsDeclaration {
	/**
	 * The cached value of the '{@link #getAssertedRights() <em>Asserted Rights</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssertedRights()
	 * @generated
	 * @ordered
	 */
	protected ST assertedRights;

	/**
	 * The cached value of the '{@link #getRightsHolder() <em>Rights Holder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightsHolder()
	 * @generated
	 * @ordered
	 */
	protected Party rightsHolder;

	/**
	 * The cached value of the '{@link #getPermissions() <em>Permissions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermissions()
	 * @generated
	 * @ordered
	 */
	protected PermissionsType permissions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RightsDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R1Package.Literals.RIGHTS_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ST getAssertedRights() {
		return assertedRights;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssertedRights(ST newAssertedRights, NotificationChain msgs) {
		ST oldAssertedRights = assertedRights;
		assertedRights = newAssertedRights;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.RIGHTS_DECLARATION__ASSERTED_RIGHTS, oldAssertedRights, newAssertedRights);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssertedRights(ST newAssertedRights) {
		if (newAssertedRights != assertedRights) {
			NotificationChain msgs = null;
			if (assertedRights != null)
				msgs = ((InternalEObject)assertedRights).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.RIGHTS_DECLARATION__ASSERTED_RIGHTS, null, msgs);
			if (newAssertedRights != null)
				msgs = ((InternalEObject)newAssertedRights).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.RIGHTS_DECLARATION__ASSERTED_RIGHTS, null, msgs);
			msgs = basicSetAssertedRights(newAssertedRights, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.RIGHTS_DECLARATION__ASSERTED_RIGHTS, newAssertedRights, newAssertedRights));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Party getRightsHolder() {
		return rightsHolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightsHolder(Party newRightsHolder, NotificationChain msgs) {
		Party oldRightsHolder = rightsHolder;
		rightsHolder = newRightsHolder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.RIGHTS_DECLARATION__RIGHTS_HOLDER, oldRightsHolder, newRightsHolder);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightsHolder(Party newRightsHolder) {
		if (newRightsHolder != rightsHolder) {
			NotificationChain msgs = null;
			if (rightsHolder != null)
				msgs = ((InternalEObject)rightsHolder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.RIGHTS_DECLARATION__RIGHTS_HOLDER, null, msgs);
			if (newRightsHolder != null)
				msgs = ((InternalEObject)newRightsHolder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.RIGHTS_DECLARATION__RIGHTS_HOLDER, null, msgs);
			msgs = basicSetRightsHolder(newRightsHolder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.RIGHTS_DECLARATION__RIGHTS_HOLDER, newRightsHolder, newRightsHolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermissionsType getPermissions() {
		return permissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPermissions(PermissionsType newPermissions, NotificationChain msgs) {
		PermissionsType oldPermissions = permissions;
		permissions = newPermissions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.RIGHTS_DECLARATION__PERMISSIONS, oldPermissions, newPermissions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPermissions(PermissionsType newPermissions) {
		if (newPermissions != permissions) {
			NotificationChain msgs = null;
			if (permissions != null)
				msgs = ((InternalEObject)permissions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.RIGHTS_DECLARATION__PERMISSIONS, null, msgs);
			if (newPermissions != null)
				msgs = ((InternalEObject)newPermissions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.RIGHTS_DECLARATION__PERMISSIONS, null, msgs);
			msgs = basicSetPermissions(newPermissions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.RIGHTS_DECLARATION__PERMISSIONS, newPermissions, newPermissions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R1Package.RIGHTS_DECLARATION__ASSERTED_RIGHTS:
				return basicSetAssertedRights(null, msgs);
			case R1Package.RIGHTS_DECLARATION__RIGHTS_HOLDER:
				return basicSetRightsHolder(null, msgs);
			case R1Package.RIGHTS_DECLARATION__PERMISSIONS:
				return basicSetPermissions(null, msgs);
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
			case R1Package.RIGHTS_DECLARATION__ASSERTED_RIGHTS:
				return getAssertedRights();
			case R1Package.RIGHTS_DECLARATION__RIGHTS_HOLDER:
				return getRightsHolder();
			case R1Package.RIGHTS_DECLARATION__PERMISSIONS:
				return getPermissions();
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
			case R1Package.RIGHTS_DECLARATION__ASSERTED_RIGHTS:
				setAssertedRights((ST)newValue);
				return;
			case R1Package.RIGHTS_DECLARATION__RIGHTS_HOLDER:
				setRightsHolder((Party)newValue);
				return;
			case R1Package.RIGHTS_DECLARATION__PERMISSIONS:
				setPermissions((PermissionsType)newValue);
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
			case R1Package.RIGHTS_DECLARATION__ASSERTED_RIGHTS:
				setAssertedRights((ST)null);
				return;
			case R1Package.RIGHTS_DECLARATION__RIGHTS_HOLDER:
				setRightsHolder((Party)null);
				return;
			case R1Package.RIGHTS_DECLARATION__PERMISSIONS:
				setPermissions((PermissionsType)null);
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
			case R1Package.RIGHTS_DECLARATION__ASSERTED_RIGHTS:
				return assertedRights != null;
			case R1Package.RIGHTS_DECLARATION__RIGHTS_HOLDER:
				return rightsHolder != null;
			case R1Package.RIGHTS_DECLARATION__PERMISSIONS:
				return permissions != null;
		}
		return super.eIsSet(featureID);
	}

} //RightsDeclarationImpl
