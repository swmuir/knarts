/**
 */
package org.eclipse.mdht.hl7.fhir.dataTypes.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.hl7.fhir.dataTypes.Coding;
import org.eclipse.mdht.hl7.fhir.dataTypes.DataRequirementElement1;
import org.eclipse.mdht.hl7.fhir.dataTypes.DataTypesPackage;

import org.eclipse.mdht.hl7.fhir.resources.ValueSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Requirement Element1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.DataRequirementElement1Impl#getPath <em>Path</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.DataRequirementElement1Impl#getSearchParam <em>Search Param</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.DataRequirementElement1Impl#getValueSet <em>Value Set</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.DataRequirementElement1Impl#getCodes <em>Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataRequirementElement1Impl extends ElementImpl implements DataRequirementElement1 {
	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String path;

	/**
	 * The cached value of the '{@link #getSearchParam() <em>Search Param</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchParam()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String searchParam;

	/**
	 * The cached value of the '{@link #getValueSet() <em>Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSet()
	 * @generated
	 * @ordered
	 */
	protected ValueSet valueSet;

	/**
	 * The cached value of the '{@link #getCodes() <em>Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> codes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataRequirementElement1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataTypesPackage.Literals.DATA_REQUIREMENT_ELEMENT1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPath(org.eclipse.mdht.hl7.fhir.dataTypes.String newPath, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldPath = path;
		path = newPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__PATH, oldPath, newPath);
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
	public void setPath(org.eclipse.mdht.hl7.fhir.dataTypes.String newPath) {
		if (newPath != path) {
			NotificationChain msgs = null;
			if (path != null)
				msgs = ((InternalEObject)path).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__PATH, null, msgs);
			if (newPath != null)
				msgs = ((InternalEObject)newPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__PATH, null, msgs);
			msgs = basicSetPath(newPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__PATH, newPath, newPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getSearchParam() {
		return searchParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSearchParam(org.eclipse.mdht.hl7.fhir.dataTypes.String newSearchParam, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldSearchParam = searchParam;
		searchParam = newSearchParam;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__SEARCH_PARAM, oldSearchParam, newSearchParam);
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
	public void setSearchParam(org.eclipse.mdht.hl7.fhir.dataTypes.String newSearchParam) {
		if (newSearchParam != searchParam) {
			NotificationChain msgs = null;
			if (searchParam != null)
				msgs = ((InternalEObject)searchParam).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__SEARCH_PARAM, null, msgs);
			if (newSearchParam != null)
				msgs = ((InternalEObject)newSearchParam).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__SEARCH_PARAM, null, msgs);
			msgs = basicSetSearchParam(newSearchParam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__SEARCH_PARAM, newSearchParam, newSearchParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueSet getValueSet() {
		return valueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSet(ValueSet newValueSet, NotificationChain msgs) {
		ValueSet oldValueSet = valueSet;
		valueSet = newValueSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__VALUE_SET, oldValueSet, newValueSet);
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
	public void setValueSet(ValueSet newValueSet) {
		if (newValueSet != valueSet) {
			NotificationChain msgs = null;
			if (valueSet != null)
				msgs = ((InternalEObject)valueSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__VALUE_SET, null, msgs);
			if (newValueSet != null)
				msgs = ((InternalEObject)newValueSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__VALUE_SET, null, msgs);
			msgs = basicSetValueSet(newValueSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__VALUE_SET, newValueSet, newValueSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Coding> getCodes() {
		if (codes == null) {
			codes = new EObjectContainmentEList<Coding>(Coding.class, this, DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__CODE);
		}
		return codes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__PATH:
				return basicSetPath(null, msgs);
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__SEARCH_PARAM:
				return basicSetSearchParam(null, msgs);
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__VALUE_SET:
				return basicSetValueSet(null, msgs);
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__CODE:
				return ((InternalEList<?>)getCodes()).basicRemove(otherEnd, msgs);
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
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__PATH:
				return getPath();
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__SEARCH_PARAM:
				return getSearchParam();
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__VALUE_SET:
				return getValueSet();
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__CODE:
				return getCodes();
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
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__PATH:
				setPath((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__SEARCH_PARAM:
				setSearchParam((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__VALUE_SET:
				setValueSet((ValueSet)newValue);
				return;
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__CODE:
				getCodes().clear();
				getCodes().addAll((Collection<? extends Coding>)newValue);
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
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__PATH:
				setPath((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__SEARCH_PARAM:
				setSearchParam((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__VALUE_SET:
				setValueSet((ValueSet)null);
				return;
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__CODE:
				getCodes().clear();
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
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__PATH:
				return path != null;
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__SEARCH_PARAM:
				return searchParam != null;
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__VALUE_SET:
				return valueSet != null;
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT1__CODE:
				return codes != null && !codes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataRequirementElement1Impl
