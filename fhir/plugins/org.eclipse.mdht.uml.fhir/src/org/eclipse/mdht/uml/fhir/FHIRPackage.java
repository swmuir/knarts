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
package org.eclipse.mdht.uml.fhir;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.eclipse.mdht.uml.fhir.FHIRFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='FHIR'"
 * @generated
 */
public interface FHIRPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fhir";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/mdht/schema/profile/fhir/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fhir";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FHIRPackage eINSTANCE = org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.impl.TypeChoiceImpl <em>Type Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.impl.TypeChoiceImpl
	 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getTypeChoice()
	 * @generated
	 */
	int TYPE_CHOICE = 0;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CHOICE__BASE_PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CHOICE__TYPES = 1;

	/**
	 * The number of structural features of the '<em>Type Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CHOICE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Type Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CHOICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.impl.ElementImpl
	 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__EXTENSION = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.impl.ConformanceResourceImpl <em>Conformance Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.impl.ConformanceResourceImpl
	 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getConformanceResource()
	 * @generated
	 */
	int CONFORMANCE_RESOURCE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORMANCE_RESOURCE__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORMANCE_RESOURCE__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORMANCE_RESOURCE__URI = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORMANCE_RESOURCE__VERSION = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORMANCE_RESOURCE__NAME = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORMANCE_RESOURCE__STATUS = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Experimental</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORMANCE_RESOURCE__EXPERIMENTAL = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORMANCE_RESOURCE__PUBLISHER = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORMANCE_RESOURCE__CONTACT = ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORMANCE_RESOURCE__DATE = ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Use Context</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORMANCE_RESOURCE__USE_CONTEXT = ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORMANCE_RESOURCE__COPYRIGHT = ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Conformance Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORMANCE_RESOURCE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Conformance Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFORMANCE_RESOURCE_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.impl.StructureDefinitionImpl <em>Structure Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.impl.StructureDefinitionImpl
	 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getStructureDefinition()
	 * @generated
	 */
	int STRUCTURE_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DEFINITION__ID = CONFORMANCE_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DEFINITION__EXTENSION = CONFORMANCE_RESOURCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DEFINITION__URI = CONFORMANCE_RESOURCE__URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DEFINITION__VERSION = CONFORMANCE_RESOURCE__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DEFINITION__NAME = CONFORMANCE_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DEFINITION__STATUS = CONFORMANCE_RESOURCE__STATUS;

	/**
	 * The feature id for the '<em><b>Experimental</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DEFINITION__EXPERIMENTAL = CONFORMANCE_RESOURCE__EXPERIMENTAL;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DEFINITION__PUBLISHER = CONFORMANCE_RESOURCE__PUBLISHER;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DEFINITION__CONTACT = CONFORMANCE_RESOURCE__CONTACT;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DEFINITION__DATE = CONFORMANCE_RESOURCE__DATE;

	/**
	 * The feature id for the '<em><b>Use Context</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DEFINITION__USE_CONTEXT = CONFORMANCE_RESOURCE__USE_CONTEXT;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DEFINITION__COPYRIGHT = CONFORMANCE_RESOURCE__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DEFINITION__BASE_CLASS = CONFORMANCE_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DEFINITION__DISPLAY = CONFORMANCE_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Context Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DEFINITION__CONTEXT_TYPE = CONFORMANCE_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DEFINITION__CONTEXT = CONFORMANCE_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Logical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DEFINITION__IS_LOGICAL = CONFORMANCE_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Derivation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DEFINITION__DERIVATION = CONFORMANCE_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Structure Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DEFINITION_FEATURE_COUNT = CONFORMANCE_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Structure Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_DEFINITION_OPERATION_COUNT = CONFORMANCE_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.impl.ElementDefinitionImpl <em>Element Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.impl.ElementDefinitionImpl
	 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getElementDefinition()
	 * @generated
	 */
	int ELEMENT_DEFINITION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__ID = ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__EXTENSION = ELEMENT__EXTENSION;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__BASE_PROPERTY = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__NAME = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__LABEL = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Must Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__MUST_SUPPORT = ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__IS_MODIFIER = ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__IS_SUMMARY = ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__REPRESENTATION = ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__DEFAULT = ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Meaning When Missing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__MEANING_WHEN_MISSING = ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Fixed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__FIXED = ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__PATTERN = ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Example</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__EXAMPLE = ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION__COMMENT = ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Element Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Element Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_DEFINITION_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.impl.ShortDescriptionImpl <em>Short Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.impl.ShortDescriptionImpl
	 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getShortDescription()
	 * @generated
	 */
	int SHORT_DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Base Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_DESCRIPTION__BASE_COMMENT = 0;

	/**
	 * The number of structural features of the '<em>Short Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_DESCRIPTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Short Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHORT_DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.impl.DescriptionImpl <em>Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.impl.DescriptionImpl
	 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getDescription()
	 * @generated
	 */
	int DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Base Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__BASE_COMMENT = 0;

	/**
	 * The number of structural features of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.impl.DefinitionImpl <em>Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.impl.DefinitionImpl
	 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getDefinition()
	 * @generated
	 */
	int DEFINITION = 7;

	/**
	 * The feature id for the '<em><b>Base Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION__BASE_COMMENT = 0;

	/**
	 * The number of structural features of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.impl.RequirementsImpl <em>Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.impl.RequirementsImpl
	 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getRequirements()
	 * @generated
	 */
	int REQUIREMENTS = 8;

	/**
	 * The feature id for the '<em><b>Base Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS__BASE_COMMENT = 0;

	/**
	 * The number of structural features of the '<em>Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.impl.CommentsImpl <em>Comments</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.impl.CommentsImpl
	 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getComments()
	 * @generated
	 */
	int COMMENTS = 9;

	/**
	 * The feature id for the '<em><b>Base Comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENTS__BASE_COMMENT = 0;

	/**
	 * The number of structural features of the '<em>Comments</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Comments</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.impl.ValueSetBindingImpl <em>Value Set Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.impl.ValueSetBindingImpl
	 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getValueSetBinding()
	 * @generated
	 */
	int VALUE_SET_BINDING = 10;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_BINDING__BASE_PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Strength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_BINDING__STRENGTH = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_BINDING__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Value Set Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_BINDING__VALUE_SET_URI = 3;

	/**
	 * The feature id for the '<em><b>Value Set Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_BINDING__VALUE_SET_REFERENCE = 4;

	/**
	 * The number of structural features of the '<em>Value Set Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_BINDING_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Value Set Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_BINDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.impl.ValueSetImpl <em>Value Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.impl.ValueSetImpl
	 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getValueSet()
	 * @generated
	 */
	int VALUE_SET = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET__ID = CONFORMANCE_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET__EXTENSION = CONFORMANCE_RESOURCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET__URI = CONFORMANCE_RESOURCE__URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET__VERSION = CONFORMANCE_RESOURCE__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET__NAME = CONFORMANCE_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET__STATUS = CONFORMANCE_RESOURCE__STATUS;

	/**
	 * The feature id for the '<em><b>Experimental</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET__EXPERIMENTAL = CONFORMANCE_RESOURCE__EXPERIMENTAL;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET__PUBLISHER = CONFORMANCE_RESOURCE__PUBLISHER;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET__CONTACT = CONFORMANCE_RESOURCE__CONTACT;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET__DATE = CONFORMANCE_RESOURCE__DATE;

	/**
	 * The feature id for the '<em><b>Use Context</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET__USE_CONTEXT = CONFORMANCE_RESOURCE__USE_CONTEXT;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET__COPYRIGHT = CONFORMANCE_RESOURCE__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Base Enumeration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET__BASE_ENUMERATION = CONFORMANCE_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_FEATURE_COUNT = CONFORMANCE_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Value Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_OPERATION_COUNT = CONFORMANCE_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.impl.DataElementImpl <em>Data Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.impl.DataElementImpl
	 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getDataElement()
	 * @generated
	 */
	int DATA_ELEMENT = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__ID = CONFORMANCE_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__EXTENSION = CONFORMANCE_RESOURCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__URI = CONFORMANCE_RESOURCE__URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__VERSION = CONFORMANCE_RESOURCE__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__NAME = CONFORMANCE_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__STATUS = CONFORMANCE_RESOURCE__STATUS;

	/**
	 * The feature id for the '<em><b>Experimental</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__EXPERIMENTAL = CONFORMANCE_RESOURCE__EXPERIMENTAL;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__PUBLISHER = CONFORMANCE_RESOURCE__PUBLISHER;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__CONTACT = CONFORMANCE_RESOURCE__CONTACT;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__DATE = CONFORMANCE_RESOURCE__DATE;

	/**
	 * The feature id for the '<em><b>Use Context</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__USE_CONTEXT = CONFORMANCE_RESOURCE__USE_CONTEXT;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__COPYRIGHT = CONFORMANCE_RESOURCE__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__BASE_CLASS = CONFORMANCE_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT_FEATURE_COUNT = CONFORMANCE_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT_OPERATION_COUNT = CONFORMANCE_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.impl.ValueSetMemberImpl <em>Value Set Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.impl.ValueSetMemberImpl
	 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getValueSetMember()
	 * @generated
	 */
	int VALUE_SET_MEMBER = 13;

	/**
	 * The feature id for the '<em><b>Base Enumeration Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_MEMBER__BASE_ENUMERATION_LITERAL = 0;

	/**
	 * The feature id for the '<em><b>System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_MEMBER__SYSTEM = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_MEMBER__VERSION = 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_MEMBER__CODE = 3;

	/**
	 * The feature id for the '<em><b>Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_MEMBER__DISPLAY = 4;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_MEMBER__ABSTRACT = 5;

	/**
	 * The number of structural features of the '<em>Value Set Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_MEMBER_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Value Set Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_MEMBER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.impl.ElementSlicingImpl <em>Element Slicing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.impl.ElementSlicingImpl
	 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getElementSlicing()
	 * @generated
	 */
	int ELEMENT_SLICING = 14;

	/**
	 * The feature id for the '<em><b>Discriminator</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_SLICING__DISCRIMINATOR = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_SLICING__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_SLICING__ORDERED = 2;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_SLICING__RULES = 3;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_SLICING__BASE_PROPERTY = 4;

	/**
	 * The number of structural features of the '<em>Element Slicing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_SLICING_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Element Slicing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_SLICING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.impl.SearchParameterImpl <em>Search Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.impl.SearchParameterImpl
	 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getSearchParameter()
	 * @generated
	 */
	int SEARCH_PARAMETER = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_PARAMETER__ID = CONFORMANCE_RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_PARAMETER__EXTENSION = CONFORMANCE_RESOURCE__EXTENSION;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_PARAMETER__URI = CONFORMANCE_RESOURCE__URI;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_PARAMETER__VERSION = CONFORMANCE_RESOURCE__VERSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_PARAMETER__NAME = CONFORMANCE_RESOURCE__NAME;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_PARAMETER__STATUS = CONFORMANCE_RESOURCE__STATUS;

	/**
	 * The feature id for the '<em><b>Experimental</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_PARAMETER__EXPERIMENTAL = CONFORMANCE_RESOURCE__EXPERIMENTAL;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_PARAMETER__PUBLISHER = CONFORMANCE_RESOURCE__PUBLISHER;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_PARAMETER__CONTACT = CONFORMANCE_RESOURCE__CONTACT;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_PARAMETER__DATE = CONFORMANCE_RESOURCE__DATE;

	/**
	 * The feature id for the '<em><b>Use Context</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_PARAMETER__USE_CONTEXT = CONFORMANCE_RESOURCE__USE_CONTEXT;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_PARAMETER__COPYRIGHT = CONFORMANCE_RESOURCE__COPYRIGHT;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_PARAMETER__BASE_CLASS = CONFORMANCE_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Jurisdiction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_PARAMETER__JURISDICTION = CONFORMANCE_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_PARAMETER__PURPOSE = CONFORMANCE_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_PARAMETER__CODE = CONFORMANCE_RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Base</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_PARAMETER__BASE = CONFORMANCE_RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_PARAMETER__TYPE = CONFORMANCE_RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_PARAMETER__DERIVED_FROM = CONFORMANCE_RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_PARAMETER__DESCRIPTION = CONFORMANCE_RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_PARAMETER__EXPRESSION = CONFORMANCE_RESOURCE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Xpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_PARAMETER__XPATH = CONFORMANCE_RESOURCE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Xpath Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_PARAMETER__XPATH_USAGE = CONFORMANCE_RESOURCE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_PARAMETER__TARGET = CONFORMANCE_RESOURCE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Comparator</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_PARAMETER__COMPARATOR = CONFORMANCE_RESOURCE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Modifier</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_PARAMETER__MODIFIER = CONFORMANCE_RESOURCE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Chain</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_PARAMETER__CHAIN = CONFORMANCE_RESOURCE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_PARAMETER__COMPONENT = CONFORMANCE_RESOURCE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Base Resource</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_PARAMETER__BASE_RESOURCE = CONFORMANCE_RESOURCE_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>Search Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_PARAMETER_FEATURE_COUNT = CONFORMANCE_RESOURCE_FEATURE_COUNT + 17;

	/**
	 * The number of operations of the '<em>Search Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_PARAMETER_OPERATION_COUNT = CONFORMANCE_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.impl.SearchParameter_ComponentClassImpl <em>Search Parameter Component Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.impl.SearchParameter_ComponentClassImpl
	 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getSearchParameter_ComponentClass()
	 * @generated
	 */
	int SEARCH_PARAMETER_COMPONENT_CLASS = 16;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_PARAMETER_COMPONENT_CLASS__DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_PARAMETER_COMPONENT_CLASS__EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>Search Parameter Component Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_PARAMETER_COMPONENT_CLASS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Search Parameter Component Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_PARAMETER_COMPONENT_CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.DerivationKind <em>Derivation Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.DerivationKind
	 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getDerivationKind()
	 * @generated
	 */
	int DERIVATION_KIND = 17;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.PropertyRepresentationKind <em>Property Representation Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.PropertyRepresentationKind
	 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getPropertyRepresentationKind()
	 * @generated
	 */
	int PROPERTY_REPRESENTATION_KIND = 18;

	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.BindingStrengthKind <em>Binding Strength Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.BindingStrengthKind
	 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getBindingStrengthKind()
	 * @generated
	 */
	int BINDING_STRENGTH_KIND = 19;


	/**
	 * The meta object id for the '{@link org.eclipse.mdht.uml.fhir.SlicingRulesKind <em>Slicing Rules Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.mdht.uml.fhir.SlicingRulesKind
	 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getSlicingRulesKind()
	 * @generated
	 */
	int SLICING_RULES_KIND = 20;


	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.TypeChoice <em>Type Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Choice</em>'.
	 * @see org.eclipse.mdht.uml.fhir.TypeChoice
	 * @generated
	 */
	EClass getTypeChoice();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.TypeChoice#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see org.eclipse.mdht.uml.fhir.TypeChoice#getBase_Property()
	 * @see #getTypeChoice()
	 * @generated
	 */
	EReference getTypeChoice_Base_Property();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.TypeChoice#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Types</em>'.
	 * @see org.eclipse.mdht.uml.fhir.TypeChoice#getTypes()
	 * @see #getTypeChoice()
	 * @generated
	 */
	EReference getTypeChoice_Types();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.StructureDefinition <em>Structure Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure Definition</em>'.
	 * @see org.eclipse.mdht.uml.fhir.StructureDefinition
	 * @generated
	 */
	EClass getStructureDefinition();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.StructureDefinition#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.mdht.uml.fhir.StructureDefinition#getBase_Class()
	 * @see #getStructureDefinition()
	 * @generated
	 */
	EReference getStructureDefinition_Base_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.StructureDefinition#getDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display</em>'.
	 * @see org.eclipse.mdht.uml.fhir.StructureDefinition#getDisplay()
	 * @see #getStructureDefinition()
	 * @generated
	 */
	EAttribute getStructureDefinition_Display();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.StructureDefinition#getContextType <em>Context Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.StructureDefinition#getContextType()
	 * @see #getStructureDefinition()
	 * @generated
	 */
	EAttribute getStructureDefinition_ContextType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.mdht.uml.fhir.StructureDefinition#getContexts <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Context</em>'.
	 * @see org.eclipse.mdht.uml.fhir.StructureDefinition#getContexts()
	 * @see #getStructureDefinition()
	 * @generated
	 */
	EAttribute getStructureDefinition_Context();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.StructureDefinition#getIsLogical <em>Is Logical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Logical</em>'.
	 * @see org.eclipse.mdht.uml.fhir.StructureDefinition#getIsLogical()
	 * @see #getStructureDefinition()
	 * @generated
	 */
	EAttribute getStructureDefinition_IsLogical();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.StructureDefinition#getDerivation <em>Derivation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derivation</em>'.
	 * @see org.eclipse.mdht.uml.fhir.StructureDefinition#getDerivation()
	 * @see #getStructureDefinition()
	 * @generated
	 */
	EAttribute getStructureDefinition_Derivation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.ConformanceResource <em>Conformance Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conformance Resource</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ConformanceResource
	 * @generated
	 */
	EClass getConformanceResource();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.ConformanceResource#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ConformanceResource#getUri()
	 * @see #getConformanceResource()
	 * @generated
	 */
	EAttribute getConformanceResource_Uri();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.ConformanceResource#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ConformanceResource#getVersion()
	 * @see #getConformanceResource()
	 * @generated
	 */
	EAttribute getConformanceResource_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.ConformanceResource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ConformanceResource#getName()
	 * @see #getConformanceResource()
	 * @generated
	 */
	EAttribute getConformanceResource_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.ConformanceResource#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ConformanceResource#getStatus()
	 * @see #getConformanceResource()
	 * @generated
	 */
	EAttribute getConformanceResource_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.ConformanceResource#isExperimental <em>Experimental</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Experimental</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ConformanceResource#isExperimental()
	 * @see #getConformanceResource()
	 * @generated
	 */
	EAttribute getConformanceResource_Experimental();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.ConformanceResource#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publisher</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ConformanceResource#getPublisher()
	 * @see #getConformanceResource()
	 * @generated
	 */
	EAttribute getConformanceResource_Publisher();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.mdht.uml.fhir.ConformanceResource#getContacts <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contact</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ConformanceResource#getContacts()
	 * @see #getConformanceResource()
	 * @generated
	 */
	EReference getConformanceResource_Contact();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.ConformanceResource#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ConformanceResource#getDate()
	 * @see #getConformanceResource()
	 * @generated
	 */
	EAttribute getConformanceResource_Date();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.mdht.uml.fhir.ConformanceResource#getUseContexts <em>Use Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Use Context</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ConformanceResource#getUseContexts()
	 * @see #getConformanceResource()
	 * @generated
	 */
	EReference getConformanceResource_UseContext();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.ConformanceResource#getCopyright <em>Copyright</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Copyright</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ConformanceResource#getCopyright()
	 * @see #getConformanceResource()
	 * @generated
	 */
	EAttribute getConformanceResource_Copyright();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.eclipse.mdht.uml.fhir.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.Element#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.mdht.uml.fhir.Element#getId()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Id();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.Element#getExtensions <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extension</em>'.
	 * @see org.eclipse.mdht.uml.fhir.Element#getExtensions()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_Extension();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.ElementDefinition <em>Element Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Definition</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ElementDefinition
	 * @generated
	 */
	EClass getElementDefinition();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.ElementDefinition#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ElementDefinition#getBase_Property()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Base_Property();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.ElementDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ElementDefinition#getName()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EAttribute getElementDefinition_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.ElementDefinition#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ElementDefinition#getLabel()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EAttribute getElementDefinition_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.ElementDefinition#getMustSupport <em>Must Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Must Support</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ElementDefinition#getMustSupport()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EAttribute getElementDefinition_MustSupport();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.ElementDefinition#getIsModifier <em>Is Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Modifier</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ElementDefinition#getIsModifier()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EAttribute getElementDefinition_IsModifier();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.ElementDefinition#getIsSummary <em>Is Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Summary</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ElementDefinition#getIsSummary()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EAttribute getElementDefinition_IsSummary();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.mdht.uml.fhir.ElementDefinition#getRepresentations <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Representation</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ElementDefinition#getRepresentations()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EAttribute getElementDefinition_Representation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.mdht.uml.fhir.ElementDefinition#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ElementDefinition#getDefault()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Default();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.ElementDefinition#getMeaningWhenMissing <em>Meaning When Missing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meaning When Missing</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ElementDefinition#getMeaningWhenMissing()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EAttribute getElementDefinition_MeaningWhenMissing();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.mdht.uml.fhir.ElementDefinition#getFixed <em>Fixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fixed</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ElementDefinition#getFixed()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Fixed();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.mdht.uml.fhir.ElementDefinition#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pattern</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ElementDefinition#getPattern()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Pattern();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.mdht.uml.fhir.ElementDefinition#getExample <em>Example</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Example</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ElementDefinition#getExample()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EReference getElementDefinition_Example();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.ElementDefinition#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ElementDefinition#getComment()
	 * @see #getElementDefinition()
	 * @generated
	 */
	EAttribute getElementDefinition_Comment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.ShortDescription <em>Short Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Short Description</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ShortDescription
	 * @generated
	 */
	EClass getShortDescription();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.ShortDescription#getBase_Comment <em>Base Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Comment</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ShortDescription#getBase_Comment()
	 * @see #getShortDescription()
	 * @generated
	 */
	EReference getShortDescription_Base_Comment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.Description <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description</em>'.
	 * @see org.eclipse.mdht.uml.fhir.Description
	 * @generated
	 */
	EClass getDescription();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.Description#getBase_Comment <em>Base Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Comment</em>'.
	 * @see org.eclipse.mdht.uml.fhir.Description#getBase_Comment()
	 * @see #getDescription()
	 * @generated
	 */
	EReference getDescription_Base_Comment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.Definition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition</em>'.
	 * @see org.eclipse.mdht.uml.fhir.Definition
	 * @generated
	 */
	EClass getDefinition();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.Definition#getBase_Comment <em>Base Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Comment</em>'.
	 * @see org.eclipse.mdht.uml.fhir.Definition#getBase_Comment()
	 * @see #getDefinition()
	 * @generated
	 */
	EReference getDefinition_Base_Comment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.Requirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirements</em>'.
	 * @see org.eclipse.mdht.uml.fhir.Requirements
	 * @generated
	 */
	EClass getRequirements();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.Requirements#getBase_Comment <em>Base Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Comment</em>'.
	 * @see org.eclipse.mdht.uml.fhir.Requirements#getBase_Comment()
	 * @see #getRequirements()
	 * @generated
	 */
	EReference getRequirements_Base_Comment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.Comments <em>Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comments</em>'.
	 * @see org.eclipse.mdht.uml.fhir.Comments
	 * @generated
	 */
	EClass getComments();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.Comments#getBase_Comment <em>Base Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Comment</em>'.
	 * @see org.eclipse.mdht.uml.fhir.Comments#getBase_Comment()
	 * @see #getComments()
	 * @generated
	 */
	EReference getComments_Base_Comment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.ValueSetBinding <em>Value Set Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Set Binding</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ValueSetBinding
	 * @generated
	 */
	EClass getValueSetBinding();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.ValueSetBinding#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ValueSetBinding#getBase_Property()
	 * @see #getValueSetBinding()
	 * @generated
	 */
	EReference getValueSetBinding_Base_Property();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.ValueSetBinding#getStrength <em>Strength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strength</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ValueSetBinding#getStrength()
	 * @see #getValueSetBinding()
	 * @generated
	 */
	EAttribute getValueSetBinding_Strength();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.ValueSetBinding#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ValueSetBinding#getDescription()
	 * @see #getValueSetBinding()
	 * @generated
	 */
	EAttribute getValueSetBinding_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.ValueSetBinding#getValueSetUri <em>Value Set Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Set Uri</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ValueSetBinding#getValueSetUri()
	 * @see #getValueSetBinding()
	 * @generated
	 */
	EAttribute getValueSetBinding_ValueSetUri();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.ValueSetBinding#getValueSetReference <em>Value Set Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Set Reference</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ValueSetBinding#getValueSetReference()
	 * @see #getValueSetBinding()
	 * @generated
	 */
	EReference getValueSetBinding_ValueSetReference();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.ValueSet <em>Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Set</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ValueSet
	 * @generated
	 */
	EClass getValueSet();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.ValueSet#getBase_Enumeration <em>Base Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Enumeration</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ValueSet#getBase_Enumeration()
	 * @see #getValueSet()
	 * @generated
	 */
	EReference getValueSet_Base_Enumeration();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.DataElement <em>Data Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Element</em>'.
	 * @see org.eclipse.mdht.uml.fhir.DataElement
	 * @generated
	 */
	EClass getDataElement();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.DataElement#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.mdht.uml.fhir.DataElement#getBase_Class()
	 * @see #getDataElement()
	 * @generated
	 */
	EReference getDataElement_Base_Class();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.ValueSetMember <em>Value Set Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Set Member</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ValueSetMember
	 * @generated
	 */
	EClass getValueSetMember();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.ValueSetMember#getBase_EnumerationLiteral <em>Base Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Enumeration Literal</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ValueSetMember#getBase_EnumerationLiteral()
	 * @see #getValueSetMember()
	 * @generated
	 */
	EReference getValueSetMember_Base_EnumerationLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.ValueSetMember#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ValueSetMember#getSystem()
	 * @see #getValueSetMember()
	 * @generated
	 */
	EAttribute getValueSetMember_System();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.ValueSetMember#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ValueSetMember#getVersion()
	 * @see #getValueSetMember()
	 * @generated
	 */
	EAttribute getValueSetMember_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.ValueSetMember#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ValueSetMember#getCode()
	 * @see #getValueSetMember()
	 * @generated
	 */
	EAttribute getValueSetMember_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.ValueSetMember#getDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ValueSetMember#getDisplay()
	 * @see #getValueSetMember()
	 * @generated
	 */
	EAttribute getValueSetMember_Display();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.ValueSetMember#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ValueSetMember#getAbstract()
	 * @see #getValueSetMember()
	 * @generated
	 */
	EAttribute getValueSetMember_Abstract();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.ElementSlicing <em>Element Slicing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Slicing</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ElementSlicing
	 * @generated
	 */
	EClass getElementSlicing();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.mdht.uml.fhir.ElementSlicing#getDiscriminators <em>Discriminator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Discriminator</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ElementSlicing#getDiscriminators()
	 * @see #getElementSlicing()
	 * @generated
	 */
	EAttribute getElementSlicing_Discriminator();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.ElementSlicing#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ElementSlicing#getDescription()
	 * @see #getElementSlicing()
	 * @generated
	 */
	EAttribute getElementSlicing_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.ElementSlicing#getOrdered <em>Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordered</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ElementSlicing#getOrdered()
	 * @see #getElementSlicing()
	 * @generated
	 */
	EAttribute getElementSlicing_Ordered();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.ElementSlicing#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rules</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ElementSlicing#getRules()
	 * @see #getElementSlicing()
	 * @generated
	 */
	EAttribute getElementSlicing_Rules();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.ElementSlicing#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see org.eclipse.mdht.uml.fhir.ElementSlicing#getBase_Property()
	 * @see #getElementSlicing()
	 * @generated
	 */
	EReference getElementSlicing_Base_Property();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.SearchParameter <em>Search Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Search Parameter</em>'.
	 * @see org.eclipse.mdht.uml.fhir.SearchParameter
	 * @generated
	 */
	EClass getSearchParameter();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.mdht.uml.fhir.SearchParameter#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.mdht.uml.fhir.SearchParameter#getBase_Class()
	 * @see #getSearchParameter()
	 * @generated
	 */
	EReference getSearchParameter_Base_Class();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.mdht.uml.fhir.SearchParameter#getJurisdictions <em>Jurisdiction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jurisdiction</em>'.
	 * @see org.eclipse.mdht.uml.fhir.SearchParameter#getJurisdictions()
	 * @see #getSearchParameter()
	 * @generated
	 */
	EReference getSearchParameter_Jurisdiction();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.SearchParameter#getPurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purpose</em>'.
	 * @see org.eclipse.mdht.uml.fhir.SearchParameter#getPurpose()
	 * @see #getSearchParameter()
	 * @generated
	 */
	EAttribute getSearchParameter_Purpose();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.SearchParameter#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.eclipse.mdht.uml.fhir.SearchParameter#getCode()
	 * @see #getSearchParameter()
	 * @generated
	 */
	EAttribute getSearchParameter_Code();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.mdht.uml.fhir.SearchParameter#getBases <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Base</em>'.
	 * @see org.eclipse.mdht.uml.fhir.SearchParameter#getBases()
	 * @see #getSearchParameter()
	 * @generated
	 */
	EAttribute getSearchParameter_Base();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.SearchParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.mdht.uml.fhir.SearchParameter#getType()
	 * @see #getSearchParameter()
	 * @generated
	 */
	EAttribute getSearchParameter_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.SearchParameter#getDerivedFrom <em>Derived From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derived From</em>'.
	 * @see org.eclipse.mdht.uml.fhir.SearchParameter#getDerivedFrom()
	 * @see #getSearchParameter()
	 * @generated
	 */
	EAttribute getSearchParameter_DerivedFrom();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.SearchParameter#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.mdht.uml.fhir.SearchParameter#getDescription()
	 * @see #getSearchParameter()
	 * @generated
	 */
	EAttribute getSearchParameter_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.SearchParameter#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.eclipse.mdht.uml.fhir.SearchParameter#getExpression()
	 * @see #getSearchParameter()
	 * @generated
	 */
	EAttribute getSearchParameter_Expression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.SearchParameter#getXpath <em>Xpath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xpath</em>'.
	 * @see org.eclipse.mdht.uml.fhir.SearchParameter#getXpath()
	 * @see #getSearchParameter()
	 * @generated
	 */
	EAttribute getSearchParameter_Xpath();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.SearchParameter#getXpathUsage <em>Xpath Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xpath Usage</em>'.
	 * @see org.eclipse.mdht.uml.fhir.SearchParameter#getXpathUsage()
	 * @see #getSearchParameter()
	 * @generated
	 */
	EAttribute getSearchParameter_XpathUsage();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.mdht.uml.fhir.SearchParameter#getTargets <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Target</em>'.
	 * @see org.eclipse.mdht.uml.fhir.SearchParameter#getTargets()
	 * @see #getSearchParameter()
	 * @generated
	 */
	EAttribute getSearchParameter_Target();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.mdht.uml.fhir.SearchParameter#getComparators <em>Comparator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Comparator</em>'.
	 * @see org.eclipse.mdht.uml.fhir.SearchParameter#getComparators()
	 * @see #getSearchParameter()
	 * @generated
	 */
	EAttribute getSearchParameter_Comparator();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.mdht.uml.fhir.SearchParameter#getModifiers <em>Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Modifier</em>'.
	 * @see org.eclipse.mdht.uml.fhir.SearchParameter#getModifiers()
	 * @see #getSearchParameter()
	 * @generated
	 */
	EAttribute getSearchParameter_Modifier();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.mdht.uml.fhir.SearchParameter#getChains <em>Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Chain</em>'.
	 * @see org.eclipse.mdht.uml.fhir.SearchParameter#getChains()
	 * @see #getSearchParameter()
	 * @generated
	 */
	EAttribute getSearchParameter_Chain();


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.mdht.uml.fhir.SearchParameter#getComponents <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see org.eclipse.mdht.uml.fhir.SearchParameter#getComponents()
	 * @see #getSearchParameter()
	 * @generated
	 */
	EReference getSearchParameter_Component();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.mdht.uml.fhir.SearchParameter#getBaseResources <em>Base Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Base Resource</em>'.
	 * @see org.eclipse.mdht.uml.fhir.SearchParameter#getBaseResources()
	 * @see #getSearchParameter()
	 * @generated
	 */
	EReference getSearchParameter_BaseResource();

	/**
	 * Returns the meta object for class '{@link org.eclipse.mdht.uml.fhir.SearchParameter_ComponentClass <em>Search Parameter Component Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Search Parameter Component Class</em>'.
	 * @see org.eclipse.mdht.uml.fhir.SearchParameter_ComponentClass
	 * @generated
	 */
	EClass getSearchParameter_ComponentClass();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.mdht.uml.fhir.SearchParameter_ComponentClass#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Definition</em>'.
	 * @see org.eclipse.mdht.uml.fhir.SearchParameter_ComponentClass#getDefinition()
	 * @see #getSearchParameter_ComponentClass()
	 * @generated
	 */
	EReference getSearchParameter_ComponentClass_Definition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.mdht.uml.fhir.SearchParameter_ComponentClass#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see org.eclipse.mdht.uml.fhir.SearchParameter_ComponentClass#getExpression()
	 * @see #getSearchParameter_ComponentClass()
	 * @generated
	 */
	EAttribute getSearchParameter_ComponentClass_Expression();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.DerivationKind <em>Derivation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Derivation Kind</em>'.
	 * @see org.eclipse.mdht.uml.fhir.DerivationKind
	 * @generated
	 */
	EEnum getDerivationKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.PropertyRepresentationKind <em>Property Representation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Property Representation Kind</em>'.
	 * @see org.eclipse.mdht.uml.fhir.PropertyRepresentationKind
	 * @generated
	 */
	EEnum getPropertyRepresentationKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.BindingStrengthKind <em>Binding Strength Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binding Strength Kind</em>'.
	 * @see org.eclipse.mdht.uml.fhir.BindingStrengthKind
	 * @generated
	 */
	EEnum getBindingStrengthKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.mdht.uml.fhir.SlicingRulesKind <em>Slicing Rules Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Slicing Rules Kind</em>'.
	 * @see org.eclipse.mdht.uml.fhir.SlicingRulesKind
	 * @generated
	 */
	EEnum getSlicingRulesKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FHIRFactory getFHIRFactory();

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
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.impl.TypeChoiceImpl <em>Type Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.impl.TypeChoiceImpl
		 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getTypeChoice()
		 * @generated
		 */
		EClass TYPE_CHOICE = eINSTANCE.getTypeChoice();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_CHOICE__BASE_PROPERTY = eINSTANCE.getTypeChoice_Base_Property();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_CHOICE__TYPES = eINSTANCE.getTypeChoice_Types();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.impl.StructureDefinitionImpl <em>Structure Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.impl.StructureDefinitionImpl
		 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getStructureDefinition()
		 * @generated
		 */
		EClass STRUCTURE_DEFINITION = eINSTANCE.getStructureDefinition();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE_DEFINITION__BASE_CLASS = eINSTANCE.getStructureDefinition_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Display</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURE_DEFINITION__DISPLAY = eINSTANCE.getStructureDefinition_Display();

		/**
		 * The meta object literal for the '<em><b>Context Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURE_DEFINITION__CONTEXT_TYPE = eINSTANCE.getStructureDefinition_ContextType();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURE_DEFINITION__CONTEXT = eINSTANCE.getStructureDefinition_Context();

		/**
		 * The meta object literal for the '<em><b>Is Logical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURE_DEFINITION__IS_LOGICAL = eINSTANCE.getStructureDefinition_IsLogical();

		/**
		 * The meta object literal for the '<em><b>Derivation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURE_DEFINITION__DERIVATION = eINSTANCE.getStructureDefinition_Derivation();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.impl.ConformanceResourceImpl <em>Conformance Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.impl.ConformanceResourceImpl
		 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getConformanceResource()
		 * @generated
		 */
		EClass CONFORMANCE_RESOURCE = eINSTANCE.getConformanceResource();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFORMANCE_RESOURCE__URI = eINSTANCE.getConformanceResource_Uri();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFORMANCE_RESOURCE__VERSION = eINSTANCE.getConformanceResource_Version();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFORMANCE_RESOURCE__NAME = eINSTANCE.getConformanceResource_Name();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFORMANCE_RESOURCE__STATUS = eINSTANCE.getConformanceResource_Status();

		/**
		 * The meta object literal for the '<em><b>Experimental</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFORMANCE_RESOURCE__EXPERIMENTAL = eINSTANCE.getConformanceResource_Experimental();

		/**
		 * The meta object literal for the '<em><b>Publisher</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFORMANCE_RESOURCE__PUBLISHER = eINSTANCE.getConformanceResource_Publisher();

		/**
		 * The meta object literal for the '<em><b>Contact</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFORMANCE_RESOURCE__CONTACT = eINSTANCE.getConformanceResource_Contact();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFORMANCE_RESOURCE__DATE = eINSTANCE.getConformanceResource_Date();

		/**
		 * The meta object literal for the '<em><b>Use Context</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFORMANCE_RESOURCE__USE_CONTEXT = eINSTANCE.getConformanceResource_UseContext();

		/**
		 * The meta object literal for the '<em><b>Copyright</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFORMANCE_RESOURCE__COPYRIGHT = eINSTANCE.getConformanceResource_Copyright();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.impl.ElementImpl
		 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__ID = eINSTANCE.getElement_Id();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__EXTENSION = eINSTANCE.getElement_Extension();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.impl.ElementDefinitionImpl <em>Element Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.impl.ElementDefinitionImpl
		 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getElementDefinition()
		 * @generated
		 */
		EClass ELEMENT_DEFINITION = eINSTANCE.getElementDefinition();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__BASE_PROPERTY = eINSTANCE.getElementDefinition_Base_Property();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_DEFINITION__NAME = eINSTANCE.getElementDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_DEFINITION__LABEL = eINSTANCE.getElementDefinition_Label();

		/**
		 * The meta object literal for the '<em><b>Must Support</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_DEFINITION__MUST_SUPPORT = eINSTANCE.getElementDefinition_MustSupport();

		/**
		 * The meta object literal for the '<em><b>Is Modifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_DEFINITION__IS_MODIFIER = eINSTANCE.getElementDefinition_IsModifier();

		/**
		 * The meta object literal for the '<em><b>Is Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_DEFINITION__IS_SUMMARY = eINSTANCE.getElementDefinition_IsSummary();

		/**
		 * The meta object literal for the '<em><b>Representation</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_DEFINITION__REPRESENTATION = eINSTANCE.getElementDefinition_Representation();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__DEFAULT = eINSTANCE.getElementDefinition_Default();

		/**
		 * The meta object literal for the '<em><b>Meaning When Missing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_DEFINITION__MEANING_WHEN_MISSING = eINSTANCE.getElementDefinition_MeaningWhenMissing();

		/**
		 * The meta object literal for the '<em><b>Fixed</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__FIXED = eINSTANCE.getElementDefinition_Fixed();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__PATTERN = eINSTANCE.getElementDefinition_Pattern();

		/**
		 * The meta object literal for the '<em><b>Example</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_DEFINITION__EXAMPLE = eINSTANCE.getElementDefinition_Example();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_DEFINITION__COMMENT = eINSTANCE.getElementDefinition_Comment();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.impl.ShortDescriptionImpl <em>Short Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.impl.ShortDescriptionImpl
		 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getShortDescription()
		 * @generated
		 */
		EClass SHORT_DESCRIPTION = eINSTANCE.getShortDescription();

		/**
		 * The meta object literal for the '<em><b>Base Comment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHORT_DESCRIPTION__BASE_COMMENT = eINSTANCE.getShortDescription_Base_Comment();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.impl.DescriptionImpl <em>Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.impl.DescriptionImpl
		 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getDescription()
		 * @generated
		 */
		EClass DESCRIPTION = eINSTANCE.getDescription();

		/**
		 * The meta object literal for the '<em><b>Base Comment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIPTION__BASE_COMMENT = eINSTANCE.getDescription_Base_Comment();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.impl.DefinitionImpl <em>Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.impl.DefinitionImpl
		 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getDefinition()
		 * @generated
		 */
		EClass DEFINITION = eINSTANCE.getDefinition();

		/**
		 * The meta object literal for the '<em><b>Base Comment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINITION__BASE_COMMENT = eINSTANCE.getDefinition_Base_Comment();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.impl.RequirementsImpl <em>Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.impl.RequirementsImpl
		 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getRequirements()
		 * @generated
		 */
		EClass REQUIREMENTS = eINSTANCE.getRequirements();

		/**
		 * The meta object literal for the '<em><b>Base Comment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS__BASE_COMMENT = eINSTANCE.getRequirements_Base_Comment();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.impl.CommentsImpl <em>Comments</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.impl.CommentsImpl
		 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getComments()
		 * @generated
		 */
		EClass COMMENTS = eINSTANCE.getComments();

		/**
		 * The meta object literal for the '<em><b>Base Comment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMENTS__BASE_COMMENT = eINSTANCE.getComments_Base_Comment();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.impl.ValueSetBindingImpl <em>Value Set Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.impl.ValueSetBindingImpl
		 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getValueSetBinding()
		 * @generated
		 */
		EClass VALUE_SET_BINDING = eINSTANCE.getValueSetBinding();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_SET_BINDING__BASE_PROPERTY = eINSTANCE.getValueSetBinding_Base_Property();

		/**
		 * The meta object literal for the '<em><b>Strength</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_SET_BINDING__STRENGTH = eINSTANCE.getValueSetBinding_Strength();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_SET_BINDING__DESCRIPTION = eINSTANCE.getValueSetBinding_Description();

		/**
		 * The meta object literal for the '<em><b>Value Set Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_SET_BINDING__VALUE_SET_URI = eINSTANCE.getValueSetBinding_ValueSetUri();

		/**
		 * The meta object literal for the '<em><b>Value Set Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_SET_BINDING__VALUE_SET_REFERENCE = eINSTANCE.getValueSetBinding_ValueSetReference();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.impl.ValueSetImpl <em>Value Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.impl.ValueSetImpl
		 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getValueSet()
		 * @generated
		 */
		EClass VALUE_SET = eINSTANCE.getValueSet();

		/**
		 * The meta object literal for the '<em><b>Base Enumeration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_SET__BASE_ENUMERATION = eINSTANCE.getValueSet_Base_Enumeration();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.impl.DataElementImpl <em>Data Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.impl.DataElementImpl
		 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getDataElement()
		 * @generated
		 */
		EClass DATA_ELEMENT = eINSTANCE.getDataElement();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ELEMENT__BASE_CLASS = eINSTANCE.getDataElement_Base_Class();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.impl.ValueSetMemberImpl <em>Value Set Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.impl.ValueSetMemberImpl
		 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getValueSetMember()
		 * @generated
		 */
		EClass VALUE_SET_MEMBER = eINSTANCE.getValueSetMember();

		/**
		 * The meta object literal for the '<em><b>Base Enumeration Literal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_SET_MEMBER__BASE_ENUMERATION_LITERAL = eINSTANCE.getValueSetMember_Base_EnumerationLiteral();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_SET_MEMBER__SYSTEM = eINSTANCE.getValueSetMember_System();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_SET_MEMBER__VERSION = eINSTANCE.getValueSetMember_Version();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_SET_MEMBER__CODE = eINSTANCE.getValueSetMember_Code();

		/**
		 * The meta object literal for the '<em><b>Display</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_SET_MEMBER__DISPLAY = eINSTANCE.getValueSetMember_Display();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_SET_MEMBER__ABSTRACT = eINSTANCE.getValueSetMember_Abstract();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.impl.ElementSlicingImpl <em>Element Slicing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.impl.ElementSlicingImpl
		 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getElementSlicing()
		 * @generated
		 */
		EClass ELEMENT_SLICING = eINSTANCE.getElementSlicing();

		/**
		 * The meta object literal for the '<em><b>Discriminator</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_SLICING__DISCRIMINATOR = eINSTANCE.getElementSlicing_Discriminator();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_SLICING__DESCRIPTION = eINSTANCE.getElementSlicing_Description();

		/**
		 * The meta object literal for the '<em><b>Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_SLICING__ORDERED = eINSTANCE.getElementSlicing_Ordered();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_SLICING__RULES = eINSTANCE.getElementSlicing_Rules();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_SLICING__BASE_PROPERTY = eINSTANCE.getElementSlicing_Base_Property();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.impl.SearchParameterImpl <em>Search Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.impl.SearchParameterImpl
		 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getSearchParameter()
		 * @generated
		 */
		EClass SEARCH_PARAMETER = eINSTANCE.getSearchParameter();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEARCH_PARAMETER__BASE_CLASS = eINSTANCE.getSearchParameter_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Jurisdiction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEARCH_PARAMETER__JURISDICTION = eINSTANCE.getSearchParameter_Jurisdiction();

		/**
		 * The meta object literal for the '<em><b>Purpose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH_PARAMETER__PURPOSE = eINSTANCE.getSearchParameter_Purpose();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH_PARAMETER__CODE = eINSTANCE.getSearchParameter_Code();

		/**
		 * The meta object literal for the '<em><b>Base</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH_PARAMETER__BASE = eINSTANCE.getSearchParameter_Base();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH_PARAMETER__TYPE = eINSTANCE.getSearchParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Derived From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH_PARAMETER__DERIVED_FROM = eINSTANCE.getSearchParameter_DerivedFrom();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH_PARAMETER__DESCRIPTION = eINSTANCE.getSearchParameter_Description();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH_PARAMETER__EXPRESSION = eINSTANCE.getSearchParameter_Expression();

		/**
		 * The meta object literal for the '<em><b>Xpath</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH_PARAMETER__XPATH = eINSTANCE.getSearchParameter_Xpath();

		/**
		 * The meta object literal for the '<em><b>Xpath Usage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH_PARAMETER__XPATH_USAGE = eINSTANCE.getSearchParameter_XpathUsage();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH_PARAMETER__TARGET = eINSTANCE.getSearchParameter_Target();

		/**
		 * The meta object literal for the '<em><b>Comparator</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH_PARAMETER__COMPARATOR = eINSTANCE.getSearchParameter_Comparator();

		/**
		 * The meta object literal for the '<em><b>Modifier</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH_PARAMETER__MODIFIER = eINSTANCE.getSearchParameter_Modifier();

		/**
		 * The meta object literal for the '<em><b>Chain</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH_PARAMETER__CHAIN = eINSTANCE.getSearchParameter_Chain();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEARCH_PARAMETER__COMPONENT = eINSTANCE.getSearchParameter_Component();

		/**
		 * The meta object literal for the '<em><b>Base Resource</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEARCH_PARAMETER__BASE_RESOURCE = eINSTANCE.getSearchParameter_BaseResource();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.impl.SearchParameter_ComponentClassImpl <em>Search Parameter Component Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.impl.SearchParameter_ComponentClassImpl
		 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getSearchParameter_ComponentClass()
		 * @generated
		 */
		EClass SEARCH_PARAMETER_COMPONENT_CLASS = eINSTANCE.getSearchParameter_ComponentClass();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEARCH_PARAMETER_COMPONENT_CLASS__DEFINITION = eINSTANCE.getSearchParameter_ComponentClass_Definition();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH_PARAMETER_COMPONENT_CLASS__EXPRESSION = eINSTANCE.getSearchParameter_ComponentClass_Expression();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.DerivationKind <em>Derivation Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.DerivationKind
		 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getDerivationKind()
		 * @generated
		 */
		EEnum DERIVATION_KIND = eINSTANCE.getDerivationKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.PropertyRepresentationKind <em>Property Representation Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.PropertyRepresentationKind
		 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getPropertyRepresentationKind()
		 * @generated
		 */
		EEnum PROPERTY_REPRESENTATION_KIND = eINSTANCE.getPropertyRepresentationKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.BindingStrengthKind <em>Binding Strength Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.BindingStrengthKind
		 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getBindingStrengthKind()
		 * @generated
		 */
		EEnum BINDING_STRENGTH_KIND = eINSTANCE.getBindingStrengthKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.mdht.uml.fhir.SlicingRulesKind <em>Slicing Rules Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.mdht.uml.fhir.SlicingRulesKind
		 * @see org.eclipse.mdht.uml.fhir.impl.FHIRPackageImpl#getSlicingRulesKind()
		 * @generated
		 */
		EEnum SLICING_RULES_KIND = eINSTANCE.getSlicingRulesKind();

	}

} //FHIRPackage
