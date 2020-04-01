/**
 */
package org.eclipse.mdht.hl7.fhir.resources.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.hl7.fhir.dataTypes.DataType;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.CoverageEligibilityRequestDetailsDiagnosis;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coverage Eligibility Request Details Diagnosis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.CoverageEligibilityRequestDetailsDiagnosisImpl#getDiagnosisx <em>Diagnosisx</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoverageEligibilityRequestDetailsDiagnosisImpl extends BackboneElementImpl implements CoverageEligibilityRequestDetailsDiagnosis {
	/**
	 * The cached value of the '{@link #getDiagnosisx() <em>Diagnosisx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosisx()
	 * @generated
	 * @ordered
	 */
	protected DataType diagnosisx;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoverageEligibilityRequestDetailsDiagnosisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getCoverageEligibilityRequestDetailsDiagnosis();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getDiagnosisx() {
		return diagnosisx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiagnosisx(DataType newDiagnosisx, NotificationChain msgs) {
		DataType oldDiagnosisx = diagnosisx;
		diagnosisx = newDiagnosisx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS_DIAGNOSIS__DIAGNOSISX, oldDiagnosisx, newDiagnosisx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiagnosisx(DataType newDiagnosisx) {
		if (newDiagnosisx != diagnosisx) {
			NotificationChain msgs = null;
			if (diagnosisx != null)
				msgs = ((InternalEObject)diagnosisx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS_DIAGNOSIS__DIAGNOSISX, null, msgs);
			if (newDiagnosisx != null)
				msgs = ((InternalEObject)newDiagnosisx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS_DIAGNOSIS__DIAGNOSISX, null, msgs);
			msgs = basicSetDiagnosisx(newDiagnosisx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS_DIAGNOSIS__DIAGNOSISX, newDiagnosisx, newDiagnosisx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS_DIAGNOSIS__DIAGNOSISX:
				return basicSetDiagnosisx(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS_DIAGNOSIS__DIAGNOSISX:
				return getDiagnosisx();
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
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS_DIAGNOSIS__DIAGNOSISX:
				setDiagnosisx((DataType)newValue);
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
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS_DIAGNOSIS__DIAGNOSISX:
				setDiagnosisx((DataType)null);
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
			case ResourcesPackage.COVERAGE_ELIGIBILITY_REQUEST_DETAILS_DIAGNOSIS__DIAGNOSISX:
				return diagnosisx != null;
		}
		return super.eIsSet(featureID);
	}

} //CoverageEligibilityRequestDetailsDiagnosisImpl
