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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.uml.fhir.core.datatype.Coding;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.QuestionnaireGroup;
import org.eclipse.mdht.uml.fhir.core.resource.QuestionnaireGroupQuestion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Questionnaire Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.QuestionnaireGroupImpl#getLinkId <em>Link Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.QuestionnaireGroupImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.QuestionnaireGroupImpl#getConcepts <em>Concept</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.QuestionnaireGroupImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.QuestionnaireGroupImpl#getRequired <em>Required</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.QuestionnaireGroupImpl#getRepeats <em>Repeats</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.QuestionnaireGroupImpl#getGroups <em>Group</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.QuestionnaireGroupImpl#getQuestions <em>Question</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionnaireGroupImpl extends BackboneElementImpl implements QuestionnaireGroup {
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
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.String title;

	/**
	 * The cached value of the '{@link #getConcepts() <em>Concept</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcepts()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> concepts;

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
	 * The cached value of the '{@link #getRequired() <em>Required</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.Boolean required;

	/**
	 * The cached value of the '{@link #getRepeats() <em>Repeats</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeats()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.uml.fhir.core.datatype.Boolean repeats;

	/**
	 * The cached value of the '{@link #getGroups() <em>Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<QuestionnaireGroup> groups;

	/**
	 * The cached value of the '{@link #getQuestions() <em>Question</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestions()
	 * @generated
	 * @ordered
	 */
	protected EList<QuestionnaireGroupQuestion> questions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionnaireGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getQuestionnaireGroup();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.QUESTIONNAIRE_GROUP__LINK_ID, oldLinkId, linkId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.QUESTIONNAIRE_GROUP__LINK_ID, oldLinkId, linkId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String getTitle() {
		if (title != null && title.eIsProxy()) {
			InternalEObject oldTitle = (InternalEObject)title;
			title = (org.eclipse.mdht.uml.fhir.core.datatype.String)eResolveProxy(oldTitle);
			if (title != oldTitle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.QUESTIONNAIRE_GROUP__TITLE, oldTitle, title));
			}
		}
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.String basicGetTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(org.eclipse.mdht.uml.fhir.core.datatype.String newTitle) {
		org.eclipse.mdht.uml.fhir.core.datatype.String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.QUESTIONNAIRE_GROUP__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getConcepts() {
		if (concepts == null) {
			concepts = new EObjectResolvingEList<Coding>(Coding.class, this, FhirResourcePackage.QUESTIONNAIRE_GROUP__CONCEPT);
		}
		return concepts;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.QUESTIONNAIRE_GROUP__TEXT, oldText, text));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.QUESTIONNAIRE_GROUP__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean getRequired() {
		if (required != null && required.eIsProxy()) {
			InternalEObject oldRequired = (InternalEObject)required;
			required = (org.eclipse.mdht.uml.fhir.core.datatype.Boolean)eResolveProxy(oldRequired);
			if (required != oldRequired) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.QUESTIONNAIRE_GROUP__REQUIRED, oldRequired, required));
			}
		}
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean basicGetRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(org.eclipse.mdht.uml.fhir.core.datatype.Boolean newRequired) {
		org.eclipse.mdht.uml.fhir.core.datatype.Boolean oldRequired = required;
		required = newRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.QUESTIONNAIRE_GROUP__REQUIRED, oldRequired, required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean getRepeats() {
		if (repeats != null && repeats.eIsProxy()) {
			InternalEObject oldRepeats = (InternalEObject)repeats;
			repeats = (org.eclipse.mdht.uml.fhir.core.datatype.Boolean)eResolveProxy(oldRepeats);
			if (repeats != oldRepeats) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.QUESTIONNAIRE_GROUP__REPEATS, oldRepeats, repeats));
			}
		}
		return repeats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.mdht.uml.fhir.core.datatype.Boolean basicGetRepeats() {
		return repeats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepeats(org.eclipse.mdht.uml.fhir.core.datatype.Boolean newRepeats) {
		org.eclipse.mdht.uml.fhir.core.datatype.Boolean oldRepeats = repeats;
		repeats = newRepeats;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.QUESTIONNAIRE_GROUP__REPEATS, oldRepeats, repeats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuestionnaireGroup> getGroups() {
		if (groups == null) {
			groups = new EObjectContainmentEList<QuestionnaireGroup>(QuestionnaireGroup.class, this, FhirResourcePackage.QUESTIONNAIRE_GROUP__GROUP);
		}
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuestionnaireGroupQuestion> getQuestions() {
		if (questions == null) {
			questions = new EObjectContainmentEList<QuestionnaireGroupQuestion>(QuestionnaireGroupQuestion.class, this, FhirResourcePackage.QUESTIONNAIRE_GROUP__QUESTION);
		}
		return questions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.QUESTIONNAIRE_GROUP__GROUP:
				return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
			case FhirResourcePackage.QUESTIONNAIRE_GROUP__QUESTION:
				return ((InternalEList<?>)getQuestions()).basicRemove(otherEnd, msgs);
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
			case FhirResourcePackage.QUESTIONNAIRE_GROUP__LINK_ID:
				if (resolve) return getLinkId();
				return basicGetLinkId();
			case FhirResourcePackage.QUESTIONNAIRE_GROUP__TITLE:
				if (resolve) return getTitle();
				return basicGetTitle();
			case FhirResourcePackage.QUESTIONNAIRE_GROUP__CONCEPT:
				return getConcepts();
			case FhirResourcePackage.QUESTIONNAIRE_GROUP__TEXT:
				if (resolve) return getText();
				return basicGetText();
			case FhirResourcePackage.QUESTIONNAIRE_GROUP__REQUIRED:
				if (resolve) return getRequired();
				return basicGetRequired();
			case FhirResourcePackage.QUESTIONNAIRE_GROUP__REPEATS:
				if (resolve) return getRepeats();
				return basicGetRepeats();
			case FhirResourcePackage.QUESTIONNAIRE_GROUP__GROUP:
				return getGroups();
			case FhirResourcePackage.QUESTIONNAIRE_GROUP__QUESTION:
				return getQuestions();
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
			case FhirResourcePackage.QUESTIONNAIRE_GROUP__LINK_ID:
				setLinkId((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.QUESTIONNAIRE_GROUP__TITLE:
				setTitle((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.QUESTIONNAIRE_GROUP__CONCEPT:
				getConcepts().clear();
				getConcepts().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirResourcePackage.QUESTIONNAIRE_GROUP__TEXT:
				setText((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.QUESTIONNAIRE_GROUP__REQUIRED:
				setRequired((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)newValue);
				return;
			case FhirResourcePackage.QUESTIONNAIRE_GROUP__REPEATS:
				setRepeats((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)newValue);
				return;
			case FhirResourcePackage.QUESTIONNAIRE_GROUP__GROUP:
				getGroups().clear();
				getGroups().addAll((Collection<? extends QuestionnaireGroup>)newValue);
				return;
			case FhirResourcePackage.QUESTIONNAIRE_GROUP__QUESTION:
				getQuestions().clear();
				getQuestions().addAll((Collection<? extends QuestionnaireGroupQuestion>)newValue);
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
			case FhirResourcePackage.QUESTIONNAIRE_GROUP__LINK_ID:
				setLinkId((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.QUESTIONNAIRE_GROUP__TITLE:
				setTitle((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.QUESTIONNAIRE_GROUP__CONCEPT:
				getConcepts().clear();
				return;
			case FhirResourcePackage.QUESTIONNAIRE_GROUP__TEXT:
				setText((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.QUESTIONNAIRE_GROUP__REQUIRED:
				setRequired((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)null);
				return;
			case FhirResourcePackage.QUESTIONNAIRE_GROUP__REPEATS:
				setRepeats((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)null);
				return;
			case FhirResourcePackage.QUESTIONNAIRE_GROUP__GROUP:
				getGroups().clear();
				return;
			case FhirResourcePackage.QUESTIONNAIRE_GROUP__QUESTION:
				getQuestions().clear();
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
			case FhirResourcePackage.QUESTIONNAIRE_GROUP__LINK_ID:
				return linkId != null;
			case FhirResourcePackage.QUESTIONNAIRE_GROUP__TITLE:
				return title != null;
			case FhirResourcePackage.QUESTIONNAIRE_GROUP__CONCEPT:
				return concepts != null && !concepts.isEmpty();
			case FhirResourcePackage.QUESTIONNAIRE_GROUP__TEXT:
				return text != null;
			case FhirResourcePackage.QUESTIONNAIRE_GROUP__REQUIRED:
				return required != null;
			case FhirResourcePackage.QUESTIONNAIRE_GROUP__REPEATS:
				return repeats != null;
			case FhirResourcePackage.QUESTIONNAIRE_GROUP__GROUP:
				return groups != null && !groups.isEmpty();
			case FhirResourcePackage.QUESTIONNAIRE_GROUP__QUESTION:
				return questions != null && !questions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QuestionnaireGroupImpl
