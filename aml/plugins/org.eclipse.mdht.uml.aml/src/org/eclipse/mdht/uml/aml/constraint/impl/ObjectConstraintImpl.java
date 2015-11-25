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

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.mdht.uml.aml.constraint.ConstraintPackage;
import org.eclipse.mdht.uml.aml.constraint.ObjectConstraint;

import org.eclipse.mdht.uml.aml.constraint.util.ConstraintValidator;

import org.eclipse.mdht.uml.aml.terminology.impl.IdentifiedItemImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.ObjectConstraintImpl#isIs_deprecated <em>Is deprecated</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectConstraintImpl extends IdentifiedItemImpl implements ObjectConstraint {
	/**
	 * The default value of the '{@link #isIs_deprecated() <em>Is deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIs_deprecated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DEPRECATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIs_deprecated() <em>Is deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIs_deprecated()
	 * @generated
	 * @ordered
	 */
	protected boolean is_deprecated = IS_DEPRECATED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConstraintPackage.Literals.OBJECT_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIs_deprecated() {
		return is_deprecated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIs_deprecated(boolean newIs_deprecated) {
		boolean oldIs_deprecated = is_deprecated;
		is_deprecated = newIs_deprecated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintPackage.OBJECT_CONSTRAINT__IS_DEPRECATED, oldIs_deprecated, is_deprecated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRedefinesGeneralization(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.OBJECT_CONSTRAINT__REDEFINES_GENERALIZATION,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateRedefinesGeneralization", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVCORMobjectconstrainttypenameexistence(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.OBJECT_CONSTRAINT__AOMVCOR_MOBJECTCONSTRAINTTYPENAMEEXISTENCE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVCORMobjectconstrainttypenameexistence", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVCORMTobjectconstrainttypevalidity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.OBJECT_CONSTRAINT__AOMVCORM_TOBJECTCONSTRAINTTYPEVALIDITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVCORMTobjectconstrainttypevalidity", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVCOCDobjectconstraintdefinitionvalidity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.OBJECT_CONSTRAINT__AOMVCOC_DOBJECTCONSTRAINTDEFINITIONVALIDITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVCOCDobjectconstraintdefinitionvalidity", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVCOIDobjectnodeidentifiervalidity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.OBJECT_CONSTRAINT__AOMVCOI_DOBJECTNODEIDENTIFIERVALIDITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVCOIDobjectnodeidentifiervalidity", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVCOSUobjectnodeidentifiervalidity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.OBJECT_CONSTRAINT__AOMVCOS_UOBJECTNODEIDENTIFIERVALIDITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVCOSUobjectnodeidentifiervalidity", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVSONTspecialisedarchetypeobjectnodemetatypeconformance(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.OBJECT_CONSTRAINT__AOMVSON_TSPECIALISEDARCHETYPEOBJECTNODEMETATYPECONFORMANCE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVSONTspecialisedarchetypeobjectnodemetatypeconformance", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVSONCTspecialisedarchetypeobjectnodereferencetypeconformance(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.OBJECT_CONSTRAINT__AOMVSONC_TSPECIALISEDARCHETYPEOBJECTNODEREFERENCETYPECONFORMANCE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVSONCTspecialisedarchetypeobjectnodereferencetypeconformance", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVSONINspecialisedarchetypenewobjectnodeidentifiervalidity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.OBJECT_CONSTRAINT__AOMVSONI_NSPECIALISEDARCHETYPENEWOBJECTNODEIDENTIFIERVALIDITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVSONINspecialisedarchetypenewobjectnodeidentifiervalidity", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVSONCOspecialisedarchetyperedefineobjectnodeoccurrencesvalidity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.OBJECT_CONSTRAINT__AOMVSONC_OSPECIALISEDARCHETYPEREDEFINEOBJECTNODEOCCURRENCESVALIDITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVSONCOspecialisedarchetyperedefineobjectnodeoccurrencesvalidity", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVSONPTspecialisedarchetypeprohibitedobjectnodeAOMtypevalidity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.OBJECT_CONSTRAINT__AOMVSONP_TSPECIALISEDARCHETYPEPROHIBITEDOBJECTNODE_AO_MTYPEVALIDITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVSONPTspecialisedarchetypeprohibitedobjectnodeAOMtypevalidity", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVSONPOspecialisedarchetypeobjectnodeprohibitedoccurrencesvalidity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.OBJECT_CONSTRAINT__AOMVSONP_OSPECIALISEDARCHETYPEOBJECTNODEPROHIBITEDOCCURRENCESVALIDITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVSONPOspecialisedarchetypeobjectnodeprohibitedoccurrencesvalidity", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVSSMspecialisedarchetypesiblingordervalidity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.OBJECT_CONSTRAINT__AOMVSS_MSPECIALISEDARCHETYPESIBLINGORDERVALIDITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVSSMspecialisedarchetypesiblingordervalidity", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMARCHETYPECONSTRAINInvariantpathExists(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.OBJECT_CONSTRAINT__AOMARCHETYPECONSTRAIN_INVARIANTPATH_EXISTS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMARCHETYPECONSTRAINInvariantpathExists", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMCATTRIBUTEInvariantRmAttributeNameValid(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.OBJECT_CONSTRAINT__AOMCATTRIBUTE_INVARIANT_RM_ATTRIBUTE_NAME_VALID,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMCATTRIBUTEInvariantRmAttributeNameValid", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMCATTRIBUTEInvariantExistenceValid(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.OBJECT_CONSTRAINT__AOMCATTRIBUTE_INVARIANT_EXISTENCE_VALID,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMCATTRIBUTEInvariantExistenceValid", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMCATTRIBUTEInvariantDifferentialPathValid(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.OBJECT_CONSTRAINT__AOMCATTRIBUTE_INVARIANT_DIFFERENTIAL_PATH_VALID,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMCATTRIBUTEInvariantDifferentialPathValid", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMCATTRIBUTEInvariantChildOccurrencesValidity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.OBJECT_CONSTRAINT__AOMCATTRIBUTE_INVARIANT_CHILD_OCCURRENCES_VALIDITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMCATTRIBUTEInvariantChildOccurrencesValidity", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMCARDINALITYInvariantValidity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.OBJECT_CONSTRAINT__AOMCARDINALITY_INVARIANT_VALIDITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMCARDINALITYInvariantValidity", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMCOBJECTInvariantNodeIdValid(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.OBJECT_CONSTRAINT__AOMCOBJECT_INVARIANT_NODE_ID_VALID,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMCOBJECTInvariantNodeIdValid", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMCOBJECTInvariantOccurrencesValidity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.OBJECT_CONSTRAINT__AOMCOBJECT_INVARIANT_OCCURRENCES_VALIDITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMCOBJECTInvariantOccurrencesValidity", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMCOBJECTInvariantSiblingOrderValidity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.OBJECT_CONSTRAINT__AOMCOBJECT_INVARIANT_SIBLING_ORDER_VALIDITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMCOBJECTInvariantSiblingOrderValidity", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMSIBLINGORDERInvariantsiblingNodeIdValidity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.OBJECT_CONSTRAINT__AOMSIBLINGORDER_INVARIANTSIBLING_NODE_ID_VALIDITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMSIBLINGORDERInvariantsiblingNodeIdValidity", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMCDEFINEDOBJECTInvariantDefaultValueValid(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.OBJECT_CONSTRAINT__AOMCDEFINEDOBJECT_INVARIANT_DEFAULT_VALUE_VALID,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMCDEFINEDOBJECTInvariantDefaultValueValid", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMCCOMPLEXOBJECTPROXYTargetPathValid(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.OBJECT_CONSTRAINT__AOMCCOMPLEXOBJECTPROXY_TARGET_PATH_VALID,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMCCOMPLEXOBJECTPROXYTargetPathValid", EObjectValidator.getObjectLabel(this, context) }),
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
			case ConstraintPackage.OBJECT_CONSTRAINT__IS_DEPRECATED:
				return isIs_deprecated();
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
			case ConstraintPackage.OBJECT_CONSTRAINT__IS_DEPRECATED:
				setIs_deprecated((Boolean)newValue);
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
			case ConstraintPackage.OBJECT_CONSTRAINT__IS_DEPRECATED:
				setIs_deprecated(IS_DEPRECATED_EDEFAULT);
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
			case ConstraintPackage.OBJECT_CONSTRAINT__IS_DEPRECATED:
				return is_deprecated != IS_DEPRECATED_EDEFAULT;
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
			case ConstraintPackage.OBJECT_CONSTRAINT___VALIDATE_REDEFINES_GENERALIZATION__DIAGNOSTICCHAIN_MAP:
				return validateRedefinesGeneralization((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.OBJECT_CONSTRAINT___VALIDATE_AOMVCOR_MOBJECTCONSTRAINTTYPENAMEEXISTENCE__DIAGNOSTICCHAIN_MAP:
				return validateAOMVCORMobjectconstrainttypenameexistence((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.OBJECT_CONSTRAINT___VALIDATE_AOMVCORM_TOBJECTCONSTRAINTTYPEVALIDITY__DIAGNOSTICCHAIN_MAP:
				return validateAOMVCORMTobjectconstrainttypevalidity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.OBJECT_CONSTRAINT___VALIDATE_AOMVCOC_DOBJECTCONSTRAINTDEFINITIONVALIDITY__DIAGNOSTICCHAIN_MAP:
				return validateAOMVCOCDobjectconstraintdefinitionvalidity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.OBJECT_CONSTRAINT___VALIDATE_AOMVCOI_DOBJECTNODEIDENTIFIERVALIDITY__DIAGNOSTICCHAIN_MAP:
				return validateAOMVCOIDobjectnodeidentifiervalidity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.OBJECT_CONSTRAINT___VALIDATE_AOMVCOS_UOBJECTNODEIDENTIFIERVALIDITY__DIAGNOSTICCHAIN_MAP:
				return validateAOMVCOSUobjectnodeidentifiervalidity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.OBJECT_CONSTRAINT___VALIDATE_AOMVSON_TSPECIALISEDARCHETYPEOBJECTNODEMETATYPECONFORMANCE__DIAGNOSTICCHAIN_MAP:
				return validateAOMVSONTspecialisedarchetypeobjectnodemetatypeconformance((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.OBJECT_CONSTRAINT___VALIDATE_AOMVSONC_TSPECIALISEDARCHETYPEOBJECTNODEREFERENCETYPECONFORMANCE__DIAGNOSTICCHAIN_MAP:
				return validateAOMVSONCTspecialisedarchetypeobjectnodereferencetypeconformance((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.OBJECT_CONSTRAINT___VALIDATE_AOMVSONI_NSPECIALISEDARCHETYPENEWOBJECTNODEIDENTIFIERVALIDITY__DIAGNOSTICCHAIN_MAP:
				return validateAOMVSONINspecialisedarchetypenewobjectnodeidentifiervalidity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.OBJECT_CONSTRAINT___VALIDATE_AOMVSONC_OSPECIALISEDARCHETYPEREDEFINEOBJECTNODEOCCURRENCESVALIDITY__DIAGNOSTICCHAIN_MAP:
				return validateAOMVSONCOspecialisedarchetyperedefineobjectnodeoccurrencesvalidity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.OBJECT_CONSTRAINT___VALIDATE_AOMVSONP_TSPECIALISEDARCHETYPEPROHIBITEDOBJECTNODE_AO_MTYPEVALIDITY__DIAGNOSTICCHAIN_MAP:
				return validateAOMVSONPTspecialisedarchetypeprohibitedobjectnodeAOMtypevalidity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.OBJECT_CONSTRAINT___VALIDATE_AOMVSONP_OSPECIALISEDARCHETYPEOBJECTNODEPROHIBITEDOCCURRENCESVALIDITY__DIAGNOSTICCHAIN_MAP:
				return validateAOMVSONPOspecialisedarchetypeobjectnodeprohibitedoccurrencesvalidity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.OBJECT_CONSTRAINT___VALIDATE_AOMVSS_MSPECIALISEDARCHETYPESIBLINGORDERVALIDITY__DIAGNOSTICCHAIN_MAP:
				return validateAOMVSSMspecialisedarchetypesiblingordervalidity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.OBJECT_CONSTRAINT___VALIDATE_AOMARCHETYPECONSTRAIN_INVARIANTPATH_EXISTS__DIAGNOSTICCHAIN_MAP:
				return validateAOMARCHETYPECONSTRAINInvariantpathExists((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.OBJECT_CONSTRAINT___VALIDATE_AOMCATTRIBUTE_INVARIANT_RM_ATTRIBUTE_NAME_VALID__DIAGNOSTICCHAIN_MAP:
				return validateAOMCATTRIBUTEInvariantRmAttributeNameValid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.OBJECT_CONSTRAINT___VALIDATE_AOMCATTRIBUTE_INVARIANT_EXISTENCE_VALID__DIAGNOSTICCHAIN_MAP:
				return validateAOMCATTRIBUTEInvariantExistenceValid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.OBJECT_CONSTRAINT___VALIDATE_AOMCATTRIBUTE_INVARIANT_DIFFERENTIAL_PATH_VALID__DIAGNOSTICCHAIN_MAP:
				return validateAOMCATTRIBUTEInvariantDifferentialPathValid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.OBJECT_CONSTRAINT___VALIDATE_AOMCATTRIBUTE_INVARIANT_CHILD_OCCURRENCES_VALIDITY__DIAGNOSTICCHAIN_MAP:
				return validateAOMCATTRIBUTEInvariantChildOccurrencesValidity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.OBJECT_CONSTRAINT___VALIDATE_AOMCARDINALITY_INVARIANT_VALIDITY__DIAGNOSTICCHAIN_MAP:
				return validateAOMCARDINALITYInvariantValidity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.OBJECT_CONSTRAINT___VALIDATE_AOMCOBJECT_INVARIANT_NODE_ID_VALID__DIAGNOSTICCHAIN_MAP:
				return validateAOMCOBJECTInvariantNodeIdValid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.OBJECT_CONSTRAINT___VALIDATE_AOMCOBJECT_INVARIANT_OCCURRENCES_VALIDITY__DIAGNOSTICCHAIN_MAP:
				return validateAOMCOBJECTInvariantOccurrencesValidity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.OBJECT_CONSTRAINT___VALIDATE_AOMCOBJECT_INVARIANT_SIBLING_ORDER_VALIDITY__DIAGNOSTICCHAIN_MAP:
				return validateAOMCOBJECTInvariantSiblingOrderValidity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.OBJECT_CONSTRAINT___VALIDATE_AOMSIBLINGORDER_INVARIANTSIBLING_NODE_ID_VALIDITY__DIAGNOSTICCHAIN_MAP:
				return validateAOMSIBLINGORDERInvariantsiblingNodeIdValidity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.OBJECT_CONSTRAINT___VALIDATE_AOMCDEFINEDOBJECT_INVARIANT_DEFAULT_VALUE_VALID__DIAGNOSTICCHAIN_MAP:
				return validateAOMCDEFINEDOBJECTInvariantDefaultValueValid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.OBJECT_CONSTRAINT___VALIDATE_AOMCCOMPLEXOBJECTPROXY_TARGET_PATH_VALID__DIAGNOSTICCHAIN_MAP:
				return validateAOMCCOMPLEXOBJECTPROXYTargetPathValid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (is_deprecated: ");
		result.append(is_deprecated);
		result.append(')');
		return result.toString();
	}

} //ObjectConstraintImpl
