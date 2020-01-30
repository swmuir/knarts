/**
 */
package fhiRCore.dataTypes.impl;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.Coding;
import fhiRCore.dataTypes.DataTypesPackage;

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
 * An implementation of the model object '<em><b>Codeable Concept</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.dataTypes.impl.CodeableConceptImpl#getCodings <em>Coding</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.CodeableConceptImpl#getText <em>Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CodeableConceptImpl extends DataTypeImpl implements CodeableConcept {
	/**
	 * The cached value of the '{@link #getCodings() <em>Coding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodings()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> codings;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeableConceptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataTypesPackage.Literals.CODEABLE_CONCEPT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getCodings() {
		if (codings == null) {
			codings = new EObjectContainmentEList<Coding>(Coding.class, this, DataTypesPackage.CODEABLE_CONCEPT__CODING);
		}
		return codings;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.CODEABLE_CONCEPT__TEXT, oldText, newText);
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
				msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.CODEABLE_CONCEPT__TEXT, null, msgs);
			if (newText != null)
				msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.CODEABLE_CONCEPT__TEXT, null, msgs);
			msgs = basicSetText(newText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.CODEABLE_CONCEPT__TEXT, newText, newText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataTypesPackage.CODEABLE_CONCEPT__CODING:
				return ((InternalEList<?>)getCodings()).basicRemove(otherEnd, msgs);
			case DataTypesPackage.CODEABLE_CONCEPT__TEXT:
				return basicSetText(null, msgs);
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
			case DataTypesPackage.CODEABLE_CONCEPT__CODING:
				return getCodings();
			case DataTypesPackage.CODEABLE_CONCEPT__TEXT:
				return getText();
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
			case DataTypesPackage.CODEABLE_CONCEPT__CODING:
				getCodings().clear();
				getCodings().addAll((Collection<? extends Coding>)newValue);
				return;
			case DataTypesPackage.CODEABLE_CONCEPT__TEXT:
				setText((fhiRCore.dataTypes.String)newValue);
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
			case DataTypesPackage.CODEABLE_CONCEPT__CODING:
				getCodings().clear();
				return;
			case DataTypesPackage.CODEABLE_CONCEPT__TEXT:
				setText((fhiRCore.dataTypes.String)null);
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
			case DataTypesPackage.CODEABLE_CONCEPT__CODING:
				return codings != null && !codings.isEmpty();
			case DataTypesPackage.CODEABLE_CONCEPT__TEXT:
				return text != null;
		}
		return super.eIsSet(featureID);
	}

} //CodeableConceptImpl
