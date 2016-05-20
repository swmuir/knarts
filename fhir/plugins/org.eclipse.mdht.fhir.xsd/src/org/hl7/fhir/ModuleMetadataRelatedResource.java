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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Metadata Related Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The ModuleMetadata structure defines the common metadata elements used by quality improvement artifacts. This information includes descriptive and topical metadata to enable repository searches, as well as governance and evidentiary support information.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ModuleMetadataRelatedResource#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ModuleMetadataRelatedResource#getDocument <em>Document</em>}</li>
 *   <li>{@link org.hl7.fhir.ModuleMetadataRelatedResource#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getModuleMetadataRelatedResource()
 * @model extendedMetaData="name='ModuleMetadata.RelatedResource' kind='elementOnly'"
 * @generated
 */
public interface ModuleMetadataRelatedResource extends Element {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of related resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(ModuleMetadataResourceType)
	 * @see org.hl7.fhir.FhirPackage#getModuleMetadataRelatedResource_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	ModuleMetadataResourceType getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ModuleMetadataRelatedResource#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ModuleMetadataResourceType value);

	/**
	 * Returns the value of the '<em><b>Document</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The document being referenced, represented as an attachment. This is exclusive with the resource element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document</em>' containment reference.
	 * @see #setDocument(Attachment)
	 * @see org.hl7.fhir.FhirPackage#getModuleMetadataRelatedResource_Document()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='document' namespace='##targetNamespace'"
	 * @generated
	 */
	Attachment getDocument();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ModuleMetadataRelatedResource#getDocument <em>Document</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document</em>' containment reference.
	 * @see #getDocument()
	 * @generated
	 */
	void setDocument(Attachment value);

	/**
	 * Returns the value of the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The related resource, such as a library, value set, profile, or other module.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource</em>' containment reference.
	 * @see #setResource(Reference)
	 * @see org.hl7.fhir.FhirPackage#getModuleMetadataRelatedResource_Resource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resource' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getResource();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ModuleMetadataRelatedResource#getResource <em>Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource</em>' containment reference.
	 * @see #getResource()
	 * @generated
	 */
	void setResource(Reference value);

} // ModuleMetadataRelatedResource
