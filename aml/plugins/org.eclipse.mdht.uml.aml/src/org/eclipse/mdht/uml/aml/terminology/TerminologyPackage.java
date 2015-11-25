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
package org.eclipse.mdht.uml.aml.terminology;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.aml.terminology.TerminologyFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='TerminologyProfile'"
 * @generated
 */
public interface TerminologyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "terminology";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.omg.org/spec/AML/20150501/TerminologyProfile.xmi";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "terminology";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TerminologyPackage eINSTANCE = org.eclipse.mdht.uml.aml.terminology.impl.TerminologyPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.aml.terminology.impl.IdentifiedItemImpl <em>Identified Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.aml.terminology.impl.IdentifiedItemImpl
	 * @see org.eclipse.mdht.uml.aml.terminology.impl.TerminologyPackageImpl#getIdentifiedItem()
	 * @generated
	 */
	int IDENTIFIED_ITEM = 0;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ITEM__BASE_NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ITEM__ID = 1;

	/**
	 * The number of structural features of the '<em>Identified Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ITEM_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Validate Unique Scopes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ITEM___VALIDATE_UNIQUE_SCOPES__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Identified Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ITEM_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.aml.terminology.impl.PermissibleValueImpl <em>Permissible Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.aml.terminology.impl.PermissibleValueImpl
	 * @see org.eclipse.mdht.uml.aml.terminology.impl.TerminologyPackageImpl#getPermissibleValue()
	 * @generated
	 */
	int PERMISSIBLE_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSIBLE_VALUE__BASE_NAMED_ELEMENT = IDENTIFIED_ITEM__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSIBLE_VALUE__ID = IDENTIFIED_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Base Enumeration Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSIBLE_VALUE__BASE_ENUMERATION_LITERAL = IDENTIFIED_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Meaning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSIBLE_VALUE__MEANING = IDENTIFIED_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Permissible Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSIBLE_VALUE_FEATURE_COUNT = IDENTIFIED_ITEM_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Validate Unique Scopes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSIBLE_VALUE___VALIDATE_UNIQUE_SCOPES__DIAGNOSTICCHAIN_MAP = IDENTIFIED_ITEM___VALIDATE_UNIQUE_SCOPES__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Must Be Concept Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSIBLE_VALUE___VALIDATE_MUST_BE_CONCEPT_REFERENCE__DIAGNOSTICCHAIN_MAP = IDENTIFIED_ITEM_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Permissible Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSIBLE_VALUE_OPERATION_COUNT = IDENTIFIED_ITEM_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.aml.terminology.impl.ScopedIdentifierImpl <em>Scoped Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.aml.terminology.impl.ScopedIdentifierImpl
	 * @see org.eclipse.mdht.uml.aml.terminology.impl.TerminologyPackageImpl#getScopedIdentifier()
	 * @generated
	 */
	int SCOPED_IDENTIFIER = 2;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPED_IDENTIFIER__URI = 0;

	/**
	 * The feature id for the '<em><b>Identifier URI Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPED_IDENTIFIER__IDENTIFIER_URI_PATTERN = 1;

	/**
	 * The feature id for the '<em><b>Base Enumeration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPED_IDENTIFIER__BASE_ENUMERATION = 2;

	/**
	 * The number of structural features of the '<em>Scoped Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPED_IDENTIFIER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Scoped Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPED_IDENTIFIER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.aml.terminology.impl.EnumeratedValueDomainImpl <em>Enumerated Value Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.aml.terminology.impl.EnumeratedValueDomainImpl
	 * @see org.eclipse.mdht.uml.aml.terminology.impl.TerminologyPackageImpl#getEnumeratedValueDomain()
	 * @generated
	 */
	int ENUMERATED_VALUE_DOMAIN = 3;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_VALUE_DOMAIN__BASE_NAMED_ELEMENT = IDENTIFIED_ITEM__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_VALUE_DOMAIN__ID = IDENTIFIED_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Base Enumeration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_VALUE_DOMAIN__BASE_ENUMERATION = IDENTIFIED_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Set Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_VALUE_DOMAIN__VALUE_SET_BINDING = IDENTIFIED_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enumerated Value Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_VALUE_DOMAIN_FEATURE_COUNT = IDENTIFIED_ITEM_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Validate Unique Scopes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_VALUE_DOMAIN___VALIDATE_UNIQUE_SCOPES__DIAGNOSTICCHAIN_MAP = IDENTIFIED_ITEM___VALIDATE_UNIQUE_SCOPES__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Permissible Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_VALUE_DOMAIN___VALIDATE_PERMISSIBLE_VALUES__DIAGNOSTICCHAIN_MAP = IDENTIFIED_ITEM_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate Binding Is Value Set Or Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_VALUE_DOMAIN___VALIDATE_BINDING_IS_VALUE_SET_OR_DEFINITION__DIAGNOSTICCHAIN_MAP = IDENTIFIED_ITEM_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enumerated Value Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_VALUE_DOMAIN_OPERATION_COUNT = IDENTIFIED_ITEM_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.aml.terminology.impl.ResourceReferenceImpl <em>Resource Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.aml.terminology.impl.ResourceReferenceImpl
	 * @see org.eclipse.mdht.uml.aml.terminology.impl.TerminologyPackageImpl#getResourceReference()
	 * @generated
	 */
	int RESOURCE_REFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REFERENCE__URI = 0;

	/**
	 * The feature id for the '<em><b>Base Enumeration Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REFERENCE__BASE_ENUMERATION_LITERAL = 1;

	/**
	 * The number of structural features of the '<em>Resource Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REFERENCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Resource Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.aml.terminology.impl.CodeSystemReferenceImpl <em>Code System Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.aml.terminology.impl.CodeSystemReferenceImpl
	 * @see org.eclipse.mdht.uml.aml.terminology.impl.TerminologyPackageImpl#getCodeSystemReference()
	 * @generated
	 */
	int CODE_SYSTEM_REFERENCE = 5;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_REFERENCE__URI = RESOURCE_REFERENCE__URI;

	/**
	 * The feature id for the '<em><b>Base Enumeration Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_REFERENCE__BASE_ENUMERATION_LITERAL = RESOURCE_REFERENCE__BASE_ENUMERATION_LITERAL;

	/**
	 * The number of structural features of the '<em>Code System Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_REFERENCE_FEATURE_COUNT = RESOURCE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code System Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_REFERENCE_OPERATION_COUNT = RESOURCE_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.aml.terminology.impl.CodeSystemVersionReferenceImpl <em>Code System Version Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.aml.terminology.impl.CodeSystemVersionReferenceImpl
	 * @see org.eclipse.mdht.uml.aml.terminology.impl.TerminologyPackageImpl#getCodeSystemVersionReference()
	 * @generated
	 */
	int CODE_SYSTEM_VERSION_REFERENCE = 6;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_REFERENCE__URI = RESOURCE_REFERENCE__URI;

	/**
	 * The feature id for the '<em><b>Base Enumeration Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_REFERENCE__BASE_ENUMERATION_LITERAL = RESOURCE_REFERENCE__BASE_ENUMERATION_LITERAL;

	/**
	 * The feature id for the '<em><b>Code System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_REFERENCE__CODE_SYSTEM = RESOURCE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Code System Version Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_REFERENCE_FEATURE_COUNT = RESOURCE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Code System Version Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SYSTEM_VERSION_REFERENCE_OPERATION_COUNT = RESOURCE_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.aml.terminology.impl.ConceptReferenceImpl <em>Concept Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.aml.terminology.impl.ConceptReferenceImpl
	 * @see org.eclipse.mdht.uml.aml.terminology.impl.TerminologyPackageImpl#getConceptReference()
	 * @generated
	 */
	int CONCEPT_REFERENCE = 7;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_REFERENCE__URI = RESOURCE_REFERENCE__URI;

	/**
	 * The feature id for the '<em><b>Base Enumeration Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_REFERENCE__BASE_ENUMERATION_LITERAL = RESOURCE_REFERENCE__BASE_ENUMERATION_LITERAL;

	/**
	 * The feature id for the '<em><b>Designation</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_REFERENCE__DESIGNATION = RESOURCE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Concept Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_REFERENCE_FEATURE_COUNT = RESOURCE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate Must Be Scoped Identifier</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_REFERENCE___VALIDATE_MUST_BE_SCOPED_IDENTIFIER__DIAGNOSTICCHAIN_MAP = RESOURCE_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Concept Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_REFERENCE_OPERATION_COUNT = RESOURCE_REFERENCE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.aml.terminology.impl.ValueSetDefinitionReferenceImpl <em>Value Set Definition Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.aml.terminology.impl.ValueSetDefinitionReferenceImpl
	 * @see org.eclipse.mdht.uml.aml.terminology.impl.TerminologyPackageImpl#getValueSetDefinitionReference()
	 * @generated
	 */
	int VALUE_SET_DEFINITION_REFERENCE = 8;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION_REFERENCE__URI = RESOURCE_REFERENCE__URI;

	/**
	 * The feature id for the '<em><b>Base Enumeration Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION_REFERENCE__BASE_ENUMERATION_LITERAL = RESOURCE_REFERENCE__BASE_ENUMERATION_LITERAL;

	/**
	 * The feature id for the '<em><b>Value Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION_REFERENCE__VALUE_SET = RESOURCE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value Set Definition Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION_REFERENCE_FEATURE_COUNT = RESOURCE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Value Set Definition Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_DEFINITION_REFERENCE_OPERATION_COUNT = RESOURCE_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.aml.terminology.impl.ValueSetReferenceImpl <em>Value Set Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.aml.terminology.impl.ValueSetReferenceImpl
	 * @see org.eclipse.mdht.uml.aml.terminology.impl.TerminologyPackageImpl#getValueSetReference()
	 * @generated
	 */
	int VALUE_SET_REFERENCE = 9;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_REFERENCE__URI = RESOURCE_REFERENCE__URI;

	/**
	 * The feature id for the '<em><b>Base Enumeration Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_REFERENCE__BASE_ENUMERATION_LITERAL = RESOURCE_REFERENCE__BASE_ENUMERATION_LITERAL;

	/**
	 * The feature id for the '<em><b>Value Set Definition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_REFERENCE__VALUE_SET_DEFINITION = RESOURCE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value Set Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_REFERENCE_FEATURE_COUNT = RESOURCE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_REFERENCE___VALIDATE_DEFINITION__DIAGNOSTICCHAIN_MAP = RESOURCE_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Value Set Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_REFERENCE_OPERATION_COUNT = RESOURCE_REFERENCE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.aml.terminology.impl.ArchetypeTermImpl <em>Archetype Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.aml.terminology.impl.ArchetypeTermImpl
	 * @see org.eclipse.mdht.uml.aml.terminology.impl.TerminologyPackageImpl#getArchetypeTerm()
	 * @generated
	 */
	int ARCHETYPE_TERM = 10;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_TERM__BASE_NAMED_ELEMENT = PERMISSIBLE_VALUE__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Id</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_TERM__ID = PERMISSIBLE_VALUE__ID;

	/**
	 * The feature id for the '<em><b>Base Enumeration Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_TERM__BASE_ENUMERATION_LITERAL = PERMISSIBLE_VALUE__BASE_ENUMERATION_LITERAL;

	/**
	 * The feature id for the '<em><b>Meaning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_TERM__MEANING = PERMISSIBLE_VALUE__MEANING;

	/**
	 * The feature id for the '<em><b>Value set members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_TERM__VALUE_SET_MEMBERS = PERMISSIBLE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Term bindings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_TERM__TERM_BINDINGS = PERMISSIBLE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Archetype Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_TERM_FEATURE_COUNT = PERMISSIBLE_VALUE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Validate Unique Scopes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_TERM___VALIDATE_UNIQUE_SCOPES__DIAGNOSTICCHAIN_MAP = PERMISSIBLE_VALUE___VALIDATE_UNIQUE_SCOPES__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Must Be Concept Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_TERM___VALIDATE_MUST_BE_CONCEPT_REFERENCE__DIAGNOSTICCHAIN_MAP = PERMISSIBLE_VALUE___VALIDATE_MUST_BE_CONCEPT_REFERENCE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMVTL Clanguageconsistency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_TERM___VALIDATE_AOMVTL_CLANGUAGECONSISTENCY__DIAGNOSTICCHAIN_MAP = PERMISSIBLE_VALUE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate AOMVTVSI Dvaluesetiddefined</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_TERM___VALIDATE_AOMVTVSI_DVALUESETIDDEFINED__DIAGNOSTICCHAIN_MAP = PERMISSIBLE_VALUE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate AOMVTVSU Qvaluesetmembersunique</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_TERM___VALIDATE_AOMVTVSU_QVALUESETMEMBERSUNIQUE__DIAGNOSTICCHAIN_MAP = PERMISSIBLE_VALUE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Validate AOMVTVSM Dvaluesetmembersdefined</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_TERM___VALIDATE_AOMVTVSM_DVALUESETMEMBERSDEFINED__DIAGNOSTICCHAIN_MAP = PERMISSIBLE_VALUE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Validate AOMARCHETYPETERM Invariantcode Valid Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_TERM___VALIDATE_AOMARCHETYPETERM_INVARIANTCODE_VALID_CODE__DIAGNOSTICCHAIN_MAP = PERMISSIBLE_VALUE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Validate AOMVALUESET Invariant Id Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_TERM___VALIDATE_AOMVALUESET_INVARIANT_ID_VALID__DIAGNOSTICCHAIN_MAP = PERMISSIBLE_VALUE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Validate AOMVALUESET Invariant Members Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_TERM___VALIDATE_AOMVALUESET_INVARIANT_MEMBERS_VALID__DIAGNOSTICCHAIN_MAP = PERMISSIBLE_VALUE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Validate AOMARCHETYPETERMINOLOGY Invariantterm Bindings Validity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_TERM___VALIDATE_AOMARCHETYPETERMINOLOGY_INVARIANTTERM_BINDINGS_VALIDITY__DIAGNOSTICCHAIN_MAP = PERMISSIBLE_VALUE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Validate AOMVETD Fexternaltermvalidity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_TERM___VALIDATE_AOMVETD_FEXTERNALTERMVALIDITY__DIAGNOSTICCHAIN_MAP = PERMISSIBLE_VALUE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Validate AOMVTCB Kterminologyconstraintbindingkeyvalid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_TERM___VALIDATE_AOMVTCB_KTERMINOLOGYCONSTRAINTBINDINGKEYVALID__DIAGNOSTICCHAIN_MAP = PERMISSIBLE_VALUE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Validate AOMVTS Dspecialisationlevelofcodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_TERM___VALIDATE_AOMVTS_DSPECIALISATIONLEVELOFCODES__DIAGNOSTICCHAIN_MAP = PERMISSIBLE_VALUE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Validate AOMVTTB Kterminologytermbindingkeyvalid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_TERM___VALIDATE_AOMVTTB_KTERMINOLOGYTERMBINDINGKEYVALID__DIAGNOSTICCHAIN_MAP = PERMISSIBLE_VALUE_OPERATION_COUNT + 11;

	/**
	 * The number of operations of the '<em>Archetype Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHETYPE_TERM_OPERATION_COUNT = PERMISSIBLE_VALUE_OPERATION_COUNT + 12;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.aml.terminology.impl.TermResourceTranslationImpl <em>Term Resource Translation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.aml.terminology.impl.TermResourceTranslationImpl
	 * @see org.eclipse.mdht.uml.aml.terminology.impl.TerminologyPackageImpl#getTermResourceTranslation()
	 * @generated
	 */
	int TERM_RESOURCE_TRANSLATION = 11;

	/**
	 * The feature id for the '<em><b>Base Enumeration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_RESOURCE_TRANSLATION__BASE_ENUMERATION = 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_RESOURCE_TRANSLATION__LANGUAGE = 1;

	/**
	 * The number of structural features of the '<em>Term Resource Translation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_RESOURCE_TRANSLATION_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Validate Translation Entries</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_RESOURCE_TRANSLATION___VALIDATE_TRANSLATION_ENTRIES__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Term Resource Translation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_RESOURCE_TRANSLATION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.aml.terminology.impl.EntryImpl <em>Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.aml.terminology.impl.EntryImpl
	 * @see org.eclipse.mdht.uml.aml.terminology.impl.TerminologyPackageImpl#getEntry()
	 * @generated
	 */
	int ENTRY = 13;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__TEXT = 0;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__BASE_NAMED_ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Validate AOMARCHETYPETERM Invarianttext Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY___VALIDATE_AOMARCHETYPETERM_INVARIANTTEXT_VALID__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.aml.terminology.impl.IdEntryImpl <em>Id Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.aml.terminology.impl.IdEntryImpl
	 * @see org.eclipse.mdht.uml.aml.terminology.impl.TerminologyPackageImpl#getIdEntry()
	 * @generated
	 */
	int ID_ENTRY = 12;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ENTRY__TEXT = ENTRY__TEXT;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ENTRY__BASE_NAMED_ELEMENT = ENTRY__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ENTRY__REF = ENTRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Enumeration Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ENTRY__BASE_ENUMERATION_LITERAL = ENTRY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Id Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ENTRY_FEATURE_COUNT = ENTRY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Validate AOMARCHETYPETERM Invarianttext Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ENTRY___VALIDATE_AOMARCHETYPETERM_INVARIANTTEXT_VALID__DIAGNOSTICCHAIN_MAP = ENTRY___VALIDATE_AOMARCHETYPETERM_INVARIANTTEXT_VALID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate AOMARCHETYPETERM Invariantdescription Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ENTRY___VALIDATE_AOMARCHETYPETERM_INVARIANTDESCRIPTION_VALID__DIAGNOSTICCHAIN_MAP = ENTRY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Id Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_ENTRY_OPERATION_COUNT = ENTRY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.aml.terminology.impl.DescribedIdentifierImpl <em>Described Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.aml.terminology.impl.DescribedIdentifierImpl
	 * @see org.eclipse.mdht.uml.aml.terminology.impl.TerminologyPackageImpl#getDescribedIdentifier()
	 * @generated
	 */
	int DESCRIBED_IDENTIFIER = 14;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED_IDENTIFIER__URI = SCOPED_IDENTIFIER__URI;

	/**
	 * The feature id for the '<em><b>Identifier URI Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED_IDENTIFIER__IDENTIFIER_URI_PATTERN = SCOPED_IDENTIFIER__IDENTIFIER_URI_PATTERN;

	/**
	 * The feature id for the '<em><b>Base Enumeration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED_IDENTIFIER__BASE_ENUMERATION = SCOPED_IDENTIFIER__BASE_ENUMERATION;

	/**
	 * The feature id for the '<em><b>Defining Code System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED_IDENTIFIER__DEFINING_CODE_SYSTEM = SCOPED_IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Described Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED_IDENTIFIER_FEATURE_COUNT = SCOPED_IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Validate Members Must Be Concept Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED_IDENTIFIER___VALIDATE_MEMBERS_MUST_BE_CONCEPT_REFERENCE__DIAGNOSTICCHAIN_MAP = SCOPED_IDENTIFIER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate Defining Code System</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED_IDENTIFIER___VALIDATE_DEFINING_CODE_SYSTEM__DIAGNOSTICCHAIN_MAP = SCOPED_IDENTIFIER_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Described Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED_IDENTIFIER_OPERATION_COUNT = SCOPED_IDENTIFIER_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.aml.terminology.impl.aboutImpl <em>about</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.aml.terminology.impl.aboutImpl
	 * @see org.eclipse.mdht.uml.aml.terminology.impl.TerminologyPackageImpl#getabout()
	 * @generated
	 */
	int ABOUT = 15;

	/**
	 * The feature id for the '<em><b>Base Abstraction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABOUT__BASE_ABSTRACTION = 0;

	/**
	 * The number of structural features of the '<em>about</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABOUT_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Validate Is Concept Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABOUT___VALIDATE_IS_CONCEPT_REFERENCE__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>about</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABOUT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.aml.terminology.ArchetypeType <em>Archetype Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.aml.terminology.ArchetypeType
	 * @see org.eclipse.mdht.uml.aml.terminology.impl.TerminologyPackageImpl#getArchetypeType()
	 * @generated
	 */
	int ARCHETYPE_TYPE = 16;


	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.aml.terminology.IdentifiedItem <em>Identified Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identified Item</em>'.
	 * @see org.eclipse.mdht.uml.aml.terminology.IdentifiedItem
	 * @generated
	 */
	EClass getIdentifiedItem();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.aml.terminology.IdentifiedItem#getBase_NamedElement <em>Base Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Named Element</em>'.
	 * @see org.eclipse.mdht.uml.aml.terminology.IdentifiedItem#getBase_NamedElement()
	 * @see #getIdentifiedItem()
	 * @generated
	 */
	EReference getIdentifiedItem_Base_NamedElement();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.aml.terminology.IdentifiedItem#getIds <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Id</em>'.
	 * @see org.eclipse.mdht.uml.aml.terminology.IdentifiedItem#getIds()
	 * @see #getIdentifiedItem()
	 * @generated
	 */
	EReference getIdentifiedItem_Id();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.terminology.IdentifiedItem#validateUniqueScopes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Unique Scopes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Unique Scopes</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.terminology.IdentifiedItem#validateUniqueScopes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getIdentifiedItem__ValidateUniqueScopes__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.aml.terminology.PermissibleValue <em>Permissible Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Permissible Value</em>'.
	 * @see org.eclipse.mdht.uml.aml.terminology.PermissibleValue
	 * @generated
	 */
	EClass getPermissibleValue();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.aml.terminology.PermissibleValue#getBase_EnumerationLiteral <em>Base Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Enumeration Literal</em>'.
	 * @see org.eclipse.mdht.uml.aml.terminology.PermissibleValue#getBase_EnumerationLiteral()
	 * @see #getPermissibleValue()
	 * @generated
	 */
	EReference getPermissibleValue_Base_EnumerationLiteral();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.aml.terminology.PermissibleValue#getMeaning <em>Meaning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Meaning</em>'.
	 * @see org.eclipse.mdht.uml.aml.terminology.PermissibleValue#getMeaning()
	 * @see #getPermissibleValue()
	 * @generated
	 */
	EReference getPermissibleValue_Meaning();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.terminology.PermissibleValue#validateMustBeConceptReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Must Be Concept Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Must Be Concept Reference</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.terminology.PermissibleValue#validateMustBeConceptReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPermissibleValue__ValidateMustBeConceptReference__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.aml.terminology.ScopedIdentifier <em>Scoped Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scoped Identifier</em>'.
	 * @see org.eclipse.mdht.uml.aml.terminology.ScopedIdentifier
	 * @generated
	 */
	EClass getScopedIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.aml.terminology.ScopedIdentifier#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org.eclipse.mdht.uml.aml.terminology.ScopedIdentifier#getUri()
	 * @see #getScopedIdentifier()
	 * @generated
	 */
	EAttribute getScopedIdentifier_Uri();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.aml.terminology.ScopedIdentifier#getIdentifierURIPattern <em>Identifier URI Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier URI Pattern</em>'.
	 * @see org.eclipse.mdht.uml.aml.terminology.ScopedIdentifier#getIdentifierURIPattern()
	 * @see #getScopedIdentifier()
	 * @generated
	 */
	EAttribute getScopedIdentifier_IdentifierURIPattern();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.aml.terminology.ScopedIdentifier#getBase_Enumeration <em>Base Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Enumeration</em>'.
	 * @see org.eclipse.mdht.uml.aml.terminology.ScopedIdentifier#getBase_Enumeration()
	 * @see #getScopedIdentifier()
	 * @generated
	 */
	EReference getScopedIdentifier_Base_Enumeration();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.aml.terminology.EnumeratedValueDomain <em>Enumerated Value Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumerated Value Domain</em>'.
	 * @see org.eclipse.mdht.uml.aml.terminology.EnumeratedValueDomain
	 * @generated
	 */
	EClass getEnumeratedValueDomain();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.aml.terminology.EnumeratedValueDomain#getBase_Enumeration <em>Base Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Enumeration</em>'.
	 * @see org.eclipse.mdht.uml.aml.terminology.EnumeratedValueDomain#getBase_Enumeration()
	 * @see #getEnumeratedValueDomain()
	 * @generated
	 */
	EReference getEnumeratedValueDomain_Base_Enumeration();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.aml.terminology.EnumeratedValueDomain#getValueSetBinding <em>Value Set Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Set Binding</em>'.
	 * @see org.eclipse.mdht.uml.aml.terminology.EnumeratedValueDomain#getValueSetBinding()
	 * @see #getEnumeratedValueDomain()
	 * @generated
	 */
	EReference getEnumeratedValueDomain_ValueSetBinding();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.terminology.EnumeratedValueDomain#validatePermissibleValues(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Permissible Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Permissible Values</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.terminology.EnumeratedValueDomain#validatePermissibleValues(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEnumeratedValueDomain__ValidatePermissibleValues__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.terminology.EnumeratedValueDomain#validateBindingIsValueSetOrDefinition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Binding Is Value Set Or Definition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Binding Is Value Set Or Definition</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.terminology.EnumeratedValueDomain#validateBindingIsValueSetOrDefinition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEnumeratedValueDomain__ValidateBindingIsValueSetOrDefinition__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.aml.terminology.ResourceReference <em>Resource Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Reference</em>'.
	 * @see org.eclipse.mdht.uml.aml.terminology.ResourceReference
	 * @generated
	 */
	EClass getResourceReference();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.aml.terminology.ResourceReference#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org.eclipse.mdht.uml.aml.terminology.ResourceReference#getUri()
	 * @see #getResourceReference()
	 * @generated
	 */
	EAttribute getResourceReference_Uri();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.aml.terminology.ResourceReference#getBase_EnumerationLiteral <em>Base Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Enumeration Literal</em>'.
	 * @see org.eclipse.mdht.uml.aml.terminology.ResourceReference#getBase_EnumerationLiteral()
	 * @see #getResourceReference()
	 * @generated
	 */
	EReference getResourceReference_Base_EnumerationLiteral();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.aml.terminology.CodeSystemReference <em>Code System Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code System Reference</em>'.
	 * @see org.eclipse.mdht.uml.aml.terminology.CodeSystemReference
	 * @generated
	 */
	EClass getCodeSystemReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.aml.terminology.CodeSystemVersionReference <em>Code System Version Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code System Version Reference</em>'.
	 * @see org.eclipse.mdht.uml.aml.terminology.CodeSystemVersionReference
	 * @generated
	 */
	EClass getCodeSystemVersionReference();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.aml.terminology.CodeSystemVersionReference#getCodeSystem <em>Code System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Code System</em>'.
	 * @see org.eclipse.mdht.uml.aml.terminology.CodeSystemVersionReference#getCodeSystem()
	 * @see #getCodeSystemVersionReference()
	 * @generated
	 */
	EReference getCodeSystemVersionReference_CodeSystem();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.aml.terminology.ConceptReference <em>Concept Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concept Reference</em>'.
	 * @see org.eclipse.mdht.uml.aml.terminology.ConceptReference
	 * @generated
	 */
	EClass getConceptReference();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.mdht.uml.aml.terminology.ConceptReference#getDesignations <em>Designation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Designation</em>'.
	 * @see org.eclipse.mdht.uml.aml.terminology.ConceptReference#getDesignations()
	 * @see #getConceptReference()
	 * @generated
	 */
	EAttribute getConceptReference_Designation();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.terminology.ConceptReference#validateMustBeScopedIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Must Be Scoped Identifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Must Be Scoped Identifier</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.terminology.ConceptReference#validateMustBeScopedIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getConceptReference__ValidateMustBeScopedIdentifier__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.aml.terminology.ValueSetDefinitionReference <em>Value Set Definition Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Set Definition Reference</em>'.
	 * @see org.eclipse.mdht.uml.aml.terminology.ValueSetDefinitionReference
	 * @generated
	 */
	EClass getValueSetDefinitionReference();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.aml.terminology.ValueSetDefinitionReference#getValueSet <em>Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Set</em>'.
	 * @see org.eclipse.mdht.uml.aml.terminology.ValueSetDefinitionReference#getValueSet()
	 * @see #getValueSetDefinitionReference()
	 * @generated
	 */
	EReference getValueSetDefinitionReference_ValueSet();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.aml.terminology.ValueSetReference <em>Value Set Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Set Reference</em>'.
	 * @see org.eclipse.mdht.uml.aml.terminology.ValueSetReference
	 * @generated
	 */
	EClass getValueSetReference();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.aml.terminology.ValueSetReference#getValueSetDefinitions <em>Value Set Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Value Set Definition</em>'.
	 * @see org.eclipse.mdht.uml.aml.terminology.ValueSetReference#getValueSetDefinitions()
	 * @see #getValueSetReference()
	 * @generated
	 */
	EReference getValueSetReference_ValueSetDefinition();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.terminology.ValueSetReference#validateDefinition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Definition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Definition</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.terminology.ValueSetReference#validateDefinition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getValueSetReference__ValidateDefinition__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.aml.terminology.ArchetypeTerm <em>Archetype Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Archetype Term</em>'.
	 * @see org.eclipse.mdht.uml.aml.terminology.ArchetypeTerm
	 * @generated
	 */
	EClass getArchetypeTerm();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.aml.terminology.ArchetypeTerm#getValue_set_members <em>Value set members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Value set members</em>'.
	 * @see org.eclipse.mdht.uml.aml.terminology.ArchetypeTerm#getValue_set_members()
	 * @see #getArchetypeTerm()
	 * @generated
	 */
	EReference getArchetypeTerm_Value_set_members();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.aml.terminology.ArchetypeTerm#getTerm_bindings <em>Term bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Term bindings</em>'.
	 * @see org.eclipse.mdht.uml.aml.terminology.ArchetypeTerm#getTerm_bindings()
	 * @see #getArchetypeTerm()
	 * @generated
	 */
	EReference getArchetypeTerm_Term_bindings();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.terminology.ArchetypeTerm#validateAOMVTLClanguageconsistency(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVTL Clanguageconsistency</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVTL Clanguageconsistency</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.terminology.ArchetypeTerm#validateAOMVTLClanguageconsistency(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArchetypeTerm__ValidateAOMVTLClanguageconsistency__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.terminology.ArchetypeTerm#validateAOMVTVSIDvaluesetiddefined(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVTVSI Dvaluesetiddefined</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVTVSI Dvaluesetiddefined</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.terminology.ArchetypeTerm#validateAOMVTVSIDvaluesetiddefined(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArchetypeTerm__ValidateAOMVTVSIDvaluesetiddefined__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.terminology.ArchetypeTerm#validateAOMVTVSUQvaluesetmembersunique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVTVSU Qvaluesetmembersunique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVTVSU Qvaluesetmembersunique</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.terminology.ArchetypeTerm#validateAOMVTVSUQvaluesetmembersunique(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArchetypeTerm__ValidateAOMVTVSUQvaluesetmembersunique__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.terminology.ArchetypeTerm#validateAOMVTVSMDvaluesetmembersdefined(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVTVSM Dvaluesetmembersdefined</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVTVSM Dvaluesetmembersdefined</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.terminology.ArchetypeTerm#validateAOMVTVSMDvaluesetmembersdefined(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArchetypeTerm__ValidateAOMVTVSMDvaluesetmembersdefined__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.terminology.ArchetypeTerm#validateAOMARCHETYPETERMInvariantcodeValidCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMARCHETYPETERM Invariantcode Valid Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMARCHETYPETERM Invariantcode Valid Code</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.terminology.ArchetypeTerm#validateAOMARCHETYPETERMInvariantcodeValidCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArchetypeTerm__ValidateAOMARCHETYPETERMInvariantcodeValidCode__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.terminology.ArchetypeTerm#validateAOMVALUESETInvariantIdValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVALUESET Invariant Id Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVALUESET Invariant Id Valid</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.terminology.ArchetypeTerm#validateAOMVALUESETInvariantIdValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArchetypeTerm__ValidateAOMVALUESETInvariantIdValid__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.terminology.ArchetypeTerm#validateAOMVALUESETInvariantMembersValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVALUESET Invariant Members Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVALUESET Invariant Members Valid</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.terminology.ArchetypeTerm#validateAOMVALUESETInvariantMembersValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArchetypeTerm__ValidateAOMVALUESETInvariantMembersValid__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.terminology.ArchetypeTerm#validateAOMARCHETYPETERMINOLOGYInvarianttermBindingsValidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMARCHETYPETERMINOLOGY Invariantterm Bindings Validity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMARCHETYPETERMINOLOGY Invariantterm Bindings Validity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.terminology.ArchetypeTerm#validateAOMARCHETYPETERMINOLOGYInvarianttermBindingsValidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArchetypeTerm__ValidateAOMARCHETYPETERMINOLOGYInvarianttermBindingsValidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.terminology.ArchetypeTerm#validateAOMVETDFexternaltermvalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVETD Fexternaltermvalidity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVETD Fexternaltermvalidity</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.terminology.ArchetypeTerm#validateAOMVETDFexternaltermvalidity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArchetypeTerm__ValidateAOMVETDFexternaltermvalidity__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.terminology.ArchetypeTerm#validateAOMVTCBKterminologyconstraintbindingkeyvalid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVTCB Kterminologyconstraintbindingkeyvalid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVTCB Kterminologyconstraintbindingkeyvalid</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.terminology.ArchetypeTerm#validateAOMVTCBKterminologyconstraintbindingkeyvalid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArchetypeTerm__ValidateAOMVTCBKterminologyconstraintbindingkeyvalid__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.terminology.ArchetypeTerm#validateAOMVTSDspecialisationlevelofcodes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVTS Dspecialisationlevelofcodes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVTS Dspecialisationlevelofcodes</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.terminology.ArchetypeTerm#validateAOMVTSDspecialisationlevelofcodes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArchetypeTerm__ValidateAOMVTSDspecialisationlevelofcodes__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.terminology.ArchetypeTerm#validateAOMVTTBKterminologytermbindingkeyvalid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMVTTB Kterminologytermbindingkeyvalid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMVTTB Kterminologytermbindingkeyvalid</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.terminology.ArchetypeTerm#validateAOMVTTBKterminologytermbindingkeyvalid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getArchetypeTerm__ValidateAOMVTTBKterminologytermbindingkeyvalid__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.aml.terminology.TermResourceTranslation <em>Term Resource Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term Resource Translation</em>'.
	 * @see org.eclipse.mdht.uml.aml.terminology.TermResourceTranslation
	 * @generated
	 */
	EClass getTermResourceTranslation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.aml.terminology.TermResourceTranslation#getBase_Enumeration <em>Base Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Enumeration</em>'.
	 * @see org.eclipse.mdht.uml.aml.terminology.TermResourceTranslation#getBase_Enumeration()
	 * @see #getTermResourceTranslation()
	 * @generated
	 */
	EReference getTermResourceTranslation_Base_Enumeration();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.aml.terminology.TermResourceTranslation#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Language</em>'.
	 * @see org.eclipse.mdht.uml.aml.terminology.TermResourceTranslation#getLanguage()
	 * @see #getTermResourceTranslation()
	 * @generated
	 */
	EReference getTermResourceTranslation_Language();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.terminology.TermResourceTranslation#validateTranslationEntries(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Translation Entries</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Translation Entries</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.terminology.TermResourceTranslation#validateTranslationEntries(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getTermResourceTranslation__ValidateTranslationEntries__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.aml.terminology.IdEntry <em>Id Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Id Entry</em>'.
	 * @see org.eclipse.mdht.uml.aml.terminology.IdEntry
	 * @generated
	 */
	EClass getIdEntry();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.aml.terminology.IdEntry#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref</em>'.
	 * @see org.eclipse.mdht.uml.aml.terminology.IdEntry#getRef()
	 * @see #getIdEntry()
	 * @generated
	 */
	EReference getIdEntry_Ref();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.aml.terminology.IdEntry#getBase_EnumerationLiteral <em>Base Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Enumeration Literal</em>'.
	 * @see org.eclipse.mdht.uml.aml.terminology.IdEntry#getBase_EnumerationLiteral()
	 * @see #getIdEntry()
	 * @generated
	 */
	EReference getIdEntry_Base_EnumerationLiteral();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.terminology.IdEntry#validateAOMARCHETYPETERMInvariantdescriptionValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMARCHETYPETERM Invariantdescription Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMARCHETYPETERM Invariantdescription Valid</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.terminology.IdEntry#validateAOMARCHETYPETERMInvariantdescriptionValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getIdEntry__ValidateAOMARCHETYPETERMInvariantdescriptionValid__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.aml.terminology.Entry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry</em>'.
	 * @see org.eclipse.mdht.uml.aml.terminology.Entry
	 * @generated
	 */
	EClass getEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.aml.terminology.Entry#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.eclipse.mdht.uml.aml.terminology.Entry#getText()
	 * @see #getEntry()
	 * @generated
	 */
	EAttribute getEntry_Text();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.aml.terminology.Entry#getBase_NamedElement <em>Base Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Named Element</em>'.
	 * @see org.eclipse.mdht.uml.aml.terminology.Entry#getBase_NamedElement()
	 * @see #getEntry()
	 * @generated
	 */
	EReference getEntry_Base_NamedElement();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.terminology.Entry#validateAOMARCHETYPETERMInvarianttextValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate AOMARCHETYPETERM Invarianttext Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate AOMARCHETYPETERM Invarianttext Valid</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.terminology.Entry#validateAOMARCHETYPETERMInvarianttextValid(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getEntry__ValidateAOMARCHETYPETERMInvarianttextValid__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.aml.terminology.DescribedIdentifier <em>Described Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Described Identifier</em>'.
	 * @see org.eclipse.mdht.uml.aml.terminology.DescribedIdentifier
	 * @generated
	 */
	EClass getDescribedIdentifier();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.aml.terminology.DescribedIdentifier#getDefiningCodeSystem <em>Defining Code System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Defining Code System</em>'.
	 * @see org.eclipse.mdht.uml.aml.terminology.DescribedIdentifier#getDefiningCodeSystem()
	 * @see #getDescribedIdentifier()
	 * @generated
	 */
	EReference getDescribedIdentifier_DefiningCodeSystem();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.terminology.DescribedIdentifier#validateMembersMustBeConceptReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Members Must Be Concept Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Members Must Be Concept Reference</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.terminology.DescribedIdentifier#validateMembersMustBeConceptReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDescribedIdentifier__ValidateMembersMustBeConceptReference__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.terminology.DescribedIdentifier#validateDefiningCodeSystem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Defining Code System</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Defining Code System</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.terminology.DescribedIdentifier#validateDefiningCodeSystem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDescribedIdentifier__ValidateDefiningCodeSystem__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.aml.terminology.about <em>about</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>about</em>'.
	 * @see org.eclipse.mdht.uml.aml.terminology.about
	 * @generated
	 */
	EClass getabout();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.aml.terminology.about#getBase_Abstraction <em>Base Abstraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Abstraction</em>'.
	 * @see org.eclipse.mdht.uml.aml.terminology.about#getBase_Abstraction()
	 * @see #getabout()
	 * @generated
	 */
	EReference getabout_Base_Abstraction();

	/**
	 * Returns the meta object for the '{@link org.eclipse.mdht.uml.aml.terminology.about#validateIsConceptReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Is Concept Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Is Concept Reference</em>' operation.
	 * @see org.eclipse.mdht.uml.aml.terminology.about#validateIsConceptReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getabout__ValidateIsConceptReference__DiagnosticChain_Map();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.aml.terminology.ArchetypeType <em>Archetype Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Archetype Type</em>'.
	 * @see org.eclipse.mdht.uml.aml.terminology.ArchetypeType
	 * @generated
	 */
	EEnum getArchetypeType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TerminologyFactory getTerminologyFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.aml.terminology.impl.IdentifiedItemImpl <em>Identified Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.aml.terminology.impl.IdentifiedItemImpl
		 * @see org.eclipse.mdht.uml.aml.terminology.impl.TerminologyPackageImpl#getIdentifiedItem()
		 * @generated
		 */
		EClass IDENTIFIED_ITEM = eINSTANCE.getIdentifiedItem();

		/**
		 * The meta object literal for the '<em><b>Base Named Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIED_ITEM__BASE_NAMED_ELEMENT = eINSTANCE.getIdentifiedItem_Base_NamedElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIED_ITEM__ID = eINSTANCE.getIdentifiedItem_Id();

		/**
		 * The meta object literal for the '<em><b>Validate Unique Scopes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDENTIFIED_ITEM___VALIDATE_UNIQUE_SCOPES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getIdentifiedItem__ValidateUniqueScopes__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.aml.terminology.impl.PermissibleValueImpl <em>Permissible Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.aml.terminology.impl.PermissibleValueImpl
		 * @see org.eclipse.mdht.uml.aml.terminology.impl.TerminologyPackageImpl#getPermissibleValue()
		 * @generated
		 */
		EClass PERMISSIBLE_VALUE = eINSTANCE.getPermissibleValue();

		/**
		 * The meta object literal for the '<em><b>Base Enumeration Literal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERMISSIBLE_VALUE__BASE_ENUMERATION_LITERAL = eINSTANCE.getPermissibleValue_Base_EnumerationLiteral();

		/**
		 * The meta object literal for the '<em><b>Meaning</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERMISSIBLE_VALUE__MEANING = eINSTANCE.getPermissibleValue_Meaning();

		/**
		 * The meta object literal for the '<em><b>Validate Must Be Concept Reference</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PERMISSIBLE_VALUE___VALIDATE_MUST_BE_CONCEPT_REFERENCE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getPermissibleValue__ValidateMustBeConceptReference__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.aml.terminology.impl.ScopedIdentifierImpl <em>Scoped Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.aml.terminology.impl.ScopedIdentifierImpl
		 * @see org.eclipse.mdht.uml.aml.terminology.impl.TerminologyPackageImpl#getScopedIdentifier()
		 * @generated
		 */
		EClass SCOPED_IDENTIFIER = eINSTANCE.getScopedIdentifier();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCOPED_IDENTIFIER__URI = eINSTANCE.getScopedIdentifier_Uri();

		/**
		 * The meta object literal for the '<em><b>Identifier URI Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCOPED_IDENTIFIER__IDENTIFIER_URI_PATTERN = eINSTANCE.getScopedIdentifier_IdentifierURIPattern();

		/**
		 * The meta object literal for the '<em><b>Base Enumeration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPED_IDENTIFIER__BASE_ENUMERATION = eINSTANCE.getScopedIdentifier_Base_Enumeration();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.aml.terminology.impl.EnumeratedValueDomainImpl <em>Enumerated Value Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.aml.terminology.impl.EnumeratedValueDomainImpl
		 * @see org.eclipse.mdht.uml.aml.terminology.impl.TerminologyPackageImpl#getEnumeratedValueDomain()
		 * @generated
		 */
		EClass ENUMERATED_VALUE_DOMAIN = eINSTANCE.getEnumeratedValueDomain();

		/**
		 * The meta object literal for the '<em><b>Base Enumeration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATED_VALUE_DOMAIN__BASE_ENUMERATION = eINSTANCE.getEnumeratedValueDomain_Base_Enumeration();

		/**
		 * The meta object literal for the '<em><b>Value Set Binding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATED_VALUE_DOMAIN__VALUE_SET_BINDING = eINSTANCE.getEnumeratedValueDomain_ValueSetBinding();

		/**
		 * The meta object literal for the '<em><b>Validate Permissible Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUMERATED_VALUE_DOMAIN___VALIDATE_PERMISSIBLE_VALUES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getEnumeratedValueDomain__ValidatePermissibleValues__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate Binding Is Value Set Or Definition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUMERATED_VALUE_DOMAIN___VALIDATE_BINDING_IS_VALUE_SET_OR_DEFINITION__DIAGNOSTICCHAIN_MAP = eINSTANCE.getEnumeratedValueDomain__ValidateBindingIsValueSetOrDefinition__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.aml.terminology.impl.ResourceReferenceImpl <em>Resource Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.aml.terminology.impl.ResourceReferenceImpl
		 * @see org.eclipse.mdht.uml.aml.terminology.impl.TerminologyPackageImpl#getResourceReference()
		 * @generated
		 */
		EClass RESOURCE_REFERENCE = eINSTANCE.getResourceReference();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_REFERENCE__URI = eINSTANCE.getResourceReference_Uri();

		/**
		 * The meta object literal for the '<em><b>Base Enumeration Literal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_REFERENCE__BASE_ENUMERATION_LITERAL = eINSTANCE.getResourceReference_Base_EnumerationLiteral();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.aml.terminology.impl.CodeSystemReferenceImpl <em>Code System Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.aml.terminology.impl.CodeSystemReferenceImpl
		 * @see org.eclipse.mdht.uml.aml.terminology.impl.TerminologyPackageImpl#getCodeSystemReference()
		 * @generated
		 */
		EClass CODE_SYSTEM_REFERENCE = eINSTANCE.getCodeSystemReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.aml.terminology.impl.CodeSystemVersionReferenceImpl <em>Code System Version Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.aml.terminology.impl.CodeSystemVersionReferenceImpl
		 * @see org.eclipse.mdht.uml.aml.terminology.impl.TerminologyPackageImpl#getCodeSystemVersionReference()
		 * @generated
		 */
		EClass CODE_SYSTEM_VERSION_REFERENCE = eINSTANCE.getCodeSystemVersionReference();

		/**
		 * The meta object literal for the '<em><b>Code System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_SYSTEM_VERSION_REFERENCE__CODE_SYSTEM = eINSTANCE.getCodeSystemVersionReference_CodeSystem();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.aml.terminology.impl.ConceptReferenceImpl <em>Concept Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.aml.terminology.impl.ConceptReferenceImpl
		 * @see org.eclipse.mdht.uml.aml.terminology.impl.TerminologyPackageImpl#getConceptReference()
		 * @generated
		 */
		EClass CONCEPT_REFERENCE = eINSTANCE.getConceptReference();

		/**
		 * The meta object literal for the '<em><b>Designation</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCEPT_REFERENCE__DESIGNATION = eINSTANCE.getConceptReference_Designation();

		/**
		 * The meta object literal for the '<em><b>Validate Must Be Scoped Identifier</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONCEPT_REFERENCE___VALIDATE_MUST_BE_SCOPED_IDENTIFIER__DIAGNOSTICCHAIN_MAP = eINSTANCE.getConceptReference__ValidateMustBeScopedIdentifier__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.aml.terminology.impl.ValueSetDefinitionReferenceImpl <em>Value Set Definition Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.aml.terminology.impl.ValueSetDefinitionReferenceImpl
		 * @see org.eclipse.mdht.uml.aml.terminology.impl.TerminologyPackageImpl#getValueSetDefinitionReference()
		 * @generated
		 */
		EClass VALUE_SET_DEFINITION_REFERENCE = eINSTANCE.getValueSetDefinitionReference();

		/**
		 * The meta object literal for the '<em><b>Value Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_SET_DEFINITION_REFERENCE__VALUE_SET = eINSTANCE.getValueSetDefinitionReference_ValueSet();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.aml.terminology.impl.ValueSetReferenceImpl <em>Value Set Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.aml.terminology.impl.ValueSetReferenceImpl
		 * @see org.eclipse.mdht.uml.aml.terminology.impl.TerminologyPackageImpl#getValueSetReference()
		 * @generated
		 */
		EClass VALUE_SET_REFERENCE = eINSTANCE.getValueSetReference();

		/**
		 * The meta object literal for the '<em><b>Value Set Definition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_SET_REFERENCE__VALUE_SET_DEFINITION = eINSTANCE.getValueSetReference_ValueSetDefinition();

		/**
		 * The meta object literal for the '<em><b>Validate Definition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALUE_SET_REFERENCE___VALIDATE_DEFINITION__DIAGNOSTICCHAIN_MAP = eINSTANCE.getValueSetReference__ValidateDefinition__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.aml.terminology.impl.ArchetypeTermImpl <em>Archetype Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.aml.terminology.impl.ArchetypeTermImpl
		 * @see org.eclipse.mdht.uml.aml.terminology.impl.TerminologyPackageImpl#getArchetypeTerm()
		 * @generated
		 */
		EClass ARCHETYPE_TERM = eINSTANCE.getArchetypeTerm();

		/**
		 * The meta object literal for the '<em><b>Value set members</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHETYPE_TERM__VALUE_SET_MEMBERS = eINSTANCE.getArchetypeTerm_Value_set_members();

		/**
		 * The meta object literal for the '<em><b>Term bindings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHETYPE_TERM__TERM_BINDINGS = eINSTANCE.getArchetypeTerm_Term_bindings();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVTL Clanguageconsistency</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHETYPE_TERM___VALIDATE_AOMVTL_CLANGUAGECONSISTENCY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArchetypeTerm__ValidateAOMVTLClanguageconsistency__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVTVSI Dvaluesetiddefined</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHETYPE_TERM___VALIDATE_AOMVTVSI_DVALUESETIDDEFINED__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArchetypeTerm__ValidateAOMVTVSIDvaluesetiddefined__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVTVSU Qvaluesetmembersunique</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHETYPE_TERM___VALIDATE_AOMVTVSU_QVALUESETMEMBERSUNIQUE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArchetypeTerm__ValidateAOMVTVSUQvaluesetmembersunique__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVTVSM Dvaluesetmembersdefined</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHETYPE_TERM___VALIDATE_AOMVTVSM_DVALUESETMEMBERSDEFINED__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArchetypeTerm__ValidateAOMVTVSMDvaluesetmembersdefined__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMARCHETYPETERM Invariantcode Valid Code</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHETYPE_TERM___VALIDATE_AOMARCHETYPETERM_INVARIANTCODE_VALID_CODE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArchetypeTerm__ValidateAOMARCHETYPETERMInvariantcodeValidCode__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVALUESET Invariant Id Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHETYPE_TERM___VALIDATE_AOMVALUESET_INVARIANT_ID_VALID__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArchetypeTerm__ValidateAOMVALUESETInvariantIdValid__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVALUESET Invariant Members Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHETYPE_TERM___VALIDATE_AOMVALUESET_INVARIANT_MEMBERS_VALID__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArchetypeTerm__ValidateAOMVALUESETInvariantMembersValid__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMARCHETYPETERMINOLOGY Invariantterm Bindings Validity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHETYPE_TERM___VALIDATE_AOMARCHETYPETERMINOLOGY_INVARIANTTERM_BINDINGS_VALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArchetypeTerm__ValidateAOMARCHETYPETERMINOLOGYInvarianttermBindingsValidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVETD Fexternaltermvalidity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHETYPE_TERM___VALIDATE_AOMVETD_FEXTERNALTERMVALIDITY__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArchetypeTerm__ValidateAOMVETDFexternaltermvalidity__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVTCB Kterminologyconstraintbindingkeyvalid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHETYPE_TERM___VALIDATE_AOMVTCB_KTERMINOLOGYCONSTRAINTBINDINGKEYVALID__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArchetypeTerm__ValidateAOMVTCBKterminologyconstraintbindingkeyvalid__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVTS Dspecialisationlevelofcodes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHETYPE_TERM___VALIDATE_AOMVTS_DSPECIALISATIONLEVELOFCODES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArchetypeTerm__ValidateAOMVTSDspecialisationlevelofcodes__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate AOMVTTB Kterminologytermbindingkeyvalid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARCHETYPE_TERM___VALIDATE_AOMVTTB_KTERMINOLOGYTERMBINDINGKEYVALID__DIAGNOSTICCHAIN_MAP = eINSTANCE.getArchetypeTerm__ValidateAOMVTTBKterminologytermbindingkeyvalid__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.aml.terminology.impl.TermResourceTranslationImpl <em>Term Resource Translation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.aml.terminology.impl.TermResourceTranslationImpl
		 * @see org.eclipse.mdht.uml.aml.terminology.impl.TerminologyPackageImpl#getTermResourceTranslation()
		 * @generated
		 */
		EClass TERM_RESOURCE_TRANSLATION = eINSTANCE.getTermResourceTranslation();

		/**
		 * The meta object literal for the '<em><b>Base Enumeration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM_RESOURCE_TRANSLATION__BASE_ENUMERATION = eINSTANCE.getTermResourceTranslation_Base_Enumeration();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM_RESOURCE_TRANSLATION__LANGUAGE = eINSTANCE.getTermResourceTranslation_Language();

		/**
		 * The meta object literal for the '<em><b>Validate Translation Entries</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TERM_RESOURCE_TRANSLATION___VALIDATE_TRANSLATION_ENTRIES__DIAGNOSTICCHAIN_MAP = eINSTANCE.getTermResourceTranslation__ValidateTranslationEntries__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.aml.terminology.impl.IdEntryImpl <em>Id Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.aml.terminology.impl.IdEntryImpl
		 * @see org.eclipse.mdht.uml.aml.terminology.impl.TerminologyPackageImpl#getIdEntry()
		 * @generated
		 */
		EClass ID_ENTRY = eINSTANCE.getIdEntry();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_ENTRY__REF = eINSTANCE.getIdEntry_Ref();

		/**
		 * The meta object literal for the '<em><b>Base Enumeration Literal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_ENTRY__BASE_ENUMERATION_LITERAL = eINSTANCE.getIdEntry_Base_EnumerationLiteral();

		/**
		 * The meta object literal for the '<em><b>Validate AOMARCHETYPETERM Invariantdescription Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ID_ENTRY___VALIDATE_AOMARCHETYPETERM_INVARIANTDESCRIPTION_VALID__DIAGNOSTICCHAIN_MAP = eINSTANCE.getIdEntry__ValidateAOMARCHETYPETERMInvariantdescriptionValid__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.aml.terminology.impl.EntryImpl <em>Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.aml.terminology.impl.EntryImpl
		 * @see org.eclipse.mdht.uml.aml.terminology.impl.TerminologyPackageImpl#getEntry()
		 * @generated
		 */
		EClass ENTRY = eINSTANCE.getEntry();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY__TEXT = eINSTANCE.getEntry_Text();

		/**
		 * The meta object literal for the '<em><b>Base Named Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY__BASE_NAMED_ELEMENT = eINSTANCE.getEntry_Base_NamedElement();

		/**
		 * The meta object literal for the '<em><b>Validate AOMARCHETYPETERM Invarianttext Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTRY___VALIDATE_AOMARCHETYPETERM_INVARIANTTEXT_VALID__DIAGNOSTICCHAIN_MAP = eINSTANCE.getEntry__ValidateAOMARCHETYPETERMInvarianttextValid__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.aml.terminology.impl.DescribedIdentifierImpl <em>Described Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.aml.terminology.impl.DescribedIdentifierImpl
		 * @see org.eclipse.mdht.uml.aml.terminology.impl.TerminologyPackageImpl#getDescribedIdentifier()
		 * @generated
		 */
		EClass DESCRIBED_IDENTIFIER = eINSTANCE.getDescribedIdentifier();

		/**
		 * The meta object literal for the '<em><b>Defining Code System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIBED_IDENTIFIER__DEFINING_CODE_SYSTEM = eINSTANCE.getDescribedIdentifier_DefiningCodeSystem();

		/**
		 * The meta object literal for the '<em><b>Validate Members Must Be Concept Reference</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DESCRIBED_IDENTIFIER___VALIDATE_MEMBERS_MUST_BE_CONCEPT_REFERENCE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getDescribedIdentifier__ValidateMembersMustBeConceptReference__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Validate Defining Code System</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DESCRIBED_IDENTIFIER___VALIDATE_DEFINING_CODE_SYSTEM__DIAGNOSTICCHAIN_MAP = eINSTANCE.getDescribedIdentifier__ValidateDefiningCodeSystem__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.aml.terminology.impl.aboutImpl <em>about</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.aml.terminology.impl.aboutImpl
		 * @see org.eclipse.mdht.uml.aml.terminology.impl.TerminologyPackageImpl#getabout()
		 * @generated
		 */
		EClass ABOUT = eINSTANCE.getabout();

		/**
		 * The meta object literal for the '<em><b>Base Abstraction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABOUT__BASE_ABSTRACTION = eINSTANCE.getabout_Base_Abstraction();

		/**
		 * The meta object literal for the '<em><b>Validate Is Concept Reference</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABOUT___VALIDATE_IS_CONCEPT_REFERENCE__DIAGNOSTICCHAIN_MAP = eINSTANCE.getabout__ValidateIsConceptReference__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.aml.terminology.ArchetypeType <em>Archetype Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.aml.terminology.ArchetypeType
		 * @see org.eclipse.mdht.uml.aml.terminology.impl.TerminologyPackageImpl#getArchetypeType()
		 * @generated
		 */
		EEnum ARCHETYPE_TYPE = eINSTANCE.getArchetypeType();

	}

} //TerminologyPackage
