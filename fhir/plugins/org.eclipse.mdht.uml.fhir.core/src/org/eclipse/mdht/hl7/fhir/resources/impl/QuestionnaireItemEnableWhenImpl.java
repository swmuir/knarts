/**
 */
package org.eclipse.mdht.hl7.fhir.resources.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.hl7.fhir.dataTypes.Code;
import org.eclipse.mdht.hl7.fhir.dataTypes.DataType;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.QuestionnaireItemEnableWhen;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Questionnaire Item Enable When</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.QuestionnaireItemEnableWhenImpl#getQuestion <em>Question</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.QuestionnaireItemEnableWhenImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.QuestionnaireItemEnableWhenImpl#getAnswerx <em>Answerx</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionnaireItemEnableWhenImpl extends BackboneElementImpl implements QuestionnaireItemEnableWhen {
	/**
	 * The cached value of the '{@link #getQuestion() <em>Question</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestion()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String question;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected Code operator;

	/**
	 * The cached value of the '{@link #getAnswerx() <em>Answerx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswerx()
	 * @generated
	 * @ordered
	 */
	protected DataType answerx;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionnaireItemEnableWhenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getQuestionnaireItemEnableWhen();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getQuestion() {
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuestion(org.eclipse.mdht.hl7.fhir.dataTypes.String newQuestion, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldQuestion = question;
		question = newQuestion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_ITEM_ENABLE_WHEN__QUESTION, oldQuestion, newQuestion);
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
	public void setQuestion(org.eclipse.mdht.hl7.fhir.dataTypes.String newQuestion) {
		if (newQuestion != question) {
			NotificationChain msgs = null;
			if (question != null)
				msgs = ((InternalEObject)question).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE_ITEM_ENABLE_WHEN__QUESTION, null, msgs);
			if (newQuestion != null)
				msgs = ((InternalEObject)newQuestion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE_ITEM_ENABLE_WHEN__QUESTION, null, msgs);
			msgs = basicSetQuestion(newQuestion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_ITEM_ENABLE_WHEN__QUESTION, newQuestion, newQuestion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperator(Code newOperator, NotificationChain msgs) {
		Code oldOperator = operator;
		operator = newOperator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_ITEM_ENABLE_WHEN__OPERATOR, oldOperator, newOperator);
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
	public void setOperator(Code newOperator) {
		if (newOperator != operator) {
			NotificationChain msgs = null;
			if (operator != null)
				msgs = ((InternalEObject)operator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE_ITEM_ENABLE_WHEN__OPERATOR, null, msgs);
			if (newOperator != null)
				msgs = ((InternalEObject)newOperator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE_ITEM_ENABLE_WHEN__OPERATOR, null, msgs);
			msgs = basicSetOperator(newOperator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_ITEM_ENABLE_WHEN__OPERATOR, newOperator, newOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getAnswerx() {
		return answerx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnswerx(DataType newAnswerx, NotificationChain msgs) {
		DataType oldAnswerx = answerx;
		answerx = newAnswerx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_ITEM_ENABLE_WHEN__ANSWERX, oldAnswerx, newAnswerx);
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
	public void setAnswerx(DataType newAnswerx) {
		if (newAnswerx != answerx) {
			NotificationChain msgs = null;
			if (answerx != null)
				msgs = ((InternalEObject)answerx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE_ITEM_ENABLE_WHEN__ANSWERX, null, msgs);
			if (newAnswerx != null)
				msgs = ((InternalEObject)newAnswerx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE_ITEM_ENABLE_WHEN__ANSWERX, null, msgs);
			msgs = basicSetAnswerx(newAnswerx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_ITEM_ENABLE_WHEN__ANSWERX, newAnswerx, newAnswerx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.QUESTIONNAIRE_ITEM_ENABLE_WHEN__QUESTION:
				return basicSetQuestion(null, msgs);
			case ResourcesPackage.QUESTIONNAIRE_ITEM_ENABLE_WHEN__OPERATOR:
				return basicSetOperator(null, msgs);
			case ResourcesPackage.QUESTIONNAIRE_ITEM_ENABLE_WHEN__ANSWERX:
				return basicSetAnswerx(null, msgs);
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
			case ResourcesPackage.QUESTIONNAIRE_ITEM_ENABLE_WHEN__QUESTION:
				return getQuestion();
			case ResourcesPackage.QUESTIONNAIRE_ITEM_ENABLE_WHEN__OPERATOR:
				return getOperator();
			case ResourcesPackage.QUESTIONNAIRE_ITEM_ENABLE_WHEN__ANSWERX:
				return getAnswerx();
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
			case ResourcesPackage.QUESTIONNAIRE_ITEM_ENABLE_WHEN__QUESTION:
				setQuestion((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM_ENABLE_WHEN__OPERATOR:
				setOperator((Code)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM_ENABLE_WHEN__ANSWERX:
				setAnswerx((DataType)newValue);
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
			case ResourcesPackage.QUESTIONNAIRE_ITEM_ENABLE_WHEN__QUESTION:
				setQuestion((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM_ENABLE_WHEN__OPERATOR:
				setOperator((Code)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE_ITEM_ENABLE_WHEN__ANSWERX:
				setAnswerx((DataType)null);
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
			case ResourcesPackage.QUESTIONNAIRE_ITEM_ENABLE_WHEN__QUESTION:
				return question != null;
			case ResourcesPackage.QUESTIONNAIRE_ITEM_ENABLE_WHEN__OPERATOR:
				return operator != null;
			case ResourcesPackage.QUESTIONNAIRE_ITEM_ENABLE_WHEN__ANSWERX:
				return answerx != null;
		}
		return super.eIsSet(featureID);
	}

} //QuestionnaireItemEnableWhenImpl
