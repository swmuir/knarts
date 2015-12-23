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
package org.eclipse.mdht.uml.fhir.core.resource;

import org.eclipse.mdht.uml.fhir.core.datatype.BackboneElement;
import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure Focal Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ProcedureFocalDevice#getAction <em>Action</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ProcedureFocalDevice#getManipulated <em>Manipulated</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getProcedureFocalDevice()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Procedure_FocalDevice'"
 * @generated
 */
public interface ProcedureFocalDevice extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference.
	 * @see #setAction(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getProcedureFocalDevice_Action()
	 * @model
	 * @generated
	 */
	CodeableConcept getAction();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ProcedureFocalDevice#getAction <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Manipulated</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manipulated</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manipulated</em>' reference.
	 * @see #setManipulated(Device)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getProcedureFocalDevice_Manipulated()
	 * @model required="true"
	 * @generated
	 */
	Device getManipulated();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ProcedureFocalDevice#getManipulated <em>Manipulated</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manipulated</em>' reference.
	 * @see #getManipulated()
	 * @generated
	 */
	void setManipulated(Device value);

} // ProcedureFocalDevice
