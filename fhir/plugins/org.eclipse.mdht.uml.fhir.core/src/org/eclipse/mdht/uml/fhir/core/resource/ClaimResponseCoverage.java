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
import org.eclipse.mdht.uml.fhir.core.datatype.Coding;
import org.eclipse.mdht.uml.fhir.core.datatype.PositiveInt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim Response Coverage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponseCoverage#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponseCoverage#getFocal <em>Focal</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponseCoverage#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponseCoverage#getBusinessArrangement <em>Business Arrangement</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponseCoverage#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponseCoverage#getPreAuthRefs <em>Pre Auth Ref</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponseCoverage#getClaimResponse <em>Claim Response</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponseCoverage#getOriginalRuleset <em>Original Ruleset</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaimResponseCoverage()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ClaimResponse_Coverage'"
 * @generated
 */
public interface ClaimResponseCoverage extends BackboneElement {
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
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaimResponseCoverage_Sequence()
	 * @model required="true"
	 * @generated
	 */
	PositiveInt getSequence();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponseCoverage#getSequence <em>Sequence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' reference.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Focal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Focal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Focal</em>' reference.
	 * @see #setFocal(org.eclipse.mdht.uml.fhir.core.datatype.Boolean)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaimResponseCoverage_Focal()
	 * @model required="true"
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.Boolean getFocal();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponseCoverage#getFocal <em>Focal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Focal</em>' reference.
	 * @see #getFocal()
	 * @generated
	 */
	void setFocal(org.eclipse.mdht.uml.fhir.core.datatype.Boolean value);

	/**
	 * Returns the value of the '<em><b>Coverage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coverage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coverage</em>' reference.
	 * @see #setCoverage(Coverage)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaimResponseCoverage_Coverage()
	 * @model required="true"
	 * @generated
	 */
	Coverage getCoverage();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponseCoverage#getCoverage <em>Coverage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coverage</em>' reference.
	 * @see #getCoverage()
	 * @generated
	 */
	void setCoverage(Coverage value);

	/**
	 * Returns the value of the '<em><b>Business Arrangement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Arrangement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Arrangement</em>' reference.
	 * @see #setBusinessArrangement(org.eclipse.mdht.uml.fhir.core.datatype.String)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaimResponseCoverage_BusinessArrangement()
	 * @model
	 * @generated
	 */
	org.eclipse.mdht.uml.fhir.core.datatype.String getBusinessArrangement();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponseCoverage#getBusinessArrangement <em>Business Arrangement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Arrangement</em>' reference.
	 * @see #getBusinessArrangement()
	 * @generated
	 */
	void setBusinessArrangement(org.eclipse.mdht.uml.fhir.core.datatype.String value);

	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship</em>' reference.
	 * @see #setRelationship(Coding)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaimResponseCoverage_Relationship()
	 * @model required="true"
	 * @generated
	 */
	Coding getRelationship();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponseCoverage#getRelationship <em>Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship</em>' reference.
	 * @see #getRelationship()
	 * @generated
	 */
	void setRelationship(Coding value);

	/**
	 * Returns the value of the '<em><b>Pre Auth Ref</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.mdht.uml.fhir.core.datatype.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre Auth Ref</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre Auth Ref</em>' reference list.
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaimResponseCoverage_PreAuthRef()
	 * @model
	 * @generated
	 */
	EList<org.eclipse.mdht.uml.fhir.core.datatype.String> getPreAuthRefs();

	/**
	 * Returns the value of the '<em><b>Claim Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Claim Response</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Claim Response</em>' reference.
	 * @see #setClaimResponse(ClaimResponse)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaimResponseCoverage_ClaimResponse()
	 * @model
	 * @generated
	 */
	ClaimResponse getClaimResponse();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponseCoverage#getClaimResponse <em>Claim Response</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Claim Response</em>' reference.
	 * @see #getClaimResponse()
	 * @generated
	 */
	void setClaimResponse(ClaimResponse value);

	/**
	 * Returns the value of the '<em><b>Original Ruleset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Ruleset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Ruleset</em>' reference.
	 * @see #setOriginalRuleset(Coding)
	 * @see org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage#getClaimResponseCoverage_OriginalRuleset()
	 * @model
	 * @generated
	 */
	Coding getOriginalRuleset();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.fhir.core.resource.ClaimResponseCoverage#getOriginalRuleset <em>Original Ruleset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Ruleset</em>' reference.
	 * @see #getOriginalRuleset()
	 * @generated
	 */
	void setOriginalRuleset(Coding value);

} // ClaimResponseCoverage
