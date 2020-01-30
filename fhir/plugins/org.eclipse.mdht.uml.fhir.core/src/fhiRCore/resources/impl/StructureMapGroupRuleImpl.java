/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Id;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.ResourcesPackage;
import fhiRCore.resources.StructureMapGroupRule;
import fhiRCore.resources.StructureMapGroupRuleDependent;
import fhiRCore.resources.StructureMapGroupRuleSource;
import fhiRCore.resources.StructureMapGroupRuleTarget;

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
 * An implementation of the model object '<em><b>Structure Map Group Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.StructureMapGroupRuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.StructureMapGroupRuleImpl#getSources <em>Source</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.StructureMapGroupRuleImpl#getTargets <em>Target</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.StructureMapGroupRuleImpl#getRules <em>Rule</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.StructureMapGroupRuleImpl#getDependents <em>Dependent</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.StructureMapGroupRuleImpl#getDocumentation <em>Documentation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructureMapGroupRuleImpl extends BackboneElementImpl implements StructureMapGroupRule {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected Id name;

	/**
	 * The cached value of the '{@link #getSources() <em>Source</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSources()
	 * @generated
	 * @ordered
	 */
	protected EList<StructureMapGroupRuleSource> sources;

	/**
	 * The cached value of the '{@link #getTargets() <em>Target</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<StructureMapGroupRuleTarget> targets;

	/**
	 * The cached value of the '{@link #getRules() <em>Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<StructureMapGroupRule> rules;

	/**
	 * The cached value of the '{@link #getDependents() <em>Dependent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependents()
	 * @generated
	 * @ordered
	 */
	protected EList<StructureMapGroupRuleDependent> dependents;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String documentation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructureMapGroupRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getStructureMapGroupRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(Id newName, NotificationChain msgs) {
		Id oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(Id newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructureMapGroupRuleSource> getSources() {
		if (sources == null) {
			sources = new EObjectContainmentEList<StructureMapGroupRuleSource>(StructureMapGroupRuleSource.class, this, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__SOURCE);
		}
		return sources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructureMapGroupRuleTarget> getTargets() {
		if (targets == null) {
			targets = new EObjectContainmentEList<StructureMapGroupRuleTarget>(StructureMapGroupRuleTarget.class, this, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__TARGET);
		}
		return targets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructureMapGroupRule> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentEList<StructureMapGroupRule>(StructureMapGroupRule.class, this, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__RULE);
		}
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructureMapGroupRuleDependent> getDependents() {
		if (dependents == null) {
			dependents = new EObjectContainmentEList<StructureMapGroupRuleDependent>(StructureMapGroupRuleDependent.class, this, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__DEPENDENT);
		}
		return dependents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentation(fhiRCore.dataTypes.String newDocumentation, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__DOCUMENTATION, oldDocumentation, newDocumentation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(fhiRCore.dataTypes.String newDocumentation) {
		if (newDocumentation != documentation) {
			NotificationChain msgs = null;
			if (documentation != null)
				msgs = ((InternalEObject)documentation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__DOCUMENTATION, null, msgs);
			if (newDocumentation != null)
				msgs = ((InternalEObject)newDocumentation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__DOCUMENTATION, null, msgs);
			msgs = basicSetDocumentation(newDocumentation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__DOCUMENTATION, newDocumentation, newDocumentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__NAME:
				return basicSetName(null, msgs);
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__SOURCE:
				return ((InternalEList<?>)getSources()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__TARGET:
				return ((InternalEList<?>)getTargets()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__RULE:
				return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__DEPENDENT:
				return ((InternalEList<?>)getDependents()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__DOCUMENTATION:
				return basicSetDocumentation(null, msgs);
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
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__NAME:
				return getName();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__SOURCE:
				return getSources();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__TARGET:
				return getTargets();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__RULE:
				return getRules();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__DEPENDENT:
				return getDependents();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__DOCUMENTATION:
				return getDocumentation();
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
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__NAME:
				setName((Id)newValue);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__SOURCE:
				getSources().clear();
				getSources().addAll((Collection<? extends StructureMapGroupRuleSource>)newValue);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__TARGET:
				getTargets().clear();
				getTargets().addAll((Collection<? extends StructureMapGroupRuleTarget>)newValue);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__RULE:
				getRules().clear();
				getRules().addAll((Collection<? extends StructureMapGroupRule>)newValue);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__DEPENDENT:
				getDependents().clear();
				getDependents().addAll((Collection<? extends StructureMapGroupRuleDependent>)newValue);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__DOCUMENTATION:
				setDocumentation((fhiRCore.dataTypes.String)newValue);
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
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__NAME:
				setName((Id)null);
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__SOURCE:
				getSources().clear();
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__TARGET:
				getTargets().clear();
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__RULE:
				getRules().clear();
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__DEPENDENT:
				getDependents().clear();
				return;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__DOCUMENTATION:
				setDocumentation((fhiRCore.dataTypes.String)null);
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
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__NAME:
				return name != null;
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__SOURCE:
				return sources != null && !sources.isEmpty();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__TARGET:
				return targets != null && !targets.isEmpty();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__RULE:
				return rules != null && !rules.isEmpty();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__DEPENDENT:
				return dependents != null && !dependents.isEmpty();
			case ResourcesPackage.STRUCTURE_MAP_GROUP_RULE__DOCUMENTATION:
				return documentation != null;
		}
		return super.eIsSet(featureID);
	}

} //StructureMapGroupRuleImpl
