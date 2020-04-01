/**
 */
package org.eclipse.mdht.hl7.fhir.resources.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.hl7.fhir.dataTypes.DataType;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.QuestionnaireItemAnswerOption;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Questionnaire Item Answer Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.QuestionnaireItemAnswerOptionImpl#getValuex <em>Valuex</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.QuestionnaireItemAnswerOptionImpl#getInitialSelected <em>Initial Selected</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionnaireItemAnswerOptionImpl extends BackboneElementImpl implements QuestionnaireItemAnswerOption {
	/**
	 * The cached value of the '{@link #getValuex() <em>Valuex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuex()
	 * @generated
	 * @ordered
	 */
	protected DataType valuex;

	/**
	 * The cached value of the '{@link #getInitialSelected() <em>Initial Selected</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialSelected()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.Boolean initialSelected;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionnaireItemAnswerOptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getQuestionnaireItemAnswerOption();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getValuex() {
		return valuex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValuex(DataType newValuex, NotificationChain msgs) {
		DataType oldValuex = valuex;
		valuex = newValuex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_ITEM_ANSWER_OPTION__VALUEX, oldValuex, newValuex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValuex(DataType newValuex) {
		if (newValuex != valuex) {
			NotificationChain msgs = null;
			if (valuex != null)
				msgs = ((InternalEObject)valuex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE_ITEM_ANSWER_OPTION__VALUEX, null, msgs);
			if (newValuex != null)
				msgs = ((InternalEObject)newValuex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE_ITEM_ANSWER_OPTION__VALUEX, null, msgs);
			msgs = basicSetValuex(newValuex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_ITEM_ANSWER_OPTION__VALUEX, newValuex, newValuex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.Boolean getInitialSelected() {
		return initialSelected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialSelected(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newInitialSelected, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.Boolean oldInitialSelected = initialSelected;
		initialSelected = newInitialSelected;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_ITEM_ANSWER_OPTION__INITIAL_SELECTED, oldInitialSelected, newInitialSelected);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitialSelected(org.eclipse.mdht.hl7.fhir.dataTypes.Boolean newInitialSelected) {
		if (newInitialSelected != initialSelected) {
			NotificationChain msgs = null;
			if (initialSelected != null)
				msgs = ((InternalEObject)initialSelected).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE_ITEM_ANSWER_OPTION__INITIAL_SELECTED, null, msgs);
			if (newInitialSelected != null)
				msgs = ((InternalEObject)newInitialSelected).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE_ITEM_ANSWER_OPTION__INITIAL_SELECTED, null, msgs);
			msgs = basicSetInitialSelected(newInitialSelected, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_ITEM_ANSWER_OPTION__INITIAL_SELECTED, newInitialSelected, newInitialSelected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.QUESTIONNAIRE_ITEM_ANSWER_OPTION__VALUEX:
				return basicSetValuex(null, msgs);
			case ResourcesPackage.QUESTIONNAIRE_ITEM_ANSWER_OPTION__INITIAL_SELECTED:
				return basicSetInitialSelected(null, msgs);
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
			case ResourcesPackage.QUESTIONNAIRE_ITEM_ANSWER_OPTION__VALUEX:
				return getValuex();
			case ResourcesPackage.QUESTIONNAIRE_ITEM_ANSWER_OPTION__INITIAL_SELECTED:
				return getInitialSelected();
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
			case ResourcesPackage.QUESTIONNAIRE_ITEM_ANSWER_OPTION__VALUEX:
				setValuex((DataType)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM_ANSWER_OPTION__INITIAL_SELECTED:
				setInitialSelected((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)newValue);
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
			case ResourcesPackage.QUESTIONNAIRE_ITEM_ANSWER_OPTION__VALUEX:
				setValuex((DataType)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM_ANSWER_OPTION__INITIAL_SELECTED:
				setInitialSelected((org.eclipse.mdht.hl7.fhir.dataTypes.Boolean)null);
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
			case ResourcesPackage.QUESTIONNAIRE_ITEM_ANSWER_OPTION__VALUEX:
				return valuex != null;
			case ResourcesPackage.QUESTIONNAIRE_ITEM_ANSWER_OPTION__INITIAL_SELECTED:
				return initialSelected != null;
		}
		return super.eIsSet(featureID);
	}

} //QuestionnaireItemAnswerOptionImpl
