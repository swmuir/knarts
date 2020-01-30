/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Uri;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.ImmunizationEducation;
import fhiRCore.resources.ResourcesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Immunization Education</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationEducationImpl#getDocumentType <em>Document Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationEducationImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationEducationImpl#getPublicationDate <em>Publication Date</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ImmunizationEducationImpl#getPresentationDate <em>Presentation Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImmunizationEducationImpl extends BackboneElementImpl implements ImmunizationEducation {
	/**
	 * The cached value of the '{@link #getDocumentType() <em>Document Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentType()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String documentType;

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected Uri reference;

	/**
	 * The cached value of the '{@link #getPublicationDate() <em>Publication Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicationDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime publicationDate;

	/**
	 * The cached value of the '{@link #getPresentationDate() <em>Presentation Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentationDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime presentationDate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImmunizationEducationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getImmunizationEducation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getDocumentType() {
		return documentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentType(fhiRCore.dataTypes.String newDocumentType, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldDocumentType = documentType;
		documentType = newDocumentType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_EDUCATION__DOCUMENT_TYPE, oldDocumentType, newDocumentType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentType(fhiRCore.dataTypes.String newDocumentType) {
		if (newDocumentType != documentType) {
			NotificationChain msgs = null;
			if (documentType != null)
				msgs = ((InternalEObject)documentType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION_EDUCATION__DOCUMENT_TYPE, null, msgs);
			if (newDocumentType != null)
				msgs = ((InternalEObject)newDocumentType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION_EDUCATION__DOCUMENT_TYPE, null, msgs);
			msgs = basicSetDocumentType(newDocumentType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_EDUCATION__DOCUMENT_TYPE, newDocumentType, newDocumentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getReference() {
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReference(Uri newReference, NotificationChain msgs) {
		Uri oldReference = reference;
		reference = newReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_EDUCATION__REFERENCE, oldReference, newReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReference(Uri newReference) {
		if (newReference != reference) {
			NotificationChain msgs = null;
			if (reference != null)
				msgs = ((InternalEObject)reference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION_EDUCATION__REFERENCE, null, msgs);
			if (newReference != null)
				msgs = ((InternalEObject)newReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION_EDUCATION__REFERENCE, null, msgs);
			msgs = basicSetReference(newReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_EDUCATION__REFERENCE, newReference, newReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getPublicationDate() {
		return publicationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublicationDate(DateTime newPublicationDate, NotificationChain msgs) {
		DateTime oldPublicationDate = publicationDate;
		publicationDate = newPublicationDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_EDUCATION__PUBLICATION_DATE, oldPublicationDate, newPublicationDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublicationDate(DateTime newPublicationDate) {
		if (newPublicationDate != publicationDate) {
			NotificationChain msgs = null;
			if (publicationDate != null)
				msgs = ((InternalEObject)publicationDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION_EDUCATION__PUBLICATION_DATE, null, msgs);
			if (newPublicationDate != null)
				msgs = ((InternalEObject)newPublicationDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION_EDUCATION__PUBLICATION_DATE, null, msgs);
			msgs = basicSetPublicationDate(newPublicationDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_EDUCATION__PUBLICATION_DATE, newPublicationDate, newPublicationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getPresentationDate() {
		return presentationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPresentationDate(DateTime newPresentationDate, NotificationChain msgs) {
		DateTime oldPresentationDate = presentationDate;
		presentationDate = newPresentationDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_EDUCATION__PRESENTATION_DATE, oldPresentationDate, newPresentationDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresentationDate(DateTime newPresentationDate) {
		if (newPresentationDate != presentationDate) {
			NotificationChain msgs = null;
			if (presentationDate != null)
				msgs = ((InternalEObject)presentationDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION_EDUCATION__PRESENTATION_DATE, null, msgs);
			if (newPresentationDate != null)
				msgs = ((InternalEObject)newPresentationDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.IMMUNIZATION_EDUCATION__PRESENTATION_DATE, null, msgs);
			msgs = basicSetPresentationDate(newPresentationDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.IMMUNIZATION_EDUCATION__PRESENTATION_DATE, newPresentationDate, newPresentationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.IMMUNIZATION_EDUCATION__DOCUMENT_TYPE:
				return basicSetDocumentType(null, msgs);
			case ResourcesPackage.IMMUNIZATION_EDUCATION__REFERENCE:
				return basicSetReference(null, msgs);
			case ResourcesPackage.IMMUNIZATION_EDUCATION__PUBLICATION_DATE:
				return basicSetPublicationDate(null, msgs);
			case ResourcesPackage.IMMUNIZATION_EDUCATION__PRESENTATION_DATE:
				return basicSetPresentationDate(null, msgs);
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
			case ResourcesPackage.IMMUNIZATION_EDUCATION__DOCUMENT_TYPE:
				return getDocumentType();
			case ResourcesPackage.IMMUNIZATION_EDUCATION__REFERENCE:
				return getReference();
			case ResourcesPackage.IMMUNIZATION_EDUCATION__PUBLICATION_DATE:
				return getPublicationDate();
			case ResourcesPackage.IMMUNIZATION_EDUCATION__PRESENTATION_DATE:
				return getPresentationDate();
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
			case ResourcesPackage.IMMUNIZATION_EDUCATION__DOCUMENT_TYPE:
				setDocumentType((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION_EDUCATION__REFERENCE:
				setReference((Uri)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION_EDUCATION__PUBLICATION_DATE:
				setPublicationDate((DateTime)newValue);
				return;
			case ResourcesPackage.IMMUNIZATION_EDUCATION__PRESENTATION_DATE:
				setPresentationDate((DateTime)newValue);
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
			case ResourcesPackage.IMMUNIZATION_EDUCATION__DOCUMENT_TYPE:
				setDocumentType((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.IMMUNIZATION_EDUCATION__REFERENCE:
				setReference((Uri)null);
				return;
			case ResourcesPackage.IMMUNIZATION_EDUCATION__PUBLICATION_DATE:
				setPublicationDate((DateTime)null);
				return;
			case ResourcesPackage.IMMUNIZATION_EDUCATION__PRESENTATION_DATE:
				setPresentationDate((DateTime)null);
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
			case ResourcesPackage.IMMUNIZATION_EDUCATION__DOCUMENT_TYPE:
				return documentType != null;
			case ResourcesPackage.IMMUNIZATION_EDUCATION__REFERENCE:
				return reference != null;
			case ResourcesPackage.IMMUNIZATION_EDUCATION__PUBLICATION_DATE:
				return publicationDate != null;
			case ResourcesPackage.IMMUNIZATION_EDUCATION__PRESENTATION_DATE:
				return presentationDate != null;
		}
		return super.eIsSet(featureID);
	}

} //ImmunizationEducationImpl
