/**
 */
package fhiRCore.dataTypes.impl;

import fhiRCore.dataTypes.Annotation;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.DataTypesPackage;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Markdown;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.dataTypes.impl.AnnotationImpl#getAuthorx <em>Authorx</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.AnnotationImpl#getTime <em>Time</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.AnnotationImpl#getText <em>Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotationImpl extends DataTypeImpl implements Annotation {
	/**
	 * The cached value of the '{@link #getAuthorx() <em>Authorx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorx()
	 * @generated
	 * @ordered
	 */
	protected DataType authorx;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected DateTime time;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected Markdown text;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataTypesPackage.Literals.ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getAuthorx() {
		return authorx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthorx(DataType newAuthorx, NotificationChain msgs) {
		DataType oldAuthorx = authorx;
		authorx = newAuthorx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ANNOTATION__AUTHORX, oldAuthorx, newAuthorx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthorx(DataType newAuthorx) {
		if (newAuthorx != authorx) {
			NotificationChain msgs = null;
			if (authorx != null)
				msgs = ((InternalEObject)authorx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ANNOTATION__AUTHORX, null, msgs);
			if (newAuthorx != null)
				msgs = ((InternalEObject)newAuthorx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ANNOTATION__AUTHORX, null, msgs);
			msgs = basicSetAuthorx(newAuthorx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ANNOTATION__AUTHORX, newAuthorx, newAuthorx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTime(DateTime newTime, NotificationChain msgs) {
		DateTime oldTime = time;
		time = newTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ANNOTATION__TIME, oldTime, newTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(DateTime newTime) {
		if (newTime != time) {
			NotificationChain msgs = null;
			if (time != null)
				msgs = ((InternalEObject)time).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ANNOTATION__TIME, null, msgs);
			if (newTime != null)
				msgs = ((InternalEObject)newTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ANNOTATION__TIME, null, msgs);
			msgs = basicSetTime(newTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ANNOTATION__TIME, newTime, newTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetText(Markdown newText, NotificationChain msgs) {
		Markdown oldText = text;
		text = newText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ANNOTATION__TEXT, oldText, newText);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(Markdown newText) {
		if (newText != text) {
			NotificationChain msgs = null;
			if (text != null)
				msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ANNOTATION__TEXT, null, msgs);
			if (newText != null)
				msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ANNOTATION__TEXT, null, msgs);
			msgs = basicSetText(newText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ANNOTATION__TEXT, newText, newText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataTypesPackage.ANNOTATION__AUTHORX:
				return basicSetAuthorx(null, msgs);
			case DataTypesPackage.ANNOTATION__TIME:
				return basicSetTime(null, msgs);
			case DataTypesPackage.ANNOTATION__TEXT:
				return basicSetText(null, msgs);
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
			case DataTypesPackage.ANNOTATION__AUTHORX:
				return getAuthorx();
			case DataTypesPackage.ANNOTATION__TIME:
				return getTime();
			case DataTypesPackage.ANNOTATION__TEXT:
				return getText();
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
			case DataTypesPackage.ANNOTATION__AUTHORX:
				setAuthorx((DataType)newValue);
				return;
			case DataTypesPackage.ANNOTATION__TIME:
				setTime((DateTime)newValue);
				return;
			case DataTypesPackage.ANNOTATION__TEXT:
				setText((Markdown)newValue);
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
			case DataTypesPackage.ANNOTATION__AUTHORX:
				setAuthorx((DataType)null);
				return;
			case DataTypesPackage.ANNOTATION__TIME:
				setTime((DateTime)null);
				return;
			case DataTypesPackage.ANNOTATION__TEXT:
				setText((Markdown)null);
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
			case DataTypesPackage.ANNOTATION__AUTHORX:
				return authorx != null;
			case DataTypesPackage.ANNOTATION__TIME:
				return time != null;
			case DataTypesPackage.ANNOTATION__TEXT:
				return text != null;
		}
		return super.eIsSet(featureID);
	}

} //AnnotationImpl
