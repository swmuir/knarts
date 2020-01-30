/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Coding;
import fhiRCore.dataTypes.Reference;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.AuditEventSource;
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
 * An implementation of the model object '<em><b>Audit Event Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.AuditEventSourceImpl#getSite <em>Site</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.AuditEventSourceImpl#getObserver <em>Observer</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.AuditEventSourceImpl#getTypes <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuditEventSourceImpl extends BackboneElementImpl implements AuditEventSource {
	/**
	 * The cached value of the '{@link #getSite() <em>Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSite()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String site;

	/**
	 * The cached value of the '{@link #getObserver() <em>Observer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObserver()
	 * @generated
	 * @ordered
	 */
	protected Reference observer;

	/**
	 * The cached value of the '{@link #getTypes() <em>Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> types;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuditEventSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getAuditEventSource();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getSite() {
		return site;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSite(fhiRCore.dataTypes.String newSite, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldSite = site;
		site = newSite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.AUDIT_EVENT_SOURCE__SITE, oldSite, newSite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSite(fhiRCore.dataTypes.String newSite) {
		if (newSite != site) {
			NotificationChain msgs = null;
			if (site != null)
				msgs = ((InternalEObject)site).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.AUDIT_EVENT_SOURCE__SITE, null, msgs);
			if (newSite != null)
				msgs = ((InternalEObject)newSite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.AUDIT_EVENT_SOURCE__SITE, null, msgs);
			msgs = basicSetSite(newSite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.AUDIT_EVENT_SOURCE__SITE, newSite, newSite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getObserver() {
		return observer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObserver(Reference newObserver, NotificationChain msgs) {
		Reference oldObserver = observer;
		observer = newObserver;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.AUDIT_EVENT_SOURCE__OBSERVER, oldObserver, newObserver);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObserver(Reference newObserver) {
		if (newObserver != observer) {
			NotificationChain msgs = null;
			if (observer != null)
				msgs = ((InternalEObject)observer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.AUDIT_EVENT_SOURCE__OBSERVER, null, msgs);
			if (newObserver != null)
				msgs = ((InternalEObject)newObserver).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.AUDIT_EVENT_SOURCE__OBSERVER, null, msgs);
			msgs = basicSetObserver(newObserver, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.AUDIT_EVENT_SOURCE__OBSERVER, newObserver, newObserver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<Coding>(Coding.class, this, ResourcesPackage.AUDIT_EVENT_SOURCE__TYPE);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.AUDIT_EVENT_SOURCE__SITE:
				return basicSetSite(null, msgs);
			case ResourcesPackage.AUDIT_EVENT_SOURCE__OBSERVER:
				return basicSetObserver(null, msgs);
			case ResourcesPackage.AUDIT_EVENT_SOURCE__TYPE:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.AUDIT_EVENT_SOURCE__SITE:
				return getSite();
			case ResourcesPackage.AUDIT_EVENT_SOURCE__OBSERVER:
				return getObserver();
			case ResourcesPackage.AUDIT_EVENT_SOURCE__TYPE:
				return getTypes();
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
			case ResourcesPackage.AUDIT_EVENT_SOURCE__SITE:
				setSite((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.AUDIT_EVENT_SOURCE__OBSERVER:
				setObserver((Reference)newValue);
				return;
			case ResourcesPackage.AUDIT_EVENT_SOURCE__TYPE:
				getTypes().clear();
				getTypes().addAll((Collection<? extends Coding>)newValue);
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
			case ResourcesPackage.AUDIT_EVENT_SOURCE__SITE:
				setSite((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.AUDIT_EVENT_SOURCE__OBSERVER:
				setObserver((Reference)null);
				return;
			case ResourcesPackage.AUDIT_EVENT_SOURCE__TYPE:
				getTypes().clear();
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
			case ResourcesPackage.AUDIT_EVENT_SOURCE__SITE:
				return site != null;
			case ResourcesPackage.AUDIT_EVENT_SOURCE__OBSERVER:
				return observer != null;
			case ResourcesPackage.AUDIT_EVENT_SOURCE__TYPE:
				return types != null && !types.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AuditEventSourceImpl
