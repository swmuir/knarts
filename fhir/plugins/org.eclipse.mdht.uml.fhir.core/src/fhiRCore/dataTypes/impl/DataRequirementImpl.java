/**
 */
package fhiRCore.dataTypes.impl;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.DataRequirement;
import fhiRCore.dataTypes.DataRequirementElement1;
import fhiRCore.dataTypes.DataRequirementElement2;
import fhiRCore.dataTypes.DataRequirementElement3;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.DataTypesPackage;
import fhiRCore.dataTypes.PositiveInt;

import fhiRCore.resources.StructureDefinition;

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
 * An implementation of the model object '<em><b>Data Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.dataTypes.impl.DataRequirementImpl#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.DataRequirementImpl#getProfiles <em>Profile</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.DataRequirementImpl#getSubjectx <em>Subjectx</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.DataRequirementImpl#getMustSupports <em>Must Support</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.DataRequirementImpl#getCodeFilters <em>Code Filter</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.DataRequirementImpl#getDateFilters <em>Date Filter</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.DataRequirementImpl#getLimit <em>Limit</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.DataRequirementImpl#getSorts <em>Sort</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataRequirementImpl extends DataTypeImpl implements DataRequirement {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Code type;

	/**
	 * The cached value of the '{@link #getProfiles() <em>Profile</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfiles()
	 * @generated
	 * @ordered
	 */
	protected EList<StructureDefinition> profiles;

	/**
	 * The cached value of the '{@link #getSubjectx() <em>Subjectx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectx()
	 * @generated
	 * @ordered
	 */
	protected DataType subjectx;

	/**
	 * The cached value of the '{@link #getMustSupports() <em>Must Support</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMustSupports()
	 * @generated
	 * @ordered
	 */
	protected EList<fhiRCore.dataTypes.String> mustSupports;

	/**
	 * The cached value of the '{@link #getCodeFilters() <em>Code Filter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeFilters()
	 * @generated
	 * @ordered
	 */
	protected EList<DataRequirementElement1> codeFilters;

	/**
	 * The cached value of the '{@link #getDateFilters() <em>Date Filter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFilters()
	 * @generated
	 * @ordered
	 */
	protected EList<DataRequirementElement2> dateFilters;

	/**
	 * The cached value of the '{@link #getLimit() <em>Limit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimit()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt limit;

	/**
	 * The cached value of the '{@link #getSorts() <em>Sort</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSorts()
	 * @generated
	 * @ordered
	 */
	protected EList<DataRequirementElement3> sorts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataTypesPackage.Literals.DATA_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Code newType, NotificationChain msgs) {
		Code oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.DATA_REQUIREMENT__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Code newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.DATA_REQUIREMENT__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.DATA_REQUIREMENT__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.DATA_REQUIREMENT__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructureDefinition> getProfiles() {
		if (profiles == null) {
			profiles = new EObjectContainmentEList<StructureDefinition>(StructureDefinition.class, this, DataTypesPackage.DATA_REQUIREMENT__PROFILE);
		}
		return profiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getSubjectx() {
		return subjectx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubjectx(DataType newSubjectx, NotificationChain msgs) {
		DataType oldSubjectx = subjectx;
		subjectx = newSubjectx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.DATA_REQUIREMENT__SUBJECTX, oldSubjectx, newSubjectx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubjectx(DataType newSubjectx) {
		if (newSubjectx != subjectx) {
			NotificationChain msgs = null;
			if (subjectx != null)
				msgs = ((InternalEObject)subjectx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.DATA_REQUIREMENT__SUBJECTX, null, msgs);
			if (newSubjectx != null)
				msgs = ((InternalEObject)newSubjectx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.DATA_REQUIREMENT__SUBJECTX, null, msgs);
			msgs = basicSetSubjectx(newSubjectx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.DATA_REQUIREMENT__SUBJECTX, newSubjectx, newSubjectx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<fhiRCore.dataTypes.String> getMustSupports() {
		if (mustSupports == null) {
			mustSupports = new EObjectContainmentEList<fhiRCore.dataTypes.String>(fhiRCore.dataTypes.String.class, this, DataTypesPackage.DATA_REQUIREMENT__MUST_SUPPORT);
		}
		return mustSupports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataRequirementElement1> getCodeFilters() {
		if (codeFilters == null) {
			codeFilters = new EObjectContainmentEList<DataRequirementElement1>(DataRequirementElement1.class, this, DataTypesPackage.DATA_REQUIREMENT__CODE_FILTER);
		}
		return codeFilters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataRequirementElement2> getDateFilters() {
		if (dateFilters == null) {
			dateFilters = new EObjectContainmentEList<DataRequirementElement2>(DataRequirementElement2.class, this, DataTypesPackage.DATA_REQUIREMENT__DATE_FILTER);
		}
		return dateFilters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getLimit() {
		return limit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLimit(PositiveInt newLimit, NotificationChain msgs) {
		PositiveInt oldLimit = limit;
		limit = newLimit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.DATA_REQUIREMENT__LIMIT, oldLimit, newLimit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimit(PositiveInt newLimit) {
		if (newLimit != limit) {
			NotificationChain msgs = null;
			if (limit != null)
				msgs = ((InternalEObject)limit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.DATA_REQUIREMENT__LIMIT, null, msgs);
			if (newLimit != null)
				msgs = ((InternalEObject)newLimit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.DATA_REQUIREMENT__LIMIT, null, msgs);
			msgs = basicSetLimit(newLimit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.DATA_REQUIREMENT__LIMIT, newLimit, newLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataRequirementElement3> getSorts() {
		if (sorts == null) {
			sorts = new EObjectContainmentEList<DataRequirementElement3>(DataRequirementElement3.class, this, DataTypesPackage.DATA_REQUIREMENT__SORT);
		}
		return sorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataTypesPackage.DATA_REQUIREMENT__TYPE:
				return basicSetType(null, msgs);
			case DataTypesPackage.DATA_REQUIREMENT__PROFILE:
				return ((InternalEList<?>)getProfiles()).basicRemove(otherEnd, msgs);
			case DataTypesPackage.DATA_REQUIREMENT__SUBJECTX:
				return basicSetSubjectx(null, msgs);
			case DataTypesPackage.DATA_REQUIREMENT__MUST_SUPPORT:
				return ((InternalEList<?>)getMustSupports()).basicRemove(otherEnd, msgs);
			case DataTypesPackage.DATA_REQUIREMENT__CODE_FILTER:
				return ((InternalEList<?>)getCodeFilters()).basicRemove(otherEnd, msgs);
			case DataTypesPackage.DATA_REQUIREMENT__DATE_FILTER:
				return ((InternalEList<?>)getDateFilters()).basicRemove(otherEnd, msgs);
			case DataTypesPackage.DATA_REQUIREMENT__LIMIT:
				return basicSetLimit(null, msgs);
			case DataTypesPackage.DATA_REQUIREMENT__SORT:
				return ((InternalEList<?>)getSorts()).basicRemove(otherEnd, msgs);
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
			case DataTypesPackage.DATA_REQUIREMENT__TYPE:
				return getType();
			case DataTypesPackage.DATA_REQUIREMENT__PROFILE:
				return getProfiles();
			case DataTypesPackage.DATA_REQUIREMENT__SUBJECTX:
				return getSubjectx();
			case DataTypesPackage.DATA_REQUIREMENT__MUST_SUPPORT:
				return getMustSupports();
			case DataTypesPackage.DATA_REQUIREMENT__CODE_FILTER:
				return getCodeFilters();
			case DataTypesPackage.DATA_REQUIREMENT__DATE_FILTER:
				return getDateFilters();
			case DataTypesPackage.DATA_REQUIREMENT__LIMIT:
				return getLimit();
			case DataTypesPackage.DATA_REQUIREMENT__SORT:
				return getSorts();
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
			case DataTypesPackage.DATA_REQUIREMENT__TYPE:
				setType((Code)newValue);
				return;
			case DataTypesPackage.DATA_REQUIREMENT__PROFILE:
				getProfiles().clear();
				getProfiles().addAll((Collection<? extends StructureDefinition>)newValue);
				return;
			case DataTypesPackage.DATA_REQUIREMENT__SUBJECTX:
				setSubjectx((DataType)newValue);
				return;
			case DataTypesPackage.DATA_REQUIREMENT__MUST_SUPPORT:
				getMustSupports().clear();
				getMustSupports().addAll((Collection<? extends fhiRCore.dataTypes.String>)newValue);
				return;
			case DataTypesPackage.DATA_REQUIREMENT__CODE_FILTER:
				getCodeFilters().clear();
				getCodeFilters().addAll((Collection<? extends DataRequirementElement1>)newValue);
				return;
			case DataTypesPackage.DATA_REQUIREMENT__DATE_FILTER:
				getDateFilters().clear();
				getDateFilters().addAll((Collection<? extends DataRequirementElement2>)newValue);
				return;
			case DataTypesPackage.DATA_REQUIREMENT__LIMIT:
				setLimit((PositiveInt)newValue);
				return;
			case DataTypesPackage.DATA_REQUIREMENT__SORT:
				getSorts().clear();
				getSorts().addAll((Collection<? extends DataRequirementElement3>)newValue);
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
			case DataTypesPackage.DATA_REQUIREMENT__TYPE:
				setType((Code)null);
				return;
			case DataTypesPackage.DATA_REQUIREMENT__PROFILE:
				getProfiles().clear();
				return;
			case DataTypesPackage.DATA_REQUIREMENT__SUBJECTX:
				setSubjectx((DataType)null);
				return;
			case DataTypesPackage.DATA_REQUIREMENT__MUST_SUPPORT:
				getMustSupports().clear();
				return;
			case DataTypesPackage.DATA_REQUIREMENT__CODE_FILTER:
				getCodeFilters().clear();
				return;
			case DataTypesPackage.DATA_REQUIREMENT__DATE_FILTER:
				getDateFilters().clear();
				return;
			case DataTypesPackage.DATA_REQUIREMENT__LIMIT:
				setLimit((PositiveInt)null);
				return;
			case DataTypesPackage.DATA_REQUIREMENT__SORT:
				getSorts().clear();
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
			case DataTypesPackage.DATA_REQUIREMENT__TYPE:
				return type != null;
			case DataTypesPackage.DATA_REQUIREMENT__PROFILE:
				return profiles != null && !profiles.isEmpty();
			case DataTypesPackage.DATA_REQUIREMENT__SUBJECTX:
				return subjectx != null;
			case DataTypesPackage.DATA_REQUIREMENT__MUST_SUPPORT:
				return mustSupports != null && !mustSupports.isEmpty();
			case DataTypesPackage.DATA_REQUIREMENT__CODE_FILTER:
				return codeFilters != null && !codeFilters.isEmpty();
			case DataTypesPackage.DATA_REQUIREMENT__DATE_FILTER:
				return dateFilters != null && !dateFilters.isEmpty();
			case DataTypesPackage.DATA_REQUIREMENT__LIMIT:
				return limit != null;
			case DataTypesPackage.DATA_REQUIREMENT__SORT:
				return sorts != null && !sorts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataRequirementImpl
