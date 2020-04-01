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

import org.eclipse.mdht.hl7.fhir.dataTypes.Code;
import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.DateTime;
import org.eclipse.mdht.hl7.fhir.dataTypes.Identifier;
import org.eclipse.mdht.hl7.fhir.dataTypes.Period;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

import org.eclipse.mdht.hl7.fhir.resources.CatalogEntry;
import org.eclipse.mdht.hl7.fhir.resources.CatalogEntryRelatedEntry;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Catalog Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CatalogEntryImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CatalogEntryImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CatalogEntryImpl#getOrderable <em>Orderable</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CatalogEntryImpl#getReferencedItem <em>Referenced Item</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CatalogEntryImpl#getAdditionalIdentifiers <em>Additional Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CatalogEntryImpl#getClassifications <em>Classification</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CatalogEntryImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CatalogEntryImpl#getValidityPeriod <em>Validity Period</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CatalogEntryImpl#getValidTo <em>Valid To</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CatalogEntryImpl#getLastUpdated <em>Last Updated</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CatalogEntryImpl#getAdditionalCharacteristics <em>Additional Characteristic</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CatalogEntryImpl#getAdditionalClassifications <em>Additional Classification</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CatalogEntryImpl#getRelatedEntries <em>Related Entry</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CatalogEntryImpl extends DomainResourceImpl implements CatalogEntry {
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
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getOrderable() <em>Orderable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderable()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.Boolean orderable;

	/**
	 * The cached value of the '{@link #getReferencedItem() <em>Referenced Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedItem()
	 * @generated
	 * @ordered
	 */
	protected Reference referencedItem;

	/**
	 * The cached value of the '{@link #getAdditionalIdentifiers() <em>Additional Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalIdentifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> additionalIdentifiers;

	/**
	 * The cached value of the '{@link #getClassifications() <em>Classification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifications()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> classifications;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Code status;

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
	 * The cached value of the '{@link #getValidTo() <em>Valid To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidTo()
	 * @generated
	 * @ordered
	 */
	protected DateTime validTo;

	/**
	 * The cached value of the '{@link #getLastUpdated() <em>Last Updated</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastUpdated()
	 * @generated
	 * @ordered
	 */
	protected DateTime lastUpdated;

	/**
	 * The cached value of the '{@link #getAdditionalCharacteristics() <em>Additional Characteristic</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalCharacteristics()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> additionalCharacteristics;

	/**
	 * The cached value of the '{@link #getAdditionalClassifications() <em>Additional Classification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalClassifications()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> additionalClassifications;

	/**
	 * The cached value of the '{@link #getRelatedEntries() <em>Related Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<CatalogEntryRelatedEntry> relatedEntries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CatalogEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getCatalogEntry();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.CATALOG_ENTRY__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CATALOG_ENTRY__TYPE, oldType, newType);
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
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CATALOG_ENTRY__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CATALOG_ENTRY__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CATALOG_ENTRY__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.Boolean getOrderable() {
		return orderable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrderable(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newOrderable, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.Boolean oldOrderable = orderable;
		orderable = newOrderable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CATALOG_ENTRY__ORDERABLE, oldOrderable, newOrderable);
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
	public void setOrderable(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newOrderable) {
		if (newOrderable != orderable) {
			NotificationChain msgs = null;
			if (orderable != null)
				msgs = ((InternalEObject)orderable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CATALOG_ENTRY__ORDERABLE, null, msgs);
			if (newOrderable != null)
				msgs = ((InternalEObject)newOrderable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CATALOG_ENTRY__ORDERABLE, null, msgs);
			msgs = basicSetOrderable(newOrderable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CATALOG_ENTRY__ORDERABLE, newOrderable, newOrderable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getReferencedItem() {
		return referencedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencedItem(Reference newReferencedItem, NotificationChain msgs) {
		Reference oldReferencedItem = referencedItem;
		referencedItem = newReferencedItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CATALOG_ENTRY__REFERENCED_ITEM, oldReferencedItem, newReferencedItem);
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
	public void setReferencedItem(Reference newReferencedItem) {
		if (newReferencedItem != referencedItem) {
			NotificationChain msgs = null;
			if (referencedItem != null)
				msgs = ((InternalEObject)referencedItem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CATALOG_ENTRY__REFERENCED_ITEM, null, msgs);
			if (newReferencedItem != null)
				msgs = ((InternalEObject)newReferencedItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CATALOG_ENTRY__REFERENCED_ITEM, null, msgs);
			msgs = basicSetReferencedItem(newReferencedItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CATALOG_ENTRY__REFERENCED_ITEM, newReferencedItem, newReferencedItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getAdditionalIdentifiers() {
		if (additionalIdentifiers == null) {
			additionalIdentifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.CATALOG_ENTRY__ADDITIONAL_IDENTIFIER);
		}
		return additionalIdentifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getClassifications() {
		if (classifications == null) {
			classifications = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.CATALOG_ENTRY__CLASSIFICATION);
		}
		return classifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(Code newStatus, NotificationChain msgs) {
		Code oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CATALOG_ENTRY__STATUS, oldStatus, newStatus);
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
	public void setStatus(Code newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CATALOG_ENTRY__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CATALOG_ENTRY__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CATALOG_ENTRY__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CATALOG_ENTRY__VALIDITY_PERIOD, oldValidityPeriod, newValidityPeriod);
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
	public void setValidityPeriod(Period newValidityPeriod) {
		if (newValidityPeriod != validityPeriod) {
			NotificationChain msgs = null;
			if (validityPeriod != null)
				msgs = ((InternalEObject)validityPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CATALOG_ENTRY__VALIDITY_PERIOD, null, msgs);
			if (newValidityPeriod != null)
				msgs = ((InternalEObject)newValidityPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CATALOG_ENTRY__VALIDITY_PERIOD, null, msgs);
			msgs = basicSetValidityPeriod(newValidityPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CATALOG_ENTRY__VALIDITY_PERIOD, newValidityPeriod, newValidityPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getValidTo() {
		return validTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidTo(DateTime newValidTo, NotificationChain msgs) {
		DateTime oldValidTo = validTo;
		validTo = newValidTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CATALOG_ENTRY__VALID_TO, oldValidTo, newValidTo);
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
	public void setValidTo(DateTime newValidTo) {
		if (newValidTo != validTo) {
			NotificationChain msgs = null;
			if (validTo != null)
				msgs = ((InternalEObject)validTo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CATALOG_ENTRY__VALID_TO, null, msgs);
			if (newValidTo != null)
				msgs = ((InternalEObject)newValidTo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CATALOG_ENTRY__VALID_TO, null, msgs);
			msgs = basicSetValidTo(newValidTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CATALOG_ENTRY__VALID_TO, newValidTo, newValidTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DateTime getLastUpdated() {
		return lastUpdated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLastUpdated(DateTime newLastUpdated, NotificationChain msgs) {
		DateTime oldLastUpdated = lastUpdated;
		lastUpdated = newLastUpdated;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CATALOG_ENTRY__LAST_UPDATED, oldLastUpdated, newLastUpdated);
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
	public void setLastUpdated(DateTime newLastUpdated) {
		if (newLastUpdated != lastUpdated) {
			NotificationChain msgs = null;
			if (lastUpdated != null)
				msgs = ((InternalEObject)lastUpdated).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CATALOG_ENTRY__LAST_UPDATED, null, msgs);
			if (newLastUpdated != null)
				msgs = ((InternalEObject)newLastUpdated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CATALOG_ENTRY__LAST_UPDATED, null, msgs);
			msgs = basicSetLastUpdated(newLastUpdated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CATALOG_ENTRY__LAST_UPDATED, newLastUpdated, newLastUpdated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getAdditionalCharacteristics() {
		if (additionalCharacteristics == null) {
			additionalCharacteristics = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.CATALOG_ENTRY__ADDITIONAL_CHARACTERISTIC);
		}
		return additionalCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CodeableConcept> getAdditionalClassifications() {
		if (additionalClassifications == null) {
			additionalClassifications = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.CATALOG_ENTRY__ADDITIONAL_CLASSIFICATION);
		}
		return additionalClassifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CatalogEntryRelatedEntry> getRelatedEntries() {
		if (relatedEntries == null) {
			relatedEntries = new EObjectContainmentEList<CatalogEntryRelatedEntry>(CatalogEntryRelatedEntry.class, this, ResourcesPackage.CATALOG_ENTRY__RELATED_ENTRY);
		}
		return relatedEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.CATALOG_ENTRY__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CATALOG_ENTRY__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.CATALOG_ENTRY__ORDERABLE:
				return basicSetOrderable(null, msgs);
			case ResourcesPackage.CATALOG_ENTRY__REFERENCED_ITEM:
				return basicSetReferencedItem(null, msgs);
			case ResourcesPackage.CATALOG_ENTRY__ADDITIONAL_IDENTIFIER:
				return ((InternalEList<?>)getAdditionalIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CATALOG_ENTRY__CLASSIFICATION:
				return ((InternalEList<?>)getClassifications()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CATALOG_ENTRY__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.CATALOG_ENTRY__VALIDITY_PERIOD:
				return basicSetValidityPeriod(null, msgs);
			case ResourcesPackage.CATALOG_ENTRY__VALID_TO:
				return basicSetValidTo(null, msgs);
			case ResourcesPackage.CATALOG_ENTRY__LAST_UPDATED:
				return basicSetLastUpdated(null, msgs);
			case ResourcesPackage.CATALOG_ENTRY__ADDITIONAL_CHARACTERISTIC:
				return ((InternalEList<?>)getAdditionalCharacteristics()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CATALOG_ENTRY__ADDITIONAL_CLASSIFICATION:
				return ((InternalEList<?>)getAdditionalClassifications()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CATALOG_ENTRY__RELATED_ENTRY:
				return ((InternalEList<?>)getRelatedEntries()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.CATALOG_ENTRY__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.CATALOG_ENTRY__TYPE:
				return getType();
			case ResourcesPackage.CATALOG_ENTRY__ORDERABLE:
				return getOrderable();
			case ResourcesPackage.CATALOG_ENTRY__REFERENCED_ITEM:
				return getReferencedItem();
			case ResourcesPackage.CATALOG_ENTRY__ADDITIONAL_IDENTIFIER:
				return getAdditionalIdentifiers();
			case ResourcesPackage.CATALOG_ENTRY__CLASSIFICATION:
				return getClassifications();
			case ResourcesPackage.CATALOG_ENTRY__STATUS:
				return getStatus();
			case ResourcesPackage.CATALOG_ENTRY__VALIDITY_PERIOD:
				return getValidityPeriod();
			case ResourcesPackage.CATALOG_ENTRY__VALID_TO:
				return getValidTo();
			case ResourcesPackage.CATALOG_ENTRY__LAST_UPDATED:
				return getLastUpdated();
			case ResourcesPackage.CATALOG_ENTRY__ADDITIONAL_CHARACTERISTIC:
				return getAdditionalCharacteristics();
			case ResourcesPackage.CATALOG_ENTRY__ADDITIONAL_CLASSIFICATION:
				return getAdditionalClassifications();
			case ResourcesPackage.CATALOG_ENTRY__RELATED_ENTRY:
				return getRelatedEntries();
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
			case ResourcesPackage.CATALOG_ENTRY__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.CATALOG_ENTRY__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.CATALOG_ENTRY__ORDERABLE:
				setOrderable((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.CATALOG_ENTRY__REFERENCED_ITEM:
				setReferencedItem((Reference)newValue);
				return;
			case ResourcesPackage.CATALOG_ENTRY__ADDITIONAL_IDENTIFIER:
				getAdditionalIdentifiers().clear();
				getAdditionalIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.CATALOG_ENTRY__CLASSIFICATION:
				getClassifications().clear();
				getClassifications().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.CATALOG_ENTRY__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.CATALOG_ENTRY__VALIDITY_PERIOD:
				setValidityPeriod((Period)newValue);
				return;
			case ResourcesPackage.CATALOG_ENTRY__VALID_TO:
				setValidTo((DateTime)newValue);
				return;
			case ResourcesPackage.CATALOG_ENTRY__LAST_UPDATED:
				setLastUpdated((DateTime)newValue);
				return;
			case ResourcesPackage.CATALOG_ENTRY__ADDITIONAL_CHARACTERISTIC:
				getAdditionalCharacteristics().clear();
				getAdditionalCharacteristics().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.CATALOG_ENTRY__ADDITIONAL_CLASSIFICATION:
				getAdditionalClassifications().clear();
				getAdditionalClassifications().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.CATALOG_ENTRY__RELATED_ENTRY:
				getRelatedEntries().clear();
				getRelatedEntries().addAll((Collection<? extends CatalogEntryRelatedEntry>)newValue);
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
			case ResourcesPackage.CATALOG_ENTRY__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.CATALOG_ENTRY__TYPE:
				setType((CodeableConcept)null);
				return;
			case ResourcesPackage.CATALOG_ENTRY__ORDERABLE:
				setOrderable((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.CATALOG_ENTRY__REFERENCED_ITEM:
				setReferencedItem((Reference)null);
				return;
			case ResourcesPackage.CATALOG_ENTRY__ADDITIONAL_IDENTIFIER:
				getAdditionalIdentifiers().clear();
				return;
			case ResourcesPackage.CATALOG_ENTRY__CLASSIFICATION:
				getClassifications().clear();
				return;
			case ResourcesPackage.CATALOG_ENTRY__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.CATALOG_ENTRY__VALIDITY_PERIOD:
				setValidityPeriod((Period)null);
				return;
			case ResourcesPackage.CATALOG_ENTRY__VALID_TO:
				setValidTo((DateTime)null);
				return;
			case ResourcesPackage.CATALOG_ENTRY__LAST_UPDATED:
				setLastUpdated((DateTime)null);
				return;
			case ResourcesPackage.CATALOG_ENTRY__ADDITIONAL_CHARACTERISTIC:
				getAdditionalCharacteristics().clear();
				return;
			case ResourcesPackage.CATALOG_ENTRY__ADDITIONAL_CLASSIFICATION:
				getAdditionalClassifications().clear();
				return;
			case ResourcesPackage.CATALOG_ENTRY__RELATED_ENTRY:
				getRelatedEntries().clear();
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
			case ResourcesPackage.CATALOG_ENTRY__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.CATALOG_ENTRY__TYPE:
				return type != null;
			case ResourcesPackage.CATALOG_ENTRY__ORDERABLE:
				return orderable != null;
			case ResourcesPackage.CATALOG_ENTRY__REFERENCED_ITEM:
				return referencedItem != null;
			case ResourcesPackage.CATALOG_ENTRY__ADDITIONAL_IDENTIFIER:
				return additionalIdentifiers != null && !additionalIdentifiers.isEmpty();
			case ResourcesPackage.CATALOG_ENTRY__CLASSIFICATION:
				return classifications != null && !classifications.isEmpty();
			case ResourcesPackage.CATALOG_ENTRY__STATUS:
				return status != null;
			case ResourcesPackage.CATALOG_ENTRY__VALIDITY_PERIOD:
				return validityPeriod != null;
			case ResourcesPackage.CATALOG_ENTRY__VALID_TO:
				return validTo != null;
			case ResourcesPackage.CATALOG_ENTRY__LAST_UPDATED:
				return lastUpdated != null;
			case ResourcesPackage.CATALOG_ENTRY__ADDITIONAL_CHARACTERISTIC:
				return additionalCharacteristics != null && !additionalCharacteristics.isEmpty();
			case ResourcesPackage.CATALOG_ENTRY__ADDITIONAL_CLASSIFICATION:
				return additionalClassifications != null && !additionalClassifications.isEmpty();
			case ResourcesPackage.CATALOG_ENTRY__RELATED_ENTRY:
				return relatedEntries != null && !relatedEntries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CatalogEntryImpl
