/**
 */
package org.eclipse.mdht.hl7.fhir.resources.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.hl7.fhir.dataTypes.CodeableConcept;
import org.eclipse.mdht.hl7.fhir.dataTypes.DataType;
import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.BiologicallyDerivedProductProcessing;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Biologically Derived Product Processing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.BiologicallyDerivedProductProcessingImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.BiologicallyDerivedProductProcessingImpl#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.BiologicallyDerivedProductProcessingImpl#getAdditive <em>Additive</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.BiologicallyDerivedProductProcessingImpl#getTimex <em>Timex</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BiologicallyDerivedProductProcessingImpl extends BackboneElementImpl implements BiologicallyDerivedProductProcessing {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String description;

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
	 * The cached value of the '{@link #getAdditive() <em>Additive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditive()
	 * @generated
	 * @ordered
	 */
	protected Reference additive;

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
	protected BiologicallyDerivedProductProcessingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getBiologicallyDerivedProductProcessing();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(org.eclipse.mdht.hl7.fhir.dataTypes.String newDescription, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_PROCESSING__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(org.eclipse.mdht.hl7.fhir.dataTypes.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_PROCESSING__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_PROCESSING__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_PROCESSING__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_PROCESSING__PROCEDURE, oldProcedure, newProcedure);
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
	public void setProcedure(CodeableConcept newProcedure) {
		if (newProcedure != procedure) {
			NotificationChain msgs = null;
			if (procedure != null)
				msgs = ((InternalEObject)procedure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_PROCESSING__PROCEDURE, null, msgs);
			if (newProcedure != null)
				msgs = ((InternalEObject)newProcedure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_PROCESSING__PROCEDURE, null, msgs);
			msgs = basicSetProcedure(newProcedure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_PROCESSING__PROCEDURE, newProcedure, newProcedure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getAdditive() {
		return additive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdditive(Reference newAdditive, NotificationChain msgs) {
		Reference oldAdditive = additive;
		additive = newAdditive;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_PROCESSING__ADDITIVE, oldAdditive, newAdditive);
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
	public void setAdditive(Reference newAdditive) {
		if (newAdditive != additive) {
			NotificationChain msgs = null;
			if (additive != null)
				msgs = ((InternalEObject)additive).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_PROCESSING__ADDITIVE, null, msgs);
			if (newAdditive != null)
				msgs = ((InternalEObject)newAdditive).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_PROCESSING__ADDITIVE, null, msgs);
			msgs = basicSetAdditive(newAdditive, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_PROCESSING__ADDITIVE, newAdditive, newAdditive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_PROCESSING__TIMEX, oldTimex, newTimex);
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
	public void setTimex(DataType newTimex) {
		if (newTimex != timex) {
			NotificationChain msgs = null;
			if (timex != null)
				msgs = ((InternalEObject)timex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_PROCESSING__TIMEX, null, msgs);
			if (newTimex != null)
				msgs = ((InternalEObject)newTimex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_PROCESSING__TIMEX, null, msgs);
			msgs = basicSetTimex(newTimex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_PROCESSING__TIMEX, newTimex, newTimex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_PROCESSING__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_PROCESSING__PROCEDURE:
				return basicSetProcedure(null, msgs);
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_PROCESSING__ADDITIVE:
				return basicSetAdditive(null, msgs);
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_PROCESSING__TIMEX:
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
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_PROCESSING__DESCRIPTION:
				return getDescription();
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_PROCESSING__PROCEDURE:
				return getProcedure();
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_PROCESSING__ADDITIVE:
				return getAdditive();
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_PROCESSING__TIMEX:
				return getTimex();
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
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_PROCESSING__DESCRIPTION:
				setDescription((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_PROCESSING__PROCEDURE:
				setProcedure((CodeableConcept)newValue);
				return;
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_PROCESSING__ADDITIVE:
				setAdditive((Reference)newValue);
				return;
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_PROCESSING__TIMEX:
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
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_PROCESSING__DESCRIPTION:
				setDescription((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_PROCESSING__PROCEDURE:
				setProcedure((CodeableConcept)null);
				return;
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_PROCESSING__ADDITIVE:
				setAdditive((Reference)null);
				return;
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_PROCESSING__TIMEX:
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
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_PROCESSING__DESCRIPTION:
				return description != null;
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_PROCESSING__PROCEDURE:
				return procedure != null;
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_PROCESSING__ADDITIVE:
				return additive != null;
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_PROCESSING__TIMEX:
				return timex != null;
		}
		return super.eIsSet(featureID);
	}

} //BiologicallyDerivedProductProcessingImpl
