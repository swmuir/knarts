/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.CodeableConcept;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Identifier;
import org.hl7.fhir.SubstanceSpecificationProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Specification Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationPropertyImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationPropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationPropertyImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationPropertyImpl#getSubstanceId <em>Substance Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationPropertyImpl#getSubstanceName <em>Substance Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SubstanceSpecificationPropertyImpl#getAmount <em>Amount</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstanceSpecificationPropertyImpl extends BackboneElementImpl implements SubstanceSpecificationProperty {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept name;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String parameters;

	/**
	 * The cached value of the '{@link #getSubstanceId() <em>Substance Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstanceId()
	 * @generated
	 * @ordered
	 */
	protected Identifier substanceId;

	/**
	 * The cached value of the '{@link #getSubstanceName() <em>Substance Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstanceName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String substanceName;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String amount;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceSpecificationPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSubstanceSpecificationProperty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(CodeableConcept newType, NotificationChain msgs) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(CodeableConcept newName, NotificationChain msgs) {
		CodeableConcept oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(CodeableConcept newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getParameters() {
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameters(org.hl7.fhir.String newParameters, NotificationChain msgs) {
		org.hl7.fhir.String oldParameters = parameters;
		parameters = newParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__PARAMETERS, oldParameters, newParameters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameters(org.hl7.fhir.String newParameters) {
		if (newParameters != parameters) {
			NotificationChain msgs = null;
			if (parameters != null)
				msgs = ((InternalEObject)parameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__PARAMETERS, null, msgs);
			if (newParameters != null)
				msgs = ((InternalEObject)newParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__PARAMETERS, null, msgs);
			msgs = basicSetParameters(newParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__PARAMETERS, newParameters, newParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getSubstanceId() {
		return substanceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstanceId(Identifier newSubstanceId, NotificationChain msgs) {
		Identifier oldSubstanceId = substanceId;
		substanceId = newSubstanceId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__SUBSTANCE_ID, oldSubstanceId, newSubstanceId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstanceId(Identifier newSubstanceId) {
		if (newSubstanceId != substanceId) {
			NotificationChain msgs = null;
			if (substanceId != null)
				msgs = ((InternalEObject)substanceId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__SUBSTANCE_ID, null, msgs);
			if (newSubstanceId != null)
				msgs = ((InternalEObject)newSubstanceId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__SUBSTANCE_ID, null, msgs);
			msgs = basicSetSubstanceId(newSubstanceId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__SUBSTANCE_ID, newSubstanceId, newSubstanceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getSubstanceName() {
		return substanceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstanceName(org.hl7.fhir.String newSubstanceName, NotificationChain msgs) {
		org.hl7.fhir.String oldSubstanceName = substanceName;
		substanceName = newSubstanceName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__SUBSTANCE_NAME, oldSubstanceName, newSubstanceName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstanceName(org.hl7.fhir.String newSubstanceName) {
		if (newSubstanceName != substanceName) {
			NotificationChain msgs = null;
			if (substanceName != null)
				msgs = ((InternalEObject)substanceName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__SUBSTANCE_NAME, null, msgs);
			if (newSubstanceName != null)
				msgs = ((InternalEObject)newSubstanceName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__SUBSTANCE_NAME, null, msgs);
			msgs = basicSetSubstanceName(newSubstanceName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__SUBSTANCE_NAME, newSubstanceName, newSubstanceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAmount(org.hl7.fhir.String newAmount, NotificationChain msgs) {
		org.hl7.fhir.String oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__AMOUNT, oldAmount, newAmount);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmount(org.hl7.fhir.String newAmount) {
		if (newAmount != amount) {
			NotificationChain msgs = null;
			if (amount != null)
				msgs = ((InternalEObject)amount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__AMOUNT, null, msgs);
			if (newAmount != null)
				msgs = ((InternalEObject)newAmount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__AMOUNT, null, msgs);
			msgs = basicSetAmount(newAmount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__AMOUNT, newAmount, newAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__TYPE:
				return basicSetType(null, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__PARAMETERS:
				return basicSetParameters(null, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__SUBSTANCE_ID:
				return basicSetSubstanceId(null, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__SUBSTANCE_NAME:
				return basicSetSubstanceName(null, msgs);
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__AMOUNT:
				return basicSetAmount(null, msgs);
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
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__TYPE:
				return getType();
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__NAME:
				return getName();
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__PARAMETERS:
				return getParameters();
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__SUBSTANCE_ID:
				return getSubstanceId();
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__SUBSTANCE_NAME:
				return getSubstanceName();
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__AMOUNT:
				return getAmount();
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
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__NAME:
				setName((CodeableConcept)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__PARAMETERS:
				setParameters((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__SUBSTANCE_ID:
				setSubstanceId((Identifier)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__SUBSTANCE_NAME:
				setSubstanceName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__AMOUNT:
				setAmount((org.hl7.fhir.String)newValue);
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
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__TYPE:
				setType((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__NAME:
				setName((CodeableConcept)null);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__PARAMETERS:
				setParameters((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__SUBSTANCE_ID:
				setSubstanceId((Identifier)null);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__SUBSTANCE_NAME:
				setSubstanceName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__AMOUNT:
				setAmount((org.hl7.fhir.String)null);
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
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__TYPE:
				return type != null;
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__NAME:
				return name != null;
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__PARAMETERS:
				return parameters != null;
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__SUBSTANCE_ID:
				return substanceId != null;
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__SUBSTANCE_NAME:
				return substanceName != null;
			case FhirPackage.SUBSTANCE_SPECIFICATION_PROPERTY__AMOUNT:
				return amount != null;
		}
		return super.eIsSet(featureID);
	}

} //SubstanceSpecificationPropertyImpl
