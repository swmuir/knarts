/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Reference;

import fhiRCore.resources.EnrollmentRequest;
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
 * An implementation of the model object '<em><b>Enrollment Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.EnrollmentRequestImpl#getIdentifiers <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EnrollmentRequestImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EnrollmentRequestImpl#getCreated <em>Created</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EnrollmentRequestImpl#getInsurer <em>Insurer</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EnrollmentRequestImpl#getProvider <em>Provider</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EnrollmentRequestImpl#getCandidate <em>Candidate</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.EnrollmentRequestImpl#getCoverage <em>Coverage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnrollmentRequestImpl extends DomainResourceImpl implements EnrollmentRequest {
	/**
	 * The cached value of the '{@link #getIdentifiers() <em>Identifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> identifiers;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Code status;

	/**
	 * The cached value of the '{@link #getCreated() <em>Created</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreated()
	 * @generated
	 * @ordered
	 */
	protected DateTime created;

	/**
	 * The cached value of the '{@link #getInsurer() <em>Insurer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsurer()
	 * @generated
	 * @ordered
	 */
	protected Reference insurer;

	/**
	 * The cached value of the '{@link #getProvider() <em>Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvider()
	 * @generated
	 * @ordered
	 */
	protected Reference provider;

	/**
	 * The cached value of the '{@link #getCandidate() <em>Candidate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCandidate()
	 * @generated
	 * @ordered
	 */
	protected Reference candidate;

	/**
	 * The cached value of the '{@link #getCoverage() <em>Coverage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverage()
	 * @generated
	 * @ordered
	 */
	protected Reference coverage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnrollmentRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getEnrollmentRequest();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new EObjectContainmentEList<Identifier>(Identifier.class, this, ResourcesPackage.ENROLLMENT_REQUEST__IDENTIFIER);
		}
		return identifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(Code newStatus, NotificationChain msgs) {
		Code oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENROLLMENT_REQUEST__STATUS, oldStatus, newStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(Code newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ENROLLMENT_REQUEST__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ENROLLMENT_REQUEST__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENROLLMENT_REQUEST__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getCreated() {
		return created;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreated(DateTime newCreated, NotificationChain msgs) {
		DateTime oldCreated = created;
		created = newCreated;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENROLLMENT_REQUEST__CREATED, oldCreated, newCreated);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreated(DateTime newCreated) {
		if (newCreated != created) {
			NotificationChain msgs = null;
			if (created != null)
				msgs = ((InternalEObject)created).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ENROLLMENT_REQUEST__CREATED, null, msgs);
			if (newCreated != null)
				msgs = ((InternalEObject)newCreated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ENROLLMENT_REQUEST__CREATED, null, msgs);
			msgs = basicSetCreated(newCreated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENROLLMENT_REQUEST__CREATED, newCreated, newCreated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getInsurer() {
		return insurer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInsurer(Reference newInsurer, NotificationChain msgs) {
		Reference oldInsurer = insurer;
		insurer = newInsurer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENROLLMENT_REQUEST__INSURER, oldInsurer, newInsurer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsurer(Reference newInsurer) {
		if (newInsurer != insurer) {
			NotificationChain msgs = null;
			if (insurer != null)
				msgs = ((InternalEObject)insurer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ENROLLMENT_REQUEST__INSURER, null, msgs);
			if (newInsurer != null)
				msgs = ((InternalEObject)newInsurer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ENROLLMENT_REQUEST__INSURER, null, msgs);
			msgs = basicSetInsurer(newInsurer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENROLLMENT_REQUEST__INSURER, newInsurer, newInsurer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvider(Reference newProvider, NotificationChain msgs) {
		Reference oldProvider = provider;
		provider = newProvider;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENROLLMENT_REQUEST__PROVIDER, oldProvider, newProvider);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvider(Reference newProvider) {
		if (newProvider != provider) {
			NotificationChain msgs = null;
			if (provider != null)
				msgs = ((InternalEObject)provider).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ENROLLMENT_REQUEST__PROVIDER, null, msgs);
			if (newProvider != null)
				msgs = ((InternalEObject)newProvider).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ENROLLMENT_REQUEST__PROVIDER, null, msgs);
			msgs = basicSetProvider(newProvider, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENROLLMENT_REQUEST__PROVIDER, newProvider, newProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getCandidate() {
		return candidate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCandidate(Reference newCandidate, NotificationChain msgs) {
		Reference oldCandidate = candidate;
		candidate = newCandidate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENROLLMENT_REQUEST__CANDIDATE, oldCandidate, newCandidate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCandidate(Reference newCandidate) {
		if (newCandidate != candidate) {
			NotificationChain msgs = null;
			if (candidate != null)
				msgs = ((InternalEObject)candidate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ENROLLMENT_REQUEST__CANDIDATE, null, msgs);
			if (newCandidate != null)
				msgs = ((InternalEObject)newCandidate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ENROLLMENT_REQUEST__CANDIDATE, null, msgs);
			msgs = basicSetCandidate(newCandidate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENROLLMENT_REQUEST__CANDIDATE, newCandidate, newCandidate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getCoverage() {
		return coverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoverage(Reference newCoverage, NotificationChain msgs) {
		Reference oldCoverage = coverage;
		coverage = newCoverage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENROLLMENT_REQUEST__COVERAGE, oldCoverage, newCoverage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoverage(Reference newCoverage) {
		if (newCoverage != coverage) {
			NotificationChain msgs = null;
			if (coverage != null)
				msgs = ((InternalEObject)coverage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ENROLLMENT_REQUEST__COVERAGE, null, msgs);
			if (newCoverage != null)
				msgs = ((InternalEObject)newCoverage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.ENROLLMENT_REQUEST__COVERAGE, null, msgs);
			msgs = basicSetCoverage(newCoverage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.ENROLLMENT_REQUEST__COVERAGE, newCoverage, newCoverage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.ENROLLMENT_REQUEST__IDENTIFIER:
				return ((InternalEList<?>)getIdentifiers()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.ENROLLMENT_REQUEST__STATUS:
				return basicSetStatus(null, msgs);
			case ResourcesPackage.ENROLLMENT_REQUEST__CREATED:
				return basicSetCreated(null, msgs);
			case ResourcesPackage.ENROLLMENT_REQUEST__INSURER:
				return basicSetInsurer(null, msgs);
			case ResourcesPackage.ENROLLMENT_REQUEST__PROVIDER:
				return basicSetProvider(null, msgs);
			case ResourcesPackage.ENROLLMENT_REQUEST__CANDIDATE:
				return basicSetCandidate(null, msgs);
			case ResourcesPackage.ENROLLMENT_REQUEST__COVERAGE:
				return basicSetCoverage(null, msgs);
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
			case ResourcesPackage.ENROLLMENT_REQUEST__IDENTIFIER:
				return getIdentifiers();
			case ResourcesPackage.ENROLLMENT_REQUEST__STATUS:
				return getStatus();
			case ResourcesPackage.ENROLLMENT_REQUEST__CREATED:
				return getCreated();
			case ResourcesPackage.ENROLLMENT_REQUEST__INSURER:
				return getInsurer();
			case ResourcesPackage.ENROLLMENT_REQUEST__PROVIDER:
				return getProvider();
			case ResourcesPackage.ENROLLMENT_REQUEST__CANDIDATE:
				return getCandidate();
			case ResourcesPackage.ENROLLMENT_REQUEST__COVERAGE:
				return getCoverage();
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
			case ResourcesPackage.ENROLLMENT_REQUEST__IDENTIFIER:
				getIdentifiers().clear();
				getIdentifiers().addAll((Collection<? extends Identifier>)newValue);
				return;
			case ResourcesPackage.ENROLLMENT_REQUEST__STATUS:
				setStatus((Code)newValue);
				return;
			case ResourcesPackage.ENROLLMENT_REQUEST__CREATED:
				setCreated((DateTime)newValue);
				return;
			case ResourcesPackage.ENROLLMENT_REQUEST__INSURER:
				setInsurer((Reference)newValue);
				return;
			case ResourcesPackage.ENROLLMENT_REQUEST__PROVIDER:
				setProvider((Reference)newValue);
				return;
			case ResourcesPackage.ENROLLMENT_REQUEST__CANDIDATE:
				setCandidate((Reference)newValue);
				return;
			case ResourcesPackage.ENROLLMENT_REQUEST__COVERAGE:
				setCoverage((Reference)newValue);
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
			case ResourcesPackage.ENROLLMENT_REQUEST__IDENTIFIER:
				getIdentifiers().clear();
				return;
			case ResourcesPackage.ENROLLMENT_REQUEST__STATUS:
				setStatus((Code)null);
				return;
			case ResourcesPackage.ENROLLMENT_REQUEST__CREATED:
				setCreated((DateTime)null);
				return;
			case ResourcesPackage.ENROLLMENT_REQUEST__INSURER:
				setInsurer((Reference)null);
				return;
			case ResourcesPackage.ENROLLMENT_REQUEST__PROVIDER:
				setProvider((Reference)null);
				return;
			case ResourcesPackage.ENROLLMENT_REQUEST__CANDIDATE:
				setCandidate((Reference)null);
				return;
			case ResourcesPackage.ENROLLMENT_REQUEST__COVERAGE:
				setCoverage((Reference)null);
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
			case ResourcesPackage.ENROLLMENT_REQUEST__IDENTIFIER:
				return identifiers != null && !identifiers.isEmpty();
			case ResourcesPackage.ENROLLMENT_REQUEST__STATUS:
				return status != null;
			case ResourcesPackage.ENROLLMENT_REQUEST__CREATED:
				return created != null;
			case ResourcesPackage.ENROLLMENT_REQUEST__INSURER:
				return insurer != null;
			case ResourcesPackage.ENROLLMENT_REQUEST__PROVIDER:
				return provider != null;
			case ResourcesPackage.ENROLLMENT_REQUEST__CANDIDATE:
				return candidate != null;
			case ResourcesPackage.ENROLLMENT_REQUEST__COVERAGE:
				return coverage != null;
		}
		return super.eIsSet(featureID);
	}

} //EnrollmentRequestImpl
