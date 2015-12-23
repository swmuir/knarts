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
package org.eclipse.mdht.uml.fhir.core.datatype.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.mdht.uml.fhir.core.datatype.Base;
import org.eclipse.mdht.uml.fhir.core.datatype.Base64Binary;
import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.Coding;
import org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage;
import org.eclipse.mdht.uml.fhir.core.datatype.Instant;
import org.eclipse.mdht.uml.fhir.core.datatype.Signature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.SignatureImpl#getTypes <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.SignatureImpl#getWhen <em>When</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.SignatureImpl#getWhox <em>Whox</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.SignatureImpl#getContentType <em>Content Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.SignatureImpl#getBlob <em>Blob</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SignatureImpl extends DataTypeImpl implements Signature {
	/**
	 * The cached value of the '{@link #getTypes() <em>Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> types;

	/**
	 * The cached value of the '{@link #getWhen() <em>When</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
	protected Instant when;

	/**
	 * The cached value of the '{@link #getWhox() <em>Whox</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhox()
	 * @generated
	 * @ordered
	 */
	protected Base whox;

	/**
	 * The cached value of the '{@link #getContentType() <em>Content Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentType()
	 * @generated
	 * @ordered
	 */
	protected Code contentType;

	/**
	 * The cached value of the '{@link #getBlob() <em>Blob</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlob()
	 * @generated
	 * @ordered
	 */
	protected Base64Binary blob;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirDatatypePackage.Literals.SIGNATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getTypes() {
		if (types == null) {
			types = new EObjectResolvingEList<Coding>(Coding.class, this, FhirDatatypePackage.SIGNATURE__TYPE);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant getWhen() {
		if (when != null && when.eIsProxy()) {
			InternalEObject oldWhen = (InternalEObject)when;
			when = (Instant)eResolveProxy(oldWhen);
			if (when != oldWhen) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.SIGNATURE__WHEN, oldWhen, when));
			}
		}
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant basicGetWhen() {
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhen(Instant newWhen) {
		Instant oldWhen = when;
		when = newWhen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.SIGNATURE__WHEN, oldWhen, when));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base getWhox() {
		if (whox != null && whox.eIsProxy()) {
			InternalEObject oldWhox = (InternalEObject)whox;
			whox = (Base)eResolveProxy(oldWhox);
			if (whox != oldWhox) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.SIGNATURE__WHOX, oldWhox, whox));
			}
		}
		return whox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base basicGetWhox() {
		return whox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhox(Base newWhox) {
		Base oldWhox = whox;
		whox = newWhox;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.SIGNATURE__WHOX, oldWhox, whox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getContentType() {
		if (contentType != null && contentType.eIsProxy()) {
			InternalEObject oldContentType = (InternalEObject)contentType;
			contentType = (Code)eResolveProxy(oldContentType);
			if (contentType != oldContentType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.SIGNATURE__CONTENT_TYPE, oldContentType, contentType));
			}
		}
		return contentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetContentType() {
		return contentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentType(Code newContentType) {
		Code oldContentType = contentType;
		contentType = newContentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.SIGNATURE__CONTENT_TYPE, oldContentType, contentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base64Binary getBlob() {
		if (blob != null && blob.eIsProxy()) {
			InternalEObject oldBlob = (InternalEObject)blob;
			blob = (Base64Binary)eResolveProxy(oldBlob);
			if (blob != oldBlob) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.SIGNATURE__BLOB, oldBlob, blob));
			}
		}
		return blob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base64Binary basicGetBlob() {
		return blob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlob(Base64Binary newBlob) {
		Base64Binary oldBlob = blob;
		blob = newBlob;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.SIGNATURE__BLOB, oldBlob, blob));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirDatatypePackage.SIGNATURE__TYPE:
				return getTypes();
			case FhirDatatypePackage.SIGNATURE__WHEN:
				if (resolve) return getWhen();
				return basicGetWhen();
			case FhirDatatypePackage.SIGNATURE__WHOX:
				if (resolve) return getWhox();
				return basicGetWhox();
			case FhirDatatypePackage.SIGNATURE__CONTENT_TYPE:
				if (resolve) return getContentType();
				return basicGetContentType();
			case FhirDatatypePackage.SIGNATURE__BLOB:
				if (resolve) return getBlob();
				return basicGetBlob();
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
			case FhirDatatypePackage.SIGNATURE__TYPE:
				getTypes().clear();
				getTypes().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirDatatypePackage.SIGNATURE__WHEN:
				setWhen((Instant)newValue);
				return;
			case FhirDatatypePackage.SIGNATURE__WHOX:
				setWhox((Base)newValue);
				return;
			case FhirDatatypePackage.SIGNATURE__CONTENT_TYPE:
				setContentType((Code)newValue);
				return;
			case FhirDatatypePackage.SIGNATURE__BLOB:
				setBlob((Base64Binary)newValue);
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
			case FhirDatatypePackage.SIGNATURE__TYPE:
				getTypes().clear();
				return;
			case FhirDatatypePackage.SIGNATURE__WHEN:
				setWhen((Instant)null);
				return;
			case FhirDatatypePackage.SIGNATURE__WHOX:
				setWhox((Base)null);
				return;
			case FhirDatatypePackage.SIGNATURE__CONTENT_TYPE:
				setContentType((Code)null);
				return;
			case FhirDatatypePackage.SIGNATURE__BLOB:
				setBlob((Base64Binary)null);
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
			case FhirDatatypePackage.SIGNATURE__TYPE:
				return types != null && !types.isEmpty();
			case FhirDatatypePackage.SIGNATURE__WHEN:
				return when != null;
			case FhirDatatypePackage.SIGNATURE__WHOX:
				return whox != null;
			case FhirDatatypePackage.SIGNATURE__CONTENT_TYPE:
				return contentType != null;
			case FhirDatatypePackage.SIGNATURE__BLOB:
				return blob != null;
		}
		return super.eIsSet(featureID);
	}

} //SignatureImpl
