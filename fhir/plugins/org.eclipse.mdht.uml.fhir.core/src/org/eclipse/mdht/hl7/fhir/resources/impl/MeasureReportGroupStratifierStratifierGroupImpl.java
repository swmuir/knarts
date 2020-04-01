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

import org.eclipse.mdht.hl7.fhir.resources.MeasureReportGroupStratifierStratifierGroup;
import org.eclipse.mdht.hl7.fhir.resources.MeasureReportGroupStratifierStratifierGroupComponent;
import org.eclipse.mdht.hl7.fhir.resources.MeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure Report Group Stratifier Stratifier Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MeasureReportGroupStratifierStratifierGroupImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MeasureReportGroupStratifierStratifierGroupImpl#getComponents <em>Component</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MeasureReportGroupStratifierStratifierGroupImpl#getPopulations <em>Population</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MeasureReportGroupStratifierStratifierGroupImpl#getMeasureScore <em>Measure Score</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasureReportGroupStratifierStratifierGroupImpl extends BackboneElementImpl implements MeasureReportGroupStratifierStratifierGroup {
	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept value;

	/**
	 * The cached value of the '{@link #getComponents() <em>Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureReportGroupStratifierStratifierGroupComponent> components;

	/**
	 * The cached value of the '{@link #getPopulations() <em>Population</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulations()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation> populations;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureReportGroupStratifierStratifierGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getMeasureReportGroupStratifierStratifierGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(CodeableConcept newValue, NotificationChain msgs) {
		CodeableConcept oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP__VALUE, oldValue, newValue);
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
	public void setValue(CodeableConcept newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MeasureReportGroupStratifierStratifierGroupComponent> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<MeasureReportGroupStratifierStratifierGroupComponent>(MeasureReportGroupStratifierStratifierGroupComponent.class, this, ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP__COMPONENT);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation> getPopulations() {
		if (populations == null) {
			populations = new EObjectContainmentEList<MeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation>(MeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation.class, this, ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP__POPULATION);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP__MEASURE_SCORE, oldMeasureScore, newMeasureScore);
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
				msgs = ((InternalEObject)measureScore).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP__MEASURE_SCORE, null, msgs);
			if (newMeasureScore != null)
				msgs = ((InternalEObject)newMeasureScore).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP__MEASURE_SCORE, null, msgs);
			msgs = basicSetMeasureScore(newMeasureScore, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP__MEASURE_SCORE, newMeasureScore, newMeasureScore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP__VALUE:
				return basicSetValue(null, msgs);
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP__COMPONENT:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP__POPULATION:
				return ((InternalEList<?>)getPopulations()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP__MEASURE_SCORE:
				return basicSetMeasureScore(null, msgs);
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
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP__VALUE:
				return getValue();
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP__COMPONENT:
				return getComponents();
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP__POPULATION:
				return getPopulations();
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP__MEASURE_SCORE:
				return getMeasureScore();
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
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP__VALUE:
				setValue((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP__COMPONENT:
				getComponents().clear();
				getComponents().addAll((Collection<? extends MeasureReportGroupStratifierStratifierGroupComponent>)newValue);
				return;
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP__POPULATION:
				getPopulations().clear();
				getPopulations().addAll((Collection<? extends MeasureReportGroupStratifierStratifierGroupStratifierGroupPopulation>)newValue);
				return;
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP__MEASURE_SCORE:
				setMeasureScore((Quantity)newValue);
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
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP__VALUE:
				setValue((CodeableConcept)null);
				return;
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP__COMPONENT:
				getComponents().clear();
				return;
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP__POPULATION:
				getPopulations().clear();
				return;
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP__MEASURE_SCORE:
				setMeasureScore((Quantity)null);
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
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP__VALUE:
				return value != null;
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP__COMPONENT:
				return components != null && !components.isEmpty();
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP__POPULATION:
				return populations != null && !populations.isEmpty();
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER_STRATIFIER_GROUP__MEASURE_SCORE:
				return measureScore != null;
		}
		return super.eIsSet(featureID);
	}

} //MeasureReportGroupStratifierStratifierGroupImpl
