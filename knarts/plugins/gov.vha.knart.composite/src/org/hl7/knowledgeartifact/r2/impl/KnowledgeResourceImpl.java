/**
 */
package org.hl7.knowledgeartifact.r2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.hl7.cdsdt.r2.TEL;

import org.hl7.knowledgeartifact.r2.FormattedText;
import org.hl7.knowledgeartifact.r2.IdentifiersType1;
import org.hl7.knowledgeartifact.r2.KnowledgeResource;
import org.hl7.knowledgeartifact.r2.R2Package;
import org.hl7.knowledgeartifact.r2.TemplateIdsType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Knowledge Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.KnowledgeResourceImpl#getIdentifiers <em>Identifiers</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.KnowledgeResourceImpl#getTemplateIds <em>Template Ids</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.KnowledgeResourceImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.KnowledgeResourceImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.KnowledgeResourceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r2.impl.KnowledgeResourceImpl#getCitation <em>Citation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KnowledgeResourceImpl extends MinimalEObjectImpl.Container implements KnowledgeResource {
	/**
	 * The cached value of the '{@link #getIdentifiers() <em>Identifiers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiers()
	 * @generated
	 * @ordered
	 */
	protected IdentifiersType1 identifiers;

	/**
	 * The cached value of the '{@link #getTemplateIds() <em>Template Ids</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateIds()
	 * @generated
	 * @ordered
	 */
	protected TemplateIdsType templateIds;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected FormattedText title;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected TEL location;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected FormattedText description;

	/**
	 * The cached value of the '{@link #getCitation() <em>Citation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCitation()
	 * @generated
	 * @ordered
	 */
	protected FormattedText citation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KnowledgeResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R2Package.eINSTANCE.getKnowledgeResource();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifiersType1 getIdentifiers() {
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifiers(IdentifiersType1 newIdentifiers, NotificationChain msgs) {
		IdentifiersType1 oldIdentifiers = identifiers;
		identifiers = newIdentifiers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.KNOWLEDGE_RESOURCE__IDENTIFIERS, oldIdentifiers, newIdentifiers);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifiers(IdentifiersType1 newIdentifiers) {
		if (newIdentifiers != identifiers) {
			NotificationChain msgs = null;
			if (identifiers != null)
				msgs = ((InternalEObject)identifiers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.KNOWLEDGE_RESOURCE__IDENTIFIERS, null, msgs);
			if (newIdentifiers != null)
				msgs = ((InternalEObject)newIdentifiers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.KNOWLEDGE_RESOURCE__IDENTIFIERS, null, msgs);
			msgs = basicSetIdentifiers(newIdentifiers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.KNOWLEDGE_RESOURCE__IDENTIFIERS, newIdentifiers, newIdentifiers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateIdsType getTemplateIds() {
		return templateIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplateIds(TemplateIdsType newTemplateIds, NotificationChain msgs) {
		TemplateIdsType oldTemplateIds = templateIds;
		templateIds = newTemplateIds;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.KNOWLEDGE_RESOURCE__TEMPLATE_IDS, oldTemplateIds, newTemplateIds);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateIds(TemplateIdsType newTemplateIds) {
		if (newTemplateIds != templateIds) {
			NotificationChain msgs = null;
			if (templateIds != null)
				msgs = ((InternalEObject)templateIds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.KNOWLEDGE_RESOURCE__TEMPLATE_IDS, null, msgs);
			if (newTemplateIds != null)
				msgs = ((InternalEObject)newTemplateIds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.KNOWLEDGE_RESOURCE__TEMPLATE_IDS, null, msgs);
			msgs = basicSetTemplateIds(newTemplateIds, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.KNOWLEDGE_RESOURCE__TEMPLATE_IDS, newTemplateIds, newTemplateIds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormattedText getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(FormattedText newTitle, NotificationChain msgs) {
		FormattedText oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.KNOWLEDGE_RESOURCE__TITLE, oldTitle, newTitle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(FormattedText newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.KNOWLEDGE_RESOURCE__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.KNOWLEDGE_RESOURCE__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.KNOWLEDGE_RESOURCE__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TEL getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(TEL newLocation, NotificationChain msgs) {
		TEL oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.KNOWLEDGE_RESOURCE__LOCATION, oldLocation, newLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(TEL newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.KNOWLEDGE_RESOURCE__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.KNOWLEDGE_RESOURCE__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.KNOWLEDGE_RESOURCE__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormattedText getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(FormattedText newDescription, NotificationChain msgs) {
		FormattedText oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.KNOWLEDGE_RESOURCE__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(FormattedText newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.KNOWLEDGE_RESOURCE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.KNOWLEDGE_RESOURCE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.KNOWLEDGE_RESOURCE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormattedText getCitation() {
		return citation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCitation(FormattedText newCitation, NotificationChain msgs) {
		FormattedText oldCitation = citation;
		citation = newCitation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R2Package.KNOWLEDGE_RESOURCE__CITATION, oldCitation, newCitation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCitation(FormattedText newCitation) {
		if (newCitation != citation) {
			NotificationChain msgs = null;
			if (citation != null)
				msgs = ((InternalEObject)citation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R2Package.KNOWLEDGE_RESOURCE__CITATION, null, msgs);
			if (newCitation != null)
				msgs = ((InternalEObject)newCitation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R2Package.KNOWLEDGE_RESOURCE__CITATION, null, msgs);
			msgs = basicSetCitation(newCitation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R2Package.KNOWLEDGE_RESOURCE__CITATION, newCitation, newCitation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R2Package.KNOWLEDGE_RESOURCE__IDENTIFIERS:
				return basicSetIdentifiers(null, msgs);
			case R2Package.KNOWLEDGE_RESOURCE__TEMPLATE_IDS:
				return basicSetTemplateIds(null, msgs);
			case R2Package.KNOWLEDGE_RESOURCE__TITLE:
				return basicSetTitle(null, msgs);
			case R2Package.KNOWLEDGE_RESOURCE__LOCATION:
				return basicSetLocation(null, msgs);
			case R2Package.KNOWLEDGE_RESOURCE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case R2Package.KNOWLEDGE_RESOURCE__CITATION:
				return basicSetCitation(null, msgs);
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
			case R2Package.KNOWLEDGE_RESOURCE__IDENTIFIERS:
				return getIdentifiers();
			case R2Package.KNOWLEDGE_RESOURCE__TEMPLATE_IDS:
				return getTemplateIds();
			case R2Package.KNOWLEDGE_RESOURCE__TITLE:
				return getTitle();
			case R2Package.KNOWLEDGE_RESOURCE__LOCATION:
				return getLocation();
			case R2Package.KNOWLEDGE_RESOURCE__DESCRIPTION:
				return getDescription();
			case R2Package.KNOWLEDGE_RESOURCE__CITATION:
				return getCitation();
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
			case R2Package.KNOWLEDGE_RESOURCE__IDENTIFIERS:
				setIdentifiers((IdentifiersType1)newValue);
				return;
			case R2Package.KNOWLEDGE_RESOURCE__TEMPLATE_IDS:
				setTemplateIds((TemplateIdsType)newValue);
				return;
			case R2Package.KNOWLEDGE_RESOURCE__TITLE:
				setTitle((FormattedText)newValue);
				return;
			case R2Package.KNOWLEDGE_RESOURCE__LOCATION:
				setLocation((TEL)newValue);
				return;
			case R2Package.KNOWLEDGE_RESOURCE__DESCRIPTION:
				setDescription((FormattedText)newValue);
				return;
			case R2Package.KNOWLEDGE_RESOURCE__CITATION:
				setCitation((FormattedText)newValue);
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
			case R2Package.KNOWLEDGE_RESOURCE__IDENTIFIERS:
				setIdentifiers((IdentifiersType1)null);
				return;
			case R2Package.KNOWLEDGE_RESOURCE__TEMPLATE_IDS:
				setTemplateIds((TemplateIdsType)null);
				return;
			case R2Package.KNOWLEDGE_RESOURCE__TITLE:
				setTitle((FormattedText)null);
				return;
			case R2Package.KNOWLEDGE_RESOURCE__LOCATION:
				setLocation((TEL)null);
				return;
			case R2Package.KNOWLEDGE_RESOURCE__DESCRIPTION:
				setDescription((FormattedText)null);
				return;
			case R2Package.KNOWLEDGE_RESOURCE__CITATION:
				setCitation((FormattedText)null);
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
			case R2Package.KNOWLEDGE_RESOURCE__IDENTIFIERS:
				return identifiers != null;
			case R2Package.KNOWLEDGE_RESOURCE__TEMPLATE_IDS:
				return templateIds != null;
			case R2Package.KNOWLEDGE_RESOURCE__TITLE:
				return title != null;
			case R2Package.KNOWLEDGE_RESOURCE__LOCATION:
				return location != null;
			case R2Package.KNOWLEDGE_RESOURCE__DESCRIPTION:
				return description != null;
			case R2Package.KNOWLEDGE_RESOURCE__CITATION:
				return citation != null;
		}
		return super.eIsSet(featureID);
	}

} //KnowledgeResourceImpl
