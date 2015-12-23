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
import org.eclipse.mdht.uml.fhir.core.datatype.Uri;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Script Metadata Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.TestScriptMetadataCapability#getRequired <em>Required</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.TestScriptMetadataCapability#getValidated <em>Validated</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.TestScriptMetadataCapability#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.TestScriptMetadataCapability#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.TestScriptMetadataCapability#getLinks <em>Link</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.TestScriptMetadataCapability#getConformance <em>Conformance</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getTestScriptMetadataCapability()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Metadata_Capability'"
 * @generated
 */
public interface TestScriptMetadataCapability extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Required</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' reference.
	 * @see #setRequired(org.eclipse.mdht.uml.fhir.core.datatype.Boolean)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getTestScriptMetadataCapability_Required()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.Boolean getRequired();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.TestScriptMetadataCapability#getRequired <em>Required</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' reference.
	 * @see #getRequired()
	 * @generated
	 */
	void setRequired(org.eclipse.mdht.uml.fhir.core.datatype.Boolean value);

	/**
	 * Returns the value of the '<em><b>Validated</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validated</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validated</em>' reference.
	 * @see #setValidated(org.eclipse.mdht.uml.fhir.core.datatype.Boolean)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getTestScriptMetadataCapability_Validated()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.Boolean getValidated();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.TestScriptMetadataCapability#getValidated <em>Validated</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validated</em>' reference.
	 * @see #getValidated()
	 * @generated
	 */
	void setValidated(org.eclipse.mdht.uml.fhir.core.datatype.Boolean value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' reference.
	 * @see #setDescription(org.eclipse.mdht.uml.fhir.core.datatype.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getTestScriptMetadataCapability_Description()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.TestScriptMetadataCapability#getDescription <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.eclipse.mdht.uml.fhir.core.datatype.String value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(org.eclipse.mdht.uml.fhir.core.datatype.Integer)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getTestScriptMetadataCapability_Destination()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.Integer getDestination();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.TestScriptMetadataCapability#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(org.eclipse.mdht.uml.fhir.core.datatype.Integer value);

	/**
	 * Returns the value of the '<em><b>Link</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.datatype.Uri}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getTestScriptMetadataCapability_Link()
	 * @model
	 * @generated
	 */
	EList<Uri> getLinks();

	/**
	 * Returns the value of the '<em><b>Conformance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conformance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conformance</em>' reference.
	 * @see #setConformance(Conformance)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getTestScriptMetadataCapability_Conformance()
	 * @model required="true"
	 * @generated
	 */
	Conformance getConformance();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.TestScriptMetadataCapability#getConformance <em>Conformance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conformance</em>' reference.
	 * @see #getConformance()
	 * @generated
	 */
	void setConformance(Conformance value);

} // TestScriptMetadataCapability
