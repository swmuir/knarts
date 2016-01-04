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

import org.eclipse.emf.common.util.EList;

import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;
import org.eclipse.mdht.uml.fhir.core.datatype.Instant;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Component</b></em>'.
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
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.DeviceComponent#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.DeviceComponent#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.DeviceComponent#getLastSystemChange <em>Last System Change</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.DeviceComponent#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.DeviceComponent#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.DeviceComponent#getOperationalStati <em>Operational Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.DeviceComponent#getParameterGroup <em>Parameter Group</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.DeviceComponent#getMeasurementPrinciple <em>Measurement Principle</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.DeviceComponent#getProductionSpecifications <em>Production Specification</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.DeviceComponent#getLanguageCode <em>Language Code</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getDeviceComponent()
 * @model
 * @generated
 */
public interface DeviceComponent extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getDeviceComponent_Type()
	 * @model required="true"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.DeviceComponent#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' reference.
	 * @see #setIdentifier(Identifier)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getDeviceComponent_Identifier()
	 * @model required="true"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.DeviceComponent#getIdentifier <em>Identifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Last System Change</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last System Change</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last System Change</em>' reference.
	 * @see #setLastSystemChange(Instant)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getDeviceComponent_LastSystemChange()
	 * @model required="true"
	 * @generated
	 */
	Instant getLastSystemChange();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.DeviceComponent#getLastSystemChange <em>Last System Change</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last System Change</em>' reference.
	 * @see #getLastSystemChange()
	 * @generated
	 */
	void setLastSystemChange(Instant value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Device)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getDeviceComponent_Source()
	 * @model
	 * @generated
	 */
	Device getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.DeviceComponent#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Device value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(DeviceComponent)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getDeviceComponent_Parent()
	 * @model
	 * @generated
	 */
	DeviceComponent getParent();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.DeviceComponent#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(DeviceComponent value);

	/**
	 * Returns the value of the '<em><b>Operational Status</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operational Status</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operational Status</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getDeviceComponent_OperationalStatus()
	 * @model
	 * @generated
	 */
	EList<CodeableConcept> getOperationalStati();

	/**
	 * Returns the value of the '<em><b>Parameter Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Group</em>' reference.
	 * @see #setParameterGroup(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getDeviceComponent_ParameterGroup()
	 * @model
	 * @generated
	 */
	CodeableConcept getParameterGroup();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.DeviceComponent#getParameterGroup <em>Parameter Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Group</em>' reference.
	 * @see #getParameterGroup()
	 * @generated
	 */
	void setParameterGroup(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Measurement Principle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement Principle</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement Principle</em>' reference.
	 * @see #setMeasurementPrinciple(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getDeviceComponent_MeasurementPrinciple()
	 * @model
	 * @generated
	 */
	Code getMeasurementPrinciple();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.DeviceComponent#getMeasurementPrinciple <em>Measurement Principle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement Principle</em>' reference.
	 * @see #getMeasurementPrinciple()
	 * @generated
	 */
	void setMeasurementPrinciple(Code value);

	/**
	 * Returns the value of the '<em><b>Production Specification</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resource.DeviceComponentProductionSpecification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Production Specification</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Production Specification</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getDeviceComponent_ProductionSpecification()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeviceComponentProductionSpecification> getProductionSpecifications();

	/**
	 * Returns the value of the '<em><b>Language Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language Code</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language Code</em>' reference.
	 * @see #setLanguageCode(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getDeviceComponent_LanguageCode()
	 * @model
	 * @generated
	 */
	CodeableConcept getLanguageCode();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.DeviceComponent#getLanguageCode <em>Language Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language Code</em>' reference.
	 * @see #getLanguageCode()
	 * @generated
	 */
	void setLanguageCode(CodeableConcept value);

} // DeviceComponent
