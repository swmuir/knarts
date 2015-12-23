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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.datatype.Narrative;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.CompositionSection;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composition Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.CompositionSectionImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.CompositionSectionImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.CompositionSectionImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.CompositionSectionImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.CompositionSectionImpl#getOrderedBy <em>Ordered By</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.CompositionSectionImpl#getEntries <em>Entry</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.CompositionSectionImpl#getEmptyReason <em>Empty Reason</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.CompositionSectionImpl#getSections <em>Section</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositionSectionImpl extends BackboneElementImpl implements CompositionSection {
	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String title;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept code;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected Narrative text;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected Code mode;

	/**
	 * The cached value of the '{@link #getOrderedBy() <em>Ordered By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderedBy()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept orderedBy;

	/**
	 * The cached value of the '{@link #getEntries() <em>Entry</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> entries;

	/**
	 * The cached value of the '{@link #getEmptyReason() <em>Empty Reason</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmptyReason()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept emptyReason;

	/**
	 * The cached value of the '{@link #getSections() <em>Section</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSections()
	 * @generated
	 * @ordered
	 */
	protected EList<CompositionSection> sections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositionSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getCompositionSection();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getTitle() {
		if (title != null && title.eIsProxy()) {
			InternalEObject oldTitle = (InternalEObject)title;
			title = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldTitle);
			if (title != oldTitle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.COMPOSITION_SECTION__TITLE, oldTitle, title));
			}
		}
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(org.eclipse.mdht.uml.fhir.core.datatype.String newTitle) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.COMPOSITION_SECTION__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getCode() {
		if (code != null && code.eIsProxy()) {
			InternalEObject oldCode = (InternalEObject)code;
			code = (CodeableConcept)eResolveProxy(oldCode);
			if (code != oldCode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.COMPOSITION_SECTION__CODE, oldCode, code));
			}
		}
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(CodeableConcept newCode) {
		CodeableConcept oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.COMPOSITION_SECTION__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Narrative getText() {
		if (text != null && text.eIsProxy()) {
			InternalEObject oldText = (InternalEObject)text;
			text = (Narrative)eResolveProxy(oldText);
			if (text != oldText) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.COMPOSITION_SECTION__TEXT, oldText, text));
			}
		}
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Narrative basicGetText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(Narrative newText) {
		Narrative oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.COMPOSITION_SECTION__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getMode() {
		if (mode != null && mode.eIsProxy()) {
			InternalEObject oldMode = (InternalEObject)mode;
			mode = (Code)eResolveProxy(oldMode);
			if (mode != oldMode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.COMPOSITION_SECTION__MODE, oldMode, mode));
			}
		}
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(Code newMode) {
		Code oldMode = mode;
		mode = newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.COMPOSITION_SECTION__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getOrderedBy() {
		if (orderedBy != null && orderedBy.eIsProxy()) {
			InternalEObject oldOrderedBy = (InternalEObject)orderedBy;
			orderedBy = (CodeableConcept)eResolveProxy(oldOrderedBy);
			if (orderedBy != oldOrderedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.COMPOSITION_SECTION__ORDERED_BY, oldOrderedBy, orderedBy));
			}
		}
		return orderedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetOrderedBy() {
		return orderedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderedBy(CodeableConcept newOrderedBy) {
		CodeableConcept oldOrderedBy = orderedBy;
		orderedBy = newOrderedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.COMPOSITION_SECTION__ORDERED_BY, oldOrderedBy, orderedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getEntries() {
		if (entries == null) {
			entries = new EObjectResolvingEList<Resource>(Resource.class, this, FhirResourcePackage.COMPOSITION_SECTION__ENTRY);
		}
		return entries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getEmptyReason() {
		if (emptyReason != null && emptyReason.eIsProxy()) {
			InternalEObject oldEmptyReason = (InternalEObject)emptyReason;
			emptyReason = (CodeableConcept)eResolveProxy(oldEmptyReason);
			if (emptyReason != oldEmptyReason) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.COMPOSITION_SECTION__EMPTY_REASON, oldEmptyReason, emptyReason));
			}
		}
		return emptyReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept basicGetEmptyReason() {
		return emptyReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmptyReason(CodeableConcept newEmptyReason) {
		CodeableConcept oldEmptyReason = emptyReason;
		emptyReason = newEmptyReason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.COMPOSITION_SECTION__EMPTY_REASON, oldEmptyReason, emptyReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompositionSection> getSections() {
		if (sections == null) {
			sections = new EObjectContainmentEList<CompositionSection>(CompositionSection.class, this, FhirResourcePackage.COMPOSITION_SECTION__SECTION);
		}
		return sections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.COMPOSITION_SECTION__SECTION:
				return ((InternalEList<?>)getSections()).basicRemove(otherEnd, msgs);
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
			case FhirResourcePackage.COMPOSITION_SECTION__TITLE:
				if (resolve) return getTitle();
				return basicGetTitle();
			case FhirResourcePackage.COMPOSITION_SECTION__CODE:
				if (resolve) return getCode();
				return basicGetCode();
			case FhirResourcePackage.COMPOSITION_SECTION__TEXT:
				if (resolve) return getText();
				return basicGetText();
			case FhirResourcePackage.COMPOSITION_SECTION__MODE:
				if (resolve) return getMode();
				return basicGetMode();
			case FhirResourcePackage.COMPOSITION_SECTION__ORDERED_BY:
				if (resolve) return getOrderedBy();
				return basicGetOrderedBy();
			case FhirResourcePackage.COMPOSITION_SECTION__ENTRY:
				return getEntries();
			case FhirResourcePackage.COMPOSITION_SECTION__EMPTY_REASON:
				if (resolve) return getEmptyReason();
				return basicGetEmptyReason();
			case FhirResourcePackage.COMPOSITION_SECTION__SECTION:
				return getSections();
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
			case FhirResourcePackage.COMPOSITION_SECTION__TITLE:
				setTitle((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.COMPOSITION_SECTION__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.COMPOSITION_SECTION__TEXT:
				setText((Narrative)newValue);
				return;
			case FhirResourcePackage.COMPOSITION_SECTION__MODE:
				setMode((Code)newValue);
				return;
			case FhirResourcePackage.COMPOSITION_SECTION__ORDERED_BY:
				setOrderedBy((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.COMPOSITION_SECTION__ENTRY:
				getEntries().clear();
				getEntries().addAll((Collection<? extends Resource>)newValue);
				return;
			case FhirResourcePackage.COMPOSITION_SECTION__EMPTY_REASON:
				setEmptyReason((CodeableConcept)newValue);
				return;
			case FhirResourcePackage.COMPOSITION_SECTION__SECTION:
				getSections().clear();
				getSections().addAll((Collection<? extends CompositionSection>)newValue);
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
			case FhirResourcePackage.COMPOSITION_SECTION__TITLE:
				setTitle((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.COMPOSITION_SECTION__CODE:
				setCode((CodeableConcept)null);
				return;
			case FhirResourcePackage.COMPOSITION_SECTION__TEXT:
				setText((Narrative)null);
				return;
			case FhirResourcePackage.COMPOSITION_SECTION__MODE:
				setMode((Code)null);
				return;
			case FhirResourcePackage.COMPOSITION_SECTION__ORDERED_BY:
				setOrderedBy((CodeableConcept)null);
				return;
			case FhirResourcePackage.COMPOSITION_SECTION__ENTRY:
				getEntries().clear();
				return;
			case FhirResourcePackage.COMPOSITION_SECTION__EMPTY_REASON:
				setEmptyReason((CodeableConcept)null);
				return;
			case FhirResourcePackage.COMPOSITION_SECTION__SECTION:
				getSections().clear();
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
			case FhirResourcePackage.COMPOSITION_SECTION__TITLE:
				return title != null;
			case FhirResourcePackage.COMPOSITION_SECTION__CODE:
				return code != null;
			case FhirResourcePackage.COMPOSITION_SECTION__TEXT:
				return text != null;
			case FhirResourcePackage.COMPOSITION_SECTION__MODE:
				return mode != null;
			case FhirResourcePackage.COMPOSITION_SECTION__ORDERED_BY:
				return orderedBy != null;
			case FhirResourcePackage.COMPOSITION_SECTION__ENTRY:
				return entries != null && !entries.isEmpty();
			case FhirResourcePackage.COMPOSITION_SECTION__EMPTY_REASON:
				return emptyReason != null;
			case FhirResourcePackage.COMPOSITION_SECTION__SECTION:
				return sections != null && !sections.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompositionSectionImpl
