/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Reference;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.ResourcesPackage;
import fhiRCore.resources.SpecimenProcessing;

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
 * An implementation of the model object '<em><b>Specimen Processing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.SpecimenProcessingImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SpecimenProcessingImpl#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SpecimenProcessingImpl#getAdditives <em>Additive</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SpecimenProcessingImpl#getTimex <em>Timex</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecimenProcessingImpl extends BackboneElementImpl implements SpecimenProcessing {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String description;

	/**
	 * The cached value of the '{@link #getProcedure() <em>Procedure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedure()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept procedure;

	/**
	 * The cached value of the '{@link #getAdditives() <em>Additive</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditives()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> additives;

	/**
	 * The cached value of the '{@link #getTimex() <em>Timex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimex()
	 * @generated
	 * @ordered
	 */
	protected DataType timex;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecimenProcessingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getSpecimenProcessing();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(fhiRCore.dataTypes.String newDescription, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_PROCESSING__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(fhiRCore.dataTypes.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_PROCESSING__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_PROCESSING__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_PROCESSING__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getProcedure() {
		return procedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcedure(CodeableConcept newProcedure, NotificationChain msgs) {
		CodeableConcept oldProcedure = procedure;
		procedure = newProcedure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_PROCESSING__PROCEDURE, oldProcedure, newProcedure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcedure(CodeableConcept newProcedure) {
		if (newProcedure != procedure) {
			NotificationChain msgs = null;
			if (procedure != null)
				msgs = ((InternalEObject)procedure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_PROCESSING__PROCEDURE, null, msgs);
			if (newProcedure != null)
				msgs = ((InternalEObject)newProcedure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_PROCESSING__PROCEDURE, null, msgs);
			msgs = basicSetProcedure(newProcedure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_PROCESSING__PROCEDURE, newProcedure, newProcedure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getAdditives() {
		if (additives == null) {
			additives = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.SPECIMEN_PROCESSING__ADDITIVE);
		}
		return additives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getTimex() {
		return timex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimex(DataType newTimex, NotificationChain msgs) {
		DataType oldTimex = timex;
		timex = newTimex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_PROCESSING__TIMEX, oldTimex, newTimex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimex(DataType newTimex) {
		if (newTimex != timex) {
			NotificationChain msgs = null;
			if (timex != null)
				msgs = ((InternalEObject)timex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_PROCESSING__TIMEX, null, msgs);
			if (newTimex != null)
				msgs = ((InternalEObject)newTimex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_PROCESSING__TIMEX, null, msgs);
			msgs = basicSetTimex(newTimex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_PROCESSING__TIMEX, newTimex, newTimex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.SPECIMEN_PROCESSING__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case ResourcesPackage.SPECIMEN_PROCESSING__PROCEDURE:
				return basicSetProcedure(null, msgs);
			case ResourcesPackage.SPECIMEN_PROCESSING__ADDITIVE:
				return ((InternalEList<?>)getAdditives()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SPECIMEN_PROCESSING__TIMEX:
				return basicSetTimex(null, msgs);
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
			case ResourcesPackage.SPECIMEN_PROCESSING__DESCRIPTION:
				return getDescription();
			case ResourcesPackage.SPECIMEN_PROCESSING__PROCEDURE:
				return getProcedure();
			case ResourcesPackage.SPECIMEN_PROCESSING__ADDITIVE:
				return getAdditives();
			case ResourcesPackage.SPECIMEN_PROCESSING__TIMEX:
				return getTimex();
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
			case ResourcesPackage.SPECIMEN_PROCESSING__DESCRIPTION:
				setDescription((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.SPECIMEN_PROCESSING__PROCEDURE:
				setProcedure((CodeableConcept)newValue);
				return;
			case ResourcesPackage.SPECIMEN_PROCESSING__ADDITIVE:
				getAdditives().clear();
				getAdditives().addAll((Collection<? extends Reference>)newValue);
				return;
			case ResourcesPackage.SPECIMEN_PROCESSING__TIMEX:
				setTimex((DataType)newValue);
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
			case ResourcesPackage.SPECIMEN_PROCESSING__DESCRIPTION:
				setDescription((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.SPECIMEN_PROCESSING__PROCEDURE:
				setProcedure((CodeableConcept)null);
				return;
			case ResourcesPackage.SPECIMEN_PROCESSING__ADDITIVE:
				getAdditives().clear();
				return;
			case ResourcesPackage.SPECIMEN_PROCESSING__TIMEX:
				setTimex((DataType)null);
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
			case ResourcesPackage.SPECIMEN_PROCESSING__DESCRIPTION:
				return description != null;
			case ResourcesPackage.SPECIMEN_PROCESSING__PROCEDURE:
				return procedure != null;
			case ResourcesPackage.SPECIMEN_PROCESSING__ADDITIVE:
				return additives != null && !additives.isEmpty();
			case ResourcesPackage.SPECIMEN_PROCESSING__TIMEX:
				return timex != null;
		}
		return super.eIsSet(featureID);
	}

} //SpecimenProcessingImpl
