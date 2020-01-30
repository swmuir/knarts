/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.Decimal;
import fhiRCore.dataTypes.Period;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.BiologicallyDerivedProductStorage;
import fhiRCore.resources.ResourcesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Biologically Derived Product Storage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.BiologicallyDerivedProductStorageImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.BiologicallyDerivedProductStorageImpl#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.BiologicallyDerivedProductStorageImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.BiologicallyDerivedProductStorageImpl#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BiologicallyDerivedProductStorageImpl extends BackboneElementImpl implements BiologicallyDerivedProductStorage {
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
	 * The cached value of the '{@link #getTemperature() <em>Temperature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperature()
	 * @generated
	 * @ordered
	 */
	protected Decimal temperature;

	/**
	 * The cached value of the '{@link #getScale() <em>Scale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected Code scale;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected Period duration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BiologicallyDerivedProductStorageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getBiologicallyDerivedProductStorage();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decimal getTemperature() {
		return temperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemperature(Decimal newTemperature, NotificationChain msgs) {
		Decimal oldTemperature = temperature;
		temperature = newTemperature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__TEMPERATURE, oldTemperature, newTemperature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemperature(Decimal newTemperature) {
		if (newTemperature != temperature) {
			NotificationChain msgs = null;
			if (temperature != null)
				msgs = ((InternalEObject)temperature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__TEMPERATURE, null, msgs);
			if (newTemperature != null)
				msgs = ((InternalEObject)newTemperature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__TEMPERATURE, null, msgs);
			msgs = basicSetTemperature(newTemperature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__TEMPERATURE, newTemperature, newTemperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getScale() {
		return scale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScale(Code newScale, NotificationChain msgs) {
		Code oldScale = scale;
		scale = newScale;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__SCALE, oldScale, newScale);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScale(Code newScale) {
		if (newScale != scale) {
			NotificationChain msgs = null;
			if (scale != null)
				msgs = ((InternalEObject)scale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__SCALE, null, msgs);
			if (newScale != null)
				msgs = ((InternalEObject)newScale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__SCALE, null, msgs);
			msgs = basicSetScale(newScale, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__SCALE, newScale, newScale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDuration(Period newDuration, NotificationChain msgs) {
		Period oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__DURATION, oldDuration, newDuration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(Period newDuration) {
		if (newDuration != duration) {
			NotificationChain msgs = null;
			if (duration != null)
				msgs = ((InternalEObject)duration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__DURATION, null, msgs);
			if (newDuration != null)
				msgs = ((InternalEObject)newDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__DURATION, null, msgs);
			msgs = basicSetDuration(newDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__DURATION, newDuration, newDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__TEMPERATURE:
				return basicSetTemperature(null, msgs);
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__SCALE:
				return basicSetScale(null, msgs);
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__DURATION:
				return basicSetDuration(null, msgs);
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
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__DESCRIPTION:
				return getDescription();
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__TEMPERATURE:
				return getTemperature();
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__SCALE:
				return getScale();
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__DURATION:
				return getDuration();
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
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__DESCRIPTION:
				setDescription((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__TEMPERATURE:
				setTemperature((Decimal)newValue);
				return;
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__SCALE:
				setScale((Code)newValue);
				return;
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__DURATION:
				setDuration((Period)newValue);
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
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__DESCRIPTION:
				setDescription((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__TEMPERATURE:
				setTemperature((Decimal)null);
				return;
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__SCALE:
				setScale((Code)null);
				return;
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__DURATION:
				setDuration((Period)null);
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
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__DESCRIPTION:
				return description != null;
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__TEMPERATURE:
				return temperature != null;
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__SCALE:
				return scale != null;
			case ResourcesPackage.BIOLOGICALLY_DERIVED_PRODUCT_STORAGE__DURATION:
				return duration != null;
		}
		return super.eIsSet(featureID);
	}

} //BiologicallyDerivedProductStorageImpl
