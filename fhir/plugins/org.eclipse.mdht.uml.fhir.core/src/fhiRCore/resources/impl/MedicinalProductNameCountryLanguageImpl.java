/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.CodeableConcept;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.MedicinalProductNameCountryLanguage;
import fhiRCore.resources.ResourcesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medicinal Product Name Country Language</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.MedicinalProductNameCountryLanguageImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicinalProductNameCountryLanguageImpl#getJurisdiction <em>Jurisdiction</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicinalProductNameCountryLanguageImpl#getLanguage <em>Language</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicinalProductNameCountryLanguageImpl extends BackboneElementImpl implements MedicinalProductNameCountryLanguage {
	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept country;

	/**
	 * The cached value of the '{@link #getJurisdiction() <em>Jurisdiction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJurisdiction()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept jurisdiction;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept language;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicinalProductNameCountryLanguageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getMedicinalProductNameCountryLanguage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCountry(CodeableConcept newCountry, NotificationChain msgs) {
		CodeableConcept oldCountry = country;
		country = newCountry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_NAME_COUNTRY_LANGUAGE__COUNTRY, oldCountry, newCountry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(CodeableConcept newCountry) {
		if (newCountry != country) {
			NotificationChain msgs = null;
			if (country != null)
				msgs = ((InternalEObject)country).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_NAME_COUNTRY_LANGUAGE__COUNTRY, null, msgs);
			if (newCountry != null)
				msgs = ((InternalEObject)newCountry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_NAME_COUNTRY_LANGUAGE__COUNTRY, null, msgs);
			msgs = basicSetCountry(newCountry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_NAME_COUNTRY_LANGUAGE__COUNTRY, newCountry, newCountry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getJurisdiction() {
		return jurisdiction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJurisdiction(CodeableConcept newJurisdiction, NotificationChain msgs) {
		CodeableConcept oldJurisdiction = jurisdiction;
		jurisdiction = newJurisdiction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_NAME_COUNTRY_LANGUAGE__JURISDICTION, oldJurisdiction, newJurisdiction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJurisdiction(CodeableConcept newJurisdiction) {
		if (newJurisdiction != jurisdiction) {
			NotificationChain msgs = null;
			if (jurisdiction != null)
				msgs = ((InternalEObject)jurisdiction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_NAME_COUNTRY_LANGUAGE__JURISDICTION, null, msgs);
			if (newJurisdiction != null)
				msgs = ((InternalEObject)newJurisdiction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_NAME_COUNTRY_LANGUAGE__JURISDICTION, null, msgs);
			msgs = basicSetJurisdiction(newJurisdiction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_NAME_COUNTRY_LANGUAGE__JURISDICTION, newJurisdiction, newJurisdiction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLanguage(CodeableConcept newLanguage, NotificationChain msgs) {
		CodeableConcept oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_NAME_COUNTRY_LANGUAGE__LANGUAGE, oldLanguage, newLanguage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(CodeableConcept newLanguage) {
		if (newLanguage != language) {
			NotificationChain msgs = null;
			if (language != null)
				msgs = ((InternalEObject)language).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_NAME_COUNTRY_LANGUAGE__LANGUAGE, null, msgs);
			if (newLanguage != null)
				msgs = ((InternalEObject)newLanguage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_NAME_COUNTRY_LANGUAGE__LANGUAGE, null, msgs);
			msgs = basicSetLanguage(newLanguage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_NAME_COUNTRY_LANGUAGE__LANGUAGE, newLanguage, newLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.MEDICINAL_PRODUCT_NAME_COUNTRY_LANGUAGE__COUNTRY:
				return basicSetCountry(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_NAME_COUNTRY_LANGUAGE__JURISDICTION:
				return basicSetJurisdiction(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_NAME_COUNTRY_LANGUAGE__LANGUAGE:
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
			case ResourcesPackage.MEDICINAL_PRODUCT_NAME_COUNTRY_LANGUAGE__COUNTRY:
				return getCountry();
			case ResourcesPackage.MEDICINAL_PRODUCT_NAME_COUNTRY_LANGUAGE__JURISDICTION:
				return getJurisdiction();
			case ResourcesPackage.MEDICINAL_PRODUCT_NAME_COUNTRY_LANGUAGE__LANGUAGE:
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
			case ResourcesPackage.MEDICINAL_PRODUCT_NAME_COUNTRY_LANGUAGE__COUNTRY:
				setCountry((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_NAME_COUNTRY_LANGUAGE__JURISDICTION:
				setJurisdiction((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_NAME_COUNTRY_LANGUAGE__LANGUAGE:
				setLanguage((CodeableConcept)newValue);
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
			case ResourcesPackage.MEDICINAL_PRODUCT_NAME_COUNTRY_LANGUAGE__COUNTRY:
				setCountry((CodeableConcept)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_NAME_COUNTRY_LANGUAGE__JURISDICTION:
				setJurisdiction((CodeableConcept)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_NAME_COUNTRY_LANGUAGE__LANGUAGE:
				setLanguage((CodeableConcept)null);
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
			case ResourcesPackage.MEDICINAL_PRODUCT_NAME_COUNTRY_LANGUAGE__COUNTRY:
				return country != null;
			case ResourcesPackage.MEDICINAL_PRODUCT_NAME_COUNTRY_LANGUAGE__JURISDICTION:
				return jurisdiction != null;
			case ResourcesPackage.MEDICINAL_PRODUCT_NAME_COUNTRY_LANGUAGE__LANGUAGE:
				return language != null;
		}
		return super.eIsSet(featureID);
	}

} //MedicinalProductNameCountryLanguageImpl
