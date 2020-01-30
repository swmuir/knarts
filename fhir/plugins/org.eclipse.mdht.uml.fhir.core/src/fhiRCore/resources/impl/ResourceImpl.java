/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.Id;
import fhiRCore.dataTypes.Meta;
import fhiRCore.dataTypes.Uri;

import fhiRCore.dataTypes.impl.BaseImpl;

import fhiRCore.resources.Resource;
import fhiRCore.resources.ResourcesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.ResourceImpl#getId <em>Id</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ResourceImpl#getMeta <em>Meta</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ResourceImpl#getImplicitRules <em>Implicit Rules</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ResourceImpl#getLanguage <em>Language</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ResourceImpl extends BaseImpl implements Resource {
	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected Id id;

	/**
	 * The cached value of the '{@link #getMeta() <em>Meta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeta()
	 * @generated
	 * @ordered
	 */
	protected Meta meta;

	/**
	 * The cached value of the '{@link #getImplicitRules() <em>Implicit Rules</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplicitRules()
	 * @generated
	 * @ordered
	 */
	protected Uri implicitRules;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected Code language;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getResource();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetId(Id newId, NotificationChain msgs) {
		Id oldId = id;
		id = newId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESOURCE__ID, oldId, newId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(Id newId) {
		if (newId != id) {
			NotificationChain msgs = null;
			if (id != null)
				msgs = ((InternalEObject)id).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESOURCE__ID, null, msgs);
			if (newId != null)
				msgs = ((InternalEObject)newId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESOURCE__ID, null, msgs);
			msgs = basicSetId(newId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESOURCE__ID, newId, newId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Meta getMeta() {
		return meta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeta(Meta newMeta, NotificationChain msgs) {
		Meta oldMeta = meta;
		meta = newMeta;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESOURCE__META, oldMeta, newMeta);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeta(Meta newMeta) {
		if (newMeta != meta) {
			NotificationChain msgs = null;
			if (meta != null)
				msgs = ((InternalEObject)meta).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESOURCE__META, null, msgs);
			if (newMeta != null)
				msgs = ((InternalEObject)newMeta).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESOURCE__META, null, msgs);
			msgs = basicSetMeta(newMeta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESOURCE__META, newMeta, newMeta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getImplicitRules() {
		return implicitRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplicitRules(Uri newImplicitRules, NotificationChain msgs) {
		Uri oldImplicitRules = implicitRules;
		implicitRules = newImplicitRules;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESOURCE__IMPLICIT_RULES, oldImplicitRules, newImplicitRules);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplicitRules(Uri newImplicitRules) {
		if (newImplicitRules != implicitRules) {
			NotificationChain msgs = null;
			if (implicitRules != null)
				msgs = ((InternalEObject)implicitRules).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESOURCE__IMPLICIT_RULES, null, msgs);
			if (newImplicitRules != null)
				msgs = ((InternalEObject)newImplicitRules).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESOURCE__IMPLICIT_RULES, null, msgs);
			msgs = basicSetImplicitRules(newImplicitRules, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESOURCE__IMPLICIT_RULES, newImplicitRules, newImplicitRules));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLanguage(Code newLanguage, NotificationChain msgs) {
		Code oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESOURCE__LANGUAGE, oldLanguage, newLanguage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(Code newLanguage) {
		if (newLanguage != language) {
			NotificationChain msgs = null;
			if (language != null)
				msgs = ((InternalEObject)language).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESOURCE__LANGUAGE, null, msgs);
			if (newLanguage != null)
				msgs = ((InternalEObject)newLanguage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.RESOURCE__LANGUAGE, null, msgs);
			msgs = basicSetLanguage(newLanguage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.RESOURCE__LANGUAGE, newLanguage, newLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.RESOURCE__ID:
				return basicSetId(null, msgs);
			case ResourcesPackage.RESOURCE__META:
				return basicSetMeta(null, msgs);
			case ResourcesPackage.RESOURCE__IMPLICIT_RULES:
				return basicSetImplicitRules(null, msgs);
			case ResourcesPackage.RESOURCE__LANGUAGE:
				return basicSetLanguage(null, msgs);
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
			case ResourcesPackage.RESOURCE__ID:
				return getId();
			case ResourcesPackage.RESOURCE__META:
				return getMeta();
			case ResourcesPackage.RESOURCE__IMPLICIT_RULES:
				return getImplicitRules();
			case ResourcesPackage.RESOURCE__LANGUAGE:
				return getLanguage();
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
			case ResourcesPackage.RESOURCE__ID:
				setId((Id)newValue);
				return;
			case ResourcesPackage.RESOURCE__META:
				setMeta((Meta)newValue);
				return;
			case ResourcesPackage.RESOURCE__IMPLICIT_RULES:
				setImplicitRules((Uri)newValue);
				return;
			case ResourcesPackage.RESOURCE__LANGUAGE:
				setLanguage((Code)newValue);
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
			case ResourcesPackage.RESOURCE__ID:
				setId((Id)null);
				return;
			case ResourcesPackage.RESOURCE__META:
				setMeta((Meta)null);
				return;
			case ResourcesPackage.RESOURCE__IMPLICIT_RULES:
				setImplicitRules((Uri)null);
				return;
			case ResourcesPackage.RESOURCE__LANGUAGE:
				setLanguage((Code)null);
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
			case ResourcesPackage.RESOURCE__ID:
				return id != null;
			case ResourcesPackage.RESOURCE__META:
				return meta != null;
			case ResourcesPackage.RESOURCE__IMPLICIT_RULES:
				return implicitRules != null;
			case ResourcesPackage.RESOURCE__LANGUAGE:
				return language != null;
		}
		return super.eIsSet(featureID);
	}

} //ResourceImpl
