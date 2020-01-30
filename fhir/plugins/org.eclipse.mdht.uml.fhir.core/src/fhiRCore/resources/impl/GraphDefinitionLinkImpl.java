/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.GraphDefinitionLink;
import fhiRCore.resources.GraphDefinitionLinkTarget;
import fhiRCore.resources.ResourcesPackage;

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
 * An implementation of the model object '<em><b>Graph Definition Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.GraphDefinitionLinkImpl#getPath <em>Path</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.GraphDefinitionLinkImpl#getSliceName <em>Slice Name</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.GraphDefinitionLinkImpl#getMin <em>Min</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.GraphDefinitionLinkImpl#getMax <em>Max</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.GraphDefinitionLinkImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.GraphDefinitionLinkImpl#getTargets <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphDefinitionLinkImpl extends BackboneElementImpl implements GraphDefinitionLink {
	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String path;

	/**
	 * The cached value of the '{@link #getSliceName() <em>Slice Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSliceName()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String sliceName;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Integer min;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String max;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String description;

	/**
	 * The cached value of the '{@link #getTargets() <em>Target</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<GraphDefinitionLinkTarget> targets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphDefinitionLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getGraphDefinitionLink();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPath(fhiRCore.dataTypes.String newPath, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldPath = path;
		path = newPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.GRAPH_DEFINITION_LINK__PATH, oldPath, newPath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(fhiRCore.dataTypes.String newPath) {
		if (newPath != path) {
			NotificationChain msgs = null;
			if (path != null)
				msgs = ((InternalEObject)path).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GRAPH_DEFINITION_LINK__PATH, null, msgs);
			if (newPath != null)
				msgs = ((InternalEObject)newPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GRAPH_DEFINITION_LINK__PATH, null, msgs);
			msgs = basicSetPath(newPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.GRAPH_DEFINITION_LINK__PATH, newPath, newPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getSliceName() {
		return sliceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSliceName(fhiRCore.dataTypes.String newSliceName, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldSliceName = sliceName;
		sliceName = newSliceName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.GRAPH_DEFINITION_LINK__SLICE_NAME, oldSliceName, newSliceName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSliceName(fhiRCore.dataTypes.String newSliceName) {
		if (newSliceName != sliceName) {
			NotificationChain msgs = null;
			if (sliceName != null)
				msgs = ((InternalEObject)sliceName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GRAPH_DEFINITION_LINK__SLICE_NAME, null, msgs);
			if (newSliceName != null)
				msgs = ((InternalEObject)newSliceName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GRAPH_DEFINITION_LINK__SLICE_NAME, null, msgs);
			msgs = basicSetSliceName(newSliceName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.GRAPH_DEFINITION_LINK__SLICE_NAME, newSliceName, newSliceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Integer getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMin(fhiRCore.dataTypes.Integer newMin, NotificationChain msgs) {
		fhiRCore.dataTypes.Integer oldMin = min;
		min = newMin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.GRAPH_DEFINITION_LINK__MIN, oldMin, newMin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin(fhiRCore.dataTypes.Integer newMin) {
		if (newMin != min) {
			NotificationChain msgs = null;
			if (min != null)
				msgs = ((InternalEObject)min).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GRAPH_DEFINITION_LINK__MIN, null, msgs);
			if (newMin != null)
				msgs = ((InternalEObject)newMin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GRAPH_DEFINITION_LINK__MIN, null, msgs);
			msgs = basicSetMin(newMin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.GRAPH_DEFINITION_LINK__MIN, newMin, newMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMax(fhiRCore.dataTypes.String newMax, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldMax = max;
		max = newMax;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.GRAPH_DEFINITION_LINK__MAX, oldMax, newMax);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax(fhiRCore.dataTypes.String newMax) {
		if (newMax != max) {
			NotificationChain msgs = null;
			if (max != null)
				msgs = ((InternalEObject)max).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GRAPH_DEFINITION_LINK__MAX, null, msgs);
			if (newMax != null)
				msgs = ((InternalEObject)newMax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GRAPH_DEFINITION_LINK__MAX, null, msgs);
			msgs = basicSetMax(newMax, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.GRAPH_DEFINITION_LINK__MAX, newMax, newMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(fhiRCore.dataTypes.String newDescription, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.GRAPH_DEFINITION_LINK__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(fhiRCore.dataTypes.String newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GRAPH_DEFINITION_LINK__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.GRAPH_DEFINITION_LINK__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.GRAPH_DEFINITION_LINK__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GraphDefinitionLinkTarget> getTargets() {
		if (targets == null) {
			targets = new EObjectContainmentEList<GraphDefinitionLinkTarget>(GraphDefinitionLinkTarget.class, this, ResourcesPackage.GRAPH_DEFINITION_LINK__TARGET);
		}
		return targets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.GRAPH_DEFINITION_LINK__PATH:
				return basicSetPath(null, msgs);
			case ResourcesPackage.GRAPH_DEFINITION_LINK__SLICE_NAME:
				return basicSetSliceName(null, msgs);
			case ResourcesPackage.GRAPH_DEFINITION_LINK__MIN:
				return basicSetMin(null, msgs);
			case ResourcesPackage.GRAPH_DEFINITION_LINK__MAX:
				return basicSetMax(null, msgs);
			case ResourcesPackage.GRAPH_DEFINITION_LINK__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case ResourcesPackage.GRAPH_DEFINITION_LINK__TARGET:
				return ((InternalEList<?>)getTargets()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.GRAPH_DEFINITION_LINK__PATH:
				return getPath();
			case ResourcesPackage.GRAPH_DEFINITION_LINK__SLICE_NAME:
				return getSliceName();
			case ResourcesPackage.GRAPH_DEFINITION_LINK__MIN:
				return getMin();
			case ResourcesPackage.GRAPH_DEFINITION_LINK__MAX:
				return getMax();
			case ResourcesPackage.GRAPH_DEFINITION_LINK__DESCRIPTION:
				return getDescription();
			case ResourcesPackage.GRAPH_DEFINITION_LINK__TARGET:
				return getTargets();
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
			case ResourcesPackage.GRAPH_DEFINITION_LINK__PATH:
				setPath((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.GRAPH_DEFINITION_LINK__SLICE_NAME:
				setSliceName((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.GRAPH_DEFINITION_LINK__MIN:
				setMin((fhiRCore.dataTypes.Integer)newValue);
				return;
			case ResourcesPackage.GRAPH_DEFINITION_LINK__MAX:
				setMax((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.GRAPH_DEFINITION_LINK__DESCRIPTION:
				setDescription((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.GRAPH_DEFINITION_LINK__TARGET:
				getTargets().clear();
				getTargets().addAll((Collection<? extends GraphDefinitionLinkTarget>)newValue);
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
			case ResourcesPackage.GRAPH_DEFINITION_LINK__PATH:
				setPath((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.GRAPH_DEFINITION_LINK__SLICE_NAME:
				setSliceName((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.GRAPH_DEFINITION_LINK__MIN:
				setMin((fhiRCore.dataTypes.Integer)null);
				return;
			case ResourcesPackage.GRAPH_DEFINITION_LINK__MAX:
				setMax((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.GRAPH_DEFINITION_LINK__DESCRIPTION:
				setDescription((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.GRAPH_DEFINITION_LINK__TARGET:
				getTargets().clear();
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
			case ResourcesPackage.GRAPH_DEFINITION_LINK__PATH:
				return path != null;
			case ResourcesPackage.GRAPH_DEFINITION_LINK__SLICE_NAME:
				return sliceName != null;
			case ResourcesPackage.GRAPH_DEFINITION_LINK__MIN:
				return min != null;
			case ResourcesPackage.GRAPH_DEFINITION_LINK__MAX:
				return max != null;
			case ResourcesPackage.GRAPH_DEFINITION_LINK__DESCRIPTION:
				return description != null;
			case ResourcesPackage.GRAPH_DEFINITION_LINK__TARGET:
				return targets != null && !targets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GraphDefinitionLinkImpl
