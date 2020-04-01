/**
 */
package org.eclipse.mdht.hl7.fhir.resources.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.MedicinalProductName;
import org.eclipse.mdht.hl7.fhir.resources.MedicinalProductNameCountryLanguage;
import org.eclipse.mdht.hl7.fhir.resources.MedicinalProductNameNamePart;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medicinal Product Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductNameImpl#getProductName <em>Product Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductNameImpl#getNameParts <em>Name Part</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductNameImpl#getCountryLanguages <em>Country Language</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicinalProductNameImpl extends BackboneElementImpl implements MedicinalProductName {
	/**
	 * The cached value of the '{@link #getProductName() <em>Product Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductName()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String productName;

	/**
	 * The cached value of the '{@link #getNameParts() <em>Name Part</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameParts()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicinalProductNameNamePart> nameParts;

	/**
	 * The cached value of the '{@link #getCountryLanguages() <em>Country Language</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryLanguages()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicinalProductNameCountryLanguage> countryLanguages;

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
		return ResourcesPackage.eINSTANCE.getMedicinalProductName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getProductName() {
		return productName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProductName(org.eclipse.mdht.hl7.fhir.dataTypes.String newProductName, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldProductName = productName;
		productName = newProductName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_NAME__PRODUCT_NAME, oldProductName, newProductName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProductName(org.eclipse.mdht.hl7.fhir.dataTypes.String newProductName) {
		if (newProductName != productName) {
			NotificationChain msgs = null;
			if (productName != null)
				msgs = ((InternalEObject)productName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_NAME__PRODUCT_NAME, null, msgs);
			if (newProductName != null)
				msgs = ((InternalEObject)newProductName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_NAME__PRODUCT_NAME, null, msgs);
			msgs = basicSetProductName(newProductName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_NAME__PRODUCT_NAME, newProductName, newProductName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicinalProductNameNamePart> getNameParts() {
		if (nameParts == null) {
			nameParts = new EObjectContainmentEList<MedicinalProductNameNamePart>(MedicinalProductNameNamePart.class, this, ResourcesPackage.MEDICINAL_PRODUCT_NAME__NAME_PART);
		}
		return nameParts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicinalProductNameCountryLanguage> getCountryLanguages() {
		if (countryLanguages == null) {
			countryLanguages = new EObjectContainmentEList<MedicinalProductNameCountryLanguage>(MedicinalProductNameCountryLanguage.class, this, ResourcesPackage.MEDICINAL_PRODUCT_NAME__COUNTRY_LANGUAGE);
		}
		return countryLanguages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.MEDICINAL_PRODUCT_NAME__PRODUCT_NAME:
				return basicSetProductName(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_NAME__NAME_PART:
				return ((InternalEList<?>)getNameParts()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_NAME__COUNTRY_LANGUAGE:
				return ((InternalEList<?>)getCountryLanguages()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.MEDICINAL_PRODUCT_NAME__PRODUCT_NAME:
				return getProductName();
			case ResourcesPackage.MEDICINAL_PRODUCT_NAME__NAME_PART:
				return getNameParts();
			case ResourcesPackage.MEDICINAL_PRODUCT_NAME__COUNTRY_LANGUAGE:
				return getCountryLanguages();
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
			case ResourcesPackage.MEDICINAL_PRODUCT_NAME__PRODUCT_NAME:
				setProductName((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_NAME__NAME_PART:
				getNameParts().clear();
				getNameParts().addAll((Collection<? extends MedicinalProductNameNamePart>)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_NAME__COUNTRY_LANGUAGE:
				getCountryLanguages().clear();
				getCountryLanguages().addAll((Collection<? extends MedicinalProductNameCountryLanguage>)newValue);
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
			case ResourcesPackage.MEDICINAL_PRODUCT_NAME__PRODUCT_NAME:
				setProductName((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_NAME__NAME_PART:
				getNameParts().clear();
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_NAME__COUNTRY_LANGUAGE:
				getCountryLanguages().clear();
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
			case ResourcesPackage.MEDICINAL_PRODUCT_NAME__PRODUCT_NAME:
				return productName != null;
			case ResourcesPackage.MEDICINAL_PRODUCT_NAME__NAME_PART:
				return nameParts != null && !nameParts.isEmpty();
			case ResourcesPackage.MEDICINAL_PRODUCT_NAME__COUNTRY_LANGUAGE:
				return countryLanguages != null && !countryLanguages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicinalProductNameImpl
