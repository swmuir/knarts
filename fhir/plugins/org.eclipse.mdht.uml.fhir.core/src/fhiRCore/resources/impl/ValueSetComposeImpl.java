/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Date;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.ResourcesPackage;
import fhiRCore.resources.ValueSetCompose;
import fhiRCore.resources.ValueSetComposeConceptSet;

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
 * An implementation of the model object '<em><b>Value Set Compose</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.ValueSetComposeImpl#getLockedDate <em>Locked Date</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ValueSetComposeImpl#getInactive <em>Inactive</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ValueSetComposeImpl#getIncludes <em>Include</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ValueSetComposeImpl#getExcludes <em>Exclude</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueSetComposeImpl extends BackboneElementImpl implements ValueSetCompose {
	/**
	 * The cached value of the '{@link #getLockedDate() <em>Locked Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLockedDate()
	 * @generated
	 * @ordered
	 */
	protected Date lockedDate;

	/**
	 * The cached value of the '{@link #getInactive() <em>Inactive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInactive()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Boolean inactive;

	/**
	 * The cached value of the '{@link #getIncludes() <em>Include</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludes()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSetComposeConceptSet> includes;

	/**
	 * The cached value of the '{@link #getExcludes() <em>Exclude</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludes()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSetComposeConceptSet> excludes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueSetComposeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getValueSetCompose();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLockedDate() {
		return lockedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLockedDate(Date newLockedDate, NotificationChain msgs) {
		Date oldLockedDate = lockedDate;
		lockedDate = newLockedDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.VALUE_SET_COMPOSE__LOCKED_DATE, oldLockedDate, newLockedDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLockedDate(Date newLockedDate) {
		if (newLockedDate != lockedDate) {
			NotificationChain msgs = null;
			if (lockedDate != null)
				msgs = ((InternalEObject)lockedDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VALUE_SET_COMPOSE__LOCKED_DATE, null, msgs);
			if (newLockedDate != null)
				msgs = ((InternalEObject)newLockedDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VALUE_SET_COMPOSE__LOCKED_DATE, null, msgs);
			msgs = basicSetLockedDate(newLockedDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.VALUE_SET_COMPOSE__LOCKED_DATE, newLockedDate, newLockedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Boolean getInactive() {
		return inactive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInactive(fhiRCore.dataTypes.Boolean newInactive, NotificationChain msgs) {
		fhiRCore.dataTypes.Boolean oldInactive = inactive;
		inactive = newInactive;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.VALUE_SET_COMPOSE__INACTIVE, oldInactive, newInactive);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInactive(fhiRCore.dataTypes.Boolean newInactive) {
		if (newInactive != inactive) {
			NotificationChain msgs = null;
			if (inactive != null)
				msgs = ((InternalEObject)inactive).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VALUE_SET_COMPOSE__INACTIVE, null, msgs);
			if (newInactive != null)
				msgs = ((InternalEObject)newInactive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VALUE_SET_COMPOSE__INACTIVE, null, msgs);
			msgs = basicSetInactive(newInactive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.VALUE_SET_COMPOSE__INACTIVE, newInactive, newInactive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSetComposeConceptSet> getIncludes() {
		if (includes == null) {
			includes = new EObjectContainmentEList<ValueSetComposeConceptSet>(ValueSetComposeConceptSet.class, this, ResourcesPackage.VALUE_SET_COMPOSE__INCLUDE);
		}
		return includes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSetComposeConceptSet> getExcludes() {
		if (excludes == null) {
			excludes = new EObjectContainmentEList<ValueSetComposeConceptSet>(ValueSetComposeConceptSet.class, this, ResourcesPackage.VALUE_SET_COMPOSE__EXCLUDE);
		}
		return excludes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.VALUE_SET_COMPOSE__LOCKED_DATE:
				return basicSetLockedDate(null, msgs);
			case ResourcesPackage.VALUE_SET_COMPOSE__INACTIVE:
				return basicSetInactive(null, msgs);
			case ResourcesPackage.VALUE_SET_COMPOSE__INCLUDE:
				return ((InternalEList<?>)getIncludes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.VALUE_SET_COMPOSE__EXCLUDE:
				return ((InternalEList<?>)getExcludes()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.VALUE_SET_COMPOSE__LOCKED_DATE:
				return getLockedDate();
			case ResourcesPackage.VALUE_SET_COMPOSE__INACTIVE:
				return getInactive();
			case ResourcesPackage.VALUE_SET_COMPOSE__INCLUDE:
				return getIncludes();
			case ResourcesPackage.VALUE_SET_COMPOSE__EXCLUDE:
				return getExcludes();
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
			case ResourcesPackage.VALUE_SET_COMPOSE__LOCKED_DATE:
				setLockedDate((Date)newValue);
				return;
			case ResourcesPackage.VALUE_SET_COMPOSE__INACTIVE:
				setInactive((fhiRCore.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.VALUE_SET_COMPOSE__INCLUDE:
				getIncludes().clear();
				getIncludes().addAll((Collection<? extends ValueSetComposeConceptSet>)newValue);
				return;
			case ResourcesPackage.VALUE_SET_COMPOSE__EXCLUDE:
				getExcludes().clear();
				getExcludes().addAll((Collection<? extends ValueSetComposeConceptSet>)newValue);
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
			case ResourcesPackage.VALUE_SET_COMPOSE__LOCKED_DATE:
				setLockedDate((Date)null);
				return;
			case ResourcesPackage.VALUE_SET_COMPOSE__INACTIVE:
				setInactive((fhiRCore.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.VALUE_SET_COMPOSE__INCLUDE:
				getIncludes().clear();
				return;
			case ResourcesPackage.VALUE_SET_COMPOSE__EXCLUDE:
				getExcludes().clear();
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
			case ResourcesPackage.VALUE_SET_COMPOSE__LOCKED_DATE:
				return lockedDate != null;
			case ResourcesPackage.VALUE_SET_COMPOSE__INACTIVE:
				return inactive != null;
			case ResourcesPackage.VALUE_SET_COMPOSE__INCLUDE:
				return includes != null && !includes.isEmpty();
			case ResourcesPackage.VALUE_SET_COMPOSE__EXCLUDE:
				return excludes != null && !excludes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ValueSetComposeImpl
