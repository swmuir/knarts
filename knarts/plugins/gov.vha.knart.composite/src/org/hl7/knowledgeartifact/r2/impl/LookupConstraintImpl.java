/**
 */
package org.hl7.knowledgeartifact.r2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.elm.r1.Expression;

import org.hl7.knowledgeartifact.r2.LookupConstraint;
import org.hl7.knowledgeartifact.r2.R2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lookup Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.LookupConstraintImpl#getItems <em>Items</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.LookupConstraintImpl#getDisplayField <em>Display Field</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.LookupConstraintImpl#isStrictSelection <em>Strict Selection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LookupConstraintImpl extends RangeConstraintImpl implements LookupConstraint {
	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected Expression items;

	/**
	 * The default value of the '{@link #getDisplayField() <em>Display Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayField()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_FIELD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayField() <em>Display Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayField()
	 * @generated
	 * @ordered
	 */
	protected String displayField = DISPLAY_FIELD_EDEFAULT;

	/**
	 * The default value of the '{@link #isStrictSelection() <em>Strict Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStrictSelection()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STRICT_SELECTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStrictSelection() <em>Strict Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStrictSelection()
	 * @generated
	 * @ordered
	 */
	protected boolean strictSelection = STRICT_SELECTION_EDEFAULT;

	/**
	 * This is true if the Strict Selection attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean strictSelectionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LookupConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R2Package.eINSTANCE.getLookupConstraint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getItems() {
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItems(Expression newItems, NotificationChain msgs) {
		Expression oldItems = items;
		items = newItems;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.LOOKUP_CONSTRAINT__ITEMS, oldItems, newItems);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItems(Expression newItems) {
		if (newItems != items) {
			NotificationChain msgs = null;
			if (items != null)
				msgs = ((InternalEObject)items).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.LOOKUP_CONSTRAINT__ITEMS, null, msgs);
			if (newItems != null)
				msgs = ((InternalEObject)newItems).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.LOOKUP_CONSTRAINT__ITEMS, null, msgs);
			msgs = basicSetItems(newItems, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.LOOKUP_CONSTRAINT__ITEMS, newItems, newItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplayField() {
		return displayField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayField(String newDisplayField) {
		String oldDisplayField = displayField;
		displayField = newDisplayField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.LOOKUP_CONSTRAINT__DISPLAY_FIELD, oldDisplayField, displayField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStrictSelection() {
		return strictSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrictSelection(boolean newStrictSelection) {
		boolean oldStrictSelection = strictSelection;
		strictSelection = newStrictSelection;
		boolean oldStrictSelectionESet = strictSelectionESet;
		strictSelectionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.LOOKUP_CONSTRAINT__STRICT_SELECTION, oldStrictSelection, strictSelection, !oldStrictSelectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStrictSelection() {
		boolean oldStrictSelection = strictSelection;
		boolean oldStrictSelectionESet = strictSelectionESet;
		strictSelection = STRICT_SELECTION_EDEFAULT;
		strictSelectionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, R2Package.LOOKUP_CONSTRAINT__STRICT_SELECTION, oldStrictSelection, STRICT_SELECTION_EDEFAULT, oldStrictSelectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStrictSelection() {
		return strictSelectionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R2Package.LOOKUP_CONSTRAINT__ITEMS:
				return basicSetItems(null, msgs);
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
			case R2Package.LOOKUP_CONSTRAINT__ITEMS:
				return getItems();
			case R2Package.LOOKUP_CONSTRAINT__DISPLAY_FIELD:
				return getDisplayField();
			case R2Package.LOOKUP_CONSTRAINT__STRICT_SELECTION:
				return isStrictSelection();
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
			case R2Package.LOOKUP_CONSTRAINT__ITEMS:
				setItems((Expression)newValue);
				return;
			case R2Package.LOOKUP_CONSTRAINT__DISPLAY_FIELD:
				setDisplayField((String)newValue);
				return;
			case R2Package.LOOKUP_CONSTRAINT__STRICT_SELECTION:
				setStrictSelection((Boolean)newValue);
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
			case R2Package.LOOKUP_CONSTRAINT__ITEMS:
				setItems((Expression)null);
				return;
			case R2Package.LOOKUP_CONSTRAINT__DISPLAY_FIELD:
				setDisplayField(DISPLAY_FIELD_EDEFAULT);
				return;
			case R2Package.LOOKUP_CONSTRAINT__STRICT_SELECTION:
				unsetStrictSelection();
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
			case R2Package.LOOKUP_CONSTRAINT__ITEMS:
				return items != null;
			case R2Package.LOOKUP_CONSTRAINT__DISPLAY_FIELD:
				return DISPLAY_FIELD_EDEFAULT == null ? displayField != null : !DISPLAY_FIELD_EDEFAULT.equals(displayField);
			case R2Package.LOOKUP_CONSTRAINT__STRICT_SELECTION:
				return isSetStrictSelection();
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
		result.append(" (displayField: ");
		result.append(displayField);
		result.append(", strictSelection: ");
		if (strictSelectionESet) result.append(strictSelection); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //LookupConstraintImpl
