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

import org.eclipse.mdht.uml.fhir.core.datatype.Base;
import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept;
import org.eclipse.mdht.uml.fhir.core.datatype.DataType;
import org.eclipse.mdht.uml.fhir.core.datatype.DateTime;
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Statement</b></em>'.
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
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.MedicationStatement#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.MedicationStatement#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.MedicationStatement#getInformationSource <em>Information Source</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.MedicationStatement#getDateAsserted <em>Date Asserted</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.MedicationStatement#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.MedicationStatement#getWasNotTaken <em>Was Not Taken</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.MedicationStatement#getReasonNotTakens <em>Reason Not Taken</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.MedicationStatement#getReasonForUsex <em>Reason For Usex</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.MedicationStatement#getEffectivex <em>Effectivex</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.MedicationStatement#getNote <em>Note</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.MedicationStatement#getSupportingInformations <em>Supporting Information</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.MedicationStatement#getMedicationx <em>Medicationx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.MedicationStatement#getDosages <em>Dosage</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getMedicationStatement()
 * @model
 * @generated
 */
public interface MedicationStatement extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.datatype.Identifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getMedicationStatement_Identifier()
	 * @model
	 * @generated
	 */
	EList<Identifier> getIdentifiers();

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patient</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient</em>' reference.
	 * @see #setPatient(Patient)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getMedicationStatement_Patient()
	 * @model required="true"
	 * @generated
	 */
	Patient getPatient();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.MedicationStatement#getPatient <em>Patient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Patient value);

	/**
	 * Returns the value of the '<em><b>Information Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Information Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Information Source</em>' reference.
	 * @see #setInformationSource(Resource)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getMedicationStatement_InformationSource()
	 * @model
	 * @generated
	 */
	Resource getInformationSource();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.MedicationStatement#getInformationSource <em>Information Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Information Source</em>' reference.
	 * @see #getInformationSource()
	 * @generated
	 */
	void setInformationSource(Resource value);

	/**
	 * Returns the value of the '<em><b>Date Asserted</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Asserted</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Asserted</em>' reference.
	 * @see #setDateAsserted(DateTime)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getMedicationStatement_DateAsserted()
	 * @model
	 * @generated
	 */
	DateTime getDateAsserted();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.MedicationStatement#getDateAsserted <em>Date Asserted</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Asserted</em>' reference.
	 * @see #getDateAsserted()
	 * @generated
	 */
	void setDateAsserted(DateTime value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see #setStatus(Code)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getMedicationStatement_Status()
	 * @model required="true"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.MedicationStatement#getStatus <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Was Not Taken</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Was Not Taken</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Was Not Taken</em>' reference.
	 * @see #setWasNotTaken(org.eclipse.mdht.uml.fhir.core.datatype.Boolean)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getMedicationStatement_WasNotTaken()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.Boolean getWasNotTaken();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.MedicationStatement#getWasNotTaken <em>Was Not Taken</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Was Not Taken</em>' reference.
	 * @see #getWasNotTaken()
	 * @generated
	 */
	void setWasNotTaken(org.eclipse.mdht.uml.fhir.core.datatype.Boolean value);

	/**
	 * Returns the value of the '<em><b>Reason Not Taken</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.datatype.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason Not Taken</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason Not Taken</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getMedicationStatement_ReasonNotTaken()
	 * @model
	 * @generated
	 */
	EList<CodeableConcept> getReasonNotTakens();

	/**
	 * Returns the value of the '<em><b>Reason For Usex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason For Usex</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason For Usex</em>' reference.
	 * @see #setReasonForUsex(Base)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getMedicationStatement_ReasonForUsex()
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='reasonForUse[x]'"
	 * @generated
	 */
	Base getReasonForUsex();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.MedicationStatement#getReasonForUsex <em>Reason For Usex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason For Usex</em>' reference.
	 * @see #getReasonForUsex()
	 * @generated
	 */
	void setReasonForUsex(Base value);

	/**
	 * Returns the value of the '<em><b>Effectivex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effectivex</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effectivex</em>' reference.
	 * @see #setEffectivex(DataType)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getMedicationStatement_Effectivex()
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='effective[x]'"
	 * @generated
	 */
	DataType getEffectivex();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.MedicationStatement#getEffectivex <em>Effectivex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effectivex</em>' reference.
	 * @see #getEffectivex()
	 * @generated
	 */
	void setEffectivex(DataType value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' reference.
	 * @see #setNote(org.eclipse.mdht.uml.fhir.core.datatype.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getMedicationStatement_Note()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.String getNote();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.MedicationStatement#getNote <em>Note</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' reference.
	 * @see #getNote()
	 * @generated
	 */
	void setNote(org.eclipse.mdht.uml.fhir.core.datatype.String value);

	/**
	 * Returns the value of the '<em><b>Supporting Information</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resource.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supporting Information</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supporting Information</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getMedicationStatement_SupportingInformation()
	 * @model
	 * @generated
	 */
	EList<Resource> getSupportingInformations();

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
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getMedicationStatement_Medicationx()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='medication[x]'"
	 * @generated
	 */
	Base getMedicationx();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.MedicationStatement#getMedicationx <em>Medicationx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medicationx</em>' reference.
	 * @see #getMedicationx()
	 * @generated
	 */
	void setMedicationx(Base value);

	/**
	 * Returns the value of the '<em><b>Dosage</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resource.MedicationStatementDosage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dosage</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dosage</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getMedicationStatement_Dosage()
	 * @model containment="true"
	 * @generated
	 */
	EList<MedicationStatementDosage> getDosages();

} // MedicationStatement
