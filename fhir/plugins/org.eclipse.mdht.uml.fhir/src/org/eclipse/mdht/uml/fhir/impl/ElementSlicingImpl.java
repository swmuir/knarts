/**
 */
package org.eclipse.mdht.uml.fhir.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.mdht.uml.fhir.ElementSlicing;
import org.eclipse.mdht.uml.fhir.FHIRPackage;
import org.eclipse.mdht.uml.fhir.SlicingRulesKind;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Slicing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.impl.ElementSlicingImpl#getDiscriminators <em>Discriminator</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.impl.ElementSlicingImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.impl.ElementSlicingImpl#getOrdered <em>Ordered</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.impl.ElementSlicingImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.impl.ElementSlicingImpl#getBase_Property <em>Base Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementSlicingImpl extends MinimalEObjectImpl.Container implements ElementSlicing {
	/**
	 * The cached value of the '{@link #getDiscriminators() <em>Discriminator</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscriminators()
	 * @generated
	 * @ordered
	 */
	protected EList<String> discriminators;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrdered() <em>Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ORDERED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrdered() <em>Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdered()
	 * @generated
	 * @ordered
	 */
	protected Boolean ordered = ORDERED_EDEFAULT;

	/**
	 * The default value of the '{@link #getRules() <em>Rules</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected static final SlicingRulesKind RULES_EDEFAULT = SlicingRulesKind.CLOSED;

	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected SlicingRulesKind rules = RULES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_Property() <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Property()
	 * @generated
	 * @ordered
	 */
	protected Property base_Property;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementSlicingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FHIRPackage.Literals.ELEMENT_SLICING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDiscriminators() {
		if (discriminators == null) {
			discriminators = new EDataTypeUniqueEList<String>(String.class, this, FHIRPackage.ELEMENT_SLICING__DISCRIMINATOR);
		}
		return discriminators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ELEMENT_SLICING__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getOrdered() {
		return ordered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrdered(Boolean newOrdered) {
		Boolean oldOrdered = ordered;
		ordered = newOrdered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ELEMENT_SLICING__ORDERED, oldOrdered, ordered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlicingRulesKind getRules() {
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRules(SlicingRulesKind newRules) {
		SlicingRulesKind oldRules = rules;
		rules = newRules == null ? RULES_EDEFAULT : newRules;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ELEMENT_SLICING__RULES, oldRules, rules));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getBase_Property() {
		if (base_Property != null && base_Property.eIsProxy()) {
			InternalEObject oldBase_Property = (InternalEObject)base_Property;
			base_Property = (Property)eResolveProxy(oldBase_Property);
			if (base_Property != oldBase_Property) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FHIRPackage.ELEMENT_SLICING__BASE_PROPERTY, oldBase_Property, base_Property));
			}
		}
		return base_Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetBase_Property() {
		return base_Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Property(Property newBase_Property) {
		Property oldBase_Property = base_Property;
		base_Property = newBase_Property;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FHIRPackage.ELEMENT_SLICING__BASE_PROPERTY, oldBase_Property, base_Property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FHIRPackage.ELEMENT_SLICING__DISCRIMINATOR:
				return getDiscriminators();
			case FHIRPackage.ELEMENT_SLICING__DESCRIPTION:
				return getDescription();
			case FHIRPackage.ELEMENT_SLICING__ORDERED:
				return getOrdered();
			case FHIRPackage.ELEMENT_SLICING__RULES:
				return getRules();
			case FHIRPackage.ELEMENT_SLICING__BASE_PROPERTY:
				if (resolve) return getBase_Property();
				return basicGetBase_Property();
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
			case FHIRPackage.ELEMENT_SLICING__DISCRIMINATOR:
				getDiscriminators().clear();
				getDiscriminators().addAll((Collection<? extends String>)newValue);
				return;
			case FHIRPackage.ELEMENT_SLICING__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case FHIRPackage.ELEMENT_SLICING__ORDERED:
				setOrdered((Boolean)newValue);
				return;
			case FHIRPackage.ELEMENT_SLICING__RULES:
				setRules((SlicingRulesKind)newValue);
				return;
			case FHIRPackage.ELEMENT_SLICING__BASE_PROPERTY:
				setBase_Property((Property)newValue);
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
			case FHIRPackage.ELEMENT_SLICING__DISCRIMINATOR:
				getDiscriminators().clear();
				return;
			case FHIRPackage.ELEMENT_SLICING__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case FHIRPackage.ELEMENT_SLICING__ORDERED:
				setOrdered(ORDERED_EDEFAULT);
				return;
			case FHIRPackage.ELEMENT_SLICING__RULES:
				setRules(RULES_EDEFAULT);
				return;
			case FHIRPackage.ELEMENT_SLICING__BASE_PROPERTY:
				setBase_Property((Property)null);
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
			case FHIRPackage.ELEMENT_SLICING__DISCRIMINATOR:
				return discriminators != null && !discriminators.isEmpty();
			case FHIRPackage.ELEMENT_SLICING__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case FHIRPackage.ELEMENT_SLICING__ORDERED:
				return ORDERED_EDEFAULT == null ? ordered != null : !ORDERED_EDEFAULT.equals(ordered);
			case FHIRPackage.ELEMENT_SLICING__RULES:
				return rules != RULES_EDEFAULT;
			case FHIRPackage.ELEMENT_SLICING__BASE_PROPERTY:
				return base_Property != null;
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
		result.append(" (discriminator: ");
		result.append(discriminators);
		result.append(", description: ");
		result.append(description);
		result.append(", ordered: ");
		result.append(ordered);
		result.append(", rules: ");
		result.append(rules);
		result.append(')');
		return result.toString();
	}

} //ElementSlicingImpl
