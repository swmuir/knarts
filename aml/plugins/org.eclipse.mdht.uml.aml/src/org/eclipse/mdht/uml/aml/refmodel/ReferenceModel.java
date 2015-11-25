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

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.aml.refmodel.ReferenceModel#getBase_Package <em>Base Package</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.refmodel.ReferenceModel#getRmPublisher <em>Rm Publisher</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.refmodel.ReferenceModel#getRmNamespace <em>Rm Namespace</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.aml.refmodel.ReferenceModel#getRmVersion <em>Rm Version</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.aml.refmodel.RefModelPackage#getReferenceModel()
 * @model
 * @generated
 */
public interface ReferenceModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Package</em>' reference.
	 * @see #setBase_Package(org.eclipse.uml2.uml.Package)
	 * @see org.eclipse.mdht.uml.aml.refmodel.RefModelPackage#getReferenceModel_Base_Package()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Package getBase_Package();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.refmodel.ReferenceModel#getBase_Package <em>Base Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Package</em>' reference.
	 * @see #getBase_Package()
	 * @generated
	 */
	void setBase_Package(org.eclipse.uml2.uml.Package value);

	/**
	 * Returns the value of the '<em><b>Rm Publisher</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rm Publisher</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rm Publisher</em>' attribute.
	 * @see #setRmPublisher(String)
	 * @see org.eclipse.mdht.uml.aml.refmodel.RefModelPackage#getReferenceModel_RmPublisher()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getRmPublisher();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.refmodel.ReferenceModel#getRmPublisher <em>Rm Publisher</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rm Publisher</em>' attribute.
	 * @see #getRmPublisher()
	 * @generated
	 */
	void setRmPublisher(String value);

	/**
	 * Returns the value of the '<em><b>Rm Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rm Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rm Namespace</em>' attribute.
	 * @see #setRmNamespace(String)
	 * @see org.eclipse.mdht.uml.aml.refmodel.RefModelPackage#getReferenceModel_RmNamespace()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getRmNamespace();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.refmodel.ReferenceModel#getRmNamespace <em>Rm Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rm Namespace</em>' attribute.
	 * @see #getRmNamespace()
	 * @generated
	 */
	void setRmNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Rm Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rm Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rm Version</em>' attribute.
	 * @see #setRmVersion(String)
	 * @see org.eclipse.mdht.uml.aml.refmodel.RefModelPackage#getReferenceModel_RmVersion()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getRmVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.aml.refmodel.ReferenceModel#getRmVersion <em>Rm Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rm Version</em>' attribute.
	 * @see #getRmVersion()
	 * @generated
	 */
	void setRmVersion(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The requirement that there is a specified rmPublisher is enforced by the UML Semantic for the required tag rmPublisher.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='[AOM] ARCHETYPE_HRID:Invariant:Rm_publisher_validity'"
	 * @generated
	 */
	boolean validateAOMARCHETYPEHRIDInvariantRmPublisherValidity(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ReferenceModel
