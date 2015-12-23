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
package org.eclipse.mdht.uml.fhir.core.datatype.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage;
import org.eclipse.mdht.uml.fhir.core.datatype.Oid;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Oid</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class OidImpl extends UriImpl implements Oid {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OidImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirDatatypePackage.Literals.OID;
	}

} //OidImpl
