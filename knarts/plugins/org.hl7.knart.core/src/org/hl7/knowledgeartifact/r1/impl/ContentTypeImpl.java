/**
 */
package org.hl7.knowledgeartifact.r1.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.hl7.knowledgeartifact.r1.ContentType;
import org.hl7.knowledgeartifact.r1.R1Package;

import org.w3._1999.xhtml.DivType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.ContentTypeImpl#getDiv <em>Div</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContentTypeImpl extends MinimalEObjectImpl.Container implements ContentType {
	/**
	 * The cached value of the '{@link #getDiv() <em>Div</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiv()
	 * @generated
	 * @ordered
	 */
	protected DivType div;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R1Package.Literals.CONTENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DivType getDiv() {
		return div;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiv(DivType newDiv, NotificationChain msgs) {
		DivType oldDiv = div;
		div = newDiv;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.CONTENT_TYPE__DIV, oldDiv, newDiv);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiv(DivType newDiv) {
		if (newDiv != div) {
			NotificationChain msgs = null;
			if (div != null)
				msgs = ((InternalEObject)div).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.CONTENT_TYPE__DIV, null, msgs);
			if (newDiv != null)
				msgs = ((InternalEObject)newDiv).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.CONTENT_TYPE__DIV, null, msgs);
			msgs = basicSetDiv(newDiv, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.CONTENT_TYPE__DIV, newDiv, newDiv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R1Package.CONTENT_TYPE__DIV:
				return basicSetDiv(null, msgs);
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
			case R1Package.CONTENT_TYPE__DIV:
				return getDiv();
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
			case R1Package.CONTENT_TYPE__DIV:
				setDiv((DivType)newValue);
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
			case R1Package.CONTENT_TYPE__DIV:
				setDiv((DivType)null);
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
			case R1Package.CONTENT_TYPE__DIV:
				return div != null;
		}
		return super.eIsSet(featureID);
	}

} //ContentTypeImpl
