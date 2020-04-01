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

import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.Identifier;
import org.eclipse.mdht.hl7.fhir.dataTypes.MarketingStatus;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

import org.eclipse.mdht.hl7.fhir.resources.MedicinalProductPackaged;
import org.eclipse.mdht.hl7.fhir.resources.MedicinalProductPackagedBatchIdentifier;
import org.eclipse.mdht.hl7.fhir.resources.MedicinalProductPackagedPackageItem;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medicinal Product Packaged</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductPackagedImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductPackagedImpl#getSubjects <em>Subject</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductPackagedImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductPackagedImpl#getLegalStatusOfSupply <em>Legal Status Of Supply</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductPackagedImpl#getMarketingStati <em>Marketing Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductPackagedImpl#getMarketingAuthorization <em>Marketing Authorization</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductPackagedImpl#getManufacturers <em>Manufacturer</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductPackagedImpl#getBatchIdentifiers <em>Batch Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MedicinalProductPackagedImpl#getPackageItems <em>Package Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicinalProductPackagedImpl extends DomainResourceImpl implements MedicinalProductPackaged {
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
	 * The cached value of the '{@link #getSubjects() <em>Subject</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjects()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> subjects;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String description;

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
	 * The cached value of the '{@link #getMarketingStati() <em>Marketing Status</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarketingStati()
	 * @generated
	 * @ordered
	 */
	protected EList<MarketingStatus> marketingStati;

	/**
	 * The cached value of the '{@link #getMarketingAuthorization() <em>Marketing Authorization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarketingAuthorization()
	 * @generated
	 * @ordered
	 */
	protected Reference marketingAuthorization;

	/**
	 * The cached value of the '{@link #getManufacturers() <em>Manufacturer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManufacturers()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> manufacturers;

	/**
	 * The cached value of the '{@link #getBatchIdentifiers() <em>Batch Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatchIdentifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicinalProductPackagedBatchIdentifier> batchIdentifiers;

	/**
	 * The cached value of the '{@link #getPackageItems() <em>Package Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageItems()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicinalProductPackagedPackageItem> packageItems;

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
		return ResourcesPackage.eINSTANCE.getMedicinalProductPackaged();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getSubjects() {
		if (subjects == null) {
			subjects = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__SUBJECT);
		}
		return subjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(org.eclipse.mdht.hl7.fhir.dataTypes.String newDescription, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(org.eclipse.mdht.hl7.fhir.dataTypes.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__LEGAL_STATUS_OF_SUPPLY, oldLegalStatusOfSupply, newLegalStatusOfSupply);
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
	public void setLegalStatusOfSupply(CodeableConcept newLegalStatusOfSupply) {
		if (newLegalStatusOfSupply != legalStatusOfSupply) {
			NotificationChain msgs = null;
			if (legalStatusOfSupply != null)
				msgs = ((InternalEObject)legalStatusOfSupply).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__LEGAL_STATUS_OF_SUPPLY, null, msgs);
			if (newLegalStatusOfSupply != null)
				msgs = ((InternalEObject)newLegalStatusOfSupply).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__LEGAL_STATUS_OF_SUPPLY, null, msgs);
			msgs = basicSetLegalStatusOfSupply(newLegalStatusOfSupply, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__LEGAL_STATUS_OF_SUPPLY, newLegalStatusOfSupply, newLegalStatusOfSupply));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MarketingStatus> getMarketingStati() {
		if (marketingStati == null) {
			marketingStati = new EObjectContainmentEList<MarketingStatus>(MarketingStatus.class, this, ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__MARKETING_STATUS);
		}
		return marketingStati;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getMarketingAuthorization() {
		return marketingAuthorization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMarketingAuthorization(Reference newMarketingAuthorization, NotificationChain msgs) {
		Reference oldMarketingAuthorization = marketingAuthorization;
		marketingAuthorization = newMarketingAuthorization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__MARKETING_AUTHORIZATION, oldMarketingAuthorization, newMarketingAuthorization);
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
	public void setMarketingAuthorization(Reference newMarketingAuthorization) {
		if (newMarketingAuthorization != marketingAuthorization) {
			NotificationChain msgs = null;
			if (marketingAuthorization != null)
				msgs = ((InternalEObject)marketingAuthorization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__MARKETING_AUTHORIZATION, null, msgs);
			if (newMarketingAuthorization != null)
				msgs = ((InternalEObject)newMarketingAuthorization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__MARKETING_AUTHORIZATION, null, msgs);
			msgs = basicSetMarketingAuthorization(newMarketingAuthorization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__MARKETING_AUTHORIZATION, newMarketingAuthorization, newMarketingAuthorization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getManufacturers() {
		if (manufacturers == null) {
			manufacturers = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__MANUFACTURER);
		}
		return manufacturers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicinalProductPackagedBatchIdentifier> getBatchIdentifiers() {
		if (batchIdentifiers == null) {
			batchIdentifiers = new EObjectContainmentEList<MedicinalProductPackagedBatchIdentifier>(MedicinalProductPackagedBatchIdentifier.class, this, ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__BATCH_IDENTIFIER);
		}
		return batchIdentifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MedicinalProductPackagedPackageItem> getPackageItems() {
		if (packageItems == null) {
			packageItems = new EObjectContainmentEList<MedicinalProductPackagedPackageItem>(MedicinalProductPackagedPackageItem.class, this, ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__PACKAGE_ITEM);
		}
		return packageItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__SUBJECT:
				return ((InternalEList<?>)getSubjects()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__LEGAL_STATUS_OF_SUPPLY:
				return basicSetLegalStatusOfSupply(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__MARKETING_STATUS:
				return ((InternalEList<?>)getMarketingStati()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__MARKETING_AUTHORIZATION:
				return basicSetMarketingAuthorization(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__MANUFACTURER:
				return ((InternalEList<?>)getManufacturers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__BATCH_IDENTIFIER:
				return ((InternalEList<?>)getBatchIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__PACKAGE_ITEM:
				return ((InternalEList<?>)getPackageItems()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__SUBJECT:
				return getSubjects();
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__DESCRIPTION:
				return getDescription();
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__LEGAL_STATUS_OF_SUPPLY:
				return getLegalStatusOfSupply();
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__MARKETING_STATUS:
				return getMarketingStati();
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__MARKETING_AUTHORIZATION:
				return getMarketingAuthorization();
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__MANUFACTURER:
				return getManufacturers();
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__BATCH_IDENTIFIER:
				return getBatchIdentifiers();
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__PACKAGE_ITEM:
				return getPackageItems();
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
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__SUBJECT:
				getSubjects().clear();
				getSubjects().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__DESCRIPTION:
				setDescription((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__LEGAL_STATUS_OF_SUPPLY:
				setLegalStatusOfSupply((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__MARKETING_STATUS:
				getMarketingStati().clear();
				getMarketingStati().addAll((Collection<? extends MarketingStatus>)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__MARKETING_AUTHORIZATION:
				setMarketingAuthorization((Reference)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__MANUFACTURER:
				getManufacturers().clear();
				getManufacturers().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__BATCH_IDENTIFIER:
				getBatchIdentifiers().clear();
				getBatchIdentifiers().addAll((Collection<? extends MedicinalProductPackagedBatchIdentifier>)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__PACKAGE_ITEM:
				getPackageItems().clear();
				getPackageItems().addAll((Collection<? extends MedicinalProductPackagedPackageItem>)newValue);
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
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__SUBJECT:
				getSubjects().clear();
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__DESCRIPTION:
				setDescription((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__LEGAL_STATUS_OF_SUPPLY:
				setLegalStatusOfSupply((CodeableConcept)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__MARKETING_STATUS:
				getMarketingStati().clear();
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__MARKETING_AUTHORIZATION:
				setMarketingAuthorization((Reference)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__MANUFACTURER:
				getManufacturers().clear();
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__BATCH_IDENTIFIER:
				getBatchIdentifiers().clear();
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__PACKAGE_ITEM:
				getPackageItems().clear();
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
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__SUBJECT:
				return subjects != null && !subjects.isEmpty();
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__DESCRIPTION:
				return description != null;
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__LEGAL_STATUS_OF_SUPPLY:
				return legalStatusOfSupply != null;
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__MARKETING_STATUS:
				return marketingStati != null && !marketingStati.isEmpty();
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__MARKETING_AUTHORIZATION:
				return marketingAuthorization != null;
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__MANUFACTURER:
				return manufacturers != null && !manufacturers.isEmpty();
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__BATCH_IDENTIFIER:
				return batchIdentifiers != null && !batchIdentifiers.isEmpty();
			case ResourcesPackage.MEDICINAL_PRODUCT_PACKAGED__PACKAGE_ITEM:
				return packageItems != null && !packageItems.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicinalProductPackagedImpl
