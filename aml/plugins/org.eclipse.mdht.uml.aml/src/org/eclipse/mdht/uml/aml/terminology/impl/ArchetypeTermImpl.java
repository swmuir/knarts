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
package org.eclipse.mdht.uml.aml.terminology.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.mdht.uml.aml.terminology.ArchetypeTerm;
import org.eclipse.mdht.uml.aml.terminology.TerminologyPackage;

import org.eclipse.mdht.uml.aml.terminology.util.TerminologyValidator;

import org.eclipse.uml2.uml.EnumerationLiteral;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Archetype Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.aml.terminology.impl.ArchetypeTermImpl#getValue_set_members <em>Value set members</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.terminology.impl.ArchetypeTermImpl#getTerm_bindings <em>Term bindings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArchetypeTermImpl extends PermissibleValueImpl implements ArchetypeTerm {
	/**
	 * The cached value of the '{@link #getValue_set_members() <em>Value set members</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue_set_members()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumerationLiteral> value_set_members;

	/**
	 * The cached value of the '{@link #getTerm_bindings() <em>Term bindings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerm_bindings()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumerationLiteral> term_bindings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchetypeTermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TerminologyPackage.Literals.ARCHETYPE_TERM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumerationLiteral> getValue_set_members() {
		if (value_set_members == null) {
			value_set_members = new EObjectResolvingEList<EnumerationLiteral>(EnumerationLiteral.class, this, TerminologyPackage.ARCHETYPE_TERM__VALUE_SET_MEMBERS);
		}
		return value_set_members;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral getValue_set_members(String name) {
		return getValue_set_members(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral getValue_set_members(String name, boolean ignoreCase) {
		value_set_membersLoop: for (EnumerationLiteral value_set_members : getValue_set_members()) {
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(value_set_members.getName()) : name.equals(value_set_members.getName())))
				continue value_set_membersLoop;
			return value_set_members;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumerationLiteral> getTerm_bindings() {
		if (term_bindings == null) {
			term_bindings = new EObjectResolvingEList<EnumerationLiteral>(EnumerationLiteral.class, this, TerminologyPackage.ARCHETYPE_TERM__TERM_BINDINGS);
		}
		return term_bindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral getTerm_bindings(String name) {
		return getTerm_bindings(name, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationLiteral getTerm_bindings(String name, boolean ignoreCase) {
		term_bindingsLoop: for (EnumerationLiteral term_bindings : getTerm_bindings()) {
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(term_bindings.getName()) : name.equals(term_bindings.getName())))
				continue term_bindingsLoop;
			return term_bindings;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAOMVTLClanguageconsistency(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TerminologyValidator.DIAGNOSTIC_SOURCE,
						 TerminologyValidator.ARCHETYPE_TERM__AOMVTL_CLANGUAGECONSISTENCY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVTLClanguageconsistency", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVTVSIDvaluesetiddefined(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TerminologyValidator.DIAGNOSTIC_SOURCE,
						 TerminologyValidator.ARCHETYPE_TERM__AOMVTVSI_DVALUESETIDDEFINED,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVTVSIDvaluesetiddefined", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVTVSUQvaluesetmembersunique(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TerminologyValidator.DIAGNOSTIC_SOURCE,
						 TerminologyValidator.ARCHETYPE_TERM__AOMVTVSU_QVALUESETMEMBERSUNIQUE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVTVSUQvaluesetmembersunique", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVTVSMDvaluesetmembersdefined(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TerminologyValidator.DIAGNOSTIC_SOURCE,
						 TerminologyValidator.ARCHETYPE_TERM__AOMVTVSM_DVALUESETMEMBERSDEFINED,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVTVSMDvaluesetmembersdefined", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMARCHETYPETERMInvariantcodeValidCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TerminologyValidator.DIAGNOSTIC_SOURCE,
						 TerminologyValidator.ARCHETYPE_TERM__AOMARCHETYPETERM_INVARIANTCODE_VALID_CODE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMARCHETYPETERMInvariantcodeValidCode", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVALUESETInvariantIdValid(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TerminologyValidator.DIAGNOSTIC_SOURCE,
						 TerminologyValidator.ARCHETYPE_TERM__AOMVALUESET_INVARIANT_ID_VALID,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVALUESETInvariantIdValid", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVALUESETInvariantMembersValid(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TerminologyValidator.DIAGNOSTIC_SOURCE,
						 TerminologyValidator.ARCHETYPE_TERM__AOMVALUESET_INVARIANT_MEMBERS_VALID,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVALUESETInvariantMembersValid", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMARCHETYPETERMINOLOGYInvarianttermBindingsValidity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TerminologyValidator.DIAGNOSTIC_SOURCE,
						 TerminologyValidator.ARCHETYPE_TERM__AOMARCHETYPETERMINOLOGY_INVARIANTTERM_BINDINGS_VALIDITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMARCHETYPETERMINOLOGYInvarianttermBindingsValidity", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVETDFexternaltermvalidity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TerminologyValidator.DIAGNOSTIC_SOURCE,
						 TerminologyValidator.ARCHETYPE_TERM__AOMVETD_FEXTERNALTERMVALIDITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVETDFexternaltermvalidity", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVTCBKterminologyconstraintbindingkeyvalid(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TerminologyValidator.DIAGNOSTIC_SOURCE,
						 TerminologyValidator.ARCHETYPE_TERM__AOMVTCB_KTERMINOLOGYCONSTRAINTBINDINGKEYVALID,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVTCBKterminologyconstraintbindingkeyvalid", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVTSDspecialisationlevelofcodes(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TerminologyValidator.DIAGNOSTIC_SOURCE,
						 TerminologyValidator.ARCHETYPE_TERM__AOMVTS_DSPECIALISATIONLEVELOFCODES,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVTSDspecialisationlevelofcodes", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVTTBKterminologytermbindingkeyvalid(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TerminologyValidator.DIAGNOSTIC_SOURCE,
						 TerminologyValidator.ARCHETYPE_TERM__AOMVTTB_KTERMINOLOGYTERMBINDINGKEYVALID,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVTTBKterminologytermbindingkeyvalid", EObjectValidator.getObjectLabel(this, context) }),
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
			case TerminologyPackage.ARCHETYPE_TERM__VALUE_SET_MEMBERS:
				return getValue_set_members();
			case TerminologyPackage.ARCHETYPE_TERM__TERM_BINDINGS:
				return getTerm_bindings();
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
			case TerminologyPackage.ARCHETYPE_TERM__VALUE_SET_MEMBERS:
				getValue_set_members().clear();
				getValue_set_members().addAll((Collection<? extends EnumerationLiteral>)newValue);
				return;
			case TerminologyPackage.ARCHETYPE_TERM__TERM_BINDINGS:
				getTerm_bindings().clear();
				getTerm_bindings().addAll((Collection<? extends EnumerationLiteral>)newValue);
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
			case TerminologyPackage.ARCHETYPE_TERM__VALUE_SET_MEMBERS:
				getValue_set_members().clear();
				return;
			case TerminologyPackage.ARCHETYPE_TERM__TERM_BINDINGS:
				getTerm_bindings().clear();
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
			case TerminologyPackage.ARCHETYPE_TERM__VALUE_SET_MEMBERS:
				return value_set_members != null && !value_set_members.isEmpty();
			case TerminologyPackage.ARCHETYPE_TERM__TERM_BINDINGS:
				return term_bindings != null && !term_bindings.isEmpty();
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
			case TerminologyPackage.ARCHETYPE_TERM___VALIDATE_AOMVTL_CLANGUAGECONSISTENCY__DIAGNOSTICCHAIN_MAP:
				return validateAOMVTLClanguageconsistency((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case TerminologyPackage.ARCHETYPE_TERM___VALIDATE_AOMVTVSI_DVALUESETIDDEFINED__DIAGNOSTICCHAIN_MAP:
				return validateAOMVTVSIDvaluesetiddefined((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case TerminologyPackage.ARCHETYPE_TERM___VALIDATE_AOMVTVSU_QVALUESETMEMBERSUNIQUE__DIAGNOSTICCHAIN_MAP:
				return validateAOMVTVSUQvaluesetmembersunique((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case TerminologyPackage.ARCHETYPE_TERM___VALIDATE_AOMVTVSM_DVALUESETMEMBERSDEFINED__DIAGNOSTICCHAIN_MAP:
				return validateAOMVTVSMDvaluesetmembersdefined((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case TerminologyPackage.ARCHETYPE_TERM___VALIDATE_AOMARCHETYPETERM_INVARIANTCODE_VALID_CODE__DIAGNOSTICCHAIN_MAP:
				return validateAOMARCHETYPETERMInvariantcodeValidCode((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case TerminologyPackage.ARCHETYPE_TERM___VALIDATE_AOMVALUESET_INVARIANT_ID_VALID__DIAGNOSTICCHAIN_MAP:
				return validateAOMVALUESETInvariantIdValid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case TerminologyPackage.ARCHETYPE_TERM___VALIDATE_AOMVALUESET_INVARIANT_MEMBERS_VALID__DIAGNOSTICCHAIN_MAP:
				return validateAOMVALUESETInvariantMembersValid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case TerminologyPackage.ARCHETYPE_TERM___VALIDATE_AOMARCHETYPETERMINOLOGY_INVARIANTTERM_BINDINGS_VALIDITY__DIAGNOSTICCHAIN_MAP:
				return validateAOMARCHETYPETERMINOLOGYInvarianttermBindingsValidity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case TerminologyPackage.ARCHETYPE_TERM___VALIDATE_AOMVETD_FEXTERNALTERMVALIDITY__DIAGNOSTICCHAIN_MAP:
				return validateAOMVETDFexternaltermvalidity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case TerminologyPackage.ARCHETYPE_TERM___VALIDATE_AOMVTCB_KTERMINOLOGYCONSTRAINTBINDINGKEYVALID__DIAGNOSTICCHAIN_MAP:
				return validateAOMVTCBKterminologyconstraintbindingkeyvalid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case TerminologyPackage.ARCHETYPE_TERM___VALIDATE_AOMVTS_DSPECIALISATIONLEVELOFCODES__DIAGNOSTICCHAIN_MAP:
				return validateAOMVTSDspecialisationlevelofcodes((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case TerminologyPackage.ARCHETYPE_TERM___VALIDATE_AOMVTTB_KTERMINOLOGYTERMBINDINGKEYVALID__DIAGNOSTICCHAIN_MAP:
				return validateAOMVTTBKterminologytermbindingkeyvalid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ArchetypeTermImpl
