/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.DateTime;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.CapabilityStatementSoftware;
import fhiRCore.resources.ResourcesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability Statement Software</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.CapabilityStatementSoftwareImpl#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CapabilityStatementSoftwareImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.CapabilityStatementSoftwareImpl#getReleaseDate <em>Release Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityStatementSoftwareImpl extends BackboneElementImpl implements CapabilityStatementSoftware {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String name;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String version;

	/**
	 * The cached value of the '{@link #getReleaseDate() <em>Release Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseDate()
	 * @generated
	 * @ordered
	 */
	protected DateTime releaseDate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityStatementSoftwareImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getCapabilityStatementSoftware();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(fhiRCore.dataTypes.String newName, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_SOFTWARE__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(fhiRCore.dataTypes.String newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT_SOFTWARE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT_SOFTWARE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_SOFTWARE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersion(fhiRCore.dataTypes.String newVersion, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_SOFTWARE__VERSION, oldVersion, newVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(fhiRCore.dataTypes.String newVersion) {
		if (newVersion != version) {
			NotificationChain msgs = null;
			if (version != null)
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT_SOFTWARE__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT_SOFTWARE__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_SOFTWARE__VERSION, newVersion, newVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTime getReleaseDate() {
		return releaseDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReleaseDate(DateTime newReleaseDate, NotificationChain msgs) {
		DateTime oldReleaseDate = releaseDate;
		releaseDate = newReleaseDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_SOFTWARE__RELEASE_DATE, oldReleaseDate, newReleaseDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReleaseDate(DateTime newReleaseDate) {
		if (newReleaseDate != releaseDate) {
			NotificationChain msgs = null;
			if (releaseDate != null)
				msgs = ((InternalEObject)releaseDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT_SOFTWARE__RELEASE_DATE, null, msgs);
			if (newReleaseDate != null)
				msgs = ((InternalEObject)newReleaseDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.CAPABILITY_STATEMENT_SOFTWARE__RELEASE_DATE, null, msgs);
			msgs = basicSetReleaseDate(newReleaseDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.CAPABILITY_STATEMENT_SOFTWARE__RELEASE_DATE, newReleaseDate, newReleaseDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.CAPABILITY_STATEMENT_SOFTWARE__NAME:
				return basicSetName(null, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT_SOFTWARE__VERSION:
				return basicSetVersion(null, msgs);
			case ResourcesPackage.CAPABILITY_STATEMENT_SOFTWARE__RELEASE_DATE:
				return basicSetReleaseDate(null, msgs);
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
			case ResourcesPackage.CAPABILITY_STATEMENT_SOFTWARE__NAME:
				return getName();
			case ResourcesPackage.CAPABILITY_STATEMENT_SOFTWARE__VERSION:
				return getVersion();
			case ResourcesPackage.CAPABILITY_STATEMENT_SOFTWARE__RELEASE_DATE:
				return getReleaseDate();
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
			case ResourcesPackage.CAPABILITY_STATEMENT_SOFTWARE__NAME:
				setName((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_SOFTWARE__VERSION:
				setVersion((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_SOFTWARE__RELEASE_DATE:
				setReleaseDate((DateTime)newValue);
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
			case ResourcesPackage.CAPABILITY_STATEMENT_SOFTWARE__NAME:
				setName((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_SOFTWARE__VERSION:
				setVersion((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.CAPABILITY_STATEMENT_SOFTWARE__RELEASE_DATE:
				setReleaseDate((DateTime)null);
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
			case ResourcesPackage.CAPABILITY_STATEMENT_SOFTWARE__NAME:
				return name != null;
			case ResourcesPackage.CAPABILITY_STATEMENT_SOFTWARE__VERSION:
				return version != null;
			case ResourcesPackage.CAPABILITY_STATEMENT_SOFTWARE__RELEASE_DATE:
				return releaseDate != null;
		}
		return super.eIsSet(featureID);
	}

} //CapabilityStatementSoftwareImpl
