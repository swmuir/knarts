/**
 */
package org.hl7.knowledgeartifact.r2.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.elm.r1.ExpressionDef;

import org.hl7.knowledgeartifact.r2.R2Package;
import org.hl7.knowledgeartifact.r2.Trigger;
import org.hl7.knowledgeartifact.r2.VersionedIdentifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.TriggerImpl#getDef <em>Def</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.TriggerImpl#getIdentifiers <em>Identifiers</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.TriggerImpl#getTextEquivalent <em>Text Equivalent</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TriggerImpl extends MinimalEObjectImpl.Container implements Trigger {
	/**
	 * The cached value of the '{@link #getDef() <em>Def</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDef()
	 * @generated
	 * @ordered
	 */
	protected ExpressionDef def;

	/**
	 * The cached value of the '{@link #getIdentifiers() <em>Identifiers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<VersionedIdentifier> identifiers;

	/**
	 * The cached value of the '{@link #getTextEquivalent() <em>Text Equivalent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextEquivalent()
	 * @generated
	 * @ordered
	 */
	protected EObject textEquivalent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R2Package.eINSTANCE.getTrigger();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionDef getDef() {
		return def;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDef(ExpressionDef newDef, NotificationChain msgs) {
		ExpressionDef oldDef = def;
		def = newDef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.TRIGGER__DEF, oldDef, newDef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDef(ExpressionDef newDef) {
		if (newDef != def) {
			NotificationChain msgs = null;
			if (def != null)
				msgs = ((InternalEObject)def).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.TRIGGER__DEF, null, msgs);
			if (newDef != null)
				msgs = ((InternalEObject)newDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.TRIGGER__DEF, null, msgs);
			msgs = basicSetDef(newDef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.TRIGGER__DEF, newDef, newDef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VersionedIdentifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<VersionedIdentifier>(VersionedIdentifier.class, this, R2Package.TRIGGER__IDENTIFIERS);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getTextEquivalent() {
		return textEquivalent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextEquivalent(EObject newTextEquivalent, NotificationChain msgs) {
		EObject oldTextEquivalent = textEquivalent;
		textEquivalent = newTextEquivalent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.TRIGGER__TEXT_EQUIVALENT, oldTextEquivalent, newTextEquivalent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextEquivalent(EObject newTextEquivalent) {
		if (newTextEquivalent != textEquivalent) {
			NotificationChain msgs = null;
			if (textEquivalent != null)
				msgs = ((InternalEObject)textEquivalent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.TRIGGER__TEXT_EQUIVALENT, null, msgs);
			if (newTextEquivalent != null)
				msgs = ((InternalEObject)newTextEquivalent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.TRIGGER__TEXT_EQUIVALENT, null, msgs);
			msgs = basicSetTextEquivalent(newTextEquivalent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.TRIGGER__TEXT_EQUIVALENT, newTextEquivalent, newTextEquivalent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R2Package.TRIGGER__DEF:
				return basicSetDef(null, msgs);
			case R2Package.TRIGGER__IDENTIFIERS:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case R2Package.TRIGGER__TEXT_EQUIVALENT:
				return basicSetTextEquivalent(null, msgs);
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
			case R2Package.TRIGGER__DEF:
				return getDef();
			case R2Package.TRIGGER__IDENTIFIERS:
				return getIdentifiers();
			case R2Package.TRIGGER__TEXT_EQUIVALENT:
				return getTextEquivalent();
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
			case R2Package.TRIGGER__DEF:
				setDef((ExpressionDef)newValue);
				return;
			case R2Package.TRIGGER__IDENTIFIERS:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends VersionedIdentifier>)newValue);
				return;
			case R2Package.TRIGGER__TEXT_EQUIVALENT:
				setTextEquivalent((EObject)newValue);
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
			case R2Package.TRIGGER__DEF:
				setDef((ExpressionDef)null);
				return;
			case R2Package.TRIGGER__IDENTIFIERS:
				getIdentifiers().clear();
				return;
			case R2Package.TRIGGER__TEXT_EQUIVALENT:
				setTextEquivalent((EObject)null);
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
			case R2Package.TRIGGER__DEF:
				return def != null;
			case R2Package.TRIGGER__IDENTIFIERS:
				return identifiers != null && !identifiers.isEmpty();
			case R2Package.TRIGGER__TEXT_EQUIVALENT:
				return textEquivalent != null;
		}
		return super.eIsSet(featureID);
	}

} //TriggerImpl
