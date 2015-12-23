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
import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.datatype.DataType;
import org.eclipse.mdht.uml.fhir.core.datatype.Ratio;
import org.eclipse.mdht.uml.fhir.core.datatype.Timing;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Statement Dosage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.MedicationStatementDosage#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.MedicationStatementDosage#getTiming <em>Timing</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.MedicationStatementDosage#getAsNeededx <em>As Neededx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.MedicationStatementDosage#getSitex <em>Sitex</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.MedicationStatementDosage#getRoute <em>Route</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.MedicationStatementDosage#getMethod <em>Method</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.MedicationStatementDosage#getQuantityx <em>Quantityx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.MedicationStatementDosage#getRatex <em>Ratex</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.MedicationStatementDosage#getMaxDosePerPeriod <em>Max Dose Per Period</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getMedicationStatementDosage()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='MedicationStatement_Dosage'"
 * @generated
 */
public interface MedicationStatementDosage extends BackboneElement {
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
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getMedicationStatementDosage_Text()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.String getText();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.MedicationStatementDosage#getText <em>Text</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(org.eclipse.mdht.uml.fhir.core.datatype.String value);

	/**
	 * Returns the value of the '<em><b>Timing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timing</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timing</em>' reference.
	 * @see #setTiming(Timing)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getMedicationStatementDosage_Timing()
	 * @model
	 * @generated
	 */
	Timing getTiming();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.MedicationStatementDosage#getTiming <em>Timing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timing</em>' reference.
	 * @see #getTiming()
	 * @generated
	 */
	void setTiming(Timing value);

	/**
	 * Returns the value of the '<em><b>As Neededx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>As Neededx</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>As Neededx</em>' reference.
	 * @see #setAsNeededx(DataType)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getMedicationStatementDosage_AsNeededx()
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='asNeeded[x]'"
	 * @generated
	 */
	DataType getAsNeededx();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.MedicationStatementDosage#getAsNeededx <em>As Neededx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>As Neededx</em>' reference.
	 * @see #getAsNeededx()
	 * @generated
	 */
	void setAsNeededx(DataType value);

	/**
	 * Returns the value of the '<em><b>Sitex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sitex</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sitex</em>' reference.
	 * @see #setSitex(Base)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getMedicationStatementDosage_Sitex()
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='site[x]'"
	 * @generated
	 */
	Base getSitex();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.MedicationStatementDosage#getSitex <em>Sitex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sitex</em>' reference.
	 * @see #getSitex()
	 * @generated
	 */
	void setSitex(Base value);

	/**
	 * Returns the value of the '<em><b>Route</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route</em>' reference.
	 * @see #setRoute(CodeableConcept)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getMedicationStatementDosage_Route()
	 * @model
	 * @generated
	 */
	CodeableConcept getRoute();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.MedicationStatementDosage#getRoute <em>Route</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route</em>' reference.
	 * @see #getRoute()
	 * @generated
	 */
	void setRoute(CodeableConcept value);

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
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getMedicationStatementDosage_Method()
	 * @model
	 * @generated
	 */
	CodeableConcept getMethod();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.MedicationStatementDosage#getMethod <em>Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Quantityx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantityx</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantityx</em>' reference.
	 * @see #setQuantityx(DataType)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getMedicationStatementDosage_Quantityx()
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='quantity[x]'"
	 * @generated
	 */
	DataType getQuantityx();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.MedicationStatementDosage#getQuantityx <em>Quantityx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantityx</em>' reference.
	 * @see #getQuantityx()
	 * @generated
	 */
	void setQuantityx(DataType value);

	/**
	 * Returns the value of the '<em><b>Ratex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ratex</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ratex</em>' reference.
	 * @see #setRatex(DataType)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getMedicationStatementDosage_Ratex()
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='rate[x]'"
	 * @generated
	 */
	DataType getRatex();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.MedicationStatementDosage#getRatex <em>Ratex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ratex</em>' reference.
	 * @see #getRatex()
	 * @generated
	 */
	void setRatex(DataType value);

	/**
	 * Returns the value of the '<em><b>Max Dose Per Period</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Dose Per Period</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Dose Per Period</em>' reference.
	 * @see #setMaxDosePerPeriod(Ratio)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getMedicationStatementDosage_MaxDosePerPeriod()
	 * @model
	 * @generated
	 */
	Ratio getMaxDosePerPeriod();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.MedicationStatementDosage#getMaxDosePerPeriod <em>Max Dose Per Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Dose Per Period</em>' reference.
	 * @see #getMaxDosePerPeriod()
	 * @generated
	 */
	void setMaxDosePerPeriod(Ratio value);

} // MedicationStatementDosage
