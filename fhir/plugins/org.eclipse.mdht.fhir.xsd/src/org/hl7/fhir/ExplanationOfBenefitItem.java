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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explanation Of Benefit Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getProviderIdentifier <em>Provider Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getProviderReference <em>Provider Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getSupervisorIdentifier <em>Supervisor Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getSupervisorReference <em>Supervisor Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getProviderQualification <em>Provider Qualification</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getDiagnosisLinkId <em>Diagnosis Link Id</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getService <em>Service</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getServiceModifier <em>Service Modifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getModifier <em>Modifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getProgramCode <em>Program Code</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getServicedDate <em>Serviced Date</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getServicedPeriod <em>Serviced Period</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getPlace <em>Place</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getUnitPrice <em>Unit Price</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getFactor <em>Factor</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getPoints <em>Points</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getNet <em>Net</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getUdi <em>Udi</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getSubSite <em>Sub Site</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getNoteNumber <em>Note Number</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getAdjudication <em>Adjudication</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getDetail <em>Detail</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitItem#getProsthesis <em>Prosthesis</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem()
 * @model extendedMetaData="name='ExplanationOfBenefit.Item' kind='elementOnly'"
 * @generated
 */
public interface ExplanationOfBenefitItem extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A service line number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequence</em>' containment reference.
	 * @see #setSequence(PositiveInt)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_Sequence()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sequence' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getSequence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitItem#getSequence <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' containment reference.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of product or service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Coding)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitItem#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Coding value);

	/**
	 * Returns the value of the '<em><b>Provider Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider Identifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider Identifier</em>' containment reference.
	 * @see #setProviderIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_ProviderIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='providerIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getProviderIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitItem#getProviderIdentifier <em>Provider Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider Identifier</em>' containment reference.
	 * @see #getProviderIdentifier()
	 * @generated
	 */
	void setProviderIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Provider Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider Reference</em>' containment reference.
	 * @see #setProviderReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_ProviderReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='providerReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getProviderReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitItem#getProviderReference <em>Provider Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider Reference</em>' containment reference.
	 * @see #getProviderReference()
	 * @generated
	 */
	void setProviderReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Supervisor Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supervisor Identifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supervisor Identifier</em>' containment reference.
	 * @see #setSupervisorIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_SupervisorIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supervisorIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getSupervisorIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitItem#getSupervisorIdentifier <em>Supervisor Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supervisor Identifier</em>' containment reference.
	 * @see #getSupervisorIdentifier()
	 * @generated
	 */
	void setSupervisorIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Supervisor Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supervisor Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supervisor Reference</em>' containment reference.
	 * @see #setSupervisorReference(Reference)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_SupervisorReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supervisorReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSupervisorReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitItem#getSupervisorReference <em>Supervisor Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supervisor Reference</em>' containment reference.
	 * @see #getSupervisorReference()
	 * @generated
	 */
	void setSupervisorReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Provider Qualification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The qualification which is applicable for this service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provider Qualification</em>' containment reference.
	 * @see #setProviderQualification(Coding)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_ProviderQualification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='providerQualification' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getProviderQualification();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitItem#getProviderQualification <em>Provider Qualification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider Qualification</em>' containment reference.
	 * @see #getProviderQualification()
	 * @generated
	 */
	void setProviderQualification(Coding value);

	/**
	 * Returns the value of the '<em><b>Diagnosis Link Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PositiveInt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Diagnosis applicable for this service or product line.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Diagnosis Link Id</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_DiagnosisLinkId()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='diagnosisLinkId' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PositiveInt> getDiagnosisLinkId();

	/**
	 * Returns the value of the '<em><b>Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a grouping item then 'GROUP' otherwise it is a node therefore a code to indicate the Professional Service or Product supplied.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service</em>' containment reference.
	 * @see #setService(Coding)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_Service()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='service' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getService();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitItem#getService <em>Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' containment reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(Coding value);

	/**
	 * Returns the value of the '<em><b>Service Modifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Coding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unusual circumstances which may influence adjudication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Modifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_ServiceModifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='serviceModifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Coding> getServiceModifier();

	/**
	 * Returns the value of the '<em><b>Modifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Coding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Item typification or modifiers codes, eg for Oral whether the treatment is cosmetic or associated with TMJ, or an appliance was lost or stolen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_Modifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='modifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Coding> getModifier();

	/**
	 * Returns the value of the '<em><b>Program Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Coding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For programs which require reson codes for the inclusion, covering, of this billed item under the program or sub-program.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Program Code</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_ProgramCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='programCode' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Coding> getProgramCode();

	/**
	 * Returns the value of the '<em><b>Serviced Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serviced Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serviced Date</em>' containment reference.
	 * @see #setServicedDate(Date)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_ServicedDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='servicedDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getServicedDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitItem#getServicedDate <em>Serviced Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serviced Date</em>' containment reference.
	 * @see #getServicedDate()
	 * @generated
	 */
	void setServicedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Serviced Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serviced Period</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serviced Period</em>' containment reference.
	 * @see #setServicedPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_ServicedPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='servicedPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getServicedPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitItem#getServicedPeriod <em>Serviced Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serviced Period</em>' containment reference.
	 * @see #getServicedPeriod()
	 * @generated
	 */
	void setServicedPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Place</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where the service was provided.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Place</em>' containment reference.
	 * @see #setPlace(Coding)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_Place()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='place' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getPlace();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitItem#getPlace <em>Place</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Place</em>' containment reference.
	 * @see #getPlace()
	 * @generated
	 */
	void setPlace(Coding value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of repetitions of a service or product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(SimpleQuantity)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_Quantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quantity' namespace='##targetNamespace'"
	 * @generated
	 */
	SimpleQuantity getQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitItem#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(SimpleQuantity value);

	/**
	 * Returns the value of the '<em><b>Unit Price</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the item is a node then this is the fee for the product or service, otherwise this is the total of the fees for the children of the group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit Price</em>' containment reference.
	 * @see #setUnitPrice(Money)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_UnitPrice()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='unitPrice' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getUnitPrice();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitItem#getUnitPrice <em>Unit Price</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Price</em>' containment reference.
	 * @see #getUnitPrice()
	 * @generated
	 */
	void setUnitPrice(Money value);

	/**
	 * Returns the value of the '<em><b>Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Factor</em>' containment reference.
	 * @see #setFactor(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_Factor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='factor' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getFactor();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitItem#getFactor <em>Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factor</em>' containment reference.
	 * @see #getFactor()
	 * @generated
	 */
	void setFactor(Decimal value);

	/**
	 * Returns the value of the '<em><b>Points</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the good or service delivered. The concept of Points allows for assignment of point values for services and/or goods, such that a monetary amount can be assigned to each point.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Points</em>' containment reference.
	 * @see #setPoints(Decimal)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_Points()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='points' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getPoints();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitItem#getPoints <em>Points</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Points</em>' containment reference.
	 * @see #getPoints()
	 * @generated
	 */
	void setPoints(Decimal value);

	/**
	 * Returns the value of the '<em><b>Net</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The quantity times the unit price for an addittional service or product or charge. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Net</em>' containment reference.
	 * @see #setNet(Money)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_Net()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='net' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getNet();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitItem#getNet <em>Net</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net</em>' containment reference.
	 * @see #getNet()
	 * @generated
	 */
	void setNet(Money value);

	/**
	 * Returns the value of the '<em><b>Udi</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of Unique Device Identifiers associated with this line item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Udi</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_Udi()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='udi' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getUdi();

	/**
	 * Returns the value of the '<em><b>Body Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Physical service site on the patient (limb, tooth, etc).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body Site</em>' containment reference.
	 * @see #setBodySite(Coding)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_BodySite()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bodySite' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getBodySite();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitItem#getBodySite <em>Body Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Site</em>' containment reference.
	 * @see #getBodySite()
	 * @generated
	 */
	void setBodySite(Coding value);

	/**
	 * Returns the value of the '<em><b>Sub Site</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Coding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A region or surface of the site, eg. limb region or tooth surface(s).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Site</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_SubSite()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subSite' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Coding> getSubSite();

	/**
	 * Returns the value of the '<em><b>Note Number</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PositiveInt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of note references to the notes provided below.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note Number</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_NoteNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='noteNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PositiveInt> getNoteNumber();

	/**
	 * Returns the value of the '<em><b>Adjudication</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ExplanationOfBenefitAdjudication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The adjudications results.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Adjudication</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_Adjudication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='adjudication' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExplanationOfBenefitAdjudication> getAdjudication();

	/**
	 * Returns the value of the '<em><b>Detail</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ExplanationOfBenefitDetail}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Second tier of goods and services.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Detail</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_Detail()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='detail' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExplanationOfBenefitDetail> getDetail();

	/**
	 * Returns the value of the '<em><b>Prosthesis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The materials and placement date of prior fixed prosthesis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prosthesis</em>' containment reference.
	 * @see #setProsthesis(ExplanationOfBenefitProsthesis)
	 * @see org.hl7.fhir.FhirPackage#getExplanationOfBenefitItem_Prosthesis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='prosthesis' namespace='##targetNamespace'"
	 * @generated
	 */
	ExplanationOfBenefitProsthesis getProsthesis();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitItem#getProsthesis <em>Prosthesis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prosthesis</em>' containment reference.
	 * @see #getProsthesis()
	 * @generated
	 */
	void setProsthesis(ExplanationOfBenefitProsthesis value);

} // ExplanationOfBenefitItem
