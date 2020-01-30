/**
 */
package fhiRCore.dataTypes.impl;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.DataTypesPackage;
import fhiRCore.dataTypes.ElementDefinitionElement3;
import fhiRCore.dataTypes.Uri;

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
 * An implementation of the model object '<em><b>Element Definition Element3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.dataTypes.impl.ElementDefinitionElement3Impl#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.ElementDefinitionElement3Impl#getProfiles <em>Profile</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.ElementDefinitionElement3Impl#getTargetProfiles <em>Target Profile</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.ElementDefinitionElement3Impl#getAggregations <em>Aggregation</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.ElementDefinitionElement3Impl#getVersioning <em>Versioning</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementDefinitionElement3Impl extends ElementImpl implements ElementDefinitionElement3 {
	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected Uri code;

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
	 * The cached value of the '{@link #getTargetProfiles() <em>Target Profile</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetProfiles()
	 * @generated
	 * @ordered
	 */
	protected EList<StructureDefinition> targetProfiles;

	/**
	 * The cached value of the '{@link #getAggregations() <em>Aggregation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregations()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> aggregations;

	/**
	 * The cached value of the '{@link #getVersioning() <em>Versioning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersioning()
	 * @generated
	 * @ordered
	 */
	protected Code versioning;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementDefinitionElement3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataTypesPackage.Literals.ELEMENT_DEFINITION_ELEMENT3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(Uri newCode, NotificationChain msgs) {
		Uri oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__CODE, oldCode, newCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(Uri newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructureDefinition> getProfiles() {
		if (profiles == null) {
			profiles = new EObjectContainmentEList<StructureDefinition>(StructureDefinition.class, this, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__PROFILE);
		}
		return profiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructureDefinition> getTargetProfiles() {
		if (targetProfiles == null) {
			targetProfiles = new EObjectContainmentEList<StructureDefinition>(StructureDefinition.class, this, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__TARGET_PROFILE);
		}
		return targetProfiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Code> getAggregations() {
		if (aggregations == null) {
			aggregations = new EObjectContainmentEList<Code>(Code.class, this, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__AGGREGATION);
		}
		return aggregations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getVersioning() {
		return versioning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersioning(Code newVersioning, NotificationChain msgs) {
		Code oldVersioning = versioning;
		versioning = newVersioning;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__VERSIONING, oldVersioning, newVersioning);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersioning(Code newVersioning) {
		if (newVersioning != versioning) {
			NotificationChain msgs = null;
			if (versioning != null)
				msgs = ((InternalEObject)versioning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__VERSIONING, null, msgs);
			if (newVersioning != null)
				msgs = ((InternalEObject)newVersioning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__VERSIONING, null, msgs);
			msgs = basicSetVersioning(newVersioning, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__VERSIONING, newVersioning, newVersioning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__CODE:
				return basicSetCode(null, msgs);
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__PROFILE:
				return ((InternalEList<?>)getProfiles()).basicRemove(otherEnd, msgs);
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__TARGET_PROFILE:
				return ((InternalEList<?>)getTargetProfiles()).basicRemove(otherEnd, msgs);
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__AGGREGATION:
				return ((InternalEList<?>)getAggregations()).basicRemove(otherEnd, msgs);
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__VERSIONING:
				return basicSetVersioning(null, msgs);
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
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__CODE:
				return getCode();
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__PROFILE:
				return getProfiles();
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__TARGET_PROFILE:
				return getTargetProfiles();
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__AGGREGATION:
				return getAggregations();
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__VERSIONING:
				return getVersioning();
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
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__CODE:
				setCode((Uri)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__PROFILE:
				getProfiles().clear();
				getProfiles().addAll((Collection<? extends StructureDefinition>)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__TARGET_PROFILE:
				getTargetProfiles().clear();
				getTargetProfiles().addAll((Collection<? extends StructureDefinition>)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__AGGREGATION:
				getAggregations().clear();
				getAggregations().addAll((Collection<? extends Code>)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__VERSIONING:
				setVersioning((Code)newValue);
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
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__CODE:
				setCode((Uri)null);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__PROFILE:
				getProfiles().clear();
				return;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__TARGET_PROFILE:
				getTargetProfiles().clear();
				return;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__AGGREGATION:
				getAggregations().clear();
				return;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__VERSIONING:
				setVersioning((Code)null);
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
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__CODE:
				return code != null;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__PROFILE:
				return profiles != null && !profiles.isEmpty();
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__TARGET_PROFILE:
				return targetProfiles != null && !targetProfiles.isEmpty();
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__AGGREGATION:
				return aggregations != null && !aggregations.isEmpty();
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT3__VERSIONING:
				return versioning != null;
		}
		return super.eIsSet(featureID);
	}

} //ElementDefinitionElement3Impl
