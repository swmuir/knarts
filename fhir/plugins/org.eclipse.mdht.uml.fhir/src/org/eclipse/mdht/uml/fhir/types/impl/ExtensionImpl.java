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
package org.eclipse.mdht.uml.fhir.types.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.mdht.uml.fhir.types.DataType;
import org.eclipse.mdht.uml.fhir.types.Extension;
import org.eclipse.mdht.uml.fhir.types.FHIRTypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.types.impl.ExtensionImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.types.impl.ExtensionImpl#getValueString <em>Value String</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.types.impl.ExtensionImpl#getValueInteger <em>Value Integer</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.types.impl.ExtensionImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtensionImpl extends MinimalEObjectImpl.Container implements Extension {
	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueString() <em>Value String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueString()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueString() <em>Value String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueString()
	 * @generated
	 * @ordered
	 */
	protected String valueString = VALUE_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueInteger() <em>Value Integer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueInteger()
	 * @generated
	 * @ordered
	 */
	protected static final Integer VALUE_INTEGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueInteger() <em>Value Integer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueInteger()
	 * @generated
	 * @ordered
	 */
	protected Integer valueInteger = VALUE_INTEGER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected DataType value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRTypesPackage.Literals.EXTENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRTypesPackage.EXTENSION__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueString() {
		return valueString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueString(String newValueString) {
		String oldValueString = valueString;
		valueString = newValueString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRTypesPackage.EXTENSION__VALUE_STRING, oldValueString, valueString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getValueInteger() {
		return valueInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueInteger(Integer newValueInteger) {
		Integer oldValueInteger = valueInteger;
		valueInteger = newValueInteger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRTypesPackage.EXTENSION__VALUE_INTEGER, oldValueInteger, valueInteger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(DataType newValue, NotificationChain msgs) {
		DataType oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FHIRTypesPackage.EXTENSION__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(DataType newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FHIRTypesPackage.EXTENSION__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FHIRTypesPackage.EXTENSION__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRTypesPackage.EXTENSION__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FHIRTypesPackage.EXTENSION__VALUE:
				return basicSetValue(null, msgs);
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
			case FHIRTypesPackage.EXTENSION__URL:
				return getUrl();
			case FHIRTypesPackage.EXTENSION__VALUE_STRING:
				return getValueString();
			case FHIRTypesPackage.EXTENSION__VALUE_INTEGER:
				return getValueInteger();
			case FHIRTypesPackage.EXTENSION__VALUE:
				return getValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FHIRTypesPackage.EXTENSION__URL:
				setUrl((String)newValue);
				return;
			case FHIRTypesPackage.EXTENSION__VALUE_STRING:
				setValueString((String)newValue);
				return;
			case FHIRTypesPackage.EXTENSION__VALUE_INTEGER:
				setValueInteger((Integer)newValue);
				return;
			case FHIRTypesPackage.EXTENSION__VALUE:
				setValue((DataType)newValue);
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
			case FHIRTypesPackage.EXTENSION__URL:
				setUrl(URL_EDEFAULT);
				return;
			case FHIRTypesPackage.EXTENSION__VALUE_STRING:
				setValueString(VALUE_STRING_EDEFAULT);
				return;
			case FHIRTypesPackage.EXTENSION__VALUE_INTEGER:
				setValueInteger(VALUE_INTEGER_EDEFAULT);
				return;
			case FHIRTypesPackage.EXTENSION__VALUE:
				setValue((DataType)null);
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
			case FHIRTypesPackage.EXTENSION__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case FHIRTypesPackage.EXTENSION__VALUE_STRING:
				return VALUE_STRING_EDEFAULT == null ? valueString != null : !VALUE_STRING_EDEFAULT.equals(valueString);
			case FHIRTypesPackage.EXTENSION__VALUE_INTEGER:
				return VALUE_INTEGER_EDEFAULT == null ? valueInteger != null : !VALUE_INTEGER_EDEFAULT.equals(valueInteger);
			case FHIRTypesPackage.EXTENSION__VALUE:
				return value != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (url: ");
		result.append(url);
		result.append(", valueString: ");
		result.append(valueString);
		result.append(", valueInteger: ");
		result.append(valueInteger);
		result.append(')');
		return result.toString();
	}

} //ExtensionImpl
