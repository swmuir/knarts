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

import org.eclipse.emf.common.util.EList;

import org.eclipse.mdht.uml.fhir.core.datatype.BackboneElement;
import org.eclipse.mdht.uml.fhir.core.datatype.Code;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Definition Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.OperationDefinitionParameter#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.OperationDefinitionParameter#getUse <em>Use</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.OperationDefinitionParameter#getMin <em>Min</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.OperationDefinitionParameter#getMax <em>Max</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.OperationDefinitionParameter#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.OperationDefinitionParameter#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.OperationDefinitionParameter#getProfile <em>Profile</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.OperationDefinitionParameter#getBinding <em>Binding</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.OperationDefinitionParameter#getParts <em>Part</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getOperationDefinitionParameter()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='OperationDefinition_Parameter'"
 * @generated
 */
public interface OperationDefinitionParameter extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' reference.
	 * @see #setName(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getOperationDefinitionParameter_Name()
	 * @model required="true"
	 * @generated
	 */
	Code getName();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.OperationDefinitionParameter#getName <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(Code value);

	/**
	 * Returns the value of the '<em><b>Use</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use</em>' reference.
	 * @see #setUse(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getOperationDefinitionParameter_Use()
	 * @model required="true"
	 * @generated
	 */
	Code getUse();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.OperationDefinitionParameter#getUse <em>Use</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use</em>' reference.
	 * @see #getUse()
	 * @generated
	 */
	void setUse(Code value);

	/**
	 * Returns the value of the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' reference.
	 * @see #setMin(org.eclipse.mdht.uml.fhir.core.datatype.Integer)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getOperationDefinitionParameter_Min()
	 * @model required="true"
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.Integer getMin();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.OperationDefinitionParameter#getMin <em>Min</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' reference.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(org.eclipse.mdht.uml.fhir.core.datatype.Integer value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' reference.
	 * @see #setMax(org.eclipse.mdht.uml.fhir.core.datatype.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getOperationDefinitionParameter_Max()
	 * @model required="true"
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.String getMax();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.OperationDefinitionParameter#getMax <em>Max</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' reference.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(org.eclipse.mdht.uml.fhir.core.datatype.String value);

	/**
	 * Returns the value of the '<em><b>Documentation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation</em>' reference.
	 * @see #setDocumentation(org.eclipse.mdht.uml.fhir.core.datatype.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getOperationDefinitionParameter_Documentation()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.String getDocumentation();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.OperationDefinitionParameter#getDocumentation <em>Documentation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Documentation</em>' reference.
	 * @see #getDocumentation()
	 * @generated
	 */
	void setDocumentation(org.eclipse.mdht.uml.fhir.core.datatype.String value);

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
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getOperationDefinitionParameter_Type()
	 * @model
	 * @generated
	 */
	Code getType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.OperationDefinitionParameter#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Code value);

	/**
	 * Returns the value of the '<em><b>Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile</em>' reference.
	 * @see #setProfile(StructureDefinition)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getOperationDefinitionParameter_Profile()
	 * @model
	 * @generated
	 */
	StructureDefinition getProfile();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.OperationDefinitionParameter#getProfile <em>Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile</em>' reference.
	 * @see #getProfile()
	 * @generated
	 */
	void setProfile(StructureDefinition value);

	/**
	 * Returns the value of the '<em><b>Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' containment reference.
	 * @see #setBinding(OperationDefinitionParameterBinding)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getOperationDefinitionParameter_Binding()
	 * @model containment="true"
	 * @generated
	 */
	OperationDefinitionParameterBinding getBinding();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.OperationDefinitionParameter#getBinding <em>Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding</em>' containment reference.
	 * @see #getBinding()
	 * @generated
	 */
	void setBinding(OperationDefinitionParameterBinding value);

	/**
	 * Returns the value of the '<em><b>Part</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resource.OperationDefinitionParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getOperationDefinitionParameter_Part()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationDefinitionParameter> getParts();

} // OperationDefinitionParameter
