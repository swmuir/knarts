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
import org.hl7.fhir.MedicinalProductCountryLanguage;
import org.hl7.fhir.MedicinalProductName;
import org.hl7.fhir.MedicinalProductNamePart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medicinal Product Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductNameImpl#getFullName <em>Full Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductNameImpl#getNamePart <em>Name Part</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductNameImpl#getCountryLanguage <em>Country Language</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicinalProductNameImpl extends BackboneElementImpl implements MedicinalProductName {
	/**
	 * The cached value of the '{@link #getFullName() <em>Full Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String fullName;

	/**
	 * The cached value of the '{@link #getNamePart() <em>Name Part</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamePart()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicinalProductNamePart> namePart;

	/**
	 * The cached value of the '{@link #getCountryLanguage() <em>Country Language</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryLanguage()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicinalProductCountryLanguage> countryLanguage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicinalProductNameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicinalProductName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getFullName() {
		return fullName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFullName(org.hl7.fhir.String newFullName, NotificationChain msgs) {
		org.hl7.fhir.String oldFullName = fullName;
		fullName = newFullName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_NAME__FULL_NAME, oldFullName, newFullName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFullName(org.hl7.fhir.String newFullName) {
		if (newFullName != fullName) {
			NotificationChain msgs = null;
			if (fullName != null)
				msgs = ((InternalEObject)fullName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_NAME__FULL_NAME, null, msgs);
			if (newFullName != null)
				msgs = ((InternalEObject)newFullName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_NAME__FULL_NAME, null, msgs);
			msgs = basicSetFullName(newFullName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_NAME__FULL_NAME, newFullName, newFullName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicinalProductNamePart> getNamePart() {
		if (namePart == null) {
			namePart = new EObjectContainmentEList<MedicinalProductNamePart>(MedicinalProductNamePart.class, this, FhirPackage.MEDICINAL_PRODUCT_NAME__NAME_PART);
		}
		return namePart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicinalProductCountryLanguage> getCountryLanguage() {
		if (countryLanguage == null) {
			countryLanguage = new EObjectContainmentEList<MedicinalProductCountryLanguage>(MedicinalProductCountryLanguage.class, this, FhirPackage.MEDICINAL_PRODUCT_NAME__COUNTRY_LANGUAGE);
		}
		return countryLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICINAL_PRODUCT_NAME__FULL_NAME:
				return basicSetFullName(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_NAME__NAME_PART:
				return ((InternalEList<?>)getNamePart()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_NAME__COUNTRY_LANGUAGE:
				return ((InternalEList<?>)getCountryLanguage()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.MEDICINAL_PRODUCT_NAME__FULL_NAME:
				return getFullName();
			case FhirPackage.MEDICINAL_PRODUCT_NAME__NAME_PART:
				return getNamePart();
			case FhirPackage.MEDICINAL_PRODUCT_NAME__COUNTRY_LANGUAGE:
				return getCountryLanguage();
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
			case FhirPackage.MEDICINAL_PRODUCT_NAME__FULL_NAME:
				setFullName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_NAME__NAME_PART:
				getNamePart().clear();
				getNamePart().addAll((Collection<? extends MedicinalProductNamePart>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_NAME__COUNTRY_LANGUAGE:
				getCountryLanguage().clear();
				getCountryLanguage().addAll((Collection<? extends MedicinalProductCountryLanguage>)newValue);
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
			case FhirPackage.MEDICINAL_PRODUCT_NAME__FULL_NAME:
				setFullName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_NAME__NAME_PART:
				getNamePart().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_NAME__COUNTRY_LANGUAGE:
				getCountryLanguage().clear();
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
			case FhirPackage.MEDICINAL_PRODUCT_NAME__FULL_NAME:
				return fullName != null;
			case FhirPackage.MEDICINAL_PRODUCT_NAME__NAME_PART:
				return namePart != null && !namePart.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_NAME__COUNTRY_LANGUAGE:
				return countryLanguage != null && !countryLanguage.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicinalProductNameImpl
