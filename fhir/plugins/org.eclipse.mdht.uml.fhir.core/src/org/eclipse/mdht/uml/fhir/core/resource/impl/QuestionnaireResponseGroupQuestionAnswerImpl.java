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

import org.eclipse.mdht.uml.fhir.core.datatype.Base;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.QuestionnaireResponseGroup;
import org.eclipse.mdht.uml.fhir.core.resource.QuestionnaireResponseGroupQuestionAnswer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Questionnaire Response Group Question Answer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.QuestionnaireResponseGroupQuestionAnswerImpl#getValuex <em>Valuex</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.QuestionnaireResponseGroupQuestionAnswerImpl#getGroups <em>Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionnaireResponseGroupQuestionAnswerImpl extends BackboneElementImpl implements QuestionnaireResponseGroupQuestionAnswer {
	/**
	 * The cached value of the '{@link #getValuex() <em>Valuex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuex()
	 * @generated
	 * @ordered
	 */
	protected Base valuex;

	/**
	 * The cached value of the '{@link #getGroups() <em>Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<QuestionnaireResponseGroup> groups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionnaireResponseGroupQuestionAnswerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getQuestionnaireResponseGroupQuestionAnswer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base getValuex() {
		if (valuex != null && valuex.eIsProxy()) {
			InternalEObject oldValuex = (InternalEObject)valuex;
			valuex = (Base)eResolveProxy(oldValuex);
			if (valuex != oldValuex) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.QUESTIONNAIRE_RESPONSE_GROUP_QUESTION_ANSWER__VALUEX, oldValuex, valuex));
			}
		}
		return valuex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base basicGetValuex() {
		return valuex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValuex(Base newValuex) {
		Base oldValuex = valuex;
		valuex = newValuex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.QUESTIONNAIRE_RESPONSE_GROUP_QUESTION_ANSWER__VALUEX, oldValuex, valuex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuestionnaireResponseGroup> getGroups() {
		if (groups == null) {
			groups = new EObjectContainmentEList<QuestionnaireResponseGroup>(QuestionnaireResponseGroup.class, this, FhirResourcePackage.QUESTIONNAIRE_RESPONSE_GROUP_QUESTION_ANSWER__GROUP);
		}
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE_GROUP_QUESTION_ANSWER__GROUP:
				return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
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
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE_GROUP_QUESTION_ANSWER__VALUEX:
				if (resolve) return getValuex();
				return basicGetValuex();
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE_GROUP_QUESTION_ANSWER__GROUP:
				return getGroups();
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
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE_GROUP_QUESTION_ANSWER__VALUEX:
				setValuex((Base)newValue);
				return;
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE_GROUP_QUESTION_ANSWER__GROUP:
				getGroups().clear();
				getGroups().addAll((Collection<? extends QuestionnaireResponseGroup>)newValue);
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
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE_GROUP_QUESTION_ANSWER__VALUEX:
				setValuex((Base)null);
				return;
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE_GROUP_QUESTION_ANSWER__GROUP:
				getGroups().clear();
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
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE_GROUP_QUESTION_ANSWER__VALUEX:
				return valuex != null;
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE_GROUP_QUESTION_ANSWER__GROUP:
				return groups != null && !groups.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QuestionnaireResponseGroupQuestionAnswerImpl
