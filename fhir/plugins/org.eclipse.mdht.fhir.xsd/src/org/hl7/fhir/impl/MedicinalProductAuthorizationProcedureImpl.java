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

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.MedicinalProductAuthorizationApplication;
import org.hl7.fhir.MedicinalProductAuthorizationProcedure;
import org.hl7.fhir.Period;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medicinal Product Authorization Procedure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductAuthorizationProcedureImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductAuthorizationProcedureImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductAuthorizationProcedureImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductAuthorizationProcedureImpl#getApplication <em>Application</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicinalProductAuthorizationProcedureImpl extends BackboneElementImpl implements MedicinalProductAuthorizationProcedure {
	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected Identifier number;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Period date;

	/**
	 * The cached value of the '{@link #getApplication() <em>Application</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplication()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicinalProductAuthorizationApplication> application;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicinalProductAuthorizationProcedureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicinalProductAuthorizationProcedure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumber(Identifier newNumber, NotificationChain msgs) {
		Identifier oldNumber = number;
		number = newNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__NUMBER, oldNumber, newNumber);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(Identifier newNumber) {
		if (newNumber != number) {
			NotificationChain msgs = null;
			if (number != null)
				msgs = ((InternalEObject)number).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__NUMBER, null, msgs);
			if (newNumber != null)
				msgs = ((InternalEObject)newNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__NUMBER, null, msgs);
			msgs = basicSetNumber(newNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__NUMBER, newNumber, newNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(CodeableConcept newType, NotificationChain msgs) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(Period newDate, NotificationChain msgs) {
		Period oldDate = date;
		date = newDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__DATE, oldDate, newDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Period newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicinalProductAuthorizationApplication> getApplication() {
		if (application == null) {
			application = new EObjectContainmentEList<MedicinalProductAuthorizationApplication>(MedicinalProductAuthorizationApplication.class, this, FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__APPLICATION);
		}
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__NUMBER:
				return basicSetNumber(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__DATE:
				return basicSetDate(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__APPLICATION:
				return ((InternalEList<?>)getApplication()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__NUMBER:
				return getNumber();
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__TYPE:
				return getType();
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__DATE:
				return getDate();
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__APPLICATION:
				return getApplication();
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
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__NUMBER:
				setNumber((Identifier)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__DATE:
				setDate((Period)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__APPLICATION:
				getApplication().clear();
				getApplication().addAll((Collection<? extends MedicinalProductAuthorizationApplication>)newValue);
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
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__NUMBER:
				setNumber((Identifier)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__DATE:
				setDate((Period)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__APPLICATION:
				getApplication().clear();
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
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__NUMBER:
				return number != null;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__TYPE:
				return type != null;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__DATE:
				return date != null;
			case FhirPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__APPLICATION:
				return application != null && !application.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicinalProductAuthorizationProcedureImpl
