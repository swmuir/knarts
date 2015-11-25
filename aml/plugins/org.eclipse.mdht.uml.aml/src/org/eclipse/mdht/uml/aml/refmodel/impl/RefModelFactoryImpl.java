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
package org.eclipse.mdht.uml.aml.refmodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.mdht.uml.aml.refmodel.Infrastructure;
import org.eclipse.mdht.uml.aml.refmodel.MappedDataType;
import org.eclipse.mdht.uml.aml.refmodel.RefModelFactory;
import org.eclipse.mdht.uml.aml.refmodel.RefModelPackage;
import org.eclipse.mdht.uml.aml.refmodel.ReferenceModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RefModelFactoryImpl extends EFactoryImpl implements RefModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RefModelFactory init() {
		try {
			RefModelFactory theRefModelFactory = (RefModelFactory)EPackage.Registry.INSTANCE.getEFactory(RefModelPackage.eNS_URI);
			if (theRefModelFactory != null) {
				return theRefModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RefModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RefModelPackage.INFRASTRUCTURE: return createInfrastructure();
			case RefModelPackage.RUNTIME: return createRuntime();
			case RefModelPackage.REFERENCE_MODEL: return createReferenceModel();
			case RefModelPackage.MAPPED_DATA_TYPE: return createMappedDataType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Infrastructure createInfrastructure() {
		InfrastructureImpl infrastructure = new InfrastructureImpl();
		return infrastructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.aml.refmodel.Runtime createRuntime() {
		RuntimeImpl runtime = new RuntimeImpl();
		return runtime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceModel createReferenceModel() {
		ReferenceModelImpl referenceModel = new ReferenceModelImpl();
		return referenceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappedDataType createMappedDataType() {
		MappedDataTypeImpl mappedDataType = new MappedDataTypeImpl();
		return mappedDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefModelPackage getRefModelPackage() {
		return (RefModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RefModelPackage getPackage() {
		return RefModelPackage.eINSTANCE;
	}

} //RefModelFactoryImpl
