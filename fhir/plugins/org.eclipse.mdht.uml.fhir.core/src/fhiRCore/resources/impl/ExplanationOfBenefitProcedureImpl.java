/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.PositiveInt;
import fhiRCore.dataTypes.Reference;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.ExplanationOfBenefitProcedure;
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
 * An implementation of the model object '<em><b>Explanation Of Benefit Procedure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.ExplanationOfBenefitProcedureImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ExplanationOfBenefitProcedureImpl#getTypes <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ExplanationOfBenefitProcedureImpl#getDate <em>Date</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ExplanationOfBenefitProcedureImpl#getProcedurex <em>Procedurex</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ExplanationOfBenefitProcedureImpl#getUdis <em>Udi</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExplanationOfBenefitProcedureImpl extends BackboneElementImpl implements ExplanationOfBenefitProcedure {
	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt sequence;

	/**
	 * The cached value of the '{@link #getTypes() <em>Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> types;

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
	 * The cached value of the '{@link #getProcedurex() <em>Procedurex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedurex()
	 * @generated
	 * @ordered
	 */
	protected DataType procedurex;

	/**
	 * The cached value of the '{@link #getUdis() <em>Udi</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUdis()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> udis;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExplanationOfBenefitProcedureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getExplanationOfBenefitProcedure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getSequence() {
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequence(PositiveInt newSequence, NotificationChain msgs) {
		PositiveInt oldSequence = sequence;
		sequence = newSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_PROCEDURE__SEQUENCE, oldSequence, newSequence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequence(PositiveInt newSequence) {
		if (newSequence != sequence) {
			NotificationChain msgs = null;
			if (sequence != null)
				msgs = ((InternalEObject)sequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_PROCEDURE__SEQUENCE, null, msgs);
			if (newSequence != null)
				msgs = ((InternalEObject)newSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_PROCEDURE__SEQUENCE, null, msgs);
			msgs = basicSetSequence(newSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_PROCEDURE__SEQUENCE, newSequence, newSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.EXPLANATION_OF_BENEFIT_PROCEDURE__TYPE);
		}
		return types;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_PROCEDURE__DATE, oldDate, newDate);
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
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_PROCEDURE__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_PROCEDURE__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_PROCEDURE__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getProcedurex() {
		return procedurex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcedurex(DataType newProcedurex, NotificationChain msgs) {
		DataType oldProcedurex = procedurex;
		procedurex = newProcedurex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_PROCEDURE__PROCEDUREX, oldProcedurex, newProcedurex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcedurex(DataType newProcedurex) {
		if (newProcedurex != procedurex) {
			NotificationChain msgs = null;
			if (procedurex != null)
				msgs = ((InternalEObject)procedurex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_PROCEDURE__PROCEDUREX, null, msgs);
			if (newProcedurex != null)
				msgs = ((InternalEObject)newProcedurex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.EXPLANATION_OF_BENEFIT_PROCEDURE__PROCEDUREX, null, msgs);
			msgs = basicSetProcedurex(newProcedurex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.EXPLANATION_OF_BENEFIT_PROCEDURE__PROCEDUREX, newProcedurex, newProcedurex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getUdis() {
		if (udis == null) {
			udis = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.EXPLANATION_OF_BENEFIT_PROCEDURE__UDI);
		}
		return udis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_PROCEDURE__SEQUENCE:
				return basicSetSequence(null, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_PROCEDURE__TYPE:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_PROCEDURE__DATE:
				return basicSetDate(null, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_PROCEDURE__PROCEDUREX:
				return basicSetProcedurex(null, msgs);
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_PROCEDURE__UDI:
				return ((InternalEList<?>)getUdis()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_PROCEDURE__SEQUENCE:
				return getSequence();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_PROCEDURE__TYPE:
				return getTypes();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_PROCEDURE__DATE:
				return getDate();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_PROCEDURE__PROCEDUREX:
				return getProcedurex();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_PROCEDURE__UDI:
				return getUdis();
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
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_PROCEDURE__SEQUENCE:
				setSequence((PositiveInt)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_PROCEDURE__TYPE:
				getTypes().clear();
				getTypes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_PROCEDURE__DATE:
				setDate((DateTime)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_PROCEDURE__PROCEDUREX:
				setProcedurex((DataType)newValue);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_PROCEDURE__UDI:
				getUdis().clear();
				getUdis().addAll((Collection<? extends Reference>)newValue);
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
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_PROCEDURE__SEQUENCE:
				setSequence((PositiveInt)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_PROCEDURE__TYPE:
				getTypes().clear();
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_PROCEDURE__DATE:
				setDate((DateTime)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_PROCEDURE__PROCEDUREX:
				setProcedurex((DataType)null);
				return;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_PROCEDURE__UDI:
				getUdis().clear();
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
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_PROCEDURE__SEQUENCE:
				return sequence != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_PROCEDURE__TYPE:
				return types != null && !types.isEmpty();
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_PROCEDURE__DATE:
				return date != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_PROCEDURE__PROCEDUREX:
				return procedurex != null;
			case ResourcesPackage.EXPLANATION_OF_BENEFIT_PROCEDURE__UDI:
				return udis != null && !udis.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExplanationOfBenefitProcedureImpl
