/**
 */
package org.hl7.knowledgeartifact.r2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.hl7.knowledgeartifact.r2.BindingTypeType;
import org.hl7.knowledgeartifact.r2.Metadata;
import org.hl7.knowledgeartifact.r2.R2Package;
import org.hl7.knowledgeartifact.r2.SpecificMetadataBinding;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specific Metadata Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.SpecificMetadataBindingImpl#getBindingType <em>Binding Type</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.SpecificMetadataBindingImpl#getMetadata <em>Metadata</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecificMetadataBindingImpl extends MinimalEObjectImpl.Container implements SpecificMetadataBinding {
	/**
	 * The cached value of the '{@link #getBindingType() <em>Binding Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindingType()
	 * @generated
	 * @ordered
	 */
	protected BindingTypeType bindingType;

	/**
	 * The cached value of the '{@link #getMetadata() <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata()
	 * @generated
	 * @ordered
	 */
	protected Metadata metadata;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificMetadataBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R2Package.eINSTANCE.getSpecificMetadataBinding();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingTypeType getBindingType() {
		return bindingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBindingType(BindingTypeType newBindingType, NotificationChain msgs) {
		BindingTypeType oldBindingType = bindingType;
		bindingType = newBindingType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.SPECIFIC_METADATA_BINDING__BINDING_TYPE, oldBindingType, newBindingType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBindingType(BindingTypeType newBindingType) {
		if (newBindingType != bindingType) {
			NotificationChain msgs = null;
			if (bindingType != null)
				msgs = ((InternalEObject)bindingType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.SPECIFIC_METADATA_BINDING__BINDING_TYPE, null, msgs);
			if (newBindingType != null)
				msgs = ((InternalEObject)newBindingType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.SPECIFIC_METADATA_BINDING__BINDING_TYPE, null, msgs);
			msgs = basicSetBindingType(newBindingType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.SPECIFIC_METADATA_BINDING__BINDING_TYPE, newBindingType, newBindingType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metadata getMetadata() {
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetadata(Metadata newMetadata, NotificationChain msgs) {
		Metadata oldMetadata = metadata;
		metadata = newMetadata;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.SPECIFIC_METADATA_BINDING__METADATA, oldMetadata, newMetadata);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetadata(Metadata newMetadata) {
		if (newMetadata != metadata) {
			NotificationChain msgs = null;
			if (metadata != null)
				msgs = ((InternalEObject)metadata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.SPECIFIC_METADATA_BINDING__METADATA, null, msgs);
			if (newMetadata != null)
				msgs = ((InternalEObject)newMetadata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.SPECIFIC_METADATA_BINDING__METADATA, null, msgs);
			msgs = basicSetMetadata(newMetadata, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.SPECIFIC_METADATA_BINDING__METADATA, newMetadata, newMetadata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R2Package.SPECIFIC_METADATA_BINDING__BINDING_TYPE:
				return basicSetBindingType(null, msgs);
			case R2Package.SPECIFIC_METADATA_BINDING__METADATA:
				return basicSetMetadata(null, msgs);
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
			case R2Package.SPECIFIC_METADATA_BINDING__BINDING_TYPE:
				return getBindingType();
			case R2Package.SPECIFIC_METADATA_BINDING__METADATA:
				return getMetadata();
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
			case R2Package.SPECIFIC_METADATA_BINDING__BINDING_TYPE:
				setBindingType((BindingTypeType)newValue);
				return;
			case R2Package.SPECIFIC_METADATA_BINDING__METADATA:
				setMetadata((Metadata)newValue);
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
			case R2Package.SPECIFIC_METADATA_BINDING__BINDING_TYPE:
				setBindingType((BindingTypeType)null);
				return;
			case R2Package.SPECIFIC_METADATA_BINDING__METADATA:
				setMetadata((Metadata)null);
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
			case R2Package.SPECIFIC_METADATA_BINDING__BINDING_TYPE:
				return bindingType != null;
			case R2Package.SPECIFIC_METADATA_BINDING__METADATA:
				return metadata != null;
		}
		return super.eIsSet(featureID);
	}

} //SpecificMetadataBindingImpl
