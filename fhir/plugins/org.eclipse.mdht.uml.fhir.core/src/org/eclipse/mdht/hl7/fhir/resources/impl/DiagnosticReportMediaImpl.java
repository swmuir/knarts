/**
 */
package org.eclipse.mdht.hl7.fhir.resources.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.hl7.fhir.dataTypes.Reference;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.DiagnosticReportMedia;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagnostic Report Media</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DiagnosticReportMediaImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.DiagnosticReportMediaImpl#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiagnosticReportMediaImpl extends BackboneElementImpl implements DiagnosticReportMedia {
	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String comment;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected Reference link;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagnosticReportMediaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getDiagnosticReportMedia();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComment(org.eclipse.mdht.hl7.fhir.dataTypes.String newComment, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DIAGNOSTIC_REPORT_MEDIA__COMMENT, oldComment, newComment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComment(org.eclipse.mdht.hl7.fhir.dataTypes.String newComment) {
		if (newComment != comment) {
			NotificationChain msgs = null;
			if (comment != null)
				msgs = ((InternalEObject)comment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DIAGNOSTIC_REPORT_MEDIA__COMMENT, null, msgs);
			if (newComment != null)
				msgs = ((InternalEObject)newComment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DIAGNOSTIC_REPORT_MEDIA__COMMENT, null, msgs);
			msgs = basicSetComment(newComment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DIAGNOSTIC_REPORT_MEDIA__COMMENT, newComment, newComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getLink() {
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLink(Reference newLink, NotificationChain msgs) {
		Reference oldLink = link;
		link = newLink;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.DIAGNOSTIC_REPORT_MEDIA__LINK, oldLink, newLink);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLink(Reference newLink) {
		if (newLink != link) {
			NotificationChain msgs = null;
			if (link != null)
				msgs = ((InternalEObject)link).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DIAGNOSTIC_REPORT_MEDIA__LINK, null, msgs);
			if (newLink != null)
				msgs = ((InternalEObject)newLink).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.DIAGNOSTIC_REPORT_MEDIA__LINK, null, msgs);
			msgs = basicSetLink(newLink, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.DIAGNOSTIC_REPORT_MEDIA__LINK, newLink, newLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.DIAGNOSTIC_REPORT_MEDIA__COMMENT:
				return basicSetComment(null, msgs);
			case ResourcesPackage.DIAGNOSTIC_REPORT_MEDIA__LINK:
				return basicSetLink(null, msgs);
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
			case ResourcesPackage.DIAGNOSTIC_REPORT_MEDIA__COMMENT:
				return getComment();
			case ResourcesPackage.DIAGNOSTIC_REPORT_MEDIA__LINK:
				return getLink();
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
			case ResourcesPackage.DIAGNOSTIC_REPORT_MEDIA__COMMENT:
				setComment((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT_MEDIA__LINK:
				setLink((Reference)newValue);
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
			case ResourcesPackage.DIAGNOSTIC_REPORT_MEDIA__COMMENT:
				setComment((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.DIAGNOSTIC_REPORT_MEDIA__LINK:
				setLink((Reference)null);
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
			case ResourcesPackage.DIAGNOSTIC_REPORT_MEDIA__COMMENT:
				return comment != null;
			case ResourcesPackage.DIAGNOSTIC_REPORT_MEDIA__LINK:
				return link != null;
		}
		return super.eIsSet(featureID);
	}

} //DiagnosticReportMediaImpl
