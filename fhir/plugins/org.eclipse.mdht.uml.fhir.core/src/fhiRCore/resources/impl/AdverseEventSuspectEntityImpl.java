/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Reference;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.AdverseEventSuspectEntity;
import fhiRCore.resources.AdverseEventSuspectEntityCausality;
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
 * An implementation of the model object '<em><b>Adverse Event Suspect Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.AdverseEventSuspectEntityImpl#getInstance <em>Instance</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.AdverseEventSuspectEntityImpl#getCausalities <em>Causality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdverseEventSuspectEntityImpl extends BackboneElementImpl implements AdverseEventSuspectEntity {
	/**
	 * The cached value of the '{@link #getInstance() <em>Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstance()
	 * @generated
	 * @ordered
	 */
	protected Reference instance;

	/**
	 * The cached value of the '{@link #getCausalities() <em>Causality</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCausalities()
	 * @generated
	 * @ordered
	 */
	protected EList<AdverseEventSuspectEntityCausality> causalities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdverseEventSuspectEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getAdverseEventSuspectEntity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getInstance() {
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstance(Reference newInstance, NotificationChain msgs) {
		Reference oldInstance = instance;
		instance = newInstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ADVERSE_EVENT_SUSPECT_ENTITY__INSTANCE, oldInstance, newInstance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstance(Reference newInstance) {
		if (newInstance != instance) {
			NotificationChain msgs = null;
			if (instance != null)
				msgs = ((InternalEObject)instance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ADVERSE_EVENT_SUSPECT_ENTITY__INSTANCE, null, msgs);
			if (newInstance != null)
				msgs = ((InternalEObject)newInstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ADVERSE_EVENT_SUSPECT_ENTITY__INSTANCE, null, msgs);
			msgs = basicSetInstance(newInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ADVERSE_EVENT_SUSPECT_ENTITY__INSTANCE, newInstance, newInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdverseEventSuspectEntityCausality> getCausalities() {
		if (causalities == null) {
			causalities = new EObjectContainmentEList<AdverseEventSuspectEntityCausality>(AdverseEventSuspectEntityCausality.class, this, ResourcesPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY);
		}
		return causalities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.ADVERSE_EVENT_SUSPECT_ENTITY__INSTANCE:
				return basicSetInstance(null, msgs);
			case ResourcesPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY:
				return ((InternalEList<?>)getCausalities()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.ADVERSE_EVENT_SUSPECT_ENTITY__INSTANCE:
				return getInstance();
			case ResourcesPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY:
				return getCausalities();
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
			case ResourcesPackage.ADVERSE_EVENT_SUSPECT_ENTITY__INSTANCE:
				setInstance((Reference)newValue);
				return;
			case ResourcesPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY:
				getCausalities().clear();
				getCausalities().addAll((Collection<? extends AdverseEventSuspectEntityCausality>)newValue);
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
			case ResourcesPackage.ADVERSE_EVENT_SUSPECT_ENTITY__INSTANCE:
				setInstance((Reference)null);
				return;
			case ResourcesPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY:
				getCausalities().clear();
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
			case ResourcesPackage.ADVERSE_EVENT_SUSPECT_ENTITY__INSTANCE:
				return instance != null;
			case ResourcesPackage.ADVERSE_EVENT_SUSPECT_ENTITY__CAUSALITY:
				return causalities != null && !causalities.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AdverseEventSuspectEntityImpl
