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
package org.eclipse.mdht.uml.aml.refmodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.aml.refmodel.RefModelPackage
 * @generated
 */
public interface RefModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RefModelFactory eINSTANCE = org.eclipse.mdht.uml.aml.refmodel.impl.RefModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Infrastructure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Infrastructure</em>'.
	 * @generated
	 */
	Infrastructure createInfrastructure();

	/**
	 * Returns a new object of class '<em>Runtime</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Runtime</em>'.
	 * @generated
	 */
	Runtime createRuntime();

	/**
	 * Returns a new object of class '<em>Reference Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference Model</em>'.
	 * @generated
	 */
	ReferenceModel createReferenceModel();

	/**
	 * Returns a new object of class '<em>Mapped Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapped Data Type</em>'.
	 * @generated
	 */
	MappedDataType createMappedDataType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RefModelPackage getRefModelPackage();

} //RefModelFactory
