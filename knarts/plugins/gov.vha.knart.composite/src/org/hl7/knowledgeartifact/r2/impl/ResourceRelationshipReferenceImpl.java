/**
 */
package org.hl7.knowledgeartifact.r2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.hl7.knowledgeartifact.r2.R2Package;
import org.hl7.knowledgeartifact.r2.RelationshipType;
import org.hl7.knowledgeartifact.r2.ResourceRelationshipReference;
import org.hl7.knowledgeartifact.r2.ResourcesType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Relationship Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ResourceRelationshipReferenceImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.ResourceRelationshipReferenceImpl#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceRelationshipReferenceImpl extends MinimalEObjectImpl.Container implements ResourceRelationshipReference {
	/**
	 * The cached value of the '{@link #getRelationship() <em>Relationship</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship()
	 * @generated
	 * @ordered
	 */
	protected RelationshipType relationship;

	/**
	 * The cached value of the '{@link #getResources() <em>Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResources()
	 * @generated
	 * @ordered
	 */
	protected ResourcesType resources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceRelationshipReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R2Package.eINSTANCE.getResourceRelationshipReference();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipType getRelationship() {
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelationship(RelationshipType newRelationship, NotificationChain msgs) {
		RelationshipType oldRelationship = relationship;
		relationship = newRelationship;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.RESOURCE_RELATIONSHIP_REFERENCE__RELATIONSHIP, oldRelationship, newRelationship);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationship(RelationshipType newRelationship) {
		if (newRelationship != relationship) {
			NotificationChain msgs = null;
			if (relationship != null)
				msgs = ((InternalEObject)relationship).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.RESOURCE_RELATIONSHIP_REFERENCE__RELATIONSHIP, null, msgs);
			if (newRelationship != null)
				msgs = ((InternalEObject)newRelationship).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.RESOURCE_RELATIONSHIP_REFERENCE__RELATIONSHIP, null, msgs);
			msgs = basicSetRelationship(newRelationship, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.RESOURCE_RELATIONSHIP_REFERENCE__RELATIONSHIP, newRelationship, newRelationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcesType getResources() {
		return resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResources(ResourcesType newResources, NotificationChain msgs) {
		ResourcesType oldResources = resources;
		resources = newResources;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.RESOURCE_RELATIONSHIP_REFERENCE__RESOURCES, oldResources, newResources);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResources(ResourcesType newResources) {
		if (newResources != resources) {
			NotificationChain msgs = null;
			if (resources != null)
				msgs = ((InternalEObject)resources).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.RESOURCE_RELATIONSHIP_REFERENCE__RESOURCES, null, msgs);
			if (newResources != null)
				msgs = ((InternalEObject)newResources).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.RESOURCE_RELATIONSHIP_REFERENCE__RESOURCES, null, msgs);
			msgs = basicSetResources(newResources, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.RESOURCE_RELATIONSHIP_REFERENCE__RESOURCES, newResources, newResources));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R2Package.RESOURCE_RELATIONSHIP_REFERENCE__RELATIONSHIP:
				return basicSetRelationship(null, msgs);
			case R2Package.RESOURCE_RELATIONSHIP_REFERENCE__RESOURCES:
				return basicSetResources(null, msgs);
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
			case R2Package.RESOURCE_RELATIONSHIP_REFERENCE__RELATIONSHIP:
				return getRelationship();
			case R2Package.RESOURCE_RELATIONSHIP_REFERENCE__RESOURCES:
				return getResources();
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
			case R2Package.RESOURCE_RELATIONSHIP_REFERENCE__RELATIONSHIP:
				setRelationship((RelationshipType)newValue);
				return;
			case R2Package.RESOURCE_RELATIONSHIP_REFERENCE__RESOURCES:
				setResources((ResourcesType)newValue);
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
			case R2Package.RESOURCE_RELATIONSHIP_REFERENCE__RELATIONSHIP:
				setRelationship((RelationshipType)null);
				return;
			case R2Package.RESOURCE_RELATIONSHIP_REFERENCE__RESOURCES:
				setResources((ResourcesType)null);
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
			case R2Package.RESOURCE_RELATIONSHIP_REFERENCE__RELATIONSHIP:
				return relationship != null;
			case R2Package.RESOURCE_RELATIONSHIP_REFERENCE__RESOURCES:
				return resources != null;
		}
		return super.eIsSet(featureID);
	}

} //ResourceRelationshipReferenceImpl
