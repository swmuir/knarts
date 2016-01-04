/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.SequenceRepository;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.SequenceRepositoryImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceRepositoryImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceRepositoryImpl#getStructure <em>Structure</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceRepositoryImpl#getVariantId <em>Variant Id</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.SequenceRepositoryImpl#getReadGroupSetId <em>Read Group Set Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SequenceRepositoryImpl extends BackboneElementImpl implements SequenceRepository {
	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected Uri url;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String name;

	/**
	 * The cached value of the '{@link #getStructure() <em>Structure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructure()
	 * @generated
	 * @ordered
	 */
	protected Uri structure;

	/**
	 * The cached value of the '{@link #getVariantId() <em>Variant Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariantId()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String variantId;

	/**
	 * The cached value of the '{@link #getReadGroupSetId() <em>Read Group Set Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadGroupSetId()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String readGroupSetId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getSequenceRepository();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUrl(Uri newUrl, NotificationChain msgs) {
		Uri oldUrl = url;
		url = newUrl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_REPOSITORY__URL, oldUrl, newUrl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(Uri newUrl) {
		if (newUrl != url) {
			NotificationChain msgs = null;
			if (url != null)
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_REPOSITORY__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_REPOSITORY__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_REPOSITORY__URL, newUrl, newUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(org.hl7.fhir.String newName, NotificationChain msgs) {
		org.hl7.fhir.String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_REPOSITORY__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(org.hl7.fhir.String newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_REPOSITORY__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_REPOSITORY__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_REPOSITORY__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getStructure() {
		return structure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructure(Uri newStructure, NotificationChain msgs) {
		Uri oldStructure = structure;
		structure = newStructure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_REPOSITORY__STRUCTURE, oldStructure, newStructure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructure(Uri newStructure) {
		if (newStructure != structure) {
			NotificationChain msgs = null;
			if (structure != null)
				msgs = ((InternalEObject)structure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_REPOSITORY__STRUCTURE, null, msgs);
			if (newStructure != null)
				msgs = ((InternalEObject)newStructure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_REPOSITORY__STRUCTURE, null, msgs);
			msgs = basicSetStructure(newStructure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_REPOSITORY__STRUCTURE, newStructure, newStructure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getVariantId() {
		return variantId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariantId(org.hl7.fhir.String newVariantId, NotificationChain msgs) {
		org.hl7.fhir.String oldVariantId = variantId;
		variantId = newVariantId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_REPOSITORY__VARIANT_ID, oldVariantId, newVariantId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariantId(org.hl7.fhir.String newVariantId) {
		if (newVariantId != variantId) {
			NotificationChain msgs = null;
			if (variantId != null)
				msgs = ((InternalEObject)variantId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_REPOSITORY__VARIANT_ID, null, msgs);
			if (newVariantId != null)
				msgs = ((InternalEObject)newVariantId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_REPOSITORY__VARIANT_ID, null, msgs);
			msgs = basicSetVariantId(newVariantId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_REPOSITORY__VARIANT_ID, newVariantId, newVariantId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getReadGroupSetId() {
		return readGroupSetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReadGroupSetId(org.hl7.fhir.String newReadGroupSetId, NotificationChain msgs) {
		org.hl7.fhir.String oldReadGroupSetId = readGroupSetId;
		readGroupSetId = newReadGroupSetId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_REPOSITORY__READ_GROUP_SET_ID, oldReadGroupSetId, newReadGroupSetId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadGroupSetId(org.hl7.fhir.String newReadGroupSetId) {
		if (newReadGroupSetId != readGroupSetId) {
			NotificationChain msgs = null;
			if (readGroupSetId != null)
				msgs = ((InternalEObject)readGroupSetId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_REPOSITORY__READ_GROUP_SET_ID, null, msgs);
			if (newReadGroupSetId != null)
				msgs = ((InternalEObject)newReadGroupSetId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.SEQUENCE_REPOSITORY__READ_GROUP_SET_ID, null, msgs);
			msgs = basicSetReadGroupSetId(newReadGroupSetId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.SEQUENCE_REPOSITORY__READ_GROUP_SET_ID, newReadGroupSetId, newReadGroupSetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.SEQUENCE_REPOSITORY__URL:
				return basicSetUrl(null, msgs);
			case FhirPackage.SEQUENCE_REPOSITORY__NAME:
				return basicSetName(null, msgs);
			case FhirPackage.SEQUENCE_REPOSITORY__STRUCTURE:
				return basicSetStructure(null, msgs);
			case FhirPackage.SEQUENCE_REPOSITORY__VARIANT_ID:
				return basicSetVariantId(null, msgs);
			case FhirPackage.SEQUENCE_REPOSITORY__READ_GROUP_SET_ID:
				return basicSetReadGroupSetId(null, msgs);
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
			case FhirPackage.SEQUENCE_REPOSITORY__URL:
				return getUrl();
			case FhirPackage.SEQUENCE_REPOSITORY__NAME:
				return getName();
			case FhirPackage.SEQUENCE_REPOSITORY__STRUCTURE:
				return getStructure();
			case FhirPackage.SEQUENCE_REPOSITORY__VARIANT_ID:
				return getVariantId();
			case FhirPackage.SEQUENCE_REPOSITORY__READ_GROUP_SET_ID:
				return getReadGroupSetId();
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
			case FhirPackage.SEQUENCE_REPOSITORY__URL:
				setUrl((Uri)newValue);
				return;
			case FhirPackage.SEQUENCE_REPOSITORY__NAME:
				setName((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SEQUENCE_REPOSITORY__STRUCTURE:
				setStructure((Uri)newValue);
				return;
			case FhirPackage.SEQUENCE_REPOSITORY__VARIANT_ID:
				setVariantId((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.SEQUENCE_REPOSITORY__READ_GROUP_SET_ID:
				setReadGroupSetId((org.hl7.fhir.String)newValue);
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
			case FhirPackage.SEQUENCE_REPOSITORY__URL:
				setUrl((Uri)null);
				return;
			case FhirPackage.SEQUENCE_REPOSITORY__NAME:
				setName((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SEQUENCE_REPOSITORY__STRUCTURE:
				setStructure((Uri)null);
				return;
			case FhirPackage.SEQUENCE_REPOSITORY__VARIANT_ID:
				setVariantId((org.hl7.fhir.String)null);
				return;
			case FhirPackage.SEQUENCE_REPOSITORY__READ_GROUP_SET_ID:
				setReadGroupSetId((org.hl7.fhir.String)null);
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
			case FhirPackage.SEQUENCE_REPOSITORY__URL:
				return url != null;
			case FhirPackage.SEQUENCE_REPOSITORY__NAME:
				return name != null;
			case FhirPackage.SEQUENCE_REPOSITORY__STRUCTURE:
				return structure != null;
			case FhirPackage.SEQUENCE_REPOSITORY__VARIANT_ID:
				return variantId != null;
			case FhirPackage.SEQUENCE_REPOSITORY__READ_GROUP_SET_ID:
				return readGroupSetId != null;
		}
		return super.eIsSet(featureID);
	}

} //SequenceRepositoryImpl
