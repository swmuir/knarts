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
 * A representation of the model object '<em><b>Ratio</b></em>'.
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
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.Ratio#getNumerator <em>Numerator</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.datatype.Ratio#getDenominator <em>Denominator</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getRatio()
 * @model
 * @generated
 */
public interface Ratio extends DataType {
	/**
	 * Returns the value of the '<em><b>Numerator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numerator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numerator</em>' reference.
	 * @see #setNumerator(Quantity)
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getRatio_Numerator()
	 * @model
	 * @generated
	 */
	Quantity getNumerator();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.datatype.Ratio#getNumerator <em>Numerator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numerator</em>' reference.
	 * @see #getNumerator()
	 * @generated
	 */
	void setNumerator(Quantity value);

	/**
	 * Returns the value of the '<em><b>Denominator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Denominator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Denominator</em>' reference.
	 * @see #setDenominator(Quantity)
	 * @see org.eclipse.mdht.uml.fhir.core.datatype.FhirDatatypePackage#getRatio_Denominator()
	 * @model
	 * @generated
	 */
	Quantity getDenominator();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.datatype.Ratio#getDenominator <em>Denominator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Denominator</em>' reference.
	 * @see #getDenominator()
	 * @generated
	 */
	void setDenominator(Quantity value);

} // Ratio
