/**
 */
package fhiRCore.dataTypes.impl;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.DataTypesPackage;
import fhiRCore.dataTypes.ElementDefinitionElement7;
import fhiRCore.dataTypes.Id;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Definition Element7</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.dataTypes.impl.ElementDefinitionElement7Impl#getIdentity <em>Identity</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.ElementDefinitionElement7Impl#getLanguage <em>Language</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.ElementDefinitionElement7Impl#getMap <em>Map</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.ElementDefinitionElement7Impl#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementDefinitionElement7Impl extends ElementImpl implements ElementDefinitionElement7 {
	/**
	 * The cached value of the '{@link #getIdentity() <em>Identity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentity()
	 * @generated
	 * @ordered
	 */
	protected Id identity;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected Code language;

	/**
	 * The cached value of the '{@link #getMap() <em>Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMap()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String map;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String comment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementDefinitionElement7Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataTypesPackage.Literals.ELEMENT_DEFINITION_ELEMENT7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getIdentity() {
		return identity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentity(Id newIdentity, NotificationChain msgs) {
		Id oldIdentity = identity;
		identity = newIdentity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT7__IDENTITY, oldIdentity, newIdentity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentity(Id newIdentity) {
		if (newIdentity != identity) {
			NotificationChain msgs = null;
			if (identity != null)
				msgs = ((InternalEObject)identity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION_ELEMENT7__IDENTITY, null, msgs);
			if (newIdentity != null)
				msgs = ((InternalEObject)newIdentity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION_ELEMENT7__IDENTITY, null, msgs);
			msgs = basicSetIdentity(newIdentity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT7__IDENTITY, newIdentity, newIdentity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLanguage(Code newLanguage, NotificationChain msgs) {
		Code oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT7__LANGUAGE, oldLanguage, newLanguage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguage(Code newLanguage) {
		if (newLanguage != language) {
			NotificationChain msgs = null;
			if (language != null)
				msgs = ((InternalEObject)language).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION_ELEMENT7__LANGUAGE, null, msgs);
			if (newLanguage != null)
				msgs = ((InternalEObject)newLanguage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION_ELEMENT7__LANGUAGE, null, msgs);
			msgs = basicSetLanguage(newLanguage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT7__LANGUAGE, newLanguage, newLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getMap() {
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMap(fhiRCore.dataTypes.String newMap, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldMap = map;
		map = newMap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT7__MAP, oldMap, newMap);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMap(fhiRCore.dataTypes.String newMap) {
		if (newMap != map) {
			NotificationChain msgs = null;
			if (map != null)
				msgs = ((InternalEObject)map).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION_ELEMENT7__MAP, null, msgs);
			if (newMap != null)
				msgs = ((InternalEObject)newMap).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION_ELEMENT7__MAP, null, msgs);
			msgs = basicSetMap(newMap, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT7__MAP, newMap, newMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComment(fhiRCore.dataTypes.String newComment, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT7__COMMENT, oldComment, newComment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(fhiRCore.dataTypes.String newComment) {
		if (newComment != comment) {
			NotificationChain msgs = null;
			if (comment != null)
				msgs = ((InternalEObject)comment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION_ELEMENT7__COMMENT, null, msgs);
			if (newComment != null)
				msgs = ((InternalEObject)newComment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION_ELEMENT7__COMMENT, null, msgs);
			msgs = basicSetComment(newComment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT7__COMMENT, newComment, newComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT7__IDENTITY:
				return basicSetIdentity(null, msgs);
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT7__LANGUAGE:
				return basicSetLanguage(null, msgs);
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT7__MAP:
				return basicSetMap(null, msgs);
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT7__COMMENT:
				return basicSetComment(null, msgs);
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
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT7__IDENTITY:
				return getIdentity();
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT7__LANGUAGE:
				return getLanguage();
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT7__MAP:
				return getMap();
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT7__COMMENT:
				return getComment();
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
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT7__IDENTITY:
				setIdentity((Id)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT7__LANGUAGE:
				setLanguage((Code)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT7__MAP:
				setMap((fhiRCore.dataTypes.String)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT7__COMMENT:
				setComment((fhiRCore.dataTypes.String)newValue);
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
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT7__IDENTITY:
				setIdentity((Id)null);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT7__LANGUAGE:
				setLanguage((Code)null);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT7__MAP:
				setMap((fhiRCore.dataTypes.String)null);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT7__COMMENT:
				setComment((fhiRCore.dataTypes.String)null);
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
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT7__IDENTITY:
				return identity != null;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT7__LANGUAGE:
				return language != null;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT7__MAP:
				return map != null;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT7__COMMENT:
				return comment != null;
		}
		return super.eIsSet(featureID);
	}

} //ElementDefinitionElement7Impl
