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
import org.eclipse.mdht.uml.fhir.core.datatype.Code;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Patient Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.PatientLink#getOther <em>Other</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.PatientLink#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getPatientLink()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Patient_Link'"
 * @generated
 */
public interface PatientLink extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Other</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other</em>' reference.
	 * @see #setOther(Patient)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getPatientLink_Other()
	 * @model required="true"
	 * @generated
	 */
	Patient getOther();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.PatientLink#getOther <em>Other</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other</em>' reference.
	 * @see #getOther()
	 * @generated
	 */
	void setOther(Patient value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getPatientLink_Type()
	 * @model required="true"
	 * @generated
	 */
	Code getType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.PatientLink#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Code value);

} // PatientLink
