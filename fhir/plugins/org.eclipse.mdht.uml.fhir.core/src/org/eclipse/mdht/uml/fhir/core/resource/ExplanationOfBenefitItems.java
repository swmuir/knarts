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

import org.eclipse.mdht.uml.fhir.core.datatype.BackboneElement;
import org.eclipse.mdht.uml.fhir.core.datatype.Coding;
import org.eclipse.mdht.uml.fhir.core.datatype.DataType;
import org.eclipse.mdht.uml.fhir.core.datatype.Decimal;
import org.eclipse.mdht.uml.fhir.core.datatype.Money;
import org.eclipse.mdht.uml.fhir.core.datatype.PositiveInt;
import org.eclipse.mdht.uml.fhir.core.datatype.SimpleQuantity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explanation Of Benefit Items</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ExplanationOfBenefitItems#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ExplanationOfBenefitItems#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ExplanationOfBenefitItems#getProvider <em>Provider</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ExplanationOfBenefitItems#getDiagnosisLinkIds <em>Diagnosis Link Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ExplanationOfBenefitItems#getService <em>Service</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ExplanationOfBenefitItems#getServicedx <em>Servicedx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ExplanationOfBenefitItems#getPlace <em>Place</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ExplanationOfBenefitItems#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ExplanationOfBenefitItems#getUnitPrice <em>Unit Price</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ExplanationOfBenefitItems#getFactor <em>Factor</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ExplanationOfBenefitItems#getPoints <em>Points</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ExplanationOfBenefitItems#getNet <em>Net</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ExplanationOfBenefitItems#getUdi <em>Udi</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ExplanationOfBenefitItems#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ExplanationOfBenefitItems#getSubSites <em>Sub Site</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ExplanationOfBenefitItems#getModifiers <em>Modifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ExplanationOfBenefitItems#getNoteNumbers <em>Note Number</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ExplanationOfBenefitItems#getAdjudications <em>Adjudication</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ExplanationOfBenefitItems#getDetails <em>Detail</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ExplanationOfBenefitItems#getProsthesis <em>Prosthesis</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getExplanationOfBenefitItems()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ExplanationOfBenefit_Items'"
 * @generated
 */
