/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.DataType;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.QuestionnaireResponseItem;
import fhiRCore.resources.QuestionnaireResponseItemAnswer;
import fhiRCore.resources.ResourcesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Questionnaire Response Item Answer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.QuestionnaireResponseItemAnswerImpl#getValuex <em>Valuex</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.QuestionnaireResponseItemAnswerImpl#getItems <em>Item</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionnaireResponseItemAnswerImpl extends BackboneElementImpl implements QuestionnaireResponseItemAnswer {
	/**
	 * The cached value of the '{@link #getValuex() <em>Valuex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuex()
	 * @generated
	 * @ordered
	 */
	protected DataType valuex;

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
	protected QuestionnaireResponseItemAnswerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getQuestionnaireResponseItemAnswer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getValuex() {
		return valuex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValuex(DataType newValuex, NotificationChain msgs) {
		DataType oldValuex = valuex;
		valuex = newValuex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM_ANSWER__VALUEX, oldValuex, newValuex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValuex(DataType newValuex) {
		if (newValuex != valuex) {
			NotificationChain msgs = null;
			if (valuex != null)
				msgs = ((InternalEObject)valuex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM_ANSWER__VALUEX, null, msgs);
			if (newValuex != null)
				msgs = ((InternalEObject)newValuex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM_ANSWER__VALUEX, null, msgs);
			msgs = basicSetValuex(newValuex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM_ANSWER__VALUEX, newValuex, newValuex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuestionnaireResponseItem> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<QuestionnaireResponseItem>(QuestionnaireResponseItem.class, this, ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM_ANSWER__ITEM);
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
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM_ANSWER__VALUEX:
				return basicSetValuex(null, msgs);
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM_ANSWER__ITEM:
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
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM_ANSWER__VALUEX:
				return getValuex();
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM_ANSWER__ITEM:
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
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM_ANSWER__VALUEX:
				setValuex((DataType)newValue);
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM_ANSWER__ITEM:
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
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM_ANSWER__VALUEX:
				setValuex((DataType)null);
				return;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM_ANSWER__ITEM:
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
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM_ANSWER__VALUEX:
				return valuex != null;
			case ResourcesPackage.QUESTIONNAIRE_RESPONSE_ITEM_ANSWER__ITEM:
				return items != null && !items.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QuestionnaireResponseItemAnswerImpl
