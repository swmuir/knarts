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

import org.eclipse.mdht.hl7.fhir.dataTypes.Uri;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.ConceptMapGroup;
import org.eclipse.mdht.hl7.fhir.resources.ConceptMapGroupSourceElement;
import org.eclipse.mdht.hl7.fhir.resources.ConceptMapGroupUnmapped;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concept Map Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ConceptMapGroupImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ConceptMapGroupImpl#getSourceVersion <em>Source Version</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ConceptMapGroupImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ConceptMapGroupImpl#getTargetVersion <em>Target Version</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ConceptMapGroupImpl#getElements <em>Element</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.ConceptMapGroupImpl#getUnmapped <em>Unmapped</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConceptMapGroupImpl extends BackboneElementImpl implements ConceptMapGroup {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Uri source;

	/**
	 * The cached value of the '{@link #getSourceVersion() <em>Source Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceVersion()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String sourceVersion;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Uri target;

	/**
	 * The cached value of the '{@link #getTargetVersion() <em>Target Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetVersion()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String targetVersion;

	/**
	 * The cached value of the '{@link #getElements() <em>Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ConceptMapGroupSourceElement> elements;

	/**
	 * The cached value of the '{@link #getUnmapped() <em>Unmapped</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnmapped()
	 * @generated
	 * @ordered
	 */
	protected ConceptMapGroupUnmapped unmapped;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConceptMapGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getConceptMapGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uri getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Uri newSource, NotificationChain msgs) {
		Uri oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONCEPT_MAP_GROUP__SOURCE, oldSource, newSource);
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
	public void setSource(Uri newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONCEPT_MAP_GROUP__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONCEPT_MAP_GROUP__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONCEPT_MAP_GROUP__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getSourceVersion() {
		return sourceVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceVersion(org.eclipse.mdht.hl7.fhir.dataTypes.String newSourceVersion, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldSourceVersion = sourceVersion;
		sourceVersion = newSourceVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONCEPT_MAP_GROUP__SOURCE_VERSION, oldSourceVersion, newSourceVersion);
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
	public void setSourceVersion(org.eclipse.mdht.hl7.fhir.dataTypes.String newSourceVersion) {
		if (newSourceVersion != sourceVersion) {
			NotificationChain msgs = null;
			if (sourceVersion != null)
				msgs = ((InternalEObject)sourceVersion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONCEPT_MAP_GROUP__SOURCE_VERSION, null, msgs);
			if (newSourceVersion != null)
				msgs = ((InternalEObject)newSourceVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONCEPT_MAP_GROUP__SOURCE_VERSION, null, msgs);
			msgs = basicSetSourceVersion(newSourceVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONCEPT_MAP_GROUP__SOURCE_VERSION, newSourceVersion, newSourceVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uri getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Uri newTarget, NotificationChain msgs) {
		Uri oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONCEPT_MAP_GROUP__TARGET, oldTarget, newTarget);
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
	public void setTarget(Uri newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONCEPT_MAP_GROUP__TARGET, null, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONCEPT_MAP_GROUP__TARGET, null, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONCEPT_MAP_GROUP__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getTargetVersion() {
		return targetVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetVersion(org.eclipse.mdht.hl7.fhir.dataTypes.String newTargetVersion, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldTargetVersion = targetVersion;
		targetVersion = newTargetVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONCEPT_MAP_GROUP__TARGET_VERSION, oldTargetVersion, newTargetVersion);
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
	public void setTargetVersion(org.eclipse.mdht.hl7.fhir.dataTypes.String newTargetVersion) {
		if (newTargetVersion != targetVersion) {
			NotificationChain msgs = null;
			if (targetVersion != null)
				msgs = ((InternalEObject)targetVersion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONCEPT_MAP_GROUP__TARGET_VERSION, null, msgs);
			if (newTargetVersion != null)
				msgs = ((InternalEObject)newTargetVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONCEPT_MAP_GROUP__TARGET_VERSION, null, msgs);
			msgs = basicSetTargetVersion(newTargetVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONCEPT_MAP_GROUP__TARGET_VERSION, newTargetVersion, newTargetVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConceptMapGroupSourceElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<ConceptMapGroupSourceElement>(ConceptMapGroupSourceElement.class, this, ResourcesPackage.CONCEPT_MAP_GROUP__ELEMENT);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConceptMapGroupUnmapped getUnmapped() {
		return unmapped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnmapped(ConceptMapGroupUnmapped newUnmapped, NotificationChain msgs) {
		ConceptMapGroupUnmapped oldUnmapped = unmapped;
		unmapped = newUnmapped;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONCEPT_MAP_GROUP__UNMAPPED, oldUnmapped, newUnmapped);
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
	public void setUnmapped(ConceptMapGroupUnmapped newUnmapped) {
		if (newUnmapped != unmapped) {
			NotificationChain msgs = null;
			if (unmapped != null)
				msgs = ((InternalEObject)unmapped).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONCEPT_MAP_GROUP__UNMAPPED, null, msgs);
			if (newUnmapped != null)
				msgs = ((InternalEObject)newUnmapped).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONCEPT_MAP_GROUP__UNMAPPED, null, msgs);
			msgs = basicSetUnmapped(newUnmapped, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONCEPT_MAP_GROUP__UNMAPPED, newUnmapped, newUnmapped));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.CONCEPT_MAP_GROUP__SOURCE:
				return basicSetSource(null, msgs);
			case ResourcesPackage.CONCEPT_MAP_GROUP__SOURCE_VERSION:
				return basicSetSourceVersion(null, msgs);
			case ResourcesPackage.CONCEPT_MAP_GROUP__TARGET:
				return basicSetTarget(null, msgs);
			case ResourcesPackage.CONCEPT_MAP_GROUP__TARGET_VERSION:
				return basicSetTargetVersion(null, msgs);
			case ResourcesPackage.CONCEPT_MAP_GROUP__ELEMENT:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CONCEPT_MAP_GROUP__UNMAPPED:
				return basicSetUnmapped(null, msgs);
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
			case ResourcesPackage.CONCEPT_MAP_GROUP__SOURCE:
				return getSource();
			case ResourcesPackage.CONCEPT_MAP_GROUP__SOURCE_VERSION:
				return getSourceVersion();
			case ResourcesPackage.CONCEPT_MAP_GROUP__TARGET:
				return getTarget();
			case ResourcesPackage.CONCEPT_MAP_GROUP__TARGET_VERSION:
				return getTargetVersion();
			case ResourcesPackage.CONCEPT_MAP_GROUP__ELEMENT:
				return getElements();
			case ResourcesPackage.CONCEPT_MAP_GROUP__UNMAPPED:
				return getUnmapped();
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
			case ResourcesPackage.CONCEPT_MAP_GROUP__SOURCE:
				setSource((Uri)newValue);
				return;
			case ResourcesPackage.CONCEPT_MAP_GROUP__SOURCE_VERSION:
				setSourceVersion((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.CONCEPT_MAP_GROUP__TARGET:
				setTarget((Uri)newValue);
				return;
			case ResourcesPackage.CONCEPT_MAP_GROUP__TARGET_VERSION:
				setTargetVersion((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.CONCEPT_MAP_GROUP__ELEMENT:
				getElements().clear();
				getElements().addAll((Collection<? extends ConceptMapGroupSourceElement>)newValue);
				return;
			case ResourcesPackage.CONCEPT_MAP_GROUP__UNMAPPED:
				setUnmapped((ConceptMapGroupUnmapped)newValue);
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
			case ResourcesPackage.CONCEPT_MAP_GROUP__SOURCE:
				setSource((Uri)null);
				return;
			case ResourcesPackage.CONCEPT_MAP_GROUP__SOURCE_VERSION:
				setSourceVersion((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.CONCEPT_MAP_GROUP__TARGET:
				setTarget((Uri)null);
				return;
			case ResourcesPackage.CONCEPT_MAP_GROUP__TARGET_VERSION:
				setTargetVersion((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.CONCEPT_MAP_GROUP__ELEMENT:
				getElements().clear();
				return;
			case ResourcesPackage.CONCEPT_MAP_GROUP__UNMAPPED:
				setUnmapped((ConceptMapGroupUnmapped)null);
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
			case ResourcesPackage.CONCEPT_MAP_GROUP__SOURCE:
				return source != null;
			case ResourcesPackage.CONCEPT_MAP_GROUP__SOURCE_VERSION:
				return sourceVersion != null;
			case ResourcesPackage.CONCEPT_MAP_GROUP__TARGET:
				return target != null;
			case ResourcesPackage.CONCEPT_MAP_GROUP__TARGET_VERSION:
				return targetVersion != null;
			case ResourcesPackage.CONCEPT_MAP_GROUP__ELEMENT:
				return elements != null && !elements.isEmpty();
			case ResourcesPackage.CONCEPT_MAP_GROUP__UNMAPPED:
				return unmapped != null;
		}
		return super.eIsSet(featureID);
	}

} //ConceptMapGroupImpl
