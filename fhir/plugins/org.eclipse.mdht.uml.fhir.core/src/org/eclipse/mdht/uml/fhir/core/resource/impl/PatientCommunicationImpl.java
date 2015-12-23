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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.PatientCommunication;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient Communication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PatientCommunicationImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.PatientCommunicationImpl#getPreferred <em>Preferred</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatientCommunicationImpl extends BackboneElementImpl implements PatientCommunication {
	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept language;

	/**
	 * The cached value of the '{@link #getPreferred() <em>Preferred</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferred()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.Boolean preferred;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientCommunicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getPatientCommunication();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getLanguage() {
		if (language != null && language.eIsProxy()) {
			InternalEObject oldLanguage = (InternalEObject)language;
			language = (CodeableConcept)eResolveProxy(oldLanguage);
			if (language != oldLanguage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PATIENT_COMMUNICATION__LANGUAGE, oldLanguage, language));
			}
		}
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(CodeableConcept newLanguage) {
		CodeableConcept oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PATIENT_COMMUNICATION__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean getPreferred() {
		if (preferred != null && preferred.eIsProxy()) {
			InternalEObject oldPreferred = (InternalEObject)preferred;
			preferred = (org.eclipse.mdht.uml.fhir.core.datatype.Boolean)eResolveProxy(oldPreferred);
			if (preferred != oldPreferred) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.PATIENT_COMMUNICATION__PREFERRED, oldPreferred, preferred));
			}
		}
		return preferred;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean basicGetPreferred() {
		return preferred;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreferred(org.eclipse.mdht.uml.fhir.core.datatype.Boolean newPreferred) {
		org.eclipse.mdht.uml.fhir.core.datatype.Boolean oldPreferred = preferred;
		preferred = newPreferred;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.PATIENT_COMMUNICATION__PREFERRED, oldPreferred, preferred));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirResourcePackage.PATIENT_COMMUNICATION__LANGUAGE:
				if (resolve) return getLanguage();
				return basicGetLanguage();
			case FhirResourcePackage.PATIENT_COMMUNICATION__PREFERRED:
				if (resolve) return getPreferred();
				return basicGetPreferred();
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
			case FhirResourcePackage.PATIENT_COMMUNICATION__LANGUAGE:
				setLanguage((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.PATIENT_COMMUNICATION__PREFERRED:
				setPreferred((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)newValue);
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
			case FhirResourcePackage.PATIENT_COMMUNICATION__LANGUAGE:
				setLanguage((CodeableConcept)null);
				return;
			case FhirResourcePackage.PATIENT_COMMUNICATION__PREFERRED:
				setPreferred((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)null);
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
			case FhirResourcePackage.PATIENT_COMMUNICATION__LANGUAGE:
				return language != null;
			case FhirResourcePackage.PATIENT_COMMUNICATION__PREFERRED:
				return preferred != null;
		}
		return super.eIsSet(featureID);
	}

} //PatientCommunicationImpl
