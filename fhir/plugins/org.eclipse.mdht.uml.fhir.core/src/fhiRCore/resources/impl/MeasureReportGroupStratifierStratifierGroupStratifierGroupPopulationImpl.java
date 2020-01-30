/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Reference;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.MeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation;
import fhiRCore.resources.ResourcesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure Report Group Stratifier Stratifier Group Stratifier Group Population</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.MeasureReportGroupStratifierStratifierGroupStratifierGroupPopulationImpl#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MeasureReportGroupStratifierStratifierGroupStratifierGroupPopulationImpl#getCount <em>Count</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MeasureReportGroupStratifierStratifierGroupStratifierGroupPopulationImpl#getSubjectResults <em>Subject Results</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasureReportGroupStratifierStratifierGroupStratifierGroupPopulationImpl extends BackboneElementImpl implements MeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation {
	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept code;

	/**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Integer count;

	/**
	 * The cached value of the '{@link #getSubjectResults() <em>Subject Results</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectResults()
	 * @generated
	 * @ordered
	 */
	protected Reference subjectResults;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureReportGroupStratifierStratifierGroupStratifierGroupPopulationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getMeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(CodeableConcept newCode, NotificationChain msgs) {
		CodeableConcept oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP_STRATIFIER_GROUP_POPULATION__CODE, oldCode, newCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(CodeableConcept newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP_STRATIFIER_GROUP_POPULATION__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP_STRATIFIER_GROUP_POPULATION__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP_STRATIFIER_GROUP_POPULATION__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Integer getCount() {
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCount(fhiRCore.dataTypes.Integer newCount, NotificationChain msgs) {
		fhiRCore.dataTypes.Integer oldCount = count;
		count = newCount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP_STRATIFIER_GROUP_POPULATION__COUNT, oldCount, newCount);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCount(fhiRCore.dataTypes.Integer newCount) {
		if (newCount != count) {
			NotificationChain msgs = null;
			if (count != null)
				msgs = ((InternalEObject)count).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP_STRATIFIER_GROUP_POPULATION__COUNT, null, msgs);
			if (newCount != null)
				msgs = ((InternalEObject)newCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP_STRATIFIER_GROUP_POPULATION__COUNT, null, msgs);
			msgs = basicSetCount(newCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP_STRATIFIER_GROUP_POPULATION__COUNT, newCount, newCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getSubjectResults() {
		return subjectResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubjectResults(Reference newSubjectResults, NotificationChain msgs) {
		Reference oldSubjectResults = subjectResults;
		subjectResults = newSubjectResults;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP_STRATIFIER_GROUP_POPULATION__SUBJECT_RESULTS, oldSubjectResults, newSubjectResults);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubjectResults(Reference newSubjectResults) {
		if (newSubjectResults != subjectResults) {
			NotificationChain msgs = null;
			if (subjectResults != null)
				msgs = ((InternalEObject)subjectResults).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP_STRATIFIER_GROUP_POPULATION__SUBJECT_RESULTS, null, msgs);
			if (newSubjectResults != null)
				msgs = ((InternalEObject)newSubjectResults).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP_STRATIFIER_GROUP_POPULATION__SUBJECT_RESULTS, null, msgs);
			msgs = basicSetSubjectResults(newSubjectResults, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP_STRATIFIER_GROUP_POPULATION__SUBJECT_RESULTS, newSubjectResults, newSubjectResults));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP_STRATIFIER_GROUP_POPULATION__CODE:
				return basicSetCode(null, msgs);
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP_STRATIFIER_GROUP_POPULATION__COUNT:
				return basicSetCount(null, msgs);
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP_STRATIFIER_GROUP_POPULATION__SUBJECT_RESULTS:
				return basicSetSubjectResults(null, msgs);
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
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP_STRATIFIER_GROUP_POPULATION__CODE:
				return getCode();
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP_STRATIFIER_GROUP_POPULATION__COUNT:
				return getCount();
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP_STRATIFIER_GROUP_POPULATION__SUBJECT_RESULTS:
				return getSubjectResults();
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
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP_STRATIFIER_GROUP_POPULATION__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP_STRATIFIER_GROUP_POPULATION__COUNT:
				setCount((fhiRCore.dataTypes.Integer)newValue);
				return;
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP_STRATIFIER_GROUP_POPULATION__SUBJECT_RESULTS:
				setSubjectResults((Reference)newValue);
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
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP_STRATIFIER_GROUP_POPULATION__CODE:
				setCode((CodeableConcept)null);
				return;
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP_STRATIFIER_GROUP_POPULATION__COUNT:
				setCount((fhiRCore.dataTypes.Integer)null);
				return;
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP_STRATIFIER_GROUP_POPULATION__SUBJECT_RESULTS:
				setSubjectResults((Reference)null);
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
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP_STRATIFIER_GROUP_POPULATION__CODE:
				return code != null;
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP_STRATIFIER_GROUP_POPULATION__COUNT:
				return count != null;
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP_STRATIFIER_GROUP_POPULATION__SUBJECT_RESULTS:
				return subjectResults != null;
		}
		return super.eIsSet(featureID);
	}

} //MeasureReportGroupStratifierStratifierGroupStratifierGroupPopulationImpl
