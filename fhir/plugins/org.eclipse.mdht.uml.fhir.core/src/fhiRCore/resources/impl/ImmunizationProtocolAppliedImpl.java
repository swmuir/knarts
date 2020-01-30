/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Reference;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.ImmunizationProtocolApplied;
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
 * An implementation of the model object '<em><b>Immunization Protocol Applied</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationProtocolAppliedImpl#getSeries <em>Series</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationProtocolAppliedImpl#getAuthority <em>Authority</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationProtocolAppliedImpl#getTargetDiseases <em>Target Disease</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationProtocolAppliedImpl#getDoseNumberx <em>Dose Numberx</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationProtocolAppliedImpl#getSeriesDosesx <em>Series Dosesx</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImmunizationProtocolAppliedImpl extends BackboneElementImpl implements ImmunizationProtocolApplied {
	/**
	 * The cached value of the '{@link #getSeries() <em>Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeries()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String series;

	/**
	 * The cached value of the '{@link #getAuthority() <em>Authority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthority()
	 * @generated
	 * @ordered
	 */
	protected Reference authority;

	/**
	 * The cached value of the '{@link #getTargetDiseases() <em>Target Disease</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDiseases()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> targetDiseases;

	/**
	 * The cached value of the '{@link #getDoseNumberx() <em>Dose Numberx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoseNumberx()
	 * @generated
	 * @ordered
	 */
	protected DataType doseNumberx;

	/**
	 * The cached value of the '{@link #getSeriesDosesx() <em>Series Dosesx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeriesDosesx()
	 * @generated
	 * @ordered
	 */
	protected DataType seriesDosesx;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImmunizationProtocolAppliedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getImmunizationProtocolApplied();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getSeries() {
		return series;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeries(fhiRCore.dataTypes.String newSeries, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldSeries = series;
		series = newSeries;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES, oldSeries, newSeries);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeries(fhiRCore.dataTypes.String newSeries) {
		if (newSeries != series) {
			NotificationChain msgs = null;
			if (series != null)
				msgs = ((InternalEObject)series).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES, null, msgs);
			if (newSeries != null)
				msgs = ((InternalEObject)newSeries).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES, null, msgs);
			msgs = basicSetSeries(newSeries, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES, newSeries, newSeries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getAuthority() {
		return authority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthority(Reference newAuthority, NotificationChain msgs) {
		Reference oldAuthority = authority;
		authority = newAuthority;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_PROTOCOL_APPLIED__AUTHORITY, oldAuthority, newAuthority);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthority(Reference newAuthority) {
		if (newAuthority != authority) {
			NotificationChain msgs = null;
			if (authority != null)
				msgs = ((InternalEObject)authority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION_PROTOCOL_APPLIED__AUTHORITY, null, msgs);
			if (newAuthority != null)
				msgs = ((InternalEObject)newAuthority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION_PROTOCOL_APPLIED__AUTHORITY, null, msgs);
			msgs = basicSetAuthority(newAuthority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_PROTOCOL_APPLIED__AUTHORITY, newAuthority, newAuthority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getTargetDiseases() {
		if (targetDiseases == null) {
			targetDiseases = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.IMMUNIZATION_PROTOCOL_APPLIED__TARGET_DISEASE);
		}
		return targetDiseases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getDoseNumberx() {
		return doseNumberx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoseNumberx(DataType newDoseNumberx, NotificationChain msgs) {
		DataType oldDoseNumberx = doseNumberx;
		doseNumberx = newDoseNumberx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_PROTOCOL_APPLIED__DOSE_NUMBERX, oldDoseNumberx, newDoseNumberx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoseNumberx(DataType newDoseNumberx) {
		if (newDoseNumberx != doseNumberx) {
			NotificationChain msgs = null;
			if (doseNumberx != null)
				msgs = ((InternalEObject)doseNumberx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION_PROTOCOL_APPLIED__DOSE_NUMBERX, null, msgs);
			if (newDoseNumberx != null)
				msgs = ((InternalEObject)newDoseNumberx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION_PROTOCOL_APPLIED__DOSE_NUMBERX, null, msgs);
			msgs = basicSetDoseNumberx(newDoseNumberx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_PROTOCOL_APPLIED__DOSE_NUMBERX, newDoseNumberx, newDoseNumberx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getSeriesDosesx() {
		return seriesDosesx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeriesDosesx(DataType newSeriesDosesx, NotificationChain msgs) {
		DataType oldSeriesDosesx = seriesDosesx;
		seriesDosesx = newSeriesDosesx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES_DOSESX, oldSeriesDosesx, newSeriesDosesx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeriesDosesx(DataType newSeriesDosesx) {
		if (newSeriesDosesx != seriesDosesx) {
			NotificationChain msgs = null;
			if (seriesDosesx != null)
				msgs = ((InternalEObject)seriesDosesx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES_DOSESX, null, msgs);
			if (newSeriesDosesx != null)
				msgs = ((InternalEObject)newSeriesDosesx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES_DOSESX, null, msgs);
			msgs = basicSetSeriesDosesx(newSeriesDosesx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES_DOSESX, newSeriesDosesx, newSeriesDosesx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES:
				return basicSetSeries(null, msgs);
			case ResourcesPackage.IMMUNIZATION_PROTOCOL_APPLIED__AUTHORITY:
				return basicSetAuthority(null, msgs);
			case ResourcesPackage.IMMUNIZATION_PROTOCOL_APPLIED__TARGET_DISEASE:
				return ((InternalEList<?>)getTargetDiseases()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.IMMUNIZATION_PROTOCOL_APPLIED__DOSE_NUMBERX:
				return basicSetDoseNumberx(null, msgs);
			case ResourcesPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES_DOSESX:
				return basicSetSeriesDosesx(null, msgs);
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
			case ResourcesPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES:
				return getSeries();
			case ResourcesPackage.IMMUNIZATION_PROTOCOL_APPLIED__AUTHORITY:
				return getAuthority();
			case ResourcesPackage.IMMUNIZATION_PROTOCOL_APPLIED__TARGET_DISEASE:
				return getTargetDiseases();
			case ResourcesPackage.IMMUNIZATION_PROTOCOL_APPLIED__DOSE_NUMBERX:
				return getDoseNumberx();
			case ResourcesPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES_DOSESX:
				return getSeriesDosesx();
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
			case ResourcesPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES:
				setSeries((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION_PROTOCOL_APPLIED__AUTHORITY:
				setAuthority((Reference)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION_PROTOCOL_APPLIED__TARGET_DISEASE:
				getTargetDiseases().clear();
				getTargetDiseases().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION_PROTOCOL_APPLIED__DOSE_NUMBERX:
				setDoseNumberx((DataType)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES_DOSESX:
				setSeriesDosesx((DataType)newValue);
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
			case ResourcesPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES:
				setSeries((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.IMMUNIZATION_PROTOCOL_APPLIED__AUTHORITY:
				setAuthority((Reference)null);
				return;
			case ResourcesPackage.IMMUNIZATION_PROTOCOL_APPLIED__TARGET_DISEASE:
				getTargetDiseases().clear();
				return;
			case ResourcesPackage.IMMUNIZATION_PROTOCOL_APPLIED__DOSE_NUMBERX:
				setDoseNumberx((DataType)null);
				return;
			case ResourcesPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES_DOSESX:
				setSeriesDosesx((DataType)null);
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
			case ResourcesPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES:
				return series != null;
			case ResourcesPackage.IMMUNIZATION_PROTOCOL_APPLIED__AUTHORITY:
				return authority != null;
			case ResourcesPackage.IMMUNIZATION_PROTOCOL_APPLIED__TARGET_DISEASE:
				return targetDiseases != null && !targetDiseases.isEmpty();
			case ResourcesPackage.IMMUNIZATION_PROTOCOL_APPLIED__DOSE_NUMBERX:
				return doseNumberx != null;
			case ResourcesPackage.IMMUNIZATION_PROTOCOL_APPLIED__SERIES_DOSESX:
				return seriesDosesx != null;
		}
		return super.eIsSet(featureID);
	}

} //ImmunizationProtocolAppliedImpl
