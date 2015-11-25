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
package org.eclipse.mdht.uml.aml.constraint.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.mdht.uml.aml.constraint.ArchetypeLibrary;
import org.eclipse.mdht.uml.aml.constraint.ConstraintPackage;

import org.eclipse.mdht.uml.aml.constraint.util.ConstraintValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Archetype Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.ArchetypeLibraryImpl#getBase_Package <em>Base Package</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.ArchetypeLibraryImpl#isHas_aom_ids <em>Has aom ids</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.ArchetypeLibraryImpl#getRm_package <em>Rm package</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArchetypeLibraryImpl extends MinimalEObjectImpl.Container implements ArchetypeLibrary {
	/**
	 * The cached value of the '{@link #getBase_Package() <em>Base Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Package()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Package base_Package;

	/**
	 * The default value of the '{@link #isHas_aom_ids() <em>Has aom ids</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHas_aom_ids()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_AOM_IDS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isHas_aom_ids() <em>Has aom ids</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHas_aom_ids()
	 * @generated
	 * @ordered
	 */
	protected boolean has_aom_ids = HAS_AOM_IDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRm_package() <em>Rm package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRm_package()
	 * @generated
	 * @ordered
	 */
	protected static final String RM_PACKAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRm_package() <em>Rm package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRm_package()
	 * @generated
	 * @ordered
	 */
	protected String rm_package = RM_PACKAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchetypeLibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConstraintPackage.Literals.ARCHETYPE_LIBRARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Package getBase_Package() {
		if (base_Package != null && base_Package.eIsProxy()) {
			InternalEObject oldBase_Package = (InternalEObject)base_Package;
			base_Package = (org.eclipse.uml2.uml.Package)eResolveProxy(oldBase_Package);
			if (base_Package != oldBase_Package) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConstraintPackage.ARCHETYPE_LIBRARY__BASE_PACKAGE, oldBase_Package, base_Package));
			}
		}
		return base_Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Package basicGetBase_Package() {
		return base_Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Package(org.eclipse.uml2.uml.Package newBase_Package) {
		org.eclipse.uml2.uml.Package oldBase_Package = base_Package;
		base_Package = newBase_Package;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintPackage.ARCHETYPE_LIBRARY__BASE_PACKAGE, oldBase_Package, base_Package));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHas_aom_ids() {
		return has_aom_ids;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHas_aom_ids(boolean newHas_aom_ids) {
		boolean oldHas_aom_ids = has_aom_ids;
		has_aom_ids = newHas_aom_ids;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintPackage.ARCHETYPE_LIBRARY__HAS_AOM_IDS, oldHas_aom_ids, has_aom_ids));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRm_package() {
		return rm_package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRm_package(String newRm_package) {
		String oldRm_package = rm_package;
		rm_package = newRm_package;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintPackage.ARCHETYPE_LIBRARY__RM_PACKAGE, oldRm_package, rm_package));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOneReferenceModel(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConstraintValidator.DIAGNOSTIC_SOURCE,
						 ConstraintValidator.ARCHETYPE_LIBRARY__ONE_REFERENCE_MODEL,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateOneReferenceModel", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOnlyArchetypes(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConstraintValidator.DIAGNOSTIC_SOURCE,
						 ConstraintValidator.ARCHETYPE_LIBRARY__ONLY_ARCHETYPES,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateOnlyArchetypes", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAOMARCHETYPEHRIDInvariantRmClosureValidity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConstraintValidator.DIAGNOSTIC_SOURCE,
						 ConstraintValidator.ARCHETYPE_LIBRARY__AOMARCHETYPEHRID_INVARIANT_RM_CLOSURE_VALIDITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMARCHETYPEHRIDInvariantRmClosureValidity", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConstraintPackage.ARCHETYPE_LIBRARY__BASE_PACKAGE:
				if (resolve) return getBase_Package();
				return basicGetBase_Package();
			case ConstraintPackage.ARCHETYPE_LIBRARY__HAS_AOM_IDS:
				return isHas_aom_ids();
			case ConstraintPackage.ARCHETYPE_LIBRARY__RM_PACKAGE:
				return getRm_package();
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
			case ConstraintPackage.ARCHETYPE_LIBRARY__BASE_PACKAGE:
				setBase_Package((org.eclipse.uml2.uml.Package)newValue);
				return;
			case ConstraintPackage.ARCHETYPE_LIBRARY__HAS_AOM_IDS:
				setHas_aom_ids((Boolean)newValue);
				return;
			case ConstraintPackage.ARCHETYPE_LIBRARY__RM_PACKAGE:
				setRm_package((String)newValue);
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
			case ConstraintPackage.ARCHETYPE_LIBRARY__BASE_PACKAGE:
				setBase_Package((org.eclipse.uml2.uml.Package)null);
				return;
			case ConstraintPackage.ARCHETYPE_LIBRARY__HAS_AOM_IDS:
				setHas_aom_ids(HAS_AOM_IDS_EDEFAULT);
				return;
			case ConstraintPackage.ARCHETYPE_LIBRARY__RM_PACKAGE:
				setRm_package(RM_PACKAGE_EDEFAULT);
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
			case ConstraintPackage.ARCHETYPE_LIBRARY__BASE_PACKAGE:
				return base_Package != null;
			case ConstraintPackage.ARCHETYPE_LIBRARY__HAS_AOM_IDS:
				return has_aom_ids != HAS_AOM_IDS_EDEFAULT;
			case ConstraintPackage.ARCHETYPE_LIBRARY__RM_PACKAGE:
				return RM_PACKAGE_EDEFAULT == null ? rm_package != null : !RM_PACKAGE_EDEFAULT.equals(rm_package);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ConstraintPackage.ARCHETYPE_LIBRARY___VALIDATE_ONE_REFERENCE_MODEL__DIAGNOSTICCHAIN_MAP:
				return validateOneReferenceModel((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.ARCHETYPE_LIBRARY___VALIDATE_ONLY_ARCHETYPES__DIAGNOSTICCHAIN_MAP:
				return validateOnlyArchetypes((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.ARCHETYPE_LIBRARY___VALIDATE_AOMARCHETYPEHRID_INVARIANT_RM_CLOSURE_VALIDITY__DIAGNOSTICCHAIN_MAP:
				return validateAOMARCHETYPEHRIDInvariantRmClosureValidity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (has_aom_ids: ");
		result.append(has_aom_ids);
		result.append(", rm_package: ");
		result.append(rm_package);
		result.append(')');
		return result.toString();
	}

} //ArchetypeLibraryImpl
