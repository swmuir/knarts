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
import org.hl7.fhir.DateTime;
import org.hl7.fhir.EntryDefinition;
import org.hl7.fhir.EntryDefinitionRelatedEntry;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.Period;
import org.hl7.fhir.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entry Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.EntryDefinitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EntryDefinitionImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EntryDefinitionImpl#getReferencedItem <em>Referenced Item</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EntryDefinitionImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EntryDefinitionImpl#getAdditionalIdentifier <em>Additional Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EntryDefinitionImpl#getClassification <em>Classification</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EntryDefinitionImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EntryDefinitionImpl#getValidityPeriod <em>Validity Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EntryDefinitionImpl#getLastUpdated <em>Last Updated</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EntryDefinitionImpl#getAdditionalCharacteristic <em>Additional Characteristic</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EntryDefinitionImpl#getAdditionalClassification <em>Additional Classification</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.EntryDefinitionImpl#getRelatedEntry <em>Related Entry</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntryDefinitionImpl extends DomainResourceImpl implements EntryDefinition {
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
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept purpose;

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
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

	/**
	 * The cached value of the '{@link #getAdditionalIdentifier() <em>Additional Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalIdentifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> additionalIdentifier;

	/**
	 * The cached value of the '{@link #getClassification() <em>Classification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassification()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> classification;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept status;

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
	 * The cached value of the '{@link #getLastUpdated() <em>Last Updated</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastUpdated()
	 * @generated
	 * @ordered
	 */
	protected DateTime lastUpdated;

	/**
	 * The cached value of the '{@link #getAdditionalCharacteristic() <em>Additional Characteristic</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalCharacteristic()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> additionalCharacteristic;

	/**
	 * The cached value of the '{@link #getAdditionalClassification() <em>Additional Classification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalClassification()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> additionalClassification;

	/**
	 * The cached value of the '{@link #getRelatedEntry() <em>Related Entry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<EntryDefinitionRelatedEntry> relatedEntry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntryDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getEntryDefinition();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENTRY_DEFINITION__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENTRY_DEFINITION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENTRY_DEFINITION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENTRY_DEFINITION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getPurpose() {
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPurpose(CodeableConcept newPurpose, NotificationChain msgs) {
		CodeableConcept oldPurpose = purpose;
		purpose = newPurpose;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENTRY_DEFINITION__PURPOSE, oldPurpose, newPurpose);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPurpose(CodeableConcept newPurpose) {
		if (newPurpose != purpose) {
			NotificationChain msgs = null;
			if (purpose != null)
				msgs = ((InternalEObject)purpose).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENTRY_DEFINITION__PURPOSE, null, msgs);
			if (newPurpose != null)
				msgs = ((InternalEObject)newPurpose).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENTRY_DEFINITION__PURPOSE, null, msgs);
			msgs = basicSetPurpose(newPurpose, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENTRY_DEFINITION__PURPOSE, newPurpose, newPurpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENTRY_DEFINITION__REFERENCED_ITEM, oldReferencedItem, newReferencedItem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedItem(Reference newReferencedItem) {
		if (newReferencedItem != referencedItem) {
			NotificationChain msgs = null;
			if (referencedItem != null)
				msgs = ((InternalEObject)referencedItem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENTRY_DEFINITION__REFERENCED_ITEM, null, msgs);
			if (newReferencedItem != null)
				msgs = ((InternalEObject)newReferencedItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENTRY_DEFINITION__REFERENCED_ITEM, null, msgs);
			msgs = basicSetReferencedItem(newReferencedItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENTRY_DEFINITION__REFERENCED_ITEM, newReferencedItem, newReferencedItem));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENTRY_DEFINITION__IDENTIFIER, oldIdentifier, newIdentifier);
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
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENTRY_DEFINITION__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENTRY_DEFINITION__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENTRY_DEFINITION__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getAdditionalIdentifier() {
		if (additionalIdentifier == null) {
			additionalIdentifier = new EObjectContainmentEList<Identifier>(Identifier.class, this, FhirPackage.ENTRY_DEFINITION__ADDITIONAL_IDENTIFIER);
		}
		return additionalIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getClassification() {
		if (classification == null) {
			classification = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.ENTRY_DEFINITION__CLASSIFICATION);
		}
		return classification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(CodeableConcept newStatus, NotificationChain msgs) {
		CodeableConcept oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENTRY_DEFINITION__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(CodeableConcept newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENTRY_DEFINITION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENTRY_DEFINITION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENTRY_DEFINITION__STATUS, newStatus, newStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENTRY_DEFINITION__VALIDITY_PERIOD, oldValidityPeriod, newValidityPeriod);
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
				msgs = ((InternalEObject)validityPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENTRY_DEFINITION__VALIDITY_PERIOD, null, msgs);
			if (newValidityPeriod != null)
				msgs = ((InternalEObject)newValidityPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENTRY_DEFINITION__VALIDITY_PERIOD, null, msgs);
			msgs = basicSetValidityPeriod(newValidityPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENTRY_DEFINITION__VALIDITY_PERIOD, newValidityPeriod, newValidityPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.ENTRY_DEFINITION__LAST_UPDATED, oldLastUpdated, newLastUpdated);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastUpdated(DateTime newLastUpdated) {
		if (newLastUpdated != lastUpdated) {
			NotificationChain msgs = null;
			if (lastUpdated != null)
				msgs = ((InternalEObject)lastUpdated).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENTRY_DEFINITION__LAST_UPDATED, null, msgs);
			if (newLastUpdated != null)
				msgs = ((InternalEObject)newLastUpdated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.ENTRY_DEFINITION__LAST_UPDATED, null, msgs);
			msgs = basicSetLastUpdated(newLastUpdated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.ENTRY_DEFINITION__LAST_UPDATED, newLastUpdated, newLastUpdated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getAdditionalCharacteristic() {
		if (additionalCharacteristic == null) {
			additionalCharacteristic = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.ENTRY_DEFINITION__ADDITIONAL_CHARACTERISTIC);
		}
		return additionalCharacteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getAdditionalClassification() {
		if (additionalClassification == null) {
			additionalClassification = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.ENTRY_DEFINITION__ADDITIONAL_CLASSIFICATION);
		}
		return additionalClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntryDefinitionRelatedEntry> getRelatedEntry() {
		if (relatedEntry == null) {
			relatedEntry = new EObjectContainmentEList<EntryDefinitionRelatedEntry>(EntryDefinitionRelatedEntry.class, this, FhirPackage.ENTRY_DEFINITION__RELATED_ENTRY);
		}
		return relatedEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.ENTRY_DEFINITION__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.ENTRY_DEFINITION__PURPOSE:
				return basicSetPurpose(null, msgs);
			case FhirPackage.ENTRY_DEFINITION__REFERENCED_ITEM:
				return basicSetReferencedItem(null, msgs);
			case FhirPackage.ENTRY_DEFINITION__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case FhirPackage.ENTRY_DEFINITION__ADDITIONAL_IDENTIFIER:
				return ((InternalEList<?>)getAdditionalIdentifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.ENTRY_DEFINITION__CLASSIFICATION:
				return ((InternalEList<?>)getClassification()).basicRemove(otherEnd, msgs);
			case FhirPackage.ENTRY_DEFINITION__STATUS:
				return basicSetStatus(null, msgs);
			case FhirPackage.ENTRY_DEFINITION__VALIDITY_PERIOD:
				return basicSetValidityPeriod(null, msgs);
			case FhirPackage.ENTRY_DEFINITION__LAST_UPDATED:
				return basicSetLastUpdated(null, msgs);
			case FhirPackage.ENTRY_DEFINITION__ADDITIONAL_CHARACTERISTIC:
				return ((InternalEList<?>)getAdditionalCharacteristic()).basicRemove(otherEnd, msgs);
			case FhirPackage.ENTRY_DEFINITION__ADDITIONAL_CLASSIFICATION:
				return ((InternalEList<?>)getAdditionalClassification()).basicRemove(otherEnd, msgs);
			case FhirPackage.ENTRY_DEFINITION__RELATED_ENTRY:
				return ((InternalEList<?>)getRelatedEntry()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.ENTRY_DEFINITION__TYPE:
				return getType();
			case FhirPackage.ENTRY_DEFINITION__PURPOSE:
				return getPurpose();
			case FhirPackage.ENTRY_DEFINITION__REFERENCED_ITEM:
				return getReferencedItem();
			case FhirPackage.ENTRY_DEFINITION__IDENTIFIER:
				return getIdentifier();
			case FhirPackage.ENTRY_DEFINITION__ADDITIONAL_IDENTIFIER:
				return getAdditionalIdentifier();
			case FhirPackage.ENTRY_DEFINITION__CLASSIFICATION:
				return getClassification();
			case FhirPackage.ENTRY_DEFINITION__STATUS:
				return getStatus();
			case FhirPackage.ENTRY_DEFINITION__VALIDITY_PERIOD:
				return getValidityPeriod();
			case FhirPackage.ENTRY_DEFINITION__LAST_UPDATED:
				return getLastUpdated();
			case FhirPackage.ENTRY_DEFINITION__ADDITIONAL_CHARACTERISTIC:
				return getAdditionalCharacteristic();
			case FhirPackage.ENTRY_DEFINITION__ADDITIONAL_CLASSIFICATION:
				return getAdditionalClassification();
			case FhirPackage.ENTRY_DEFINITION__RELATED_ENTRY:
				return getRelatedEntry();
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
			case FhirPackage.ENTRY_DEFINITION__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.ENTRY_DEFINITION__PURPOSE:
				setPurpose((CodeableConcept)newValue);
				return;
			case FhirPackage.ENTRY_DEFINITION__REFERENCED_ITEM:
				setReferencedItem((Reference)newValue);
				return;
			case FhirPackage.ENTRY_DEFINITION__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirPackage.ENTRY_DEFINITION__ADDITIONAL_IDENTIFIER:
				getAdditionalIdentifier().clear();
				getAdditionalIdentifier().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirPackage.ENTRY_DEFINITION__CLASSIFICATION:
				getClassification().clear();
				getClassification().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.ENTRY_DEFINITION__STATUS:
				setStatus((CodeableConcept)newValue);
				return;
			case FhirPackage.ENTRY_DEFINITION__VALIDITY_PERIOD:
				setValidityPeriod((Period)newValue);
				return;
			case FhirPackage.ENTRY_DEFINITION__LAST_UPDATED:
				setLastUpdated((DateTime)newValue);
				return;
			case FhirPackage.ENTRY_DEFINITION__ADDITIONAL_CHARACTERISTIC:
				getAdditionalCharacteristic().clear();
				getAdditionalCharacteristic().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.ENTRY_DEFINITION__ADDITIONAL_CLASSIFICATION:
				getAdditionalClassification().clear();
				getAdditionalClassification().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.ENTRY_DEFINITION__RELATED_ENTRY:
				getRelatedEntry().clear();
				getRelatedEntry().addAll((Collection<? extends EntryDefinitionRelatedEntry>)newValue);
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
			case FhirPackage.ENTRY_DEFINITION__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.ENTRY_DEFINITION__PURPOSE:
				setPurpose((CodeableConcept)null);
				return;
			case FhirPackage.ENTRY_DEFINITION__REFERENCED_ITEM:
				setReferencedItem((Reference)null);
				return;
			case FhirPackage.ENTRY_DEFINITION__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirPackage.ENTRY_DEFINITION__ADDITIONAL_IDENTIFIER:
				getAdditionalIdentifier().clear();
				return;
			case FhirPackage.ENTRY_DEFINITION__CLASSIFICATION:
				getClassification().clear();
				return;
			case FhirPackage.ENTRY_DEFINITION__STATUS:
				setStatus((CodeableConcept)null);
				return;
			case FhirPackage.ENTRY_DEFINITION__VALIDITY_PERIOD:
				setValidityPeriod((Period)null);
				return;
			case FhirPackage.ENTRY_DEFINITION__LAST_UPDATED:
				setLastUpdated((DateTime)null);
				return;
			case FhirPackage.ENTRY_DEFINITION__ADDITIONAL_CHARACTERISTIC:
				getAdditionalCharacteristic().clear();
				return;
			case FhirPackage.ENTRY_DEFINITION__ADDITIONAL_CLASSIFICATION:
				getAdditionalClassification().clear();
				return;
			case FhirPackage.ENTRY_DEFINITION__RELATED_ENTRY:
				getRelatedEntry().clear();
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
			case FhirPackage.ENTRY_DEFINITION__TYPE:
				return type != null;
			case FhirPackage.ENTRY_DEFINITION__PURPOSE:
				return purpose != null;
			case FhirPackage.ENTRY_DEFINITION__REFERENCED_ITEM:
				return referencedItem != null;
			case FhirPackage.ENTRY_DEFINITION__IDENTIFIER:
				return identifier != null;
			case FhirPackage.ENTRY_DEFINITION__ADDITIONAL_IDENTIFIER:
				return additionalIdentifier != null && !additionalIdentifier.isEmpty();
			case FhirPackage.ENTRY_DEFINITION__CLASSIFICATION:
				return classification != null && !classification.isEmpty();
			case FhirPackage.ENTRY_DEFINITION__STATUS:
				return status != null;
			case FhirPackage.ENTRY_DEFINITION__VALIDITY_PERIOD:
				return validityPeriod != null;
			case FhirPackage.ENTRY_DEFINITION__LAST_UPDATED:
				return lastUpdated != null;
			case FhirPackage.ENTRY_DEFINITION__ADDITIONAL_CHARACTERISTIC:
				return additionalCharacteristic != null && !additionalCharacteristic.isEmpty();
			case FhirPackage.ENTRY_DEFINITION__ADDITIONAL_CLASSIFICATION:
				return additionalClassification != null && !additionalClassification.isEmpty();
			case FhirPackage.ENTRY_DEFINITION__RELATED_ENTRY:
				return relatedEntry != null && !relatedEntry.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EntryDefinitionImpl
