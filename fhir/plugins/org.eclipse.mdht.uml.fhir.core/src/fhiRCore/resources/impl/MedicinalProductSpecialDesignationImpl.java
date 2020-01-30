/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Identifier;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.MedicinalProductSpecialDesignation;
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
 * An implementation of the model object '<em><b>Medicinal Product Special Designation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.MedicinalProductSpecialDesignationImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicinalProductSpecialDesignationImpl#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicinalProductSpecialDesignationImpl#getIntendedUse <em>Intended Use</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicinalProductSpecialDesignationImpl#getIndicationx <em>Indicationx</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicinalProductSpecialDesignationImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicinalProductSpecialDesignationImpl#getDate <em>Date</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicinalProductSpecialDesignationImpl#getSpecies <em>Species</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicinalProductSpecialDesignationImpl extends BackboneElementImpl implements MedicinalProductSpecialDesignation {
	/**
	 * The cached value of the '{@link #getIdentifiers() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifiers;

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
	 * The cached value of the '{@link #getIntendedUse() <em>Intended Use</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntendedUse()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept intendedUse;

	/**
	 * The cached value of the '{@link #getIndicationx() <em>Indicationx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndicationx()
	 * @generated
	 * @ordered
	 */
	protected DataType indicationx;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept status;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime date;

	/**
	 * The cached value of the '{@link #getSpecies() <em>Species</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecies()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept species;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicinalProductSpecialDesignationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getMedicinalProductSpecialDesignation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__IDENTIFIER);
		}
		return identifiers;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getIntendedUse() {
		return intendedUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntendedUse(CodeableConcept newIntendedUse, NotificationChain msgs) {
		CodeableConcept oldIntendedUse = intendedUse;
		intendedUse = newIntendedUse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__INTENDED_USE, oldIntendedUse, newIntendedUse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntendedUse(CodeableConcept newIntendedUse) {
		if (newIntendedUse != intendedUse) {
			NotificationChain msgs = null;
			if (intendedUse != null)
				msgs = ((InternalEObject)intendedUse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__INTENDED_USE, null, msgs);
			if (newIntendedUse != null)
				msgs = ((InternalEObject)newIntendedUse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__INTENDED_USE, null, msgs);
			msgs = basicSetIntendedUse(newIntendedUse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__INTENDED_USE, newIntendedUse, newIntendedUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getIndicationx() {
		return indicationx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndicationx(DataType newIndicationx, NotificationChain msgs) {
		DataType oldIndicationx = indicationx;
		indicationx = newIndicationx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__INDICATIONX, oldIndicationx, newIndicationx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndicationx(DataType newIndicationx) {
		if (newIndicationx != indicationx) {
			NotificationChain msgs = null;
			if (indicationx != null)
				msgs = ((InternalEObject)indicationx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__INDICATIONX, null, msgs);
			if (newIndicationx != null)
				msgs = ((InternalEObject)newIndicationx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__INDICATIONX, null, msgs);
			msgs = basicSetIndicationx(newIndicationx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__INDICATIONX, newIndicationx, newIndicationx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(CodeableConcept newStatus, NotificationChain msgs) {
		CodeableConcept oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(CodeableConcept newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(DateTime newDate, NotificationChain msgs) {
		DateTime oldDate = date;
		date = newDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__DATE, oldDate, newDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(DateTime newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getSpecies() {
		return species;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecies(CodeableConcept newSpecies, NotificationChain msgs) {
		CodeableConcept oldSpecies = species;
		species = newSpecies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__SPECIES, oldSpecies, newSpecies);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecies(CodeableConcept newSpecies) {
		if (newSpecies != species) {
			NotificationChain msgs = null;
			if (species != null)
				msgs = ((InternalEObject)species).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__SPECIES, null, msgs);
			if (newSpecies != null)
				msgs = ((InternalEObject)newSpecies).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__SPECIES, null, msgs);
			msgs = basicSetSpecies(newSpecies, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__SPECIES, newSpecies, newSpecies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__INTENDED_USE:
				return basicSetIntendedUse(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__INDICATIONX:
				return basicSetIndicationx(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__DATE:
				return basicSetDate(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__SPECIES:
				return basicSetSpecies(null, msgs);
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
			case ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__TYPE:
				return getType();
			case ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__INTENDED_USE:
				return getIntendedUse();
			case ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__INDICATIONX:
				return getIndicationx();
			case ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__STATUS:
				return getStatus();
			case ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__DATE:
				return getDate();
			case ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__SPECIES:
				return getSpecies();
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
			case ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__INTENDED_USE:
				setIntendedUse((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__INDICATIONX:
				setIndicationx((DataType)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__STATUS:
				setStatus((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__DATE:
				setDate((DateTime)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__SPECIES:
				setSpecies((CodeableConcept)newValue);
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
			case ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__TYPE:
				setType((CodeableConcept)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__INTENDED_USE:
				setIntendedUse((CodeableConcept)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__INDICATIONX:
				setIndicationx((DataType)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__STATUS:
				setStatus((CodeableConcept)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__DATE:
				setDate((DateTime)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__SPECIES:
				setSpecies((CodeableConcept)null);
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
			case ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__TYPE:
				return type != null;
			case ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__INTENDED_USE:
				return intendedUse != null;
			case ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__INDICATIONX:
				return indicationx != null;
			case ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__STATUS:
				return status != null;
			case ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__DATE:
				return date != null;
			case ResourcesPackage.MEDICINAL_PRODUCT_SPECIAL_DESIGNATION__SPECIES:
				return species != null;
		}
		return super.eIsSet(featureID);
	}

} //MedicinalProductSpecialDesignationImpl
