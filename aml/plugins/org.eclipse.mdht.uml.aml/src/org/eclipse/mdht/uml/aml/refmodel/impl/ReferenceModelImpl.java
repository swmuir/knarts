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
package org.eclipse.mdht.uml.aml.refmodel.impl;

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

import org.eclipse.mdht.uml.aml.refmodel.RefModelPackage;
import org.eclipse.mdht.uml.aml.refmodel.ReferenceModel;

import org.eclipse.mdht.uml.aml.refmodel.util.RefModelValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.aml.refmodel.impl.ReferenceModelImpl#getBase_Package <em>Base Package</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.refmodel.impl.ReferenceModelImpl#getRmPublisher <em>Rm Publisher</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.refmodel.impl.ReferenceModelImpl#getRmNamespace <em>Rm Namespace</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.refmodel.impl.ReferenceModelImpl#getRmVersion <em>Rm Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceModelImpl extends MinimalEObjectImpl.Container implements ReferenceModel {
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
	 * The default value of the '{@link #getRmPublisher() <em>Rm Publisher</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRmPublisher()
	 * @generated
	 * @ordered
	 */
	protected static final String RM_PUBLISHER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRmPublisher() <em>Rm Publisher</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRmPublisher()
	 * @generated
	 * @ordered
	 */
	protected String rmPublisher = RM_PUBLISHER_EDEFAULT;

	/**
	 * The default value of the '{@link #getRmNamespace() <em>Rm Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRmNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String RM_NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRmNamespace() <em>Rm Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRmNamespace()
	 * @generated
	 * @ordered
	 */
	protected String rmNamespace = RM_NAMESPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRmVersion() <em>Rm Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRmVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String RM_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRmVersion() <em>Rm Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRmVersion()
	 * @generated
	 * @ordered
	 */
	protected String rmVersion = RM_VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RefModelPackage.Literals.REFERENCE_MODEL;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RefModelPackage.REFERENCE_MODEL__BASE_PACKAGE, oldBase_Package, base_Package));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RefModelPackage.REFERENCE_MODEL__BASE_PACKAGE, oldBase_Package, base_Package));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRmPublisher() {
		return rmPublisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRmPublisher(String newRmPublisher) {
		String oldRmPublisher = rmPublisher;
		rmPublisher = newRmPublisher;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefModelPackage.REFERENCE_MODEL__RM_PUBLISHER, oldRmPublisher, rmPublisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRmNamespace() {
		return rmNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRmNamespace(String newRmNamespace) {
		String oldRmNamespace = rmNamespace;
		rmNamespace = newRmNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefModelPackage.REFERENCE_MODEL__RM_NAMESPACE, oldRmNamespace, rmNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRmVersion() {
		return rmVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRmVersion(String newRmVersion) {
		String oldRmVersion = rmVersion;
		rmVersion = newRmVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RefModelPackage.REFERENCE_MODEL__RM_VERSION, oldRmVersion, rmVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAOMARCHETYPEHRIDInvariantRmPublisherValidity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 RefModelValidator.DIAGNOSTIC_SOURCE,
						 RefModelValidator.REFERENCE_MODEL__AOMARCHETYPEHRID_INVARIANT_RM_PUBLISHER_VALIDITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMARCHETYPEHRIDInvariantRmPublisherValidity", EObjectValidator.getObjectLabel(this, context) }),
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
			case RefModelPackage.REFERENCE_MODEL__BASE_PACKAGE:
				if (resolve) return getBase_Package();
				return basicGetBase_Package();
			case RefModelPackage.REFERENCE_MODEL__RM_PUBLISHER:
				return getRmPublisher();
			case RefModelPackage.REFERENCE_MODEL__RM_NAMESPACE:
				return getRmNamespace();
			case RefModelPackage.REFERENCE_MODEL__RM_VERSION:
				return getRmVersion();
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
			case RefModelPackage.REFERENCE_MODEL__BASE_PACKAGE:
				setBase_Package((org.eclipse.uml2.uml.Package)newValue);
				return;
			case RefModelPackage.REFERENCE_MODEL__RM_PUBLISHER:
				setRmPublisher((String)newValue);
				return;
			case RefModelPackage.REFERENCE_MODEL__RM_NAMESPACE:
				setRmNamespace((String)newValue);
				return;
			case RefModelPackage.REFERENCE_MODEL__RM_VERSION:
				setRmVersion((String)newValue);
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
			case RefModelPackage.REFERENCE_MODEL__BASE_PACKAGE:
				setBase_Package((org.eclipse.uml2.uml.Package)null);
				return;
			case RefModelPackage.REFERENCE_MODEL__RM_PUBLISHER:
				setRmPublisher(RM_PUBLISHER_EDEFAULT);
				return;
			case RefModelPackage.REFERENCE_MODEL__RM_NAMESPACE:
				setRmNamespace(RM_NAMESPACE_EDEFAULT);
				return;
			case RefModelPackage.REFERENCE_MODEL__RM_VERSION:
				setRmVersion(RM_VERSION_EDEFAULT);
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
			case RefModelPackage.REFERENCE_MODEL__BASE_PACKAGE:
				return base_Package != null;
			case RefModelPackage.REFERENCE_MODEL__RM_PUBLISHER:
				return RM_PUBLISHER_EDEFAULT == null ? rmPublisher != null : !RM_PUBLISHER_EDEFAULT.equals(rmPublisher);
			case RefModelPackage.REFERENCE_MODEL__RM_NAMESPACE:
				return RM_NAMESPACE_EDEFAULT == null ? rmNamespace != null : !RM_NAMESPACE_EDEFAULT.equals(rmNamespace);
			case RefModelPackage.REFERENCE_MODEL__RM_VERSION:
				return RM_VERSION_EDEFAULT == null ? rmVersion != null : !RM_VERSION_EDEFAULT.equals(rmVersion);
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
			case RefModelPackage.REFERENCE_MODEL___VALIDATE_AOMARCHETYPEHRID_INVARIANT_RM_PUBLISHER_VALIDITY__DIAGNOSTICCHAIN_MAP:
				return validateAOMARCHETYPEHRIDInvariantRmPublisherValidity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (rmPublisher: ");
		result.append(rmPublisher);
		result.append(", rmNamespace: ");
		result.append(rmNamespace);
		result.append(", rmVersion: ");
		result.append(rmVersion);
		result.append(')');
		return result.toString();
	}

} //ReferenceModelImpl
