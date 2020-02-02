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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.knowledgeartifact.r1.EnumerationConstraint;
import org.hl7.knowledgeartifact.r1.EnumerationItem;
import org.hl7.knowledgeartifact.r1.R1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.EnumerationConstraintImpl#getItem <em>Item</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.EnumerationConstraintImpl#isStrictSelection <em>Strict Selection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumerationConstraintImpl extends RangeConstraintImpl implements EnumerationConstraint {
	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumerationItem> item;

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
	protected EnumerationConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R1Package.Literals.ENUMERATION_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumerationItem> getItem() {
		if (item == null) {
			item = new EObjectContainmentEList<EnumerationItem>(EnumerationItem.class, this, R1Package.ENUMERATION_CONSTRAINT__ITEM);
		}
		return item;
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
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.ENUMERATION_CONSTRAINT__STRICT_SELECTION, oldStrictSelection, strictSelection, !oldStrictSelectionESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, R1Package.ENUMERATION_CONSTRAINT__STRICT_SELECTION, oldStrictSelection, STRICT_SELECTION_EDEFAULT, oldStrictSelectionESet));
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
			case R1Package.ENUMERATION_CONSTRAINT__ITEM:
				return ((InternalEList<?>)getItem()).basicRemove(otherEnd, msgs);
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
			case R1Package.ENUMERATION_CONSTRAINT__ITEM:
				return getItem();
			case R1Package.ENUMERATION_CONSTRAINT__STRICT_SELECTION:
				return isStrictSelection();
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
			case R1Package.ENUMERATION_CONSTRAINT__ITEM:
				getItem().clear();
				getItem().addAll((Collection<? extends EnumerationItem>)newValue);
				return;
			case R1Package.ENUMERATION_CONSTRAINT__STRICT_SELECTION:
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
			case R1Package.ENUMERATION_CONSTRAINT__ITEM:
				getItem().clear();
				return;
			case R1Package.ENUMERATION_CONSTRAINT__STRICT_SELECTION:
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
			case R1Package.ENUMERATION_CONSTRAINT__ITEM:
				return item != null && !item.isEmpty();
			case R1Package.ENUMERATION_CONSTRAINT__STRICT_SELECTION:
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
		result.append(" (strictSelection: ");
		if (strictSelectionESet) result.append(strictSelection); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //EnumerationConstraintImpl
