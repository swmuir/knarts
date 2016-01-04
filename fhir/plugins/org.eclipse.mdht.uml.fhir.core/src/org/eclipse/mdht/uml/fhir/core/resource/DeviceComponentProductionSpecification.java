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
import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Component Production Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.DeviceComponentProductionSpecification#getSpecType <em>Spec Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.DeviceComponentProductionSpecification#getComponentId <em>Component Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.DeviceComponentProductionSpecification#getProductionSpec <em>Production Spec</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getDeviceComponentProductionSpecification()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='DeviceComponent_ProductionSpecification'"
 * @generated
 */
public interface DeviceComponentProductionSpecification extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Spec Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec Type</em>' reference.
	 * @see #setSpecType(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getDeviceComponentProductionSpecification_SpecType()
	 * @model
	 * @generated
	 */
	CodeableConcept getSpecType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.DeviceComponentProductionSpecification#getSpecType <em>Spec Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spec Type</em>' reference.
	 * @see #getSpecType()
	 * @generated
	 */
	void setSpecType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Component Id</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Id</em>' reference.
	 * @see #setComponentId(Identifier)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getDeviceComponentProductionSpecification_ComponentId()
	 * @model
	 * @generated
	 */
	Identifier getComponentId();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.DeviceComponentProductionSpecification#getComponentId <em>Component Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Id</em>' reference.
	 * @see #getComponentId()
	 * @generated
	 */
	void setComponentId(Identifier value);

	/**
	 * Returns the value of the '<em><b>Production Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Production Spec</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Production Spec</em>' reference.
	 * @see #setProductionSpec(org.eclipse.mdht.uml.fhir.core.datatype.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getDeviceComponentProductionSpecification_ProductionSpec()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.String getProductionSpec();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.DeviceComponentProductionSpecification#getProductionSpec <em>Production Spec</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Production Spec</em>' reference.
	 * @see #getProductionSpec()
	 * @generated
	 */
	void setProductionSpec(org.eclipse.mdht.uml.fhir.core.datatype.String value);

} // DeviceComponentProductionSpecification
