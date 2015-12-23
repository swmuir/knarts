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

import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage;
import org.eclipse.mdht.uml.fhir.core.datatype.HumanName;
import org.eclipse.mdht.uml.fhir.core.datatype.Period;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Human Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.HumanNameImpl#getUse <em>Use</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.HumanNameImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.HumanNameImpl#getFamilies <em>Family</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.HumanNameImpl#getGivens <em>Given</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.HumanNameImpl#getPrefixes <em>Prefix</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.HumanNameImpl#getSuffixes <em>Suffix</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.HumanNameImpl#getPeriod <em>Period</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HumanNameImpl extends DataTypeImpl implements HumanName {
	/**
	 * The cached value of the '{@link #getUse() <em>Use</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse()
	 * @generated
	 * @ordered
	 */
	protected Code use;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String text;

	/**
	 * The cached value of the '{@link #getFamilies() <em>Family</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilies()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.mdht.uml.fhir.core.datatype.String> families;

	/**
	 * The cached value of the '{@link #getGivens() <em>Given</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGivens()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.mdht.uml.fhir.core.datatype.String> givens;

	/**
	 * The cached value of the '{@link #getPrefixes() <em>Prefix</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefixes()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.mdht.uml.fhir.core.datatype.String> prefixes;

	/**
	 * The cached value of the '{@link #getSuffixes() <em>Suffix</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuffixes()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.mdht.uml.fhir.core.datatype.String> suffixes;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period period;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HumanNameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirDatatypePackage.Literals.HUMAN_NAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getUse() {
		if (use != null && use.eIsProxy()) {
			InternalEObject oldUse = (InternalEObject)use;
			use = (Code)eResolveProxy(oldUse);
			if (use != oldUse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.HUMAN_NAME__USE, oldUse, use));
			}
		}
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetUse() {
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUse(Code newUse) {
		Code oldUse = use;
		use = newUse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.HUMAN_NAME__USE, oldUse, use));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getText() {
		if (text != null && text.eIsProxy()) {
			InternalEObject oldText = (InternalEObject)text;
			text = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldText);
			if (text != oldText) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.HUMAN_NAME__TEXT, oldText, text));
			}
		}
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(org.eclipse.mdht.uml.fhir.core.datatype.String newText) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.HUMAN_NAME__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.mdht.uml.fhir.core.datatype.String> getFamilies() {
		if (families == null) {
			families = new EObjectResolvingEList<org.eclipse.mdht.uml.fhir.core.datatype.String>(org.eclipse.mdht.uml.fhir.core.datatype.String.class, this, FhirDatatypePackage.HUMAN_NAME__FAMILY);
		}
		return families;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.mdht.uml.fhir.core.datatype.String> getGivens() {
		if (givens == null) {
			givens = new EObjectResolvingEList<org.eclipse.mdht.uml.fhir.core.datatype.String>(org.eclipse.mdht.uml.fhir.core.datatype.String.class, this, FhirDatatypePackage.HUMAN_NAME__GIVEN);
		}
		return givens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.mdht.uml.fhir.core.datatype.String> getPrefixes() {
		if (prefixes == null) {
			prefixes = new EObjectResolvingEList<org.eclipse.mdht.uml.fhir.core.datatype.String>(org.eclipse.mdht.uml.fhir.core.datatype.String.class, this, FhirDatatypePackage.HUMAN_NAME__PREFIX);
		}
		return prefixes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.mdht.uml.fhir.core.datatype.String> getSuffixes() {
		if (suffixes == null) {
			suffixes = new EObjectResolvingEList<org.eclipse.mdht.uml.fhir.core.datatype.String>(org.eclipse.mdht.uml.fhir.core.datatype.String.class, this, FhirDatatypePackage.HUMAN_NAME__SUFFIX);
		}
		return suffixes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getPeriod() {
		if (period != null && period.eIsProxy()) {
			InternalEObject oldPeriod = (InternalEObject)period;
			period = (Period)eResolveProxy(oldPeriod);
			if (period != oldPeriod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.HUMAN_NAME__PERIOD, oldPeriod, period));
			}
		}
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period basicGetPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(Period newPeriod) {
		Period oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.HUMAN_NAME__PERIOD, oldPeriod, period));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirDatatypePackage.HUMAN_NAME__USE:
				if (resolve) return getUse();
				return basicGetUse();
			case FhirDatatypePackage.HUMAN_NAME__TEXT:
				if (resolve) return getText();
				return basicGetText();
			case FhirDatatypePackage.HUMAN_NAME__FAMILY:
				return getFamilies();
			case FhirDatatypePackage.HUMAN_NAME__GIVEN:
				return getGivens();
			case FhirDatatypePackage.HUMAN_NAME__PREFIX:
				return getPrefixes();
			case FhirDatatypePackage.HUMAN_NAME__SUFFIX:
				return getSuffixes();
			case FhirDatatypePackage.HUMAN_NAME__PERIOD:
				if (resolve) return getPeriod();
				return basicGetPeriod();
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
			case FhirDatatypePackage.HUMAN_NAME__USE:
				setUse((Code)newValue);
				return;
			case FhirDatatypePackage.HUMAN_NAME__TEXT:
				setText((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirDatatypePackage.HUMAN_NAME__FAMILY:
				getFamilies().clear();
				getFamilies().addAll((Collection<? extends org.eclipse.mdht.uml.fhir.core.datatype.String>)newValue);
				return;
			case FhirDatatypePackage.HUMAN_NAME__GIVEN:
				getGivens().clear();
				getGivens().addAll((Collection<? extends org.eclipse.mdht.uml.fhir.core.datatype.String>)newValue);
				return;
			case FhirDatatypePackage.HUMAN_NAME__PREFIX:
				getPrefixes().clear();
				getPrefixes().addAll((Collection<? extends org.eclipse.mdht.uml.fhir.core.datatype.String>)newValue);
				return;
			case FhirDatatypePackage.HUMAN_NAME__SUFFIX:
				getSuffixes().clear();
				getSuffixes().addAll((Collection<? extends org.eclipse.mdht.uml.fhir.core.datatype.String>)newValue);
				return;
			case FhirDatatypePackage.HUMAN_NAME__PERIOD:
				setPeriod((Period)newValue);
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
			case FhirDatatypePackage.HUMAN_NAME__USE:
				setUse((Code)null);
				return;
			case FhirDatatypePackage.HUMAN_NAME__TEXT:
				setText((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirDatatypePackage.HUMAN_NAME__FAMILY:
				getFamilies().clear();
				return;
			case FhirDatatypePackage.HUMAN_NAME__GIVEN:
				getGivens().clear();
				return;
			case FhirDatatypePackage.HUMAN_NAME__PREFIX:
				getPrefixes().clear();
				return;
			case FhirDatatypePackage.HUMAN_NAME__SUFFIX:
				getSuffixes().clear();
				return;
			case FhirDatatypePackage.HUMAN_NAME__PERIOD:
				setPeriod((Period)null);
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
			case FhirDatatypePackage.HUMAN_NAME__USE:
				return use != null;
			case FhirDatatypePackage.HUMAN_NAME__TEXT:
				return text != null;
			case FhirDatatypePackage.HUMAN_NAME__FAMILY:
				return families != null && !families.isEmpty();
			case FhirDatatypePackage.HUMAN_NAME__GIVEN:
				return givens != null && !givens.isEmpty();
			case FhirDatatypePackage.HUMAN_NAME__PREFIX:
				return prefixes != null && !prefixes.isEmpty();
			case FhirDatatypePackage.HUMAN_NAME__SUFFIX:
				return suffixes != null && !suffixes.isEmpty();
			case FhirDatatypePackage.HUMAN_NAME__PERIOD:
				return period != null;
		}
		return super.eIsSet(featureID);
	}

} //HumanNameImpl
