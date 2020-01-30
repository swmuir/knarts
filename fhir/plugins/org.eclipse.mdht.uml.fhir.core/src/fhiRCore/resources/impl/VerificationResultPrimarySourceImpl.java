/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Reference;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.ResourcesPackage;
import fhiRCore.resources.VerificationResultPrimarySource;

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
 * An implementation of the model object '<em><b>Verification Result Primary Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.VerificationResultPrimarySourceImpl#getWho <em>Who</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.VerificationResultPrimarySourceImpl#getTypes <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.VerificationResultPrimarySourceImpl#getCommunicationMethods <em>Communication Method</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.VerificationResultPrimarySourceImpl#getValidationStatus <em>Validation Status</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.VerificationResultPrimarySourceImpl#getValidationDate <em>Validation Date</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.VerificationResultPrimarySourceImpl#getCanPushUpdates <em>Can Push Updates</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.VerificationResultPrimarySourceImpl#getPushTypeAvailables <em>Push Type Available</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VerificationResultPrimarySourceImpl extends BackboneElementImpl implements VerificationResultPrimarySource {
	/**
	 * The cached value of the '{@link #getWho() <em>Who</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWho()
	 * @generated
	 * @ordered
	 */
	protected Reference who;

	/**
	 * The cached value of the '{@link #getTypes() <em>Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> types;

	/**
	 * The cached value of the '{@link #getCommunicationMethods() <em>Communication Method</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> communicationMethods;

	/**
	 * The cached value of the '{@link #getValidationStatus() <em>Validation Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidationStatus()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept validationStatus;

	/**
	 * The cached value of the '{@link #getValidationDate() <em>Validation Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidationDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime validationDate;

	/**
	 * The cached value of the '{@link #getCanPushUpdates() <em>Can Push Updates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanPushUpdates()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept canPushUpdates;

	/**
	 * The cached value of the '{@link #getPushTypeAvailables() <em>Push Type Available</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPushTypeAvailables()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeableConcept> pushTypeAvailables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerificationResultPrimarySourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getVerificationResultPrimarySource();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getWho() {
		return who;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWho(Reference newWho, NotificationChain msgs) {
		Reference oldWho = who;
		who = newWho;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__WHO, oldWho, newWho);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWho(Reference newWho) {
		if (newWho != who) {
			NotificationChain msgs = null;
			if (who != null)
				msgs = ((InternalEObject)who).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__WHO, null, msgs);
			if (newWho != null)
				msgs = ((InternalEObject)newWho).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__WHO, null, msgs);
			msgs = basicSetWho(newWho, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__WHO, newWho, newWho));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__TYPE);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getCommunicationMethods() {
		if (communicationMethods == null) {
			communicationMethods = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__COMMUNICATION_METHOD);
		}
		return communicationMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getValidationStatus() {
		return validationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidationStatus(CodeableConcept newValidationStatus, NotificationChain msgs) {
		CodeableConcept oldValidationStatus = validationStatus;
		validationStatus = newValidationStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__VALIDATION_STATUS, oldValidationStatus, newValidationStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidationStatus(CodeableConcept newValidationStatus) {
		if (newValidationStatus != validationStatus) {
			NotificationChain msgs = null;
			if (validationStatus != null)
				msgs = ((InternalEObject)validationStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__VALIDATION_STATUS, null, msgs);
			if (newValidationStatus != null)
				msgs = ((InternalEObject)newValidationStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__VALIDATION_STATUS, null, msgs);
			msgs = basicSetValidationStatus(newValidationStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__VALIDATION_STATUS, newValidationStatus, newValidationStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getValidationDate() {
		return validationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValidationDate(DateTime newValidationDate, NotificationChain msgs) {
		DateTime oldValidationDate = validationDate;
		validationDate = newValidationDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__VALIDATION_DATE, oldValidationDate, newValidationDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidationDate(DateTime newValidationDate) {
		if (newValidationDate != validationDate) {
			NotificationChain msgs = null;
			if (validationDate != null)
				msgs = ((InternalEObject)validationDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__VALIDATION_DATE, null, msgs);
			if (newValidationDate != null)
				msgs = ((InternalEObject)newValidationDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__VALIDATION_DATE, null, msgs);
			msgs = basicSetValidationDate(newValidationDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__VALIDATION_DATE, newValidationDate, newValidationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getCanPushUpdates() {
		return canPushUpdates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCanPushUpdates(CodeableConcept newCanPushUpdates, NotificationChain msgs) {
		CodeableConcept oldCanPushUpdates = canPushUpdates;
		canPushUpdates = newCanPushUpdates;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__CAN_PUSH_UPDATES, oldCanPushUpdates, newCanPushUpdates);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanPushUpdates(CodeableConcept newCanPushUpdates) {
		if (newCanPushUpdates != canPushUpdates) {
			NotificationChain msgs = null;
			if (canPushUpdates != null)
				msgs = ((InternalEObject)canPushUpdates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__CAN_PUSH_UPDATES, null, msgs);
			if (newCanPushUpdates != null)
				msgs = ((InternalEObject)newCanPushUpdates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__CAN_PUSH_UPDATES, null, msgs);
			msgs = basicSetCanPushUpdates(newCanPushUpdates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__CAN_PUSH_UPDATES, newCanPushUpdates, newCanPushUpdates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeableConcept> getPushTypeAvailables() {
		if (pushTypeAvailables == null) {
			pushTypeAvailables = new EObjectContainmentEList<CodeableConcept>(CodeableConcept.class, this, ResourcesPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__PUSH_TYPE_AVAILABLE);
		}
		return pushTypeAvailables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__WHO:
				return basicSetWho(null, msgs);
			case ResourcesPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__TYPE:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__COMMUNICATION_METHOD:
				return ((InternalEList<?>)getCommunicationMethods()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__VALIDATION_STATUS:
				return basicSetValidationStatus(null, msgs);
			case ResourcesPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__VALIDATION_DATE:
				return basicSetValidationDate(null, msgs);
			case ResourcesPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__CAN_PUSH_UPDATES:
				return basicSetCanPushUpdates(null, msgs);
			case ResourcesPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__PUSH_TYPE_AVAILABLE:
				return ((InternalEList<?>)getPushTypeAvailables()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__WHO:
				return getWho();
			case ResourcesPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__TYPE:
				return getTypes();
			case ResourcesPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__COMMUNICATION_METHOD:
				return getCommunicationMethods();
			case ResourcesPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__VALIDATION_STATUS:
				return getValidationStatus();
			case ResourcesPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__VALIDATION_DATE:
				return getValidationDate();
			case ResourcesPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__CAN_PUSH_UPDATES:
				return getCanPushUpdates();
			case ResourcesPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__PUSH_TYPE_AVAILABLE:
				return getPushTypeAvailables();
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
			case ResourcesPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__WHO:
				setWho((Reference)newValue);
				return;
			case ResourcesPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__TYPE:
				getTypes().clear();
				getTypes().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__COMMUNICATION_METHOD:
				getCommunicationMethods().clear();
				getCommunicationMethods().addAll((Collection<? extends CodeableConcept>)newValue);
				return;
			case ResourcesPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__VALIDATION_STATUS:
				setValidationStatus((CodeableConcept)newValue);
				return;
			case ResourcesPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__VALIDATION_DATE:
				setValidationDate((DateTime)newValue);
				return;
			case ResourcesPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__CAN_PUSH_UPDATES:
				setCanPushUpdates((CodeableConcept)newValue);
				return;
			case ResourcesPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__PUSH_TYPE_AVAILABLE:
				getPushTypeAvailables().clear();
				getPushTypeAvailables().addAll((Collection<? extends CodeableConcept>)newValue);
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
			case ResourcesPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__WHO:
				setWho((Reference)null);
				return;
			case ResourcesPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__TYPE:
				getTypes().clear();
				return;
			case ResourcesPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__COMMUNICATION_METHOD:
				getCommunicationMethods().clear();
				return;
			case ResourcesPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__VALIDATION_STATUS:
				setValidationStatus((CodeableConcept)null);
				return;
			case ResourcesPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__VALIDATION_DATE:
				setValidationDate((DateTime)null);
				return;
			case ResourcesPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__CAN_PUSH_UPDATES:
				setCanPushUpdates((CodeableConcept)null);
				return;
			case ResourcesPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__PUSH_TYPE_AVAILABLE:
				getPushTypeAvailables().clear();
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
			case ResourcesPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__WHO:
				return who != null;
			case ResourcesPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__TYPE:
				return types != null && !types.isEmpty();
			case ResourcesPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__COMMUNICATION_METHOD:
				return communicationMethods != null && !communicationMethods.isEmpty();
			case ResourcesPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__VALIDATION_STATUS:
				return validationStatus != null;
			case ResourcesPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__VALIDATION_DATE:
				return validationDate != null;
			case ResourcesPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__CAN_PUSH_UPDATES:
				return canPushUpdates != null;
			case ResourcesPackage.VERIFICATION_RESULT_PRIMARY_SOURCE__PUSH_TYPE_AVAILABLE:
				return pushTypeAvailables != null && !pushTypeAvailables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VerificationResultPrimarySourceImpl
