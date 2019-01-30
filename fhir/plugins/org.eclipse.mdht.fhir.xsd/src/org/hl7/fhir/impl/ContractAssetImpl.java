/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.Coding;
import org.hl7.fhir.ContractAsset;
import org.hl7.fhir.ContractData;
import org.hl7.fhir.ContractValuedItem;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Period;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contract Asset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ContractAssetImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractAssetImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractAssetImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractAssetImpl#getDataPeriod <em>Data Period</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractAssetImpl#getData <em>Data</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractAssetImpl#getValuedItem <em>Valued Item</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ContractAssetImpl#getSecurityLabel <em>Security Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContractAssetImpl extends BackboneElementImpl implements ContractAsset {
	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected Coding class_;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected Coding code;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period period;

	/**
	 * The cached value of the '{@link #getDataPeriod() <em>Data Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period dataPeriod;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractData> data;

	/**
	 * The cached value of the '{@link #getValuedItem() <em>Valued Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuedItem()
	 * @generated
	 * @ordered
	 */
	protected EList<ContractValuedItem> valuedItem;

	/**
	 * The cached value of the '{@link #getSecurityLabel() <em>Security Label</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityLabel()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> securityLabel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContractAssetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getContractAsset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClass(Coding newClass, NotificationChain msgs) {
		Coding oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_ASSET__CLASS, oldClass, newClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(Coding newClass) {
		if (newClass != class_) {
			NotificationChain msgs = null;
			if (class_ != null)
				msgs = ((InternalEObject)class_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_ASSET__CLASS, null, msgs);
			if (newClass != null)
				msgs = ((InternalEObject)newClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_ASSET__CLASS, null, msgs);
			msgs = basicSetClass(newClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_ASSET__CLASS, newClass, newClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(Coding newCode, NotificationChain msgs) {
		Coding oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_ASSET__CODE, oldCode, newCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(Coding newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_ASSET__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_ASSET__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_ASSET__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriod(Period newPeriod, NotificationChain msgs) {
		Period oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_ASSET__PERIOD, oldPeriod, newPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(Period newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_ASSET__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_ASSET__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_ASSET__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getDataPeriod() {
		return dataPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataPeriod(Period newDataPeriod, NotificationChain msgs) {
		Period oldDataPeriod = dataPeriod;
		dataPeriod = newDataPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_ASSET__DATA_PERIOD, oldDataPeriod, newDataPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataPeriod(Period newDataPeriod) {
		if (newDataPeriod != dataPeriod) {
			NotificationChain msgs = null;
			if (dataPeriod != null)
				msgs = ((InternalEObject)dataPeriod).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_ASSET__DATA_PERIOD, null, msgs);
			if (newDataPeriod != null)
				msgs = ((InternalEObject)newDataPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONTRACT_ASSET__DATA_PERIOD, null, msgs);
			msgs = basicSetDataPeriod(newDataPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONTRACT_ASSET__DATA_PERIOD, newDataPeriod, newDataPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContractData> getData() {
		if (data == null) {
			data = new EObjectContainmentEList<ContractData>(ContractData.class, this, FhirPackage.CONTRACT_ASSET__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContractValuedItem> getValuedItem() {
		if (valuedItem == null) {
			valuedItem = new EObjectContainmentEList<ContractValuedItem>(ContractValuedItem.class, this, FhirPackage.CONTRACT_ASSET__VALUED_ITEM);
		}
		return valuedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getSecurityLabel() {
		if (securityLabel == null) {
			securityLabel = new EObjectContainmentEList<Coding>(Coding.class, this, FhirPackage.CONTRACT_ASSET__SECURITY_LABEL);
		}
		return securityLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CONTRACT_ASSET__CLASS:
				return basicSetClass(null, msgs);
			case FhirPackage.CONTRACT_ASSET__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.CONTRACT_ASSET__PERIOD:
				return basicSetPeriod(null, msgs);
			case FhirPackage.CONTRACT_ASSET__DATA_PERIOD:
				return basicSetDataPeriod(null, msgs);
			case FhirPackage.CONTRACT_ASSET__DATA:
				return ((InternalEList<?>)getData()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT_ASSET__VALUED_ITEM:
				return ((InternalEList<?>)getValuedItem()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONTRACT_ASSET__SECURITY_LABEL:
				return ((InternalEList<?>)getSecurityLabel()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.CONTRACT_ASSET__CLASS:
				return getClass_();
			case FhirPackage.CONTRACT_ASSET__CODE:
				return getCode();
			case FhirPackage.CONTRACT_ASSET__PERIOD:
				return getPeriod();
			case FhirPackage.CONTRACT_ASSET__DATA_PERIOD:
				return getDataPeriod();
			case FhirPackage.CONTRACT_ASSET__DATA:
				return getData();
			case FhirPackage.CONTRACT_ASSET__VALUED_ITEM:
				return getValuedItem();
			case FhirPackage.CONTRACT_ASSET__SECURITY_LABEL:
				return getSecurityLabel();
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
			case FhirPackage.CONTRACT_ASSET__CLASS:
				setClass((Coding)newValue);
				return;
			case FhirPackage.CONTRACT_ASSET__CODE:
				setCode((Coding)newValue);
				return;
			case FhirPackage.CONTRACT_ASSET__PERIOD:
				setPeriod((Period)newValue);
				return;
			case FhirPackage.CONTRACT_ASSET__DATA_PERIOD:
				setDataPeriod((Period)newValue);
				return;
			case FhirPackage.CONTRACT_ASSET__DATA:
				getData().clear();
				getData().addAll((Collection<? extends ContractData>)newValue);
				return;
			case FhirPackage.CONTRACT_ASSET__VALUED_ITEM:
				getValuedItem().clear();
				getValuedItem().addAll((Collection<? extends ContractValuedItem>)newValue);
				return;
			case FhirPackage.CONTRACT_ASSET__SECURITY_LABEL:
				getSecurityLabel().clear();
				getSecurityLabel().addAll((Collection<? extends Coding>)newValue);
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
			case FhirPackage.CONTRACT_ASSET__CLASS:
				setClass((Coding)null);
				return;
			case FhirPackage.CONTRACT_ASSET__CODE:
				setCode((Coding)null);
				return;
			case FhirPackage.CONTRACT_ASSET__PERIOD:
				setPeriod((Period)null);
				return;
			case FhirPackage.CONTRACT_ASSET__DATA_PERIOD:
				setDataPeriod((Period)null);
				return;
			case FhirPackage.CONTRACT_ASSET__DATA:
				getData().clear();
				return;
			case FhirPackage.CONTRACT_ASSET__VALUED_ITEM:
				getValuedItem().clear();
				return;
			case FhirPackage.CONTRACT_ASSET__SECURITY_LABEL:
				getSecurityLabel().clear();
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
			case FhirPackage.CONTRACT_ASSET__CLASS:
				return class_ != null;
			case FhirPackage.CONTRACT_ASSET__CODE:
				return code != null;
			case FhirPackage.CONTRACT_ASSET__PERIOD:
				return period != null;
			case FhirPackage.CONTRACT_ASSET__DATA_PERIOD:
				return dataPeriod != null;
			case FhirPackage.CONTRACT_ASSET__DATA:
				return data != null && !data.isEmpty();
			case FhirPackage.CONTRACT_ASSET__VALUED_ITEM:
				return valuedItem != null && !valuedItem.isEmpty();
			case FhirPackage.CONTRACT_ASSET__SECURITY_LABEL:
				return securityLabel != null && !securityLabel.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContractAssetImpl
