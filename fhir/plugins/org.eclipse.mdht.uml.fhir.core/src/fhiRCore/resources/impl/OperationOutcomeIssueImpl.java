/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.CodeableConcept;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.OperationOutcomeIssue;
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
 * An implementation of the model object '<em><b>Operation Outcome Issue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.OperationOutcomeIssueImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OperationOutcomeIssueImpl#getCode <em>Code</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OperationOutcomeIssueImpl#getDetails <em>Details</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OperationOutcomeIssueImpl#getDiagnostics <em>Diagnostics</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OperationOutcomeIssueImpl#getLocations <em>Location</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.OperationOutcomeIssueImpl#getExpressions <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationOutcomeIssueImpl extends BackboneElementImpl implements OperationOutcomeIssue {
	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected Code severity;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected Code code;

	/**
	 * The cached value of the '{@link #getDetails() <em>Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetails()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept details;

	/**
	 * The cached value of the '{@link #getDiagnostics() <em>Diagnostics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnostics()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String diagnostics;

	/**
	 * The cached value of the '{@link #getLocations() <em>Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<fhiRCore.dataTypes.String> locations;

	/**
	 * The cached value of the '{@link #getExpressions() <em>Expression</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList<fhiRCore.dataTypes.String> expressions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationOutcomeIssueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getOperationOutcomeIssue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeverity(Code newSeverity, NotificationChain msgs) {
		Code oldSeverity = severity;
		severity = newSeverity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_OUTCOME_ISSUE__SEVERITY, oldSeverity, newSeverity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeverity(Code newSeverity) {
		if (newSeverity != severity) {
			NotificationChain msgs = null;
			if (severity != null)
				msgs = ((InternalEObject)severity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_OUTCOME_ISSUE__SEVERITY, null, msgs);
			if (newSeverity != null)
				msgs = ((InternalEObject)newSeverity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_OUTCOME_ISSUE__SEVERITY, null, msgs);
			msgs = basicSetSeverity(newSeverity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_OUTCOME_ISSUE__SEVERITY, newSeverity, newSeverity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCode(Code newCode, NotificationChain msgs) {
		Code oldCode = code;
		code = newCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_OUTCOME_ISSUE__CODE, oldCode, newCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(Code newCode) {
		if (newCode != code) {
			NotificationChain msgs = null;
			if (code != null)
				msgs = ((InternalEObject)code).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_OUTCOME_ISSUE__CODE, null, msgs);
			if (newCode != null)
				msgs = ((InternalEObject)newCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_OUTCOME_ISSUE__CODE, null, msgs);
			msgs = basicSetCode(newCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_OUTCOME_ISSUE__CODE, newCode, newCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getDetails() {
		return details;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDetails(CodeableConcept newDetails, NotificationChain msgs) {
		CodeableConcept oldDetails = details;
		details = newDetails;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_OUTCOME_ISSUE__DETAILS, oldDetails, newDetails);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetails(CodeableConcept newDetails) {
		if (newDetails != details) {
			NotificationChain msgs = null;
			if (details != null)
				msgs = ((InternalEObject)details).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_OUTCOME_ISSUE__DETAILS, null, msgs);
			if (newDetails != null)
				msgs = ((InternalEObject)newDetails).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_OUTCOME_ISSUE__DETAILS, null, msgs);
			msgs = basicSetDetails(newDetails, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_OUTCOME_ISSUE__DETAILS, newDetails, newDetails));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getDiagnostics() {
		return diagnostics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiagnostics(fhiRCore.dataTypes.String newDiagnostics, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldDiagnostics = diagnostics;
		diagnostics = newDiagnostics;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_OUTCOME_ISSUE__DIAGNOSTICS, oldDiagnostics, newDiagnostics);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagnostics(fhiRCore.dataTypes.String newDiagnostics) {
		if (newDiagnostics != diagnostics) {
			NotificationChain msgs = null;
			if (diagnostics != null)
				msgs = ((InternalEObject)diagnostics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_OUTCOME_ISSUE__DIAGNOSTICS, null, msgs);
			if (newDiagnostics != null)
				msgs = ((InternalEObject)newDiagnostics).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.OPERATION_OUTCOME_ISSUE__DIAGNOSTICS, null, msgs);
			msgs = basicSetDiagnostics(newDiagnostics, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.OPERATION_OUTCOME_ISSUE__DIAGNOSTICS, newDiagnostics, newDiagnostics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<fhiRCore.dataTypes.String> getLocations() {
		if (locations == null) {
			locations = new EObjectContainmentEList<fhiRCore.dataTypes.String>(fhiRCore.dataTypes.String.class, this, ResourcesPackage.OPERATION_OUTCOME_ISSUE__LOCATION);
		}
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<fhiRCore.dataTypes.String> getExpressions() {
		if (expressions == null) {
			expressions = new EObjectContainmentEList<fhiRCore.dataTypes.String>(fhiRCore.dataTypes.String.class, this, ResourcesPackage.OPERATION_OUTCOME_ISSUE__EXPRESSION);
		}
		return expressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.OPERATION_OUTCOME_ISSUE__SEVERITY:
				return basicSetSeverity(null, msgs);
			case ResourcesPackage.OPERATION_OUTCOME_ISSUE__CODE:
				return basicSetCode(null, msgs);
			case ResourcesPackage.OPERATION_OUTCOME_ISSUE__DETAILS:
				return basicSetDetails(null, msgs);
			case ResourcesPackage.OPERATION_OUTCOME_ISSUE__DIAGNOSTICS:
				return basicSetDiagnostics(null, msgs);
			case ResourcesPackage.OPERATION_OUTCOME_ISSUE__LOCATION:
				return ((InternalEList<?>)getLocations()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.OPERATION_OUTCOME_ISSUE__EXPRESSION:
				return ((InternalEList<?>)getExpressions()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.OPERATION_OUTCOME_ISSUE__SEVERITY:
				return getSeverity();
			case ResourcesPackage.OPERATION_OUTCOME_ISSUE__CODE:
				return getCode();
			case ResourcesPackage.OPERATION_OUTCOME_ISSUE__DETAILS:
				return getDetails();
			case ResourcesPackage.OPERATION_OUTCOME_ISSUE__DIAGNOSTICS:
				return getDiagnostics();
			case ResourcesPackage.OPERATION_OUTCOME_ISSUE__LOCATION:
				return getLocations();
			case ResourcesPackage.OPERATION_OUTCOME_ISSUE__EXPRESSION:
				return getExpressions();
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
			case ResourcesPackage.OPERATION_OUTCOME_ISSUE__SEVERITY:
				setSeverity((Code)newValue);
				return;
			case ResourcesPackage.OPERATION_OUTCOME_ISSUE__CODE:
				setCode((Code)newValue);
				return;
			case ResourcesPackage.OPERATION_OUTCOME_ISSUE__DETAILS:
				setDetails((CodeableConcept)newValue);
				return;
			case ResourcesPackage.OPERATION_OUTCOME_ISSUE__DIAGNOSTICS:
				setDiagnostics((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.OPERATION_OUTCOME_ISSUE__LOCATION:
				getLocations().clear();
				getLocations().addAll((Collection<? extends fhiRCore.dataTypes.String>)newValue);
				return;
			case ResourcesPackage.OPERATION_OUTCOME_ISSUE__EXPRESSION:
				getExpressions().clear();
				getExpressions().addAll((Collection<? extends fhiRCore.dataTypes.String>)newValue);
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
			case ResourcesPackage.OPERATION_OUTCOME_ISSUE__SEVERITY:
				setSeverity((Code)null);
				return;
			case ResourcesPackage.OPERATION_OUTCOME_ISSUE__CODE:
				setCode((Code)null);
				return;
			case ResourcesPackage.OPERATION_OUTCOME_ISSUE__DETAILS:
				setDetails((CodeableConcept)null);
				return;
			case ResourcesPackage.OPERATION_OUTCOME_ISSUE__DIAGNOSTICS:
				setDiagnostics((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.OPERATION_OUTCOME_ISSUE__LOCATION:
				getLocations().clear();
				return;
			case ResourcesPackage.OPERATION_OUTCOME_ISSUE__EXPRESSION:
				getExpressions().clear();
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
			case ResourcesPackage.OPERATION_OUTCOME_ISSUE__SEVERITY:
				return severity != null;
			case ResourcesPackage.OPERATION_OUTCOME_ISSUE__CODE:
				return code != null;
			case ResourcesPackage.OPERATION_OUTCOME_ISSUE__DETAILS:
				return details != null;
			case ResourcesPackage.OPERATION_OUTCOME_ISSUE__DIAGNOSTICS:
				return diagnostics != null;
			case ResourcesPackage.OPERATION_OUTCOME_ISSUE__LOCATION:
				return locations != null && !locations.isEmpty();
			case ResourcesPackage.OPERATION_OUTCOME_ISSUE__EXPRESSION:
				return expressions != null && !expressions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OperationOutcomeIssueImpl
