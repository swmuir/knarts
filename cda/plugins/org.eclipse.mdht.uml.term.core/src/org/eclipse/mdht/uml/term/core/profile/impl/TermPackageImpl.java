/*******************************************************************************
 * Copyright (c) 2010 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.term.core.profile.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.mdht.uml.term.core.profile.BindingKind;
import org.eclipse.mdht.uml.term.core.profile.CodeSystemConstraint;
import org.eclipse.mdht.uml.term.core.profile.CodeSystemVersion;
import org.eclipse.mdht.uml.term.core.profile.ConceptDomain;
import org.eclipse.mdht.uml.term.core.profile.ConceptDomainConstraint;
import org.eclipse.mdht.uml.term.core.profile.Extensibility;
import org.eclipse.mdht.uml.term.core.profile.Guidance;
import org.eclipse.mdht.uml.term.core.profile.NullValueSetConstraint;
import org.eclipse.mdht.uml.term.core.profile.StatusKind;
import org.eclipse.mdht.uml.term.core.profile.TermFactory;
import org.eclipse.mdht.uml.term.core.profile.TermPackage;
import org.eclipse.mdht.uml.term.core.profile.UsageContext;
import org.eclipse.mdht.uml.term.core.profile.ValueSetBinding;
import org.eclipse.mdht.uml.term.core.profile.ValueSetCode;
import org.eclipse.mdht.uml.term.core.profile.ValueSetConstraint;
import org.eclipse.mdht.uml.term.core.profile.ValueSetConstraints;
import org.eclipse.mdht.uml.term.core.profile.ValueSetContextBinding;
import org.eclipse.mdht.uml.term.core.profile.ValueSetType;
import org.eclipse.mdht.uml.term.core.profile.ValueSetVersion;
import org.eclipse.uml2.types.TypesPackage;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TermPackageImpl extends EPackageImpl implements TermPackage {
	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>
	 * This method is used to initialize {@link TermPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TermPackage init() {
		if (isInited) {
			return (TermPackage) EPackage.Registry.INSTANCE.getEPackage(TermPackage.eNS_URI);
		}

		// Obtain or create and register package
		TermPackageImpl theTermPackage = (TermPackageImpl) (EPackage.Registry.INSTANCE.get(
			eNS_URI) instanceof TermPackageImpl
					? EPackage.Registry.INSTANCE.get(eNS_URI)
					: new TermPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		UMLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTermPackage.createPackageContents();

		// Initialize created meta-data
		theTermPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTermPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TermPackage.eNS_URI, theTermPackage);
		return theTermPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass cdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass crEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass conceptDomainConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass conceptDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass codeSystemConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass codeSystemVersionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass valueSetConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass valueSetVersionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass valueSetCodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass valueSetContextBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass usageContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass valueSetConstraintsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass nullValueSetConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EEnum bindingKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EEnum valueSetTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EEnum statusKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EEnum extensibilityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EEnum guidanceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EEnum valueSetBindingEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.mdht.uml.term.core.profile.TermPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TermPackageImpl() {
		super(eNS_URI, TermFactory.eINSTANCE);
	}

	/**
	 * Creates the meta-model objects for the package. This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) {
			return;
		}
		isCreated = true;

		// Create classes and their features
		cdEClass = createEClass(CD);
		createEReference(cdEClass, CD__QUALIFIER);
		createEReference(cdEClass, CD__TRANSLATION);
		createEAttribute(cdEClass, CD__CODE);
		createEAttribute(cdEClass, CD__CODE_SYSTEM);
		createEAttribute(cdEClass, CD__CODE_SYSTEM_NAME);
		createEAttribute(cdEClass, CD__CODE_SYSTEM_VERSION);
		createEAttribute(cdEClass, CD__DISPLAY_NAME);

		crEClass = createEClass(CR);
		createEReference(crEClass, CR__NAME);
		createEReference(crEClass, CR__VALUE);
		createEAttribute(crEClass, CR__INVERTED);

		conceptDomainConstraintEClass = createEClass(CONCEPT_DOMAIN_CONSTRAINT);
		createEReference(conceptDomainConstraintEClass, CONCEPT_DOMAIN_CONSTRAINT__REFERENCE);
		createEAttribute(conceptDomainConstraintEClass, CONCEPT_DOMAIN_CONSTRAINT__IDENTIFIER);
		createEAttribute(conceptDomainConstraintEClass, CONCEPT_DOMAIN_CONSTRAINT__NAME);
		createEReference(conceptDomainConstraintEClass, CONCEPT_DOMAIN_CONSTRAINT__BASE_PROPERTY);

		conceptDomainEClass = createEClass(CONCEPT_DOMAIN);
		createEAttribute(conceptDomainEClass, CONCEPT_DOMAIN__IDENTIFIER);
		createEAttribute(conceptDomainEClass, CONCEPT_DOMAIN__FULL_NAME);
		createEAttribute(conceptDomainEClass, CONCEPT_DOMAIN__STATUS);
		createEAttribute(conceptDomainEClass, CONCEPT_DOMAIN__STATUS_DATE);
		createEReference(conceptDomainEClass, CONCEPT_DOMAIN__BASE_CLASS);

		codeSystemConstraintEClass = createEClass(CODE_SYSTEM_CONSTRAINT);
		createEReference(codeSystemConstraintEClass, CODE_SYSTEM_CONSTRAINT__REFERENCE);
		createEAttribute(codeSystemConstraintEClass, CODE_SYSTEM_CONSTRAINT__IDENTIFIER);
		createEAttribute(codeSystemConstraintEClass, CODE_SYSTEM_CONSTRAINT__NAME);
		createEAttribute(codeSystemConstraintEClass, CODE_SYSTEM_CONSTRAINT__VERSION);
		createEAttribute(codeSystemConstraintEClass, CODE_SYSTEM_CONSTRAINT__BINDING);
		createEAttribute(codeSystemConstraintEClass, CODE_SYSTEM_CONSTRAINT__CODE);
		createEAttribute(codeSystemConstraintEClass, CODE_SYSTEM_CONSTRAINT__DISPLAY_NAME);
		createEReference(codeSystemConstraintEClass, CODE_SYSTEM_CONSTRAINT__QUALIFIER);
		createEReference(codeSystemConstraintEClass, CODE_SYSTEM_CONSTRAINT__BASE_PROPERTY);

		codeSystemVersionEClass = createEClass(CODE_SYSTEM_VERSION);
		createEAttribute(codeSystemVersionEClass, CODE_SYSTEM_VERSION__IDENTIFIER);
		createEAttribute(codeSystemVersionEClass, CODE_SYSTEM_VERSION__VERSION);
		createEAttribute(codeSystemVersionEClass, CODE_SYSTEM_VERSION__FULL_NAME);
		createEAttribute(codeSystemVersionEClass, CODE_SYSTEM_VERSION__SOURCE);
		createEAttribute(codeSystemVersionEClass, CODE_SYSTEM_VERSION__URL);
		createEAttribute(codeSystemVersionEClass, CODE_SYSTEM_VERSION__EFFECTIVE_DATE);
		createEAttribute(codeSystemVersionEClass, CODE_SYSTEM_VERSION__RELEASE_DATE);
		createEAttribute(codeSystemVersionEClass, CODE_SYSTEM_VERSION__STATUS);
		createEAttribute(codeSystemVersionEClass, CODE_SYSTEM_VERSION__STATUS_DATE);
		createEReference(codeSystemVersionEClass, CODE_SYSTEM_VERSION__BASE_ENUMERATION);

		valueSetConstraintEClass = createEClass(VALUE_SET_CONSTRAINT);
		createEReference(valueSetConstraintEClass, VALUE_SET_CONSTRAINT__REFERENCE);
		createEAttribute(valueSetConstraintEClass, VALUE_SET_CONSTRAINT__IDENTIFIER);
		createEAttribute(valueSetConstraintEClass, VALUE_SET_CONSTRAINT__NAME);
		createEAttribute(valueSetConstraintEClass, VALUE_SET_CONSTRAINT__VERSION);
		createEAttribute(valueSetConstraintEClass, VALUE_SET_CONSTRAINT__BINDING);
		createEReference(valueSetConstraintEClass, VALUE_SET_CONSTRAINT__BASE_PROPERTY);
		createEAttribute(valueSetConstraintEClass, VALUE_SET_CONSTRAINT__EXTENSIBILITY);
		createEAttribute(valueSetConstraintEClass, VALUE_SET_CONSTRAINT__GUIDANCE);
		createEAttribute(valueSetConstraintEClass, VALUE_SET_CONSTRAINT__URI);

		valueSetVersionEClass = createEClass(VALUE_SET_VERSION);
		createEAttribute(valueSetVersionEClass, VALUE_SET_VERSION__IDENTIFIER);
		createEAttribute(valueSetVersionEClass, VALUE_SET_VERSION__VERSION);
		createEAttribute(valueSetVersionEClass, VALUE_SET_VERSION__FULL_NAME);
		createEAttribute(valueSetVersionEClass, VALUE_SET_VERSION__SOURCE);
		createEAttribute(valueSetVersionEClass, VALUE_SET_VERSION__URL);
		createEAttribute(valueSetVersionEClass, VALUE_SET_VERSION__DEFINITION);
		createEAttribute(valueSetVersionEClass, VALUE_SET_VERSION__EFFECTIVE_DATE);
		createEAttribute(valueSetVersionEClass, VALUE_SET_VERSION__EXPIRATION_DATE);
		createEAttribute(valueSetVersionEClass, VALUE_SET_VERSION__RELEASE_DATE);
		createEAttribute(valueSetVersionEClass, VALUE_SET_VERSION__REVISION_DATE);
		createEAttribute(valueSetVersionEClass, VALUE_SET_VERSION__STATUS);
		createEAttribute(valueSetVersionEClass, VALUE_SET_VERSION__STATUS_DATE);
		createEAttribute(valueSetVersionEClass, VALUE_SET_VERSION__TYPE);
		createEAttribute(valueSetVersionEClass, VALUE_SET_VERSION__BINDING);
		createEReference(valueSetVersionEClass, VALUE_SET_VERSION__CODE_SYSTEM);
		createEReference(valueSetVersionEClass, VALUE_SET_VERSION__BASE_ENUMERATION);

		valueSetCodeEClass = createEClass(VALUE_SET_CODE);
		createEAttribute(valueSetCodeEClass, VALUE_SET_CODE__CONCEPT_NAME);
		createEAttribute(valueSetCodeEClass, VALUE_SET_CODE__USAGE_NOTE);
		createEReference(valueSetCodeEClass, VALUE_SET_CODE__CODE_SYSTEM);
		createEReference(valueSetCodeEClass, VALUE_SET_CODE__BASE_ENUMERATION_LITERAL);

		valueSetContextBindingEClass = createEClass(VALUE_SET_CONTEXT_BINDING);
		createEAttribute(valueSetContextBindingEClass, VALUE_SET_CONTEXT_BINDING__EFFECTIVE_DATE);
		createEReference(valueSetContextBindingEClass, VALUE_SET_CONTEXT_BINDING__CONCEPT_DOMAIN);
		createEReference(valueSetContextBindingEClass, VALUE_SET_CONTEXT_BINDING__VALUE_SET);
		createEReference(valueSetContextBindingEClass, VALUE_SET_CONTEXT_BINDING__USAGE_CONTEXT);
		createEReference(valueSetContextBindingEClass, VALUE_SET_CONTEXT_BINDING__BASE_CLASS);

		usageContextEClass = createEClass(USAGE_CONTEXT);
		createEAttribute(usageContextEClass, USAGE_CONTEXT__IDENTIFIER);
		createEAttribute(usageContextEClass, USAGE_CONTEXT__STATUS);
		createEAttribute(usageContextEClass, USAGE_CONTEXT__STATUS_DATE);
		createEReference(usageContextEClass, USAGE_CONTEXT__BASE_CLASS);

		valueSetConstraintsEClass = createEClass(VALUE_SET_CONSTRAINTS);
		createEReference(valueSetConstraintsEClass, VALUE_SET_CONSTRAINTS__BASE_PROPERTY);
		createEReference(valueSetConstraintsEClass, VALUE_SET_CONSTRAINTS__VALUE_SET_CONSTRAINT);

		nullValueSetConstraintEClass = createEClass(NULL_VALUE_SET_CONSTRAINT);
		createEReference(nullValueSetConstraintEClass, NULL_VALUE_SET_CONSTRAINT__REFERENCE);
		createEAttribute(nullValueSetConstraintEClass, NULL_VALUE_SET_CONSTRAINT__IDENTIFIER);
		createEAttribute(nullValueSetConstraintEClass, NULL_VALUE_SET_CONSTRAINT__NAME);
		createEAttribute(nullValueSetConstraintEClass, NULL_VALUE_SET_CONSTRAINT__VERSION);
		createEAttribute(nullValueSetConstraintEClass, NULL_VALUE_SET_CONSTRAINT__BINDING);
		createEReference(nullValueSetConstraintEClass, NULL_VALUE_SET_CONSTRAINT__BASE_PROPERTY);

		// Create enums
		bindingKindEEnum = createEEnum(BINDING_KIND);
		valueSetTypeEEnum = createEEnum(VALUE_SET_TYPE);
		statusKindEEnum = createEEnum(STATUS_KIND);
		extensibilityEEnum = createEEnum(EXTENSIBILITY);
		guidanceEEnum = createEEnum(GUIDANCE);
		valueSetBindingEEnum = createEEnum(VALUE_SET_BINDING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EEnum getBindingKind() {
		return bindingKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EClass getCD() {
		return cdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute getCD_Code() {
		return (EAttribute) cdEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute getCD_CodeSystem() {
		return (EAttribute) cdEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute getCD_CodeSystemName() {
		return (EAttribute) cdEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute getCD_CodeSystemVersion() {
		return (EAttribute) cdEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute getCD_DisplayName() {
		return (EAttribute) cdEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EReference getCD_Qualifier() {
		return (EReference) cdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EReference getCD_Translation() {
		return (EReference) cdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EClass getCodeSystemConstraint() {
		return codeSystemConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EReference getCodeSystemConstraint_Base_Property() {
		return (EReference) codeSystemConstraintEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute getCodeSystemConstraint_Binding() {
		return (EAttribute) codeSystemConstraintEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute getCodeSystemConstraint_Code() {
		return (EAttribute) codeSystemConstraintEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute getCodeSystemConstraint_DisplayName() {
		return (EAttribute) codeSystemConstraintEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute getCodeSystemConstraint_Identifier() {
		return (EAttribute) codeSystemConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute getCodeSystemConstraint_Name() {
		return (EAttribute) codeSystemConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EReference getCodeSystemConstraint_Qualifier() {
		return (EReference) codeSystemConstraintEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EReference getCodeSystemConstraint_Reference() {
		return (EReference) codeSystemConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute getCodeSystemConstraint_Version() {
		return (EAttribute) codeSystemConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EClass getCodeSystemVersion() {
		return codeSystemVersionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EReference getCodeSystemVersion_Base_Enumeration() {
		return (EReference) codeSystemVersionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute getCodeSystemVersion_EffectiveDate() {
		return (EAttribute) codeSystemVersionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute getCodeSystemVersion_FullName() {
		return (EAttribute) codeSystemVersionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute getCodeSystemVersion_Identifier() {
		return (EAttribute) codeSystemVersionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute getCodeSystemVersion_ReleaseDate() {
		return (EAttribute) codeSystemVersionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute getCodeSystemVersion_Source() {
		return (EAttribute) codeSystemVersionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute getCodeSystemVersion_Status() {
		return (EAttribute) codeSystemVersionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute getCodeSystemVersion_StatusDate() {
		return (EAttribute) codeSystemVersionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute getCodeSystemVersion_Url() {
		return (EAttribute) codeSystemVersionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute getCodeSystemVersion_Version() {
		return (EAttribute) codeSystemVersionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EClass getConceptDomain() {
		return conceptDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EReference getConceptDomain_Base_Class() {
		return (EReference) conceptDomainEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute getConceptDomain_FullName() {
		return (EAttribute) conceptDomainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute getConceptDomain_Identifier() {
		return (EAttribute) conceptDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute getConceptDomain_Status() {
		return (EAttribute) conceptDomainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute getConceptDomain_StatusDate() {
		return (EAttribute) conceptDomainEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EClass getConceptDomainConstraint() {
		return conceptDomainConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EReference getConceptDomainConstraint_Base_Property() {
		return (EReference) conceptDomainConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute getConceptDomainConstraint_Identifier() {
		return (EAttribute) conceptDomainConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute getConceptDomainConstraint_Name() {
		return (EAttribute) conceptDomainConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EReference getConceptDomainConstraint_Reference() {
		return (EReference) conceptDomainConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EClass getCR() {
		return crEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute getCR_Inverted() {
		return (EAttribute) crEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EReference getCR_Name() {
		return (EReference) crEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EReference getCR_Value() {
		return (EReference) crEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EEnum getStatusKind() {
		return statusKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EEnum getExtensibility() {
		return extensibilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EEnum getGuidance() {
		return guidanceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EEnum getValueSetBinding() {
		return valueSetBindingEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public TermFactory getTermFactory() {
		return (TermFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EClass getUsageContext() {
		return usageContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EReference getUsageContext_Base_Class() {
		return (EReference) usageContextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EClass getValueSetConstraints() {
		return valueSetConstraintsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EReference getValueSetConstraints_Base_Property() {
		return (EReference) valueSetConstraintsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EReference getValueSetConstraints_ValueSetConstraint() {
		return (EReference) valueSetConstraintsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EClass getNullValueSetConstraint() {
		return nullValueSetConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EReference getNullValueSetConstraint_Reference() {
		return (EReference) nullValueSetConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute getNullValueSetConstraint_Identifier() {
		return (EAttribute) nullValueSetConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute getNullValueSetConstraint_Name() {
		return (EAttribute) nullValueSetConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute getNullValueSetConstraint_Version() {
		return (EAttribute) nullValueSetConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute getNullValueSetConstraint_Binding() {
		return (EAttribute) nullValueSetConstraintEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EReference getNullValueSetConstraint_Base_Property() {
		return (EReference) nullValueSetConstraintEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute getUsageContext_Identifier() {
		return (EAttribute) usageContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute getUsageContext_Status() {
		return (EAttribute) usageContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute getUsageContext_StatusDate() {
		return (EAttribute) usageContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EClass getValueSetCode() {
		return valueSetCodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EReference getValueSetCode_Base_EnumerationLiteral() {
		return (EReference) valueSetCodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EReference getValueSetCode_CodeSystem() {
		return (EReference) valueSetCodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute getValueSetCode_ConceptName() {
		return (EAttribute) valueSetCodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute getValueSetCode_UsageNote() {
		return (EAttribute) valueSetCodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EClass getValueSetConstraint() {
		return valueSetConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EReference getValueSetConstraint_Base_Property() {
		return (EReference) valueSetConstraintEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute getValueSetConstraint_Extensibility() {
		return (EAttribute) valueSetConstraintEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute getValueSetConstraint_Guidance() {
		return (EAttribute) valueSetConstraintEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute getValueSetConstraint_Uri() {
		return (EAttribute) valueSetConstraintEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute getValueSetConstraint_Binding() {
		return (EAttribute) valueSetConstraintEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute getValueSetConstraint_Identifier() {
		return (EAttribute) valueSetConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute getValueSetConstraint_Name() {
		return (EAttribute) valueSetConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EReference getValueSetConstraint_Reference() {
		return (EReference) valueSetConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute getValueSetConstraint_Version() {
		return (EAttribute) valueSetConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EClass getValueSetContextBinding() {
		return valueSetContextBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EReference getValueSetContextBinding_Base_Class() {
		return (EReference) valueSetContextBindingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EReference getValueSetContextBinding_ConceptDomain() {
		return (EReference) valueSetContextBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute getValueSetContextBinding_EffectiveDate() {
		return (EAttribute) valueSetContextBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EReference getValueSetContextBinding_UsageContext() {
		return (EReference) valueSetContextBindingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EReference getValueSetContextBinding_ValueSet() {
		return (EReference) valueSetContextBindingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EEnum getValueSetType() {
		return valueSetTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EClass getValueSetVersion() {
		return valueSetVersionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EReference getValueSetVersion_Base_Enumeration() {
		return (EReference) valueSetVersionEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute getValueSetVersion_Binding() {
		return (EAttribute) valueSetVersionEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EReference getValueSetVersion_CodeSystem() {
		return (EReference) valueSetVersionEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute getValueSetVersion_Definition() {
		return (EAttribute) valueSetVersionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute getValueSetVersion_EffectiveDate() {
		return (EAttribute) valueSetVersionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute getValueSetVersion_ExpirationDate() {
		return (EAttribute) valueSetVersionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute getValueSetVersion_FullName() {
		return (EAttribute) valueSetVersionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute getValueSetVersion_Identifier() {
		return (EAttribute) valueSetVersionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute getValueSetVersion_ReleaseDate() {
		return (EAttribute) valueSetVersionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute getValueSetVersion_RevisionDate() {
		return (EAttribute) valueSetVersionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute getValueSetVersion_Source() {
		return (EAttribute) valueSetVersionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute getValueSetVersion_Status() {
		return (EAttribute) valueSetVersionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute getValueSetVersion_StatusDate() {
		return (EAttribute) valueSetVersionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute getValueSetVersion_Type() {
		return (EAttribute) valueSetVersionEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute getValueSetVersion_Url() {
		return (EAttribute) valueSetVersionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public EAttribute getValueSetVersion_Version() {
		return (EAttribute) valueSetVersionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) {
			return;
		}
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TypesPackage theTypesPackage = (TypesPackage) EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		UMLPackage theUMLPackage = (UMLPackage) EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(
			cdEClass, org.eclipse.mdht.uml.term.core.profile.CD.class, "CD", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getCD_Qualifier(), this.getCR(), null, "qualifier", null, 0, -1,
			org.eclipse.mdht.uml.term.core.profile.CD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(
			getCD_Translation(), this.getCD(), null, "translation", null, 0, -1,
			org.eclipse.mdht.uml.term.core.profile.CD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
			!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getCD_Code(), theTypesPackage.getString(), "code", null, 0, 1,
			org.eclipse.mdht.uml.term.core.profile.CD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
			!IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getCD_CodeSystem(), theTypesPackage.getString(), "codeSystem", null, 0, 1,
			org.eclipse.mdht.uml.term.core.profile.CD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
			!IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getCD_CodeSystemName(), theTypesPackage.getString(), "codeSystemName", null, 0, 1,
			org.eclipse.mdht.uml.term.core.profile.CD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
			!IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getCD_CodeSystemVersion(), theTypesPackage.getString(), "codeSystemVersion", null, 0, 1,
			org.eclipse.mdht.uml.term.core.profile.CD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
			!IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getCD_DisplayName(), theTypesPackage.getString(), "displayName", null, 0, 1,
			org.eclipse.mdht.uml.term.core.profile.CD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
			!IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(
			crEClass, org.eclipse.mdht.uml.term.core.profile.CR.class, "CR", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getCR_Name(), this.getCD(), null, "name", null, 0, 1, org.eclipse.mdht.uml.term.core.profile.CR.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, !IS_ORDERED);
		initEReference(
			getCR_Value(), this.getCD(), null, "value", null, 0, 1, org.eclipse.mdht.uml.term.core.profile.CR.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getCR_Inverted(), theTypesPackage.getBoolean(), "inverted", null, 0, 1,
			org.eclipse.mdht.uml.term.core.profile.CR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
			!IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(
			conceptDomainConstraintEClass, ConceptDomainConstraint.class, "ConceptDomainConstraint", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getConceptDomainConstraint_Reference(), this.getConceptDomain(), null, "reference", null, 0, 1,
			ConceptDomainConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
			IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getConceptDomainConstraint_Identifier(), theTypesPackage.getString(), "identifier", null, 0, 1,
			ConceptDomainConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
			IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getConceptDomainConstraint_Name(), theTypesPackage.getString(), "name", null, 0, 1,
			ConceptDomainConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
			IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(
			getConceptDomainConstraint_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 1, 1,
			ConceptDomainConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
			IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(
			conceptDomainEClass, ConceptDomain.class, "ConceptDomain", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getConceptDomain_Identifier(), theTypesPackage.getString(), "identifier", null, 0, 1, ConceptDomain.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getConceptDomain_FullName(), theTypesPackage.getString(), "fullName", null, 0, 1, ConceptDomain.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getConceptDomain_Status(), this.getStatusKind(), "status", null, 0, 1, ConceptDomain.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getConceptDomain_StatusDate(), theTypesPackage.getString(), "statusDate", null, 0, 1, ConceptDomain.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(
			getConceptDomain_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1,
			ConceptDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(
			codeSystemConstraintEClass, CodeSystemConstraint.class, "CodeSystemConstraint", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getCodeSystemConstraint_Reference(), this.getCodeSystemVersion(), null, "reference", null, 0, 1,
			CodeSystemConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getCodeSystemConstraint_Identifier(), theTypesPackage.getString(), "identifier", null, 0, 1,
			CodeSystemConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getCodeSystemConstraint_Name(), theTypesPackage.getString(), "name", null, 0, 1, CodeSystemConstraint.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getCodeSystemConstraint_Version(), theTypesPackage.getString(), "version", null, 0, 1,
			CodeSystemConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getCodeSystemConstraint_Binding(), this.getBindingKind(), "binding", null, 0, 1, CodeSystemConstraint.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getCodeSystemConstraint_Code(), theTypesPackage.getString(), "code", null, 0, 1, CodeSystemConstraint.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getCodeSystemConstraint_DisplayName(), theTypesPackage.getString(), "displayName", null, 0, 1,
			CodeSystemConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, !IS_ORDERED);
		initEReference(
			getCodeSystemConstraint_Qualifier(), this.getCR(), null, "qualifier", null, 0, -1,
			CodeSystemConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(
			getCodeSystemConstraint_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 1, 1,
			CodeSystemConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(
			codeSystemVersionEClass, CodeSystemVersion.class, "CodeSystemVersion", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getCodeSystemVersion_Identifier(), theTypesPackage.getString(), "identifier", null, 0, 1,
			CodeSystemVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getCodeSystemVersion_Version(), theTypesPackage.getString(), "version", null, 0, 1, CodeSystemVersion.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getCodeSystemVersion_FullName(), theTypesPackage.getString(), "fullName", null, 0, 1,
			CodeSystemVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getCodeSystemVersion_Source(), theTypesPackage.getString(), "source", null, 0, 1, CodeSystemVersion.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getCodeSystemVersion_Url(), theTypesPackage.getString(), "url", null, 0, 1, CodeSystemVersion.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getCodeSystemVersion_EffectiveDate(), theTypesPackage.getString(), "effectiveDate", null, 0, 1,
			CodeSystemVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getCodeSystemVersion_ReleaseDate(), theTypesPackage.getString(), "releaseDate", null, 0, 1,
			CodeSystemVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getCodeSystemVersion_Status(), this.getStatusKind(), "status", null, 0, 1, CodeSystemVersion.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getCodeSystemVersion_StatusDate(), theTypesPackage.getString(), "statusDate", null, 0, 1,
			CodeSystemVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, !IS_ORDERED);
		initEReference(
			getCodeSystemVersion_Base_Enumeration(), theUMLPackage.getEnumeration(), null, "base_Enumeration", null, 1,
			1, CodeSystemVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		addEOperation(
			codeSystemVersionEClass, theTypesPackage.getString(), "getEnumerationName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		EOperation op = addEOperation(
			codeSystemVersionEClass, null, "setEnumerationName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(
			codeSystemVersionEClass, theTypesPackage.getString(), "getEnumerationQualifiedName", 1, 1, IS_UNIQUE,
			!IS_ORDERED);

		initEClass(
			valueSetConstraintEClass, ValueSetConstraint.class, "ValueSetConstraint", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getValueSetConstraint_Reference(), this.getValueSetVersion(), null, "reference", null, 0, 1,
			ValueSetConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getValueSetConstraint_Identifier(), theTypesPackage.getString(), "identifier", null, 0, 1,
			ValueSetConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getValueSetConstraint_Name(), theTypesPackage.getString(), "name", null, 0, 1, ValueSetConstraint.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getValueSetConstraint_Version(), theTypesPackage.getString(), "version", null, 0, 1,
			ValueSetConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getValueSetConstraint_Binding(), this.getBindingKind(), "binding", null, 0, 1, ValueSetConstraint.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(
			getValueSetConstraint_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 1, 1,
			ValueSetConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getValueSetConstraint_Extensibility(), this.getExtensibility(), "extensibility", null, 0, 1,
			ValueSetConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getValueSetConstraint_Guidance(), this.getGuidance(), "guidance", null, 0, 1, ValueSetConstraint.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getValueSetConstraint_Uri(), theTypesPackage.getString(), "uri", null, 0, 1, ValueSetConstraint.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(
			valueSetVersionEClass, ValueSetVersion.class, "ValueSetVersion", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getValueSetVersion_Identifier(), theTypesPackage.getString(), "identifier", null, 0, 1,
			ValueSetVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getValueSetVersion_Version(), theTypesPackage.getString(), "version", null, 0, 1, ValueSetVersion.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getValueSetVersion_FullName(), theTypesPackage.getString(), "fullName", null, 0, 1, ValueSetVersion.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getValueSetVersion_Source(), theTypesPackage.getString(), "source", null, 0, 1, ValueSetVersion.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getValueSetVersion_Url(), theTypesPackage.getString(), "url", null, 0, 1, ValueSetVersion.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getValueSetVersion_Definition(), theTypesPackage.getString(), "definition", null, 0, 1,
			ValueSetVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getValueSetVersion_EffectiveDate(), theTypesPackage.getString(), "effectiveDate", null, 0, 1,
			ValueSetVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getValueSetVersion_ExpirationDate(), theTypesPackage.getString(), "expirationDate", null, 0, 1,
			ValueSetVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getValueSetVersion_ReleaseDate(), theTypesPackage.getString(), "releaseDate", null, 0, 1,
			ValueSetVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getValueSetVersion_RevisionDate(), theTypesPackage.getString(), "revisionDate", null, 0, 1,
			ValueSetVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getValueSetVersion_Status(), this.getStatusKind(), "status", null, 0, 1, ValueSetVersion.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getValueSetVersion_StatusDate(), theTypesPackage.getString(), "statusDate", null, 0, 1,
			ValueSetVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getValueSetVersion_Type(), this.getValueSetType(), "type", null, 0, 1, ValueSetVersion.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getValueSetVersion_Binding(), this.getBindingKind(), "binding", null, 0, 1, ValueSetVersion.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(
			getValueSetVersion_CodeSystem(), this.getCodeSystemVersion(), null, "codeSystem", null, 0, 1,
			ValueSetVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(
			getValueSetVersion_Base_Enumeration(), theUMLPackage.getEnumeration(), null, "base_Enumeration", null, 1, 1,
			ValueSetVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		addEOperation(
			valueSetVersionEClass, theTypesPackage.getString(), "getEnumerationName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(valueSetVersionEClass, null, "setEnumerationName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(
			valueSetVersionEClass, theTypesPackage.getString(), "getEnumerationQualifiedName", 1, 1, IS_UNIQUE,
			!IS_ORDERED);

		initEClass(
			valueSetCodeEClass, ValueSetCode.class, "ValueSetCode", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getValueSetCode_ConceptName(), theTypesPackage.getString(), "conceptName", null, 0, 1, ValueSetCode.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getValueSetCode_UsageNote(), theTypesPackage.getString(), "usageNote", null, 0, 1, ValueSetCode.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(
			getValueSetCode_CodeSystem(), this.getCodeSystemVersion(), null, "codeSystem", null, 0, 1,
			ValueSetCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(
			getValueSetCode_Base_EnumerationLiteral(), theUMLPackage.getEnumerationLiteral(), null,
			"base_EnumerationLiteral", null, 1, 1, ValueSetCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
			!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(
			valueSetContextBindingEClass, ValueSetContextBinding.class, "ValueSetContextBinding", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getValueSetContextBinding_EffectiveDate(), theTypesPackage.getString(), "effectiveDate", null, 0, 1,
			ValueSetContextBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, !IS_ORDERED);
		initEReference(
			getValueSetContextBinding_ConceptDomain(), this.getConceptDomain(), null, "conceptDomain", null, 1, 1,
			ValueSetContextBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(
			getValueSetContextBinding_ValueSet(), this.getValueSetVersion(), null, "valueSet", null, 1, 1,
			ValueSetContextBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(
			getValueSetContextBinding_UsageContext(), this.getUsageContext(), null, "usageContext", null, 1, 1,
			ValueSetContextBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(
			getValueSetContextBinding_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1,
			ValueSetContextBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(
			usageContextEClass, UsageContext.class, "UsageContext", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(
			getUsageContext_Identifier(), theTypesPackage.getString(), "identifier", null, 0, 1, UsageContext.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getUsageContext_Status(), this.getStatusKind(), "status", null, 0, 1, UsageContext.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getUsageContext_StatusDate(), theTypesPackage.getString(), "statusDate", null, 0, 1, UsageContext.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(
			getUsageContext_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, UsageContext.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, !IS_ORDERED);

		initEClass(
			valueSetConstraintsEClass, ValueSetConstraints.class, "ValueSetConstraints", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getValueSetConstraints_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 1, 1,
			ValueSetConstraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(
			getValueSetConstraints_ValueSetConstraint(), this.getValueSetConstraint(), null, "valueSetConstraint", null,
			0, -1, ValueSetConstraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
			IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(
			nullValueSetConstraintEClass, NullValueSetConstraint.class, "NullValueSetConstraint", !IS_ABSTRACT,
			!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(
			getNullValueSetConstraint_Reference(), this.getValueSetVersion(), null, "reference", null, 0, 1,
			NullValueSetConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getNullValueSetConstraint_Identifier(), theTypesPackage.getString(), "identifier", null, 0, 1,
			NullValueSetConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getNullValueSetConstraint_Name(), theTypesPackage.getString(), "name", null, 0, 1,
			NullValueSetConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getNullValueSetConstraint_Version(), theTypesPackage.getString(), "version", null, 0, 1,
			NullValueSetConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, !IS_ORDERED);
		initEAttribute(
			getNullValueSetConstraint_Binding(), this.getBindingKind(), "binding", null, 0, 1,
			NullValueSetConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
			!IS_DERIVED, !IS_ORDERED);
		initEReference(
			getNullValueSetConstraint_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 1, 1,
			NullValueSetConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(bindingKindEEnum, BindingKind.class, "BindingKind");
		addEEnumLiteral(bindingKindEEnum, BindingKind.STATIC);
		addEEnumLiteral(bindingKindEEnum, BindingKind.DYNAMIC);

		initEEnum(valueSetTypeEEnum, ValueSetType.class, "ValueSetType");
		addEEnumLiteral(valueSetTypeEEnum, ValueSetType.EXTENSIONAL);
		addEEnumLiteral(valueSetTypeEEnum, ValueSetType.INTENSIONAL);

		initEEnum(statusKindEEnum, StatusKind.class, "StatusKind");
		addEEnumLiteral(statusKindEEnum, StatusKind.ACTIVE);
		addEEnumLiteral(statusKindEEnum, StatusKind.INACTIVE);

		initEEnum(extensibilityEEnum, Extensibility.class, "Extensibility");
		addEEnumLiteral(extensibilityEEnum, Extensibility.NEA);
		addEEnumLiteral(extensibilityEEnum, Extensibility.CEA);

		initEEnum(guidanceEEnum, Guidance.class, "Guidance");
		addEEnumLiteral(guidanceEEnum, Guidance.FIXED);
		addEEnumLiteral(guidanceEEnum, Guidance.CLOSED);
		addEEnumLiteral(guidanceEEnum, Guidance.EXTEND);
		addEEnumLiteral(guidanceEEnum, Guidance.RESTRICT);
		addEEnumLiteral(guidanceEEnum, Guidance.OPEN);

		initEEnum(valueSetBindingEEnum, ValueSetBinding.class, "ValueSetBinding");
		addEEnumLiteral(valueSetBindingEEnum, ValueSetBinding.DIRECT);
		addEEnumLiteral(valueSetBindingEEnum, ValueSetBinding.INDIRECT);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";
		addAnnotation(this, source, new String[] { "originalName", "Terminology" });
		addAnnotation(guidanceEEnum, source, new String[] { "originalName", "Guidance " });
	}

} // TermPackageImpl
