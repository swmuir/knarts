/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Period;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.MedicinalProductAuthorizationJurisdictionalAuthorization;
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
 * An implementation of the model object '<em><b>Medicinal Product Authorization Jurisdictional Authorization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.MedicinalProductAuthorizationJurisdictionalAuthorizationImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicinalProductAuthorizationJurisdictionalAuthorizationImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicinalProductAuthorizationJurisdictionalAuthorizationImpl#getJurisdictions <em>Jurisdiction</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicinalProductAuthorizationJurisdictionalAuthorizationImpl#getLegalStatusOfSupply <em>Legal Status Of Supply</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicinalProductAuthorizationJurisdictionalAuthorizationImpl#getValidityPeriod <em>Validity Period</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicinalProductAuthorizationJurisdictionalAuthorizationImpl extends BackboneElementImpl implements MedicinalProductAuthorizationJurisdictionalAuthorization {
	/**
	 * The cached value of the '{@link #getIdentifiers() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifiers;

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
	 * The cached value of the '{@link #getJurisdictions() <em>Jurisdiction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJurisdictions()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> jurisdictions;

	/**
	 * The cached value of the '{@link #getLegalStatusOfSupply() <em>Legal Status Of Supply</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegalStatusOfSupply()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept legalStatusOfSupply;

	/**
	 * The cached value of the '{@link #getValidityPeriod() <em>Validity Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidityPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period validityPeriod;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicinalProductAuthorizationJurisdictionalAuthorizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getMedicinalProductAuthorizationJurisdictionalAuthorization();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_JURISDICTIONAL_AUTHORIZATION__IDENTIFIER);
		}
		return identifiers;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_JURISDICTIONAL_AUTHORIZATION__COUNTRY, oldCountry, newCountry);
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
				msgs = ((InternalEObject)country).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_JURISDICTIONAL_AUTHORIZATION__COUNTRY, null, msgs);
			if (newCountry != null)
				msgs = ((InternalEObject)newCountry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_JURISDICTIONAL_AUTHORIZATION__COUNTRY, null, msgs);
			msgs = basicSetCountry(newCountry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_JURISDICTIONAL_AUTHORIZATION__COUNTRY, newCountry, newCountry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getJurisdictions() {
		if (jurisdictions == null) {
			jurisdictions = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_JURISDICTIONAL_AUTHORIZATION__JURISDICTION);
		}
		return jurisdictions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getLegalStatusOfSupply() {
		return legalStatusOfSupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLegalStatusOfSupply(CodeableConcept newLegalStatusOfSupply, NotificationChain msgs) {
		CodeableConcept oldLegalStatusOfSupply = legalStatusOfSupply;
		legalStatusOfSupply = newLegalStatusOfSupply;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_JURISDICTIONAL_AUTHORIZATION__LEGAL_STATUS_OF_SUPPLY, oldLegalStatusOfSupply, newLegalStatusOfSupply);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegalStatusOfSupply(CodeableConcept newLegalStatusOfSupply) {
		if (newLegalStatusOfSupply != legalStatusOfSupply) {
			NotificationChain msgs = null;
			if (legalStatusOfSupply != null)
				msgs = ((InternalEObject)legalStatusOfSupply).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_JURISDICTIONAL_AUTHORIZATION__LEGAL_STATUS_OF_SUPPLY, null, msgs);
			if (newLegalStatusOfSupply != null)
				msgs = ((InternalEObject)newLegalStatusOfSupply).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_JURISDICTIONAL_AUTHORIZATION__LEGAL_STATUS_OF_SUPPLY, null, msgs);
			msgs = basicSetLegalStatusOfSupply(newLegalStatusOfSupply, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_JURISDICTIONAL_AUTHORIZATION__LEGAL_STATUS_OF_SUPPLY, newLegalStatusOfSupply, newLegalStatusOfSupply));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getValidityPeriod() {
		return validityPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidityPeriod(Period newValidityPeriod, NotificationChain msgs) {
		Period oldValidityPeriod = validityPeriod;
		validityPeriod = newValidityPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_JURISDICTIONAL_AUTHORIZATION__VALIDITY_PERIOD, oldValidityPeriod, newValidityPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidityPeriod(Period newValidityPeriod) {
		if (newValidityPeriod != validityPeriod) {
			NotificationChain msgs = null;
			if (validityPeriod != null)
				msgs = ((InternalEObject)validityPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_JURISDICTIONAL_AUTHORIZATION__VALIDITY_PERIOD, null, msgs);
			if (newValidityPeriod != null)
				msgs = ((InternalEObject)newValidityPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_JURISDICTIONAL_AUTHORIZATION__VALIDITY_PERIOD, null, msgs);
			msgs = basicSetValidityPeriod(newValidityPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_JURISDICTIONAL_AUTHORIZATION__VALIDITY_PERIOD, newValidityPeriod, newValidityPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_JURISDICTIONAL_AUTHORIZATION__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_JURISDICTIONAL_AUTHORIZATION__COUNTRY:
				return basicSetCountry(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_JURISDICTIONAL_AUTHORIZATION__JURISDICTION:
				return ((InternalEList<?>)getJurisdictions()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_JURISDICTIONAL_AUTHORIZATION__LEGAL_STATUS_OF_SUPPLY:
				return basicSetLegalStatusOfSupply(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_JURISDICTIONAL_AUTHORIZATION__VALIDITY_PERIOD:
				return basicSetValidityPeriod(null, msgs);
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
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_JURISDICTIONAL_AUTHORIZATION__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_JURISDICTIONAL_AUTHORIZATION__COUNTRY:
				return getCountry();
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_JURISDICTIONAL_AUTHORIZATION__JURISDICTION:
				return getJurisdictions();
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_JURISDICTIONAL_AUTHORIZATION__LEGAL_STATUS_OF_SUPPLY:
				return getLegalStatusOfSupply();
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_JURISDICTIONAL_AUTHORIZATION__VALIDITY_PERIOD:
				return getValidityPeriod();
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
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_JURISDICTIONAL_AUTHORIZATION__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_JURISDICTIONAL_AUTHORIZATION__COUNTRY:
				setCountry((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_JURISDICTIONAL_AUTHORIZATION__JURISDICTION:
				getJurisdictions().clear();
				getJurisdictions().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_JURISDICTIONAL_AUTHORIZATION__LEGAL_STATUS_OF_SUPPLY:
				setLegalStatusOfSupply((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_JURISDICTIONAL_AUTHORIZATION__VALIDITY_PERIOD:
				setValidityPeriod((Period)newValue);
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
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_JURISDICTIONAL_AUTHORIZATION__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_JURISDICTIONAL_AUTHORIZATION__COUNTRY:
				setCountry((CodeableConcept)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_JURISDICTIONAL_AUTHORIZATION__JURISDICTION:
				getJurisdictions().clear();
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_JURISDICTIONAL_AUTHORIZATION__LEGAL_STATUS_OF_SUPPLY:
				setLegalStatusOfSupply((CodeableConcept)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_JURISDICTIONAL_AUTHORIZATION__VALIDITY_PERIOD:
				setValidityPeriod((Period)null);
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
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_JURISDICTIONAL_AUTHORIZATION__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_JURISDICTIONAL_AUTHORIZATION__COUNTRY:
				return country != null;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_JURISDICTIONAL_AUTHORIZATION__JURISDICTION:
				return jurisdictions != null && !jurisdictions.isEmpty();
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_JURISDICTIONAL_AUTHORIZATION__LEGAL_STATUS_OF_SUPPLY:
				return legalStatusOfSupply != null;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_JURISDICTIONAL_AUTHORIZATION__VALIDITY_PERIOD:
				return validityPeriod != null;
		}
		return super.eIsSet(featureID);
	}

} //MedicinalProductAuthorizationJurisdictionalAuthorizationImpl
