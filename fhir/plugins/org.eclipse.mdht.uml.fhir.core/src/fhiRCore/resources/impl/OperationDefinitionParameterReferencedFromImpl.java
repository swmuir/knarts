/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.OperationDefinitionParameterReferencedFrom;
import fhiRCore.resources.ResourcesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Definition Parameter Referenced From</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.OperationDefinitionParameterReferencedFromImpl#getSource <em>Source</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OperationDefinitionParameterReferencedFromImpl#getSourceId <em>Source Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationDefinitionParameterReferencedFromImpl extends BackboneElementImpl implements OperationDefinitionParameterReferencedFrom {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String source;

	/**
	 * The cached value of the '{@link #getSourceId() <em>Source Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceId()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String sourceId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationDefinitionParameterReferencedFromImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getOperationDefinitionParameterReferencedFrom();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(fhiRCore.dataTypes.String newSource, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION_PARAMETER_REFERENCED_FROM__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(fhiRCore.dataTypes.String newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION_PARAMETER_REFERENCED_FROM__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION_PARAMETER_REFERENCED_FROM__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION_PARAMETER_REFERENCED_FROM__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getSourceId() {
		return sourceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceId(fhiRCore.dataTypes.String newSourceId, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldSourceId = sourceId;
		sourceId = newSourceId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION_PARAMETER_REFERENCED_FROM__SOURCE_ID, oldSourceId, newSourceId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceId(fhiRCore.dataTypes.String newSourceId) {
		if (newSourceId != sourceId) {
			NotificationChain msgs = null;
			if (sourceId != null)
				msgs = ((InternalEObject)sourceId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION_PARAMETER_REFERENCED_FROM__SOURCE_ID, null, msgs);
			if (newSourceId != null)
				msgs = ((InternalEObject)newSourceId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_DEFINITION_PARAMETER_REFERENCED_FROM__SOURCE_ID, null, msgs);
			msgs = basicSetSourceId(newSourceId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_DEFINITION_PARAMETER_REFERENCED_FROM__SOURCE_ID, newSourceId, newSourceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER_REFERENCED_FROM__SOURCE:
				return basicSetSource(null, msgs);
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER_REFERENCED_FROM__SOURCE_ID:
				return basicSetSourceId(null, msgs);
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
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER_REFERENCED_FROM__SOURCE:
				return getSource();
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER_REFERENCED_FROM__SOURCE_ID:
				return getSourceId();
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
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER_REFERENCED_FROM__SOURCE:
				setSource((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER_REFERENCED_FROM__SOURCE_ID:
				setSourceId((fhiRCore.dataTypes.String)newValue);
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
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER_REFERENCED_FROM__SOURCE:
				setSource((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER_REFERENCED_FROM__SOURCE_ID:
				setSourceId((fhiRCore.dataTypes.String)null);
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
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER_REFERENCED_FROM__SOURCE:
				return source != null;
			case ResourcesPackage.OPERATION_DEFINITION_PARAMETER_REFERENCED_FROM__SOURCE_ID:
				return sourceId != null;
		}
		return super.eIsSet(featureID);
	}

} //OperationDefinitionParameterReferencedFromImpl
