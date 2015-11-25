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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdht.uml.aml.terminology.TerminologyPackage
 * @generated
 */
public interface TerminologyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TerminologyFactory eINSTANCE = org.eclipse.mdht.uml.aml.terminology.impl.TerminologyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Identified Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Identified Item</em>'.
	 * @generated
	 */
	IdentifiedItem createIdentifiedItem();

	/**
	 * Returns a new object of class '<em>Permissible Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Permissible Value</em>'.
	 * @generated
	 */
	PermissibleValue createPermissibleValue();

	/**
	 * Returns a new object of class '<em>Scoped Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scoped Identifier</em>'.
	 * @generated
	 */
	ScopedIdentifier createScopedIdentifier();

	/**
	 * Returns a new object of class '<em>Enumerated Value Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumerated Value Domain</em>'.
	 * @generated
	 */
	EnumeratedValueDomain createEnumeratedValueDomain();

	/**
	 * Returns a new object of class '<em>Code System Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code System Reference</em>'.
	 * @generated
	 */
	CodeSystemReference createCodeSystemReference();

	/**
	 * Returns a new object of class '<em>Code System Version Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code System Version Reference</em>'.
	 * @generated
	 */
	CodeSystemVersionReference createCodeSystemVersionReference();

	/**
	 * Returns a new object of class '<em>Concept Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concept Reference</em>'.
	 * @generated
	 */
	ConceptReference createConceptReference();

	/**
	 * Returns a new object of class '<em>Value Set Definition Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Set Definition Reference</em>'.
	 * @generated
	 */
	ValueSetDefinitionReference createValueSetDefinitionReference();

	/**
	 * Returns a new object of class '<em>Value Set Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Set Reference</em>'.
	 * @generated
	 */
	ValueSetReference createValueSetReference();

	/**
	 * Returns a new object of class '<em>Archetype Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Archetype Term</em>'.
	 * @generated
	 */
	ArchetypeTerm createArchetypeTerm();

	/**
	 * Returns a new object of class '<em>Term Resource Translation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Term Resource Translation</em>'.
	 * @generated
	 */
	TermResourceTranslation createTermResourceTranslation();

	/**
	 * Returns a new object of class '<em>Id Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Id Entry</em>'.
	 * @generated
	 */
	IdEntry createIdEntry();

	/**
	 * Returns a new object of class '<em>Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry</em>'.
	 * @generated
	 */
	Entry createEntry();

	/**
	 * Returns a new object of class '<em>Described Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Described Identifier</em>'.
	 * @generated
	 */
	DescribedIdentifier createDescribedIdentifier();

	/**
	 * Returns a new object of class '<em>about</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>about</em>'.
	 * @generated
	 */
	about createabout();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TerminologyPackage getTerminologyPackage();

} //TerminologyFactory
