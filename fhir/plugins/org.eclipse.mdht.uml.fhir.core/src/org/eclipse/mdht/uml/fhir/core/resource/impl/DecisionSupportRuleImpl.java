/*******************************************************************************
 * Copyright (c) 2016 David Carlson and others.
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

import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;

import org.eclipse.mdht.uml.fhir.core.resource.DecisionSupportRule;
import org.eclipse.mdht.uml.fhir.core.resource.DecisionSupportRuleAction;
import org.eclipse.mdht.uml.fhir.core.resource.DecisionSupportRuleTrigger;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.Library;
import org.eclipse.mdht.uml.fhir.core.resource.ModuleMetadata;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision Support Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DecisionSupportRuleImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DecisionSupportRuleImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DecisionSupportRuleImpl#getModuleMetadata <em>Module Metadata</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DecisionSupportRuleImpl#getLibraries <em>Library</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DecisionSupportRuleImpl#getTriggers <em>Trigger</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DecisionSupportRuleImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.DecisionSupportRuleImpl#getActions <em>Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DecisionSupportRuleImpl extends DomainResourceImpl implements DecisionSupportRule {
	/**
	 * The cached value of the '{@link #getIdentifiers() <em>Identifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifiers;

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
	 * The cached value of the '{@link #getModuleMetadata() <em>Module Metadata</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleMetadata()
	 * @generated
	 * @ordered
	 */
	protected ModuleMetadata moduleMetadata;

	/**
	 * The cached value of the '{@link #getLibraries() <em>Library</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraries()
	 * @generated
	 * @ordered
	 */
	protected EList<Library> libraries;

	/**
	 * The cached value of the '{@link #getTriggers() <em>Trigger</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggers()
	 * @generated
	 * @ordered
	 */
	protected EList<DecisionSupportRuleTrigger> triggers;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String condition;

	/**
	 * The cached value of the '{@link #getActions() <em>Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<DecisionSupportRuleAction> actions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionSupportRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getDecisionSupportRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectResolvingEList<Identifier>(Identifier.class, this, FhirResourcePackage.DECISION_SUPPORT_RULE__IDENTIFIER);
		}
		return identifiers;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DECISION_SUPPORT_RULE__VERSION, oldVersion, version));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DECISION_SUPPORT_RULE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleMetadata getModuleMetadata() {
		if (moduleMetadata != null && moduleMetadata.eIsProxy()) {
			InternalEObject oldModuleMetadata = (InternalEObject)moduleMetadata;
			moduleMetadata = (ModuleMetadata)eResolveProxy(oldModuleMetadata);
			if (moduleMetadata != oldModuleMetadata) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DECISION_SUPPORT_RULE__MODULE_METADATA, oldModuleMetadata, moduleMetadata));
			}
		}
		return moduleMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleMetadata basicGetModuleMetadata() {
		return moduleMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModuleMetadata(ModuleMetadata newModuleMetadata) {
		ModuleMetadata oldModuleMetadata = moduleMetadata;
		moduleMetadata = newModuleMetadata;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DECISION_SUPPORT_RULE__MODULE_METADATA, oldModuleMetadata, moduleMetadata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Library> getLibraries() {
		if (libraries == null) {
			libraries = new EObjectResolvingEList<Library>(Library.class, this, FhirResourcePackage.DECISION_SUPPORT_RULE__LIBRARY);
		}
		return libraries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DecisionSupportRuleTrigger> getTriggers() {
		if (triggers == null) {
			triggers = new EObjectContainmentEList<DecisionSupportRuleTrigger>(DecisionSupportRuleTrigger.class, this, FhirResourcePackage.DECISION_SUPPORT_RULE__TRIGGER);
		}
		return triggers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getCondition() {
		if (condition != null && condition.eIsProxy()) {
			InternalEObject oldCondition = (InternalEObject)condition;
			condition = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldCondition);
			if (condition != oldCondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.DECISION_SUPPORT_RULE__CONDITION, oldCondition, condition));
			}
		}
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(org.eclipse.mdht.uml.fhir.core.datatype.String newCondition) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.DECISION_SUPPORT_RULE__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DecisionSupportRuleAction> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<DecisionSupportRuleAction>(DecisionSupportRuleAction.class, this, FhirResourcePackage.DECISION_SUPPORT_RULE__ACTION);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.DECISION_SUPPORT_RULE__TRIGGER:
				return ((InternalEList<?>)getTriggers()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.DECISION_SUPPORT_RULE__ACTION:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
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
			case FhirResourcePackage.DECISION_SUPPORT_RULE__IDENTIFIER:
				return getIdentifiers();
			case FhirResourcePackage.DECISION_SUPPORT_RULE__VERSION:
				if (resolve) return getVersion();
				return basicGetVersion();
			case FhirResourcePackage.DECISION_SUPPORT_RULE__MODULE_METADATA:
				if (resolve) return getModuleMetadata();
				return basicGetModuleMetadata();
			case FhirResourcePackage.DECISION_SUPPORT_RULE__LIBRARY:
				return getLibraries();
			case FhirResourcePackage.DECISION_SUPPORT_RULE__TRIGGER:
				return getTriggers();
			case FhirResourcePackage.DECISION_SUPPORT_RULE__CONDITION:
				if (resolve) return getCondition();
				return basicGetCondition();
			case FhirResourcePackage.DECISION_SUPPORT_RULE__ACTION:
				return getActions();
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
			case FhirResourcePackage.DECISION_SUPPORT_RULE__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case FhirResourcePackage.DECISION_SUPPORT_RULE__VERSION:
				setVersion((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.DECISION_SUPPORT_RULE__MODULE_METADATA:
				setModuleMetadata((ModuleMetadata)newValue);
				return;
			case FhirResourcePackage.DECISION_SUPPORT_RULE__LIBRARY:
				getLibraries().clear();
				getLibraries().addAll((Collection<? extends Library>)newValue);
				return;
			case FhirResourcePackage.DECISION_SUPPORT_RULE__TRIGGER:
				getTriggers().clear();
				getTriggers().addAll((Collection<? extends DecisionSupportRuleTrigger>)newValue);
				return;
			case FhirResourcePackage.DECISION_SUPPORT_RULE__CONDITION:
				setCondition((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.DECISION_SUPPORT_RULE__ACTION:
				getActions().clear();
				getActions().addAll((Collection<? extends DecisionSupportRuleAction>)newValue);
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
			case FhirResourcePackage.DECISION_SUPPORT_RULE__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case FhirResourcePackage.DECISION_SUPPORT_RULE__VERSION:
				setVersion((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.DECISION_SUPPORT_RULE__MODULE_METADATA:
				setModuleMetadata((ModuleMetadata)null);
				return;
			case FhirResourcePackage.DECISION_SUPPORT_RULE__LIBRARY:
				getLibraries().clear();
				return;
			case FhirResourcePackage.DECISION_SUPPORT_RULE__TRIGGER:
				getTriggers().clear();
				return;
			case FhirResourcePackage.DECISION_SUPPORT_RULE__CONDITION:
				setCondition((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.DECISION_SUPPORT_RULE__ACTION:
				getActions().clear();
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
			case FhirResourcePackage.DECISION_SUPPORT_RULE__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case FhirResourcePackage.DECISION_SUPPORT_RULE__VERSION:
				return version != null;
			case FhirResourcePackage.DECISION_SUPPORT_RULE__MODULE_METADATA:
				return moduleMetadata != null;
			case FhirResourcePackage.DECISION_SUPPORT_RULE__LIBRARY:
				return libraries != null && !libraries.isEmpty();
			case FhirResourcePackage.DECISION_SUPPORT_RULE__TRIGGER:
				return triggers != null && !triggers.isEmpty();
			case FhirResourcePackage.DECISION_SUPPORT_RULE__CONDITION:
				return condition != null;
			case FhirResourcePackage.DECISION_SUPPORT_RULE__ACTION:
				return actions != null && !actions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DecisionSupportRuleImpl
