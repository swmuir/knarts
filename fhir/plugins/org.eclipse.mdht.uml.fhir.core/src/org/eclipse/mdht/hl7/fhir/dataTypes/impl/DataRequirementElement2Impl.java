/**
 */
package org.eclipse.mdht.hl7.fhir.dataTypes.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.hl7.fhir.dataTypes.DataRequirementElement2;
import org.eclipse.mdht.hl7.fhir.dataTypes.DataType;
import org.eclipse.mdht.hl7.fhir.dataTypes.DataTypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Requirement Element2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.DataRequirementElement2Impl#getPath <em>Path</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.DataRequirementElement2Impl#getSearchParam <em>Search Param</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.dataTypes.impl.DataRequirementElement2Impl#getValuex <em>Valuex</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataRequirementElement2Impl extends ElementImpl implements DataRequirementElement2 {
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
	 * The cached value of the '{@link #getValuex() <em>Valuex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuex()
	 * @generated
	 * @ordered
	 */
	protected DataType valuex;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataRequirementElement2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataTypesPackage.Literals.DATA_REQUIREMENT_ELEMENT2;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.DATA_REQUIREMENT_ELEMENT2__PATH, oldPath, newPath);
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
				msgs = ((InternalEObject)path).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.DATA_REQUIREMENT_ELEMENT2__PATH, null, msgs);
			if (newPath != null)
				msgs = ((InternalEObject)newPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.DATA_REQUIREMENT_ELEMENT2__PATH, null, msgs);
			msgs = basicSetPath(newPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.DATA_REQUIREMENT_ELEMENT2__PATH, newPath, newPath));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.DATA_REQUIREMENT_ELEMENT2__SEARCH_PARAM, oldSearchParam, newSearchParam);
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
				msgs = ((InternalEObject)searchParam).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.DATA_REQUIREMENT_ELEMENT2__SEARCH_PARAM, null, msgs);
			if (newSearchParam != null)
				msgs = ((InternalEObject)newSearchParam).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.DATA_REQUIREMENT_ELEMENT2__SEARCH_PARAM, null, msgs);
			msgs = basicSetSearchParam(newSearchParam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.DATA_REQUIREMENT_ELEMENT2__SEARCH_PARAM, newSearchParam, newSearchParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getValuex() {
		return valuex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValuex(DataType newValuex, NotificationChain msgs) {
		DataType oldValuex = valuex;
		valuex = newValuex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.DATA_REQUIREMENT_ELEMENT2__VALUEX, oldValuex, newValuex);
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
	public void setValuex(DataType newValuex) {
		if (newValuex != valuex) {
			NotificationChain msgs = null;
			if (valuex != null)
				msgs = ((InternalEObject)valuex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.DATA_REQUIREMENT_ELEMENT2__VALUEX, null, msgs);
			if (newValuex != null)
				msgs = ((InternalEObject)newValuex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.DATA_REQUIREMENT_ELEMENT2__VALUEX, null, msgs);
			msgs = basicSetValuex(newValuex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.DATA_REQUIREMENT_ELEMENT2__VALUEX, newValuex, newValuex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT2__PATH:
				return basicSetPath(null, msgs);
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT2__SEARCH_PARAM:
				return basicSetSearchParam(null, msgs);
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT2__VALUEX:
				return basicSetValuex(null, msgs);
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
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT2__PATH:
				return getPath();
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT2__SEARCH_PARAM:
				return getSearchParam();
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT2__VALUEX:
				return getValuex();
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
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT2__PATH:
				setPath((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT2__SEARCH_PARAM:
				setSearchParam((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT2__VALUEX:
				setValuex((DataType)newValue);
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
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT2__PATH:
				setPath((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT2__SEARCH_PARAM:
				setSearchParam((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT2__VALUEX:
				setValuex((DataType)null);
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
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT2__PATH:
				return path != null;
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT2__SEARCH_PARAM:
				return searchParam != null;
			case DataTypesPackage.DATA_REQUIREMENT_ELEMENT2__VALUEX:
				return valuex != null;
		}
		return super.eIsSet(featureID);
	}

} //DataRequirementElement2Impl
