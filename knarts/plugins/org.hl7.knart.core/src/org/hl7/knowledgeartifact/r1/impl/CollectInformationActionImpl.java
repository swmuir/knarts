/**
 */
package org.hl7.knowledgeartifact.r1.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.elm.r1.Expression;

import org.hl7.knowledgeartifact.r1.CollectInformationAction;
import org.hl7.knowledgeartifact.r1.DocumentationItem;
import org.hl7.knowledgeartifact.r1.R1Package;
import org.hl7.knowledgeartifact.r1.ResponseBinding;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collect Information Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.CollectInformationActionImpl#getDocumentationConcept <em>Documentation Concept</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.CollectInformationActionImpl#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link org.hl7.knowledgeartifact.r1.impl.CollectInformationActionImpl#getResponseBinding <em>Response Binding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollectInformationActionImpl extends AtomicActionImpl implements CollectInformationAction {
	/**
	 * The cached value of the '{@link #getDocumentationConcept() <em>Documentation Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentationConcept()
	 * @generated
	 * @ordered
	 */
	protected DocumentationItem documentationConcept;

	/**
	 * The cached value of the '{@link #getInitialValue() <em>Initial Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialValue()
	 * @generated
	 * @ordered
	 */
	protected Expression initialValue;

	/**
	 * The cached value of the '{@link #getResponseBinding() <em>Response Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseBinding()
	 * @generated
	 * @ordered
	 */
	protected ResponseBinding responseBinding;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollectInformationActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return R1Package.Literals.COLLECT_INFORMATION_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentationItem getDocumentationConcept() {
		return documentationConcept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentationConcept(DocumentationItem newDocumentationConcept, NotificationChain msgs) {
		DocumentationItem oldDocumentationConcept = documentationConcept;
		documentationConcept = newDocumentationConcept;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.COLLECT_INFORMATION_ACTION__DOCUMENTATION_CONCEPT, oldDocumentationConcept, newDocumentationConcept);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentationConcept(DocumentationItem newDocumentationConcept) {
		if (newDocumentationConcept != documentationConcept) {
			NotificationChain msgs = null;
			if (documentationConcept != null)
				msgs = ((InternalEObject)documentationConcept).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.COLLECT_INFORMATION_ACTION__DOCUMENTATION_CONCEPT, null, msgs);
			if (newDocumentationConcept != null)
				msgs = ((InternalEObject)newDocumentationConcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.COLLECT_INFORMATION_ACTION__DOCUMENTATION_CONCEPT, null, msgs);
			msgs = basicSetDocumentationConcept(newDocumentationConcept, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.COLLECT_INFORMATION_ACTION__DOCUMENTATION_CONCEPT, newDocumentationConcept, newDocumentationConcept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getInitialValue() {
		return initialValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialValue(Expression newInitialValue, NotificationChain msgs) {
		Expression oldInitialValue = initialValue;
		initialValue = newInitialValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.COLLECT_INFORMATION_ACTION__INITIAL_VALUE, oldInitialValue, newInitialValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialValue(Expression newInitialValue) {
		if (newInitialValue != initialValue) {
			NotificationChain msgs = null;
			if (initialValue != null)
				msgs = ((InternalEObject)initialValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.COLLECT_INFORMATION_ACTION__INITIAL_VALUE, null, msgs);
			if (newInitialValue != null)
				msgs = ((InternalEObject)newInitialValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.COLLECT_INFORMATION_ACTION__INITIAL_VALUE, null, msgs);
			msgs = basicSetInitialValue(newInitialValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.COLLECT_INFORMATION_ACTION__INITIAL_VALUE, newInitialValue, newInitialValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseBinding getResponseBinding() {
		return responseBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponseBinding(ResponseBinding newResponseBinding, NotificationChain msgs) {
		ResponseBinding oldResponseBinding = responseBinding;
		responseBinding = newResponseBinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, R1Package.COLLECT_INFORMATION_ACTION__RESPONSE_BINDING, oldResponseBinding, newResponseBinding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseBinding(ResponseBinding newResponseBinding) {
		if (newResponseBinding != responseBinding) {
			NotificationChain msgs = null;
			if (responseBinding != null)
				msgs = ((InternalEObject)responseBinding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - R1Package.COLLECT_INFORMATION_ACTION__RESPONSE_BINDING, null, msgs);
			if (newResponseBinding != null)
				msgs = ((InternalEObject)newResponseBinding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - R1Package.COLLECT_INFORMATION_ACTION__RESPONSE_BINDING, null, msgs);
			msgs = basicSetResponseBinding(newResponseBinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, R1Package.COLLECT_INFORMATION_ACTION__RESPONSE_BINDING, newResponseBinding, newResponseBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case R1Package.COLLECT_INFORMATION_ACTION__DOCUMENTATION_CONCEPT:
				return basicSetDocumentationConcept(null, msgs);
			case R1Package.COLLECT_INFORMATION_ACTION__INITIAL_VALUE:
				return basicSetInitialValue(null, msgs);
			case R1Package.COLLECT_INFORMATION_ACTION__RESPONSE_BINDING:
				return basicSetResponseBinding(null, msgs);
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
			case R1Package.COLLECT_INFORMATION_ACTION__DOCUMENTATION_CONCEPT:
				return getDocumentationConcept();
			case R1Package.COLLECT_INFORMATION_ACTION__INITIAL_VALUE:
				return getInitialValue();
			case R1Package.COLLECT_INFORMATION_ACTION__RESPONSE_BINDING:
				return getResponseBinding();
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
			case R1Package.COLLECT_INFORMATION_ACTION__DOCUMENTATION_CONCEPT:
				setDocumentationConcept((DocumentationItem)newValue);
				return;
			case R1Package.COLLECT_INFORMATION_ACTION__INITIAL_VALUE:
				setInitialValue((Expression)newValue);
				return;
			case R1Package.COLLECT_INFORMATION_ACTION__RESPONSE_BINDING:
				setResponseBinding((ResponseBinding)newValue);
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
			case R1Package.COLLECT_INFORMATION_ACTION__DOCUMENTATION_CONCEPT:
				setDocumentationConcept((DocumentationItem)null);
				return;
			case R1Package.COLLECT_INFORMATION_ACTION__INITIAL_VALUE:
				setInitialValue((Expression)null);
				return;
			case R1Package.COLLECT_INFORMATION_ACTION__RESPONSE_BINDING:
				setResponseBinding((ResponseBinding)null);
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
			case R1Package.COLLECT_INFORMATION_ACTION__DOCUMENTATION_CONCEPT:
				return documentationConcept != null;
			case R1Package.COLLECT_INFORMATION_ACTION__INITIAL_VALUE:
				return initialValue != null;
			case R1Package.COLLECT_INFORMATION_ACTION__RESPONSE_BINDING:
				return responseBinding != null;
		}
		return super.eIsSet(featureID);
	}

} //CollectInformationActionImpl
