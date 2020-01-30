/**
 */
package fhiRCore.profiles.impl;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Ratio;
import fhiRCore.dataTypes.Reference;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.profiles.ProfilesPackage;
import fhiRCore.profiles.SubstanceDefinitionRelationship;

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
 * An implementation of the model object '<em><b>Substance Definition Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.profiles.impl.SubstanceDefinitionRelationshipImpl#getSubstancex <em>Substancex</em>}</li>
 *   <li>{@link fhiRCore.profiles.impl.SubstanceDefinitionRelationshipImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link fhiRCore.profiles.impl.SubstanceDefinitionRelationshipImpl#getIsDefining <em>Is Defining</em>}</li>
 *   <li>{@link fhiRCore.profiles.impl.SubstanceDefinitionRelationshipImpl#getAmountx <em>Amountx</em>}</li>
 *   <li>{@link fhiRCore.profiles.impl.SubstanceDefinitionRelationshipImpl#getAmountRatioLowLimit <em>Amount Ratio Low Limit</em>}</li>
 *   <li>{@link fhiRCore.profiles.impl.SubstanceDefinitionRelationshipImpl#getAmountType <em>Amount Type</em>}</li>
 *   <li>{@link fhiRCore.profiles.impl.SubstanceDefinitionRelationshipImpl#getSources <em>Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstanceDefinitionRelationshipImpl extends BackboneElementImpl implements SubstanceDefinitionRelationship {
	/**
	 * The cached value of the '{@link #getSubstancex() <em>Substancex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstancex()
	 * @generated
	 * @ordered
	 */
	protected DataType substancex;

	/**
	 * The cached value of the '{@link #getRelationship() <em>Relationship</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept relationship;

	/**
	 * The cached value of the '{@link #getIsDefining() <em>Is Defining</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDefining()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Boolean isDefining;

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
	 * The cached value of the '{@link #getAmountRatioLowLimit() <em>Amount Ratio Low Limit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountRatioLowLimit()
	 * @generated
	 * @ordered
	 */
	protected Ratio amountRatioLowLimit;

	/**
	 * The cached value of the '{@link #getAmountType() <em>Amount Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept amountType;

	/**
	 * The cached value of the '{@link #getSources() <em>Source</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSources()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> sources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceDefinitionRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfilesPackage.Literals.SUBSTANCE_DEFINITION_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getSubstancex() {
		return substancex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstancex(DataType newSubstancex, NotificationChain msgs) {
		DataType oldSubstancex = substancex;
		substancex = newSubstancex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__SUBSTANCEX, oldSubstancex, newSubstancex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstancex(DataType newSubstancex) {
		if (newSubstancex != substancex) {
			NotificationChain msgs = null;
			if (substancex != null)
				msgs = ((InternalEObject)substancex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__SUBSTANCEX, null, msgs);
			if (newSubstancex != null)
				msgs = ((InternalEObject)newSubstancex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__SUBSTANCEX, null, msgs);
			msgs = basicSetSubstancex(newSubstancex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__SUBSTANCEX, newSubstancex, newSubstancex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getRelationship() {
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelationship(CodeableConcept newRelationship, NotificationChain msgs) {
		CodeableConcept oldRelationship = relationship;
		relationship = newRelationship;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__RELATIONSHIP, oldRelationship, newRelationship);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationship(CodeableConcept newRelationship) {
		if (newRelationship != relationship) {
			NotificationChain msgs = null;
			if (relationship != null)
				msgs = ((InternalEObject)relationship).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__RELATIONSHIP, null, msgs);
			if (newRelationship != null)
				msgs = ((InternalEObject)newRelationship).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__RELATIONSHIP, null, msgs);
			msgs = basicSetRelationship(newRelationship, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__RELATIONSHIP, newRelationship, newRelationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Boolean getIsDefining() {
		return isDefining;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsDefining(fhiRCore.dataTypes.Boolean newIsDefining, NotificationChain msgs) {
		fhiRCore.dataTypes.Boolean oldIsDefining = isDefining;
		isDefining = newIsDefining;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__IS_DEFINING, oldIsDefining, newIsDefining);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDefining(fhiRCore.dataTypes.Boolean newIsDefining) {
		if (newIsDefining != isDefining) {
			NotificationChain msgs = null;
			if (isDefining != null)
				msgs = ((InternalEObject)isDefining).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__IS_DEFINING, null, msgs);
			if (newIsDefining != null)
				msgs = ((InternalEObject)newIsDefining).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__IS_DEFINING, null, msgs);
			msgs = basicSetIsDefining(newIsDefining, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__IS_DEFINING, newIsDefining, newIsDefining));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNTX, oldAmountx, newAmountx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmountx(DataType newAmountx) {
		if (newAmountx != amountx) {
			NotificationChain msgs = null;
			if (amountx != null)
				msgs = ((InternalEObject)amountx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNTX, null, msgs);
			if (newAmountx != null)
				msgs = ((InternalEObject)newAmountx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNTX, null, msgs);
			msgs = basicSetAmountx(newAmountx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNTX, newAmountx, newAmountx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ratio getAmountRatioLowLimit() {
		return amountRatioLowLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAmountRatioLowLimit(Ratio newAmountRatioLowLimit, NotificationChain msgs) {
		Ratio oldAmountRatioLowLimit = amountRatioLowLimit;
		amountRatioLowLimit = newAmountRatioLowLimit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNT_RATIO_LOW_LIMIT, oldAmountRatioLowLimit, newAmountRatioLowLimit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmountRatioLowLimit(Ratio newAmountRatioLowLimit) {
		if (newAmountRatioLowLimit != amountRatioLowLimit) {
			NotificationChain msgs = null;
			if (amountRatioLowLimit != null)
				msgs = ((InternalEObject)amountRatioLowLimit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNT_RATIO_LOW_LIMIT, null, msgs);
			if (newAmountRatioLowLimit != null)
				msgs = ((InternalEObject)newAmountRatioLowLimit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNT_RATIO_LOW_LIMIT, null, msgs);
			msgs = basicSetAmountRatioLowLimit(newAmountRatioLowLimit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNT_RATIO_LOW_LIMIT, newAmountRatioLowLimit, newAmountRatioLowLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getAmountType() {
		return amountType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAmountType(CodeableConcept newAmountType, NotificationChain msgs) {
		CodeableConcept oldAmountType = amountType;
		amountType = newAmountType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNT_TYPE, oldAmountType, newAmountType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmountType(CodeableConcept newAmountType) {
		if (newAmountType != amountType) {
			NotificationChain msgs = null;
			if (amountType != null)
				msgs = ((InternalEObject)amountType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNT_TYPE, null, msgs);
			if (newAmountType != null)
				msgs = ((InternalEObject)newAmountType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNT_TYPE, null, msgs);
			msgs = basicSetAmountType(newAmountType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNT_TYPE, newAmountType, newAmountType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getSources() {
		if (sources == null) {
			sources = new EObjectContainmentEList<Reference>(Reference.class, this, ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__SOURCE);
		}
		return sources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__SUBSTANCEX:
				return basicSetSubstancex(null, msgs);
			case ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__RELATIONSHIP:
				return basicSetRelationship(null, msgs);
			case ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__IS_DEFINING:
				return basicSetIsDefining(null, msgs);
			case ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNTX:
				return basicSetAmountx(null, msgs);
			case ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNT_RATIO_LOW_LIMIT:
				return basicSetAmountRatioLowLimit(null, msgs);
			case ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNT_TYPE:
				return basicSetAmountType(null, msgs);
			case ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__SOURCE:
				return ((InternalEList<?>)getSources()).basicRemove(otherEnd, msgs);
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
			case ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__SUBSTANCEX:
				return getSubstancex();
			case ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__RELATIONSHIP:
				return getRelationship();
			case ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__IS_DEFINING:
				return getIsDefining();
			case ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNTX:
				return getAmountx();
			case ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNT_RATIO_LOW_LIMIT:
				return getAmountRatioLowLimit();
			case ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNT_TYPE:
				return getAmountType();
			case ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__SOURCE:
				return getSources();
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
			case ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__SUBSTANCEX:
				setSubstancex((DataType)newValue);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__RELATIONSHIP:
				setRelationship((CodeableConcept)newValue);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__IS_DEFINING:
				setIsDefining((fhiRCore.dataTypes.Boolean)newValue);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNTX:
				setAmountx((DataType)newValue);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNT_RATIO_LOW_LIMIT:
				setAmountRatioLowLimit((Ratio)newValue);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNT_TYPE:
				setAmountType((CodeableConcept)newValue);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__SOURCE:
				getSources().clear();
				getSources().addAll((Collection<? extends Reference>)newValue);
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
			case ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__SUBSTANCEX:
				setSubstancex((DataType)null);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__RELATIONSHIP:
				setRelationship((CodeableConcept)null);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__IS_DEFINING:
				setIsDefining((fhiRCore.dataTypes.Boolean)null);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNTX:
				setAmountx((DataType)null);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNT_RATIO_LOW_LIMIT:
				setAmountRatioLowLimit((Ratio)null);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNT_TYPE:
				setAmountType((CodeableConcept)null);
				return;
			case ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__SOURCE:
				getSources().clear();
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
			case ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__SUBSTANCEX:
				return substancex != null;
			case ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__RELATIONSHIP:
				return relationship != null;
			case ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__IS_DEFINING:
				return isDefining != null;
			case ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNTX:
				return amountx != null;
			case ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNT_RATIO_LOW_LIMIT:
				return amountRatioLowLimit != null;
			case ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__AMOUNT_TYPE:
				return amountType != null;
			case ProfilesPackage.SUBSTANCE_DEFINITION_RELATIONSHIP__SOURCE:
				return sources != null && !sources.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubstanceDefinitionRelationshipImpl
