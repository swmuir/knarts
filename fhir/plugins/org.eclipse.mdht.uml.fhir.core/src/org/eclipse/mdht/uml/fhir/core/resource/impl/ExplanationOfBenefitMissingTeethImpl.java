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
package org.eclipse.mdht.uml.fhir.core.resource.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.uml.fhir.core.datatype.Coding;
import org.eclipse.mdht.uml.fhir.core.datatype.Date;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.ExplanationOfBenefitMissingTeeth;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Explanation Of Benefit Missing Teeth</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitMissingTeethImpl#getTooth <em>Tooth</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitMissingTeethImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.ExplanationOfBenefitMissingTeethImpl#getExtractionDate <em>Extraction Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExplanationOfBenefitMissingTeethImpl extends BackboneElementImpl implements ExplanationOfBenefitMissingTeeth {
	/**
	 * The cached value of the '{@link #getTooth() <em>Tooth</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTooth()
	 * @generated
	 * @ordered
	 */
	protected Coding tooth;

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected Coding reason;

	/**
	 * The cached value of the '{@link #getExtractionDate() <em>Extraction Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtractionDate()
	 * @generated
	 * @ordered
	 */
	protected Date extractionDate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExplanationOfBenefitMissingTeethImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getExplanationOfBenefitMissingTeeth();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getTooth() {
		if (tooth != null && tooth.eIsProxy()) {
			InternalEObject oldTooth = (InternalEObject)tooth;
			tooth = (Coding)eResolveProxy(oldTooth);
			if (tooth != oldTooth) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPLANATION_OF_BENEFIT_MISSING_TEETH__TOOTH, oldTooth, tooth));
			}
		}
		return tooth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetTooth() {
		return tooth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTooth(Coding newTooth) {
		Coding oldTooth = tooth;
		tooth = newTooth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT_MISSING_TEETH__TOOTH, oldTooth, tooth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getReason() {
		if (reason != null && reason.eIsProxy()) {
			InternalEObject oldReason = (InternalEObject)reason;
			reason = (Coding)eResolveProxy(oldReason);
			if (reason != oldReason) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPLANATION_OF_BENEFIT_MISSING_TEETH__REASON, oldReason, reason));
			}
		}
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding basicGetReason() {
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReason(Coding newReason) {
		Coding oldReason = reason;
		reason = newReason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT_MISSING_TEETH__REASON, oldReason, reason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getExtractionDate() {
		if (extractionDate != null && extractionDate.eIsProxy()) {
			InternalEObject oldExtractionDate = (InternalEObject)extractionDate;
			extractionDate = (Date)eResolveProxy(oldExtractionDate);
			if (extractionDate != oldExtractionDate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.EXPLANATION_OF_BENEFIT_MISSING_TEETH__EXTRACTION_DATE, oldExtractionDate, extractionDate));
			}
		}
		return extractionDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date basicGetExtractionDate() {
		return extractionDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtractionDate(Date newExtractionDate) {
		Date oldExtractionDate = extractionDate;
		extractionDate = newExtractionDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.EXPLANATION_OF_BENEFIT_MISSING_TEETH__EXTRACTION_DATE, oldExtractionDate, extractionDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_MISSING_TEETH__TOOTH:
				if (resolve) return getTooth();
				return basicGetTooth();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_MISSING_TEETH__REASON:
				if (resolve) return getReason();
				return basicGetReason();
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_MISSING_TEETH__EXTRACTION_DATE:
				if (resolve) return getExtractionDate();
				return basicGetExtractionDate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_MISSING_TEETH__TOOTH:
				setTooth((Coding)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_MISSING_TEETH__REASON:
				setReason((Coding)newValue);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_MISSING_TEETH__EXTRACTION_DATE:
				setExtractionDate((Date)newValue);
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
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_MISSING_TEETH__TOOTH:
				setTooth((Coding)null);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_MISSING_TEETH__REASON:
				setReason((Coding)null);
				return;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_MISSING_TEETH__EXTRACTION_DATE:
				setExtractionDate((Date)null);
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
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_MISSING_TEETH__TOOTH:
				return tooth != null;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_MISSING_TEETH__REASON:
				return reason != null;
			case FhirResourcePackage.EXPLANATION_OF_BENEFIT_MISSING_TEETH__EXTRACTION_DATE:
				return extractionDate != null;
		}
		return super.eIsSet(featureID);
	}

} //ExplanationOfBenefitMissingTeethImpl
