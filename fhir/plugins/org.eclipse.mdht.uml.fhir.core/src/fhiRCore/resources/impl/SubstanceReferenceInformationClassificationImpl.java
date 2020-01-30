/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Reference;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.ResourcesPackage;
import fhiRCore.resources.SubstanceReferenceInformationClassification;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Reference Information Classification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.SubstanceReferenceInformationClassificationImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SubstanceReferenceInformationClassificationImpl#getClassification <em>Classification</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SubstanceReferenceInformationClassificationImpl#getSubtypes <em>Subtype</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SubstanceReferenceInformationClassificationImpl#getSources <em>Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubstanceReferenceInformationClassificationImpl extends BackboneElementImpl implements SubstanceReferenceInformationClassification {
	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept domain;

	/**
	 * The cached value of the '{@link #getClassification() <em>Classification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassification()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept classification;

	/**
	 * The cached value of the '{@link #getSubtypes() <em>Subtype</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtypes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> subtypes;

	/**
	 * The cached value of the '{@link #getSources() <em>Source</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSources()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> sources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceReferenceInformationClassificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getSubstanceReferenceInformationClassification();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomain(CodeableConcept newDomain, NotificationChain msgs) {
		CodeableConcept oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__DOMAIN, oldDomain, newDomain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(CodeableConcept newDomain) {
		if (newDomain != domain) {
			NotificationChain msgs = null;
			if (domain != null)
				msgs = ((InternalEObject)domain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__DOMAIN, null, msgs);
			if (newDomain != null)
				msgs = ((InternalEObject)newDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__DOMAIN, null, msgs);
			msgs = basicSetDomain(newDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__DOMAIN, newDomain, newDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getClassification() {
		return classification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassification(CodeableConcept newClassification, NotificationChain msgs) {
		CodeableConcept oldClassification = classification;
		classification = newClassification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__CLASSIFICATION, oldClassification, newClassification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassification(CodeableConcept newClassification) {
		if (newClassification != classification) {
			NotificationChain msgs = null;
			if (classification != null)
				msgs = ((InternalEObject)classification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__CLASSIFICATION, null, msgs);
			if (newClassification != null)
				msgs = ((InternalEObject)newClassification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__CLASSIFICATION, null, msgs);
			msgs = basicSetClassification(newClassification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__CLASSIFICATION, newClassification, newClassification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getSubtypes() {
		if (subtypes == null) {
			subtypes = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__SUBTYPE);
		}
		return subtypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getSources() {
		if (sources == null) {
			sources = new EObjectContainmentEList<Reference>(Reference.class, this, ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__SOURCE);
		}
		return sources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__DOMAIN:
				return basicSetDomain(null, msgs);
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__CLASSIFICATION:
				return basicSetClassification(null, msgs);
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__SUBTYPE:
				return ((InternalEList<?>)getSubtypes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__SOURCE:
				return ((InternalEList<?>)getSources()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__DOMAIN:
				return getDomain();
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__CLASSIFICATION:
				return getClassification();
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__SUBTYPE:
				return getSubtypes();
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__SOURCE:
				return getSources();
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
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__DOMAIN:
				setDomain((CodeableConcept)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__CLASSIFICATION:
				setClassification((CodeableConcept)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__SUBTYPE:
				getSubtypes().clear();
				getSubtypes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__SOURCE:
				getSources().clear();
				getSources().addAll((Collection<? extends Reference>)newValue);
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
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__DOMAIN:
				setDomain((CodeableConcept)null);
				return;
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__CLASSIFICATION:
				setClassification((CodeableConcept)null);
				return;
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__SUBTYPE:
				getSubtypes().clear();
				return;
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__SOURCE:
				getSources().clear();
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
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__DOMAIN:
				return domain != null;
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__CLASSIFICATION:
				return classification != null;
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__SUBTYPE:
				return subtypes != null && !subtypes.isEmpty();
			case ResourcesPackage.SUBSTANCE_REFERENCE_INFORMATION_CLASSIFICATION__SOURCE:
				return sources != null && !sources.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubstanceReferenceInformationClassificationImpl
