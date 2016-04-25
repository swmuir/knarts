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
import org.hl7.fhir.ConceptMapDependsOn;
import org.hl7.fhir.ConceptMapEquivalence;
import org.hl7.fhir.ConceptMapTarget;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Uri;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concept Map Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ConceptMapTargetImpl#getSystem <em>System</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConceptMapTargetImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConceptMapTargetImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConceptMapTargetImpl#getEquivalence <em>Equivalence</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConceptMapTargetImpl#getComments <em>Comments</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConceptMapTargetImpl#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ConceptMapTargetImpl#getProduct <em>Product</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConceptMapTargetImpl extends BackboneElementImpl implements ConceptMapTarget {
	/**
	 * The cached value of the '{@link #getSystem() <em>System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected Uri system;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String version;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected Code code;

	/**
	 * The cached value of the '{@link #getEquivalence() <em>Equivalence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquivalence()
	 * @generated
	 * @ordered
	 */
	protected ConceptMapEquivalence equivalence;

	/**
	 * The cached value of the '{@link #getComments() <em>Comments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected org.hl7.fhir.String comments;

	/**
	 * The cached value of the '{@link #getDependsOn() <em>Depends On</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependsOn()
	 * @generated
	 * @ordered
	 */
	protected EList<ConceptMapDependsOn> dependsOn;

	/**
	 * The cached value of the '{@link #getProduct() <em>Product</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct()
	 * @generated
	 * @ordered
	 */
	protected EList<ConceptMapDependsOn> product;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptMapTargetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getConceptMapTarget();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getSystem() {
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystem(Uri newSystem, NotificationChain msgs) {
		Uri oldSystem = system;
		system = newSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_TARGET__SYSTEM, oldSystem, newSystem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(Uri newSystem) {
		if (newSystem != system) {
			NotificationChain msgs = null;
			if (system != null)
				msgs = ((InternalEObject)system).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_TARGET__SYSTEM, null, msgs);
			if (newSystem != null)
				msgs = ((InternalEObject)newSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_TARGET__SYSTEM, null, msgs);
			msgs = basicSetSystem(newSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_TARGET__SYSTEM, newSystem, newSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersion(org.hl7.fhir.String newVersion, NotificationChain msgs) {
		org.hl7.fhir.String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_TARGET__VERSION, oldVersion, newVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(org.hl7.fhir.String newVersion) {
		if (newVersion != version) {
			NotificationChain msgs = null;
			if (version != null)
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_TARGET__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_TARGET__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_TARGET__VERSION, newVersion, newVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(Code newCode, NotificationChain msgs) {
		Code oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_TARGET__CODE, oldCode, newCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(Code newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_TARGET__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_TARGET__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_TARGET__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMapEquivalence getEquivalence() {
		return equivalence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEquivalence(ConceptMapEquivalence newEquivalence, NotificationChain msgs) {
		ConceptMapEquivalence oldEquivalence = equivalence;
		equivalence = newEquivalence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_TARGET__EQUIVALENCE, oldEquivalence, newEquivalence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEquivalence(ConceptMapEquivalence newEquivalence) {
		if (newEquivalence != equivalence) {
			NotificationChain msgs = null;
			if (equivalence != null)
				msgs = ((InternalEObject)equivalence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_TARGET__EQUIVALENCE, null, msgs);
			if (newEquivalence != null)
				msgs = ((InternalEObject)newEquivalence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_TARGET__EQUIVALENCE, null, msgs);
			msgs = basicSetEquivalence(newEquivalence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_TARGET__EQUIVALENCE, newEquivalence, newEquivalence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.hl7.fhir.String getComments() {
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComments(org.hl7.fhir.String newComments, NotificationChain msgs) {
		org.hl7.fhir.String oldComments = comments;
		comments = newComments;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_TARGET__COMMENTS, oldComments, newComments);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComments(org.hl7.fhir.String newComments) {
		if (newComments != comments) {
			NotificationChain msgs = null;
			if (comments != null)
				msgs = ((InternalEObject)comments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_TARGET__COMMENTS, null, msgs);
			if (newComments != null)
				msgs = ((InternalEObject)newComments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.CONCEPT_MAP_TARGET__COMMENTS, null, msgs);
			msgs = basicSetComments(newComments, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.CONCEPT_MAP_TARGET__COMMENTS, newComments, newComments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConceptMapDependsOn> getDependsOn() {
		if (dependsOn == null) {
			dependsOn = new EObjectContainmentEList<ConceptMapDependsOn>(ConceptMapDependsOn.class, this, FhirPackage.CONCEPT_MAP_TARGET__DEPENDS_ON);
		}
		return dependsOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConceptMapDependsOn> getProduct() {
		if (product == null) {
			product = new EObjectContainmentEList<ConceptMapDependsOn>(ConceptMapDependsOn.class, this, FhirPackage.CONCEPT_MAP_TARGET__PRODUCT);
		}
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.CONCEPT_MAP_TARGET__SYSTEM:
				return basicSetSystem(null, msgs);
			case FhirPackage.CONCEPT_MAP_TARGET__VERSION:
				return basicSetVersion(null, msgs);
			case FhirPackage.CONCEPT_MAP_TARGET__CODE:
				return basicSetCode(null, msgs);
			case FhirPackage.CONCEPT_MAP_TARGET__EQUIVALENCE:
				return basicSetEquivalence(null, msgs);
			case FhirPackage.CONCEPT_MAP_TARGET__COMMENTS:
				return basicSetComments(null, msgs);
			case FhirPackage.CONCEPT_MAP_TARGET__DEPENDS_ON:
				return ((InternalEList<?>)getDependsOn()).basicRemove(otherEnd, msgs);
			case FhirPackage.CONCEPT_MAP_TARGET__PRODUCT:
				return ((InternalEList<?>)getProduct()).basicRemove(otherEnd, msgs);
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
			case FhirPackage.CONCEPT_MAP_TARGET__SYSTEM:
				return getSystem();
			case FhirPackage.CONCEPT_MAP_TARGET__VERSION:
				return getVersion();
			case FhirPackage.CONCEPT_MAP_TARGET__CODE:
				return getCode();
			case FhirPackage.CONCEPT_MAP_TARGET__EQUIVALENCE:
				return getEquivalence();
			case FhirPackage.CONCEPT_MAP_TARGET__COMMENTS:
				return getComments();
			case FhirPackage.CONCEPT_MAP_TARGET__DEPENDS_ON:
				return getDependsOn();
			case FhirPackage.CONCEPT_MAP_TARGET__PRODUCT:
				return getProduct();
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
			case FhirPackage.CONCEPT_MAP_TARGET__SYSTEM:
				setSystem((Uri)newValue);
				return;
			case FhirPackage.CONCEPT_MAP_TARGET__VERSION:
				setVersion((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CONCEPT_MAP_TARGET__CODE:
				setCode((Code)newValue);
				return;
			case FhirPackage.CONCEPT_MAP_TARGET__EQUIVALENCE:
				setEquivalence((ConceptMapEquivalence)newValue);
				return;
			case FhirPackage.CONCEPT_MAP_TARGET__COMMENTS:
				setComments((org.hl7.fhir.String)newValue);
				return;
			case FhirPackage.CONCEPT_MAP_TARGET__DEPENDS_ON:
				getDependsOn().clear();
				getDependsOn().addAll((Collection<? extends ConceptMapDependsOn>)newValue);
				return;
			case FhirPackage.CONCEPT_MAP_TARGET__PRODUCT:
				getProduct().clear();
				getProduct().addAll((Collection<? extends ConceptMapDependsOn>)newValue);
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
			case FhirPackage.CONCEPT_MAP_TARGET__SYSTEM:
				setSystem((Uri)null);
				return;
			case FhirPackage.CONCEPT_MAP_TARGET__VERSION:
				setVersion((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CONCEPT_MAP_TARGET__CODE:
				setCode((Code)null);
				return;
			case FhirPackage.CONCEPT_MAP_TARGET__EQUIVALENCE:
				setEquivalence((ConceptMapEquivalence)null);
				return;
			case FhirPackage.CONCEPT_MAP_TARGET__COMMENTS:
				setComments((org.hl7.fhir.String)null);
				return;
			case FhirPackage.CONCEPT_MAP_TARGET__DEPENDS_ON:
				getDependsOn().clear();
				return;
			case FhirPackage.CONCEPT_MAP_TARGET__PRODUCT:
				getProduct().clear();
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
			case FhirPackage.CONCEPT_MAP_TARGET__SYSTEM:
				return system != null;
			case FhirPackage.CONCEPT_MAP_TARGET__VERSION:
				return version != null;
			case FhirPackage.CONCEPT_MAP_TARGET__CODE:
				return code != null;
			case FhirPackage.CONCEPT_MAP_TARGET__EQUIVALENCE:
				return equivalence != null;
			case FhirPackage.CONCEPT_MAP_TARGET__COMMENTS:
				return comments != null;
			case FhirPackage.CONCEPT_MAP_TARGET__DEPENDS_ON:
				return dependsOn != null && !dependsOn.isEmpty();
			case FhirPackage.CONCEPT_MAP_TARGET__PRODUCT:
				return product != null && !product.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConceptMapTargetImpl
