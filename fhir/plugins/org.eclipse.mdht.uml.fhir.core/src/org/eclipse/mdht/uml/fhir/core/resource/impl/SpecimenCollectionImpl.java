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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.datatype.DataType;
import org.eclipse.mdht.uml.fhir.core.datatype.SimpleQuantity;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.Practitioner;
import org.eclipse.mdht.uml.fhir.core.resource.SpecimenCollection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specimen Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SpecimenCollectionImpl#getCollector <em>Collector</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SpecimenCollectionImpl#getComments <em>Comment</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SpecimenCollectionImpl#getCollectedx <em>Collectedx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SpecimenCollectionImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SpecimenCollectionImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.SpecimenCollectionImpl#getBodySite <em>Body Site</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecimenCollectionImpl extends BackboneElementImpl implements SpecimenCollection {
	/**
	 * The cached value of the '{@link #getCollector() <em>Collector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollector()
	 * @generated
	 * @ordered
	 */
	protected Practitioner collector;

	/**
	 * The cached value of the '{@link #getComments() <em>Comment</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.mdht.uml.fhir.core.datatype.String> comments;

	/**
	 * The cached value of the '{@link #getCollectedx() <em>Collectedx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectedx()
	 * @generated
	 * @ordered
	 */
	protected DataType collectedx;

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
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept method;

	/**
	 * The cached value of the '{@link #getBodySite() <em>Body Site</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySite()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept bodySite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecimenCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getSpecimenCollection();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner getCollector() {
		if (collector != null && collector.eIsProxy()) {
			InternalEObject oldCollector = (InternalEObject)collector;
			collector = (Practitioner)eResolveProxy(oldCollector);
			if (collector != oldCollector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.SPECIMEN_COLLECTION__COLLECTOR, oldCollector, collector));
			}
		}
		return collector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner basicGetCollector() {
		return collector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollector(Practitioner newCollector) {
		Practitioner oldCollector = collector;
		collector = newCollector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.SPECIMEN_COLLECTION__COLLECTOR, oldCollector, collector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.mdht.uml.fhir.core.datatype.String> getComments() {
		if (comments == null) {
			comments = new EObjectResolvingEList<org.eclipse.mdht.uml.fhir.core.datatype.String>(org.eclipse.mdht.uml.fhir.core.datatype.String.class, this, FhirResourcePackage.SPECIMEN_COLLECTION__COMMENT);
		}
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getCollectedx() {
		if (collectedx != null && collectedx.eIsProxy()) {
			InternalEObject oldCollectedx = (InternalEObject)collectedx;
			collectedx = (DataType)eResolveProxy(oldCollectedx);
			if (collectedx != oldCollectedx) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.SPECIMEN_COLLECTION__COLLECTEDX, oldCollectedx, collectedx));
			}
		}
		return collectedx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetCollectedx() {
		return collectedx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollectedx(DataType newCollectedx) {
		DataType oldCollectedx = collectedx;
		collectedx = newCollectedx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.SPECIMEN_COLLECTION__COLLECTEDX, oldCollectedx, collectedx));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.SPECIMEN_COLLECTION__QUANTITY, oldQuantity, quantity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.SPECIMEN_COLLECTION__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getMethod() {
		if (method != null && method.eIsProxy()) {
			InternalEObject oldMethod = (InternalEObject)method;
			method = (CodeableConcept)eResolveProxy(oldMethod);
			if (method != oldMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.SPECIMEN_COLLECTION__METHOD, oldMethod, method));
			}
		}
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(CodeableConcept newMethod) {
		CodeableConcept oldMethod = method;
		method = newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.SPECIMEN_COLLECTION__METHOD, oldMethod, method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getBodySite() {
		if (bodySite != null && bodySite.eIsProxy()) {
			InternalEObject oldBodySite = (InternalEObject)bodySite;
			bodySite = (CodeableConcept)eResolveProxy(oldBodySite);
			if (bodySite != oldBodySite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.SPECIMEN_COLLECTION__BODY_SITE, oldBodySite, bodySite));
			}
		}
		return bodySite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetBodySite() {
		return bodySite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBodySite(CodeableConcept newBodySite) {
		CodeableConcept oldBodySite = bodySite;
		bodySite = newBodySite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.SPECIMEN_COLLECTION__BODY_SITE, oldBodySite, bodySite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirResourcePackage.SPECIMEN_COLLECTION__COLLECTOR:
				if (resolve) return getCollector();
				return basicGetCollector();
			case FhirResourcePackage.SPECIMEN_COLLECTION__COMMENT:
				return getComments();
			case FhirResourcePackage.SPECIMEN_COLLECTION__COLLECTEDX:
				if (resolve) return getCollectedx();
				return basicGetCollectedx();
			case FhirResourcePackage.SPECIMEN_COLLECTION__QUANTITY:
				if (resolve) return getQuantity();
				return basicGetQuantity();
			case FhirResourcePackage.SPECIMEN_COLLECTION__METHOD:
				if (resolve) return getMethod();
				return basicGetMethod();
			case FhirResourcePackage.SPECIMEN_COLLECTION__BODY_SITE:
				if (resolve) return getBodySite();
				return basicGetBodySite();
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
			case FhirResourcePackage.SPECIMEN_COLLECTION__COLLECTOR:
				setCollector((Practitioner)newValue);
				return;
			case FhirResourcePackage.SPECIMEN_COLLECTION__COMMENT:
				getComments().clear();
				getComments().addAll((Collection<? extends org.eclipse.mdht.uml.fhir.core.datatype.String>)newValue);
				return;
			case FhirResourcePackage.SPECIMEN_COLLECTION__COLLECTEDX:
				setCollectedx((DataType)newValue);
				return;
			case FhirResourcePackage.SPECIMEN_COLLECTION__QUANTITY:
				setQuantity((SimpleQuantity)newValue);
				return;
			case FhirResourcePackage.SPECIMEN_COLLECTION__METHOD:
				setMethod((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.SPECIMEN_COLLECTION__BODY_SITE:
				setBodySite((CodeableConcept)newValue);
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
			case FhirResourcePackage.SPECIMEN_COLLECTION__COLLECTOR:
				setCollector((Practitioner)null);
				return;
			case FhirResourcePackage.SPECIMEN_COLLECTION__COMMENT:
				getComments().clear();
				return;
			case FhirResourcePackage.SPECIMEN_COLLECTION__COLLECTEDX:
				setCollectedx((DataType)null);
				return;
			case FhirResourcePackage.SPECIMEN_COLLECTION__QUANTITY:
				setQuantity((SimpleQuantity)null);
				return;
			case FhirResourcePackage.SPECIMEN_COLLECTION__METHOD:
				setMethod((CodeableConcept)null);
				return;
			case FhirResourcePackage.SPECIMEN_COLLECTION__BODY_SITE:
				setBodySite((CodeableConcept)null);
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
			case FhirResourcePackage.SPECIMEN_COLLECTION__COLLECTOR:
				return collector != null;
			case FhirResourcePackage.SPECIMEN_COLLECTION__COMMENT:
				return comments != null && !comments.isEmpty();
			case FhirResourcePackage.SPECIMEN_COLLECTION__COLLECTEDX:
				return collectedx != null;
			case FhirResourcePackage.SPECIMEN_COLLECTION__QUANTITY:
				return quantity != null;
			case FhirResourcePackage.SPECIMEN_COLLECTION__METHOD:
				return method != null;
			case FhirResourcePackage.SPECIMEN_COLLECTION__BODY_SITE:
				return bodySite != null;
		}
		return super.eIsSet(featureID);
	}

} //SpecimenCollectionImpl
