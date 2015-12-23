/*******************************************************************************
 * Copyright (c) 2015 David Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David Carlson (Clinical Cloud Solutions, LLC) - initial API and implementation
 *******************************************************************************/
/**
 */
package org.eclipse.mdht.uml.fhir.core.resource.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.QuestionnaireResponseGroupQuestion;
import org.eclipse.mdht.uml.fhir.core.resource.QuestionnaireResponseGroupQuestionAnswer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Questionnaire Response Group Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.QuestionnaireResponseGroupQuestionImpl#getLinkId <em>Link Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.QuestionnaireResponseGroupQuestionImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.QuestionnaireResponseGroupQuestionImpl#getAnswers <em>Answer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionnaireResponseGroupQuestionImpl extends BackboneElementImpl implements QuestionnaireResponseGroupQuestion {
	/**
	 * The cached value of the '{@link #getLinkId() <em>Link Id</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkId()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String linkId;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String text;

	/**
	 * The cached value of the '{@link #getAnswers() <em>Answer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswers()
	 * @generated
	 * @ordered
	 */
	protected EList<QuestionnaireResponseGroupQuestionAnswer> answers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionnaireResponseGroupQuestionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getQuestionnaireResponseGroupQuestion();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getLinkId() {
		if (linkId != null && linkId.eIsProxy()) {
			InternalEObject oldLinkId = (InternalEObject)linkId;
			linkId = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldLinkId);
			if (linkId != oldLinkId) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.QUESTIONNAIRE_RESPONSE_GROUP_QUESTION__LINK_ID, oldLinkId, linkId));
			}
		}
		return linkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetLinkId() {
		return linkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkId(org.eclipse.mdht.uml.fhir.core.datatype.String newLinkId) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldLinkId = linkId;
		linkId = newLinkId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.QUESTIONNAIRE_RESPONSE_GROUP_QUESTION__LINK_ID, oldLinkId, linkId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getText() {
		if (text != null && text.eIsProxy()) {
			InternalEObject oldText = (InternalEObject)text;
			text = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldText);
			if (text != oldText) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.QUESTIONNAIRE_RESPONSE_GROUP_QUESTION__TEXT, oldText, text));
			}
		}
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(org.eclipse.mdht.uml.fhir.core.datatype.String newText) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.QUESTIONNAIRE_RESPONSE_GROUP_QUESTION__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuestionnaireResponseGroupQuestionAnswer> getAnswers() {
		if (answers == null) {
			answers = new EObjectContainmentEList<QuestionnaireResponseGroupQuestionAnswer>(QuestionnaireResponseGroupQuestionAnswer.class, this, FhirResourcePackage.QUESTIONNAIRE_RESPONSE_GROUP_QUESTION__ANSWER);
		}
		return answers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE_GROUP_QUESTION__ANSWER:
				return ((InternalEList<?>)getAnswers()).basicRemove(otherEnd, msgs);
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
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE_GROUP_QUESTION__LINK_ID:
				if (resolve) return getLinkId();
				return basicGetLinkId();
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE_GROUP_QUESTION__TEXT:
				if (resolve) return getText();
				return basicGetText();
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE_GROUP_QUESTION__ANSWER:
				return getAnswers();
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
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE_GROUP_QUESTION__LINK_ID:
				setLinkId((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE_GROUP_QUESTION__TEXT:
				setText((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE_GROUP_QUESTION__ANSWER:
				getAnswers().clear();
				getAnswers().addAll((Collection<? extends QuestionnaireResponseGroupQuestionAnswer>)newValue);
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
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE_GROUP_QUESTION__LINK_ID:
				setLinkId((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE_GROUP_QUESTION__TEXT:
				setText((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE_GROUP_QUESTION__ANSWER:
				getAnswers().clear();
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
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE_GROUP_QUESTION__LINK_ID:
				return linkId != null;
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE_GROUP_QUESTION__TEXT:
				return text != null;
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE_GROUP_QUESTION__ANSWER:
				return answers != null && !answers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QuestionnaireResponseGroupQuestionImpl
