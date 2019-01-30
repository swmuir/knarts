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

import org.hl7.fhir.ClaimResponseAddItem;
import org.hl7.fhir.ClaimResponseAdjudication;
import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Money;
import org.hl7.fhir.PositiveInt;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim Response Add Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseAddItemImpl#getItemSequence <em>Item Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseAddItemImpl#getDetailSequence <em>Detail Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseAddItemImpl#getSubdetailSequence <em>Subdetail Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseAddItemImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseAddItemImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseAddItemImpl#getFee <em>Fee</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseAddItemImpl#getNoteNumber <em>Note Number</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ClaimResponseAddItemImpl#getAdjudication <em>Adjudication</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClaimResponseAddItemImpl extends BackboneElementImpl implements ClaimResponseAddItem {
	/**
	 * The cached value of the '{@link #getItemSequence() <em>Item Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<PositiveInt> itemSequence;

	/**
	 * The cached value of the '{@link #getDetailSequence() <em>Detail Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<PositiveInt> detailSequence;

	/**
	 * The cached value of the '{@link #getSubdetailSequence() <em>Subdetail Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubdetailSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<PositiveInt> subdetailSequence;

	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept service;

	/**
	 * The cached value of the '{@link #getModifier() <em>Modifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifier()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> modifier;

	/**
	 * The cached value of the '{@link #getFee() <em>Fee</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFee()
	 * @generated
	 * @ordered
	 */
	protected Money fee;

	/**
	 * The cached value of the '{@link #getNoteNumber() <em>Note Number</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<PositiveInt> noteNumber;

	/**
	 * The cached value of the '{@link #getAdjudication() <em>Adjudication</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdjudication()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimResponseAdjudication> adjudication;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimResponseAddItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getClaimResponseAddItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PositiveInt> getItemSequence() {
		if (itemSequence == null) {
			itemSequence = new EObjectContainmentEList<PositiveInt>(PositiveInt.class, this, FhirPackage.CLAIM_RESPONSE_ADD_ITEM__ITEM_SEQUENCE);
		}
		return itemSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PositiveInt> getDetailSequence() {
		if (detailSequence == null) {
			detailSequence = new EObjectContainmentEList<PositiveInt>(PositiveInt.class, this, FhirPackage.CLAIM_RESPONSE_ADD_ITEM__DETAIL_SEQUENCE);
		}
		return detailSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PositiveInt> getSubdetailSequence() {
		if (subdetailSequence == null) {
			subdetailSequence = new EObjectContainmentEList<PositiveInt>(PositiveInt.class, this, FhirPackage.CLAIM_RESPONSE_ADD_ITEM__SUBDETAIL_SEQUENCE);
		}
		return subdetailSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getService() {
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetService(CodeableConcept newService, NotificationChain msgs) {
		CodeableConcept oldService = service;
		service = newService;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_ADD_ITEM__SERVICE, oldService, newService);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(CodeableConcept newService) {
		if (newService != service) {
			NotificationChain msgs = null;
			if (service != null)
				msgs = ((InternalEObject)service).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_ADD_ITEM__SERVICE, null, msgs);
			if (newService != null)
				msgs = ((InternalEObject)newService).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_ADD_ITEM__SERVICE, null, msgs);
			msgs = basicSetService(newService, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_ADD_ITEM__SERVICE, newService, newService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getModifier() {
		if (modifier == null) {
			modifier = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, FhirPackage.CLAIM_RESPONSE_ADD_ITEM__MODIFIER);
		}
		return modifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getFee() {
		return fee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFee(Money newFee, NotificationChain msgs) {
		Money oldFee = fee;
		fee = newFee;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_ADD_ITEM__FEE, oldFee, newFee);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFee(Money newFee) {
		if (newFee != fee) {
			NotificationChain msgs = null;
			if (fee != null)
				msgs = ((InternalEObject)fee).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_ADD_ITEM__FEE, null, msgs);
			if (newFee != null)
				msgs = ((InternalEObject)newFee).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CLAIM_RESPONSE_ADD_ITEM__FEE, null, msgs);
			msgs = basicSetFee(newFee, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CLAIM_RESPONSE_ADD_ITEM__FEE, newFee, newFee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PositiveInt> getNoteNumber() {
		if (noteNumber == null) {
			noteNumber = new EObjectContainmentEList<PositiveInt>(PositiveInt.class, this, FhirPackage.CLAIM_RESPONSE_ADD_ITEM__NOTE_NUMBER);
		}
		return noteNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimResponseAdjudication> getAdjudication() {
		if (adjudication == null) {
			adjudication = new EObjectContainmentEList<ClaimResponseAdjudication>(ClaimResponseAdjudication.class, this, FhirPackage.CLAIM_RESPONSE_ADD_ITEM__ADJUDICATION);
		}
		return adjudication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__ITEM_SEQUENCE:
				return ((InternalEList<?>)getItemSequence()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__DETAIL_SEQUENCE:
				return ((InternalEList<?>)getDetailSequence()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__SUBDETAIL_SEQUENCE:
				return ((InternalEList<?>)getSubdetailSequence()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__SERVICE:
				return basicSetService(null, msgs);
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__MODIFIER:
				return ((InternalEList<?>)getModifier()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__FEE:
				return basicSetFee(null, msgs);
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__NOTE_NUMBER:
				return ((InternalEList<?>)getNoteNumber()).basicRemove(otherEnd, msgs);
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__ADJUDICATION:
				return ((InternalEList<?>)getAdjudication()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__ITEM_SEQUENCE:
				return getItemSequence();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__DETAIL_SEQUENCE:
				return getDetailSequence();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__SUBDETAIL_SEQUENCE:
				return getSubdetailSequence();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__SERVICE:
				return getService();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__MODIFIER:
				return getModifier();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__FEE:
				return getFee();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__NOTE_NUMBER:
				return getNoteNumber();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__ADJUDICATION:
				return getAdjudication();
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
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__ITEM_SEQUENCE:
				getItemSequence().clear();
				getItemSequence().addAll((Collection<? extends PositiveInt>)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__DETAIL_SEQUENCE:
				getDetailSequence().clear();
				getDetailSequence().addAll((Collection<? extends PositiveInt>)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__SUBDETAIL_SEQUENCE:
				getSubdetailSequence().clear();
				getSubdetailSequence().addAll((Collection<? extends PositiveInt>)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__SERVICE:
				setService((CodeableConcept)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__MODIFIER:
				getModifier().clear();
				getModifier().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__FEE:
				setFee((Money)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__NOTE_NUMBER:
				getNoteNumber().clear();
				getNoteNumber().addAll((Collection<? extends PositiveInt>)newValue);
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__ADJUDICATION:
				getAdjudication().clear();
				getAdjudication().addAll((Collection<? extends ClaimResponseAdjudication>)newValue);
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
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__ITEM_SEQUENCE:
				getItemSequence().clear();
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__DETAIL_SEQUENCE:
				getDetailSequence().clear();
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__SUBDETAIL_SEQUENCE:
				getSubdetailSequence().clear();
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__SERVICE:
				setService((CodeableConcept)null);
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__MODIFIER:
				getModifier().clear();
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__FEE:
				setFee((Money)null);
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__NOTE_NUMBER:
				getNoteNumber().clear();
				return;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__ADJUDICATION:
				getAdjudication().clear();
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
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__ITEM_SEQUENCE:
				return itemSequence != null && !itemSequence.isEmpty();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__DETAIL_SEQUENCE:
				return detailSequence != null && !detailSequence.isEmpty();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__SUBDETAIL_SEQUENCE:
				return subdetailSequence != null && !subdetailSequence.isEmpty();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__SERVICE:
				return service != null;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__MODIFIER:
				return modifier != null && !modifier.isEmpty();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__FEE:
				return fee != null;
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__NOTE_NUMBER:
				return noteNumber != null && !noteNumber.isEmpty();
			case FhirPackage.CLAIM_RESPONSE_ADD_ITEM__ADJUDICATION:
				return adjudication != null && !adjudication.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClaimResponseAddItemImpl
