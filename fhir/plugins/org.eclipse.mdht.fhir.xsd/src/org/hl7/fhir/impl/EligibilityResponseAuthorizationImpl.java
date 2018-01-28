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

import org.hl7.fhir.Annotation;
import org.hl7.fhir.EligibilityResponseAuthorization;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.PositiveInt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eligibility Response Authorization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.EligibilityResponseAuthorizationImpl#getAuthorizationSequence <em>Authorization Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityResponseAuthorizationImpl#getRequired <em>Required</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EligibilityResponseAuthorizationImpl#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EligibilityResponseAuthorizationImpl extends BackboneElementImpl implements EligibilityResponseAuthorization {
	/**
	 * The cached value of the '{@link #getAuthorizationSequence() <em>Authorization Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizationSequence()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt authorizationSequence;

	/**
	 * The cached value of the '{@link #getRequired() <em>Required</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.Boolean required;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> note;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EligibilityResponseAuthorizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getEligibilityResponseAuthorization();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getAuthorizationSequence() {
		return authorizationSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthorizationSequence(PositiveInt newAuthorizationSequence, NotificationChain msgs) {
		PositiveInt oldAuthorizationSequence = authorizationSequence;
		authorizationSequence = newAuthorizationSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE_AUTHORIZATION__AUTHORIZATION_SEQUENCE, oldAuthorizationSequence, newAuthorizationSequence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthorizationSequence(PositiveInt newAuthorizationSequence) {
		if (newAuthorizationSequence != authorizationSequence) {
			NotificationChain msgs = null;
			if (authorizationSequence != null)
				msgs = ((InternalEObject)authorizationSequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE_AUTHORIZATION__AUTHORIZATION_SEQUENCE, null, msgs);
			if (newAuthorizationSequence != null)
				msgs = ((InternalEObject)newAuthorizationSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE_AUTHORIZATION__AUTHORIZATION_SEQUENCE, null, msgs);
			msgs = basicSetAuthorizationSequence(newAuthorizationSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE_AUTHORIZATION__AUTHORIZATION_SEQUENCE, newAuthorizationSequence, newAuthorizationSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.Boolean getRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequired(org.hl7.fhir.Boolean newRequired, NotificationChain msgs) {
		org.hl7.fhir.Boolean oldRequired = required;
		required = newRequired;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE_AUTHORIZATION__REQUIRED, oldRequired, newRequired);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(org.hl7.fhir.Boolean newRequired) {
		if (newRequired != required) {
			NotificationChain msgs = null;
			if (required != null)
				msgs = ((InternalEObject)required).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE_AUTHORIZATION__REQUIRED, null, msgs);
			if (newRequired != null)
				msgs = ((InternalEObject)newRequired).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ELIGIBILITY_RESPONSE_AUTHORIZATION__REQUIRED, null, msgs);
			msgs = basicSetRequired(newRequired, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ELIGIBILITY_RESPONSE_AUTHORIZATION__REQUIRED, newRequired, newRequired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Annotation>(Annotation.class, this, FhirPackage.ELIGIBILITY_RESPONSE_AUTHORIZATION__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.ELIGIBILITY_RESPONSE_AUTHORIZATION__AUTHORIZATION_SEQUENCE:
				return basicSetAuthorizationSequence(null, msgs);
			case FhirPackage.ELIGIBILITY_RESPONSE_AUTHORIZATION__REQUIRED:
				return basicSetRequired(null, msgs);
			case FhirPackage.ELIGIBILITY_RESPONSE_AUTHORIZATION__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.ELIGIBILITY_RESPONSE_AUTHORIZATION__AUTHORIZATION_SEQUENCE:
				return getAuthorizationSequence();
			case FhirPackage.ELIGIBILITY_RESPONSE_AUTHORIZATION__REQUIRED:
				return getRequired();
			case FhirPackage.ELIGIBILITY_RESPONSE_AUTHORIZATION__NOTE:
				return getNote();
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
			case FhirPackage.ELIGIBILITY_RESPONSE_AUTHORIZATION__AUTHORIZATION_SEQUENCE:
				setAuthorizationSequence((PositiveInt)newValue);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE_AUTHORIZATION__REQUIRED:
				setRequired((org.hl7.fhir.Boolean)newValue);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE_AUTHORIZATION__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Annotation>)newValue);
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
			case FhirPackage.ELIGIBILITY_RESPONSE_AUTHORIZATION__AUTHORIZATION_SEQUENCE:
				setAuthorizationSequence((PositiveInt)null);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE_AUTHORIZATION__REQUIRED:
				setRequired((org.hl7.fhir.Boolean)null);
				return;
			case FhirPackage.ELIGIBILITY_RESPONSE_AUTHORIZATION__NOTE:
				getNote().clear();
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
			case FhirPackage.ELIGIBILITY_RESPONSE_AUTHORIZATION__AUTHORIZATION_SEQUENCE:
				return authorizationSequence != null;
			case FhirPackage.ELIGIBILITY_RESPONSE_AUTHORIZATION__REQUIRED:
				return required != null;
			case FhirPackage.ELIGIBILITY_RESPONSE_AUTHORIZATION__NOTE:
				return note != null && !note.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EligibilityResponseAuthorizationImpl
