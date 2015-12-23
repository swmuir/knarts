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
import org.eclipse.mdht.uml.fhir.core.datatype.Base;
import org.eclipse.mdht.uml.fhir.core.datatype.Code;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Definition Parameter Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.OperationDefinitionParameterBinding#getStrength <em>Strength</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.OperationDefinitionParameterBinding#getValueSetx <em>Value Setx</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getOperationDefinitionParameterBinding()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Parameter_Binding'"
 * @generated
 */
public interface OperationDefinitionParameterBinding extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Strength</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strength</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strength</em>' reference.
	 * @see #setStrength(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getOperationDefinitionParameterBinding_Strength()
	 * @model required="true"
	 * @generated
	 */
	Code getStrength();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.OperationDefinitionParameterBinding#getStrength <em>Strength</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strength</em>' reference.
	 * @see #getStrength()
	 * @generated
	 */
	void setStrength(Code value);

	/**
	 * Returns the value of the '<em><b>Value Setx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Setx</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Setx</em>' reference.
	 * @see #setValueSetx(Base)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getOperationDefinitionParameterBinding_ValueSetx()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='valueSet[x]'"
	 * @generated
	 */
	Base getValueSetx();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.OperationDefinitionParameterBinding#getValueSetx <em>Value Setx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Setx</em>' reference.
	 * @see #getValueSetx()
	 * @generated
	 */
	void setValueSetx(Base value);

} // OperationDefinitionParameterBinding
