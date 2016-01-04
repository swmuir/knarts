/*******************************************************************************
 * Copyright (c) 2016 David Carlson and others.
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
 * A representation of the model object '<em><b>Value Set Compose Concept Set Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ValueSetComposeConceptSetFilter#getProperty <em>Property</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ValueSetComposeConceptSetFilter#getOp <em>Op</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ValueSetComposeConceptSetFilter#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getValueSetComposeConceptSetFilter()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ConceptSet_Filter'"
 * @generated
 */
public interface ValueSetComposeConceptSetFilter extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference.
	 * @see #setProperty(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getValueSetComposeConceptSetFilter_Property()
	 * @model required="true"
	 * @generated
	 */
	Code getProperty();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ValueSetComposeConceptSetFilter#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(Code value);

	/**
	 * Returns the value of the '<em><b>Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' reference.
	 * @see #setOp(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getValueSetComposeConceptSetFilter_Op()
	 * @model required="true"
	 * @generated
	 */
	Code getOp();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ValueSetComposeConceptSetFilter#getOp <em>Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' reference.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(Code value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getValueSetComposeConceptSetFilter_Value()
	 * @model required="true"
	 * @generated
	 */
	Code getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ValueSetComposeConceptSetFilter#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Code value);

} // ValueSetComposeConceptSetFilter
