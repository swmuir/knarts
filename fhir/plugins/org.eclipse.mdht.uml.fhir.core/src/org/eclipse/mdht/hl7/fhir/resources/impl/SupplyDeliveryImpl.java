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
import org.eclipse.mdht.hl7.fhir.dataTypes.DataType;
import org.eclipse.mdht.hl7.fhir.dataTypes.Identifier;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;
import org.eclipse.mdht.hl7.fhir.resources.SupplyDelivery;
import org.eclipse.mdht.hl7.fhir.resources.SupplyDeliverySuppliedItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supply Delivery</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SupplyDeliveryImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SupplyDeliveryImpl#getBasedOns <em>Based On</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SupplyDeliveryImpl#getPartOfs <em>Part Of</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SupplyDeliveryImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SupplyDeliveryImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SupplyDeliveryImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SupplyDeliveryImpl#getSuppliedItem <em>Supplied Item</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SupplyDeliveryImpl#getOccurrencex <em>Occurrencex</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SupplyDeliveryImpl#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SupplyDeliveryImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.SupplyDeliveryImpl#getReceivers <em>Receiver</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SupplyDeliveryImpl extends DomainResourceImpl implements SupplyDelivery {
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
	 * The cached value of the '{@link #getBasedOns() <em>Based On</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasedOns()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> basedOns;

	/**
	 * The cached value of the '{@link #getPartOfs() <em>Part Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartOfs()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> partOfs;

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
	 * The cached value of the '{@link #getPatient() <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient()
	 * @generated
	 * @ordered
	 */
	protected Reference patient;

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
	 * The cached value of the '{@link #getSuppliedItem() <em>Supplied Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuppliedItem()
	 * @generated
	 * @ordered
	 */
	protected SupplyDeliverySuppliedItem suppliedItem;

	/**
	 * The cached value of the '{@link #getOccurrencex() <em>Occurrencex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrencex()
	 * @generated
	 * @ordered
	 */
	protected DataType occurrencex;

	/**
	 * The cached value of the '{@link #getSupplier() <em>Supplier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplier()
	 * @generated
	 * @ordered
	 */
	protected Reference supplier;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected Reference destination;

	/**
	 * The cached value of the '{@link #getReceivers() <em>Receiver</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivers()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> receivers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupplyDeliveryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getSupplyDelivery();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.SUPPLY_DELIVERY__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getBasedOns() {
		if (basedOns == null) {
			basedOns = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.SUPPLY_DELIVERY__BASED_ON);
		}
		return basedOns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getPartOfs() {
		if (partOfs == null) {
			partOfs = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.SUPPLY_DELIVERY__PART_OF);
		}
		return partOfs;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUPPLY_DELIVERY__STATUS, oldStatus, newStatus);
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
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUPPLY_DELIVERY__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUPPLY_DELIVERY__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUPPLY_DELIVERY__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getPatient() {
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatient(Reference newPatient, NotificationChain msgs) {
		Reference oldPatient = patient;
		patient = newPatient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUPPLY_DELIVERY__PATIENT, oldPatient, newPatient);
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
	public void setPatient(Reference newPatient) {
		if (newPatient != patient) {
			NotificationChain msgs = null;
			if (patient != null)
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUPPLY_DELIVERY__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUPPLY_DELIVERY__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUPPLY_DELIVERY__PATIENT, newPatient, newPatient));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUPPLY_DELIVERY__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUPPLY_DELIVERY__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUPPLY_DELIVERY__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUPPLY_DELIVERY__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupplyDeliverySuppliedItem getSuppliedItem() {
		return suppliedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuppliedItem(SupplyDeliverySuppliedItem newSuppliedItem, NotificationChain msgs) {
		SupplyDeliverySuppliedItem oldSuppliedItem = suppliedItem;
		suppliedItem = newSuppliedItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUPPLY_DELIVERY__SUPPLIED_ITEM, oldSuppliedItem, newSuppliedItem);
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
	public void setSuppliedItem(SupplyDeliverySuppliedItem newSuppliedItem) {
		if (newSuppliedItem != suppliedItem) {
			NotificationChain msgs = null;
			if (suppliedItem != null)
				msgs = ((InternalEObject)suppliedItem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUPPLY_DELIVERY__SUPPLIED_ITEM, null, msgs);
			if (newSuppliedItem != null)
				msgs = ((InternalEObject)newSuppliedItem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUPPLY_DELIVERY__SUPPLIED_ITEM, null, msgs);
			msgs = basicSetSuppliedItem(newSuppliedItem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUPPLY_DELIVERY__SUPPLIED_ITEM, newSuppliedItem, newSuppliedItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getOccurrencex() {
		return occurrencex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOccurrencex(DataType newOccurrencex, NotificationChain msgs) {
		DataType oldOccurrencex = occurrencex;
		occurrencex = newOccurrencex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUPPLY_DELIVERY__OCCURRENCEX, oldOccurrencex, newOccurrencex);
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
	public void setOccurrencex(DataType newOccurrencex) {
		if (newOccurrencex != occurrencex) {
			NotificationChain msgs = null;
			if (occurrencex != null)
				msgs = ((InternalEObject)occurrencex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUPPLY_DELIVERY__OCCURRENCEX, null, msgs);
			if (newOccurrencex != null)
				msgs = ((InternalEObject)newOccurrencex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUPPLY_DELIVERY__OCCURRENCEX, null, msgs);
			msgs = basicSetOccurrencex(newOccurrencex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUPPLY_DELIVERY__OCCURRENCEX, newOccurrencex, newOccurrencex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getSupplier() {
		return supplier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupplier(Reference newSupplier, NotificationChain msgs) {
		Reference oldSupplier = supplier;
		supplier = newSupplier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUPPLY_DELIVERY__SUPPLIER, oldSupplier, newSupplier);
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
	public void setSupplier(Reference newSupplier) {
		if (newSupplier != supplier) {
			NotificationChain msgs = null;
			if (supplier != null)
				msgs = ((InternalEObject)supplier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUPPLY_DELIVERY__SUPPLIER, null, msgs);
			if (newSupplier != null)
				msgs = ((InternalEObject)newSupplier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUPPLY_DELIVERY__SUPPLIER, null, msgs);
			msgs = basicSetSupplier(newSupplier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUPPLY_DELIVERY__SUPPLIER, newSupplier, newSupplier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDestination(Reference newDestination, NotificationChain msgs) {
		Reference oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUPPLY_DELIVERY__DESTINATION, oldDestination, newDestination);
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
	public void setDestination(Reference newDestination) {
		if (newDestination != destination) {
			NotificationChain msgs = null;
			if (destination != null)
				msgs = ((InternalEObject)destination).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUPPLY_DELIVERY__DESTINATION, null, msgs);
			if (newDestination != null)
				msgs = ((InternalEObject)newDestination).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUPPLY_DELIVERY__DESTINATION, null, msgs);
			msgs = basicSetDestination(newDestination, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUPPLY_DELIVERY__DESTINATION, newDestination, newDestination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reference> getReceivers() {
		if (receivers == null) {
			receivers = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.SUPPLY_DELIVERY__RECEIVER);
		}
		return receivers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.SUPPLY_DELIVERY__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SUPPLY_DELIVERY__BASED_ON:
				return ((InternalEList<?>)getBasedOns()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SUPPLY_DELIVERY__PART_OF:
				return ((InternalEList<?>)getPartOfs()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SUPPLY_DELIVERY__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.SUPPLY_DELIVERY__PATIENT:
				return basicSetPatient(null, msgs);
			case ResourcesPackage.SUPPLY_DELIVERY__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.SUPPLY_DELIVERY__SUPPLIED_ITEM:
				return basicSetSuppliedItem(null, msgs);
			case ResourcesPackage.SUPPLY_DELIVERY__OCCURRENCEX:
				return basicSetOccurrencex(null, msgs);
			case ResourcesPackage.SUPPLY_DELIVERY__SUPPLIER:
				return basicSetSupplier(null, msgs);
			case ResourcesPackage.SUPPLY_DELIVERY__DESTINATION:
				return basicSetDestination(null, msgs);
			case ResourcesPackage.SUPPLY_DELIVERY__RECEIVER:
				return ((InternalEList<?>)getReceivers()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.SUPPLY_DELIVERY__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.SUPPLY_DELIVERY__BASED_ON:
				return getBasedOns();
			case ResourcesPackage.SUPPLY_DELIVERY__PART_OF:
				return getPartOfs();
			case ResourcesPackage.SUPPLY_DELIVERY__STATUS:
				return getStatus();
			case ResourcesPackage.SUPPLY_DELIVERY__PATIENT:
				return getPatient();
			case ResourcesPackage.SUPPLY_DELIVERY__TYPE:
				return getType();
			case ResourcesPackage.SUPPLY_DELIVERY__SUPPLIED_ITEM:
				return getSuppliedItem();
			case ResourcesPackage.SUPPLY_DELIVERY__OCCURRENCEX:
				return getOccurrencex();
			case ResourcesPackage.SUPPLY_DELIVERY__SUPPLIER:
				return getSupplier();
			case ResourcesPackage.SUPPLY_DELIVERY__DESTINATION:
				return getDestination();
			case ResourcesPackage.SUPPLY_DELIVERY__RECEIVER:
				return getReceivers();
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
			case ResourcesPackage.SUPPLY_DELIVERY__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.SUPPLY_DELIVERY__BASED_ON:
				getBasedOns().clear();
				getBasedOns().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.SUPPLY_DELIVERY__PART_OF:
				getPartOfs().clear();
				getPartOfs().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.SUPPLY_DELIVERY__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.SUPPLY_DELIVERY__PATIENT:
				setPatient((Reference)newValue);
				return;
			case ResourcesPackage.SUPPLY_DELIVERY__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.SUPPLY_DELIVERY__SUPPLIED_ITEM:
				setSuppliedItem((SupplyDeliverySuppliedItem)newValue);
				return;
			case ResourcesPackage.SUPPLY_DELIVERY__OCCURRENCEX:
				setOccurrencex((DataType)newValue);
				return;
			case ResourcesPackage.SUPPLY_DELIVERY__SUPPLIER:
				setSupplier((Reference)newValue);
				return;
			case ResourcesPackage.SUPPLY_DELIVERY__DESTINATION:
				setDestination((Reference)newValue);
				return;
			case ResourcesPackage.SUPPLY_DELIVERY__RECEIVER:
				getReceivers().clear();
				getReceivers().addAll((Collection<? extends Reference>)newValue);
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
			case ResourcesPackage.SUPPLY_DELIVERY__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.SUPPLY_DELIVERY__BASED_ON:
				getBasedOns().clear();
				return;
			case ResourcesPackage.SUPPLY_DELIVERY__PART_OF:
				getPartOfs().clear();
				return;
			case ResourcesPackage.SUPPLY_DELIVERY__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.SUPPLY_DELIVERY__PATIENT:
				setPatient((Reference)null);
				return;
			case ResourcesPackage.SUPPLY_DELIVERY__TYPE:
				setType((CodeableConcept)null);
				return;
			case ResourcesPackage.SUPPLY_DELIVERY__SUPPLIED_ITEM:
				setSuppliedItem((SupplyDeliverySuppliedItem)null);
				return;
			case ResourcesPackage.SUPPLY_DELIVERY__OCCURRENCEX:
				setOccurrencex((DataType)null);
				return;
			case ResourcesPackage.SUPPLY_DELIVERY__SUPPLIER:
				setSupplier((Reference)null);
				return;
			case ResourcesPackage.SUPPLY_DELIVERY__DESTINATION:
				setDestination((Reference)null);
				return;
			case ResourcesPackage.SUPPLY_DELIVERY__RECEIVER:
				getReceivers().clear();
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
			case ResourcesPackage.SUPPLY_DELIVERY__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.SUPPLY_DELIVERY__BASED_ON:
				return basedOns != null && !basedOns.isEmpty();
			case ResourcesPackage.SUPPLY_DELIVERY__PART_OF:
				return partOfs != null && !partOfs.isEmpty();
			case ResourcesPackage.SUPPLY_DELIVERY__STATUS:
				return status != null;
			case ResourcesPackage.SUPPLY_DELIVERY__PATIENT:
				return patient != null;
			case ResourcesPackage.SUPPLY_DELIVERY__TYPE:
				return type != null;
			case ResourcesPackage.SUPPLY_DELIVERY__SUPPLIED_ITEM:
				return suppliedItem != null;
			case ResourcesPackage.SUPPLY_DELIVERY__OCCURRENCEX:
				return occurrencex != null;
			case ResourcesPackage.SUPPLY_DELIVERY__SUPPLIER:
				return supplier != null;
			case ResourcesPackage.SUPPLY_DELIVERY__DESTINATION:
				return destination != null;
			case ResourcesPackage.SUPPLY_DELIVERY__RECEIVER:
				return receivers != null && !receivers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SupplyDeliveryImpl
