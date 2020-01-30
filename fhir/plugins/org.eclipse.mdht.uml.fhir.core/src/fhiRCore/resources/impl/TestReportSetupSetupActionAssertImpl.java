/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.Markdown;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.ResourcesPackage;
import fhiRCore.resources.TestReportSetupSetupActionAssert;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Report Setup Setup Action Assert</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.TestReportSetupSetupActionAssertImpl#getResult <em>Result</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestReportSetupSetupActionAssertImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TestReportSetupSetupActionAssertImpl#getDetail <em>Detail</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestReportSetupSetupActionAssertImpl extends BackboneElementImpl implements TestReportSetupSetupActionAssert {
	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected Code result;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected Markdown message;

	/**
	 * The cached value of the '{@link #getDetail() <em>Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetail()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String detail;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestReportSetupSetupActionAssertImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getTestReportSetupSetupActionAssert();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResult(Code newResult, NotificationChain msgs) {
		Code oldResult = result;
		result = newResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_REPORT_SETUP_SETUP_ACTION_ASSERT__RESULT, oldResult, newResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResult(Code newResult) {
		if (newResult != result) {
			NotificationChain msgs = null;
			if (result != null)
				msgs = ((InternalEObject)result).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_REPORT_SETUP_SETUP_ACTION_ASSERT__RESULT, null, msgs);
			if (newResult != null)
				msgs = ((InternalEObject)newResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_REPORT_SETUP_SETUP_ACTION_ASSERT__RESULT, null, msgs);
			msgs = basicSetResult(newResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_REPORT_SETUP_SETUP_ACTION_ASSERT__RESULT, newResult, newResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Markdown getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessage(Markdown newMessage, NotificationChain msgs) {
		Markdown oldMessage = message;
		message = newMessage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_REPORT_SETUP_SETUP_ACTION_ASSERT__MESSAGE, oldMessage, newMessage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(Markdown newMessage) {
		if (newMessage != message) {
			NotificationChain msgs = null;
			if (message != null)
				msgs = ((InternalEObject)message).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_REPORT_SETUP_SETUP_ACTION_ASSERT__MESSAGE, null, msgs);
			if (newMessage != null)
				msgs = ((InternalEObject)newMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_REPORT_SETUP_SETUP_ACTION_ASSERT__MESSAGE, null, msgs);
			msgs = basicSetMessage(newMessage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_REPORT_SETUP_SETUP_ACTION_ASSERT__MESSAGE, newMessage, newMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getDetail() {
		return detail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDetail(fhiRCore.dataTypes.String newDetail, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldDetail = detail;
		detail = newDetail;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_REPORT_SETUP_SETUP_ACTION_ASSERT__DETAIL, oldDetail, newDetail);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetail(fhiRCore.dataTypes.String newDetail) {
		if (newDetail != detail) {
			NotificationChain msgs = null;
			if (detail != null)
				msgs = ((InternalEObject)detail).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_REPORT_SETUP_SETUP_ACTION_ASSERT__DETAIL, null, msgs);
			if (newDetail != null)
				msgs = ((InternalEObject)newDetail).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_REPORT_SETUP_SETUP_ACTION_ASSERT__DETAIL, null, msgs);
			msgs = basicSetDetail(newDetail, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_REPORT_SETUP_SETUP_ACTION_ASSERT__DETAIL, newDetail, newDetail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.TEST_REPORT_SETUP_SETUP_ACTION_ASSERT__RESULT:
				return basicSetResult(null, msgs);
			case ResourcesPackage.TEST_REPORT_SETUP_SETUP_ACTION_ASSERT__MESSAGE:
				return basicSetMessage(null, msgs);
			case ResourcesPackage.TEST_REPORT_SETUP_SETUP_ACTION_ASSERT__DETAIL:
				return basicSetDetail(null, msgs);
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
			case ResourcesPackage.TEST_REPORT_SETUP_SETUP_ACTION_ASSERT__RESULT:
				return getResult();
			case ResourcesPackage.TEST_REPORT_SETUP_SETUP_ACTION_ASSERT__MESSAGE:
				return getMessage();
			case ResourcesPackage.TEST_REPORT_SETUP_SETUP_ACTION_ASSERT__DETAIL:
				return getDetail();
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
			case ResourcesPackage.TEST_REPORT_SETUP_SETUP_ACTION_ASSERT__RESULT:
				setResult((Code)newValue);
				return;
			case ResourcesPackage.TEST_REPORT_SETUP_SETUP_ACTION_ASSERT__MESSAGE:
				setMessage((Markdown)newValue);
				return;
			case ResourcesPackage.TEST_REPORT_SETUP_SETUP_ACTION_ASSERT__DETAIL:
				setDetail((fhiRCore.dataTypes.String)newValue);
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
			case ResourcesPackage.TEST_REPORT_SETUP_SETUP_ACTION_ASSERT__RESULT:
				setResult((Code)null);
				return;
			case ResourcesPackage.TEST_REPORT_SETUP_SETUP_ACTION_ASSERT__MESSAGE:
				setMessage((Markdown)null);
				return;
			case ResourcesPackage.TEST_REPORT_SETUP_SETUP_ACTION_ASSERT__DETAIL:
				setDetail((fhiRCore.dataTypes.String)null);
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
			case ResourcesPackage.TEST_REPORT_SETUP_SETUP_ACTION_ASSERT__RESULT:
				return result != null;
			case ResourcesPackage.TEST_REPORT_SETUP_SETUP_ACTION_ASSERT__MESSAGE:
				return message != null;
			case ResourcesPackage.TEST_REPORT_SETUP_SETUP_ACTION_ASSERT__DETAIL:
				return detail != null;
		}
		return super.eIsSet(featureID);
	}

} //TestReportSetupSetupActionAssertImpl
