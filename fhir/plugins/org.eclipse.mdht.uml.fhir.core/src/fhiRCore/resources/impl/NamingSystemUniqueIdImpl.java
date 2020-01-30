/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.Period;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.NamingSystemUniqueId;
import fhiRCore.resources.ResourcesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Naming System Unique Id</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.NamingSystemUniqueIdImpl#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.NamingSystemUniqueIdImpl#getValue <em>Value</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.NamingSystemUniqueIdImpl#getPreferred <em>Preferred</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.NamingSystemUniqueIdImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.NamingSystemUniqueIdImpl#getPeriod <em>Period</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NamingSystemUniqueIdImpl extends BackboneElementImpl implements NamingSystemUniqueId {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Code type;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String value;

	/**
	 * The cached value of the '{@link #getPreferred() <em>Preferred</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferred()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Boolean preferred;

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
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period period;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamingSystemUniqueIdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getNamingSystemUniqueId();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Code newType, NotificationChain msgs) {
		Code oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.NAMING_SYSTEM_UNIQUE_ID__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Code newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.NAMING_SYSTEM_UNIQUE_ID__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.NAMING_SYSTEM_UNIQUE_ID__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.NAMING_SYSTEM_UNIQUE_ID__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(fhiRCore.dataTypes.String newValue, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.NAMING_SYSTEM_UNIQUE_ID__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(fhiRCore.dataTypes.String newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.NAMING_SYSTEM_UNIQUE_ID__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.NAMING_SYSTEM_UNIQUE_ID__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.NAMING_SYSTEM_UNIQUE_ID__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Boolean getPreferred() {
		return preferred;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreferred(fhiRCore.dataTypes.Boolean newPreferred, NotificationChain msgs) {
		fhiRCore.dataTypes.Boolean oldPreferred = preferred;
		preferred = newPreferred;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.NAMING_SYSTEM_UNIQUE_ID__PREFERRED, oldPreferred, newPreferred);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreferred(fhiRCore.dataTypes.Boolean newPreferred) {
		if (newPreferred != preferred) {
			NotificationChain msgs = null;
			if (preferred != null)
				msgs = ((InternalEObject)preferred).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.NAMING_SYSTEM_UNIQUE_ID__PREFERRED, null, msgs);
			if (newPreferred != null)
				msgs = ((InternalEObject)newPreferred).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.NAMING_SYSTEM_UNIQUE_ID__PREFERRED, null, msgs);
			msgs = basicSetPreferred(newPreferred, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.NAMING_SYSTEM_UNIQUE_ID__PREFERRED, newPreferred, newPreferred));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.NAMING_SYSTEM_UNIQUE_ID__COMMENT, oldComment, newComment);
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
				msgs = ((InternalEObject)comment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.NAMING_SYSTEM_UNIQUE_ID__COMMENT, null, msgs);
			if (newComment != null)
				msgs = ((InternalEObject)newComment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.NAMING_SYSTEM_UNIQUE_ID__COMMENT, null, msgs);
			msgs = basicSetComment(newComment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.NAMING_SYSTEM_UNIQUE_ID__COMMENT, newComment, newComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriod(Period newPeriod, NotificationChain msgs) {
		Period oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.NAMING_SYSTEM_UNIQUE_ID__PERIOD, oldPeriod, newPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(Period newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.NAMING_SYSTEM_UNIQUE_ID__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.NAMING_SYSTEM_UNIQUE_ID__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.NAMING_SYSTEM_UNIQUE_ID__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.NAMING_SYSTEM_UNIQUE_ID__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.NAMING_SYSTEM_UNIQUE_ID__VALUE:
				return basicSetValue(null, msgs);
			case ResourcesPackage.NAMING_SYSTEM_UNIQUE_ID__PREFERRED:
				return basicSetPreferred(null, msgs);
			case ResourcesPackage.NAMING_SYSTEM_UNIQUE_ID__COMMENT:
				return basicSetComment(null, msgs);
			case ResourcesPackage.NAMING_SYSTEM_UNIQUE_ID__PERIOD:
				return basicSetPeriod(null, msgs);
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
			case ResourcesPackage.NAMING_SYSTEM_UNIQUE_ID__TYPE:
				return getType();
			case ResourcesPackage.NAMING_SYSTEM_UNIQUE_ID__VALUE:
				return getValue();
			case ResourcesPackage.NAMING_SYSTEM_UNIQUE_ID__PREFERRED:
				return getPreferred();
			case ResourcesPackage.NAMING_SYSTEM_UNIQUE_ID__COMMENT:
				return getComment();
			case ResourcesPackage.NAMING_SYSTEM_UNIQUE_ID__PERIOD:
				return getPeriod();
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
			case ResourcesPackage.NAMING_SYSTEM_UNIQUE_ID__TYPE:
				setType((Code)newValue);
				return;
			case ResourcesPackage.NAMING_SYSTEM_UNIQUE_ID__VALUE:
				setValue((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.NAMING_SYSTEM_UNIQUE_ID__PREFERRED:
				setPreferred((fhiRCore.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.NAMING_SYSTEM_UNIQUE_ID__COMMENT:
				setComment((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.NAMING_SYSTEM_UNIQUE_ID__PERIOD:
				setPeriod((Period)newValue);
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
			case ResourcesPackage.NAMING_SYSTEM_UNIQUE_ID__TYPE:
				setType((Code)null);
				return;
			case ResourcesPackage.NAMING_SYSTEM_UNIQUE_ID__VALUE:
				setValue((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.NAMING_SYSTEM_UNIQUE_ID__PREFERRED:
				setPreferred((fhiRCore.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.NAMING_SYSTEM_UNIQUE_ID__COMMENT:
				setComment((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.NAMING_SYSTEM_UNIQUE_ID__PERIOD:
				setPeriod((Period)null);
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
			case ResourcesPackage.NAMING_SYSTEM_UNIQUE_ID__TYPE:
				return type != null;
			case ResourcesPackage.NAMING_SYSTEM_UNIQUE_ID__VALUE:
				return value != null;
			case ResourcesPackage.NAMING_SYSTEM_UNIQUE_ID__PREFERRED:
				return preferred != null;
			case ResourcesPackage.NAMING_SYSTEM_UNIQUE_ID__COMMENT:
				return comment != null;
			case ResourcesPackage.NAMING_SYSTEM_UNIQUE_ID__PERIOD:
				return period != null;
		}
		return super.eIsSet(featureID);
	}

} //NamingSystemUniqueIdImpl
