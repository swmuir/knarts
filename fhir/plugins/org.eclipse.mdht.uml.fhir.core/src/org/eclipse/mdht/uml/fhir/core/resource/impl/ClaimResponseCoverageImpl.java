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
package org.eclipse.mdht.uml.fhir.core.resource.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.mdht.uml.fhir.core.datatype.Coding;
import org.eclipse.mdht.uml.fhir.core.datatype.PositiveInt;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.ClaimResponse;
import org.eclipse.mdht.uml.fhir.core.resource.ClaimResponseCoverage;
import org.eclipse.mdht.uml.fhir.core.resource.Coverage;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim Response Coverage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimResponseCoverageImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimResponseCoverageImpl#getFocal <em>Focal</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimResponseCoverageImpl#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimResponseCoverageImpl#getBusinessArrangement <em>Business Arrangement</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimResponseCoverageImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimResponseCoverageImpl#getPreAuthRefs <em>Pre Auth Ref</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimResponseCoverageImpl#getClaimResponse <em>Claim Response</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ClaimResponseCoverageImpl#getOriginalRuleset <em>Original Ruleset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClaimResponseCoverageImpl extends BackboneElementImpl implements ClaimResponseCoverage {
	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt sequence;

	/**
	 * The cached value of the '{@link #getFocal() <em>Focal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocal()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.Boolean focal;

	/**
	 * The cached value of the '{@link #getCoverage() <em>Coverage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverage()
	 * @generated
	 * @ordered
	 */
	protected Coverage coverage;

	/**
	 * The cached value of the '{@link #getBusinessArrangement() <em>Business Arrangement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessArrangement()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String businessArrangement;

	/**
	 * The cached value of the '{@link #getRelationship() <em>Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship()
	 * @generated
	 * @ordered
	 */
	protected Coding relationship;

	/**
	 * The cached value of the '{@link #getPreAuthRefs() <em>Pre Auth Ref</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreAuthRefs()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.mdht.uml.fhir.core.datatype.String> preAuthRefs;

	/**
	 * The cached value of the '{@link #getClaimResponse() <em>Claim Response</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaimResponse()
	 * @generated
	 * @ordered
	 */
	protected ClaimResponse claimResponse;

	/**
	 * The cached value of the '{@link #getOriginalRuleset() <em>Original Ruleset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalRuleset()
	 * @generated
	 * @ordered
	 */
	protected Coding originalRuleset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimResponseCoverageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getClaimResponseCoverage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getSequence() {
		if (sequence != null && sequence.eIsProxy()) {
			InternalEObject oldSequence = (InternalEObject)sequence;
			sequence = (PositiveInt)eResolveProxy(oldSequence);
			if (sequence != oldSequence) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM_RESPONSE_COVERAGE__SEQUENCE, oldSequence, sequence));
			}
		}
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt basicGetSequence() {
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequence(PositiveInt newSequence) {
		PositiveInt oldSequence = sequence;
		sequence = newSequence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM_RESPONSE_COVERAGE__SEQUENCE, oldSequence, sequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean getFocal() {
		if (focal != null && focal.eIsProxy()) {
			InternalEObject oldFocal = (InternalEObject)focal;
			focal = (org.eclipse.mdht.uml.fhir.core.datatype.Boolean)eResolveProxy(oldFocal);
			if (focal != oldFocal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM_RESPONSE_COVERAGE__FOCAL, oldFocal, focal));
			}
		}
		return focal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean basicGetFocal() {
		return focal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFocal(org.eclipse.mdht.uml.fhir.core.datatype.Boolean newFocal) {
		org.eclipse.mdht.uml.fhir.core.datatype.Boolean oldFocal = focal;
		focal = newFocal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM_RESPONSE_COVERAGE__FOCAL, oldFocal, focal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coverage getCoverage() {
		if (coverage != null && coverage.eIsProxy()) {
			InternalEObject oldCoverage = (InternalEObject)coverage;
			coverage = (Coverage)eResolveProxy(oldCoverage);
			if (coverage != oldCoverage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM_RESPONSE_COVERAGE__COVERAGE, oldCoverage, coverage));
			}
		}
		return coverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coverage basicGetCoverage() {
		return coverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoverage(Coverage newCoverage) {
		Coverage oldCoverage = coverage;
		coverage = newCoverage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM_RESPONSE_COVERAGE__COVERAGE, oldCoverage, coverage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getBusinessArrangement() {
		if (businessArrangement != null && businessArrangement.eIsProxy()) {
			InternalEObject oldBusinessArrangement = (InternalEObject)businessArrangement;
			businessArrangement = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldBusinessArrangement);
			if (businessArrangement != oldBusinessArrangement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM_RESPONSE_COVERAGE__BUSINESS_ARRANGEMENT, oldBusinessArrangement, businessArrangement));
			}
		}
		return businessArrangement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetBusinessArrangement() {
		return businessArrangement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessArrangement(org.eclipse.mdht.uml.fhir.core.datatype.String newBusinessArrangement) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldBusinessArrangement = businessArrangement;
		businessArrangement = newBusinessArrangement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM_RESPONSE_COVERAGE__BUSINESS_ARRANGEMENT, oldBusinessArrangement, businessArrangement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getRelationship() {
		if (relationship != null && relationship.eIsProxy()) {
			InternalEObject oldRelationship = (InternalEObject)relationship;
			relationship = (Coding)eResolveProxy(oldRelationship);
			if (relationship != oldRelationship) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM_RESPONSE_COVERAGE__RELATIONSHIP, oldRelationship, relationship));
			}
		}
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetRelationship() {
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationship(Coding newRelationship) {
		Coding oldRelationship = relationship;
		relationship = newRelationship;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM_RESPONSE_COVERAGE__RELATIONSHIP, oldRelationship, relationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.mdht.uml.fhir.core.datatype.String> getPreAuthRefs() {
		if (preAuthRefs == null) {
			preAuthRefs = new EObjectResolvingEList<org.eclipse.mdht.uml.fhir.core.datatype.String>(org.eclipse.mdht.uml.fhir.core.datatype.String.class, this, FhirResourcePackage.CLAIM_RESPONSE_COVERAGE__PRE_AUTH_REF);
		}
		return preAuthRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponse getClaimResponse() {
		if (claimResponse != null && claimResponse.eIsProxy()) {
			InternalEObject oldClaimResponse = (InternalEObject)claimResponse;
			claimResponse = (ClaimResponse)eResolveProxy(oldClaimResponse);
			if (claimResponse != oldClaimResponse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM_RESPONSE_COVERAGE__CLAIM_RESPONSE, oldClaimResponse, claimResponse));
			}
		}
		return claimResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponse basicGetClaimResponse() {
		return claimResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClaimResponse(ClaimResponse newClaimResponse) {
		ClaimResponse oldClaimResponse = claimResponse;
		claimResponse = newClaimResponse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM_RESPONSE_COVERAGE__CLAIM_RESPONSE, oldClaimResponse, claimResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getOriginalRuleset() {
		if (originalRuleset != null && originalRuleset.eIsProxy()) {
			InternalEObject oldOriginalRuleset = (InternalEObject)originalRuleset;
			originalRuleset = (Coding)eResolveProxy(oldOriginalRuleset);
			if (originalRuleset != oldOriginalRuleset) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.CLAIM_RESPONSE_COVERAGE__ORIGINAL_RULESET, oldOriginalRuleset, originalRuleset));
			}
		}
		return originalRuleset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetOriginalRuleset() {
		return originalRuleset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalRuleset(Coding newOriginalRuleset) {
		Coding oldOriginalRuleset = originalRuleset;
		originalRuleset = newOriginalRuleset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.CLAIM_RESPONSE_COVERAGE__ORIGINAL_RULESET, oldOriginalRuleset, originalRuleset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirResourcePackage.CLAIM_RESPONSE_COVERAGE__SEQUENCE:
				if (resolve) return getSequence();
				return basicGetSequence();
			case FhirResourcePackage.CLAIM_RESPONSE_COVERAGE__FOCAL:
				if (resolve) return getFocal();
				return basicGetFocal();
			case FhirResourcePackage.CLAIM_RESPONSE_COVERAGE__COVERAGE:
				if (resolve) return getCoverage();
				return basicGetCoverage();
			case FhirResourcePackage.CLAIM_RESPONSE_COVERAGE__BUSINESS_ARRANGEMENT:
				if (resolve) return getBusinessArrangement();
				return basicGetBusinessArrangement();
			case FhirResourcePackage.CLAIM_RESPONSE_COVERAGE__RELATIONSHIP:
				if (resolve) return getRelationship();
				return basicGetRelationship();
			case FhirResourcePackage.CLAIM_RESPONSE_COVERAGE__PRE_AUTH_REF:
				return getPreAuthRefs();
			case FhirResourcePackage.CLAIM_RESPONSE_COVERAGE__CLAIM_RESPONSE:
				if (resolve) return getClaimResponse();
				return basicGetClaimResponse();
			case FhirResourcePackage.CLAIM_RESPONSE_COVERAGE__ORIGINAL_RULESET:
				if (resolve) return getOriginalRuleset();
				return basicGetOriginalRuleset();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirResourcePackage.CLAIM_RESPONSE_COVERAGE__SEQUENCE:
				setSequence((PositiveInt)newValue);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE_COVERAGE__FOCAL:
				setFocal((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)newValue);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE_COVERAGE__COVERAGE:
				setCoverage((Coverage)newValue);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE_COVERAGE__BUSINESS_ARRANGEMENT:
				setBusinessArrangement((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE_COVERAGE__RELATIONSHIP:
				setRelationship((Coding)newValue);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE_COVERAGE__PRE_AUTH_REF:
				getPreAuthRefs().clear();
				getPreAuthRefs().addAll((Collection<? extends org.eclipse.mdht.uml.fhir.core.datatype.String>)newValue);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE_COVERAGE__CLAIM_RESPONSE:
				setClaimResponse((ClaimResponse)newValue);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE_COVERAGE__ORIGINAL_RULESET:
				setOriginalRuleset((Coding)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FhirResourcePackage.CLAIM_RESPONSE_COVERAGE__SEQUENCE:
				setSequence((PositiveInt)null);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE_COVERAGE__FOCAL:
				setFocal((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)null);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE_COVERAGE__COVERAGE:
				setCoverage((Coverage)null);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE_COVERAGE__BUSINESS_ARRANGEMENT:
				setBusinessArrangement((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE_COVERAGE__RELATIONSHIP:
				setRelationship((Coding)null);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE_COVERAGE__PRE_AUTH_REF:
				getPreAuthRefs().clear();
				return;
			case FhirResourcePackage.CLAIM_RESPONSE_COVERAGE__CLAIM_RESPONSE:
				setClaimResponse((ClaimResponse)null);
				return;
			case FhirResourcePackage.CLAIM_RESPONSE_COVERAGE__ORIGINAL_RULESET:
				setOriginalRuleset((Coding)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FhirResourcePackage.CLAIM_RESPONSE_COVERAGE__SEQUENCE:
				return sequence != null;
			case FhirResourcePackage.CLAIM_RESPONSE_COVERAGE__FOCAL:
				return focal != null;
			case FhirResourcePackage.CLAIM_RESPONSE_COVERAGE__COVERAGE:
				return coverage != null;
			case FhirResourcePackage.CLAIM_RESPONSE_COVERAGE__BUSINESS_ARRANGEMENT:
				return businessArrangement != null;
			case FhirResourcePackage.CLAIM_RESPONSE_COVERAGE__RELATIONSHIP:
				return relationship != null;
			case FhirResourcePackage.CLAIM_RESPONSE_COVERAGE__PRE_AUTH_REF:
				return preAuthRefs != null && !preAuthRefs.isEmpty();
			case FhirResourcePackage.CLAIM_RESPONSE_COVERAGE__CLAIM_RESPONSE:
				return claimResponse != null;
			case FhirResourcePackage.CLAIM_RESPONSE_COVERAGE__ORIGINAL_RULESET:
				return originalRuleset != null;
		}
		return super.eIsSet(featureID);
	}

} //ClaimResponseCoverageImpl
