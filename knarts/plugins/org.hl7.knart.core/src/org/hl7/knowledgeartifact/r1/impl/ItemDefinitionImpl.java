/**
 */
package org.hl7.knowledgeartifact.r1.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.hl7.knowledgeartifact.r1.ItemDefinition;
import org.hl7.knowledgeartifact.r1.R1Package;
import org.hl7.knowledgeartifact.r1.VersionedIdentifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.ItemDefinitionImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.ItemDefinitionImpl#getScopedIdentifier <em>Scoped Identifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ItemDefinitionImpl extends MinimalEObjectImpl.Container implements ItemDefinition {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected VersionedIdentifier identifier;

	/**
	 * The cached value of the '{@link #getScopedIdentifier() <em>Scoped Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScopedIdentifier()
	 * @generated
	 * @ordered
	 */
	protected VersionedIdentifier scopedIdentifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R1Package.Literals.ITEM_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionedIdentifier getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(VersionedIdentifier newIdentifier, NotificationChain msgs) {
		VersionedIdentifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.ITEM_DEFINITION__IDENTIFIER, oldIdentifier, newIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(VersionedIdentifier newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.ITEM_DEFINITION__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.ITEM_DEFINITION__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.ITEM_DEFINITION__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionedIdentifier getScopedIdentifier() {
		return scopedIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScopedIdentifier(VersionedIdentifier newScopedIdentifier, NotificationChain msgs) {
		VersionedIdentifier oldScopedIdentifier = scopedIdentifier;
		scopedIdentifier = newScopedIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.ITEM_DEFINITION__SCOPED_IDENTIFIER, oldScopedIdentifier, newScopedIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScopedIdentifier(VersionedIdentifier newScopedIdentifier) {
		if (newScopedIdentifier != scopedIdentifier) {
			NotificationChain msgs = null;
			if (scopedIdentifier != null)
				msgs = ((InternalEObject)scopedIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.ITEM_DEFINITION__SCOPED_IDENTIFIER, null, msgs);
			if (newScopedIdentifier != null)
				msgs = ((InternalEObject)newScopedIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.ITEM_DEFINITION__SCOPED_IDENTIFIER, null, msgs);
			msgs = basicSetScopedIdentifier(newScopedIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.ITEM_DEFINITION__SCOPED_IDENTIFIER, newScopedIdentifier, newScopedIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R1Package.ITEM_DEFINITION__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case R1Package.ITEM_DEFINITION__SCOPED_IDENTIFIER:
				return basicSetScopedIdentifier(null, msgs);
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
			case R1Package.ITEM_DEFINITION__IDENTIFIER:
				return getIdentifier();
			case R1Package.ITEM_DEFINITION__SCOPED_IDENTIFIER:
				return getScopedIdentifier();
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
			case R1Package.ITEM_DEFINITION__IDENTIFIER:
				setIdentifier((VersionedIdentifier)newValue);
				return;
			case R1Package.ITEM_DEFINITION__SCOPED_IDENTIFIER:
				setScopedIdentifier((VersionedIdentifier)newValue);
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
			case R1Package.ITEM_DEFINITION__IDENTIFIER:
				setIdentifier((VersionedIdentifier)null);
				return;
			case R1Package.ITEM_DEFINITION__SCOPED_IDENTIFIER:
				setScopedIdentifier((VersionedIdentifier)null);
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
			case R1Package.ITEM_DEFINITION__IDENTIFIER:
				return identifier != null;
			case R1Package.ITEM_DEFINITION__SCOPED_IDENTIFIER:
				return scopedIdentifier != null;
		}
		return super.eIsSet(featureID);
	}

} //ItemDefinitionImpl
