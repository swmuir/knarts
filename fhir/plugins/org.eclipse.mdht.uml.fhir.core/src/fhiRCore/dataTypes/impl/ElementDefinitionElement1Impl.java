/**
 */
package fhiRCore.dataTypes.impl;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.DataTypesPackage;
import fhiRCore.dataTypes.ElementDefinitionElement1;
import fhiRCore.dataTypes.ElementDefinitionElement1Element1;

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
 * An implementation of the model object '<em><b>Element Definition Element1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.dataTypes.impl.ElementDefinitionElement1Impl#getDiscriminators <em>Discriminator</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.ElementDefinitionElement1Impl#getDescription <em>Description</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.ElementDefinitionElement1Impl#getOrdered <em>Ordered</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.ElementDefinitionElement1Impl#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementDefinitionElement1Impl extends ElementImpl implements ElementDefinitionElement1 {
	/**
	 * The cached value of the '{@link #getDiscriminators() <em>Discriminator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscriminators()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementDefinitionElement1Element1> discriminators;

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
	 * The cached value of the '{@link #getOrdered() <em>Ordered</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdered()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Boolean ordered;

	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected Code rules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementDefinitionElement1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataTypesPackage.Literals.ELEMENT_DEFINITION_ELEMENT1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementDefinitionElement1Element1> getDiscriminators() {
		if (discriminators == null) {
			discriminators = new EObjectContainmentEList<ElementDefinitionElement1Element1>(ElementDefinitionElement1Element1.class, this, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1__DISCRIMINATOR);
		}
		return discriminators;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Boolean getOrdered() {
		return ordered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrdered(fhiRCore.dataTypes.Boolean newOrdered, NotificationChain msgs) {
		fhiRCore.dataTypes.Boolean oldOrdered = ordered;
		ordered = newOrdered;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1__ORDERED, oldOrdered, newOrdered);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrdered(fhiRCore.dataTypes.Boolean newOrdered) {
		if (newOrdered != ordered) {
			NotificationChain msgs = null;
			if (ordered != null)
				msgs = ((InternalEObject)ordered).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1__ORDERED, null, msgs);
			if (newOrdered != null)
				msgs = ((InternalEObject)newOrdered).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1__ORDERED, null, msgs);
			msgs = basicSetOrdered(newOrdered, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1__ORDERED, newOrdered, newOrdered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getRules() {
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRules(Code newRules, NotificationChain msgs) {
		Code oldRules = rules;
		rules = newRules;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1__RULES, oldRules, newRules);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRules(Code newRules) {
		if (newRules != rules) {
			NotificationChain msgs = null;
			if (rules != null)
				msgs = ((InternalEObject)rules).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1__RULES, null, msgs);
			if (newRules != null)
				msgs = ((InternalEObject)newRules).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1__RULES, null, msgs);
			msgs = basicSetRules(newRules, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1__RULES, newRules, newRules));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1__DISCRIMINATOR:
				return ((InternalEList<?>)getDiscriminators()).basicRemove(otherEnd, msgs);
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1__ORDERED:
				return basicSetOrdered(null, msgs);
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1__RULES:
				return basicSetRules(null, msgs);
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
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1__DISCRIMINATOR:
				return getDiscriminators();
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1__DESCRIPTION:
				return getDescription();
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1__ORDERED:
				return getOrdered();
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1__RULES:
				return getRules();
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
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1__DISCRIMINATOR:
				getDiscriminators().clear();
				getDiscriminators().addAll((Collection<? extends ElementDefinitionElement1Element1>)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1__DESCRIPTION:
				setDescription((fhiRCore.dataTypes.String)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1__ORDERED:
				setOrdered((fhiRCore.dataTypes.Boolean)newValue);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1__RULES:
				setRules((Code)newValue);
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
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1__DISCRIMINATOR:
				getDiscriminators().clear();
				return;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1__DESCRIPTION:
				setDescription((fhiRCore.dataTypes.String)null);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1__ORDERED:
				setOrdered((fhiRCore.dataTypes.Boolean)null);
				return;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1__RULES:
				setRules((Code)null);
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
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1__DISCRIMINATOR:
				return discriminators != null && !discriminators.isEmpty();
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1__DESCRIPTION:
				return description != null;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1__ORDERED:
				return ordered != null;
			case DataTypesPackage.ELEMENT_DEFINITION_ELEMENT1__RULES:
				return rules != null;
		}
		return super.eIsSet(featureID);
	}

} //ElementDefinitionElement1Impl
