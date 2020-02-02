/**
 */
package org.hl7.knowledgeartifact.r1.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.elm.r1.Expression;

import org.hl7.knowledgeartifact.r1.CodesType;
import org.hl7.knowledgeartifact.r1.EnumerationItem;
import org.hl7.knowledgeartifact.r1.FormattedText;
import org.hl7.knowledgeartifact.r1.R1Package;
import org.hl7.knowledgeartifact.r1.VersionedIdentifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.EnumerationItemImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.EnumerationItemImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.EnumerationItemImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.EnumerationItemImpl#getCodes <em>Codes</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.EnumerationItemImpl#getDisplayText <em>Display Text</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.EnumerationItemImpl#getAdditionalInstructions <em>Additional Instructions</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.EnumerationItemImpl#getValueMeaning <em>Value Meaning</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.EnumerationItemImpl#isFillIn <em>Fill In</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumerationItemImpl extends MinimalEObjectImpl.Container implements EnumerationItem {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected VersionedIdentifier identifier;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected FormattedText number;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Expression value;

	/**
	 * The cached value of the '{@link #getCodes() <em>Codes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodes()
	 * @generated
	 * @ordered
	 */
	protected CodesType codes;

	/**
	 * The cached value of the '{@link #getDisplayText() <em>Display Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayText()
	 * @generated
	 * @ordered
	 */
	protected FormattedText displayText;

	/**
	 * The cached value of the '{@link #getAdditionalInstructions() <em>Additional Instructions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalInstructions()
	 * @generated
	 * @ordered
	 */
	protected EList<FormattedText> additionalInstructions;

	/**
	 * The cached value of the '{@link #getValueMeaning() <em>Value Meaning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueMeaning()
	 * @generated
	 * @ordered
	 */
	protected FormattedText valueMeaning;

	/**
	 * The default value of the '{@link #isFillIn() <em>Fill In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFillIn()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FILL_IN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFillIn() <em>Fill In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFillIn()
	 * @generated
	 * @ordered
	 */
	protected boolean fillIn = FILL_IN_EDEFAULT;

	/**
	 * This is true if the Fill In attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean fillInESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R1Package.Literals.ENUMERATION_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionedIdentifier getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(VersionedIdentifier newIdentifier, NotificationChain msgs) {
		VersionedIdentifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.ENUMERATION_ITEM__IDENTIFIER, oldIdentifier, newIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(VersionedIdentifier newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.ENUMERATION_ITEM__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.ENUMERATION_ITEM__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.ENUMERATION_ITEM__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormattedText getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumber(FormattedText newNumber, NotificationChain msgs) {
		FormattedText oldNumber = number;
		number = newNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.ENUMERATION_ITEM__NUMBER, oldNumber, newNumber);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(FormattedText newNumber) {
		if (newNumber != number) {
			NotificationChain msgs = null;
			if (number != null)
				msgs = ((InternalEObject)number).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.ENUMERATION_ITEM__NUMBER, null, msgs);
			if (newNumber != null)
				msgs = ((InternalEObject)newNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.ENUMERATION_ITEM__NUMBER, null, msgs);
			msgs = basicSetNumber(newNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.ENUMERATION_ITEM__NUMBER, newNumber, newNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue(Expression newValue, NotificationChain msgs) {
		Expression oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.ENUMERATION_ITEM__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Expression newValue) {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.ENUMERATION_ITEM__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.ENUMERATION_ITEM__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.ENUMERATION_ITEM__VALUE, newValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodesType getCodes() {
		return codes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCodes(CodesType newCodes, NotificationChain msgs) {
		CodesType oldCodes = codes;
		codes = newCodes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.ENUMERATION_ITEM__CODES, oldCodes, newCodes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodes(CodesType newCodes) {
		if (newCodes != codes) {
			NotificationChain msgs = null;
			if (codes != null)
				msgs = ((InternalEObject)codes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.ENUMERATION_ITEM__CODES, null, msgs);
			if (newCodes != null)
				msgs = ((InternalEObject)newCodes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.ENUMERATION_ITEM__CODES, null, msgs);
			msgs = basicSetCodes(newCodes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.ENUMERATION_ITEM__CODES, newCodes, newCodes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormattedText getDisplayText() {
		return displayText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisplayText(FormattedText newDisplayText, NotificationChain msgs) {
		FormattedText oldDisplayText = displayText;
		displayText = newDisplayText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.ENUMERATION_ITEM__DISPLAY_TEXT, oldDisplayText, newDisplayText);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayText(FormattedText newDisplayText) {
		if (newDisplayText != displayText) {
			NotificationChain msgs = null;
			if (displayText != null)
				msgs = ((InternalEObject)displayText).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.ENUMERATION_ITEM__DISPLAY_TEXT, null, msgs);
			if (newDisplayText != null)
				msgs = ((InternalEObject)newDisplayText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.ENUMERATION_ITEM__DISPLAY_TEXT, null, msgs);
			msgs = basicSetDisplayText(newDisplayText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.ENUMERATION_ITEM__DISPLAY_TEXT, newDisplayText, newDisplayText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FormattedText> getAdditionalInstructions() {
		if (additionalInstructions == null) {
			additionalInstructions = new EObjectContainmentEList<FormattedText>(FormattedText.class, this, R1Package.ENUMERATION_ITEM__ADDITIONAL_INSTRUCTIONS);
		}
		return additionalInstructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormattedText getValueMeaning() {
		return valueMeaning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueMeaning(FormattedText newValueMeaning, NotificationChain msgs) {
		FormattedText oldValueMeaning = valueMeaning;
		valueMeaning = newValueMeaning;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.ENUMERATION_ITEM__VALUE_MEANING, oldValueMeaning, newValueMeaning);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueMeaning(FormattedText newValueMeaning) {
		if (newValueMeaning != valueMeaning) {
			NotificationChain msgs = null;
			if (valueMeaning != null)
				msgs = ((InternalEObject)valueMeaning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.ENUMERATION_ITEM__VALUE_MEANING, null, msgs);
			if (newValueMeaning != null)
				msgs = ((InternalEObject)newValueMeaning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.ENUMERATION_ITEM__VALUE_MEANING, null, msgs);
			msgs = basicSetValueMeaning(newValueMeaning, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.ENUMERATION_ITEM__VALUE_MEANING, newValueMeaning, newValueMeaning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFillIn() {
		return fillIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFillIn(boolean newFillIn) {
		boolean oldFillIn = fillIn;
		fillIn = newFillIn;
		boolean oldFillInESet = fillInESet;
		fillInESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.ENUMERATION_ITEM__FILL_IN, oldFillIn, fillIn, !oldFillInESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFillIn() {
		boolean oldFillIn = fillIn;
		boolean oldFillInESet = fillInESet;
		fillIn = FILL_IN_EDEFAULT;
		fillInESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, R1Package.ENUMERATION_ITEM__FILL_IN, oldFillIn, FILL_IN_EDEFAULT, oldFillInESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFillIn() {
		return fillInESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R1Package.ENUMERATION_ITEM__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case R1Package.ENUMERATION_ITEM__NUMBER:
				return basicSetNumber(null, msgs);
			case R1Package.ENUMERATION_ITEM__VALUE:
				return basicSetValue(null, msgs);
			case R1Package.ENUMERATION_ITEM__CODES:
				return basicSetCodes(null, msgs);
			case R1Package.ENUMERATION_ITEM__DISPLAY_TEXT:
				return basicSetDisplayText(null, msgs);
			case R1Package.ENUMERATION_ITEM__ADDITIONAL_INSTRUCTIONS:
				return ((InternalEList<?>)getAdditionalInstructions()).basicRemove(otherEnd, msgs);
			case R1Package.ENUMERATION_ITEM__VALUE_MEANING:
				return basicSetValueMeaning(null, msgs);
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
			case R1Package.ENUMERATION_ITEM__IDENTIFIER:
				return getIdentifier();
			case R1Package.ENUMERATION_ITEM__NUMBER:
				return getNumber();
			case R1Package.ENUMERATION_ITEM__VALUE:
				return getValue();
			case R1Package.ENUMERATION_ITEM__CODES:
				return getCodes();
			case R1Package.ENUMERATION_ITEM__DISPLAY_TEXT:
				return getDisplayText();
			case R1Package.ENUMERATION_ITEM__ADDITIONAL_INSTRUCTIONS:
				return getAdditionalInstructions();
			case R1Package.ENUMERATION_ITEM__VALUE_MEANING:
				return getValueMeaning();
			case R1Package.ENUMERATION_ITEM__FILL_IN:
				return isFillIn();
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
			case R1Package.ENUMERATION_ITEM__IDENTIFIER:
				setIdentifier((VersionedIdentifier)newValue);
				return;
			case R1Package.ENUMERATION_ITEM__NUMBER:
				setNumber((FormattedText)newValue);
				return;
			case R1Package.ENUMERATION_ITEM__VALUE:
				setValue((Expression)newValue);
				return;
			case R1Package.ENUMERATION_ITEM__CODES:
				setCodes((CodesType)newValue);
				return;
			case R1Package.ENUMERATION_ITEM__DISPLAY_TEXT:
				setDisplayText((FormattedText)newValue);
				return;
			case R1Package.ENUMERATION_ITEM__ADDITIONAL_INSTRUCTIONS:
				getAdditionalInstructions().clear();
				getAdditionalInstructions().addAll((Collection<? extends FormattedText>)newValue);
				return;
			case R1Package.ENUMERATION_ITEM__VALUE_MEANING:
				setValueMeaning((FormattedText)newValue);
				return;
			case R1Package.ENUMERATION_ITEM__FILL_IN:
				setFillIn((Boolean)newValue);
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
			case R1Package.ENUMERATION_ITEM__IDENTIFIER:
				setIdentifier((VersionedIdentifier)null);
				return;
			case R1Package.ENUMERATION_ITEM__NUMBER:
				setNumber((FormattedText)null);
				return;
			case R1Package.ENUMERATION_ITEM__VALUE:
				setValue((Expression)null);
				return;
			case R1Package.ENUMERATION_ITEM__CODES:
				setCodes((CodesType)null);
				return;
			case R1Package.ENUMERATION_ITEM__DISPLAY_TEXT:
				setDisplayText((FormattedText)null);
				return;
			case R1Package.ENUMERATION_ITEM__ADDITIONAL_INSTRUCTIONS:
				getAdditionalInstructions().clear();
				return;
			case R1Package.ENUMERATION_ITEM__VALUE_MEANING:
				setValueMeaning((FormattedText)null);
				return;
			case R1Package.ENUMERATION_ITEM__FILL_IN:
				unsetFillIn();
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
			case R1Package.ENUMERATION_ITEM__IDENTIFIER:
				return identifier != null;
			case R1Package.ENUMERATION_ITEM__NUMBER:
				return number != null;
			case R1Package.ENUMERATION_ITEM__VALUE:
				return value != null;
			case R1Package.ENUMERATION_ITEM__CODES:
				return codes != null;
			case R1Package.ENUMERATION_ITEM__DISPLAY_TEXT:
				return displayText != null;
			case R1Package.ENUMERATION_ITEM__ADDITIONAL_INSTRUCTIONS:
				return additionalInstructions != null && !additionalInstructions.isEmpty();
			case R1Package.ENUMERATION_ITEM__VALUE_MEANING:
				return valueMeaning != null;
			case R1Package.ENUMERATION_ITEM__FILL_IN:
				return isSetFillIn();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (fillIn: ");
		if (fillInESet) result.append(fillIn); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //EnumerationItemImpl
