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
import org.eclipse.mdht.uml.fhir.core.datatype.Duration;
import org.eclipse.mdht.uml.fhir.core.datatype.Period;
import org.eclipse.mdht.uml.fhir.core.datatype.PositiveInt;
import org.eclipse.mdht.uml.fhir.core.datatype.SimpleQuantity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Order Dispense Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.MedicationOrderDispenseRequest#getMedicationx <em>Medicationx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.MedicationOrderDispenseRequest#getValidityPeriod <em>Validity Period</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.MedicationOrderDispenseRequest#getNumberOfRepeatsAllowed <em>Number Of Repeats Allowed</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.MedicationOrderDispenseRequest#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.MedicationOrderDispenseRequest#getExpectedSupplyDuration <em>Expected Supply Duration</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getMedicationOrderDispenseRequest()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MedicationOrder_DispenseRequest'"
 * @generated
 */
public interface MedicationOrderDispenseRequest extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Medicationx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Medicationx</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medicationx</em>' reference.
	 * @see #setMedicationx(Base)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getMedicationOrderDispenseRequest_Medicationx()
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='medication[x]'"
	 * @generated
	 */
	Base getMedicationx();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.MedicationOrderDispenseRequest#getMedicationx <em>Medicationx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medicationx</em>' reference.
	 * @see #getMedicationx()
	 * @generated
	 */
	void setMedicationx(Base value);

	/**
	 * Returns the value of the '<em><b>Validity Period</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validity Period</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validity Period</em>' reference.
	 * @see #setValidityPeriod(Period)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getMedicationOrderDispenseRequest_ValidityPeriod()
	 * @model
	 * @generated
	 */
	Period getValidityPeriod();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.MedicationOrderDispenseRequest#getValidityPeriod <em>Validity Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validity Period</em>' reference.
	 * @see #getValidityPeriod()
	 * @generated
	 */
	void setValidityPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Number Of Repeats Allowed</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Repeats Allowed</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Repeats Allowed</em>' reference.
	 * @see #setNumberOfRepeatsAllowed(PositiveInt)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getMedicationOrderDispenseRequest_NumberOfRepeatsAllowed()
	 * @model
	 * @generated
	 */
	PositiveInt getNumberOfRepeatsAllowed();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.MedicationOrderDispenseRequest#getNumberOfRepeatsAllowed <em>Number Of Repeats Allowed</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Repeats Allowed</em>' reference.
	 * @see #getNumberOfRepeatsAllowed()
	 * @generated
	 */
	void setNumberOfRepeatsAllowed(PositiveInt value);

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
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getMedicationOrderDispenseRequest_Quantity()
	 * @model
	 * @generated
	 */
	SimpleQuantity getQuantity();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.MedicationOrderDispenseRequest#getQuantity <em>Quantity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(SimpleQuantity value);

	/**
	 * Returns the value of the '<em><b>Expected Supply Duration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expected Supply Duration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expected Supply Duration</em>' reference.
	 * @see #setExpectedSupplyDuration(Duration)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getMedicationOrderDispenseRequest_ExpectedSupplyDuration()
	 * @model
	 * @generated
	 */
	Duration getExpectedSupplyDuration();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.MedicationOrderDispenseRequest#getExpectedSupplyDuration <em>Expected Supply Duration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Supply Duration</em>' reference.
	 * @see #getExpectedSupplyDuration()
	 * @generated
	 */
	void setExpectedSupplyDuration(Duration value);

} // MedicationOrderDispenseRequest
