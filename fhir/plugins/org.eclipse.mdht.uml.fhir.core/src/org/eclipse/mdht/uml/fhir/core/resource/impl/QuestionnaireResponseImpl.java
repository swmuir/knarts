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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.uml.fhir.core.datatype.Code;
import org.eclipse.mdht.uml.fhir.core.datatype.DateTime;
import org.eclipse.mdht.uml.fhir.core.datatype.Identifier;

import org.eclipse.mdht.uml.fhir.core.resource.Encounter;
import org.eclipse.mdht.uml.fhir.core.resource.FhirResourcePackage;
import org.eclipse.mdht.uml.fhir.core.resource.Questionnaire;
import org.eclipse.mdht.uml.fhir.core.resource.QuestionnaireResponse;
import org.eclipse.mdht.uml.fhir.core.resource.QuestionnaireResponseGroup;
import org.eclipse.mdht.uml.fhir.core.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Questionnaire Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.QuestionnaireResponseImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.QuestionnaireResponseImpl#getQuestionnaire <em>Questionnaire</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.QuestionnaireResponseImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.QuestionnaireResponseImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.QuestionnaireResponseImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.QuestionnaireResponseImpl#getAuthored <em>Authored</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.QuestionnaireResponseImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.QuestionnaireResponseImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.eclipse.mdht.uml.fhir.core.resource.impl.QuestionnaireResponseImpl#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionnaireResponseImpl extends DomainResourceImpl implements QuestionnaireResponse {
	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

	/**
	 * The cached value of the '{@link #getQuestionnaire() <em>Questionnaire</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionnaire()
	 * @generated
	 * @ordered
	 */
	protected Questionnaire questionnaire;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Code status;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected Resource subject;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected Resource author;

	/**
	 * The cached value of the '{@link #getAuthored() <em>Authored</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthored()
	 * @generated
	 * @ordered
	 */
	protected DateTime authored;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Resource source;

	/**
	 * The cached value of the '{@link #getEncounter() <em>Encounter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounter()
	 * @generated
	 * @ordered
	 */
	protected Encounter encounter;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected QuestionnaireResponseGroup group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionnaireResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirResourcePackage.eINSTANCE.getQuestionnaireResponse();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getIdentifier() {
		if (identifier != null && identifier.eIsProxy()) {
			InternalEObject oldIdentifier = (InternalEObject)identifier;
			identifier = (Identifier)eResolveProxy(oldIdentifier);
			if (identifier != oldIdentifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.QUESTIONNAIRE_RESPONSE__IDENTIFIER, oldIdentifier, identifier));
			}
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier basicGetIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(Identifier newIdentifier) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.QUESTIONNAIRE_RESPONSE__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Questionnaire getQuestionnaire() {
		if (questionnaire != null && questionnaire.eIsProxy()) {
			InternalEObject oldQuestionnaire = (InternalEObject)questionnaire;
			questionnaire = (Questionnaire)eResolveProxy(oldQuestionnaire);
			if (questionnaire != oldQuestionnaire) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.QUESTIONNAIRE_RESPONSE__QUESTIONNAIRE, oldQuestionnaire, questionnaire));
			}
		}
		return questionnaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Questionnaire basicGetQuestionnaire() {
		return questionnaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuestionnaire(Questionnaire newQuestionnaire) {
		Questionnaire oldQuestionnaire = questionnaire;
		questionnaire = newQuestionnaire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.QUESTIONNAIRE_RESPONSE__QUESTIONNAIRE, oldQuestionnaire, questionnaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getStatus() {
		if (status != null && status.eIsProxy()) {
			InternalEObject oldStatus = (InternalEObject)status;
			status = (Code)eResolveProxy(oldStatus);
			if (status != oldStatus) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.QUESTIONNAIRE_RESPONSE__STATUS, oldStatus, status));
			}
		}
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code basicGetStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(Code newStatus) {
		Code oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.QUESTIONNAIRE_RESPONSE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getSubject() {
		if (subject != null && subject.eIsProxy()) {
			InternalEObject oldSubject = (InternalEObject)subject;
			subject = (Resource)eResolveProxy(oldSubject);
			if (subject != oldSubject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.QUESTIONNAIRE_RESPONSE__SUBJECT, oldSubject, subject));
			}
		}
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(Resource newSubject) {
		Resource oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.QUESTIONNAIRE_RESPONSE__SUBJECT, oldSubject, subject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getAuthor() {
		if (author != null && author.eIsProxy()) {
			InternalEObject oldAuthor = (InternalEObject)author;
			author = (Resource)eResolveProxy(oldAuthor);
			if (author != oldAuthor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.QUESTIONNAIRE_RESPONSE__AUTHOR, oldAuthor, author));
			}
		}
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(Resource newAuthor) {
		Resource oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.QUESTIONNAIRE_RESPONSE__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getAuthored() {
		if (authored != null && authored.eIsProxy()) {
			InternalEObject oldAuthored = (InternalEObject)authored;
			authored = (DateTime)eResolveProxy(oldAuthored);
			if (authored != oldAuthored) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.QUESTIONNAIRE_RESPONSE__AUTHORED, oldAuthored, authored));
			}
		}
		return authored;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime basicGetAuthored() {
		return authored;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthored(DateTime newAuthored) {
		DateTime oldAuthored = authored;
		authored = newAuthored;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.QUESTIONNAIRE_RESPONSE__AUTHORED, oldAuthored, authored));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Resource)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.QUESTIONNAIRE_RESPONSE__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Resource newSource) {
		Resource oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.QUESTIONNAIRE_RESPONSE__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Encounter getEncounter() {
		if (encounter != null && encounter.eIsProxy()) {
			InternalEObject oldEncounter = (InternalEObject)encounter;
			encounter = (Encounter)eResolveProxy(oldEncounter);
			if (encounter != oldEncounter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FhirResourcePackage.QUESTIONNAIRE_RESPONSE__ENCOUNTER, oldEncounter, encounter));
			}
		}
		return encounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Encounter basicGetEncounter() {
		return encounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncounter(Encounter newEncounter) {
		Encounter oldEncounter = encounter;
		encounter = newEncounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.QUESTIONNAIRE_RESPONSE__ENCOUNTER, oldEncounter, encounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireResponseGroup getGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(QuestionnaireResponseGroup newGroup, NotificationChain msgs) {
		QuestionnaireResponseGroup oldGroup = group;
		group = newGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirResourcePackage.QUESTIONNAIRE_RESPONSE__GROUP, oldGroup, newGroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(QuestionnaireResponseGroup newGroup) {
		if (newGroup != group) {
			NotificationChain msgs = null;
			if (group != null)
				msgs = ((InternalEObject)group).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.QUESTIONNAIRE_RESPONSE__GROUP, null, msgs);
			if (newGroup != null)
				msgs = ((InternalEObject)newGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirResourcePackage.QUESTIONNAIRE_RESPONSE__GROUP, null, msgs);
			msgs = basicSetGroup(newGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirResourcePackage.QUESTIONNAIRE_RESPONSE__GROUP, newGroup, newGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE__GROUP:
				return basicSetGroup(null, msgs);
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
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE__IDENTIFIER:
				if (resolve) return getIdentifier();
				return basicGetIdentifier();
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE__QUESTIONNAIRE:
				if (resolve) return getQuestionnaire();
				return basicGetQuestionnaire();
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE__STATUS:
				if (resolve) return getStatus();
				return basicGetStatus();
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE__SUBJECT:
				if (resolve) return getSubject();
				return basicGetSubject();
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE__AUTHOR:
				if (resolve) return getAuthor();
				return basicGetAuthor();
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE__AUTHORED:
				if (resolve) return getAuthored();
				return basicGetAuthored();
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE__ENCOUNTER:
				if (resolve) return getEncounter();
				return basicGetEncounter();
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE__GROUP:
				return getGroup();
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
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE__QUESTIONNAIRE:
				setQuestionnaire((Questionnaire)newValue);
				return;
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE__STATUS:
				setStatus((Code)newValue);
				return;
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE__SUBJECT:
				setSubject((Resource)newValue);
				return;
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE__AUTHOR:
				setAuthor((Resource)newValue);
				return;
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE__AUTHORED:
				setAuthored((DateTime)newValue);
				return;
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE__SOURCE:
				setSource((Resource)newValue);
				return;
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE__ENCOUNTER:
				setEncounter((Encounter)newValue);
				return;
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE__GROUP:
				setGroup((QuestionnaireResponseGroup)newValue);
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
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE__QUESTIONNAIRE:
				setQuestionnaire((Questionnaire)null);
				return;
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE__STATUS:
				setStatus((Code)null);
				return;
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE__SUBJECT:
				setSubject((Resource)null);
				return;
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE__AUTHOR:
				setAuthor((Resource)null);
				return;
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE__AUTHORED:
				setAuthored((DateTime)null);
				return;
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE__SOURCE:
				setSource((Resource)null);
				return;
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE__ENCOUNTER:
				setEncounter((Encounter)null);
				return;
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE__GROUP:
				setGroup((QuestionnaireResponseGroup)null);
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
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE__IDENTIFIER:
				return identifier != null;
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE__QUESTIONNAIRE:
				return questionnaire != null;
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE__STATUS:
				return status != null;
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE__SUBJECT:
				return subject != null;
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE__AUTHOR:
				return author != null;
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE__AUTHORED:
				return authored != null;
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE__SOURCE:
				return source != null;
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE__ENCOUNTER:
				return encounter != null;
			case FhirResourcePackage.QUESTIONNAIRE_RESPONSE__GROUP:
				return group != null;
		}
		return super.eIsSet(featureID);
	}

} //QuestionnaireResponseImpl
