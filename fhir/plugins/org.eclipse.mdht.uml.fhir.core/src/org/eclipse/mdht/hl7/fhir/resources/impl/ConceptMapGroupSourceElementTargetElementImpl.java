/**
 */
package org.eclipse.mdht.hl7.fhir.resources.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.hl7.fhir.dataTypes.Code;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.ConceptMapGroupSourceElementTargetElement;
import org.eclipse.mdht.hl7.fhir.resources.ConceptMapGroupSourceElementTargetElementOtherElement;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concept Map Group Source Element Target Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ConceptMapGroupSourceElementTargetElementImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ConceptMapGroupSourceElementTargetElementImpl#getDisplay <em>Display</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ConceptMapGroupSourceElementTargetElementImpl#getEquivalence <em>Equivalence</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ConceptMapGroupSourceElementTargetElementImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ConceptMapGroupSourceElementTargetElementImpl#getDependsOns <em>Depends On</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ConceptMapGroupSourceElementTargetElementImpl#getProducts <em>Product</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConceptMapGroupSourceElementTargetElementImpl extends BackboneElementImpl implements ConceptMapGroupSourceElementTargetElement {
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
	 * The cached value of the '{@link #getDisplay() <em>Display</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String display;

	/**
	 * The cached value of the '{@link #getEquivalence() <em>Equivalence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquivalence()
	 * @generated
	 * @ordered
	 */
	protected Code equivalence;

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
	 * The cached value of the '{@link #getDependsOns() <em>Depends On</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependsOns()
	 * @generated
	 * @ordered
	 */
	protected EList<ConceptMapGroupSourceElementTargetElementOtherElement> dependsOns;

	/**
	 * The cached value of the '{@link #getProducts() <em>Product</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<ConceptMapGroupSourceElementTargetElementOtherElement> products;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptMapGroupSourceElementTargetElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getConceptMapGroupSourceElementTargetElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT__CODE, oldCode, newCode);
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
	public void setCode(Code newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getDisplay() {
		return display;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisplay(org.eclipse.mdht.hl7.fhir.dataTypes.String newDisplay, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldDisplay = display;
		display = newDisplay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT__DISPLAY, oldDisplay, newDisplay);
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
	public void setDisplay(org.eclipse.mdht.hl7.fhir.dataTypes.String newDisplay) {
		if (newDisplay != display) {
			NotificationChain msgs = null;
			if (display != null)
				msgs = ((InternalEObject)display).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT__DISPLAY, null, msgs);
			if (newDisplay != null)
				msgs = ((InternalEObject)newDisplay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT__DISPLAY, null, msgs);
			msgs = basicSetDisplay(newDisplay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT__DISPLAY, newDisplay, newDisplay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getEquivalence() {
		return equivalence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEquivalence(Code newEquivalence, NotificationChain msgs) {
		Code oldEquivalence = equivalence;
		equivalence = newEquivalence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT__EQUIVALENCE, oldEquivalence, newEquivalence);
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
	public void setEquivalence(Code newEquivalence) {
		if (newEquivalence != equivalence) {
			NotificationChain msgs = null;
			if (equivalence != null)
				msgs = ((InternalEObject)equivalence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT__EQUIVALENCE, null, msgs);
			if (newEquivalence != null)
				msgs = ((InternalEObject)newEquivalence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT__EQUIVALENCE, null, msgs);
			msgs = basicSetEquivalence(newEquivalence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT__EQUIVALENCE, newEquivalence, newEquivalence));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT__COMMENT, oldComment, newComment);
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
				msgs = ((InternalEObject)comment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT__COMMENT, null, msgs);
			if (newComment != null)
				msgs = ((InternalEObject)newComment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT__COMMENT, null, msgs);
			msgs = basicSetComment(newComment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT__COMMENT, newComment, newComment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConceptMapGroupSourceElementTargetElementOtherElement> getDependsOns() {
		if (dependsOns == null) {
			dependsOns = new EObjectContainmentEList<ConceptMapGroupSourceElementTargetElementOtherElement>(ConceptMapGroupSourceElementTargetElementOtherElement.class, this, ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT__DEPENDS_ON);
		}
		return dependsOns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConceptMapGroupSourceElementTargetElementOtherElement> getProducts() {
		if (products == null) {
			products = new EObjectContainmentEList<ConceptMapGroupSourceElementTargetElementOtherElement>(ConceptMapGroupSourceElementTargetElementOtherElement.class, this, ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT__PRODUCT);
		}
		return products;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT__CODE:
				return basicSetCode(null, msgs);
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT__DISPLAY:
				return basicSetDisplay(null, msgs);
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT__EQUIVALENCE:
				return basicSetEquivalence(null, msgs);
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT__COMMENT:
				return basicSetComment(null, msgs);
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT__DEPENDS_ON:
				return ((InternalEList<?>)getDependsOns()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT__PRODUCT:
				return ((InternalEList<?>)getProducts()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT__CODE:
				return getCode();
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT__DISPLAY:
				return getDisplay();
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT__EQUIVALENCE:
				return getEquivalence();
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT__COMMENT:
				return getComment();
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT__DEPENDS_ON:
				return getDependsOns();
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT__PRODUCT:
				return getProducts();
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
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT__CODE:
				setCode((Code)newValue);
				return;
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT__DISPLAY:
				setDisplay((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT__EQUIVALENCE:
				setEquivalence((Code)newValue);
				return;
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT__COMMENT:
				setComment((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT__DEPENDS_ON:
				getDependsOns().clear();
				getDependsOns().addAll((Collection<? extends ConceptMapGroupSourceElementTargetElementOtherElement>)newValue);
				return;
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT__PRODUCT:
				getProducts().clear();
				getProducts().addAll((Collection<? extends ConceptMapGroupSourceElementTargetElementOtherElement>)newValue);
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
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT__CODE:
				setCode((Code)null);
				return;
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT__DISPLAY:
				setDisplay((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT__EQUIVALENCE:
				setEquivalence((Code)null);
				return;
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT__COMMENT:
				setComment((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT__DEPENDS_ON:
				getDependsOns().clear();
				return;
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT__PRODUCT:
				getProducts().clear();
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
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT__CODE:
				return code != null;
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT__DISPLAY:
				return display != null;
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT__EQUIVALENCE:
				return equivalence != null;
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT__COMMENT:
				return comment != null;
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT__DEPENDS_ON:
				return dependsOns != null && !dependsOns.isEmpty();
			case ResourcesPackage.CONCEPT_MAP_GROUP_SOURCE_ELEMENT_TARGET_ELEMENT__PRODUCT:
				return products != null && !products.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConceptMapGroupSourceElementTargetElementImpl
