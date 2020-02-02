/**
 */
package org.hl7.knowledgeartifact.r2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.hl7.cdsdt.r2.ST;

import org.hl7.knowledgeartifact.r2.ModelReference;
import org.hl7.knowledgeartifact.r2.R2Package;
import org.hl7.knowledgeartifact.r2.ReferencedModelType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ModelReferenceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ModelReferenceImpl#getReferencedModel <em>Referenced Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelReferenceImpl extends MinimalEObjectImpl.Container implements ModelReference {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected ST description;

	/**
	 * The cached value of the '{@link #getReferencedModel() <em>Referenced Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedModel()
	 * @generated
	 * @ordered
	 */
	protected ReferencedModelType referencedModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R2Package.eINSTANCE.getModelReference();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ST getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(ST newDescription, NotificationChain msgs) {
		ST oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.MODEL_REFERENCE__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(ST newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.MODEL_REFERENCE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.MODEL_REFERENCE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.MODEL_REFERENCE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferencedModelType getReferencedModel() {
		return referencedModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencedModel(ReferencedModelType newReferencedModel, NotificationChain msgs) {
		ReferencedModelType oldReferencedModel = referencedModel;
		referencedModel = newReferencedModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.MODEL_REFERENCE__REFERENCED_MODEL, oldReferencedModel, newReferencedModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedModel(ReferencedModelType newReferencedModel) {
		if (newReferencedModel != referencedModel) {
			NotificationChain msgs = null;
			if (referencedModel != null)
				msgs = ((InternalEObject)referencedModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.MODEL_REFERENCE__REFERENCED_MODEL, null, msgs);
			if (newReferencedModel != null)
				msgs = ((InternalEObject)newReferencedModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.MODEL_REFERENCE__REFERENCED_MODEL, null, msgs);
			msgs = basicSetReferencedModel(newReferencedModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.MODEL_REFERENCE__REFERENCED_MODEL, newReferencedModel, newReferencedModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R2Package.MODEL_REFERENCE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case R2Package.MODEL_REFERENCE__REFERENCED_MODEL:
				return basicSetReferencedModel(null, msgs);
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
			case R2Package.MODEL_REFERENCE__DESCRIPTION:
				return getDescription();
			case R2Package.MODEL_REFERENCE__REFERENCED_MODEL:
				return getReferencedModel();
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
			case R2Package.MODEL_REFERENCE__DESCRIPTION:
				setDescription((ST)newValue);
				return;
			case R2Package.MODEL_REFERENCE__REFERENCED_MODEL:
				setReferencedModel((ReferencedModelType)newValue);
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
			case R2Package.MODEL_REFERENCE__DESCRIPTION:
				setDescription((ST)null);
				return;
			case R2Package.MODEL_REFERENCE__REFERENCED_MODEL:
				setReferencedModel((ReferencedModelType)null);
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
			case R2Package.MODEL_REFERENCE__DESCRIPTION:
				return description != null;
			case R2Package.MODEL_REFERENCE__REFERENCED_MODEL:
				return referencedModel != null;
		}
		return super.eIsSet(featureID);
	}

} //ModelReferenceImpl
