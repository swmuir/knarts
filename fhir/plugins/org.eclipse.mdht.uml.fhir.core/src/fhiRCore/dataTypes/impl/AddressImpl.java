/**
 */
package fhiRCore.dataTypes.impl;

import fhiRCore.dataTypes.Address;
import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.DataTypesPackage;
import fhiRCore.dataTypes.Period;

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
 * An implementation of the model object '<em><b>Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.dataTypes.impl.AddressImpl#getUse <em>Use</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.AddressImpl#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.AddressImpl#getText <em>Text</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.AddressImpl#getLines <em>Line</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.AddressImpl#getCity <em>City</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.AddressImpl#getDistrict <em>District</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.AddressImpl#getState <em>State</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.AddressImpl#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.AddressImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.AddressImpl#getPeriod <em>Period</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddressImpl extends DataTypeImpl implements Address {
	/**
	 * The cached value of the '{@link #getUse() <em>Use</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse()
	 * @generated
	 * @ordered
	 */
	protected Code use;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Code type;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String text;

	/**
	 * The cached value of the '{@link #getLines() <em>Line</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLines()
	 * @generated
	 * @ordered
	 */
	protected EList<fhiRCore.dataTypes.String> lines;

	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String city;

	/**
	 * The cached value of the '{@link #getDistrict() <em>District</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistrict()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String district;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String state;

	/**
	 * The cached value of the '{@link #getPostalCode() <em>Postal Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalCode()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String postalCode;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String country;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Period period;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataTypesPackage.Literals.ADDRESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getUse() {
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUse(Code newUse, NotificationChain msgs) {
		Code oldUse = use;
		use = newUse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ADDRESS__USE, oldUse, newUse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUse(Code newUse) {
		if (newUse != use) {
			NotificationChain msgs = null;
			if (use != null)
				msgs = ((InternalEObject)use).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ADDRESS__USE, null, msgs);
			if (newUse != null)
				msgs = ((InternalEObject)newUse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ADDRESS__USE, null, msgs);
			msgs = basicSetUse(newUse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ADDRESS__USE, newUse, newUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Code newType, NotificationChain msgs) {
		Code oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ADDRESS__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Code newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ADDRESS__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ADDRESS__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ADDRESS__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetText(fhiRCore.dataTypes.String newText, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldText = text;
		text = newText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ADDRESS__TEXT, oldText, newText);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(fhiRCore.dataTypes.String newText) {
		if (newText != text) {
			NotificationChain msgs = null;
			if (text != null)
				msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ADDRESS__TEXT, null, msgs);
			if (newText != null)
				msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ADDRESS__TEXT, null, msgs);
			msgs = basicSetText(newText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ADDRESS__TEXT, newText, newText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<fhiRCore.dataTypes.String> getLines() {
		if (lines == null) {
			lines = new EObjectContainmentEList<fhiRCore.dataTypes.String>(fhiRCore.dataTypes.String.class, this, DataTypesPackage.ADDRESS__LINE);
		}
		return lines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getCity() {
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCity(fhiRCore.dataTypes.String newCity, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldCity = city;
		city = newCity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ADDRESS__CITY, oldCity, newCity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCity(fhiRCore.dataTypes.String newCity) {
		if (newCity != city) {
			NotificationChain msgs = null;
			if (city != null)
				msgs = ((InternalEObject)city).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ADDRESS__CITY, null, msgs);
			if (newCity != null)
				msgs = ((InternalEObject)newCity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ADDRESS__CITY, null, msgs);
			msgs = basicSetCity(newCity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ADDRESS__CITY, newCity, newCity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getDistrict() {
		return district;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDistrict(fhiRCore.dataTypes.String newDistrict, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldDistrict = district;
		district = newDistrict;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ADDRESS__DISTRICT, oldDistrict, newDistrict);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistrict(fhiRCore.dataTypes.String newDistrict) {
		if (newDistrict != district) {
			NotificationChain msgs = null;
			if (district != null)
				msgs = ((InternalEObject)district).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ADDRESS__DISTRICT, null, msgs);
			if (newDistrict != null)
				msgs = ((InternalEObject)newDistrict).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ADDRESS__DISTRICT, null, msgs);
			msgs = basicSetDistrict(newDistrict, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ADDRESS__DISTRICT, newDistrict, newDistrict));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetState(fhiRCore.dataTypes.String newState, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldState = state;
		state = newState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ADDRESS__STATE, oldState, newState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(fhiRCore.dataTypes.String newState) {
		if (newState != state) {
			NotificationChain msgs = null;
			if (state != null)
				msgs = ((InternalEObject)state).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ADDRESS__STATE, null, msgs);
			if (newState != null)
				msgs = ((InternalEObject)newState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ADDRESS__STATE, null, msgs);
			msgs = basicSetState(newState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ADDRESS__STATE, newState, newState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getPostalCode() {
		return postalCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostalCode(fhiRCore.dataTypes.String newPostalCode, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldPostalCode = postalCode;
		postalCode = newPostalCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ADDRESS__POSTAL_CODE, oldPostalCode, newPostalCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostalCode(fhiRCore.dataTypes.String newPostalCode) {
		if (newPostalCode != postalCode) {
			NotificationChain msgs = null;
			if (postalCode != null)
				msgs = ((InternalEObject)postalCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ADDRESS__POSTAL_CODE, null, msgs);
			if (newPostalCode != null)
				msgs = ((InternalEObject)newPostalCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ADDRESS__POSTAL_CODE, null, msgs);
			msgs = basicSetPostalCode(newPostalCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ADDRESS__POSTAL_CODE, newPostalCode, newPostalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCountry(fhiRCore.dataTypes.String newCountry, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldCountry = country;
		country = newCountry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ADDRESS__COUNTRY, oldCountry, newCountry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(fhiRCore.dataTypes.String newCountry) {
		if (newCountry != country) {
			NotificationChain msgs = null;
			if (country != null)
				msgs = ((InternalEObject)country).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ADDRESS__COUNTRY, null, msgs);
			if (newCountry != null)
				msgs = ((InternalEObject)newCountry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ADDRESS__COUNTRY, null, msgs);
			msgs = basicSetCountry(newCountry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ADDRESS__COUNTRY, newCountry, newCountry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Period getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriod(Period newPeriod, NotificationChain msgs) {
		Period oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ADDRESS__PERIOD, oldPeriod, newPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(Period newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ADDRESS__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ADDRESS__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ADDRESS__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataTypesPackage.ADDRESS__USE:
				return basicSetUse(null, msgs);
			case DataTypesPackage.ADDRESS__TYPE:
				return basicSetType(null, msgs);
			case DataTypesPackage.ADDRESS__TEXT:
				return basicSetText(null, msgs);
			case DataTypesPackage.ADDRESS__LINE:
				return ((InternalEList<?>)getLines()).basicRemove(otherEnd, msgs);
			case DataTypesPackage.ADDRESS__CITY:
				return basicSetCity(null, msgs);
			case DataTypesPackage.ADDRESS__DISTRICT:
				return basicSetDistrict(null, msgs);
			case DataTypesPackage.ADDRESS__STATE:
				return basicSetState(null, msgs);
			case DataTypesPackage.ADDRESS__POSTAL_CODE:
				return basicSetPostalCode(null, msgs);
			case DataTypesPackage.ADDRESS__COUNTRY:
				return basicSetCountry(null, msgs);
			case DataTypesPackage.ADDRESS__PERIOD:
				return basicSetPeriod(null, msgs);
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
			case DataTypesPackage.ADDRESS__USE:
				return getUse();
			case DataTypesPackage.ADDRESS__TYPE:
				return getType();
			case DataTypesPackage.ADDRESS__TEXT:
				return getText();
			case DataTypesPackage.ADDRESS__LINE:
				return getLines();
			case DataTypesPackage.ADDRESS__CITY:
				return getCity();
			case DataTypesPackage.ADDRESS__DISTRICT:
				return getDistrict();
			case DataTypesPackage.ADDRESS__STATE:
				return getState();
			case DataTypesPackage.ADDRESS__POSTAL_CODE:
				return getPostalCode();
			case DataTypesPackage.ADDRESS__COUNTRY:
				return getCountry();
			case DataTypesPackage.ADDRESS__PERIOD:
				return getPeriod();
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
			case DataTypesPackage.ADDRESS__USE:
				setUse((Code)newValue);
				return;
			case DataTypesPackage.ADDRESS__TYPE:
				setType((Code)newValue);
				return;
			case DataTypesPackage.ADDRESS__TEXT:
				setText((fhiRCore.dataTypes.String)newValue);
				return;
			case DataTypesPackage.ADDRESS__LINE:
				getLines().clear();
				getLines().addAll((Collection<? extends fhiRCore.dataTypes.String>)newValue);
				return;
			case DataTypesPackage.ADDRESS__CITY:
				setCity((fhiRCore.dataTypes.String)newValue);
				return;
			case DataTypesPackage.ADDRESS__DISTRICT:
				setDistrict((fhiRCore.dataTypes.String)newValue);
				return;
			case DataTypesPackage.ADDRESS__STATE:
				setState((fhiRCore.dataTypes.String)newValue);
				return;
			case DataTypesPackage.ADDRESS__POSTAL_CODE:
				setPostalCode((fhiRCore.dataTypes.String)newValue);
				return;
			case DataTypesPackage.ADDRESS__COUNTRY:
				setCountry((fhiRCore.dataTypes.String)newValue);
				return;
			case DataTypesPackage.ADDRESS__PERIOD:
				setPeriod((Period)newValue);
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
			case DataTypesPackage.ADDRESS__USE:
				setUse((Code)null);
				return;
			case DataTypesPackage.ADDRESS__TYPE:
				setType((Code)null);
				return;
			case DataTypesPackage.ADDRESS__TEXT:
				setText((fhiRCore.dataTypes.String)null);
				return;
			case DataTypesPackage.ADDRESS__LINE:
				getLines().clear();
				return;
			case DataTypesPackage.ADDRESS__CITY:
				setCity((fhiRCore.dataTypes.String)null);
				return;
			case DataTypesPackage.ADDRESS__DISTRICT:
				setDistrict((fhiRCore.dataTypes.String)null);
				return;
			case DataTypesPackage.ADDRESS__STATE:
				setState((fhiRCore.dataTypes.String)null);
				return;
			case DataTypesPackage.ADDRESS__POSTAL_CODE:
				setPostalCode((fhiRCore.dataTypes.String)null);
				return;
			case DataTypesPackage.ADDRESS__COUNTRY:
				setCountry((fhiRCore.dataTypes.String)null);
				return;
			case DataTypesPackage.ADDRESS__PERIOD:
				setPeriod((Period)null);
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
			case DataTypesPackage.ADDRESS__USE:
				return use != null;
			case DataTypesPackage.ADDRESS__TYPE:
				return type != null;
			case DataTypesPackage.ADDRESS__TEXT:
				return text != null;
			case DataTypesPackage.ADDRESS__LINE:
				return lines != null && !lines.isEmpty();
			case DataTypesPackage.ADDRESS__CITY:
				return city != null;
			case DataTypesPackage.ADDRESS__DISTRICT:
				return district != null;
			case DataTypesPackage.ADDRESS__STATE:
				return state != null;
			case DataTypesPackage.ADDRESS__POSTAL_CODE:
				return postalCode != null;
			case DataTypesPackage.ADDRESS__COUNTRY:
				return country != null;
			case DataTypesPackage.ADDRESS__PERIOD:
				return period != null;
		}
		return super.eIsSet(featureID);
	}

} //AddressImpl
