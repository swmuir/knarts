/**
 */
package fhiRCore.dataTypes.impl;

import fhiRCore.dataTypes.Coding;
import fhiRCore.dataTypes.DataTypesPackage;
import fhiRCore.dataTypes.Id;
import fhiRCore.dataTypes.Instant;
import fhiRCore.dataTypes.Meta;
import fhiRCore.dataTypes.Uri;

import fhiRCore.resources.StructureDefinition;

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
 * An implementation of the model object '<em><b>Meta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.dataTypes.impl.MetaImpl#getVersionId <em>Version Id</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.MetaImpl#getLastUpdated <em>Last Updated</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.MetaImpl#getSource <em>Source</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.MetaImpl#getProfiles <em>Profile</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.MetaImpl#getSecurities <em>Security</em>}</li>
 *   <li>{@link fhiRCore.dataTypes.impl.MetaImpl#getTags <em>Tag</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetaImpl extends DataTypeImpl implements Meta {
	/**
	 * The cached value of the '{@link #getVersionId() <em>Version Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionId()
	 * @generated
	 * @ordered
	 */
	protected Id versionId;

	/**
	 * The cached value of the '{@link #getLastUpdated() <em>Last Updated</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastUpdated()
	 * @generated
	 * @ordered
	 */
	protected Instant lastUpdated;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Uri source;

	/**
	 * The cached value of the '{@link #getProfiles() <em>Profile</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfiles()
	 * @generated
	 * @ordered
	 */
	protected EList<StructureDefinition> profiles;

	/**
	 * The cached value of the '{@link #getSecurities() <em>Security</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurities()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> securities;

	/**
	 * The cached value of the '{@link #getTags() <em>Tag</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<Coding> tags;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataTypesPackage.Literals.META;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Id getVersionId() {
		return versionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersionId(Id newVersionId, NotificationChain msgs) {
		Id oldVersionId = versionId;
		versionId = newVersionId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.META__VERSION_ID, oldVersionId, newVersionId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionId(Id newVersionId) {
		if (newVersionId != versionId) {
			NotificationChain msgs = null;
			if (versionId != null)
				msgs = ((InternalEObject)versionId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.META__VERSION_ID, null, msgs);
			if (newVersionId != null)
				msgs = ((InternalEObject)newVersionId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.META__VERSION_ID, null, msgs);
			msgs = basicSetVersionId(newVersionId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.META__VERSION_ID, newVersionId, newVersionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instant getLastUpdated() {
		return lastUpdated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLastUpdated(Instant newLastUpdated, NotificationChain msgs) {
		Instant oldLastUpdated = lastUpdated;
		lastUpdated = newLastUpdated;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.META__LAST_UPDATED, oldLastUpdated, newLastUpdated);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastUpdated(Instant newLastUpdated) {
		if (newLastUpdated != lastUpdated) {
			NotificationChain msgs = null;
			if (lastUpdated != null)
				msgs = ((InternalEObject)lastUpdated).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.META__LAST_UPDATED, null, msgs);
			if (newLastUpdated != null)
				msgs = ((InternalEObject)newLastUpdated).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.META__LAST_UPDATED, null, msgs);
			msgs = basicSetLastUpdated(newLastUpdated, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.META__LAST_UPDATED, newLastUpdated, newLastUpdated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Uri newSource, NotificationChain msgs) {
		Uri oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataTypesPackage.META__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Uri newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.META__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataTypesPackage.META__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataTypesPackage.META__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructureDefinition> getProfiles() {
		if (profiles == null) {
			profiles = new EObjectContainmentEList<StructureDefinition>(StructureDefinition.class, this, DataTypesPackage.META__PROFILE);
		}
		return profiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getSecurities() {
		if (securities == null) {
			securities = new EObjectContainmentEList<Coding>(Coding.class, this, DataTypesPackage.META__SECURITY);
		}
		return securities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coding> getTags() {
		if (tags == null) {
			tags = new EObjectContainmentEList<Coding>(Coding.class, this, DataTypesPackage.META__TAG);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataTypesPackage.META__VERSION_ID:
				return basicSetVersionId(null, msgs);
			case DataTypesPackage.META__LAST_UPDATED:
				return basicSetLastUpdated(null, msgs);
			case DataTypesPackage.META__SOURCE:
				return basicSetSource(null, msgs);
			case DataTypesPackage.META__PROFILE:
				return ((InternalEList<?>)getProfiles()).basicRemove(otherEnd, msgs);
			case DataTypesPackage.META__SECURITY:
				return ((InternalEList<?>)getSecurities()).basicRemove(otherEnd, msgs);
			case DataTypesPackage.META__TAG:
				return ((InternalEList<?>)getTags()).basicRemove(otherEnd, msgs);
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
			case DataTypesPackage.META__VERSION_ID:
				return getVersionId();
			case DataTypesPackage.META__LAST_UPDATED:
				return getLastUpdated();
			case DataTypesPackage.META__SOURCE:
				return getSource();
			case DataTypesPackage.META__PROFILE:
				return getProfiles();
			case DataTypesPackage.META__SECURITY:
				return getSecurities();
			case DataTypesPackage.META__TAG:
				return getTags();
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
			case DataTypesPackage.META__VERSION_ID:
				setVersionId((Id)newValue);
				return;
			case DataTypesPackage.META__LAST_UPDATED:
				setLastUpdated((Instant)newValue);
				return;
			case DataTypesPackage.META__SOURCE:
				setSource((Uri)newValue);
				return;
			case DataTypesPackage.META__PROFILE:
				getProfiles().clear();
				getProfiles().addAll((Collection<? extends StructureDefinition>)newValue);
				return;
			case DataTypesPackage.META__SECURITY:
				getSecurities().clear();
				getSecurities().addAll((Collection<? extends Coding>)newValue);
				return;
			case DataTypesPackage.META__TAG:
				getTags().clear();
				getTags().addAll((Collection<? extends Coding>)newValue);
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
			case DataTypesPackage.META__VERSION_ID:
				setVersionId((Id)null);
				return;
			case DataTypesPackage.META__LAST_UPDATED:
				setLastUpdated((Instant)null);
				return;
			case DataTypesPackage.META__SOURCE:
				setSource((Uri)null);
				return;
			case DataTypesPackage.META__PROFILE:
				getProfiles().clear();
				return;
			case DataTypesPackage.META__SECURITY:
				getSecurities().clear();
				return;
			case DataTypesPackage.META__TAG:
				getTags().clear();
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
			case DataTypesPackage.META__VERSION_ID:
				return versionId != null;
			case DataTypesPackage.META__LAST_UPDATED:
				return lastUpdated != null;
			case DataTypesPackage.META__SOURCE:
				return source != null;
			case DataTypesPackage.META__PROFILE:
				return profiles != null && !profiles.isEmpty();
			case DataTypesPackage.META__SECURITY:
				return securities != null && !securities.isEmpty();
			case DataTypesPackage.META__TAG:
				return tags != null && !tags.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MetaImpl
