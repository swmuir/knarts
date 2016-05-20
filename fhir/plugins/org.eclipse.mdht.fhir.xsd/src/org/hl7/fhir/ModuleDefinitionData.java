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
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Definition Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The ModuleDefinition resource defines the data requirements for a quality artifact.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ModuleDefinitionData#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ModuleDefinitionData#getProfile <em>Profile</em>}</li>
 *   <li>{@link org.hl7.fhir.ModuleDefinitionData#getMustSupport <em>Must Support</em>}</li>
 *   <li>{@link org.hl7.fhir.ModuleDefinitionData#getCodeFilter <em>Code Filter</em>}</li>
 *   <li>{@link org.hl7.fhir.ModuleDefinitionData#getDateFilter <em>Date Filter</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getModuleDefinitionData()
 * @model extendedMetaData="name='ModuleDefinition.Data' kind='elementOnly'"
 * @generated
 */
public interface ModuleDefinitionData extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the required data, specified as the type name of a resource. For profiles, this value is set to the type of the base resource of the profile.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Code)
	 * @see org.hl7.fhir.FhirPackage#getModuleDefinitionData_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ModuleDefinitionData#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Code value);

	/**
	 * Returns the value of the '<em><b>Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The profile of the required data, specified as the uri of the profile definition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Profile</em>' containment reference.
	 * @see #setProfile(Reference)
	 * @see org.hl7.fhir.FhirPackage#getModuleDefinitionData_Profile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='profile' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getProfile();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ModuleDefinitionData#getProfile <em>Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile</em>' containment reference.
	 * @see #getProfile()
	 * @generated
	 */
	void setProfile(Reference value);

	/**
	 * Returns the value of the '<em><b>Must Support</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates that specific elements of the type are referenced by the knowledge module and must be supported by the consumer in order to obtain an effective evaluation. This does not mean that a value is required for this element, only that the consuming system must understand the element and be able to provide values for it if they are available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Must Support</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getModuleDefinitionData_MustSupport()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mustSupport' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.hl7.fhir.String> getMustSupport();

	/**
	 * Returns the value of the '<em><b>Code Filter</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ModuleDefinitionCodeFilter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Code filters for the required data, if any.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code Filter</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getModuleDefinitionData_CodeFilter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='codeFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ModuleDefinitionCodeFilter> getCodeFilter();

	/**
	 * Returns the value of the '<em><b>Date Filter</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ModuleDefinitionDateFilter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date filters for the required data, if any.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date Filter</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getModuleDefinitionData_DateFilter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dateFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ModuleDefinitionDateFilter> getDateFilter();

} // ModuleDefinitionData
