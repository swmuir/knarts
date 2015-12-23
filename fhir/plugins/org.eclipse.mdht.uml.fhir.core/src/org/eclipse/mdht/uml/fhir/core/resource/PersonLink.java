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
 * A representation of the model object '<em><b>Person Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.PersonLink#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.PersonLink#getAssurance <em>Assurance</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getPersonLink()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Person_Link'"
 * @generated
 */
public interface PersonLink extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Resource)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getPersonLink_Target()
	 * @model required="true"
	 * @generated
	 */
	Resource getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.PersonLink#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Resource value);

	/**
	 * Returns the value of the '<em><b>Assurance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assurance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assurance</em>' reference.
	 * @see #setAssurance(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getPersonLink_Assurance()
	 * @model
	 * @generated
	 */
	Code getAssurance();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.PersonLink#getAssurance <em>Assurance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assurance</em>' reference.
	 * @see #getAssurance()
	 * @generated
	 */
	void setAssurance(Code value);

} // PersonLink
