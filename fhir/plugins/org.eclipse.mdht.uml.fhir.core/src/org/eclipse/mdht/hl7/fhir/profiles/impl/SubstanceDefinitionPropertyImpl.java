/**
 */
package org.eclipse.mdht.hl7.fhir.profiles.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.DataType;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.profiles.ProfilesPackage;
import org.eclipse.mdht.hl7.fhir.profiles.SubstanceDefinitionProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Definition Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.profiles.impl.SubstanceDefinitionPropertyImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.profiles.impl.SubstanceDefinitionPropertyImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.profiles.impl.SubstanceDefinitionPropertyImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.profiles.impl.SubstanceDefinitionPropertyImpl#getDefiningSubstancex <em>Defining Substancex</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.profiles.impl.SubstanceDefinitionPropertyImpl#getAmountx <em>Amountx</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstanceDefinitionPropertyImpl extends BackboneElementImpl implements SubstanceDefinitionProperty {
	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept category;

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
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String parameters;

	/**
	 * The cached value of the '{@link #getDefiningSubstancex() <em>Defining Substancex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefiningSubstancex()
	 * @generated
	 * @ordered
	 */
	protected DataType definingSubstancex;

	/**
	 * The cached value of the '{@link #getAmountx() <em>Amountx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountx()
	 * @generated
	 * @ordered
	 */
	protected DataType amountx;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceDefinitionPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilesPackage.Literals.SUBSTANCE_DEFINITION_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeableConcept getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCategory(CodeableConcept newCategory, NotificationChain msgs) {
		CodeableConcept oldCategory = category;
		category = newCategory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_PROPERTY__CATEGORY, oldCategory, newCategory);
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
	public void setCategory(CodeableConcept newCategory) {
		if (newCategory != category) {
			NotificationChain msgs = null;
			if (category != null)
				msgs = ((InternalEObject)category).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_PROPERTY__CATEGORY, null, msgs);
			if (newCategory != null)
				msgs = ((InternalEObject)newCategory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_PROPERTY__CATEGORY, null, msgs);
			msgs = basicSetCategory(newCategory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_PROPERTY__CATEGORY, newCategory, newCategory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_PROPERTY__CODE, oldCode, newCode);
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
	public void setCode(CodeableConcept newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_PROPERTY__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_PROPERTY__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_PROPERTY__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getParameters() {
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameters(org.eclipse.mdht.hl7.fhir.dataTypes.String newParameters, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldParameters = parameters;
		parameters = newParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_PROPERTY__PARAMETERS, oldParameters, newParameters);
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
	public void setParameters(org.eclipse.mdht.hl7.fhir.dataTypes.String newParameters) {
		if (newParameters != parameters) {
			NotificationChain msgs = null;
			if (parameters != null)
				msgs = ((InternalEObject)parameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_PROPERTY__PARAMETERS, null, msgs);
			if (newParameters != null)
				msgs = ((InternalEObject)newParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_PROPERTY__PARAMETERS, null, msgs);
			msgs = basicSetParameters(newParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_PROPERTY__PARAMETERS, newParameters, newParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getDefiningSubstancex() {
		return definingSubstancex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefiningSubstancex(DataType newDefiningSubstancex, NotificationChain msgs) {
		DataType oldDefiningSubstancex = definingSubstancex;
		definingSubstancex = newDefiningSubstancex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_PROPERTY__DEFINING_SUBSTANCEX, oldDefiningSubstancex, newDefiningSubstancex);
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
	public void setDefiningSubstancex(DataType newDefiningSubstancex) {
		if (newDefiningSubstancex != definingSubstancex) {
			NotificationChain msgs = null;
			if (definingSubstancex != null)
				msgs = ((InternalEObject)definingSubstancex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_PROPERTY__DEFINING_SUBSTANCEX, null, msgs);
			if (newDefiningSubstancex != null)
				msgs = ((InternalEObject)newDefiningSubstancex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_PROPERTY__DEFINING_SUBSTANCEX, null, msgs);
			msgs = basicSetDefiningSubstancex(newDefiningSubstancex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_PROPERTY__DEFINING_SUBSTANCEX, newDefiningSubstancex, newDefiningSubstancex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getAmountx() {
		return amountx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAmountx(DataType newAmountx, NotificationChain msgs) {
		DataType oldAmountx = amountx;
		amountx = newAmountx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_PROPERTY__AMOUNTX, oldAmountx, newAmountx);
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
	public void setAmountx(DataType newAmountx) {
		if (newAmountx != amountx) {
			NotificationChain msgs = null;
			if (amountx != null)
				msgs = ((InternalEObject)amountx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_PROPERTY__AMOUNTX, null, msgs);
			if (newAmountx != null)
				msgs = ((InternalEObject)newAmountx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_PROPERTY__AMOUNTX, null, msgs);
			msgs = basicSetAmountx(newAmountx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_PROPERTY__AMOUNTX, newAmountx, newAmountx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProfilesPackage.SUBSTANCE_DEFINITION_PROPERTY__CATEGORY:
				return basicSetCategory(null, msgs);
			case ProfilesPackage.SUBSTANCE_DEFINITION_PROPERTY__CODE:
				return basicSetCode(null, msgs);
			case ProfilesPackage.SUBSTANCE_DEFINITION_PROPERTY__PARAMETERS:
				return basicSetParameters(null, msgs);
			case ProfilesPackage.SUBSTANCE_DEFINITION_PROPERTY__DEFINING_SUBSTANCEX:
				return basicSetDefiningSubstancex(null, msgs);
			case ProfilesPackage.SUBSTANCE_DEFINITION_PROPERTY__AMOUNTX:
				return basicSetAmountx(null, msgs);
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
			case ProfilesPackage.SUBSTANCE_DEFINITION_PROPERTY__CATEGORY:
				return getCategory();
			case ProfilesPackage.SUBSTANCE_DEFINITION_PROPERTY__CODE:
				return getCode();
			case ProfilesPackage.SUBSTANCE_DEFINITION_PROPERTY__PARAMETERS:
				return getParameters();
			case ProfilesPackage.SUBSTANCE_DEFINITION_PROPERTY__DEFINING_SUBSTANCEX:
				return getDefiningSubstancex();
			case ProfilesPackage.SUBSTANCE_DEFINITION_PROPERTY__AMOUNTX:
				return getAmountx();
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
			case ProfilesPackage.SUBSTANCE_DEFINITION_PROPERTY__CATEGORY:
				setCategory((CodeableConcept)newValue);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_PROPERTY__CODE:
				setCode((CodeableConcept)newValue);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_PROPERTY__PARAMETERS:
				setParameters((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_PROPERTY__DEFINING_SUBSTANCEX:
				setDefiningSubstancex((DataType)newValue);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_PROPERTY__AMOUNTX:
				setAmountx((DataType)newValue);
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
			case ProfilesPackage.SUBSTANCE_DEFINITION_PROPERTY__CATEGORY:
				setCategory((CodeableConcept)null);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_PROPERTY__CODE:
				setCode((CodeableConcept)null);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_PROPERTY__PARAMETERS:
				setParameters((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_PROPERTY__DEFINING_SUBSTANCEX:
				setDefiningSubstancex((DataType)null);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_PROPERTY__AMOUNTX:
				setAmountx((DataType)null);
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
			case ProfilesPackage.SUBSTANCE_DEFINITION_PROPERTY__CATEGORY:
				return category != null;
			case ProfilesPackage.SUBSTANCE_DEFINITION_PROPERTY__CODE:
				return code != null;
			case ProfilesPackage.SUBSTANCE_DEFINITION_PROPERTY__PARAMETERS:
				return parameters != null;
			case ProfilesPackage.SUBSTANCE_DEFINITION_PROPERTY__DEFINING_SUBSTANCEX:
				return definingSubstancex != null;
			case ProfilesPackage.SUBSTANCE_DEFINITION_PROPERTY__AMOUNTX:
				return amountx != null;
		}
		return super.eIsSet(featureID);
	}

} //SubstanceDefinitionPropertyImpl
