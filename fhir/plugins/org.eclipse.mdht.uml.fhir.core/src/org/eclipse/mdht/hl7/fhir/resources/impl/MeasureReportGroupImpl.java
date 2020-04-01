/**
 */
package org.eclipse.mdht.hl7.fhir.resources.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.Quantity;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.MeasureReportGroup;
import org.eclipse.mdht.hl7.fhir.resources.MeasureReportGroupPopulation;
import org.eclipse.mdht.hl7.fhir.resources.MeasureReportGroupStratifier;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure Report Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MeasureReportGroupImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MeasureReportGroupImpl#getPopulations <em>Population</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MeasureReportGroupImpl#getMeasureScore <em>Measure Score</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MeasureReportGroupImpl#getStratifiers <em>Stratifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasureReportGroupImpl extends BackboneElementImpl implements MeasureReportGroup {
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
	 * The cached value of the '{@link #getPopulations() <em>Population</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulations()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureReportGroupPopulation> populations;

	/**
	 * The cached value of the '{@link #getMeasureScore() <em>Measure Score</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureScore()
	 * @generated
	 * @ordered
	 */
	protected Quantity measureScore;

	/**
	 * The cached value of the '{@link #getStratifiers() <em>Stratifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStratifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureReportGroupStratifier> stratifiers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureReportGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getMeasureReportGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEASURE_REPORT_GROUP__CODE, oldCode, newCode);
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
	public void setCode(CodeableConcept newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEASURE_REPORT_GROUP__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEASURE_REPORT_GROUP__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEASURE_REPORT_GROUP__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MeasureReportGroupPopulation> getPopulations() {
		if (populations == null) {
			populations = new EObjectContainmentEList<MeasureReportGroupPopulation>(MeasureReportGroupPopulation.class, this, ResourcesPackage.MEASURE_REPORT_GROUP__POPULATION);
		}
		return populations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Quantity getMeasureScore() {
		return measureScore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasureScore(Quantity newMeasureScore, NotificationChain msgs) {
		Quantity oldMeasureScore = measureScore;
		measureScore = newMeasureScore;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE, oldMeasureScore, newMeasureScore);
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
	public void setMeasureScore(Quantity newMeasureScore) {
		if (newMeasureScore != measureScore) {
			NotificationChain msgs = null;
			if (measureScore != null)
				msgs = ((InternalEObject)measureScore).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE, null, msgs);
			if (newMeasureScore != null)
				msgs = ((InternalEObject)newMeasureScore).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE, null, msgs);
			msgs = basicSetMeasureScore(newMeasureScore, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE, newMeasureScore, newMeasureScore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MeasureReportGroupStratifier> getStratifiers() {
		if (stratifiers == null) {
			stratifiers = new EObjectContainmentEList<MeasureReportGroupStratifier>(MeasureReportGroupStratifier.class, this, ResourcesPackage.MEASURE_REPORT_GROUP__STRATIFIER);
		}
		return stratifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.MEASURE_REPORT_GROUP__CODE:
				return basicSetCode(null, msgs);
			case ResourcesPackage.MEASURE_REPORT_GROUP__POPULATION:
				return ((InternalEList<?>)getPopulations()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE:
				return basicSetMeasureScore(null, msgs);
			case ResourcesPackage.MEASURE_REPORT_GROUP__STRATIFIER:
				return ((InternalEList<?>)getStratifiers()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.MEASURE_REPORT_GROUP__CODE:
				return getCode();
			case ResourcesPackage.MEASURE_REPORT_GROUP__POPULATION:
				return getPopulations();
			case ResourcesPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE:
				return getMeasureScore();
			case ResourcesPackage.MEASURE_REPORT_GROUP__STRATIFIER:
				return getStratifiers();
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
			case ResourcesPackage.MEASURE_REPORT_GROUP__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MEASURE_REPORT_GROUP__POPULATION:
				getPopulations().clear();
				getPopulations().addAll((Collection<? extends MeasureReportGroupPopulation>)newValue);
				return;
			case ResourcesPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE:
				setMeasureScore((Quantity)newValue);
				return;
			case ResourcesPackage.MEASURE_REPORT_GROUP__STRATIFIER:
				getStratifiers().clear();
				getStratifiers().addAll((Collection<? extends MeasureReportGroupStratifier>)newValue);
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
			case ResourcesPackage.MEASURE_REPORT_GROUP__CODE:
				setCode((CodeableConcept)null);
				return;
			case ResourcesPackage.MEASURE_REPORT_GROUP__POPULATION:
				getPopulations().clear();
				return;
			case ResourcesPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE:
				setMeasureScore((Quantity)null);
				return;
			case ResourcesPackage.MEASURE_REPORT_GROUP__STRATIFIER:
				getStratifiers().clear();
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
			case ResourcesPackage.MEASURE_REPORT_GROUP__CODE:
				return code != null;
			case ResourcesPackage.MEASURE_REPORT_GROUP__POPULATION:
				return populations != null && !populations.isEmpty();
			case ResourcesPackage.MEASURE_REPORT_GROUP__MEASURE_SCORE:
				return measureScore != null;
			case ResourcesPackage.MEASURE_REPORT_GROUP__STRATIFIER:
				return stratifiers != null && !stratifiers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MeasureReportGroupImpl
