/**
 */
package org.hl7.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.fhir.Code;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.GuidePageKind;
import org.hl7.fhir.ImplementationGuideInputPage;
import org.hl7.fhir.Reference;
import org.hl7.fhir.ResourceType;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation Guide Input Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideInputPageImpl#getSourceUri <em>Source Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideInputPageImpl#getSourceReference <em>Source Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideInputPageImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideInputPageImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideInputPageImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideInputPageImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideInputPageImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ImplementationGuideInputPageImpl#getPage <em>Page</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImplementationGuideInputPageImpl extends BackboneElementImpl implements ImplementationGuideInputPage {
	/**
	 * The cached value of the '{@link #getSourceUri() <em>Source Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceUri()
	 * @generated
	 * @ordered
	 */
	protected Uri sourceUri;

	/**
	 * The cached value of the '{@link #getSourceReference() <em>Source Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceReference()
	 * @generated
	 * @ordered
	 */
	protected Reference sourceReference;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String title;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected GuidePageKind kind;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceType> type;

	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<org.hl7.fhir.String> package_;

	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected Code format;

	/**
	 * The cached value of the '{@link #getPage() <em>Page</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPage()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplementationGuideInputPage> page;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImplementationGuideInputPageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getImplementationGuideInputPage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getSourceUri() {
		return sourceUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceUri(Uri newSourceUri, NotificationChain msgs) {
		Uri oldSourceUri = sourceUri;
		sourceUri = newSourceUri;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__SOURCE_URI, oldSourceUri, newSourceUri);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceUri(Uri newSourceUri) {
		if (newSourceUri != sourceUri) {
			NotificationChain msgs = null;
			if (sourceUri != null)
				msgs = ((InternalEObject)sourceUri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__SOURCE_URI, null, msgs);
			if (newSourceUri != null)
				msgs = ((InternalEObject)newSourceUri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__SOURCE_URI, null, msgs);
			msgs = basicSetSourceUri(newSourceUri, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__SOURCE_URI, newSourceUri, newSourceUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getSourceReference() {
		return sourceReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceReference(Reference newSourceReference, NotificationChain msgs) {
		Reference oldSourceReference = sourceReference;
		sourceReference = newSourceReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__SOURCE_REFERENCE, oldSourceReference, newSourceReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceReference(Reference newSourceReference) {
		if (newSourceReference != sourceReference) {
			NotificationChain msgs = null;
			if (sourceReference != null)
				msgs = ((InternalEObject)sourceReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__SOURCE_REFERENCE, null, msgs);
			if (newSourceReference != null)
				msgs = ((InternalEObject)newSourceReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__SOURCE_REFERENCE, null, msgs);
			msgs = basicSetSourceReference(newSourceReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__SOURCE_REFERENCE, newSourceReference, newSourceReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(org.hl7.fhir.String newTitle, NotificationChain msgs) {
		org.hl7.fhir.String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__TITLE, oldTitle, newTitle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(org.hl7.fhir.String newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuidePageKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKind(GuidePageKind newKind, NotificationChain msgs) {
		GuidePageKind oldKind = kind;
		kind = newKind;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__KIND, oldKind, newKind);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(GuidePageKind newKind) {
		if (newKind != kind) {
			NotificationChain msgs = null;
			if (kind != null)
				msgs = ((InternalEObject)kind).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__KIND, null, msgs);
			if (newKind != null)
				msgs = ((InternalEObject)newKind).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__KIND, null, msgs);
			msgs = basicSetKind(newKind, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__KIND, newKind, newKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceType> getType() {
		if (type == null) {
			type = new EObjectContainmentEList<ResourceType>(ResourceType.class, this, FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.hl7.fhir.String> getPackage() {
		if (package_ == null) {
			package_ = new EObjectContainmentEList<org.hl7.fhir.String>(org.hl7.fhir.String.class, this, FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__PACKAGE);
		}
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getFormat() {
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormat(Code newFormat, NotificationChain msgs) {
		Code oldFormat = format;
		format = newFormat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__FORMAT, oldFormat, newFormat);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormat(Code newFormat) {
		if (newFormat != format) {
			NotificationChain msgs = null;
			if (format != null)
				msgs = ((InternalEObject)format).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__FORMAT, null, msgs);
			if (newFormat != null)
				msgs = ((InternalEObject)newFormat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__FORMAT, null, msgs);
			msgs = basicSetFormat(newFormat, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__FORMAT, newFormat, newFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImplementationGuideInputPage> getPage() {
		if (page == null) {
			page = new EObjectContainmentEList<ImplementationGuideInputPage>(ImplementationGuideInputPage.class, this, FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__PAGE);
		}
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__SOURCE_URI:
				return basicSetSourceUri(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__SOURCE_REFERENCE:
				return basicSetSourceReference(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__TITLE:
				return basicSetTitle(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__KIND:
				return basicSetKind(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__TYPE:
				return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__PACKAGE:
				return ((InternalEList<?>)getPackage()).basicRemove(otherEnd, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__FORMAT:
				return basicSetFormat(null, msgs);
			case FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__PAGE:
				return ((InternalEList<?>)getPage()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__SOURCE_URI:
				return getSourceUri();
			case FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__SOURCE_REFERENCE:
				return getSourceReference();
			case FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__TITLE:
				return getTitle();
			case FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__KIND:
				return getKind();
			case FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__TYPE:
				return getType();
			case FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__PACKAGE:
				return getPackage();
			case FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__FORMAT:
				return getFormat();
			case FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__PAGE:
				return getPage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__SOURCE_URI:
				setSourceUri((Uri)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__SOURCE_REFERENCE:
				setSourceReference((Reference)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__TITLE:
				setTitle((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__KIND:
				setKind((GuidePageKind)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends ResourceType>)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__PACKAGE:
				getPackage().clear();
				getPackage().addAll((Collection<? extends org.hl7.fhir.String>)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__FORMAT:
				setFormat((Code)newValue);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__PAGE:
				getPage().clear();
				getPage().addAll((Collection<? extends ImplementationGuideInputPage>)newValue);
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
			case FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__SOURCE_URI:
				setSourceUri((Uri)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__SOURCE_REFERENCE:
				setSourceReference((Reference)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__TITLE:
				setTitle((org.hl7.fhir.String)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__KIND:
				setKind((GuidePageKind)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__TYPE:
				getType().clear();
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__PACKAGE:
				getPackage().clear();
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__FORMAT:
				setFormat((Code)null);
				return;
			case FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__PAGE:
				getPage().clear();
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
			case FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__SOURCE_URI:
				return sourceUri != null;
			case FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__SOURCE_REFERENCE:
				return sourceReference != null;
			case FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__TITLE:
				return title != null;
			case FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__KIND:
				return kind != null;
			case FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__TYPE:
				return type != null && !type.isEmpty();
			case FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__PACKAGE:
				return package_ != null && !package_.isEmpty();
			case FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__FORMAT:
				return format != null;
			case FhirPackage.IMPLEMENTATION_GUIDE_INPUT_PAGE__PAGE:
				return page != null && !page.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ImplementationGuideInputPageImpl
