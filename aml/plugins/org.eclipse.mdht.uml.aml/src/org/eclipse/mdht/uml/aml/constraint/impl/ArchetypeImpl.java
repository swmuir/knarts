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

import java.util.Collection;
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

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.mdht.uml.aml.constraint.Archetype;
import org.eclipse.mdht.uml.aml.constraint.ConstraintPackage;
import org.eclipse.mdht.uml.aml.constraint.VERSION_STATUS;

import org.eclipse.mdht.uml.aml.constraint.util.ConstraintValidator;

import org.eclipse.mdht.uml.aml.terminology.ArchetypeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Archetype</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.ArchetypeImpl#getBase_Package <em>Base Package</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.ArchetypeImpl#getArchetypeType <em>Archetype Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.ArchetypeImpl#getAmlVersion <em>Aml Version</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.ArchetypeImpl#isIs_controlled <em>Is controlled</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.ArchetypeImpl#isIs_generated <em>Is generated</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.ArchetypeImpl#getRelease_version <em>Release version</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.ArchetypeImpl#getVersion_status <em>Version status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.ArchetypeImpl#getBuild_count <em>Build count</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.ArchetypeImpl#getOther_metadatas <em>Other metadata</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.constraint.impl.ArchetypeImpl#getOther_metadata_ids <em>Other metadata id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArchetypeImpl extends AuthoredResourceImpl implements Archetype {
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
	 * The default value of the '{@link #getArchetypeType() <em>Archetype Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchetypeType()
	 * @generated
	 * @ordered
	 */
	protected static final ArchetypeType ARCHETYPE_TYPE_EDEFAULT = ArchetypeType.ARCHETYPE;

	/**
	 * The cached value of the '{@link #getArchetypeType() <em>Archetype Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchetypeType()
	 * @generated
	 * @ordered
	 */
	protected ArchetypeType archetypeType = ARCHETYPE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmlVersion() <em>Aml Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmlVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String AML_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAmlVersion() <em>Aml Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmlVersion()
	 * @generated
	 * @ordered
	 */
	protected String amlVersion = AML_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #isIs_controlled() <em>Is controlled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIs_controlled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CONTROLLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIs_controlled() <em>Is controlled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIs_controlled()
	 * @generated
	 * @ordered
	 */
	protected boolean is_controlled = IS_CONTROLLED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIs_generated() <em>Is generated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIs_generated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_GENERATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIs_generated() <em>Is generated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIs_generated()
	 * @generated
	 * @ordered
	 */
	protected boolean is_generated = IS_GENERATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelease_version() <em>Release version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelease_version()
	 * @generated
	 * @ordered
	 */
	protected static final String RELEASE_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelease_version() <em>Release version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelease_version()
	 * @generated
	 * @ordered
	 */
	protected String release_version = RELEASE_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion_status() <em>Version status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion_status()
	 * @generated
	 * @ordered
	 */
	protected static final VERSION_STATUS VERSION_STATUS_EDEFAULT = VERSION_STATUS.ALPHA;

	/**
	 * The cached value of the '{@link #getVersion_status() <em>Version status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion_status()
	 * @generated
	 * @ordered
	 */
	protected VERSION_STATUS version_status = VERSION_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBuild_count() <em>Build count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuild_count()
	 * @generated
	 * @ordered
	 */
	protected static final int BUILD_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBuild_count() <em>Build count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuild_count()
	 * @generated
	 * @ordered
	 */
	protected int build_count = BUILD_COUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOther_metadatas() <em>Other metadata</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOther_metadatas()
	 * @generated
	 * @ordered
	 */
	protected EList<String> other_metadatas;

	/**
	 * The cached value of the '{@link #getOther_metadata_ids() <em>Other metadata id</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOther_metadata_ids()
	 * @generated
	 * @ordered
	 */
	protected EList<String> other_metadata_ids;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchetypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConstraintPackage.Literals.ARCHETYPE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConstraintPackage.ARCHETYPE__BASE_PACKAGE, oldBase_Package, base_Package));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintPackage.ARCHETYPE__BASE_PACKAGE, oldBase_Package, base_Package));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchetypeType getArchetypeType() {
		return archetypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchetypeType(ArchetypeType newArchetypeType) {
		ArchetypeType oldArchetypeType = archetypeType;
		archetypeType = newArchetypeType == null ? ARCHETYPE_TYPE_EDEFAULT : newArchetypeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintPackage.ARCHETYPE__ARCHETYPE_TYPE, oldArchetypeType, archetypeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAmlVersion() {
		return amlVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmlVersion(String newAmlVersion) {
		String oldAmlVersion = amlVersion;
		amlVersion = newAmlVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintPackage.ARCHETYPE__AML_VERSION, oldAmlVersion, amlVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIs_controlled() {
		return is_controlled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIs_controlled(boolean newIs_controlled) {
		boolean oldIs_controlled = is_controlled;
		is_controlled = newIs_controlled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintPackage.ARCHETYPE__IS_CONTROLLED, oldIs_controlled, is_controlled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIs_generated() {
		return is_generated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIs_generated(boolean newIs_generated) {
		boolean oldIs_generated = is_generated;
		is_generated = newIs_generated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintPackage.ARCHETYPE__IS_GENERATED, oldIs_generated, is_generated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRelease_version() {
		return release_version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelease_version(String newRelease_version) {
		String oldRelease_version = release_version;
		release_version = newRelease_version;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintPackage.ARCHETYPE__RELEASE_VERSION, oldRelease_version, release_version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VERSION_STATUS getVersion_status() {
		return version_status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion_status(VERSION_STATUS newVersion_status) {
		VERSION_STATUS oldVersion_status = version_status;
		version_status = newVersion_status == null ? VERSION_STATUS_EDEFAULT : newVersion_status;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintPackage.ARCHETYPE__VERSION_STATUS, oldVersion_status, version_status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBuild_count() {
		return build_count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuild_count(int newBuild_count) {
		int oldBuild_count = build_count;
		build_count = newBuild_count;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintPackage.ARCHETYPE__BUILD_COUNT, oldBuild_count, build_count));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getOther_metadatas() {
		if (other_metadatas == null) {
			other_metadatas = new EDataTypeUniqueEList<String>(String.class, this, ConstraintPackage.ARCHETYPE__OTHER_METADATA);
		}
		return other_metadatas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getOther_metadata_ids() {
		if (other_metadata_ids == null) {
			other_metadata_ids = new EDataTypeUniqueEList<String>(String.class, this, ConstraintPackage.ARCHETYPE__OTHER_METADATA_ID);
		}
		return other_metadata_ids;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMustBeOwned(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.ARCHETYPE__MUST_BE_OWNED,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateMustBeOwned", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateOwnsObjectConstraints(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.ARCHETYPE__OWNS_OBJECT_CONSTRAINTS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateOwnsObjectConstraints", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateSpecializesArchetype(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.ARCHETYPE__SPECIALIZES_ARCHETYPE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateSpecializesArchetype", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVOKUobjectkeyunique(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.ARCHETYPE__AOMVOK_UOBJECTKEYUNIQUE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVOKUobjectkeyunique", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVARDTarchetypedefinitiontypenamevalidity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.ARCHETYPE__AOMVARD_TARCHETYPEDEFINITIONTYPENAMEVALIDITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVARDTarchetypedefinitiontypenamevalidity", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVARIDarchetypeidentifiervalidity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.ARCHETYPE__AOMVARI_DARCHETYPEIDENTIFIERVALIDITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVARIDarchetypeidentifiervalidity", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVDEOLoriginallanguagespecified(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.ARCHETYPE__AOMVDEO_LORIGINALLANGUAGESPECIFIED,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVDEOLoriginallanguagespecified", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVARDdescriptionspecified(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.ARCHETYPE__AOMVAR_DDESCRIPTIONSPECIFIED,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVARDdescriptionspecified", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVASIDarchetypespecialisationparentidentifiervalidity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.ARCHETYPE__AOMVASI_DARCHETYPESPECIALISATIONPARENTIDENTIFIERVALIDITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVASIDarchetypespecialisationparentidentifiervalidity", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVALCarchetypelanguageconformance(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.ARCHETYPE__AOMVAL_CARCHETYPELANGUAGECONFORMANCE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVALCarchetypelanguageconformance", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVACSDarchetypeconceptspecialisationdepth(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.ARCHETYPE__AOMVACS_DARCHETYPECONCEPTSPECIALISATIONDEPTH,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVACSDarchetypeconceptspecialisationdepth", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVATCDarchetypecodespecialisationlevelvalidity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.ARCHETYPE__AOMVATC_DARCHETYPECODESPECIALISATIONLEVELVALIDITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVATCDarchetypecodespecialisationlevelvalidity", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMARCHETYPEInvariantOriginalLanguageValid(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.ARCHETYPE__AOMARCHETYPE_INVARIANT_ORIGINAL_LANGUAGE_VALID,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMARCHETYPEInvariantOriginalLanguageValid", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMARCHETYPEInvariantConceptValid(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.ARCHETYPE__AOMARCHETYPE_INVARIANT_CONCEPT_VALID,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMARCHETYPEInvariantConceptValid", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMARCHETYPEInvariantDefinitionExists(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.ARCHETYPE__AOMARCHETYPE_INVARIANT_DEFINITION_EXISTS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMARCHETYPEInvariantDefinitionExists", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMARCHETYPEInvariantTerminologyExists(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.ARCHETYPE__AOMARCHETYPE_INVARIANT_TERMINOLOGY_EXISTS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMARCHETYPEInvariantTerminologyExists", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMARCHETYPEInvariantSpecialisationValidity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.ARCHETYPE__AOMARCHETYPE_INVARIANT_SPECIALISATION_VALIDITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMARCHETYPEInvariantSpecialisationValidity", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMARCHETYPEInvariantRulesValid(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.ARCHETYPE__AOMARCHETYPE_INVARIANT_RULES_VALID,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMARCHETYPEInvariantRulesValid", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMARCHETYPEHRIDInvariantConceptIdValidity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.ARCHETYPE__AOMARCHETYPEHRID_INVARIANT_CONCEPT_ID_VALIDITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMARCHETYPEHRIDInvariantConceptIdValidity", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMARCHETYPEHRIDInvariantBaseVersionValidity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.ARCHETYPE__AOMARCHETYPEHRID_INVARIANT_BASE_VERSION_VALIDITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMARCHETYPEHRIDInvariantBaseVersionValidity", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMOPERATIONALTEMPLATEInvariantIsSpecialised(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.ARCHETYPE__AOMOPERATIONALTEMPLATE_INVARIANT_IS_SPECIALISED,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMOPERATIONALTEMPLATEInvariantIsSpecialised", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMOPERATIONALTEMPLATEInvariantComponentTerminologiesExistence(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.ARCHETYPE__AOMOPERATIONALTEMPLATE_INVARIANT_COMPONENT_TERMINOLOGIES_EXISTENCE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMOPERATIONALTEMPLATEInvariantComponentTerminologiesExistence", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMARCHETYPETERMINOLOGYInvariantoriginalLanguageValidity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.ARCHETYPE__AOMARCHETYPETERMINOLOGY_INVARIANTORIGINAL_LANGUAGE_VALIDITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMARCHETYPETERMINOLOGYInvariantoriginalLanguageValidity", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMARCHETYPETERMINOLOGYInvariantconceptCodeValidity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.ARCHETYPE__AOMARCHETYPETERMINOLOGY_INVARIANTCONCEPT_CODE_VALIDITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMARCHETYPETERMINOLOGYInvariantconceptCodeValidity", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMARCHETYPETERMINOLOGYInvarianttermDefinitionsValidity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.ARCHETYPE__AOMARCHETYPETERMINOLOGY_INVARIANTTERM_DEFINITIONS_VALIDITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMARCHETYPETERMINOLOGYInvarianttermDefinitionsValidity", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMARCHETYPETERMINOLOGYInvariantParentArchetypeValid(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.ARCHETYPE__AOMARCHETYPETERMINOLOGY_INVARIANT_PARENT_ARCHETYPE_VALID,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMARCHETYPETERMINOLOGYInvariantParentArchetypeValid", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateAOMVARIABLEDECLARATIONInvariantNameValid(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 ConstraintValidator.ARCHETYPE__AOMVARIABLEDECLARATION_INVARIANT_NAME_VALID,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateAOMVARIABLEDECLARATIONInvariantNameValid", EObjectValidator.getObjectLabel(this, context) }),
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
			case ConstraintPackage.ARCHETYPE__BASE_PACKAGE:
				if (resolve) return getBase_Package();
				return basicGetBase_Package();
			case ConstraintPackage.ARCHETYPE__ARCHETYPE_TYPE:
				return getArchetypeType();
			case ConstraintPackage.ARCHETYPE__AML_VERSION:
				return getAmlVersion();
			case ConstraintPackage.ARCHETYPE__IS_CONTROLLED:
				return isIs_controlled();
			case ConstraintPackage.ARCHETYPE__IS_GENERATED:
				return isIs_generated();
			case ConstraintPackage.ARCHETYPE__RELEASE_VERSION:
				return getRelease_version();
			case ConstraintPackage.ARCHETYPE__VERSION_STATUS:
				return getVersion_status();
			case ConstraintPackage.ARCHETYPE__BUILD_COUNT:
				return getBuild_count();
			case ConstraintPackage.ARCHETYPE__OTHER_METADATA:
				return getOther_metadatas();
			case ConstraintPackage.ARCHETYPE__OTHER_METADATA_ID:
				return getOther_metadata_ids();
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
			case ConstraintPackage.ARCHETYPE__BASE_PACKAGE:
				setBase_Package((org.eclipse.uml2.uml.Package)newValue);
				return;
			case ConstraintPackage.ARCHETYPE__ARCHETYPE_TYPE:
				setArchetypeType((ArchetypeType)newValue);
				return;
			case ConstraintPackage.ARCHETYPE__AML_VERSION:
				setAmlVersion((String)newValue);
				return;
			case ConstraintPackage.ARCHETYPE__IS_CONTROLLED:
				setIs_controlled((Boolean)newValue);
				return;
			case ConstraintPackage.ARCHETYPE__IS_GENERATED:
				setIs_generated((Boolean)newValue);
				return;
			case ConstraintPackage.ARCHETYPE__RELEASE_VERSION:
				setRelease_version((String)newValue);
				return;
			case ConstraintPackage.ARCHETYPE__VERSION_STATUS:
				setVersion_status((VERSION_STATUS)newValue);
				return;
			case ConstraintPackage.ARCHETYPE__BUILD_COUNT:
				setBuild_count((Integer)newValue);
				return;
			case ConstraintPackage.ARCHETYPE__OTHER_METADATA:
				getOther_metadatas().clear();
				getOther_metadatas().addAll((Collection<? extends String>)newValue);
				return;
			case ConstraintPackage.ARCHETYPE__OTHER_METADATA_ID:
				getOther_metadata_ids().clear();
				getOther_metadata_ids().addAll((Collection<? extends String>)newValue);
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
			case ConstraintPackage.ARCHETYPE__BASE_PACKAGE:
				setBase_Package((org.eclipse.uml2.uml.Package)null);
				return;
			case ConstraintPackage.ARCHETYPE__ARCHETYPE_TYPE:
				setArchetypeType(ARCHETYPE_TYPE_EDEFAULT);
				return;
			case ConstraintPackage.ARCHETYPE__AML_VERSION:
				setAmlVersion(AML_VERSION_EDEFAULT);
				return;
			case ConstraintPackage.ARCHETYPE__IS_CONTROLLED:
				setIs_controlled(IS_CONTROLLED_EDEFAULT);
				return;
			case ConstraintPackage.ARCHETYPE__IS_GENERATED:
				setIs_generated(IS_GENERATED_EDEFAULT);
				return;
			case ConstraintPackage.ARCHETYPE__RELEASE_VERSION:
				setRelease_version(RELEASE_VERSION_EDEFAULT);
				return;
			case ConstraintPackage.ARCHETYPE__VERSION_STATUS:
				setVersion_status(VERSION_STATUS_EDEFAULT);
				return;
			case ConstraintPackage.ARCHETYPE__BUILD_COUNT:
				setBuild_count(BUILD_COUNT_EDEFAULT);
				return;
			case ConstraintPackage.ARCHETYPE__OTHER_METADATA:
				getOther_metadatas().clear();
				return;
			case ConstraintPackage.ARCHETYPE__OTHER_METADATA_ID:
				getOther_metadata_ids().clear();
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
			case ConstraintPackage.ARCHETYPE__BASE_PACKAGE:
				return base_Package != null;
			case ConstraintPackage.ARCHETYPE__ARCHETYPE_TYPE:
				return archetypeType != ARCHETYPE_TYPE_EDEFAULT;
			case ConstraintPackage.ARCHETYPE__AML_VERSION:
				return AML_VERSION_EDEFAULT == null ? amlVersion != null : !AML_VERSION_EDEFAULT.equals(amlVersion);
			case ConstraintPackage.ARCHETYPE__IS_CONTROLLED:
				return is_controlled != IS_CONTROLLED_EDEFAULT;
			case ConstraintPackage.ARCHETYPE__IS_GENERATED:
				return is_generated != IS_GENERATED_EDEFAULT;
			case ConstraintPackage.ARCHETYPE__RELEASE_VERSION:
				return RELEASE_VERSION_EDEFAULT == null ? release_version != null : !RELEASE_VERSION_EDEFAULT.equals(release_version);
			case ConstraintPackage.ARCHETYPE__VERSION_STATUS:
				return version_status != VERSION_STATUS_EDEFAULT;
			case ConstraintPackage.ARCHETYPE__BUILD_COUNT:
				return build_count != BUILD_COUNT_EDEFAULT;
			case ConstraintPackage.ARCHETYPE__OTHER_METADATA:
				return other_metadatas != null && !other_metadatas.isEmpty();
			case ConstraintPackage.ARCHETYPE__OTHER_METADATA_ID:
				return other_metadata_ids != null && !other_metadata_ids.isEmpty();
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
			case ConstraintPackage.ARCHETYPE___VALIDATE_MUST_BE_OWNED__DIAGNOSTICCHAIN_MAP:
				return validateMustBeOwned((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.ARCHETYPE___VALIDATE_OWNS_OBJECT_CONSTRAINTS__DIAGNOSTICCHAIN_MAP:
				return validateOwnsObjectConstraints((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.ARCHETYPE___VALIDATE_SPECIALIZES_ARCHETYPE__DIAGNOSTICCHAIN_MAP:
				return validateSpecializesArchetype((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.ARCHETYPE___VALIDATE_AOMVOK_UOBJECTKEYUNIQUE__DIAGNOSTICCHAIN_MAP:
				return validateAOMVOKUobjectkeyunique((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.ARCHETYPE___VALIDATE_AOMVARD_TARCHETYPEDEFINITIONTYPENAMEVALIDITY__DIAGNOSTICCHAIN_MAP:
				return validateAOMVARDTarchetypedefinitiontypenamevalidity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.ARCHETYPE___VALIDATE_AOMVARI_DARCHETYPEIDENTIFIERVALIDITY__DIAGNOSTICCHAIN_MAP:
				return validateAOMVARIDarchetypeidentifiervalidity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.ARCHETYPE___VALIDATE_AOMVDEO_LORIGINALLANGUAGESPECIFIED__DIAGNOSTICCHAIN_MAP:
				return validateAOMVDEOLoriginallanguagespecified((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.ARCHETYPE___VALIDATE_AOMVAR_DDESCRIPTIONSPECIFIED__DIAGNOSTICCHAIN_MAP:
				return validateAOMVARDdescriptionspecified((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.ARCHETYPE___VALIDATE_AOMVASI_DARCHETYPESPECIALISATIONPARENTIDENTIFIERVALIDITY__DIAGNOSTICCHAIN_MAP:
				return validateAOMVASIDarchetypespecialisationparentidentifiervalidity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.ARCHETYPE___VALIDATE_AOMVAL_CARCHETYPELANGUAGECONFORMANCE__DIAGNOSTICCHAIN_MAP:
				return validateAOMVALCarchetypelanguageconformance((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.ARCHETYPE___VALIDATE_AOMVACS_DARCHETYPECONCEPTSPECIALISATIONDEPTH__DIAGNOSTICCHAIN_MAP:
				return validateAOMVACSDarchetypeconceptspecialisationdepth((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.ARCHETYPE___VALIDATE_AOMVATC_DARCHETYPECODESPECIALISATIONLEVELVALIDITY__DIAGNOSTICCHAIN_MAP:
				return validateAOMVATCDarchetypecodespecialisationlevelvalidity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.ARCHETYPE___VALIDATE_AOMARCHETYPE_INVARIANT_ORIGINAL_LANGUAGE_VALID__DIAGNOSTICCHAIN_MAP:
				return validateAOMARCHETYPEInvariantOriginalLanguageValid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.ARCHETYPE___VALIDATE_AOMARCHETYPE_INVARIANT_CONCEPT_VALID__DIAGNOSTICCHAIN_MAP:
				return validateAOMARCHETYPEInvariantConceptValid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.ARCHETYPE___VALIDATE_AOMARCHETYPE_INVARIANT_DEFINITION_EXISTS__DIAGNOSTICCHAIN_MAP:
				return validateAOMARCHETYPEInvariantDefinitionExists((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.ARCHETYPE___VALIDATE_AOMARCHETYPE_INVARIANT_TERMINOLOGY_EXISTS__DIAGNOSTICCHAIN_MAP:
				return validateAOMARCHETYPEInvariantTerminologyExists((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.ARCHETYPE___VALIDATE_AOMARCHETYPE_INVARIANT_SPECIALISATION_VALIDITY__DIAGNOSTICCHAIN_MAP:
				return validateAOMARCHETYPEInvariantSpecialisationValidity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.ARCHETYPE___VALIDATE_AOMARCHETYPE_INVARIANT_RULES_VALID__DIAGNOSTICCHAIN_MAP:
				return validateAOMARCHETYPEInvariantRulesValid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.ARCHETYPE___VALIDATE_AOMARCHETYPEHRID_INVARIANT_CONCEPT_ID_VALIDITY__DIAGNOSTICCHAIN_MAP:
				return validateAOMARCHETYPEHRIDInvariantConceptIdValidity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.ARCHETYPE___VALIDATE_AOMARCHETYPEHRID_INVARIANT_BASE_VERSION_VALIDITY__DIAGNOSTICCHAIN_MAP:
				return validateAOMARCHETYPEHRIDInvariantBaseVersionValidity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.ARCHETYPE___VALIDATE_AOMOPERATIONALTEMPLATE_INVARIANT_IS_SPECIALISED__DIAGNOSTICCHAIN_MAP:
				return validateAOMOPERATIONALTEMPLATEInvariantIsSpecialised((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.ARCHETYPE___VALIDATE_AOMOPERATIONALTEMPLATE_INVARIANT_COMPONENT_TERMINOLOGIES_EXISTENCE__DIAGNOSTICCHAIN_MAP:
				return validateAOMOPERATIONALTEMPLATEInvariantComponentTerminologiesExistence((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.ARCHETYPE___VALIDATE_AOMARCHETYPETERMINOLOGY_INVARIANTORIGINAL_LANGUAGE_VALIDITY__DIAGNOSTICCHAIN_MAP:
				return validateAOMARCHETYPETERMINOLOGYInvariantoriginalLanguageValidity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.ARCHETYPE___VALIDATE_AOMARCHETYPETERMINOLOGY_INVARIANTCONCEPT_CODE_VALIDITY__DIAGNOSTICCHAIN_MAP:
				return validateAOMARCHETYPETERMINOLOGYInvariantconceptCodeValidity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.ARCHETYPE___VALIDATE_AOMARCHETYPETERMINOLOGY_INVARIANTTERM_DEFINITIONS_VALIDITY__DIAGNOSTICCHAIN_MAP:
				return validateAOMARCHETYPETERMINOLOGYInvarianttermDefinitionsValidity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.ARCHETYPE___VALIDATE_AOMARCHETYPETERMINOLOGY_INVARIANT_PARENT_ARCHETYPE_VALID__DIAGNOSTICCHAIN_MAP:
				return validateAOMARCHETYPETERMINOLOGYInvariantParentArchetypeValid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case ConstraintPackage.ARCHETYPE___VALIDATE_AOMVARIABLEDECLARATION_INVARIANT_NAME_VALID__DIAGNOSTICCHAIN_MAP:
				return validateAOMVARIABLEDECLARATIONInvariantNameValid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (archetypeType: ");
		result.append(archetypeType);
		result.append(", amlVersion: ");
		result.append(amlVersion);
		result.append(", is_controlled: ");
		result.append(is_controlled);
		result.append(", is_generated: ");
		result.append(is_generated);
		result.append(", release_version: ");
		result.append(release_version);
		result.append(", version_status: ");
		result.append(version_status);
		result.append(", build_count: ");
		result.append(build_count);
		result.append(", other_metadata: ");
		result.append(other_metadatas);
		result.append(", other_metadata_id: ");
		result.append(other_metadata_ids);
		result.append(')');
		return result.toString();
	}

} //ArchetypeImpl
