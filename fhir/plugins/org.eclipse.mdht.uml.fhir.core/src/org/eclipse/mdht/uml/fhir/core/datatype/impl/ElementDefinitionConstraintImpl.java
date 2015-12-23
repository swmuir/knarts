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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.ElementDefinitionConstraint;
import org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage;
import org.eclipse.mdht.uml.fhir.core.datatype.Id;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Definition Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionConstraintImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionConstraintImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionConstraintImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionConstraintImpl#getHuman <em>Human</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.impl.ElementDefinitionConstraintImpl#getXpath <em>Xpath</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementDefinitionConstraintImpl extends BackboneElementImpl implements ElementDefinitionConstraint {
	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected Id key;

	/**
	 * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirements()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String requirements;

	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected Code severity;

	/**
	 * The cached value of the '{@link #getHuman() <em>Human</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHuman()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String human;

	/**
	 * The cached value of the '{@link #getXpath() <em>Xpath</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXpath()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String xpath;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementDefinitionConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirDatatypePackage.Literals.ELEMENT_DEFINITION_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getKey() {
		if (key != null && key.eIsProxy()) {
			InternalEObject oldKey = (InternalEObject)key;
			key = (Id)eResolveProxy(oldKey);
			if (key != oldKey) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.ELEMENT_DEFINITION_CONSTRAINT__KEY, oldKey, key));
			}
		}
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id basicGetKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(Id newKey) {
		Id oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.ELEMENT_DEFINITION_CONSTRAINT__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getRequirements() {
		if (requirements != null && requirements.eIsProxy()) {
			InternalEObject oldRequirements = (InternalEObject)requirements;
			requirements = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldRequirements);
			if (requirements != oldRequirements) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.ELEMENT_DEFINITION_CONSTRAINT__REQUIREMENTS, oldRequirements, requirements));
			}
		}
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetRequirements() {
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequirements(org.eclipse.mdht.uml.fhir.core.datatype.String newRequirements) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldRequirements = requirements;
		requirements = newRequirements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.ELEMENT_DEFINITION_CONSTRAINT__REQUIREMENTS, oldRequirements, requirements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getSeverity() {
		if (severity != null && severity.eIsProxy()) {
			InternalEObject oldSeverity = (InternalEObject)severity;
			severity = (Code)eResolveProxy(oldSeverity);
			if (severity != oldSeverity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.ELEMENT_DEFINITION_CONSTRAINT__SEVERITY, oldSeverity, severity));
			}
		}
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeverity(Code newSeverity) {
		Code oldSeverity = severity;
		severity = newSeverity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.ELEMENT_DEFINITION_CONSTRAINT__SEVERITY, oldSeverity, severity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getHuman() {
		if (human != null && human.eIsProxy()) {
			InternalEObject oldHuman = (InternalEObject)human;
			human = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldHuman);
			if (human != oldHuman) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.ELEMENT_DEFINITION_CONSTRAINT__HUMAN, oldHuman, human));
			}
		}
		return human;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetHuman() {
		return human;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHuman(org.eclipse.mdht.uml.fhir.core.datatype.String newHuman) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldHuman = human;
		human = newHuman;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.ELEMENT_DEFINITION_CONSTRAINT__HUMAN, oldHuman, human));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getXpath() {
		if (xpath != null && xpath.eIsProxy()) {
			InternalEObject oldXpath = (InternalEObject)xpath;
			xpath = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldXpath);
			if (xpath != oldXpath) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirDatatypePackage.ELEMENT_DEFINITION_CONSTRAINT__XPATH, oldXpath, xpath));
			}
		}
		return xpath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetXpath() {
		return xpath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXpath(org.eclipse.mdht.uml.fhir.core.datatype.String newXpath) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldXpath = xpath;
		xpath = newXpath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirDatatypePackage.ELEMENT_DEFINITION_CONSTRAINT__XPATH, oldXpath, xpath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirDatatypePackage.ELEMENT_DEFINITION_CONSTRAINT__KEY:
				if (resolve) return getKey();
				return basicGetKey();
			case FhirDatatypePackage.ELEMENT_DEFINITION_CONSTRAINT__REQUIREMENTS:
				if (resolve) return getRequirements();
				return basicGetRequirements();
			case FhirDatatypePackage.ELEMENT_DEFINITION_CONSTRAINT__SEVERITY:
				if (resolve) return getSeverity();
				return basicGetSeverity();
			case FhirDatatypePackage.ELEMENT_DEFINITION_CONSTRAINT__HUMAN:
				if (resolve) return getHuman();
				return basicGetHuman();
			case FhirDatatypePackage.ELEMENT_DEFINITION_CONSTRAINT__XPATH:
				if (resolve) return getXpath();
				return basicGetXpath();
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
			case FhirDatatypePackage.ELEMENT_DEFINITION_CONSTRAINT__KEY:
				setKey((Id)newValue);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION_CONSTRAINT__REQUIREMENTS:
				setRequirements((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION_CONSTRAINT__SEVERITY:
				setSeverity((Code)newValue);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION_CONSTRAINT__HUMAN:
				setHuman((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION_CONSTRAINT__XPATH:
				setXpath((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
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
			case FhirDatatypePackage.ELEMENT_DEFINITION_CONSTRAINT__KEY:
				setKey((Id)null);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION_CONSTRAINT__REQUIREMENTS:
				setRequirements((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION_CONSTRAINT__SEVERITY:
				setSeverity((Code)null);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION_CONSTRAINT__HUMAN:
				setHuman((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirDatatypePackage.ELEMENT_DEFINITION_CONSTRAINT__XPATH:
				setXpath((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
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
			case FhirDatatypePackage.ELEMENT_DEFINITION_CONSTRAINT__KEY:
				return key != null;
			case FhirDatatypePackage.ELEMENT_DEFINITION_CONSTRAINT__REQUIREMENTS:
				return requirements != null;
			case FhirDatatypePackage.ELEMENT_DEFINITION_CONSTRAINT__SEVERITY:
				return severity != null;
			case FhirDatatypePackage.ELEMENT_DEFINITION_CONSTRAINT__HUMAN:
				return human != null;
			case FhirDatatypePackage.ELEMENT_DEFINITION_CONSTRAINT__XPATH:
				return xpath != null;
		}
		return super.eIsSet(featureID);
	}

} //ElementDefinitionConstraintImpl
