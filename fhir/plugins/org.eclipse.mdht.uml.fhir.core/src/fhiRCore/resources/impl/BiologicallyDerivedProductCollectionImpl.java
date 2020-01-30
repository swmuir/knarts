/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Reference;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.BiologicallyDerivedProductCollection;
import fhiRCore.resources.ResourcesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Biologically Derived Product Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.BiologicallyDerivedProductCollectionImpl#getCollector <em>Collector</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.BiologicallyDerivedProductCollectionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.BiologicallyDerivedProductCollectionImpl#getCollectedx <em>Collectedx</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BiologicallyDerivedProductCollectionImpl extends BackboneElementImpl implements BiologicallyDerivedProductCollection {
	/**
	 * The cached value of the '{@link #getCollector() <em>Collector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollector()
	 * @generated
	 * @ordered
	 */
	protected Reference collector;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Reference source;

	/**
	 * The cached value of the '{@link #getCollectedx() <em>Collectedx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectedx()
	 * @generated
	 * @ordered
	 */
	protected DataType collectedx;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BiologicallyDerivedProductCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getBiologicallyDerivedProductCollection();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getCollector() {
		return collector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCollector(Reference newCollector, NotificationChain msgs) {
		Reference oldCollector = collector;
		collector = newCollector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__COLLECTOR, oldCollector, newCollector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollector(Reference newCollector) {
		if (newCollector != collector) {
			NotificationChain msgs = null;
			if (collector != null)
				msgs = ((InternalEObject)collector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__COLLECTOR, null, msgs);
			if (newCollector != null)
				msgs = ((InternalEObject)newCollector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__COLLECTOR, null, msgs);
			msgs = basicSetCollector(newCollector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__COLLECTOR, newCollector, newCollector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Reference newSource, NotificationChain msgs) {
		Reference oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Reference newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getCollectedx() {
		return collectedx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCollectedx(DataType newCollectedx, NotificationChain msgs) {
		DataType oldCollectedx = collectedx;
		collectedx = newCollectedx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__COLLECTEDX, oldCollectedx, newCollectedx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollectedx(DataType newCollectedx) {
		if (newCollectedx != collectedx) {
			NotificationChain msgs = null;
			if (collectedx != null)
				msgs = ((InternalEObject)collectedx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__COLLECTEDX, null, msgs);
			if (newCollectedx != null)
				msgs = ((InternalEObject)newCollectedx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__COLLECTEDX, null, msgs);
			msgs = basicSetCollectedx(newCollectedx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__COLLECTEDX, newCollectedx, newCollectedx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__COLLECTOR:
				return basicSetCollector(null, msgs);
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__SOURCE:
				return basicSetSource(null, msgs);
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__COLLECTEDX:
				return basicSetCollectedx(null, msgs);
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
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__COLLECTOR:
				return getCollector();
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__SOURCE:
				return getSource();
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__COLLECTEDX:
				return getCollectedx();
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
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__COLLECTOR:
				setCollector((Reference)newValue);
				return;
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__SOURCE:
				setSource((Reference)newValue);
				return;
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__COLLECTEDX:
				setCollectedx((DataType)newValue);
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
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__COLLECTOR:
				setCollector((Reference)null);
				return;
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__SOURCE:
				setSource((Reference)null);
				return;
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__COLLECTEDX:
				setCollectedx((DataType)null);
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
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__COLLECTOR:
				return collector != null;
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__SOURCE:
				return source != null;
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_COLLECTION__COLLECTEDX:
				return collectedx != null;
		}
		return super.eIsSet(featureID);
	}

} //BiologicallyDerivedProductCollectionImpl
