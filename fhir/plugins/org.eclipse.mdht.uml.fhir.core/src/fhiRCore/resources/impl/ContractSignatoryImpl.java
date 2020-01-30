/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Coding;
import fhiRCore.dataTypes.Reference;
import fhiRCore.dataTypes.Signature;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.ContractSignatory;
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
 * An implementation of the model object '<em><b>Contract Signatory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.ContractSignatoryImpl#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ContractSignatoryImpl#getParty <em>Party</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.ContractSignatoryImpl#getSignatures <em>Signature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContractSignatoryImpl extends BackboneElementImpl implements ContractSignatory {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Coding type;

	/**
	 * The cached value of the '{@link #getParty() <em>Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParty()
	 * @generated
	 * @ordered
	 */
	protected Reference party;

	/**
	 * The cached value of the '{@link #getSignatures() <em>Signature</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Signature> signatures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContractSignatoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getContractSignatory();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coding getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Coding newType, NotificationChain msgs) {
		Coding oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_SIGNATORY__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Coding newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_SIGNATORY__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_SIGNATORY__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_SIGNATORY__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference getParty() {
		return party;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParty(Reference newParty, NotificationChain msgs) {
		Reference oldParty = party;
		party = newParty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_SIGNATORY__PARTY, oldParty, newParty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParty(Reference newParty) {
		if (newParty != party) {
			NotificationChain msgs = null;
			if (party != null)
				msgs = ((InternalEObject)party).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_SIGNATORY__PARTY, null, msgs);
			if (newParty != null)
				msgs = ((InternalEObject)newParty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CONTRACT_SIGNATORY__PARTY, null, msgs);
			msgs = basicSetParty(newParty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CONTRACT_SIGNATORY__PARTY, newParty, newParty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Signature> getSignatures() {
		if (signatures == null) {
			signatures = new EObjectContainmentEList<Signature>(Signature.class, this, ResourcesPackage.CONTRACT_SIGNATORY__SIGNATURE);
		}
		return signatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.CONTRACT_SIGNATORY__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.CONTRACT_SIGNATORY__PARTY:
				return basicSetParty(null, msgs);
			case ResourcesPackage.CONTRACT_SIGNATORY__SIGNATURE:
				return ((InternalEList<?>)getSignatures()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.CONTRACT_SIGNATORY__TYPE:
				return getType();
			case ResourcesPackage.CONTRACT_SIGNATORY__PARTY:
				return getParty();
			case ResourcesPackage.CONTRACT_SIGNATORY__SIGNATURE:
				return getSignatures();
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
			case ResourcesPackage.CONTRACT_SIGNATORY__TYPE:
				setType((Coding)newValue);
				return;
			case ResourcesPackage.CONTRACT_SIGNATORY__PARTY:
				setParty((Reference)newValue);
				return;
			case ResourcesPackage.CONTRACT_SIGNATORY__SIGNATURE:
				getSignatures().clear();
				getSignatures().addAll((Collection<? extends Signature>)newValue);
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
			case ResourcesPackage.CONTRACT_SIGNATORY__TYPE:
				setType((Coding)null);
				return;
			case ResourcesPackage.CONTRACT_SIGNATORY__PARTY:
				setParty((Reference)null);
				return;
			case ResourcesPackage.CONTRACT_SIGNATORY__SIGNATURE:
				getSignatures().clear();
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
			case ResourcesPackage.CONTRACT_SIGNATORY__TYPE:
				return type != null;
			case ResourcesPackage.CONTRACT_SIGNATORY__PARTY:
				return party != null;
			case ResourcesPackage.CONTRACT_SIGNATORY__SIGNATURE:
				return signatures != null && !signatures.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContractSignatoryImpl
