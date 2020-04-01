/**
 */
package org.eclipse.mdht.hl7.fhir.resources.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.mdht.hl7.fhir.dataTypes.Uri;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.QuestionnaireResponseItem;
import org.eclipse.mdht.hl7.fhir.resources.QuestionnaireResponseItemAnswer;
import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Questionnaire Response Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.QuestionnaireResponseItemImpl#getLinkId <em>Link Id</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.QuestionnaireResponseItemImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.QuestionnaireResponseItemImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.QuestionnaireResponseItemImpl#getAnswers <em>Answer</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.QuestionnaireResponseItemImpl#getItems <em>Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionnaireResponseItemImpl extends BackboneElementImpl implements QuestionnaireResponseItem {
	/**
	 * The cached value of the '{@link #getLinkId() <em>Link Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkId()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String linkId;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected Uri definition;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.mdht.hl7.fhir.dataTypes.String text;

	/**
	 * The cached value of the '{@link #getAnswers() <em>Answer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswers()
	 * @generated
	 * @ordered
	 */
	protected EList<QuestionnaireResponseItemAnswer> answers;

	/**
	 * The cached value of the '{@link #getItems() <em>Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<QuestionnaireResponseItem> items;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionnaireResponseItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getQuestionnaireResponseItem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getLinkId() {
		return linkId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinkId(org.eclipse.mdht.hl7.fhir.dataTypes.String newLinkId, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldLinkId = linkId;
		linkId = newLinkId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__LINK_ID, oldLinkId, newLinkId);
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
	public void setLinkId(org.eclipse.mdht.hl7.fhir.dataTypes.String newLinkId) {
		if (newLinkId != linkId) {
			NotificationChain msgs = null;
			if (linkId != null)
				msgs = ((InternalEObject)linkId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__LINK_ID, null, msgs);
			if (newLinkId != null)
				msgs = ((InternalEObject)newLinkId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__LINK_ID, null, msgs);
			msgs = basicSetLinkId(newLinkId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__LINK_ID, newLinkId, newLinkId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Uri getDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinition(Uri newDefinition, NotificationChain msgs) {
		Uri oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__DEFINITION, oldDefinition, newDefinition);
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
	public void setDefinition(Uri newDefinition) {
		if (newDefinition != definition) {
			NotificationChain msgs = null;
			if (definition != null)
				msgs = ((InternalEObject)definition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__DEFINITION, null, msgs);
			if (newDefinition != null)
				msgs = ((InternalEObject)newDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__DEFINITION, null, msgs);
			msgs = basicSetDefinition(newDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__DEFINITION, newDefinition, newDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.mdht.hl7.fhir.dataTypes.String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetText(org.eclipse.mdht.hl7.fhir.dataTypes.String newText, NotificationChain msgs) {
		org.eclipse.mdht.hl7.fhir.dataTypes.String oldText = text;
		text = newText;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__TEXT, oldText, newText);
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
	public void setText(org.eclipse.mdht.hl7.fhir.dataTypes.String newText) {
		if (newText != text) {
			NotificationChain msgs = null;
			if (text != null)
				msgs = ((InternalEObject)text).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__TEXT, null, msgs);
			if (newText != null)
				msgs = ((InternalEObject)newText).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__TEXT, null, msgs);
			msgs = basicSetText(newText, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__TEXT, newText, newText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QuestionnaireResponseItemAnswer> getAnswers() {
		if (answers == null) {
			answers = new EObjectContainmentEList<QuestionnaireResponseItemAnswer>(QuestionnaireResponseItemAnswer.class, this, ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__ANSWER);
		}
		return answers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QuestionnaireResponseItem> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<QuestionnaireResponseItem>(QuestionnaireResponseItem.class, this, ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__ITEM);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__LINK_ID:
				return basicSetLinkId(null, msgs);
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__DEFINITION:
				return basicSetDefinition(null, msgs);
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__TEXT:
				return basicSetText(null, msgs);
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__ANSWER:
				return ((InternalEList<?>)getAnswers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__ITEM:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__LINK_ID:
				return getLinkId();
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__DEFINITION:
				return getDefinition();
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__TEXT:
				return getText();
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__ANSWER:
				return getAnswers();
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__ITEM:
				return getItems();
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
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__LINK_ID:
				setLinkId((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__DEFINITION:
				setDefinition((Uri)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__TEXT:
				setText((org.eclipse.mdht.hl7.fhir.dataTypes.String)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__ANSWER:
				getAnswers().clear();
				getAnswers().addAll((Collection<? extends QuestionnaireResponseItemAnswer>)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__ITEM:
				getItems().clear();
				getItems().addAll((Collection<? extends QuestionnaireResponseItem>)newValue);
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
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__LINK_ID:
				setLinkId((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__DEFINITION:
				setDefinition((Uri)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__TEXT:
				setText((org.eclipse.mdht.hl7.fhir.dataTypes.String)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__ANSWER:
				getAnswers().clear();
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__ITEM:
				getItems().clear();
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
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__LINK_ID:
				return linkId != null;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__DEFINITION:
				return definition != null;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__TEXT:
				return text != null;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__ANSWER:
				return answers != null && !answers.isEmpty();
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM__ITEM:
				return items != null && !items.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QuestionnaireResponseItemImpl
