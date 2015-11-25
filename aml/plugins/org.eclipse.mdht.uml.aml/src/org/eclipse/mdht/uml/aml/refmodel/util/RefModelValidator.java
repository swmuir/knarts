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
package org.eclipse.mdht.uml.aml.refmodel.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.mdht.uml.aml.refmodel.Infrastructure;
import org.eclipse.mdht.uml.aml.refmodel.MappedDataType;
import org.eclipse.mdht.uml.aml.refmodel.RefModelPackage;
import org.eclipse.mdht.uml.aml.refmodel.ReferenceModel;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.aml.refmodel.RefModelPackage
 * @generated
 */
public class RefModelValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RefModelValidator INSTANCE = new RefModelValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.mdht.uml.aml.refmodel";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate AOMARCHETYPEHRID Invariant Rm Publisher Validity' of 'Reference Model'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REFERENCE_MODEL__AOMARCHETYPEHRID_INVARIANT_RM_PUBLISHER_VALIDITY = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Is AML Data Type' of 'Mapped Data Type'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MAPPED_DATA_TYPE__IS_AML_DATA_TYPE = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefModelValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return RefModelPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case RefModelPackage.INFRASTRUCTURE:
				return validateInfrastructure((Infrastructure)value, diagnostics, context);
			case RefModelPackage.RUNTIME:
				return validateRuntime((org.eclipse.mdht.uml.aml.refmodel.Runtime)value, diagnostics, context);
			case RefModelPackage.REFERENCE_MODEL:
				return validateReferenceModel((ReferenceModel)value, diagnostics, context);
			case RefModelPackage.MAPPED_DATA_TYPE:
				return validateMappedDataType((MappedDataType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfrastructure(Infrastructure infrastructure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(infrastructure, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRuntime(org.eclipse.mdht.uml.aml.refmodel.Runtime runtime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(runtime, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceModel(ReferenceModel referenceModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(referenceModel, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(referenceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(referenceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(referenceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(referenceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(referenceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(referenceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(referenceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(referenceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateReferenceModel_validateAOMARCHETYPEHRIDInvariantRmPublisherValidity(referenceModel, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateAOMARCHETYPEHRIDInvariantRmPublisherValidity constraint of '<em>Reference Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceModel_validateAOMARCHETYPEHRIDInvariantRmPublisherValidity(ReferenceModel referenceModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return referenceModel.validateAOMARCHETYPEHRIDInvariantRmPublisherValidity(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMappedDataType(MappedDataType mappedDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mappedDataType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(mappedDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mappedDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mappedDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(mappedDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mappedDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mappedDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mappedDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mappedDataType, diagnostics, context);
		if (result || diagnostics != null) result &= validateMappedDataType_validateIsAMLDataType(mappedDataType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateIsAMLDataType constraint of '<em>Mapped Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMappedDataType_validateIsAMLDataType(MappedDataType mappedDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mappedDataType.validateIsAMLDataType(diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //RefModelValidator
