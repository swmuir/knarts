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

import org.eclipse.mdht.uml.fhir.core.datatype.DateTime;
import org.eclipse.mdht.uml.fhir.core.datatype.Uri;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.ValueSetExpansion;
import org.eclipse.mdht.uml.fhir.core.resource.ValueSetExpansionContains;
import org.eclipse.mdht.uml.fhir.core.resource.ValueSetExpansionParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Set Expansion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ValueSetExpansionImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ValueSetExpansionImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ValueSetExpansionImpl#getTotal <em>Total</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ValueSetExpansionImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ValueSetExpansionImpl#getParameters <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ValueSetExpansionImpl#getContains <em>Contains</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueSetExpansionImpl extends BackboneElementImpl implements ValueSetExpansion {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Uri identifier;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected DateTime timestamp;

	/**
	 * The cached value of the '{@link #getTotal() <em>Total</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.Integer total;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.Integer offset;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSetExpansionParameter> parameters;

	/**
	 * The cached value of the '{@link #getContains() <em>Contains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSetExpansionContains> contains;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueSetExpansionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getValueSetExpansion();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getIdentifier() {
		if (identifier != null && identifier.eIsProxy()) {
			InternalEObject oldIdentifier = (InternalEObject)identifier;
			identifier = (Uri)eResolveProxy(oldIdentifier);
			if (identifier != oldIdentifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.VALUE_SET_EXPANSION__IDENTIFIER, oldIdentifier, identifier));
			}
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri basicGetIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(Uri newIdentifier) {
		Uri oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.VALUE_SET_EXPANSION__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getTimestamp() {
		if (timestamp != null && timestamp.eIsProxy()) {
			InternalEObject oldTimestamp = (InternalEObject)timestamp;
			timestamp = (DateTime)eResolveProxy(oldTimestamp);
			if (timestamp != oldTimestamp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.VALUE_SET_EXPANSION__TIMESTAMP, oldTimestamp, timestamp));
			}
		}
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimestamp(DateTime newTimestamp) {
		DateTime oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.VALUE_SET_EXPANSION__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Integer getTotal() {
		if (total != null && total.eIsProxy()) {
			InternalEObject oldTotal = (InternalEObject)total;
			total = (org.eclipse.mdht.uml.fhir.core.datatype.Integer)eResolveProxy(oldTotal);
			if (total != oldTotal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.VALUE_SET_EXPANSION__TOTAL, oldTotal, total));
			}
		}
		return total;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Integer basicGetTotal() {
		return total;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotal(org.eclipse.mdht.uml.fhir.core.datatype.Integer newTotal) {
		org.eclipse.mdht.uml.fhir.core.datatype.Integer oldTotal = total;
		total = newTotal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.VALUE_SET_EXPANSION__TOTAL, oldTotal, total));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Integer getOffset() {
		if (offset != null && offset.eIsProxy()) {
			InternalEObject oldOffset = (InternalEObject)offset;
			offset = (org.eclipse.mdht.uml.fhir.core.datatype.Integer)eResolveProxy(oldOffset);
			if (offset != oldOffset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.VALUE_SET_EXPANSION__OFFSET, oldOffset, offset));
			}
		}
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Integer basicGetOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffset(org.eclipse.mdht.uml.fhir.core.datatype.Integer newOffset) {
		org.eclipse.mdht.uml.fhir.core.datatype.Integer oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.VALUE_SET_EXPANSION__OFFSET, oldOffset, offset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSetExpansionParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<ValueSetExpansionParameter>(ValueSetExpansionParameter.class, this, FhirResourcePackage.VALUE_SET_EXPANSION__PARAMETER);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSetExpansionContains> getContains() {
		if (contains == null) {
			contains = new EObjectContainmentEList<ValueSetExpansionContains>(ValueSetExpansionContains.class, this, FhirResourcePackage.VALUE_SET_EXPANSION__CONTAINS);
		}
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.VALUE_SET_EXPANSION__PARAMETER:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.VALUE_SET_EXPANSION__CONTAINS:
				return ((InternalEList<?>)getContains()).basicRemove(otherEnd, msgs);
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
			case FhirResourcePackage.VALUE_SET_EXPANSION__IDENTIFIER:
				if (resolve) return getIdentifier();
				return basicGetIdentifier();
			case FhirResourcePackage.VALUE_SET_EXPANSION__TIMESTAMP:
				if (resolve) return getTimestamp();
				return basicGetTimestamp();
			case FhirResourcePackage.VALUE_SET_EXPANSION__TOTAL:
				if (resolve) return getTotal();
				return basicGetTotal();
			case FhirResourcePackage.VALUE_SET_EXPANSION__OFFSET:
				if (resolve) return getOffset();
				return basicGetOffset();
			case FhirResourcePackage.VALUE_SET_EXPANSION__PARAMETER:
				return getParameters();
			case FhirResourcePackage.VALUE_SET_EXPANSION__CONTAINS:
				return getContains();
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
			case FhirResourcePackage.VALUE_SET_EXPANSION__IDENTIFIER:
				setIdentifier((Uri)newValue);
				return;
			case FhirResourcePackage.VALUE_SET_EXPANSION__TIMESTAMP:
				setTimestamp((DateTime)newValue);
				return;
			case FhirResourcePackage.VALUE_SET_EXPANSION__TOTAL:
				setTotal((org.eclipse.mdht.uml.fhir.core.datatype.Integer)newValue);
				return;
			case FhirResourcePackage.VALUE_SET_EXPANSION__OFFSET:
				setOffset((org.eclipse.mdht.uml.fhir.core.datatype.Integer)newValue);
				return;
			case FhirResourcePackage.VALUE_SET_EXPANSION__PARAMETER:
				getParameters().clear();
				getParameters().addAll((Collection<? extends ValueSetExpansionParameter>)newValue);
				return;
			case FhirResourcePackage.VALUE_SET_EXPANSION__CONTAINS:
				getContains().clear();
				getContains().addAll((Collection<? extends ValueSetExpansionContains>)newValue);
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
			case FhirResourcePackage.VALUE_SET_EXPANSION__IDENTIFIER:
				setIdentifier((Uri)null);
				return;
			case FhirResourcePackage.VALUE_SET_EXPANSION__TIMESTAMP:
				setTimestamp((DateTime)null);
				return;
			case FhirResourcePackage.VALUE_SET_EXPANSION__TOTAL:
				setTotal((org.eclipse.mdht.uml.fhir.core.datatype.Integer)null);
				return;
			case FhirResourcePackage.VALUE_SET_EXPANSION__OFFSET:
				setOffset((org.eclipse.mdht.uml.fhir.core.datatype.Integer)null);
				return;
			case FhirResourcePackage.VALUE_SET_EXPANSION__PARAMETER:
				getParameters().clear();
				return;
			case FhirResourcePackage.VALUE_SET_EXPANSION__CONTAINS:
				getContains().clear();
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
			case FhirResourcePackage.VALUE_SET_EXPANSION__IDENTIFIER:
				return identifier != null;
			case FhirResourcePackage.VALUE_SET_EXPANSION__TIMESTAMP:
				return timestamp != null;
			case FhirResourcePackage.VALUE_SET_EXPANSION__TOTAL:
				return total != null;
			case FhirResourcePackage.VALUE_SET_EXPANSION__OFFSET:
				return offset != null;
			case FhirResourcePackage.VALUE_SET_EXPANSION__PARAMETER:
				return parameters != null && !parameters.isEmpty();
			case FhirResourcePackage.VALUE_SET_EXPANSION__CONTAINS:
				return contains != null && !contains.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ValueSetExpansionImpl
