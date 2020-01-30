/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.PositiveInt;
import fhiRCore.dataTypes.Reference;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.ClaimInsurance;
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
 * An implementation of the model object '<em><b>Claim Insurance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.ClaimInsuranceImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ClaimInsuranceImpl#getFocal <em>Focal</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ClaimInsuranceImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ClaimInsuranceImpl#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ClaimInsuranceImpl#getBusinessArrangement <em>Business Arrangement</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ClaimInsuranceImpl#getPreAuthRefs <em>Pre Auth Ref</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ClaimInsuranceImpl#getClaimResponse <em>Claim Response</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClaimInsuranceImpl extends BackboneElementImpl implements ClaimInsurance {
	/**
	 * The cached value of the '{@link #getSequence() <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequence()
	 * @generated
	 * @ordered
	 */
	protected PositiveInt sequence;

	/**
	 * The cached value of the '{@link #getFocal() <em>Focal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFocal()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Boolean focal;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected Identifier identifier;

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
	 * The cached value of the '{@link #getBusinessArrangement() <em>Business Arrangement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessArrangement()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String businessArrangement;

	/**
	 * The cached value of the '{@link #getPreAuthRefs() <em>Pre Auth Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreAuthRefs()
	 * @generated
	 * @ordered
	 */
	protected EList<fhiRCore.dataTypes.String> preAuthRefs;

	/**
	 * The cached value of the '{@link #getClaimResponse() <em>Claim Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaimResponse()
	 * @generated
	 * @ordered
	 */
	protected Reference claimResponse;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimInsuranceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getClaimInsurance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositiveInt getSequence() {
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSequence(PositiveInt newSequence, NotificationChain msgs) {
		PositiveInt oldSequence = sequence;
		sequence = newSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_INSURANCE__SEQUENCE, oldSequence, newSequence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequence(PositiveInt newSequence) {
		if (newSequence != sequence) {
			NotificationChain msgs = null;
			if (sequence != null)
				msgs = ((InternalEObject)sequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_INSURANCE__SEQUENCE, null, msgs);
			if (newSequence != null)
				msgs = ((InternalEObject)newSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_INSURANCE__SEQUENCE, null, msgs);
			msgs = basicSetSequence(newSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_INSURANCE__SEQUENCE, newSequence, newSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Boolean getFocal() {
		return focal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFocal(fhiRCore.dataTypes.Boolean newFocal, NotificationChain msgs) {
		fhiRCore.dataTypes.Boolean oldFocal = focal;
		focal = newFocal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_INSURANCE__FOCAL, oldFocal, newFocal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFocal(fhiRCore.dataTypes.Boolean newFocal) {
		if (newFocal != focal) {
			NotificationChain msgs = null;
			if (focal != null)
				msgs = ((InternalEObject)focal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_INSURANCE__FOCAL, null, msgs);
			if (newFocal != null)
				msgs = ((InternalEObject)newFocal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_INSURANCE__FOCAL, null, msgs);
			msgs = basicSetFocal(newFocal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_INSURANCE__FOCAL, newFocal, newFocal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(Identifier newIdentifier, NotificationChain msgs) {
		Identifier oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_INSURANCE__IDENTIFIER, oldIdentifier, newIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(Identifier newIdentifier) {
		if (newIdentifier != identifier) {
			NotificationChain msgs = null;
			if (identifier != null)
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_INSURANCE__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_INSURANCE__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_INSURANCE__IDENTIFIER, newIdentifier, newIdentifier));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_INSURANCE__COVERAGE, oldCoverage, newCoverage);
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
				msgs = ((InternalEObject)coverage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_INSURANCE__COVERAGE, null, msgs);
			if (newCoverage != null)
				msgs = ((InternalEObject)newCoverage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_INSURANCE__COVERAGE, null, msgs);
			msgs = basicSetCoverage(newCoverage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_INSURANCE__COVERAGE, newCoverage, newCoverage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getBusinessArrangement() {
		return businessArrangement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBusinessArrangement(fhiRCore.dataTypes.String newBusinessArrangement, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldBusinessArrangement = businessArrangement;
		businessArrangement = newBusinessArrangement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_INSURANCE__BUSINESS_ARRANGEMENT, oldBusinessArrangement, newBusinessArrangement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusinessArrangement(fhiRCore.dataTypes.String newBusinessArrangement) {
		if (newBusinessArrangement != businessArrangement) {
			NotificationChain msgs = null;
			if (businessArrangement != null)
				msgs = ((InternalEObject)businessArrangement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_INSURANCE__BUSINESS_ARRANGEMENT, null, msgs);
			if (newBusinessArrangement != null)
				msgs = ((InternalEObject)newBusinessArrangement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_INSURANCE__BUSINESS_ARRANGEMENT, null, msgs);
			msgs = basicSetBusinessArrangement(newBusinessArrangement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_INSURANCE__BUSINESS_ARRANGEMENT, newBusinessArrangement, newBusinessArrangement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<fhiRCore.dataTypes.String> getPreAuthRefs() {
		if (preAuthRefs == null) {
			preAuthRefs = new EObjectContainmentEList<fhiRCore.dataTypes.String>(fhiRCore.dataTypes.String.class, this, ResourcesPackage.CLAIM_INSURANCE__PRE_AUTH_REF);
		}
		return preAuthRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getClaimResponse() {
		return claimResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClaimResponse(Reference newClaimResponse, NotificationChain msgs) {
		Reference oldClaimResponse = claimResponse;
		claimResponse = newClaimResponse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_INSURANCE__CLAIM_RESPONSE, oldClaimResponse, newClaimResponse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClaimResponse(Reference newClaimResponse) {
		if (newClaimResponse != claimResponse) {
			NotificationChain msgs = null;
			if (claimResponse != null)
				msgs = ((InternalEObject)claimResponse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_INSURANCE__CLAIM_RESPONSE, null, msgs);
			if (newClaimResponse != null)
				msgs = ((InternalEObject)newClaimResponse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CLAIM_INSURANCE__CLAIM_RESPONSE, null, msgs);
			msgs = basicSetClaimResponse(newClaimResponse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CLAIM_INSURANCE__CLAIM_RESPONSE, newClaimResponse, newClaimResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.CLAIM_INSURANCE__SEQUENCE:
				return basicSetSequence(null, msgs);
			case ResourcesPackage.CLAIM_INSURANCE__FOCAL:
				return basicSetFocal(null, msgs);
			case ResourcesPackage.CLAIM_INSURANCE__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case ResourcesPackage.CLAIM_INSURANCE__COVERAGE:
				return basicSetCoverage(null, msgs);
			case ResourcesPackage.CLAIM_INSURANCE__BUSINESS_ARRANGEMENT:
				return basicSetBusinessArrangement(null, msgs);
			case ResourcesPackage.CLAIM_INSURANCE__PRE_AUTH_REF:
				return ((InternalEList<?>)getPreAuthRefs()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.CLAIM_INSURANCE__CLAIM_RESPONSE:
				return basicSetClaimResponse(null, msgs);
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
			case ResourcesPackage.CLAIM_INSURANCE__SEQUENCE:
				return getSequence();
			case ResourcesPackage.CLAIM_INSURANCE__FOCAL:
				return getFocal();
			case ResourcesPackage.CLAIM_INSURANCE__IDENTIFIER:
				return getIdentifier();
			case ResourcesPackage.CLAIM_INSURANCE__COVERAGE:
				return getCoverage();
			case ResourcesPackage.CLAIM_INSURANCE__BUSINESS_ARRANGEMENT:
				return getBusinessArrangement();
			case ResourcesPackage.CLAIM_INSURANCE__PRE_AUTH_REF:
				return getPreAuthRefs();
			case ResourcesPackage.CLAIM_INSURANCE__CLAIM_RESPONSE:
				return getClaimResponse();
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
			case ResourcesPackage.CLAIM_INSURANCE__SEQUENCE:
				setSequence((PositiveInt)newValue);
				return;
			case ResourcesPackage.CLAIM_INSURANCE__FOCAL:
				setFocal((fhiRCore.dataTypes.Boolean)newValue);
				return;
			case ResourcesPackage.CLAIM_INSURANCE__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case ResourcesPackage.CLAIM_INSURANCE__COVERAGE:
				setCoverage((Reference)newValue);
				return;
			case ResourcesPackage.CLAIM_INSURANCE__BUSINESS_ARRANGEMENT:
				setBusinessArrangement((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.CLAIM_INSURANCE__PRE_AUTH_REF:
				getPreAuthRefs().clear();
				getPreAuthRefs().addAll((Collection<? extends fhiRCore.dataTypes.String>)newValue);
				return;
			case ResourcesPackage.CLAIM_INSURANCE__CLAIM_RESPONSE:
				setClaimResponse((Reference)newValue);
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
			case ResourcesPackage.CLAIM_INSURANCE__SEQUENCE:
				setSequence((PositiveInt)null);
				return;
			case ResourcesPackage.CLAIM_INSURANCE__FOCAL:
				setFocal((fhiRCore.dataTypes.Boolean)null);
				return;
			case ResourcesPackage.CLAIM_INSURANCE__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case ResourcesPackage.CLAIM_INSURANCE__COVERAGE:
				setCoverage((Reference)null);
				return;
			case ResourcesPackage.CLAIM_INSURANCE__BUSINESS_ARRANGEMENT:
				setBusinessArrangement((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.CLAIM_INSURANCE__PRE_AUTH_REF:
				getPreAuthRefs().clear();
				return;
			case ResourcesPackage.CLAIM_INSURANCE__CLAIM_RESPONSE:
				setClaimResponse((Reference)null);
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
			case ResourcesPackage.CLAIM_INSURANCE__SEQUENCE:
				return sequence != null;
			case ResourcesPackage.CLAIM_INSURANCE__FOCAL:
				return focal != null;
			case ResourcesPackage.CLAIM_INSURANCE__IDENTIFIER:
				return identifier != null;
			case ResourcesPackage.CLAIM_INSURANCE__COVERAGE:
				return coverage != null;
			case ResourcesPackage.CLAIM_INSURANCE__BUSINESS_ARRANGEMENT:
				return businessArrangement != null;
			case ResourcesPackage.CLAIM_INSURANCE__PRE_AUTH_REF:
				return preAuthRefs != null && !preAuthRefs.isEmpty();
			case ResourcesPackage.CLAIM_INSURANCE__CLAIM_RESPONSE:
				return claimResponse != null;
		}
		return super.eIsSet(featureID);
	}

} //ClaimInsuranceImpl
