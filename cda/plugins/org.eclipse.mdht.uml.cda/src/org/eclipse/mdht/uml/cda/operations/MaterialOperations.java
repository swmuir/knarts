/*******************************************************************************
 * Copyright (c) 2009, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.mdht.uml.cda.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.mdht.uml.cda.CDAPackage;
import org.eclipse.mdht.uml.cda.Material;
import org.eclipse.mdht.uml.cda.util.CDAValidator;
import org.eclipse.mdht.uml.hl7.rim.operations.EntityOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Material</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.cda.Material#validateClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Class Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.cda.Material#validateDeterminerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Determiner Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MaterialOperations extends EntityOperations {
	/**
	 * The cached environment for evaluating OCL expressions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final ThreadLocal< OCL > EOCL_ENV = new ThreadLocal< OCL >() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaterialOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateClassCode(Material, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClassCode(Material, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.isClassCodeDefined() implies self.classCode=vocab::EntityClassManufacturedMaterial::MMAT";

	/**
	 * The cached OCL invariant for the '{@link #validateClassCode(Material, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateClassCode(Material, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal< Constraint > VALIDATE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal< Constraint >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param material The receiving '<em><b>Material</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateClassCode(Material material, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
		synchronized (EOCL_ENV) {
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CDAPackage.Literals.MATERIAL);
			try {
				VALIDATE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		}
		if (!EOCL_ENV.get().createQuery(VALIDATE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(material)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDAValidator.DIAGNOSTIC_SOURCE,
						 CDAValidator.MATERIAL__CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(material, context) }),
						 new Object [] { material }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDeterminerCode(Material, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Determiner Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeterminerCode(Material, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.isDeterminerCodeDefined() implies self.determinerCode=vocab::EntityDeterminerDetermined::KIND";

	/**
	 * The cached OCL invariant for the '{@link #validateDeterminerCode(Material, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Determiner Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeterminerCode(Material, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal< Constraint > VALIDATE_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal< Constraint >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param material The receiving '<em><b>Material</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDeterminerCode(Material material, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
		synchronized (EOCL_ENV) {
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CDAPackage.Literals.MATERIAL);
			try {
				VALIDATE_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		}
		if (!EOCL_ENV.get().createQuery(VALIDATE_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(material)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDAValidator.DIAGNOSTIC_SOURCE,
						 CDAValidator.MATERIAL__DETERMINER_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateDeterminerCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(material, context) }),
						 new Object [] { material }));
			}
			return false;
		}
		return true;
	}

} // MaterialOperations
