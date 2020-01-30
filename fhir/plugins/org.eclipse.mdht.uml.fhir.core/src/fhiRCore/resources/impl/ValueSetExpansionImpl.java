/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Uri;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.ResourcesPackage;
import fhiRCore.resources.ValueSetExpansion;
import fhiRCore.resources.ValueSetExpansionContains;
import fhiRCore.resources.ValueSetExpansionParameter;

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
 * An implementation of the model object '<em><b>Value Set Expansion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.ValueSetExpansionImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ValueSetExpansionImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ValueSetExpansionImpl#getTotal <em>Total</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ValueSetExpansionImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ValueSetExpansionImpl#getParameters <em>Parameter</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ValueSetExpansionImpl#getContains <em>Contains</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueSetExpansionImpl extends BackboneElementImpl implements ValueSetExpansion {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Uri identifier;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected DateTime timestamp;

	/**
	 * The cached value of the '{@link #getTotal() <em>Total</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Integer total;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Integer offset;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSetExpansionParameter> parameters;

	/**
	 * The cached value of the '{@link #getContains() <em>Contains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSetExpansionContains> contains;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueSetExpansionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getValueSetExpansion();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(Uri newIdentifier, NotificationChain msgs) {
		Uri oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.VALUE_SET_EXPANSION__IDENTIFIER, oldIdentifier, newIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(Uri newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VALUE_SET_EXPANSION__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VALUE_SET_EXPANSION__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.VALUE_SET_EXPANSION__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimestamp(DateTime newTimestamp, NotificationChain msgs) {
		DateTime oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.VALUE_SET_EXPANSION__TIMESTAMP, oldTimestamp, newTimestamp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimestamp(DateTime newTimestamp) {
		if (newTimestamp != timestamp) {
			NotificationChain msgs = null;
			if (timestamp != null)
				msgs = ((InternalEObject)timestamp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VALUE_SET_EXPANSION__TIMESTAMP, null, msgs);
			if (newTimestamp != null)
				msgs = ((InternalEObject)newTimestamp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VALUE_SET_EXPANSION__TIMESTAMP, null, msgs);
			msgs = basicSetTimestamp(newTimestamp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.VALUE_SET_EXPANSION__TIMESTAMP, newTimestamp, newTimestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Integer getTotal() {
		return total;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTotal(fhiRCore.dataTypes.Integer newTotal, NotificationChain msgs) {
		fhiRCore.dataTypes.Integer oldTotal = total;
		total = newTotal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.VALUE_SET_EXPANSION__TOTAL, oldTotal, newTotal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotal(fhiRCore.dataTypes.Integer newTotal) {
		if (newTotal != total) {
			NotificationChain msgs = null;
			if (total != null)
				msgs = ((InternalEObject)total).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VALUE_SET_EXPANSION__TOTAL, null, msgs);
			if (newTotal != null)
				msgs = ((InternalEObject)newTotal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VALUE_SET_EXPANSION__TOTAL, null, msgs);
			msgs = basicSetTotal(newTotal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.VALUE_SET_EXPANSION__TOTAL, newTotal, newTotal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Integer getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOffset(fhiRCore.dataTypes.Integer newOffset, NotificationChain msgs) {
		fhiRCore.dataTypes.Integer oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.VALUE_SET_EXPANSION__OFFSET, oldOffset, newOffset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffset(fhiRCore.dataTypes.Integer newOffset) {
		if (newOffset != offset) {
			NotificationChain msgs = null;
			if (offset != null)
				msgs = ((InternalEObject)offset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VALUE_SET_EXPANSION__OFFSET, null, msgs);
			if (newOffset != null)
				msgs = ((InternalEObject)newOffset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VALUE_SET_EXPANSION__OFFSET, null, msgs);
			msgs = basicSetOffset(newOffset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.VALUE_SET_EXPANSION__OFFSET, newOffset, newOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSetExpansionParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<ValueSetExpansionParameter>(ValueSetExpansionParameter.class, this, ResourcesPackage.VALUE_SET_EXPANSION__PARAMETER);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSetExpansionContains> getContains() {
		if (contains == null) {
			contains = new EObjectContainmentEList<ValueSetExpansionContains>(ValueSetExpansionContains.class, this, ResourcesPackage.VALUE_SET_EXPANSION__CONTAINS);
		}
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.VALUE_SET_EXPANSION__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case ResourcesPackage.VALUE_SET_EXPANSION__TIMESTAMP:
				return basicSetTimestamp(null, msgs);
			case ResourcesPackage.VALUE_SET_EXPANSION__TOTAL:
				return basicSetTotal(null, msgs);
			case ResourcesPackage.VALUE_SET_EXPANSION__OFFSET:
				return basicSetOffset(null, msgs);
			case ResourcesPackage.VALUE_SET_EXPANSION__PARAMETER:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.VALUE_SET_EXPANSION__CONTAINS:
				return ((InternalEList<?>)getContains()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.VALUE_SET_EXPANSION__IDENTIFIER:
				return getIdentifier();
			case ResourcesPackage.VALUE_SET_EXPANSION__TIMESTAMP:
				return getTimestamp();
			case ResourcesPackage.VALUE_SET_EXPANSION__TOTAL:
				return getTotal();
			case ResourcesPackage.VALUE_SET_EXPANSION__OFFSET:
				return getOffset();
			case ResourcesPackage.VALUE_SET_EXPANSION__PARAMETER:
				return getParameters();
			case ResourcesPackage.VALUE_SET_EXPANSION__CONTAINS:
				return getContains();
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
			case ResourcesPackage.VALUE_SET_EXPANSION__IDENTIFIER:
				setIdentifier((Uri)newValue);
				return;
			case ResourcesPackage.VALUE_SET_EXPANSION__TIMESTAMP:
				setTimestamp((DateTime)newValue);
				return;
			case ResourcesPackage.VALUE_SET_EXPANSION__TOTAL:
				setTotal((fhiRCore.dataTypes.Integer)newValue);
				return;
			case ResourcesPackage.VALUE_SET_EXPANSION__OFFSET:
				setOffset((fhiRCore.dataTypes.Integer)newValue);
				return;
			case ResourcesPackage.VALUE_SET_EXPANSION__PARAMETER:
				getParameters().clear();
				getParameters().addAll((Collection<? extends ValueSetExpansionParameter>)newValue);
				return;
			case ResourcesPackage.VALUE_SET_EXPANSION__CONTAINS:
				getContains().clear();
				getContains().addAll((Collection<? extends ValueSetExpansionContains>)newValue);
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
			case ResourcesPackage.VALUE_SET_EXPANSION__IDENTIFIER:
				setIdentifier((Uri)null);
				return;
			case ResourcesPackage.VALUE_SET_EXPANSION__TIMESTAMP:
				setTimestamp((DateTime)null);
				return;
			case ResourcesPackage.VALUE_SET_EXPANSION__TOTAL:
				setTotal((fhiRCore.dataTypes.Integer)null);
				return;
			case ResourcesPackage.VALUE_SET_EXPANSION__OFFSET:
				setOffset((fhiRCore.dataTypes.Integer)null);
				return;
			case ResourcesPackage.VALUE_SET_EXPANSION__PARAMETER:
				getParameters().clear();
				return;
			case ResourcesPackage.VALUE_SET_EXPANSION__CONTAINS:
				getContains().clear();
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
			case ResourcesPackage.VALUE_SET_EXPANSION__IDENTIFIER:
				return identifier != null;
			case ResourcesPackage.VALUE_SET_EXPANSION__TIMESTAMP:
				return timestamp != null;
			case ResourcesPackage.VALUE_SET_EXPANSION__TOTAL:
				return total != null;
			case ResourcesPackage.VALUE_SET_EXPANSION__OFFSET:
				return offset != null;
			case ResourcesPackage.VALUE_SET_EXPANSION__PARAMETER:
				return parameters != null && !parameters.isEmpty();
			case ResourcesPackage.VALUE_SET_EXPANSION__CONTAINS:
				return contains != null && !contains.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ValueSetExpansionImpl
