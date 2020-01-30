/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Markdown;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.CapabilityStatementRestResourceOperation;
import fhiRCore.resources.OperationDefinition;
import fhiRCore.resources.ResourcesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability Statement Rest Resource Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.CapabilityStatementRestResourceOperationImpl#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CapabilityStatementRestResourceOperationImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CapabilityStatementRestResourceOperationImpl#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityStatementRestResourceOperationImpl extends BackboneElementImpl implements CapabilityStatementRestResourceOperation {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String name;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected OperationDefinition definition;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected Markdown documentation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityStatementRestResourceOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getCapabilityStatementRestResourceOperation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(fhiRCore.dataTypes.String newName, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE_OPERATION__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(fhiRCore.dataTypes.String newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE_OPERATION__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE_OPERATION__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE_OPERATION__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationDefinition getDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinition(OperationDefinition newDefinition, NotificationChain msgs) {
		OperationDefinition oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE_OPERATION__DEFINITION, oldDefinition, newDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(OperationDefinition newDefinition) {
		if (newDefinition != definition) {
			NotificationChain msgs = null;
			if (definition != null)
				msgs = ((InternalEObject)definition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE_OPERATION__DEFINITION, null, msgs);
			if (newDefinition != null)
				msgs = ((InternalEObject)newDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE_OPERATION__DEFINITION, null, msgs);
			msgs = basicSetDefinition(newDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE_OPERATION__DEFINITION, newDefinition, newDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentation(Markdown newDocumentation, NotificationChain msgs) {
		Markdown oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE_OPERATION__DOCUMENTATION, oldDocumentation, newDocumentation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(Markdown newDocumentation) {
		if (newDocumentation != documentation) {
			NotificationChain msgs = null;
			if (documentation != null)
				msgs = ((InternalEObject)documentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE_OPERATION__DOCUMENTATION, null, msgs);
			if (newDocumentation != null)
				msgs = ((InternalEObject)newDocumentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE_OPERATION__DOCUMENTATION, null, msgs);
			msgs = basicSetDocumentation(newDocumentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE_OPERATION__DOCUMENTATION, newDocumentation, newDocumentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE_OPERATION__NAME:
				return basicSetName(null, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE_OPERATION__DEFINITION:
				return basicSetDefinition(null, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE_OPERATION__DOCUMENTATION:
				return basicSetDocumentation(null, msgs);
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
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE_OPERATION__NAME:
				return getName();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE_OPERATION__DEFINITION:
				return getDefinition();
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE_OPERATION__DOCUMENTATION:
				return getDocumentation();
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
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE_OPERATION__NAME:
				setName((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE_OPERATION__DEFINITION:
				setDefinition((OperationDefinition)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE_OPERATION__DOCUMENTATION:
				setDocumentation((Markdown)newValue);
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
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE_OPERATION__NAME:
				setName((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE_OPERATION__DEFINITION:
				setDefinition((OperationDefinition)null);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE_OPERATION__DOCUMENTATION:
				setDocumentation((Markdown)null);
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
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE_OPERATION__NAME:
				return name != null;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE_OPERATION__DEFINITION:
				return definition != null;
			case ResourcesPackage.CAPABILITY_STATEMENT_REST_RESOURCE_OPERATION__DOCUMENTATION:
				return documentation != null;
		}
		return super.eIsSet(featureID);
	}

} //CapabilityStatementRestResourceOperationImpl
