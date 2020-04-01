/**
 */
package org.eclipse.mdht.hl7.fhir.resources.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.mdht.hl7.fhir.dataTypes.impl.BackboneElementImpl;

import org.eclipse.mdht.hl7.fhir.resources.ResourcesPackage;
import org.eclipse.mdht.hl7.fhir.resources.TestReportSetupSetupActionAssert;
import org.eclipse.mdht.hl7.fhir.resources.TestReportSetupSetupActionOperation;
import org.eclipse.mdht.hl7.fhir.resources.TestReportTestTestAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Report Test Test Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.TestReportTestTestActionImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.eclipse.mdht.hl7.fhir.resources.impl.TestReportTestTestActionImpl#getAssert <em>Assert</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestReportTestTestActionImpl extends BackboneElementImpl implements TestReportTestTestAction {
	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected TestReportSetupSetupActionOperation operation;

	/**
	 * The cached value of the '{@link #getAssert() <em>Assert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssert()
	 * @generated
	 * @ordered
	 */
	protected TestReportSetupSetupActionAssert assert_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestReportTestTestActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getTestReportTestTestAction();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestReportSetupSetupActionOperation getOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperation(TestReportSetupSetupActionOperation newOperation, NotificationChain msgs) {
		TestReportSetupSetupActionOperation oldOperation = operation;
		operation = newOperation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_REPORT_TEST_TEST_ACTION__OPERATION, oldOperation, newOperation);
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
	public void setOperation(TestReportSetupSetupActionOperation newOperation) {
		if (newOperation != operation) {
			NotificationChain msgs = null;
			if (operation != null)
				msgs = ((InternalEObject)operation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_REPORT_TEST_TEST_ACTION__OPERATION, null, msgs);
			if (newOperation != null)
				msgs = ((InternalEObject)newOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_REPORT_TEST_TEST_ACTION__OPERATION, null, msgs);
			msgs = basicSetOperation(newOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_REPORT_TEST_TEST_ACTION__OPERATION, newOperation, newOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestReportSetupSetupActionAssert getAssert() {
		return assert_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssert(TestReportSetupSetupActionAssert newAssert, NotificationChain msgs) {
		TestReportSetupSetupActionAssert oldAssert = assert_;
		assert_ = newAssert;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_REPORT_TEST_TEST_ACTION__ASSERT, oldAssert, newAssert);
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
	public void setAssert(TestReportSetupSetupActionAssert newAssert) {
		if (newAssert != assert_) {
			NotificationChain msgs = null;
			if (assert_ != null)
				msgs = ((InternalEObject)assert_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_REPORT_TEST_TEST_ACTION__ASSERT, null, msgs);
			if (newAssert != null)
				msgs = ((InternalEObject)newAssert).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TEST_REPORT_TEST_TEST_ACTION__ASSERT, null, msgs);
			msgs = basicSetAssert(newAssert, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TEST_REPORT_TEST_TEST_ACTION__ASSERT, newAssert, newAssert));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.TEST_REPORT_TEST_TEST_ACTION__OPERATION:
				return basicSetOperation(null, msgs);
			case ResourcesPackage.TEST_REPORT_TEST_TEST_ACTION__ASSERT:
				return basicSetAssert(null, msgs);
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
			case ResourcesPackage.TEST_REPORT_TEST_TEST_ACTION__OPERATION:
				return getOperation();
			case ResourcesPackage.TEST_REPORT_TEST_TEST_ACTION__ASSERT:
				return getAssert();
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
			case ResourcesPackage.TEST_REPORT_TEST_TEST_ACTION__OPERATION:
				setOperation((TestReportSetupSetupActionOperation)newValue);
				return;
			case ResourcesPackage.TEST_REPORT_TEST_TEST_ACTION__ASSERT:
				setAssert((TestReportSetupSetupActionAssert)newValue);
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
			case ResourcesPackage.TEST_REPORT_TEST_TEST_ACTION__OPERATION:
				setOperation((TestReportSetupSetupActionOperation)null);
				return;
			case ResourcesPackage.TEST_REPORT_TEST_TEST_ACTION__ASSERT:
				setAssert((TestReportSetupSetupActionAssert)null);
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
			case ResourcesPackage.TEST_REPORT_TEST_TEST_ACTION__OPERATION:
				return operation != null;
			case ResourcesPackage.TEST_REPORT_TEST_TEST_ACTION__ASSERT:
				return assert_ != null;
		}
		return super.eIsSet(featureID);
	}

} //TestReportTestTestActionImpl
