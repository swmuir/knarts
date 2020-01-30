/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.CodeableConcept;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.Identifier;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.MedicinalProductAuthorizationProcedure;
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
 * An implementation of the model object '<em><b>Medicinal Product Authorization Procedure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.MedicinalProductAuthorizationProcedureImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicinalProductAuthorizationProcedureImpl#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicinalProductAuthorizationProcedureImpl#getDatex <em>Datex</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MedicinalProductAuthorizationProcedureImpl#getApplications <em>Application</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicinalProductAuthorizationProcedureImpl extends BackboneElementImpl implements MedicinalProductAuthorizationProcedure {
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
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected CodeableConcept type;

	/**
	 * The cached value of the '{@link #getDatex() <em>Datex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatex()
	 * @generated
	 * @ordered
	 */
	protected DataType datex;

	/**
	 * The cached value of the '{@link #getApplications() <em>Application</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplications()
	 * @generated
	 * @ordered
	 */
	protected EList<MedicinalProductAuthorizationProcedure> applications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicinalProductAuthorizationProcedureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getMedicinalProductAuthorizationProcedure();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__IDENTIFIER, oldIdentifier, newIdentifier);
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
				msgs = ((InternalEObject)identifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__IDENTIFIER, null, msgs);
			if (newIdentifier != null)
				msgs = ((InternalEObject)newIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__IDENTIFIER, null, msgs);
			msgs = basicSetIdentifier(newIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__IDENTIFIER, newIdentifier, newIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeableConcept getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(CodeableConcept newType, NotificationChain msgs) {
		CodeableConcept oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(CodeableConcept newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getDatex() {
		return datex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatex(DataType newDatex, NotificationChain msgs) {
		DataType oldDatex = datex;
		datex = newDatex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__DATEX, oldDatex, newDatex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatex(DataType newDatex) {
		if (newDatex != datex) {
			NotificationChain msgs = null;
			if (datex != null)
				msgs = ((InternalEObject)datex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__DATEX, null, msgs);
			if (newDatex != null)
				msgs = ((InternalEObject)newDatex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__DATEX, null, msgs);
			msgs = basicSetDatex(newDatex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__DATEX, newDatex, newDatex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MedicinalProductAuthorizationProcedure> getApplications() {
		if (applications == null) {
			applications = new EObjectContainmentEList<MedicinalProductAuthorizationProcedure>(MedicinalProductAuthorizationProcedure.class, this, ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__APPLICATION);
		}
		return applications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__DATEX:
				return basicSetDatex(null, msgs);
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__APPLICATION:
				return ((InternalEList<?>)getApplications()).basicRemove(otherEnd, msgs);
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
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__IDENTIFIER:
				return getIdentifier();
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__TYPE:
				return getType();
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__DATEX:
				return getDatex();
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__APPLICATION:
				return getApplications();
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
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__IDENTIFIER:
				setIdentifier((Identifier)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__TYPE:
				setType((CodeableConcept)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__DATEX:
				setDatex((DataType)newValue);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__APPLICATION:
				getApplications().clear();
				getApplications().addAll((Collection<? extends MedicinalProductAuthorizationProcedure>)newValue);
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
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__IDENTIFIER:
				setIdentifier((Identifier)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__TYPE:
				setType((CodeableConcept)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__DATEX:
				setDatex((DataType)null);
				return;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__APPLICATION:
				getApplications().clear();
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
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__IDENTIFIER:
				return identifier != null;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__TYPE:
				return type != null;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__DATEX:
				return datex != null;
			case ResourcesPackage.MEDICINAL_PRODUCT_AUTHORIZATION_PROCEDURE__APPLICATION:
				return applications != null && !applications.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MedicinalProductAuthorizationProcedureImpl