public interface ExplanationOfBenefitItems extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sequence</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence</em>' reference.
	 * @see #setSequence(PositiveInt)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getExplanationOfBenefitItems_Sequence()
	 * @model required="true"
	 * @generated
	 */
	PositiveInt getSequence();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ExplanationOfBenefitItems#getSequence <em>Sequence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' reference.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Coding)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getExplanationOfBenefitItems_Type()
	 * @model required="true"
	 * @generated
	 */
	Coding getType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ExplanationOfBenefitItems#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Coding value);

	/**
	 * Returns the value of the '<em><b>Provider</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider</em>' reference.
	 * @see #setProvider(Practitioner)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getExplanationOfBenefitItems_Provider()
	 * @model
	 * @generated
	 */
	Practitioner getProvider();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ExplanationOfBenefitItems#getProvider <em>Provider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider</em>' reference.
	 * @see #getProvider()
	 * @generated
	 */
	void setProvider(Practitioner value);

	/**
	 * Returns the value of the '<em><b>Diagnosis Link Id</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.datatype.PositiveInt}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagnosis Link Id</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagnosis Link Id</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getExplanationOfBenefitItems_DiagnosisLinkId()
	 * @model
	 * @generated
	 */
	EList<PositiveInt> getDiagnosisLinkIds();

	/**
	 * Returns the value of the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' reference.
	 * @see #setService(Coding)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getExplanationOfBenefitItems_Service()
	 * @model required="true"
	 * @generated
	 */
	Coding getService();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ExplanationOfBenefitItems#getService <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(Coding value);

	/**
	 * Returns the value of the '<em><b>Servicedx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Servicedx</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Servicedx</em>' reference.
	 * @see #setServicedx(DataType)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getExplanationOfBenefitItems_Servicedx()
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='serviced[x]'"
	 * @generated
	 */
	DataType getServicedx();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ExplanationOfBenefitItems#getServicedx <em>Servicedx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Servicedx</em>' reference.
	 * @see #getServicedx()
	 * @generated
	 */
	void setServicedx(DataType value);

	/**
	 * Returns the value of the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Place</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place</em>' reference.
	 * @see #setPlace(Coding)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getExplanationOfBenefitItems_Place()
	 * @model
	 * @generated
	 */
	Coding getPlace();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ExplanationOfBenefitItems#getPlace <em>Place</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Place</em>' reference.
	 * @see #getPlace()
	 * @generated
	 */
	void setPlace(Coding value);

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
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getExplanationOfBenefitItems_Quantity()
	 * @model
	 * @generated
	 */
	SimpleQuantity getQuantity();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ExplanationOfBenefitItems#getQuantity <em>Quantity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(SimpleQuantity value);

	/**
	 * Returns the value of the '<em><b>Unit Price</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Price</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Price</em>' reference.
	 * @see #setUnitPrice(Money)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getExplanationOfBenefitItems_UnitPrice()
	 * @model
	 * @generated
	 */
	Money getUnitPrice();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ExplanationOfBenefitItems#getUnitPrice <em>Unit Price</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Price</em>' reference.
	 * @see #getUnitPrice()
	 * @generated
	 */
	void setUnitPrice(Money value);

	/**
	 * Returns the value of the '<em><b>Factor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factor</em>' reference.
	 * @see #setFactor(Decimal)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getExplanationOfBenefitItems_Factor()
	 * @model
	 * @generated
	 */
	Decimal getFactor();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ExplanationOfBenefitItems#getFactor <em>Factor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factor</em>' reference.
	 * @see #getFactor()
	 * @generated
	 */
	void setFactor(Decimal value);

	/**
	 * Returns the value of the '<em><b>Points</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Points</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points</em>' reference.
	 * @see #setPoints(Decimal)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getExplanationOfBenefitItems_Points()
	 * @model
	 * @generated
	 */
	Decimal getPoints();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ExplanationOfBenefitItems#getPoints <em>Points</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Points</em>' reference.
	 * @see #getPoints()
	 * @generated
	 */
	void setPoints(Decimal value);

	/**
	 * Returns the value of the '<em><b>Net</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Net</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net</em>' reference.
	 * @see #setNet(Money)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getExplanationOfBenefitItems_Net()
	 * @model
	 * @generated
	 */
	Money getNet();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ExplanationOfBenefitItems#getNet <em>Net</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net</em>' reference.
	 * @see #getNet()
	 * @generated
	 */
	void setNet(Money value);

	/**
	 * Returns the value of the '<em><b>Udi</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Udi</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Udi</em>' reference.
	 * @see #setUdi(Coding)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getExplanationOfBenefitItems_Udi()
	 * @model
	 * @generated
	 */
	Coding getUdi();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ExplanationOfBenefitItems#getUdi <em>Udi</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Udi</em>' reference.
	 * @see #getUdi()
	 * @generated
	 */
	void setUdi(Coding value);

	/**
	 * Returns the value of the '<em><b>Body Site</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body Site</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body Site</em>' reference.
	 * @see #setBodySite(Coding)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getExplanationOfBenefitItems_BodySite()
	 * @model
	 * @generated
	 */
	Coding getBodySite();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ExplanationOfBenefitItems#getBodySite <em>Body Site</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Site</em>' reference.
	 * @see #getBodySite()
	 * @generated
	 */
	void setBodySite(Coding value);

	/**
	 * Returns the value of the '<em><b>Sub Site</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.datatype.Coding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Site</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Site</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getExplanationOfBenefitItems_SubSite()
	 * @model
	 * @generated
	 */
	EList<Coding> getSubSites();

	/**
	 * Returns the value of the '<em><b>Modifier</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.datatype.Coding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modifier</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modifier</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getExplanationOfBenefitItems_Modifier()
	 * @model
	 * @generated
	 */
	EList<Coding> getModifiers();

	/**
	 * Returns the value of the '<em><b>Note Number</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.datatype.PositiveInt}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Note Number</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note Number</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getExplanationOfBenefitItems_NoteNumber()
	 * @model
	 * @generated
	 */
	EList<PositiveInt> getNoteNumbers();

	/**
	 * Returns the value of the '<em><b>Adjudication</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resource.ExplanationOfBenefitItemsItemAdjudication}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adjudication</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adjudication</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getExplanationOfBenefitItems_Adjudication()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExplanationOfBenefitItemsItemAdjudication> getAdjudications();

	/**
	 * Returns the value of the '<em><b>Detail</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.resource.ExplanationOfBenefitItemsDetail}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Detail</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detail</em>' containment reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getExplanationOfBenefitItems_Detail()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExplanationOfBenefitItemsDetail> getDetails();

	/**
	 * Returns the value of the '<em><b>Prosthesis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prosthesis</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prosthesis</em>' containment reference.
	 * @see #setProsthesis(ExplanationOfBenefitItemsProsthesis)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getExplanationOfBenefitItems_Prosthesis()
	 * @model containment="true"
	 * @generated
	 */
	ExplanationOfBenefitItemsProsthesis getProsthesis();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ExplanationOfBenefitItems#getProsthesis <em>Prosthesis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prosthesis</em>' containment reference.
	 * @see #getProsthesis()
	 * @generated
	 */
	void setProsthesis(ExplanationOfBenefitItemsProsthesis value);

} // ExplanationOfBenefitItems