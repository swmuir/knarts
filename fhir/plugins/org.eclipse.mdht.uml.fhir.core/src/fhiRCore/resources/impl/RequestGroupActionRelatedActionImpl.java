/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Id;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.RequestGroupActionRelatedAction;
import fhiRCore.resources.ResourcesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Request Group Action Related Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.RequestGroupActionRelatedActionImpl#getActionId <em>Action Id</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.RequestGroupActionRelatedActionImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.RequestGroupActionRelatedActionImpl#getOffsetx <em>Offsetx</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequestGroupActionRelatedActionImpl extends BackboneElementImpl implements RequestGroupActionRelatedAction {
	/**
	 * The cached value of the '{@link #getActionId() <em>Action Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionId()
	 * @generated
	 * @ordered
	 */
	protected Id actionId;

	/**
	 * The cached value of the '{@link #getRelationship() <em>Relationship</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship()
	 * @generated
	 * @ordered
	 */
	protected Code relationship;

	/**
	 * The cached value of the '{@link #getOffsetx() <em>Offsetx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffsetx()
	 * @generated
	 * @ordered
	 */
	protected DataType offsetx;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequestGroupActionRelatedActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getRequestGroupActionRelatedAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getActionId() {
		return actionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActionId(Id newActionId, NotificationChain msgs) {
		Id oldActionId = actionId;
		actionId = newActionId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.REQUEST_GROUP_ACTION_RELATED_ACTION__ACTION_ID, oldActionId, newActionId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionId(Id newActionId) {
		if (newActionId != actionId) {
			NotificationChain msgs = null;
			if (actionId != null)
				msgs = ((InternalEObject)actionId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.REQUEST_GROUP_ACTION_RELATED_ACTION__ACTION_ID, null, msgs);
			if (newActionId != null)
				msgs = ((InternalEObject)newActionId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.REQUEST_GROUP_ACTION_RELATED_ACTION__ACTION_ID, null, msgs);
			msgs = basicSetActionId(newActionId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.REQUEST_GROUP_ACTION_RELATED_ACTION__ACTION_ID, newActionId, newActionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getRelationship() {
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelationship(Code newRelationship, NotificationChain msgs) {
		Code oldRelationship = relationship;
		relationship = newRelationship;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.REQUEST_GROUP_ACTION_RELATED_ACTION__RELATIONSHIP, oldRelationship, newRelationship);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationship(Code newRelationship) {
		if (newRelationship != relationship) {
			NotificationChain msgs = null;
			if (relationship != null)
				msgs = ((InternalEObject)relationship).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.REQUEST_GROUP_ACTION_RELATED_ACTION__RELATIONSHIP, null, msgs);
			if (newRelationship != null)
				msgs = ((InternalEObject)newRelationship).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.REQUEST_GROUP_ACTION_RELATED_ACTION__RELATIONSHIP, null, msgs);
			msgs = basicSetRelationship(newRelationship, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.REQUEST_GROUP_ACTION_RELATED_ACTION__RELATIONSHIP, newRelationship, newRelationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getOffsetx() {
		return offsetx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOffsetx(DataType newOffsetx, NotificationChain msgs) {
		DataType oldOffsetx = offsetx;
		offsetx = newOffsetx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.REQUEST_GROUP_ACTION_RELATED_ACTION__OFFSETX, oldOffsetx, newOffsetx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffsetx(DataType newOffsetx) {
		if (newOffsetx != offsetx) {
			NotificationChain msgs = null;
			if (offsetx != null)
				msgs = ((InternalEObject)offsetx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.REQUEST_GROUP_ACTION_RELATED_ACTION__OFFSETX, null, msgs);
			if (newOffsetx != null)
				msgs = ((InternalEObject)newOffsetx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.REQUEST_GROUP_ACTION_RELATED_ACTION__OFFSETX, null, msgs);
			msgs = basicSetOffsetx(newOffsetx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.REQUEST_GROUP_ACTION_RELATED_ACTION__OFFSETX, newOffsetx, newOffsetx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.REQUEST_GROUP_ACTION_RELATED_ACTION__ACTION_ID:
				return basicSetActionId(null, msgs);
			case ResourcesPackage.REQUEST_GROUP_ACTION_RELATED_ACTION__RELATIONSHIP:
				return basicSetRelationship(null, msgs);
			case ResourcesPackage.REQUEST_GROUP_ACTION_RELATED_ACTION__OFFSETX:
				return basicSetOffsetx(null, msgs);
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
			case ResourcesPackage.REQUEST_GROUP_ACTION_RELATED_ACTION__ACTION_ID:
				return getActionId();
			case ResourcesPackage.REQUEST_GROUP_ACTION_RELATED_ACTION__RELATIONSHIP:
				return getRelationship();
			case ResourcesPackage.REQUEST_GROUP_ACTION_RELATED_ACTION__OFFSETX:
				return getOffsetx();
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
			case ResourcesPackage.REQUEST_GROUP_ACTION_RELATED_ACTION__ACTION_ID:
				setActionId((Id)newValue);
				return;
			case ResourcesPackage.REQUEST_GROUP_ACTION_RELATED_ACTION__RELATIONSHIP:
				setRelationship((Code)newValue);
				return;
			case ResourcesPackage.REQUEST_GROUP_ACTION_RELATED_ACTION__OFFSETX:
				setOffsetx((DataType)newValue);
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
			case ResourcesPackage.REQUEST_GROUP_ACTION_RELATED_ACTION__ACTION_ID:
				setActionId((Id)null);
				return;
			case ResourcesPackage.REQUEST_GROUP_ACTION_RELATED_ACTION__RELATIONSHIP:
				setRelationship((Code)null);
				return;
			case ResourcesPackage.REQUEST_GROUP_ACTION_RELATED_ACTION__OFFSETX:
				setOffsetx((DataType)null);
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
			case ResourcesPackage.REQUEST_GROUP_ACTION_RELATED_ACTION__ACTION_ID:
				return actionId != null;
			case ResourcesPackage.REQUEST_GROUP_ACTION_RELATED_ACTION__RELATIONSHIP:
				return relationship != null;
			case ResourcesPackage.REQUEST_GROUP_ACTION_RELATED_ACTION__OFFSETX:
				return offsetx != null;
		}
		return super.eIsSet(featureID);
	}

} //RequestGroupActionRelatedActionImpl
