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
package org.eclipse.mdht.uml.fhir.types;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Codeable Concept</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.types.CodeableConcept#getCodings <em>Coding</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.types.CodeableConcept#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.types.FHIRTypesPackage#getCodeableConcept()
 * @model
 * @generated
 */
public interface CodeableConcept extends DataType {
	/**
	 * Returns the value of the '<em><b>Coding</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.types.Coding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coding</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coding</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.types.FHIRTypesPackage#getCodeableConcept_Coding()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Coding> getCodings();

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.eclipse.mdht.uml.fhir.types.FHIRTypesPackage#getCodeableConcept_Text()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.types.CodeableConcept#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // CodeableConcept
