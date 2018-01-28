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

import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Instant;
import org.hl7.fhir.Reference;
import org.hl7.fhir.UserSession;
import org.hl7.fhir.UserSessionContext;
import org.hl7.fhir.UserSessionStatus1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Session</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.UserSessionImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.UserSessionImpl#getUser <em>User</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.UserSessionImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.UserSessionImpl#getWorkstation <em>Workstation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.UserSessionImpl#getFocus <em>Focus</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.UserSessionImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.UserSessionImpl#getExpires <em>Expires</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.UserSessionImpl#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserSessionImpl extends DomainResourceImpl implements UserSession {
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
	 * The cached value of the '{@link #getUser() <em>User</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected Reference user;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected UserSessionStatus1 status;

	/**
	 * The cached value of the '{@link #getWorkstation() <em>Workstation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkstation()
	 * @generated
	 * @ordered
	 */
	protected Identifier workstation;

	/**
	 * The cached value of the '{@link #getFocus() <em>Focus</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocus()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> focus;

	/**
	 * The cached value of the '{@link #getCreated() <em>Created</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected Instant created;

	/**
	 * The cached value of the '{@link #getExpires() <em>Expires</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpires()
	 * @generated
	 * @ordered
	 */
	protected Instant expires;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected EList<UserSessionContext> context;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserSessionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getUserSession();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.USER_SESSION__IDENTIFIER, oldIdentifier, newIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(Identifier newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.USER_SESSION__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.USER_SESSION__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.USER_SESSION__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUser(Reference newUser, NotificationChain msgs) {
		Reference oldUser = user;
		user = newUser;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.USER_SESSION__USER, oldUser, newUser);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(Reference newUser) {
		if (newUser != user) {
			NotificationChain msgs = null;
			if (user != null)
				msgs = ((InternalEObject)user).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.USER_SESSION__USER, null, msgs);
			if (newUser != null)
				msgs = ((InternalEObject)newUser).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.USER_SESSION__USER, null, msgs);
			msgs = basicSetUser(newUser, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.USER_SESSION__USER, newUser, newUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserSessionStatus1 getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(UserSessionStatus1 newStatus, NotificationChain msgs) {
		UserSessionStatus1 oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.USER_SESSION__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(UserSessionStatus1 newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.USER_SESSION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.USER_SESSION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.USER_SESSION__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getWorkstation() {
		return workstation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkstation(Identifier newWorkstation, NotificationChain msgs) {
		Identifier oldWorkstation = workstation;
		workstation = newWorkstation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.USER_SESSION__WORKSTATION, oldWorkstation, newWorkstation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorkstation(Identifier newWorkstation) {
		if (newWorkstation != workstation) {
			NotificationChain msgs = null;
			if (workstation != null)
				msgs = ((InternalEObject)workstation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.USER_SESSION__WORKSTATION, null, msgs);
			if (newWorkstation != null)
				msgs = ((InternalEObject)newWorkstation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.USER_SESSION__WORKSTATION, null, msgs);
			msgs = basicSetWorkstation(newWorkstation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.USER_SESSION__WORKSTATION, newWorkstation, newWorkstation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getFocus() {
		if (focus == null) {
			focus = new EObjectContainmentEList<Reference>(Reference.class, this, FhirPackage.USER_SESSION__FOCUS);
		}
		return focus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant getCreated() {
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreated(Instant newCreated, NotificationChain msgs) {
		Instant oldCreated = created;
		created = newCreated;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.USER_SESSION__CREATED, oldCreated, newCreated);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreated(Instant newCreated) {
		if (newCreated != created) {
			NotificationChain msgs = null;
			if (created != null)
				msgs = ((InternalEObject)created).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.USER_SESSION__CREATED, null, msgs);
			if (newCreated != null)
				msgs = ((InternalEObject)newCreated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.USER_SESSION__CREATED, null, msgs);
			msgs = basicSetCreated(newCreated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.USER_SESSION__CREATED, newCreated, newCreated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant getExpires() {
		return expires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpires(Instant newExpires, NotificationChain msgs) {
		Instant oldExpires = expires;
		expires = newExpires;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.USER_SESSION__EXPIRES, oldExpires, newExpires);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpires(Instant newExpires) {
		if (newExpires != expires) {
			NotificationChain msgs = null;
			if (expires != null)
				msgs = ((InternalEObject)expires).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.USER_SESSION__EXPIRES, null, msgs);
			if (newExpires != null)
				msgs = ((InternalEObject)newExpires).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.USER_SESSION__EXPIRES, null, msgs);
			msgs = basicSetExpires(newExpires, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.USER_SESSION__EXPIRES, newExpires, newExpires));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserSessionContext> getContext() {
		if (context == null) {
			context = new EObjectContainmentEList<UserSessionContext>(UserSessionContext.class, this, FhirPackage.USER_SESSION__CONTEXT);
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.USER_SESSION__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case FhirPackage.USER_SESSION__USER:
				return basicSetUser(null, msgs);
			case FhirPackage.USER_SESSION__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.USER_SESSION__WORKSTATION:
				return basicSetWorkstation(null, msgs);
			case FhirPackage.USER_SESSION__FOCUS:
				return ((InternalEList<?>)getFocus()).basicRemove(otherEnd, msgs);
			case FhirPackage.USER_SESSION__CREATED:
				return basicSetCreated(null, msgs);
			case FhirPackage.USER_SESSION__EXPIRES:
				return basicSetExpires(null, msgs);
			case FhirPackage.USER_SESSION__CONTEXT:
				return ((InternalEList<?>)getContext()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.USER_SESSION__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.USER_SESSION__USER:
				return getUser();
			case FhirPackage.USER_SESSION__STATUS:
				return getStatus();
			case FhirPackage.USER_SESSION__WORKSTATION:
				return getWorkstation();
			case FhirPackage.USER_SESSION__FOCUS:
				return getFocus();
			case FhirPackage.USER_SESSION__CREATED:
				return getCreated();
			case FhirPackage.USER_SESSION__EXPIRES:
				return getExpires();
			case FhirPackage.USER_SESSION__CONTEXT:
				return getContext();
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
			case FhirPackage.USER_SESSION__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirPackage.USER_SESSION__USER:
				setUser((Reference)newValue);
				return;
			case FhirPackage.USER_SESSION__STATUS:
				setStatus((UserSessionStatus1)newValue);
				return;
			case FhirPackage.USER_SESSION__WORKSTATION:
				setWorkstation((Identifier)newValue);
				return;
			case FhirPackage.USER_SESSION__FOCUS:
				getFocus().clear();
				getFocus().addAll((Collection<? extends Reference>)newValue);
				return;
			case FhirPackage.USER_SESSION__CREATED:
				setCreated((Instant)newValue);
				return;
			case FhirPackage.USER_SESSION__EXPIRES:
				setExpires((Instant)newValue);
				return;
			case FhirPackage.USER_SESSION__CONTEXT:
				getContext().clear();
				getContext().addAll((Collection<? extends UserSessionContext>)newValue);
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
			case FhirPackage.USER_SESSION__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirPackage.USER_SESSION__USER:
				setUser((Reference)null);
				return;
			case FhirPackage.USER_SESSION__STATUS:
				setStatus((UserSessionStatus1)null);
				return;
			case FhirPackage.USER_SESSION__WORKSTATION:
				setWorkstation((Identifier)null);
				return;
			case FhirPackage.USER_SESSION__FOCUS:
				getFocus().clear();
				return;
			case FhirPackage.USER_SESSION__CREATED:
				setCreated((Instant)null);
				return;
			case FhirPackage.USER_SESSION__EXPIRES:
				setExpires((Instant)null);
				return;
			case FhirPackage.USER_SESSION__CONTEXT:
				getContext().clear();
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
			case FhirPackage.USER_SESSION__IDENTIFIER:
				return identifier != null;
			case FhirPackage.USER_SESSION__USER:
				return user != null;
			case FhirPackage.USER_SESSION__STATUS:
				return status != null;
			case FhirPackage.USER_SESSION__WORKSTATION:
				return workstation != null;
			case FhirPackage.USER_SESSION__FOCUS:
				return focus != null && !focus.isEmpty();
			case FhirPackage.USER_SESSION__CREATED:
				return created != null;
			case FhirPackage.USER_SESSION__EXPIRES:
				return expires != null;
			case FhirPackage.USER_SESSION__CONTEXT:
				return context != null && !context.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UserSessionImpl
