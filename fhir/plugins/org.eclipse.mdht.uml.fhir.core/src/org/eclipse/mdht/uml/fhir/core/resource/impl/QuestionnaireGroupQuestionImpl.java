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

import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.Coding;

import org.eclipse.mdht.uml.fhir.core.datatype.impl.BackboneElementImpl;

import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.QuestionnaireGroup;
import org.eclipse.mdht.uml.fhir.core.resource.QuestionnaireGroupQuestion;
import org.eclipse.mdht.uml.fhir.core.resource.ValueSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Questionnaire Group Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.QuestionnaireGroupQuestionImpl#getLinkId <em>Link Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.QuestionnaireGroupQuestionImpl#getConcepts <em>Concept</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.QuestionnaireGroupQuestionImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.QuestionnaireGroupQuestionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.QuestionnaireGroupQuestionImpl#getRequired <em>Required</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.QuestionnaireGroupQuestionImpl#getRepeats <em>Repeats</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.QuestionnaireGroupQuestionImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.QuestionnaireGroupQuestionImpl#getPermittedAnswers <em>Permitted Answer</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.QuestionnaireGroupQuestionImpl#getGroups <em>Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionnaireGroupQuestionImpl extends BackboneElementImpl implements QuestionnaireGroupQuestion {
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
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Code type;

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
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected ValueSet options;

	/**
	 * The cached value of the '{@link #getPermittedAnswers() <em>Permitted Answer</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermittedAnswers()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> permittedAnswers;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionnaireGroupQuestionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getQuestionnaireGroupQuestion();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.QUESTIONNAIRE_GROUP_QUESTION__LINK_ID, oldLinkId, linkId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.QUESTIONNAIRE_GROUP_QUESTION__LINK_ID, oldLinkId, linkId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getConcepts() {
		if (concepts == null) {
			concepts = new EObjectResolvingEList<Coding>(Coding.class, this, FhirResourcePackage.QUESTIONNAIRE_GROUP_QUESTION__CONCEPT);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.QUESTIONNAIRE_GROUP_QUESTION__TEXT, oldText, text));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.QUESTIONNAIRE_GROUP_QUESTION__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Code)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.QUESTIONNAIRE_GROUP_QUESTION__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Code newType) {
		Code oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.QUESTIONNAIRE_GROUP_QUESTION__TYPE, oldType, type));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.QUESTIONNAIRE_GROUP_QUESTION__REQUIRED, oldRequired, required));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.QUESTIONNAIRE_GROUP_QUESTION__REQUIRED, oldRequired, required));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.QUESTIONNAIRE_GROUP_QUESTION__REPEATS, oldRepeats, repeats));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.QUESTIONNAIRE_GROUP_QUESTION__REPEATS, oldRepeats, repeats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSet getOptions() {
		if (options != null && options.eIsProxy()) {
			InternalEObject oldOptions = (InternalEObject)options;
			options = (ValueSet)eResolveProxy(oldOptions);
			if (options != oldOptions) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.QUESTIONNAIRE_GROUP_QUESTION__OPTIONS, oldOptions, options));
			}
		}
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSet basicGetOptions() {
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptions(ValueSet newOptions) {
		ValueSet oldOptions = options;
		options = newOptions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.QUESTIONNAIRE_GROUP_QUESTION__OPTIONS, oldOptions, options));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getPermittedAnswers() {
		if (permittedAnswers == null) {
			permittedAnswers = new EObjectResolvingEList<Coding>(Coding.class, this, FhirResourcePackage.QUESTIONNAIRE_GROUP_QUESTION__PERMITTED_ANSWER);
		}
		return permittedAnswers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuestionnaireGroup> getGroups() {
		if (groups == null) {
			groups = new EObjectContainmentEList<QuestionnaireGroup>(QuestionnaireGroup.class, this, FhirResourcePackage.QUESTIONNAIRE_GROUP_QUESTION__GROUP);
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
			case FhirResourcePackage.QUESTIONNAIRE_GROUP_QUESTION__GROUP:
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
			case FhirResourcePackage.QUESTIONNAIRE_GROUP_QUESTION__LINK_ID:
				if (resolve) return getLinkId();
				return basicGetLinkId();
			case FhirResourcePackage.QUESTIONNAIRE_GROUP_QUESTION__CONCEPT:
				return getConcepts();
			case FhirResourcePackage.QUESTIONNAIRE_GROUP_QUESTION__TEXT:
				if (resolve) return getText();
				return basicGetText();
			case FhirResourcePackage.QUESTIONNAIRE_GROUP_QUESTION__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case FhirResourcePackage.QUESTIONNAIRE_GROUP_QUESTION__REQUIRED:
				if (resolve) return getRequired();
				return basicGetRequired();
			case FhirResourcePackage.QUESTIONNAIRE_GROUP_QUESTION__REPEATS:
				if (resolve) return getRepeats();
				return basicGetRepeats();
			case FhirResourcePackage.QUESTIONNAIRE_GROUP_QUESTION__OPTIONS:
				if (resolve) return getOptions();
				return basicGetOptions();
			case FhirResourcePackage.QUESTIONNAIRE_GROUP_QUESTION__PERMITTED_ANSWER:
				return getPermittedAnswers();
			case FhirResourcePackage.QUESTIONNAIRE_GROUP_QUESTION__GROUP:
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
			case FhirResourcePackage.QUESTIONNAIRE_GROUP_QUESTION__LINK_ID:
				setLinkId((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.QUESTIONNAIRE_GROUP_QUESTION__CONCEPT:
				getConcepts().clear();
				getConcepts().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirResourcePackage.QUESTIONNAIRE_GROUP_QUESTION__TEXT:
				setText((org.eclipse.mdht.uml.fhir.core.datatype.String)newValue);
				return;
			case FhirResourcePackage.QUESTIONNAIRE_GROUP_QUESTION__TYPE:
				setType((Code)newValue);
				return;
			case FhirResourcePackage.QUESTIONNAIRE_GROUP_QUESTION__REQUIRED:
				setRequired((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)newValue);
				return;
			case FhirResourcePackage.QUESTIONNAIRE_GROUP_QUESTION__REPEATS:
				setRepeats((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)newValue);
				return;
			case FhirResourcePackage.QUESTIONNAIRE_GROUP_QUESTION__OPTIONS:
				setOptions((ValueSet)newValue);
				return;
			case FhirResourcePackage.QUESTIONNAIRE_GROUP_QUESTION__PERMITTED_ANSWER:
				getPermittedAnswers().clear();
				getPermittedAnswers().addAll((Collection<? extends Coding>)newValue);
				return;
			case FhirResourcePackage.QUESTIONNAIRE_GROUP_QUESTION__GROUP:
				getGroups().clear();
				getGroups().addAll((Collection<? extends QuestionnaireGroup>)newValue);
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
			case FhirResourcePackage.QUESTIONNAIRE_GROUP_QUESTION__LINK_ID:
				setLinkId((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.QUESTIONNAIRE_GROUP_QUESTION__CONCEPT:
				getConcepts().clear();
				return;
			case FhirResourcePackage.QUESTIONNAIRE_GROUP_QUESTION__TEXT:
				setText((org.eclipse.mdht.uml.fhir.core.datatype.String)null);
				return;
			case FhirResourcePackage.QUESTIONNAIRE_GROUP_QUESTION__TYPE:
				setType((Code)null);
				return;
			case FhirResourcePackage.QUESTIONNAIRE_GROUP_QUESTION__REQUIRED:
				setRequired((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)null);
				return;
			case FhirResourcePackage.QUESTIONNAIRE_GROUP_QUESTION__REPEATS:
				setRepeats((org.eclipse.mdht.uml.fhir.core.datatype.Boolean)null);
				return;
			case FhirResourcePackage.QUESTIONNAIRE_GROUP_QUESTION__OPTIONS:
				setOptions((ValueSet)null);
				return;
			case FhirResourcePackage.QUESTIONNAIRE_GROUP_QUESTION__PERMITTED_ANSWER:
				getPermittedAnswers().clear();
				return;
			case FhirResourcePackage.QUESTIONNAIRE_GROUP_QUESTION__GROUP:
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
			case FhirResourcePackage.QUESTIONNAIRE_GROUP_QUESTION__LINK_ID:
				return linkId != null;
			case FhirResourcePackage.QUESTIONNAIRE_GROUP_QUESTION__CONCEPT:
				return concepts != null && !concepts.isEmpty();
			case FhirResourcePackage.QUESTIONNAIRE_GROUP_QUESTION__TEXT:
				return text != null;
			case FhirResourcePackage.QUESTIONNAIRE_GROUP_QUESTION__TYPE:
				return type != null;
			case FhirResourcePackage.QUESTIONNAIRE_GROUP_QUESTION__REQUIRED:
				return required != null;
			case FhirResourcePackage.QUESTIONNAIRE_GROUP_QUESTION__REPEATS:
				return repeats != null;
			case FhirResourcePackage.QUESTIONNAIRE_GROUP_QUESTION__OPTIONS:
				return options != null;
			case FhirResourcePackage.QUESTIONNAIRE_GROUP_QUESTION__PERMITTED_ANSWER:
				return permittedAnswers != null && !permittedAnswers.isEmpty();
			case FhirResourcePackage.QUESTIONNAIRE_GROUP_QUESTION__GROUP:
				return groups != null && !groups.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QuestionnaireGroupQuestionImpl
