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
import org.eclipse.mdht.uml.fhir.core.datatype.Coding;
import org.eclipse.mdht.uml.fhir.core.datatype.DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eligibility Response Benefits Benefit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.EligibilityResponseBenefitsBenefit#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.EligibilityResponseBenefitsBenefit#getBenefitx <em>Benefitx</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.EligibilityResponseBenefitsBenefit#getBenefitUsedx <em>Benefit Usedx</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getEligibilityResponseBenefitsBenefit()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Benefits_Benefit'"
 * @generated
 */
public interface EligibilityResponseBenefitsBenefit extends BackboneElement {
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
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getEligibilityResponseBenefitsBenefit_Type()
	 * @model required="true"
	 * @generated
	 */
	Coding getType();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.EligibilityResponseBenefitsBenefit#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Coding value);

	/**
	 * Returns the value of the '<em><b>Benefitx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Benefitx</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Benefitx</em>' reference.
	 * @see #setBenefitx(DataType)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getEligibilityResponseBenefitsBenefit_Benefitx()
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='benefit[x]'"
	 * @generated
	 */
	DataType getBenefitx();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.EligibilityResponseBenefitsBenefit#getBenefitx <em>Benefitx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Benefitx</em>' reference.
	 * @see #getBenefitx()
	 * @generated
	 */
	void setBenefitx(DataType value);

	/**
	 * Returns the value of the '<em><b>Benefit Usedx</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Benefit Usedx</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Benefit Usedx</em>' reference.
	 * @see #setBenefitUsedx(DataType)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getEligibilityResponseBenefitsBenefit_BenefitUsedx()
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='benefitUsed[x]'"
	 * @generated
	 */
	DataType getBenefitUsedx();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.EligibilityResponseBenefitsBenefit#getBenefitUsedx <em>Benefit Usedx</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Benefit Usedx</em>' reference.
	 * @see #getBenefitUsedx()
	 * @generated
	 */
	void setBenefitUsedx(DataType value);

} // EligibilityResponseBenefitsBenefit
