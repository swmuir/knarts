/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.CodeableConcept;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.MeasureGroup;
import fhiRCore.resources.MeasureGroupPopulation;
import fhiRCore.resources.MeasureGroupStratifier;
import fhiRCore.resources.ResourcesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.MeasureGroupImpl#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MeasureGroupImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MeasureGroupImpl#getPopulations <em>Population</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MeasureGroupImpl#getStratifiers <em>Stratifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasureGroupImpl extends BackboneElementImpl implements MeasureGroup {
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
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String description;

	/**
	 * The cached value of the '{@link #getPopulations() <em>Population</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulations()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureGroupPopulation> populations;

	/**
	 * The cached value of the '{@link #getStratifiers() <em>Stratifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStratifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureGroupStratifier> stratifiers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getMeasureGroup();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEASURE_GROUP__CODE, oldCode, newCode);
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
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEASURE_GROUP__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEASURE_GROUP__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEASURE_GROUP__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(fhiRCore.dataTypes.String newDescription, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEASURE_GROUP__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(fhiRCore.dataTypes.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEASURE_GROUP__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEASURE_GROUP__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEASURE_GROUP__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureGroupPopulation> getPopulations() {
		if (populations == null) {
			populations = new EObjectContainmentEList<MeasureGroupPopulation>(MeasureGroupPopulation.class, this, ResourcesPackage.MEASURE_GROUP__POPULATION);
		}
		return populations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureGroupStratifier> getStratifiers() {
		if (stratifiers == null) {
			stratifiers = new EObjectContainmentEList<MeasureGroupStratifier>(MeasureGroupStratifier.class, this, ResourcesPackage.MEASURE_GROUP__STRATIFIER);
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
			case ResourcesPackage.MEASURE_GROUP__CODE:
				return basicSetCode(null, msgs);
			case ResourcesPackage.MEASURE_GROUP__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case ResourcesPackage.MEASURE_GROUP__POPULATION:
				return ((InternalEList<?>)getPopulations()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEASURE_GROUP__STRATIFIER:
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
			case ResourcesPackage.MEASURE_GROUP__CODE:
				return getCode();
			case ResourcesPackage.MEASURE_GROUP__DESCRIPTION:
				return getDescription();
			case ResourcesPackage.MEASURE_GROUP__POPULATION:
				return getPopulations();
			case ResourcesPackage.MEASURE_GROUP__STRATIFIER:
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
			case ResourcesPackage.MEASURE_GROUP__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MEASURE_GROUP__DESCRIPTION:
				setDescription((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.MEASURE_GROUP__POPULATION:
				getPopulations().clear();
				getPopulations().addAll((Collection<? extends MeasureGroupPopulation>)newValue);
				return;
			case ResourcesPackage.MEASURE_GROUP__STRATIFIER:
				getStratifiers().clear();
				getStratifiers().addAll((Collection<? extends MeasureGroupStratifier>)newValue);
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
			case ResourcesPackage.MEASURE_GROUP__CODE:
				setCode((CodeableConcept)null);
				return;
			case ResourcesPackage.MEASURE_GROUP__DESCRIPTION:
				setDescription((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.MEASURE_GROUP__POPULATION:
				getPopulations().clear();
				return;
			case ResourcesPackage.MEASURE_GROUP__STRATIFIER:
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
			case ResourcesPackage.MEASURE_GROUP__CODE:
				return code != null;
			case ResourcesPackage.MEASURE_GROUP__DESCRIPTION:
				return description != null;
			case ResourcesPackage.MEASURE_GROUP__POPULATION:
				return populations != null && !populations.isEmpty();
			case ResourcesPackage.MEASURE_GROUP__STRATIFIER:
				return stratifiers != null && !stratifiers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MeasureGroupImpl
