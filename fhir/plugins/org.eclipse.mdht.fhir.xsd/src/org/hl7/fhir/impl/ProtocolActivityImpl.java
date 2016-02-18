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

import org.hl7.fhir.Duration;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.ProtocolActivity;
import org.hl7.fhir.ProtocolComponent;
import org.hl7.fhir.ProtocolDetail;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protocol Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ProtocolActivityImpl#getAlternative <em>Alternative</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProtocolActivityImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProtocolActivityImpl#getFollowing <em>Following</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProtocolActivityImpl#getWait <em>Wait</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ProtocolActivityImpl#getDetail <em>Detail</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProtocolActivityImpl extends BackboneElementImpl implements ProtocolActivity {
	/**
	 * The cached value of the '{@link #getAlternative() <em>Alternative</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternative()
	 * @generated
	 * @ordered
	 */
	protected EList<Uri> alternative;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<ProtocolComponent> component;

	/**
	 * The cached value of the '{@link #getFollowing() <em>Following</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollowing()
	 * @generated
	 * @ordered
	 */
	protected EList<Uri> following;

	/**
	 * The cached value of the '{@link #getWait() <em>Wait</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWait()
	 * @generated
	 * @ordered
	 */
	protected Duration wait;

	/**
	 * The cached value of the '{@link #getDetail() <em>Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetail()
	 * @generated
	 * @ordered
	 */
	protected ProtocolDetail detail;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtocolActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getProtocolActivity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Uri> getAlternative() {
		if (alternative == null) {
			alternative = new EObjectContainmentEList<Uri>(Uri.class, this, FhirPackage.PROTOCOL_ACTIVITY__ALTERNATIVE);
		}
		return alternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProtocolComponent> getComponent() {
		if (component == null) {
			component = new EObjectContainmentEList<ProtocolComponent>(ProtocolComponent.class, this, FhirPackage.PROTOCOL_ACTIVITY__COMPONENT);
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Uri> getFollowing() {
		if (following == null) {
			following = new EObjectContainmentEList<Uri>(Uri.class, this, FhirPackage.PROTOCOL_ACTIVITY__FOLLOWING);
		}
		return following;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getWait() {
		return wait;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWait(Duration newWait, NotificationChain msgs) {
		Duration oldWait = wait;
		wait = newWait;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROTOCOL_ACTIVITY__WAIT, oldWait, newWait);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWait(Duration newWait) {
		if (newWait != wait) {
			NotificationChain msgs = null;
			if (wait != null)
				msgs = ((InternalEObject)wait).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROTOCOL_ACTIVITY__WAIT, null, msgs);
			if (newWait != null)
				msgs = ((InternalEObject)newWait).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROTOCOL_ACTIVITY__WAIT, null, msgs);
			msgs = basicSetWait(newWait, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROTOCOL_ACTIVITY__WAIT, newWait, newWait));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolDetail getDetail() {
		return detail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDetail(ProtocolDetail newDetail, NotificationChain msgs) {
		ProtocolDetail oldDetail = detail;
		detail = newDetail;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.PROTOCOL_ACTIVITY__DETAIL, oldDetail, newDetail);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetail(ProtocolDetail newDetail) {
		if (newDetail != detail) {
			NotificationChain msgs = null;
			if (detail != null)
				msgs = ((InternalEObject)detail).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROTOCOL_ACTIVITY__DETAIL, null, msgs);
			if (newDetail != null)
				msgs = ((InternalEObject)newDetail).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.PROTOCOL_ACTIVITY__DETAIL, null, msgs);
			msgs = basicSetDetail(newDetail, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.PROTOCOL_ACTIVITY__DETAIL, newDetail, newDetail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.PROTOCOL_ACTIVITY__ALTERNATIVE:
				return ((InternalEList<?>)getAlternative()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROTOCOL_ACTIVITY__COMPONENT:
				return ((InternalEList<?>)getComponent()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROTOCOL_ACTIVITY__FOLLOWING:
				return ((InternalEList<?>)getFollowing()).basicRemove(otherEnd, msgs);
			case FhirPackage.PROTOCOL_ACTIVITY__WAIT:
				return basicSetWait(null, msgs);
			case FhirPackage.PROTOCOL_ACTIVITY__DETAIL:
				return basicSetDetail(null, msgs);
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
			case FhirPackage.PROTOCOL_ACTIVITY__ALTERNATIVE:
				return getAlternative();
			case FhirPackage.PROTOCOL_ACTIVITY__COMPONENT:
				return getComponent();
			case FhirPackage.PROTOCOL_ACTIVITY__FOLLOWING:
				return getFollowing();
			case FhirPackage.PROTOCOL_ACTIVITY__WAIT:
				return getWait();
			case FhirPackage.PROTOCOL_ACTIVITY__DETAIL:
				return getDetail();
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
			case FhirPackage.PROTOCOL_ACTIVITY__ALTERNATIVE:
				getAlternative().clear();
				getAlternative().addAll((Collection<? extends Uri>)newValue);
				return;
			case FhirPackage.PROTOCOL_ACTIVITY__COMPONENT:
				getComponent().clear();
				getComponent().addAll((Collection<? extends ProtocolComponent>)newValue);
				return;
			case FhirPackage.PROTOCOL_ACTIVITY__FOLLOWING:
				getFollowing().clear();
				getFollowing().addAll((Collection<? extends Uri>)newValue);
				return;
			case FhirPackage.PROTOCOL_ACTIVITY__WAIT:
				setWait((Duration)newValue);
				return;
			case FhirPackage.PROTOCOL_ACTIVITY__DETAIL:
				setDetail((ProtocolDetail)newValue);
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
			case FhirPackage.PROTOCOL_ACTIVITY__ALTERNATIVE:
				getAlternative().clear();
				return;
			case FhirPackage.PROTOCOL_ACTIVITY__COMPONENT:
				getComponent().clear();
				return;
			case FhirPackage.PROTOCOL_ACTIVITY__FOLLOWING:
				getFollowing().clear();
				return;
			case FhirPackage.PROTOCOL_ACTIVITY__WAIT:
				setWait((Duration)null);
				return;
			case FhirPackage.PROTOCOL_ACTIVITY__DETAIL:
				setDetail((ProtocolDetail)null);
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
			case FhirPackage.PROTOCOL_ACTIVITY__ALTERNATIVE:
				return alternative != null && !alternative.isEmpty();
			case FhirPackage.PROTOCOL_ACTIVITY__COMPONENT:
				return component != null && !component.isEmpty();
			case FhirPackage.PROTOCOL_ACTIVITY__FOLLOWING:
				return following != null && !following.isEmpty();
			case FhirPackage.PROTOCOL_ACTIVITY__WAIT:
				return wait != null;
			case FhirPackage.PROTOCOL_ACTIVITY__DETAIL:
				return detail != null;
		}
		return super.eIsSet(featureID);
	}

} //ProtocolActivityImpl
