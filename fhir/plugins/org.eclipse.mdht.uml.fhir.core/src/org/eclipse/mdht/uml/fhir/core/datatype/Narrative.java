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
package org.eclipse.mdht.uml.fhir.core.datatype;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Narrative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.Narrative#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.Narrative#getDiv <em>Div</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getNarrative()
 * @model
 * @generated
 */
public interface Narrative extends DataType {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getNarrative_Status()
	 * @model required="true"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.datatype.Narrative#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Div</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Div</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Div</em>' containment reference.
	 * @see #setDiv(NarrativeDiv)
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getNarrative_Div()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NarrativeDiv getDiv();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.datatype.Narrative#getDiv <em>Div</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Div</em>' containment reference.
	 * @see #getDiv()
	 * @generated
	 */
	void setDiv(NarrativeDiv value);

} // Narrative
