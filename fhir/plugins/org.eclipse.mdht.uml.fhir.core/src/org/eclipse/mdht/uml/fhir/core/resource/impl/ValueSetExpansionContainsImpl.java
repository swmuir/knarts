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

import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.Uri;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.ValueSetExpansionContains;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Set Expansion Contains</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ValueSetExpansionContainsImpl#getSystem <em>System</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ValueSetExpansionContainsImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ValueSetExpansionContainsImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ValueSetExpansionContainsImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ValueSetExpansionContainsImpl#getDisplay <em>Display</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ValueSetExpansionContainsImpl#getContains <em>Contains</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueSetExpansionContainsImpl extends BackboneElementImpl implements ValueSetExpansionContains {
	/**
	 * The cached value of the '{@link #getSystem() <em>System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected Uri system;

	/**
	 * The cached value of the '{@link #getAbstract() <em>Abstract</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.Boolean abstract_;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String version;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected Code code;

	/**
	 * The cached value of the '{@link #getDisplay() <em>Display</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String display;

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
	protected ValueSetExpansionContainsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getValueSetExpansionContains();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getSystem() {
		if (system != null && system.eIsProxy()) {
			InternalEObject oldSystem = (InternalEObject)system;
			system = (Uri)eResolveProxy(oldSystem);
			if (system != oldSystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.VALUE_SET_EXPANSION_CONTAINS__SYSTEM, oldSystem, system));
			}
		}
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri basicGetSystem() {
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(Uri newSystem) {
		Uri oldSystem = system;
		system = newSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.VALUE_SET_EXPANSION_CONTAINS__SYSTEM, oldSystem, system));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean getAbstract() {
		if (abstract_ != null && abstract_.eIsProxy()) {
			InternalEObject oldAbstract = (InternalEObject)abstract_;
			abstract_ = (org.eclipse.mdht.uml.fhir.core.datatype.Boolean)eResolveProxy(oldAbstract);
			if (abstract_ != oldAbstract) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.VALUE_SET_EXPANSION_CONTAINS__ABSTRACT, oldAbstract, abstract_));
			}
		}
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean basicGetAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(org.eclipse.mdht.uml.fhir.core.datatype.Boolean newAbstract) {
		org.eclipse.mdht.uml.fhir.core.datatype.Boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.VALUE_SET_EXPANSION_CONTAINS__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getVersion() {
		if (version != null && version.eIsProxy()) {
			InternalEObject oldVersion = (InternalEObject)version;
			version = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldVersion);
			if (version != oldVersion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.VALUE_SET_EXPANSION_CONTAINS__VERSION, oldVersion, version));
			}
		}
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(org.eclipse.mdht.uml.fhir.core.datatype.String newVersion) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.VALUE_SET_EXPANSION_CONTAINS__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getCode() {
		if (code != null && code.eIsProxy()) {
			InternalEObject oldCode = (InternalEObject)code;
			code = (Code)eResolveProxy(oldCode);
			if (code != oldCode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.VALUE_SET_EXPANSION_CONTAINS__CODE, oldCode, code));
			}
		}
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(Code newCode) {
		Code oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.VALUE_SET_EXPANSION_CONTAINS__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getDisplay() {
		if (display != null && display.eIsProxy()) {
			InternalEObject oldDisplay = (InternalEObject)display;
			display = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldDisplay);
			if (display != oldDisplay) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.VALUE_SET_EXPANSION_CONTAINS__DISPLAY, oldDisplay, display));
			}
		}
		return display;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetDisplay() {
		return display;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplay(org.eclipse.mdht.uml.fhir.core.datatype.String newDisplay) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldDisplay = display;
		display = newDisplay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.VALUE_SET_EXPANSION_CONTAINS__DISPLAY, oldDisplay, display));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSetExpansionContains> getContains() {
		if (contains == null) {
			contains = new EObjectContainmentEList<ValueSetExpansionContains>(ValueSetExpansionContains.class, this, FhirResourcePackage.VALUE_SET_EXPANSION_CONTAINS__CONTAINS);
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
			case FhirResourcePackage.VALUE_SET_EXPANSION_CONTAINS__CONTAINS:
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
			case FhirResourcePackage.VALUE_SET_EXPANSION_CONTAINS__SYSTEM:
				if (resolve) return getSystem();
				return basicGetSystem();
			case FhirResourcePackage.VALUE_SET_EXPANSION_CONTAINS__ABSTRACT:
				if (resolve) return getAbstract();
				return basicGetAbstract();
			case FhirResourcePackage.VALUE_SET_EXPANSION_CONTAINS__VERSION:
				if (resolve) return getVersion();
				return basicGetVersion();
			case FhirResourcePackage.VALUE_SET_EXPANSION_CONTAINS__CODE:
				if (resolve) return getCode();
				return basicGetCode();
			case FhirResourcePackage.VALUE_SET_EXPANSION_CONTAINS__DISPLAY:
				if (resolve) return getDisplay();
				return basicGetDisplay();
			case FhirResourcePackage.VALUE_SET_EXPANSION_CONTAINS__CONTAINS:
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
			case FhirResourcePackage.VALUE_SET_EXPANSION_CONTAINS__SYSTEM:
				setSystem((Uri)newValue);
				return;
			case FhirResourcePackage.VALUE_SET_EXPANSION_CONTAINS__ABSTRACT:
				setAbstract((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)newValue);
				return;
			case FhirResourcePackage.VALUE_SET_EXPANSION_CONTAINS__VERSION:
				setVersion((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.VALUE_SET_EXPANSION_CONTAINS__CODE:
				setCode((Code)newValue);
				return;
			case FhirResourcePackage.VALUE_SET_EXPANSION_CONTAINS__DISPLAY:
				setDisplay((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.VALUE_SET_EXPANSION_CONTAINS__CONTAINS:
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
			case FhirResourcePackage.VALUE_SET_EXPANSION_CONTAINS__SYSTEM:
				setSystem((Uri)null);
				return;
			case FhirResourcePackage.VALUE_SET_EXPANSION_CONTAINS__ABSTRACT:
				setAbstract((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)null);
				return;
			case FhirResourcePackage.VALUE_SET_EXPANSION_CONTAINS__VERSION:
				setVersion((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.VALUE_SET_EXPANSION_CONTAINS__CODE:
				setCode((Code)null);
				return;
			case FhirResourcePackage.VALUE_SET_EXPANSION_CONTAINS__DISPLAY:
				setDisplay((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.VALUE_SET_EXPANSION_CONTAINS__CONTAINS:
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
			case FhirResourcePackage.VALUE_SET_EXPANSION_CONTAINS__SYSTEM:
				return system != null;
			case FhirResourcePackage.VALUE_SET_EXPANSION_CONTAINS__ABSTRACT:
				return abstract_ != null;
			case FhirResourcePackage.VALUE_SET_EXPANSION_CONTAINS__VERSION:
				return version != null;
			case FhirResourcePackage.VALUE_SET_EXPANSION_CONTAINS__CODE:
				return code != null;
			case FhirResourcePackage.VALUE_SET_EXPANSION_CONTAINS__DISPLAY:
				return display != null;
			case FhirResourcePackage.VALUE_SET_EXPANSION_CONTAINS__CONTAINS:
				return contains != null && !contains.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ValueSetExpansionContainsImpl
