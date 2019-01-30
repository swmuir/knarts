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
import org.hl7.fhir.Identifier;
import org.hl7.fhir.MarketingStatus;
import org.hl7.fhir.MedicinalProductPackaged;
import org.hl7.fhir.MedicinalProductPackagedBatchIdentifier;
import org.hl7.fhir.MedicinalProductPackagedPackageItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medicinal Product Packaged</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductPackagedImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductPackagedImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductPackagedImpl#getMarketingStatus <em>Marketing Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductPackagedImpl#getBatchIdentifier <em>Batch Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.MedicinalProductPackagedImpl#getPackageItem <em>Package Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicinalProductPackagedImpl extends DomainResourceImpl implements MedicinalProductPackaged {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String description;

	/**
	 * The cached value of the '{@link #getMarketingStatus() <em>Marketing Status</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarketingStatus()
	 * @generated
	 * @ordered
	 */
	protected EList<MarketingStatus> marketingStatus;

	/**
	 * The cached value of the '{@link #getBatchIdentifier() <em>Batch Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatchIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicinalProductPackagedBatchIdentifier> batchIdentifier;

	/**
	 * The cached value of the '{@link #getPackageItem() <em>Package Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageItem()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicinalProductPackagedPackageItem> packageItem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicinalProductPackagedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getMedicinalProductPackaged();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(Identifier newIdentifier, NotificationChain msgs) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_PACKAGED__IDENTIFIER, oldIdentifier, newIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(Identifier newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_PACKAGED__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_PACKAGED__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_PACKAGED__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(org.hl7.fhir.String newDescription, NotificationChain msgs) {
		org.hl7.fhir.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_PACKAGED__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(org.hl7.fhir.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_PACKAGED__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.MEDICINAL_PRODUCT_PACKAGED__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.MEDICINAL_PRODUCT_PACKAGED__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MarketingStatus> getMarketingStatus() {
		if (marketingStatus == null) {
			marketingStatus = new EObjectContainmentEList<MarketingStatus>(MarketingStatus.class, this, FhirPackage.MEDICINAL_PRODUCT_PACKAGED__MARKETING_STATUS);
		}
		return marketingStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicinalProductPackagedBatchIdentifier> getBatchIdentifier() {
		if (batchIdentifier == null) {
			batchIdentifier = new EObjectContainmentEList<MedicinalProductPackagedBatchIdentifier>(MedicinalProductPackagedBatchIdentifier.class, this, FhirPackage.MEDICINAL_PRODUCT_PACKAGED__BATCH_IDENTIFIER);
		}
		return batchIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicinalProductPackagedPackageItem> getPackageItem() {
		if (packageItem == null) {
			packageItem = new EObjectContainmentEList<MedicinalProductPackagedPackageItem>(MedicinalProductPackagedPackageItem.class, this, FhirPackage.MEDICINAL_PRODUCT_PACKAGED__PACKAGE_ITEM);
		}
		return packageItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__MARKETING_STATUS:
				return ((InternalEList<?>)getMarketingStatus()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__BATCH_IDENTIFIER:
				return ((InternalEList<?>)getBatchIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__PACKAGE_ITEM:
				return ((InternalEList<?>)getPackageItem()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__DESCRIPTION:
				return getDescription();
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__MARKETING_STATUS:
				return getMarketingStatus();
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__BATCH_IDENTIFIER:
				return getBatchIdentifier();
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__PACKAGE_ITEM:
				return getPackageItem();
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
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__DESCRIPTION:
				setDescription((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__MARKETING_STATUS:
				getMarketingStatus().clear();
				getMarketingStatus().addAll((Collection<? extends MarketingStatus>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__BATCH_IDENTIFIER:
				getBatchIdentifier().clear();
				getBatchIdentifier().addAll((Collection<? extends MedicinalProductPackagedBatchIdentifier>)newValue);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__PACKAGE_ITEM:
				getPackageItem().clear();
				getPackageItem().addAll((Collection<? extends MedicinalProductPackagedPackageItem>)newValue);
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
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__DESCRIPTION:
				setDescription((org.hl7.fhir.String)null);
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__MARKETING_STATUS:
				getMarketingStatus().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__BATCH_IDENTIFIER:
				getBatchIdentifier().clear();
				return;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__PACKAGE_ITEM:
				getPackageItem().clear();
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
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__IDENTIFIER:
				return identifier != null;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__DESCRIPTION:
				return description != null;
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__MARKETING_STATUS:
				return marketingStatus != null && !marketingStatus.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__BATCH_IDENTIFIER:
				return batchIdentifier != null && !batchIdentifier.isEmpty();
			case FhirPackage.MEDICINAL_PRODUCT_PACKAGED__PACKAGE_ITEM:
				return packageItem != null && !packageItem.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicinalProductPackagedImpl
