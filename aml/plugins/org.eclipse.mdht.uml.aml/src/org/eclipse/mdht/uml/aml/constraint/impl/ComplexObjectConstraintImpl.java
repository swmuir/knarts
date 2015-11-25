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

import org.eclipse.mdht.uml.aml.constraint.ComplexObjectConstraint;
import org.eclipse.mdht.uml.aml.constraint.ConstraintPackage;

import org.eclipse.mdht.uml.aml.constraint.util.ConstraintValidator;

import org.eclipse.uml2.uml.Classifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Object Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.ComplexObjectConstraintImpl#getBase_Classifier <em>Base Classifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComplexObjectConstraintImpl extends ObjectConstraintImpl implements ComplexObjectConstraint {
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
	protected ComplexObjectConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConstraintPackage.Literals.COMPLEX_OBJECT_CONSTRAINT;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT__BASE_CLASSIFIER, oldBase_Classifier, base_Classifier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT__BASE_CLASSIFIER, oldBase_Classifier, base_Classifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSingleParent(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.COMPLEX_OBJECT_CONSTRAINT__SINGLE_PARENT,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateSingleParent", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAllAttributeConstraints(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.COMPLEX_OBJECT_CONSTRAINT__ALL_ATTRIBUTE_CONSTRAINTS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAllAttributeConstraints", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVARCNarchetypeconceptvalidity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.COMPLEX_OBJECT_CONSTRAINT__AOMVARC_NARCHETYPECONCEPTVALIDITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVARCNarchetypeconceptvalidity", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVCARMattributenamereferencemodelvalidity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.COMPLEX_OBJECT_CONSTRAINT__AOMVCAR_MATTRIBUTENAMEREFERENCEMODELVALIDITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVCARMattributenamereferencemodelvalidity", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVCAEXarchetypeattributereferencemodelexistenceconformance(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.COMPLEX_OBJECT_CONSTRAINT__AOMVCAE_XARCHETYPEATTRIBUTEREFERENCEMODELEXISTENCECONFORMANCE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVCAEXarchetypeattributereferencemodelexistenceconformance", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVCAMarchetypeattributereferencemodelmultiplicityconformance(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.COMPLEX_OBJECT_CONSTRAINT__AOMVCA_MARCHETYPEATTRIBUTEREFERENCEMODELMULTIPLICITYCONFORMANCE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVCAMarchetypeattributereferencemodelmultiplicityconformance", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVDIFVarchetypeattributedifferentialpathvalidity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.COMPLEX_OBJECT_CONSTRAINT__AOMVDIF_VARCHETYPEATTRIBUTEDIFFERENTIALPATHVALIDITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVDIFVarchetypeattributedifferentialpathvalidity", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVDIFPspecialisedarchetypeattributedifferentialpathvalidity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.COMPLEX_OBJECT_CONSTRAINT__AOMVDIF_PSPECIALISEDARCHETYPEATTRIBUTEDIFFERENTIALPATHVALIDITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVDIFPspecialisedarchetypeattributedifferentialpathvalidity", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVSANCEspecialisedarchetypeattributenodeexistenceconformance(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.COMPLEX_OBJECT_CONSTRAINT__AOMVSANC_ESPECIALISEDARCHETYPEATTRIBUTENODEEXISTENCECONFORMANCE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVSANCEspecialisedarchetypeattributenodeexistenceconformance", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVSAMspecialisedarchetypeattributemultiplicityconformance(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.COMPLEX_OBJECT_CONSTRAINT__AOMVSA_MSPECIALISEDARCHETYPEATTRIBUTEMULTIPLICITYCONFORMANCE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVSAMspecialisedarchetypeattributemultiplicityconformance", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVACSOsinglevaluedattributechildobjectoccurrencesvalidity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.COMPLEX_OBJECT_CONSTRAINT__AOMVACS_OSINGLEVALUEDATTRIBUTECHILDOBJECTOCCURRENCESVALIDITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVACSOsinglevaluedattributechildobjectoccurrencesvalidity", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVACMCUcardinalityoccurrencesupperboundvalidity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.COMPLEX_OBJECT_CONSTRAINT__AOMVACMC_UCARDINALITYOCCURRENCESUPPERBOUNDVALIDITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVACMCUcardinalityoccurrencesupperboundvalidity", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVACMCOcardinalityoccurrencesorphans(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.COMPLEX_OBJECT_CONSTRAINT__AOMVACMC_OCARDINALITYOCCURRENCESORPHANS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVACMCOcardinalityoccurrencesorphans", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVCACAarchetypeattributereferencemodelcardinalityconformance(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.COMPLEX_OBJECT_CONSTRAINT__AOMVCAC_AARCHETYPEATTRIBUTEREFERENCEMODELCARDINALITYCONFORMANCE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVCACAarchetypeattributereferencemodelcardinalityconformance", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMWACMCLcardinalityoccurrenceslowerboundvalidity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.COMPLEX_OBJECT_CONSTRAINT__AOMWACMC_LCARDINALITYOCCURRENCESLOWERBOUNDVALIDITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMWACMCLcardinalityoccurrenceslowerboundvalidity", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVSANCCspecialisedarchetypeattributenodecardinalityconformance(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.COMPLEX_OBJECT_CONSTRAINT__AOMVSANC_CSPECIALISEDARCHETYPEATTRIBUTENODECARDINALITYCONFORMANCE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVSANCCspecialisedarchetypeattributenodecardinalityconformance", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVCATUattributeuniqueness(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.COMPLEX_OBJECT_CONSTRAINT__AOMVCAT_UATTRIBUTEUNIQUENESS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVCATUattributeuniqueness", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVUNTuseNodereferencemodeltypevalidity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.COMPLEX_OBJECT_CONSTRAINT__AOMVUN_TUSE_NODEREFERENCEMODELTYPEVALIDITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVUNTuseNodereferencemodeltypevalidity", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVUNPuseNodepathvalidity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.COMPLEX_OBJECT_CONSTRAINT__AOMVUN_PUSE_NODEPATHVALIDITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVUNPuseNodepathvalidity", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVSUNTuseNodespecialisationparentvalidity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.COMPLEX_OBJECT_CONSTRAINT__AOMVSUN_TUSE_NODESPECIALISATIONPARENTVALIDITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVSUNTuseNodespecialisationparentvalidity", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVOBAVobjectnodeassumedvaluevalidity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.COMPLEX_OBJECT_CONSTRAINT__AOMVOBA_VOBJECTNODEASSUMEDVALUEVALIDITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVOBAVobjectnodeassumedvaluevalidity", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVACDFconstraintcodevalidity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.COMPLEX_OBJECT_CONSTRAINT__AOMVACD_FCONSTRAINTCODEVALIDITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVACDFconstraintcodevalidity", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVSONPIspecialisedarchetypeprohibitedobjectnodeAOMnodeidvalidity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.COMPLEX_OBJECT_CONSTRAINT__AOMVSONP_ISPECIALISEDARCHETYPEPROHIBITEDOBJECTNODE_AO_MNODEIDVALIDITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVSONPIspecialisedarchetypeprohibitedobjectnodeAOMnodeidvalidity", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMCOBJECTInvariantRmTypeNameValid(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.COMPLEX_OBJECT_CONSTRAINT__AOMCOBJECT_INVARIANT_RM_TYPE_NAME_VALID,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMCOBJECTInvariantRmTypeNameValid", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMCCOMPLEXOBJECTInvariantProhibitedValidity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.COMPLEX_OBJECT_CONSTRAINT__AOMCCOMPLEXOBJECT_INVARIANT_PROHIBITED_VALIDITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMCCOMPLEXOBJECTInvariantProhibitedValidity", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMCCOMPLEXOBJECTInvariantAnyAllowedValidity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.COMPLEX_OBJECT_CONSTRAINT__AOMCCOMPLEXOBJECT_INVARIANT_ANY_ALLOWED_VALIDITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMCCOMPLEXOBJECTInvariantAnyAllowedValidity", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMCCOMPLEXOBJECTInvariantAttributesValid(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.COMPLEX_OBJECT_CONSTRAINT__AOMCCOMPLEXOBJECT_INVARIANT_ATTRIBUTES_VALID,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMCCOMPLEXOBJECTInvariantAttributesValid", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMCCOMPLEXOBJECTTuplesValid(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.COMPLEX_OBJECT_CONSTRAINT__AOMCCOMPLEXOBJECT_TUPLES_VALID,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMCCOMPLEXOBJECTTuplesValid", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMCPRIMITIVEOBJECTInvariantRepresentationValidity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.COMPLEX_OBJECT_CONSTRAINT__AOMCPRIMITIVEOBJECT_INVARIANT_REPRESENTATION_VALIDITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMCPRIMITIVEOBJECTInvariantRepresentationValidity", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMCPRIMITIVEOBJECTInvariantAssumedValueValid(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.COMPLEX_OBJECT_CONSTRAINT__AOMCPRIMITIVEOBJECT_INVARIANT_ASSUMED_VALUE_VALID,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMCPRIMITIVEOBJECTInvariantAssumedValueValid", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMCBOOLEANInvariantBinaryConsistency(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.COMPLEX_OBJECT_CONSTRAINT__AOMCBOOLEAN_INVARIANT_BINARY_CONSISTENCY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMCBOOLEANInvariantBinaryConsistency", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMCBOOLEANInvariantPrototypeValueConsistency(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.COMPLEX_OBJECT_CONSTRAINT__AOMCBOOLEAN_INVARIANT_PROTOTYPE_VALUE_CONSISTENCY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMCBOOLEANInvariantPrototypeValueConsistency", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMCDATEInvariantPatternValidity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.COMPLEX_OBJECT_CONSTRAINT__AOMCDATE_INVARIANT_PATTERN_VALIDITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMCDATEInvariantPatternValidity", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMCTERMINOLOGYCODEInvariantTerminologyIdValidity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.COMPLEX_OBJECT_CONSTRAINT__AOMCTERMINOLOGYCODE_INVARIANT_TERMINOLOGY_ID_VALIDITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMCTERMINOLOGYCODEInvariantTerminologyIdValidity", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMASSERTIONInvariantTagValid(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.COMPLEX_OBJECT_CONSTRAINT__AOMASSERTION_INVARIANT_TAG_VALID,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMASSERTIONInvariantTagValid", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMASSERTIONInvariantExpressionValid(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.COMPLEX_OBJECT_CONSTRAINT__AOMASSERTION_INVARIANT_EXPRESSION_VALID,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMASSERTIONInvariantExpressionValid", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMQUERYVARIABLEInvariantContextValid(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.COMPLEX_OBJECT_CONSTRAINT__AOMQUERYVARIABLE_INVARIANT_CONTEXT_VALID,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMQUERYVARIABLEInvariantContextValid", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMEXPRITEMInvariantTypeValid(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.COMPLEX_OBJECT_CONSTRAINT__AOMEXPRITEM_INVARIANT_TYPE_VALID,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMEXPRITEMInvariantTypeValid", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMEXPRUNARYOPERATORInvariantoperandValid(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.COMPLEX_OBJECT_CONSTRAINT__AOMEXPRUNARYOPERATOR_INVARIANTOPERAND_VALID,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMEXPRUNARYOPERATORInvariantoperandValid", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMEXPRBINARYOPERATORInvariantleftOperandValid(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.COMPLEX_OBJECT_CONSTRAINT__AOMEXPRBINARYOPERATOR_INVARIANTLEFT_OPERAND_VALID,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMEXPRBINARYOPERATORInvariantleftOperandValid", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMEXPRBINARYOPERATORInvariantrightOperandValid(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.COMPLEX_OBJECT_CONSTRAINT__AOMEXPRBINARYOPERATOR_INVARIANTRIGHT_OPERAND_VALID,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMEXPRBINARYOPERATORInvariantrightOperandValid", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMOPERATORKINDInvariantValidity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.COMPLEX_OBJECT_CONSTRAINT__AOMOPERATORKIND_INVARIANT_VALIDITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMOPERATORKINDInvariantValidity", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVATDFvaluecodevalidity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.COMPLEX_OBJECT_CONSTRAINT__AOMVATD_FVALUECODEVALIDITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVATDFvaluecodevalidity", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVATDAvaluesetassumedvaluecodevalidity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.COMPLEX_OBJECT_CONSTRAINT__AOMVATD_AVALUESETASSUMEDVALUECODEVALIDITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVATDAvaluesetassumedvaluecodevalidity", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVSONIFspecialisedarchetypeobjectnodeidentifiervalidityinflatsiblings(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.COMPLEX_OBJECT_CONSTRAINT__AOMVSONI_FSPECIALISEDARCHETYPEOBJECTNODEIDENTIFIERVALIDITYINFLATSIBLINGS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVSONIFspecialisedarchetypeobjectnodeidentifiervalidityinflatsiblings", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMCCOMPLEXOBJECTPROXYInvariantConsistency(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.COMPLEX_OBJECT_CONSTRAINT__AOMCCOMPLEXOBJECTPROXY_INVARIANT_CONSISTENCY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMCCOMPLEXOBJECTPROXYInvariantConsistency", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMCATTRIBUTEInvariantChildrenValidity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.COMPLEX_OBJECT_CONSTRAINT__AOMCATTRIBUTE_INVARIANT_CHILDREN_VALIDITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMCATTRIBUTEInvariantChildrenValidity", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMCATTRIBUTEInvariantChildrenOrphansValidity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.COMPLEX_OBJECT_CONSTRAINT__AOMCATTRIBUTE_INVARIANT_CHILDREN_ORPHANS_VALIDITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMCATTRIBUTEInvariantChildrenOrphansValidity", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMCATTRIBUTEInvariantChildrenOccurrencesLowerSumValidity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.COMPLEX_OBJECT_CONSTRAINT__AOMCATTRIBUTE_INVARIANT_CHILDREN_OCCURRENCES_LOWER_SUM_VALIDITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMCATTRIBUTEInvariantChildrenOccurrencesLowerSumValidity", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMCATTRIBUTEInvariantCardinalityValid(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.COMPLEX_OBJECT_CONSTRAINT__AOMCATTRIBUTE_INVARIANT_CARDINALITY_VALID,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMCATTRIBUTEInvariantCardinalityValid", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMCATTRIBUTEInvariantAlternativesValid(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.COMPLEX_OBJECT_CONSTRAINT__AOMCATTRIBUTE_INVARIANT_ALTERNATIVES_VALID,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMCATTRIBUTEInvariantAlternativesValid", EObjectValidator.getObjectLabel(this, context) }),
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
			case ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT__BASE_CLASSIFIER:
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
			case ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT__BASE_CLASSIFIER:
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
			case ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT__BASE_CLASSIFIER:
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
			case ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT__BASE_CLASSIFIER:
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
			case ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT___VALIDATE_SINGLE_PARENT__DIAGNOSTICCHAIN_MAP:
				return validateSingleParent((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT___VALIDATE_ALL_ATTRIBUTE_CONSTRAINTS__DIAGNOSTICCHAIN_MAP:
				return validateAllAttributeConstraints((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVARC_NARCHETYPECONCEPTVALIDITY__DIAGNOSTICCHAIN_MAP:
				return validateAOMVARCNarchetypeconceptvalidity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVCAR_MATTRIBUTENAMEREFERENCEMODELVALIDITY__DIAGNOSTICCHAIN_MAP:
				return validateAOMVCARMattributenamereferencemodelvalidity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVCAE_XARCHETYPEATTRIBUTEREFERENCEMODELEXISTENCECONFORMANCE__DIAGNOSTICCHAIN_MAP:
				return validateAOMVCAEXarchetypeattributereferencemodelexistenceconformance((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVCA_MARCHETYPEATTRIBUTEREFERENCEMODELMULTIPLICITYCONFORMANCE__DIAGNOSTICCHAIN_MAP:
				return validateAOMVCAMarchetypeattributereferencemodelmultiplicityconformance((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVDIF_VARCHETYPEATTRIBUTEDIFFERENTIALPATHVALIDITY__DIAGNOSTICCHAIN_MAP:
				return validateAOMVDIFVarchetypeattributedifferentialpathvalidity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVDIF_PSPECIALISEDARCHETYPEATTRIBUTEDIFFERENTIALPATHVALIDITY__DIAGNOSTICCHAIN_MAP:
				return validateAOMVDIFPspecialisedarchetypeattributedifferentialpathvalidity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVSANC_ESPECIALISEDARCHETYPEATTRIBUTENODEEXISTENCECONFORMANCE__DIAGNOSTICCHAIN_MAP:
				return validateAOMVSANCEspecialisedarchetypeattributenodeexistenceconformance((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVSA_MSPECIALISEDARCHETYPEATTRIBUTEMULTIPLICITYCONFORMANCE__DIAGNOSTICCHAIN_MAP:
				return validateAOMVSAMspecialisedarchetypeattributemultiplicityconformance((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVACS_OSINGLEVALUEDATTRIBUTECHILDOBJECTOCCURRENCESVALIDITY__DIAGNOSTICCHAIN_MAP:
				return validateAOMVACSOsinglevaluedattributechildobjectoccurrencesvalidity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVACMC_UCARDINALITYOCCURRENCESUPPERBOUNDVALIDITY__DIAGNOSTICCHAIN_MAP:
				return validateAOMVACMCUcardinalityoccurrencesupperboundvalidity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVACMC_OCARDINALITYOCCURRENCESORPHANS__DIAGNOSTICCHAIN_MAP:
				return validateAOMVACMCOcardinalityoccurrencesorphans((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVCAC_AARCHETYPEATTRIBUTEREFERENCEMODELCARDINALITYCONFORMANCE__DIAGNOSTICCHAIN_MAP:
				return validateAOMVCACAarchetypeattributereferencemodelcardinalityconformance((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMWACMC_LCARDINALITYOCCURRENCESLOWERBOUNDVALIDITY__DIAGNOSTICCHAIN_MAP:
				return validateAOMWACMCLcardinalityoccurrenceslowerboundvalidity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVSANC_CSPECIALISEDARCHETYPEATTRIBUTENODECARDINALITYCONFORMANCE__DIAGNOSTICCHAIN_MAP:
				return validateAOMVSANCCspecialisedarchetypeattributenodecardinalityconformance((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVCAT_UATTRIBUTEUNIQUENESS__DIAGNOSTICCHAIN_MAP:
				return validateAOMVCATUattributeuniqueness((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVUN_TUSE_NODEREFERENCEMODELTYPEVALIDITY__DIAGNOSTICCHAIN_MAP:
				return validateAOMVUNTuseNodereferencemodeltypevalidity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVUN_PUSE_NODEPATHVALIDITY__DIAGNOSTICCHAIN_MAP:
				return validateAOMVUNPuseNodepathvalidity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVSUN_TUSE_NODESPECIALISATIONPARENTVALIDITY__DIAGNOSTICCHAIN_MAP:
				return validateAOMVSUNTuseNodespecialisationparentvalidity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVOBA_VOBJECTNODEASSUMEDVALUEVALIDITY__DIAGNOSTICCHAIN_MAP:
				return validateAOMVOBAVobjectnodeassumedvaluevalidity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVACD_FCONSTRAINTCODEVALIDITY__DIAGNOSTICCHAIN_MAP:
				return validateAOMVACDFconstraintcodevalidity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVSONP_ISPECIALISEDARCHETYPEPROHIBITEDOBJECTNODE_AO_MNODEIDVALIDITY__DIAGNOSTICCHAIN_MAP:
				return validateAOMVSONPIspecialisedarchetypeprohibitedobjectnodeAOMnodeidvalidity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCOBJECT_INVARIANT_RM_TYPE_NAME_VALID__DIAGNOSTICCHAIN_MAP:
				return validateAOMCOBJECTInvariantRmTypeNameValid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCCOMPLEXOBJECT_INVARIANT_PROHIBITED_VALIDITY__DIAGNOSTICCHAIN_MAP:
				return validateAOMCCOMPLEXOBJECTInvariantProhibitedValidity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCCOMPLEXOBJECT_INVARIANT_ANY_ALLOWED_VALIDITY__DIAGNOSTICCHAIN_MAP:
				return validateAOMCCOMPLEXOBJECTInvariantAnyAllowedValidity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCCOMPLEXOBJECT_INVARIANT_ATTRIBUTES_VALID__DIAGNOSTICCHAIN_MAP:
				return validateAOMCCOMPLEXOBJECTInvariantAttributesValid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCCOMPLEXOBJECT_TUPLES_VALID__DIAGNOSTICCHAIN_MAP:
				return validateAOMCCOMPLEXOBJECTTuplesValid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCPRIMITIVEOBJECT_INVARIANT_REPRESENTATION_VALIDITY__DIAGNOSTICCHAIN_MAP:
				return validateAOMCPRIMITIVEOBJECTInvariantRepresentationValidity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCPRIMITIVEOBJECT_INVARIANT_ASSUMED_VALUE_VALID__DIAGNOSTICCHAIN_MAP:
				return validateAOMCPRIMITIVEOBJECTInvariantAssumedValueValid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCBOOLEAN_INVARIANT_BINARY_CONSISTENCY__DIAGNOSTICCHAIN_MAP:
				return validateAOMCBOOLEANInvariantBinaryConsistency((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCBOOLEAN_INVARIANT_PROTOTYPE_VALUE_CONSISTENCY__DIAGNOSTICCHAIN_MAP:
				return validateAOMCBOOLEANInvariantPrototypeValueConsistency((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCDATE_INVARIANT_PATTERN_VALIDITY__DIAGNOSTICCHAIN_MAP:
				return validateAOMCDATEInvariantPatternValidity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCTERMINOLOGYCODE_INVARIANT_TERMINOLOGY_ID_VALIDITY__DIAGNOSTICCHAIN_MAP:
				return validateAOMCTERMINOLOGYCODEInvariantTerminologyIdValidity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMASSERTION_INVARIANT_TAG_VALID__DIAGNOSTICCHAIN_MAP:
				return validateAOMASSERTIONInvariantTagValid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMASSERTION_INVARIANT_EXPRESSION_VALID__DIAGNOSTICCHAIN_MAP:
				return validateAOMASSERTIONInvariantExpressionValid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMQUERYVARIABLE_INVARIANT_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP:
				return validateAOMQUERYVARIABLEInvariantContextValid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMEXPRITEM_INVARIANT_TYPE_VALID__DIAGNOSTICCHAIN_MAP:
				return validateAOMEXPRITEMInvariantTypeValid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMEXPRUNARYOPERATOR_INVARIANTOPERAND_VALID__DIAGNOSTICCHAIN_MAP:
				return validateAOMEXPRUNARYOPERATORInvariantoperandValid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMEXPRBINARYOPERATOR_INVARIANTLEFT_OPERAND_VALID__DIAGNOSTICCHAIN_MAP:
				return validateAOMEXPRBINARYOPERATORInvariantleftOperandValid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMEXPRBINARYOPERATOR_INVARIANTRIGHT_OPERAND_VALID__DIAGNOSTICCHAIN_MAP:
				return validateAOMEXPRBINARYOPERATORInvariantrightOperandValid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMOPERATORKIND_INVARIANT_VALIDITY__DIAGNOSTICCHAIN_MAP:
				return validateAOMOPERATORKINDInvariantValidity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVATD_FVALUECODEVALIDITY__DIAGNOSTICCHAIN_MAP:
				return validateAOMVATDFvaluecodevalidity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVATD_AVALUESETASSUMEDVALUECODEVALIDITY__DIAGNOSTICCHAIN_MAP:
				return validateAOMVATDAvaluesetassumedvaluecodevalidity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMVSONI_FSPECIALISEDARCHETYPEOBJECTNODEIDENTIFIERVALIDITYINFLATSIBLINGS__DIAGNOSTICCHAIN_MAP:
				return validateAOMVSONIFspecialisedarchetypeobjectnodeidentifiervalidityinflatsiblings((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCCOMPLEXOBJECTPROXY_INVARIANT_CONSISTENCY__DIAGNOSTICCHAIN_MAP:
				return validateAOMCCOMPLEXOBJECTPROXYInvariantConsistency((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCATTRIBUTE_INVARIANT_CHILDREN_VALIDITY__DIAGNOSTICCHAIN_MAP:
				return validateAOMCATTRIBUTEInvariantChildrenValidity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCATTRIBUTE_INVARIANT_CHILDREN_ORPHANS_VALIDITY__DIAGNOSTICCHAIN_MAP:
				return validateAOMCATTRIBUTEInvariantChildrenOrphansValidity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCATTRIBUTE_INVARIANT_CHILDREN_OCCURRENCES_LOWER_SUM_VALIDITY__DIAGNOSTICCHAIN_MAP:
				return validateAOMCATTRIBUTEInvariantChildrenOccurrencesLowerSumValidity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCATTRIBUTE_INVARIANT_CARDINALITY_VALID__DIAGNOSTICCHAIN_MAP:
				return validateAOMCATTRIBUTEInvariantCardinalityValid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.COMPLEX_OBJECT_CONSTRAINT___VALIDATE_AOMCATTRIBUTE_INVARIANT_ALTERNATIVES_VALID__DIAGNOSTICCHAIN_MAP:
				return validateAOMCATTRIBUTEInvariantAlternativesValid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ComplexObjectConstraintImpl
