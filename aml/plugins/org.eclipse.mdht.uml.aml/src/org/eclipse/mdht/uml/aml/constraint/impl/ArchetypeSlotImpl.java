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

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.mdht.uml.aml.constraint.ArchetypeSlot;
import org.eclipse.mdht.uml.aml.constraint.ConstraintPackage;

import org.eclipse.mdht.uml.aml.constraint.util.ConstraintValidator;

import org.eclipse.uml2.uml.Classifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Archetype Slot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.ArchetypeSlotImpl#getBase_Classifier <em>Base Classifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArchetypeSlotImpl extends ObjectConstraintImpl implements ArchetypeSlot {
	/**
	 * The cached value of the '{@link #getBase_Classifier() <em>Base Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Classifier()
	 * @generated
	 * @ordered
	 */
	protected Classifier base_Classifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchetypeSlotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConstraintPackage.Literals.ARCHETYPE_SLOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getBase_Classifier() {
		if (base_Classifier != null && base_Classifier.eIsProxy()) {
			InternalEObject oldBase_Classifier = (InternalEObject)base_Classifier;
			base_Classifier = (Classifier)eResolveProxy(oldBase_Classifier);
			if (base_Classifier != oldBase_Classifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConstraintPackage.ARCHETYPE_SLOT__BASE_CLASSIFIER, oldBase_Classifier, base_Classifier));
			}
		}
		return base_Classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetBase_Classifier() {
		return base_Classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Classifier(Classifier newBase_Classifier) {
		Classifier oldBase_Classifier = base_Classifier;
		base_Classifier = newBase_Classifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintPackage.ARCHETYPE_SLOT__BASE_CLASSIFIER, oldBase_Classifier, base_Classifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAOMVDSSPspecialisedarchetypeslotdefinitionparentvalidity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.ARCHETYPE_SLOT__AOMVDSS_PSPECIALISEDARCHETYPESLOTDEFINITIONPARENTVALIDITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVDSSPspecialisedarchetypeslotdefinitionparentvalidity", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVDSEVarchetypeslotexcludeconstraintvalidity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.ARCHETYPE_SLOT__AOMVDSE_VARCHETYPESLOTEXCLUDECONSTRAINTVALIDITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVDSEVarchetypeslotexcludeconstraintvalidity", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVDSSMspecialisedarchetypeslotdefinitionmatchvalidity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.ARCHETYPE_SLOT__AOMVDSS_MSPECIALISEDARCHETYPESLOTDEFINITIONMATCHVALIDITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVDSSMspecialisedarchetypeslotdefinitionmatchvalidity", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVDSSIDslotredefinitionchildnodeid(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.ARCHETYPE_SLOT__AOMVDSSI_DSLOTREDEFINITIONCHILDNODEID,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVDSSIDslotredefinitionchildnodeid", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVDSSCspecialisedarchetypeslotdefinitionclosedvalidity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.ARCHETYPE_SLOT__AOMVDSS_CSPECIALISEDARCHETYPESLOTDEFINITIONCLOSEDVALIDITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVDSSCspecialisedarchetypeslotdefinitionclosedvalidity", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVDSIVarchetypeslotincludeconstraintvalidity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.ARCHETYPE_SLOT__AOMVDSI_VARCHETYPESLOTINCLUDECONSTRAINTVALIDITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVDSIVarchetypeslotincludeconstraintvalidity", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMARCHETYPESLOTInvariantincludesValid(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.ARCHETYPE_SLOT__AOMARCHETYPESLOT_INVARIANTINCLUDES_VALID,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMARCHETYPESLOTInvariantincludesValid", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMARCHETYPESLOTInvariantexcludesValid(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.ARCHETYPE_SLOT__AOMARCHETYPESLOT_INVARIANTEXCLUDES_VALID,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMARCHETYPESLOTInvariantexcludesValid", EObjectValidator.getObjectLabel(this, context) }),
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
			case ConstraintPackage.ARCHETYPE_SLOT__BASE_CLASSIFIER:
				if (resolve) return getBase_Classifier();
				return basicGetBase_Classifier();
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
			case ConstraintPackage.ARCHETYPE_SLOT__BASE_CLASSIFIER:
				setBase_Classifier((Classifier)newValue);
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
			case ConstraintPackage.ARCHETYPE_SLOT__BASE_CLASSIFIER:
				setBase_Classifier((Classifier)null);
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
			case ConstraintPackage.ARCHETYPE_SLOT__BASE_CLASSIFIER:
				return base_Classifier != null;
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
			case ConstraintPackage.ARCHETYPE_SLOT___VALIDATE_AOMVDSS_PSPECIALISEDARCHETYPESLOTDEFINITIONPARENTVALIDITY__DIAGNOSTICCHAIN_MAP:
				return validateAOMVDSSPspecialisedarchetypeslotdefinitionparentvalidity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.ARCHETYPE_SLOT___VALIDATE_AOMVDSE_VARCHETYPESLOTEXCLUDECONSTRAINTVALIDITY__DIAGNOSTICCHAIN_MAP:
				return validateAOMVDSEVarchetypeslotexcludeconstraintvalidity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.ARCHETYPE_SLOT___VALIDATE_AOMVDSS_MSPECIALISEDARCHETYPESLOTDEFINITIONMATCHVALIDITY__DIAGNOSTICCHAIN_MAP:
				return validateAOMVDSSMspecialisedarchetypeslotdefinitionmatchvalidity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.ARCHETYPE_SLOT___VALIDATE_AOMVDSSI_DSLOTREDEFINITIONCHILDNODEID__DIAGNOSTICCHAIN_MAP:
				return validateAOMVDSSIDslotredefinitionchildnodeid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.ARCHETYPE_SLOT___VALIDATE_AOMVDSS_CSPECIALISEDARCHETYPESLOTDEFINITIONCLOSEDVALIDITY__DIAGNOSTICCHAIN_MAP:
				return validateAOMVDSSCspecialisedarchetypeslotdefinitionclosedvalidity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.ARCHETYPE_SLOT___VALIDATE_AOMVDSI_VARCHETYPESLOTINCLUDECONSTRAINTVALIDITY__DIAGNOSTICCHAIN_MAP:
				return validateAOMVDSIVarchetypeslotincludeconstraintvalidity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.ARCHETYPE_SLOT___VALIDATE_AOMARCHETYPESLOT_INVARIANTINCLUDES_VALID__DIAGNOSTICCHAIN_MAP:
				return validateAOMARCHETYPESLOTInvariantincludesValid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.ARCHETYPE_SLOT___VALIDATE_AOMARCHETYPESLOT_INVARIANTEXCLUDES_VALID__DIAGNOSTICCHAIN_MAP:
				return validateAOMARCHETYPESLOTInvariantexcludesValid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ArchetypeSlotImpl
