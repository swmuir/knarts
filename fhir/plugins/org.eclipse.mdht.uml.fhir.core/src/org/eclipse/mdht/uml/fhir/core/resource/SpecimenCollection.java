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
import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.datatype.DataType;
import org.eclipse.mdht.uml.fhir.core.datatype.SimpleQuantity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specimen Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.SpecimenCollection#getCollector <em>Collector</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.SpecimenCollection#getComments <em>Comment</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.SpecimenCollection#getCollectedx <em>Collectedx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.SpecimenCollection#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.SpecimenCollection#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.SpecimenCollection#getBodySite <em>Body Site</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getSpecimenCollection()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Specimen_Collection'"
 * @generated
 */
public interface SpecimenCollection extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Collector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collector</em>' reference.
	 * @see #setCollector(Practitioner)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getSpecimenCollection_Collector()
	 * @model
	 * @generated
	 */
	Practitioner getCollector();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.SpecimenCollection#getCollector <em>Collector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collector</em>' reference.
	 * @see #getCollector()
	 * @generated
	 */
	void setCollector(Practitioner value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.datatype.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getSpecimenCollection_Comment()
	 * @model
	 * @generated
	 */
	EList<org.eclipse.mdht.uml.fhir.core.datatype.String> getComments();

	/**
	 * Returns the value of the '<em><b>Collectedx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collectedx</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collectedx</em>' reference.
	 * @see #setCollectedx(DataType)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getSpecimenCollection_Collectedx()
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='collected[x]'"
	 * @generated
	 */
	DataType getCollectedx();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.SpecimenCollection#getCollectedx <em>Collectedx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collectedx</em>' reference.
	 * @see #getCollectedx()
	 * @generated
	 */
	void setCollectedx(DataType value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' reference.
	 * @see #setQuantity(SimpleQuantity)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getSpecimenCollection_Quantity()
	 * @model
	 * @generated
	 */
	SimpleQuantity getQuantity();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.SpecimenCollection#getQuantity <em>Quantity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(SimpleQuantity value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' reference.
	 * @see #setMethod(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getSpecimenCollection_Method()
	 * @model
	 * @generated
	 */
	CodeableConcept getMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.SpecimenCollection#getMethod <em>Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Body Site</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body Site</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Site</em>' reference.
	 * @see #setBodySite(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getSpecimenCollection_BodySite()
	 * @model
	 * @generated
	 */
	CodeableConcept getBodySite();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.SpecimenCollection#getBodySite <em>Body Site</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Site</em>' reference.
	 * @see #getBodySite()
	 * @generated
	 */
	void setBodySite(CodeableConcept value);

} // SpecimenCollection
