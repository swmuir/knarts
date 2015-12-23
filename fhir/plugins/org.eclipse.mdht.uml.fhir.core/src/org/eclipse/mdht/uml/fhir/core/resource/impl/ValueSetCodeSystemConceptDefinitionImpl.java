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

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.ValueSetCodeSystemConceptDefinition;
import org.eclipse.mdht.uml.fhir.core.resource.ValueSetCodeSystemConceptDefinitionDesignation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Set Code System Concept Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ValueSetCodeSystemConceptDefinitionImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ValueSetCodeSystemConceptDefinitionImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ValueSetCodeSystemConceptDefinitionImpl#getDisplay <em>Display</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ValueSetCodeSystemConceptDefinitionImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ValueSetCodeSystemConceptDefinitionImpl#getDesignations <em>Designation</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ValueSetCodeSystemConceptDefinitionImpl#getConcepts <em>Concept</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueSetCodeSystemConceptDefinitionImpl extends BackboneElementImpl implements ValueSetCodeSystemConceptDefinition {
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
	 * The cached value of the '{@link #getAbstract() <em>Abstract</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.Boolean abstract_;

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
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String definition;

	/**
	 * The cached value of the '{@link #getDesignations() <em>Designation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignations()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSetCodeSystemConceptDefinitionDesignation> designations;

	/**
	 * The cached value of the '{@link #getConcepts() <em>Concept</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcepts()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSetCodeSystemConceptDefinition> concepts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueSetCodeSystemConceptDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getValueSetCodeSystemConceptDefinition();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.VALUE_SET_CODE_SYSTEM_CONCEPT_DEFINITION__CODE, oldCode, code));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.VALUE_SET_CODE_SYSTEM_CONCEPT_DEFINITION__CODE, oldCode, code));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.VALUE_SET_CODE_SYSTEM_CONCEPT_DEFINITION__ABSTRACT, oldAbstract, abstract_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.VALUE_SET_CODE_SYSTEM_CONCEPT_DEFINITION__ABSTRACT, oldAbstract, abstract_));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.VALUE_SET_CODE_SYSTEM_CONCEPT_DEFINITION__DISPLAY, oldDisplay, display));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.VALUE_SET_CODE_SYSTEM_CONCEPT_DEFINITION__DISPLAY, oldDisplay, display));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getDefinition() {
		if (definition != null && definition.eIsProxy()) {
			InternalEObject oldDefinition = (InternalEObject)definition;
			definition = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldDefinition);
			if (definition != oldDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.VALUE_SET_CODE_SYSTEM_CONCEPT_DEFINITION__DEFINITION, oldDefinition, definition));
			}
		}
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(org.eclipse.mdht.uml.fhir.core.datatype.String newDefinition) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.VALUE_SET_CODE_SYSTEM_CONCEPT_DEFINITION__DEFINITION, oldDefinition, definition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSetCodeSystemConceptDefinitionDesignation> getDesignations() {
		if (designations == null) {
			designations = new EObjectContainmentEList<ValueSetCodeSystemConceptDefinitionDesignation>(ValueSetCodeSystemConceptDefinitionDesignation.class, this, FhirResourcePackage.VALUE_SET_CODE_SYSTEM_CONCEPT_DEFINITION__DESIGNATION);
		}
		return designations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSetCodeSystemConceptDefinition> getConcepts() {
		if (concepts == null) {
			concepts = new EObjectContainmentEList<ValueSetCodeSystemConceptDefinition>(ValueSetCodeSystemConceptDefinition.class, this, FhirResourcePackage.VALUE_SET_CODE_SYSTEM_CONCEPT_DEFINITION__CONCEPT);
		}
		return concepts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.VALUE_SET_CODE_SYSTEM_CONCEPT_DEFINITION__DESIGNATION:
				return ((InternalEList<?>)getDesignations()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.VALUE_SET_CODE_SYSTEM_CONCEPT_DEFINITION__CONCEPT:
				return ((InternalEList<?>)getConcepts()).basicRemove(otherEnd, msgs);
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
			case FhirResourcePackage.VALUE_SET_CODE_SYSTEM_CONCEPT_DEFINITION__CODE:
				if (resolve) return getCode();
				return basicGetCode();
			case FhirResourcePackage.VALUE_SET_CODE_SYSTEM_CONCEPT_DEFINITION__ABSTRACT:
				if (resolve) return getAbstract();
				return basicGetAbstract();
			case FhirResourcePackage.VALUE_SET_CODE_SYSTEM_CONCEPT_DEFINITION__DISPLAY:
				if (resolve) return getDisplay();
				return basicGetDisplay();
			case FhirResourcePackage.VALUE_SET_CODE_SYSTEM_CONCEPT_DEFINITION__DEFINITION:
				if (resolve) return getDefinition();
				return basicGetDefinition();
			case FhirResourcePackage.VALUE_SET_CODE_SYSTEM_CONCEPT_DEFINITION__DESIGNATION:
				return getDesignations();
			case FhirResourcePackage.VALUE_SET_CODE_SYSTEM_CONCEPT_DEFINITION__CONCEPT:
				return getConcepts();
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
			case FhirResourcePackage.VALUE_SET_CODE_SYSTEM_CONCEPT_DEFINITION__CODE:
				setCode((Code)newValue);
				return;
			case FhirResourcePackage.VALUE_SET_CODE_SYSTEM_CONCEPT_DEFINITION__ABSTRACT:
				setAbstract((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)newValue);
				return;
			case FhirResourcePackage.VALUE_SET_CODE_SYSTEM_CONCEPT_DEFINITION__DISPLAY:
				setDisplay((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.VALUE_SET_CODE_SYSTEM_CONCEPT_DEFINITION__DEFINITION:
				setDefinition((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.VALUE_SET_CODE_SYSTEM_CONCEPT_DEFINITION__DESIGNATION:
				getDesignations().clear();
				getDesignations().addAll((Collection<? extends ValueSetCodeSystemConceptDefinitionDesignation>)newValue);
				return;
			case FhirResourcePackage.VALUE_SET_CODE_SYSTEM_CONCEPT_DEFINITION__CONCEPT:
				getConcepts().clear();
				getConcepts().addAll((Collection<? extends ValueSetCodeSystemConceptDefinition>)newValue);
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
			case FhirResourcePackage.VALUE_SET_CODE_SYSTEM_CONCEPT_DEFINITION__CODE:
				setCode((Code)null);
				return;
			case FhirResourcePackage.VALUE_SET_CODE_SYSTEM_CONCEPT_DEFINITION__ABSTRACT:
				setAbstract((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)null);
				return;
			case FhirResourcePackage.VALUE_SET_CODE_SYSTEM_CONCEPT_DEFINITION__DISPLAY:
				setDisplay((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.VALUE_SET_CODE_SYSTEM_CONCEPT_DEFINITION__DEFINITION:
				setDefinition((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.VALUE_SET_CODE_SYSTEM_CONCEPT_DEFINITION__DESIGNATION:
				getDesignations().clear();
				return;
			case FhirResourcePackage.VALUE_SET_CODE_SYSTEM_CONCEPT_DEFINITION__CONCEPT:
				getConcepts().clear();
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
			case FhirResourcePackage.VALUE_SET_CODE_SYSTEM_CONCEPT_DEFINITION__CODE:
				return code != null;
			case FhirResourcePackage.VALUE_SET_CODE_SYSTEM_CONCEPT_DEFINITION__ABSTRACT:
				return abstract_ != null;
			case FhirResourcePackage.VALUE_SET_CODE_SYSTEM_CONCEPT_DEFINITION__DISPLAY:
				return display != null;
			case FhirResourcePackage.VALUE_SET_CODE_SYSTEM_CONCEPT_DEFINITION__DEFINITION:
				return definition != null;
			case FhirResourcePackage.VALUE_SET_CODE_SYSTEM_CONCEPT_DEFINITION__DESIGNATION:
				return designations != null && !designations.isEmpty();
			case FhirResourcePackage.VALUE_SET_CODE_SYSTEM_CONCEPT_DEFINITION__CONCEPT:
				return concepts != null && !concepts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ValueSetCodeSystemConceptDefinitionImpl
