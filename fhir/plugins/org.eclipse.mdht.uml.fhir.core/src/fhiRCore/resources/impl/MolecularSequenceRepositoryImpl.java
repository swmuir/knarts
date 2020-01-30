/**
 */
package fhiRCore.resources.impl;

import fhiRCore.dataTypes.Code;
import fhiRCore.dataTypes.Uri;

import fhiRCore.dataTypes.impl.BackboneElementImpl;

import fhiRCore.resources.MolecularSequenceRepository;
import fhiRCore.resources.ResourcesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Molecular Sequence Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.impl.MolecularSequenceRepositoryImpl#getType <em>Type</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MolecularSequenceRepositoryImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MolecularSequenceRepositoryImpl#getName <em>Name</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MolecularSequenceRepositoryImpl#getDatasetId <em>Dataset Id</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MolecularSequenceRepositoryImpl#getVariantsetId <em>Variantset Id</em>}</li>
 *   <li>{@link fhiRCore.resources.impl.MolecularSequenceRepositoryImpl#getReadsetId <em>Readset Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MolecularSequenceRepositoryImpl extends BackboneElementImpl implements MolecularSequenceRepository {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Code type;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected Uri url;

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
	 * The cached value of the '{@link #getDatasetId() <em>Dataset Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatasetId()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String datasetId;

	/**
	 * The cached value of the '{@link #getVariantsetId() <em>Variantset Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariantsetId()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String variantsetId;

	/**
	 * The cached value of the '{@link #getReadsetId() <em>Readset Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadsetId()
	 * @generated
	 * @ordered
	 */
	protected fhiRCore.dataTypes.String readsetId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MolecularSequenceRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcesPackage.eINSTANCE.getMolecularSequenceRepository();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Code newType, NotificationChain msgs) {
		Code oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_REPOSITORY__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Code newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_REPOSITORY__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_REPOSITORY__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_REPOSITORY__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uri getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUrl(Uri newUrl, NotificationChain msgs) {
		Uri oldUrl = url;
		url = newUrl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_REPOSITORY__URL, oldUrl, newUrl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(Uri newUrl) {
		if (newUrl != url) {
			NotificationChain msgs = null;
			if (url != null)
				msgs = ((InternalEObject)url).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_REPOSITORY__URL, null, msgs);
			if (newUrl != null)
				msgs = ((InternalEObject)newUrl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_REPOSITORY__URL, null, msgs);
			msgs = basicSetUrl(newUrl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_REPOSITORY__URL, newUrl, newUrl));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_REPOSITORY__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_REPOSITORY__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_REPOSITORY__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_REPOSITORY__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getDatasetId() {
		return datasetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatasetId(fhiRCore.dataTypes.String newDatasetId, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldDatasetId = datasetId;
		datasetId = newDatasetId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_REPOSITORY__DATASET_ID, oldDatasetId, newDatasetId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatasetId(fhiRCore.dataTypes.String newDatasetId) {
		if (newDatasetId != datasetId) {
			NotificationChain msgs = null;
			if (datasetId != null)
				msgs = ((InternalEObject)datasetId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_REPOSITORY__DATASET_ID, null, msgs);
			if (newDatasetId != null)
				msgs = ((InternalEObject)newDatasetId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_REPOSITORY__DATASET_ID, null, msgs);
			msgs = basicSetDatasetId(newDatasetId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_REPOSITORY__DATASET_ID, newDatasetId, newDatasetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getVariantsetId() {
		return variantsetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariantsetId(fhiRCore.dataTypes.String newVariantsetId, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldVariantsetId = variantsetId;
		variantsetId = newVariantsetId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_REPOSITORY__VARIANTSET_ID, oldVariantsetId, newVariantsetId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariantsetId(fhiRCore.dataTypes.String newVariantsetId) {
		if (newVariantsetId != variantsetId) {
			NotificationChain msgs = null;
			if (variantsetId != null)
				msgs = ((InternalEObject)variantsetId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_REPOSITORY__VARIANTSET_ID, null, msgs);
			if (newVariantsetId != null)
				msgs = ((InternalEObject)newVariantsetId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_REPOSITORY__VARIANTSET_ID, null, msgs);
			msgs = basicSetVariantsetId(newVariantsetId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_REPOSITORY__VARIANTSET_ID, newVariantsetId, newVariantsetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fhiRCore.dataTypes.String getReadsetId() {
		return readsetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReadsetId(fhiRCore.dataTypes.String newReadsetId, NotificationChain msgs) {
		fhiRCore.dataTypes.String oldReadsetId = readsetId;
		readsetId = newReadsetId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_REPOSITORY__READSET_ID, oldReadsetId, newReadsetId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadsetId(fhiRCore.dataTypes.String newReadsetId) {
		if (newReadsetId != readsetId) {
			NotificationChain msgs = null;
			if (readsetId != null)
				msgs = ((InternalEObject)readsetId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_REPOSITORY__READSET_ID, null, msgs);
			if (newReadsetId != null)
				msgs = ((InternalEObject)newReadsetId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResourcesPackage.MOLECULAR_SEQUENCE_REPOSITORY__READSET_ID, null, msgs);
			msgs = basicSetReadsetId(newReadsetId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResourcesPackage.MOLECULAR_SEQUENCE_REPOSITORY__READSET_ID, newReadsetId, newReadsetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResourcesPackage.MOLECULAR_SEQUENCE_REPOSITORY__TYPE:
				return basicSetType(null, msgs);
			case ResourcesPackage.MOLECULAR_SEQUENCE_REPOSITORY__URL:
				return basicSetUrl(null, msgs);
			case ResourcesPackage.MOLECULAR_SEQUENCE_REPOSITORY__NAME:
				return basicSetName(null, msgs);
			case ResourcesPackage.MOLECULAR_SEQUENCE_REPOSITORY__DATASET_ID:
				return basicSetDatasetId(null, msgs);
			case ResourcesPackage.MOLECULAR_SEQUENCE_REPOSITORY__VARIANTSET_ID:
				return basicSetVariantsetId(null, msgs);
			case ResourcesPackage.MOLECULAR_SEQUENCE_REPOSITORY__READSET_ID:
				return basicSetReadsetId(null, msgs);
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
			case ResourcesPackage.MOLECULAR_SEQUENCE_REPOSITORY__TYPE:
				return getType();
			case ResourcesPackage.MOLECULAR_SEQUENCE_REPOSITORY__URL:
				return getUrl();
			case ResourcesPackage.MOLECULAR_SEQUENCE_REPOSITORY__NAME:
				return getName();
			case ResourcesPackage.MOLECULAR_SEQUENCE_REPOSITORY__DATASET_ID:
				return getDatasetId();
			case ResourcesPackage.MOLECULAR_SEQUENCE_REPOSITORY__VARIANTSET_ID:
				return getVariantsetId();
			case ResourcesPackage.MOLECULAR_SEQUENCE_REPOSITORY__READSET_ID:
				return getReadsetId();
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
			case ResourcesPackage.MOLECULAR_SEQUENCE_REPOSITORY__TYPE:
				setType((Code)newValue);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_REPOSITORY__URL:
				setUrl((Uri)newValue);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_REPOSITORY__NAME:
				setName((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_REPOSITORY__DATASET_ID:
				setDatasetId((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_REPOSITORY__VARIANTSET_ID:
				setVariantsetId((fhiRCore.dataTypes.String)newValue);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_REPOSITORY__READSET_ID:
				setReadsetId((fhiRCore.dataTypes.String)newValue);
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
			case ResourcesPackage.MOLECULAR_SEQUENCE_REPOSITORY__TYPE:
				setType((Code)null);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_REPOSITORY__URL:
				setUrl((Uri)null);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_REPOSITORY__NAME:
				setName((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_REPOSITORY__DATASET_ID:
				setDatasetId((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_REPOSITORY__VARIANTSET_ID:
				setVariantsetId((fhiRCore.dataTypes.String)null);
				return;
			case ResourcesPackage.MOLECULAR_SEQUENCE_REPOSITORY__READSET_ID:
				setReadsetId((fhiRCore.dataTypes.String)null);
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
			case ResourcesPackage.MOLECULAR_SEQUENCE_REPOSITORY__TYPE:
				return type != null;
			case ResourcesPackage.MOLECULAR_SEQUENCE_REPOSITORY__URL:
				return url != null;
			case ResourcesPackage.MOLECULAR_SEQUENCE_REPOSITORY__NAME:
				return name != null;
			case ResourcesPackage.MOLECULAR_SEQUENCE_REPOSITORY__DATASET_ID:
				return datasetId != null;
			case ResourcesPackage.MOLECULAR_SEQUENCE_REPOSITORY__VARIANTSET_ID:
				return variantsetId != null;
			case ResourcesPackage.MOLECULAR_SEQUENCE_REPOSITORY__READSET_ID:
				return readsetId != null;
		}
		return super.eIsSet(featureID);
	}

} //MolecularSequenceRepositoryImpl
