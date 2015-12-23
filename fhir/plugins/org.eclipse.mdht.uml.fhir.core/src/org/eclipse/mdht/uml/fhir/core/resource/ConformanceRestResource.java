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
 * A representation of the model object '<em><b>Conformance Rest Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ConformanceRestResource#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ConformanceRestResource#getProfile <em>Profile</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ConformanceRestResource#getInteractions <em>Interaction</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ConformanceRestResource#getVersioning <em>Versioning</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ConformanceRestResource#getReadHistory <em>Read History</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ConformanceRestResource#getUpdateCreate <em>Update Create</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ConformanceRestResource#getConditionalCreate <em>Conditional Create</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ConformanceRestResource#getConditionalUpdate <em>Conditional Update</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ConformanceRestResource#getConditionalDelete <em>Conditional Delete</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ConformanceRestResource#getSearchIncludes <em>Search Include</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ConformanceRestResource#getSearchRevIncludes <em>Search Rev Include</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ConformanceRestResource#getSearchParams <em>Search Param</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getConformanceRestResource()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Rest_Resource'"
 * @generated
 */
public interface ConformanceRestResource extends BackboneElement {
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
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getConformanceRestResource_Type()
	 * @model required="true"
	 * @generated
	 */
	Code getType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ConformanceRestResource#getType <em>Type</em>}' reference.
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
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getConformanceRestResource_Profile()
	 * @model
	 * @generated
	 */
	StructureDefinition getProfile();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ConformanceRestResource#getProfile <em>Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile</em>' reference.
	 * @see #getProfile()
	 * @generated
	 */
	void setProfile(StructureDefinition value);

	/**
	 * Returns the value of the '<em><b>Interaction</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resource.ConformanceRestResourceResourceInteraction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getConformanceRestResource_Interaction()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ConformanceRestResourceResourceInteraction> getInteractions();

	/**
	 * Returns the value of the '<em><b>Versioning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Versioning</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Versioning</em>' reference.
	 * @see #setVersioning(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getConformanceRestResource_Versioning()
	 * @model
	 * @generated
	 */
	Code getVersioning();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ConformanceRestResource#getVersioning <em>Versioning</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Versioning</em>' reference.
	 * @see #getVersioning()
	 * @generated
	 */
	void setVersioning(Code value);

	/**
	 * Returns the value of the '<em><b>Read History</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read History</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read History</em>' reference.
	 * @see #setReadHistory(org.eclipse.mdht.uml.fhir.core.datatype.Boolean)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getConformanceRestResource_ReadHistory()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.Boolean getReadHistory();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ConformanceRestResource#getReadHistory <em>Read History</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read History</em>' reference.
	 * @see #getReadHistory()
	 * @generated
	 */
	void setReadHistory(org.eclipse.mdht.uml.fhir.core.datatype.Boolean value);

	/**
	 * Returns the value of the '<em><b>Update Create</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update Create</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Create</em>' reference.
	 * @see #setUpdateCreate(org.eclipse.mdht.uml.fhir.core.datatype.Boolean)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getConformanceRestResource_UpdateCreate()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.Boolean getUpdateCreate();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ConformanceRestResource#getUpdateCreate <em>Update Create</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Create</em>' reference.
	 * @see #getUpdateCreate()
	 * @generated
	 */
	void setUpdateCreate(org.eclipse.mdht.uml.fhir.core.datatype.Boolean value);

	/**
	 * Returns the value of the '<em><b>Conditional Create</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditional Create</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditional Create</em>' reference.
	 * @see #setConditionalCreate(org.eclipse.mdht.uml.fhir.core.datatype.Boolean)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getConformanceRestResource_ConditionalCreate()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.Boolean getConditionalCreate();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ConformanceRestResource#getConditionalCreate <em>Conditional Create</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditional Create</em>' reference.
	 * @see #getConditionalCreate()
	 * @generated
	 */
	void setConditionalCreate(org.eclipse.mdht.uml.fhir.core.datatype.Boolean value);

	/**
	 * Returns the value of the '<em><b>Conditional Update</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditional Update</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditional Update</em>' reference.
	 * @see #setConditionalUpdate(org.eclipse.mdht.uml.fhir.core.datatype.Boolean)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getConformanceRestResource_ConditionalUpdate()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.Boolean getConditionalUpdate();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ConformanceRestResource#getConditionalUpdate <em>Conditional Update</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditional Update</em>' reference.
	 * @see #getConditionalUpdate()
	 * @generated
	 */
	void setConditionalUpdate(org.eclipse.mdht.uml.fhir.core.datatype.Boolean value);

	/**
	 * Returns the value of the '<em><b>Conditional Delete</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditional Delete</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditional Delete</em>' reference.
	 * @see #setConditionalDelete(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getConformanceRestResource_ConditionalDelete()
	 * @model
	 * @generated
	 */
	Code getConditionalDelete();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ConformanceRestResource#getConditionalDelete <em>Conditional Delete</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditional Delete</em>' reference.
	 * @see #getConditionalDelete()
	 * @generated
	 */
	void setConditionalDelete(Code value);

	/**
	 * Returns the value of the '<em><b>Search Include</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.datatype.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Search Include</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Search Include</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getConformanceRestResource_SearchInclude()
	 * @model
	 * @generated
	 */
	EList<org.eclipse.mdht.uml.fhir.core.datatype.String> getSearchIncludes();

	/**
	 * Returns the value of the '<em><b>Search Rev Include</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.datatype.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Search Rev Include</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Search Rev Include</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getConformanceRestResource_SearchRevInclude()
	 * @model
	 * @generated
	 */
	EList<org.eclipse.mdht.uml.fhir.core.datatype.String> getSearchRevIncludes();

	/**
	 * Returns the value of the '<em><b>Search Param</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resource.ConformanceRestResourceSearchParam}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Search Param</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Search Param</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getConformanceRestResource_SearchParam()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConformanceRestResourceSearchParam> getSearchParams();

} // ConformanceRestResource
