/**
 */
package org.hl7.knowledgeartifact.r1.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.knowledgeartifact.r1.DocumentationItem;
import org.hl7.knowledgeartifact.r1.FormattedText;
import org.hl7.knowledgeartifact.r1.ItemCodesType;
import org.hl7.knowledgeartifact.r1.R1Package;
import org.hl7.knowledgeartifact.r1.RangeConstraint;
import org.hl7.knowledgeartifact.r1.ResponseCardinalityType;
import org.hl7.knowledgeartifact.r1.ResponseDataTypeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Documentation Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.DocumentationItemImpl#getPrompt <em>Prompt</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.DocumentationItemImpl#getAdditionalInstructions <em>Additional Instructions</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.DocumentationItemImpl#getTextAfterResponse <em>Text After Response</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.DocumentationItemImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.DocumentationItemImpl#getItemCodes <em>Item Codes</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.DocumentationItemImpl#getResponseDataType <em>Response Data Type</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.DocumentationItemImpl#getResponseCardinality <em>Response Cardinality</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.DocumentationItemImpl#getResponseRange <em>Response Range</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentationItemImpl extends ItemDefinitionImpl implements DocumentationItem {
	/**
	 * The cached value of the '{@link #getPrompt() <em>Prompt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrompt()
	 * @generated
	 * @ordered
	 */
	protected FormattedText prompt;

	/**
	 * The cached value of the '{@link #getAdditionalInstructions() <em>Additional Instructions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalInstructions()
	 * @generated
	 * @ordered
	 */
	protected EList<FormattedText> additionalInstructions;

	/**
	 * The cached value of the '{@link #getTextAfterResponse() <em>Text After Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextAfterResponse()
	 * @generated
	 * @ordered
	 */
	protected FormattedText textAfterResponse;

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
	 * The cached value of the '{@link #getItemCodes() <em>Item Codes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemCodes()
	 * @generated
	 * @ordered
	 */
	protected ItemCodesType itemCodes;

	/**
	 * The cached value of the '{@link #getResponseDataType() <em>Response Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseDataType()
	 * @generated
	 * @ordered
	 */
	protected ResponseDataTypeType responseDataType;

	/**
	 * The cached value of the '{@link #getResponseCardinality() <em>Response Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseCardinality()
	 * @generated
	 * @ordered
	 */
	protected ResponseCardinalityType responseCardinality;

	/**
	 * The cached value of the '{@link #getResponseRange() <em>Response Range</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseRange()
	 * @generated
	 * @ordered
	 */
	protected EList<RangeConstraint> responseRange;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentationItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R1Package.Literals.DOCUMENTATION_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormattedText getPrompt() {
		return prompt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrompt(FormattedText newPrompt, NotificationChain msgs) {
		FormattedText oldPrompt = prompt;
		prompt = newPrompt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.DOCUMENTATION_ITEM__PROMPT, oldPrompt, newPrompt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrompt(FormattedText newPrompt) {
		if (newPrompt != prompt) {
			NotificationChain msgs = null;
			if (prompt != null)
				msgs = ((InternalEObject)prompt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.DOCUMENTATION_ITEM__PROMPT, null, msgs);
			if (newPrompt != null)
				msgs = ((InternalEObject)newPrompt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.DOCUMENTATION_ITEM__PROMPT, null, msgs);
			msgs = basicSetPrompt(newPrompt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.DOCUMENTATION_ITEM__PROMPT, newPrompt, newPrompt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FormattedText> getAdditionalInstructions() {
		if (additionalInstructions == null) {
			additionalInstructions = new EObjectContainmentEList<FormattedText>(FormattedText.class, this, R1Package.DOCUMENTATION_ITEM__ADDITIONAL_INSTRUCTIONS);
		}
		return additionalInstructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormattedText getTextAfterResponse() {
		return textAfterResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextAfterResponse(FormattedText newTextAfterResponse, NotificationChain msgs) {
		FormattedText oldTextAfterResponse = textAfterResponse;
		textAfterResponse = newTextAfterResponse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.DOCUMENTATION_ITEM__TEXT_AFTER_RESPONSE, oldTextAfterResponse, newTextAfterResponse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextAfterResponse(FormattedText newTextAfterResponse) {
		if (newTextAfterResponse != textAfterResponse) {
			NotificationChain msgs = null;
			if (textAfterResponse != null)
				msgs = ((InternalEObject)textAfterResponse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.DOCUMENTATION_ITEM__TEXT_AFTER_RESPONSE, null, msgs);
			if (newTextAfterResponse != null)
				msgs = ((InternalEObject)newTextAfterResponse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.DOCUMENTATION_ITEM__TEXT_AFTER_RESPONSE, null, msgs);
			msgs = basicSetTextAfterResponse(newTextAfterResponse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.DOCUMENTATION_ITEM__TEXT_AFTER_RESPONSE, newTextAfterResponse, newTextAfterResponse));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.DOCUMENTATION_ITEM__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.DOCUMENTATION_ITEM__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.DOCUMENTATION_ITEM__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.DOCUMENTATION_ITEM__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemCodesType getItemCodes() {
		return itemCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItemCodes(ItemCodesType newItemCodes, NotificationChain msgs) {
		ItemCodesType oldItemCodes = itemCodes;
		itemCodes = newItemCodes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.DOCUMENTATION_ITEM__ITEM_CODES, oldItemCodes, newItemCodes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemCodes(ItemCodesType newItemCodes) {
		if (newItemCodes != itemCodes) {
			NotificationChain msgs = null;
			if (itemCodes != null)
				msgs = ((InternalEObject)itemCodes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.DOCUMENTATION_ITEM__ITEM_CODES, null, msgs);
			if (newItemCodes != null)
				msgs = ((InternalEObject)newItemCodes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.DOCUMENTATION_ITEM__ITEM_CODES, null, msgs);
			msgs = basicSetItemCodes(newItemCodes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.DOCUMENTATION_ITEM__ITEM_CODES, newItemCodes, newItemCodes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseDataTypeType getResponseDataType() {
		return responseDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponseDataType(ResponseDataTypeType newResponseDataType, NotificationChain msgs) {
		ResponseDataTypeType oldResponseDataType = responseDataType;
		responseDataType = newResponseDataType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.DOCUMENTATION_ITEM__RESPONSE_DATA_TYPE, oldResponseDataType, newResponseDataType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseDataType(ResponseDataTypeType newResponseDataType) {
		if (newResponseDataType != responseDataType) {
			NotificationChain msgs = null;
			if (responseDataType != null)
				msgs = ((InternalEObject)responseDataType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.DOCUMENTATION_ITEM__RESPONSE_DATA_TYPE, null, msgs);
			if (newResponseDataType != null)
				msgs = ((InternalEObject)newResponseDataType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.DOCUMENTATION_ITEM__RESPONSE_DATA_TYPE, null, msgs);
			msgs = basicSetResponseDataType(newResponseDataType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.DOCUMENTATION_ITEM__RESPONSE_DATA_TYPE, newResponseDataType, newResponseDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseCardinalityType getResponseCardinality() {
		return responseCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponseCardinality(ResponseCardinalityType newResponseCardinality, NotificationChain msgs) {
		ResponseCardinalityType oldResponseCardinality = responseCardinality;
		responseCardinality = newResponseCardinality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.DOCUMENTATION_ITEM__RESPONSE_CARDINALITY, oldResponseCardinality, newResponseCardinality);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseCardinality(ResponseCardinalityType newResponseCardinality) {
		if (newResponseCardinality != responseCardinality) {
			NotificationChain msgs = null;
			if (responseCardinality != null)
				msgs = ((InternalEObject)responseCardinality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.DOCUMENTATION_ITEM__RESPONSE_CARDINALITY, null, msgs);
			if (newResponseCardinality != null)
				msgs = ((InternalEObject)newResponseCardinality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.DOCUMENTATION_ITEM__RESPONSE_CARDINALITY, null, msgs);
			msgs = basicSetResponseCardinality(newResponseCardinality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.DOCUMENTATION_ITEM__RESPONSE_CARDINALITY, newResponseCardinality, newResponseCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RangeConstraint> getResponseRange() {
		if (responseRange == null) {
			responseRange = new EObjectContainmentEList<RangeConstraint>(RangeConstraint.class, this, R1Package.DOCUMENTATION_ITEM__RESPONSE_RANGE);
		}
		return responseRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R1Package.DOCUMENTATION_ITEM__PROMPT:
				return basicSetPrompt(null, msgs);
			case R1Package.DOCUMENTATION_ITEM__ADDITIONAL_INSTRUCTIONS:
				return ((InternalEList<?>)getAdditionalInstructions()).basicRemove(otherEnd, msgs);
			case R1Package.DOCUMENTATION_ITEM__TEXT_AFTER_RESPONSE:
				return basicSetTextAfterResponse(null, msgs);
			case R1Package.DOCUMENTATION_ITEM__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case R1Package.DOCUMENTATION_ITEM__ITEM_CODES:
				return basicSetItemCodes(null, msgs);
			case R1Package.DOCUMENTATION_ITEM__RESPONSE_DATA_TYPE:
				return basicSetResponseDataType(null, msgs);
			case R1Package.DOCUMENTATION_ITEM__RESPONSE_CARDINALITY:
				return basicSetResponseCardinality(null, msgs);
			case R1Package.DOCUMENTATION_ITEM__RESPONSE_RANGE:
				return ((InternalEList<?>)getResponseRange()).basicRemove(otherEnd, msgs);
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
			case R1Package.DOCUMENTATION_ITEM__PROMPT:
				return getPrompt();
			case R1Package.DOCUMENTATION_ITEM__ADDITIONAL_INSTRUCTIONS:
				return getAdditionalInstructions();
			case R1Package.DOCUMENTATION_ITEM__TEXT_AFTER_RESPONSE:
				return getTextAfterResponse();
			case R1Package.DOCUMENTATION_ITEM__DESCRIPTION:
				return getDescription();
			case R1Package.DOCUMENTATION_ITEM__ITEM_CODES:
				return getItemCodes();
			case R1Package.DOCUMENTATION_ITEM__RESPONSE_DATA_TYPE:
				return getResponseDataType();
			case R1Package.DOCUMENTATION_ITEM__RESPONSE_CARDINALITY:
				return getResponseCardinality();
			case R1Package.DOCUMENTATION_ITEM__RESPONSE_RANGE:
				return getResponseRange();
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
			case R1Package.DOCUMENTATION_ITEM__PROMPT:
				setPrompt((FormattedText)newValue);
				return;
			case R1Package.DOCUMENTATION_ITEM__ADDITIONAL_INSTRUCTIONS:
				getAdditionalInstructions().clear();
				getAdditionalInstructions().addAll((Collection<? extends FormattedText>)newValue);
				return;
			case R1Package.DOCUMENTATION_ITEM__TEXT_AFTER_RESPONSE:
				setTextAfterResponse((FormattedText)newValue);
				return;
			case R1Package.DOCUMENTATION_ITEM__DESCRIPTION:
				setDescription((FormattedText)newValue);
				return;
			case R1Package.DOCUMENTATION_ITEM__ITEM_CODES:
				setItemCodes((ItemCodesType)newValue);
				return;
			case R1Package.DOCUMENTATION_ITEM__RESPONSE_DATA_TYPE:
				setResponseDataType((ResponseDataTypeType)newValue);
				return;
			case R1Package.DOCUMENTATION_ITEM__RESPONSE_CARDINALITY:
				setResponseCardinality((ResponseCardinalityType)newValue);
				return;
			case R1Package.DOCUMENTATION_ITEM__RESPONSE_RANGE:
				getResponseRange().clear();
				getResponseRange().addAll((Collection<? extends RangeConstraint>)newValue);
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
			case R1Package.DOCUMENTATION_ITEM__PROMPT:
				setPrompt((FormattedText)null);
				return;
			case R1Package.DOCUMENTATION_ITEM__ADDITIONAL_INSTRUCTIONS:
				getAdditionalInstructions().clear();
				return;
			case R1Package.DOCUMENTATION_ITEM__TEXT_AFTER_RESPONSE:
				setTextAfterResponse((FormattedText)null);
				return;
			case R1Package.DOCUMENTATION_ITEM__DESCRIPTION:
				setDescription((FormattedText)null);
				return;
			case R1Package.DOCUMENTATION_ITEM__ITEM_CODES:
				setItemCodes((ItemCodesType)null);
				return;
			case R1Package.DOCUMENTATION_ITEM__RESPONSE_DATA_TYPE:
				setResponseDataType((ResponseDataTypeType)null);
				return;
			case R1Package.DOCUMENTATION_ITEM__RESPONSE_CARDINALITY:
				setResponseCardinality((ResponseCardinalityType)null);
				return;
			case R1Package.DOCUMENTATION_ITEM__RESPONSE_RANGE:
				getResponseRange().clear();
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
			case R1Package.DOCUMENTATION_ITEM__PROMPT:
				return prompt != null;
			case R1Package.DOCUMENTATION_ITEM__ADDITIONAL_INSTRUCTIONS:
				return additionalInstructions != null && !additionalInstructions.isEmpty();
			case R1Package.DOCUMENTATION_ITEM__TEXT_AFTER_RESPONSE:
				return textAfterResponse != null;
			case R1Package.DOCUMENTATION_ITEM__DESCRIPTION:
				return description != null;
			case R1Package.DOCUMENTATION_ITEM__ITEM_CODES:
				return itemCodes != null;
			case R1Package.DOCUMENTATION_ITEM__RESPONSE_DATA_TYPE:
				return responseDataType != null;
			case R1Package.DOCUMENTATION_ITEM__RESPONSE_CARDINALITY:
				return responseCardinality != null;
			case R1Package.DOCUMENTATION_ITEM__RESPONSE_RANGE:
				return responseRange != null && !responseRange.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DocumentationItemImpl
