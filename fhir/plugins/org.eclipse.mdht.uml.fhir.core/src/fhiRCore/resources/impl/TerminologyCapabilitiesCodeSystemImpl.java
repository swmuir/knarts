/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.CodeSystem;
import fhiRCore.resources.ResourcesPackage;
import fhiRCore.resources.TerminologyCapabilitiesCodeSystem;
import fhiRCore.resources.TerminologyCapabilitiesCodeSystemVersion;

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
 * An implementation of the model object '<em><b>Terminology Capabilities Code System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.TerminologyCapabilitiesCodeSystemImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TerminologyCapabilitiesCodeSystemImpl#getVersions <em>Version</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.TerminologyCapabilitiesCodeSystemImpl#getSubsumption <em>Subsumption</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TerminologyCapabilitiesCodeSystemImpl extends BackboneElementImpl implements TerminologyCapabilitiesCodeSystem {
	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected CodeSystem uri;

	/**
	 * The cached value of the '{@link #getVersions() <em>Version</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersions()
	 * @generated
	 * @ordered
	 */
	protected EList<TerminologyCapabilitiesCodeSystemVersion> versions;

	/**
	 * The cached value of the '{@link #getSubsumption() <em>Subsumption</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsumption()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.Boolean subsumption;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerminologyCapabilitiesCodeSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getTerminologyCapabilitiesCodeSystem();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSystem getUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUri(CodeSystem newUri, NotificationChain msgs) {
		CodeSystem oldUri = uri;
		uri = newUri;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__URI, oldUri, newUri);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUri(CodeSystem newUri) {
		if (newUri != uri) {
			NotificationChain msgs = null;
			if (uri != null)
				msgs = ((InternalEObject)uri).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__URI, null, msgs);
			if (newUri != null)
				msgs = ((InternalEObject)newUri).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__URI, null, msgs);
			msgs = basicSetUri(newUri, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__URI, newUri, newUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TerminologyCapabilitiesCodeSystemVersion> getVersions() {
		if (versions == null) {
			versions = new EObjectContainmentEList<TerminologyCapabilitiesCodeSystemVersion>(TerminologyCapabilitiesCodeSystemVersion.class, this, ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__VERSION);
		}
		return versions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.Boolean getSubsumption() {
		return subsumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubsumption(fhiRCore.dataTypes.Boolean newSubsumption, NotificationChain msgs) {
		fhiRCore.dataTypes.Boolean oldSubsumption = subsumption;
		subsumption = newSubsumption;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__SUBSUMPTION, oldSubsumption, newSubsumption);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubsumption(fhiRCore.dataTypes.Boolean newSubsumption) {
		if (newSubsumption != subsumption) {
			NotificationChain msgs = null;
			if (subsumption != null)
				msgs = ((InternalEObject)subsumption).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__SUBSUMPTION, null, msgs);
			if (newSubsumption != null)
				msgs = ((InternalEObject)newSubsumption).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__SUBSUMPTION, null, msgs);
			msgs = basicSetSubsumption(newSubsumption, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__SUBSUMPTION, newSubsumption, newSubsumption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__URI:
				return basicSetUri(null, msgs);
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__VERSION:
				return ((InternalEList<?>)getVersions()).basicRemove(otherEnd, msgs);
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__SUBSUMPTION:
				return basicSetSubsumption(null, msgs);
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
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__URI:
				return getUri();
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__VERSION:
				return getVersions();
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__SUBSUMPTION:
				return getSubsumption();
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
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__URI:
				setUri((CodeSystem)newValue);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__VERSION:
				getVersions().clear();
				getVersions().addAll((Collection<? extends TerminologyCapabilitiesCodeSystemVersion>)newValue);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__SUBSUMPTION:
				setSubsumption((fhiRCore.dataTypes.Boolean)newValue);
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
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__URI:
				setUri((CodeSystem)null);
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__VERSION:
				getVersions().clear();
				return;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__SUBSUMPTION:
				setSubsumption((fhiRCore.dataTypes.Boolean)null);
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
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__URI:
				return uri != null;
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__VERSION:
				return versions != null && !versions.isEmpty();
			case ResourcesPackage.TERMINOLOGY_CAPABILITIES_CODE_SYSTEM__SUBSUMPTION:
				return subsumption != null;
		}
		return super.eIsSet(featureID);
	}

} //TerminologyCapabilitiesCodeSystemImpl
