/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Duration;
import fhiRCore.dataTypes.Quantity;
import fhiRCore.dataTypes.Reference;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.ResourcesPackage;
import fhiRCore.resources.SpecimenCollection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specimen Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.SpecimenCollectionImpl#getCollector <em>Collector</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SpecimenCollectionImpl#getCollectedx <em>Collectedx</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SpecimenCollectionImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SpecimenCollectionImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SpecimenCollectionImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SpecimenCollectionImpl#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.SpecimenCollectionImpl#getFastingStatusx <em>Fasting Statusx</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecimenCollectionImpl extends BackboneElementImpl implements SpecimenCollection {
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
	 * The cached value of the '{@link #getCollectedx() <em>Collectedx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectedx()
	 * @generated
	 * @ordered
	 */
	protected DataType collectedx;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected Duration duration;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected Quantity quantity;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept method;

	/**
	 * The cached value of the '{@link #getBodySite() <em>Body Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySite()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept bodySite;

	/**
	 * The cached value of the '{@link #getFastingStatusx() <em>Fasting Statusx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFastingStatusx()
	 * @generated
	 * @ordered
	 */
	protected DataType fastingStatusx;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecimenCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getSpecimenCollection();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_COLLECTION__COLLECTOR, oldCollector, newCollector);
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
				msgs = ((InternalEObject)collector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_COLLECTION__COLLECTOR, null, msgs);
			if (newCollector != null)
				msgs = ((InternalEObject)newCollector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_COLLECTION__COLLECTOR, null, msgs);
			msgs = basicSetCollector(newCollector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_COLLECTION__COLLECTOR, newCollector, newCollector));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_COLLECTION__COLLECTEDX, oldCollectedx, newCollectedx);
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
				msgs = ((InternalEObject)collectedx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_COLLECTION__COLLECTEDX, null, msgs);
			if (newCollectedx != null)
				msgs = ((InternalEObject)newCollectedx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_COLLECTION__COLLECTEDX, null, msgs);
			msgs = basicSetCollectedx(newCollectedx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_COLLECTION__COLLECTEDX, newCollectedx, newCollectedx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Duration getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDuration(Duration newDuration, NotificationChain msgs) {
		Duration oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_COLLECTION__DURATION, oldDuration, newDuration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(Duration newDuration) {
		if (newDuration != duration) {
			NotificationChain msgs = null;
			if (duration != null)
				msgs = ((InternalEObject)duration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_COLLECTION__DURATION, null, msgs);
			if (newDuration != null)
				msgs = ((InternalEObject)newDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_COLLECTION__DURATION, null, msgs);
			msgs = basicSetDuration(newDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_COLLECTION__DURATION, newDuration, newDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantity getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantity(Quantity newQuantity, NotificationChain msgs) {
		Quantity oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_COLLECTION__QUANTITY, oldQuantity, newQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(Quantity newQuantity) {
		if (newQuantity != quantity) {
			NotificationChain msgs = null;
			if (quantity != null)
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_COLLECTION__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_COLLECTION__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_COLLECTION__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethod(CodeableConcept newMethod, NotificationChain msgs) {
		CodeableConcept oldMethod = method;
		method = newMethod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_COLLECTION__METHOD, oldMethod, newMethod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(CodeableConcept newMethod) {
		if (newMethod != method) {
			NotificationChain msgs = null;
			if (method != null)
				msgs = ((InternalEObject)method).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_COLLECTION__METHOD, null, msgs);
			if (newMethod != null)
				msgs = ((InternalEObject)newMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_COLLECTION__METHOD, null, msgs);
			msgs = basicSetMethod(newMethod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_COLLECTION__METHOD, newMethod, newMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getBodySite() {
		return bodySite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBodySite(CodeableConcept newBodySite, NotificationChain msgs) {
		CodeableConcept oldBodySite = bodySite;
		bodySite = newBodySite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_COLLECTION__BODY_SITE, oldBodySite, newBodySite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBodySite(CodeableConcept newBodySite) {
		if (newBodySite != bodySite) {
			NotificationChain msgs = null;
			if (bodySite != null)
				msgs = ((InternalEObject)bodySite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_COLLECTION__BODY_SITE, null, msgs);
			if (newBodySite != null)
				msgs = ((InternalEObject)newBodySite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_COLLECTION__BODY_SITE, null, msgs);
			msgs = basicSetBodySite(newBodySite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_COLLECTION__BODY_SITE, newBodySite, newBodySite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getFastingStatusx() {
		return fastingStatusx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFastingStatusx(DataType newFastingStatusx, NotificationChain msgs) {
		DataType oldFastingStatusx = fastingStatusx;
		fastingStatusx = newFastingStatusx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_COLLECTION__FASTING_STATUSX, oldFastingStatusx, newFastingStatusx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFastingStatusx(DataType newFastingStatusx) {
		if (newFastingStatusx != fastingStatusx) {
			NotificationChain msgs = null;
			if (fastingStatusx != null)
				msgs = ((InternalEObject)fastingStatusx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_COLLECTION__FASTING_STATUSX, null, msgs);
			if (newFastingStatusx != null)
				msgs = ((InternalEObject)newFastingStatusx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.SPECIMEN_COLLECTION__FASTING_STATUSX, null, msgs);
			msgs = basicSetFastingStatusx(newFastingStatusx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.SPECIMEN_COLLECTION__FASTING_STATUSX, newFastingStatusx, newFastingStatusx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.SPECIMEN_COLLECTION__COLLECTOR:
				return basicSetCollector(null, msgs);
			case ResourcesPackage.SPECIMEN_COLLECTION__COLLECTEDX:
				return basicSetCollectedx(null, msgs);
			case ResourcesPackage.SPECIMEN_COLLECTION__DURATION:
				return basicSetDuration(null, msgs);
			case ResourcesPackage.SPECIMEN_COLLECTION__QUANTITY:
				return basicSetQuantity(null, msgs);
			case ResourcesPackage.SPECIMEN_COLLECTION__METHOD:
				return basicSetMethod(null, msgs);
			case ResourcesPackage.SPECIMEN_COLLECTION__BODY_SITE:
				return basicSetBodySite(null, msgs);
			case ResourcesPackage.SPECIMEN_COLLECTION__FASTING_STATUSX:
				return basicSetFastingStatusx(null, msgs);
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
			case ResourcesPackage.SPECIMEN_COLLECTION__COLLECTOR:
				return getCollector();
			case ResourcesPackage.SPECIMEN_COLLECTION__COLLECTEDX:
				return getCollectedx();
			case ResourcesPackage.SPECIMEN_COLLECTION__DURATION:
				return getDuration();
			case ResourcesPackage.SPECIMEN_COLLECTION__QUANTITY:
				return getQuantity();
			case ResourcesPackage.SPECIMEN_COLLECTION__METHOD:
				return getMethod();
			case ResourcesPackage.SPECIMEN_COLLECTION__BODY_SITE:
				return getBodySite();
			case ResourcesPackage.SPECIMEN_COLLECTION__FASTING_STATUSX:
				return getFastingStatusx();
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
			case ResourcesPackage.SPECIMEN_COLLECTION__COLLECTOR:
				setCollector((Reference)newValue);
				return;
			case ResourcesPackage.SPECIMEN_COLLECTION__COLLECTEDX:
				setCollectedx((DataType)newValue);
				return;
			case ResourcesPackage.SPECIMEN_COLLECTION__DURATION:
				setDuration((Duration)newValue);
				return;
			case ResourcesPackage.SPECIMEN_COLLECTION__QUANTITY:
				setQuantity((Quantity)newValue);
				return;
			case ResourcesPackage.SPECIMEN_COLLECTION__METHOD:
				setMethod((CodeableConcept)newValue);
				return;
			case ResourcesPackage.SPECIMEN_COLLECTION__BODY_SITE:
				setBodySite((CodeableConcept)newValue);
				return;
			case ResourcesPackage.SPECIMEN_COLLECTION__FASTING_STATUSX:
				setFastingStatusx((DataType)newValue);
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
			case ResourcesPackage.SPECIMEN_COLLECTION__COLLECTOR:
				setCollector((Reference)null);
				return;
			case ResourcesPackage.SPECIMEN_COLLECTION__COLLECTEDX:
				setCollectedx((DataType)null);
				return;
			case ResourcesPackage.SPECIMEN_COLLECTION__DURATION:
				setDuration((Duration)null);
				return;
			case ResourcesPackage.SPECIMEN_COLLECTION__QUANTITY:
				setQuantity((Quantity)null);
				return;
			case ResourcesPackage.SPECIMEN_COLLECTION__METHOD:
				setMethod((CodeableConcept)null);
				return;
			case ResourcesPackage.SPECIMEN_COLLECTION__BODY_SITE:
				setBodySite((CodeableConcept)null);
				return;
			case ResourcesPackage.SPECIMEN_COLLECTION__FASTING_STATUSX:
				setFastingStatusx((DataType)null);
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
			case ResourcesPackage.SPECIMEN_COLLECTION__COLLECTOR:
				return collector != null;
			case ResourcesPackage.SPECIMEN_COLLECTION__COLLECTEDX:
				return collectedx != null;
			case ResourcesPackage.SPECIMEN_COLLECTION__DURATION:
				return duration != null;
			case ResourcesPackage.SPECIMEN_COLLECTION__QUANTITY:
				return quantity != null;
			case ResourcesPackage.SPECIMEN_COLLECTION__METHOD:
				return method != null;
			case ResourcesPackage.SPECIMEN_COLLECTION__BODY_SITE:
				return bodySite != null;
			case ResourcesPackage.SPECIMEN_COLLECTION__FASTING_STATUSX:
				return fastingStatusx != null;
		}
		return super.eIsSet(featureID);
	}

} //SpecimenCollectionImpl
