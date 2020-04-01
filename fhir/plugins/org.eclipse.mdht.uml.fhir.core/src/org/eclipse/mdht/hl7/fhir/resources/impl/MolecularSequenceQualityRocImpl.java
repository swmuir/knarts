/**
 */
package org.eclipse.mdht.hl7.fhir.resources.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.hl7.fhir.dataTypes.Decimal;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.MolecularSequenceQualityRoc;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Molecular Sequence Quality Roc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MolecularSequenceQualityRocImpl#getScores <em>Score</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MolecularSequenceQualityRocImpl#getNumTps <em>Num Tp</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MolecularSequenceQualityRocImpl#getNumFps <em>Num Fp</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MolecularSequenceQualityRocImpl#getNumFns <em>Num Fn</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MolecularSequenceQualityRocImpl#getPrecisions <em>Precision</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MolecularSequenceQualityRocImpl#getSensitivities <em>Sensitivity</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.MolecularSequenceQualityRocImpl#getFMeasures <em>FMeasure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MolecularSequenceQualityRocImpl extends BackboneElementImpl implements MolecularSequenceQualityRoc {
	/**
	 * The cached value of the '{@link #getScores() <em>Score</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScores()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.mdht.hl7.fhir.dataTypes.Integer> scores;

	/**
	 * The cached value of the '{@link #getNumTps() <em>Num Tp</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumTps()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.mdht.hl7.fhir.dataTypes.Integer> numTps;

	/**
	 * The cached value of the '{@link #getNumFps() <em>Num Fp</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumFps()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.mdht.hl7.fhir.dataTypes.Integer> numFps;

	/**
	 * The cached value of the '{@link #getNumFns() <em>Num Fn</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumFns()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.mdht.hl7.fhir.dataTypes.Integer> numFns;

	/**
	 * The cached value of the '{@link #getPrecisions() <em>Precision</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecisions()
	 * @generated
	 * @ordered
	 */
	protected EList<Decimal> precisions;

	/**
	 * The cached value of the '{@link #getSensitivities() <em>Sensitivity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensitivities()
	 * @generated
	 * @ordered
	 */
	protected EList<Decimal> sensitivities;

	/**
	 * The cached value of the '{@link #getFMeasures() <em>FMeasure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFMeasures()
	 * @generated
	 * @ordered
	 */
	protected EList<Decimal> fMeasures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MolecularSequenceQualityRocImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getMolecularSequenceQualityRoc();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.eclipse.mdht.hl7.fhir.dataTypes.Integer> getScores() {
		if (scores == null) {
			scores = new EObjectContainmentEList<org.eclipse.mdht.hl7.fhir.dataTypes.Integer>(org.eclipse.mdht.hl7.fhir.dataTypes.Integer.class, this, ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY_ROC__SCORE);
		}
		return scores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.eclipse.mdht.hl7.fhir.dataTypes.Integer> getNumTps() {
		if (numTps == null) {
			numTps = new EObjectContainmentEList<org.eclipse.mdht.hl7.fhir.dataTypes.Integer>(org.eclipse.mdht.hl7.fhir.dataTypes.Integer.class, this, ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY_ROC__NUM_TP);
		}
		return numTps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.eclipse.mdht.hl7.fhir.dataTypes.Integer> getNumFps() {
		if (numFps == null) {
			numFps = new EObjectContainmentEList<org.eclipse.mdht.hl7.fhir.dataTypes.Integer>(org.eclipse.mdht.hl7.fhir.dataTypes.Integer.class, this, ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY_ROC__NUM_FP);
		}
		return numFps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.eclipse.mdht.hl7.fhir.dataTypes.Integer> getNumFns() {
		if (numFns == null) {
			numFns = new EObjectContainmentEList<org.eclipse.mdht.hl7.fhir.dataTypes.Integer>(org.eclipse.mdht.hl7.fhir.dataTypes.Integer.class, this, ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY_ROC__NUM_FN);
		}
		return numFns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Decimal> getPrecisions() {
		if (precisions == null) {
			precisions = new EObjectContainmentEList<Decimal>(Decimal.class, this, ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY_ROC__PRECISION);
		}
		return precisions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Decimal> getSensitivities() {
		if (sensitivities == null) {
			sensitivities = new EObjectContainmentEList<Decimal>(Decimal.class, this, ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY_ROC__SENSITIVITY);
		}
		return sensitivities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Decimal> getFMeasures() {
		if (fMeasures == null) {
			fMeasures = new EObjectContainmentEList<Decimal>(Decimal.class, this, ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY_ROC__FMEASURE);
		}
		return fMeasures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY_ROC__SCORE:
				return ((InternalEList<?>)getScores()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY_ROC__NUM_TP:
				return ((InternalEList<?>)getNumTps()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY_ROC__NUM_FP:
				return ((InternalEList<?>)getNumFps()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY_ROC__NUM_FN:
				return ((InternalEList<?>)getNumFns()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY_ROC__PRECISION:
				return ((InternalEList<?>)getPrecisions()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY_ROC__SENSITIVITY:
				return ((InternalEList<?>)getSensitivities()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY_ROC__FMEASURE:
				return ((InternalEList<?>)getFMeasures()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY_ROC__SCORE:
				return getScores();
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY_ROC__NUM_TP:
				return getNumTps();
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY_ROC__NUM_FP:
				return getNumFps();
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY_ROC__NUM_FN:
				return getNumFns();
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY_ROC__PRECISION:
				return getPrecisions();
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY_ROC__SENSITIVITY:
				return getSensitivities();
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY_ROC__FMEASURE:
				return getFMeasures();
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
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY_ROC__SCORE:
				getScores().clear();
				getScores().addAll((Collection<? extends org.eclipse.mdht.hl7.fhir.dataTypes.Integer>)newValue);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY_ROC__NUM_TP:
				getNumTps().clear();
				getNumTps().addAll((Collection<? extends org.eclipse.mdht.hl7.fhir.dataTypes.Integer>)newValue);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY_ROC__NUM_FP:
				getNumFps().clear();
				getNumFps().addAll((Collection<? extends org.eclipse.mdht.hl7.fhir.dataTypes.Integer>)newValue);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY_ROC__NUM_FN:
				getNumFns().clear();
				getNumFns().addAll((Collection<? extends org.eclipse.mdht.hl7.fhir.dataTypes.Integer>)newValue);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY_ROC__PRECISION:
				getPrecisions().clear();
				getPrecisions().addAll((Collection<? extends Decimal>)newValue);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY_ROC__SENSITIVITY:
				getSensitivities().clear();
				getSensitivities().addAll((Collection<? extends Decimal>)newValue);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY_ROC__FMEASURE:
				getFMeasures().clear();
				getFMeasures().addAll((Collection<? extends Decimal>)newValue);
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
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY_ROC__SCORE:
				getScores().clear();
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY_ROC__NUM_TP:
				getNumTps().clear();
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY_ROC__NUM_FP:
				getNumFps().clear();
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY_ROC__NUM_FN:
				getNumFns().clear();
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY_ROC__PRECISION:
				getPrecisions().clear();
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY_ROC__SENSITIVITY:
				getSensitivities().clear();
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY_ROC__FMEASURE:
				getFMeasures().clear();
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
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY_ROC__SCORE:
				return scores != null && !scores.isEmpty();
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY_ROC__NUM_TP:
				return numTps != null && !numTps.isEmpty();
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY_ROC__NUM_FP:
				return numFps != null && !numFps.isEmpty();
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY_ROC__NUM_FN:
				return numFns != null && !numFns.isEmpty();
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY_ROC__PRECISION:
				return precisions != null && !precisions.isEmpty();
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY_ROC__SENSITIVITY:
				return sensitivities != null && !sensitivities.isEmpty();
			case ResourcesPackage.MOLECULAR_SEQUENCE_QUALITY_ROC__FMEASURE:
				return fMeasures != null && !fMeasures.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MolecularSequenceQualityRocImpl
