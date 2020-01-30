/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.CodeableConcept;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.MeasureReportGroupStratifier;
import fhiRCore.resources.MeasureReportGroupStratifierStratifierGroup;
import fhiRCore.resources.ResourcesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure Report Group Stratifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.MeasureReportGroupStratifierImpl#getCodes <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MeasureReportGroupStratifierImpl#getStratums <em>Stratum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasureReportGroupStratifierImpl extends BackboneElementImpl implements MeasureReportGroupStratifier {
	/**
	 * The cached value of the '{@link #getCodes() <em>Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> codes;

	/**
	 * The cached value of the '{@link #getStratums() <em>Stratum</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStratums()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasureReportGroupStratifierStratifierGroup> stratums;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureReportGroupStratifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getMeasureReportGroupStratifier();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getCodes() {
		if (codes == null) {
			codes = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER__CODE);
		}
		return codes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasureReportGroupStratifierStratifierGroup> getStratums() {
		if (stratums == null) {
			stratums = new EObjectContainmentEList<MeasureReportGroupStratifierStratifierGroup>(MeasureReportGroupStratifierStratifierGroup.class, this, ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER__STRATUM);
		}
		return stratums;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER__CODE:
				return ((InternalEList<?>)getCodes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER__STRATUM:
				return ((InternalEList<?>)getStratums()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER__CODE:
				return getCodes();
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER__STRATUM:
				return getStratums();
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
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER__CODE:
				getCodes().clear();
				getCodes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER__STRATUM:
				getStratums().clear();
				getStratums().addAll((Collection<? extends MeasureReportGroupStratifierStratifierGroup>)newValue);
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
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER__CODE:
				getCodes().clear();
				return;
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER__STRATUM:
				getStratums().clear();
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
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER__CODE:
				return codes != null && !codes.isEmpty();
			case ResourcesPackage.MEASURE_REPORT_GROUP_STRATIFIER__STRATUM:
				return stratums != null && !stratums.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MeasureReportGroupStratifierImpl
