/*******************************************************************************
 * Copyright (c) 2010, 2011 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.eclipse.mdht.uml.hl7.rim.operations;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.mdht.uml.hl7.rim.RIMPackage;
import org.eclipse.mdht.uml.hl7.rim.Role;
import org.eclipse.mdht.uml.hl7.rim.RoleLink;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Role Link</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.hl7.rim.RoleLink#getTypeCode() <em>Get Type Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.hl7.rim.RoleLink#getTarget() <em>Get Target</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.hl7.rim.RoleLink#getSource() <em>Get Source</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.hl7.rim.RoleLink#isTypeCodeDefined() <em>Is Type Code Defined</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleLinkOperations extends InfrastructureRootOperations {
	/**
	 * The cached environment for evaluating OCL expressions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleLinkOperations() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Enumerator getTypeCode(RoleLink roleLink) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Role getTarget(RoleLink roleLink) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Role getSource(RoleLink roleLink) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached OCL expression body for the '{@link #isTypeCodeDefined(RoleLink) <em>Is Type Code Defined</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTypeCodeDefined(RoleLink)
	 * @generated
	 * @ordered
	 */
	protected static final String IS_TYPE_CODE_DEFINED__EOCL_EXP = "self.isDefined('typeCode')";

	/**
	 * The cached OCL query for the '{@link #isTypeCodeDefined(RoleLink) <em>Is Type Code Defined</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTypeCodeDefined(RoleLink)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<OCLExpression<EClassifier>> IS_TYPE_CODE_DEFINED__EOCL_QRY = new ThreadLocal<OCLExpression<EClassifier>>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static boolean isTypeCodeDefined(RoleLink roleLink) {
		if (IS_TYPE_CODE_DEFINED__EOCL_QRY == null) {
			synchronized (EOCL_ENV) {
				OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
				helper.setOperationContext(
					RIMPackage.Literals.ROLE_LINK, RIMPackage.Literals.ROLE_LINK.getEAllOperations().get(11));
				try {
					IS_TYPE_CODE_DEFINED__EOCL_QRY.set(helper.createQuery(IS_TYPE_CODE_DEFINED__EOCL_EXP));
				} catch (ParserException pe) {
					throw new UnsupportedOperationException(pe.getLocalizedMessage());
				}
			}
		}
		OCL.Query query = EOCL_ENV.get().createQuery(IS_TYPE_CODE_DEFINED__EOCL_QRY.get());
		return ((Boolean) query.evaluate(roleLink)).booleanValue();
	}

} // RoleLinkOperations
