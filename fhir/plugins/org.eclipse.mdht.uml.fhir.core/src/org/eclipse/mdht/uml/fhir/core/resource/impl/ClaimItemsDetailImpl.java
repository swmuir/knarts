/*******************************************************************************
 * Copyright (c) 2015 David Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David Carlson (Clinical Cloud Solutions, LLC) - initial API and implementation
 *******************************************************************************/
/**
 */
package org.eclipse.mdht.uml.fhir.core.resource.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.uml.fhir.core.datatype.Coding;
import org.eclipse.mdht.uml.fhir.core.datatype.Decimal;
import org.eclipse.mdht.uml.fhir.core.datatype.Money;
import org.eclipse.mdht.uml.fhir.core.datatype.PositiveInt;
import org.eclipse.mdht.uml.fhir.core.datatype.SimpleQuantity;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.ClaimItemsDetail;
import org.eclipse.mdht.uml.fhir.core.resource.ClaimItemsDetailSubDetail;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim Items Detail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimItemsDetailImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimItemsDetailImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimItemsDetailImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimItemsDetailImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimItemsDetailImpl#getUnitPrice <em>Unit Price</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimItemsDetailImpl#getFactor <em>Factor</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimItemsDetailImpl#getPoints <em>Points</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimItemsDetailImpl#getNet <em>Net</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimItemsDetailImpl#getUdi <em>Udi</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimItemsDetailImpl#getSubDetails <em>Sub Detail</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClaimItemsDetailImpl extends BackboneElementImpl implements ClaimItemsDetail {
	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt sequence;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Coding type;

	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected Coding service;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected SimpleQuantity quantity;

	/**
	 * The cached value of the '{@link #getUnitPrice() <em>Unit Price</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitPrice()
	 * @generated
	 * @ordered
	 */
	protected Money unitPrice;

	/**
	 * The cached value of the '{@link #getFactor() <em>Factor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactor()
	 * @generated
	 * @ordered
	 */
	protected Decimal factor;

	/**
	 * The cached value of the '{@link #getPoints() <em>Points</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoints()
	 * @generated
	 * @ordered
	 */
	protected Decimal points;

	/**
	 * The cached value of the '{@link #getNet() <em>Net</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNet()
	 * @generated
	 * @ordered
	 */
	protected Money net;

	/**
	 * The cached value of the '{@link #getUdi() <em>Udi</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUdi()
	 * @generated
	 * @ordered
	 */
	protected Coding udi;

	/**
	 * The cached value of the '{@link #getSubDetails() <em>Sub Detail</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubDetails()
	 * @generated
	 * @ordered
	 */
	protected EList<ClaimItemsDetailSubDetail> subDetails;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimItemsDetailImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getClaimItemsDetail();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getSequence() {
		if (sequence != null && sequence.eIsProxy()) {
			InternalEObject oldSequence = (InternalEObject)sequence;
			sequence = (PositiveInt)eResolveProxy(oldSequence);
			if (sequence != oldSequence) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM_ITEMS_DETAIL__SEQUENCE, oldSequence, sequence));
			}
		}
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt basicGetSequence() {
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequence(PositiveInt newSequence) {
		PositiveInt oldSequence = sequence;
		sequence = newSequence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM_ITEMS_DETAIL__SEQUENCE, oldSequence, sequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Coding)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM_ITEMS_DETAIL__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Coding newType) {
		Coding oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM_ITEMS_DETAIL__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getService() {
		if (service != null && service.eIsProxy()) {
			InternalEObject oldService = (InternalEObject)service;
			service = (Coding)eResolveProxy(oldService);
			if (service != oldService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM_ITEMS_DETAIL__SERVICE, oldService, service));
			}
		}
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetService() {
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(Coding newService) {
		Coding oldService = service;
		service = newService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM_ITEMS_DETAIL__SERVICE, oldService, service));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity getQuantity() {
		if (quantity != null && quantity.eIsProxy()) {
			InternalEObject oldQuantity = (InternalEObject)quantity;
			quantity = (SimpleQuantity)eResolveProxy(oldQuantity);
			if (quantity != oldQuantity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM_ITEMS_DETAIL__QUANTITY, oldQuantity, quantity));
			}
		}
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleQuantity basicGetQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(SimpleQuantity newQuantity) {
		SimpleQuantity oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM_ITEMS_DETAIL__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getUnitPrice() {
		if (unitPrice != null && unitPrice.eIsProxy()) {
			InternalEObject oldUnitPrice = (InternalEObject)unitPrice;
			unitPrice = (Money)eResolveProxy(oldUnitPrice);
			if (unitPrice != oldUnitPrice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM_ITEMS_DETAIL__UNIT_PRICE, oldUnitPrice, unitPrice));
			}
		}
		return unitPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money basicGetUnitPrice() {
		return unitPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitPrice(Money newUnitPrice) {
		Money oldUnitPrice = unitPrice;
		unitPrice = newUnitPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM_ITEMS_DETAIL__UNIT_PRICE, oldUnitPrice, unitPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getFactor() {
		if (factor != null && factor.eIsProxy()) {
			InternalEObject oldFactor = (InternalEObject)factor;
			factor = (Decimal)eResolveProxy(oldFactor);
			if (factor != oldFactor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM_ITEMS_DETAIL__FACTOR, oldFactor, factor));
			}
		}
		return factor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal basicGetFactor() {
		return factor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactor(Decimal newFactor) {
		Decimal oldFactor = factor;
		factor = newFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM_ITEMS_DETAIL__FACTOR, oldFactor, factor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getPoints() {
		if (points != null && points.eIsProxy()) {
			InternalEObject oldPoints = (InternalEObject)points;
			points = (Decimal)eResolveProxy(oldPoints);
			if (points != oldPoints) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM_ITEMS_DETAIL__POINTS, oldPoints, points));
			}
		}
		return points;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal basicGetPoints() {
		return points;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoints(Decimal newPoints) {
		Decimal oldPoints = points;
		points = newPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM_ITEMS_DETAIL__POINTS, oldPoints, points));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money getNet() {
		if (net != null && net.eIsProxy()) {
			InternalEObject oldNet = (InternalEObject)net;
			net = (Money)eResolveProxy(oldNet);
			if (net != oldNet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM_ITEMS_DETAIL__NET, oldNet, net));
			}
		}
		return net;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Money basicGetNet() {
		return net;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNet(Money newNet) {
		Money oldNet = net;
		net = newNet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM_ITEMS_DETAIL__NET, oldNet, net));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getUdi() {
		if (udi != null && udi.eIsProxy()) {
			InternalEObject oldUdi = (InternalEObject)udi;
			udi = (Coding)eResolveProxy(oldUdi);
			if (udi != oldUdi) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM_ITEMS_DETAIL__UDI, oldUdi, udi));
			}
		}
		return udi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetUdi() {
		return udi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUdi(Coding newUdi) {
		Coding oldUdi = udi;
		udi = newUdi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM_ITEMS_DETAIL__UDI, oldUdi, udi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClaimItemsDetailSubDetail> getSubDetails() {
		if (subDetails == null) {
			subDetails = new EObjectContainmentEList<ClaimItemsDetailSubDetail>(ClaimItemsDetailSubDetail.class, this, FhirResourcePackage.CLAIM_ITEMS_DETAIL__SUB_DETAIL);
		}
		return subDetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.CLAIM_ITEMS_DETAIL__SUB_DETAIL:
				return ((InternalEList<?>)getSubDetails()).basicRemove(otherEnd, msgs);
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
			case FhirResourcePackage.CLAIM_ITEMS_DETAIL__SEQUENCE:
				if (resolve) return getSequence();
				return basicGetSequence();
			case FhirResourcePackage.CLAIM_ITEMS_DETAIL__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case FhirResourcePackage.CLAIM_ITEMS_DETAIL__SERVICE:
				if (resolve) return getService();
				return basicGetService();
			case FhirResourcePackage.CLAIM_ITEMS_DETAIL__QUANTITY:
				if (resolve) return getQuantity();
				return basicGetQuantity();
			case FhirResourcePackage.CLAIM_ITEMS_DETAIL__UNIT_PRICE:
				if (resolve) return getUnitPrice();
				return basicGetUnitPrice();
			case FhirResourcePackage.CLAIM_ITEMS_DETAIL__FACTOR:
				if (resolve) return getFactor();
				return basicGetFactor();
			case FhirResourcePackage.CLAIM_ITEMS_DETAIL__POINTS:
				if (resolve) return getPoints();
				return basicGetPoints();
			case FhirResourcePackage.CLAIM_ITEMS_DETAIL__NET:
				if (resolve) return getNet();
				return basicGetNet();
			case FhirResourcePackage.CLAIM_ITEMS_DETAIL__UDI:
				if (resolve) return getUdi();
				return basicGetUdi();
			case FhirResourcePackage.CLAIM_ITEMS_DETAIL__SUB_DETAIL:
				return getSubDetails();
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
			case FhirResourcePackage.CLAIM_ITEMS_DETAIL__SEQUENCE:
				setSequence((PositiveInt)newValue);
				return;
			case FhirResourcePackage.CLAIM_ITEMS_DETAIL__TYPE:
				setType((Coding)newValue);
				return;
			case FhirResourcePackage.CLAIM_ITEMS_DETAIL__SERVICE:
				setService((Coding)newValue);
				return;
			case FhirResourcePackage.CLAIM_ITEMS_DETAIL__QUANTITY:
				setQuantity((SimpleQuantity)newValue);
				return;
			case FhirResourcePackage.CLAIM_ITEMS_DETAIL__UNIT_PRICE:
				setUnitPrice((Money)newValue);
				return;
			case FhirResourcePackage.CLAIM_ITEMS_DETAIL__FACTOR:
				setFactor((Decimal)newValue);
				return;
			case FhirResourcePackage.CLAIM_ITEMS_DETAIL__POINTS:
				setPoints((Decimal)newValue);
				return;
			case FhirResourcePackage.CLAIM_ITEMS_DETAIL__NET:
				setNet((Money)newValue);
				return;
			case FhirResourcePackage.CLAIM_ITEMS_DETAIL__UDI:
				setUdi((Coding)newValue);
				return;
			case FhirResourcePackage.CLAIM_ITEMS_DETAIL__SUB_DETAIL:
				getSubDetails().clear();
				getSubDetails().addAll((Collection<? extends ClaimItemsDetailSubDetail>)newValue);
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
			case FhirResourcePackage.CLAIM_ITEMS_DETAIL__SEQUENCE:
				setSequence((PositiveInt)null);
				return;
			case FhirResourcePackage.CLAIM_ITEMS_DETAIL__TYPE:
				setType((Coding)null);
				return;
			case FhirResourcePackage.CLAIM_ITEMS_DETAIL__SERVICE:
				setService((Coding)null);
				return;
			case FhirResourcePackage.CLAIM_ITEMS_DETAIL__QUANTITY:
				setQuantity((SimpleQuantity)null);
				return;
			case FhirResourcePackage.CLAIM_ITEMS_DETAIL__UNIT_PRICE:
				setUnitPrice((Money)null);
				return;
			case FhirResourcePackage.CLAIM_ITEMS_DETAIL__FACTOR:
				setFactor((Decimal)null);
				return;
			case FhirResourcePackage.CLAIM_ITEMS_DETAIL__POINTS:
				setPoints((Decimal)null);
				return;
			case FhirResourcePackage.CLAIM_ITEMS_DETAIL__NET:
				setNet((Money)null);
				return;
			case FhirResourcePackage.CLAIM_ITEMS_DETAIL__UDI:
				setUdi((Coding)null);
				return;
			case FhirResourcePackage.CLAIM_ITEMS_DETAIL__SUB_DETAIL:
				getSubDetails().clear();
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
			case FhirResourcePackage.CLAIM_ITEMS_DETAIL__SEQUENCE:
				return sequence != null;
			case FhirResourcePackage.CLAIM_ITEMS_DETAIL__TYPE:
				return type != null;
			case FhirResourcePackage.CLAIM_ITEMS_DETAIL__SERVICE:
				return service != null;
			case FhirResourcePackage.CLAIM_ITEMS_DETAIL__QUANTITY:
				return quantity != null;
			case FhirResourcePackage.CLAIM_ITEMS_DETAIL__UNIT_PRICE:
				return unitPrice != null;
			case FhirResourcePackage.CLAIM_ITEMS_DETAIL__FACTOR:
				return factor != null;
			case FhirResourcePackage.CLAIM_ITEMS_DETAIL__POINTS:
				return points != null;
			case FhirResourcePackage.CLAIM_ITEMS_DETAIL__NET:
				return net != null;
			case FhirResourcePackage.CLAIM_ITEMS_DETAIL__UDI:
				return udi != null;
			case FhirResourcePackage.CLAIM_ITEMS_DETAIL__SUB_DETAIL:
				return subDetails != null && !subDetails.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClaimItemsDetailImpl
