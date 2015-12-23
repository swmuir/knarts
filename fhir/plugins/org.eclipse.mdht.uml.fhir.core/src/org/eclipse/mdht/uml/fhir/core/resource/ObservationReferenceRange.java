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
import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.datatype.Range;
import org.eclipse.mdht.uml.fhir.core.datatype.SimpleQuantity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Observation Reference Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ObservationReferenceRange#getLow <em>Low</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ObservationReferenceRange#getHigh <em>High</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ObservationReferenceRange#getMeaning <em>Meaning</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ObservationReferenceRange#getAge <em>Age</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ObservationReferenceRange#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getObservationReferenceRange()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Observation_ReferenceRange'"
 * @generated
 */
public interface ObservationReferenceRange extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Low</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Low</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Low</em>' reference.
	 * @see #setLow(SimpleQuantity)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getObservationReferenceRange_Low()
	 * @model
	 * @generated
	 */
	SimpleQuantity getLow();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ObservationReferenceRange#getLow <em>Low</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Low</em>' reference.
	 * @see #getLow()
	 * @generated
	 */
	void setLow(SimpleQuantity value);

	/**
	 * Returns the value of the '<em><b>High</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>High</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>High</em>' reference.
	 * @see #setHigh(SimpleQuantity)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getObservationReferenceRange_High()
	 * @model
	 * @generated
	 */
	SimpleQuantity getHigh();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ObservationReferenceRange#getHigh <em>High</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>High</em>' reference.
	 * @see #getHigh()
	 * @generated
	 */
	void setHigh(SimpleQuantity value);

	/**
	 * Returns the value of the '<em><b>Meaning</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meaning</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meaning</em>' reference.
	 * @see #setMeaning(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getObservationReferenceRange_Meaning()
	 * @model
	 * @generated
	 */
	CodeableConcept getMeaning();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ObservationReferenceRange#getMeaning <em>Meaning</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meaning</em>' reference.
	 * @see #getMeaning()
	 * @generated
	 */
	void setMeaning(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Age</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Age</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' reference.
	 * @see #setAge(Range)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getObservationReferenceRange_Age()
	 * @model
	 * @generated
	 */
	Range getAge();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ObservationReferenceRange#getAge <em>Age</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' reference.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(Range value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' reference.
	 * @see #setText(org.eclipse.mdht.uml.fhir.core.datatype.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getObservationReferenceRange_Text()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.String getText();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ObservationReferenceRange#getText <em>Text</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(org.eclipse.mdht.uml.fhir.core.datatype.String value);

} // ObservationReferenceRange
