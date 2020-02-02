/**
 */
package org.hl7.knowledgeartifact.r2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.hl7.knowledgeartifact.r2.ContentSignifier;
import org.hl7.knowledgeartifact.r2.R2Package;
import org.hl7.knowledgeartifact.r2.WrappedContent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wrapped Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.WrappedContentImpl#getContentSignifier <em>Content Signifier</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.WrappedContentImpl#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WrappedContentImpl extends MinimalEObjectImpl.Container implements WrappedContent {
	/**
	 * The cached value of the '{@link #getContentSignifier() <em>Content Signifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentSignifier()
	 * @generated
	 * @ordered
	 */
	protected ContentSignifier contentSignifier;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected EObject content;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WrappedContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R2Package.eINSTANCE.getWrappedContent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentSignifier getContentSignifier() {
		return contentSignifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContentSignifier(ContentSignifier newContentSignifier, NotificationChain msgs) {
		ContentSignifier oldContentSignifier = contentSignifier;
		contentSignifier = newContentSignifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.WRAPPED_CONTENT__CONTENT_SIGNIFIER, oldContentSignifier, newContentSignifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentSignifier(ContentSignifier newContentSignifier) {
		if (newContentSignifier != contentSignifier) {
			NotificationChain msgs = null;
			if (contentSignifier != null)
				msgs = ((InternalEObject)contentSignifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.WRAPPED_CONTENT__CONTENT_SIGNIFIER, null, msgs);
			if (newContentSignifier != null)
				msgs = ((InternalEObject)newContentSignifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.WRAPPED_CONTENT__CONTENT_SIGNIFIER, null, msgs);
			msgs = basicSetContentSignifier(newContentSignifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.WRAPPED_CONTENT__CONTENT_SIGNIFIER, newContentSignifier, newContentSignifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContent(EObject newContent, NotificationChain msgs) {
		EObject oldContent = content;
		content = newContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.WRAPPED_CONTENT__CONTENT, oldContent, newContent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(EObject newContent) {
		if (newContent != content) {
			NotificationChain msgs = null;
			if (content != null)
				msgs = ((InternalEObject)content).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.WRAPPED_CONTENT__CONTENT, null, msgs);
			if (newContent != null)
				msgs = ((InternalEObject)newContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.WRAPPED_CONTENT__CONTENT, null, msgs);
			msgs = basicSetContent(newContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.WRAPPED_CONTENT__CONTENT, newContent, newContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R2Package.WRAPPED_CONTENT__CONTENT_SIGNIFIER:
				return basicSetContentSignifier(null, msgs);
			case R2Package.WRAPPED_CONTENT__CONTENT:
				return basicSetContent(null, msgs);
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
			case R2Package.WRAPPED_CONTENT__CONTENT_SIGNIFIER:
				return getContentSignifier();
			case R2Package.WRAPPED_CONTENT__CONTENT:
				return getContent();
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
			case R2Package.WRAPPED_CONTENT__CONTENT_SIGNIFIER:
				setContentSignifier((ContentSignifier)newValue);
				return;
			case R2Package.WRAPPED_CONTENT__CONTENT:
				setContent((EObject)newValue);
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
			case R2Package.WRAPPED_CONTENT__CONTENT_SIGNIFIER:
				setContentSignifier((ContentSignifier)null);
				return;
			case R2Package.WRAPPED_CONTENT__CONTENT:
				setContent((EObject)null);
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
			case R2Package.WRAPPED_CONTENT__CONTENT_SIGNIFIER:
				return contentSignifier != null;
			case R2Package.WRAPPED_CONTENT__CONTENT:
				return content != null;
		}
		return super.eIsSet(featureID);
	}

} //WrappedContentImpl
